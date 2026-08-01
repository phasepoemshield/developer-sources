package zenith;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.util.hit.BlockHitResult;

@ModuleInfo(
   name = "ClanUpgrade",
   category = Category.PLAYER,
   description = "Автоматическое улучшение клана"
)
public final class Clanupgrade extends Module {
   public static final Clanupgrade II11ll1I = new Clanupgrade();
   private static final float ll1ll1I1lIIII11IlI11l1lIIllll = 90.0F;
   private static final float IIIl1Il11l1Il111 = 0.0F;
   private float l1I1IllI11III11llIlIl1Ill = 0.0F;
   private float ll1I1111lII11llI = 0.0F;
   private boolean II1llI11Il1lI1l11I111IllllI111 = false;

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getStackInHand(Hand.MAIN_HAND);
         if (ItemStack.getItem() != Items.REDSTONE) {
            TextHolder.floatHolder_11("Возьмите редстоун в руку!");
         } else {
            BlockPos BlockPos = l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos();
            BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos);
            if (!this.II1llI11Il1lI1l11I111IllllI111) {
               this.l1I1IllI11III11llIlIl1Ill = l11I1I1ll1Illll1I1l1111l1II.player.getPitch();
               this.ll1I1111lII11llI = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
               this.II1llI11Il1lI1l11I111IllllI111 = true;
            }

            l11I1I1ll1Illll1I1l1111l1II.player.setPitch(90.0F);
            l11I1I1ll1Illll1I1l1111l1II.player.setYaw(0.0F);
            if (BlockState.isAir()) {
               this.SocketFactoryHolder_3(BlockPos);
            } else if (BlockState.getBlock() == Blocks.REDSTONE_WIRE) {
               this.SocketFactoryHolder_2(BlockPos);
            }
         }
      }
   }

   private void SocketFactoryHolder_3(BlockPos BlockPos) {
      BlockPos BlockPosx = BlockPosx.down();
      BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosx);
      if (BlockState.isSolid()) {
         net.minecraft.util.math.Vec3d Vec3d = new net.minecraft.util.math.Vec3d(
            (double)BlockPosx.getX() + 0.5, (double)BlockPosx.getY() + 1.0, (double)BlockPosx.getZ() + 0.5
         );
         BlockHitResult BlockHitResult = new BlockHitResult(Vec3d, Direction.UP, BlockPosx, false);
         l11I1I1ll1Illll1I1l1111l1II.interactionManager.interactBlock(l11I1I1ll1Illll1I1l1111l1II.player, Hand.MAIN_HAND, BlockHitResult);
         l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private void SocketFactoryHolder_2(BlockPos BlockPos) {
      l11I1I1ll1Illll1I1l1111l1II.interactionManager.attackBlock(BlockPos, Direction.UP);
      l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.MAIN_HAND);
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      if (this.II1llI11Il1lI1l11I111IllllI111 && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         l11I1I1ll1Illll1I1l1111l1II.player.setPitch(this.l1I1IllI11III11llIlIl1Ill);
         l11I1I1ll1Illll1I1l1111l1II.player.setYaw(this.ll1I1111lII11llI);
         this.II1llI11Il1lI1l11I111IllllI111 = false;
      }
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.II1llI11Il1lI1l11I111IllllI111 = false;
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         this.l1I1IllI11III11llIlIl1Ill = l11I1I1ll1Illll1I1l1111l1II.player.getPitch();
         this.ll1I1111lII11llI = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
      }
   }
}
