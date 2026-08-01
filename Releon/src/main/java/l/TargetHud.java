package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import fat.releon.teremok.impl.combat.TriggerBot;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.MathHelper;

public class TargetHud extends Helper119 {
   private final Helper467 animation = new Animation2().method5003(650).method5004(1.0);
   private final Helper467 faceAlphaAnimation = new Animation2().method5003(125).method5004(1.0);
   private final Helper339 stopWatch = new Helper339();
   private final Helper339 distanceUpdateTimer = new Helper339();
   private final Helper339 damageDropDelayTimer = new Helper339();
   private LivingEntity lastTarget;
   private Item lastItem = Items.AIR;
   private float healthPercent = 0.0F;
   private float absorptionPercent = 0.0F;
   private float damagePercent = 0.0F;
   private float displayedDistance;
   private float displayedHealthValue = 0.0F;
   private float lastTargetHealthPercent = -1.0F;

   public TargetHud() {
      super("Target Hud", 10, 80, 100, 36, true);
   }

   @Override
   public boolean method307() {
      return this.scaleAnimation.method4998(Helper450.FORWARDS);
   }

   @Override
   public void method308() {
      LivingEntity var1 = Aura.getInstance().getTarget();
      LivingEntity var2 = TriggerBot.getInstance().isState() ? TriggerBot.getInstance().target : null;
      LivingEntity var3 = null;
      if (mc.crosshairTarget != null && mc.crosshairTarget.getType() == Type.ENTITY) {
         EntityHitResult var4 = (EntityHitResult)mc.crosshairTarget;
         if (var4.getEntity() instanceof LivingEntity var5 && var5 != mc.player) {
            var3 = var5;
         }
      }

      LivingEntity var7 = var1 != null ? var1 : (var2 != null ? var2 : var3);
      if (var7 != null) {
         LivingEntity var8 = this.lastTarget;
         this.lastTarget = var7;
         if (var8 != var7) {
            this.method4920(this.lastTarget);
         }

         this.method967();
         this.faceAlphaAnimation.method4997(Helper450.FORWARDS);
      } else if (Helper38.method548(mc.currentScreen)) {
         LivingEntity var9 = this.lastTarget;
         this.lastTarget = mc.player;
         if (var9 != this.lastTarget) {
            this.method4920(this.lastTarget);
         }

         this.method967();
         this.faceAlphaAnimation.method4997(Helper450.FORWARDS);
      } else if (this.stopWatch.method3356(500.0)) {
         this.method966();
         this.faceAlphaAnimation.method4997(Helper450.BACKWARDS);
      }
   }

   public void method4915() {
      this.lastTarget = null;
      this.lastItem = Items.AIR;
      this.method4920(null);
      this.method966();
      this.faceAlphaAnimation.method4997(Helper450.BACKWARDS);
      this.stopWatch.method3358();
   }

   @Override
   public void method310(DrawContext var1) {
      if (Hud.method1824().interfaceSettings.method2588("Target Hud") && Hud.method1824().state && this.lastTarget != null) {
         MatrixStack var2 = var1.getMatrices();
         this.method4916(var1, var2);
         this.method4917(var1, var2);
         this.method4919(var1);
      }
   }

   private void method4916(DrawContext var1, MatrixStack var2) {
      Helper175 var3 = Helper103.method927(16, Helper101.BOLD);
      float var4 = this.method4923(Helper38.method529(this.lastTarget));
      float var5 = this.lastTarget.getMaxHealth();
      float var6 = this.method4923(this.lastTarget.getAbsorptionAmount());
      float var7 = this.method4921(var4, var5);
      float var8 = this.method4921(var6, var5);
      this.displayedHealthValue = this.method4922(this.displayedHealthValue, var4, 0.18F);
      String var9 = this.lastTarget.isInvisible() && !Helper128.method1056() && !Helper128.method1051()
         ? "??"
         : Helper38.method528(this.displayedHealthValue);
      float var10 = var7 < this.healthPercent ? 0.14F : 0.3F;
      this.healthPercent = this.method4922(this.healthPercent, var7, var10);
      if (this.lastTargetHealthPercent < 0.0F || var7 + 1.0E-4F < this.lastTargetHealthPercent) {
         this.damageDropDelayTimer.method3358();
      }

      if (var7 >= this.damagePercent) {
         this.damagePercent = this.method4922(this.damagePercent, var7, 0.35F);
      } else if (this.damageDropDelayTimer.method3356(130.0)) {
         this.damagePercent = this.method4922(this.damagePercent, var7, 0.1F);
      }

      this.lastTargetHealthPercent = var7;
      this.absorptionPercent = this.method4922(this.absorptionPercent, var8, 0.18F);
      float var11 = mc.player.distanceTo(this.lastTarget);
      float var12 = Math.round(var11 * 2.0F) / 2.0F;
      if (this.distanceUpdateTimer.method3356(10.0)) {
         this.displayedDistance = MathHelper.clamp(Helper147.method1250(0.5, this.displayedDistance, var12), 0.0F, 100.0F);
         this.distanceUpdateTimer.method3358();
      }

      this.method975(120);
      this.method976(35);
      int var13 = Hud.method1824().method1846();
      int var14 = Hud.method1824().method1835();
      int var15 = Helper133.method1106(var14, var13);
      int var16 = Hud.method1824().method1827();
      int var17 = new Color(255, 80, 80, 220).getRGB();
      int var18 = new Color(255, 215, 0, 255).getRGB();
      int var19 = new Color(255, 128, 0, 255).getRGB();
      Helper12.method361(var2, this.method981(), this.method982(), this.method983(), this.method984(), 5.0F, var13, var14, var16);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var2, this.method981(), this.method982(), this.method983(), this.method984()).method826(5.0F).method823(var15).method840()
         );
      }

      rectangle.method677(
         Helper80.method841(var2, this.method981(), this.method982(), this.method983(), this.method984())
            .method826(5.0F)
            .method835(1.0F)
            .method839(new Color(255, 255, 255, Math.max(0, var13 / 8)).getRGB())
            .method823(0)
            .method840()
      );
      float var20 = this.method981() + 29.0F;
      float var21 = this.method982() + 5.0F;
      String var22 = this.lastTarget.getName().getString();
      float var23 = var3.method1479(var22);
      float var24 = this.method983() - 29 - 32;
      Helper140 var25 = Releon.method71().method30();
      if (var23 > var24) {
         var25.method1209(var2.peek().getPositionMatrix(), var20 - 2.0F, this.method982(), var24 + 4.0F, this.method984());
         var3.method1475(var2, var22, var20, var21, Helper133.method1160(), Helper133.method1159(0.15F));
         var25.method1210();
      } else {
         var3.method1474(var2, var22, var20, var21, Helper133.method1160());
      }

      Helper175 var26 = Helper103.method927(11, Helper101.BOLD);
      float var28 = var20 + var26.method1479("HP: ") + 1.0F;
      int var29 = new Color(200, 200, 200, 215).getRGB();
      var26.method1474(var2, "HP:", var20, this.method982() + 14.0F, var29);
      var26.method1474(var2, var9, var28, this.method982() + 14.0F, var29);
      float var30 = this.method982() + 19.5F;
      float var31 = this.method981() + 29.0F;
      float var32 = this.method983() - 40;
      float var33 = 3.0F;
      rectangle.method677(Helper80.method841(var2, var31, var30, var32, var33).method826(2.5F).method823(new Color(25, 25, 25, var13).getRGB()).method840());
      float var34 = var32 * this.damagePercent;
      if (var34 > 0.5F) {
         rectangle.method677(Helper80.method841(var2, var31, var30, var34, var33).method826(2.5F).method823(var17).method840());
      }

      float var35 = var32 * this.healthPercent;
      if (var35 > 0.5F) {
         rectangle.method677(Helper80.method841(var2, var31, var30, var35, var33).method826(2.5F).method823(var16).method840());
      }

      if (this.absorptionPercent > 0.01F) {
         float var36 = var32 * this.absorptionPercent;
         rectangle.method677(
            Helper80.method841(var2, var31, var30, Math.min(var36, var32), var33).method826(2.5F).method825(var18, var19, var18, var19).method840()
         );
      }
   }

   private void method4917(DrawContext var1, MatrixStack var2) {
      ItemStack[] var3 = new ItemStack[]{
         this.lastTarget.getMainHandStack(),
         this.lastTarget.getOffHandStack(),
         this.lastTarget.getEquippedStack(EquipmentSlot.HEAD),
         this.lastTarget.getEquippedStack(EquipmentSlot.CHEST),
         this.lastTarget.getEquippedStack(EquipmentSlot.LEGS),
         this.lastTarget.getEquippedStack(EquipmentSlot.FEET)
      };
      float var4 = this.method981() + 33.0F;
      float var5 = this.method982() + -22.0F;
      float var6 = 8.5F;
      float var7 = 11.5F;
      float var8 = 46.5F;
      var2.push();
      var2.translate(var4, var5, 0.0F);

      for (int var9 = 0; var9 < 6; var9++) {
         float var10 = var9 * var7 - 2.0F;
         rectangle.method677(
            Helper80.method841(var2, var10, var8, var6 + 1.0F, var6 + 1.0F)
               .method826(3.0F)
               .method835(0.1F)
               .method839(Helper133.method1106(Hud.method1824().method1835(), Hud.method1824().method1846()))
               .method823(0)
               .method840()
         );
         if (!var3[var9].isEmpty()) {
            boolean var11 = var9 == 1;
            ClientIndication var12 = ClientIndication.method2427();
            if (var11 && var12 != null && var12.method2429(var3[var9])) {
               Helper283.method2776(var12.method2431(var3[var9]), var12.method2432(var3[var9]), var12.method2433(var3[var9]), var12.method2434());

               try {
                  Helper178.method1502(var1, var3[var9], var10, var8, false, false, 0.5F);
               } finally {
                  Helper283.method2777();
               }
            } else {
               Helper178.method1502(var1, var3[var9], var10, var8, false, false, 0.5F);
            }
         } else {
            String var17 = "x";
            Helper175 var18 = Helper103.method927(12, Helper101.DEFAULT);
            float var13 = var10 + (var6 + 1.0F) / 2.0F;
            float var14 = var8 + 3.5F;
            var18.method1477(var2, var17, var13, var14, new Color(225, 225, 255, 255).getRGB());
         }
      }

      var2.pop();
   }

   private void method4918(DrawContext var1, MatrixStack var2) {
      this.animation.method4997(this.lastTarget.isUsingItem() ? Helper450.FORWARDS : Helper450.BACKWARDS);
      if (!this.lastTarget.getActiveItem().isEmpty() && this.lastTarget.getActiveItem().getCount() != 0) {
         this.lastItem = this.lastTarget.getActiveItem().getItem();
      }

      if (!this.animation.method4995(Helper450.BACKWARDS) && !this.lastItem.equals(Items.AIR)) {
         byte var3 = 24;
         float var4 = this.animation.method5000().floatValue();
         float var5 = (this.lastTarget.getItemUseTime() + tickCounter.getTickDelta(false)) / Helper189.method1623(this.lastItem) * 360.0F;
         float var6 = this.method981() - (var3 + 5) * var4;
         float var7 = this.method982() + 4;
         Helper140 var8 = Releon.method71().method30();
         var8.method1209(var2.peek().getPositionMatrix(), this.method981() - 50, this.method982(), 50.0F, this.method984());
         Helper147.method1233(
            var4,
            () -> {
               blur.method677(
                  Helper80.method841(var2, var6, var7, var3, var3)
                     .method838(5.0F)
                     .method826(12.0F)
                     .method834(1.0F)
                     .method835(2.0F)
                     .method839(Helper133.method1166(0.0F))
                     .method823(Helper133.method1157(0.7F))
                     .method840()
               );
               arc.method677(
                  Helper80.method841(var2, var6, var7, var3, var3)
                     .method826(0.38F)
                     .method835(0.3F)
                     .method837(var5)
                     .method825(Helper133.method1146(0), Helper133.method1146(200), Helper133.method1146(0), Helper133.method1146(200))
                     .method840()
               );
               Helper178.method1502(var1, this.lastItem.getDefaultStack(), var6 + 3.0F, var7 + 3.0F, false, false, 1.0F);
            }
         );
         var8.method1210();
      }
   }

   private void method4919(DrawContext var1) {
      if (mc.getEntityRenderDispatcher().getRenderer(this.lastTarget) instanceof LivingEntityRenderer var3) {
         LivingEntityRenderState var4 = (LivingEntityRenderState)var3.getAndUpdateRenderState(this.lastTarget, tickCounter.getTickDelta(false));
         Identifier var5 = var3.getTexture(var4);
         float var6 = this.faceAlphaAnimation.method5000().floatValue();
         Helper147.method1233(
            var6,
            () -> Helper178.method1508(
               var1,
               var5,
               this.method981() + 5,
               this.method982() + 7.5F,
               20.0F,
               4.0F,
               8,
               8,
               64,
               Helper133.method1157(1.0F),
               Helper133.method1137(-1, 1.0F + this.lastTarget.hurtTime / 4.0F)
            )
         );
      }
   }

   private void method4920(LivingEntity var1) {
      if (var1 == null) {
         this.healthPercent = 0.0F;
         this.absorptionPercent = 0.0F;
         this.damagePercent = 0.0F;
         this.displayedHealthValue = 0.0F;
         this.lastTargetHealthPercent = -1.0F;
      } else {
         float var2 = var1.getMaxHealth();
         float var3 = this.method4923(Helper38.method529(var1));
         float var4 = this.method4923(var1.getAbsorptionAmount());
         this.healthPercent = this.method4921(var3, var2);
         this.absorptionPercent = this.method4921(var4, var2);
         this.damagePercent = this.healthPercent;
         this.displayedHealthValue = var3;
         this.lastTargetHealthPercent = this.healthPercent;
         this.damageDropDelayTimer.method3358();
      }
   }

   private float method4921(float var1, float var2) {
      return Float.isFinite(var1) && Float.isFinite(var2) && !(var2 <= 0.0F) ? MathHelper.clamp(var1 / var2, 0.0F, 1.0F) : 0.0F;
   }

   private float method4922(float var1, float var2, float var3) {
      float var4 = MathHelper.lerp(var3, var1, var2);
      return Math.abs(var4 - var2) <= 0.001F ? var2 : var4;
   }

   private float method4923(float var1) {
      return Math.round(var1 * 10.0F) / 10.0F;
   }
}
