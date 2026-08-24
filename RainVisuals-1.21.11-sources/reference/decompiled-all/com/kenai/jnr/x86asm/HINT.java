package com.kenai.jnr.x86asm;

// $VF: Compiled from HINT.java
@Deprecated
public enum HINT {
   HINT_NONE(0),
   HINT_TAKEN(62),
   HINT_NOT_TAKEN(46);

   private final int value;

   HINT(int value) {
      this.value = value;
   }

   public final int value() {
      return this.value;
   }

   public static final HINT valueOf(int value) {
      switch (value) {
         case 46:
            return HINT_NOT_TAKEN;
         case 62:
            return HINT_TAKEN;
         default:
            return HINT_NONE;
      }
   }
}
