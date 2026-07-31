package l;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Base64;
import java.util.Random;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class Helper424 {
   private static final int INPUT_SIZE = 10;
   private static final int HIDDEN1 = 32;
   private static final int HIDDEN2 = 32;
   private static final int OUTPUT_SIZE = 3;
   private final float[] w1 = new float[320];
   private final float[] b1 = new float[32];
   private final float[] w2 = new float[1024];
   private final float[] b2 = new float[32];
   private final float[] w3 = new float[96];
   private final float[] b3 = new float[3];
   private final float[] h1 = new float[32];
   private final float[] h2 = new float[32];
   private final float[] out = new float[3];
   private final float[] dOut = new float[3];
   private final float[] dH2 = new float[32];
   private final float[] dH1 = new float[32];
   private final float[] bufInput = new float[10];
   private final float[] bufTarget = new float[3];
   private float yawSpeedEma;
   private float pitchSpeedEma;
   private float yawJitterEma;
   private float pitchJitterEma;
   private float ampEma;
   private float posErrEma;
   private float camVelEma;
   float gcdYawEma;
   float gcdPitchEma;
   private float samples;

   Helper424() {
      this.method4329();
   }

   private void method4329() {
      Random var1 = new Random(12648430L);
      float var2 = (float)(1.0 / Math.sqrt(10.0));

      for (int var3 = 0; var3 < this.w1.length; var3++) {
         this.w1[var3] = (float)(var1.nextGaussian() * var2);
      }

      for (int var6 = 0; var6 < this.b1.length; var6++) {
         this.b1[var6] = 0.0F;
      }

      float var7 = (float)(1.0 / Math.sqrt(32.0));

      for (int var4 = 0; var4 < this.w2.length; var4++) {
         this.w2[var4] = (float)(var1.nextGaussian() * var7);
      }

      for (int var8 = 0; var8 < this.b2.length; var8++) {
         this.b2[var8] = 0.0F;
      }

      float var9 = (float)(1.0 / Math.sqrt(32.0));

      for (int var5 = 0; var5 < this.w3.length; var5++) {
         this.w3[var5] = (float)(var1.nextGaussian() * var9);
      }

      for (int var10 = 0; var10 < this.b3.length; var10++) {
         this.b3[var10] = 0.0F;
      }

      this.yawSpeedEma = 0.0F;
      this.pitchSpeedEma = 0.0F;
      this.yawJitterEma = 0.0F;
      this.pitchJitterEma = 0.0F;
      this.ampEma = 0.0F;
      this.posErrEma = 0.0F;
      this.camVelEma = 0.0F;
      this.gcdYawEma = 0.0F;
      this.gcdPitchEma = 0.0F;
      this.samples = 0.0F;
   }

   Helper423 method4330(LivingEntity var1, boolean var2, float var3) {
      float var4 = MathHelper.clamp(this.samples / 600.0F, 0.0F, 1.0F);
      float var5 = MathHelper.clamp(this.posErrEma, 0.0F, 1.5F);
      float var6 = (float)Math.exp(-var5 * 1.25F);
      float var7 = MathHelper.clamp(var4 * var6, 0.0F, 1.0F);
      float var8 = MathHelper.clamp((Math.abs(this.yawSpeedEma) + Math.abs(this.pitchSpeedEma)) * 0.5F / 18.0F, 0.0F, 1.0F);
      float var9 = MathHelper.clamp((Math.abs(this.yawJitterEma) + Math.abs(this.pitchJitterEma)) * 0.5F / 10.0F, 0.0F, 1.0F);
      float var10 = MathHelper.clamp(this.ampEma / 40.0F, 0.0F, 1.0F);
      float var11 = MathHelper.clamp(var3 / 6.0F, 0.0F, 1.0F);
      float var13 = 1.0F - var7;
      float var14 = 0.1F + var7 * 0.3F + var9 * 0.2F + var10 * 0.12F;
      float var15 = 0.08F + var7 * 0.24F + var9 * 0.16F + var10 * 0.1F;
      float var16 = 1.0F - var8 * 0.3F;
      float var17 = 1.0F - var11 * 0.55F;
      var14 *= var16 * var17;
      var15 *= var16 * var17;
      if (var2) {
         var14 *= 0.85F;
         var15 *= 0.8F;
      } else {
         var14 *= 0.95F + var13 * 0.05F;
         var15 *= 0.95F + var13 * 0.05F;
      }

      var14 = MathHelper.clamp(var14, 0.04F, 1.25F);
      var15 = MathHelper.clamp(var15, 0.03F, 1.05F);
      float var18 = 0.55F + var8 * 0.75F + var9 * 0.4F + var7 * 0.25F;
      if (var2) {
         var18 *= 1.05F;
      }

      float var19 = MathHelper.clamp(var18, 0.45F, 2.4F);
      float var20 = MathHelper.clamp(var18 * 0.92F, 0.4F, 2.2F);
      float var21 = (0.3F + 0.7F * var7) * (1.0F - var11 * 0.55F);
      if (var2) {
         var21 *= 0.86F;
      }

      var21 = MathHelper.clamp(var21, 0.1F, 1.0F);
      float var22 = this.gcdYawEma > 5.0E-4F ? MathHelper.clamp(this.gcdYawEma, 5.0E-4F, 3.5F) : 0.0F;
      float var23 = this.gcdPitchEma > 5.0E-4F ? MathHelper.clamp(this.gcdPitchEma, 5.0E-4F, 3.5F) : 0.0F;
      return new Helper423(var14, var15, var19, var20, var21, var22, var23, var7);
   }

   void method4331(LivingEntity var1, boolean var2, float var3, int var4) {
      float var5;
      if (var4 == 1) {
         var5 = -0.15F;
      } else if (var4 == 2) {
         var5 = -0.3F;
      } else if (var4 == 3) {
         var5 = 0.25F;
      } else {
         var5 = 0.0F;
      }

      if (var5 != 0.0F) {
         float var6 = MathHelper.clamp(var3 * 0.5F, 0.01F, 0.25F);
         this.posErrEma = method4336(this.posErrEma, this.posErrEma + var5 * 0.25F, var6);
      }
   }

   void method4332(
      LivingEntity var1,
      Helper336 var2,
      Helper336 var3,
      Box var4,
      Vec3d var5,
      float var6,
      boolean var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      MinecraftClient var13 = MinecraftClient.getInstance();
      if (var13.player != null && var1 != null) {
         Vec3d var14 = var1.getVelocity();
         float var15 = (float)var14.horizontalLength();
         float var16 = var13.player.distanceTo(var1);

         float var17;
         try {
            var17 = (float)(var1.getEyeY() - var13.player.getEyeY());
         } catch (Exception var48) {
            var17 = 0.0F;
         }

         float var18 = Helper425.method4366(var2, var13.player.getYaw());
         float var19 = Helper425.method4367(var2, var13.player.getPitch());
         float var20 = Helper425.method4366(var3, var18);
         float var21 = Helper425.method4367(var3, var19);
         float var22 = MathHelper.wrapDegrees(var20 - var18);
         float var23 = MathHelper.clamp(var21 - var19, -90.0F, 90.0F);
         float var24 = MathHelper.clamp(var22, -70.0F, 70.0F);
         float var25 = MathHelper.clamp(var23, -50.0F, 50.0F);
         float var26 = var24 / 70.0F;
         float var27 = var25 / 50.0F;
         float var28;
         if (var4 != null && var5 != null) {
            double var29 = var4.maxY - var4.minY;
            if (var29 > 1.0E-6) {
               var28 = (float)((var5.y - var4.minY) / var29);
               var28 = MathHelper.clamp(var28, 0.0F, 1.0F);
            } else {
               var28 = 0.6F;
            }
         } else {
            var28 = 0.6F;
         }

         float var50 = var28 * 2.0F - 1.0F;
         float var30 = Math.abs(var9);
         float var31 = Math.abs(var10);
         float var32 = Math.abs(var11);
         float var33 = Math.abs(var12);
         float var34 = (float)Math.sqrt(var24 * var24 + var25 * var25);
         this.yawSpeedEma = method4336(this.yawSpeedEma, var30, 0.05F);
         this.pitchSpeedEma = method4336(this.pitchSpeedEma, var31, 0.05F);
         this.yawJitterEma = method4336(this.yawJitterEma, var32, 0.05F);
         this.pitchJitterEma = method4336(this.pitchJitterEma, var33, 0.05F);
         this.ampEma = method4336(this.ampEma, var34, 0.05F);
         if (var4 != null && var5 != null) {
            double var35 = var4.maxX - var4.minX;
            double var37 = var4.maxY - var4.minY;
            double var39 = var4.maxZ - var4.minZ;
            if (var35 > 1.0E-6 && var37 > 1.0E-6 && var39 > 1.0E-6) {
               float var41 = (float)((var5.x - var4.minX) / var35);
               float var42 = (float)((var5.y - var4.minY) / var37);
               float var43 = (float)((var5.z - var4.minZ) / var39);
               var41 = MathHelper.clamp(var41, 0.0F, 1.0F);
               var42 = MathHelper.clamp(var42, 0.0F, 1.0F);
               var43 = MathHelper.clamp(var43, 0.0F, 1.0F);
               float var44 = var41 - 0.5F;
               float var45 = var42 - 0.65F;
               float var46 = var43 - 0.5F;
               float var47 = (float)Math.sqrt(var44 * var44 + var45 * var45 + var46 * var46);
               this.posErrEma = method4336(this.posErrEma, var47, 0.05F);
            }
         }

         this.camVelEma = method4336(this.camVelEma, var8, 0.05F);
         if (var30 > 0.001F) {
            this.gcdYawEma = method4337(this.gcdYawEma, var30, 0.03F);
         }

         if (var31 > 0.001F) {
            this.gcdPitchEma = method4337(this.gcdPitchEma, var31, 0.03F);
         }

         if (this.samples < 1000000.0F) {
            this.samples++;
         }

         float[] var51 = this.bufInput;
         var51[0] = MathHelper.clamp(var16 / 8.0F, 0.0F, 1.0F);
         var51[1] = MathHelper.clamp(var17 / 4.0F, -1.0F, 1.0F);
         var51[2] = MathHelper.clamp(var15 / 1.4F, 0.0F, 1.0F);
         var51[3] = MathHelper.clamp(var8 / 8.0F, 0.0F, 1.0F);
         var51[4] = MathHelper.clamp(var9 / 45.0F, -1.0F, 1.0F);
         var51[5] = MathHelper.clamp(var10 / 45.0F, -1.0F, 1.0F);
         var51[6] = MathHelper.clamp((var32 + var33) * 0.5F / 25.0F, 0.0F, 1.0F);
         boolean var36 = var13.player.isGliding() || var1.isGliding() || !var13.player.isOnGround();
         var51[7] = var36 ? 1.0F : 0.0F;
         var51[8] = var7 ? 1.0F : 0.0F;
         int var52 = this.method4338(var14, var13.player.getYaw());
         float var38;
         if (var52 == 0) {
            var38 = -1.0F;
         } else if (var52 == 2) {
            var38 = 1.0F;
         } else {
            var38 = 0.0F;
         }

         var51[9] = var38;
         float[] var53 = this.bufTarget;
         var53[0] = var26;
         var53[1] = var27;
         var53[2] = var50;
         float var40 = MathHelper.clamp(var6 * 0.65F, 0.0025F, 0.05F);
         if (var7) {
            var40 = MathHelper.clamp(var40 * 1.5F, 0.0035F, 0.08F);
         }

         this.method4333(var51, var53, var40);
      }
   }

   private void method4333(float[] var1, float[] var2, float var3) {
      float[] var4 = this.method4334(var1);

      for (int var5 = 0; var5 < 3; var5++) {
         float var6 = var4[var5] - var2[var5];
         float var7 = var6 * (1.0F - var4[var5] * var4[var5]);
         this.dOut[var5] = var7;
      }

      for (int var9 = 0; var9 < 32; var9++) {
         float var17 = 0.0F;
         int var22 = var9 * 3;

         for (int var8 = 0; var8 < 3; var8++) {
            var17 += this.dOut[var8] * this.w3[var22 + var8];
         }

         this.dH2[var9] = (1.0F - this.h2[var9] * this.h2[var9]) * var17;
      }

      for (int var10 = 0; var10 < 32; var10++) {
         float var18 = 0.0F;
         int var23 = var10 * 32;

         for (int var27 = 0; var27 < 32; var27++) {
            var18 += this.dH2[var27] * this.w2[var23 + var27];
         }

         this.dH1[var10] = (1.0F - this.h1[var10] * this.h1[var10]) * var18;
      }

      for (int var11 = 0; var11 < 32; var11++) {
         int var19 = var11 * 3;

         for (int var24 = 0; var24 < 3; var24++) {
            int var28 = var19 + var24;
            this.w3[var28] = this.w3[var28] - var3 * this.dOut[var24] * this.h2[var11];
         }
      }

      for (int var12 = 0; var12 < 3; var12++) {
         this.b3[var12] = this.b3[var12] - var3 * this.dOut[var12];
      }

      for (int var13 = 0; var13 < 32; var13++) {
         int var20 = var13 * 32;

         for (int var25 = 0; var25 < 32; var25++) {
            int var29 = var20 + var25;
            this.w2[var29] = this.w2[var29] - var3 * this.dH2[var25] * this.h1[var13];
         }
      }

      for (int var14 = 0; var14 < 32; var14++) {
         this.b2[var14] = this.b2[var14] - var3 * this.dH2[var14];
      }

      for (int var15 = 0; var15 < 10; var15++) {
         int var21 = var15 * 32;

         for (int var26 = 0; var26 < 32; var26++) {
            int var30 = var21 + var26;
            this.w1[var30] = this.w1[var30] - var3 * this.dH1[var26] * var1[var15];
         }
      }

      for (int var16 = 0; var16 < 32; var16++) {
         this.b1[var16] = this.b1[var16] - var3 * this.dH1[var16];
      }
   }

   private float[] method4334(float[] var1) {
      for (int var2 = 0; var2 < 32; var2++) {
         float var3 = this.b1[var2];

         for (int var4 = 0; var4 < 10; var4++) {
            var3 += var1[var4] * this.w1[var4 * 32 + var2];
         }

         this.h1[var2] = method4335(var3);
      }

      for (int var5 = 0; var5 < 32; var5++) {
         float var7 = this.b2[var5];

         for (int var9 = 0; var9 < 32; var9++) {
            var7 += this.h1[var9] * this.w2[var9 * 32 + var5];
         }

         this.h2[var5] = method4335(var7);
      }

      for (int var6 = 0; var6 < 3; var6++) {
         float var8 = this.b3[var6];

         for (int var10 = 0; var10 < 32; var10++) {
            var8 += this.h2[var10] * this.w3[var10 * 3 + var6];
         }

         this.out[var6] = method4335(var8);
      }

      return this.out;
   }

   private static float method4335(float var0) {
      return (float)Math.tanh(var0);
   }

   private static float method4336(float var0, float var1, float var2) {
      return var0 == 0.0F ? var1 : var0 + (var1 - var0) * var2;
   }

   private static float method4337(float var0, float var1, float var2) {
      var1 = MathHelper.clamp(var1, 5.0E-4F, 90.0F);
      if (var0 <= 1.0E-4F) {
         return var1;
      } else {
         float var3 = var1 / Math.max(var0, 5.0E-4F);
         float var4 = Math.max(1.0F, (float)Math.round(var3));
         float var5 = var1 / Math.max(var4, 1.0F);
         return var0 + (var5 - var0) * var2;
      }
   }

   private int method4338(Vec3d var1, float var2) {
      if (var1 == null) {
         return 1;
      } else {
         double var3 = var1.x;
         double var5 = var1.z;
         double var7 = Math.sqrt(var3 * var3 + var5 * var5);
         if (var7 < 0.02) {
            return 1;
         } else {
            double var9 = Math.toRadians(var2);
            double var11 = Math.cos(var9);
            double var13 = Math.sin(var9);
            double var15 = var3 * var11 + var5 * var13;
            if (var15 > 0.03) {
               return 2;
            } else {
               return var15 < -0.03 ? 0 : 1;
            }
         }
      }
   }

   private Path method4339(MinecraftClient var1) {
      File var2 = new File(var1.runDirectory, "Releon");
      if (!var2.exists()) {
         var2.mkdirs();
      }

      return new File(var2, "neuro_aura_nn.json").toPath();
   }

   void method4340() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null) {
         try {
            byte var2 = 10;
            int var3 = this.w1.length + this.b1.length + this.w2.length + this.b2.length + this.w3.length + this.b3.length + var2;
            int var4 = 16 + var3 * 4;
            ByteBuffer var5 = ByteBuffer.allocate(var4).order(ByteOrder.LITTLE_ENDIAN);
            var5.putInt(10);
            var5.putInt(32);
            var5.putInt(32);
            var5.putInt(3);

            for (float var9 : this.w1) {
               var5.putFloat(var9);
            }

            for (float var28 : this.b1) {
               var5.putFloat(var28);
            }

            for (float var29 : this.w2) {
               var5.putFloat(var29);
            }

            for (float var30 : this.b2) {
               var5.putFloat(var30);
            }

            for (float var31 : this.w3) {
               var5.putFloat(var31);
            }

            for (float var32 : this.b3) {
               var5.putFloat(var32);
            }

            var5.putFloat(this.yawSpeedEma);
            var5.putFloat(this.pitchSpeedEma);
            var5.putFloat(this.yawJitterEma);
            var5.putFloat(this.pitchJitterEma);
            var5.putFloat(this.ampEma);
            var5.putFloat(this.posErrEma);
            var5.putFloat(this.camVelEma);
            var5.putFloat(this.gcdYawEma);
            var5.putFloat(this.gcdPitchEma);
            var5.putFloat(this.samples);
            String var16 = Base64.getEncoder().encodeToString(var5.array());
            String var22 = "{\"v\":11,\"b64\":\"" + var16 + "\"}";
            Files.writeString(this.method4339(var1), var22, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
         } catch (Exception var10) {
         }
      }
   }

   void load() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null) {
         try {
            Path var2 = this.method4339(var1);
            if (!Files.exists(var2)) {
               return;
            }

            String var3 = Files.readString(var2, StandardCharsets.UTF_8);
            int var4 = var3.indexOf("\"b64\":\"");
            if (var4 < 0) {
               return;
            }

            int var5 = var4 + 7;
            int var6 = var3.indexOf(34, var5);
            if (var6 <= var5) {
               return;
            }

            String var7 = var3.substring(var5, var6);
            byte[] var8 = Base64.getDecoder().decode(var7);
            ByteBuffer var9 = ByteBuffer.wrap(var8).order(ByteOrder.LITTLE_ENDIAN);
            int var10 = var9.getInt();
            int var11 = var9.getInt();
            int var12 = var9.getInt();
            int var13 = var9.getInt();
            if (var10 != 10 || var11 != 32 || var12 != 32 || var13 != 3) {
               return;
            }

            if (var8.length < 16 + (this.w1.length + this.b1.length + this.w2.length + this.b2.length + this.w3.length + this.b3.length + 10) * 4) {
               return;
            }

            for (int var14 = 0; var14 < this.w1.length; var14++) {
               this.w1[var14] = var9.getFloat();
            }

            for (int var16 = 0; var16 < this.b1.length; var16++) {
               this.b1[var16] = var9.getFloat();
            }

            for (int var17 = 0; var17 < this.w2.length; var17++) {
               this.w2[var17] = var9.getFloat();
            }

            for (int var18 = 0; var18 < this.b2.length; var18++) {
               this.b2[var18] = var9.getFloat();
            }

            for (int var19 = 0; var19 < this.w3.length; var19++) {
               this.w3[var19] = var9.getFloat();
            }

            for (int var20 = 0; var20 < this.b3.length; var20++) {
               this.b3[var20] = var9.getFloat();
            }

            this.yawSpeedEma = var9.getFloat();
            this.pitchSpeedEma = var9.getFloat();
            this.yawJitterEma = var9.getFloat();
            this.pitchJitterEma = var9.getFloat();
            this.ampEma = var9.getFloat();
            this.posErrEma = var9.getFloat();
            this.camVelEma = var9.getFloat();
            this.gcdYawEma = var9.getFloat();
            this.gcdPitchEma = var9.getFloat();
            this.samples = var9.getFloat();
         } catch (Exception var15) {
         }
      }
   }

   Vec3d method4341(float var1, float var2) {
      double var3 = Math.toRadians(var1);
      double var5 = Math.toRadians(var2);
      double var7 = Math.cos(var5);
      return new Vec3d(-Math.sin(var3) * var7, -Math.sin(var5), Math.cos(var3) * var7);
   }
}
