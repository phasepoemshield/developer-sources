package kotakbaz.rain.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.شز;

// $VF: Compiled from MixinZoomGameRenderer.java
@Mixin(GameRenderer.class)
public class MixinZoomGameRenderer {
   @Unique
   private final Vector3f rain$mouseVec = new Vector3f();

   @Inject(method = "method_3192", at = @At("HEAD"))
   private void rain$updateZoomFrame(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
      شز.INSTANCE.onRenderFrame(tickCounter.getFixedDeltaTicks());
   }

   @Inject(method = "method_3196", at = @At("RETURN"), cancellable = true)
   private void rain$modifyZoomFov(Camera changingFov, float camera, boolean tickProgress, CallbackInfoReturnable<Float> cir) {
      cir.setReturnValue(شز.INSTANCE.modifyFov((Float)cir.getReturnValue()));
   }

   @ModifyArgs(method = "method_3192", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_47413(Lnet/minecraft/class_332;IIF)V"))
   private void rain$transformScreenMouse(Args args) {
      if (شز.INSTANCE.shouldTransformScreenMouse()) {
         this.rain$mouseVec.set(((Number)args.get(1)).floatValue(), ((Number)args.get(2)).floatValue(), 1.0F);
         this.rain$mouseVec.mul(شز.INSTANCE.getMouseTransform());
         args.set(1, (int)this.rain$mouseVec.x);
         args.set(2, (int)this.rain$mouseVec.y);
      }
   }
}
