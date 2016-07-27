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

    public void showAddressBar(boolean showAddressBar) {
        this.showAddressBar = showAddressBar;
        notifyPropertyChanged(BR.addressBarShowing);
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
