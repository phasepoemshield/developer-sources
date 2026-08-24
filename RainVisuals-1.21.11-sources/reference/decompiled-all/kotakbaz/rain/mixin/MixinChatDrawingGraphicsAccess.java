package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import oxxxde.اذ;

// $VF: Compiled from MixinChatDrawingGraphicsAccess.java
@Mixin(targets = {"net/minecraft/class_338$class_12333", "net/minecraft/class_338$class_12235"})
public class MixinChatDrawingGraphicsAccess {
   @ModifyArg(method = {"method_75809", "method_75808"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_25294(IIIII)V"), index = 2)
   private int rain$offsetFillRight(int x) {
      return اذ.offsetX(x);
   }

   @ModifyArg(method = {"method_75809", "method_75808"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_25294(IIIII)V"), index = 0)
   private int rain$offsetFillLeft(int x) {
      return اذ.offsetX(x);
   }

   @ModifyArg(
      method = "method_75807",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_12225;method_75766(Lnet/minecraft/class_11735;IILnet/minecraft/class_12225$class_12227;Lnet/minecraft/class_5481;)V"
      ),
      index = 1
   )
   private int rain$offsetMessageX(int x) {
      return اذ.offsetX(x);
   }
}
