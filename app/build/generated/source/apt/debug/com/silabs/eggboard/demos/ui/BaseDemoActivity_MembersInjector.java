package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.common.data.PreferenceManager;
import com.silabs.eggboard.common.ui.ThunderBoardActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BaseDemoActivity_MembersInjector implements MembersInjector<BaseDemoActivity> {
  private final MembersInjector<ThunderBoardActivity> supertypeInjector;
  private final Provider<PreferenceManager> prefsManagerProvider;

  public BaseDemoActivity_MembersInjector(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<PreferenceManager> prefsManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert prefsManagerProvider != null;
    this.prefsManagerProvider = prefsManagerProvider;
  }

  @Override
  public void injectMembers(BaseDemoActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.prefsManager = prefsManagerProvider.get();
  }

  public static MembersInjector<BaseDemoActivity> create(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<PreferenceManager> prefsManagerProvider) {  
      return new BaseDemoActivity_MembersInjector(supertypeInjector, prefsManagerProvider);
  }
}

