package com.example.coronaviruse.Activities;

import android.app.Application;
import android.os.StrictMode;

public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }
}
