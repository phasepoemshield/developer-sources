package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class NuuvVnVNN {
   private static final List<uvNvNVNVnUu> UuUVuuUu = new ArrayList<>();

   private NuuvVnVNN() {
   }

   public static void UuUVuuUu(uvNvNVNVnUu var0) {
      UuUVuuUu(var0.UuUVuuUu());
      UuUVuuUu.add(var0);
   }

   public static boolean UuUVuuUu(String var0) {
      boolean var1 = false;

      for (int var2 = 0; var2 < UuUVuuUu.size(); var2++) {
         uvNvNVNVnUu var3 = UuUVuuUu.get(var2);
         if (var3.uNNnnnuuuN() && var3.UuUVuuUu().equalsIgnoreCase(var0)) {
            var3.nuUnNvnuUu();
            var1 = true;
         }
      }

      return var1;
   }

   public static int UuUVuuUu() {
      int var0 = 0;

      for (int var1 = 0; var1 < UuUVuuUu.size(); var1++) {
         uvNvNVNVnUu var2 = UuUVuuUu.get(var1);
         if (var2.uNNnnnuuuN()) {
            var2.nuUnNvnuUu();
            var0++;
         }
      }

      return var0;
   }

   public static void C00OOC00oO() {
      for (int var0 = UuUVuuUu.size() - 1; var0 >= 0; var0--) {
         if (UuUVuuUu.get(var0).VVuuUN()) {
            UuUVuuUu.remove(var0);
         }
      }
   }

   public static boolean uUnuvNvvNU() {
      return UuUVuuUu.isEmpty();
   }

   public static int vVvUvVVuuNvV() {
      return UuUVuuUu.size();
   }

   public static uvNvNVNVnUu UuUVuuUu(int var0) {
      return UuUVuuUu.get(var0);
   }

   public static uvNvNVNVnUu C00OOC00oO(String var0) {
      for (int var1 = 0; var1 < UuUVuuUu.size(); var1++) {
         uvNvNVNVnUu var2 = UuUVuuUu.get(var1);
         if (var2.uNNnnnuuuN() && var2.UuUVuuUu().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }

   public static int uNNnnnuuuN() {
      int var0 = 0;

      for (int var1 = 0; var1 < UuUVuuUu.size(); var1++) {
         if (UuUVuuUu.get(var1).uNNnnnuuuN()) {
            var0++;
         }
      }

      return var0;
   }

   public static List<String> nuUnNvnuUu() {
      ArrayList var0 = new ArrayList(UuUVuuUu.size());

      for (int var1 = 0; var1 < UuUVuuUu.size(); var1++) {
         uvNvNVNVnUu var2 = UuUVuuUu.get(var1);
         if (var2.uNNnnnuuuN()) {
            var0.add(var2.UuUVuuUu());
         }
      }

      return var0;
   }

   public static String uUnuvNvvNU(String var0) {
      for (int var1 = 1; var1 < 1000; var1++) {
         String var2 = var0 + " " + var1;
         if (!vVvUvVVuuNvV(var2)) {
            return var2;
         }
      }

      return var0;
   }

   private static boolean vVvUvVVuuNvV(String var0) {
      for (int var1 = 0; var1 < UuUVuuUu.size(); var1++) {
         uvNvNVNVnUu var2 = UuUVuuUu.get(var1);
         if (var2.uNNnnnuuuN() && var2.UuUVuuUu().toLowerCase(Locale.ROOT).equals(var0.toLowerCase(Locale.ROOT))) {
            return true;
         }
      }

      return false;
   }
}
