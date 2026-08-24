package com.kenai.jnr.x86asm;

// $VF: Compiled from ERROR_CODE.java
@Deprecated
public enum ERROR_CODE {
   ERROR_ILLEGAL_INSTRUCTION,
   ERROR_NO_HEAP_MEMORY,
   ERROR_ILLEGAL_SHORT_JUMP,
   ERROR_NO_VIRTUAL_MEMORY,
   ERROR_UNKNOWN_INSTRUCTION,
   ERROR_ILLEGAL_ADDRESING,
   _ERROR_COUNT,
   ERROR_NONE;

   public final int intValue() {
      return this.ordinal();
   }
}
