package org.wild.mixin;

import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.network.ServerInfo.ResourcePackPolicy;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.DisconnectionInfo;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O0000O00O00000;
import ru.metaculture.protection.PlayerHelper;
import ru.metaculture.protection.WildClient;

@Mixin({ClientCommonNetworkHandler.class})
public abstract class ClientCommonNetworkHandlerMixin {
   @Shadow
   protected ServerInfo serverInfo;
   @Shadow
   protected MinecraftClient client;
   @Shadow
   protected ClientConnection connection;

   @Inject(
      method = {"onDisconnected"},
      at = {@At("TAIL")}
   )
   private void onDisconnected(DisconnectionInfo disconnectionInfo, CallbackInfo callbackInfo) {
      O0000O00O00000.O00000000(this.serverInfo, disconnectionInfo);
   }

   @Inject(
      method = {"onResourcePackSend"},
      at = {@At("HEAD")}
   )
   private void wild$preferVanillaServerResourcePack(ResourcePackSendS2CPacket resourcePackSendS2CPacket, CallbackInfo callbackInfo) {
      if (resourcePackSendS2CPacket != null && this.client != null && this.wild$playerHelperWantsLoad()) {
         if ((this.wild$isFunTimeEndpoint(resourcePackSendS2CPacket.url()) || this.wild$isFunTimeEndpoint(this.wild$currentServerAddress()))
            && this.serverInfo != null) {
            this.serverInfo.setResourcePackPolicy(ResourcePackPolicy.ENABLED);
         }
      }
   }

   private boolean wild$playerHelperWantsLoad() {
      try {
         if (WildClient.O000000000OO0() && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            PlayerHelper var1 = (PlayerHelper)WildClient.O00000000.O000000000.O000000000(PlayerHelper.class);
            return var1 != null && var1.O000000000O.O000000000("Load");
         } else {
            return false;
         }
      } catch (Throwable var2) {
         return false;
      }
   }

   private String wild$currentServerAddress() {
      try {
         if (this.serverInfo != null && this.serverInfo.address != null) {
            return this.serverInfo.address;
         } else {
            ServerInfo var1 = this.client.getCurrentServerEntry();
            return var1 == null ? "" : var1.address;
         }
      } catch (Throwable var2) {
         return "";
      }
   }

   private boolean wild$isFunTimeEndpoint(String string) {
      if (string != null && !string.isBlank()) {
         String var2 = string.toLowerCase(Locale.ROOT);
         return var2.contains("funtime") || var2.contains("fun-time") || var2.contains("ftmc");
      } else {
         return false;
      }
   }
}
