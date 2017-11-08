#!/bin/sh
sudo ./gradlew clean 
sudo ./gradlew testDebugUnitTest
sudo ./gradlew assembleDebug
sudo mv /Users/iem/Documents/CoderProprement/sample-android-ci/app/build/outputs/apk/app-debug.apk .
DATE=$(date +%d-%m-%Y-%H-%M-%S)
sudo mv app-debug.apk sample-${DATE}.apk  
