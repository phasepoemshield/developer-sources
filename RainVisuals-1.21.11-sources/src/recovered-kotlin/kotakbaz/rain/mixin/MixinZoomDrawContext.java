package kotakbaz.rain.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.تث;
import oxxxde.جإ;
import oxxxde.شز;

// $VF: Compiled from MixinZoomDrawContext.java
@Mixin(DrawContext.class)
public class MixinZoomDrawContext {
   @Shadow
   @Final
   private Matrix3x2fStack matrices;

   @Inject(method = "method_44379", at = @At("HEAD"))
   private void rain$pushZoomTransform(int y1, int y2, int ci, int x2, CallbackInfo x1) {
      this.matrices.pushMatrix();
      this.matrices.mul(شز.INSTANCE.getRenderTransform());
   }

   @ModifyArg(method = "method_51425", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_11246;method_70920(Lnet/minecraft/class_11245;)V"))
   private ItemGuiElementRenderState rain$captureTargetHudItemAlpha(ItemGuiElementRenderState state) {
      ((تث)state).rain$setTargetHudAlpha(جإ.currentAlpha());
      return state;
   }

   @Inject(method = "method_44379", at = @At("RETURN"))
   private void rain$popZoomTransform(int x2, int y2, int x1, int ci, CallbackInfo y1) {
      this.matrices.popMatrix();
   }
}
