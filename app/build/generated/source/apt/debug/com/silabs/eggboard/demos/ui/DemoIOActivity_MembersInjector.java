package com.silabs.eggboard.demos.ui;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemoIOActivity_MembersInjector implements MembersInjector<DemoIOActivity> {
  private final MembersInjector<BaseDemoActivity> supertypeInjector;
  private final Provider<DemoIOPresenter> presenterProvider;

  public DemoIOActivity_MembersInjector(MembersInjector<BaseDemoActivity> supertypeInjector, Provider<DemoIOPresenter> presenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public void injectMembers(DemoIOActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
  }

  public static MembersInjector<DemoIOActivity> create(MembersInjector<BaseDemoActivity> supertypeInjector, Provider<DemoIOPresenter> presenterProvider) {  
      return new DemoIOActivity_MembersInjector(supertypeInjector, presenterProvider);
  }
}

