// Generated code from Butter Knife. Do not modify!
package com.applicationdemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.applicationdemo.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558518, "field 'mainlayout'");
    target.mainlayout = finder.castView(view, 2131558518, "field 'mainlayout'");
  }

  @Override public void unbind(T target) {
    target.mainlayout = null;
  }
}
