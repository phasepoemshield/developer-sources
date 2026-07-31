package zenith;

import it.unimi.dsi.fastutil.ints.IntPredicate;
import java.util.stream.Stream;
import net.minecraft.util.Hand;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.hit.BlockHitResult;

@ModuleInfo(
   name = "Spider",
   category = Category.MOVEMENT,
   description = ""
)
public final class Spider extends Module {
   public static final Spider II11IIIl11ll1lIIl1IIIIII = new Spider();

   private Spider() {
   }

   @EventTarget
   public void EventImpl_24(EventImpl_30 ll1iil11ii) {
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().getItem() instanceof BlockItem;
      int i = ListHolder_5.StringHolder_8(
         (IntPredicate)(j -> l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j).getItem() instanceof BlockItem)
      );
      BlockPos BlockPos = this.IIII1l1ll1lll1l();
      if ((flag || i != -1) && !BlockPos.equals(BlockPos.ORIGIN)) {
         net.minecraft.util.math.Vec3d Vec3d = BlockPos.toCenterPos().add(0.0, 0.0, 0.0);
         Direction Direction = Direction.getFacing(
            Vec3d.x - l11I1I1ll1Illll1I1l1111l1II.player.getX(),
            Vec3d.y - l11I1I1ll1Illll1I1l1111l1II.player.getY(),
            Vec3d.z - l11I1I1ll1Illll1I1l1111l1II.player.getZ()
         );
         floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
            l11I1I1ll1Illll1I1l1111l1II.player.getYaw(),
            ZenithInternal131.longHolder_6(Vec3d.subtract(new net.minecraft.util.math.Vec3d(Direction.getVector()).multiply(0.5)))
               .Basefinder()
         );
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               il1ll111liili1ll11liil,
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
            ),
            1,
            this,
            2
         );
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_20 l11il1i1iil1lll111l1111llliil) {
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().getItem() instanceof BlockItem;
      int i = ListHolder_5.StringHolder_8(
         (IntPredicate)(k -> l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(k).getItem() instanceof BlockItem)
      );
      BlockPos BlockPos = this.IIII1l1ll1lll1l();
      if ((flag || i != -1) && !BlockPos.equals(BlockPos.ORIGIN)) {
         ItemStack ItemStack = flag
            ? l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack()
            : l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i);
         Hand Hand = flag ? Hand.OFF_HAND : Hand.MAIN_HAND;
         if (this.StringHolder_4(ItemStack) && l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof BlockHitResult BlockHitResult) {
            int j = l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot;
            if (!flag) {
               l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot = i;
            }

            ZenithInternal066.StringHolder_8(BlockHitResult, Hand);
            if (!flag) {
               l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot = j;
            }
         }
      }
   }

   private boolean StringHolder_4(ItemStack ItemStack) {
      BlockPos BlockPos = this.StringHolder_2();
      BlockItem BlockItem = (BlockItem)ItemStack.getItem();
      net.minecraft.util.shape.VoxelShape VoxelShape = BlockItem.getBlock().getDefaultState().getCollisionShape(l11I1I1ll1Illll1I1l1111l1II.world, BlockPos);
      if (VoxelShape.isEmpty()) {
         return false;
      } else {
         net.minecraft.util.math.Box Box = VoxelShape.getBoundingBox().offset(BlockPos);
         return !Box.intersects(l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox())
            && Box.intersects(PlayerEntityHolder.FileHolder_2(2).IlIIll1l1lllll1I);
      }
   }

   private BlockPos IIII1l1ll1lll1l() {
      BlockPos BlockPos = this.StringHolder_2();
      return l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).isSolid()
         ? BlockPos.ORIGIN
         : Stream.of(BlockPos.west(), BlockPos.east(), BlockPos.south(), BlockPos.north())
            .filter(BlockPos -> l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosx).isSolid())
            .findFirst()
            .orElse(BlockPos.ORIGIN);
   }

   private BlockPos StringHolder_2() {
      return BlockPos.ofFloored(PlayerEntityHolder.FileHolder_2(1).l1l111I11I1I.add(0.0, -0.001, 0.0));
   }
}
