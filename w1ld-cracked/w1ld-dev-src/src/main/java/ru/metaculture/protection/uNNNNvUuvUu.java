package ru.metaculture.protection;

public class uNNNNvUuvUu extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(char var0, int var1) {
      if (UUVNUUUnNUv.NnUuNNU != null) {
         if (var0 == '\b') {
            if (!UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.isEmpty()) {
               UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN = UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.substring(0, UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.length() - 1);
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }
            }

            return true;
         }

         if (var0 >= ' ' && var0 != 127) {
            if (UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN.length() < 16) {
               UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN = UUVNUUUnNUv.NnUuNNU.uNNnnnuuuN + var0;
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }
            }

            return true;
         }
      }

      if (UUVNUUUnNUv.unNNVVNnvvV) {
         if (var0 == '\b') {
            return true;
         }

         if (var0 >= ' ' && var0 != 127 && (var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z' || var0 >= '0' && var0 <= '9' || var0 == ' ')) {
            if (UUVNUUUnNUv.VVnVNnunVvu.length() < 50) {
               UUVNUUUnNUv.VVnVNnunVvu = UUVNUUUnNUv.VVnVNnunVvu + var0;
            }

            return true;
         }
      }

      return false;
   }
}
