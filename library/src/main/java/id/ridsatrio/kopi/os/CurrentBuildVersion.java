package id.ridsatrio.kopi.os;

import android.os.Build;

/**
 * Static helper class for dealing with user's OS version.
 * <p/>
 * Created by Ridho Hadi Satrio on 10/22/15.
 */
public final class CurrentBuildVersion {

  public static boolean isMarshmallowOrHigher() {
    return isSameOrHigher(Build.VERSION_CODES.M);
  }

  public static boolean isLollipopOrHigher() {
    return isSameOrHigher(Build.VERSION_CODES.LOLLIPOP);
  }

  public static boolean isKitKatOrHigher() {
    return isSameOrHigher(Build.VERSION_CODES.KITKAT);
  }

  public static boolean isJellyBeanOrHigher() {
    return isSameOrHigher(Build.VERSION_CODES.JELLY_BEAN);
  }

  public static boolean isIceCreamSandwichOrHigher() {
    return isSameOrHigher(Build.VERSION_CODES.ICE_CREAM_SANDWICH);
  }

  public static boolean isSameOrHigher(int versionCode) {
    return Build.VERSION.SDK_INT >= versionCode;
  }

  private CurrentBuildVersion() {
  }
}
