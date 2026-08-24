package com.kenai.jnr.x86asm;

// $VF: Compiled from LinkData.java
@Deprecated
final class LinkData {
   long displacement;
   final int offset;
   int relocId;

   public LinkData(int displacement, long offset, int relocId) {
      this.offset = offset;
      this.displacement = displacement;
      this.relocId = relocId;
   }
}
