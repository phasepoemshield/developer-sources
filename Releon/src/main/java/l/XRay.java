package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class XRay extends Helper242 {
   private final Set<BlockPos> orePositions = ConcurrentHashMap.newKeySet();
   private final Set<Block> targetBlocks = new HashSet<>();
   private long lastScanTime = 0L;
   private final Setting8 blockTypeSetting = new Setting8("Блоки", "Выбор блоков для XRay")
      .method2585("Diamond", "Emerald", "Iron", "Gold", "Coal", "Redstone", "Lapis", "Copper", "Ancient Debris", "Netherite", "Quartz", "Amethyst");
   private final Setting2 radiusFinder = new Setting2("Дистанция поиска", "Диапазон поиска").method2086(16.0F).method2078(8.0F, 64.0F);
   private final Setting2 scanDelay = new Setting2("Задержка сканирования", "Задержка в секундах").method2086(5.0F).method2078(1.0F, 30.0F);

   public XRay() {
      super("XRay", Helper269.RENDER);
      this.setup(new Helper264[]{this.blockTypeSetting, this.radiusFinder, this.scanDelay});
   }

   @Override
   public void activate() {
      this.method2814();
      this.method2815();
      mc.worldRenderer.reload();
   }

   @Override
   public void deactivate() {
      this.orePositions.clear();
      mc.worldRenderer.reload();
   }

   @Helper104
   public void method2813(Event10 var1) {
      if (mc.world != null && mc.player != null) {
         this.method2814();
         long var2 = System.currentTimeMillis();
         if ((float)(var2 - this.lastScanTime) > this.scanDelay.method2082() * 1000.0F) {
            this.method2815();
            this.lastScanTime = var2;
         }

         double var4 = this.radiusFinder.method2082() * this.radiusFinder.method2082();
         BlockPos var6 = mc.player.getBlockPos();
         int var7 = 0;

         for (BlockPos var9 : this.orePositions) {
            if (!(var6.getSquaredDistance(var9) > var4)) {
               BlockState var10 = mc.world.getBlockState(var9);
               if (this.targetBlocks.contains(var10.getBlock())) {
                  int var11 = this.method2816(var10.getBlock());
                  if (var11 != -1) {
                     Helper183.method1545(new Box(var9), var11, 2.0F);
                     var7++;
                  }
               }
            }
         }
      }
   }

   private void method2814() {
      this.targetBlocks.clear();
      if (this.blockTypeSetting.method2588("Diamond")) {
         Collections.addAll(this.targetBlocks, Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DIAMOND_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Emerald")) {
         Collections.addAll(this.targetBlocks, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.EMERALD_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Iron")) {
         Collections.addAll(this.targetBlocks, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.IRON_BLOCK, Blocks.RAW_IRON_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Gold")) {
         Collections.addAll(this.targetBlocks, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.NETHER_GOLD_ORE, Blocks.GOLD_BLOCK, Blocks.RAW_GOLD_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Coal")) {
         Collections.addAll(this.targetBlocks, Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE, Blocks.COAL_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Redstone")) {
         Collections.addAll(this.targetBlocks, Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.REDSTONE_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Lapis")) {
         Collections.addAll(this.targetBlocks, Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.LAPIS_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Copper")) {
         Collections.addAll(this.targetBlocks, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.COPPER_BLOCK, Blocks.RAW_COPPER_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Ancient Debris")) {
         this.targetBlocks.add(Blocks.ANCIENT_DEBRIS);
      }

      if (this.blockTypeSetting.method2588("Netherite")) {
         this.targetBlocks.add(Blocks.NETHERITE_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Quartz")) {
         Collections.addAll(this.targetBlocks, Blocks.NETHER_QUARTZ_ORE, Blocks.QUARTZ_BLOCK);
      }

      if (this.blockTypeSetting.method2588("Amethyst")) {
         Collections.addAll(
            this.targetBlocks, Blocks.AMETHYST_CLUSTER, Blocks.LARGE_AMETHYST_BUD, Blocks.MEDIUM_AMETHYST_BUD, Blocks.SMALL_AMETHYST_BUD, Blocks.AMETHYST_BLOCK
         );
      }
   }

   private void method2815() {
      this.orePositions.clear();
      if (mc.world != null) {
         int var1 = this.radiusFinder.method2080();
         BlockPos var2 = mc.player.getBlockPos();
         int var3 = 0;

         for (int var4 = -var1; var4 <= var1; var4++) {
            for (int var5 = -var1; var5 <= var1; var5++) {
               for (int var6 = -var1; var6 <= var1; var6++) {
                  BlockPos var7 = var2.add(var4, var5, var6);
                  if (mc.world.isInBuildLimit(var7)) {
                     BlockState var8 = mc.world.getBlockState(var7);
                     if (this.targetBlocks.contains(var8.getBlock())) {
                        this.orePositions.add(var7.toImmutable());
                        var3++;
                     }
                  }
               }
            }
         }
      }
   }

   private int method2816(Block var1) {
      if (var1 == Blocks.DIAMOND_ORE || var1 == Blocks.DEEPSLATE_DIAMOND_ORE || var1 == Blocks.DIAMOND_BLOCK) {
         return -15107199;
      } else if (var1 == Blocks.EMERALD_ORE || var1 == Blocks.DEEPSLATE_EMERALD_ORE || var1 == Blocks.EMERALD_BLOCK) {
         return -12482789;
      } else if (var1 == Blocks.IRON_ORE || var1 == Blocks.DEEPSLATE_IRON_ORE || var1 == Blocks.IRON_BLOCK || var1 == Blocks.RAW_IRON_BLOCK) {
         return -9090017;
      } else if (var1 == Blocks.GOLD_ORE
         || var1 == Blocks.DEEPSLATE_GOLD_ORE
         || var1 == Blocks.NETHER_GOLD_ORE
         || var1 == Blocks.GOLD_BLOCK
         || var1 == Blocks.RAW_GOLD_BLOCK) {
         return -3819208;
      } else if (var1 == Blocks.COAL_ORE || var1 == Blocks.DEEPSLATE_COAL_ORE || var1 == Blocks.COAL_BLOCK) {
         return -15527149;
      } else if (var1 == Blocks.REDSTONE_ORE || var1 == Blocks.DEEPSLATE_REDSTONE_ORE || var1 == Blocks.REDSTONE_BLOCK) {
         return -7667712;
      } else if (var1 == Blocks.LAPIS_ORE || var1 == Blocks.DEEPSLATE_LAPIS_ORE || var1 == Blocks.LAPIS_BLOCK) {
         return -15910005;
      } else if (var1 == Blocks.COPPER_ORE || var1 == Blocks.DEEPSLATE_COPPER_ORE || var1 == Blocks.COPPER_BLOCK || var1 == Blocks.RAW_COPPER_BLOCK) {
         return -4954035;
      } else if (var1 == Blocks.ANCIENT_DEBRIS) {
         return -5868204;
      } else if (var1 == Blocks.NETHERITE_BLOCK) {
         return -11776948;
      } else if (var1 == Blocks.NETHER_QUARTZ_ORE || var1 == Blocks.QUARTZ_BLOCK) {
         return -1846076;
      } else {
         return var1 != Blocks.AMETHYST_CLUSTER
               && var1 != Blocks.LARGE_AMETHYST_BUD
               && var1 != Blocks.MEDIUM_AMETHYST_BUD
               && var1 != Blocks.SMALL_AMETHYST_BUD
               && var1 != Blocks.AMETHYST_BLOCK
            ? -1
            : -6596170;
      }
   }
}
