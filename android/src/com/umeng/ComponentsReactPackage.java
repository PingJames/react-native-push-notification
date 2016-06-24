
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

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComponentsReactPackage implements ReactPackage{
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new PushNotification(reactContext));
        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
