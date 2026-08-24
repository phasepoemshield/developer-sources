package jnr.a64asm;

// $VF: Compiled from ERROR_CODE.java
public enum ERROR_CODE {
   ERROR_ILLEGAL_SHORT_JUMP,
   ERROR_ILLEGAL_INSTRUCTION,
   ERROR_NO_HEAP_MEMORY,
   _ERROR_COUNT,
   ERROR_NONE,
   ERROR_ILLEGAL_ADDRESING,
   ERROR_UNKNOWN_INSTRUCTION,
   ERROR_NO_VIRTUAL_MEMORY;

   public final int intValue() {
      return this.ordinal();
   }
}
