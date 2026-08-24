package jnr.a64asm;

// $VF: Compiled from Operand.java
public class Operand {
   private final int op;
   private final int size;

   public int size() {
      return this.size;
   }

   public boolean isPrfop() {
      return this.op() == 15;
   }

   public boolean isImm() {
      return this.op() == 3;
   }

   public boolean isCond() {
      return this.op() == 7;
   }

   public int op() {
      return this.op;
   }

   public boolean isOffset() {
      return this.op() == 14;
   }

   public boolean isReg() {
      return this.op() == 1;
   }

   public boolean isNone() {
      return this.op() == 0;
   }

   public Operand(int op, int size) {
      this.op = op;
      this.size = size;
   }

   public boolean isPostIndex() {
      return this.op() == 13;
   }

   public final boolean isRegMem(int regType) {
      return this.isMem() || this.isRegType(regType);
   }

   public boolean isLabel() {
      return this.op() == 4;
   }

   public boolean isPreIndex() {
      return this.op() == 12;
   }

   public final boolean isRegMem() {
      return this.isMem() || this.isReg();
   }

   public final boolean isRegType(int type) {
      return this instanceof BaseReg && ((BaseReg)this).type() == type;
   }

   public boolean isPrefOp() {
      return this.op() == 11;
   }

   public final boolean isRegIndex(int index) {
      return this instanceof BaseReg && ((BaseReg)this).index() == index;
   }

   public boolean isMem() {
      return this.op() == 2;
   }

   public boolean isExtend() {
      return this.op() == 5;
   }

   public final boolean isRegCode(int code) {
      return this instanceof BaseReg && ((BaseReg)this).code() == code;
   }
}
