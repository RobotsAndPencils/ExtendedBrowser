package com.robotsandpencils.extendedbrowsersample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.robotsandpencils.extendedbrowsersample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.toggleAddressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.webViewBrowser.showAddressBar(!mBinding.webViewBrowser.isAddressBarShowing());
            }
        });

        mBinding.toggleNavigationBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.webViewBrowser.showNavigationBar(!mBinding.webViewBrowser.isNavigationBarShowing());
            }
        });
    }
}
