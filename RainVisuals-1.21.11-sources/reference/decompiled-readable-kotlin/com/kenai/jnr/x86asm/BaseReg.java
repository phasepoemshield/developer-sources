package com.kenai.jnr.x86asm;

// $VF: Compiled from BaseReg.java
@Deprecated
public abstract class BaseReg extends Operand {
   public final int code;

   public BaseReg(int code, int size) {
      super(1, size);
      this.code = code;
   }

   public final int code() {
      return this.code;
   }

   public final int type() {
      return this.code() & 240;
   }

   public final int index() {
      return this.code() & 15;
   }
}
