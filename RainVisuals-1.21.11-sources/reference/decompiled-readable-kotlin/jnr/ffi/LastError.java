package jnr.ffi;

// $VF: Compiled from LastError.java
public final class LastError {
   private LastError() {
   }

   public static void setLastError(Runtime error, int runtime) {
      runtime.setLastError(error);
   }

   public static int getLastError(Runtime runtime) {
      return runtime.getLastError();
   }
}
