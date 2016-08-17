/*
 * Copyright (C) 2016 Robots & Pencils, Inc
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE.txt file for details.
 */

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

        mBinding.webViewBrowser.attachDefaultWebViewClient();

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

        mBinding.load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.webViewBrowser.setAddressBarUrl("http://dev.android.com", true);
            }
        });

        mBinding.webViewBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBinding.bottomBar.getVisibility() == View.VISIBLE) {
                    mBinding.bottomBar.setVisibility(View.GONE);
                } else {
                    mBinding.bottomBar.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
