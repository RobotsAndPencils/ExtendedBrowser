ExtendedBrowser
===============

A simple web browser component with address and navigation bars based on WebView.

Sometimes your application needs a bit more than a simple WebView to display a web page. 
ExtendedBrowser provides functionality to use Back/Forward navigation as well as address bar to load a URL of choice. 

<img src="https://www.dropbox.com/s/es7q2z3qqty473p/ExtendedBrowser-screenshot.jpg?dl=1" width="300px" style="width: 300px;"/>


Download
--------

Add application gradle dependency:

```groovy
  compile 'com.robotsandpencils.extendedbrowser:extendedbrowser:0.0.3'
```

Also add the following to project's gradle file:

```groovy
allprojects {
    repositories {
        maven { url 'https://dl.bintray.com/androidrnp/maven/' }
    }
}
```


Usage
-----

This repository contains a sample application with usage examples.

Basically all you have to do is adding the following code to your layout file:

``` xml
<com.robotsandpencils.extendedbrowser.views.ExtendedBrowser
    android:id="@+id/web_view_browser"
    android:layout_width="match_parent"
    adroid:layout_height="match_parent"
    app:showAddressBar="true"
    app:showNavigationBar="true"/>
```


Coming soon
-----------

Custom view support for navigation and address bars.
Loading progress indicator.


License
-------

Copyright (C) 2016 Robots & Pencils, Inc
    
This software may be modified and distributed under the terms
of the [MIT license][1].


[1]: https://opensource.org/licenses/MIT
