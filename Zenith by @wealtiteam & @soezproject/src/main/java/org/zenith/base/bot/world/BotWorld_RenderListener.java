package org.zenith.base.bot.world;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import net.minecraft.util.math.BlockPos;

public interface BotWorld_RenderListener {
   void onBlockChanged(BlockPos var1);

   void onChunkChanged(int var1, int var2);

   void onSectionChanged(int var1, int var2, int var3);
}
