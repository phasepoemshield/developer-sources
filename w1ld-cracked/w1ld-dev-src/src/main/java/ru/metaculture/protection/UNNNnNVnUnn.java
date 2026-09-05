package ru.metaculture.protection;

public final class UNNNnNVnUnn {
   public static final String UuUVuuUu = "Макс. цена";
   public static final int C00OOC00oO = 12;

   private UNNNnNVnUnn() {
   }

   public static float UuUVuuUu(float var0, float var1, float var2, boolean var3, float var4) {
      return var0 - var1 - var2 - var4 * (var3 ? 2.0F : 1.0F);
   }

   public static String UuUVuuUu(String var0, boolean var1) {
      String var2 = uUnuvNvvNU(var0);
      if (var2.isEmpty()) {
         return var1 ? "" : "Макс. цена";
      } else {
         return vVvUvVVuuNvV(var2);
      }
   }

   public static String UuUVuuUu(String var0, char var1) {
      int var2 = Character.digit(var1, 10);
      String var3 = uUnuvNvvNU(var0);
      if (var2 >= 0 && var3.length() < 12) {
         if (var3.length() == 1 && var3.charAt(0) == '0') {
            var3 = "";
         }

         return vVvUvVVuuNvV(var3 + (char)(48 + var2));
      } else {
         return var3.isEmpty() ? "" : vVvUvVVuuNvV(var3);
      }
   }

   public static String UuUVuuUu(String var0) {
      String var1 = uUnuvNvvNU(var0);
      return var1.length() <= 1 ? "" : vVvUvVVuuNvV(var1.substring(0, var1.length() - 1));
   }

   public static int C00OOC00oO(String var0, boolean var1) {
      return var1 ? UuUVuuUu(var0, true).length() : -1;
   }

   public static long C00OOC00oO(String var0) {
      if (var0 != null && !var0.isBlank()) {
         int var1 = 0;

         while (var1 < var0.length()) {
            int var2 = var0.codePointAt(var1);
            if (Character.digit(var2, 10) < 0 && var2 != 36 && !Character.isWhitespace(var2) && !Character.isSpaceChar(var2)) {
               return 0L;
            }

            var1 += Character.charCount(var2);
         }

         String var4 = uUnuvNvvNU(var0);
         if (var4.isEmpty()) {
            return 0L;
         } else {
            try {
               return Long.parseLong(var4);
            } catch (NumberFormatException var3) {
               return 0L;
            }
         }
      } else {
         return 0L;
      }
   }

   public static String UuUVuuUu(long var0) {
      return vVvUvVVuuNvV(Long.toString(Math.max(0L, var0)));
   }

   public static int UuUVuuUu(String var0, int var1) {
      String var2 = UuUVuuUu(var0, true);
      int var3 = Math.max(0, Math.min(var1, var2.length()));
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         if (Character.digit(var2.charAt(var5), 10) >= 0) {
            var4++;
         }
      }

      return var4;
   }

   public static int C00OOC00oO(String var0, int var1) {
      String var2 = UuUVuuUu(var0, true);
      if (var2.isEmpty()) {
         return 0;
      } else {
         int var3 = Math.max(0, Math.min(var1, uUnuvNvvNU(var0).length()));
         if (var3 == 0) {
            return var2.charAt(0) == 36 ? 1 : 0;
         } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var2.length(); var5++) {
               if (Character.digit(var2.charAt(var5), 10) >= 0) {
                  if (++var4 == var3) {
                     return var5 + 1;
                  }
               }
            }

            return var2.length();
         }
      }
   }

   public static UNNNnNVnUnn.NVnVnNnN UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = var0 + var1 - var2 - var7;
      float var9 = var8 - (var7 > 0.0F ? var3 : 0.0F) - var6;
      float var10 = var9 - var3 - var5;
      float var11 = var10 - var3 - var4;
      return new UNNNnNVnUnn.NVnVnNnN(var11, var4, var10, var5, var9, var6, var8, var7);
   }

   private static String uUnuvNvvNU(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder(var0.length());
         int var2 = 0;

         while (var2 < var0.length()) {
            int var3 = var0.codePointAt(var2);
            int var4 = Character.digit(var3, 10);
            if (var4 >= 0) {
               var1.append((char)(48 + var4));
            }

            var2 += Character.charCount(var3);
         }

         var2 = 0;

         while (var2 < var1.length() - 1 && var1.charAt(var2) == '0') {
            var2++;
         }

         return var2 == 0 ? var1.toString() : var1.substring(var2);
      } else {
         return "";
      }
   }

   private static String vVvUvVVuuNvV(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         int var1 = (var0.length() - 1) / 3;
         StringBuilder var2 = new StringBuilder(1 + var0.length() + var1);
         var2.append('$');
         int var3 = var0.length() % 3;
         if (var3 == 0) {
            var3 = 3;
         }

         var2.append(var0, 0, var3);

         for (int var4 = var3; var4 < var0.length(); var4 += 3) {
            var2.append(' ').append(var0, var4, var4 + 3);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public record NVnVnNnN(
      float priceX, float priceWidth, float statusX, float statusWidth, float deleteX, float deleteWidth, float settingsX, float settingsWidth
   ) {
   }
}
