package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.O0000000O000OO;
import ru.metaculture.protection.O0000000OO0;
import ru.metaculture.protection.O0000O00O00O0O;
import ru.metaculture.protection.ProtectionHandler;
import ru.metaculture.protection.TpsTracker;
import ru.metaculture.protection.WildClient;

@Mixin({ClientConnection.class})
public class ClientConnectionMixin {
   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends PacketListener> void handlePacketPre(Packet<T> packet, PacketListener packetListener, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      boolean var3 = wild$dispatchReceiveEvent(packet);
      wild$updateTps(packet);
      if (var3) {
         callbackInfo.cancel();
      }
   }

   private static <T extends PacketListener> boolean wild$dispatchReceiveEvent(Packet<T> packet) {
      try {
         O0000000O000OO var1 = new O0000000O000OO(packet, O0000000O000OO.W24.RECEIVE);
         boolean var2 = TpsTracker.O00000000(var1);
         EventManager.O00000000((Event)var1);
         if (var2) {
            WildClient.O0000000000000();
         }

         return var1.O00000000();
      } catch (Throwable var3) {
         return false;
      }
   }

   private static void wild$updateTps(Packet<?> packet) {
      O0000O00O00O0O.O000000000(packet);
   }

   @Inject(
      method = {"send(Lnet/minecraft/network/packet/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendPre(Packet<?> packet, CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();

      try {
         O0000000O000OO var3 = new O0000000O000OO(packet, O0000000O000OO.W24.SEND);
         EventManager.O00000000((Event)var3);
         if (var3.O00000000()) {
            callbackInfo.cancel();
            return;
         }
      } catch (Throwable var7) {
      }

      O0000O00O00O0O.O00000000(packet);
      if (packet instanceof CloseHandledScreenC2SPacket var8) {
         try {
            MinecraftClient var4 = MinecraftClient.getInstance();
            if (var4 != null) {
               O0000000OO0 var5 = new O0000000OO0(var4.currentScreen, var8.getSyncId());
               EventManager.O00000000((Event)var5);
               if (var5.O00000000()) {
                  callbackInfo.cancel();
               }
            }
         } catch (Throwable var6) {
         }
      }
   }
}
