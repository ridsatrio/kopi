package id.ridsatrio.kopi.persistence.keyvalue;

/**
 * Represents a persistence store where each value is mapped through a
 * String key.
 * <p/>
 * Created by Ridho Hadi Satrio on 9/25/15.
 */
public interface KeyValueStore {

  void putString(String key, String val);

  String getString(String key, String defVal);

  String getStringOrThrow(String key) throws NoSuchKeyException;

  void putInt(String key, int val);

  int getInt(String key, int defVal);

  int getIntOrThrow(String key) throws NoSuchKeyException;

  void putBoolean(String key, boolean val);

  boolean getBoolean(String key, boolean defVal);

  boolean getBooleanOrThrow(String key) throws NoSuchKeyException;

  void putFloat(String key, float val);

  float getFloat(String key, float defVal);

  float getFloatOrThrow(String key) throws NoSuchKeyException;

  void putLong(String key, long val);

  long getLong(String key, long defVal);

  long getLongOrThrow(String key) throws NoSuchKeyException;

}
