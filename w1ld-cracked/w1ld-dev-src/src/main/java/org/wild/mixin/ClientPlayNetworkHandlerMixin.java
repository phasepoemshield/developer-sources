package org.wild.mixin;

import net.minecraft.class_2600;
import net.minecraft.class_2629;
import net.minecraft.class_2645;
import net.minecraft.class_2649;
import net.minecraft.class_2651;
import net.minecraft.class_2653;
import net.minecraft.class_2656;
import net.minecraft.class_2664;
import net.minecraft.class_2668;
import net.minecraft.class_2678;
import net.minecraft.class_2696;
import net.minecraft.class_2708;
import net.minecraft.class_2724;
import net.minecraft.class_2735;
import net.minecraft.class_2748;
import net.minecraft.class_2749;
import net.minecraft.class_437;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_8588;
import net.minecraft.class_9834;
import net.minecraft.class_9835;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUNUnUuNNuuN;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.O000c0oocoo;
import ru.metaculture.protection.UnVVnUuvNvu;
import ru.metaculture.protection.UvuuunvnNNUU;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.nNnnNNnNVvUv;
import ru.metaculture.protection.nnVNNuuVUVn;
import ru.metaculture.protection.uVuVNVuuN;

@Mixin({class_634.class})
public class ClientPlayNetworkHandlerMixin implements O000c0oocoo {
   @Shadow
   private class_638 field_3699;

   @Inject(
      method = {"onSetCameraEntity", "onOpenScreen", "onOpenHorseScreen", "onSetTradeOffers"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$suppressBackgroundedHostLeak(CallbackInfo var1) {
      if (nnVNNuuVUVn.UuUVuuUu((class_634)this)) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"onPlayerPositionLook"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$suppressHostTeleport(class_2708 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1, var3);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onHealthUpdate"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostHealth(class_2749 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onExplosion"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostExplosion(class_2664 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onPlayerRespawn"},
      at = {@At("HEAD")}
   )
   private void wild$redirectHostRespawn(class_2724 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.vNUvnnVnUvu();
      }
   }

   @Inject(
      method = {"onPlayerRespawn"},
      at = {@At("TAIL")}
   )
   private void wild$restoreBotAfterHostRespawn(class_2724 var1, CallbackInfo var2) {
      nnVNNuuVUVn.uVUuuVnNVU();
   }

   @Inject(
      method = {"onInventory"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostInventory(class_2649 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onPlayerAbilities"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostAbilities(class_2696 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onGameStateChange"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostGameState(class_2668 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onUpdateSelectedSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostSelectedSlot(class_2735 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onExperienceBarUpdate"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostExperience(class_2748 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onScreenHandlerSlotUpdate"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostSlot(class_2653 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onScreenHandlerPropertyUpdate"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostScreenProperty(class_2651 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onSetCursorItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostCursor(class_9834 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onSetPlayerInventory"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostPlayerInventory(class_9835 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onCloseScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostCloseScreen(class_2645 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.VVuuUN();
         var2.cancel();
      }
   }

   @Inject(
      method = {"onCooldownUpdate"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$redirectHostCooldown(class_2656 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         class_2600.method_11074(var1, var3, a_);
         nnVNNuuVUVn.UuUVuuUu(var1);
         var2.cancel();
      }
   }

   @Inject(
      method = {"onEnterReconfiguration"},
      at = {@At("HEAD")}
   )
   private void wild$hostEnterReconfiguration(class_8588 var1, CallbackInfo var2) {
      class_634 var3 = (class_634)this;
      if (nnVNNuuVUVn.UuUVuuUu(var3)) {
         if (a_.method_18854()) {
            nnVNNuuVUVn.nvUVNnuu();
         }
      }
   }

   @Inject(
      method = {"onEntitySetHeadYaw", "onEntity", "onMoveMinecartAlongTrack", "onEntityVelocityUpdate", "onEntityTrackerUpdate", "onEntityPositionSync", "onEntityPosition", "onEntitiesDestroy"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$dropEntityPacketsWhenNoWorld(CallbackInfo var1) {
      if (this.field_3699 == null) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"onBossBar"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$guardBossBar(class_2629 var1, CallbackInfo var2) {
      class_2600.method_11074(var1, (class_634)this, a_);

      try {
         a_.field_1705.method_1740().method_1795(var1);
      } catch (Throwable var4) {
      }

      var2.cancel();
   }

   @ModifyVariable(
      method = {"sendChatMessage"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private String wild$protectOutgoingChatMessage(String var1) {
      return UnVVnUuvNvu.C00OOC00oO(var1);
   }

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSendChatMessage(String var1, CallbackInfo var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         VUUnVnVNNU.UuUVuuUu();
         if (NVnVnNnN.vuuuNvNuv != null && var1.equalsIgnoreCase(NVnVnNnN.vuuuNvNuv)) {
            uVuVNVuuN var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uVuVNVuuN.class);
            if (var3 != null && var3.nuUnNvnuUu) {
               var3.UuUVuuUu(false);
               var2.cancel();
               return;
            }
         }

         if (UvuuunvnNNUU.UuUVuuUu(var1)) {
            var2.cancel();
         } else if (!uVuVNVuuN.uVunuUNVVUUV) {
            String var4 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
            if (var1.startsWith(var4)) {
               NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu(var1);
               var2.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"sendChatCommand"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockPvpSafeCommand(String var1, CallbackInfo var2) {
      if (UvuuunvnNNUU.C00OOC00oO(var1)) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"runClickEventCommand"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockPvpSafeClickCommand(String var1, class_437 var2, CallbackInfo var3) {
      if (UvuuunvnNNUU.C00OOC00oO(var1)) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"onGameJoin"},
      at = {@At("TAIL")}
   )
   private void onGameJoin(class_2678 var1, CallbackInfo var2) {
      VUUnVnVNNU.UuUVuuUu();
      NUNUnUuNNuuN.C00OOC00oO(a_);
      class_634 var3 = (class_634)this;
      if (!(var3 instanceof nNnnNNnNVvUv) && nnVNNuuVUVn.vuuuNvNuv()) {
         nnVNNuuVUVn.UuuNnUvUuv();
      }
   }

   @Redirect(
      method = {"onPlayerList"},
      at = @At(
         value = "INVOKE",
         target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V",
         remap = false
      )
   )
   private void suppressUnknownPlayerLog(Logger var1, String var2, Object var3, Object var4) {
      if (!var2.startsWith("Ignoring player info update")) {
         var1.warn(var2, var3, var4);
      }
   }
}
