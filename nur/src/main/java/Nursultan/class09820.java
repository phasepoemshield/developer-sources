package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public final class class09820 {
   private static final String N = "style.";

   private static String L(class09773 var0) {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : var0.L().entrySet()) {
         if (((String)var3.getKey()).startsWith("style.")) {
            if (!var1.isEmpty()) {
               var1.append("  ");
            }

            var1.append(N((String)var3.getKey())).append('=').append((String)var3.getValue());
         }
      }

      return var1.toString();
   }

   public static String L(class10021 var0, class09791 var1) {
      return y(N(var0, var1));
   }

   private class09820() {
   }

   public static String y(class10021 var0, class09791 var1) {
      return N(N(var0, var1));
   }

   public static String y(class09773 var0) {
      StringBuilder var1 = new StringBuilder();
      N(var0, var1);
      return var1.toString();
   }

   private static String y(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length() + 2);
      var1.append('"');

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         switch (var3) {
            case '\t':
               var1.append("\\t");
               break;
            case '\n':
               var1.append("\\n");
               break;
            case '\r':
               var1.append("\\r");
               break;
            case '"':
               var1.append("\\\"");
               break;
            case '\\':
               var1.append("\\\\");
               break;
            default:
               var1.append(var3);
         }
      }

      var1.append('"');
      return var1.toString();
   }

   private static void y(class09773 var0, class09773 var1, String var2, StringBuilder var3) {
      LinkedHashSet var4 = new LinkedHashSet();
      var4.addAll(var0.L().keySet());
      var4.addAll(var1.L().keySet());

      for (String var6 : var4) {
         String var7 = var0.L().get(var6);
         String var8 = var1.L().get(var6);
         if (!Objects.equals(var7, var8)) {
            var3.append("~ ")
               .append(var2)
               .append(' ')
               .append(N(var6))
               .append(": ")
               .append(var7 == null ? "-" : var7)
               .append(" -> ")
               .append(var8 == null ? "-" : var8)
               .append('\n');
         }
      }
   }

   private static String y(class10021 var0) {
      String var1 = var0.N();
      String var2 = var0.y().name().toLowerCase();
      return var1 != null && !var1.isBlank() ? var2 + "#" + var1 : var2;
   }

   private static void y(class10021 var0, Map<String, String> var1) {
      String var2 = N(var0);
      if (!var2.isEmpty()) {
         var1.put("dirty", var2);
      }

      int var3 = var0.q().Z();
      if (var3 > 0) {
         var1.put("cachedDraws", String.valueOf(var3));
      }
   }

   private static String N(class09962 var0) {
      String var1 = var0.u().name().toLowerCase();

      float var2 = switch (var0.u()) {
         case FIXED, PERCENT -> var0.M();
         default -> var0.i();
      };
      return var1 + "(" + N(var2) + ")";
   }

   private static String N(String var0) {
      return var0.startsWith("style.") ? var0.substring("style.".length()) : var0;
   }

   private static boolean N(class09985 var0) {
      return N(var0.L(), var0.u()) && N(var0.u(), var0.i()) && N(var0.i(), var0.R());
   }

   private static class10021 N(class10021 var0, String var1) {
      if (var1.equals(var0.N())) {
         return var0;
      } else {
         Iterator<class10021> var2 = var0.L().iterator();

         while (var2.hasNext()) {
            class10021 var4 = N(var2.next(), var1);
            if (var4 != null) {
               return var4;
            }
         }

         return null;
      }
   }

   public static class09773 N(class10021 var0, class09791 var1) {
      class09791 var2 = var1 == null ? class09791.N() : var1;
      class10021 var3 = var2.L() == null ? var0 : N(var0, var2.L());
      return var3 == null ? new class09773("missing", "(missing key: " + var2.L() + ")", new LinkedHashMap<>(), List.of()) : N(var3, var2, 0, 0);
   }

   private static String N(class10021 var0, int var1) {
      String var2 = var0.N();
      return var2 != null && !var2.isBlank() ? var2 : var0.y().name().toLowerCase() + "[" + var1 + "]";
   }

   private static String N(class09989 var0, Object var1) {
      return switch (var1) {
         case null -> "null";
         case Float var9 -> N((Float)var1);
         case Integer var5 when var0.name().contains("COLOR") -> N(var5);
         case class09962 var10 -> N((class09962)var1);
         case class09965 var7 -> var7.L() ? N(var7.u()) : N(var7.u()) + "/" + N(var7.i()) + "/" + N(var7.R()) + "/" + N(var7.M());
         case class09985 var8 -> N(var8) ? N(var8.L()) : N(var8.L()) + "/" + N(var8.u()) + "/" + N(var8.i()) + "/" + N(var8.R());
         default -> String.valueOf(var1);
      };
   }

   public static String N(class09773 var0, class09773 var1) {
      StringBuilder var2 = new StringBuilder();
      N(var0, var1, "", var2);
      return var2.isEmpty() ? "(no differences)\n" : var2.toString();
   }

   private static boolean N(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   private static String N(String var0, int var1) {
      String var2 = var0.replace('\n', ' ').replace('\r', ' ');
      return var2.length() <= var1 ? var2 : var2.substring(0, var1) + "...";
   }

   private static String N(int var0) {
      return String.format("#%08X", var0);
   }

   private static String N(float var0) {
      return (double)var0 == Math.rint((double)var0) && !Float.isInfinite(var0) ? Integer.toString((int)var0) : String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String N(float var0, float var1, float var2, float var3) {
      return "(" + N(var0) + "," + N(var1) + " " + N(var2) + "x" + N(var3) + ")";
   }

   private static void N(class09980 var0, boolean var1, Map<String, String> var2) {
      class09980 var3 = class09968.N();

      for (class09989 var7 : class09989.values()) {
         if (var1 || var7.N(var3, var0)) {
            var2.put("style." + var7.name().toLowerCase(), N(var7, var7.N(var0)));
         }
      }
   }

   private static void N(StringBuilder var0, class09773 var1) {
      for (Entry var3 : var1.L().entrySet()) {
         if (!((String)var3.getKey()).startsWith("style.")) {
            var0.append(' ').append((String)var3.getKey()).append('=').append((String)var3.getValue());
         }
      }
   }

   private static void N(class09773 var0, int var1, StringBuilder var2) {
      String var3 = "  ".repeat(var1);
      var2.append(var3).append(var0.y());
      N(var2, var0);
      var2.append('\n');
      String var4 = L(var0);
      if (!var4.isEmpty()) {
         var2.append(var3).append("    style ").append(var4).append('\n');
      }

      Iterator<class09773> var5 = var0.u().iterator();

      while (var5.hasNext()) {
         N(var5.next(), var1 + 1, var2);
      }
   }

   public static String N(class09773 var0) {
      StringBuilder var1 = new StringBuilder();
      N(var0, 0, var1);
      return var1.toString();
   }

   private static String N(class10021 var0) {
      StringBuilder var1 = new StringBuilder();
      N(var1, var0, 2, "LAYOUT");
      N(var1, var0, 4, "POSITION");
      N(var1, var0, 8, "SCROLL");
      N(var1, var0, 1, "DRAW");
      return var1.toString();
   }

   private static void N(StringBuilder var0, class10021 var1, int var2, String var3) {
      if (var1.M(var2)) {
         if (!var0.isEmpty()) {
            var0.append('|');
         }

         var0.append(var3);
      }
   }

   private static Map<String, class09773> N(List<class09773> var0) {
      LinkedHashMap var1 = new LinkedHashMap();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         class09773 var3 = (class09773)var0.get(var2);
         String var4 = var3.N();
         String var5 = var1.containsKey(var4) ? var4 + "#" + var2 : var4;
         var1.put(var5, var3);
      }

      return var1;
   }

   private static class09773 N(class10021 var0, class09791 var1, int var2, int var3) {
      LinkedHashMap var4 = new LinkedHashMap();
      N(var0, var4);
      N(var0.c(), var4);
      N(var0.o(), var1.u(), var4);
      y(var0, var4);
      ArrayList var5 = new ArrayList();
      List<class10021> var6 = var0.L();
      if (var2 >= var1.y() && !var6.isEmpty()) {
         var4.put("childrenElided", String.valueOf(var6.size()));
      } else {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            var5.add(N(var6.get(var7), var1, var2 + 1, var7));
         }
      }

      return new class09773(N(var0, var3), y(var0), var4, var5);
   }

   private static void N(class09773 var0, class09773 var1, String var2, StringBuilder var3) {
      String var4 = var2.isEmpty() ? var1.N() : var2 + "/" + var1.N();
      y(var0, var1, var4, var3);
      Map<String, class09773> var5 = N(var0.u());
      Map<String, class09773> var6 = N(var1.u());
      LinkedHashSet var7 = new LinkedHashSet();
      var7.addAll(var5.keySet());
      var7.addAll(var6.keySet());

      for (String var9 : var7) {
         class09773 var10 = var5.get(var9);
         class09773 var11 = var6.get(var9);
         if (var10 == null) {
            var3.append("+ ").append(var4).append('/').append(var11.N()).append("  ").append(var11.y()).append('\n');
         } else if (var11 == null) {
            var3.append("- ").append(var4).append('/').append(var10.N()).append("  ").append(var10.y()).append('\n');
         } else {
            N(var10, var11, var4, var3);
         }
      }
   }

   private static void N(class10021 var0, Map<String, String> var1) {
      String var2 = var0.B();
      if (var2 != null && !var2.isEmpty()) {
         var1.put("text", "\"" + N(var2, 60) + "\"");
      }

      String var3 = var0.Z();
      if (var3 != null && !var3.isEmpty()) {
         var1.put("placeholder", "\"" + N(var3, 60) + "\"");
      }

      String var4 = var0.z();
      if (var4 != null && !var4.isEmpty()) {
         var1.put("texture", var4);
      }

      if (var0.U() != null) {
         var1.put("canvas", "yes");
      }
   }

   private static void N(class09773 var0, StringBuilder var1) {
      var1.append("{\"id\":").append(y(var0.N()));
      var1.append(",\"label\":").append(y(var0.y()));
      var1.append(",\"fields\":{");
      boolean var2 = true;

      for (Entry var4 : var0.L().entrySet()) {
         if (!var2) {
            var1.append(',');
         }

         var2 = false;
         var1.append(y((String)var4.getKey())).append(':').append(y((String)var4.getValue()));
      }

      var1.append("},\"children\":[");
      List<class09773> var3 = var0.u();

      for (int var6 = 0; var6 < var3.size(); var6++) {
         if (var6 > 0) {
            var1.append(',');
         }

         N(var3.get(var6), var1);
      }

      var1.append("]}");
   }

   private static void N(class09937 var0, Map<String, String> var1) {
      var1.put("box", N(var0.y(), var0.L(), var0.u(), var0.i()));
      if (!N(var0.t(), var0.u()) || !N(var0.G(), var0.i())) {
         var1.put("raw", N(var0.t()) + "x" + N(var0.G()));
      }

      var1.put("content", N(var0.R(), var0.M(), var0.B(), var0.Z()));
      if (var0.P() > 0.0F || var0.m() != 0.0F) {
         var1.put("scrollY", N(var0.m()) + "/" + N(var0.P()));
      }

      if (var0.z() != 0) {
         var1.put("z", String.valueOf(var0.z()));
      }
   }
}
