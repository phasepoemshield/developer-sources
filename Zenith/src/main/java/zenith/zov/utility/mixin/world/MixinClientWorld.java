package zenith.zov.utility.mixin.world;

import net.minecraft.entity.Entity;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.EventImpl_14;
import zenith.EventBus;
import zenith.Event;

@Mixin({ClientWorld.class})
public class MixinClientWorld {
   @Inject(
      method = {"addEntity"},
      at = {@At("RETURN")}
   )
   public void injectAddEntity(Entity Entity, CallbackInfo callbackinfo) {
      EventImpl_14 ill1i111i1l1 = new EventImpl_14(Entity);
      EventBus.StringHolder_8((Event)ill1i111i1l1);
   }
}
