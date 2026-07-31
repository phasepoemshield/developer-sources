package l;

import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;

public class Disabler extends Helper242 {
   private final Setting5 mode = new Setting5("Mode", "Disabler mode").method2381("LegendsGrief").method2383("LegendsGrief");

   public Disabler() {
      super("Disabler", Helper269.MISC);
      this.setup(new Helper264[]{this.mode});
   }

   @Override
   public void activate() {
      if (mc.player != null && mc.getNetworkHandler() != null) {
         if (this.mode.method2385("LegendsGrief")) {
            mc.player
               .networkHandler
               .sendPacket(
                  new PositionAndOnGround(
                     mc.player.getX() + 1.0, mc.player.getY() + 3.0, mc.player.getZ() + 1.0, mc.player.isOnGround(), mc.player.horizontalCollision
                  )
               );
            mc.player.networkHandler.sendPacket(new LookAndOnGround(Float.MAX_VALUE, 0.0F, mc.player.isOnGround(), mc.player.horizontalCollision));
            mc.player
               .networkHandler
               .sendPacket(
                  new PositionAndOnGround(
                     mc.player.getX() + 2.0, mc.player.getY() + 2.0, mc.player.getZ() + 2.0, mc.player.isOnGround(), mc.player.horizontalCollision
                  )
               );
            mc.player.networkHandler.sendPacket(new LookAndOnGround(-Float.MAX_VALUE, 0.0F, mc.player.isOnGround(), mc.player.horizontalCollision));
         }
      }
   }
}
