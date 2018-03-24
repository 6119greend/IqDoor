// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DemoEnvironmentActivity$$ViewBinder<T extends com.silabs.eggboard.demos.ui.DemoEnvironmentActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296516, "field 'temperatureControl'");
    target.temperatureControl = finder.castView(view, 2131296516, "field 'temperatureControl'");
    view = finder.findRequiredView(source, 2131296371, "field 'humidityControl'");
    target.humidityControl = finder.castView(view, 2131296371, "field 'humidityControl'");
    view = finder.findRequiredView(source, 2131296283, "field 'ambientLightControl'");
    target.ambientLightControl = finder.castView(view, 2131296283, "field 'ambientLightControl'");
    view = finder.findRequiredView(source, 2131296534, "field 'uvIndexControl'");
    target.uvIndexControl = finder.castView(view, 2131296534, "field 'uvIndexControl'");
    view = finder.findRequiredView(source, 2131296357, "field 'blockPressureAndSound'");
    target.blockPressureAndSound = view;
    view = finder.findRequiredView(source, 2131296446, "field 'pressureControl'");
    target.pressureControl = finder.castView(view, 2131296446, "field 'pressureControl'");
    view = finder.findRequiredView(source, 2131296493, "field 'soundLevelControl'");
    target.soundLevelControl = finder.castView(view, 2131296493, "field 'soundLevelControl'");
    view = finder.findRequiredView(source, 2131296355, "field 'blockAirQuality'");
    target.blockAirQuality = view;
    view = finder.findRequiredView(source, 2131296316, "field 'co2Control'");
    target.co2Control = finder.castView(view, 2131296316, "field 'co2Control'");
    view = finder.findRequiredView(source, 2131296537, "field 'vocControl'");
    target.vocControl = finder.castView(view, 2131296537, "field 'vocControl'");
    view = finder.findRequiredView(source, 2131296356, "field 'blockMagneticField'");
    target.blockMagneticField = view;
    view = finder.findRequiredView(source, 2131296368, "field 'hallStrengthControl'");
    target.hallStrengthControl = finder.castView(view, 2131296368, "field 'hallStrengthControl'");
    view = finder.findRequiredView(source, 2131296366, "field 'hallStateControl'");
    target.hallStateControl = finder.castView(view, 2131296366, "field 'hallStateControl'");
    view = finder.findRequiredView(source, 2131296367, "method 'onHallStateClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onHallStateClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.temperatureControl = null;
    target.humidityControl = null;
    target.ambientLightControl = null;
    target.uvIndexControl = null;
    target.blockPressureAndSound = null;
    target.pressureControl = null;
    target.soundLevelControl = null;
    target.blockAirQuality = null;
    target.co2Control = null;
    target.vocControl = null;
    target.blockMagneticField = null;
    target.hallStrengthControl = null;
    target.hallStateControl = null;
  }
}
