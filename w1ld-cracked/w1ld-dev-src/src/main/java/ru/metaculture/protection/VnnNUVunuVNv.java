package ru.metaculture.protection;

public class VnnNUVunuVNv extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(int var0, int var1, int var2) {
      boolean var3 = (var2 & 2) != 0;
      if (var3 && var0 == 70) {
         UUVNUUUnNUv.unNNVVNnvvV = !UUVNUUUnNUv.unNNVVNnvvV;
         if (!UUVNUUUnNUv.unNNVVNnvvV && UUVNUUUnNUv.VVnVNnunVvu == null) {
            UUVNUUUnNUv.VVnVNnunVvu = "";
         }

         return true;
      } else if (UUVNUUUnNUv.UnUNuUU != null) {
         if (var0 == 256) {
            UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
            UUVNUUUnNUv.UnUNuUU = null;
         } else if (var0 == 261) {
            UUVNUUUnNUv.UnUNuUU.uNNnnnuuuN = -1;
            UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
            UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
            UUVNUUUnNUv.UnUNuUU = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         } else {
            UUVNUUUnNUv.UnUNuUU.uNNnnnuuuN = var0;
            UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
            UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
            UUVNUUUnNUv.UnUNuUU = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         }

         return true;
      } else if (UUVNUUUnNUv.uNnUnnuNUnNu != null) {
         if (var0 == 256) {
            UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
            UUVNUUUnNUv.uNnUnnuNUnNu = null;
         } else if (var0 == 261) {
            UUVNUUUnNUv.uNnUnnuNUnNu.vVvUvVVuuNvV = -1;
            UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
            UUVNUUUnNUv.uNnUnnuNUnNu = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         } else {
            UUVNUUUnNUv.uNnUnnuNUnNu.vVvUvVVuuNvV = var0;
            UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
            UUVNUUUnNUv.uNnUnnuNUnNu = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         }

         return true;
      } else {
         if (UUVNUUUnNUv.NnUuNNU != null) {
            if (var0 == 256) {
               UUVNUUUnNUv.NnUuNNU.vNUvnnVnUvu = false;
               UUVNUUUnNUv.NnUuNNU = null;
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }

               return true;
            }

            if (var0 == 259) {
               if (!UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.isEmpty()) {
                  UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN = UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.substring(0, UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.length() - 1);
                  if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                     NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
                  }
               }

               return true;
            }
         }

         if (UUVNUUUnNUv.unNNVVNnvvV) {
            if (var0 == 256) {
               UUVNUUUnNUv.unNNVVNnvvV = false;
               UUVNUUUnNUv.VVnVNnunVvu = "";
               return true;
            }

            if (var0 == 261) {
               UUVNUUUnNUv.VVnVNnunVvu = "";
               return true;
            }

            if (var0 == 259) {
               if (UUVNUUUnNUv.VVnVNnunVvu != null && !UUVNUUUnNUv.VVnVNnunVvu.isEmpty()) {
                  if (var3) {
                     int var4 = UUVNUUUnNUv.VVnVNnunVvu.lastIndexOf(32);
                     UUVNUUUnNUv.VVnVNnunVvu = var4 < 0 ? "" : UUVNUUUnNUv.VVnVNnunVvu.substring(0, var4);
                  } else {
                     UUVNUUUnNUv.VVnVNnunVvu = UUVNUUUnNUv.VVnVNnunVvu.substring(0, UUVNUUUnNUv.VVnVNnunVvu.length() - 1);
                  }

                  return true;
               }

               UUVNUUUnNUv.VVnVNnunVvu = "";
               return true;
            }
         }

         return false;
      }
   }
}
