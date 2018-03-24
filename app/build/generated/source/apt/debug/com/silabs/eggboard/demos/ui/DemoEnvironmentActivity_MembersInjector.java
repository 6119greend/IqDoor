package com.silabs.eggboard.demos.ui;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemoEnvironmentActivity_MembersInjector implements MembersInjector<DemoEnvironmentActivity> {
  private final MembersInjector<BaseDemoActivity> supertypeInjector;
  private final Provider<DemoEnvironmentPresenter> presenterProvider;

  public DemoEnvironmentActivity_MembersInjector(MembersInjector<BaseDemoActivity> supertypeInjector, Provider<DemoEnvironmentPresenter> presenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public void injectMembers(DemoEnvironmentActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
  }

  public static MembersInjector<DemoEnvironmentActivity> create(MembersInjector<BaseDemoActivity> supertypeInjector, Provider<DemoEnvironmentPresenter> presenterProvider) {  
      return new DemoEnvironmentActivity_MembersInjector(supertypeInjector, presenterProvider);
  }
}

