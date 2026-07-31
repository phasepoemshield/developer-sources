package l;

import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class Ktleave extends Helper242 {
   private final Setting5 mode = new Setting5("Mode", "Режим работы ktleave").method2381("Cancel", "Grim Updated").method2383("Cancel");
   private int awaitTicks;
   private boolean shouldSpoofDig;
   private BlockPos blockPos = BlockPos.ORIGIN;

   public Ktleave() {
      super("ktleave", Helper269.COMBAT);
      this.setup(new Helper264[]{this.mode});
   }

   @Override
   public void activate() {
      this.method4006();
   }

   @Override
   public void deactivate() {
      this.method4006();
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.state && mc.player != null && mc.world != null && var1.method3896() == Helper385.RECEIVE) {
         String var2 = this.mode.method2386();
         switch (var2) {
            case "Cancel":
               this.method4004(var1);
               break;
            case "Grim Updated":
               this.method4005(var1);
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.state && mc.player != null && mc.world != null && this.mode.method2385("Grim Updated")) {
         this.awaitTicks--;
         if (this.shouldSpoofDig) {
            this.blockPos = BlockPos.ofFloored(mc.player.getPos());
            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, this.blockPos, Direction.UP));
            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, this.blockPos, Direction.UP));
            this.shouldSpoofDig = false;
         }
      }
   }

   private void method4004(Helper386 var1) {
      if (var1.method3895() instanceof EntityVelocityUpdateS2CPacket var2 && var2.getEntityId() == mc.player.getId()) {
         var1.method582();
      }
   }

   private void method4005(Helper386 var1) {
      if (var1.method3895() instanceof EntityVelocityUpdateS2CPacket var2) {
         if (var2.getEntityId() == mc.player.getId() && this.awaitTicks <= -5) {
            this.awaitTicks = 2;
            this.shouldSpoofDig = true;
         }
      }
   }

   private void method4006() {
      this.awaitTicks = 0;
      this.shouldSpoofDig = false;
      this.blockPos = BlockPos.ORIGIN;
   }
}
