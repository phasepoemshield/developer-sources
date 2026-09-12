package nursultan;

import net.fabricmc.api.ClientModInitializer;

public class NursultanModInit implements ClientModInitializer {
   public void onInitializeClient() {
      System.out.println("[NursultanMod] Initializing Nursultan Client Mod (Fabric)...");

      try {
         try {
            Class<?> remapperClass = Class.forName("Nursultan.class09948");
            remapperClass.getMethod("N").invoke(null);
            System.out.println("[NursultanMod] Nursultan Remapper initialized successfully.");
         } catch (Throwable var3) {
            System.out.println("[NursultanMod] Remapper init: " + var3.getMessage());
         }

         try {
            Class<?> coreClass = Class.forName("Nursultan.class11938");
            coreClass.getMethod("l").invoke(null);
            System.out.println("[NursultanMod] Nursultan Core engine initialized successfully.");
         } catch (Throwable var2) {
            System.out.println("[NursultanMod] Core engine init: " + var2.getMessage());
         }

         System.out.println("[NursultanMod] Nursultan Mod Ready!");
      } catch (Throwable var4) {
         System.err.println("[NursultanMod] Error during Nursultan initialization: " + var4.getMessage());
         var4.printStackTrace();
      }
   }
}
