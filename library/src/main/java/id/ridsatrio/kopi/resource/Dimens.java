package id.ridsatrio.kopi.resource;

import android.content.Context;
import android.support.annotation.DimenRes;

/**
 * Static helper class to manipulate Dimens.
 * <p>
 * Created by Ridho Hadi Satrio on 10/23/15.
 */
public final class Dimens {

  public static float fromResource(Context context, @DimenRes int resId) {
    return context.getResources().getDimension(resId);
  }

  private Dimens() {
  }
}
