package l;

import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class FastBreak extends Helper242 {
   private final Helper339 stopWatch = new Helper339();

   public FastBreak() {
      super("FastBreak", "Fast Break", Helper269.PLAYER);
   }

   @Helper104
   public void method2720(Event16 var1) {
      BlockPos var2 = var1.method3793();
      Direction var3 = var1.method3794();
      if (this.stopWatch.method3356(1.0) && mc.interactionManager.currentBreakingProgress >= 1.0E-7F) {
         mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, var2, var3));
         mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, var2, var3));
      }
   }
}
