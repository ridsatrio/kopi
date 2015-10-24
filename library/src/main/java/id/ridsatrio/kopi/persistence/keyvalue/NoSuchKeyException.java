package id.ridsatrio.kopi.persistence.keyvalue;

/**
 * An exception indicating that there's no value exists on a store with
 * a given key.
 * <p>
 * Created by Ridho Hadi Satrio on 10/23/15.
 */
public class NoSuchKeyException extends Exception {

  public NoSuchKeyException() {
  }

  public NoSuchKeyException(String detailMessage) {
    super(detailMessage);
  }

  public NoSuchKeyException(String detailMessage, Throwable throwable) {
    super(detailMessage, throwable);
  }

  public NoSuchKeyException(Throwable throwable) {
    super(throwable);
  }
}
