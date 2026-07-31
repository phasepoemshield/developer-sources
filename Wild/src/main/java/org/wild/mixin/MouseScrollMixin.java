package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.O0000000O0O0;
import ru.metaculture.protection.O0000000O0O000;
import ru.metaculture.protection.ProtectionHandler;

@Mixin({Mouse.class})
public class MouseScrollMixin {
   @Inject(
      method = {"onMouseScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleMenuMouseScroll(long l, double d, double e, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      MinecraftClient var8 = MinecraftClient.getInstance();
      if (!wild$isWindowInputUsable(var8, l)) {
         callbackInfo.cancel();
      } else {
         double[] var9 = new double[1];
         double[] var10 = new double[1];
         GLFW.glfwGetCursorPos(l, var9, var10);
         O0000000O0O000 var11 = new O0000000O0O000(l, d, e, var9[0], var10[0]);
         EventManager.O00000000((Event)var11);
         if (Math.abs(e) > 1.0E-4) {
            int var12 = e > 0.0 ? -200 : -201;
            EventManager.O00000000((Event)(new O0000000O0O0(l, var12, 0, 1, 0)));
         }

         if (var11.O00000000()) {
            callbackInfo.cancel();
         }
      }
   }

   @Unique
   private static boolean wild$isWindowInputUsable(MinecraftClient minecraftClient, long l) {
      if (minecraftClient != null && minecraftClient.getWindow() != null && l != 0L && minecraftClient.isWindowFocused()) {
         Window var3 = minecraftClient.getWindow();
         return l == var3.getHandle() && !var3.hasZeroWidthOrHeight() && var3.getFramebufferWidth() > 0 && var3.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }
}
