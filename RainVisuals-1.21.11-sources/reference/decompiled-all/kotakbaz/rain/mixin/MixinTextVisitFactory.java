package kotakbaz.rain.mixin;

import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import oxxxde.د;

// $VF: Compiled from MixinTextVisitFactory.java
@Mixin(TextVisitFactory.class)
public class MixinTextVisitFactory {
   @ModifyVariable(method = "method_27472", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private static String rain$protectName(String string) {
      return د.INSTANCE.protectString(string);
   }
}
