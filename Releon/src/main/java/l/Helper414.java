package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.Packet;

public interface Helper414 {
   MinecraftClient mc = MinecraftClient.getInstance();

   static void method4229(Packet<?> var0) {
      if (mc.getNetworkHandler() != null) {
         mc.getNetworkHandler().sendPacket(var0);
      }
   }
}
