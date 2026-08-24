package jnr.a64asm;

// $VF: Compiled from PrefOp.java
public class PrefOp extends Operand {
   PREF_ENUM type;

   public PREF_ENUM type() {
      return this.type;
   }

   PrefOp(long value, PREF_ENUM type) {
      super(11, 0);
      this.type = value;
   }
}
