package l;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Helper299 {
   private static final Pattern ARG_PATTERN = Pattern.compile("\\S+");

   private Helper299() {
   }

   public static List<Helper204> method2947(String var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      Matcher var3 = ARG_PATTERN.matcher(var0);

      int var4;
      for (var4 = -1; var3.find(); var4 = var3.end()) {
         var2.add(new Helper22(var2.size(), var3.group(), var0.substring(var3.start())));
      }

      if (var1 && var4 < var0.length()) {
         var2.add(new Helper22(var2.size(), "", ""));
      }

      return var2;
   }

   public static List<Helper204> method2948(String var0) {
      return method2947(var0, false);
   }

   public static Helper22 method2949() {
      return new Helper22(-1, "<unknown>", "");
   }
}
