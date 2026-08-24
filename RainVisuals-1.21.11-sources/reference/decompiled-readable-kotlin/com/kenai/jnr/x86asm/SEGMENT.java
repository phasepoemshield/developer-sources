package com.kenai.jnr.x86asm;

// $VF: Compiled from SEGMENT.java
@Deprecated
public enum SEGMENT {
   SEGMENT_SS(54),
   SEGMENT_GS(100),
   SEGMENT_FS(100),
   SEGMENT_NONE(0),
   SEGMENT_ES(38),
   SEGMENT_CS(46),
   SEGMENT_DS(62);

   private final int prefix;

   public final int prefix() {
      return this.prefix;
   }

   SEGMENT(int prefix) {
      this.prefix = prefix;
   }
}
