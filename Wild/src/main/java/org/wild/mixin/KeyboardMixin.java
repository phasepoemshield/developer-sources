package org.wild.mixin;

import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.AutoBuy;
import ru.metaculture.protection.AutoBuyScreen;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.MenuModule;
import ru.metaculture.protection.ModernClickGuiScreen;
import ru.metaculture.protection.O0000000O0O0;
import ru.metaculture.protection.O000000O0O00O;
import ru.metaculture.protection.O000000OOOO00O;
import ru.metaculture.protection.ProtectionHandler;
import ru.metaculture.protection.Removals;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({Keyboard.class})
public class KeyboardMixin {
   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleMenuKeyEvent(long l, int i, int j, int k, int m, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      if (UnHook.O000000000O0) {
         if (k == 1 && i == 344 && (m & 2) != 0) {
            callbackInfo.cancel();
         }
      } else if (Removals.O0000000000O0() && k == 1 && i == 66 && (m & 2) != 0) {
         callbackInfo.cancel();
      } else if (WildClient.O000000000OO0() && WildClient.O00000000 != null) {
         MinecraftClient var8 = MinecraftClient.getInstance();
         if (var8 != null && var8.getWindow() != null) {
            if (k == 1 && var8.options != null && O000000O0O00O.O00000000 && var8.options.togglePerspectiveKey.matchesKey(i, j)) {
               callbackInfo.cancel();
            } else if (k == 1 && i == 67 && (m & 2) != 0 && (m & 4) != 0 && O000000OOOO00O.O00000000(var8)) {
               callbackInfo.cancel();
            } else if (var8.currentScreen == null) {
               if (isWindowInputUsable(var8, l)) {
                  O0000000O0O0 var9 = new O0000000O0O0(l, i, j, k, m);
                  EventManager.O00000000((Event)var9);
                  if (var9.O0000000000000() == 1 && var8.currentScreen == null) {
                     AutoBuy var10 = WildClient.O00000000.O000000000.O00000000(AutoBuy.class);
                     if (var10 != null && var10.O00000000O0.O0000000000() != -1 && var9.O00000000000() == var10.O00000000O0.O0000000000()) {
                        var8.setScreen(new AutoBuyScreen());
                        if (var8.mouse != null) {
                           var8.mouse.unlockCursor();
                        }

                        var9.O000000000();
                     }

                     MenuModule var11 = MenuModule.O0000000000OO();
                     int var12 = var11 != null && var11.O000000000000 != -1 ? var11.O000000000000 : 344;
                     if (var12 != -1 && var9.O00000000000() == var12) {
                        ModernClickGuiScreen var13 = WildClient.O00000000.O00000000000();
                        if (var13 != null) {
                           var8.setScreen(var13);
                           if (var8.mouse != null) {
                              var8.mouse.unlockCursor();
                           }

                           var9.O000000000();
                        }
                     }
                  }

                  if (var9.O00000000()) {
                     callbackInfo.cancel();
                  }
               }
            }
         }
      }
   }

   private static boolean isWindowInputUsable(MinecraftClient minecraftClient, long l) {
      if (minecraftClient != null && minecraftClient.getWindow() != null && l != 0L && minecraftClient.isWindowFocused()) {
         Window var3 = minecraftClient.getWindow();
         return l == var3.getHandle() && !var3.hasZeroWidthOrHeight() && var3.getFramebufferWidth() > 0 && var3.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }
}
