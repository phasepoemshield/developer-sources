package org.zenith.utility.mixin.client_core;

import org.zenith.core.ColorAnimator;
import org.zenith.event.Event18Ext2;
import org.zenith.module.AutoZamok;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;














import baritone.pathing.movement.MovementHelper;
import baritone.pathing.precompute.Ternary;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {MovementHelper.class},
   remap = false
)
public interface MixinBaritoneMovementHelper {
   @Inject(
      method = {"a(Lnet/minecraft/block/BlockState;)Lbaritone/pathing/precompute/Ternary;"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private static void zenith_walkThroughWeb(BlockState var0, CallbackInfoReturnable<Ternary> var1) {
      if (var0.getBlock() == Blocks.COBWEB && zenith_isAutoZamokEnabled()) {
         var1.setReturnValue(Ternary.a);
      }
   }

   @Inject(
      method = {"b(Lnet/minecraft/block/BlockState;)Z"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private static void zenith_walkIntoWeb(BlockState var0, CallbackInfoReturnable<Boolean> var1) {
      if (var0.getBlock() == Blocks.COBWEB && zenith_isAutoZamokEnabled()) {
         var1.setReturnValue(false);
      }
   }

   @Unique
   private static boolean zenith_isAutoZamokEnabled() {
      Module lii1lll1l1li1ii1iiillii = ZenithClient.on23().ColorAnimator().Event18Ext2("AutoZamok");
      return lii1lll1l1li1ii1iiillii != null && lii1lll1l1li1ii1iiillii.isEnabled();
   }
}
