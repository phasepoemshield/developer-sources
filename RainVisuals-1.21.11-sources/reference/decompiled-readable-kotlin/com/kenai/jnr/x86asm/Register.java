package com.kenai.jnr.x86asm;

// $VF: Compiled from Register.java
@Deprecated
public final class Register extends BaseReg {
   private static final Register[] gpw = new Register[16];
   private static final Register[] gpq = new Register[16];
   private static final Register[] gpd = new Register[16];
   private static final Register[] gpb = new Register[16];

   public static final Register gpw(int idx) {
      return gpr(gpw, idx);
   }

   static {
      for (int i = 0; i < 16; i++) {
         gpb[i] = new Register(0 | i, 1);
         gpw[i] = new Register(16 | i, 2);
         gpd[i] = new Register(32 | i, 4);
         gpq[i] = new Register(48 | i, 8);
      }
   }

   Register(int size, int code) {
      super(code, size);
   }

   public static final Register gpb(int idx) {
      return gpr(gpb, idx);
   }

   public static final Register gpq(int idx) {
      return gpr(gpq, idx);
   }

   public static final Register gpd(int idx) {
      return gpr(gpd, idx);
   }

   public static final Register gpr(int reg) {
      switch (reg & 240) {
         case 0:
            return gpb[reg & 15];
         case 16:
            return gpw[reg & 15];
         case 32:
            return gpd[reg & 15];
         case 48:
            return gpq[reg & 15];
         default:
            throw new IllegalArgumentException("invalid register 0x" + Integer.toHexString(reg));
      }
   }

   private static final Register gpr(Register[] idx, int cache) {
      if (idx >= 0 && idx < 16) {
         return cache[idx];
      } else {
         throw new IllegalArgumentException("invalid register index " + idx);
      }
   }
}
