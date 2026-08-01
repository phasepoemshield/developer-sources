package l;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class Helper421 {
   private static final int DIST_BINS = 14;
   private static final int SPEED_BINS = 10;
   private static final int AIR_BINS = 2;
   private static final int MODE_BINS = 2;
   private static final int SIDE_BINS = 3;
   private static final int SIZE = 1680;
   private static final float DIST_MAX = 6.0F;
   private static final float SPEED_MAX = 0.75F;
   private static final int NN_IN = 7;
   private static final int NN_H1 = 24;
   private static final int NN_H2 = 16;
   private static final int NN_OUT = 13;
   private static final int MAGIC = 1330790734;
   private final Helper419 net = new Helper419(7, 24, 16, 13);
   private final int[] count = new int[1680];
   private final float[] fbYawAvg = new float[1680];
   private final float[] fbPitchAvg = new float[1680];
   private final float[] fbErrEma = new float[1680];
   private final int[] fbCount = new int[1680];
   private float lossEma = 0.0F;

   public Helper421() {
   }

   private Path method4251(MinecraftClient var1) {
      File var2 = new File(var1.runDirectory, "Releon");
      if (!var2.exists()) {
         var2.mkdirs();
      }

      return new File(var2, "neuro_aura.json").toPath();
   }

   private static int method4252(Vec3d var0, float var1) {
      if (var0 == null) {
         return 1;
      } else {
         double var2 = var0.x;
         double var4 = var0.z;
         double var6 = Math.sqrt(var2 * var2 + var4 * var4);
         if (var6 < 0.02) {
            return 1;
         } else {
            double var8 = Math.toRadians(var1);
            double var10 = Math.cos(var8);
            double var12 = Math.sin(var8);
            double var14 = var2 * var10 + var4 * var12;
            if (var14 > 0.03) {
               return 2;
            } else {
               return var14 < -0.03 ? 0 : 1;
            }
         }
      }
   }

   private int method4253(int var1, int var2, int var3, int var4, int var5) {
      int var6 = MathHelper.clamp(var1, 0, 13);
      var6 = var6 * 10 + MathHelper.clamp(var2, 0, 9);
      var6 = var6 * 2 + MathHelper.clamp(var3, 0, 1);
      var6 = var6 * 2 + MathHelper.clamp(var4, 0, 1);
      return var6 * 3 + MathHelper.clamp(var5, 0, 2);
   }

   private int method4254(LivingEntity var1, boolean var2) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3.player != null && var1 != null) {
         float var4 = var3.player.distanceTo(var1);
         Vec3d var5 = var1.getVelocity();
         float var6 = (float)Math.sqrt(var5.x * var5.x + var5.z * var5.z);
         boolean var7 = var3.player.isGliding() || var1.isGliding() || !var3.player.isOnGround();
         int var8 = var7 ? 1 : 0;
         float var9 = MathHelper.clamp(var4 / 6.0F, 0.0F, 1.0F);
         float var10 = MathHelper.clamp(var6 / 0.75F, 0.0F, 1.0F);
         int var11 = MathHelper.clamp((int)Math.floor(var9 * 13.0F), 0, 13);
         int var12 = MathHelper.clamp((int)Math.floor(var10 * 9.0F), 0, 9);
         int var13 = var2 ? 1 : 0;
         int var14 = method4252(var5, var3.player.getYaw());
         return this.method4253(var11, var12, var8, var13, var14);
      } else {
         return -1;
      }
   }

   private void method4255(float[] var1, LivingEntity var2, boolean var3) throws java.io.IOException {
      MinecraftClient var4 = MinecraftClient.getInstance();
      float var5 = 3.0F;
      float var6 = 0.0F;
      boolean var7 = false;
      int var8 = 1;
      if (var4.player != null && var2 != null) {
         var5 = var4.player.distanceTo(var2);
         Vec3d var9 = var2.getVelocity();
         var6 = (float)Math.sqrt(var9.x * var9.x + var9.z * var9.z);
         var7 = var4.player.isGliding() || var2.isGliding() || !var4.player.isOnGround();
         var8 = method4252(var9, var4.player.getYaw());
      }

      float var11 = MathHelper.clamp(var5 / 6.0F, 0.0F, 1.0F);
      float var10 = MathHelper.clamp(var6 / 0.75F, 0.0F, 1.0F);
      var1[0] = var11;
      var1[1] = var10;
      var1[2] = var7 ? 1.0F : 0.0F;
      var1[3] = var3 ? 1.0F : 0.0F;
      var1[4] = var8 == 0 ? 1.0F : 0.0F;
      var1[5] = var8 == 1 ? 1.0F : 0.0F;
      var1[6] = var8 == 2 ? 1.0F : 0.0F;
   }

   boolean method4256(
      LivingEntity var1,
      boolean var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) throws java.io.IOException {
      int var16 = this.method4254(var1, var2);
      if (var16 < 0) {
         return false;
      } else {
         float var17 = MathHelper.clamp(var15, 0.01F, 0.4F);
         float var18 = MathHelper.clamp(var3, -38.0F, 38.0F);
         float var19 = MathHelper.clamp(var4, -28.0F, 28.0F);
         float var20 = (Math.abs(var18) + Math.abs(var19)) * 0.5F;
         int var21 = this.count[var16];
         if (var21 < 2000000000) {
            this.count[var16] = var21 + 1;
         }

         float var22 = MathHelper.clamp(var17 * 0.65F, 0.01F, 0.3F);
         this.fbYawAvg[var16] = this.fbYawAvg[var16] + MathHelper.wrapDegrees(var18 - this.fbYawAvg[var16]) * var22;
         this.fbPitchAvg[var16] = this.fbPitchAvg[var16] + MathHelper.wrapDegrees(var19 - this.fbPitchAvg[var16]) * var22;
         this.fbErrEma[var16] = this.fbErrEma[var16] + (var20 - this.fbErrEma[var16]) * (var22 * 0.85F);
         int var23 = this.fbCount[var16];
         if (var23 < 2000000000) {
            this.fbCount[var16] = var23 + 1;
         }

         float[] var24 = this.net.method4236();
         this.method4255(var24, var1, var2);
         float var25 = MathHelper.clamp(var18 / 38.0F, -1.0F, 1.0F);
         float var26 = MathHelper.clamp(var19 / 28.0F, -1.0F, 1.0F);
         float var27 = MathHelper.clamp(var5, 0.0F, 1.0F);
         float var28 = MathHelper.clamp(var6, 0.0F, 1.0F);
         float var29 = MathHelper.clamp(var7, 0.0F, 1.0F);
         float var30 = MathHelper.clamp(var8, 0.0F, 240.0F) / 240.0F;
         float var31 = MathHelper.clamp(var9, 0.0F, 240.0F) / 240.0F;
         float var32 = MathHelper.clamp(var10 / 38.0F, -1.0F, 1.0F);
         float var33 = MathHelper.clamp(var11 / 28.0F, -1.0F, 1.0F);
         float var34 = var12 == 0.0F ? 0.0F : MathHelper.clamp(Math.abs(var12) / 0.45F, 0.0F, 1.0F);
         float var35 = var13 == 0.0F ? 0.0F : MathHelper.clamp(Math.abs(var13) / 0.45F, 0.0F, 1.0F);
         float var36 = MathHelper.clamp(var14 / 50.0F, 0.0F, 1.0F);
         float var37 = MathHelper.clamp(var20 / 20.0F, 0.0F, 1.0F);
         float[] var38 = this.net.method4237();
         var38[0] = var25;
         var38[1] = var26;
         var38[2] = var27;
         var38[3] = var28;
         var38[4] = var29;
         var38[5] = var30;
         var38[6] = var31;
         var38[7] = var32;
         var38[8] = var33;
         var38[9] = var34;
         var38[10] = var35;
         var38[11] = var36;
         var38[12] = var37;
         float var39 = 0.0025F + 0.02F * var17;
         if (var2) {
            var39 *= 1.1F;
         }

         float var40 = this.net.method4241(var24, var38, var39, 1.2E-4F);
         if (var40 > 0.0F) {
            if (this.lossEma == 0.0F) {
               this.lossEma = var40;
            } else {
               this.lossEma = this.lossEma + (var40 - this.lossEma) * 0.06F;
            }
         }

         return true;
      }
   }

   public Helper417 method4257(LivingEntity var1) {
      try {
         return this.method4258(var1, true);
      } catch (java.io.IOException var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public Helper417 method4258(LivingEntity var1, boolean var2) throws java.io.IOException {
      float[] var3 = this.net.method4236();
      this.method4255(var3, var1, var2);
      float[] var4 = this.net.method4240(var3);
      float var5 = MathHelper.clamp(var4[0], -1.0F, 1.0F);
      float var6 = MathHelper.clamp(var4[1], -1.0F, 1.0F);
      float var7 = MathHelper.clamp(var4[2], 0.0F, 1.0F);
      float var8 = MathHelper.clamp(var4[3], 0.0F, 1.0F);
      float var9 = MathHelper.clamp(var4[4], 0.0F, 1.0F);
      float var10 = MathHelper.clamp(var4[5], 0.0F, 1.0F);
      float var11 = MathHelper.clamp(var4[6], 0.0F, 1.0F);
      float var12 = MathHelper.clamp(var4[7], -1.0F, 1.0F);
      float var13 = MathHelper.clamp(var4[8], -1.0F, 1.0F);
      float var14 = MathHelper.clamp(var4[9], 0.0F, 1.0F);
      float var15 = MathHelper.clamp(var4[10], 0.0F, 1.0F);
      float var16 = MathHelper.clamp(var4[11], 0.0F, 1.0F);
      float var17 = MathHelper.clamp(var4[12], 0.0F, 1.0F);
      int var18 = this.method4254(var1, var2);
      float var19 = 0.0F;
      if (var18 >= 0) {
         var19 = this.count[var18];
      }

      float var20 = 1.0F - var17;
      var20 = MathHelper.clamp(var20, 0.0F, 1.0F);
      float var21 = MathHelper.clamp(var19 / 34.0F, 0.0F, 1.0F);
      if (this.net.method4235() < 24) {
         var21 *= MathHelper.clamp(this.net.method4235() / 24.0F, 0.0F, 1.0F);
      }

      float var22 = var20 * var20 * var21;
      var22 = MathHelper.clamp(var22, 0.0F, 1.0F);
      float var23 = var20 * MathHelper.clamp(var19 / 50.0F, 0.0F, 1.0F);
      var23 = MathHelper.clamp(var23, 0.0F, 1.0F);
      int var24 = (int)(var23 * 100.0F);
      Helper417 var25 = new Helper417();
      var25.yawDeltaDeg = var5 * 38.0F;
      var25.pitchDeltaDeg = var6 * 28.0F;
      var25.confidence = var22;
      var25.px = var7;
      var25.py = var8;
      var25.pz = var9;
      var25.pointConfidence = var24;
      var25.yawSpeed = var10 * 240.0F;
      var25.pitchSpeed = var11 * 240.0F;
      var25.yawJitter = var12 * 38.0F;
      var25.pitchJitter = var13 * 28.0F;
      if (var14 <= 0.001F) {
         var25.gcdYaw = 0.0F;
      } else {
         var25.gcdYaw = MathHelper.clamp(var14 * 0.45F, 0.006F, 0.45F);
      }

      if (var15 <= 0.001F) {
         var25.gcdPitch = 0.0F;
      } else {
         var25.gcdPitch = MathHelper.clamp(var15 * 0.45F, 0.006F, 0.45F);
      }

      var25.amp = var16 * 50.0F;
      return var25;
   }

   Helper418 method4259(LivingEntity var1, boolean var2) throws java.io.IOException {
      MinecraftClient var3 = MinecraftClient.getInstance();
      float var4 = 3.0F;
      float var5 = 0.0F;
      boolean var6 = false;
      int var7 = 1;
      if (var3.player != null && var1 != null) {
         var4 = var3.player.distanceTo(var1);
         Vec3d var8 = var1.getVelocity();
         var5 = (float)Math.sqrt(var8.x * var8.x + var8.z * var8.z);
         var6 = var3.player.isGliding() || var1.isGliding() || !var3.player.isOnGround();
         var7 = method4252(var8, var3.player.getYaw());
      }

      int var34 = var6 ? 1 : 0;
      int var9 = var2 ? 1 : 0;
      float var10 = MathHelper.clamp(var4 / 6.0F, 0.0F, 1.0F);
      float var11 = MathHelper.clamp(var5 / 0.75F, 0.0F, 1.0F);
      float var12 = var10 * 13.0F;
      float var13 = var11 * 9.0F;
      int var14 = MathHelper.clamp((int)Math.floor(var12), 0, 13);
      int var15 = MathHelper.clamp((int)Math.floor(var13), 0, 9);
      int var16 = Math.min(13, var14 + 1);
      int var17 = Math.min(9, var15 + 1);
      float var18 = MathHelper.clamp(var12 - var14, 0.0F, 1.0F);
      float var19 = MathHelper.clamp(var13 - var15, 0.0F, 1.0F);
      Helper416 var20 = this.method4263(var14, var15, var34, var9, var7);
      Helper416 var21 = this.method4263(var16, var15, var34, var9, var7);
      Helper416 var22 = this.method4263(var14, var17, var34, var9, var7);
      Helper416 var23 = this.method4263(var16, var17, var34, var9, var7);
      float var24 = (1.0F - var18) * (1.0F - var19);
      float var25 = var18 * (1.0F - var19);
      float var26 = (1.0F - var18) * var19;
      float var27 = var18 * var19;
      float var28 = var20.yaw * var24 + var21.yaw * var25 + var22.yaw * var26 + var23.yaw * var27;
      float var29 = var20.pitch * var24 + var21.pitch * var25 + var22.pitch * var26 + var23.pitch * var27;
      float var30 = var20.err * var24 + var21.err * var25 + var22.err * var26 + var23.err * var27;
      float var31 = var20.c * var24 + var21.c * var25 + var22.c * var26 + var23.c * var27;
      float var32 = MathHelper.clamp((float)Math.exp(-var30 * 0.1F) * MathHelper.clamp(var31 / 18.0F, 0.0F, 1.0F), 0.0F, 1.0F);
      if (var31 < 1.0F) {
         var32 = 0.0F;
      }

      Helper418 var33 = new Helper418();
      var33.yawDeltaDeg = var28;
      var33.pitchDeltaDeg = var29;
      var33.confidence = var32;
      return var33;
   }

   Vec3d method4260(LivingEntity var1, Helper417 var2) {
      if (var1 != null && var2 != null) {
         Box var3 = var1.getBoundingBox();
         double var4 = var3.minX + (var3.maxX - var3.minX) * var2.px;
         double var6 = var3.minY + (var3.maxY - var3.minY) * var2.py;
         double var8 = var3.minZ + (var3.maxZ - var3.minZ) * var2.pz;
         return new Vec3d(var4, var6, var8);
      } else {
         return null;
      }
   }

   Helper420 method4261(Helper336 var1) {
      Helper420 var2 = new Helper420();
      if (var1 == null) {
         var2.yaw = 0.0F;
         var2.pitch = 0.0F;
         return var2;
      } else {
         Vec3d var3 = var1.method3329();
         double var4 = var3.x;
         double var6 = var3.y;
         double var8 = var3.z;
         float var10 = (float)(Math.toDegrees(Math.atan2(var8, var4)) - 90.0);
         float var11 = (float)(-Math.toDegrees(Math.atan2(var6, Math.sqrt(var4 * var4 + var8 * var8))));
         var2.yaw = var10;
         var2.pitch = var11;
         return var2;
      }
   }

   Helper336 method4262(float var1, float var2) {
      return new Helper336(var1, var2);
   }

   private Helper416 method4263(int var1, int var2, int var3, int var4, int var5) throws java.io.IOException {
      int var6 = this.method4253(var1, var2, var3, var4, var5);
      float var7 = this.fbYawAvg[var6];
      float var8 = this.fbPitchAvg[var6];
      float var9 = this.fbErrEma[var6];
      float var10 = this.fbCount[var6];
      Helper416 var11 = new Helper416();
      var11.yaw = var7;
      var11.pitch = var8;
      var11.err = var9;
      var11.c = var10;
      return var11;
   }

   void load() throws java.io.IOException {
      MinecraftClient var1 = MinecraftClient.getInstance();
      File var2 = this.method4251(var1).toFile();
      if (var2.exists()) {
         String var3 = Files.readString(var2.toPath(), StandardCharsets.UTF_8);
         int var4 = method4272(var3, "v", 0);
         String var5 = method4271(var3, "b64");
         if (var5 == null) {
            var5 = method4271(var3, "data");
         }

         if (var5 == null) {
            var5 = method4271(var3, "blob");
         }

         if (var5 != null && !var5.isEmpty()) {
            byte[] var6;
            try {
               var6 = Base64.getDecoder().decode(var5);
            } catch (Exception var10) {
               return;
            }

            if (var6.length >= 16) {
               ByteBuffer var7 = ByteBuffer.wrap(var6).order(ByteOrder.LITTLE_ENDIAN);
               if (var4 >= 7) {
                  int var8 = var7.getInt();
                  int var9 = var7.getInt();
                  if (var8 == 1330790734 && var9 == 7) {
                     this.net.method4250(var7);
                     this.lossEma = var7.remaining() >= 4 ? var7.getFloat() : 0.0F;
                     method4268(var7, this.count);
                     method4267(var7, this.fbYawAvg);
                     method4267(var7, this.fbPitchAvg);
                     method4267(var7, this.fbErrEma);
                     method4268(var7, this.fbCount);
                  } else {
                     this.method4264(var7);
                  }
               } else {
                  this.method4264(var7);
               }
            }
         }
      }
   }

   private void method4264(ByteBuffer var1) throws java.io.IOException {
      float[] var2 = new float[1680];
      float[] var3 = new float[1680];
      float[] var4 = new float[1680];
      int[] var5 = new int[1680];
      float[] var6 = new float[1680];
      float[] var7 = new float[1680];
      float[] var8 = new float[1680];
      float[] var9 = new float[1680];
      float[] var10 = new float[1680];
      float[] var11 = new float[1680];
      float[] var12 = new float[1680];
      float[] var13 = new float[1680];
      float[] var14 = new float[1680];
      float[] var15 = new float[1680];
      float[] var16 = new float[1680];
      method4267(var1, var2);
      method4267(var1, var3);
      method4267(var1, var4);
      method4268(var1, var5);
      method4267(var1, var6);
      method4267(var1, var7);
      method4267(var1, var8);
      method4267(var1, var9);
      if (var1.remaining() >= 47040) {
         method4267(var1, var10);
         method4267(var1, var11);
         method4267(var1, var12);
         method4267(var1, var13);
         method4267(var1, var14);
         method4267(var1, var15);
         method4267(var1, var16);
      }

      if (var1.remaining() >= 47040) {
         float[] var17 = new float[11760];
         method4267(var1, var17);
      }

      if (var1.remaining() >= 26880) {
         float[] var18 = new float[6720];
         method4267(var1, var18);
      }

      if (var1.remaining() >= this.fbYawAvg.length * 4 + this.fbPitchAvg.length * 4 + this.fbErrEma.length * 4 + this.fbCount.length * 4) {
         method4267(var1, this.fbYawAvg);
         method4267(var1, this.fbPitchAvg);
         method4267(var1, this.fbErrEma);
         method4268(var1, this.fbCount);
      } else {
         for (int var19 = 0; var19 < 1680; var19++) {
            this.fbYawAvg[var19] = var2[var19];
            this.fbPitchAvg[var19] = var3[var19];
            this.fbErrEma[var19] = var4[var19];
            this.fbCount[var19] = Math.min(var5[var19], 160);
         }
      }

      for (int var20 = 0; var20 < 1680; var20++) {
         this.count[var20] = var5[var20];
      }

      this.method4265(var2, var3, var6, var7, var8, var10, var11, var12, var13, var14, var15, var16, var5);
   }

   private void method4265(
      float[] var1,
      float[] var2,
      float[] var3,
      float[] var4,
      float[] var5,
      float[] var6,
      float[] var7,
      float[] var8,
      float[] var9,
      float[] var10,
      float[] var11,
      float[] var12,
      int[] var13
   ) throws java.io.IOException {
      short var14 = 900;

      for (int var15 = 0; var15 < var14; var15++) {
         int var16 = ThreadLocalRandom.current().nextInt(1680);
         int var17 = var13[var16];
         if (var17 > 0 || !(ThreadLocalRandom.current().nextFloat() < 0.7F)) {
            int var19 = var16 % 3;
            int var18 = var16 / 3;
            int var20 = var18 % 2;
            var18 /= 2;
            int var21 = var18 % 2;
            var18 /= 2;
            int var22 = var18 % 10;
            var18 /= 10;
            int var23 = var18 % 14;
            float var24 = (var23 + 0.5F) / 13.0F;
            float var25 = (var22 + 0.5F) / 9.0F;
            float[] var26 = this.net.method4236();
            var26[0] = MathHelper.clamp(var24, 0.0F, 1.0F);
            var26[1] = MathHelper.clamp(var25, 0.0F, 1.0F);
            var26[2] = var21 == 1 ? 1.0F : 0.0F;
            var26[3] = var20 == 1 ? 1.0F : 0.0F;
            var26[4] = var19 == 0 ? 1.0F : 0.0F;
            var26[5] = var19 == 1 ? 1.0F : 0.0F;
            var26[6] = var19 == 2 ? 1.0F : 0.0F;
            float var27 = MathHelper.clamp(var1[var16], -38.0F, 38.0F);
            float var28 = MathHelper.clamp(var2[var16], -28.0F, 28.0F);
            float var29 = var3[var16];
            float var30 = var4[var16];
            float var31 = var5[var16];
            if (var29 == 0.0F) {
               var29 = 0.5F;
            }

            if (var30 == 0.0F) {
               var30 = 0.5F;
            }

            if (var31 == 0.0F) {
               var31 = 0.5F;
            }

            float var32 = var6[var16];
            float var33 = var7[var16];
            float var34 = var8[var16];
            float var35 = var9[var16];
            float var36 = var10[var16];
            float var37 = var11[var16];
            float var38 = var12[var16];
            float var39 = (Math.abs(var27) + Math.abs(var28)) * 0.5F;
            float[] var40 = this.net.method4237();
            var40[0] = MathHelper.clamp(var27 / 38.0F, -1.0F, 1.0F);
            var40[1] = MathHelper.clamp(var28 / 28.0F, -1.0F, 1.0F);
            var40[2] = MathHelper.clamp(var29, 0.0F, 1.0F);
            var40[3] = MathHelper.clamp(var30, 0.0F, 1.0F);
            var40[4] = MathHelper.clamp(var31, 0.0F, 1.0F);
            var40[5] = MathHelper.clamp(Math.abs(var32) / 240.0F, 0.0F, 1.0F);
            var40[6] = MathHelper.clamp(Math.abs(var33) / 240.0F, 0.0F, 1.0F);
            var40[7] = MathHelper.clamp(var34 / 38.0F, -1.0F, 1.0F);
            var40[8] = MathHelper.clamp(var35 / 28.0F, -1.0F, 1.0F);
            var40[9] = var36 == 0.0F ? 0.0F : MathHelper.clamp(Math.abs(var36) / 0.45F, 0.0F, 1.0F);
            var40[10] = var37 == 0.0F ? 0.0F : MathHelper.clamp(Math.abs(var37) / 0.45F, 0.0F, 1.0F);
            var40[11] = MathHelper.clamp(var38 / 50.0F, 0.0F, 1.0F);
            var40[12] = MathHelper.clamp(var39 / 20.0F, 0.0F, 1.0F);
            float var41 = 0.0038F;
            if (var17 > 0) {
               var41 *= MathHelper.clamp((float)Math.sqrt(Math.min(var17, 3000)) / 20.0F, 0.55F, 1.35F);
            }

            this.net.method4241(var26, var40, var41, 1.0E-4F);
         }
      }
   }

   void method4266() throws java.io.IOException {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null) {
         int var2 = 8
            + this.net.method4248()
            + 4
            + this.count.length * 4
            + (this.fbYawAvg.length + this.fbPitchAvg.length + this.fbErrEma.length) * 4
            + this.fbCount.length * 4;
         ByteBuffer var3 = ByteBuffer.allocate(var2).order(ByteOrder.LITTLE_ENDIAN);
         var3.putInt(1330790734);
         var3.putInt(7);
         this.net.method4249(var3);
         var3.putFloat(this.lossEma);
         method4270(var3, this.count);
         method4269(var3, this.fbYawAvg);
         method4269(var3, this.fbPitchAvg);
         method4269(var3, this.fbErrEma);
         method4270(var3, this.fbCount);
         byte[] var4 = new byte[var3.position()];
         var3.rewind();
         var3.get(var4);
         String var5 = Base64.getEncoder().encodeToString(var4);
         String var6 = "{\"v\":7,\"b64\":\"" + var5 + "\"}";
         File var7 = this.method4251(var1).toFile();
         Files.writeString(var7.toPath(), var6, StandardCharsets.UTF_8);
      }
   }

   static void method4267(ByteBuffer var0, float[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var0.remaining() < 4) {
            return;
         }

         var1[var2] = var0.getFloat();
      }
   }

   private static void method4268(ByteBuffer var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var0.remaining() < 4) {
            return;
         }

         var1[var2] = var0.getInt();
      }
   }

   static void method4269(ByteBuffer var0, float[] var1) {
      for (float var5 : var1) {
         var0.putFloat(var5);
      }
   }

   private static void method4270(ByteBuffer var0, int[] var1) {
      for (int var5 : var1) {
         var0.putInt(var5);
      }
   }

   private static String method4271(String var0, String var1) {
      int var2 = var0.indexOf("\"" + var1 + "\"");
      if (var2 < 0) {
         return null;
      } else {
         int var3 = var0.indexOf(":", var2);
         if (var3 < 0) {
            return null;
         } else {
            int var4 = var0.indexOf("\"", var3 + 1);
            if (var4 < 0) {
               return null;
            } else {
               int var5 = var0.indexOf("\"", var4 + 1);
               if (var5 < 0) {
                  return null;
               } else {
                  String var6 = var0.substring(var4 + 1, var5).trim();
                  return var6.isEmpty() ? null : var6;
               }
            }
         }
      }
   }

   private static int method4272(String var0, String var1, int var2) {
      int var3 = var0.indexOf("\"" + var1 + "\"");
      if (var3 < 0) {
         return var2;
      } else {
         int var4 = var0.indexOf(":", var3);
         if (var4 < 0) {
            return var2;
         } else {
            int var5 = var4 + 1;

            while (var5 < var0.length() && (var0.charAt(var5) == ' ' || var0.charAt(var5) == '\n' || var0.charAt(var5) == '\r' || var0.charAt(var5) == '\t')) {
               var5++;
            }

            int var6;
            for (var6 = var5; var5 < var0.length(); var5++) {
               char var7 = var0.charAt(var5);
               if (var7 < '0' || var7 > '9') {
                  break;
               }
            }

            if (var5 <= var6) {
               return var2;
            } else {
               try {
                  return Integer.parseInt(var0.substring(var6, var5));
               } catch (Exception var8) {
                  return var2;
               }
            }
         }
      }
   }
}
