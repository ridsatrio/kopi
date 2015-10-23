package id.ridsatrio.kopi.sample;

import id.ridsatrio.kopi.ui.activity.AbstractNavigationDrawerActivity;

public class DemoActivity extends AbstractNavigationDrawerActivity {

  @Override protected int getContentLayoutResId() {
    return R.layout.demo_activity;
  }

  @Override protected int getOptionsMenuResId() {
    return R.menu.demo_menu;
  }

  @Override protected int getNavigationHeaderResId() {
    return R.layout.view_group_navigation_drawer_header;
  }

  @Override protected int getNavigationMenuResId() {
    return R.menu.navigation_menu;
  }
}
