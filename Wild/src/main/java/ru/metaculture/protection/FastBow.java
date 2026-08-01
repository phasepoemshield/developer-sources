package ru.metaculture.protection;

import net.minecraft.item.BowItem;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FastBow",
   O0000000000 = Category.Combat,
   O000000000 = "Автоматический спам стрелами"
)
public class FastBow extends Module {
   private final NumberSetting O000000000O = new NumberSetting("Задержка", 10.0F, 1.0F, 10.0F, 1.0F, false);

   public FastBow() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!this.O0000000000O0()) {
         if (this.O0000000000O00()) {
            this.O0000000000O0O();
            O0000000000.player.stopUsingItem();
         }
      }
   }

   private boolean O0000000000O0() {
      return O0000000000.player == null || O0000000000.world == null || O0000000000.getNetworkHandler() == null;
   }

   private boolean O0000000000O00() {
      boolean var1 = O0000000000.player.getMainHandStack().getItem() instanceof BowItem;
      boolean var2 = O0000000000.player.isUsingItem();
      return var1 && var2 ? O0000000000.player.getItemUseTime() >= this.O000000000O.O0000000000() : false;
   }

   private void O0000000000O0O() {
      PlayerActionC2SPacket var1 = new PlayerActionC2SPacket(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Direction.DOWN);
      PlayerInteractItemC2SPacket var2 = new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, 0, O0000000000.player.getYaw(), O0000000000.player.getPitch());
      O0000000000.getNetworkHandler().sendPacket(var1);
      O0000000000.getNetworkHandler().sendPacket(var2);
   }
}
