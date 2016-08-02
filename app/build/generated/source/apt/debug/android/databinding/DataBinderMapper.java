
package android.databinding;
import com.robotsandpencils.extendedbrowsersample.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 16;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.robotsandpencils.extendedbrowser.R.layout.extended_browser:
                    return com.robotsandpencils.extendedbrowser.databinding.ExtendedBrowserBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -20233128: {
                if(tag.equals("layout/extended_browser_0")) {
                    return com.robotsandpencils.extendedbrowser.R.layout.extended_browser;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"addressBarShowing"
            ,"addressBarUrl"
            ,"navigationBarShowing"
            ,"viewModel"};
    }
}