/*
 * Copyright (C) 2016-2026 574291562@qq.com All Rights Reserved.
 * Unauthorzied copying of this file,via any medium is strictly prohibited
 * Proprietary and confidential
 *      _   _   _   _   _   _   _
 *     / \ / \ / \ / \ / \ / \ / \
 *    ( # | M | o | m | e | n | t )
 *     \_/ \_/ \_/ \_/ \_/ \_/ \_/
 *
 * Written by Peter Ho <574291562@qq.com>, May 2016
 */

package com.imu.love;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengRegistrar;

public class PushNotification extends ReactContextBaseJavaModule {

    public PushNotification(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "PushNotificationAndroid";
    }


    @ReactMethod
    public void enable(){
        PushAgent mPushAgent = PushAgent.getInstance(getCurrentActivity());
        mPushAgent.enable();
    }

    @ReactMethod
    public void getRegistrationId(Callback callback){
        String id = UmengRegistrar.getRegistrationId(getCurrentActivity());
        callback.invoke(id);
    }
}
