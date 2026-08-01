package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AncientXray",
   O0000000000 = Category.Visuals,
   O000000000 = "Поиск обломков после взрыва ТНТ",
   O00000000000 = {O0000000OO0OOO.VIP}
)
public class AncientXray extends Module {
   private final Set<BlockPos> O000000000O = ConcurrentHashMap.newKeySet();
   private final Set<BlockPos> O000000000O0 = ConcurrentHashMap.newKeySet();
   private final List<AncientXray.W131> O000000000O00 = new ArrayList<>();
   private static final int O000000000O000 = 28;
   private static final int[] O000000000O00O = new int[]{4, 10, 20, 40};
   private long O000000000O0O = 0L;
   private static final int O000000000O0O0 = 4096;
   private static final RenderPipeline O000000000O0OO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "block_esp_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000000OO = RenderLayer.of(
      "block_esp_box", 4096, false, true, O000000000O0OO, MultiPhaseParameters.builder().build(false)
   );

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000O.clear();
      this.O000000000O0.clear();
      this.O000000000O00.clear();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         this.O0000000000O0();
      }
   }

   public void O0000000000O0() {
      if (O0000000000.player != null && O0000000000.world != null) {
         Iterator var1 = this.O000000000O00.iterator();

         while (var1.hasNext()) {
            AncientXray.W131 var2 = (AncientXray.W131)var1.next();
            var2.O000000000--;
            if (var2.O000000000 <= 0) {
               this.O000000000(var2.O00000000, 28);
               var1.remove();
            }
         }

         if (System.currentTimeMillis() - this.O000000000O0O > 50L) {
            for (BlockPos var3 : this.O000000000O) {
               if (!this.O000000000O0.contains(var3)) {
                  this.O000000000O0.add(var3);
                  this.O00000000000(var3);
                  this.O000000000O0O = System.currentTimeMillis();
                  break;
               }
            }
         }
      }
   }

   public void O0000000000O00() {
      this.O000000000O.clear();
      this.O000000000O0.clear();
      this.O000000000O00.clear();
   }

   public void O00000000(BlockPos blockPos, int i) {
      if (blockPos != null) {
         this.O000000000O00.add(new AncientXray.W131(blockPos.toImmutable(), i));
      }
   }

   public void O00000000(BlockPos blockPos, Block block) {
      this.O000000000(blockPos, block);
   }

   public List<BlockPos> O0000000000O0O() {
      return new ArrayList<>(this.O000000000O);
   }

   public void O00000000(BlockPos blockPos) {
      this.O000000000O.remove(blockPos);
      this.O000000000O0.remove(blockPos);
   }

   public boolean O000000000(BlockPos blockPos) {
      return this.O000000000O.contains(blockPos);
   }

   public boolean O0000000000(BlockPos blockPos) {
      return this.O000000000000(blockPos);
   }

   private void O00000000000(BlockPos blockPos) {
      if (O0000000000.getNetworkHandler() != null) {
         O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, blockPos, Direction.UP));
         O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, blockPos, Direction.UP));
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.world != null) {
         if (o0000000O000OO.O00000000000() instanceof ExplosionS2CPacket var2) {
            BlockPos var10 = BlockPos.ofFloored(var2.center());

            for (int var9 : O000000000O00O) {
               this.O00000000(var10, var9);
            }
         } else if (o0000000O000OO.O00000000000() instanceof BlockUpdateS2CPacket var3) {
            this.O000000000(var3.getPos(), var3.getState().getBlock());
         } else if (o0000000O000OO.O00000000000() instanceof ChunkDeltaUpdateS2CPacket var4) {
            var4.visitUpdates((blockPos, blockState) -> this.O000000000(blockPos, blockState.getBlock()));
         }
      }
   }

   private void O000000000(BlockPos blockPos, Block block) {
      BlockPos var3 = blockPos.toImmutable();
      if (block == Blocks.ANCIENT_DEBRIS) {
         if (this.O000000000000(var3) && this.O000000000O.add(var3)) {
            ChatUtil.O00000000("§6[AncientXray] §fОбломок найден §e" + var3.toShortString());
         }
      } else {
         this.O000000000O.remove(var3);
         this.O000000000O0.remove(var3);
      }
   }

   private void O000000000(BlockPos blockPos, int i) {
      if (O0000000000.world != null) {
         Mutable var3 = new Mutable();

         for (int var4 = -i; var4 <= i; var4++) {
            for (int var5 = -i; var5 <= i; var5++) {
               for (int var6 = -i; var6 <= i; var6++) {
                  var3.set(blockPos.getX() + var4, blockPos.getY() + var5, blockPos.getZ() + var6);
                  if (this.O000000000000(var3)) {
                     BlockPos var7 = var3.toImmutable();
                     if (this.O000000000O.add(var7)) {
                        ChatUtil.O00000000("§fОбнаружен обломок: §e" + var7.toShortString());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean O000000000000(BlockPos blockPos) {
      if (O0000000000.world == null) {
         return false;
      } else {
         Block var2 = O0000000000.world.getBlockState(blockPos).getBlock();
         return var2 == Blocks.ANCIENT_DEBRIS
            && this.O0000000000000(blockPos)
            && !this.O000000000000O(blockPos)
            && this.O00000000000O(blockPos)
            && !this.O00000000000O0(blockPos);
      }
   }

   private boolean O0000000000000(BlockPos blockPos) {
      int var2 = 0;

      for (Direction var6 : Direction.values()) {
         Block var7 = O0000000000.world.getBlockState(blockPos.offset(var6)).getBlock();
         if (var7 == Blocks.AIR || var7 == Blocks.LAVA || var7 == Blocks.CAVE_AIR) {
            if (++var2 >= 2) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean O000000000000O(BlockPos blockPos) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               Block var6 = O0000000000.world.getBlockState(blockPos.add(var3, var4, var5)).getBlock();
               if (var6 == Blocks.NETHER_QUARTZ_ORE || var6 == Blocks.NETHER_GOLD_ORE) {
                  if (++var2 >= 4) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean O00000000000O(BlockPos blockPos) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               Block var6 = O0000000000.world.getBlockState(blockPos.add(var3, var4, var5)).getBlock();
               if (var6 == Blocks.AIR || var6 == Blocks.LAVA || var6 == Blocks.CAVE_AIR) {
                  if (++var2 >= 4) {
                     return true;
                  }
               }
            }
         }
      }

      return var2 >= 4;
   }

   private boolean O00000000000O0(BlockPos blockPos) {
      int var2 = 0;

      for (int var3 = -3; var3 <= 2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -2; var5 <= 3; var5++) {
               if (O0000000000.world.getBlockState(blockPos.add(var3, var4, var5)).getBlock() == Blocks.ANCIENT_DEBRIS) {
                  if (++var2 > 6) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null && !this.O000000000O.isEmpty()) {
         Immediate var2 = O0000O00O0O00.O00000000();

         try {
            Vec3d var3 = O0000000000.gameRenderer.getCamera().getPos();
            Matrix4f var4 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
            int var5 = -2147418368;
            VertexConsumer var6 = var2.getBuffer(O000000000OO);

            for (BlockPos var8 : this.O000000000O) {
               if (!O0000000000.world.getBlockState(var8).isOf(Blocks.ANCIENT_DEBRIS)) {
                  this.O000000000O.remove(var8);
               } else {
                  float var9 = (float)(var8.getX() - var3.x);
                  float var10 = (float)(var8.getY() - var3.y);
                  float var11 = (float)(var8.getZ() - var3.z);
                  float var12 = var9 + 1.0F;
                  float var13 = var10 + 1.0F;
                  float var14 = var11 + 1.0F;
                  O00000OO00OOO0$W226$W227.O00000000(var6, var4, var9, var10, var11, var12, var13, var14, var5);
               }
            }
         } finally {
            O0000O00O0O00.O000000000();
         }
      }
   }

   static class W131 {
      BlockPos O00000000;
      int O000000000;

      W131(BlockPos blockPos, int i) {
         this.O00000000 = blockPos;
         this.O000000000 = i;
      }
   }
}
