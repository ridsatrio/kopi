package id.ridsatrio.kopi.resource;

import android.content.Context;
import android.support.annotation.StringRes;

/**
 * Static helper class to manipulate Strings.
 * <p/>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public final class Strings {

  public static String nullToEmpty(String string) {
    return (string == null) ? "" : string;
  }

  public static String emptyToNull(String string) {
    return isNullOrEmpty(string) ? null : string;
  }

  public static boolean isNullOrEmpty(String target) {
    return target == null || "".equals(target);
  }

  public static String fromResource(Context context, @StringRes int resId) {
    return context.getResources().getString(resId);
  }

  private Strings() {
  }
}
