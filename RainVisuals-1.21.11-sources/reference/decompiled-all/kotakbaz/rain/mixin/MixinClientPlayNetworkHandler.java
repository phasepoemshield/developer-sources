package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.اإ;
import oxxxde.خِ;
import oxxxde.دإ;
import oxxxde.دش;
import oxxxde.رظ;
import oxxxde.رك;
import oxxxde.شء;
import oxxxde.صص;
import oxxxde.ظظ;

// $VF: Compiled from MixinClientPlayNetworkHandler.java
@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {
   @Unique
   private static final ThreadLocal<Boolean> RAIN_SKIP_COMMAND_REWRITE = ThreadLocal.withInitial(() -> false);
   @Unique
   private static final ThreadLocal<Boolean> RAIN_SKIP_MESSAGE_REWRITE = ThreadLocal.withInitial(() -> false);

   @Inject(method = "method_11124", at = @At("TAIL"))
   private void rain$onExplosion(ExplosionS2CPacket ci, CallbackInfo packet) {
      اإ.INSTANCE.handleExplosion(packet);
   }

   @Inject(method = "method_11148", at = @At("TAIL"))
   private void rain$onEntityStatus(EntityStatusS2CPacket ci, CallbackInfo packet) {
      if (packet.getStatus() == 35) {
         MinecraftClient client = MinecraftClient.getInstance();
         if (client.world != null) {
            if (packet.getEntity(client.world) instanceof PlayerEntity player) {
               رظ.INSTANCE.post(new رك(player));
            }
         }
      }
   }

   @Inject(method = "method_45730", at = @At("HEAD"), cancellable = true)
   private void rain$onSendChatCommand(String ci, CallbackInfo command) {
      if (RAIN_SKIP_COMMAND_REWRITE.get()) {
         RAIN_SKIP_COMMAND_REWRITE.set(false);
      } else {
         String content = "/" + command;
         دش event = new دش(content, true);
         رظ.INSTANCE.post(event);
         if (event.getCancel()) {
            ci.cancel();
         } else {
            String updatedMessage = event.getText();
            if (!content.equals(updatedMessage)) {
               ci.cancel();
               ClientPlayNetworkHandler self = (ClientPlayNetworkHandler)this;
               if (updatedMessage.startsWith("/")) {
                  RAIN_SKIP_COMMAND_REWRITE.set(true);
                  self.sendChatCommand(updatedMessage.substring(1));
               } else {
                  RAIN_SKIP_MESSAGE_REWRITE.set(true);
                  self.sendChatMessage(updatedMessage);
               }
            }
         }
      }
   }

   @Inject(method = "method_11157", at = @At("HEAD"))
   private void rain$unloadInventoryOnTeleport(PlayerPositionLookS2CPacket packet, CallbackInfo ci) {
      if (MinecraftClient.getInstance().isOnThread()) {
         صص.INSTANCE.closeCustomScreenImmediately();
         ظظ.INSTANCE.unload();
      }
   }

   @Inject(method = "method_11150", at = @At("HEAD"))
   private void rain$logPickedUpItem(ItemPickupAnimationS2CPacket packet, CallbackInfo ci) {
      خِ.INSTANCE.handlePickup(packet);
   }

   @Inject(method = "method_45729", at = @At("HEAD"), cancellable = true)
   private void onSendChatMessage(String content, CallbackInfo ci) {
      if (RAIN_SKIP_MESSAGE_REWRITE.get()) {
         RAIN_SKIP_MESSAGE_REWRITE.set(false);
         دإ.INSTANCE.createCommands(content, ci);
      } else {
         دش event = new دش(content, true);
         رظ.INSTANCE.post(event);
         if (event.getCancel()) {
            ci.cancel();
         } else {
            String updatedMessage = event.getText();
            ClientPlayNetworkHandler self = (ClientPlayNetworkHandler)this;
            if (شء.INSTANCE.interceptOutgoingMessage(updatedMessage, translatedMessage -> {
               if (MinecraftClient.getInstance().getNetworkHandler() == self) {
                  RAIN_SKIP_MESSAGE_REWRITE.set(true);
                  self.sendChatMessage(translatedMessage);
               }
            })) {
               ci.cancel();
            } else if (!content.equals(updatedMessage)) {
               ci.cancel();
               RAIN_SKIP_MESSAGE_REWRITE.set(true);
               self.sendChatMessage(updatedMessage);
            } else {
               دإ.INSTANCE.createCommands(updatedMessage, ci);
            }
         }
      }
   }

   @Inject(method = "method_11117", at = @At("HEAD"))
   private void rain$unloadInventoryOnWorldChange(PlayerRespawnS2CPacket packet, CallbackInfo ci) {
      if (MinecraftClient.getInstance().isOnThread()) {
         صص.INSTANCE.closeCustomScreenImmediately();
         ظظ.INSTANCE.unload();
      }
   }
}
