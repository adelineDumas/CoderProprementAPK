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

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131427437;

  private View view2131427440;

  private View view2131427438;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.activity_main_tv_content, "field 'tvContent'", TextView.class);
    view = Utils.findRequiredView(source, R.id.activity_main_button_associate, "method 'actionAssociate'");
    view2131427437 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.actionAssociate(Utils.<Button>castParam(p0, "doClick", 0, "actionAssociate", 0));
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_main_button_detail, "method 'actionDetail'");
    view2131427440 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.actionDetail(Utils.<Button>castParam(p0, "doClick", 0, "actionDetail", 0));
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_main_button_retrieve, "method 'actionRetrieve'");
    view2131427438 = view;
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

    view2131427437.setOnClickListener(null);
    view2131427437 = null;
    view2131427440.setOnClickListener(null);
    view2131427440 = null;
    view2131427438.setOnClickListener(null);
    view2131427438 = null;

    this.target = null;
  }
}
