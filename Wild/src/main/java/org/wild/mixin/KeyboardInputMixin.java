package org.wild.mixin;

import net.minecraft.client.input.KeyboardInput;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Vec2f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.O0000000O0OO0;
import ru.metaculture.protection.ProtectionHandler;

@Mixin({KeyboardInput.class})
public abstract class KeyboardInputMixin {
   @Unique
   private O0000000O0OO0 inputEvent;

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/Vec2f;<init>(FF)V",
         shift = Shift.BEFORE
      )}
   )
   private void onTickBeforeMovementVector(CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      KeyboardInput var2 = (KeyboardInput)(Object)this;
      float var3 = getMovementMultiplier(var2.playerInput.forward(), var2.playerInput.backward());
      float var4 = getMovementMultiplier(var2.playerInput.left(), var2.playerInput.right());
      this.inputEvent = new O0000000O0OO0(var3, var4, var2.playerInput.jump(), var2.playerInput.sneak(), var2.playerInput.sprint(), 0.3);
      EventManager.O00000000((Event)(Object)this.inputEvent);
   }

   @Redirect(
      method = {"tick"},
      at = @At(
         value = "NEW",
         target = "Lnet/minecraft/util/math/Vec2f;"
      )
   )
   private Vec2f redirectVec2fCreation(float f, float g) {
      return this.inputEvent != null ? new Vec2f(this.inputEvent.O00000000000(), this.inputEvent.O0000000000()).normalize() : new Vec2f(f, g).normalize();
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/input/KeyboardInput;playerInput:Lnet/minecraft/util/PlayerInput;",
         opcode = 181,
         shift = Shift.AFTER
      )}
   )
   private void onTickAfterPlayerInput(CallbackInfo callbackInfo) {
      if (this.inputEvent != null) {
         KeyboardInput var2 = (KeyboardInput)(Object)this;
         PlayerInput var3 = var2.playerInput;
         PlayerInput var4 = new PlayerInput(
            var3.forward(),
            var3.backward(),
            var3.left(),
            var3.right(),
            this.inputEvent.O000000000000(),
            this.inputEvent.O0000000000000(),
            this.inputEvent.O000000000000O()
         );
         var2.playerInput = var4;
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("RETURN")}
   )
   private void onTickReturn(CallbackInfo callbackInfo) {
      this.inputEvent = null;
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
