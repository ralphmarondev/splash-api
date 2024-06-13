# Adding splash screen

- Create an icon
- Place the icon in res/drawable

# Create Themes

Dark
res/values-night/splash.xml

```
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="App.Starting.Theme" parent="Theme.SplashScreen">
        <item name="windowSplashScreenBackground">#1C1E21</item>
        <item name="windowSplashScreenAnimatedIcon">@drawable/ic_splash</item>
        <item name="postSplashScreenTheme">@style/Theme.MyApplication</item>
    </style>
</resources>
```

Light
res/values/splash.xml

```
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="App.Starting.Theme" parent="Theme.SplashScreen">
        <item name="windowSplashScreenBackground">#FFFF</item>
        <item name="windowSplashScreenAnimatedIcon">@drawable/ic_splash</item>
        <item name="postSplashScreenTheme">@style/Theme.MyApplication</item>
    </style>
</resources>
```

# Configure app

AndroidManifest.xml
```
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"

        <!-- put the new theme here -->
        android:theme="@style/App.Starting.Theme"

        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:label="@string/app_name"

            <!-- Also put here-->
            android:theme="@style/App.Starting.Theme">

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
```

MainActivity.kt
```
// initialize [installSplashScreen()] before setContent

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      // RIGHT HERE!!
        installSplashScreen()

        enableEdgeToEdge()
        setContent {
            MyApplication()

```
