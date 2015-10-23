package id.ridsatrio.kopi.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import butterknife.ButterKnife;
import id.ridsatrio.kopi.R;

/**
 * A base for building activities with navigation drawer.
 * <p>
 * This class will handle view initialisations for you; all you'd need
 * to do is to supply your layout's and menu's resource ID, and annotate
 * your view widgets with the standard ButterKnife annotations. (Yep,
 * this class uses ButterKnife to further minimise boilerplate codes.)
 * <p>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public abstract class AbstractNavigationDrawerActivity extends AppCompatActivity {

  private DrawerLayout drawerLayout;
  private Toolbar toolbar;
  private FrameLayout contentLayout;
  private NavigationView navigationView;

  private ActionBarDrawerToggle actionBarDrawerToggle =
      new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer,
          R.string.closeDrawer) {

        @Override
        public void onDrawerClosed(View drawerView) {
          AbstractNavigationDrawerActivity.this.onDrawerClosed();

          super.onDrawerClosed(drawerView);
        }

        @Override
        public void onDrawerOpened(View drawerView) {
          AbstractNavigationDrawerActivity.this.onDrawerOpened();

          super.onDrawerOpened(drawerView);
        }
      };

  /**
   * Called when the navigation drawer is on its way to be closed. The usual implementation would
   * be for updating options menu to correctly reflect the change.
   */
  protected void onDrawerClosed() {
    // Intentionally left blank for sub-classes to override.
  }

  /**
   * Called when the navigation drawer is on its way to be opened. The usual implementation would
   * be for updating options menu to correctly reflect the change.
   */
  protected void onDrawerOpened() {
    // Intentionally left blank for sub-classes to override.
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    onWindowCreate();

    super.onCreate(savedInstanceState);

    setContentView(R.layout.navigation_drawer_activity);
    initView();

    setupNavigationDrawer();

    contentLayout.addView(LayoutInflater.from(this).inflate(getContentLayoutResId(), null));

    ButterKnife.bind(this);
  }

  /**
   * Called just before {@code setContentView(int)} gets called. Use this to request Window
   * features as they will not available after {@code setContentView(int)}.
   */
  protected void onWindowCreate() {
  }

  @LayoutRes
  protected abstract int getContentLayoutResId();

  private void initView() {
    drawerLayout = (DrawerLayout) findViewById(R.id.navigationDrawer_activity_drawerLayout);
    toolbar = (Toolbar) findViewById(R.id.navigationDrawer_activity_toolbar);
    contentLayout = (FrameLayout) findViewById(R.id.navigationDrawer_activity_contentLayout);
    navigationView = (NavigationView) findViewById(R.id.navigationDrawer_activity_navigationView);
  }

  private void setupNavigationDrawer() {
    drawerLayout.setDrawerListener(actionBarDrawerToggle);
    actionBarDrawerToggle.syncState();

    int headerResId = getNavigationHeaderResId();

    if (headerResId != 0) {
      navigationView.inflateHeaderView(headerResId);
    }

    navigationView.inflateMenu(getNavigationMenuResId());

    navigationView.setNavigationItemSelectedListener((MenuItem menuItem) -> {
      onNavigationItemSelected(menuItem);
      menuItem.setChecked(true);
      drawerLayout.closeDrawers();
      return true;
    });
  }

  @LayoutRes
  protected abstract int getNavigationHeaderResId();

  @MenuRes
  protected abstract int getNavigationMenuResId();

  protected void onNavigationItemSelected(MenuItem menuItem) {
    // Intentionally left blank for sub-classes to override.
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(getOptionsMenuResId(), menu);

    return super.onCreateOptionsMenu(menu);
  }

  @MenuRes
  protected abstract int getOptionsMenuResId();

  public Toolbar getToolbar() {
    return toolbar;
  }
}
