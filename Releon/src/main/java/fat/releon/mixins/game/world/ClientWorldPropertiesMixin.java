package fat.releon.mixins.game.world;

import l.Helper160;
import l.WorldTweaks;
import net.minecraft.client.world.ClientWorld.Properties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Properties.class})
public class ClientWorldPropertiesMixin implements Helper160 {
   @Shadow
   private long timeOfDay;

   public ClientWorldPropertiesMixin() {
   }

   @Inject(
      method = {"setTimeOfDay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setTimeOfDayHook(long var1, CallbackInfo var3) {
      WorldTweaks var4 = WorldTweaks.method2811();
      if (var4 != null && var4.isState() && var4.modeSetting.method2588("Time")) {
         this.timeOfDay = (long)(var4.timeSetting.method2082() * 1000.0F) - 6000L;
         var3.cancel();
      }
   }

   @Inject(
      method = {"getTimeOfDay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getTimeOfDayHook(CallbackInfoReturnable<Long> var1) {
      WorldTweaks var2 = WorldTweaks.method2811();
      if (var2 != null && var2.isState() && var2.modeSetting.method2588("Time")) {
         long var3 = (long)(var2.timeSetting.method2082() * 1000.0F) - 6000L;
         var1.setReturnValue(var3);
      }
   }
}
