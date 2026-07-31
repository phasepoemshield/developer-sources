package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.O0000000O0O00O;
import ru.metaculture.protection.O0000000O0OO0O;
import ru.metaculture.protection.O0000O00OO0OO0;
import ru.metaculture.protection.PlayerHelper;
import ru.metaculture.protection.ProtectionHandler;

@Mixin({Mouse.class})
public abstract class MouseMixin {
   @Inject(
      method = {"updateMouse"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelCameraMovement(CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (!isMouseWindowUsable(var2)) {
         callbackInfo.cancel();
      } else {
         O0000000O0O00O var3 = new O0000000O0O00O(var2);
         EventManager.O00000000((Event)var3);
         if (var3.O00000000()) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"updateMouse"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;changeLookDirection(DD)V"
      )},
      locals = LocalCapture.CAPTURE_FAILHARD,
      cancellable = true
   )
   private void onLook(double d, CallbackInfo callbackInfo, double e, double f, double g, double h, double i, int j) {
      MinecraftClient var15 = MinecraftClient.getInstance();
      if (!isMouseWindowUsable(var15)) {
         callbackInfo.cancel();
      } else {
         if (var15 != null && var15.player != null) {
            O0000000O0OO0O var16 = new O0000000O0OO0O(e, f * j);
            EventManager.O00000000((Event)var16);
            if (!var16.O00000000()) {
               var15.player.changeLookDirection(var16.O00000000, var16.O000000000);
            }

            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"onMouseScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseScroll(long l, double d, double e, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      MinecraftClient var8 = MinecraftClient.getInstance();
      if (isMouseWindowUsable(var8)) {
         if (PlayerHelper.O00000000O0000 && e != 0.0) {
            PlayerHelper.O00000000O000O -= (float)(e * 0.075F);
            PlayerHelper.O00000000O000O = O0000O00OO0OO0.O00000000000OO(PlayerHelper.O00000000O000O, 0.02F, 2.0F);
            callbackInfo.cancel();
         }
      }
   }

   private static boolean isMouseWindowUsable(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null && minecraftClient.isWindowFocused()) {
         Window var1 = minecraftClient.getWindow();
         return !var1.hasZeroWidthOrHeight() && var1.getFramebufferWidth() > 0 && var1.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }
}
