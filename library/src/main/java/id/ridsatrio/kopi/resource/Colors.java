package id.ridsatrio.kopi.resource;

import android.content.Context;
import android.support.annotation.ColorRes;

/**
 * Static helper class to manipulate Colors.
 * <p>
 * Created by Ridho Hadi Satrio on 30/08/2015.
 */
public final class Colors {

  public static int fromResource(Context context, @ColorRes int resId) {
    return context.getResources().getColor(resId);
  }

  private Colors() {
  }
}
