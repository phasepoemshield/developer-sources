package org.zenith.utility.mixin.world;

import org.zenith.event.EventInjectAddEntity;

import org.zenith.event.EventInjectAddEntity;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;













import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientWorld.class})
public class MixinClientWorld {
   public MixinClientWorld() {
   }

   @Inject(
      method = {"addEntity"},
      at = {@At("RETURN")}
   )
   public void injectAddEntity(Entity var1, CallbackInfo var2) {
      EventManager.call(new EventInjectAddEntity(var1));
   }
}
