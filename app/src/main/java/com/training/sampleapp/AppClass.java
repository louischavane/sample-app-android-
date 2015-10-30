package com.training.sampleapp;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.localytics.android.Localytics;
import com.localytics.android.LocalyticsActivityLifecycleCallbacks;
import io.fabric.sdk.android.Fabric;

/**
 * Created by louis on 28/10/15.
 */
public class AppClass extends Application {

    @Override
    public void onCreate()
    {
        super.onCreate();
        Fabric.with(this, new Crashlytics());

        // Integrate Localytics

        // Register LocalyticsActivityLifecycleCallbacks
        registerActivityLifecycleCallbacks(
                new LocalyticsActivityLifecycleCallbacks(this));
    }

}
