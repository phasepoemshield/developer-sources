package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.FriendCommand;
import ru.metaculture.protection.HitBox;
import ru.metaculture.protection.NoPush;
import ru.metaculture.protection.WildClient;

@Environment(EnvType.CLIENT)
@Mixin({Entity.class})
public abstract class EntityMixin {
   @Inject(
      method = {"getTargetingMargin"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void client$getTargetingMargin(CallbackInfoReturnable<Float> callbackInfoReturnable) {
      Entity var2 = (Entity)(Object)this;
      if (var2 instanceof PlayerEntity) {
         HitBox var3 = (HitBox)WildClient.O00000000.O000000000.O000000000(HitBox.class);
         if (var3 != null && var3.O0000000000000) {
            if (HitBox.O000000000O.O000000000("Обычный")) {
               if (!(HitBox.O000000000O00.O0000000000() && var2 instanceof PlayerEntity var4) || !FriendCommand.O00000000(var4.getName().getString())) {
                  float var6 = (Float)callbackInfoReturnable.getReturnValue();
                  float var5 = HitBox.O000000000O0.O0000000000();
                  callbackInfoReturnable.setReturnValue(var6 + var5);
               }
            }
         }
      }
   }

   @Inject(
      method = {"pushAwayFrom"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPushAwayFrom(Entity entity, CallbackInfo callbackInfo) {
      Entity var3 = (Entity)(Object)this;
      if (var3 instanceof ClientPlayerEntity) {
         if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            NoPush var4 = (NoPush)WildClient.O00000000.O000000000.O000000000(NoPush.class);
            if (var4 != null && var4.O0000000000000) {
               if (entity instanceof PlayerEntity && var4.O000000000O.O0000000000()) {
                  callbackInfo.cancel();
               } else if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity) && var4.O000000000O0.O0000000000()) {
                  callbackInfo.cancel();
               }
            }
         }
      }
   }
}
