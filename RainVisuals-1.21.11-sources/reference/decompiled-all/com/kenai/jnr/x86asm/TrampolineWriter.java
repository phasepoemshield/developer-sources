package com.kenai.jnr.x86asm;

import java.nio.ByteBuffer;

// $VF: Compiled from TrampolineWriter.java
@Deprecated
final class TrampolineWriter {
   public static final int TRAMPOLINE_ADDR = 8;
   public static final int TRAMPOLINE_JMP = 6;
   public static final int TRAMPOLINE_SIZE = 14;

   static void writeTrampoline(ByteBuffer buf, long target) {
      buf.put((byte)-1);
      buf.put((byte)37);
      buf.putInt(0);
      buf.putLong(target);
   }
}
