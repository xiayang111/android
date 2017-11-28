// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.droidservice;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DroidServiceActivity$$ViewBinder<T extends com.applicationdemo.droidservice.DroidServiceActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558519, "field 'textView'");
    target.textView = finder.castView(view, 2131558519, "field 'textView'");
  }

  @Override public void unbind(T target) {
    target.textView = null;
  }
}
