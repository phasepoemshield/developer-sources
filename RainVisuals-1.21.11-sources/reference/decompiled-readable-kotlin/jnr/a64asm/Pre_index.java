package jnr.a64asm;

// $VF: Compiled from Pre_index.java
public final class Pre_index extends Operand {
   private final Immediate preIndex;
   private final Register basereg;

   public final Register getRegister() {
      return this.basereg;
   }

   public final Immediate getPreIndex() {
      return this.preIndex;
   }

   public Pre_index(Register preIndex, Immediate base) {
      super(12, 0);
      this.basereg = base;
      this.preIndex = preIndex;
   }
}
