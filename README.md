# FToast
FToast is a simple toast library for Android

## Installation

**Step 1:** Add it in your settings.gradle at the end of repositories:

```css
dependencyResolutionManagement {
    ...
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2:** Add the dependency

```css
dependencies {
   implementation 'com.github.FebrianDev:FToast:1.0.0'
}
```
Then sync gradle build files.

## Usage

Once installed, you can add the FToast from within the context of your MainActivity like so:

```kotlin
// Test FToast
val toast = FToast(applicationContext)
toast.show("Hello Toast!")

