package l;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.chunk.WorldChunk;

public class BlockEspHelper extends Helper242 {
   Setting7 color = new Setting7("Цвет", "Цвет подсветки блоков").method2550(Helper133.method1148(255, 0, 0, 255));
   Setting2 range = new Setting2("Радиус", "Радиус поиска блоков").method2079(1, 128).method2086(32.0F);
   Setting3 notifyInChat = new Setting3("Уведомления", "Показывать координаты найденных блоков в чате").method2201(false);
   Set<String> blocksToHighlight = new CopyOnWriteArraySet<>();
   Map<BlockPos, BlockState> renderBlocks = new HashMap<>();
   Set<BlockPos> notifiedBlocks = new CopyOnWriteArraySet<>();
   long lastScanTime = 0L;
   int checkCounter = 0;

   public BlockEspHelper() {
      super("BlockESP", "Block ESP", Helper269.RENDER);
      this.setup(new Helper264[]{this.color, this.range, this.notifyInChat});
   }

   public static BlockEspHelper method2008() {
      return Helper222.method1979(BlockEspHelper.class);
   }

   public Set<String> getBlocksToHighlight() {
      return this.blocksToHighlight;
   }

   @Override
   public void activate() {
      super.activate();
      this.notifiedBlocks.clear();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.renderBlocks.clear();
      this.notifiedBlocks.clear();
   }

   @Helper104
   public void method2009(Event10 var1) {
      if (!this.state || mc.world == null || mc.player == null) {
         this.renderBlocks.clear();
      } else if (this.blocksToHighlight.isEmpty()) {
         this.renderBlocks.clear();
      } else {
         BlockPos var2 = mc.player.getBlockPos();
         long var3 = System.nanoTime() / 1000000L;
         if (var3 - this.lastScanTime >= 2000L) {
            this.renderBlocks.clear();
            byte var5 = 2;
            byte var6 = 48;

            for (int var7 = -var5; var7 <= var5; var7++) {
               for (int var8 = -var5; var8 <= var5; var8++) {
                  int var9 = (var2.getX() >> 4) + var7;
                  int var10 = (var2.getZ() >> 4) + var8;
                  if (mc.world.getChunkManager().isChunkLoaded(var9, var10)) {
                     WorldChunk var11 = mc.world.getChunkManager().getWorldChunk(var9, var10);
                     if (var11 != null) {
                        int var12 = var11.getPos().x << 4;
                        int var13 = var11.getPos().z << 4;

                        for (int var14 = 0; var14 < 16; var14++) {
                           for (int var15 = 0; var15 < 16; var15++) {
                              int var16 = Math.max(mc.world.getBottomY(), var2.getY() - var6);
                              int var17 = Math.min(mc.world.getTopY(Type.WORLD_SURFACE, var12 + var14, var13 + var15), var2.getY() + var6);

                              for (int var18 = var16; var18 <= var17; var18++) {
                                 BlockPos var19 = new BlockPos(var12 + var14, var18, var13 + var15);
                                 double var20 = mc.player.squaredDistanceTo(var19.getX() + 0.5, var19.getY() + 0.5, var19.getZ() + 0.5);
                                 if (!(var20 > this.range.method2082() * this.range.method2082())) {
                                    Block var22 = mc.world.getBlockState(var19).getBlock();
                                    String var23 = Registries.BLOCK.getId(var22).toString();
                                    if (this.blocksToHighlight.contains(var23)) {
                                       this.renderBlocks.put(var19.toImmutable(), mc.world.getBlockState(var19));
                                       if (this.notifyInChat.method2200() && !this.notifiedBlocks.contains(var19)) {
                                          this.notifiedBlocks.add(var19);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            this.lastScanTime = var3;
            this.checkCounter = 0;
         }

         if (this.checkCounter % 5 == 0) {
            byte var24 = 1;

            for (int var25 = -var24; var25 <= var24; var25++) {
               for (int var26 = -var24; var26 <= var24; var26++) {
                  int var27 = (var2.getX() >> 4) + var25;
                  int var28 = (var2.getZ() >> 4) + var26;
                  if (mc.world.getChunkManager().isChunkLoaded(var27, var28)) {
                     WorldChunk var29 = mc.world.getChunkManager().getWorldChunk(var27, var28);
                     if (var29 != null) {
                        int var30 = var29.getPos().x << 4;
                        int var31 = var29.getPos().z << 4;

                        for (int var32 = 0; var32 < 16; var32++) {
                           for (int var33 = 0; var33 < 16; var33++) {
                              int var34 = Math.max(mc.world.getBottomY(), var2.getY() - 24);
                              int var35 = Math.min(mc.world.getTopY(Type.WORLD_SURFACE, var30 + var32, var31 + var33), var2.getY() + 24);

                              for (int var36 = var34; var36 <= var35; var36++) {
                                 BlockPos var37 = new BlockPos(var30 + var32, var36, var31 + var33);
                                 double var38 = mc.player.squaredDistanceTo(var37.getX() + 0.5, var37.getY() + 0.5, var37.getZ() + 0.5);
                                 if (!(var38 > 16.0)) {
                                    Block var21 = mc.world.getBlockState(var37).getBlock();
                                    String var39 = Registries.BLOCK.getId(var21).toString();
                                    if (this.blocksToHighlight.contains(var39) && !this.renderBlocks.containsKey(var37)) {
                                       this.renderBlocks.put(var37.toImmutable(), mc.world.getBlockState(var37));
                                       if (this.notifyInChat.method2200() && !this.notifiedBlocks.contains(var37)) {
                                          this.notifiedBlocks.add(var37);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (this.checkCounter % 60 == 0) {
            this.renderBlocks.entrySet().removeIf(var1x -> {
               BlockPos var2x = var1x.getKey();
               Block var3x = mc.world.getBlockState(var2x).getBlock();
               String var4 = Registries.BLOCK.getId(var3x).toString();
               boolean var5x = !this.blocksToHighlight.contains(var4);
               if (var5x) {
                  this.notifiedBlocks.remove(var2x);
               }

               return var5x;
            });
         }

         this.checkCounter++;
         this.renderBlocks.forEach((var1x, var2x) -> Helper183.method1545(new Box(var1x), this.color.method2553(), 1.0F));
      }
   }

   private String method2010(BlockState var1) {
      return var1.getBlock().asItem().toString().replace("minecraft:", "").replace("_ore", "").replace("_", " ");
   }
}
