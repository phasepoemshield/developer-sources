package fat.releon.mixins.game.block;

import l.Helper124;
import l.Helper412;
import l.Event29;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BlockEntity.class})
public class BlockEntityMixin {
   public BlockEntityMixin() {
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   public void initHook(BlockEntityType<?> var1, BlockPos var2, BlockState var3, CallbackInfo var4) {
      BlockEntity var5 = (BlockEntity)(Object)this;
      if (var5 != null) {
         Helper124.method1026(new Event29(var5, Helper412.ADD));
      }
   }

   @Inject(
      method = {"markRemoved"},
      at = {@At("HEAD")}
   )
   private void markRemovedHook(CallbackInfo var1) {
      BlockEntity var2 = (BlockEntity)(Object)this;
      if (var2 != null) {
         Helper124.method1026(new Event29(var2, Helper412.REMOVE));
      }
   }
}
