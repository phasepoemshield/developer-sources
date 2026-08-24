package org.newsclub.net.unix;

// $VF: Compiled from StackTraceUtil.java
public final class StackTraceUtil {
   public static void printStackTraceSevere(Throwable t) {
      t.printStackTrace();
   }

   public static void printStackTrace(Throwable t) {
      t.printStackTrace();
   }

   private StackTraceUtil() {
      throw new IllegalStateException("No instances");
   }
}
