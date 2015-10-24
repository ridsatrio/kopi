package id.ridsatrio.kopi.meta;

import java.util.Collection;

/**
 * Static helper class to handle Argument validations.
 * <p>
 * Created by Ridho Hadi Satrio on 10/22/15.
 */
public final class Arguments {

  public static void assertNotNull(Object argument, String name) {
    if (argument == null) {
      throw new IllegalArgumentException("Argument " + name + " may not be null");
    }
  }

  public static void assertNotNullOrEmpty(String argument, String name) {
    if (argument == null || "".equals(argument)) {
      throw new IllegalArgumentException("Argument " + name + " may not be null or empty");
    }
  }

  public static void assertNotNullOrEmpty(Collection argument, String name) {
    if (argument == null || argument.size() < 1) {
      throw new IllegalArgumentException("Argument " + name + " may not be null or empty");
    }
  }

  private Arguments() {
  }
}
