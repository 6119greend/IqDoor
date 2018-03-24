package com.silabs.eggboard.scanner.ui;

import com.silabs.eggboard.common.ui.ThunderBoardActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ScannerActivity_MembersInjector implements MembersInjector<ScannerActivity> {
  private final MembersInjector<ThunderBoardActivity> supertypeInjector;
  private final Provider<ScannerPresenter> presenterProvider;

  public ScannerActivity_MembersInjector(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<ScannerPresenter> presenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public void injectMembers(ScannerActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
  }

  public static MembersInjector<ScannerActivity> create(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<ScannerPresenter> presenterProvider) {  
      return new ScannerActivity_MembersInjector(supertypeInjector, presenterProvider);
  }
}

