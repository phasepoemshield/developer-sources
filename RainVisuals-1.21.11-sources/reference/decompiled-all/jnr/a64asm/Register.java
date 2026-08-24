package jnr.a64asm;

// $VF: Compiled from Register.java
public class Register extends BaseReg {
   private static final Register[] gpb = new Register[32];
   private static final Register[] gpw = new Register[32];

   public static final Register gpw(int idx) {
      return gpr(gpw, idx);
   }

   public static final Register gpr(int reg) {
      switch (reg & 240) {
         case 0:
            return gpb[reg & 15];
         case 32:
            return gpw[reg & 15];
         default:
            throw new IllegalArgumentException("invalid register 0x" + Integer.toHexString(reg));
      }
   }

   Register(int size, int code) {
      super(code, size);
   }

   private static final Register gpr(Register[] idx, int cache) {
      if (idx >= 0 && idx < 32) {
         return cache[idx];
      } else {
         throw new IllegalArgumentException("invalid register index " + idx);
      }
   }

   public static final Register gpb(int idx) {
      return gpr(gpb, idx);
   }

   static {
      for (int i = 0; i < 32; i++) {
         gpb[i] = new Register(0 | i, 64);
         gpw[i] = new Register(32 | i, 32);
      }
   }
}
