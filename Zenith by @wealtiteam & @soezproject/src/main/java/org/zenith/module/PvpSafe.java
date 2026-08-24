package org.zenith.module;

import org.zenith.core.CloudApiClient;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.PacketEvent;


import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;

@ModuleInfo(
   name = "PvpSafe",
   description = "\u041d\u0435 \u0434\u0430\u0435\u0442 \u043b\u0438\u0432\u043d\u0443\u0442\u044c \u0432 \u043a\u0442 \u0441 \u0441\u0435\u0440\u0432\u0430",
   category = Category.MISC
)
public final class PvpSafe extends Module {
   public static final PvpSafe pvpSafe = new PvpSafe();

   public PvpSafe() {
   }

   @EventTarget
   public void EnchantItemSpec(PacketEvent var1) {
      if (var1.AntiInvisible()
         && ZenithClient.on23().CloudApiClient().soundEvent5()
         && var1.ItemScroller() instanceof CommandExecutionC2SPacket commandexecutionc2spacket) {
         CommandExecutionC2SPacket commandexecutionc2spacket1 = commandexecutionc2spacket;
         String s = commandexecutionc2spacket1.command();
         if (s.contains("hub")) {
            var1.setCancelled(true);
         }
      }
   }
}
