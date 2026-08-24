package com.kenai.jffi;

// $VF: Compiled from Internals.java
public final class Internals {
   private Internals() {
   }

   public static final long getErrnoSaveFunction() {
      return Foreign.getInstance().getSaveErrnoFunction();
   }
}
