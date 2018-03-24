package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.common.ui.ThunderBoardActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemosSelectionActivity_MembersInjector implements MembersInjector<DemosSelectionActivity> {
  private final MembersInjector<ThunderBoardActivity> supertypeInjector;
  private final Provider<DemosPresenter> presenterProvider;

  public DemosSelectionActivity_MembersInjector(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<DemosPresenter> presenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public void injectMembers(DemosSelectionActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
  }

  public static MembersInjector<DemosSelectionActivity> create(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<DemosPresenter> presenterProvider) {  
      return new DemosSelectionActivity_MembersInjector(supertypeInjector, presenterProvider);
  }
}

