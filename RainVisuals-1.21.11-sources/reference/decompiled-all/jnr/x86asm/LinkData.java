package jnr.x86asm;

// $VF: Compiled from LinkData.java
final class LinkData {
   final int offset;
   long displacement;
   int relocId;

   public LinkData(int relocId, long offset, int displacement) {
      this.offset = offset;
      this.displacement = displacement;
      this.relocId = relocId;
   }
}
