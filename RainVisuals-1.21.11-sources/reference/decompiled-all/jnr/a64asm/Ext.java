package jnr.a64asm;

// $VF: Compiled from Ext.java
public final class Ext extends Operand {
   private final long type;
   private final long value;

   public Ext(long type, long value) {
      super(5, 0);
      this.value = value;
      this.type = type;
   }

   public long value() {
      return this.value;
   }

   public long type() {
      return this.type;
   }
}
