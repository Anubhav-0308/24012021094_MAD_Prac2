<img width="200" height="400" alt="WhatsApp Image 2026-09-13 at 12 54 24 (1)" src="https://github.com/user-attachments/assets/38b97da8-3f45-4773-95e0-83676980d262" />
<img width="200" height="400" alt="WhatsApp Image 2026-09-13 at 12 54 24" src="https://github.com/user-attachments/assets/16167494-0d91-485f-8574-fdbc4659253a" />
<img width="200" height="400" alt="WhatsApp Image 2026-09-13 at 12 54 25" src="https://github.com/user-attachments/assets/daf24d9e-aa92-4245-bf8e-726b21257434" />



# MAD Practical 2 -- Android Activity Lifecycle & Login UI

An Android application developed for **Mobile Application Development
(MAD) Practical 2**.\
The project demonstrates a basic Android login interface and, most
importantly, the **Activity Lifecycle** using Kotlin.

## 📱 Project Overview

This project contains two Android Activities:

-   **LoginActivity** -- Demonstrates Android Activity lifecycle
    callbacks using `Toast` messages and Logcat.
-   **MainActivity** -- Displays a basic Ganpat University login-style
    UI and logs the `onCreate()` lifecycle event.

The launcher activity is currently `LoginActivity`.

## 🎯 Objectives

The main objectives of this practical are:

1.  Understand the Android Activity lifecycle.
2.  Implement lifecycle callback methods in Kotlin.
3.  Display lifecycle events using Toast messages.
4.  Observe lifecycle events through Android Studio Logcat.
5.  Design a basic login screen using XML.
6.  Understand the structure of an Android Studio project.

## 🛠️ Technologies Used

-   **Language:** Kotlin
-   **Platform:** Android
-   **UI:** XML
-   **Build System:** Gradle Kotlin DSL
-   **Android SDK:** Compile SDK 36
-   **Minimum SDK:** 24
-   **Target SDK:** 36
-   **Java Compatibility:** Java 11
-   **UI Libraries:** AndroidX, Material Components, ConstraintLayout

## 📂 Project Structure

``` text
24012021094_MAD_Prac2/
│
├── app/
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           │
│           ├── java/com/example/mad_pr2/
│           │   ├── LoginActivity.kt
│           │   └── MainActivity.kt
│           │
│           └── res/
│               ├── drawable/
│               │   └── guni_pink_logo.png
│               │
│               ├── layout/
│               │   ├── activity_login.xml
│               │   └── activity_main.xml
│               │
│               ├── mipmap-*/
│               │   └── App launcher icons
│               │
│               ├── values/
│               │   ├── colors.xml
│               │   ├── strings.xml
│               │   └── themes.xml
│               │
│               └── xml/
│                   ├── backup_rules.xml
│                   └── data_extraction_rules.xml
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
```

## 🔄 Activity Lifecycle Demonstration

`LoginActivity.kt` implements the following lifecycle methods:

``` text
onCreate()
   ↓
onStart()
   ↓
onResume()
   ↓
[Activity is running]
   ↓
onPause()
   ↓
onResume() / onStop()
   ↓
onRestart() → onStart() → onResume()
```

The project uses a helper method:

``` kotlin
fun display(msg: String) {
    Log.i(TAG, msg)
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}
```

This means every lifecycle event is shown in two places:

-   **Toast:** visible directly on the Android device/emulator.
-   **Logcat:** visible inside Android Studio.

### Lifecycle methods implemented

  -----------------------------------------------------------------------
  Method                              Purpose
  ----------------------------------- -----------------------------------
  `onCreate()`                        Called when the Activity is first
                                      created

  `onStart()`                         Called when the Activity becomes
                                      visible

  `onResume()`                        Called when the Activity comes into
                                      the foreground

  `onPause()`                         Called when the Activity is
                                      partially leaving the foreground

  `onRestart()`                       Called when a stopped Activity is
                                      starting again
  -----------------------------------------------------------------------

## 🔐 Login UI

`activity_main.xml` contains a basic login interface with:

-   Ganpat University logo
-   Email ID label
-   Password label
-   Password input fields
-   Forgot Password text
-   Login button
-   Material CardView
-   ConstraintLayout-based structure

> **Note:** The current project is a UI/lifecycle practical. It does not
> implement real authentication, database validation, or backend login.

## 🚀 How to Run

### 1. Clone or download the project

Open the project folder in **Android Studio**.

### 2. Wait for Gradle Sync

Allow Android Studio to download dependencies and complete Gradle
synchronization.

### 3. Select a device

Use either:

-   Android Emulator, or
-   A physical Android device with USB debugging enabled.

### 4. Run the application

Click the **Run ▶** button in Android Studio.

The launcher Activity is:

``` text
LoginActivity
```

## 🧪 Testing the Activity Lifecycle

After launching the application:

1.  Observe the Toast messages on the device.
2.  Open **Logcat** in Android Studio.
3.  Search for:

``` text
LoginActivity
```

4.  Minimize the app, open another application, or rotate/reopen the
    Activity.
5.  Observe how the lifecycle callbacks are triggered.

Example Logcat output:

``` text
LoginActivity: OnCreate method is called
LoginActivity: OnStart method is called
LoginActivity: OnResume method is called
LoginActivity: OnPause method is called
LoginActivity: OnRestart method is called
```

The exact sequence can vary depending on the action performed and the
Android version/device configuration.

## 📸 Screenshots

Add your project screenshots here if you want to showcase the
application:

``` markdown
![Login Screen](path/to/login-screen.png)
![Activity Lifecycle](path/to/lifecycle-screen.png)
```

## 📚 Concepts Demonstrated

This practical covers the following Android development concepts:

-   Android Studio project structure
-   Activities
-   Activity lifecycle
-   Kotlin programming
-   XML layouts
-   ConstraintLayout
-   MaterialCardView
-   Toast messages
-   Logcat
-   Android Manifest
-   Resource management
-   AndroidX libraries

## 👨‍💻 Student Information

**Student:** Anubhav\
**University:** Ganpat University\
**Course:** B.Tech\
**Subject:** Mobile Application Development (MAD)\
**Practical:** Practical 2

## 📄 License

This project is created for **academic/educational purposes** as part of
a Mobile Application Development practical.
