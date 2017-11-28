package com.xiayang.myapplication.component;

import android.content.SharedPreferences;
import com.xiayang.myapplication.App;
import com.xiayang.myapplication.MainActivity;
import com.xiayang.myapplication.MainActivity_MembersInjector;
import com.xiayang.myapplication.modules.AppModule;
import com.xiayang.myapplication.modules.AppModule_ProvideAppFactory;
import com.xiayang.myapplication.modules.AppModule_ProvideSpFactory;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<App> provideAppProvider;
  private Provider<SharedPreferences> provideSpProvider;
  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideAppProvider = ScopedProvider.create(AppModule_ProvideAppFactory.create(builder.appModule));
    this.provideSpProvider = ScopedProvider.create(AppModule_ProvideSpFactory.create(builder.appModule));
    this.mainActivityMembersInjector = MainActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideAppProvider, provideSpProvider);
  }

  @Override
  public void inject(MainActivity activity) {  
    mainActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private AppModule appModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  }
}

