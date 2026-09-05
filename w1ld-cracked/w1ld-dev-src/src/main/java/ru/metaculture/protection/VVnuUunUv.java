package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class VVnuUunUv implements O000c0oocoo {
   private static final long UuUVuuUu = 520L;
   private static float C00OOC00oO;
   private static float uUnuvNvvNU;
   private static float vVvUvVVuuNvV;
   private static float uNNnnnuuuN;
   private static float nuUnNvnuUu;
   private static class_243 VVuuUN;
   private static class_243 vNUvnnVnUvu;
   private static int uVUuuVnNVU;
   private static boolean vuuuNvNuv;
   private static long nUUVuvU;
   private static int UnUNVVVNuv;
   private static int vNVuvnUUnuUn = ThreadLocalRandom.current().nextInt(7, 15);
   private static boolean UvnvNVnnnnNU;
   private static long uVUVnuvnuVuv;
   private static int NVNnnvnuunNv = Integer.MIN_VALUE;
   private static boolean uVunuUNVVUUV;
   private static long UNnVVNvvnVvU;

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && a_.field_1687 != null && var0 != null) {
         uVunuUNVVUUV = false;
         long var1 = System.currentTimeMillis();
         C00OOC00oO(var0);
         VVuuUN = var0.method_19538()
            .method_1031(
               Math.sin(var1 / 900.0) * 0.2F, var0.method_17682() / 2.0F + var0.method_17682() / 2.5F * Math.sin(var1 / 700.0), Math.cos(var1 / 700.0) * 0.12F
            );
         vNUvnnVnUvu = a_.field_1724.method_33571();
         class_243 var3 = VVuuUN.method_1020(vNUvnnVnUvu).method_1029();
         float var4 = (float)Math.toDegrees(Math.atan2(-var3.field_1352, var3.field_1350));
         float var5 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var3.field_1351, Math.hypot(var3.field_1352, var3.field_1350))), -90.0, 90.0);
         float var6 = UuUVuuUu(3.0, 11.0, 90.0);
         float var7 = C00OOC00oO(3.0, 11.0, 100.0);
         uNNnnnuuuN = var6;
         nuUnNvnuUu = var7;
         float[] var8 = AttackAura.C00OOC00oO(var0);
         float[] var9 = new float[]{var8[0], var8[1], var8[0] + var8[1]};
         boolean var10 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, true, true, -200L, var9);
         if (var10) {
            C00OOC00oO = 1.0F;
         }

         if (UvnvNVnnnnNU) {
            if (var1 > uVUVnuvnuVuv) {
               UvnvNVnnnnNU = false;
            } else {
               uUnuvNvvNU = a_.field_1724.method_36454() - (ThreadLocalRandom.current().nextBoolean() ? -UuUVuuUu(20.0F, 40.0F) : UuUVuuUu(20.0F, 30.0F));
               vVvUvVVuuNvV = UuUVuuUu(85.0F, 90.0F);
            }
         }

         if (C00OOC00oO != 0.0F) {
            if (!UvnvNVnnnnNU) {
               uUnuvNvvNU = var4;
               vVvUvVVuuNvV = var5;
            }

            C00OOC00oO--;
         }

         if (vuuuNvNuv && var1 >= nUUVuvU) {
            vuuuNvNuv = false;
         }

         COC0OCc.UuUVuuUu(
            new uuUuvNuNVNVU(uUnuvNvvNU + var6, class_3532.method_15363(vVvUvVVuuNvV + var7, -90.0F, 90.0F)),
            UuUVuuUu(40.124813F, 55.41284F),
            UvnvNVnnnnNU ? 360.0F : UuUVuuUu(4.412848F, 12.412894F),
            UuUVuuUu(40.124813F, 140.41284F),
            UuUVuuUu(40.124813F, 140.41284F),
            0,
            1,
            false
         );
      }
   }

   public static void UuUVuuUu() {
      vuuuNvNuv = true;
      nUUVuvU = System.currentTimeMillis() + 150L;
      uVUuuVnNVU = (uVUuuVnNVU + 1) % 2;
      UnUNVVVNuv++;
      if (UnUNVVVNuv >= vNVuvnUUnuUn) {
         UnUNVVVNuv = 0;
         vNVuvnUUnuUn = ThreadLocalRandom.current().nextInt(4, 6);
         UvnvNVnnnnNU = true;
         uVUVnuvnuVuv = System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(60, 110);
      }
   }

   public static void C00OOC00oO() {
      if (a_.field_1724 != null && (uNNnnnuuuN() || uVunuUNVVUUV)) {
         if (!uVunuUNVVUUV) {
            uVunuUNVVUUV = true;
            UNnVVNvvnVvU = System.currentTimeMillis();
         }

         vVvUvVVuuNvV();
         UuUVuuUu(false);
      } else {
         UuUVuuUu(true);
      }
   }

   public static void uUnuvNvvNU() {
      if (uVunuUNVVUUV) {
         if (a_.field_1724 == null) {
            UuUVuuUu(true);
         } else {
            vVvUvVVuuNvV();
         }
      }
   }

   private static void vVvUvVVuuNvV() {
      long var0 = System.currentTimeMillis();
      float var2 = class_3532.method_15363((float)(var0 - UNnVVNvvnVvU) / 520.0F, 0.0F, 1.0F);
      float var3 = 1.0F - var2;
      float var4 = var3 * var3;
      float var5 = UuUVuuUu(3.0, 11.0, 90.0) * var4;
      float var6 = C00OOC00oO(3.0, 11.0, 100.0) * var4;
      float var7 = UuUVuuUu(5.0F, 42.0F, var4);
      float var8 = UuUVuuUu(3.0F, 18.0F, var4);
      float var9 = UuUVuuUu(4.0F, 32.0F, var4);
      COC0OCc.UuUVuuUu(
         new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU + var5, class_3532.method_15363(NNvvnnunn.vVvUvVVuuNvV + var6, -90.0F, 90.0F)),
         var7,
         var8,
         var9,
         var9,
         0,
         1,
         false
      );
      if (var2 >= 1.0F) {
         UuUVuuUu(true);
      }
   }

   private static void UuUVuuUu(boolean var0) {
      C00OOC00oO = 0.0F;
      uNNnnnuuuN = 0.0F;
      nuUnNvnuUu = 0.0F;
      VVuuUN = null;
      vNUvnnVnUvu = null;
      uVUuuVnNVU = 0;
      vuuuNvNuv = false;
      nUUVuvU = 0L;
      UnUNVVVNuv = 0;
      vNVuvnUUnuUn = ThreadLocalRandom.current().nextInt(7, 15);
      UvnvNVnnnnNU = false;
      uVUVnuvnuVuv = 0L;
      NVNnnvnuunNv = Integer.MIN_VALUE;
      if (var0) {
         uVunuUNVVUUV = false;
         UNnVVNvvnVvU = 0L;
         if (a_.field_1724 != null) {
            uUnuvNvvNU = a_.field_1724.method_36454();
            vVvUvVVuuNvV = a_.field_1724.method_36455();
         }
      }
   }

   private static void C00OOC00oO(class_1309 var0) {
      if (NVNnnvnuunNv != var0.method_5628()) {
         NVNnnvnuunNv = var0.method_5628();
         C00OOC00oO = 0.0F;
         UvnvNVnnnnNU = false;
         uUnuvNvvNU = a_.field_1724.method_36454();
         vVvUvVVuuNvV = a_.field_1724.method_36455();
      }
   }

   private static boolean uNNnnnuuuN() {
      return NVNnnvnuunNv != Integer.MIN_VALUE
         || VVuuUN != null
         || vNUvnnVnUvu != null
         || C00OOC00oO != 0.0F
         || vuuuNvNuv
         || UvnvNVnnnnNU
         || uNNnnnuuuN != 0.0F
         || nuUnNvnuUu != 0.0F;
   }

   private static float UuUVuuUu(float var0, float var1) {
      return ThreadLocalRandom.current().nextFloat(var0, var1);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private static float UuUVuuUu(double var0, double var2, double var4) {
      return (float)(Math.sin(System.currentTimeMillis() / var4) * UuUVuuUu((float)var0, (float)var2));
   }

   private static float C00OOC00oO(double var0, double var2, double var4) {
      return (float)(Math.cos(System.currentTimeMillis() / var4) * UuUVuuUu((float)var0, (float)var2));
   }
}
