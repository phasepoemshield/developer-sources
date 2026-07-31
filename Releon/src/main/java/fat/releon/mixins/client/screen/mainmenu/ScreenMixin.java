package fat.releon.mixins.client.screen.mainmenu;

import l.Helper124;
import l.Widget16;
import l.Widget23;
import l.Helper380;
import net.minecraft.client.gui.CubeMapRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.RotatingCubeMapRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.Style;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Screen.class})
public class ScreenMixin {
   private static final CubeMapRenderer CUSTOM_PANORAMA_RENDERER = new CubeMapRenderer(Identifier.of("minecraft", "panorama/panorama"));
   private static final RotatingCubeMapRenderer CUSTOM_ROTATING_PANORAMA_RENDERER = new RotatingCubeMapRenderer(CUSTOM_PANORAMA_RENDERER);

   public ScreenMixin() {
   }

   @Inject(
      at = {@At(
         value = "INVOKE",
         target = "Lorg/slf4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;)V",
         remap = false,
         ordinal = 1
      )},
      method = {"handleTextClick"},
      cancellable = true
   )
   public void handleCustomClickEvent(Style var1, CallbackInfoReturnable<Boolean> var2) {
      ClickEvent var3 = var1.getClickEvent();
      if (var3 != null) {
         Helper124.method1026(new Helper380(var3.getValue()));
         var2.setReturnValue(true);
         var2.cancel();
      }
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void disableBackgroundBlurAndDimming(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if ((Object)this instanceof Widget16 || (Object)this instanceof Widget23) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"renderPanoramaBackground"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderCustomPanoramaBackground(DrawContext var1, float var2, CallbackInfo var3) {
      if ((Object)this instanceof Widget16 || (Object)this instanceof Widget23) {
         var3.cancel();
      } else {
         CUSTOM_ROTATING_PANORAMA_RENDERER.render(var1, ((Screen)(Object)this).width, ((Screen)(Object)this).height, 1.0F, var2);
         var3.cancel();
      }
   }
}
