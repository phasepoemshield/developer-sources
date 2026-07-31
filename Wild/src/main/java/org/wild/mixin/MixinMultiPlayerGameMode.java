package org.wild.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.FakePlayer;
import ru.metaculture.protection.FriendCommand;
import ru.metaculture.protection.FriendManager;
import ru.metaculture.protection.O0000000O0O0OO;
import ru.metaculture.protection.WildClient;

@Mixin({ClientPlayerInteractionManager.class})
public class MixinMultiPlayerGameMode {
   @Inject(
      method = {"attackEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAttack(PlayerEntity playerEntity, Entity entity, CallbackInfo callbackInfo) {
      O0000000O0O0OO var4 = new O0000000O0O0OO(entity);
      EventManager.O00000000((Event)var4);
      if (var4.O00000000()) {
         callbackInfo.cancel();
      } else if (FakePlayer.O00000000(entity)) {
         callbackInfo.cancel();
      } else {
         if (entity instanceof PlayerEntity) {
            String var5 = entity.getName().getString();
            FriendManager var6 = WildClient.O00000000.O000000000.O00000000(FriendManager.class);
            if (var6 != null && var6.O0000000000000 && FriendManager.O000000000O0.O0000000000() && FriendCommand.O00000000(var5)) {
               callbackInfo.cancel();
            }
         }
      }
   }
}
