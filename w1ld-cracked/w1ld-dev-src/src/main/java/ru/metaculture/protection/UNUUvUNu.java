package ru.metaculture.protection;

public final class UNUUvUNu {
   public static final int UuUVuuUu = 4097;
   public static final int C00OOC00oO = 4098;
   public static final int uUnuvNvvNU = 8193;
   public static final int vVvUvVVuuNvV = 12289;
   public static final int uNNnnnuuuN = 16385;
   public static final int nuUnNvnuUu = 20481;
   public static final int VVuuUN = 24577;

   private UNUUvUNu() {
   }

   public static String UuUVuuUu(int var0) {
      return switch (var0) {
         case 4097 -> "GL_ERROR";
         case 4098 -> "GL_STATE_LEAK";
         case 8193 -> "PHASE_ORDER";
         case 12289 -> "MATRIX_INVALID";
         case 16385 -> "SNAPSHOT_FAILURE";
         case 20481 -> "MANUAL_SNAPSHOT";
         case 24577 -> "SHADER_EXCEPTION";
         default -> "0x" + Integer.toHexString(var0);
      };
   }
}
