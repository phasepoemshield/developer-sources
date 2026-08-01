package ru.metaculture.protection;

import java.util.Locale;
import java.util.Map;

public final class O00000OOO00O0O {
   private final O00000OOO0OO00 O00000000;
   private final O00000OOO0OOO O000000000;
   private final Map<String, String> O0000000000;
   private final Map<String, String> O00000000000;
   private final O00000OOOO00O O000000000000;

   O00000OOO00O0O(O00000OOO0OO00 o00000OOO0OO00, O00000OOO0OOO o00000OOO0OOO, Map<String, String> map, Map<String, String> map2, O00000OOOO00O o00000OOOO00O) {
      this.O00000000 = o00000OOO0OO00;
      this.O000000000 = o00000OOO0OOO;
      this.O0000000000 = map;
      this.O00000000000 = map2;
      this.O000000000000 = o00000OOOO00O == null ? O00000OOOO00O.PREVIEW_ONLY : o00000OOOO00O.O00000000000();
   }

   public String O00000000(O00000OOO0OO0O o00000OOO0OO0O, String string) {
      O00000OOO0OO0 var3 = this.O00000000.O000000000(o00000OOO0OO0O.O00000000(), string);
      if (var3 != null) {
         String var4 = this.O0000000000.get(var3.O000000000000());
         if (var4 != null) {
            return var4;
         }
      }

      O00000OOO0O00O var6 = this.O000000000.O00000000(o00000OOO0OO0O.O000000000());
      if (var6 != null) {
         O00000OOO0O0OO var5 = var6.O00000000(string);
         if (var5 != null && var5.defaultExpression() != null && !var5.defaultExpression().isBlank()) {
            return var5.defaultExpression();
         }
      }

      return "0.0";
   }

   public String O00000000(float f) {
      if (!Float.isFinite(f)) {
         return "0.0";
      } else {
         String var2 = String.format(Locale.ROOT, "%.6f", f);

         while (var2.contains(".") && var2.endsWith("0")) {
            var2 = var2.substring(0, var2.length() - 1);
         }

         if (var2.endsWith(".")) {
            var2 = var2 + "0";
         }

         return var2;
      }
   }

   public String O000000000(O00000OOO0OO0O o00000OOO0OO0O, String string) {
      return "n_" + O00000000(o00000OOO0OO0O.O00000000()) + "_" + O00000000(string);
   }

   public String O00000000(O00000OOO0OO0O o00000OOO0OO0O) {
      return o00000OOO0OO0O == null
         ? "u_Value"
         : this.O00000000000.getOrDefault(o00000OOO0OO0O.O00000000(), "u_" + O00000000(o00000OOO0OO0O.O00000000("name", "Value")));
   }

   public O00000OOOO00O O00000000() {
      return this.O000000000000;
   }

   public boolean O000000000() {
      return this.O000000000000 == O00000OOOO00O.HUD;
   }

   private static String O00000000(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = string.replaceAll("[^A-Za-z0-9_]", "_");
         return Character.isDigit(var1.charAt(0)) ? "_" + var1 : var1;
      } else {
         return "x";
      }
   }
}
