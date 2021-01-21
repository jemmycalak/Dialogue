# Dialogue
## a custom dialog with custom action and icon
## Screenshoot
<img src="screenshoot/example_1.png" height="400" alt="Screenshot"/>

## How to use ?
### implementation 'com.github.jemmycalak:Dialogue:0.0.2'
### in build.gradle:
buildFeatures {
    dataBinding true
}
### and:
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}

### show the dialog
Dialogue(DialogueModel(
    R.drawable.ic_icon,
    "Warning",
    "Oops there's an error with our system",
    "Yes",
    "No",
    {},
    {}
)).show(supportFragmentManager, TAG)
