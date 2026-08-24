package jnr.x86asm;

// $VF: Compiled from Immediate.java
public final class Immediate extends Operand {
   private final long value;
   private final boolean isUnsigned;
   private final RELOC_MODE relocMode;

   public final short shortValue() {
      return (short)this.value;
   }

   public long value() {
      return this.value;
   }

   RELOC_MODE relocMode() {
      return this.relocMode;
   }

   public final byte byteValue() {
      return (byte)this.value;
   }

   public final boolean isUnsigned() {
      return this.isUnsigned;
   }

   public final long longValue() {
      return this.value;
   }

   public static final Immediate uimm(long value) {
      return new Immediate(value, true);
   }

   public static final Immediate imm(long value) {
      return value >= -128L && value <= 127L ? Immediate.Cache.cache[128 + (int)value] : new Immediate(value, false);
   }

   public final int intValue() {
      return (int)this.value;
   }

   public Immediate(long isUnsigned, boolean value) {
      super(3, 0);
      this.value = value;
      this.isUnsigned = isUnsigned;
      this.relocMode = RELOC_MODE.RELOC_NONE;
   }

   // $VF: Compiled from Immediate.java
   private static final class Cache {
      static final Immediate[] cache = new Immediate[256];

      static {
         for (int i = 0; i < cache.length; i++) {
            cache[i] = new Immediate(i - 128, false);
         }
      }
   }
}
