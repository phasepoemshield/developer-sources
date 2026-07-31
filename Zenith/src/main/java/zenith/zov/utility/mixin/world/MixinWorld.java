package zenith.zov.utility.mixin.world;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.Worldtweaks;

@Mixin({World.class})
public class MixinWorld {
   @Inject(
      method = {"getRainGradient"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getRainGradient(float f, CallbackInfoReturnable<Float> callbackinforeturnable) {
      if (Worldtweaks.l1I1II1l111l1llI11l1I1llII.Spider()
         && Worldtweaks.l1I1II1l111l1llI11l1I1llII.llllll111I1ll1II1II1IIlIl.Spider()) {
         callbackinforeturnable.setReturnValue(0.0F);
         callbackinforeturnable.cancel();
      }
   }

   @Inject(
      method = {"getThunderGradient"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getThunderGradient(float f, CallbackInfoReturnable<Float> callbackinforeturnable) {
      if (Worldtweaks.l1I1II1l111l1llI11l1I1llII.Spider()
         && Worldtweaks.l1I1II1l111l1llI11l1I1llII.llllll111I1ll1II1II1IIlIl.Spider()) {
         callbackinforeturnable.setReturnValue(0.0F);
         callbackinforeturnable.cancel();
      }
   }

   @Inject(
      method = {"isRaining"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isRaining(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      if (Worldtweaks.l1I1II1l111l1llI11l1I1llII.Spider()
         && Worldtweaks.l1I1II1l111l1llI11l1I1llII.llllll111I1ll1II1II1IIlIl.Spider()) {
         callbackinforeturnable.setReturnValue(false);
         callbackinforeturnable.cancel();
      }
   }

   @Inject(
      method = {"isThundering"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isThundering(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      if (Worldtweaks.l1I1II1l111l1llI11l1I1llII.Spider()
         && Worldtweaks.l1I1II1l111l1llI11l1I1llII.llllll111I1ll1II1II1IIlIl.Spider()) {
         callbackinforeturnable.setReturnValue(false);
         callbackinforeturnable.cancel();
      }
   }
}
