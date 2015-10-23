package id.ridsatrio.kopi.persistence.db;

import android.database.Cursor;

/**
 * A wrapper that simplifies Cursor for data extraction.
 * <p/>
 * Created by Ridho Hadi Satrio on 22/08/2015.
 */
public class CursorWrapper {

  private final Cursor delegate;

  public CursorWrapper(Cursor delegate) {
    this.delegate = delegate;
  }

  public boolean moveToFirst() {
    return delegate.moveToFirst();
  }

  public boolean moveToLast() {
    return delegate.moveToLast();
  }

  public boolean moveToNext() {
    return delegate.moveToNext();
  }

  public boolean moveToPrevious() {
    return delegate.moveToPrevious();
  }

  public boolean moveToPosition(int position) {
    return delegate.moveToPosition(position);
  }

  public boolean isBeforeFirst() {
    return delegate.isBeforeFirst();
  }

  public boolean isFirst() {
    return delegate.isFirst();
  }

  public boolean isLast() {
    return delegate.isLast();
  }

  public boolean isAfterLast() {
    return delegate.isAfterLast();
  }

  public boolean isClosed() {
    return delegate.isClosed();
  }

  public boolean isNull(int position) {
    return delegate.isNull(position);
  }

  public void close() {
    delegate.close();
  }

  public String getString(String columnName) {
    return delegate.getString(delegate.getColumnIndex(columnName));
  }

  public short getShort(String columnName) {
    return delegate.getShort(delegate.getColumnIndex(columnName));
  }

  public int getInt(String columnName) {
    return delegate.getInt(delegate.getColumnIndex(columnName));
  }

  public long getLong(String columnName) {
    return delegate.getLong(delegate.getColumnIndex(columnName));
  }

  public double getDouble(String columnName) {
    return delegate.getDouble(delegate.getColumnIndex(columnName));
  }

  public float getFloat(String columnName) {
    return delegate.getFloat(delegate.getColumnIndex(columnName));
  }

  public byte[] getBlob(String columnName) {
    return delegate.getBlob(delegate.getColumnIndex(columnName));
  }

  public Cursor getDelegate() {
    return delegate;
  }
}
