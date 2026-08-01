package l;

import java.util.HashMap;

public enum Helper306 {
   ENG("en_US"),
   RUS("ru_RU");

   private final String file;
   private final HashMap<String, String> strings = new HashMap<>();

   public static Helper306 method3038(String var0) {
      for (Helper306 var4 : values()) {
         if (var4.file.equals(var0)) {
            return var4;
         }
      }

      return ENG;
   }

   public String method3039() {
      return this.file;
   }

   public HashMap<String, String> method3040() {
      return this.strings;
   }

   private Helper306(String var3) {
      this.file = var3;
   }
}
