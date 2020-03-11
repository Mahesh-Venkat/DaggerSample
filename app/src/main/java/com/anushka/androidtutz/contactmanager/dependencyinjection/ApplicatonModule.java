package com.anushka.androidtutz.contactmanager.dependencyinjection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicatonModule {
    private final Application application;


    public ApplicatonModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }
}
