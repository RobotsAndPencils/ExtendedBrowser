/*
 * Copyright (C) 2016 Robots & Pencils, Inc
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE.txt file for details.
 */

package com.robotsandpencils.extendedbrowser.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.robotsandpencils.extendedbrowser.BR;

/**
 * Created by: farhankhan
 * Created on: 2016-07-13.
 */
public class ExtendedBrowserViewModel extends BaseObservable {
    private boolean showNavigationBar;
    private String addressBarUrl;
    private boolean showAddressBar;

    @Bindable
    public boolean isNavigationBarShowing() {
        return showNavigationBar;
    }

    public ExtendedBrowserViewModel showNavigationBar(boolean showNavigationBar) {
        this.showNavigationBar = showNavigationBar;
        notifyPropertyChanged(BR.navigationBarShowing);
        return this;
    }

    @Bindable
    public boolean isAddressBarShowing() {
        return showAddressBar;
    }

    public ExtendedBrowserViewModel showAddressBar(boolean showAddressBar) {
        this.showAddressBar = showAddressBar;
        notifyPropertyChanged(BR.addressBarShowing);
        return this;
    }

    public void setAddressBarUrl(String addressBarUrl) {
        this.addressBarUrl = addressBarUrl;
        notifyPropertyChanged(BR.addressBarUrl);
    }

    @Bindable
    public String getAddressBarUrl() {
        return addressBarUrl;
    }
}
