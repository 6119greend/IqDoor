// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.scanner.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SignalStrengthIndicator$$ViewBinder<T extends com.silabs.eggboard.scanner.ui.SignalStrengthIndicator> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296488, "field 'signalStrengthMeter'");
    target.signalStrengthMeter = finder.castView(view, 2131296488, "field 'signalStrengthMeter'");
    view = finder.findRequiredView(source, 2131296489, "field 'signalStrengthText'");
    target.signalStrengthText = finder.castView(view, 2131296489, "field 'signalStrengthText'");
  }

  @Override public void unbind(T target) {
    target.signalStrengthMeter = null;
    target.signalStrengthText = null;
  }
}
