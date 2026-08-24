package org.zenith.utility.mixin.render;

import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ItemRegistry;
import org.zenith.module.Module;

import org.zenith.module.EntityESP;
import org.zenith.module.Speed;
import org.zenith.module.StreamerMode;

import org.zenith.module.EntityESP;
import org.zenith.managers.FriendFilter;
import org.zenith.module.Speed;
import org.zenith.module.StreamerMode;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;















import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerEntityRenderer.class})
public class MixinPlayerEntityRenderer {
   public MixinPlayerEntityRenderer() {
   }

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;F)V"},
      at = {@At("RETURN")}
   )
   public void zenith_hideGrimElytraGlidingPose(AbstractClientPlayerEntity var1, PlayerEntityRenderState var2, float var3, CallbackInfo var4) {
      if (var1 == MinecraftClient.getInstance().player
         && Speed.speed11.isEnabled()
         && Speed.speed11.call016()
         && (var1.isGliding() || var1.getPose() == EntityPose.GLIDING)) {
         var2.isGliding = false;
         var2.glidingTicks = 0.0F;
         var2.leaningPitch = 0.0F;
         var2.pose = EntityPose.STANDING;
         var2.height = var1.getDimensions(EntityPose.STANDING).height();
         var2.width = var1.getDimensions(EntityPose.STANDING).width();
         var2.standingEyeHeight = var1.getEyeHeight(EntityPose.STANDING);
         var2.isInSneakingPose = false;
         var2.isSwimming = false;
         var2.applyFlyingRotation = false;
         var2.flyingRotation = 0.0F;
      }
   }

   @ModifyVariable(
      method = {"renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   public Text zenith_streamerLabel(Text var1) {
      return StreamerMode.streamerMode.ItemRegistry(var1);
   }

   @Inject(
      method = {"renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void render(PlayerEntityRenderState var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      if (EntityESP.entityESP.float55()) {
         var6.cancel();
      }

      if (FriendFilter.PotionItemBuilder(var1.id)) {
         var6.cancel();
      }
   }
}
