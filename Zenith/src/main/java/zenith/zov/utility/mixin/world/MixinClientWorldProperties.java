package zenith.zov.utility.mixin.world;

import net.minecraft.client.world.ClientWorld.OptimizeWorldScreen1;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.Worldtweaks;

@Mixin({OptimizeWorldScreen1.class})
public abstract class MixinClientWorldProperties {
   @Shadow
   private long timeOfDay;

   @Shadow
   public abstract boolean isRaining();

   @Inject(
      method = {"setTimeOfDay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setTimeOfDayHook(long i, CallbackInfo callbackinfo) {
      Worldtweaks illl1liii1llill1illi1l1l = Worldtweaks.l1I1II1l111l1llI11l1I1llII;
      if (illl1liii1llill1illi1l1l.Spider()) {
         this.timeOfDay = (long)(illl1liii1llill1illi1l1l.lIlI11l11Il111IlIIll11.lll1lI1llll1IIllIIIII1lll() * 1000.0F);
         callbackinfo.cancel();
      }
   }
}
