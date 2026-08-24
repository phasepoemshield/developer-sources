package org.zenith.module;

import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.NbtItemSpec;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;
import org.zenith.event.PacketEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.BlockPos;

@ModuleInfo(
   name = "FastBreak",
   category = Category.MISC,
   description = "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u0434\u043e\u0431\u044b\u0447\u0443 \u0431\u043b\u043e\u043a\u043e\u0432"
)
public final class FastBreak extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final FastBreak fastBreak = new FastBreak();
   public final NumberSetting breakDamage = new NumberSetting(
      "module.fastBreak.breakDamage", 0.8F, 0.1F, 1.0F, 0.1F, "module.fastBreak.breakDamage.desc", "%"
   );
   public final BooleanSetting bypass = new BooleanSetting("module.fastBreak.bypass", "module.fastBreak.bypass.desc", true);

   public FastBreak() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      minecraftClient3.interactionManager.blockBreakingCooldown = 0;
      if (minecraftClient3.interactionManager.currentBreakingProgress > 0.0F) {
         minecraftClient3.interactionManager.currentBreakingProgress = 1.0F;
      }
   }

   @EventTarget
   public void NbtItemSpec(PacketEvent var1) {
      if (this.bypass.isEnabled()) {
         if (var1.ItemScroller() instanceof PlayerActionC2SPacket playeractionc2spacket
            && playeractionc2spacket.getAction() == Action.STOP_DESTROY_BLOCK) {
            BlockPos blockpos = playeractionc2spacket.getPos();
            if (blockpos != null) {
               minecraftClient3.getNetworkHandler()
                  .sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, blockpos.up(), playeractionc2spacket.getDirection()));
            }
         }
      }
   }
}
