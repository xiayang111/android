// Generated code from Butter Knife. Do not modify!
package com.xiayang.myapplication;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.xiayang.myapplication.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492944, "field 'textView'");
    target.textView = finder.castView(view, 2131492944, "field 'textView'");
  }

  @Override public void unbind(T target) {
    target.textView = null;
  }
}
