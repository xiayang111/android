// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.luckdial;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LuckDialActivity$$ViewBinder<T extends com.applicationdemo.luckdial.LuckDialActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558508, "field 'imageButton'");
    target.imageButton = finder.castView(view, 2131558508, "field 'imageButton'");
    view = finder.findRequiredView(source, 2131558516, "field 'luckDial'");
    target.luckDial = finder.castView(view, 2131558516, "field 'luckDial'");
  }

  @Override public void unbind(T target) {
    target.imageButton = null;
    target.luckDial = null;
  }
}
