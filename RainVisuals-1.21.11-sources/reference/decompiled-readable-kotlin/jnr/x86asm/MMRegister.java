package jnr.x86asm;

// $VF: Compiled from MMRegister.java
public final class MMRegister extends BaseReg {
   static final MMRegister[] cache = new MMRegister[8];

   public static final MMRegister mm(int code) {
      if (code >= 0 && code < cache.length) {
         return cache[code];
      } else {
         throw new IllegalArgumentException("invalid mm register");
      }
   }

   static {
      for (int i = 0; i < cache.length; i++) {
         cache[i] = new MMRegister(96 | i, 8);
      }
   }

   private MMRegister(int code, int size) {
      super(code, size);
   }
}
