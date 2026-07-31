package zenith.zov.utility.mixin.network;

import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.PacketHolder;
import zenith.ZenithInternal036$Helper;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.Event;
import zenith.PacketHolder_2;
import zenith.PacketHolder_3;

@Mixin({ClientConnection.class})
public abstract class MixinClientConnection implements ZenithInternal076 {
   @Unique
   private static boolean stackOverflowFix;

   @Shadow
   public abstract void send(Packet<?> Packet);

   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends PacketListener> void triggerReceivePacketEvent(Packet<T> Packet, PacketListener PacketListener, CallbackInfo callbackinfo) {
      PacketHolder ii1l11il1i1i = new PacketHolder(ZenithInternal036$Helper.lII1lllIlllIllII, Packet);
      EventBus.StringHolder_8((Event)ii1l11il1i1i);
      if (ii1l11il1i1i.Event()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"send(Lnet/minecraft/network/packet/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void triggerSendPacketEvent(Packet<?> Packet, CallbackInfo callbackinfo) {
      if (!stackOverflowFix) {
         PacketHolder_3 lllill11l1lll1iii1lli11ll1 = new PacketHolder_3(Packetx);
         EventBus.StringHolder_8((Event)lllill11l1lll1iii1lli11ll1);
         if (lllill11l1lll1iii1lli11ll1.Event()) {
            callbackinfo.cancel();
         } else {
            PacketHolder ii1l11il1i1i = new PacketHolder(ZenithInternal036$Helper.l1lIII1l1I, Packetx);
            EventBus.StringHolder_8((Event)ii1l11il1i1i);
            if (ii1l11il1i1i.Event()) {
               callbackinfo.cancel();
            } else {
               Packet Packetx = ii1l11il1i1i.Swinganimation();
               if (Packetx != Packetx) {
                  callbackinfo.cancel();

                  try {
                     stackOverflowFix = true;
                     this.send(Packetx);
                  } finally {
                     stackOverflowFix = false;
                  }
               }

               EventBus.StringHolder_8((Event)(new PacketHolder_2(Packetx)));
            }
         }
      }
   }
}
