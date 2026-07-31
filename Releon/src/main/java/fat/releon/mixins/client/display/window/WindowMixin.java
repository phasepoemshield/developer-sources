package fat.releon.mixins.client.display.window;

import net.minecraft.client.util.Window;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Window.class})
public class WindowMixin {
   public WindowMixin() {
   }

   @Inject(
      method = {"logGlError"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void suppressInvalidKeyError(int var1, long var2, CallbackInfo var4) {
      if (var1 == 65539 && var2 != 0L) {
         String var5 = MemoryUtil.memUTF8(var2);
         if ("Invalid key -1".equals(var5)) {
            var4.cancel();
         }
      }
   }
}
