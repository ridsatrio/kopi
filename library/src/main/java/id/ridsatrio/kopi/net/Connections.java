package id.ridsatrio.kopi.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Static helper class to deal with network connectivity.
 * <p/>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public final class Connections {

  public static boolean isAvailable(Context context) {
    boolean connected = false;

    ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

    if (cm != null) {
      NetworkInfo networkInfo = cm.getActiveNetworkInfo();

      if (networkInfo != null) {
        connected = networkInfo.isConnected();
      }
    }

    return connected;
  }

  private Connections() {
  }
}
