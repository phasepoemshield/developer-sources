package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.MouseButtonEvent;
import ru.destra.event.RenderTickEvent;
import ru.destra.gui.MouseReleasedHandler;

@Mixin(Mouse.class)
public class MouseMixin {
   @Inject(method = "onMouseButton", at = @At("HEAD"))
   private void onMouseButton(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      if (DestraClient.getInstance() != null) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         if (var7 != null && var7.currentScreen != null) {
            if (var4 == 0 && var7.currentScreen instanceof MouseReleasedHandler var8) {
               var8.onMouseReleased(var3);
            }
         }
         DestraClient.getInstance().getEventBus().post(new MouseButtonEvent(var3, var4));
      }
   }

   @Inject(method = "onMouseScroll", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;isSpectator()Z", shift = Shift.BEFORE), cancellable = true)
   public void onScroll(long var1, double var3, double var5, CallbackInfo var7) {
      double var8 = var5;
      if (MinecraftClient.IS_SYSTEM_MAC && var5 == 0.0) {
         var8 = var3;
      }

      double var10 = (MinecraftClient.getInstance().options.getDiscreteMouseScroll().getValue() ? Math.signum(var8) : var8)
         * (Double)MinecraftClient.getInstance().options.getMouseWheelSensitivity().getValue();
      RenderTickEvent var12 = new RenderTickEvent(var10);
      DestraClient.getInstance().getEventBus().post(var12);
      if (var12.д()) {
         var7.cancel();
      }
   }
}
