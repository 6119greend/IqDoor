// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.demos.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DemoMotionActivity$$ViewBinder<T extends com.silabs.eggboard.demos.ui.DemoMotionActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296307, "field 'carAnimationHolder'");
    target.carAnimationHolder = finder.castView(view, 2131296307, "field 'carAnimationHolder'");
    view = finder.findRequiredView(source, 2131296436, "field 'orientationX'");
    target.orientationX = finder.castView(view, 2131296436, "field 'orientationX'");
    view = finder.findRequiredView(source, 2131296437, "field 'orientationY'");
    target.orientationY = finder.castView(view, 2131296437, "field 'orientationY'");
    view = finder.findRequiredView(source, 2131296438, "field 'orientationZ'");
    target.orientationZ = finder.castView(view, 2131296438, "field 'orientationZ'");
    view = finder.findRequiredView(source, 2131296256, "field 'accelerationX'");
    target.accelerationX = finder.castView(view, 2131296256, "field 'accelerationX'");
    view = finder.findRequiredView(source, 2131296257, "field 'accelerationY'");
    target.accelerationY = finder.castView(view, 2131296257, "field 'accelerationY'");
    view = finder.findRequiredView(source, 2131296258, "field 'accelerationZ'");
    target.accelerationZ = finder.castView(view, 2131296258, "field 'accelerationZ'");
    view = finder.findRequiredView(source, 2131296495, "field 'speedText'");
    target.speedText = finder.castView(view, 2131296495, "field 'speedText'");
    view = finder.findRequiredView(source, 2131296499, "field 'speedUnitsText'");
    target.speedUnitsText = finder.castView(view, 2131296499, "field 'speedUnitsText'");
    view = finder.findRequiredView(source, 2131296454, "field 'rpmText'");
    target.rpmText = finder.castView(view, 2131296454, "field 'rpmText'");
    view = finder.findRequiredView(source, 2131296343, "field 'distanceText'");
    target.distanceText = finder.castView(view, 2131296343, "field 'distanceText'");
    view = finder.findRequiredView(source, 2131296345, "field 'distanceUnitsText'");
    target.distanceUnitsText = finder.castView(view, 2131296345, "field 'distanceUnitsText'");
    view = finder.findRequiredView(source, 2131296451, "field 'revolutionsText'");
    target.revolutionsText = finder.castView(view, 2131296451, "field 'revolutionsText'");
    view = finder.findRequiredView(source, 2131296540, "field 'wheelDiameterText'");
    target.wheelDiameterText = finder.castView(view, 2131296540, "field 'wheelDiameterText'");
    view = finder.findRequiredView(source, 2131296539, "field 'wheelContainer'");
    target.wheelContainer = finder.castView(view, 2131296539, "field 'wheelContainer'");
    view = finder.findRequiredView(source, 2131296455, "field 'rpmContainer'");
    target.rpmContainer = finder.castView(view, 2131296455, "field 'rpmContainer'");
    view = finder.findRequiredView(source, 2131296391, "field 'linearSpeedContainer'");
    target.linearSpeedContainer = finder.castView(view, 2131296391, "field 'linearSpeedContainer'");
    view = finder.findRequiredView(source, 2131296452, "field 'revolutionsContainer'");
    target.revolutionsContainer = finder.castView(view, 2131296452, "field 'revolutionsContainer'");
    view = finder.findRequiredView(source, 2131296390, "field 'linearDistanceContainer'");
    target.linearDistanceContainer = finder.castView(view, 2131296390, "field 'linearDistanceContainer'");
    view = finder.findRequiredView(source, 2131296497, "field 'speedDistanceContainer'");
    target.speedDistanceContainer = finder.castView(view, 2131296497, "field 'speedDistanceContainer'");
    view = finder.findRequiredView(source, 2131296498, "field 'speedDistanceScroll'");
    target.speedDistanceScroll = finder.castView(view, 2131296498, "field 'speedDistanceScroll'");
    view = finder.findRequiredView(source, 2131296496, "field 'speedContainer'");
    target.speedContainer = finder.castView(view, 2131296496, "field 'speedContainer'");
    view = finder.findRequiredView(source, 2131296344, "field 'distanceContainer'");
    target.distanceContainer = finder.castView(view, 2131296344, "field 'distanceContainer'");
    view = finder.findRequiredView(source, 2131296304, "method 'onCalibrate'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onCalibrate();
        }
      });
  }

  @Override public void unbind(T target) {
    target.carAnimationHolder = null;
    target.orientationX = null;
    target.orientationY = null;
    target.orientationZ = null;
    target.accelerationX = null;
    target.accelerationY = null;
    target.accelerationZ = null;
    target.speedText = null;
    target.speedUnitsText = null;
    target.rpmText = null;
    target.distanceText = null;
    target.distanceUnitsText = null;
    target.revolutionsText = null;
    target.wheelDiameterText = null;
    target.wheelContainer = null;
    target.rpmContainer = null;
    target.linearSpeedContainer = null;
    target.revolutionsContainer = null;
    target.linearDistanceContainer = null;
    target.speedDistanceContainer = null;
    target.speedDistanceScroll = null;
    target.speedContainer = null;
    target.distanceContainer = null;
  }
}
