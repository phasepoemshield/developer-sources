package kotakbaz.rain.mixin;

import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oxxxde.حش;
import oxxxde.شز;

// $VF: Compiled from MixinPerspectiveMouse.java
@Mixin(Mouse.class)
public class MixinPerspectiveMouse {
   @Redirect(method = "method_1606", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_746;method_5872(DD)V"))
   private void rain$redirectLookUpdate(ClientPlayerEntity player, double cursorDeltaY, double cursorDeltaX) {
      double adjustedX = شز.INSTANCE.adjustMouseSensitivity(cursorDeltaX);
      double adjustedY = شز.INSTANCE.adjustMouseSensitivity(cursorDeltaY);
      if (حش.INSTANCE.isPerspectiveActive()) {
         حش.INSTANCE.rotateCamera(adjustedX, adjustedY);
      } else {
         player.changeLookDirection(adjustedX, adjustedY);
      }
   }
}
