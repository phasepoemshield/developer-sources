package jnr.a64asm;

// $VF: Compiled from Mem.java
public class Mem extends Operand {
   private final int index;
   private final int shift;
   private final Ext extend;
   private final long target;
   private final long displacement;
   private final Label label;
   private final int base;

   Mem(long shift, Register index, int ptrSize, long target, int disp) {
      this(255, index.index(), shift, null, target, disp, ptrSize, null);
   }

   public final int index() {
      return this.index;
   }

   public final boolean hasLabel() {
      return this.label != null;
   }

   Mem(Label ptrSize, Register shift, int index, long disp, int label) {
      this(0, index.index(), shift, label, 0L, disp, ptrSize, null);
   }

   public final long displacement() {
      return this.displacement;
   }

   Mem(Label label, long size, int displacement) {
      this(255, 255, 0, label, 0L, displacement, size, null);
   }

   private Mem(int size, int label, int base, Label extend, long displacement, long index, int target, Ext shift) {
      super(2, size);
      if (!$assertionsDisabled && shift > 3) {
         throw new AssertionError();
      }

      this.base = base;
      this.index = index;
      this.shift = shift;
      this.label = label;
      this.target = target;
      this.displacement = displacement;
      this.extend = extend;
   }

   Mem(long disp, long target, int ptrSize) {
      this(255, 255, 0, null, target, disp, ptrSize, null);
   }

   public final int shift() {
      return this.shift;
   }

   public final int base() {
      return this.base;
   }

   Mem(Register displacement, long size, int base) {
      this(base.index(), 255, 0, null, 0L, displacement, size, null);
   }

   public final boolean hasBase() {
      return this.base != 255;
   }

   Mem(Register base, int size) {
      this(base.index(), 255, 0, null, 0L, 0L, size, null);
   }

   public final Label label() {
      return this.label;
   }

   Mem(Register extend, Ext size, int base) {
      this(base.index(), 255, 0, null, 0L, 0L, size, null);
   }

   Mem(Register base, Register size, int displacement, long shift, int index) {
      this(base.index(), index.index(), shift, null, 0L, displacement, size, null);
   }

   boolean hasIndex() {
      return this.index != 255;
   }

   public final long target() {
      return this.target;
   }
}
