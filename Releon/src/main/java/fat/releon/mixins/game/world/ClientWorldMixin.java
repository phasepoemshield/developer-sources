package fat.releon.mixins.game.world;

import l.Helper124;
import l.Helper160;
import l.Helper389;
import l.Event21;
import l.Helper38;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientWorld.class})
public class ClientWorldMixin implements Helper160 {
   public ClientWorldMixin() {
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   public void initHook(CallbackInfo var1) {
      Helper124.method1026(new Event21());
   }

   @Inject(
      method = {"addEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void addEntityHook(Entity var1, CallbackInfo var2) {
      if (!Helper38.method549()) {
         Helper389 var3 = new Helper389(var1);
         Helper124.method1026(var3);
         if (var3.method581()) {
            var2.cancel();
         }
      }
   }
}
