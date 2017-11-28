// Generated code from Butter Knife. Do not modify!
package com.xiayang.myapplication;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.xiayang.myapplication.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492972, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131492972, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131492971, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131492971, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131492969, "method 'onClickKeai'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickKeai(finder.<android.widget.Button>castParam(p0, "doClick", 0, "onClickKeai", 0));
        }
      });
    view = finder.findRequiredView(source, 2131492970, "method 'onClickZhuangbi'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickZhuangbi(finder.<android.widget.Button>castParam(p0, "doClick", 0, "onClickZhuangbi", 0));
        }
      });
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
    target.swipeRefreshLayout = null;
  }
}
