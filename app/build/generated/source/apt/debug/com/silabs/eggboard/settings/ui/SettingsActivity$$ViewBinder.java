// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.settings.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SettingsActivity$$ViewBinder<T extends com.silabs.eggboard.settings.ui.SettingsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296528, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296528, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296427, "field 'nameDisplay' and method 'clickNameDisplay'");
    target.nameDisplay = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickNameDisplay();
        }
      });
    view = finder.findRequiredView(source, 2131296428, "field 'nameDisplayText'");
    target.nameDisplayText = finder.castView(view, 2131296428, "field 'nameDisplayText'");
    view = finder.findRequiredView(source, 2131296429, "field 'nameEdit'");
    target.nameEdit = view;
    view = finder.findRequiredView(source, 2131296430, "field 'nameEditText'");
    target.nameEditText = finder.castView(view, 2131296430, "field 'nameEditText'");
    view = finder.findRequiredView(source, 2131296523, "field 'titleDisplay' and method 'clickTitleDisplay'");
    target.titleDisplay = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickTitleDisplay();
        }
      });
    view = finder.findRequiredView(source, 2131296524, "field 'titleDisplayText'");
    target.titleDisplayText = finder.castView(view, 2131296524, "field 'titleDisplayText'");
    view = finder.findRequiredView(source, 2131296525, "field 'titleEdit'");
    target.titleEdit = view;
    view = finder.findRequiredView(source, 2131296526, "field 'titleEditText'");
    target.titleEditText = finder.castView(view, 2131296526, "field 'titleEditText'");
    view = finder.findRequiredView(source, 2131296347, "field 'emailDisplay' and method 'clickEmailDisplay'");
    target.emailDisplay = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickEmailDisplay();
        }
      });
    view = finder.findRequiredView(source, 2131296348, "field 'emailDisplayText'");
    target.emailDisplayText = finder.castView(view, 2131296348, "field 'emailDisplayText'");
    view = finder.findRequiredView(source, 2131296349, "field 'emailEdit'");
    target.emailEdit = view;
    view = finder.findRequiredView(source, 2131296350, "field 'emailEditText'");
    target.emailEditText = finder.castView(view, 2131296350, "field 'emailEditText'");
    view = finder.findRequiredView(source, 2131296441, "field 'phoneDisplay' and method 'clickPhoneDisplay'");
    target.phoneDisplay = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickPhoneDisplay();
        }
      });
    view = finder.findRequiredView(source, 2131296442, "field 'phoneDisplayText'");
    target.phoneDisplayText = finder.castView(view, 2131296442, "field 'phoneDisplayText'");
    view = finder.findRequiredView(source, 2131296443, "field 'phoneEdit'");
    target.phoneEdit = view;
    view = finder.findRequiredView(source, 2131296444, "field 'phoneEditText'");
    target.phoneEditText = finder.castView(view, 2131296444, "field 'phoneEditText'");
    view = finder.findRequiredView(source, 2131296308, "field 'ccSwitch'");
    target.ccSwitch = finder.castView(view, 2131296308, "field 'ccSwitch'");
    view = finder.findRequiredView(source, 2131296396, "field 'measurementSpinner'");
    target.measurementSpinner = finder.castView(view, 2131296396, "field 'measurementSpinner'");
    view = finder.findRequiredView(source, 2131296517, "field 'temperatureSpinner'");
    target.temperatureSpinner = finder.castView(view, 2131296517, "field 'temperatureSpinner'");
    view = finder.findRequiredView(source, 2131296401, "field 'modelTypeSpinner'");
    target.modelTypeSpinner = finder.castView(view, 2131296401, "field 'modelTypeSpinner'");
    view = finder.findRequiredView(source, 2131296294, "field 'beaconStatus'");
    target.beaconStatus = finder.castView(view, 2131296294, "field 'beaconStatus'");
    view = finder.findRequiredView(source, 2131296535, "field 'versionInfoText'");
    target.versionInfoText = finder.castView(view, 2131296535, "field 'versionInfoText'");
    view = finder.findRequiredView(source, 2131296291, "method 'clickBeaconNotifications'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickBeaconNotifications();
        }
      });
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.nameDisplay = null;
    target.nameDisplayText = null;
    target.nameEdit = null;
    target.nameEditText = null;
    target.titleDisplay = null;
    target.titleDisplayText = null;
    target.titleEdit = null;
    target.titleEditText = null;
    target.emailDisplay = null;
    target.emailDisplayText = null;
    target.emailEdit = null;
    target.emailEditText = null;
    target.phoneDisplay = null;
    target.phoneDisplayText = null;
    target.phoneEdit = null;
    target.phoneEditText = null;
    target.ccSwitch = null;
    target.measurementSpinner = null;
    target.temperatureSpinner = null;
    target.modelTypeSpinner = null;
    target.beaconStatus = null;
    target.versionInfoText = null;
  }
}
