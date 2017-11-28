package com.xiayang.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final MembersInjector<Activity> supertypeInjector;
  private final Provider<App> appProvider;
  private final Provider<SharedPreferences> spProvider;

  public MainActivity_MembersInjector(MembersInjector<Activity> supertypeInjector, Provider<App> appProvider, Provider<SharedPreferences> spProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert appProvider != null;
    this.appProvider = appProvider;
    assert spProvider != null;
    this.spProvider = spProvider;
  }

  @Override
  public void injectMembers(MainActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.app = appProvider.get();
    instance.sp = spProvider.get();
  }

  public static MembersInjector<MainActivity> create(MembersInjector<Activity> supertypeInjector, Provider<App> appProvider, Provider<SharedPreferences> spProvider) {  
      return new MainActivity_MembersInjector(supertypeInjector, appProvider, spProvider);
  }
}

