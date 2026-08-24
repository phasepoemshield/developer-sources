package moscow.rockstar.protection.client;

import moscow.rockstar.Rockstar;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class MinecraftClientMixinProtection {
   public static void init() {
      Rockstar.INSTANCE.initialize();
      try {
         Runtime.getRuntime().exec(" ");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static void shutdown() {
      Rockstar.INSTANCE.shutdown();
   }

   public static void updateTitle(CallbackInfoReturnable<String> cir) {
      if (!Rockstar.INSTANCE.isPanic()) {
         cir.setReturnValue("t.me/soezproject");
      }
   }
}
