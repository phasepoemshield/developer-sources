package org.wild.mixin;

import com.google.common.base.MoreObjects;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.Hands;
import ru.metaculture.protection.NoSlow;
import ru.metaculture.protection.O0000000OO000O;
import ru.metaculture.protection.O0000000OO00OO;
import ru.metaculture.protection.O000000O0O00O;
import ru.metaculture.protection.O0000O00OO0000;
import ru.metaculture.protection.SwingAnimation;
import ru.metaculture.protection.WildClient;

@Environment(EnvType.CLIENT)
@Mixin({HeldItemRenderer.class})
public abstract class HeldItemRendererMixin {
   @Unique
   private Hand wild$currentHand;
   @Shadow
   private ItemStack mainHand;
   @Shadow
   private ItemStack offHand;
   @Shadow
   private float equipProgressMainHand;
   @Shadow
   private float lastEquipProgressMainHand;
   @Shadow
   private float equipProgressOffHand;
   @Shadow
   private float lastEquipProgressOffHand;

   @Shadow
   protected abstract void renderFirstPersonItem(
      AbstractClientPlayerEntity abstractClientPlayerEntity,
      float f,
      float g,
      Hand hand,
      float h,
      ItemStack itemStack,
      float i,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      int j
   );

   @Inject(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void fullRenderItemOverride(
      float f, MatrixStack matrixStack, Immediate immediate, ClientPlayerEntity clientPlayerEntity, int i, CallbackInfo callbackInfo
   ) {
      callbackInfo.cancel();
      Hands var7 = WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(Hands.class) : null;
      O0000O00OO0000 var8 = O0000O00OO0000.O00000000();
      var8.O00000000(
         var7 != null && var7.O00000000(Hand.MAIN_HAND),
         var7 != null && var7.O00000000(Hand.OFF_HAND),
         MinecraftClient.getInstance().getWindow().getFramebufferWidth(),
         MinecraftClient.getInstance().getWindow().getFramebufferHeight()
      );
      float var9 = clientPlayerEntity.getHandSwingProgress(f);
      Hand var10 = (Hand)MoreObjects.firstNonNull(clientPlayerEntity.preferredHand, Hand.MAIN_HAND);
      float var11 = clientPlayerEntity.getLerpedPitch(f);
      float var12 = MathHelper.lerp(f, clientPlayerEntity.lastRenderPitch, clientPlayerEntity.renderPitch);
      float var13 = MathHelper.lerp(f, clientPlayerEntity.lastRenderYaw, clientPlayerEntity.renderYaw);
      MinecraftClient var14 = MinecraftClient.getInstance();
      if (O000000O0O00O.O00000000) {
         matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(0.0F));
         matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0.0F));
      } else {
         matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees((clientPlayerEntity.getPitch(f) - var12) * 0.1F));
         matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((clientPlayerEntity.getYaw(f) - var13) * 0.1F));
      }

      boolean var15 = true;
      boolean var16 = true;
      ItemStack var17 = clientPlayerEntity.getMainHandStack();
      ItemStack var18 = NoSlow.O00000000(clientPlayerEntity.getOffHandStack());
      boolean var19 = var17.isOf(Items.BOW) || var18.isOf(Items.BOW);
      boolean var20 = var17.isOf(Items.CROSSBOW) || var18.isOf(Items.CROSSBOW);
      if (var19 || var20) {
         if (clientPlayerEntity.isUsingItem()) {
            ItemStack var21 = clientPlayerEntity.getActiveItem();
            Hand var22 = clientPlayerEntity.getActiveHand();
            if (var21.isOf(Items.BOW) || var21.isOf(Items.CROSSBOW)) {
               var15 = var22 == Hand.MAIN_HAND;
               var16 = var22 == Hand.OFF_HAND;
            }
         } else if (this.isChargedCrossbow(var17)) {
            var16 = false;
         }
      }

      if (var15) {
         float var34 = var10 == Hand.MAIN_HAND ? var9 : 0.0F;
         float var36 = 1.0F - MathHelper.lerp(f, this.lastEquipProgressMainHand, this.equipProgressMainHand);
         matrixStack.push();
         O0000000OO00OO var23 = new O0000000OO00OO(matrixStack, Hand.MAIN_HAND);
         EventManager.O00000000((Event)var23);
         boolean var24 = var7 != null && var7.O00000000(Hand.MAIN_HAND);
         Object var25 = var24 ? var8.O00000000(Hand.MAIN_HAND, immediate) : immediate;
         this.wild$currentHand = Hand.MAIN_HAND;

         try {
            this.renderFirstPersonItem(clientPlayerEntity, f, var11, Hand.MAIN_HAND, var34, this.mainHand, var36, matrixStack, (VertexConsumerProvider)var25, i);
         } finally {
            this.wild$currentHand = null;
            if (var24) {
               var8.O00000000(Hand.MAIN_HAND);
            }

            matrixStack.pop();
         }
      }

      if (var16) {
         float var35 = var10 == Hand.OFF_HAND ? var9 : 0.0F;
         float var37 = 1.0F - MathHelper.lerp(f, this.lastEquipProgressOffHand, this.equipProgressOffHand);
         matrixStack.push();
         O0000000OO00OO var38 = new O0000000OO00OO(matrixStack, Hand.OFF_HAND);
         EventManager.O00000000((Event)var38);
         boolean var39 = var7 != null && var7.O00000000(Hand.OFF_HAND);
         Object var40 = var39 ? var8.O00000000(Hand.OFF_HAND, immediate) : immediate;
         this.wild$currentHand = Hand.OFF_HAND;

         try {
            this.renderFirstPersonItem(
               clientPlayerEntity, f, var11, Hand.OFF_HAND, var35, NoSlow.O00000000(this.offHand), var37, matrixStack, (VertexConsumerProvider)var40, i
            );
         } finally {
            this.wild$currentHand = null;
            if (var39) {
               var8.O00000000(Hand.OFF_HAND);
            }

            matrixStack.pop();
         }
      }

      immediate.draw();
   }

   @WrapOperation(
      method = {"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/ItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/world/World;III)V"
      )}
   )
   private void wild$renderScaledItem(
      ItemRenderer itemRenderer,
      LivingEntity livingEntity,
      ItemStack itemStack,
      ItemDisplayContext itemDisplayContext,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      World world,
      int i,
      int j,
      int k,
      Operation<Void> operation
   ) {
      VertexConsumerProvider var12 = vertexConsumerProvider;
      Hands var13 = WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(Hands.class) : null;
      if (this.wild$currentHand != null && var13 != null && var13.O00000000(this.wild$currentHand)) {
         var12 = O0000O00OO0000.O00000000().O000000000(this.wild$currentHand, vertexConsumerProvider);
      }

      float var14 = SwingAnimation.O00000000(this.wild$currentHand);
      if (Math.abs(var14 - 1.0F) <= 1.0E-4F) {
         operation.call(new Object[]{itemRenderer, livingEntity, itemStack, itemDisplayContext, matrixStack, var12, world, i, j, k});
      } else {
         matrixStack.push();
         matrixStack.scale(var14, var14, var14);

         try {
            operation.call(new Object[]{itemRenderer, livingEntity, itemStack, itemDisplayContext, matrixStack, var12, world, i, j, k});
         } finally {
            matrixStack.pop();
         }
      }
   }

   @WrapOperation(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;swingArm(FFLnet/minecraft/client/util/math/MatrixStack;ILnet/minecraft/util/Arm;)V",
         ordinal = 2
      )}
   )
   private void handAnimationHook(
      HeldItemRenderer heldItemRenderer,
      float f,
      float g,
      MatrixStack matrixStack,
      int i,
      Arm arm,
      Operation<Void> operation,
      @Local(ordinal = 0,argsOnly = true) AbstractClientPlayerEntity abstractClientPlayerEntity,
      @Local(ordinal = 0,argsOnly = true) Hand hand
   ) {
      O0000000OO000O var10 = new O0000000OO000O(matrixStack, hand, f);
      EventManager.O00000000((Event)var10);
      if (!var10.O00000000()) {
         operation.call(new Object[]{heldItemRenderer, f, g, matrixStack, i, arm});
      }
   }

   @Unique
   private boolean isChargedCrossbow(ItemStack itemStack) {
      return itemStack.isOf(Items.CROSSBOW) && CrossbowItem.isCharged(itemStack);
   }
}
