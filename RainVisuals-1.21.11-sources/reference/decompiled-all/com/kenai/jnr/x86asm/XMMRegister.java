package com.kenai.jnr.x86asm;

// $VF: Compiled from XMMRegister.java
@Deprecated
public final class XMMRegister extends BaseReg {
   static final XMMRegister[] cache = new XMMRegister[16];

   public static final XMMRegister xmm(int idx) {
      if (idx >= 0 && idx < cache.length) {
         return cache[idx];
      } else {
         throw new IllegalArgumentException("invalid xmm register");
      }
   }

   private XMMRegister(int code, int size) {
      super(code, size);
   }

   static {
      for (int i = 0; i < cache.length; i++) {
         cache[i] = new XMMRegister(112 | i, 16);
      }
   }
}
