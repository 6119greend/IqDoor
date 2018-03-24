// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LEDControl$$ViewBinder<T extends com.silabs.eggboard.demos.ui.LEDControl> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296302, "field 'button'");
    target.button = finder.castView(view, 2131296302, "field 'button'");
    view = finder.findRequiredView(source, 2131296518, "field 'text'");
    target.text = finder.castView(view, 2131296518, "field 'text'");
  }

  @Override public void unbind(T target) {
    target.button = null;
    target.text = null;
  }
}
