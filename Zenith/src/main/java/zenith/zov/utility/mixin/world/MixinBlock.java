package zenith.zov.utility.mixin.world;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.EventImpl_11;
import zenith.EventBus;
import zenith.Event;

@Mixin({Block.class})
public class MixinBlock {
   @Inject(
      method = {"onPlaced"},
      at = {@At("HEAD")}
   )
   public void injectPlaced(
      World World, BlockPos BlockPos, BlockState BlockState, LivingEntity LivingEntity, ItemStack ItemStack, CallbackInfo callbackinfo
   ) {
      if (MinecraftClient.getInstance().player == LivingEntity) {
         EventImpl_11 iililil11ii1i = new EventImpl_11(BlockPos, BlockState);
         EventBus.StringHolder_8((Event)iililil11ii1i);
      }
   }
}
