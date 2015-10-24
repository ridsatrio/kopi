package id.ridsatrio.kopi.ui.adapter;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract to classes that would render a list of data by binding it
 * into a specified view.
 * <p>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public abstract class AbstractAdapter<T> extends BaseAdapter {

  protected Context context;
  private List<T> itemList = new ArrayList<>();

  public AbstractAdapter(Context context) {
    this.context = context;
  }

  public AbstractAdapter(Context context, List<T> itemList) {
    this.context = context;
    this.itemList = itemList;
  }

  protected List<T> getItemList() {
    return itemList;
  }

  public void setItemList(List<T> itemList) {
    this.itemList = itemList;

    notifyDataSetChanged();
  }

  @Override
  public int getCount() {
    return itemList.size();
  }

  @Override
  public T getItem(int position) {
    return itemList.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  protected Context getContext() {
    return context;
  }
}