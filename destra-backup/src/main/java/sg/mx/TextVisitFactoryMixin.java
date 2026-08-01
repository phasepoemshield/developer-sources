package sg.mx;

import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import ru.destra.core.DestraClient;
import ru.destra.module.StreamerModeModule;

@Mixin(TextVisitFactory.class)
public class TextVisitFactoryMixin {
   @ModifyArg(
      method = "visitFormatted",
      index = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z",
         ordinal = 0
      )
   )
   private static String patchName(String var0) {
      DestraClient var1 = DestraClient.getInstance();
      if (var1 != null && var1.getModuleManager() != null && var0 != null && !var0.isEmpty()) {
         StreamerModeModule var2 = var1.getModuleManager().streamerMode;
         return var2 != null && var2.Д() ? var2.sanitizeText(var0) : var0;
      } else {
         return var0;
      }
   }
}
