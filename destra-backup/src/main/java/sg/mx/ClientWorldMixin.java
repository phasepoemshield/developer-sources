package sg.mx;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.module.WorldCustomizerModule;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ClientWorld.class)
public abstract class ClientWorldMixin {
   private static final int ш8В;
   private static final int ш8Ч;
   private static final float шНш;

   @Inject(method = "getSkyColor", at = @At("HEAD"), cancellable = true)
   private void destra$getSkyColor(Vec3d var1, float var2, CallbackInfoReturnable<Integer> var3) {
      WorldCustomizerModule var4 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().worldCustomizer
         : null;
      if (var4 != null && var4.ь()) {
         var3.setReturnValue(var4.getFogSkyColor() & ш8В);
      }
   }

   @Inject(method = "getCloudsColor", at = @At("HEAD"), cancellable = true)
   private void destra$getCloudsColor(float var1, CallbackInfoReturnable<Integer> var2) {
      WorldCustomizerModule var3 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().worldCustomizer
         : null;
      if (var3 != null && var3.ь()) {
         var2.setReturnValue(destra$brighten(var3.getFogSkyColor() & ш8Ч, шНш));
      }
   }

   private static int destra$brighten(int var0, float var1) {
      int var2 = Math.min(255, (int)((var0 >> 16 & 0xFF) * var1));
      int var3 = Math.min(255, (int)((var0 >> 8 & 0xFF) * var1));
      int var4 = Math.min(255, (int)((var0 & 0xFF) * var1));
      return var2 << 16 | var3 << 8 | var4;
   }

   static {
      VMBridge.identifyClass(ClientWorldMixin.class, "9H5CGDae");
   }
}
