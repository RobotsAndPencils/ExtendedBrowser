package com.robotsandpencils.extendedbrowser.views;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotsandpencils.extendedbrowser.R;
import com.robotsandpencils.extendedbrowser.databinding.ExtendedBrowserBinding;
import com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel;

/**
 * Created by: farhankhan
 * Created on: 2016-07-04.
 */
public class ExtendedBrowser extends RelativeLayout {

    public interface OnBackNotAvailableListener {
        void onBackNotAvailable();
    }

    private ExtendedBrowserBinding mBinding;
    private ExtendedBrowserViewModel mViewModel;

    private OnBackNotAvailableListener mOnBackNotAvailableListener;

    @Nullable
    private ProgressBar mProgressBar;

    public ExtendedBrowser(Context context) {
        super(context);
    }

    public ExtendedBrowser(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ExtendedBrowser(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @SuppressWarnings("unused")
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ExtendedBrowser(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void init(Context context, AttributeSet attrs) {
        int id = 0;
        boolean showNavigationBar = false;
        boolean showAddressBar = false;

        mBinding = ExtendedBrowserBinding.inflate((LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE),
                this, true);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ExtendedBrowser, 0, 0);
        try {
            showNavigationBar = ta.getBoolean(R.styleable.ExtendedBrowser_showNavigationBar, false);
            showAddressBar = ta.getBoolean(R.styleable.ExtendedBrowser_showAddressBar, false);
            id = ta.getResourceId(R.styleable.ExtendedBrowser_progressBar, 0);
        } finally {
            ta.recycle();
        }

        if (isInEditMode()) {
            return;
        }

        mViewModel = new ExtendedBrowserViewModel().showNavigationBar(showNavigationBar).showAddressBar(showAddressBar);

        mProgressBar = (ProgressBar) findViewById(id);
        mBinding.navigationReload.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mProgressBar != null) {
                    mProgressBar.setVisibility(VISIBLE);
                }
                mBinding.nativeWebView.reload();
            }
        });
        mBinding.navigationRight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBinding.nativeWebView.canGoForward()) {
                    if (mProgressBar != null) {
                        mProgressBar.setVisibility(View.VISIBLE);
                    }
                    mBinding.nativeWebView.goForward();
                }
            }
        });
        mBinding.navigationLeft.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBinding.nativeWebView.canGoBack()) {
                    if (mProgressBar != null) {
                        mProgressBar.setVisibility(View.VISIBLE);
                    }
                    mBinding.nativeWebView.goBack();
                    return;
                }
                if (mOnBackNotAvailableListener != null) {
                    mOnBackNotAvailableListener.onBackNotAvailable();
                }
            }
        });

        mBinding.addressBarView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    getWebView().loadUrl(mBinding.addressBarView.getText().toString());
                    return true;
                }
                return false;
            }
        });


        @SuppressWarnings("ConstantConditions") WebView webView = mBinding.nativeWebView;
        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setLoadWithOverviewMode(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE);
        }

        // enable pinch zoom
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setDisplayZoomControls(false);
        }

        // enable javascript
        webView.getSettings().setJavaScriptEnabled(true);
        //_webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        // enable html5 local storage
        webView.getSettings().setDomStorageEnabled(true);

        // enable flash content display
        //noinspection deprecation
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mBinding.setViewModel(mViewModel);
    }

    public void setOnBackNotAvailableListener(OnBackNotAvailableListener listener) {
        mOnBackNotAvailableListener = listener;
    }

    public WebView getWebView() {
        return mBinding.nativeWebView;
    }

    public void showAddressBar(boolean showAddressBar) {
        mViewModel.showAddressBar(showAddressBar);
    }

    public void showNavigationBar(boolean showAddressBar) {
        mViewModel.showNavigationBar(showAddressBar);
    }

    public boolean isAddressBarShowing() {
        return mViewModel.isAddressBarShowing();
    }

    public boolean isNavigationBarShowing() {
        return mViewModel.isNavigationBarShowing();
    }

    public void setAddressBarUrl(String url) {
        mViewModel.setAddressBarUrl(url);
    }
}
