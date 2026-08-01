package zenith.zov.utility.mixin.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import zenith.Worldtweaks;

@Mixin({LightmapTextureManager.class})
public class MixinLightmapTextureManager {
   @ModifyExpressionValue(
      method = {"update(F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/SimpleOption;getValue()Ljava/lang/Object;"
      )}
   )
   private Object injectXRayFullBright(Object object) {
      Worldtweaks illl1liii1llill1illi1l1l = Worldtweaks.l1I1II1l111l1llI11l1I1llII;
      return illl1liii1llill1illi1l1l.Spider() && illl1liii1llill1illi1l1l.Ill1ll111IllIlI11ll1.ConstructorHolder(0)
         ? Math.max((Double)object, (double)(illl1liii1llill1illi1l1l.lI1l1IlllIl.lll1lI1llll1IIllIIIII1lll() * 10.0F))
         : object;
   }
}
