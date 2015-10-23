package id.ridsatrio.kopi.ui.activity;

import android.support.annotation.NonNull;

import id.ridsatrio.kopi.security.Permissions;

/**
 * Convenient base for building activities that might require run-time
 * permission handling.
 * <p>
 * All you'd need to do is to call relevant helper method from
 * {@link Permissions} to request the permission you need somewhere
 * within this activity's lifecycle and override the relevant callback
 * method(s).
 * <p>
 * <b>Use with caution!</b> As the run-time permission system is
 * currently in its earliest of stages and are subjected to change in
 * future releases, so does this class.
 * <p/>
 * Created by Ridho Hadi Satrio on 10/23/15.
 */
public abstract class PermissionActivity extends AbstractActivity {

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    switch (requestCode) {
      case Permissions.REQUEST_CODE_READ_CALENDAR:
        if (Permissions.isGranted(grantResults)) {
          onCalendarPermissionGranted();
        } else {
          onCalendarPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_WRITE_CALENDAR:
        if (Permissions.isGranted(grantResults)) {
          onCalendarPermissionGranted();
        } else {
          onCalendarPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_CAMERA:
        if (Permissions.isGranted(grantResults)) {
          onCameraPermissionGranted();
        } else {
          onCameraPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_READ_CONTACTS:
        if (Permissions.isGranted(grantResults)) {
          onContactsPermissionGranted();
        } else {
          onContactsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_WRITE_CONTACTS:
        if (Permissions.isGranted(grantResults)) {
          onContactsPermissionGranted();
        } else {
          onContactsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_ACCOUNT:
        if (Permissions.isGranted(grantResults)) {
          onContactsPermissionGranted();
        } else {
          onContactsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_MICROPHONE:
        if (Permissions.isGranted(grantResults)) {
          onMicrophonePermissionGranted();
        } else {
          onMicrophonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_COARSE_LOCATION:
        if (Permissions.isGranted(grantResults)) {
          onLocationPermissionGranted();
        } else {
          onLocationPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_FINE_LOCATION:
        if (Permissions.isGranted(grantResults)) {
          onLocationPermissionGranted();
        } else {
          onLocationPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_READ_PHONE_STATE:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_CALL_PHONE:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_READ_CALL_LOG:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_WRITE_CALL_LOG:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_ADD_VOICEMAIL:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_USE_SIP:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_PROCESS_OUTGOING_CALL:
        if (Permissions.isGranted(grantResults)) {
          onPhonePermissionGranted();
        } else {
          onPhonePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_SEND_SMS:
        if (Permissions.isGranted(grantResults)) {
          onSmsPermissionGranted();
        } else {
          onSmsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_RECEIVE_SMS:
        if (Permissions.isGranted(grantResults)) {
          onSmsPermissionGranted();
        } else {
          onSmsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_READ_SMS:
        if (Permissions.isGranted(grantResults)) {
          onSmsPermissionGranted();
        } else {
          onSmsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_RECEIVE_WAP_PUSH:
        if (Permissions.isGranted(grantResults)) {
          onSmsPermissionGranted();
        } else {
          onSmsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_RECEIVE_MMS:
        if (Permissions.isGranted(grantResults)) {
          onSmsPermissionGranted();
        } else {
          onSmsPermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_READ_STORAGE:
        if (Permissions.isGranted(grantResults)) {
          onStoragePermissionGranted();
        } else {
          onStoragePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_WRITE_STORAGE:
        if (Permissions.isGranted(grantResults)) {
          onStoragePermissionGranted();
        } else {
          onStoragePermissionDeclined();
        }
        break;
      case Permissions.REQUEST_CODE_SENSORS:
        if (Permissions.isGranted(grantResults)) {
          onSensorsPermissionGranted();
        } else {
          onSensorsPermissionDeclined();
        }
        break;
    }
  }

  protected void onCalendarPermissionGranted() {

  }

  protected void onCalendarPermissionDeclined() {

  }

  protected void onCameraPermissionGranted() {

  }

  protected void onCameraPermissionDeclined() {

  }

  protected void onContactsPermissionGranted() {

  }

  protected void onContactsPermissionDeclined() {

  }

  protected void onMicrophonePermissionGranted() {

  }

  protected void onMicrophonePermissionDeclined() {

  }

  protected void onLocationPermissionGranted() {

  }

  protected void onLocationPermissionDeclined() {

  }

  protected void onPhonePermissionGranted() {

  }

  protected void onPhonePermissionDeclined() {

  }

  protected void onSmsPermissionGranted() {

  }

  protected void onSmsPermissionDeclined() {

  }

  protected void onStoragePermissionGranted() {

  }

  protected void onStoragePermissionDeclined() {

  }

  protected void onSensorsPermissionGranted() {

  }

  protected void onSensorsPermissionDeclined() {

  }
}
