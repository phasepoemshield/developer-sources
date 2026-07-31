package zenith.zov.utility.mixin.render;

import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.Norender;

@Mixin({InGameOverlayRenderer.class})
public class MixinGameOverlayRenderer {
   @Inject(
      method = {"renderFireOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void removeFireOverlay(MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, CallbackInfo callbackinfo) {
      if (Norender.I11I1Il11lIlIl.ll1l11llIIlIlIlIl1()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"renderInWallOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderInWallOverlayHook(Sprite Sprite, MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, CallbackInfo callbackinfo) {
      if (Norender.I11I1Il11lIlIl.lI11l11I1II11II1IIl11()) {
         callbackinfo.cancel();
      }
   }
}
