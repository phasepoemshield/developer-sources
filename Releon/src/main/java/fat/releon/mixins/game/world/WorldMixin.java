package fat.releon.mixins.game.world;

import l.Helper124;
import l.Helper160;
import l.Helper403;
import l.Event23;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({World.class})
public abstract class WorldMixin implements Helper160 {
   public WorldMixin() {
   }

   @Inject(
      method = {"onBlockChanged"},
      at = {@At("RETURN")}
   )
   private void onBlockChangedHook(BlockPos var1, BlockState var2, BlockState var3, CallbackInfo var4) {
      if (mc.world == (Object)this) {
         Helper124.method1026(new Event23(var3, var1.toImmutable(), Helper403.UPDATE));
      }
   }
}
