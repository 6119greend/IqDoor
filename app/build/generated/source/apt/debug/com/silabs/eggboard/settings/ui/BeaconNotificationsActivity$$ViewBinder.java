// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.settings.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BeaconNotificationsActivity$$ViewBinder<T extends com.silabs.eggboard.settings.ui.BeaconNotificationsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296528, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296528, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296293, "field 'beaconSwitch'");
    target.beaconSwitch = finder.castView(view, 2131296293, "field 'beaconSwitch'");
    view = finder.findRequiredView(source, 2131296327, "field 'demodevicesRecyclerView'");
    target.demodevicesRecyclerView = finder.castView(view, 2131296327, "field 'demodevicesRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.beaconSwitch = null;
    target.demodevicesRecyclerView = null;
  }
}
