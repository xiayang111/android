package com.xiayang.myapplication.modules;

import com.xiayang.myapplication.App;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideAppFactory implements Factory<App> {
  private final AppModule module;

  public AppModule_ProvideAppFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public App get() {  
    App provided = module.provideApp();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<App> create(AppModule module) {  
    return new AppModule_ProvideAppFactory(module);
  }
}

