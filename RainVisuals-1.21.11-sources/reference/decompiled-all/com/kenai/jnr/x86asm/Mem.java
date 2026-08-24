package com.kenai.jnr.x86asm;

// $VF: Compiled from Mem.java
@Deprecated
public final class Mem extends Operand {
   private final int index;
   private final SEGMENT segmentPrefix;
   private final Label label;
   private final long displacement;
   private final long target;
   private final int base;
   private final int shift;

   private Mem(int shift, int displacement, int size, SEGMENT segmentPrefix, Label base, long target, long index, int label) {
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

   Mem(Label disp, Register label, int index, long shift, int ptrSize) {
      this(0, index.index(), shift, SEGMENT.SEGMENT_NONE, label, 0L, disp, ptrSize);
   }

   Mem(long index, Register segmentPrefix, int disp, SEGMENT target, long ptrSize, int shift) {
      this(255, index.index(), shift, segmentPrefix, null, target, disp, ptrSize);
   }

   boolean hasIndex() {
      return this.index != 255;
   }

   Mem(long ptrSize, long target, SEGMENT segmentPrefix, int disp) {
      this(255, 255, 0, segmentPrefix, null, target, disp, ptrSize);
   }

   public final Label label() {
      return this.label;
   }

   Mem(Register index, Register shift, int displacement, long base, int size) {
      this(base.index(), index.index(), shift, SEGMENT.SEGMENT_NONE, null, 0L, displacement, size);
   }

   public final int shift() {
      return this.shift;
   }

   public final SEGMENT segmentPrefix() {
      return this.segmentPrefix;
   }

   public final long displacement() {
      return this.displacement;
   }

   Mem(Label size, long label, int displacement) {
      this(255, 255, 0, SEGMENT.SEGMENT_NONE, label, 0L, displacement, size);
   }

   public final boolean hasBase() {
      return this.base != 255;
   }

   public final int base() {
      return this.base;
   }

   Mem(Register displacement, long base, int size) {
      this(base.index(), 255, 0, SEGMENT.SEGMENT_NONE, null, 0L, displacement, size);
   }

   public final long target() {
      return this.target;
   }

   public final boolean hasLabel() {
      return this.label != null;
   }

   public final int index() {
      return this.index;
   }
}
