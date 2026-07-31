package zenith.zov.utility.mixin.world;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.AbstractBlock.StructureBlockScreen1;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.BlockHolder;
import zenith.EventBus;
import zenith.Event;

@Mixin({StructureBlockScreen1.class})
public abstract class MixinAbstractBlockState {
   @Shadow
   public abstract Block getBlock();

   @Inject(
      method = {"onEntityCollision"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onEntityCollision(World World, BlockPos BlockPos, Entity Entity, CallbackInfo callbackinfo) {
      if (Entity == MinecraftClient.getInstance().player) {
         BlockHolder illl1ilili1il11ll11 = new BlockHolder(this.getBlock(), BlockPos);
         EventBus.StringHolder_8((Event)illl1ilili1il11ll11);
         if (illl1ilili1il11ll11.Event()) {
            callbackinfo.cancel();
         }
      }
   }
}
