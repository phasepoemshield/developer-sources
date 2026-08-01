package ru.metaculture.protection;

public final class O00000000OO0O {
   public static final int O00000000 = 4097;
   public static final int O000000000 = 4098;
   public static final int O0000000000 = 8193;
   public static final int O00000000000 = 12289;
   public static final int O000000000000 = 16385;
   public static final int O0000000000000 = 20481;
   public static final int O000000000000O = 24577;

   private O00000000OO0O() {
   }

   public static String O00000000(int i) {
      return switch (i) {
         case 4097 -> "GL_ERROR";
         case 4098 -> "GL_STATE_LEAK";
         case 8193 -> "PHASE_ORDER";
         case 12289 -> "MATRIX_INVALID";
         case 16385 -> "SNAPSHOT_FAILURE";
         case 20481 -> "MANUAL_SNAPSHOT";
         case 24577 -> "SHADER_EXCEPTION";
         default -> "0x" + Integer.toHexString(i);
      };
   }
}
