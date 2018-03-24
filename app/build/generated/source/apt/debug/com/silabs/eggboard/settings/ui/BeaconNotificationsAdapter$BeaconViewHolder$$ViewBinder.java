// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.settings.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BeaconNotificationsAdapter$BeaconViewHolder$$ViewBinder<T extends com.silabs.eggboard.settings.ui.BeaconNotificationsAdapter.BeaconViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296292, "field 'beaconStateText'");
    target.beaconStateText = finder.castView(view, 2131296292, "field 'beaconStateText'");
    view = finder.findRequiredView(source, 2131296290, "field 'beaconNameText'");
    target.beaconNameText = finder.castView(view, 2131296290, "field 'beaconNameText'");
    view = finder.findRequiredView(source, 2131296288, "field 'beaconAction'");
    target.beaconAction = finder.castView(view, 2131296288, "field 'beaconAction'");
  }

  @Override public void unbind(T target) {
    target.beaconStateText = null;
    target.beaconNameText = null;
    target.beaconAction = null;
  }
}
