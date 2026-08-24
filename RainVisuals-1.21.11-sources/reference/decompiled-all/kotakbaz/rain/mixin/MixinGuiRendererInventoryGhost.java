package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.تث;
import oxxxde.ظظ;

// $VF: Compiled from MixinGuiRendererInventoryGhost.java
@Mixin(GuiRenderer.class)
public class MixinGuiRendererInventoryGhost {
   @Unique
   private float rain$targetHudItemAlpha = 1.0F;
   @Unique
   private static final int GHOST_COLOR = 1728053247;
   @Unique
   private boolean rain$renderingGhostItem;

   @ModifyArg(
      method = "method_70887",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11241;<init>(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_11231;Lorg/joml/Matrix3x2f;IIIIFFFFILnet/minecraft/class_8030;Lnet/minecraft/class_8030;)V"
      ),
      index = 11
   )
   private int rain$applyItemAlpha(int original) {
      int color = this.rain$renderingGhostItem ? 1728053247 : original;
      if (this.rain$targetHudItemAlpha >= 1.0F) {
         return color;
      }

      int alpha = Math.round((color >>> 24 & 0xFF) * this.rain$targetHudItemAlpha);
      int red = Math.round((color >>> 16 & 0xFF) * this.rain$targetHudItemAlpha);
      int green = Math.round((color >>> 8 & 0xFF) * this.rain$targetHudItemAlpha);
      int blue = Math.round((color & 0xFF) * this.rain$targetHudItemAlpha);
      return alpha << 24 | red << 16 | green << 8 | blue;
   }

   @Inject(method = "method_70887", at = @At("HEAD"))
   private void rain$identifyGhostItem(ItemGuiElementRenderState atlasSize, float state, float u, int v, int size, CallbackInfo ci) {
      float x = state.pose().m00() * state.x() + state.pose().m10() * state.y() + state.pose().m20();
      float y = state.pose().m01() * state.x() + state.pose().m11() * state.y() + state.pose().m21();
      this.rain$renderingGhostItem = ظظ.INSTANCE.isGhostPosition(Math.round(x), Math.round(y));
      this.rain$targetHudItemAlpha = ((تث)state).rain$getTargetHudAlpha();
   }

   @Inject(method = "method_70887", at = @At("RETURN"))
   private void rain$finishGhostItem(ItemGuiElementRenderState atlasSize, float u, float ci, int state, int size, CallbackInfo v) {
      this.rain$renderingGhostItem = false;
      this.rain$targetHudItemAlpha = 1.0F;
   }
}
