package id.ridsatrio.kopi.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * An abstract to classes that would render a list of data by binding it
 * into a specified view.
 * <p>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public abstract class SimpleViewHolderAdapter<VH extends SimpleViewHolderAdapter.ViewHolder, D>
    extends AbstractAdapter<D> {

  private static final int VIEW_HOLDER_TAG_KEY = 0x01010101;

  public SimpleViewHolderAdapter(final Context context) {
    super(context);
  }

  public SimpleViewHolderAdapter(final Context context, final List<D> itemList) {
    super(context, itemList);
  }

  @Override
  public View getView(final int position, final View recycledView, final ViewGroup parent) {
    VH holder;
    if (recycledView == null) {
      holder = onCreateViewHolder(parent);
      holder.itemView.setTag(holder);
    } else {
      holder = (VH) recycledView.getTag(VIEW_HOLDER_TAG_KEY);
    }

    onBindViewHolder(holder, position);

    return holder.itemView;
  }

  protected abstract VH onCreateViewHolder(final ViewGroup parent);

  protected abstract void onBindViewHolder(final VH holder, final int position);

  public static class ViewHolder {

    public View itemView;

    public ViewHolder(View itemView) {
      if (itemView == null) {
        throw new IllegalArgumentException("itemView may not be null.");
      }
      this.itemView = itemView;
    }
  }
}
