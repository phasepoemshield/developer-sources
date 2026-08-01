package fat.releon.mixins.client.screen.mainmenu;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.CubeMapRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.RotatingCubeMapRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RotatingCubeMapRenderer.class})
public class RotatingCubeMapRendererMixin {
   private static final CubeMapRenderer CUSTOM_PANORAMA_RENDERER = new CubeMapRenderer(Identifier.of("minecraft", "panorama/panorama"));
   private static float customPitch = 0.0F;

   public RotatingCubeMapRendererMixin() {
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderCustomPanorama(DrawContext var1, int var2, int var3, float var4, float var5, CallbackInfo var6) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      float var8 = var7.getRenderTickCounter().getLastDuration();
      float var9 = (float)(var8 * var7.options.getPanoramaSpeed().getValue());
      customPitch = wrapOnce(customPitch + var9 * 0.1F, 360.0F);
      var1.draw();
      CUSTOM_PANORAMA_RENDERER.draw(var7, 10.0F, -customPitch, var4);
      var1.draw();
      var6.cancel();
   }

   private static float wrapOnce(float var0, float var1) {
      return var0 > var1 ? var0 - var1 : var0;
   }
}
