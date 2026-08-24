package jnr.a64asm;

// $VF: Compiled from Shift.java
public final class Shift extends Operand {
   private final int value;
   private final int type;

   public Shift(int type, int value) {
      super(6, 0);
      this.value = value;
      this.type = type;
   }

   public long type() {
      return this.type;
   }

   public long value() {
      return this.value;
   }
}
