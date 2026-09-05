package ru.metaculture.protection;

import net.minecraft.class_3532;

public class COC0OCc extends nvnnUuNnUvUN {
   private static COC0OCc.uunvUUVnuNn nUUVuvU;
   private static COC0OCc.NVnVnNnN UnUNVVVNuv;
   public static COC0OCc.VvunVVUvUNnv UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
   public static float C00OOC00oO;
   public static float uUnuvNvvNU;
   public static float vVvUvVVuuNvV;
   public static float uNNnnnuuuN;
   public static int nuUnNvnuUu;
   public static int VVuuUN;
   public static int vNUvnnVnUvu;
   public static uuUuvNuNVNVU uVUuuVnNVU;
   public static boolean vuuuNvNuv;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void UuUVuuUu(COC0OCc.uunvUUVnuNn var0, Runnable var1) {
      nUUVuvU = var0;
      boolean var4 = false /* VF: Semaphore variable */;

      try {
         var4 = true;
         var1.run();
         var4 = false;
      } finally {
         if (var4) {
            nUUVuvU = null;
         }
      }

      nUUVuvU = null;
   }

   public static boolean UuUVuuUu() {
      return !UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.IDLE);
   }

   private void uUnuvNvvNU() {
      if (UnUNVVVNuv != null) {
         COC0OCc.nvnNNunvv var2 = UnUNVVVNuv.nextStep();
         if (var2 != null && !var2.vVvUvVVuuNvV && var2.UuUVuuUu != null) {
            UuUVuuUu(var2.UuUVuuUu, var2.C00OOC00oO, var2.uUnuvNvvNU);
         } else {
            this.C00OOC00oO();
         }
      } else {
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU, NNvvnnunn.vVvUvVVuuNvV);
         if (UuUVuuUu(var1, vVvUvVVuuNvV, uNNnnnuuuN)) {
            this.C00OOC00oO();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNVVnVUNun var1) {
      nvNVUnVUUnun.UuUVuuUu(var1);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.AIM) && vNUvnnVnUvu > VVuuUN) {
         if (vuuuNvNuv) {
            this.C00OOC00oO();
         } else {
            UuUVuuUu = COC0OCc.VvunVVUvUNnv.RESET;
         }
      }

      if (UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.RESET)) {
         this.uUnuvNvvNU();
      }

      vNUvnnVnUvu++;
   }

   public static void UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2, float var3, float var4, int var5, int var6, boolean var7) {
      C00OOC00oO(var0, var1, var2, var3, var4, var5, var6, var7, null);
   }

   public static void UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2, float var3, float var4, int var5, int var6, boolean var7, COC0OCc.NVnVnNnN var8) {
      C00OOC00oO(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static void C00OOC00oO(uuUuvNuNVNVU var0, float var1, float var2, float var3, float var4, int var5, int var6, boolean var7, COC0OCc.NVnVnNnN var8) {
      if (nUUVuvU != null) {
         var1 = nUUVuvU.UuUVuuUu;
         var2 = nUUVuvU.C00OOC00oO;
         var3 = nUUVuvU.uUnuvNvvNU;
         var4 = nUUVuvU.vVvUvVVuuNvV;
         var7 = nUUVuvU.uNNnnnuuuN;
      }

      if (nuUnNvnuUu <= var6) {
         if (UUnnnNuuV.UuUVuuUu && var0 != null) {
            UUnnnNuuV.UuUVuuUu();
            float var9 = var0.UuUVuuUu + UUnnnNuuV.C00OOC00oO;
            float var10 = class_3532.method_15363(
               class_3532.method_15363(var0.C00OOC00oO + UUnnnNuuV.uUnuvNvvNU, UUnnnNuuV.vVvUvVVuuNvV, UUnnnNuuV.uNNnnnuuuN), -90.0F, 90.0F
            );
            var0 = new uuUuvNuNVNVU(var9, var10);
         }

         if (var7) {
            NNvvnnunn.UuUVuuUu = false;
            if (a_.field_1724 != null) {
               NNvvnnunn.uUnuvNvvNU = a_.field_1724.method_36454();
               NNvvnnunn.vVvUvVVuuNvV = a_.field_1724.method_36455();
            }
         } else if (UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.IDLE)) {
            NNvvnnunn.UuUVuuUu = true;
         }

         C00OOC00oO = var1;
         uUnuvNvvNU = var2;
         vVvUvVVuuNvV = var3;
         uNNnnnuuuN = var4;
         VVuuUN = var5;
         nuUnNvnuUu = var6;
         UuUVuuUu = COC0OCc.VvunVVUvUNnv.AIM;
         vuuuNvNuv = var7;
         UnUNVVVNuv = var8;
         uVUuuVnNVU = var0;
         UuUVuuUu(var0, var1, var2);
      }
   }

   public static void UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, true);
   }

   public static void UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2, int var3, int var4) {
      UuUVuuUu(var0, var1, var1, var2, var2, var3, var4, false);
   }

   public static void UuUVuuUu(COC0OCc.NVnVnNnN var0) {
      if (var0 != null && UnUNVVVNuv == var0 && !UuUVuuUu.equals(COC0OCc.VvunVVUvUNnv.IDLE)) {
         UuUVuuUu = COC0OCc.VvunVVUvUNnv.RESET;
         vuuuNvNuv = false;
         vNUvnnVnUvu = 0;
      }
   }

   public static void C00OOC00oO(COC0OCc.NVnVnNnN var0) {
      if (UnUNVVVNuv == var0) {
         UnUNVVVNuv = null;
      }
   }

   static boolean UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2) {
      if (a_.field_1724 == null) {
         return false;
      } else {
         uuUuvNuNVNVU var3 = new uuUuvNuNVNVU(a_.field_1724);
         float var4 = UuvVnuU.VVuuUN(var0.UuUVuuUu - var3.UuUVuuUu);
         float var5 = var0.C00OOC00oO - var3.C00OOC00oO;
         float var6 = Math.min(Math.abs(var4), var1);
         float var7 = Math.min(Math.abs(var5), var2);
         a_.field_1724.method_36456(a_.field_1724.field_6241 = a_.field_1724.field_6241 + uNvunUnUUnvV.UuUVuuUu(class_3532.method_15363(var4, -var6, var6)));
         a_.field_1724
            .method_36457(
               class_3532.method_15363(a_.field_1724.method_36455() + uNvunUnUUnvV.UuUVuuUu(class_3532.method_15363(var5, -var7, var7)), -90.0F, 90.0F)
            );
         vNUvnnVnUvu = 0;
         return new uuUuvNuNVNVU(a_.field_1724).UuUVuuUu(var0) < 1.0F;
      }
   }

   public void C00OOC00oO() {
      UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      nuUnNvnuUu = 0;
      vuuuNvNuv = false;
      UnUNVVVNuv = null;
      NNvvnnunn.UuUVuuUu = NNvvnnunn.C00OOC00oO;
   }

   @FunctionalInterface
   public interface NVnVnNnN {
      COC0OCc.nvnNNunvv nextStep();
   }

   public static enum VvunVVUvUNnv {
      AIM,
      RESET,
      IDLE;
   }

   public static final class nvnNNunvv {
      public final uuUuvNuNVNVU UuUVuuUu;
      public final float C00OOC00oO;
      public final float uUnuvNvvNU;
      public final boolean vVvUvVVuuNvV;

      public nvnNNunvv(uuUuvNuNVNVU var1, float var2, float var3, boolean var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }

      public static COC0OCc.nvnNNunvv UuUVuuUu() {
         return new COC0OCc.nvnNNunvv(null, 0.0F, 0.0F, true);
      }
   }

   public static final class uunvUUVnuNn {
      public final float UuUVuuUu;
      public final float C00OOC00oO;
      public final float uUnuvNvvNU;
      public final float vVvUvVVuuNvV;
      public final boolean uNNnnnuuuN;

      public uunvUUVnuNn(float var1, float var2, float var3, float var4, boolean var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
      }
   }
}
