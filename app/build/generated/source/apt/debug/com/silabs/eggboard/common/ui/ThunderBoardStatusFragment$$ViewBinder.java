// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.common.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ThunderBoardStatusFragment$$ViewBinder<T extends com.silabs.eggboard.common.ui.ThunderBoardStatusFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296285, "field 'batteryIndicator'");
    target.batteryIndicator = finder.castView(view, 2131296285, "field 'batteryIndicator'");
    view = finder.findRequiredView(source, 2131296341, "field 'deviceStatus'");
    target.deviceStatus = finder.castView(view, 2131296341, "field 'deviceStatus'");
    view = finder.findRequiredView(source, 2131296340, "field 'deviceName'");
    target.deviceName = finder.castView(view, 2131296340, "field 'deviceName'");
    view = finder.findRequiredView(source, 2131296338, "field 'deviceFirmware'");
    target.deviceFirmware = finder.castView(view, 2131296338, "field 'deviceFirmware'");
    view = finder.findRequiredView(source, 2131296447, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131296447, "field 'progressBar'");
  }

  @Override public void unbind(T target) {
    target.batteryIndicator = null;
    target.deviceStatus = null;
    target.deviceName = null;
    target.deviceFirmware = null;
    target.progressBar = null;
  }
}
