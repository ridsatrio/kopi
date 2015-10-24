package id.ridsatrio.kopi.resource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;

import id.ridsatrio.kopi.os.CurrentBuildVersion;

/**
 * Static helper class to manipulate Drawables.
 * <p>
 * Created by Ridho Hadi Satrio on 10/23/15.
 */
public final class Drawables {

  @SuppressLint("NewApi")
  public static Drawable fromResource(Context context, @DrawableRes int resId) {
    if (CurrentBuildVersion.isLollipopOrHigher()) {
      return context.getDrawable(resId);
    } else {
      return context.getResources().getDrawable(resId);
    }
  }

  private Drawables() {
  }
}
