package jnr.a64asm;

// $VF: Compiled from Conditions.java
public final class Conditions extends Operand {
   private final int value;

   public long value() {
      return this.value;
   }

   public Conditions(int value) {
      super(7, 0);
      this.value = value;
   }
}
