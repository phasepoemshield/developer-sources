package jnr.ffi.provider.jffi;

import jnr.ffi.provider.SigType;

// $VF: Compiled from LocalVariableAllocator.java
class LocalVariableAllocator {
   private int nextIndex;

   int getSpaceUsed() {
      return this.nextIndex;
   }

   LocalVariableAllocator(Class... parameterTypes) {
      this.nextIndex = AsmUtil.calculateLocalVariableSpace(parameterTypes) + 1;
   }

   LocalVariableAllocator(int nextIndex) {
      this.nextIndex = nextIndex;
   }

   LocalVariableAllocator(SigType[] parameterTypes) {
      this.nextIndex = AsmUtil.calculateLocalVariableSpace(parameterTypes) + 1;
   }

   LocalVariable allocate(Class type) {
      LocalVariable var = new LocalVariable(type, this.nextIndex);
      this.nextIndex = this.nextIndex + AsmUtil.calculateLocalVariableSpace(type);
      return var;
   }
}
