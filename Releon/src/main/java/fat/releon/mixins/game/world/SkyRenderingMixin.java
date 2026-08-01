package fat.releon.mixins.game.world;

import l.Helper250;
import l.WorldTweaks;
import net.minecraft.client.render.SkyRendering;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({SkyRendering.class})
public abstract class SkyRenderingMixin {
   public SkyRenderingMixin() {
   }

   @Inject(
      method = {"renderSky"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderWaveSky(float var1, float var2, float var3, CallbackInfo var4) {
      WorldTweaks var5 = WorldTweaks.method2811();
      if (var5 != null && var5.isState() && var5.modeSetting.method2588("Sky Waves")) {
         boolean var6 = Helper250.method2421(var5.skyColorSetting.method2553(), var5.skyWaveSpeed.method2082(), var5.skyWaveIntensity.method2082());
         if (var6) {
            var4.cancel();
         }
      }
   }
}
