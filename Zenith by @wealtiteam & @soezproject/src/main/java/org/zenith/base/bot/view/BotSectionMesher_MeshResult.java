package org.zenith.base.bot.view;

import org.zenith.module.Bot;




import java.util.List;
import net.minecraft.block.entity.BlockEntity;

record BotSectionMesher_MeshResult(long sectionPos, List<BotSectionMesher_LayerMesh> layers, List<BlockEntity> blockEntities, boolean chunkMissing) {
}
