package org.zenith.utility.mixin.network;

import org.zenith.module.ItemScroller;

import org.zenith.event.PacketEvent;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;

import org.zenith.event.PacketEvent;
import org.zenith.event.PacketEvent_Var159;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.ClientProvider;














import com.darkmagician6.eventapi.EventManager;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientConnection.class})
public abstract class MixinClientConnection implements ClientProvider {
   @Unique
   public boolean stackOverflowFix;
   @Shadow
   public PacketListener field_11652;

   public MixinClientConnection() {
   }

   @Shadow
   public abstract void method_10743(Packet<?> var1);

   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends PacketListener> void triggerReceivePacketEvent(Packet<T> var0, PacketListener var1, CallbackInfo var2) {
      if (EventManager.hasListeners(PacketEvent.class)) {
         PacketEvent lllil11lil1l1l1l1 = new PacketEvent(PacketEvent_Var159.val451, var0);
         EventManager.call(lllil11lil1l1l1l1);
         if (lllil11lil1l1l1l1.isCancelled()) {
            var2.cancel();
         }
      }
   }

   @Inject(
      method = {"send(Lnet/minecraft/network/packet/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void triggerSendPacketEvent(Packet<?> var1, CallbackInfo var2) {
      if (!this.stackOverflowFix) {
         if (EventManager.hasListeners(PacketSendEvent.class)) {
            PacketSendEvent lilli1ilililii1i1 = new PacketSendEvent(var1);
            EventManager.call(lilli1ilililii1i1);
            if (lilli1ilililii1i1.isCancelled()) {
               var2.cancel();
               return;
            }
         }

         Packet packet = var1;
         if (EventManager.hasListeners(PacketEvent.class)) {
            PacketEvent lllil11lil1l1l1l1 = new PacketEvent(PacketEvent_Var159.val450, var1);
            EventManager.call(lllil11lil1l1l1l1);
            if (lllil11lil1l1l1l1.isCancelled()) {
               var2.cancel();
               return;
            }

            packet = lllil11lil1l1l1l1.ItemScroller();
            if (packet != var1) {
               var2.cancel();

               try {
                  this.stackOverflowFix = true;
                  this.method_10743(packet);
               } finally {
                  this.stackOverflowFix = false;
               }
            }
         }

         if (EventManager.hasListeners(PacketReceiveEvent.class)) {
            EventManager.call(new PacketReceiveEvent(packet));
         }
      }
   }
}
