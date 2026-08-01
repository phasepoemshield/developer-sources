package ru.metaculture.protection;

import java.util.List;
import java.util.Map;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Trails",
   O000000000 = "Оставляет за игроком красивый след.",
   O0000000000 = Category.Visuals
)
public final class Trails extends Module implements O000000O00000 {
   private static final int O000000000O0 = 64;
   private static final int O000000000O00 = 65;
   private static final int O000000000O000 = 4;
   private static final int O000000000O00O = 14;
   private static final int O000000000O0O = 12;
   private static final int O000000000O0O0 = 926;
   private static final double O000000000O0OO = 0.0036;
   private static final double O000000000OO = 0.00108;
   private static final double O000000000OO0 = 36.0;
   private static final float O000000000OO00 = 0.3F;
   private static final float O000000000OO0O = 1.45F;
   private static final float O000000000OOO = 0.42F;
   private static final float O000000000OOO0 = 0.95F;
   private static final float O000000000OOOO = 0.3F;
   private static final float O00000000O = 0.3F;
   private static final float O00000000O0 = 0.18F;
   private static final float O00000000O00 = 0.4F;
   private static final float O00000000O000 = 0.16F;
   private static final float O00000000O0000 = 3.8F;
   private static final float O00000000O000O = 11.0F;
   private static final float O00000000O00O = 5.5F;
   private static final double O00000000O00O0 = 0.36;
   private static final float O00000000O00OO = 12.0F;
   private static final float O00000000O0O = 0.5F;
   private static final long O00000000O0O0 = System.nanoTime();
   public static final O000000O00 O000000000O = new O000000O00("Foundry Shader", O00000OOOO00O.TRAILS);
   private static final float[] O00000000O0O00 = new float[13];
   private static final float[] O00000000O0O0O = new float[13];
   private static final float[] O00000000O0OO = new float[13];
   private final double[] O00000000O0OO0 = new double[64];
   private final double[] O00000000O0OOO = new double[64];
   private final double[] O00000000OO = new double[64];
   private final float[] O00000000OO0 = new float[64];
   private int O00000000OO00;
   private final double[] O00000000OO000 = new double[65];
   private final double[] O00000000OO00O = new double[65];
   private final double[] O00000000OO0O = new double[65];
   private final float[] O00000000OO0O0 = new float[65];
   private final double[] O00000000OO0OO = new double[926];
   private final double[] O00000000OOO = new double[926];
   private final double[] O00000000OOO0 = new double[926];
   private final double[] O00000000OOO00 = new double[926];
   private final double[] O00000000OOO0O = new double[926];
   private final double[] O00000000OOOO = new double[926];
   private final double[] O00000000OOOO0 = new double[926];
   private final double[] O00000000OOOOO = new double[926];
   private final double[] O0000000O = new double[926];
   private final float[] O0000000O0 = new float[926];
   private final float[] O0000000O00 = new float[926];
   private int O0000000O000;
   private long O0000000O0000;
   private float O0000000O00000 = 0.18F;
   private double O0000000O0000O;
   private double O0000000O000O;
   private double O0000000O000O0;
   private float O0000000O000OO;
   private boolean O0000000O00O;
   private float O0000000O00O0 = 0.95F;
   private final Trails.W190 O0000000O00O00 = new Trails.W190();

   public Trails() {
      O00000O0OO0O0.O00000000();
      this.O00000000(new Setting[]{O000000000O});
   }

   @Override
   public void O00000000() {
      this.O0000000000O00();
      super.O00000000();
      O000000O000000.O00000000().O00000000(this, this);
   }

   @Override
   public void O000000000() {
      O000000O000000.O00000000().O00000000(this);
      this.O0000000000O00();
      super.O000000000();
   }

   @Override
   public O00000OOOO00O O0000000000() {
      return O00000OOOO00O.TRAILS;
   }

   @Override
   public String O00000000000() {
      String var1 = O0000000000O0();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   @Override
   public boolean O000000000000() {
      return true;
   }

   public static String O0000000000O0() {
      String var0 = O000000000O.O0000000000O0();
      return var0 == null ? "" : var0;
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O0000000000O00();
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      O000000O000000.O00000000().O000000000(this, this);
      if (O0000000000.world != null && O0000000000.player != null) {
         if (O0000000000.options != null && O0000000000.options.getPerspective() != null && !O0000000000.options.getPerspective().isFirstPerson()) {
            long var2 = System.nanoTime();
            float var4 = this.O0000000O0000 == 0L ? 0.0F : Math.min((float)(var2 - this.O0000000O0000) / 1.0E9F, 0.1F);
            this.O0000000O0000 = var2;
            float var5;
            if (O0000000000.player.isGliding()) {
               var5 = 0.3F;
            } else if (O0000000000.player.isSwimming()) {
               var5 = 0.3F;
            } else {
               var5 = 0.95F;
            }

            float var6 = 1.0F - (float)Math.exp(-8.0F * var4);
            this.O0000000O00O0 = this.O0000000O00O0 + (var5 - this.O0000000O00O0) * var6;
            Vec3d var7 = O0000000000.player.getLerpedPos(o0000000OO0000.O00000000000());
            double var8 = var7.x;
            double var10 = var7.y + this.O0000000O00O0;
            double var12 = var7.z;
            Vec3d var14 = O0000000000.player.getVelocity();
            double var15 = Math.sqrt(var14.x * var14.x + var14.y * var14.y + var14.z * var14.z);
            double var17 = Math.sqrt(var14.x * var14.x + var14.z * var14.z);
            boolean var19 = var17 > 0.02 || var15 > 0.045;
            float var20 = (float)Math.min(1.0, var15 / 0.36);
            float var21 = var19 ? 0.18F + 0.4F * var20 : 0.16F;
            float var22 = 1.0F - (float)Math.exp(-3.8F * var4);
            this.O0000000O00000 = this.O0000000O00000 + (var21 - this.O0000000O00000) * var22;
            if (var19) {
               this.O0000000O0000O = var8;
               this.O0000000O000O = var10;
               this.O0000000O000O0 = var12;
               this.O0000000O00O = true;
               float var23 = 1.0F - (float)Math.exp(-11.0F * var4);
               this.O0000000O000OO = this.O0000000O000OO + (1.0F - this.O0000000O000OO) * var23;
               this.O00000000(var8, var10, var12);
            } else {
               this.O0000000O000OO = this.O0000000O000OO * (float)Math.exp(-5.5F * var4);
               if (this.O0000000O000OO < 0.01F) {
                  this.O0000000O000OO = 0.0F;
                  this.O0000000O00O = false;
               }
            }

            this.O00000000(var4);
            if (this.O00000000OO00 >= 1) {
               Camera var38 = O0000000000.gameRenderer.getCamera();
               double var24 = var38.getPos().x;
               double var26 = var38.getPos().y;
               double var28 = var38.getPos().z;
               this.O0000000O00O00.O00000000(this.O0000000000OO0(), O0000000000O0());
               this.O0000000000O0O();
               if (this.O0000000O000 >= 2) {
                  this.O0000000000OO();
                  MatrixStack var30 = o0000000OO0000.O0000000000();
                  Matrix4f var31 = var30.peek().getPositionMatrix();
                  Immediate var32 = O0000O00O0O00.O00000000();

                  try {
                     VertexConsumer var33 = var32.getBuffer(O00000O0OO0O0.O000000000());
                     this.O00000000(var33, var31, var24, var26, var28, 1.0F, 1.0F);
                     VertexConsumer var34 = var32.getBuffer(O00000O0OO0O0.O0000000000());
                     this.O00000000(var34, var31, var24, var26, var28, 1.45F, 0.42F);
                  } finally {
                     O0000O00O0O00.O000000000();
                  }
               }
            }
         } else {
            this.O0000000000O00();
         }
      }
   }

   private void O00000000(double d, double e, double f) {
      if (this.O00000000OO00 == 0) {
         this.O00000000O0OO0[0] = d;
         this.O00000000O0OOO[0] = e;
         this.O00000000OO[0] = f;
         this.O00000000OO0[0] = 0.0F;
         this.O00000000OO00 = 1;
      } else {
         int var7 = this.O00000000OO00 - 1;
         double var8 = d - this.O00000000O0OO0[var7];
         double var10 = e - this.O00000000O0OOO[var7];
         double var12 = f - this.O00000000OO[var7];
         double var14 = var8 * var8 + var10 * var10 + var12 * var12;
         if (var14 > 36.0) {
            this.O0000000000O00();
            this.O00000000(d, e, f);
         } else if (!(var14 < 0.0036)) {
            if (this.O00000000OO00 == 64) {
               System.arraycopy(this.O00000000O0OO0, 1, this.O00000000O0OO0, 0, 63);
               System.arraycopy(this.O00000000O0OOO, 1, this.O00000000O0OOO, 0, 63);
               System.arraycopy(this.O00000000OO, 1, this.O00000000OO, 0, 63);
               System.arraycopy(this.O00000000OO0, 1, this.O00000000OO0, 0, 63);
               this.O00000000OO00 = 63;
            }

            this.O00000000O0OO0[this.O00000000OO00] = d;
            this.O00000000O0OOO[this.O00000000OO00] = e;
            this.O00000000OO[this.O00000000OO00] = f;
            this.O00000000OO0[this.O00000000OO00] = 0.0F;
            this.O00000000OO00++;
         }
      }
   }

   private void O00000000(float f) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.O00000000OO00; var3++) {
         float var4 = this.O00000000OO0[var3] + f;
         if (var4 < this.O0000000O00000) {
            if (var2 != var3) {
               this.O00000000O0OO0[var2] = this.O00000000O0OO0[var3];
               this.O00000000O0OOO[var2] = this.O00000000O0OOO[var3];
               this.O00000000OO[var2] = this.O00000000OO[var3];
            }

            this.O00000000OO0[var2] = var4;
            var2++;
         }
      }

      this.O00000000OO00 = var2;
   }

   private void O0000000000O00() {
      this.O00000000OO00 = 0;
      this.O0000000O000 = 0;
      this.O0000000O000OO = 0.0F;
      this.O0000000O00O = false;
   }

   private void O0000000000O0O() {
      this.O0000000O000 = 0;

      for (int var1 = 0; var1 < this.O00000000OO00; var1++) {
         this.O00000000OO000[var1] = this.O00000000O0OO0[var1];
         this.O00000000OO00O[var1] = this.O00000000O0OOO[var1];
         this.O00000000OO0O[var1] = this.O00000000OO[var1];
         float var2 = this.O00000000OO0[var1] / Math.max(0.001F, this.O0000000O00000);
         if (var2 < 0.0F) {
            var2 = 0.0F;
         }

         if (var2 > 1.0F) {
            var2 = 1.0F;
         }

         this.O00000000OO0O0[var1] = 1.0F - var2 * var2 * (3.0F - 2.0F * var2);
      }

      int var10 = this.O00000000OO00;
      if (this.O00000000OO00 > 0 && this.O0000000O00O && this.O0000000O000OO > 0.02F) {
         int var11 = this.O00000000OO00 - 1;
         double var3 = this.O0000000O0000O - this.O00000000O0OO0[var11];
         double var5 = this.O0000000O000O - this.O00000000O0OOO[var11];
         double var7 = this.O0000000O000O0 - this.O00000000OO[var11];
         if (var3 * var3 + var5 * var5 + var7 * var7 > 0.00108) {
            this.O00000000OO000[this.O00000000OO00] = this.O0000000O0000O;
            this.O00000000OO00O[this.O00000000OO00] = this.O0000000O000O;
            this.O00000000OO0O[this.O00000000OO00] = this.O0000000O000O0;
            this.O00000000OO0O0[this.O00000000OO00] = this.O0000000O000OO;
            var10 = this.O00000000OO00 + 1;
         }
      }

      if (var10 >= 2) {
         this.O00000000OO0OO[0] = this.O00000000OO000[0];
         this.O00000000OOO[0] = this.O00000000OO00O[0];
         this.O00000000OOO0[0] = this.O00000000OO0O[0];
         this.O0000000O0[0] = this.O00000000OO0O0[0];
         this.O0000000O000 = 1;

         for (int var12 = 0; var12 < var10 - 1; var12++) {
            int var14 = Math.max(0, var12 - 1);
            int var4 = var12;
            int var20 = var12 + 1;
            int var6 = Math.min(var10 - 1, var12 + 2);
            int var22 = this.O00000000(var14, var12, var20, var6);

            for (int var8 = 1; var8 <= var22; var8++) {
               if (this.O0000000O000 >= 926) {
                  return;
               }

               float var9 = (float)var8 / var22;
               this.O00000000OO0OO[this.O0000000O000] = O00000000(
                  this.O00000000OO000[var14], this.O00000000OO000[var4], this.O00000000OO000[var20], this.O00000000OO000[var6], var9
               );
               this.O00000000OOO[this.O0000000O000] = O00000000(
                  this.O00000000OO00O[var14], this.O00000000OO00O[var4], this.O00000000OO00O[var20], this.O00000000OO00O[var6], var9
               );
               this.O00000000OOO0[this.O0000000O000] = O00000000(
                  this.O00000000OO0O[var14], this.O00000000OO0O[var4], this.O00000000OO0O[var20], this.O00000000OO0O[var6], var9
               );
               this.O0000000O0[this.O0000000O000] = O00000000(this.O00000000OO0O0[var4], this.O00000000OO0O0[var20], var9);
               this.O0000000O000++;
            }
         }

         this.O0000000O00[0] = 0.0F;
         float var13 = 0.0F;

         for (int var15 = 1; var15 < this.O0000000O000; var15++) {
            double var18 = this.O00000000OO0OO[var15] - this.O00000000OO0OO[var15 - 1];
            double var21 = this.O00000000OOO[var15] - this.O00000000OOO[var15 - 1];
            double var23 = this.O00000000OOO0[var15] - this.O00000000OOO0[var15 - 1];
            var13 += (float)Math.sqrt(var18 * var18 + var21 * var21 + var23 * var23);
            this.O0000000O00[var15] = var13;
         }

         if (var13 > 1.0E-4F) {
            float var16 = 1.0F / var13;

            for (int var19 = 0; var19 < this.O0000000O000; var19++) {
               this.O0000000O00[var19] = this.O0000000O00[var19] * var16;
            }
         } else {
            for (int var17 = 0; var17 < this.O0000000O000; var17++) {
               this.O0000000O00[var17] = this.O0000000O000 > 1 ? (float)var17 / (this.O0000000O000 - 1) : 0.0F;
            }
         }
      }
   }

   private void O0000000000OO() {
      if (this.O0000000O000 >= 1) {
         int var1 = Math.min(this.O0000000O000 - 1, 1);
         double var2 = this.O00000000OO0OO[var1] - this.O00000000OO0OO[0];
         double var4 = this.O00000000OOO[var1] - this.O00000000OOO[0];
         double var6 = this.O00000000OOO0[var1] - this.O00000000OOO0[0];
         double var8 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
         double var10;
         double var12;
         double var14;
         if (var8 > 1.0E-6) {
            var10 = var2 / var8;
            var12 = var4 / var8;
            var14 = var6 / var8;
         } else {
            var10 = 1.0;
            var12 = 0.0;
            var14 = 0.0;
         }

         double var16 = Math.sqrt(var2 * var2 + var6 * var6);
         double var18;
         double var20;
         double var22;
         if (var16 > 1.0E-6) {
            var18 = -var6 / var16;
            var20 = 0.0;
            var22 = var2 / var16;
         } else {
            var18 = 1.0;
            var20 = 0.0;
            var22 = 0.0;
         }

         this.O00000000OOO00[0] = var18;
         this.O00000000OOO0O[0] = var20;
         this.O00000000OOOO[0] = var22;
         double var24 = var12 * var22 - var14 * var20;
         double var26 = var14 * var18 - var10 * var22;
         double var28 = var10 * var20 - var12 * var18;
         double var30 = Math.sqrt(var24 * var24 + var26 * var26 + var28 * var28);
         if (var30 > 1.0E-6) {
            var24 /= var30;
            var26 /= var30;
            var28 /= var30;
         } else {
            var24 = 0.0;
            var26 = 1.0;
            var28 = 0.0;
         }

         this.O00000000OOOO0[0] = var24;
         this.O00000000OOOOO[0] = var26;
         this.O0000000O[0] = var28;

         for (int var32 = 1; var32 < this.O0000000O000; var32++) {
            int var33 = var32 - 1;
            int var34 = Math.min(this.O0000000O000 - 1, var32 + 1);
            double var35 = this.O00000000OO0OO[var34] - this.O00000000OO0OO[var33];
            double var37 = this.O00000000OOO[var34] - this.O00000000OOO[var33];
            double var39 = this.O00000000OOO0[var34] - this.O00000000OOO0[var33];
            double var41 = Math.sqrt(var35 * var35 + var37 * var37 + var39 * var39);
            if (var41 < 1.0E-6) {
               this.O00000000OOO00[var32] = this.O00000000OOO00[var32 - 1];
               this.O00000000OOO0O[var32] = this.O00000000OOO0O[var32 - 1];
               this.O00000000OOOO[var32] = this.O00000000OOOO[var32 - 1];
               this.O00000000OOOO0[var32] = this.O00000000OOOO0[var32 - 1];
               this.O00000000OOOOO[var32] = this.O00000000OOOOO[var32 - 1];
               this.O0000000O[var32] = this.O0000000O[var32 - 1];
            } else {
               double var43 = var35 / var41;
               double var45 = var37 / var41;
               double var47 = var39 / var41;
               double var49 = this.O00000000OOO00[var32 - 1];
               double var51 = this.O00000000OOO0O[var32 - 1];
               double var53 = this.O00000000OOOO[var32 - 1];
               double var55 = var49 * var43 + var51 * var45 + var53 * var47;
               var49 -= var43 * var55;
               var51 -= var45 * var55;
               var53 -= var47 * var55;
               double var57 = Math.sqrt(var49 * var49 + var51 * var51 + var53 * var53);
               if (var57 > 1.0E-6) {
                  var49 /= var57;
                  var51 /= var57;
                  var53 /= var57;
               } else {
                  double var59 = Math.sqrt(var35 * var35 + var39 * var39);
                  if (var59 > 1.0E-6) {
                     var49 = -var39 / var59;
                     var51 = 0.0;
                     var53 = var35 / var59;
                  } else {
                     var49 = 1.0;
                     var51 = 0.0;
                     var53 = 0.0;
                  }
               }

               this.O00000000OOO00[var32] = var49;
               this.O00000000OOO0O[var32] = var51;
               this.O00000000OOOO[var32] = var53;
               double var76 = var45 * var53 - var47 * var51;
               double var61 = var47 * var49 - var43 * var53;
               double var63 = var43 * var51 - var45 * var49;
               double var65 = Math.sqrt(var76 * var76 + var61 * var61 + var63 * var63);
               if (var65 > 1.0E-6) {
                  var76 /= var65;
                  var61 /= var65;
                  var63 /= var65;
               } else {
                  var76 = 0.0;
                  var61 = 1.0;
                  var63 = 0.0;
               }

               this.O00000000OOOO0[var32] = var76;
               this.O00000000OOOOO[var32] = var61;
               this.O0000000O[var32] = var63;
            }
         }
      }
   }

   private int O00000000(int i, int j, int k, int l) {
      double var5 = this.O00000000OO000[j] - this.O00000000OO000[i];
      double var7 = this.O00000000OO00O[j] - this.O00000000OO00O[i];
      double var9 = this.O00000000OO0O[j] - this.O00000000OO0O[i];
      double var11 = this.O00000000OO000[k] - this.O00000000OO000[j];
      double var13 = this.O00000000OO00O[k] - this.O00000000OO00O[j];
      double var15 = this.O00000000OO0O[k] - this.O00000000OO0O[j];
      double var17 = this.O00000000OO000[l] - this.O00000000OO000[k];
      double var19 = this.O00000000OO00O[l] - this.O00000000OO00O[k];
      double var21 = this.O00000000OO0O[l] - this.O00000000OO0O[k];
      double var23 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
      double var25 = Math.sqrt(var11 * var11 + var13 * var13 + var15 * var15);
      double var27 = Math.sqrt(var17 * var17 + var19 * var19 + var21 * var21);
      double var29 = var23 > 1.0E-6 && var25 > 1.0E-6 ? (var5 * var11 + var7 * var13 + var9 * var15) / (var23 * var25) : 1.0;
      double var31 = var25 > 1.0E-6 && var27 > 1.0E-6 ? (var11 * var17 + var13 * var19 + var15 * var21) / (var25 * var27) : 1.0;
      double var33 = Math.max(1.0 - var29, 1.0 - var31);
      if (var33 < 0.0) {
         var33 = 0.0;
      }

      if (var33 > 2.0) {
         var33 = 2.0;
      }

      double var35 = Math.min(1.0, Math.pow(var33 * 12.0, 0.5));
      int var37 = (int)Math.round(10.0 * var35);
      return 4 + var37;
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, float g, float h) {
      for (int var11 = 0; var11 < this.O0000000O000 - 1; var11++) {
         float var12 = this.O0000000O00[var11];
         float var13 = this.O0000000O00[var11 + 1];
         float var14 = this.O0000000O0[var11] * h * this.O0000000O00O00.O000000000O;
         float var15 = this.O0000000O0[var11 + 1] * h * this.O0000000O00O00.O000000000O;
         float var16 = 0.3F * g * this.O0000000O00O00.O0000000000OOO * O000000000(var12);
         float var17 = 0.3F * g * this.O0000000O00O00.O0000000000OOO * O000000000(var13);
         int var18 = O0000000000(var14);
         int var19 = O0000000000(var15);
         if ((var18 | var19) != 0 && (!(var16 <= 1.0E-4F) || !(var17 <= 1.0E-4F))) {
            int var20 = this.O0000000O00O00.O00000000(var12);
            int var21 = this.O0000000O00O00.O00000000(var13);
            double var22 = this.O00000000OO0OO[var11] - d;
            double var24 = this.O00000000OOO[var11] - e;
            double var26 = this.O00000000OOO0[var11] - f;
            double var28 = this.O00000000OO0OO[var11 + 1] - d;
            double var30 = this.O00000000OOO[var11 + 1] - e;
            double var32 = this.O00000000OOO0[var11 + 1] - f;
            double var34 = this.O00000000OOO00[var11];
            double var36 = this.O00000000OOO0O[var11];
            double var38 = this.O00000000OOOO[var11];
            double var40 = this.O00000000OOO00[var11 + 1];
            double var42 = this.O00000000OOO0O[var11 + 1];
            double var44 = this.O00000000OOOO[var11 + 1];
            double var46 = this.O00000000OOOO0[var11];
            double var48 = this.O00000000OOOOO[var11];
            double var50 = this.O0000000O[var11];
            double var52 = this.O00000000OOOO0[var11 + 1];
            double var54 = this.O00000000OOOOO[var11 + 1];
            double var56 = this.O0000000O[var11 + 1];

            for (int var58 = 0; var58 < 12; var58++) {
               float var59 = O00000000O0O00[var58];
               float var60 = O00000000O0O0O[var58];
               float var61 = O00000000O0O00[var58 + 1];
               float var62 = O00000000O0O0O[var58 + 1];
               float var63 = O00000000O0OO[var58];
               float var64 = O00000000O0OO[var58 + 1];
               double var65 = var59 * var34 + var60 * var46;
               double var67 = var59 * var36 + var60 * var48;
               double var69 = var59 * var38 + var60 * var50;
               double var71 = var61 * var34 + var62 * var46;
               double var73 = var61 * var36 + var62 * var48;
               double var75 = var61 * var38 + var62 * var50;
               double var77 = var59 * var40 + var60 * var52;
               double var79 = var59 * var42 + var60 * var54;
               double var81 = var59 * var44 + var60 * var56;
               double var83 = var61 * var40 + var62 * var52;
               double var85 = var61 * var42 + var62 * var54;
               double var87 = var61 * var44 + var62 * var56;
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var22 + var65 * var16,
                  var24 + var67 * var16,
                  var26 + var69 * var16,
                  var12,
                  var63,
                  var20,
                  var18,
                  var65,
                  var67,
                  var69
               );
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var22 + var71 * var16,
                  var24 + var73 * var16,
                  var26 + var75 * var16,
                  var12,
                  var64,
                  var20,
                  var18,
                  var71,
                  var73,
                  var75
               );
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var28 + var83 * var17,
                  var30 + var85 * var17,
                  var32 + var87 * var17,
                  var13,
                  var64,
                  var21,
                  var19,
                  var83,
                  var85,
                  var87
               );
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var28 + var77 * var17,
                  var30 + var79 * var17,
                  var32 + var81 * var17,
                  var13,
                  var63,
                  var21,
                  var19,
                  var77,
                  var79,
                  var81
               );
            }
         }
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, float g, float h, int i, int j, double k, double l, double m
   ) {
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)f)
         .texture(g, h)
         .color(O00000000(i), O000000000(i), O0000000000(i), j)
         .normal((float)k, (float)l, (float)m);
   }

   private static float O000000000(float f) {
      float var1 = O000000000(0.0F, 0.42F, f);
      float var2 = 1.0F - O000000000(0.92F, 1.0F, f) * 0.5F;
      return var1 * var2;
   }

   private float O0000000000OO0() {
      return (float)(System.nanoTime() - O00000000O0O0) / 1.0E9F;
   }

   private static double O00000000(double d, double e, double f, double g, float h) {
      double var9 = h * h;
      double var11 = var9 * h;
      return 0.5 * (2.0 * e + (-d + f) * h + (2.0 * d - 5.0 * e + 4.0 * f - g) * var9 + (-d + 3.0 * e - 3.0 * f + g) * var11);
   }

   private static float O00000000(float f, float g, float h) {
      return f + (g - f) * h;
   }

   private static float O000000000(float f, float g, float h) {
      float var3 = O0000000000((h - f) / (g - f), 0.0F, 1.0F);
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   static float O0000000000(float f, float g, float h) {
      return f < g ? g : (f > h ? h : f);
   }

   private static int O00000000(int i, int j, int k) {
      return i < j ? j : (i > k ? k : i);
   }

   private static int O0000000000(float f) {
      return O00000000(Math.round(O0000000000(f, 0.0F, 1.0F) * 255.0F), 0, 255);
   }

   private static int O00000000(int i) {
      return i >> 16 & 0xFF;
   }

   private static int O000000000(int i) {
      return i >> 8 & 0xFF;
   }

   private static int O0000000000(int i) {
      return i & 0xFF;
   }

   static int O00000000(int i, int j, float f) {
      float var3 = O0000000000(f, 0.0F, 1.0F);
      int var4 = Math.round(O00000000(i) + (O00000000(j) - O00000000(i)) * var3);
      int var5 = Math.round(O000000000(i) + (O000000000(j) - O000000000(i)) * var3);
      int var6 = Math.round(O0000000000(i) + (O0000000000(j) - O0000000000(i)) * var3);
      return var4 << 16 | var5 << 8 | var6;
   }

   static {
      for (int var0 = 0; var0 <= 12; var0++) {
         double var1 = (Math.PI * 2) * var0 / 12.0;
         O00000000O0O00[var0] = (float)Math.cos(var1);
         O00000000O0O0O[var0] = (float)Math.sin(var1);
         O00000000O0OO[var0] = var0 / 12.0F;
      }
   }

   static final class W190 {
      private static final int[] O00000000 = new int[]{16747247, 16754396, 8648959, 11141102, 16747247};
      private static final int[] O000000000 = new int[]{6750183, 6014975, 4688895, 11730932, 6750183};
      private static final int[] O0000000000 = new int[]{16773227, 16751954, 16736157, 9304063, 16773227};
      private static final int[] O00000000000 = new int[]{11141048, 6485458, 8228095, 16755188, 11141048};
      private static final int[] O000000000000 = new int[]{8257383, 3405823, 16773210, 16727538, 8257383};
      private static final int[] O0000000000000 = new int[]{16754632, 16769167, 11000063, 14067711, 16754632};
      private static final int[] O000000000000O = new int[]{8033279, 11561983, 5963734, 16736142, 8033279};
      private static final int[] O00000000000O = new int[]{16757594, 16739146, 16732041, 13995263, 16757594};
      private static final int[] O00000000000O0 = new int[]{14089215, 9169663, 9149951, 16777215, 14089215};
      private static final int[] O00000000000OO = new int[]{16736109, 16770140, 6160312, 7179519, 16736109};
      private static final int[] O0000000000O = new int[]{14001919, 16752603, 7733222, 16773260, 14001919};
      private static final int[] O0000000000O0 = new int[]{13172552, 16773466, 3732223, 16735457, 13172552};
      private Theme O0000000000O00 = Theme.WILD;
      private int[] O0000000000O0O;
      private int O0000000000OO = 7316991;
      private float O0000000000OO0;
      float O0000000000OOO = 1.0F;
      float O000000000O = 1.0F;

      void O00000000(float f, String string) {
         this.O0000000000OOO = 1.0F;
         this.O000000000O = 1.0F;
         if (!this.O000000000(f, string)) {
            this.O0000000000O00 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null
               ? WildClient.O00000000.O0000000000O.O000000000()
               : Theme.WILD;
            this.O0000000000O0O = O00000000(this.O0000000000O00);
            this.O0000000000OO0 = f * 0.06F;
            if (this.O0000000000O0O == null) {
               this.O0000000000OO = this.O0000000000O00 == Theme.WILD ? 8108031 : this.O0000000000O00.O00000000().getRGB() & 16777215;
            }
         }
      }

      int O00000000(float f) {
         return this.O0000000000O0O != null ? O00000000(this.O0000000000O0O, this.O0000000000OO0 + (1.0F - f) * 0.42F) : this.O0000000000OO;
      }

      private boolean O000000000(float f, String string) {
         if (string != null && !string.isBlank()) {
            O00000OOOO0O00 var3 = O00000OOOO0O00.O00000000();
            if (!var3.O000000000000(string)) {
               return false;
            } else {
               O00000OOO0OO00 var4 = var3.O0000000000(string);
               O00000OOO00OO0 var5 = var3.O000000000(string);
               List var6 = var3.O00000000000O(string);
               Map var7 = var3.O00000000000O0(string);
               int[] var8 = new int[4];
               int var9 = 0;

               for (O00000OOO00OO var11 : (List<O00000OOO00OO>)var6) {
                  if (var11.kind() == O00000OOO00OO.W302.COLOR && var9 < var8.length) {
                     float[] var12 = (float[])var7.get(var11.uniformName());
                     var8[var9++] = O00000000(var12 == null ? var11.defaults() : var12);
                  }
               }

               if (var9 == 0) {
                  int var15 = ((var4 == null ? string : var4.O000000000() + string) + (var5 == null ? "" : var5.hash())).hashCode();
                  var8[var9++] = O00000000(var15, 0.0F);
                  var8[var9++] = O00000000(var15, 0.31F);
                  var8[var9++] = O00000000(var15, 0.63F);
               }

               if (var9 == 1) {
                  int var16 = var8[0];
                  this.O0000000000O0O = new int[]{
                     Trails.O00000000(var16, 16777215, 0.44F),
                     var16,
                     Trails.O00000000(var16, 7796735, 0.36F),
                     Trails.O00000000(var16, 16741065, 0.3F),
                     Trails.O00000000(var16, 16777215, 0.44F)
                  };
               } else if (var9 == 2) {
                  this.O0000000000O0O = new int[]{
                     var8[0], Trails.O00000000(var8[0], var8[1], 0.42F), var8[1], Trails.O00000000(var8[1], 16777215, 0.34F), var8[0]
                  };
               } else if (var9 == 3) {
                  this.O0000000000O0O = new int[]{var8[0], var8[1], var8[2], Trails.O00000000(var8[2], 16777215, 0.32F), var8[0]};
               } else {
                  this.O0000000000O0O = new int[]{var8[0], var8[1], var8[2], var8[3], var8[0]};
               }

               float var17 = O00000000(var6, var7, 0.5F, "width", "radius", "size", "thick");
               float var18 = O00000000(var6, var7, 0.66F, "opacity", "alpha", "power", "glow", "intensity");
               float var19 = O00000000(var6, var7, 0.5F, "flow", "speed", "phase", "time");
               this.O0000000000OOO = Trails.O0000000000(var17 == 0.5F ? 1.0F : 0.68F + var17 * 1.22F, 0.58F, 1.9F);
               this.O000000000O = Trails.O0000000000(0.62F + var18 * 0.82F, 0.52F, 1.48F);
               this.O0000000000OO0 = f * (0.034F + var19 * 0.09F);
               return true;
            }
         } else {
            return false;
         }
      }

      private static float O00000000(List<O00000OOO00OO> list, Map<String, float[]> map, float f, String... strings) {
         if (list != null && !list.isEmpty()) {
            for (O00000OOO00OO var5 : list) {
               if (var5.kind() == O00000OOO00OO.W302.FLOAT) {
                  String var6 = (var5.name() + " " + var5.uniformName()).toLowerCase();
                  boolean var7 = false;

                  for (String var11 : strings) {
                     if (var11 != null && var6.contains(var11)) {
                        var7 = true;
                        break;
                     }
                  }

                  if (var7) {
                     float[] var12 = map == null ? null : (float[])map.get(var5.uniformName());
                     float var13 = var12 != null && var12.length != 0 ? var12[0] : var5.defaultFloat();
                     float var14 = var5.maximum() - var5.minimum();
                     if (Float.isFinite(var13) && !(var14 <= 1.0E-6F)) {
                        return Trails.O0000000000((var13 - var5.minimum()) / var14, 0.0F, 1.0F);
                     }

                     return f;
                  }
               }
            }

            return f;
         } else {
            return f;
         }
      }

      private static int O00000000(float[] fs) {
         float var1 = fs != null && fs.length > 0 ? fs[0] : 1.0F;
         float var2 = fs != null && fs.length > 1 ? fs[1] : 1.0F;
         float var3 = fs != null && fs.length > 2 ? fs[2] : 1.0F;
         return O000000000(var1) << 16 | O000000000(var2) << 8 | O000000000(var3);
      }

      private static int O000000000(float f) {
         return !Float.isFinite(f) ? 0 : Math.max(0, Math.min(255, Math.round(f * 255.0F)));
      }

      private static int O00000000(int i, float f) {
         int var2 = i ^ -1640531527;
         var2 ^= var2 >>> 16;
         var2 *= 2146121005;
         var2 ^= var2 >>> 15;
         var2 *= -2073254261;
         var2 ^= var2 >>> 16;
         float var3 = ((var2 & 16777215) / 1.6777215E7F + f) % 1.0F;
         return O00000000(var3, 0.62F, 1.0F);
      }

      private static int O00000000(float f, float g, float h) {
         f -= (float)Math.floor(f);
         float var3 = f * 6.0F;
         int var4 = (int)Math.floor(var3);
         float var5 = h * (1.0F - g);
         float var6 = h * (1.0F - g * (var3 - var4));
         float var7 = h * (1.0F - g * (1.0F - (var3 - var4)));
         float var8;
         float var9;
         float var10;
         switch (var4 % 6) {
            case 0:
               var8 = h;
               var9 = var7;
               var10 = var5;
               break;
            case 1:
               var8 = var6;
               var9 = h;
               var10 = var5;
               break;
            case 2:
               var8 = var5;
               var9 = h;
               var10 = var7;
               break;
            case 3:
               var8 = var5;
               var9 = var6;
               var10 = h;
               break;
            case 4:
               var8 = var7;
               var9 = var5;
               var10 = h;
               break;
            default:
               var8 = h;
               var9 = var5;
               var10 = var6;
         }

         return O000000000(var8) << 16 | O000000000(var9) << 8 | O000000000(var10);
      }

      private static int O00000000(int[] is, float f) {
         float var2 = f - (float)Math.floor(f);
         float var3 = var2 * (is.length - 1);
         int var4 = Math.min(is.length - 2, Math.max(0, (int)Math.floor(var3)));
         return Trails.O00000000(is[var4] & 16777215, is[var4 + 1] & 16777215, var3 - var4);
      }

      private static int[] O00000000(Theme o0000000OOO) {
         return switch (o0000000OOO) {
            case ASTOLFO_RAINBOW -> O00000000;
            case LAGUNE_RAINBOW -> O000000000;
            case HALF_RAINBOW -> O0000000000;
            case AURORA_RAINBOW -> O00000000000;
            case NEON_RAINBOW -> O000000000000;
            case BLOSSOM_RAINBOW -> O0000000000000;
            case ABYSS_RAINBOW -> O000000000000O;
            case SUNSET_RAINBOW -> O00000000000O;
            case GLACIER_RAINBOW -> O00000000000O0;
            case CHROMA_RAINBOW -> O00000000000OO;
            case DREAM_RAINBOW -> O0000000000O;
            case TOXIC_RAINBOW -> O0000000000O0;
            default -> null;
         };
      }
   }
}
