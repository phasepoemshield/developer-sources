package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.math.MatrixStack;

public class Watermark extends Helper119 {
   private int fpsCount = 0;

   public Watermark() {
      super("Watermark", 10, 10, 120, 15, true);
   }

   @Override
   public void method308() {
      this.fpsCount = mc.getCurrentFps();
   }

   @Override
   public void method310(DrawContext var1) {
      if (mc.player != null && mc.world != null) {
         MatrixStack var2 = var1.getMatrices();
         String var3 = "Releon";
         String var4 = this.method2933();
         String var5 = mc.isInSingleplayer() ? "Singleplayer" : (mc.getCurrentServerEntry() != null ? mc.getCurrentServerEntry().address : "None");
         String var6 = "FPS: " + this.fpsCount;
         byte var7 = -1;
         int var8 = Hud.method1824().method1828();
         Helper175 var9 = Helper103.method927(18, Helper101.RELEONLOGO);
         Helper175 var10 = Helper103.method927(14, Helper101.BOLD);
         Helper175 var11 = Helper103.method927(14, Helper101.DEFAULT);
         float var12 = 4.0F;
         float var13 = var9.method1479("L") + 3.0F;
         float var14 = var9.method1479("L") + 3.0F;
         float var15 = var9.method1479("L") + 3.0F;
         float var16 = var9.method1479("L") + 3.0F;
         float var17 = 4.0F;
         var17 += var13 + var10.method1479(var3);
         var17 += var12;
         var17 += var14 + var11.method1479(var4);
         var17 += var12;
         var17 += var15 + var11.method1479(var5);
         var17 += var12;
         var17 += var16 + var11.method1479(var6);
         var17 += 5.0F;
         float var18 = 15.0F;
         this.method975((int)var17);
         this.method976((int)var18);
         int var19 = Hud.method1824().method1845();
         int var20 = Hud.method1824().method1834();
         int var21 = Hud.method1824().method1827();
         if (Helper362.method3600()) {
            Helper362.method3604(
               var2,
               this.method981(),
               this.method982(),
               var17,
               var18,
               4.0F,
               var19,
               Helper133.method1106(var20, var19),
               Helper133.method1106(var21, Math.min(255, var19 + 25))
            );
         } else {
            Helper12.method361(var2, this.method981(), this.method982(), var17, var18, 4.0F, var19, var20, var21);
            if (!Hud.method1824().method1838()) {
               rectangle.method677(
                  Helper80.method841(var2, this.method981(), this.method982(), var17, var18)
                     .method826(2.0F)
                     .method835(0.5F)
                     .method839(Helper133.method1106(var21, var19))
                     .method823(Helper133.method1106(var20, var19))
                     .method840()
               );
            }
         }

         float var22 = this.method982() + var18 / 2.0F - 3.5F + 1.0F;
         float var23 = this.method981() + 5;
         Helper175 var24 = Helper103.method927(18, Helper101.RELEONLOGO);
         var9.method1474(var2, "\ue001", var23 - 2.0F, var22 + 1.0F, var8);
         var23 += var13;
         var10.method1474(var2, var3, var23, var22 + 0.5F, var7);
         var23 += var10.method1479(var3) + var12;
         var24.method1474(var2, "\ue004", var23, var22 + 1.0F, var8);
         var23 += var14;
         var11.method1474(var2, var4, var23, var22 + 0.5F, var7);
         var23 += var11.method1479(var4) + var12;
         var24.method1474(var2, "\ue003", var23, var22 + 1.5F, var8);
         var23 += var15;
         var11.method1474(var2, var5, var23, var22 + 0.5F, var7);
         var23 += var11.method1479(var5) + var12;
         var24.method1474(var2, "\ue002", var23 - 1.0F, var22 + 1.0F, var8);
         var23 += var16;
         var11.method1474(var2, var6, var23, var22 + 0.5F, var7);
      }
   }

   private int method2932() {
      if (mc.getNetworkHandler() != null && mc.player != null) {
         PlayerListEntry var1 = mc.getNetworkHandler().getPlayerListEntry(mc.player.getUuid());
         if (var1 != null) {
            return var1.getLatency();
         }
      }

      return 0;
   }

   private String method2933() {
      if (mc.player != null && mc.player.getName() != null) {
         String var1 = mc.player.getName().getString();
         if (var1 != null && !var1.isBlank()) {
            return var1;
         }
      }

      String var2 = System.getenv("username");
      if (var2 == null || var2.isBlank()) {
         var2 = System.getenv("USER");
      }

      if (var2 == null || var2.isBlank()) {
         var2 = System.getProperty("user.name");
      }

      return var2 != null && !var2.isBlank() ? var2 : "Player";
   }
}
