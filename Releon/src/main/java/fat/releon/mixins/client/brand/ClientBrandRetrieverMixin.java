package fat.releon.mixins.client.brand;

import l.Helper165;
import net.minecraft.client.ClientBrandRetriever;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientBrandRetriever.class})
public class ClientBrandRetrieverMixin {
   public ClientBrandRetrieverMixin() {
   }

   @Inject(
      method = {"getClientModName"},
      at = {@At("RETURN")},
      cancellable = true,
      remap = false
   )
   private static void onGetClientModName(CallbackInfoReturnable<String> var0) {
      var0.setReturnValue(Helper165.method1362() == null ? "Fabric" : Helper165.method1362());
   }
}
