package org.zenith.utility.mixin.render;

import org.zenith.core.UiAnimation;
import org.zenith.core.TrajectoryDataset;
import org.zenith.core.MovementSimulator;
import org.zenith.module.AutoWarden;
import org.zenith.module.AutoZamok;
import org.zenith.module.BaseFinder;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.module.Aura;
import org.zenith.module.HandFire;
import org.zenith.module.SwingAnimation;
import org.zenith.module.ViewModel;

import org.zenith.event.EventItemRenderHook;

import org.zenith.module.Aura;
import org.zenith.event.EventItemRenderHook;
import org.zenith.module.HandFire;
import org.zenith.module.SwingAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.module.ViewModel;















import com.darkmagician6.eventapi.EventManager;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemRenderer.class})
public abstract class MixinHeldItemRenderer {
   public MixinHeldItemRenderer() {
   }

   @Shadow
   protected abstract void method_65816(float var1, float var2, MatrixStack var3, int var4, Arm var5);

   @Inject(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At("HEAD")}
   )
   public void handFireBeginFrame(float var1, MatrixStack var2, Immediate var3, ClientPlayerEntity var4, int var5, CallbackInfo var6) {
      HandFire l1ii1iilii1i11lill1lll = HandFire.handFire;
      if (l1ii1iilii1i11lill1lll.double156()) {
         l1ii1iilii1i11lill1lll.zClass095();
      }
   }

   @Inject(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At("TAIL")}
   )
   public void handFireEndFrame(float var1, MatrixStack var2, Immediate var3, ClientPlayerEntity var4, int var5, CallbackInfo var6) {
      HandFire l1ii1iilii1i11lill1lll = HandFire.handFire;
      if (l1ii1iilii1i11lill1lll.double156()) {
         l1ii1iilii1i11lill1lll.float360();
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
         ordinal = 0
      )}
   )
   public void injectBeforeRenderCrossBowItem(
      AbstractClientPlayerEntity var1,
      float var2,
      float var3,
      Hand var4,
      float var5,
      ItemStack var6,
      float var7,
      MatrixStack var8,
      VertexConsumerProvider var9,
      int var10,
      CallbackInfo var11
   ) {
      ViewModel il11liii1l1li = ViewModel.viewModel;
      if (il11liii1l1li.isEnabled()) {
         boolean flag = var4 == Hand.MAIN_HAND;
         Arm arm = flag ? var1.getMainArm() : var1.getMainArm().getOpposite();
         il11liii1l1li.on23(var8, arm);
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
         ordinal = 1
      )}
   )
   public void injectBeforeRenderItem(
      AbstractClientPlayerEntity var1,
      float var2,
      float var3,
      Hand var4,
      float var5,
      ItemStack var6,
      float var7,
      MatrixStack var8,
      VertexConsumerProvider var9,
      int var10,
      CallbackInfo var11
   ) {
      ViewModel il11liii1l1li = ViewModel.viewModel;
      if (il11liii1l1li.isEnabled()) {
         boolean flag = var4 == Hand.MAIN_HAND;
         Arm arm = flag ? var1.getMainArm() : var1.getMainArm().getOpposite();
         il11liii1l1li.on23(var8, arm);
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;push()V",
         shift = Shift.AFTER,
         ordinal = 0
      )}
   )
   public void injectAfterMatrixPushHandPosition(
      AbstractClientPlayerEntity var1,
      float var2,
      float var3,
      Hand var4,
      float var5,
      ItemStack var6,
      float var7,
      MatrixStack var8,
      VertexConsumerProvider var9,
      int var10,
      CallbackInfo var11
   ) {
      ViewModel il11liii1l1li = ViewModel.viewModel;
      if (il11liii1l1li.isEnabled() && !var6.isEmpty() && !var6.contains(DataComponentTypes.MAP_ID)) {
         boolean flag = var4 == Hand.MAIN_HAND;
         Arm arm = flag ? var1.getMainArm() : var1.getMainArm().getOpposite();
         il11liii1l1li.UiAnimation(var8, arm);
      }
   }

   @Redirect(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;swingArm(FFLnet/minecraft/client/util/math/MatrixStack;ILnet/minecraft/util/Arm;)V",
         ordinal = 2
      )
   )
   public void redirectSwingArmForCustomAnim(HeldItemRenderer var1, float var2, float var3, MatrixStack var4, int var5, Arm var6) {
      SwingAnimation ill11li1lilllil = SwingAnimation.swingAnimation;
      if (ill11li1lilllil.isEnabled()) {
         if (var6 == Arm.RIGHT) {
            if (ill11li1lilllil.onlyAura2.isEnabled()
               && Aura.aura.isEnabled()
               && Aura.aura.zClass054() != null) {
               ill11li1lilllil.on23(var4, var2, var3, var6);
            } else if (!ill11li1lilllil.onlyAura2.isEnabled()) {
               ill11li1lilllil.on23(var4, var2, var3, var6);
            } else if (ill11li1lilllil.onlyAura2.isEnabled() && !Aura.aura.isEnabled()
               || Aura.aura.zClass054() == null) {
               this.method_65816(var2, var3, var4, var5, var6);
            }
         } else {
            this.method_65816(var2, var3, var4, var5, var6);
         }
      } else {
         this.method_65816(var2, var3, var4, var5, var6);
      }
   }

   @WrapOperation(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"
      )}
   )
   public void itemRenderHook(
      HeldItemRenderer var1,
      AbstractClientPlayerEntity var2,
      float var3,
      float var4,
      Hand var5,
      float var6,
      ItemStack var7,
      float var8,
      MatrixStack var9,
      VertexConsumerProvider var10,
      int var11,
      Operation<Void> var12
   ) {
      EventItemRenderHook illli1l1llii1ii1ii1llllii1i1l = new EventItemRenderHook(var2, var7, var5);
      EventManager.call(illli1l1llii1ii1ii1llllii1i1l);
      HandFire l1ii1iilii1i11lill1lll = HandFire.handFire;
      if (l1ii1iilii1i11lill1lll.double156()) {
         l1ii1iilii1i11lill1lll.on23(
            illli1l1llii1ii1ii1llllii1i1l.AutoWarden(),
            var3,
            var4,
            illli1l1llii1ii1ii1llllii1i1l.BaseFinder(),
            var6,
            illli1l1llii1ii1ii1llllii1i1l.AutoZamok(),
            var8,
            var9,
            var10,
            var11,
            var9x -> var12.call(
                  new Object[]{
                     var1,
                     illli1l1llii1ii1ii1llllii1i1l.AutoWarden(),
                     var3,
                     var4,
                     illli1l1llii1ii1ii1llllii1i1l.BaseFinder(),
                     var6,
                     illli1l1llii1ii1ii1llllii1i1l.AutoZamok(),
                     var8,
                     var9,
                     var9x,
                     var11
                  }
               )
         );
      } else {
         var12.call(
            new Object[]{
               var1,
               illli1l1llii1ii1ii1llllii1i1l.AutoWarden(),
               var3,
               var4,
               illli1l1llii1ii1ii1llllii1i1l.BaseFinder(),
               var6,
               illli1l1llii1ii1ii1llllii1i1l.AutoZamok(),
               var8,
               var9,
               var10,
               var11
            }
         );
      }
   }

   @WrapOperation(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;draw()V"
      )}
   )
   public void handFireVanillaFlush(Immediate var1, Operation<Void> var2) {
      float f = HandFire.var03();
      if (!(f <= 0.0F)) {
         if (f >= 1.0F) {
            var2.call(new Object[]{var1});
         } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f);

            try {
               var2.call(new Object[]{var1});
            } finally {
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.defaultBlendFunc();
               RenderSystem.disableBlend();
            }
         }
      }
   }
}
