package id.ridsatrio.kopi.security;

import android.Manifest;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

import id.ridsatrio.kopi.os.CurrentBuildVersion;

/**
 * Static helper class to deal with Android 6.0's new Permission system.
 * <p>
 * Created by Ridho Hadi Satrio on 10/22/15.
 */
public final class Permissions {

  public static final int REQUEST_CODE_READ_CALENDAR = 8;
  public static final int REQUEST_CODE_WRITE_CALENDAR = 16;
  public static final int REQUEST_CODE_CAMERA = 24;
  public static final int REQUEST_CODE_READ_CONTACTS = 32;
  public static final int REQUEST_CODE_WRITE_CONTACTS = 40;
  public static final int REQUEST_CODE_ACCOUNT = 48;
  public static final int REQUEST_CODE_MICROPHONE = 56;
  public static final int REQUEST_CODE_COARSE_LOCATION = 64;
  public static final int REQUEST_CODE_FINE_LOCATION = 72;
  public static final int REQUEST_CODE_READ_PHONE_STATE = 80;
  public static final int REQUEST_CODE_CALL_PHONE = 88;
  public static final int REQUEST_CODE_READ_CALL_LOG = 96;
  public static final int REQUEST_CODE_WRITE_CALL_LOG = 104;
  public static final int REQUEST_CODE_ADD_VOICEMAIL = 112;
  public static final int REQUEST_CODE_USE_SIP = 120;
  public static final int REQUEST_CODE_PROCESS_OUTGOING_CALL = 128;
  public static final int REQUEST_CODE_SEND_SMS = 136;
  public static final int REQUEST_CODE_RECEIVE_SMS = 148;
  public static final int REQUEST_CODE_READ_SMS = 156;
  public static final int REQUEST_CODE_RECEIVE_WAP_PUSH = 164;
  public static final int REQUEST_CODE_RECEIVE_MMS = 172;
  public static final int REQUEST_CODE_READ_STORAGE = 180;
  public static final int REQUEST_CODE_WRITE_STORAGE = 188;
  public static final int REQUEST_CODE_SENSORS = 196;

  public static void requestReadCalendar(Activity activity) {
    request(activity, Manifest.permission.READ_CALENDAR, REQUEST_CODE_READ_CALENDAR);
  }

  public static void requestWriteCalendar(Activity activity) {
    request(activity, Manifest.permission.WRITE_CALENDAR, REQUEST_CODE_WRITE_CALENDAR);
  }

  public static void requestCamera(Activity activity) {
    request(activity, Manifest.permission.CAMERA, REQUEST_CODE_CAMERA);
  }

  public static void requestReadContacts(Activity activity) {
    request(activity, Manifest.permission.READ_CONTACTS, REQUEST_CODE_READ_CONTACTS);
  }

  public static void requestWriteContacts(Activity activity) {
    request(activity, Manifest.permission.WRITE_CONTACTS, REQUEST_CODE_WRITE_CONTACTS);
  }

  public static void requestAccount(Activity activity) {
    request(activity, Manifest.permission.GET_ACCOUNTS, REQUEST_CODE_ACCOUNT);
  }

  public static void requestMicrophone(Activity activity) {
    request(activity, Manifest.permission.RECORD_AUDIO, REQUEST_CODE_MICROPHONE);
  }

  public static void requestCoarseLocation(Activity activity) {
    request(activity, Manifest.permission.ACCESS_COARSE_LOCATION, REQUEST_CODE_COARSE_LOCATION);
  }

  public static void requestFineLocation(Activity activity) {
    request(activity, Manifest.permission.ACCESS_FINE_LOCATION, REQUEST_CODE_FINE_LOCATION);
  }

  public static void requestReadPhoneState(Activity activity) {
    request(activity, Manifest.permission.READ_PHONE_STATE, REQUEST_CODE_READ_PHONE_STATE);
  }

  public static void requestCallPhone(Activity activity) {
    request(activity, Manifest.permission.CALL_PHONE, REQUEST_CODE_CALL_PHONE);
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
  public static void requestReadCallLog(Activity activity) {
    request(activity, Manifest.permission.READ_CALL_LOG, REQUEST_CODE_READ_CALL_LOG);
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
  public static void requestWriteCallLog(Activity activity) {
    request(activity, Manifest.permission.WRITE_CALL_LOG, REQUEST_CODE_WRITE_CALL_LOG);
  }

  public static void requestAddVoicemail(Activity activity) {
    request(activity, Manifest.permission.ADD_VOICEMAIL, REQUEST_CODE_ADD_VOICEMAIL);
  }

  public static void requestUseSip(Activity activity) {
    request(activity, Manifest.permission.USE_SIP, REQUEST_CODE_USE_SIP);
  }

  public static void requestProcessOutgoingCall(Activity activity) {
    request(activity, Manifest.permission.PROCESS_OUTGOING_CALLS, REQUEST_CODE_PROCESS_OUTGOING_CALL);
  }

  public static void requestSendSms(Activity activity) {
    request(activity, Manifest.permission.SEND_SMS, REQUEST_CODE_SEND_SMS);
  }

  public static void requestReceiveSms(Activity activity) {
    request(activity, Manifest.permission.RECEIVE_SMS, REQUEST_CODE_RECEIVE_SMS);
  }

  public static void requestReadSms(Activity activity) {
    request(activity, Manifest.permission.READ_SMS, REQUEST_CODE_READ_SMS);
  }

  public static void requestReceiveWapPush(Activity activity) {
    request(activity, Manifest.permission.RECEIVE_WAP_PUSH, REQUEST_CODE_RECEIVE_WAP_PUSH);
  }

  public static void requestReceiveMms(Activity activity) {
    request(activity, Manifest.permission.RECEIVE_MMS, REQUEST_CODE_RECEIVE_MMS);
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
  public static void requestReadStorage(Activity activity) {
    request(activity, Manifest.permission.READ_EXTERNAL_STORAGE, REQUEST_CODE_READ_STORAGE);
  }

  public static void requestWriteStorage(Activity activity) {
    request(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE, REQUEST_CODE_WRITE_STORAGE);
  }

  @TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
  public static void requestSensors(Activity activity) {
    request(activity, Manifest.permission.BODY_SENSORS, REQUEST_CODE_SENSORS);
  }

  /**
   * Check or requests a given permission.
   *
   * @param activity    The target activity.
   * @param permission  The name of the permission being checked.
   * @param requestCode The code to be used as a callback identifier
   *                    to the originating activity.
   */
  public static void request(Activity activity, String permission, int requestCode) {
    if (!hasBeenGranted(activity, permission)) {
      ActivityCompat.requestPermissions(activity, new String[]{permission}, requestCode);
    }
  }

  /**
   * Checks whether a given permission is already been granted by the
   * user.
   *
   * @param activity   The activity to be checked.
   * @param permission The name of the permission being checked.
   * @return {@code true} if the permission has been granted (or if
   * users is on API 22 or below) or {@code false} otherwise.
   */
  @SuppressLint("NewApi")
  // Old requests already filtered with CurrentBuildVersion
  public static boolean hasBeenGranted(Activity activity, String permission) {
    if (CurrentBuildVersion.isMarshmallowOrHigher()) {
      return activity.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    } else {
      return true; // Lollipop or lower - user has already allowed this when they installed the app
    }
  }

  /**
   * Convenient method for checking the result of a permission request.
   *
   * @param grantResults Result of the request, passed in the method
   *                     {@code onRequestPermissionsResult} which
   *                     automatically called by the system upon request
   *                     resolution.
   * @return {@code true} if the request was permitted, {@code false} otherwise.
   */
  public static boolean isGranted(int[] grantResults) {
    return grantResults.length > 0
        && grantResults[0] == PackageManager.PERMISSION_GRANTED;
  }

  /**
   * Gets whether you should show UI with rationale for requesting a
   * permission. You should do this only if you do not have the
   * permission and the context in which the permission is requested
   * does not clearly communicate to the user what would be the
   * benefit from granting this permission.
   * <p>
   * For example, if you write a camera app, requesting the camera
   * permission would be expected by the user and no rationale for why
   * it is requested is needed. If however, the app needs location for
   * tagging photos then a non-tech savvy user may wonder how location
   * is related to taking photos. In this case you may choose to show
   * UI with rationale of requesting this permission.
   *
   * @param activity   The activity to be checked.
   * @param permission The name of the permission being checked.
   * @return Whether you can show permission rationale UI.
   */
  public static boolean shouldShowExplanation(Activity activity, String permission) {
    if (CurrentBuildVersion.isMarshmallowOrHigher()) {
      return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    } else {
      return false; // Lollipop or lower - user has already allowed this when they installed the app
    }
  }

  private Permissions() {
  }
}
