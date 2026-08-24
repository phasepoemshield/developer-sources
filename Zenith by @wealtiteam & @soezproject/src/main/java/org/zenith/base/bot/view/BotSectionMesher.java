package org.zenith.base.bot.view;

import org.zenith.module.Bot;

import org.zenith.base.bot.world.BotWorld;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;














import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.chunk.WorldChunk;

final class BotSectionMesher {
   public BotSectionMesher() {
   }

   static BotSectionMesher_MeshResult build(BotWorld var0, long var1) {
      int i = ChunkSectionPos.unpackX(var1);
      int j = ChunkSectionPos.unpackY(var1);
      int k = ChunkSectionPos.unpackZ(var1);
      WorldChunk worldchunk = var0.getChunkManager().getChunk(i, k, null, false);
      if (worldchunk == null) {
         return new BotSectionMesher_MeshResult(var1, List.of(), List.of(), true);
      } else {
         int l = var0.sectionCoordToIndex(j);
         if (l >= 0 && l < worldchunk.getSectionArray().length && !worldchunk.getSectionArray()[l].isEmpty()) {
            BlockRenderManager blockrendermanager = MinecraftClient.getInstance().getBlockRenderManager();
            BlockPos blockpos = new BlockPos(i << 4, j << 4, k << 4);
            BlockPos blockpos1 = blockpos.add(15, 15, 15);
            Map<RenderLayer, BufferBuilder> hashmap = new HashMap<>();
            Map<RenderLayer, BufferAllocator> hashmap1 = new HashMap<>();
            List<BlockEntity> arraylist = new ArrayList<>();
            MatrixStack matrixstack = new MatrixStack();
            Random random = Random.create();
            BlockModelRenderer.enableBrightnessCache();

            try {
               for (BlockPos blockpos2 : BlockPos.iterate(blockpos, blockpos1)) {
                  BlockState blockstate = var0.getBlockState(blockpos2);
                  if (!blockstate.isAir()) {
                     if (blockstate.hasBlockEntity()) {
                        BlockEntity blockentity = var0.getBlockEntity(blockpos2);
                        if (blockentity != null) {
                           arraylist.add(blockentity);
                        }
                     }

                     FluidState fluidstate = blockstate.getFluidState();
                     if (!fluidstate.isEmpty()) {
                        RenderLayer renderlayer = RenderLayers.getFluidLayer(fluidstate);
                        BufferBuilder bufferbuilder = beginLayer(hashmap, hashmap1, renderlayer);
                        blockrendermanager.renderFluid(blockpos2, var0, bufferbuilder, blockstate, fluidstate);
                     }

                     if (blockstate.getRenderType() == BlockRenderType.MODEL) {
                        RenderLayer renderlayer1 = RenderLayers.getBlockLayer(blockstate);
                        BufferBuilder bufferbuilder1 = beginLayer(hashmap, hashmap1, renderlayer1);
                        matrixstack.push();
                        matrixstack.translate((float)(blockpos2.getX() & 15), (float)(blockpos2.getY() & 15), (float)(blockpos2.getZ() & 15));
                        blockrendermanager.renderBlock(blockstate, blockpos2, var0, matrixstack, bufferbuilder1, true, random);
                        matrixstack.pop();
                     }
                  }
               }
            } finally {
               BlockModelRenderer.disableBrightnessCache();
            }

            List<BotSectionMesher_LayerMesh> arraylist1 = new ArrayList<>(hashmap.size());

            for (Map.Entry<RenderLayer, BufferBuilder> entry : hashmap.entrySet()) {
               BuiltBuffer builtbuffer = entry.getValue().endNullable();
               BufferAllocator bufferallocator = hashmap1.get(entry.getKey());
               if (builtbuffer != null) {
                  arraylist1.add(new BotSectionMesher_LayerMesh(entry.getKey(), builtbuffer, bufferallocator));
               } else {
                  bufferallocator.close();
               }
            }

            return new BotSectionMesher_MeshResult(var1, arraylist1, arraylist, false);
         } else {
            return new BotSectionMesher_MeshResult(var1, List.of(), List.of(), false);
         }
      }
   }

   public static BufferBuilder beginLayer(Map<RenderLayer, BufferBuilder> var0, Map<RenderLayer, BufferAllocator> var1, RenderLayer var2) {
      BufferBuilder bufferbuilder = var0.get(var2);
      if (bufferbuilder == null) {
         BufferAllocator bufferallocator = new BufferAllocator(var2.getExpectedBufferSize());
         var1.put(var2, bufferallocator);
         bufferbuilder = new BufferBuilder(bufferallocator, DrawMode.QUADS, VertexFormats.POSITION_COLOR_TEXTURE_LIGHT_NORMAL);
         var0.put(var2, bufferbuilder);
      }

      return bufferbuilder;
   }
}
