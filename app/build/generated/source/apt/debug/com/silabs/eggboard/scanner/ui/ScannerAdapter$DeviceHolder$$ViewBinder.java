// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.scanner.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ScannerAdapter$DeviceHolder$$ViewBinder<T extends com.silabs.eggboard.scanner.ui.ScannerAdapter.DeviceHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296340, "field 'deviceName'");
    target.deviceName = finder.castView(view, 2131296340, "field 'deviceName'");
    view = finder.findRequiredView(source, 2131296337, "field 'deviceAddress'");
    target.deviceAddress = finder.castView(view, 2131296337, "field 'deviceAddress'");
    view = finder.findRequiredView(source, 2131296487, "field 'signalStrengthIndicator'");
    target.signalStrengthIndicator = finder.castView(view, 2131296487, "field 'signalStrengthIndicator'");
  }

  @Override public void unbind(T target) {
    target.deviceName = null;
    target.deviceAddress = null;
    target.signalStrengthIndicator = null;
  }
}
