package l;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class Helper209 {
   public static String method1790(int var0) {
      return IntStream.range(0, var0).mapToObj(var0x -> String.valueOf((char)new Random().nextInt(97, 123))).collect(Collectors.joining());
   }

   public static String method1791(int var0) {
      return var0 < 0
         ? "N/A"
         : Helper38.method535(var0)
            .createFromCode(var0)
            .getTranslationKey()
            .replace("key.keyboard.", "")
            .replace("key.mouse.", "mouse ")
            .replace(".", " ")
            .toUpperCase();
   }

   public static String method1792(String var0, int var1, int var2) {
      String[] var3 = var0.split(" ");
      StringBuilder var4 = new StringBuilder();
      float var5 = 0.0F;

      for (String var9 : var3) {
         float var10 = Helper103.method926(var2).method1479(var9);
         if (var5 + var10 > var1) {
            var4.append("\n");
            var5 = 0.0F;
         } else if (var5 > 0.0F) {
            var4.append(" ");
            var5 += Helper103.method926(var2).method1479(" ");
         }

         var4.append(var9);
         var5 += var10;
      }

      return var4.toString();
   }

   public static String method1793() {
      String var0 = "DEVELOPER";

      return switch (var0) {
         case "Разработчик" -> "Developer";
         case "Администратор" -> "Admin";
         default -> "User";
      };
   }

   public static String method1794(int var0) {
      int var1 = var0 / 60;
      String var2 = String.format("%02d", var0 % 60);
      return var1 + ":" + var2;
   }

   public static String method1795(String var0, float var1, Helper175 var2) {
      StringBuilder var3 = new StringBuilder();

      for (char var7 : var0.toCharArray()) {
         if (var2.method1479(var3.toString() + var7) > var1) {
            break;
         }

         var3.append(var7);
      }

      return var3.toString();
   }

   private Helper209() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
