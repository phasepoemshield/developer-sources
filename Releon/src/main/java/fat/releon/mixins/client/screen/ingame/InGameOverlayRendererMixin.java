package fat.releon.mixins.client.screen.ingame;

import l.NoRender;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameOverlayRenderer.class})
public class InGameOverlayRendererMixin {
   public InGameOverlayRendererMixin() {
   }

   @Inject(
      method = {"renderFireOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderFireOverlayHook(MatrixStack var0, VertexConsumerProvider var1, CallbackInfo var2) {
      NoRender var3 = NoRender.method2708();
      if (var3.isState() && var3.modeSetting.method2588("Fire")) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"renderInWallOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderInWallOverlayHook(Sprite var0, MatrixStack var1, VertexConsumerProvider var2, CallbackInfo var3) {
      NoRender var4 = NoRender.method2708();
      if (var4.isState() && var4.modeSetting.method2588("Block Overlay")) {
         var3.cancel();
      }
   }
}
