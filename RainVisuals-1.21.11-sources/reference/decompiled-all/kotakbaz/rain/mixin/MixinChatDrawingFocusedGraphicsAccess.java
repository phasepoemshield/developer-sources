package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import oxxxde.اذ;

// $VF: Compiled from MixinChatDrawingFocusedGraphicsAccess.java
@Mixin(targets = "net/minecraft/class_338$class_12235")
public class MixinChatDrawingFocusedGraphicsAccess {
   @ModifyArg(
      method = "method_75810",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_7591$class_7592;method_44712(Lnet/minecraft/class_332;II)V"),
      index = 1
   )
   private int rain$offsetTagIconX(int x) {
      return اذ.offsetX(x);
   }
}
