package l;

import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.util.Hand;

public class NoFall extends Helper242 {
   public static NoFall method2232() {
      return Helper222.method1979(NoFall.class);
   }

   public NoFall() {
      super("NoFall", Helper269.PLAYER);
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player.fallDistance > 2.4) {
         mc.player
            .networkHandler
            .sendPacket(new Full(mc.player.getX(), mc.player.getY() + 1.0E-6, mc.player.getZ(), mc.player.getYaw(), mc.player.getPitch(), false, false));
         mc.player
            .networkHandler
            .sendPacket(new Full(mc.player.getX(), mc.player.getY() + 1.0E-6, mc.player.getZ(), mc.player.getYaw(), mc.player.getPitch(), false, false));
         mc.player.networkHandler.sendPacket(new PlayerInteractItemC2SPacket(Hand.OFF_HAND, 0, mc.player.getYaw(), mc.player.getPitch()));
         mc.player.fallDistance = 0.0F;
      }
   }
}
