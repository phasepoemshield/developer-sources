package fat.releon.mixins.game.block;

import l.Helper124;
import l.Helper160;
import l.Helper388;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({AbstractBlockState.class})
public abstract class AbstractBlockStateMixin implements Helper160 {
   public AbstractBlockStateMixin() {
   }

   @Shadow
   public abstract Block getBlock();

   @Inject(
      method = {"onEntityCollision"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onEntityCollision(World var1, BlockPos var2, Entity var3, CallbackInfo var4) {
      if (var3 == mc.player) {
         Helper388 var5 = new Helper388(this.getBlock());
         Helper124.method1026(var5);
         if (var5.method581()) {
            var4.cancel();
         }
      }
   }
}
