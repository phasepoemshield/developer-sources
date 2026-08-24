package org.zenith.utility.mixin.entity;

import org.zenith.core.MediaTrackInfo;
import org.zenith.core.CloudRouter;
import org.zenith.event.EventWindowSizeChanged;
import org.zenith.module.GrimGlide;
import org.zenith.module.Module;

import org.zenith.module.AntiInvisible;
import org.zenith.module.Predictions;
import org.zenith.module.ShaderESP;

import org.zenith.module.AntiInvisible;
import org.zenith.ZenithClient;
import org.zenith.module.Predictions;
import org.zenith.module.ShaderESP;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ClientProvider;
import org.zenith.core.TranslationKey;















import net.minecraft.client.MinecraftClient;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Entity.class})
public abstract class MixinEntity implements ClientProvider {
   @Shadow
   public float field_5965;
   @Shadow
   public float field_6004;
   @Shadow
   public float field_5982;

   public MixinEntity() {
   }

   @Shadow
   public abstract void method_36457(float var1);

   @Shadow
   public abstract void method_36456(float var1);

   @Shadow
   public abstract float method_36454();

   @Shadow
   public abstract float method_36455();

   @Shadow
   public abstract String method_5820();

   @ModifyExpressionValue(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;isControlledByPlayer()Z"
      )}
   )
   public boolean fixFalldistanceValue(boolean var1) {
      return (Object)this == minecraftClient3.player ? false : var1;
   }

   @Inject(
      method = {"isInvisible"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void bypassSpeed(CallbackInfoReturnable<Boolean> var1) {
      if (AntiInvisible.antiInvisible.isEnabled()
         && ((Object)this == minecraftClient3.player || ZenithClient.on23().MediaTrackInfo().isFriend(this.method_5820()))) {
         var1.setReturnValue(false);
      }
   }

   @Redirect(
      method = {"updateVelocity"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getYaw()F"
      )
   )
   public float movementCorrection(Entity var1) {
      return var1 instanceof ClientPlayerEntity
            && ZenithClient.on23().CloudRouter().ZClass092() != null
         ? ZenithClient.on23().CloudRouter().ZClass092().GrimGlide()
         : var1.getYaw();
   }

   @Inject(
      method = {"onRemoved"},
      at = {@At("TAIL")}
   )
   public void onRemoved(CallbackInfo var1) {
      if ((Object)this instanceof PlayerEntity playerentity) {
         TranslationKey.EventWindowSizeChanged(playerentity.getId());
      }
   }

   @Inject(
      method = {"isGlowing"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void zenith_shaderEspGlowing(CallbackInfoReturnable<Boolean> var1) {
      Entity entity = (Entity)(Object)this;
      ShaderESP lii1l1ili11ill1l1 = ShaderESP.shaderESP;
      if (lii1l1ili11ill1l1 != null && lii1l1ili11ill1l1.isEnabled() && lii1l1ili11ill1l1.BotFeatureRegistry(entity)) {
         var1.setReturnValue(true);
      } else {
         if (Predictions.predictions.MediaTrackInfo(entity)) {
            var1.setReturnValue(true);
         }
      }
   }
}
