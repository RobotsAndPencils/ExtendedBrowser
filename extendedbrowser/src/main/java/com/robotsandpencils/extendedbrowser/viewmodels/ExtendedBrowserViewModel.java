/*
 * Copyright (C) 2016 Robots and Pencils, Inc
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE.txt file for details.
 */

package com.robotsandpencils.extendedbrowser.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.robotsandpencils.extendedbrowser.BR;

/**
 * ViewModel class for handling two-way data binding
 *
 * Created by farhankhan on 2016-07-13.
 */
public class ExtendedBrowserViewModel extends BaseObservable {
    private boolean showNavigationBar;
    private String addressBarUrl;
    private boolean showAddressBar;
    private String backButtonDescription;
    private String forwardButtonDescription;
    private String refreshButtonDescription;

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

    @Bindable
    public String getAddressBarUrl() {
        return addressBarUrl;
    }

    @SuppressWarnings("UnusedReturnValue")
    public ExtendedBrowserViewModel setAddressBarUrl(String addressBarUrl) {
        this.addressBarUrl = addressBarUrl;
        notifyPropertyChanged(BR.addressBarUrl);
        return this;
    }

    @Bindable
    public String getBackButtonDescription() {
        return backButtonDescription;
    }

    @SuppressWarnings("UnusedReturnValue")
    public ExtendedBrowserViewModel setBackButtonDescription(String backButtonDescription) {
        this.backButtonDescription = backButtonDescription;
        return this;
    }

    @Bindable
    public String getForwardButtonDescription() {
        return forwardButtonDescription;
    }

    @SuppressWarnings("UnusedReturnValue")
    public ExtendedBrowserViewModel setForwardButtonDescription(String forwardButtonDescription) {
        this.forwardButtonDescription = forwardButtonDescription;
        return this;
    }

    @Bindable
    public String getRefreshButtonDescription() {
        return refreshButtonDescription;
    }

    @SuppressWarnings("UnusedReturnValue")
    public ExtendedBrowserViewModel setRefreshButtonDescription(String refreshButtonDescription) {
        this.refreshButtonDescription = refreshButtonDescription;
        return this;
    }
}
