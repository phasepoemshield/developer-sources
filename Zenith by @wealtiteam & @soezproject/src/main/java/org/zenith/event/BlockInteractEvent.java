package org.zenith.event;

import org.zenith.event.Event18;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.WaypointData;


import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class BlockInteractEvent extends Event18 {
   public final BlockPos pos;
   public final Direction side;

   public BlockInteractEvent(BlockPos var1, Direction var2) {
      this.pos = var1;
      this.side = var2;
   }

   public BlockPos WaypointData() {
      return this.pos;
   }
}
