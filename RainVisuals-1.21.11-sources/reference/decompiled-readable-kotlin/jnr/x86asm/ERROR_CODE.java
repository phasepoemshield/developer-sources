package jnr.x86asm;

// $VF: Compiled from ERROR_CODE.java
public enum ERROR_CODE {
   ERROR_NONE,
   ERROR_NO_HEAP_MEMORY,
   ERROR_NO_VIRTUAL_MEMORY,
   ERROR_ILLEGAL_ADDRESING,
   _ERROR_COUNT,
   ERROR_ILLEGAL_SHORT_JUMP,
   ERROR_UNKNOWN_INSTRUCTION,
   ERROR_ILLEGAL_INSTRUCTION;

   public final int intValue() {
      return this.ordinal();
   }
}
