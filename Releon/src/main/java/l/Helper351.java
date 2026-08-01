package l;

import fat.releon.Releon;
import java.util.Objects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Helper351 implements Helper160 {
   public static Helper351 INSTANCE = new Helper351();
   private static final Helper353 USE_ITEM_RETURN_SMOOTH = new UseBack(1.0F);
   private static final Helper353 TARGET_LOSS_RETURN_SMOOTH = new UseBack(0.62F);
   private Helper352 lastRotationPlan;
   private final Helper356<Helper352> rotationPlanTaskProcessor = new Helper356<>();
   public Helper336 currentAngle;
   private Helper336 previousAngle;
   private Helper336 serverAngle = Helper336.DEFAULT;
   private Helper336 fakeAngle;
   private Helper336 previousFakeAngle;
   private Float fakeBodyYaw;
   private Float previousFakeBodyYaw;
   private boolean returning;
   private boolean returnMoveCorrection;
   private boolean returnFreeCorrection;
   private double returnStartDifference;
   private int forcePacketRotationTicks;
   private boolean useItemReturnPending;
   private int staleInactiveTicks;
   private boolean rotationRequestedThisTick;
   private boolean queuedRotationTaskThisTick;

   public Helper351() {
      Releon.method71().method15().method1016(this);
   }

   public void method3482(Helper336 var1) {
      if (var1 == null) {
         this.previousAngle = this.currentAngle != null ? this.currentAngle : (mc.player != null ? Helper349.method3473() : Helper336.DEFAULT);
      } else {
         this.previousAngle = this.currentAngle;
      }

      this.currentAngle = var1;
   }

   public Helper336 method3483() {
      if (this.currentAngle != null) {
         return this.currentAngle;
      } else {
         return mc.player != null ? Helper349.method3473() : Helper336.DEFAULT;
      }
   }

   public float method3484() {
      return this.method3487().method3333();
   }

   public float method3485() {
      return MathHelper.clamp(this.method3487().method3334(), -90.0F, 90.0F);
   }

   public boolean method3486() {
      return this.currentAngle != null || this.fakeAngle != null || this.forcePacketRotationTicks > 0 && this.previousAngle != null;
   }

   private Helper336 method3487() {
      if (this.currentAngle != null) {
         return this.currentAngle;
      } else if (this.fakeAngle != null) {
         return this.fakeAngle;
      } else if (this.forcePacketRotationTicks > 0 && this.previousAngle != null) {
         return this.previousAngle;
      } else {
         return mc.player != null ? Helper349.method3473() : Helper336.DEFAULT;
      }
   }

   public void method3488(int var1) {
      if (var1 > 0) {
         this.forcePacketRotationTicks = Math.max(this.forcePacketRotationTicks, var1);
      }
   }

   public Helper336 method3489() {
      if (this.fakeAngle != null) {
         return this.fakeAngle;
      } else if (this.currentAngle != null) {
         return this.currentAngle;
      } else if (this.previousAngle != null) {
         return this.previousAngle;
      } else {
         return mc.player != null ? Helper349.method3473() : Helper336.DEFAULT;
      }
   }

   public Helper336 method3490() {
      return this.previousFakeAngle != null ? this.previousFakeAngle : this.method3489();
   }

   public float method3491() {
      return this.fakeBodyYaw != null ? this.fakeBodyYaw : this.method3489().method3333();
   }

   public float method3492() {
      return this.previousFakeBodyYaw != null ? this.previousFakeBodyYaw : this.method3491();
   }

   public void method3493(Helper336 var1) {
      var1 = this.method3494(var1, this.fakeAngle);
      if (var1 == null) {
         this.previousFakeAngle = null;
         this.fakeAngle = null;
         this.previousFakeBodyYaw = null;
         this.fakeBodyYaw = null;
      } else {
         this.previousFakeAngle = this.fakeAngle != null ? this.fakeAngle : var1;
         this.fakeAngle = var1;
         float var2 = var1.method3333();
         if (this.fakeBodyYaw == null) {
            this.fakeBodyYaw = var2;
            this.previousFakeBodyYaw = var2;
         } else {
            this.previousFakeBodyYaw = this.fakeBodyYaw;
            float var3 = MathHelper.wrapDegrees(var2 - this.fakeBodyYaw);
            float var4 = MathHelper.clamp(var3, -8.0F, 8.0F);
            this.fakeBodyYaw = this.fakeBodyYaw + var4;
         }
      }
   }

   private Helper336 method3494(Helper336 var1, Helper336 var2) {
      if (var1 == null) {
         return null;
      } else {
         float var3 = var1.method3333();
         if (var2 != null) {
            var3 = var2.method3333() + MathHelper.wrapDegrees(var3 - var2.method3333());
         } else {
            var3 = MathHelper.wrapDegrees(var3);
         }

         return new Helper336(var3, MathHelper.clamp(var1.method3334(), -90.0F, 90.0F));
      }
   }

   public Helper336 method3495() {
      if (mc.player == null) {
         return this.currentAngle != null ? this.currentAngle : Helper336.DEFAULT;
      } else {
         return this.currentAngle != null && this.previousAngle != null ? this.previousAngle : new Helper336(mc.player.prevYaw, mc.player.prevPitch);
      }
   }

   public Helper336 method3496() {
      Helper352 var1 = this.method3499();
      return this.currentAngle != null && var1 != null && var1.method3547()
         ? this.currentAngle
         : (mc.player != null ? Helper349.method3473() : Helper336.DEFAULT);
   }

   public boolean method3497() {
      Helper352 var1 = this.method3499();
      return this.currentAngle != null && var1 != null && var1.method3547();
   }

   public boolean method3498() {
      if (!this.method3497()) {
         return false;
      } else {
         Helper352 var1 = this.method3499();
         return var1 != null && var1.method3549();
      }
   }

   public Helper352 method3499() {
      Helper352 var1 = this.rotationPlanTaskProcessor.method3568();
      return var1 != null ? var1 : this.lastRotationPlan;
   }

   public void method3500(Helper335 var1, LivingEntity var2, int var3, Helper334 var4, Helper153 var5, Helper242 var6) {
      this.method3503(var4.method3321(var1.method3323(), var1.method3324(), var2, var3), var5, var6);
   }

   public void method3501(Helper336 var1, int var2, Helper334 var3, Helper153 var4, Helper242 var5) {
      this.method3503(var3.method3321(var1, var1.method3329(), null, var2), var4, var5);
   }

   public void method3502(Helper336 var1, Helper334 var2, Helper153 var3, Helper242 var4) {
      this.method3503(var2.method3321(var1, var1.method3329(), null, 1), var3, var4);
   }

   public void method3503(Helper352 var1, Helper153 var2, Helper242 var3) {
      this.returning = false;
      this.returnMoveCorrection = false;
      this.returnFreeCorrection = false;
      this.useItemReturnPending = false;
      this.rotationRequestedThisTick = true;
      this.rotationPlanTaskProcessor.method3567(new Helper355<>(1, var2.method1279(), var3, var1));
   }

   public void method3504(MinecraftClient var1) {
      if (var1 != null && var1.player != null && this.currentAngle != null) {
         var1.player.setYaw(this.currentAngle.method3333());
         var1.player.setPitch(this.currentAngle.method3334());
         var1.player.getPitch(this.currentAngle.method3333());
         var1.player.getYaw(this.currentAngle.method3333());
      }
   }

   public void method3505() {
      Helper352 var1 = this.method3499();
      if (var1 != null) {
         Helper336 var2 = new Helper336(mc.player.getYaw(), mc.player.getPitch());
         if (this.lastRotationPlan != null) {
            double var3 = method3506(this.serverAngle, var2);
            if (var1.method3545() <= this.rotationPlanTaskProcessor.tickCounter && var3 < 1.0) {
               if (!this.returning) {
                  mc.player.setYaw(this.method3483().method3333());
                  mc.player.setPitch(this.method3483().method3334());
               }

               this.method3482(null);
               this.lastRotationPlan = null;
               this.rotationPlanTaskProcessor.tickCounter = 0;
               this.returning = false;
               this.returnMoveCorrection = false;
               this.returnFreeCorrection = false;
               this.useItemReturnPending = false;
               return;
            }
         }

         Helper336 var5 = var1.method3539(this.currentAngle != null ? this.currentAngle : var2, this.rotationPlanTaskProcessor.method3568() == null)
            .method3326();
         this.method3482(var5);
         this.lastRotationPlan = var1;
         this.rotationPlanTaskProcessor.method3566(1);
      }
   }

   public static double method3506(Helper336 var0, Helper336 var1) {
      return Math.hypot(Math.abs(method3507(var0.method3333(), var1.method3333())), Math.abs(var0.method3334() - var1.method3334()));
   }

   public static float method3507(float var0, float var1) {
      return MathHelper.wrapDegrees(var0 - var1);
   }

   private Vec3d method3508(Vec3d var1, Vec3d var2, float var3) {
      if (this.currentAngle != null) {
         float var4 = this.currentAngle.method3333();
         double var5 = var2.lengthSquared();
         if (var5 < 1.0E-7) {
            return Vec3d.ZERO;
         } else {
            Vec3d var7 = (var5 > 1.0 ? var2.normalize() : var2).multiply(var3);
            float var8 = MathHelper.sin(var4 * (float) (Math.PI / 180.0));
            float var9 = MathHelper.cos(var4 * (float) (Math.PI / 180.0));
            return new Vec3d(var7.getX() * var9 - var7.getZ() * var8, var7.getY(), var7.getZ() * var9 + var7.getX() * var8);
         }
      } else {
         return var1;
      }
   }

   public void method3509() {
      this.rotationPlanTaskProcessor.activeTasks.clear();
      this.currentAngle = null;
      this.previousAngle = null;
      this.lastRotationPlan = null;
      this.returning = false;
      this.returnMoveCorrection = false;
      this.returnFreeCorrection = false;
      this.useItemReturnPending = false;
   }

   public void method3510() {
      this.method3515(null);
   }

   public void method3511() {
      this.method3515(TARGET_LOSS_RETURN_SMOOTH);
   }

   public void method3512() {
      this.useItemReturnPending = true;
      this.method3515(USE_ITEM_RETURN_SMOOTH);
   }

   public boolean method3513() {
      if (!this.method3514()) {
         this.useItemReturnPending = false;
         return false;
      } else {
         if (!this.useItemReturnPending) {
            this.method3512();
         }

         return true;
      }
   }

   public boolean method3514() {
      if (mc.player == null) {
         return false;
      } else {
         Helper336 var1 = Helper349.method3473();
         if (this.returning) {
            return true;
         } else if (this.currentAngle != null && method3506(this.currentAngle, var1) > 0.35) {
            return true;
         } else {
            return this.fakeAngle != null && method3506(this.fakeAngle, var1) > 0.35
               ? true
               : this.forcePacketRotationTicks > 0 && this.previousAngle != null && method3506(this.previousAngle, var1) > 0.35;
         }
      }
   }

   private void method3515(Helper353 var1) {
      Helper352 var2 = this.rotationPlanTaskProcessor.method3568();
      Helper352 var3 = var2 != null ? var2 : this.lastRotationPlan;
      if (var3 != null) {
         var3 = this.method3516(var3, var1 != null ? var1 : var3.method3544());
      } else if (this.currentAngle != null) {
         Object var4 = var1 != null ? var1 : new Linear();
         var3 = new Helper352(this.currentAngle, this.currentAngle.method3329(), null, (Helper353)var4, 1, 1.0F, false, false);
      }

      this.lastRotationPlan = var3;
      this.rotationPlanTaskProcessor.activeTasks.clear();
      this.rotationPlanTaskProcessor.tickCounter = 0;
      this.returning = this.currentAngle != null && this.lastRotationPlan != null;
      if (!this.returning && !this.method3514()) {
         this.useItemReturnPending = false;
      }
   }

   private Helper352 method3516(Helper352 var1, Helper353 var2) {
      Helper352 var3 = new Helper352(
         var1.method3541(), var1.method3542(), var1.method3543(), var2, var1.method3545(), var1.method3546(), var1.method3547(), var1.method3549()
      );
      var3.method3540(var1.method3548());
      return var3;
   }

   public void method3517() {
      this.method3509();
      this.currentAngle = null;
      this.previousAngle = null;
      this.fakeAngle = null;
      this.previousFakeAngle = null;
      this.fakeBodyYaw = null;
      this.previousFakeBodyYaw = null;
      this.lastRotationPlan = null;
      this.rotationPlanTaskProcessor.tickCounter = 0;
      this.returning = false;
      this.returnMoveCorrection = false;
      this.returnFreeCorrection = false;
      this.returnStartDifference = 0.0;
      this.forcePacketRotationTicks = 0;
      this.useItemReturnPending = false;
      this.staleInactiveTicks = 0;
   }

   public void method3518() {
      if (mc.player == null) {
         this.method3517();
      } else {
         Helper336 var1 = Helper349.method3473();
         Helper336 var2 = this.method3494(var1, this.currentAngle != null ? this.currentAngle : var1);
         this.currentAngle = var2;
         this.previousAngle = var2;
         this.fakeAngle = null;
         this.previousFakeAngle = null;
         this.fakeBodyYaw = null;
         this.previousFakeBodyYaw = null;
         this.returning = false;
         this.returnMoveCorrection = false;
         this.returnFreeCorrection = false;
         this.returnStartDifference = 0.0;
         this.forcePacketRotationTicks = 0;
         this.useItemReturnPending = false;
      }
   }

   private boolean method3519() {
      return this.currentAngle != null
         || this.fakeAngle != null
         || this.previousAngle != null
         || this.previousFakeAngle != null
         || this.lastRotationPlan != null
         || this.returning
         || this.useItemReturnPending;
   }

   private boolean method3520() {
      return this.rotationRequestedThisTick
         || this.queuedRotationTaskThisTick
         || this.returning
         || this.useItemReturnPending
         || this.forcePacketRotationTicks > 0;
   }

   private void method3521() {
      this.method3517();
   }

   @Helper104
   public void method3522(Event22 var1) {
      if (this.method3497()) {
         var1.method4081(this.method3508(var1.method4080(), var1.method4077(), var1.method4078()));
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         if (this.forcePacketRotationTicks > 0) {
            this.forcePacketRotationTicks--;
         }

         this.rotationRequestedThisTick = false;
         this.queuedRotationTaskThisTick = false;
         Helper124.method1026(new Event28((byte)0));
         this.queuedRotationTaskThisTick = this.rotationPlanTaskProcessor.method3568() != null;
         this.method3505();
         Helper124.method1026(new Event28((byte)2));
         if (this.useItemReturnPending && !this.method3514()) {
            this.useItemReturnPending = false;
         }

         if (!this.method3520() && this.method3519()) {
            this.staleInactiveTicks++;
            if (this.staleInactiveTicks >= 6) {
               this.method3521();
            }
         } else {
            this.staleInactiveTicks = 0;
         }
      } else {
         this.method3517();
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (!var1.method581()) {
         if (!var1.method3894()) {
            if (var1.method3895() instanceof PlayerPositionLookS2CPacket var5) {
               this.serverAngle = new Helper336(var5.change().yaw(), var5.change().pitch());
            }
         } else {
            Packet packet = Objects.requireNonNull(var1.method3895());
            if (packet instanceof PlayerMoveC2SPacket move && move.changesLook()) {
               this.serverAngle = new Helper336(move.getYaw(1.0F), move.getPitch(1.0F));
            }
         }
      }
   }

   public Helper352 method3523() {
      return this.lastRotationPlan;
   }

   public Helper356<Helper352> method3524() {
      return this.rotationPlanTaskProcessor;
   }

   public Helper336 method3525() {
      return this.currentAngle;
   }

   public Helper336 method3526() {
      return this.previousAngle;
   }

   public Helper336 method3527() {
      return this.serverAngle;
   }

   public Helper336 method3528() {
      return this.fakeAngle;
   }

   public Helper336 method3529() {
      return this.previousFakeAngle;
   }

   public boolean method3530() {
      return this.returning;
   }

   public boolean method3531() {
      return this.returnMoveCorrection;
   }

   public boolean method3532() {
      return this.returnFreeCorrection;
   }

   public double method3533() {
      return this.returnStartDifference;
   }

   public int method3534() {
      return this.forcePacketRotationTicks;
   }

   public boolean method3535() {
      return this.useItemReturnPending;
   }

   public int method3536() {
      return this.staleInactiveTicks;
   }

   public boolean method3537() {
      return this.rotationRequestedThisTick;
   }

   public boolean method3538() {
      return this.queuedRotationTaskThisTick;
   }
}
