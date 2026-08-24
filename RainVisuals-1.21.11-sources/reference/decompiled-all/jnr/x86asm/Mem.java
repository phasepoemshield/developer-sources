package jnr.x86asm;

// $VF: Compiled from Mem.java
public final class Mem extends Operand {
   private final SEGMENT segmentPrefix;
   private final long target;
   private final long displacement;
   private final int base;
   private final Label label;
   private final int shift;
   private final int index;

   Mem(long target, long ptrSize, SEGMENT disp, int segmentPrefix) {
      this(255, 255, 0, segmentPrefix, null, target, disp, ptrSize);
   }

   Mem(Register index, Register shift, int displacement, long size, int base) {
      this(base.index(), index.index(), shift, SEGMENT.SEGMENT_NONE, null, 0L, displacement, size);
   }

   public final int index() {
      return this.index;
   }

   Mem(long segmentPrefix, Register shift, int index, SEGMENT disp, long ptrSize, int target) {
      this(255, index.index(), shift, segmentPrefix, null, target, disp, ptrSize);
   }

   public final int base() {
      return this.base;
   }

   Mem(Label disp, Register ptrSize, int index, long shift, int label) {
      this(0, index.index(), shift, SEGMENT.SEGMENT_NONE, label, 0L, disp, ptrSize);
   }

   public final SEGMENT segmentPrefix() {
      return this.segmentPrefix;
   }

   public final long target() {
      return this.target;
   }

   boolean hasIndex() {
      return this.index != 255;
   }

   public final long displacement() {
      return this.displacement;
   }

   private Mem(int base, int size, int index, SEGMENT label, Label shift, long segmentPrefix, long displacement, int target) {
      super(2, size);
      if (!$assertionsDisabled && shift > 3) {
         throw new AssertionError();
      }

      this.base = base;
      this.index = index;
      this.shift = shift;
      this.segmentPrefix = segmentPrefix;
      this.label = label;
      this.target = target;
      this.displacement = displacement;
   }

   Mem(Register size, long base, int displacement) {
      this(base.index(), 255, 0, SEGMENT.SEGMENT_NONE, null, 0L, displacement, size);
   }

   public final Label label() {
      return this.label;
   }

   public final boolean hasBase() {
      return this.base != 255;
   }

   Mem(Label displacement, long size, int label) {
      this(255, 255, 0, SEGMENT.SEGMENT_NONE, label, 0L, displacement, size);
   }

   public final boolean hasLabel() {
      return this.label != null;
   }

   public final int shift() {
      return this.shift;
   }
}
