package id.ridsatrio.kopi.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import butterknife.ButterKnife;

/**
 * A base for building activities.
 * <p>
 * This class will handle view initialisations for you; all you'd need
 * to do is to supply your layout's and menu's resource ID, and annotate
 * your view widgets with the standard ButterKnife annotations. (Yep,
 * this class uses ButterKnife to further minimise boilerplate codes.)
 * <p/>
 * Created by Ridho Hadi Satrio on 8/18/15.
 */
public abstract class AbstractActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    onWindowCreate();
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResId());
    ButterKnife.bind(this);
  }

  /**
   * Called just before {@code setContentView(int)} gets called. Use this to request Window
   * features as they will not available after {@code setContentView(int)}.
   */
  protected void onWindowCreate() {
  }

  @LayoutRes
  protected abstract int getLayoutResId();

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(getOptionsMenuResId(), menu);
    return super.onCreateOptionsMenu(menu);
  }

  @MenuRes
  protected abstract int getOptionsMenuResId();
}
