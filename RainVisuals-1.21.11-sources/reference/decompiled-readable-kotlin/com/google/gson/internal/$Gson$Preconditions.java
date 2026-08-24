package com.google.gson.internal;

// $VF: Compiled from $Gson$Preconditions.java
public final class $Gson$Preconditions {
   private $Gson$Preconditions() {
      throw new UnsupportedOperationException();
   }

   public static void checkArgument(boolean condition) {
      if (!condition) {
         throw new IllegalArgumentException();
      }
   }

   @Deprecated
   public static <T> T checkNotNull(T obj) {
      if (obj == null) {
         throw new NullPointerException();
      } else {
         return obj;
      }
   }
}
