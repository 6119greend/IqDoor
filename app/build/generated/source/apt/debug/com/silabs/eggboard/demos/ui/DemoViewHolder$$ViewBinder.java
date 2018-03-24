// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DemoViewHolder$$ViewBinder<T extends com.silabs.eggboard.demos.ui.DemoViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296329, "field 'demoLabel'");
    target.demoLabel = finder.castView(view, 2131296329, "field 'demoLabel'");
    view = finder.findRequiredView(source, 2131296328, "field 'demoIcon'");
    target.demoIcon = finder.castView(view, 2131296328, "field 'demoIcon'");
  }

  @Override public void unbind(T target) {
    target.demoLabel = null;
    target.demoIcon = null;
  }
}
