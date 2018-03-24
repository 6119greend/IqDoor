package com.silabs.eggboard.common.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ThunderBoardModule_ProvideContextFactory implements Factory<Context> {
  private final ThunderBoardModule module;

  public ThunderBoardModule_ProvideContextFactory(ThunderBoardModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {  
    Context provided = module.provideContext();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Context> create(ThunderBoardModule module) {  
    return new ThunderBoardModule_ProvideContextFactory(module);
  }
}

