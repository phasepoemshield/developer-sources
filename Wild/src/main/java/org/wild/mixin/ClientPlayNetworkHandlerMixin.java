package org.wild.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.AutoLoginManager;
import ru.metaculture.protection.MinecraftAccessor;
import ru.metaculture.protection.ProtectInfo;
import ru.metaculture.protection.ProtectionHandler;
import ru.metaculture.protection.PvPSafe;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({ClientPlayNetworkHandler.class})
public class ClientPlayNetworkHandlerMixin implements MinecraftAccessor {
   @ModifyVariable(
      method = {"sendChatMessage"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private String wild$protectOutgoingChatMessage(String string) {
      return ProtectInfo.O000000000(string);
   }

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSendChatMessage(String string, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      if (WildClient.O00000000000OO != null && string.equalsIgnoreCase(WildClient.O00000000000OO)) {
         UnHook var3 = WildClient.O00000000.O000000000.O00000000(UnHook.class);
         if (var3 != null && var3.O0000000000000) {
            var3.O00000000(false);
            callbackInfo.cancel();
            return;
         }
      }

      if (PvPSafe.O00000000(string)) {
         callbackInfo.cancel();
      } else if (!UnHook.O000000000O0) {
         String var4 = WildClient.O00000000.O000000000OO();
         if (string.startsWith(var4)) {
            WildClient.O00000000.O000000000O0O0().O00000000(string);
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"sendChatCommand"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockPvpSafeCommand(String string, CallbackInfo callbackInfo) {
      if (PvPSafe.O000000000(string)) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"runClickEventCommand"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockPvpSafeClickCommand(String string, Screen screen, CallbackInfo callbackInfo) {
      if (PvPSafe.O000000000(string)) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"onGameJoin"},
      at = {@At("TAIL")}
   )
   private void onGameJoin(GameJoinS2CPacket gameJoinS2CPacket, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      AutoLoginManager.O000000000(a_);
   }

   @Redirect(
      method = {"onPlayerList"},
      at = @At(
         value = "INVOKE",
         target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V",
         remap = false
      )
   )
   private void suppressUnknownPlayerLog(Logger logger, String string, Object object, Object object2) {
      if (!string.startsWith("Ignoring player info update")) {
         logger.warn(string, object, object2);
      }
   }
}
