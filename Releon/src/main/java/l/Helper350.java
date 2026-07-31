package l;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.minecraft.client.MinecraftClient;

public class Helper350 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static final float BODY_SMOOTH = 0.95F;

   public Helper350() {
   }

   public static void init() {
      ClientTickEvents.END_CLIENT_TICK.register((EndTick)var0 -> {
         if (mc.player != null && mc.world != null) {
            method3480();
         }
      });
   }

   private static void method3480() {
      mc.player.prevBodyYaw = mc.player.bodyYaw = mc.player.getYaw();
   }
}
