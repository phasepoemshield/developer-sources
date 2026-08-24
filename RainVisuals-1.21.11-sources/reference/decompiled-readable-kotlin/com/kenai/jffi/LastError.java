package com.kenai.jffi;

// $VF: Compiled from LastError.java
public final class LastError {
   private final Foreign foreign = Foreign.getInstance();

   private LastError() {
   }

   public static final LastError getInstance() {
      return LastError.SingletonHolder.INSTANCE;
   }

   public final int get() {
      return Foreign.getLastError();
   }

   @Deprecated
   public final int getError() {
      return Foreign.getLastError();
   }

   public final void set(int value) {
      Foreign.setLastError(value);
   }

   // $VF: Compiled from LastError.java
   private static final class SingletonHolder {
      static final LastError INSTANCE = new LastError();
   }
}
