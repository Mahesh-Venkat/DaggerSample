package com.anushka.androidtutz.contactmanager;

import android.app.Application;

import com.anushka.androidtutz.contactmanager.dependencyinjection.ApplicatonModule;
import com.anushka.androidtutz.contactmanager.dependencyinjection.ContactAppComponent;
import com.anushka.androidtutz.contactmanager.dependencyinjection.DaggerContactAppComponent;

public class App extends Application {
    private static App application;

    private ContactAppComponent contactAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        contactAppComponent = DaggerContactAppComponent.builder()
                                .applicatonModule(new ApplicatonModule(this)).build();
    }

    public static App getApplication() {
        return application;
    }

    public static void setApplication(App application) {
        App.application = application;
    }

    public ContactAppComponent getContactAppComponent() {
        return contactAppComponent;
    }
}
