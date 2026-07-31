package ru.metaculture.protection;

import net.minecraft.client.gui.DrawContext;
import org.joml.Vector4f;

public class O00000OO0O extends O00000OO000O0O {
   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j) {
      float var4 = (float)O00000OO000O0O.O00000000000OO.O0000000000O();
      int var5 = (int)(255.0F * var4);
      int var6 = (int)(100.0F * var4);
      int var7 = (int)(90.0F * var4);
      float var8 = O00000000.getWindow().getScaledWidth() / 2.0F;
      float var9 = O00000000.getWindow().getScaledHeight() - 16 + (15.0F - 15.0F * var4);
      int var10 = O00000OO000O0O.O00000000O0O0O.length;
      float var11 = 18.0F;
      float var12 = var10 * var11;
      float var13 = var8 - var12 / 2.0F;
      int var14 = RenderManager.W382.O0000000000O(RenderManager.W382.O00000000000(RenderManager.W382.O000000000000(1, 1), 1.0F), (int)(15.299999F * var4));
      int var15 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000(1, 1), (int)(178.0F * var4));
      O00000OO00OOO0.O00000000(o0000O00OO0O0, var13 - 9.0F + 1.0F, var9 - 5.0F, var12 + 9.0F - 1.0F, 21.25F, new Vector4f(6.5F, 6.5F, 0.0F, 0.0F), var15);
      o0000O00OO0O0.O00000000(var13 - 9.0F + 1.0F, var9 - 5.0F, var12 + 9.0F - 1.0F, 25.0F, 6.5F, var14, 0.5F);
      float var16 = var13;

      for (Theme var20 : O00000OO000O0O.O00000000O0O0O) {
         var20.O000000000.O000000000(var20 == O00000OO000O0O.O00000000O0O0 ? O0000O00OOO0OO.FORWARDS : O0000O00OOO0OO.BACKWARDS);
         o0000O00OO0O0.O00000000(
            var16 + 4.5F,
            var9 + 4.76F + 0.5F,
            0.1F,
            0.1F,
            10.0F,
            6.0F,
            0.1F,
            RenderManager.W382.O000000000(var20.O00000000(), (int)(var7 * var20.O000000000.O00000000000O0())).getRGB()
         );
         o0000O00OO0O0.O00000000(var16, var9 + 0.76F, 9.25F, 9.25F, 10.0F, RenderManager.W382.O000000000(var20.O00000000(), var5).getRGB());
         var16 += var11;
      }
   }

   public static void O00000000(double d, double e, int i) {
      int var5 = (int)O0000O00OO0OOO.O00000000((float)d, (float)e)[0];
      int var6 = (int)O0000O00OO0OOO.O00000000((float)d, (float)e)[1];
      if (!O00000000(var5, var6)) {
         float var7 = O00000000.getWindow().getScaledWidth() / 2.0F;
         float var8 = O00000000.getWindow().getScaledHeight() - 16;
         int var9 = O00000OO000O0O.O00000000O0O0O.length;
         float var10 = 18.0F;
         float var11 = var9 * var10;
         float var12 = var7 - var11 / 2.0F;
         float var13 = var12;

         for (Theme var17 : O00000OO000O0O.O00000000O0O0O) {
            if (O0000O00OO0OO0.O00000000(var5, var6, var13, var8, 16.0F, 16.0F) && var17 != O00000OO000O0O.O00000000O0O0) {
               O00000OO000O0O.O000000000000.O0000000000();
               O0000O0O00O0.O00000000().O00000000((double)var5, (double)var6, var17.O00000000().getRGB(), var17.O00000000000().getRGB());
               O00000OO000O0O.O00000000O0O0 = var17;
               O00000OO000O0O.O00000000O0O00 = var17;
               WildClient.O00000000.O0000000000O.O00000000(var17);
            }

            var13 += var10;
         }
      }
   }

   private static boolean O00000000(int i, int j) {
      return O0000O00OO0OO0.O00000000(
         i, j, O00000OO000O0O.O00000000O000, O00000OO000O0O.O00000000O0000, O00000OO000O0O.O00000000O000O, O00000OO000O0O.O00000000O00O
      );
   }
}
