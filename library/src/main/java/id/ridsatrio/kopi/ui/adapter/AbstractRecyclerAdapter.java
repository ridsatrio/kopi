package id.ridsatrio.kopi.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract to classes that would render a list of data by binding it
 * into a specified view.
 * <p/>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public abstract class AbstractRecyclerAdapter<T>
    extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

  protected Context context;
  private List<T> itemList = new ArrayList<>();

  public AbstractRecyclerAdapter(Context context) {
    this.context = context;
  }

  public AbstractRecyclerAdapter(Context context, List<T> itemList) {
    this.context = context;
    this.itemList = itemList;
  }

  protected List<T> getItemList() {
    return itemList;
  }

  public void setItemList(List<T> data) {
    this.itemList = data;
    notifyDataSetChanged();
  }

  public T getItem(int position) {
    return itemList.get(position);
  }

  protected Context getContext() {
    return context;
  }

  @Override
  public int getItemCount() {
    return itemList.size();
  }
}