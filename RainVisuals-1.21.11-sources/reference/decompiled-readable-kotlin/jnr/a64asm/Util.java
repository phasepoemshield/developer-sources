package jnr.a64asm;

// $VF: Compiled from Util.java
public final class Util {
   static final boolean isInt16(long x) {
      return x >= -32768L && x <= 32767L;
   }

   static final boolean isUInt32(long x) {
      return x >= 0L && x <= 4294967295L;
   }

   static final boolean isUInt16(long x) {
      return x >= 0L && x <= 65535L;
   }

   static final boolean isInt32(long x) {
      return x >= -2147483648L && x <= 2147483647L;
   }

   private Util() {
   }

   static final boolean isInt8(long x) {
      return x >= -128L && x <= 127L;
   }

   static final boolean isUInt8(long x) {
      return x >= 0L && x <= 255L;
   }
}
