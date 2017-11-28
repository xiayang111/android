// Generated code from Butter Knife. Do not modify!
package com.applicationdemo.design;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DesignActivity$$ViewBinder<T extends com.applicationdemo.design.DesignActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558511, "field 'viewpager'");
    target.viewpager = finder.castView(view, 2131558511, "field 'viewpager'");
    view = finder.findRequiredView(source, 2131558510, "field 'tabLayout'");
    target.tabLayout = finder.castView(view, 2131558510, "field 'tabLayout'");
    view = finder.findRequiredView(source, 2131558507, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558507, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558509, "field 'drawerLayout'");
    target.drawerLayout = finder.castView(view, 2131558509, "field 'drawerLayout'");
    view = finder.findRequiredView(source, 2131558512, "field 'navigationView'");
    target.navigationView = finder.castView(view, 2131558512, "field 'navigationView'");
    view = finder.findRequiredView(source, 2131558508, "field 'imaBtn'");
    target.imaBtn = finder.castView(view, 2131558508, "field 'imaBtn'");
    view = finder.findRequiredView(source, 2131558467, "field 'title'");
    target.title = finder.castView(view, 2131558467, "field 'title'");
  }

  @Override public void unbind(T target) {
    target.viewpager = null;
    target.tabLayout = null;
    target.toolbar = null;
    target.drawerLayout = null;
    target.navigationView = null;
    target.imaBtn = null;
    target.title = null;
  }
}
