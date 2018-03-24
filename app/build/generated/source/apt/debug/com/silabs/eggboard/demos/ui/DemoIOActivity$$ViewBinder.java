// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DemoIOActivity$$ViewBinder<T extends com.silabs.eggboard.demos.ui.DemoIOActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296511, "field 'switch0'");
    target.switch0 = finder.castView(view, 2131296511, "field 'switch0'");
    view = finder.findRequiredView(source, 2131296512, "field 'switch1'");
    target.switch1 = finder.castView(view, 2131296512, "field 'switch1'");
    view = finder.findRequiredView(source, 2131296384, "field 'led0'");
    target.led0 = finder.castView(view, 2131296384, "field 'led0'");
    view = finder.findRequiredView(source, 2131296385, "field 'led1'");
    target.led1 = finder.castView(view, 2131296385, "field 'led1'");
    view = finder.findRequiredView(source, 2131296318, "field 'colorLEDControl'");
    target.colorLEDControl = finder.castView(view, 2131296318, "field 'colorLEDControl'");
  }

  @Override public void unbind(T target) {
    target.switch0 = null;
    target.switch1 = null;
    target.led0 = null;
    target.led1 = null;
    target.colorLEDControl = null;
  }
}
