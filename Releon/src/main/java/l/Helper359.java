package l;

import java.util.ArrayList;
import java.util.List;

public class Helper359 {
   private static List<Helper465> allItems = null;
   private static boolean settingsLoaded = false;

   public Helper359() {
   }

   public static void method3581() {
      if (!settingsLoaded) {
         settingsLoaded = true;
      }
   }

   public static List<Helper465> method3582() {
      if (allItems == null) {
         allItems = new ArrayList<>();
         allItems.addAll(method3584());
         allItems.addAll(method3585());
         allItems.addAll(method3586());
         allItems.addAll(method3587());
         allItems.addAll(method3588());
         allItems.addAll(method3589());

         for (Helper465 var1 : allItems) {
            Helper31.method477().method479(var1.method364(), var1.method368());
         }
      }

      return allItems;
   }

   public static void method3583() {
      if (allItems != null) {
         for (Helper465 var1 : allItems) {
            Helper31.method477().method479(var1.method364(), var1.method368());
         }
      }
   }

   public static List<Helper465> method3584() {
      return Helper304.method3019();
   }

   public static List<Helper465> method3585() {
      return Helper360.method3590();
   }

   public static List<Helper465> method3586() {
      return Helper13.method362();
   }

   public static List<Helper465> method3587() {
      return Helper455.method4840();
   }

   public static List<Helper465> method3588() {
      return Helper454.method4839();
   }

   public static List<Helper465> method3589() {
      return Helper295.method2886();
   }
}
