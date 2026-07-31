package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.AttackAura;
import ru.metaculture.protection.FakePlayer;
import ru.metaculture.protection.NoInteract;
import ru.metaculture.protection.WildClient;

@Environment(EnvType.CLIENT)
@Mixin({ClientPlayerInteractionManager.class})
public abstract class ClientPlayerInteractionManagerMixin {
   @Inject(
      method = {"interactBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void noInteract(
      ClientPlayerEntity clientPlayerEntity, Hand hand, BlockHitResult blockHitResult, CallbackInfoReturnable<ActionResult> callbackInfoReturnable
   ) {
      if (clientPlayerEntity != null) {
         NoInteract var5 = (NoInteract)WildClient.O00000000.O000000000.O000000000(NoInteract.class);
         if (var5 != null && var5.O0000000000000) {
            if (AttackAura.O00000000OO0 == null) {
               ClientWorld var6 = clientPlayerEntity.clientWorld;
               if (var6 != null) {
                  Block var7 = var6.getBlockState(blockHitResult.getBlockPos()).getBlock();
                  if (NoInteract.O0000000000O0().contains(var7)) {
                     callbackInfoReturnable.setReturnValue(ActionResult.FAIL);
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"interactEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void noInteractEntity(PlayerEntity playerEntity, Entity entity, Hand hand, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
      if (FakePlayer.O000000000(entity)) {
         callbackInfoReturnable.setReturnValue(ActionResult.SUCCESS);
      } else if (entity instanceof ArmorStandEntity) {
         NoInteract var5 = (NoInteract)WildClient.O00000000.O000000000.O000000000(NoInteract.class);
         if (var5 != null && var5.O0000000000000) {
            if (NoInteract.O000000000O.O00000000(0)) {
               callbackInfoReturnable.setReturnValue(ActionResult.FAIL);
            }
         }
      }
   }

   @Inject(
      method = {"interactEntityAtLocation"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void fakePlayerInteractAtLocation(
      PlayerEntity playerEntity, Entity entity, EntityHitResult entityHitResult, Hand hand, CallbackInfoReturnable<ActionResult> callbackInfoReturnable
   ) {
      if (FakePlayer.O000000000(entity)) {
         callbackInfoReturnable.setReturnValue(ActionResult.SUCCESS);
      }
   }
}
