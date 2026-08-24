package jnr.a64asm;

// $VF: Compiled from EXTEND_ENUM.java
public enum EXTEND_ENUM {
   UXTH,
   SXTB,
   SXTW,
   SXTX,
   UXTB,
   UXTW,
   LSL,
   UXTX,
   SXTH;

   public final int intValue() {
      return this.ordinal();
   }
}
