package org.zenith.utility.mixin.render;

import net.minecraft.client.render.command.RenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.zenith.render.HandShaderManager;

/**
 * The GUI phase drains the queued first-person hand commands here. The window
 * between arming (hand queued) and this drain is exactly the hand's GPU draw,
 * so the capture output overrides are applied around it.
 */
@Mixin(RenderDispatcher.class)
public class MixinRenderDispatcher {
   @Inject(method = "render", at = @At("HEAD"))
   private void zenithBeginHandCapture(CallbackInfo callbackInfo) {
      HandShaderManager.beginCaptureIfArmed();
   }

   @Inject(method = "render", at = @At("TAIL"))
   private void zenithEndHandCapture(CallbackInfo callbackInfo) {
      if (HandShaderManager.endCapture()) {
         org.zenith.module.render.ShaderHand.shaderHand.compositeCapturedHand();
      }
   }
}
