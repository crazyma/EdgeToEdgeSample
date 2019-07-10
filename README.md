# EdgeToEdgeSample
Test Edge to Edge, the new feature of Android Q

## How to Achieve Edge to Edge / Fullscreen content

- setup style
> styles.xml
``` xml

    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">

        ...
        
        <!--  remove actionbar -->
        <item name="windowNoTitle">true</item>
        <item name="windowActionBar">false</item>
        <item name="windowActionModeOverlay">true</item>
        
        <!--  change status bar color -->
        <item name="android:windowDrawsSystemBarBackgrounds">true</item>
        <item name="android:statusBarColor">@android:color/transparent</item>
        
        <!--  change color of navigation bar  -->
        <item name="android:navigationBarColor">@android:color/transparent</item>
    </style>
```
- use `CoordinatorLayout` and set `fitsSystemWindows`

> layout.xml
``` xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@android:color/holo_red_light"
        android:fitsSystemWindows="true"
        android:onClick="buttonClicked"
        android:text="Hello World!" />

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

- setup `System UI Flag`
> Activity
``` kotlin
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yourRootView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
    }
```
