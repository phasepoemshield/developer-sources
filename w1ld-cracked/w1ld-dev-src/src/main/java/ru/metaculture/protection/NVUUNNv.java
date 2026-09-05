package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_476;

final class NVUUNNv {
   private static final int UuUVuuUu = 5;
   private static final long C00OOC00oO = 900L;
   private static final VuNvNNvVV uUnuvNvvNU = new VuNvNNvVV();
   private static NVUUNNv.NVnVnNnN vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.NONE;
   private static boolean uNNnnnuuuN = false;
   private static boolean nuUnNvnuUu = false;
   private static boolean VVuuUN = false;
   private static int vNUvnnVnUvu = 0;

   private NVUUNNv() {
   }

   static void UuUVuuUu() {
      vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.NONE;
      uNNnnnuuuN = false;
      nuUnNvnuUu = false;
      VVuuUN = false;
      vNUvnnVnUvu = 0;
      UvnvNVnnnnNU();
   }

   static void C00OOC00oO() {
      if (VVuuUN) {
         class_310 var0 = class_310.method_1551();
         if (var0.field_1724 != null) {
            if (uUnuvNvvNU(var0)) {
               VVuuUN = false;
               vNUvnnVnUvu = 0;
            } else if (!vNVuvnUUnuUn()) {
               VVuuUN = false;
               vNUvnnVnUvu = 0;
            } else if (vNUvnnVnUvu >= 5) {
               if (uUnuvNvvNU.uNNnnnuuuN(900L)) {
                  VVuuUN = false;
               }
            } else {
               if (uUnuvNvvNU.uNNnnnuuuN(900L)) {
                  C00OOC00oO(var0);
               }
            }
         }
      }
   }

   static boolean uUnuvNvvNU() {
      return uNNnnnuuuN;
   }

   static boolean vVvUvVVuuNvV() {
      return nuUnNvnuUu;
   }

   static boolean uNNnnnuuuN() {
      return vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.SELL || AutoBuy.uVunuUNVVUUV;
   }

   static boolean nuUnNvnuUu() {
      return vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.RESELL || AutoBuy.UNnVVNvvnVvU;
   }

   static boolean VVuuUN() {
      return !uNNnnnuuuN && !nuUnNvnuUu();
   }

   static boolean vNUvnnVnUvu() {
      if (!VVuuUN()) {
         return false;
      } else {
         vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.SELL;
         UvnvNVnnnnNU();
         return true;
      }
   }

   static void UuUVuuUu(boolean var0) {
      if (vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.SELL) {
         vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.NONE;
      }

      AutoBuy.uVunuUNVVUUV = false;
      UvnvNVnnnnNU();
      vVvUvVVuuNvV(var0);
   }

   static boolean uVUuuVnNVU() {
      if (nuUnNvnuUu && !uNNnnnuuuN()) {
         vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.RESELL;
         UvnvNVnnnnNU();
         return true;
      } else {
         return false;
      }
   }

   static void C00OOC00oO(boolean var0) {
      if (vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.RESELL) {
         vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.NONE;
      }

      AutoBuy.UNnVVNvvnVvU = false;
      UvnvNVnnnnNU();
      vVvUvVVuuNvV(var0);
   }

   static void uUnuvNvvNU(boolean var0) {
      if (var0 && !uNNnnnuuuN) {
         vNUvnnVnUvu();
      } else {
         UvnvNVnnnnNU();
         vVvUvVVuuNvV(true);
      }
   }

   static void vuuuNvNuv() {
      uNNnnnuuuN = false;
      nuUnNvnuUu = true;
      UvnvNVnnnnNU();
   }

   static void nvUVNnuu() {
      uNNnnnuuuN = true;
      nuUnNvnuUu = true;
      if (vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.SELL) {
         vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.NONE;
      }

      UvnvNVnnnnNU();
   }

   static void UuuNnUvUuv() {
      uNNnnnuuuN = false;
      nuUnNvnuUu = true;
      UvnvNVnnnnNU();
   }

   static void nUUVuvU() {
      nuUnNvnuUu = true;
      UvnvNVnnnnNU();
   }

   static void UnUNVVVNuv() {
      uNNnnnuuuN = false;
      nuUnNvnuUu = false;
      if (vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.RESELL) {
         vVvUvVVuuNvV = NVUUNNv.NVnVnNnN.NONE;
      }

      UvnvNVnnnnNU();
   }

   static void vVvUvVVuuNvV(boolean var0) {
      if (var0) {
         class_310 var1 = class_310.method_1551();
         if (var1.field_1724 != null) {
            if (AutoBuy.NVNnnvnuunNv != null && AutoBuy.NVNnnvnuunNv.nuUnNvnuUu) {
               UuUVuuUu(var1);
            }
         }
      }
   }

   private static void UuUVuuUu(class_310 var0) {
      if (uUnuvNvvNU(var0)) {
         VVuuUN = false;
         vNUvnnVnUvu = 0;
      } else if (vNVuvnUUnuUn()) {
         VVuuUN = false;
         vNUvnnVnUvu = 0;
         AutoBuy.NVNnnvnuunNv.UnUNuUU();
      } else {
         var0.field_1724.field_3944.method_45730("ah");
      }
   }

   private static void C00OOC00oO(class_310 var0) {
      var0.field_1724.field_3944.method_45730("ah");
      vNUvnnVnUvu++;
      uUnuvNvvNU.UuUVuuUu();
   }

   private static boolean uUnuvNvvNU(class_310 var0) {
      return var0.field_1755 instanceof class_476 var1 && AhHelper.UuUVuuUu(var1);
   }

   private static boolean vNVuvnUUnuUn() {
      return AutoBuy.NVNnnvnuunNv != null && AutoBuy.NVNnnvnuunNv.NnUuNNU.C00OOC00oO("FunTime");
   }

   private static void UvnvNVnnnnNU() {
      AutoBuy.uVunuUNVVUUV = vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.SELL;
      AutoBuy.UNnVVNvvnVvU = vVvUvVVuuNvV == NVUUNNv.NVnVnNnN.RESELL;
      AutoBuy.uNnUnnuNUnNu = uNNnnnuuuN;
   }

   static enum NVnVnNnN {
      NONE,
      SELL,
      RESELL;
   }
}
