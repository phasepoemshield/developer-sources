package org.zenith.utility.mixin.render;

import org.zenith.core.CloudRouter;
import org.zenith.event.Event12;
import org.zenith.event.PreventActionEvent;
import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.module.ItemUseController;
import org.zenith.module.Module;
import org.zenith.rotation.Rotation;

import org.zenith.module.Chams_Var159;

import org.zenith.module.Chams;
import org.zenith.module.Speed;

import org.zenith.event.VelocityChangeEvent;

import org.zenith.base.figura.ducks.LivingEntityRendererAccessor;
import org.zenith.module.Chams;
import org.zenith.module.Chams_Var159;
import org.zenith.ZenithClient;
import org.zenith.rotation.RotationManager;
import org.zenith.module.Speed;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.event.VelocityChangeEvent;
import org.zenith.render.WorldRender;
import org.zenith.core.ClientProvider;















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({LivingEntityRenderer.class})
public abstract class MixinLivingEntityRenderer<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>>
   implements ClientProvider {
   public MixinLivingEntityRenderer() {
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;clampBodyYaw(Lnet/minecraft/entity/LivingEntity;FF)F"
      )}
   )
   public float changeYaw(float var1, LivingEntity var2) {
      RotationManager i11l1llliliili11i = ZenithClient.on23().CloudRouter();
      return !var2.equals(minecraftClient3.player)
            || i11l1llliliili11i.Var05()
            || Speed.speed11.isEnabled() && Speed.speed11.call016()
         ? var1
         : MathHelper.lerpAngleDegrees(
            WorldRender.getTickDelta(),
            i11l1llliliili11i.ZClass018().GrimGlide(),
            i11l1llliliili11i.ZClass092().GrimGlide()
         );
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/MathHelper;lerpAngleDegrees(FFF)F"
      )}
   )
   public float changeHeadYaw(float var1, LivingEntity var2) {
      RotationManager i11l1llliliili11i = ZenithClient.on23().CloudRouter();
      return !var2.equals(minecraftClient3.player)
            || i11l1llliliili11i.Var05()
            || Speed.speed11.isEnabled() && Speed.speed11.call016()
         ? var1
         : MathHelper.lerpAngleDegrees(
            WorldRender.getTickDelta(),
            i11l1llliliili11i.ZClass018().GrimGlide(),
            i11l1llliliili11i.ZClass092().GrimGlide()
         );
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getLerpedPitch(F)F"
      )}
   )
   public float changePitch(float var1, LivingEntity var2) {
      RotationManager i11l1llliliili11i = ZenithClient.on23().CloudRouter();
      return !var2.equals(minecraftClient3.player)
            || i11l1llliliili11i.Var05()
            || Speed.speed11.isEnabled() && Speed.speed11.call016()
         ? var1
         : MathHelper.lerpAngleDegrees(
            WorldRender.getTickDelta(),
            i11l1llliliili11i.ZClass018().GuiWalk(),
            i11l1llliliili11i.ZClass092().GuiWalk()
         );
   }

   @Shadow
   @Nullable
   protected abstract RenderLayer method_24302(LivingEntityRenderState var1, boolean var2, boolean var3, boolean var4);

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;getRenderLayer(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;ZZZ)Lnet/minecraft/client/render/RenderLayer;"
      )
   )
   public RenderLayer renderHook(LivingEntityRenderer var1, LivingEntityRenderState var2, boolean var3, boolean var4, boolean var5) {
      Chams l1ill111l1ll1illlil11 = Chams.chams;
      if (l1ill111l1ll1illlil11.on23(var2)) {
         l1ill111l1ll1illlil11.int399();
         return l1ill111l1ll1illlil11.int401() ? l1ill111l1ll1illlil11.int400() : this.method_24302(var2, var3, true, var5);
      } else {
         if (!var4 && var2.width == 0.6F) {
            VelocityChangeEvent li1i11ill1ll1iiiil1li1iil111l1 = new VelocityChangeEvent(-1);
            EventManager.call(li1i11ill1ll1iiiil1li1iil111l1);
            if (li1i11ill1ll1iiiil1li1iil111l1.isCancelled()) {
               var4 = true;
            }
         }

         return this.method_24302(var2, var3, var4, var5);
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      )
   )
   public void renderModelHook(
      EntityModel<?> var1,
      MatrixStack var2,
      VertexConsumer var3,
      int var4,
      int var5,
      int var6,
      @Local(ordinal = 0,argsOnly = true) LivingEntityRenderState var7
   ) {
      var5 = LivingEntityRendererAccessor.overrideOverlay.orElse(var5);
      Chams l1ill111l1ll1illlil11 = Chams.chams;
      if (l1ill111l1ll1illlil11.on23(var7)) {
         int i = l1ill111l1ll1illlil11.int401()
            ? l1ill111l1ll1illlil11.PreventActionEvent(var6)
            : l1ill111l1ll1illlil11.Event12(var6);
         if (l1ill111l1ll1illlil11.int402()) {
            Chams_Var159 l1ill111l1ll1illlil11_ii1il11l111ii11iil = Chams.getChamsVar159();

            try {
               RenderSystem.disableDepthTest();
               RenderSystem.depthMask(false);
               var1.render(var2, var3, var4, var5, i);
            } finally {
               l1ill111l1ll1illlil11_ii1il11l111ii11iil.vec3d16();
            }
         } else {
            var1.render(var2, var3, var4, var5, i);
         }
      } else {
         VelocityChangeEvent li1i11ill1ll1iiiil1li1iil111l1 = new VelocityChangeEvent(var6);
         if (var7.invisibleToPlayer) {
            EventManager.call(li1i11ill1ll1iiiil1li1iil111l1);
         }

         var1.render(var2, var3, var4, var5, li1i11ill1ll1iiiil1li1iil111l1.ItemUseController());
      }
   }
}
