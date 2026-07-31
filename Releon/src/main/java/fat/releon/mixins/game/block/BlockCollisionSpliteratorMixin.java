package fat.releon.mixins.game.block;

import l.Helper124;
import l.Event25;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockCollisionSpliterator;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({BlockCollisionSpliterator.class})
public abstract class BlockCollisionSpliteratorMixin {
   public BlockCollisionSpliteratorMixin() {
   }

   @Redirect(
      method = {"computeNext"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/BlockView;getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockState;"
      )
   )
   private BlockState computeNext(BlockView var1, BlockPos var2) {
      Event25 var3 = new Event25(var2, var1.getBlockState(var2));
      Helper124.method1026(var3);
      return var3.method4140();
   }
}
