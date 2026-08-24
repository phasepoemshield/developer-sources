package org.zenith.utility.mixin.input;

import org.zenith.module.NoSweetSlow;

import org.zenith.event.MovementInputEvent;

import org.zenith.event.MovementInputEvent;
import org.zenith.core.BotFeatureRegistry;














import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.util.PlayerInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({KeyboardInput.class})
public abstract class MixinKeyboardInput extends Input {
   public MixinKeyboardInput() {
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/input/KeyboardInput;movementSideways:F",
         shift = Shift.AFTER,
         ordinal = 0
      )}
   )
   public void tickHook(CallbackInfo var1) {
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      if (minecraftclient.player != null && minecraftclient.player.input == this) {
         MovementInputEvent liil1llili1i11il1i1illll = new MovementInputEvent(this.playerInput);
         EventManager.call(liil1llili1i11il1i1illll);
         PlayerInput playerinput = liil1llili1i11il1i1illll.NoSweetSlow();
         if (playerinput != null) {
            this.playerInput = new PlayerInput(
               playerinput.forward(),
               playerinput.backward(),
               playerinput.left(),
               playerinput.right(),
               playerinput.jump(),
               playerinput.sneak(),
               playerinput.sprint()
            );
            this.movementForward = KeyboardInput.getMovementMultiplier(playerinput.forward(), playerinput.backward());
            this.movementSideways = KeyboardInput.getMovementMultiplier(playerinput.left(), playerinput.right());
         }
      }
   }
}
