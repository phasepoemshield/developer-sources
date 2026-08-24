package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.NameProtect;
import org.zenith.module.NoFriendDamage;

import org.zenith.module.NameProtect;
import org.zenith.module.NoFriendDamage;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;


import com.darkmagician6.eventapi.events.Event;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class EventInjectPlaced implements Event {
   public final BlockPos pos;
   public final BlockState state;

   public EventInjectPlaced(BlockPos var1, BlockState var2) {
      this.pos = var1;
      this.state = var2;
   }

   public BlockState NoFriendDamage() {
      return this.state;
   }

   public BlockPos NameProtect() {
      return this.pos;
   }
}
