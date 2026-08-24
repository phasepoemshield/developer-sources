package jnr.a64asm;

// $VF: Compiled from Offset.java
public final class Offset extends Operand {
   private final Immediate offset;
   private final Register basereg;

   public final Register getRegister() {
      return this.basereg;
   }

   public Offset(Register base, Immediate offset) {
      super(14, 0);
      this.offset = offset;
      this.basereg = base;
   }

   public final Immediate getOffset() {
      return this.offset;
   }
}
