package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(SkinTextures.class)
public class SkinTexturesMixin {
   private static final String ИO;
   private static final String И5;

   @Inject(method = "comp_1627", at = @At("HEAD"), cancellable = true)
   public void capeTexture(CallbackInfoReturnable<Identifier> var1) {
      if (DestraClient.getInstance().getModuleManager() != null) {
         if (DestraClient.getInstance().getModuleManager().cape.Д()) {
            MinecraftClient var2 = MinecraftClient.getInstance();
            if (var2.player != null) {
               if (this == var2.player.getSkinTextures()) {
                  var1.setReturnValue(DestraClient.getInstance().id(DestraClient.getInstance().getModuleManager().cape.customColor.isEnabled() ? ИO : И5));
               }
            }
         }
      }
   }

   static {
      VMBridge.identifyClass(SkinTexturesMixin.class, "rFR7M0Me");
   }
}
