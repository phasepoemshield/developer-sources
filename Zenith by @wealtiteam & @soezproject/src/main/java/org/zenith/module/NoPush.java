package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventEntityCollision;
import org.zenith.event.EventPushOutOfBlocks;

import org.zenith.setting.ModeSetting;



import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

@ModuleInfo(
   name = "NoPush",
   description = "No Push",
   category = Category.MOVEMENT
)
public final class NoPush extends Module {
   public final ModeSetting modeSetting12 = ModeSetting.on23(
      "module.noPush.ignoreSetting",
      "module.noPush.ignoreSetting.desc",
      List.of(
         "module.noPush.ignoreSetting.water",
         "module.noPush.ignoreSetting.blocks",
         "module.noPush.ignoreSetting.entities",
         "module.noPush.ignoreSetting.snow",
         "module.noPush.ignoreSetting.berries"
      )
   );
   public static final NoPush noPush = new NoPush();

   public NoPush() {
   }

   @EventTarget
   public void on23(EventPushOutOfBlocks var1) {
      switch (var1.BoatLongJump()) {
         case call132:
            var1.setCancelled(this.modeSetting12.ConfigJsonUtil(2));
            break;
         case call171:
            var1.setCancelled(this.modeSetting12.ConfigJsonUtil(0));
            break;
         case call133:
            var1.setCancelled(this.modeSetting12.ConfigJsonUtil(1));
      }
   }

   @EventTarget
   public void on23(EventEntityCollision var1) {
      Block block = var1.AutoSprint();
      if (block.equals(Blocks.POWDER_SNOW)) {
         var1.setCancelled(this.modeSetting12.ConfigJsonUtil(3));
      } else if (block.equals(Blocks.SWEET_BERRY_BUSH)) {
         var1.setCancelled(this.modeSetting12.ConfigJsonUtil(4));
      }
   }
}
