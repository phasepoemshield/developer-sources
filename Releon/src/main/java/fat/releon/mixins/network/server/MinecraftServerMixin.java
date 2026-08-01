package fat.releon.mixins.network.server;

import fat.releon.Releon;
import l.Exception3;
import l.Helper211;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftServer.class})
public class MinecraftServerMixin {
   public MinecraftServerMixin() {
   }

   @Inject(
      method = {"shutdown"},
      at = {@At("HEAD")}
   )
   public void shutdown(CallbackInfo var1) {
      if (Releon.method71().method39()) {
         try {
            Releon.method71().method29().method896();
         } catch (Exception var3) {
            Helper211.method1813("Error occurred while saving files: " + var3.getMessage());
         }
      }
   }
}
