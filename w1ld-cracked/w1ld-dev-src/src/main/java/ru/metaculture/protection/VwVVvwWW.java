package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;

public class VwVVvwWW {
   private static final float uUnuvNvvNU = 0.35F;
   public static class_310 UuUVuuUu = class_310.method_1551();
   private static UnVnUVUUUVvn vVvUvVVuuNvV;
   private static class_1041 uNNnnnuuuN;
   private float nuUnNvnuUu;
   private float VVuuUN;
   private float vNUvnnVnUvu;
   private float uVUuuVnNVU = 8.0F;
   private boolean vuuuNvNuv;
   float C00OOC00oO;

   public static UnVnUVUUUVvn UuUVuuUu() {
      if (vVvUvVVuuNvV == null) {
         class_310 var0 = class_310.method_1551();
         if (var0 != null && var0.method_22683() != null) {
            vVvUvVVuuNvV = new UnVnUVUUUVvn(var0);
         }
      }

      return vVvUvVVuuNvV;
   }

   public static class_1041 C00OOC00oO() {
      if (uNNnnnuuuN == null) {
         class_310 var0 = class_310.method_1551();
         if (var0 != null) {
            uNNnnnuuuN = var0.method_22683();
         }
      }

      return uNNnnnuuuN;
   }

   public VwVVvwWW() {
      this.UuUVuuUu(true);
   }

   public void uUnuvNvvNU() {
      this.VVuuUN = this.UuUVuuUu(this.VVuuUN, this.nuUnNvnuUu, UuvVnuU.nuUnNvnuUu((double)(this.uVUuuVnNVU / 100.0F)));
      if (Math.abs(this.nuUnNvnuUu - this.VVuuUN) <= 0.35F) {
         this.VVuuUN = this.nuUnNvnuUu;
      }
   }

   public void UuUVuuUu(double var1) {
      if (this.vuuuNvNuv) {
         float var3 = (float)var1 * (this.uVUuuVnNVU * 10.0F);
         float var4 = 0.0F;
         this.nuUnNvnuUu = Math.min(Math.max(this.nuUnNvnuUu + var3 / 2.0F, this.vNUvnnVnUvu - var4), var4);
      }
   }

   public <T extends Number> T UuUVuuUu(T var1, T var2, double var3) {
      double var5 = var1.doubleValue();
      double var7 = var2.doubleValue();
      double var9 = var5 + var3 * (var7 - var5);
      if (var1 instanceof Integer) {
         return (T)(int)Math.round(var9);
      } else if (var1 instanceof Double) {
         return (T)var9;
      } else if (var1 instanceof Float) {
         return (T)(float)var9;
      } else if (var1 instanceof Long) {
         return (T)Math.round(var9);
      } else if (var1 instanceof Short) {
         return (T)(short)Math.round(var9);
      } else if (var1 instanceof Byte) {
         return (T)(byte)Math.round(var9);
      } else {
         throw new IllegalArgumentException("Unsupported type: " + var1.getClass().getSimpleName());
      }
   }

   public static void vVvUvVVuuNvV() {
      GL11.glEnable(3089);
   }

   public static void uNNnnnuuuN() {
      GL11.glDisable(3089);
   }

   public static void UuUVuuUu(class_1041 var0, double var1, double var3, double var5, double var7) {
      if (var1 + var5 != var1 && var3 + var7 != var3 && !(var1 < 0.0) && !(var3 + var7 < 0.0)) {
         double var9 = var0.method_4495();
         GL11.glScissor(
            (int)Math.round(var1 * var9),
            (int)Math.round((var0.method_4502() - (var3 + var7)) * var9),
            (int)Math.round(var5 * var9),
            (int)Math.round(var7 * var9)
         );
      }
   }

   public void nuUnNvnuUu() {
      this.VVuuUN = 0.0F;
      this.nuUnNvnuUu = 0.0F;
   }

   public void UuUVuuUu(float var1, float var2) {
      this.vNUvnnVnUvu = -var1 + var2;
   }

   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6) {
      if (!(this.uVUuuVnNVU() >= 0.0F)) {
         float var7 = this.uVUuuVnNVU() != 0.0F ? this.vNUvnnVnUvu() / this.uVUuuVnNVU() : 0.0F;
         float var8 = var5 - this.uVUuuVnNVU() / (this.uVUuuVnNVU() - var5) * var5;
         this.C00OOC00oO = UuvVnuU.UuUVuuUu(var8, this.C00OOC00oO, UuvVnuU.nuUnNvnuUu(0.9F));
         boolean var9 = this.C00OOC00oO < var5 && this.C00OOC00oO > 0.0F;
         if (var9) {
            float var11 = var3 + var5 * var7 - this.C00OOC00oO * var7;
            int var12 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)UuvVnuU.vuuuNvNuv(255.0F * var6, 0.0F, 255.0F));
            int var13 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)UuvVnuU.vuuuNvNuv(20.0F * var6, 0.0F, 20.0F));
            var1.UuUVuuUu(var2, var3, var4, var5, var13);
            var1.UuUVuuUu(var2, var11, var4, this.C00OOC00oO, 1.0F, var12);
         }
      }
   }

   public float VVuuUN() {
      return this.nuUnNvnuUu;
   }

   public void UuUVuuUu(float var1) {
      this.nuUnNvnuUu = var1;
   }

   public float vNUvnnVnUvu() {
      return Math.abs(this.nuUnNvnuUu - this.VVuuUN) <= 0.35F ? Math.round(this.VVuuUN) : this.VVuuUN;
   }

   public void C00OOC00oO(float var1) {
      this.VVuuUN = var1;
   }

   public float uVUuuVnNVU() {
      return this.vNUvnnVnUvu;
   }

   public void uUnuvNvvNU(float var1) {
      this.vNUvnnVnUvu = var1;
   }

   public float vuuuNvNuv() {
      return this.uVUuuVnNVU;
   }

   public void vVvUvVVuuNvV(float var1) {
      this.uVUuuVnNVU = var1;
   }

   public boolean nvUVNnuu() {
      return this.vuuuNvNuv;
   }

   public void UuUVuuUu(boolean var1) {
      this.vuuuNvNuv = var1;
   }
}
