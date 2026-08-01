package ru.metaculture.protection;

public final class O00000000OO0O0 {
   public static final int O00000000 = 257;
   public static final int O000000000 = 258;
   public static final int O0000000000 = 513;
   public static final int O00000000000 = 514;
   public static final int O000000000000 = 769;
   public static final int O0000000000000 = 770;
   public static final int O000000000000O = 1025;
   public static final int O00000000000O = 1026;
   public static final int O00000000000O0 = 1281;
   public static final int O00000000000OO = 1282;

   private O00000000OO0O0() {
   }

   public static String O00000000(int i) {
      return switch (i) {
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
         default -> "UNKNOWN_" + Integer.toHexString(i);
      };
   }
}
