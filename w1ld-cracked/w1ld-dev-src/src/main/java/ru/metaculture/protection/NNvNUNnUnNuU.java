package ru.metaculture.protection;

public class NNvNUNnUnNuU extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(int var0, int var1, int var2) {
      VnnUvVNuNuVv var4 = UUVNUUUnNUv.vNVuvnUUnuUn;
      if (var4 instanceof VnnUvVNuNuVv && (UUVNUUUnNUv.UvnvNVnnnnNU != 0.0F || UUVNUUUnNUv.uVUVnuvnuVuv != 0.0F)) {
         float var13 = UvNnVvNNVvuN.UuUVuuUu(UUVNUUUnNUv.UvnvNVnnnnNU);
         float var5 = UUVNUUUnNUv.uVUVnuvnuVuv;
         float var6 = UvNnVvNNVvuN.C00OOC00oO(var13);
         float var7 = UvNnVvNNVvuN.uUnuvNvvNU(var5);
         float var8 = UvNnVvNNVvuN.vVvUvVVuuNvV(var13);
         float var9 = UvNnVvNNVvuN.uNNnnnuuuN(var5);
         float var10 = UvNnVvNNVvuN.nuUnNvnuUu(var5);
         float var11 = UvNnVvNNVvuN.VVuuUN(var5);
         float var12 = 148.0F;
         if (var2 == 0 && VunVVUVnvv.UuUVuuUu(var0, var1, var6, var7, 132.0F, 62.0F)) {
            UUVNUUUnNUv.NVNnnvnuunNv = true;
            UUVNUUUnNUv.uVunuUNVVUUV = false;
            UUVNUUUnNUv.UNnVVNvvnVvU = false;
            UuUVuuUu(var4, var0, var1, var6, var7);
            C00OOC00oO();
            return true;
         } else if (var2 == 0 && VunVVUVnvv.UuUVuuUu(var0, var1, var8, var7, 10.0F, 62.0F)) {
            UUVNUUUnNUv.uVunuUNVVUUV = true;
            UUVNUUUnNUv.NVNnnvnuunNv = false;
            UUVNUUUnNUv.UNnVVNvvnVvU = false;
            UuUVuuUu(var4, var1, var7);
            C00OOC00oO();
            return true;
         } else if (var2 == 0 && VunVVUVnvv.UuUVuuUu(var0, var1, var6, var9, var12, 7.0F)) {
            UUVNUUUnNUv.UNnVVNvvnVvU = true;
            UUVNUUUnNUv.uVunuUNVVUUV = false;
            UUVNUUUnNUv.NVNnnvnuunNv = false;
            UuUVuuUu(var4, var0, var6, var12);
            C00OOC00oO();
            return true;
         } else if (var2 == 0 && VunVVUVnvv.UuUVuuUu(var0, var1, var6, var10, var12, 10.0F)) {
            C00OOC00oO(var4, var0, var6, var12);
            C00OOC00oO();
            return true;
         } else if ((var2 == 0 || var2 == 1) && VunVVUVnvv.UuUVuuUu(var0, var1, var6, var11, var12, 10.0F)) {
            UuUVuuUu(var4, var0, var6, var12, var2 == 1);
            C00OOC00oO();
            return true;
         } else {
            return VunVVUVnvv.UuUVuuUu(var0, var1, var13, var5, 160.0F, 119.0F);
         }
      } else {
         return false;
      }
   }

   public static void UuUVuuUu(VnnUvVNuNuVv var0, int var1, int var2, float var3, float var4) {
      float var5 = Math.max(0.0F, Math.min(var1 - var3, 132.0F));
      float var6 = Math.max(0.0F, Math.min(var2 - var4, 62.0F));
      var0.nUUVuvU = var5 / 132.0F;
      var0.UnUNVVVNuv = 1.0F - var6 / 62.0F;
   }

   public static void UuUVuuUu(VnnUvVNuNuVv var0, int var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(var1 - var2, 62.0F));
      var0.UuUVuuUu(var3 / 62.0F * 360.0F);
   }

   public static void UuUVuuUu(VnnUvVNuNuVv var0, int var1, float var2, float var3) {
      var0.C00OOC00oO((var1 - var2) / var3);
   }

   private static void C00OOC00oO(VnnUvVNuNuVv var0, int var1, float var2, float var3) {
      byte var4 = 5;
      int var5 = Math.max(0, Math.min(var4 - 1, (int)((var1 - var2) / var3 * var4)));
      float[] var6 = new float[]{0.0F, 180.0F, -30.0F, 30.0F, 120.0F};
      var0.UuUVuuUu(var0.uNNnnnuuuN() + var6[var5]);
      if (var0.nUUVuvU < 0.05F) {
         var0.nUUVuvU = 0.65F;
      }

      if (var0.UnUNVVVNuv < 0.08F) {
         var0.UnUNVVVNuv = 0.85F;
      }
   }

   private static void UuUVuuUu(VnnUvVNuNuVv var0, int var1, float var2, float var3, boolean var4) {
      byte var5 = 9;
      int var6 = Math.max(0, Math.min(var5 - 1, (int)((var1 - var2) / var3 * var5)));
      if (var6 == 8) {
         if (!var4) {
            var0.VVuuUN();
         }
      } else {
         if (var4) {
            var0.vVvUvVVuuNvV(var6);
         } else {
            var0.uUnuvNvvNU(var6);
         }
      }
   }

   private static void C00OOC00oO() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }
}
