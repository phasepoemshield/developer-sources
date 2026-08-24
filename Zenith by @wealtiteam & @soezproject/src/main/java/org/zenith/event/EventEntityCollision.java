package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.AutoSprint;
import org.zenith.module.BoatHighJump;

import org.zenith.module.AutoSprint;
import org.zenith.module.BoatHighJump;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;


import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class EventEntityCollision extends EventCancellable {
   public final Block block;
   public final BlockPos pos;

   public EventEntityCollision(Block var1, BlockPos var2) {
      this.block = var1;
      this.pos = var2;
   }

   public Block AutoSprint() {
      return this.block;
   }

   public BlockPos BoatHighJump() {
      return this.pos;
   }
}
