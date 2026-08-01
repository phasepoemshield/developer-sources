package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper320 {
   private static final Pattern PURCHASE_PATTERN = Pattern.compile("Вы успешно купили (.+?) за \\$([\\d,]+)!");

   public Helper320() {
   }

   public static void method3170(String var0, Helper358 var1) {
      Matcher var2 = PURCHASE_PATTERN.matcher(var0);
      if (var2.find()) {
         String var3 = var2.group(1);
         String var4 = var2.group(2).replace(",", "");

         try {
            int var5 = Integer.parseInt(var4);
            Helper465 var6 = var1.method3579().stream().filter(var1x -> var1x.method364().equals(var3)).findFirst().orElse(null);
            if (var6 != null) {
               Helper464.method4958(var6, var5);
            } else {
               Helper464.method4959(var3, var5);
            }
         } catch (NumberFormatException var7) {
         }
      }
   }
}
