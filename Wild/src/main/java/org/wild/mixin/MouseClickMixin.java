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
import ru.metaculture.protection.O0000000O00OOO;
import ru.metaculture.protection.O0000000O0O0;
import ru.metaculture.protection.O0000000O0O00;
import ru.metaculture.protection.ProtectionHandler;

@Mixin({Mouse.class})
public class MouseClickMixin {
   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleMenuMouseClick(long l, int i, int j, int k, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      MinecraftClient var7 = MinecraftClient.getInstance();
      if (!wild$isWindowInputUsable(var7, l)) {
         callbackInfo.cancel();
      } else {
         double[] var8 = new double[1];
         double[] var9 = new double[1];
         GLFW.glfwGetCursorPos(l, var8, var9);
         O0000000O0O00 var10 = new O0000000O0O00(l, i, j, k, var8[0], var9[0]);
         EventManager.O00000000((Event)var10);
         EventManager.O00000000((Event)(new O0000000O0O0(l, -100 - i, 0, j, k)));
         if (var10.O00000000()) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"lockCursor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preventCursorLock(CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      MinecraftClient var2 = MinecraftClient.getInstance();
      long var3 = 0L;
      if (var2 != null && var2.getWindow() != null) {
         var3 = var2.getWindow().getHandle();
      }

      if (wild$isWindowInputUsable(var2, var3) && var2.currentScreen == null) {
         O0000000O00OOO var5 = new O0000000O00OOO(var2, var3);
         EventManager.O00000000((Event)var5);
         if (var5.O00000000()) {
            callbackInfo.cancel();
         }
      } else {
         callbackInfo.cancel();
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
