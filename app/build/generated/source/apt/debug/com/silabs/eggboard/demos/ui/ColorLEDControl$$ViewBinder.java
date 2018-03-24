// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ColorLEDControl$$ViewBinder<T extends com.silabs.eggboard.demos.ui.ColorLEDControl> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296379, "field 'colorLEDs'");
    target.colorLEDs = finder.castView(view, 2131296379, "field 'colorLEDs'");
    view = finder.findRequiredView(source, 2131296382, "field 'hueSelect'");
    target.hueSelect = finder.castView(view, 2131296382, "field 'hueSelect'");
    view = finder.findRequiredView(source, 2131296378, "field 'brightnessSelect'");
    target.brightnessSelect = finder.castView(view, 2131296378, "field 'brightnessSelect'");
    view = finder.findRequiredView(source, 2131296380, "field 'colorSwitch'");
    target.colorSwitch = finder.castView(view, 2131296380, "field 'colorSwitch'");
    view = finder.findRequiredView(source, 2131296381, "field 'hueBackgroundView'");
    target.hueBackgroundView = finder.castView(view, 2131296381, "field 'hueBackgroundView'");
  }

  @Override public void unbind(T target) {
    target.colorLEDs = null;
    target.hueSelect = null;
    target.brightnessSelect = null;
    target.colorSwitch = null;
    target.hueBackgroundView = null;
  }
}
