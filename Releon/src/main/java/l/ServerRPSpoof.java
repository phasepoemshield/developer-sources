package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket.Status;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;

public class ServerRPSpoof extends Helper242 {
   private Helper441 currentAction = Helper441.WAIT;
   private final Helper333 counter = Helper333.method3308();

   public ServerRPSpoof() {
      super("ServerRPSpoof", "Server RP Spoof", Helper269.MISC);
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof ResourcePackSendS2CPacket) {
         this.currentAction = Helper441.ACCEPT;
         var1.method582();
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onTick(Event8 var1) {
      ClientPlayNetworkHandler var2 = mc.getNetworkHandler();
      if (var2 != null) {
         if (this.currentAction == Helper441.ACCEPT) {
            var2.sendPacket(new ResourcePackStatusC2SPacket(mc.player.getUuid(), Status.ACCEPTED));
            this.currentAction = Helper441.SEND;
            this.counter.method3309();
         } else if (this.currentAction == Helper441.SEND && this.counter.method3311(300L)) {
            var2.sendPacket(new ResourcePackStatusC2SPacket(mc.player.getUuid(), Status.SUCCESSFULLY_LOADED));
            this.currentAction = Helper441.WAIT;
         }
      }
   }

   @Override
   public void deactivate() {
      this.currentAction = Helper441.WAIT;
      super.deactivate();
   }
}
