package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class vVVnnuvuuV implements AutoCloseable {
   private static final vVVnnuvuuV UuUVuuUu = new vVVnnuvuuV();
   private static final String C00OOC00oO = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/mainmenu/porcelain_dawn.frag";
   private final uUvVUVnVNV vVvUvVVuuNvV = new uUvVUVnVNV();
   private nnUnNnuvvN uNNnnnuuuN;
   private uUvVUVnVNV.NVnVnNnN nuUnNvnuUu;
   private long VVuuUN = System.nanoTime();
   private long vNUvnnVnUvu;
   private float uVUuuVnNVU;
   private float vuuuNvNuv;
   private float nvUVNnuu;
   private float UuuNnUvUuv;

   public static vVVnnuvuuV UuUVuuUu() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(int var1, int var2, float var3, float var4, NUunUunuNV var5, float var6) {
      if (var1 > 0 && var2 > 0) {
         this.C00OOC00oO();
         VvuuVNVUn.NVnVnNnN var7 = VvuuVNVUn.UuUVuuUu();
         boolean var17 = false /* VF: Semaphore variable */;

         try {
            var17 = true;
            GL11.glViewport(0, 0, var1, var2);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(3089);
            GL11.glDisable(36281);
            GlStateManager._enableBlend();
            GlStateManager._blendFuncSeparate(770, 771, 1, 771);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            this.nuUnNvnuUu.UuUVuuUu();
            this.nuUnNvnuUu.UuUVuuUu("uViewport", var1, var2);
            this.nuUnNvnuUu.UuUVuuUu("uRect", 0.0F, 0.0F, var1, var2);
            long var8 = System.nanoTime();
            float var10 = (float)(var8 - this.VVuuUN) / 1.0E9F;
            float var11 = this.UuUVuuUu(var3 / Math.max(1.0F, (float)var1));
            float var12 = this.UuUVuuUu(var4 / Math.max(1.0F, (float)var2));
            this.UuUVuuUu(var11, var12, var8);
            this.nuUnNvnuUu.UuUVuuUu("uTime", var10);
            this.nuUnNvnuUu.UuUVuuUu("uResolution", var1, var2);
            this.nuUnNvnuUu.UuUVuuUu("uMouse", var11, var12);
            this.nuUnNvnuUu.UuUVuuUu("uMouseVelocity", this.nvUVNnuu, this.UuuNnUvUuv);
            int var13 = var5 == null ? -9816 : var5.uVunuUNVVUUV();
            int var14 = var5 == null ? -19589 : var5.UNnVVNvvnVvU();
            this.nuUnNvnuUu.UuUVuuUu("uAccentTop", this.UuUVuuUu(var13, 16), this.UuUVuuUu(var13, 8), this.UuUVuuUu(var13, 0));
            this.nuUnNvnuUu.UuUVuuUu("uAccentBottom", this.UuUVuuUu(var14, 16), this.UuUVuuUu(var14, 8), this.UuUVuuUu(var14, 0));
            this.nuUnNvnuUu.UuUVuuUu("uAlpha", this.UuUVuuUu(var6) * 0.85F);
            this.nuUnNvnuUu.UuUVuuUu("uLightMode", var5 != null && var5.uNnUnnuNUnNu() ? 1.0F : 0.0F);
            this.uNNnnnuuuN.UuUVuuUu();
            var17 = false;
         } finally {
            if (var17) {
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var7);
               GlStateManager._enableBlend();
               GlStateManager._blendFuncSeparate(770, 771, 1, 771);
            }
         }

         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var7);
         GlStateManager._enableBlend();
         GlStateManager._blendFuncSeparate(770, 771, 1, 771);
      }
   }

   private void UuUVuuUu(float var1, float var2, long var3) {
      if (this.vNUvnnVnUvu == 0L) {
         this.vNUvnnVnUvu = var3;
         this.uVUuuVnNVU = var1;
         this.vuuuNvNuv = var2;
         this.nvUVNnuu = 0.0F;
         this.UuuNnUvUuv = 0.0F;
      } else {
         float var5 = (float)(var3 - this.vNUvnnVnUvu) / 1.0E9F;
         this.vNUvnnVnUvu = var3;
         if (Float.isFinite(var5) && !(var5 <= 0.0F)) {
            var5 = Math.min(var5, 0.08F);
            float var6 = this.UuUVuuUu((var1 - this.uVUuuVnNVU) / var5, 4.0F);
            float var7 = this.UuUVuuUu((var2 - this.vuuuNvNuv) / var5, 4.0F);
            this.uVUuuVnNVU = var1;
            this.vuuuNvNuv = var2;
            float var8 = 1.0F - (float)Math.exp(-var5 * 16.0F);
            this.nvUVNnuu = this.nvUVNnuu + (var6 - this.nvUVNnuu) * var8;
            this.UuuNnUvUuv = this.UuuNnUvUuv + (var7 - this.UuuNnUvUuv) * var8;
         }
      }
   }

   private void C00OOC00oO() {
      if (this.uNNnnnuuuN == null) {
         this.uNNnnnuuuN = new nnUnNnuvvN();
      }

      if (this.nuUnNvnuUu == null) {
         this.nuUnNvnuUu = this.vVvUvVVuuNvV
            .UuUVuuUu("porcelain_dawn_click_gui", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/porcelain_dawn.frag");
      }
   }

   private float UuUVuuUu(int var1, int var2) {
      return (var1 >> var2 & 0xFF) / 255.0F;
   }

   private float UuUVuuUu(float var1) {
      return Math.max(0.0F, Math.min(1.0F, var1));
   }

   private float UuUVuuUu(float var1, float var2) {
      return Math.max(-var2, Math.min(var2, var1));
   }

   @Override
   public void close() {
      if (this.uNNnnnuuuN != null) {
         this.uNNnnnuuuN.close();
         this.uNNnnnuuuN = null;
      }

      this.vVvUvVVuuNvV.close();
      this.nuUnNvnuUu = null;
      this.VVuuUN = System.nanoTime();
      this.vNUvnnVnUvu = 0L;
      this.uVUuuVnNVU = 0.0F;
      this.vuuuNvNuv = 0.0F;
      this.nvUVNnuu = 0.0F;
      this.UuuNnUvUuv = 0.0F;
   }
}
