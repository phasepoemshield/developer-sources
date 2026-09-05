package ru.metaculture.protection;

public final class VVvNNnuVNun {
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      if (var1.NUUVUvvuNNVU() != null) {
         var1.C00OOC00oO(var2);
         return true;
      } else if (var1.VUNvNUuNVnn() != null) {
         var1.uUnuvNvvNU(var2);
         return true;
      } else if (var1.UNNunNuUNVuU() != null) {
         var1.vVvUvVVuuNvV(var2);
         return true;
      } else if (var1.vnUUvvnUVUu() != null) {
         this.uNNnnnuuuN(var1, var2);
         return true;
      } else if (var1.UvnnnuuNvUvv() != null) {
         this.nuUnNvnuUu(var1, var2);
         return true;
      } else if (var1.NuUuUvUUvU() != null) {
         this.C00OOC00oO(var1, var2);
         return true;
      } else if (var1.UnUUVuVunvVu()) {
         this.vVvUvVVuuNvV(var1, var2);
         return true;
      } else if (var1.o0Ooc0COOoc()) {
         this.uUnuvNvvNU(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, char var2) {
      if (var1.vnUUvvnUVUu() != null) {
         this.C00OOC00oO(var1, var2);
         return true;
      } else if (var1.UvnnnuuNvUvv() != null) {
         this.uUnuvNvvNU(var1, var2);
         return true;
      } else if (var1.NuUuUvUUvU() != null) {
         if (!Character.isISOControl(var2)) {
            NVuVVUNUvV var10000 = var1.NuUuUvUUvU();
            var10000.uNNnnnuuuN = var10000.uNNnnnuuuN + var2;
            var1.uUVvnUuNvvN();
         }

         return true;
      } else if (var1.UnUUVuVunvVu()) {
         if (!Character.isISOControl(var2)) {
            var1.C00OOC00oO(var2);
         }

         return true;
      } else if (var1.o0Ooc0COOoc()) {
         if (!Character.isISOControl(var2)) {
            var1.UuUVuuUu(var2);
         }

         return true;
      } else {
         return false;
      }
   }

   private void C00OOC00oO(vNvvVnNuUVvv var1, int var2) {
      if (var2 == 256 || var2 == 257) {
         var1.UuUVuuUu(null);
      } else if (var2 == 259 && !var1.NuUuUvUUvU().uNNnnnuuuN.isEmpty()) {
         String var3 = var1.NuUuUvUUvU().uNNnnnuuuN;
         var1.NuUuUvUUvU().uNNnnnuuuN = var3.substring(0, var3.length() - 1);
         var1.uUVvnUuNvvN();
      }
   }

   private void uUnuvNvvNU(vNvvVnNuUVvv var1, int var2) {
      if (var2 == 256 || var2 == 257) {
         var1.uVUuuVnNVU(false);
      } else if (var2 == 259) {
         var1.NnUuNNU();
      }
   }

   private void vVvUvVVuuNvV(vNvvVnNuUVvv var1, int var2) {
      if (var2 == 256) {
         var1.UnUNuUU();
         var1.vuuuNvNuv(false);
      } else if (var2 == 257) {
         var1.vuuuNvNuv(false);
      } else if (var2 == 259) {
         var1.uUVuVvuNUvnu();
      }
   }

   private void uNNnnnuuuN(vNvvVnNuUVvv var1, int var2) {
      VnnUvVNuNuVv var3 = var1.vnUUvvnUVUu();
      if (var3 != null) {
         if (var2 == 256) {
            var1.uNNnnnuuuN(null);
            var1.nuUnNvnuUu("");
         } else if (var2 != 257 && var2 != 258) {
            if (var2 == 259) {
               String var4 = var1.vNVvnNNnVV();
               if (var4 != null && !var4.isEmpty()) {
                  var1.nuUnNvnuUu(var4.substring(0, var4.length() - 1));
               }
            }
         } else {
            this.UuUVuuUu(var1, var3);
            var1.uNNnnnuuuN(null);
            var1.nuUnNvnuUu("");
         }
      }
   }

   private void C00OOC00oO(vNvvVnNuUVvv var1, char var2) {
      if (UuUVuuUu(var2)) {
         String var3 = var1.vNVvnNNnVV();
         if (var3 == null) {
            var3 = "";
         }

         if (var3.length() < 8) {
            var1.nuUnNvnuUu(var3 + Character.toUpperCase(var2));
         }
      }
   }

   private void nuUnNvnuUu(vNvvVnNuUVvv var1, int var2) {
      VnnUvVNuNuVv var3 = var1.UvnnnuuNvUvv();
      if (var3 != null) {
         if (var2 == 256) {
            var1.nuUnNvnuUu(null);
            var1.VVuuUN("");
         } else if (var2 != 257 && var2 != 258) {
            if (var2 == 259) {
               String var4 = var1.uVUUnuunuv();
               if (var4 != null && !var4.isEmpty()) {
                  var1.VVuuUN(var4.substring(0, var4.length() - 1));
               }
            }
         } else {
            this.C00OOC00oO(var1, var3);
            var1.nuUnNvnuUu(null);
            var1.VVuuUN("");
         }
      }
   }

   private void uUnuvNvvNU(vNvvVnNuUVvv var1, char var2) {
      if (var2 >= '0' && var2 <= '9') {
         String var3 = var1.uVUUnuunuv();
         if (var3 == null) {
            var3 = "";
         }

         if (var3.length() < 3) {
            var1.VVuuUN(var3 + var2);
         }
      }
   }

   private void UuUVuuUu(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2) {
      String var3 = var1.vNVvnNNnVV();
      if (var3 != null) {
         String var4 = var3.trim();
         if (var4.startsWith("#")) {
            var4 = var4.substring(1);
         }

         if (!var4.isEmpty()) {
            try {
               long var5 = Long.parseUnsignedLong(var4, 16);
               int var7;
               switch (var4.length()) {
                  case 3:
                     int var14 = ((int)(var5 >> 8) & 15) * 17;
                     int var16 = ((int)(var5 >> 4) & 15) * 17;
                     int var17 = ((int)var5 & 15) * 17;
                     int var18 = Math.round(var2.vNVuvnUUnuUn * 255.0F) & 0xFF;
                     var7 = var18 << 24 | var14 << 16 | var16 << 8 | var17;
                     break;
                  case 4:
                     int var13 = ((int)(var5 >> 12) & 15) * 17;
                     int var15 = ((int)(var5 >> 8) & 15) * 17;
                     int var10 = ((int)(var5 >> 4) & 15) * 17;
                     int var11 = ((int)var5 & 15) * 17;
                     var7 = var11 << 24 | var13 << 16 | var15 << 8 | var10;
                     break;
                  case 5:
                  case 7:
                  default:
                     return;
                  case 6:
                     int var8 = (int)var5 & 16777215;
                     int var9 = Math.round(var2.vNVuvnUUnuUn * 255.0F) & 0xFF;
                     var7 = var9 << 24 | var8;
                     break;
                  case 8:
                     var7 = (int)var5;
               }

               var2.UuUVuuUu(var7);
               var1.uUVvnUuNvvN();
            } catch (NumberFormatException var12) {
            }
         }
      }
   }

   private void C00OOC00oO(vNvvVnNuUVvv var1, VnnUvVNuNuVv var2) {
      String var3 = var1.uVUUnuunuv();
      if (var3 != null && !var3.isEmpty()) {
         try {
            int var4 = Integer.parseUnsignedInt(var3);
            if (var4 < 0) {
               var4 = 0;
            }

            if (var4 > 100) {
               var4 = 100;
            }

            var2.C00OOC00oO(var4 / 100.0F);
            var1.uUVvnUuNvvN();
         } catch (NumberFormatException var5) {
         }
      }
   }

   private static boolean UuUVuuUu(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'f' || var0 >= 'A' && var0 <= 'F';
   }
}
