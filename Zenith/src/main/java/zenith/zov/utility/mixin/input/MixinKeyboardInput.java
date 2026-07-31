package zenith.zov.utility.mixin.input;

import net.minecraft.util.PlayerInput;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.input.Input;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.PlayerInputHolder;
import zenith.EventBus;
import zenith.Event;

@Mixin({KeyboardInput.class})
public abstract class MixinKeyboardInput extends Input {
   @Inject(
      method = {"tick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/input/KeyboardInput;movementSideways:F",
         shift = Shift.AFTER,
         ordinal = 0
      )}
   )
   private void tickHook(CallbackInfo callbackinfo) {
      PlayerInputHolder ili11i1il11 = new PlayerInputHolder(this.playerInput);
      EventBus.StringHolder_8((Event)ili11i1il11);
      PlayerInput PlayerInput = ili11i1il11.Netherwartfarm();
      if (PlayerInput != null) {
         this.playerInput = new PlayerInput(
            PlayerInput.forward(),
            PlayerInput.backward(),
            PlayerInput.left(),
            PlayerInput.right(),
            PlayerInput.jump(),
            PlayerInput.sneak(),
            PlayerInput.sprint()
         );
         this.movementForward = KeyboardInput.getMovementMultiplier(PlayerInput.forward(), PlayerInput.backward());
         this.movementSideways = KeyboardInput.getMovementMultiplier(PlayerInput.left(), PlayerInput.right());
      }
   }
}
