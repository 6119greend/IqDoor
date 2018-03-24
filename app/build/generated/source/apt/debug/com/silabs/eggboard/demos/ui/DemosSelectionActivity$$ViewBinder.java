// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DemosSelectionActivity$$ViewBinder<T extends com.silabs.eggboard.demos.ui.DemosSelectionActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296331, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296331, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296330, "field 'demosRecyclerView'");
    target.demosRecyclerView = finder.castView(view, 2131296330, "field 'demosRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.demosRecyclerView = null;
  }
}
