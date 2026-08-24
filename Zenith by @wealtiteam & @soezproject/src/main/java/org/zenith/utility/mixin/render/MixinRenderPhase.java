package org.zenith.utility.mixin.render;

import org.zenith.core.TargetInterpolator;
import org.zenith.module.Module;

import org.zenith.module.HandFire;

import org.zenith.module.HandFire;
import org.zenith.core.BotFeatureRegistry;














import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.RenderPhase.Target;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderPhase.class})
public class MixinRenderPhase {
   public MixinRenderPhase() {
   }

   @Inject(
      method = {"startDrawing"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void skipTargetStartInHandFirePass(CallbackInfo var1) {
      if (HandFire.zClass101() && (Object)this instanceof Target) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"endDrawing"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void skipTargetEndInHandFirePass(CallbackInfo var1) {
      if (HandFire.zClass101() && (Object)this instanceof Target) {
         var1.cancel();
      }
   }
}
