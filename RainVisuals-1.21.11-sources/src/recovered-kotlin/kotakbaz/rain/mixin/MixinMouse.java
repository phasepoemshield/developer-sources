package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.KeyEvent;
import net.minecraft.client.Mouse;
import net.minecraft.client.input.MouseInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.حل;
import oxxxde.رظ;
import oxxxde.شز;
import oxxxde.صص;

// $VF: Compiled from MixinMouse.java
@Mixin(Mouse.class)
public class MixinMouse {
   @Inject(method = "method_1601", at = @At("HEAD"), cancellable = true)
   public void onMouse(long buttonInfo, MouseInput window, int action, CallbackInfo ci) {
      KeyEvent event = new KeyEvent();
      event.put(KeyEvent.Companion.getBUTTON(), buttonInfo.button());
      event.put(KeyEvent.Companion.getMOUSE(), true);
      event.put(KeyEvent.Companion.getRELEASE(), action == 0);
      رظ.INSTANCE.post(event);
      if (صص.INSTANCE.getCustomScreen() != null) {
         ci.cancel();
      }
   }

   @Inject(method = "method_1598", at = @At("HEAD"), cancellable = true)
   public void onScroll(long horizontal, double window, double ci, CallbackInfo vertical) {
      if (صص.INSTANCE.getCustomScreen() != null) {
         صص.INSTANCE.getCustomScreen().onMouseScroll(حل.INSTANCE.mouseX(), حل.INSTANCE.mouseY(), (float)vertical);
         ci.cancel();
      } else {
         if (شز.INSTANCE.handleMouseScroll(vertical)) {
            ci.cancel();
         }
      }
   }
}
