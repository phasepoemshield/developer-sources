package org.zenith.base.bot.view;

import org.zenith.module.Bot;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;














import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gl.VertexBuffer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.ChunkSectionPos;

final class BotWorldView_Section {
   final long pos;
   final Map<RenderLayer, VertexBuffer> buffers = new HashMap<>();
   List<BlockEntity> blockEntities = List.of();
   boolean building;

   BotWorldView_Section(long var1) {
      this.pos = var1;
   }

   int originX() {
      return ChunkSectionPos.unpackX(this.pos) << 4;
   }

   int originY() {
      return ChunkSectionPos.unpackY(this.pos) << 4;
   }

   int originZ() {
      return ChunkSectionPos.unpackZ(this.pos) << 4;
   }

   double squaredDistanceTo(double var1, double var3, double var5) {
      double d0 = (double)this.originX() + 8.0 - var1;
      double d1 = (double)this.originY() + 8.0 - var3;
      double d2 = (double)this.originZ() + 8.0 - var5;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   void closeBuffers() {
      for (VertexBuffer vertexbuffer : this.buffers.values()) {
         vertexbuffer.close();
      }

      this.buffers.clear();
      this.blockEntities = List.of();
   }
}
