package zenith;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.MathHelper;
import net.minecraft.fluid.FluidState;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.RaycastContext.LootTables60;

public final class ZenithInternal088 implements ZenithInternal140 {
   public static BlockHitResult StringHolder_8(double d0, floatHolder_6 il1ll111liili1ll11liil, boolean flag) {
      return StringHolder_8(Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).getCameraPosVec(1.0F), d0, il1ll111liili1ll11liil, flag);
   }

   public static BlockHitResult StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0, floatHolder_6 il1ll111liili1ll11liil, boolean flag) {
      Entity Entity = l11I1I1ll1Illll1I1l1111l1II.cameraEntity;
      if (Entity == null) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
         net.minecraft.util.math.Vec3d Vec3dxx = Vec3d.add(Vec3dx.x * d0, Vec3dx.y * d0, Vec3dx.z * d0);
         ClientWorld ClientWorld = l11I1I1ll1Illll1I1l1111l1II.world;
         if (ClientWorld == null) {
            return null;
         } else {
            net.minecraft.world.RaycastContext.class_242 class_242 = flag ? net.minecraft.world.RaycastContext.class_242.ANY : net.minecraft.world.RaycastContext.class_242.NONE;
            RaycastContext RaycastContext = new RaycastContext(Vec3d, Vec3dxx, LootTables60.OUTLINE, class_242, Entity);
            return ClientWorld.raycast(RaycastContext);
         }
      }
   }

   public static net.minecraft.util.hit.HitResult StringHolder_8(double d0, floatHolder_6 il1ll111liili1ll11liil, float f, boolean flag) {
      net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.cameraEntity.getCameraPosVec(f);
      net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxx.add(Vec3dx.x * d0, Vec3dx.y * d0, Vec3dx.z * d0);
      return l11I1I1ll1Illll1I1l1111l1II.world
         .raycast(
            new RaycastContext(
               Vec3dxx,
               Vec3dxx,
               LootTables60.OUTLINE,
               flag ? net.minecraft.world.RaycastContext.class_242.ANY : net.minecraft.world.RaycastContext.class_242.NONE,
               l11I1I1ll1Illll1I1l1111l1II.cameraEntity
            )
         );
   }

   public static BlockHitResult StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, LootTables60 LootTables60) {
      return StringHolder_8(Vec3d, Vec3dx, LootTables60, l11I1I1ll1Illll1I1l1111l1II.player);
   }

   public static BlockHitResult StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, LootTables60 LootTables60, Entity Entity
   ) {
      return l11I1I1ll1Illll1I1l1111l1II.world
         .raycast(new RaycastContext(Vec3d, Vec3dx, LootTables60, net.minecraft.world.RaycastContext.class_242.NONE, Entity));
   }

   public static boolean StringHolder_8(double d0, floatHolder_6 il1ll111liili1ll11liil, LivingEntity LivingEntity) {
      return StringHolder_8(d0, il1ll111liili1ll11liil, (Predicate<Entity>)(Entity -> Entity == LivingEntity)) != null;
   }

   public static EntityHitResult StringHolder_8(double d0, floatHolder_6 il1ll111liili1ll11liil, Predicate<Entity> predicate) {
      Entity Entity = l11I1I1ll1Illll1I1l1111l1II.cameraEntity;
      if (Entity == null) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d Vec3dxx = Entity.getCameraPosVec(1.0F);
         net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
         net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxx.add(Vec3dx.x * d0, Vec3dx.y * d0, Vec3dx.z * d0);
         net.minecraft.util.math.Box Box = Entity.getBoundingBox().stretch(Vec3dx.multiply(d0)).expand(1.0, 1.0, 1.0);
         return ProjectileUtil.raycast(
            Entity, Vec3dxx, Vec3dxx, Box, Entity -> !Entityx.isSpectator() && predicate.test(Entityx), d0 * d0
         );
      }
   }

   public static boolean StringHolder_8(
      floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, double d0, boolean flag
   ) {
      double d1 = Math.max(l11I1I1ll1Illll1I1l1111l1II.player.getBlockInteractionRange(), d0);
      double d2 = MathHelper.square(d1);
      BlockHitResult BlockHitResult = StringHolder_8(Vec3dxxx, il1ll111liili1ll11liil, d1, Aura.ll1II1l1lII11IlII1::StringHolder_8);
      double d3 = BlockHitResult.getPos().squaredDistanceTo(Vec3dxxx);
      if (flag && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS) {
         d2 = d3;
         d1 = Math.sqrt(d3);
      }

      net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxxx.add(Vec3dx.x * d1, Vec3dx.y * d1, Vec3dx.z * d1);
      net.minecraft.util.math.Vec3d Vec3dxxx = StringHolder_8(Vec3dxxx, Vec3dxx, Box, d2);
      return Vec3dxxx != null && (Vec3dxxx.squaredDistanceTo(Vec3dxxx) < d3 || !flag) && Vec3dxxx.isInRange(Vec3dxxx, d0);
   }

   public static net.minecraft.util.hit.HitResult StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, floatHolder_6 il1ll111liili1ll11liil, double d0) {
      net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      net.minecraft.util.math.Vec3d Vec3dxx = Vec3d.add(Vec3dx.x * d0, Vec3dx.y * d0, Vec3dx.z * d0);
      return l11I1I1ll1Illll1I1l1111l1II.world
         .raycast(
            new RaycastContext(
               Vec3d, Vec3dxx, LootTables60.OUTLINE, net.minecraft.world.RaycastContext.class_242.NONE, l11I1I1ll1Illll1I1l1111l1II.player
            )
         );
   }

   public static net.minecraft.util.math.Vec3d StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, double d0
   ) {
      net.minecraft.util.math.Vec3d Vec3dx = null;
      Optional optional = Box.raycast(Vec3d, Vec3dxxx);
      if (Box.contains(Vec3d)) {
         if (d0 >= 0.0) {
            Vec3dx = optional.orElse(Vec3d);
         }
      } else if (optional.isPresent()) {
         net.minecraft.util.math.Vec3d Vec3dxx = (net.minecraft.util.math.Vec3d)optional.get();
         double d1 = Vec3d.squaredDistanceTo(Vec3dxx);
         if (d1 < d0 || d0 == 0.0) {
            Vec3dx = Vec3dxx;
         }
      }

      return Vec3dx;
   }

   private static net.minecraft.util.hit.HitResult StringHolder_8(net.minecraft.util.hit.HitResult HitResult, net.minecraft.util.math.Vec3d Vec3d, double d0) {
      net.minecraft.util.math.Vec3d Vec3dx = HitResult.getPos();
      if (!Vec3dx.isInRange(Vec3dxx, d0)) {
         net.minecraft.util.math.Vec3d Vec3dxx = HitResult.getPos();
         Direction Direction = Direction.getFacing(
            Vec3dxx.x - Vec3dxx.x, Vec3dxx.y - Vec3dxx.y, Vec3dxx.z - Vec3dxx.z
         );
         return BlockHitResult.createMissed(Vec3dxx, Direction, BlockPos.ofFloored(Vec3dxx));
      } else {
         return HitResult;
      }
   }

   public static boolean StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0, net.minecraft.util.math.Box Box) {
      net.minecraft.util.math.Vec3d Vec3dx = Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).getEyePos();
      return Box.contains(Vec3dx) || Box.raycast(Vec3dx, Vec3dx.add(Vec3d.multiply(d0))).isPresent();
   }

   public static BlockHitResult StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, floatHolder_6 il1ll111liili1ll11liil, double d0, Predicate<BlockHitResult> predicate
   ) {
      net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      net.minecraft.util.math.Vec3d Vec3dxx = Vec3d.add(Vec3dx.x * d0, Vec3dx.y * d0, Vec3dx.z * d0);
      return StringHolder_8(
         new RaycastContext(Vec3d, Vec3dxx, LootTables60.OUTLINE, net.minecraft.world.RaycastContext.class_242.NONE, l11I1I1ll1Illll1I1l1111l1II.player),
         predicate
      );
   }

   public static BlockHitResult StringHolder_8(RaycastContext RaycastContext, Predicate<BlockHitResult> predicate) {
      return (BlockHitResult)BlockView.raycast(
         RaycastContext.getStart(),
         RaycastContext.getEnd(),
         RaycastContext,
         (RaycastContext, BlockPos) -> {
            BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos);
            FluidState FluidState = l11I1I1ll1Illll1I1l1111l1II.world.getFluidState(BlockPos);
            net.minecraft.util.math.Vec3d Vec3dx = RaycastContextx.getStart();
            net.minecraft.util.math.Vec3d Vec3dx = RaycastContextx.getEnd();
            net.minecraft.util.shape.VoxelShape VoxelShapex = RaycastContextx.getBlockShape(BlockState, l11I1I1ll1Illll1I1l1111l1II.world, BlockPos);
            BlockHitResult BlockHitResultx = l11I1I1ll1Illll1I1l1111l1II.world.raycastBlock(Vec3dx, Vec3dx, BlockPos, VoxelShapex, BlockState);
            net.minecraft.util.shape.VoxelShape VoxelShapex = RaycastContextx.getFluidShape(FluidState, l11I1I1ll1Illll1I1l1111l1II.world, BlockPos);
            BlockHitResult BlockHitResultx = VoxelShapex.raycast(Vec3dx, Vec3dx, BlockPos);
            double d0 = BlockHitResultx == null ? Double.MAX_VALUE : RaycastContextx.getStart().squaredDistanceTo(BlockHitResultx.getPos());
            double d1 = BlockHitResultx == null ? Double.MAX_VALUE : RaycastContextx.getStart().squaredDistanceTo(BlockHitResultx.getPos());
            if (!predicate.test(d0 <= d1 ? BlockHitResultx : BlockHitResultx)) {
               return null;
            } else {
               return d0 <= d1 ? BlockHitResultx : BlockHitResultx;
            }
         },
         RaycastContext -> {
            net.minecraft.util.math.Vec3d Vec3d = RaycastContextx.getStart().subtract(RaycastContextx.getEnd());
            return BlockHitResult.createMissed(
               RaycastContextx.getEnd(),
               Direction.getFacing(Vec3d.x, Vec3d.y, Vec3d.z),
               BlockPos.ofFloored(RaycastContextx.getEnd())
            );
         }
      );
   }

   public static BlockHitResult StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, BlockPos BlockPos, net.minecraft.util.shape.VoxelShape VoxelShape, BlockState BlockState
   ) {
      BlockHitResult BlockHitResultx = VoxelShape.raycast(Vec3d, Vec3dx, BlockPos);
      if (BlockHitResultx != null) {
         BlockHitResult BlockHitResultx = BlockState.getRaycastShape(l11I1I1ll1Illll1I1l1111l1II.world, BlockPos).raycast(Vec3d, Vec3dx, BlockPos);
         if (BlockHitResultx != null
            && BlockHitResultx.getPos().subtract(Vec3d).lengthSquared() < BlockHitResultx.getPos().subtract(Vec3d).lengthSquared()) {
            return BlockHitResultx.withSide(BlockHitResultx.getSide());
         }
      }

      return BlockHitResultx;
   }

   private ZenithInternal088() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
