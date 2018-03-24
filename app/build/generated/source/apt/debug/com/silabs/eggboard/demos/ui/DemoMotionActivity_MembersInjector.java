package com.silabs.eggboard.demos.ui;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemoMotionActivity_MembersInjector implements MembersInjector<DemoMotionActivity> {
  private final MembersInjector<GdxDemoActivity> supertypeInjector;
  private final Provider<DemoMotionPresenter> presenterProvider;

  public DemoMotionActivity_MembersInjector(MembersInjector<GdxDemoActivity> supertypeInjector, Provider<DemoMotionPresenter> presenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public void injectMembers(DemoMotionActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
  }

  public static MembersInjector<DemoMotionActivity> create(MembersInjector<GdxDemoActivity> supertypeInjector, Provider<DemoMotionPresenter> presenterProvider) {  
      return new DemoMotionActivity_MembersInjector(supertypeInjector, presenterProvider);
  }
}

