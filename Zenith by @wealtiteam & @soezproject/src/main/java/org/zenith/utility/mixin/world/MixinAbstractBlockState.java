package org.zenith.utility.mixin.world;

import org.zenith.event.EventEntityCollision;

import org.zenith.event.EventEntityCollision;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;













import com.darkmagician6.eventapi.EventManager;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({AbstractBlockState.class})
public abstract class MixinAbstractBlockState {
   public MixinAbstractBlockState() {
   }

   @Shadow
   public abstract Block method_26204();

   @Inject(
      method = {"onEntityCollision"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onEntityCollision(World var1, BlockPos var2, Entity var3, CallbackInfo var4) {
      if (var3 == MinecraftClient.getInstance().player) {
         EventEntityCollision iiil1llll1liili1lilii1l1li1iii = new EventEntityCollision(this.method_26204(), var2);
         EventManager.call(iiil1llll1liili1lilii1l1li1iii);
         if (iiil1llll1liili1lilii1l1li1iii.isCancelled()) {
            var4.cancel();
         }
      }
   }
}
