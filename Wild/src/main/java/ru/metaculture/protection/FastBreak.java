package ru.metaculture.protection;

import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FastBreak",
   O0000000000 = Category.Player,
   O000000000 = "Быстрая поломка блоков"
)
public class FastBreak extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Скорость", 0.5F, 0.1F, 1.0F, 0.1F, false);

   public FastBreak() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (O0000000000.options.attackKey.isPressed()) {
            if (O0000000000.crosshairTarget instanceof BlockHitResult var2) {
               BlockPos var9 = var2.getBlockPos();
               BlockState var4 = O0000000000.world.getBlockState(var9);
               if (var4 != null && !var4.isAir()) {
                  Direction var5 = var2.getSide();
                  float var6 = this.O000000000O.O0000000000();
                  if (var6 > 4.0F) {
                     O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, var9, var5));
                     O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, var9, var5));
                     O0000000000.player.swingHand(Hand.MAIN_HAND);
                     O0000000000.interactionManager.cancelBlockBreaking();
                  } else {
                     int var7 = (int)(var6 * 50.85F);

                     for (int var8 = 0; var8 < var7; var8++) {
                        O0000000000.interactionManager.updateBlockBreakingProgress(var9, var5);
                     }

                     O0000000000.player.swingHand(Hand.MAIN_HAND);
                  }
               }
            }
         }
      }
   }
}
