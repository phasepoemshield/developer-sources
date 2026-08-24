package org.zenith.utility.mixin.world;

import org.zenith.module.Module;

import org.zenith.module.WorldTweaks;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EmotePlayback;
import org.zenith.module.WorldTweaks;














import net.minecraft.client.world.ClientWorld.Properties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Properties.class})
public abstract class MixinClientWorldProperties {
   @Shadow
   public long field_24439;

   public MixinClientWorldProperties() {
   }

   @Shadow
   public abstract boolean method_156();

   @Inject(
      method = {"setTimeOfDay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setTimeOfDayHook(long var1, CallbackInfo var3) {
      WorldTweaks il11llii1l1 = WorldTweaks.worldTweaks;
      if (il11llii1l1.isEnabled()) {
         this.field_24439 = (long)(il11llii1l1.timeSetting.getCurrent() * 1000.0F);
         var3.cancel();
      }
   }
}
