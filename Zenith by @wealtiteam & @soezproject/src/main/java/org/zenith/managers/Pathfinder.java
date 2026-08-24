package org.zenith.managers;

import org.zenith.event.EventTriggerKeyEvent;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.ZenithClient;

import org.zenith.event.EventInteractBlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;

public final class Pathfinder {
   public static final double double145 = Math.sqrt(2.0);
   public static final int[][] val520 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
   public static final int[][] val521 = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
   public static MinecraftClient minecraftClient3 = MinecraftClient.getInstance();

   public Pathfinder() {
   }

   public static Optional<Pathfinder_Var7> ItemRegistry(BlockPos var0, BlockPos var1) {
      return minecraftClient3.world == null
         ? Optional.empty()
         : on23(minecraftClient3.world, var0, var1, Pathfinder_Var165.zClass073Var1652);
   }

   public static Optional<Pathfinder_Var7> on23(BlockPos var0, BlockPos var1, Pathfinder_Var165 var2) {
      return minecraftClient3.world == null ? Optional.empty() : on23(minecraftClient3.world, var0, var1, var2);
   }

   public static Optional<Pathfinder_Var7> on23(World var0, BlockPos var1, BlockPos var2, Pathfinder_Var165 var3) {
      if (var0 != null && var1 != null && var2 != null && var3 != null) {
         BlockPos blockpos = var1.toImmutable();
         BlockPos blockpos1 = var2.toImmutable();
         boolean flag = var0.isChunkLoaded(blockpos1.getX() >> 4, blockpos1.getZ() >> 4);
         if (!UiAnimation(var0, blockpos)
            && !UiAnimation(var0, blockpos1)
            && var0.isChunkLoaded(blockpos.getX() >> 4, blockpos.getZ() >> 4)
            && (var3.double162() != Pathfinder_Var143.val197 || flag)) {
            BlockPos blockpos2 = Easing(var0, blockpos, var3.double160());
            BlockPos blockpos3 = var3.double159() == 0 && flag ? Easing(var0, blockpos1, var3.double160()) : blockpos1;
            if (blockpos3 == null && var3.double162() == Pathfinder_Var143.val317) {
               blockpos3 = blockpos1;
            }

            if (blockpos2 == null || blockpos3 == null) {
               return Optional.empty();
            } else if (on23(blockpos2, blockpos3, var3.double159())) {
               return Optional.of(new Pathfinder_Var7(List.of(blockpos2)));
            } else {
               var hashmap = new HashMap();
               PriorityQueue priorityqueue = new PriorityQueue<>(
                  Comparator.comparingDouble(Pathfinder_Var160::double163).thenComparingLong(Pathfinder_Var160::double164)
               );
               Pathfinder_Var159 l1liiliiiil1i_ii1il11l111ii11iilxxx = new Pathfinder_Var159(
                  blockpos2, null, 0.0, UiAnimation(blockpos2, blockpos3, var3.double159())
               );
               Pathfinder_Var159 l1liiliiiil1i_ii1il11l111ii11iilx = l1liiliiiil1i_ii1il11l111ii11iilxxx;
               hashmap.put(blockpos2, l1liiliiiil1i_ii1il11l111ii11iilxxx);
               long i = 0L;
               priorityqueue.add(new Pathfinder_Var160(l1liiliiiil1i_ii1il11l111ii11iilxxx, l1liiliiiil1i_ii1il11l111ii11iilxxx.double50, i++));
               int j = 0;

               while (!priorityqueue.isEmpty() && j < var3.float139()) {
                  Pathfinder_Var160 l1liiliiiil1i_Var160 = (Pathfinder_Var160)priorityqueue.poll();
                  Pathfinder_Var159 l1liiliiiil1i_ii1il11l111ii11iilxx = l1liiliiiil1i_Var160.int465();
                  if (!l1liiliiiil1i_ii1il11l111ii11iilxx.closed
                     && l1liiliiiil1i_Var160.double163() == l1liiliiiil1i_ii1il11l111ii11iilxx.double50) {
                     l1liiliiiil1i_ii1il11l111ii11iilxx.closed = true;
                     j++;
                     if (on23(l1liiliiiil1i_ii1il11l111ii11iilxx, l1liiliiiil1i_ii1il11l111ii11iilx)) {
                        l1liiliiiil1i_ii1il11l111ii11iilx = l1liiliiiil1i_ii1il11l111ii11iilxx;
                     }

                     if (on23(l1liiliiiil1i_ii1il11l111ii11iilxx.blockPos26, blockpos3, var3.double159())) {
                        return Optional.of(new Pathfinder_Var7(on23(l1liiliiiil1i_ii1il11l111ii11iilxx)));
                     }

                     for (Pathfinder_Var134 l1liiliiiil1i_l1iil11li : UiAnimation(
                        var0, l1liiliiiil1i_ii1il11l111ii11iilxx.blockPos26, blockpos2, var3
                     )) {
                        l1liiliiiil1i_ii1il11l111ii11iilxxx = (Pathfinder_Var159)hashmap.get(
                           l1liiliiiil1i_l1iil11li.zClass095Var165()
                        );
                        double d0 = l1liiliiiil1i_ii1il11l111ii11iilxx.double49 + l1liiliiiil1i_l1iil11li.call031();
                        if (l1liiliiiil1i_ii1il11l111ii11iilxxx == null || !(d0 >= l1liiliiiil1i_ii1il11l111ii11iilxxx.double49)) {
                           if (l1liiliiiil1i_ii1il11l111ii11iilxxx == null) {
                              l1liiliiiil1i_ii1il11l111ii11iilxxx = new Pathfinder_Var159(
                                 l1liiliiiil1i_l1iil11li.zClass095Var165(),
                                 l1liiliiiil1i_ii1il11l111ii11iilxx,
                                 d0,
                                 UiAnimation(l1liiliiiil1i_l1iil11li.zClass095Var165(), blockpos3, var3.double159())
                              );
                              hashmap.put(l1liiliiiil1i_l1iil11li.zClass095Var165(), l1liiliiiil1i_ii1il11l111ii11iilxxx);
                           } else {
                              l1liiliiiil1i_ii1il11l111ii11iilxxx.zClass073Var159 = l1liiliiiil1i_ii1il11l111ii11iilxx;
                              l1liiliiiil1i_ii1il11l111ii11iilxxx.double49 = d0;
                              l1liiliiiil1i_ii1il11l111ii11iilxxx.double50 = d0 + l1liiliiiil1i_ii1il11l111ii11iilxxx.double48;
                              l1liiliiiil1i_ii1il11l111ii11iilxxx.closed = false;
                           }

                           if (on23(l1liiliiiil1i_ii1il11l111ii11iilxxx, l1liiliiiil1i_ii1il11l111ii11iilx)) {
                              l1liiliiiil1i_ii1il11l111ii11iilx = l1liiliiiil1i_ii1il11l111ii11iilxxx;
                           }

                           priorityqueue.add(
                              new Pathfinder_Var160(l1liiliiiil1i_ii1il11l111ii11iilxxx, l1liiliiiil1i_ii1il11l111ii11iilxxx.double50, i++)
                           );
                        }
                     }
                  }
               }

               return var3.double162() == Pathfinder_Var143.val317
                  ? Optional.of(new Pathfinder_Var7(on23(l1liiliiiil1i_ii1il11l111ii11iilx)))
                  : Optional.empty();
            }
         } else {
            return Optional.empty();
         }
      } else {
         return Optional.empty();
      }
   }

   public static BlockPos ItemSpec(BlockPos var0, BlockPos var1) {
      return ItemRegistry(var0, var1).map(var1x -> var1x.EventTriggerKeyEvent(var0)).orElse(null);
   }

   public static Vec3d EventInteractBlock(BlockPos var0) {
      return new Vec3d((double)var0.getX() + 0.5, (double)var0.getY() + 0.15, (double)var0.getZ() + 0.5);
   }

   public static boolean on23(World var0, BlockPos var1, boolean var2) {
      return var0 != null
         && var1 != null
         && !UiAnimation(var0, var1)
         && var0.isChunkLoaded(var1.getX() >> 4, var1.getZ() >> 4)
         && UiAnimation(var0, var1, var2);
   }

   public static List<Pathfinder_Var134> UiAnimation(World var0, BlockPos var1, BlockPos var2, Pathfinder_Var165 var3) {
      List<Pathfinder_Var134> arraylist = new ArrayList<>(var3.double161() ? 8 : 4);
      on23(var0, var1, var2, var3, val520, arraylist);
      if (var3.double161()) {
         on23(var0, var1, var2, var3, val521, arraylist);
      }

      return arraylist;
   }

   public static void on23(
      World var0, BlockPos var1, BlockPos var2, Pathfinder_Var165 var3, int[][] var4, List<Pathfinder_Var134> var5
   ) {
      for (int[] aint : var4) {
         int i = aint[0];
         int j = aint[1];
         boolean flag = i != 0 && j != 0;
         double d0 = flag ? double145 : 1.0;
         if (!flag || on23(var0, var1, i, j, var3.double160())) {
            BlockPos blockpos = var1.add(i, 0, j);
            if (Easing(var0, blockpos, var2, var3) && UiAnimation(var0, blockpos, var3.double160())) {
               var5.add(new Pathfinder_Var134(blockpos.toImmutable(), d0));
            } else {
               BlockPos blockpos1 = var1.add(i, 1, j);
               if (Easing(var0, blockpos1, var2, var3)
                  && ColorAnimator(var0, var1.up(2), var3.double160())
                  && UiAnimation(var0, blockpos1, var3.double160())) {
                  var5.add(new Pathfinder_Var134(blockpos1.toImmutable(), d0 + 0.65));
               } else if (ColorAnimator(var0, blockpos, var3.double160()) && ColorAnimator(var0, blockpos.up(), var3.double160())) {
                  for (int k = 1; k <= var3.float141(); k++) {
                     BlockPos blockpos2 = var1.add(i, -k, j);
                     if (!Easing(var0, blockpos2, var2, var3)) {
                        break;
                     }

                     if (UiAnimation(var0, blockpos2, var3.double160())) {
                        var5.add(new Pathfinder_Var134(blockpos2.toImmutable(), d0 + 0.2 + (double)k * 0.15));
                        break;
                     }

                     if (!ColorAnimator(var0, blockpos2, var3.double160())) {
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   public static boolean Easing(World var0, BlockPos var1, BlockPos var2, Pathfinder_Var165 var3) {
      if (!UiAnimation(var0, var1) && var0.isChunkLoaded(var1.getX() >> 4, var1.getZ() >> 4)) {
         int i = var1.getX() - var2.getX();
         int j = var1.getZ() - var2.getZ();
         return Math.max(Math.abs(i), Math.abs(j)) <= var3.float140();
      } else {
         return false;
      }
   }

   public static boolean on23(World var0, BlockPos var1, int var2, int var3, boolean var4) {
      BlockPos blockpos = var1.add(var2, 0, 0);
      BlockPos blockpos1 = var1.add(0, 0, var3);
      return ColorAnimator(var0, blockpos, var4)
         && ColorAnimator(var0, blockpos.up(), var4)
         && ColorAnimator(var0, blockpos1, var4)
         && ColorAnimator(var0, blockpos1.up(), var4);
   }

   public static boolean UiAnimation(World var0, BlockPos var1, boolean var2) {
      if (!ColorAnimator(var0, var1, var2) || !ColorAnimator(var0, var1.up(), var2)) {
         return false;
      } else if (var2 && !var0.getFluidState(var1).isEmpty()) {
         return true;
      } else {
         BlockPos blockpos = var1.down();
         BlockState blockstate = var0.getBlockState(blockpos);
         if (ItemRegistry(blockstate)) {
            return false;
         } else {
            VoxelShape voxelshape = blockstate.getCollisionShape(var0, blockpos);
            if (voxelshape.isEmpty()) {
               return false;
            } else {
               double d0 = voxelshape.getMax(Axis.Y);
               return d0 >= 0.499 && d0 <= 1.001;
            }
         }
      }
   }

   public static BlockPos Easing(World var0, BlockPos var1, boolean var2) {
      if (UiAnimation(var0, var1, var2)) {
         return var1.toImmutable();
      } else {
         BlockPos blockpos = var1.up();
         return !UiAnimation(var0, blockpos) && UiAnimation(var0, blockpos, var2) ? blockpos.toImmutable() : null;
      }
   }

   public static boolean ColorAnimator(World var0, BlockPos var1, boolean var2) {
      BlockState blockstate = var0.getBlockState(var1);
      if (!ItemRegistry(blockstate) && blockstate.getCollisionShape(var0, var1).isEmpty()) {
         FluidState fluidstate = blockstate.getFluidState();
         return fluidstate.isEmpty() || var2;
      } else {
         return false;
      }
   }

   public static boolean ItemRegistry(BlockState var0) {
      return var0.isOf(Blocks.LAVA)
         || var0.isOf(Blocks.FIRE)
         || var0.isOf(Blocks.SOUL_FIRE)
         || var0.isOf(Blocks.CACTUS)
         || var0.isOf(Blocks.MAGMA_BLOCK)
         || var0.isOf(Blocks.CAMPFIRE)
         || var0.isOf(Blocks.SOUL_CAMPFIRE)
         || var0.isOf(Blocks.SWEET_BERRY_BUSH)
         || var0.isOf(Blocks.COBWEB)
         || var0.isOf(Blocks.POWDER_SNOW);
   }

   public static boolean UiAnimation(World var0, BlockPos var1) {
      return var1.getY() < var0.getBottomY() || var1.getY() > var0.getTopYInclusive() - 1;
   }

   public static boolean on23(BlockPos var0, BlockPos var1, int var2) {
      return var0.getX() == var1.getX() && var0.getZ() == var1.getZ() && Math.abs(var0.getY() - var1.getY()) <= var2;
   }

   public static double UiAnimation(BlockPos var0, BlockPos var1, int var2) {
      int i = Math.abs(var0.getX() - var1.getX());
      int j = Math.abs(var0.getZ() - var1.getZ());
      int k = Math.min(i, j);
      int l = Math.max(i, j) - k;
      int i1 = var1.getY() - var0.getY();
      int j1 = Math.max(0, Math.abs(i1) - var2);
      double d0 = i1 > 0 ? (double)j1 * 0.65 : (double)j1 * 0.15;
      return (double)k * double145 + (double)l + d0;
   }

   public static boolean on23(Pathfinder_Var159 var0, Pathfinder_Var159 var1) {
      int i = Double.compare(var0.double48, var1.double48);
      return i < 0 || i == 0 && var0.double49 < var1.double49;
   }

   public static List<BlockPos> on23(Pathfinder_Var159 var0) {
      List<BlockPos> arraylist = new ArrayList<>();

      for (Pathfinder_Var159 l1liiliiiil1i_ii1il11l111ii11iil = var0;
         l1liiliiiil1i_ii1il11l111ii11iil != null;
         l1liiliiiil1i_ii1il11l111ii11iil = l1liiliiiil1i_ii1il11l111ii11iil.zClass073Var159
      ) {
         arraylist.add(l1liiliiiil1i_ii1il11l111ii11iil.blockPos26);
      }

      Collections.reverse(arraylist);
      return arraylist;
   }
}
