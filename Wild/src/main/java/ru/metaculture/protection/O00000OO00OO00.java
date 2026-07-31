package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import org.wild.module.api.Module;

public class O00000OO00OO00 extends O00000OO000O0O {
   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j, float f) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      if (var5 != null && var5.getWindow() != null) {
         int var6 = var5.getWindow().getFramebufferWidth();
         int var7 = var5.getWindow().getFramebufferHeight();
         if (var6 > 0 && var7 > 0) {
            int var8 = (int)(i / O0000O00OO0OOO.O00000000);
            int var9 = (int)(j / O0000O00OO0OOO.O00000000);
            O00000OO000O0O.O00000000O00O0 = var8;
            O00000OO000O0O.O00000000O00OO = var9;
            O00000OO000O0O.O00000000000OO.O00000000();
            O00000OO000O0O.O0000000000O.O00000000();
            O00000OO000O0O.O0000000000O0.O00000000();
            O00000OO000O0O.O0000000000O00.O00000000();
            if (O00000OO000O0O.O00000000O0OO0 != null) {
               for (Module var11 : O00000OO000O0O.O00000000O0OO0) {
                  O00000OO000O0O.O00000000(var11).O00000000();
                  O00000OO000O0O.O000000000(var11).O00000000();
                  O00000OO000O0O.O0000000000(var11).O00000000();
               }
            }

            O00000OO000O0O.O00000000000O.O00000000(1.0);
            float var17 = O00000OO000O0O.O00000000000OO.O000000000000();
            if (!(var17 <= 0.001F)) {
               float var18 = var5.getWindow().getScaledWidth();
               float var12 = var5.getWindow().getScaledHeight();
               O00000OO000O0O.O00000000O000 = var18 / 2.0F - O00000OO000O0O.O00000000O000O / 2.0F;
               O00000OO000O0O.O00000000O0000 = var12 / 2.0F - O00000OO000O0O.O00000000O00O / 2.0F - (80.0F - 80.0F * var17);
               float var13 = (float)var5.getWindow().getFramebufferWidth() / var5.getWindow().getScaledWidth();
               o0000O00OO0O0.O0000000000(var13);

               try {
                  if (O00000OO000O0O.O000000000000O.O0000000000()) {
                     o0000O00OO0O0.O00000000(23.0F);
                  }

                  o0000O00OO0O0.O00000000(0.0F, 0.0F, var18, var12, RenderManager.W382.O00000000000(0, 0, 0, (int)(140.0F * var17)));
                  O00000OO00000.O00000000(o0000O00OO0O0, var8, var9, var17);
               } finally {
                  o0000O00OO0O0.O00000000000O();
                  o0000O00OO0O0.O00000000000O();
               }
            }
         }
      }
   }
}
