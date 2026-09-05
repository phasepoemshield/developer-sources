package ru.metaculture.protection;

public final class UUNnvNUVVvn {
   public static final int UuUVuuUu = 257;
   public static final int C00OOC00oO = 258;
   public static final int uUnuvNvvNU = 513;
   public static final int vVvUvVVuuNvV = 514;
   public static final int uNNnnnuuuN = 769;
   public static final int nuUnNvnuUu = 770;
   public static final int VVuuUN = 1025;
   public static final int vNUvnnVnUvu = 1026;
   public static final int uVUuuVnNVU = 1281;
   public static final int vuuuNvNuv = 1282;

   private UUNnvNUVVvn() {
   }

   public static String UuUVuuUu(int var0) {
      return switch (var0) {
         case 257 -> "CLIENT_TICK_HEAD";
         case 258 -> "CLIENT_TICK_TAIL";
         case 513 -> "GAME_RENDER_HEAD";
         case 514 -> "GAME_RENDER_TAIL";
         case 769 -> "SCREEN_RENDER_HEAD";
         case 770 -> "SCREEN_RENDER_TAIL";
         case 1025 -> "GUI_RENDER_BEGIN";
         case 1026 -> "GUI_RENDER_END";
         case 1281 -> "SHADER_DRAW_BEGIN";
         case 1282 -> "SHADER_DRAW_END";
         default -> "UNKNOWN_" + Integer.toHexString(var0);
      };
   }
}
