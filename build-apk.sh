#!/bin/bash
set -x

#REQUIRED
apk_origin_path=app/build/outputs/apk/app-debug.apk
apk_name=sample
apk_extension=.apk
apk_folder=build/apk/

#LET'S SCRIPT
#GET FINAL APK_PATH
date=$(date '+%d%m%Y%H%M%S');
apk_final_path=$apk_folder$apk_name-$date$apk_extension

#BUILD APK
chmod +x gradlew
./gradlew clean
./gradlew assembleDebug

#COPY FILE TO RIGHT FOLDER
mkdir -p $apk_folder
cp $apk_origin_path $apk_final_path#!/bin/sh
sudo ./gradlew clean 
sudo ./gradlew testDebugUnitTest
sudo ./gradlew assembleDebug
sudo mv /Users/iem/Documents/CoderProprement/sample-android-ci/app/build/outputs/apk/app-debug.apk .
DATE=$(date +%d-%m-%Y-%H-%M-%S)
sudo mv app-debug.apk sample-${DATE}.apk  
