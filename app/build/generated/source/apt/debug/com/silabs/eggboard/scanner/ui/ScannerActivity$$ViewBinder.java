// Generated code from Butter Knife. Do not modify!
package com.silabs.eggboard.scanner.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ScannerActivity$$ViewBinder<T extends com.silabs.eggboard.scanner.ui.ScannerActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296459, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296459, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296400, "field 'mmLogo'");
    target.mmLogo = finder.castView(view, 2131296400, "field 'mmLogo'");
    view = finder.findRequiredView(source, 2131296301, "field 'bottomPanel'");
    target.bottomPanel = finder.castView(view, 2131296301, "field 'bottomPanel'");
    view = finder.findRequiredView(source, 2131296456, "field 'scannerRecyclerView'");
    target.scannerRecyclerView = finder.castView(view, 2131296456, "field 'scannerRecyclerView'");
    view = finder.findRequiredView(source, 2131296298, "field 'bluetoothDevicesView'");
    target.bluetoothDevicesView = view;
    view = finder.findRequiredView(source, 2131296299, "field 'bluetoothNoDevicesView'");
    target.bluetoothNoDevicesView = view;
    view = finder.findRequiredView(source, 2131296458, "field 'scannerStatusReport'");
    target.scannerStatusReport = finder.castView(view, 2131296458, "field 'scannerStatusReport'");
    view = finder.findRequiredView(source, 2131296457, "field 'scannerProgress'");
    target.scannerProgress = finder.castView(view, 2131296457, "field 'scannerProgress'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.mmLogo = null;
    target.bottomPanel = null;
    target.scannerRecyclerView = null;
    target.bluetoothDevicesView = null;
    target.bluetoothNoDevicesView = null;
    target.scannerStatusReport = null;
    target.scannerProgress = null;
  }
}
