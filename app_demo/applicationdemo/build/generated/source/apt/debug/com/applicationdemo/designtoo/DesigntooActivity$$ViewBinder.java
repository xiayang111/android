// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.designtoo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DesigntooActivity$$ViewBinder<T extends com.applicationdemo.designtoo.DesigntooActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558507, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558507, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558515, "field 'floatingActionButton'");
    target.floatingActionButton = finder.castView(view, 2131558515, "field 'floatingActionButton'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.floatingActionButton = null;
  }
}
