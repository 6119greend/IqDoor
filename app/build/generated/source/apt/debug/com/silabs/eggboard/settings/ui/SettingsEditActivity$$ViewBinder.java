// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.settings.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SettingsEditActivity$$ViewBinder<T extends com.silabs.eggboard.settings.ui.SettingsEditActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296482, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296482, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296478, "field 'editName'");
    target.editName = finder.castView(view, 2131296478, "field 'editName'");
    view = finder.findRequiredView(source, 2131296481, "field 'editTitle'");
    target.editTitle = finder.castView(view, 2131296481, "field 'editTitle'");
    view = finder.findRequiredView(source, 2131296477, "field 'editEmail'");
    target.editEmail = finder.castView(view, 2131296477, "field 'editEmail'");
    view = finder.findRequiredView(source, 2131296479, "field 'editPhone'");
    target.editPhone = finder.castView(view, 2131296479, "field 'editPhone'");
    view = finder.findRequiredView(source, 2131296480, "field 'editCCSelf'");
    target.editCCSelf = finder.castView(view, 2131296480, "field 'editCCSelf'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.editName = null;
    target.editTitle = null;
    target.editEmail = null;
    target.editPhone = null;
    target.editCCSelf = null;
  }
}
