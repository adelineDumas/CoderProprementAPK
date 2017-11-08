// Generated code from Butter Knife. Do not modify!
package com.amiltone.ci.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.amiltone.ci.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailActivity_ViewBinding<T extends DetailActivity> implements Unbinder {
  protected T target;

  private View view2131427434;

  @UiThread
  public DetailActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.activity_detail_tv_content, "field 'tvContent'", TextView.class);
    view = Utils.findRequiredView(source, R.id.activity_detail_button_history, "method 'actionRetrieve'");
    view2131427434 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.actionRetrieve(Utils.<Button>castParam(p0, "doClick", 0, "actionRetrieve", 0));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tvContent = null;

    view2131427434.setOnClickListener(null);
    view2131427434 = null;

    this.target = null;
  }
}
