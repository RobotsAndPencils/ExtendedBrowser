package com.robotsandpencils.extendedbrowser.databinding;
import com.robotsandpencils.extendedbrowser.R;
import com.robotsandpencils.extendedbrowser.BR;
import android.view.View;
public class ExtendedBrowserBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.navigation_left, 3);
        sViewsWithIds.put(R.id.navigation_right, 4);
        sViewsWithIds.put(R.id.navigation_reload, 5);
        sViewsWithIds.put(R.id.native_web_view, 6);
    }
    // views
    public final android.widget.EditText addressBarView;
    public final android.widget.RelativeLayout container;
    public final android.webkit.WebView nativeWebView;
    public final android.widget.LinearLayout navbar;
    public final android.widget.ImageButton navigationLeft;
    public final android.widget.ImageButton navigationReload;
    public final android.widget.ImageButton navigationRight;
    // variables
    private com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener addressBarViewandroi = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addressBarUrl
            //         is viewModel.setAddressBarUrl((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(addressBarView);
            // localize variables for thread safety
            // viewModel != null
            boolean viewModelObjectnull = false;
            // viewModel
            com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel viewModel = mViewModel;
            // viewModel.addressBarUrl
            java.lang.String addressBarUrlViewMod = null;



            viewModelObjectnull = (viewModel) != (null);
            if (viewModelObjectnull) {




                viewModel.setAddressBarUrl((java.lang.String) (callbackArg_0));
            }
        }
    };

    public ExtendedBrowserBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.addressBarView = (android.widget.EditText) bindings[1];
        this.addressBarView.setTag(null);
        this.container = (android.widget.RelativeLayout) bindings[0];
        this.container.setTag(null);
        this.nativeWebView = (android.webkit.WebView) bindings[6];
        this.navbar = (android.widget.LinearLayout) bindings[2];
        this.navbar.setTag(null);
        this.navigationLeft = (android.widget.ImageButton) bindings[3];
        this.navigationReload = (android.widget.ImageButton) bindings[5];
        this.navigationRight = (android.widget.ImageButton) bindings[4];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.viewModel :
                setViewModel((com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel viewModel) {
        updateRegistration(0, viewModel);
        this.mViewModel = viewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel viewModel, int fieldId) {
        switch (fieldId) {
            case BR.addressBarUrl: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.addressBarShowing: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.navigationBarShowing: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.robotsandpencils.extendedbrowser.viewmodels.ExtendedBrowserViewModel viewModel = mViewModel;
        int addressBarShowingVie = 0;
        boolean addressBarShowingVie1 = false;
        boolean navigationBarShowing = false;
        java.lang.String addressBarUrlViewMod = null;
        int NavigationBarShowing1 = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addressBarShowing
                        addressBarShowingVie1 = viewModel.isAddressBarShowing();
                    }
                    if((dirtyFlags & 0x15L) != 0) {
                        if (addressBarShowingVie1) {
                            dirtyFlags |= 0x40L;
                        } else {
                            dirtyFlags |= 0x20L;
                        }}


                    // read viewModel.addressBarShowing ? View.VISIBLE : View.GONE
                    addressBarShowingVie = (addressBarShowingVie1) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.navigationBarShowing
                        navigationBarShowing = viewModel.isNavigationBarShowing();
                    }
                    if((dirtyFlags & 0x19L) != 0) {
                        if (navigationBarShowing) {
                            dirtyFlags |= 0x100L;
                        } else {
                            dirtyFlags |= 0x80L;
                        }}


                    // read viewModel.navigationBarShowing ? View.VISIBLE : View.GONE
                    NavigationBarShowing1 = (navigationBarShowing) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addressBarUrl
                        addressBarUrlViewMod = viewModel.getAddressBarUrl();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.addressBarView, addressBarUrlViewMod);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.addressBarView.setVisibility(addressBarShowingVie);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressBarView, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressBarViewandroi);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.navbar.setVisibility(NavigationBarShowing1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ExtendedBrowserBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtendedBrowserBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ExtendedBrowserBinding>inflate(inflater, com.robotsandpencils.extendedbrowser.R.layout.extended_browser, root, attachToRoot, bindingComponent);
    }
    public static ExtendedBrowserBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtendedBrowserBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.robotsandpencils.extendedbrowser.R.layout.extended_browser, null, false), bindingComponent);
    }
    public static ExtendedBrowserBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtendedBrowserBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/extended_browser_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ExtendedBrowserBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.addressBarUrl
        flag 2 (0x3L): viewModel.addressBarShowing
        flag 3 (0x4L): viewModel.navigationBarShowing
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.addressBarShowing ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.addressBarShowing ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.navigationBarShowing ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.navigationBarShowing ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}