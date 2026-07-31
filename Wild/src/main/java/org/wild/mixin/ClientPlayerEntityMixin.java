package org.wild.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec2f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.FreeCamera;
import ru.metaculture.protection.LockSlots;
import ru.metaculture.protection.NoPush;
import ru.metaculture.protection.O0000000O00O00;
import ru.metaculture.protection.O0000000O0OOO;
import ru.metaculture.protection.O0000000OO;
import ru.metaculture.protection.O0000000OO00;
import ru.metaculture.protection.O0000000OO000;
import ru.metaculture.protection.O000000O0O00O;
import ru.metaculture.protection.WildClient;

@Environment(EnvType.CLIENT)
@Mixin({ClientPlayerEntity.class})
public abstract class ClientPlayerEntityMixin {
   @Shadow
   public Input input;

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onTickHead(CallbackInfo callbackInfo) {
      EventManager.O00000000((Event)(new O0000000O00O00()));
   }

   @Redirect(
      method = {"tickMovementInput"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"
      )
   )
   private float redirectRenderPitchUpdate(ClientPlayerEntity clientPlayerEntity) {
      return O000000O0O00O.O00000000 ? MinecraftClient.getInstance().gameRenderer.getCamera().getPitch() : clientPlayerEntity.getPitch();
   }

   @Inject(
      method = {"dropSelectedItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$lockSlotsDropSelected(boolean bl, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         LockSlots var3 = WildClient.O00000000.O000000000.O00000000(LockSlots.class);
         if (var3 != null && var3.O0000000000000) {
            ClientPlayerEntity var4 = (ClientPlayerEntity)(Object)this;
            if (var3.O00000000(var4.getInventory().getSelectedSlot())) {
               callbackInfoReturnable.setReturnValue(false);
            }
         }
      }
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preMotion(CallbackInfo callbackInfo) {
      ClientPlayerEntity var2 = (ClientPlayerEntity)(Object)this;
      O0000000OO var3 = new O0000000OO(var2.getX(), var2.getY(), var2.getZ(), var2.getYaw(), var2.getPitch(), var2.isOnGround());
      EventManager.O00000000((Event)var3);
      if (var3.O00000000()) {
         callbackInfo.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      )}
   )
   private boolean usingItemHook(boolean bl) {
      if (bl) {
         O0000000OO000 var2 = new O0000000OO000((byte)1);
         EventManager.O00000000((Event)var2);
         if (var2.O00000000()) {
            return false;
         }
      }

      return bl;
   }

   @Redirect(
      method = {"tickMovementInput"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"
      )
   )
   private float redirectRenderYawUpdate(ClientPlayerEntity clientPlayerEntity) {
      return O000000O0O00O.O00000000 ? MinecraftClient.getInstance().gameRenderer.getCamera().getYaw() : clientPlayerEntity.getYaw();
   }

   @Redirect(
      method = {"tickMovement"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;pushOutOfBlocks(DD)V"
      )
   )
   private void redirectPushOutOfBlocks(ClientPlayerEntity clientPlayerEntity, double d, double e) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         FreeCamera var6 = WildClient.O00000000.O000000000.O00000000(FreeCamera.class);
         if (var6 != null && var6.O0000000000000) {
            return;
         }

         NoPush var7 = (NoPush)WildClient.O00000000.O000000000.O000000000(NoPush.class);
         if (var7 != null && var7.O0000000000000 && var7.O000000000O00.O0000000000()) {
         }
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At("HEAD")}
   )
   private void onUpdateWalkingPlayer(CallbackInfo callbackInfo) {
      ClientPlayerEntity var2 = (ClientPlayerEntity)(Object)this;
      if (var2 != null) {
         Box var3 = var2.getBoundingBox();
         O0000000O0OOO var4 = new O0000000O0OOO(var2.getYaw(), var2.getPitch(), var2.getX(), var2.getY(), var2.getZ(), var2.isOnGround(), var3, null);
         EventManager.O00000000((Event)var4);
         if (!var4.O00000000()) {
            if (var4.O000000000000() != var2.getYaw() || var4.O0000000000000() != var2.getPitch()) {
               var2.setYaw(var4.O000000000000());
               var2.setPitch(var4.O0000000000000());
            }

            if (var4.O000000000000O() != var2.getX() || var4.O00000000000O() != var2.getY() || var4.O00000000000O0() != var2.getZ()) {
               var2.refreshPositionAndAngles(var4.O000000000000O(), var4.O00000000000O(), var4.O00000000000O0(), var4.O000000000000(), var4.O0000000000000());
            }

            if (var4.O00000000000OO() != var2.isOnGround()) {
               var2.setOnGround(var4.O00000000000OO());
            }
         }
      }
   }

   @Redirect(
      method = {"applyMovementSpeedFactors"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/Vec2f;multiply(F)Lnet/minecraft/util/math/Vec2f;",
         ordinal = 1
      )
   )
   private Vec2f preventSlowdownMultiply(Vec2f vec2f, float f) {
      ClientPlayerEntity var3 = (ClientPlayerEntity)(Object)this;
      if (f == 0.2F && var3.isUsingItem() && !var3.hasVehicle()) {
         float var4 = vec2f.y;
         float var5 = vec2f.x;
         O0000000OO00 var6 = new O0000000OO00(var4, var5);
         EventManager.O00000000((Event)var6);
         var6.O0000000000();
         if (var6.O00000000()) {
            return vec2f;
         }
      }

      return vec2f.multiply(f);
   }

   @Unique
   private static float getMovementMultiplier(boolean bl, boolean bl2) {
      if (bl == bl2) {
         return 0.0F;
      } else {
         return bl ? 1.0F : -1.0F;
      }
   }
}
