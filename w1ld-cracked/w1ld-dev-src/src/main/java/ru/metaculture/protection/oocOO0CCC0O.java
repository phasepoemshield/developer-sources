package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_437;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class oocOO0CCC0O {
   private static final oocOO0CCC0O UuUVuuUu = new oocOO0CCC0O();
   private static final int C00OOC00oO = 5;
   private static final long uUnuvNvvNU = 760000000L;
   private static final long vVvUvVVuuNvV = 1860000000L;
   private final oocOO0CCC0O.nvnNNunvv[] uNNnnnuuuN = new oocOO0CCC0O.nvnNNunvv[5];
   private final float[] nuUnNvnuUu = new float[10];
   private final float[] VVuuUN = new float[5];
   private final float[] vNUvnnVnUvu = new float[5];
   private final float[] uVUuuVnNVU = new float[5];
   private final float[] vuuuNvNuv = new float[15];
   private final float[] nvUVNnuu = new float[15];
   private final float[] UuuNnUvUuv = new float[15];
   private final float[] nUUVuvU = new float[15];
   private final float[] UnUNVVVNuv = new float[4];
   private final float[] vNVuvnUUnuUn = new float[4];
   private final float[] UvnvNVnnnnNU = new float[2];
   private final UNVUNunnvnNU uVUVnuvnuVuv = new UNVUNunnvnNU();
   private boolean NVNnnvnuunNv;
   private oocOO0CCC0O.NVnVnNnN uVunuUNVVUUV;
   private vVvUNNUVVnNn UNnVVNvvnVvU;
   private int uNnUnnuNUnNu = -1;
   private int NnUuNNU = -1;
   private int nNvNUVU = -1;
   private int UnUNuUU = -1;
   private int uUVuVvuNUvnu = -1;
   private int UvUvUNuvNU = -1;
   private int c0oOOCcCoC0 = -1;
   private int VVnVNnunVvu = -1;
   private int unNNVVNnvvV = -1;
   private int NuunnvnN = -1;
   private int NVUunUNUN = -1;
   private int UUVNuUNUvUnV = -1;
   private int vuvnUnVnUNnV = -1;
   private int nnuUVNUuvvVU = -1;

   private oocOO0CCC0O() {
      for (int var1 = 0; var1 < this.uNNnnnuuuN.length; var1++) {
         this.uNNnnnuuuN[var1] = new oocOO0CCC0O.nvnNNunvv();
      }
   }

   public static oocOO0CCC0O UuUVuuUu() {
      return UuUVuuUu;
   }

   public void C00OOC00oO() {
      if (!this.NVNnnvnuunNv) {
         this.NVNnnvnuunNv = true;
         NUvnVVNvvu.UuUVuuUu(this);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (var1.vuuuNvNuv()) {
         if (Menu.UuUVuuUu(Menu.unNNVVNnvvV)) {
            class_310 var2 = class_310.method_1551();
            if (var2 != null && var2.field_1755 != null) {
               class_1041 var3 = var2.method_22683();
               if (var3 != null && !var3.method_65966()) {
                  int var4 = var3.method_4489();
                  int var5 = var3.method_4506();
                  int var6 = var3.method_4480();
                  int var7 = var3.method_4507();
                  if (var4 > 0 && var5 > 0 && var6 > 0 && var7 > 0) {
                     float var8 = UuUVuuUu((float)(var1.VVuuUN() * var4 / var6), 0.0F, Math.max(0.0F, var4 - 1.0F));
                     float var9 = UuUVuuUu((float)(var1.vNUvnnVnUvu() * var5 / var7), 0.0F, Math.max(0.0F, var5 - 1.0F));
                     this.UuUVuuUu(var8, var9, this.UuUVuuUu(var1.vVvUvVVuuNvV()), -1, -2232577, 0.0F, 760000000L);
                  }
               }
            }
         }
      }
   }

   public void UuUVuuUu(float var1, float var2, int var3, int var4) {
      this.UuUVuuUu(var1, var2, var3, var4, var3, var4);
   }

   public void UuUVuuUu(float var1, float var2, int var3, int var4, int var5, int var6) {
      this.UuUVuuUu(var1, var2, 1.24F, var3, var4, var5, var6, 1.0F, 1860000000L);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.UnUNVVVNuv[0] = Math.max(0.0F, var1);
      this.UnUNVVVNuv[1] = Math.max(0.0F, var2);
      this.UnUNVVVNuv[2] = Math.max(0.0F, var3);
      this.UnUNVVVNuv[3] = Math.max(0.0F, var4);
      this.vNVuvnUUnuUn[0] = Math.max(0.0F, var6);
      this.vNVuvnUUnuUn[1] = Math.max(0.0F, var7);
      this.vNVuvnUUnuUn[2] = Math.max(0.0F, var8);
      this.vNVuvnUUnuUn[3] = Math.max(0.0F, var9);
      this.UvnvNVnnnnNU[0] = Math.max(0.0F, var5);
      this.UvnvNVnnnnNU[1] = Math.max(0.0F, var10);
   }

   public boolean UuUVuuUu(class_437 var1) {
      this.C00OOC00oO(System.nanoTime());
      return var1 != null && !this.C00OOC00oO(var1) && this.vNUvnnVnUvu();
   }

   public boolean UuUVuuUu(Object var1) {
      this.C00OOC00oO(System.nanoTime());
      return var1 != null && this.C00OOC00oO(var1) && this.vNUvnnVnUvu();
   }

   public boolean UuUVuuUu(int var1, int var2) {
      this.C00OOC00oO(System.nanoTime());
      if (this.uVunuUNVVUUV == null && var1 > 0 && var2 > 0 && this.vNUvnnVnUvu()) {
         this.uUnuvNvvNU(var1, var2);
         VvuuVNVUn.NVnVnNnN var3 = VvuuVNVUn.UuUVuuUu();
         this.uVunuUNVVUUV = new oocOO0CCC0O.NVnVnNnN(var3, var1, var2);
         GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv.UuUVuuUu);
         GL11.glViewport(0, 0, var1, var2);
         GL11.glDisable(3089);
         GL11.glDisable(36281);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(true);
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16640);
         return true;
      } else {
         return false;
      }
   }

   public void uUnuvNvvNU() {
      oocOO0CCC0O.NVnVnNnN var1 = this.uVunuUNVVUUV;
      if (var1 != null) {
         this.uVunuUNVVUUV = null;
         VvuuVNVUn.uUnuvNvvNU(var1.snapshot());
         VvuuVNVUn.NVnVnNnN var2 = VvuuVNVUn.UuUVuuUu();

         try {
            this.vVvUvVVuuNvV(var1.width(), var1.height());
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var2);
         }
      }
   }

   public void vVvUvVVuuNvV() {
      long var1 = System.nanoTime();
      this.C00OOC00oO(var1);
      if (this.uVunuUNVVUUV == null && this.vNUvnnVnUvu()) {
         class_310 var3 = class_310.method_1551();
         if (var3 != null && var3.method_22683() != null && !var3.method_22683().method_65966()) {
            vnuUvuuNVNUU var4 = ru.metaculture.protection.NVnVnNnN.uUnuvNvvNU();
            if (var4 != null) {
               this.nuUnNvnuUu();
               vnuUvuuNVNUU.NVnVnNnN var5 = var4.vVvUvVVuuNvV();
               if (var5.colorTexture() > 0 && var5.width() > 0 && var5.height() > 0) {
                  this.UuUVuuUu(var5.colorTexture(), var5.width(), var5.height(), false);
               }
            }
         }
      }
   }

   public void C00OOC00oO(int var1, int var2) {
      this.uVunuUNVVUUV = null;
      if (var1 > 0 && var2 > 0) {
         if (this.uVUVnuvnuVuv.vVvUvVVuuNvV != var1 || this.uVUVnuvnuVuv.uNNnnnuuuN != var2) {
            this.uVUVnuvnuVuv.UuUVuuUu();
            this.uVUuuVnNVU();
         }
      } else {
         this.uVUVnuvnuVuv.UuUVuuUu();
         this.uVUuuVnNVU();
      }
   }

   public void UuUVuuUu(boolean var1) {
      if (!var1) {
         this.uVunuUNVVUUV = null;
         this.uVUuuVnNVU();
      }
   }

   public void uNNnnnuuuN() {
      this.uVunuUNVVUUV = null;
      this.uVUuuVnNVU();
   }

   private boolean C00OOC00oO(Object var1) {
      return var1 instanceof nuUnNNVUUnU || var1 instanceof nNVvvnU || var1 instanceof o00Co0coo0o || var1 instanceof uNVUuVuNNUvn;
   }

   private void uUnuvNvvNU(int var1, int var2) {
      this.uVUVnuvnuVuv.UuUVuuUu(var1, var2);
      this.nuUnNvnuUu();
   }

   private void nuUnNvnuUu() {
      if (this.UNnVVNvvnVvU == null) {
         this.UNnVVNvvnVvU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/postfx/gui_ripple.frag");
         this.uNnUnnuNUnNu = this.UNnVVNvvnVvU.UuUVuuUu("uSource");
         this.NnUuNNU = this.UNnVVNvvnVvU.UuUVuuUu("uResolution");
         this.nNvNUVU = this.UNnVVNvvnVvU.UuUVuuUu("uRippleCount");
         this.UnUNuUU = this.UNnVVNvvnVvU.UuUVuuUu("uRippleCenter[0]");
         this.uUVuVvuNUvnu = this.UNnVVNvvnVvU.UuUVuuUu("uRippleAge[0]");
         this.UvUvUNuvNU = this.UNnVVNvvnVvU.UuUVuuUu("uRipplePower[0]");
         this.c0oOOCcCoC0 = this.UNnVVNvvnVvU.UuUVuuUu("uRippleKind[0]");
         this.VVnVNnunVvu = this.UNnVVNvvnVvU.UuUVuuUu("uRipplePreviousColorTop[0]");
         this.unNNVVNnvvV = this.UNnVVNvvnVvU.UuUVuuUu("uRipplePreviousColorBottom[0]");
         this.NuunnvnN = this.UNnVVNvvnVvU.UuUVuuUu("uRippleColorTop[0]");
         this.NVUunUNUN = this.UNnVVNvvnVvU.UuUVuuUu("uRippleColorBottom[0]");
         this.UUVNuUNUvUnV = this.UNnVVNvvnVvU.UuUVuuUu("uThemeGuiRect");
         this.vuvnUnVnUNnV = this.UNnVVNvvnVvU.UuUVuuUu("uThemePanelRect");
         this.nnuUVNUuvvVU = this.UNnVVNvvnVvU.UuUVuuUu("uThemeRadii");
      }
   }

   private void vVvUvVVuuNvV(int var1, int var2) {
      this.UuUVuuUu(this.uVUVnuvnuVuv.C00OOC00oO, var1, var2, true);
   }

   private void UuUVuuUu(int var1, int var2, int var3, boolean var4) {
      long var5 = System.nanoTime();
      int var7 = this.UuUVuuUu(var5);
      vnuUvuuNVNUU var8 = ru.metaculture.protection.NVnVnNnN.uUnuvNvvNU();
      if (var8 != null) {
         var8.UuUVuuUu(var1, var2, var3, this.UNnVVNvvnVvU, () -> {
            if (this.uNnUnnuNUnNu >= 0) {
               GL20.glUniform1i(this.uNnUnnuNUnNu, 0);
            }

            if (this.NnUuNNU >= 0) {
               GL20.glUniform2f(this.NnUuNNU, var2, var3);
            }

            if (this.nNvNUVU >= 0) {
               GL20.glUniform1i(this.nNvNUVU, var7);
            }

            this.VVuuUN();
         }, var4);
      }
   }

   private int UuUVuuUu(long var1) {
      int var3 = 0;

      for (int var4 = 0; var4 < 5; var4++) {
         oocOO0CCC0O.nvnNNunvv var5 = this.uNNnnnuuuN[var4];
         if (var5.UuUVuuUu) {
            float var6 = (float)(var1 - var5.C00OOC00oO) / (float)var5.nvUVNnuu;
            if (var6 >= 1.0F) {
               var5.UuUVuuUu = false;
            } else {
               this.nuUnNvnuUu[var3 * 2] = var5.uUnuvNvvNU;
               this.nuUnNvnuUu[var3 * 2 + 1] = var5.vVvUvVVuuNvV;
               this.VVuuUN[var3] = UuUVuuUu(var6, 0.0F, 1.0F);
               this.vNUvnnVnUvu[var3] = var5.uNNnnnuuuN;
               this.uVUuuVnNVU[var3] = var5.nuUnNvnuUu;
               UuUVuuUu(var5.VVuuUN, this.vuuuNvNuv, var3 * 3);
               UuUVuuUu(var5.vNUvnnVnUvu, this.nvUVNnuu, var3 * 3);
               UuUVuuUu(var5.uVUuuVnNVU, this.UuuNnUvUuv, var3 * 3);
               UuUVuuUu(var5.vuuuNvNuv, this.nUUVuvU, var3 * 3);
               var3++;
            }
         }
      }

      for (int var7 = var3; var7 < 5; var7++) {
         this.nuUnNvnuUu[var7 * 2] = 0.0F;
         this.nuUnNvnuUu[var7 * 2 + 1] = 0.0F;
         this.VVuuUN[var7] = 1.0F;
         this.vNUvnnVnUvu[var7] = 0.0F;
         this.uVUuuVnNVU[var7] = 0.0F;
         UuUVuuUu(-1, this.vuuuNvNuv, var7 * 3);
         UuUVuuUu(-2232577, this.nvUVNnuu, var7 * 3);
         UuUVuuUu(-1, this.UuuNnUvUuv, var7 * 3);
         UuUVuuUu(-2232577, this.nUUVuvU, var7 * 3);
      }

      return var3;
   }

   private void VVuuUN() {
      if (this.UnUNuUU >= 0) {
         GL20.glUniform2fv(this.UnUNuUU, this.nuUnNvnuUu);
      }

      if (this.uUVuVvuNUvnu >= 0) {
         GL20.glUniform1fv(this.uUVuVvuNUvnu, this.VVuuUN);
      }

      if (this.UvUvUNuvNU >= 0) {
         GL20.glUniform1fv(this.UvUvUNuvNU, this.vNUvnnVnUvu);
      }

      if (this.c0oOOCcCoC0 >= 0) {
         GL20.glUniform1fv(this.c0oOOCcCoC0, this.uVUuuVnNVU);
      }

      if (this.VVnVNnunVvu >= 0) {
         GL20.glUniform3fv(this.VVnVNnunVvu, this.vuuuNvNuv);
      }

      if (this.unNNVVNnvvV >= 0) {
         GL20.glUniform3fv(this.unNNVVNnvvV, this.nvUVNnuu);
      }

      if (this.NuunnvnN >= 0) {
         GL20.glUniform3fv(this.NuunnvnN, this.UuuNnUvUuv);
      }

      if (this.NVUunUNUN >= 0) {
         GL20.glUniform3fv(this.NVUunUNUN, this.nUUVuvU);
      }

      if (this.UUVNuUNUvUnV >= 0) {
         GL20.glUniform4fv(this.UUVNuUNUvUnV, this.UnUNVVVNuv);
      }

      if (this.vuvnUnVnUNnV >= 0) {
         GL20.glUniform4fv(this.vuvnUnVnUNnV, this.vNVuvnUUnuUn);
      }

      if (this.nnuUVNUuvvVU >= 0) {
         GL20.glUniform2fv(this.nnuUVNUuvvVU, this.UvnvNVnnnnNU);
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3, int var4, int var5, float var6, long var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var4, var5, var6, var7);
   }

   private void UuUVuuUu(float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, long var9) {
      if (!nuuvUNvn.C00OOC00oO()) {
         long var11 = System.nanoTime();
         oocOO0CCC0O.nvnNNunvv var13 = null;
         oocOO0CCC0O.nvnNNunvv var14 = this.uNNnnnuuuN[0];

         for (oocOO0CCC0O.nvnNNunvv var18 : this.uNNnnnuuuN) {
            if (!var18.UuUVuuUu) {
               var13 = var18;
               break;
            }

            if (var18.C00OOC00oO < var14.C00OOC00oO) {
               var14 = var18;
            }
         }

         if (var13 == null) {
            var13 = var14;
         }

         var13.UuUVuuUu = true;
         var13.uUnuvNvvNU = var1;
         var13.vVvUvVVuuNvV = var2;
         var13.uNNnnnuuuN = var3;
         var13.nuUnNvnuUu = var8;
         var13.VVuuUN = var4;
         var13.vNUvnnVnUvu = var5;
         var13.uVUuuVnNVU = var6;
         var13.vuuuNvNuv = var7;
         var13.nvUVNnuu = Math.max(1L, var9);
         var13.C00OOC00oO = var11;
      }
   }

   private void C00OOC00oO(long var1) {
      for (oocOO0CCC0O.nvnNNunvv var6 : this.uNNnnnuuuN) {
         if (var6.UuUVuuUu && var1 - var6.C00OOC00oO >= var6.nvUVNnuu) {
            var6.UuUVuuUu = false;
         }
      }
   }

   private boolean vNUvnnVnUvu() {
      for (oocOO0CCC0O.nvnNNunvv var4 : this.uNNnnnuuuN) {
         if (var4.UuUVuuUu) {
            return true;
         }
      }

      return false;
   }

   private void uVUuuVnNVU() {
      for (oocOO0CCC0O.nvnNNunvv var4 : this.uNNnnnuuuN) {
         var4.UuUVuuUu = false;
         var4.C00OOC00oO = 0L;
         var4.uUnuvNvvNU = 0.0F;
         var4.vVvUvVVuuNvV = 0.0F;
         var4.uNNnnnuuuN = 0.0F;
         var4.nuUnNvnuUu = 0.0F;
         var4.VVuuUN = -1;
         var4.vNUvnnVnUvu = -2232577;
         var4.uVUuuVnNVU = -1;
         var4.vuuuNvNuv = -2232577;
         var4.nvUVNnuu = 760000000L;
      }
   }

   private float UuUVuuUu(int var1) {
      return switch (var1) {
         case 0 -> 0.9F;
         case 1 -> 0.84F;
         case 2 -> 0.96F;
         default -> 0.86F;
      };
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static void UuUVuuUu(int var0, float[] var1, int var2) {
      var1[var2] = (var0 >>> 16 & 0xFF) / 255.0F;
      var1[var2 + 1] = (var0 >>> 8 & 0xFF) / 255.0F;
      var1[var2 + 2] = (var0 & 0xFF) / 255.0F;
   }

   record NVnVnNnN(VvuuVNVUn.NVnVnNnN snapshot, int width, int height) {
   }

   static final class nvnNNunvv {
      boolean UuUVuuUu;
      long C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      int VVuuUN = -1;
      int vNUvnnVnUvu = -2232577;
      int uVUuuVnNVU = -1;
      int vuuuNvNuv = -2232577;
      long nvUVNnuu = 760000000L;
   }
}
