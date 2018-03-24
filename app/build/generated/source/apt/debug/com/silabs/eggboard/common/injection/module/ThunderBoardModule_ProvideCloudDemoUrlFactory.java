package com.silabs.eggboard.common.injection.module;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ThunderBoardModule_ProvideCloudDemoUrlFactory implements Factory<String> {
  private final ThunderBoardModule module;

  public ThunderBoardModule_ProvideCloudDemoUrlFactory(ThunderBoardModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.provideCloudDemoUrl();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(ThunderBoardModule module) {  
    return new ThunderBoardModule_ProvideCloudDemoUrlFactory(module);
  }
}

