// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SwitchControl$$ViewBinder<T extends com.silabs.eggboard.demos.ui.SwitchControl> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296513, "field 'image'");
    target.image = finder.castView(view, 2131296513, "field 'image'");
    view = finder.findRequiredView(source, 2131296514, "field 'text'");
    target.text = finder.castView(view, 2131296514, "field 'text'");
  }

  @Override public void unbind(T target) {
    target.image = null;
    target.text = null;
  }
}
