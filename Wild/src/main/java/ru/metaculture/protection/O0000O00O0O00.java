package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.Window;

public final class O0000O00O0O00 {
   private static final int O00000000 = 262144;
   private static final BufferAllocator O000000000 = new BufferAllocator(262144);
   private static final Immediate O0000000000 = VertexConsumerProvider.immediate(O000000000);

   private O0000O00O0O00() {
   }

   public static Immediate O00000000() {
      return O0000000000;
   }

   public static boolean O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         Window var1 = minecraftClient.getWindow();
         return !var1.hasZeroWidthOrHeight() && var1.getFramebufferWidth() > 0 && var1.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }

   public static void O000000000() {
      O0000000000.draw();
      O000000000.clear();
   }
}
