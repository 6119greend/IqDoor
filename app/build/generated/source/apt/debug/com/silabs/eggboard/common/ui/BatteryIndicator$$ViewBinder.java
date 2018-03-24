// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.common.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BatteryIndicator$$ViewBinder<T extends com.silabs.eggboard.common.ui.BatteryIndicator> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296287, "field 'batteryPercent'");
    target.batteryPercent = finder.castView(view, 2131296287, "field 'batteryPercent'");
    view = finder.findRequiredView(source, 2131296286, "field 'batteryMeter'");
    target.batteryMeter = finder.castView(view, 2131296286, "field 'batteryMeter'");
  }

  @Override public void unbind(T target) {
    target.batteryPercent = null;
    target.batteryMeter = null;
  }
}
