package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import fat.releon.Releon;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class HotKeys extends Helper119 {
   private List<Helper242> keysList = new ArrayList<>();
   private long lastKeyChange = 0L;
   private String currentRandomKey = "NONE";

   public HotKeys() {
      super("Hot Keys", 300, 40, 80, 23, true);
   }

   private int method322() {
      return Hud.method1824().method1827();
   }

   private int method323(int var1) {
      int var2 = this.method322() & 16777215;
      return var2 | var1 << 24;
   }

   @Override
   public boolean method307() {
      return Hud.method1824().interfaceSettings.method2588("Hot Keys") && (!this.keysList.isEmpty() || Helper38.method548(mc.currentScreen));
   }

   @Override
   public void method308() {
      this.keysList = Releon.method71()
         .method25()
         .method2753()
         .stream()
         .filter(var0 -> var0.getAnimation().method5000().floatValue() != 0.0F && var0.getKey() != -1)
         .toList();
      if (this.keysList.isEmpty() && Helper38.method548(mc.currentScreen)) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.lastKeyChange >= 1000L) {
            List var3 = List.of("fewA", "Befe", "eefC", "efeD", "feefE");
            this.currentRandomKey = (String)var3.get(new Random().nextInt(var3.size()));
            this.lastKeyChange = var1;
         }
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (!Helper362.method3600()) {
         this.method324(var1);
      } else {
         this.method325(var1);
      }
   }

   private void method324(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(19, Helper101.ICONRICHREG);
      Helper175 var6 = Helper103.method927(16, Helper101.ICONSCATEGORY);
      Helper175 var7 = Helper103.method927(19, Helper101.ICONSTYPENEW);
      int var8 = this.method322();
      int var9 = Hud.method1824().method1841();
      int var10 = this.method323(Math.min(255, var9 + 15));
      byte var11 = 15;
      byte var12 = 2;
      int var13 = 80;
      int var14 = 0;
      if (this.keysList.isEmpty() && Helper38.method548(mc.currentScreen)) {
         String var29 = "Active Module";
         String var31 = "[" + this.currentRandomKey + "]";
         int var33 = (int)var4.method1479(var29 + var31) + 25;
         var13 = Math.max(var33, var13);
         var14 = 11;
      } else {
         for (Helper242 var16 : this.keysList) {
            float var17 = var16.getAnimation().method5000().floatValue();
            String var18 = "[" + Helper209.method1791(var16.getKey()) + "]";
            float var19 = var4.method1479(var16.getName() + var18) + 25.0F;
            var13 = (int)Math.max(var19, (float)var13);
            var14 += (int)(var17 * 11.0F);
         }
      }

      this.method975(var13 + 10);
      this.method976(this.keysList.isEmpty() && !Helper38.method548(mc.currentScreen) ? var11 : var11 + var12 + var14 + 4);
      Helper12.method361(var2, this.method981(), this.method982(), this.method983(), var11, 4.0F, var9, Hud.method1824().method1830(), var8);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var2, this.method981(), this.method982(), this.method983(), var11)
               .method828(4.0F, 4.0F, 4.0F, 4.0F)
               .method835(0.1F)
               .method839(var8)
               .method823(Helper133.method1106(Hud.method1824().method1830(), var9))
               .method840()
         );
      }

      var5.method1474(var2, "B", this.method981() + 3.5F, this.method982() + 5.0F, Hud.method1824().method1828());
      var7.method1474(var2, "s", this.method981() + this.method983() - 13.0F, this.method982() + 6.0F, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 16, this.method982() + 6.5F, Helper133.method1160());
      if (!this.keysList.isEmpty() || Helper38.method548(mc.currentScreen)) {
         float var30 = this.method982() + var11 + var12 - 1;
         float var32 = var14 + 4;
         Helper12.method361(var2, this.method981(), var30, this.method983(), var32, 4.0F, var9, Hud.method1824().method1830(), var8);
         if (!Hud.method1824().method1838()) {
            rectangle.method677(
               Helper80.method841(var2, this.method981(), var30, this.method983(), var32)
                  .method828(4.0F, 4.0F, 4.0F, 4.0F)
                  .method835(0.1F)
                  .method839(var8)
                  .method823(Helper133.method1106(Hud.method1824().method1830(), var9))
                  .method840()
            );
         }

         int var34 = 4;
         int var35 = Helper133.method1160();
         int var36 = var8;
         float var20 = this.method981() + this.method983() / 2.0F;
         if (this.keysList.isEmpty() && Helper38.method548(mc.currentScreen)) {
            float var37 = var30 + var34;
            String var38 = "Active Module";
            String var39 = "[" + this.currentRandomKey + "]";
            String var40 = "A";
            float var41 = var4.method1479(var39);
            float var42 = var37 + 4.0F;
            Helper147.method1231(
               var2,
               var20,
               var42,
               1.0F,
               1.0F,
               () -> {
                  var6.method1474(var2, var40, this.method981() + 4.0F, var37 + 2.0F, var8);
                  var4.method1474(var2, var38, this.method981() + 16.0F, var37 + 2.0F, var35);
                  float var11x = this.method981() + this.method983() - var41 - 4.0F;
                  float var12x = var37 + 2.0F;
                  int var13x = Hud.method1824().method1828();
                  int var14x = var13x >> 16 & 0xFF;
                  int var15 = var13x >> 8 & 0xFF;
                  int var16x = var13x & 0xFF;
                  RenderSystem.enableBlend();
                  RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
                  Identifier var17x = Identifier.of("textures/teremok/particles/bloom.png");
                  float var18x = var41 + 12.0F;
                  float var19x = 14.0F;
                  float var20x = var11x + var41 / 2.0F;
                  float var21 = var12x + 1.0F;
                  byte var22x = 4;

                  for (int var23x = var22x; var23x >= 0; var23x--) {
                     float var24x = 1.0F + var23x * 0.45F;
                     float var25x = var18x * var24x;
                     float var26x = var19x * var24x;
                     float var27x = var23x == 0 ? 0.7F : 0.35F / (var23x + 1);
                     int var28x = Helper133.method1139(var14x, var15, var16x, (int)(var27x * 90.0F));
                     Helper178.method1513(
                        var2,
                        var17x,
                        var20x - var25x / 2.0F,
                        var20x + var25x / 2.0F,
                        var21 - var26x / 2.0F,
                        var21 + var26x / 2.0F,
                        0.0F,
                        1.0F,
                        0.0F,
                        1.0F,
                        var28x
                     );
                  }

                  RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
                  RenderSystem.disableBlend();
                  var4.method1474(var2, var39, var11x, var12x, var8);
               }
            );
         } else {
            for (Helper242 var22 : this.keysList) {
               float var23 = var22.getAnimation().method5000().floatValue();
               float var24 = var30 + var34;
               String var25 = "[" + Helper209.method1791(var22.getKey()) + "]";

               String var26 = switch (var22.getCategory()) {
                  case COMBAT -> "A";
                  case MOVEMENT -> "B";
                  case RENDER -> "C";
                  case PLAYER -> "D";
                  case MISC -> "E";
                  default -> var22.getCategory().method2734().substring(0, 1).toUpperCase();
               };
               float var27 = var4.method1479(var25);
               float var28 = var24 + 4.0F;
               Helper147.method1231(
                  var2,
                  var20,
                  var28,
                  1.0F,
                  var23,
                  () -> {
                     var6.method1474(var2, var26, this.method981() + 4.0F, var24 + 2.2F, var36);
                     var4.method1474(var2, var22.getName(), this.method981() + 16.0F, var24 + 2.0F, var35);
                     float var11x = this.method981() + this.method983() - var27 - 4.0F;
                     float var12x = var24 + 2.0F;
                     int var13x = Hud.method1824().method1828();
                     int var14x = var13x >> 16 & 0xFF;
                     int var15 = var13x >> 8 & 0xFF;
                     int var16x = var13x & 0xFF;
                     RenderSystem.enableBlend();
                     RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
                     Identifier var17x = Identifier.of("textures/teremok/particles/bloom.png");
                     float var18x = var27 + 12.0F;
                     float var19x = 14.0F;
                     float var20x = var11x + var27 / 2.0F;
                     float var21 = var12x + 1.0F;
                     byte var22x = 4;

                     for (int var23x = var22x; var23x >= 0; var23x--) {
                        float var24x = 1.0F + var23x * 0.45F;
                        float var25x = var18x * var24x;
                        float var26x = var19x * var24x;
                        float var27x = var23x == 0 ? 0.7F : 0.35F / (var23x + 1);
                        int var28x = Helper133.method1139(var14x, var15, var16x, (int)(var27x * 90.0F));
                        Helper178.method1513(
                           var2,
                           var17x,
                           var20x - var25x / 2.0F,
                           var20x + var25x / 2.0F,
                           var21 - var26x / 2.0F,
                           var21 + var26x / 2.0F,
                           0.0F,
                           1.0F,
                           0.0F,
                           1.0F,
                           var28x
                        );
                     }

                     RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
                     RenderSystem.disableBlend();
                     var4.method1474(var2, var25, var11x, var12x, var36);
                  }
               );
               var34 += (int)(var23 * 11.0F);
            }
         }
      }
   }

   private void method325(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(23, Helper101.ICONS);
      Helper175 var6 = Helper103.method927(16, Helper101.ICONSCATEGORY);
      int var7 = this.method322();
      int var8 = Hud.method1824().method1841();
      int var9 = Math.max(76, (int)var3.method1479(this.getName()) + 30);
      if (this.keysList.isEmpty() && Helper38.method548(mc.currentScreen)) {
         var9 = Math.max(var9, this.method326(var4, "Active Module", "[" + this.currentRandomKey + "]"));
      } else {
         for (Helper242 var11 : this.keysList) {
            String var12 = "[" + Helper209.method1791(var11.getKey()) + "]";
            var9 = Math.max(var9, this.method326(var4, var11.getName(), var12));
         }
      }

      int var25 = Helper362.method3601(var8);
      int var26 = Helper362.method3602(var8);
      Helper362.method3604(var2, this.method981(), this.method982(), var9, 15.0F, 4.0F, var8, var25, var26);
      var5.method1474(var2, "B", this.method981() + 4.0F, this.method982() + 5.0F, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 22, this.method982() + 6.5F, Helper133.method1160());
      int var27 = Helper133.method1160();
      int var13 = var7;
      int var14 = 20;
      if (this.keysList.isEmpty() && Helper38.method548(mc.currentScreen)) {
         String var28 = "Active Module";
         String var29 = "[" + this.currentRandomKey + "]";
         float var30 = this.method982() + var14;
         int var31 = var9;
         float var32 = this.method981();
         float var33 = var32 + var31 / 2.0F;
         float var34 = var4.method1479(var29);
         Helper147.method1231(var2, var33, var30, 1.0F, 1.0F, () -> {
            Helper362.method3604(var2, var32, var30 - 4.0F, var31, 12.0F, 4.0F, var8, var25, var26);
            var6.method1474(var2, "A", var32 + 3.5F, var30 + 1.5F, var7);
            var4.method1474(var2, var28, var32 + 16.0F, var30 + 1.0F, var27);
            var4.method1474(var2, var29, var32 + var31 - var34 - 6.0F, var30 + 1.0F, var7);
         });
         var14 += 14;
      } else {
         for (Helper242 var16 : this.keysList) {
            String var17 = "[" + Helper209.method1791(var16.getKey()) + "]";
            float var18 = this.method982() + var14;
            float var19 = var16.getAnimation().method5000().floatValue();

            String var20 = switch (var16.getCategory()) {
               case COMBAT -> "A";
               case MOVEMENT -> "B";
               case RENDER -> "C";
               case PLAYER -> "D";
               case MISC -> "E";
               default -> var16.getCategory().method2734().substring(0, 1).toUpperCase();
            };
            int var21 = var9;
            float var22 = this.method981();
            float var23 = var22 + var21 / 2.0F;
            float var24 = var4.method1479(var17);
            Helper147.method1231(var2, var23, var18, 1.0F, var19, () -> {
               Helper362.method3604(var2, var22, var18 - 4.0F, var21, 12.0F, 4.0F, var8, var25, var26);
               var6.method1474(var2, var20, var22 + 3.5F, var18 + 1.5F, var13);
               var4.method1474(var2, var16.getName(), var22 + 16.0F, var18 + 1.0F, var27);
               var4.method1474(var2, var17, var22 + var21 - var24 - 6.0F, var18 + 1.0F, var13);
            });
            var14 += Math.max(1, (int)(var19 * 14.0F));
         }
      }

      this.method975(var9);
      this.method976(var14);
   }

   private int method326(Helper175 var1, String var2, String var3) {
      return (int)var1.method1479(var2 + var3) + 25;
   }
}
