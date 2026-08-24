package com.kenai.jnr.x86asm;

// $VF: Compiled from X87Register.java
@Deprecated
public final class X87Register extends BaseReg {
   static final X87Register[] cache = new X87Register[16];

   private X87Register(int size, int code) {
      super(code, size);
   }

   public static final X87Register x87(int idx) {
      if (idx >= 0 && idx < cache.length) {
         return cache[idx];
      } else {
         throw new IllegalArgumentException("invalid x87 register");
      }
   }

   public static final X87Register st(int idx) {
      return x87(idx);
   }

   static {
      for (int i = 0; i < cache.length; i++) {
         cache[i] = new X87Register(80 | i, 10);
      }
   }
}
