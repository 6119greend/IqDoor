package com.silabs.eggboard.common.ui;

import android.app.Fragment;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ThunderBoardStatusFragment_MembersInjector implements MembersInjector<ThunderBoardStatusFragment> {
  private final MembersInjector<Fragment> supertypeInjector;
  private final Provider<StatusPresenter> presenterProvider;

  public ThunderBoardStatusFragment_MembersInjector(MembersInjector<Fragment> supertypeInjector, Provider<StatusPresenter> presenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public void injectMembers(ThunderBoardStatusFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
  }

  public static MembersInjector<ThunderBoardStatusFragment> create(MembersInjector<Fragment> supertypeInjector, Provider<StatusPresenter> presenterProvider) {  
      return new ThunderBoardStatusFragment_MembersInjector(supertypeInjector, presenterProvider);
  }
}

