package org.zenith.base.bot.world;

import org.zenith.module.Bot;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import net.minecraft.block.BlockState;
import net.minecraft.util.math.Vec3d;

final class BotPendingUpdateManager_PendingUpdate {
   final Vec3d playerPos;
   int sequence;
   BlockState blockState;

   BotPendingUpdateManager_PendingUpdate(int var1, BlockState var2, Vec3d var3) {
      this.sequence = var1;
      this.blockState = var2;
      this.playerPos = var3;
   }

   BotPendingUpdateManager_PendingUpdate withSequence(int var1) {
      this.sequence = var1;
      return this;
   }

   void setBlockState(BlockState var1) {
      this.blockState = var1;
   }
}
