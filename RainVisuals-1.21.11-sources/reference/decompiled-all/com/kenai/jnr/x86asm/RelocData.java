package com.kenai.jnr.x86asm;

// $VF: Compiled from RelocData.java
@Deprecated
class RelocData {
   final int offset;
   final long destination;
   final int size;
   final RelocData.Type type;

   public RelocData(RelocData.Type destination, int type, int offset, long size) {
      this.type = type;
      this.size = size;
      this.offset = offset;
      this.destination = destination;
   }

   // $VF: Compiled from RelocData.java
   enum Type {
      RELATIVE_TO_ABSOLUTE,
      ABSOLUTE_TO_RELATIVE,
      ABSOLUTE_TO_ABSOLUTE,
      ABSOLUTE_TO_RELATIVE_TRAMPOLINE;
   }
}
