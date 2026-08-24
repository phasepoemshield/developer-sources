package jnr.x86asm;

// $VF: Compiled from Operand.java
public class Operand {
   private final int op;
   private final int size;

   public int size() {
      return this.size;
   }

   public boolean isLabel() {
      return this.op() == 4;
   }

   public final boolean isRegType(int type) {
      return this instanceof BaseReg && ((BaseReg)this).type() == type;
   }

   public boolean isMem() {
      return this.op() == 2;
   }

   public final boolean isRegMem() {
      return this.isMem() || this.isReg();
   }

   public Operand(int size, int op) {
      this.op = op;
      this.size = size;
   }

   public final boolean isRegIndex(int index) {
      return this instanceof BaseReg && ((BaseReg)this).index() == index;
   }

   public boolean isImm() {
      return this.op() == 3;
   }

   public boolean isNone() {
      return this.op() == 0;
   }

   public final boolean isRegMem(int regType) {
      return this.isMem() || this.isRegType(regType);
   }

   public final boolean isRegCode(int code) {
      return this instanceof BaseReg && ((BaseReg)this).code() == code;
   }

   public int op() {
      return this.op;
   }

   public boolean isReg() {
      return this.op() == 1;
   }
}
