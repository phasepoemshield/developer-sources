package l;

import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Legit extends Helper353 {
   private static final float ROTATION_SPEED = 11.0F;
   private static final float LIMIT_ROTATION_SPEED = 70.0F;
   private static final long RELEASE_HOLD_MS = 300L;
   private static final long RELEASE_SLOWDOWN_MS = 200L;
   private static final float SHAKE_INTENSITY = 0.0F;
   private static final float SHAKE_SPEED = 3.0F;
   private static final float EPSILON = 1.0F;
   private static final float MANUAL_YAW_LIMIT = 12.0F;
   private static final float MANUAL_PITCH_LIMIT = 20.0F;
   private static final float MANUAL_INFLUENCE = 0.55F;
   private static final float DESYNC_SNAP_THRESHOLD = 55.0F;
   private static final float DESYNC_RECOVER_STEP = 18.0F;
   private static final float FINAL_MAX_YAW_STEP = 22.0F;
   private static final float FINAL_MAX_PITCH_STEP = 14.0F;
   private static final float HITBOX_WIDTH_SCALE = 1.0F;
   private static final float HITBOX_HEIGHT_SCALE = 0.93F;
   private static final SecureRandom RANDOM = new SecureRandom();
   private static boolean releaseHoldActive = false;
   private static long releaseHoldUntil = 0L;
   private static boolean releaseSlowdownActive = false;
   private static long releaseSlowdownStart = 0L;
   private static Helper336 releaseFromAngle = null;
   private final Random random1 = new Random();

   public Legit() {
      super("Legit");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      boolean var6 = var5.isState() && var5.getTarget() != null && var4 != null;
      long var7 = System.currentTimeMillis();
      if (!var6) {
         if (!releaseHoldActive) {
            releaseHoldActive = true;
            releaseHoldUntil = var7 + 300L;
            releaseSlowdownActive = false;
            releaseSlowdownStart = 0L;
            releaseFromAngle = null;
         }

         if (var7 < releaseHoldUntil) {
            return new Helper336(var1.method3333(), var1.method3334()).method3326();
         } else {
            if (!releaseSlowdownActive) {
               releaseSlowdownActive = true;
               releaseSlowdownStart = var7;
               releaseFromAngle = new Helper336(var1.method3333(), var1.method3334());
            }

            float var22 = MathHelper.clamp((float)(var7 - releaseSlowdownStart) / 200.0F, 0.0F, 1.0F);
            float var23 = this.method3156(var22);
            Helper336 var24 = releaseFromAngle != null ? releaseFromAngle : var1;
            Helper336 var25 = var2 != null ? var2 : var1;
            Helper336 var26 = new Helper336(
               MathHelper.lerpAngleDegrees(var23, var24.method3333(), var25.method3333()),
               MathHelper.clamp(MathHelper.lerp(var23, var24.method3334(), var25.method3334()), -89.0F, 90.0F)
            );
            if (var22 >= 1.0F) {
               releaseSlowdownActive = false;
               releaseSlowdownStart = 0L;
               releaseFromAngle = null;
            }

            return var26.method3326();
         }
      } else {
         releaseHoldActive = false;
         releaseHoldUntil = 0L;
         releaseSlowdownActive = false;
         releaseSlowdownStart = 0L;
         releaseFromAngle = null;
         Helper336 var9 = Helper349.method3470(var1, var2);
         float var10 = var9.method3333();
         float var11 = var9.method3334();
         float var12 = (float)Math.hypot(var10, var11);
         float var13 = Math.min(Math.abs(var10), 74.0F + this.method3157(0.0F, 1.0329834F));
         float var14 = (float)Math.min((double)Math.abs(var11), 32.334);
         Helper336 var15 = new Helper336(var1.method3333(), var1.method3334());
         float var16 = 1.0F + this.method3157(0.0F, 0.35F);
         if (var12 > var16) {
            boolean var17 = Math.abs(var11) >= var14;
            float var18 = var17 ? this.method3157(45.5F, 70.0F) : this.method3157(7.7F, 12.1F);
            float var19 = Math.min(var12, var18);
            float var20 = var19 / var12;
            if (!var17) {
               var20 = this.method3156(var20);
            }

            float var21 = MathHelper.clamp(var1.method3334() + var11 * var20, -89.0F, 90.0F);
            var15.method3336(var21);
         }

         if (var12 > var16) {
            boolean var27 = Math.abs(var10) >= var13;
            float var29 = var27 ? this.method3157(45.5F, 70.0F) : this.method3157(7.7F, 12.1F);
            float var30 = Math.min(var12, var29);
            float var31 = var30 / var12;
            if (!var27) {
               var31 = this.method3156(var31);
            }

            float var32 = var1.method3333() + var10 * var31;
            var15.method3335(var32);
         }

         boolean var28 = this.method3152(var15, var1);
         if (!var28) {
            this.method3153(var15, var4);
            this.method3154(var15);
            this.method3153(var15, var4);
         }

         this.method3155(var15, var1);
         return var15.method3326();
      }
   }

   private boolean method3152(Helper336 var1, Helper336 var2) {
      if (mc.player == null) {
         return false;
      } else {
         float var3 = MathHelper.wrapDegrees(mc.player.getYaw() - var2.method3333());
         if (Math.abs(var3) > 55.0F) {
            var1.method3335(var2.method3333() + MathHelper.clamp(var3, -18.0F, 18.0F));
            var1.method3336(MathHelper.lerp(0.75F, var1.method3334(), mc.player.getPitch()));
            var1.method3336(MathHelper.clamp(var1.method3334(), -89.0F, 89.0F));
            return true;
         } else {
            float var5 = mc.player.getPitch() - var2.method3334();
            float var4 = MathHelper.clamp(var3, -12.0F, 12.0F);
            var5 = MathHelper.clamp(var5, -20.0F, 20.0F);
            var1.method3335(var1.method3333() + var4 * 0.55F);
            var1.method3336(var1.method3334() + var5 * 0.55F);
            var1.method3336(MathHelper.clamp(var1.method3334(), -89.0F, 89.0F));
            return false;
         }
      }
   }

   private void method3153(Helper336 var1, Entity var2) {
      if (mc.player != null && var2 != null) {
         Vec3d var3 = mc.player.getEyePos();
         Vec3d var4 = var2.getBoundingBox().getCenter();
         Vec3d var5 = var4.subtract(var3);
         double var6 = Math.max(Math.hypot(var5.x, var5.z), 0.35);
         Helper336 var8 = Helper349.method3469(var5);
         float var9 = Math.max(var2.getWidth() * 0.5F * 1.0F, 0.12F);
         float var10 = Math.max(var2.getHeight() * 0.5F * 0.93F, 0.25F);
         float var11 = (float)Math.toDegrees(Math.atan(var9 / var6));
         float var12 = (float)Math.toDegrees(Math.atan(var10 / var6));
         float var13 = MathHelper.wrapDegrees(var1.method3333() - var8.method3333());
         float var14 = var1.method3334() - var8.method3334();
         var13 = MathHelper.clamp(var13, -var11, var11);
         var14 = MathHelper.clamp(var14, -var12, var12);
         var1.method3335(MathHelper.wrapDegrees(var8.method3333() + var13));
         var1.method3336(MathHelper.clamp(var8.method3334() + var14, -89.0F, 89.0F));
      }
   }

   private void method3154(Helper336 var1) {
      if (mc.player != null) {
      }
   }

   private void method3155(Helper336 var1, Helper336 var2) {
      float var3 = MathHelper.clamp(MathHelper.wrapDegrees(var1.method3333() - var2.method3333()), -22.0F, 22.0F);
      float var4 = MathHelper.clamp(var1.method3334() - var2.method3334(), -14.0F, 14.0F);
      var1.method3335(MathHelper.wrapDegrees(var2.method3333() + var3));
      var1.method3336(MathHelper.clamp(var2.method3334() + var4, -89.0F, 89.0F));
   }

   private float method3156(float var1) {
      return var1 * (0.5F + 0.5F * var1);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.1, 0.1, 0.1);
   }

   private float method3157(float var1, float var2) {
      return MathHelper.lerp(RANDOM.nextFloat(), var1, var2);
   }
}
