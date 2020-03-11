package com.anushka.androidtutz.contactmanager.dependencyinjection;

import com.anushka.androidtutz.contactmanager.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {ApplicatonModule.class, RoomModule.class})
public interface ContactAppComponent {
    void inject(MainActivity mainActivity);
}
