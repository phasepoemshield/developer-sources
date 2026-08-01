package l;

import fat.releon.teremok.impl.combat.Aura;
import fat.releon.teremok.impl.combat.TriggerBot;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public class Helper331 implements Helper160 {
   private final Helper339 attackTimer = new Helper339();
   private final Helper339 shieldWatch = new Helper339();
   private final Helper338 clickScheduler = new Helper338();
   private int count = 0;

   public Helper331() {
   }

   void method3273() {
   }

   void onPacket(Helper386 var1) {
      Packet var2 = var1.method3895();
      if (var2 instanceof HandSwingC2SPacket || var2 instanceof UpdateSelectedSlotC2SPacket) {
         this.clickScheduler.method3351();
      }
   }

   void method3274(Helper429 var1) {
      if (var1.method4391() == -1 && !this.shieldWatch.method3356(50.0)) {
         var1.method582();
      }
   }

   void method3275(Helper326 var1) {
      if (this.method3283(var1, 0)) {
         this.method3277(var1);
      }

      boolean var2 = Aura.getInstance().getTarget() != null && Aura.getInstance().getTarget().isGliding() && mc.player.isGliding();
      if (var2) {
         Vec3d var3 = var1.getTarget().getVelocity();
         double var4 = var3.horizontalLength();
         float var6 = 0.0F;
         if (ElytraTarget.shouldElytraTarget) {
            var6 = ElytraTarget.method4451().elytraForward.method2082();
         }

         Vec3d var7 = var1.getTarget().getPos().add(var3.multiply(var6));
         Box var8 = new Box(
            var7.x - var1.getTarget().getWidth() / 2.0F,
            var7.y,
            var7.z - var1.getTarget().getWidth() / 2.0F,
            var7.x + var1.getTarget().getWidth() / 2.0F,
            var7.y + var1.getTarget().getHeight(),
            var7.z + var1.getTarget().getWidth() / 2.0F
         );
         Vec3d var9 = mc.player.getEyePos();
         Vec3d var10 = Helper351.INSTANCE.method3483().method3329();
         if (!var8.raycast(var9, var9.add(var10.multiply(var1.method3237()))).isPresent()) {
            return;
         }

         if (!Helper324.method3229(var1) || !this.method3283(var1, 0)) {
            return;
         }
      } else if (!Helper324.method3229(var1) || !this.method3283(var1, 0)) {
         return;
      }

      boolean var11 = mc.player.isSprinting();
      if (mc.player.isSwimming()) {
         var11 = false;
      }

      if (!var11) {
         this.method3278(var1);
      }
   }

   void method3276(Helper326 var1, TriggerBot var2) {
      this.method3275(var1);
   }

   void method3277(Helper326 var1) {
      if (var1.method3240() && mc.player.isUsingItem() && mc.player.getActiveItem().getItem().equals(Items.SHIELD)) {
         mc.interactionManager.stopUsingItem(mc.player);
         this.shieldWatch.method3358();
      }
   }

   void method3278(Helper326 var1) {
      if (Aura.getInstance().isState() && Aura.getInstance().getAttackSetting().method2588("Fake Lag")) {
         Aura.tickStop = 0;
      }

      this.method3280(var1);
      this.clickScheduler.method3351();
      this.method3279(var1);
      this.attackTimer.method3358();
      this.count++;
   }

   private void method3279(Helper326 var1) {
      LivingEntity var2 = var1.getTarget();
      Helper336 var3 = Helper349.method3469(mc.player.getBoundingBox().getCenter().subtract(var2.getEyePos()));
      boolean var4 = var2.isUsingItem() && var2.getActiveItem().getItem().equals(Items.SHIELD);
      boolean var5 = Math.abs(Helper351.method3507(var2.getYaw(), var3.method3333())) < 90.0F;
      Slot var6 = Helper66.method707(var0 -> var0.getStack().getItem() instanceof AxeItem);
      if (var1.method3239() && var4 && var6 != null && var5 && Helper59.script.method1317()) {
         Helper66.method690(var6, Hand.MAIN_HAND, false);
         Helper66.method701(true);
         this.method3280(var1);
         Helper66.method691(var6, Hand.MAIN_HAND, false, true);
         Helper66.method701(true);
      }
   }

   private void method3280(Helper326 var1) {
      float var2 = Helper147.method1227(0, 100);
      if (Aura.getInstance().isState() && Aura.getInstance().getAttackSetting().method2588("Hit Chance")) {
         if (var2 < Aura.getInstance().getHitChance().method2082()) {
            mc.interactionManager.attackEntity(mc.player, var1.getTarget());
         }
      } else if (!TriggerBot.getInstance().isState() || !TriggerBot.getInstance().attackSetting.method2588("Hit Chance")) {
         mc.interactionManager.attackEntity(mc.player, var1.getTarget());
      } else if (var2 < TriggerBot.getInstance().hitChance.method2082()) {
         mc.interactionManager.attackEntity(mc.player, var1.getTarget());
      }

      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private float method3281() {
      if (Aura.getInstance().isState()) {
         return Aura.getInstance().getAttackRange().method2082();
      } else {
         return TriggerBot.getInstance().isState() ? TriggerBot.getInstance().attackRange.method2082() : 3.0F;
      }
   }

   private double method3282() {
      if (Aura.getInstance().isState() && Aura.getInstance().getTarget() != null) {
         return mc.player.distanceTo(Aura.getInstance().getTarget());
      } else {
         return TriggerBot.getInstance().isState() && TriggerBot.getInstance().target != null ? mc.player.distanceTo(TriggerBot.getInstance().target) : 0.0;
      }
   }

   public boolean method3283(Helper326 var1, int var2) {
      for (int var3 = 0; var3 <= var2; var3++) {
         if (this.method3284(var1, var3)) {
            return true;
         }
      }

      return false;
   }

   public boolean method3284(Helper326 var1, int var2) {
      if (mc.player.isUsingItem() && !mc.player.getActiveItem().getItem().equals(Items.SHIELD) && var1.method3241()) {
         return false;
      } else if (!this.clickScheduler.method3348(var1.method3244(), var1.method3245(), 1.0F)) {
         return false;
      } else {
         Helper168 var3 = Helper168.method1385(var2);
         boolean var4 = !this.method3285(var3);
         boolean var5 = this.method3286(var3, var2);
         if (Aura.getInstance().getSmartCrits().method2200() && Aura.getInstance().isState()) {
            return !var4 ? true : var5 || var3.onGround;
         } else if (TriggerBot.getInstance().smartCrits.method2200() && TriggerBot.getInstance().isState()) {
            return !var4 ? true : var5 || var3.onGround;
         } else {
            return var1.method3238() && !this.method3285(var3) ? this.method3286(var3, var2) : true;
         }
      }
   }

   private boolean method3285(Helper168 var1) {
      return var1.method1426(StatusEffects.BLINDNESS)
         || var1.method1426(StatusEffects.LEVITATION)
         || Helper38.method540(var1.boundingBox.expand(-0.001), Blocks.COBWEB)
         || var1.method1420()
         || var1.method1415()
         || var1.method1400()
         || !Helper38.method537(EntityPose.STANDING, var1.pos)
         || var1.player.getAbilities().flying;
   }

   private boolean method3286(Helper168 var1, int var2) {
      boolean var3 = var1.fallDistance > 0.0F;
      return !var1.onGround && var3;
   }

   public void method3287(int var1) {
      this.count = var1;
   }

   public Helper339 method3288() {
      return this.attackTimer;
   }

   public Helper339 method3289() {
      return this.shieldWatch;
   }

   public Helper338 method3290() {
      return this.clickScheduler;
   }

   public int method3291() {
      return this.count;
   }
}
