package id.ridsatrio.kopi.persistence.keyvalue;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.NoSuchElementException;

import id.ridsatrio.kopi.meta.Arguments;

/**
 * Represents a {@link KeyValueStore} that backs itself using
 * Android's {@link SharedPreferences}.
 * <p>
 * Created by Ridho Hadi Satrio on 9/25/15.
 */
public class SharedPreferenceStore implements KeyValueStore {

  private final SharedPreferences store;

  public SharedPreferenceStore(Context context) {
    Arguments.assertNotNull(context, "context");

    this.store = PreferenceManager.getDefaultSharedPreferences(context);
  }

  public SharedPreferenceStore(Context context, String name) {
    Arguments.assertNotNull(context, "context");
    Arguments.assertNotNull(name, "name");

    this.store = context.getSharedPreferences(name, Context.MODE_PRIVATE);
  }

  protected SharedPreferences getStore() {
    return this.store;
  }

  protected SharedPreferences.Editor getEditor() {
    return getStore().edit();
  }

  @Override
  public void putString(String key, String val) {
    getEditor().putString(key, val).apply();
  }

  @Override
  public String getString(String key, String defVal) {
    return getStore().getString(key, defVal);
  }

  @Override
  public String getStringOrThrow(String key) throws NoSuchElementException {
    if (getStore().contains(key)) {
      return getString(key, "");
    } else {
      throw new NoSuchElementException();
    }
  }

  @Override
  public void putInt(String key, int val) {
    getEditor().putInt(key, val).apply();
  }

  @Override
  public int getInt(String key, int defVal) {
    return getStore().getInt(key, defVal);
  }

  @Override
  public int getIntOrThrow(String key) throws NoSuchElementException {
    if (getStore().contains(key)) {
      return getInt(key, 0);
    } else {
      throw new NoSuchElementException();
    }
  }

  @Override
  public void putBoolean(String key, boolean val) {
    getEditor().putBoolean(key, val).apply();
  }

  @Override
  public boolean getBoolean(String key, boolean defVal) {
    return getStore().getBoolean(key, defVal);
  }

  @Override
  public boolean getBooleanOrThrow(String key) throws NoSuchElementException {
    if (getStore().contains(key)) {
      return getBoolean(key, false);
    } else {
      throw new NoSuchElementException();
    }
  }

  @Override
  public void putFloat(String key, float val) {
    getEditor().putFloat(key, val).apply();
  }

  @Override
  public float getFloat(String key, float defVal) {
    return getStore().getFloat(key, defVal);
  }

  @Override
  public float getFloatOrThrow(String key) throws NoSuchElementException {
    if (getStore().contains(key)) {
      return getFloat(key, 0);
    } else {
      throw new NoSuchElementException();
    }
  }

  @Override
  public void putLong(String key, long val) {
    getEditor().putLong(key, val).apply();
  }

  @Override
  public long getLong(String key, long defVal) {
    return getStore().getLong(key, defVal);
  }

  @Override
  public long getLongOrThrow(String key) throws NoSuchElementException {
    if (getStore().contains(key)) {
      return getLong(key, 0l);
    } else {
      throw new NoSuchElementException();
    }
  }
}
