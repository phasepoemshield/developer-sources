package l;

import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Neuro2 extends Helper353 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static final float MAX_YAW_STEP = 24.0F;
   private static final float MAX_PITCH_STEP = 7.0F;
   private static final float BUFFER_YAW_LERP = 0.72F;
   private static final float BUFFER_PITCH_LERP = 0.38F;
   private static final int CHANGE_TICKS = 5;
   private static float lastOutYaw;
   private static float lastOutPitch;
   private static float currentYawOffset = 0.0F;
   private static float currentPitchOffset = 0.0F;
   private static float prevYawOffset = 0.0F;
   private static float prevPitchOffset = 0.0F;
   private static float nextYawOffset = 0.0F;
   private static float nextPitchOffset = 0.0F;
   private static float bufferedYaw;
   private static float bufferedPitch;
   private static int changeTimer = 0;

   public Neuro2() {
      super("Neuro");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      if (mc.player != null && mc.world != null && var4 != null) {
         LivingEntity var5 = Aura.getInstance().getTarget();
         if (var5 == null) {
            method4377("default");
            return var2;
         } else {
            if (lastOutYaw == 0.0F && lastOutPitch == 0.0F) {
               lastOutYaw = var1.method3333();
               lastOutPitch = var1.method3334();
               bufferedYaw = lastOutYaw;
               bufferedPitch = lastOutPitch;
            }

            Vec3d var6 = mc.player.getEyePos();
            Vec3d var7 = var5.getBoundingBox().getCenter();
            Vec3d var8 = var7.subtract(var6);
            Helper336 var9 = Helper349.method3469(var8);
            float var10 = var9.method3333();
            float var11 = var9.method3334();
            double var12 = mc.player.distanceTo(var5);
            String var14 = var12 <= 3.2 ? "close" : (var12 <= 4.5 ? "mid" : "far");
            method4377(var14);
            double var15 = Math.max(Math.hypot(var8.x, var8.z), 0.5);
            float var17 = var5.getWidth() / 2.0F;
            float var18 = (float)Math.toDegrees(Math.atan(var17 / var15));
            float var19 = MathHelper.clamp(currentYawOffset, -var18, var18);
            float var20 = (float)(var5.getBoundingBox().maxY - var5.getBoundingBox().minY);
            float var21 = var20 / 2.0F * 0.93F;
            float var22 = (float)Math.toDegrees(Math.atan(var21 / var15));
            float var23 = MathHelper.clamp(currentPitchOffset, -var22, var22);
            float var24 = MathHelper.wrapDegrees(var10 + var19);
            float var25 = MathHelper.clamp(var11 + var23, -89.9F, 89.9F);
            bufferedYaw = lastOutYaw + MathHelper.wrapDegrees(var24 - lastOutYaw) * 0.72F;
            bufferedPitch = MathHelper.lerp(0.38F, lastOutPitch, var25);
            float var26 = MathHelper.wrapDegrees(bufferedYaw - lastOutYaw);
            float var27 = bufferedPitch - lastOutPitch;
            float var28 = MathHelper.clamp(var26, -24.0F, 24.0F);
            float var29 = MathHelper.clamp(var27, -7.0F, 7.0F);
            if (Math.abs(var26) < 1.1F) {
               var28 *= 0.75F;
            }

            if (Math.abs(var27) < 1.4F) {
               var29 *= 0.4F;
            }

            float var30 = lastOutYaw + var28;
            float var31 = lastOutPitch + var29;
            var30 = MathHelper.wrapDegrees(var30);
            var31 = MathHelper.clamp(var31, -89.9F, 89.9F);
            lastOutYaw = var30;
            lastOutPitch = var31;
            return new Helper336(var30, var31).method3326();
         }
      } else {
         return var2;
      }
   }

   private static void method4377(String var0) {
      changeTimer++;
      if (changeTimer == 1 || changeTimer >= 5) {
         prevYawOffset = nextYawOffset;
         prevPitchOffset = nextPitchOffset;
         Helper382 var1 = Helper383.method3883(var0);
         if (var1 == null) {
            var1 = Helper383.method3883("default");
         }

         if (var1 != null) {
            nextYawOffset = var1.method3875();
            nextPitchOffset = var1.method3876();
         } else {
            nextYawOffset = 0.0F;
            nextPitchOffset = 0.0F;
         }

         if (changeTimer >= 5) {
            changeTimer = 1;
         }
      }

      float var4 = MathHelper.clamp(changeTimer / 5.0F, 0.0F, 1.0F);
      float var2 = MathHelper.lerp(var4, prevYawOffset, nextYawOffset);
      float var3 = MathHelper.lerp(var4, prevPitchOffset, nextPitchOffset);
      currentYawOffset = MathHelper.lerp(0.6F, currentYawOffset, var2);
      currentPitchOffset = MathHelper.lerp(0.6F, currentPitchOffset, var3);
   }

   @Override
   public Vec3d method3149() {
      return Vec3d.ZERO;
   }
}
