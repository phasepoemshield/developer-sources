package l;

import fat.releon.Releon;
import java.util.ArrayList;
import java.util.List;

public class Helper19 {
   private static final List<Helper18> staffList = new ArrayList<>();

   public Helper19() {
   }

   public static void method380(String var0) {
      if (!method382(var0)) {
         staffList.add(new Helper18(var0));
      }
   }

   public static void method381(String var0) {
      staffList.removeIf(var1 -> var1.getName().equalsIgnoreCase(var0));
   }

   public static boolean method382(String var0) {
      return staffList.stream().anyMatch(var1 -> var1.getName().equalsIgnoreCase(var0));
   }

   public static void method383() {
      staffList.clear();
   }

   public static List<Helper18> method384() {
      return staffList;
   }

   static void method385() {
      Helper91 var0 = Releon.method71().method29();
      if (var0 != null) {
         var0.method900(Staff2.class);
      }
   }
}
