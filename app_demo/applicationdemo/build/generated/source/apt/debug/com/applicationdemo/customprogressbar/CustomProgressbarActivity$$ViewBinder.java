// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.customprogressbar;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CustomProgressbarActivity$$ViewBinder<T extends com.applicationdemo.customprogressbar.CustomProgressbarActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558505, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131558505, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131558506, "field 'roundrogressBar'");
    target.roundrogressBar = finder.castView(view, 2131558506, "field 'roundrogressBar'");
  }

  @Override public void unbind(T target) {
    target.progressBar = null;
    target.roundrogressBar = null;
  }
}
