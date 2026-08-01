package fat.releon.mixins.player.input;

import l.Helper160;
import net.minecraft.client.input.Input;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({Input.class})
public class InputMixin implements Helper160 {
   public InputMixin() {
   }
}
