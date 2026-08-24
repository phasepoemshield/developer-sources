package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.AutoSprint;
import org.zenith.module.NameProtect;

import org.zenith.module.AutoSprint;
import org.zenith.event.Event18;
import org.zenith.module.NameProtect;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;



import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class Event18Ext5 extends Event18 {
   public final Block block;
   public final BlockPos blockPos22;

   public Event18Ext5(Block var1, BlockPos var2) {
      this.block = var1;
      this.blockPos22 = var2;
   }

   public Block AutoSprint() {
      return this.block;
   }

   public BlockPos NameProtect() {
      return this.blockPos22;
   }
}
