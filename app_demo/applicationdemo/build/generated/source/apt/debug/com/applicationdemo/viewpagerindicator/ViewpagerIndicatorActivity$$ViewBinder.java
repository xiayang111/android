// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.viewpagerindicator;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ViewpagerIndicatorActivity$$ViewBinder<T extends com.applicationdemo.viewpagerindicator.ViewpagerIndicatorActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558525, "field 'viewPager'");
    target.viewPager = finder.castView(view, 2131558525, "field 'viewPager'");
    view = finder.findRequiredView(source, 2131558524, "field 'vpIndicator'");
    target.vpIndicator = finder.castView(view, 2131558524, "field 'vpIndicator'");
  }

  @Override public void unbind(T target) {
    target.viewPager = null;
    target.vpIndicator = null;
  }
}
