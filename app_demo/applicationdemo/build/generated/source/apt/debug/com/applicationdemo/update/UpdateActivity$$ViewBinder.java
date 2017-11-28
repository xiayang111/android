// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.update;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UpdateActivity$$ViewBinder<T extends com.applicationdemo.update.UpdateActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558521, "method 'updateClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.updateClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558522, "method 'forceUpdateClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.forceUpdateClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
