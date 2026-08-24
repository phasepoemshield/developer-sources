package jnr.a64asm;

// $VF: Compiled from RelocData.java
class RelocData {
   final int offset;
   final long destination;
   final int size;
   final RelocData.Type type;

   public RelocData(RelocData.Type type, int destination, int size, long offset) {
      this.type = type;
      this.size = size;
      this.offset = offset;
      this.destination = destination;
   }

   // $VF: Compiled from RelocData.java
   enum Type {
      RELATIVE_TO_ABSOLUTE,
      ABSOLUTE_TO_RELATIVE_TRAMPOLINE,
      ABSOLUTE_TO_ABSOLUTE,
      ABSOLUTE_TO_RELATIVE;
   }
}
