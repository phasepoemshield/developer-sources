package zenith;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import net.minecraft.world.World;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.hit.BlockHitResult;

public final class ZenithInternal001 {
   public static final int lll1ll11lI11lIIIl11lI = 63;
   public static final int IIl1l1IlIl = 81;
   public static final int IIIllllllll11lIllll1III1lIIl = 93;
   public static final int I1l1111IlllI = 101;
   public static final int IIIIlIlIl1I1l1IllI1l1lI1l = 16;
   public static final int llI1III11 = 34;
   private static final Set<Block> l1I1Il111l1l1 = Set.of(
      Blocks.COAL_ORE,
      Blocks.DEEPSLATE_COAL_ORE,
      Blocks.IRON_ORE,
      Blocks.DEEPSLATE_IRON_ORE,
      Blocks.COPPER_ORE,
      Blocks.DEEPSLATE_COPPER_ORE,
      Blocks.GOLD_ORE,
      Blocks.DEEPSLATE_GOLD_ORE,
      Blocks.REDSTONE_ORE,
      Blocks.DEEPSLATE_REDSTONE_ORE,
      Blocks.EMERALD_ORE,
      Blocks.DEEPSLATE_EMERALD_ORE,
      Blocks.LAPIS_ORE,
      Blocks.DEEPSLATE_LAPIS_ORE,
      Blocks.DIAMOND_ORE,
      Blocks.DEEPSLATE_DIAMOND_ORE,
      Blocks.NETHER_GOLD_ORE,
      Blocks.NETHER_QUARTZ_ORE,
      Blocks.ANCIENT_DEBRIS
   );

   private ZenithInternal001() {
   }

   public static boolean Event(Block Block) {
      return l1I1Il111l1l1.contains(Block);
   }

   public static boolean ZenithInternal086(BlockPos BlockPos) {
      return BlockPos.getX() >= 63
         && BlockPos.getX() <= 81
         && BlockPos.getY() >= 93
         && BlockPos.getY() <= 101
         && BlockPos.getZ() >= 16
         && BlockPos.getZ() <= 34;
   }

   public static boolean ZenithInternal084(net.minecraft.util.math.Vec3d Vec3d) {
      return Vec3d.x >= 63.0 && Vec3d.x <= 82.0 && Vec3d.z >= 16.0 && Vec3d.z <= 35.0;
   }

   public static boolean StringHolder_13(BlockPos BlockPos) {
      return BlockPos.getX() >= 63
         && BlockPos.getX() <= 81
         && BlockPos.getY() >= 90
         && BlockPos.getY() <= 104
         && BlockPos.getZ() >= 16
         && BlockPos.getZ() <= 34;
   }

   public static boolean EventBus(World World) {
      byte b0 = 59;
      byte b1 = 85;
      byte b2 = 12;
      byte b3 = 38;
      byte b4 = 72;
      byte b5 = 25;
      return World.isChunkLoaded(new BlockPos(b0, 93, b2))
         && World.isChunkLoaded(new BlockPos(b0, 93, b3))
         && World.isChunkLoaded(new BlockPos(b1, 93, b2))
         && World.isChunkLoaded(new BlockPos(b1, 93, b3))
         && World.isChunkLoaded(new BlockPos(b4, 93, b5));
   }

   public static double Event(net.minecraft.util.math.Vec3d Vec3d, BlockPos BlockPos) {
      double d0 = Math.max((double)BlockPos.getX(), Math.min((double)BlockPos.getX() + 1.0, Vec3d.x));
      double d1 = Math.max((double)BlockPos.getY(), Math.min((double)BlockPos.getY() + 1.0, Vec3d.y));
      double d2 = Math.max((double)BlockPos.getZ(), Math.min((double)BlockPos.getZ() + 1.0, Vec3d.z));
      return Vec3d.squaredDistanceTo(d0, d1, d2);
   }

   public static BlockHitResult StringHolder_8(BlockPos BlockPos, double d0, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = BlockPos.toCenterPos();
      double d1 = 0.49;
      net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[]{
         Vec3dx,
         Vec3dx.add(d1, 0.0, 0.0),
         Vec3dx.add(-d1, 0.0, 0.0),
         Vec3dx.add(0.0, d1, 0.0),
         Vec3dx.add(0.0, -d1, 0.0),
         Vec3dx.add(0.0, 0.0, d1),
         Vec3dx.add(0.0, 0.0, -d1)
      };

      for (net.minecraft.util.math.Vec3d Vec3dxx : aVec3d) {
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dxx, d0, floatHolder_6.EventImpl_21(Vec3dxx, Vec3dxx), false);
         if (BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS && BlockHitResult.getBlockPos().equals(BlockPos)) {
            return BlockHitResult;
         }
      }

      return null;
   }

   static boolean StringHolder_8(BlockPos BlockPos, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, double d0) {
      net.minecraft.util.math.Vec3d Vec3dx = BlockPos.toCenterPos().subtract(Vec3dxx);
      double d1 = Vec3dx.x * Vec3dx.x + Vec3dx.z * Vec3dx.z;
      return d1 > 0.0 && d1 <= d0 + 0.75 && StringHolder_8(BlockPos, Vec3dxx, Vec3dx) <= 1.2;
   }

   static boolean EventBus(BlockPos BlockPos, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, double d0) {
      net.minecraft.util.math.Vec3d Vec3dx = BlockPos.toCenterPos().subtract(Vec3dxx);
      double d1 = Vec3dx.x * Vec3dx.x + Vec3dx.z * Vec3dx.z;
      return d1 > -0.35 && d1 <= Math.min(d0 + 0.75, 4.25) && StringHolder_8(BlockPos, Vec3dxx, Vec3dx) <= 2.25;
   }

   public static BlockPos StringHolder_8(
      BlockPos BlockPos, List<BlockPos> list, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d
   ) {
      net.minecraft.util.math.Vec3d Vec3dx = BlockPos.toCenterPos();
      net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
         Vec3dx.x - Vec3dxxx.x, 0.0, Vec3dx.z - Vec3dxxx.z
      );
      double d0 = Vec3dxx.lengthSquared();
      if (d0 < 0.01) {
         return null;
      } else {
         double d1 = Math.sqrt(d0);
         net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxx.multiply(1.0 / d1);
         return list.stream()
            .filter(BlockPos -> !BlockPosxx.equals(BlockPos))
            .filter(BlockPos -> EventBus(BlockPosx, Vec3dxxx, Vec3d, d1))
            .min(
               Comparator.<BlockPos>comparingDouble(BlockPos -> Event(Vec3dxxxx, BlockPosx))
                  .thenComparingDouble(BlockPos -> StringHolder_8(BlockPosx, Vec3dxxx, Vec3d))
            )
            .orElse(null);
      }
   }

   public static BlockPos StringHolder_8(
      BlockPos BlockPos, List<BlockPos> list, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i
   ) {
      if (BlockPos.getY() != i) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d Vec3dx = BlockPos.toCenterPos();
         net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
            Vec3dx.x - Vec3dxxx.x, 0.0, Vec3dx.z - Vec3dxxx.z
         );
         double d0 = Vec3dxx.lengthSquared();
         if (d0 < 0.01) {
            return null;
         } else {
            double d1 = Math.sqrt(d0);
            net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxx.multiply(1.0 / d1);
            return list.stream()
               .filter(BlockPos -> BlockPosxx.getY() == BlockPos.getY())
               .filter(BlockPos -> StringHolder_8(BlockPosx, Vec3dxxx, Vec3d, d1))
               .min(
                  Comparator.<BlockPos>comparingDouble(BlockPos -> StringHolder_8(BlockPosx, Vec3dxxx, Vec3d))
                     .thenComparingDouble(BlockPos -> Event(Vec3dxxxx, BlockPosx))
               )
               .orElse(null);
         }
      }
   }

   static double StringHolder_8(BlockPos BlockPos, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = BlockPos.toCenterPos().subtract(Vec3dxx);
      double d0 = Vec3dx.x * Vec3dx.x + Vec3dx.z * Vec3dx.z;
      double d1 = Vec3dxx.x + Vec3dx.x * d0;
      double d2 = Vec3dxx.z + Vec3dx.z * d0;
      double d3 = (double)BlockPos.getX() + 0.5 - d1;
      double d4 = (double)BlockPos.getZ() + 0.5 - d2;
      return d3 * d3 + d4 * d4;
   }
}
