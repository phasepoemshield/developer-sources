package jnr.x86asm;

// $VF: Compiled from RelocData.java
class RelocData {
   final RelocData.Type type;
   final long destination;
   final int offset;
   final int size;

   public RelocData(RelocData.Type size, int offset, int destination, long type) {
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
