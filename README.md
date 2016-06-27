# react-native-push-notification

Push Notification for react native based on Umeng Notification SDK(2.8.1)

## Getting Started
```shell
  npm install --save react-native-push-notification-umeng
```

## Android Setup
### Manual
1. In your `android/settings.gradle` file,make the following additions:

  ```gradle
  include ':app', ':react-native-push-notification-umeng'
  project(':react-native-push-notification-umeng').projectDir = new File(rootProject.projectDir,'../node_modules/react-native-push-notification-umeng/android')
  ```

2. In your `android/app/build.gradle` file ,add the `react-native-push-notification' project as a compile-time denpendency:
  
  ```gradle
  ...
  dependencies {
    ...
    compile project(':react-native-push-notification-umeng')
  }
  ```
  
3. In your `android/app/src/main/java/[...]/MainActivity.java`  
  - Add `import com.umeng.message.PushAgent;import com.umeng.notification.PushNotificationPackage;` to the imports at the top of the file
  - Add push notification code At `protected void onCreate(Bundle savedInstanceState)` method as the following part:
    
    ```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ...
        PushAgent mPushAgent = PushAgent.getInstance(getApplicationContext());
        mPushAgent.enable();
    }
    ```
    
    - Add `new PushNotificationPackage()` to the list returned by the getPackages() method
  
4. In your `\android\app\src\main\AndroidManifest.xml`,make the following additions:
    
    ```xml
      <application ...>
        <meta-data
            android:name="UMENG_APPKEY"
            android:value="YOUR_UMENG_APPKEY" >
        </meta-data>
        <meta-data
            android:name="UMENG_MESSAGE_SECRET"
            android:value="YOUR_UMENG_MESSAGE_SECRET" >
        </meta-data>
        ...
    ```
  
  
