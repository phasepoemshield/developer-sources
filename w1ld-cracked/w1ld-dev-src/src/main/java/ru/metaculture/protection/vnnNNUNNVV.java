package ru.metaculture.protection;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Join;
import net.minecraft.class_310;
import net.minecraft.class_642;

public final class vnnNNUNNVV {
   private vnnNNUNNVV() {
   }

   public static void UuUVuuUu() {
      ClientPlayConnectionEvents.JOIN.register((Join)(var0, var1, var2) -> UuvvNVnu.UuUVuuUu(UuUVuuUu(var2)));
      ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(var0, var1) -> UuvvNVnu.UuUVuuUu(""));
   }

   private static String UuUVuuUu(class_310 var0) {
      class_642 var1 = var0.method_1558();
      return var1 != null && var1.field_3761 != null ? var1.field_3761 : "";
   }
}
