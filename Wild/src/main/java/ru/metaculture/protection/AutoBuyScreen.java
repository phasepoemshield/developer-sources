package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class AutoBuyScreen extends Screen {
   private static volatile boolean O00000000 = false;
   private static final String[] O000000000 = new String[]{"FunTime", "SpookyTime", "HolyWorld"};
   private static final String[] O0000000000 = new String[]{"FT", "SP", "HW"};
   private final List<String> O00000000000 = Arrays.asList(
      "Сфера Хаоса",
      "Сфера Титана",
      "Сфера Ареса",
      "Сфера Бестии",
      "Талисман Демона",
      "Талисман Карателя",
      "Шлем Крушителя",
      "Нагрудник Крушителя",
      "Поножи Крушителя",
      "Ботинки Крушителя",
      "Меч Крушителя",
      "Кирка Крушителя",
      "Лук Крушителя",
      "Арбалет Крушителя",
      "Трезубец Крушителя",
      "Булава Крушителя",
      "Элитры Крушителя",
      "Удочка Крушителя"
   );
   private final List<String> O000000000000 = Arrays.asList("Явная Пыль", "Дезориентация", "Трапка", "Отмычка к Сферам");
   private final List<String> O0000000000000 = O000000OOOO000.O00000000().stream().map(O000000OOOO000.W120::key).toList();
   private final List<AutoBuyScreen.W208> O000000000000O = new ArrayList<>();
   private final List<AutoBuyScreen.W208> O00000000000O = new ArrayList<>();
   private AutoBuyScreen.W208 O00000000000O0 = null;
   private float O00000000000OO = 0.0F;
   private float O0000000000O = 0.0F;
   private float O0000000000O0 = 0.0F;
   private String O0000000000O00 = null;
   private float O0000000000O0O;
   private float O0000000000OO;
   private float O0000000000OO0;
   private float O0000000000OOO;
   private final int O000000000O = RenderManager.W382.O00000000000(21, 23, 30, 120);
   private final int O000000000O0 = RenderManager.W382.O00000000000(12, 43, 64, 150);
   private final int O000000000O00 = RenderManager.W382.O00000000000(24, 88, 124, 255);
   private final int O000000000O000 = RenderManager.W382.O00000000000(0, 0, 0, 70);

   public AutoBuyScreen() {
      super(Text.literal("AutoBuy Panel"));
      this.O000000000();
      O00000000();
   }

   private void O000000000() {
      this.O000000000000O.clear();
      this.O00000000000O.clear();
      AutoBuy.O00000000O000O.forEach((string, long_) -> this.O000000000000O.add(new AutoBuyScreen.W208(string, String.valueOf(long_))));
      AutoBuy.O00000000O0O.forEach(string -> this.O00000000000O.add(new AutoBuyScreen.W208(string, "")));
   }

   public static void O00000000() {
      if (!O00000000) {
         O00000000 = true;
         EventManager.O00000000(
            new Object() {
               @EventHandler
               public void O00000000(O0000000O00O o0000000O00O) {
                  MinecraftClient var2 = o0000000O00O.O0000000000();
                  if (var2 != null && var2.currentScreen instanceof AutoBuyScreen var3 && var2.getWindow() != null) {
                     int var11 = (int)(var2.mouse.getX() * var2.getWindow().getScaledWidth() / var2.getWindow().getFramebufferWidth());
                     int var5 = (int)(var2.mouse.getY() * var2.getWindow().getScaledHeight() / var2.getWindow().getFramebufferHeight());
                     BlurRenderer var6 = BlurRenderer.O00000000();
                     boolean var7 = var6.O00000000((Object)var3)
                        && var6.O00000000(var2.getWindow().getFramebufferWidth(), var2.getWindow().getFramebufferHeight());

                     try {
                        var3.O00000000(o0000000O00O.O00000000000(), o0000000O00O.O00000000000O(), var11, var5);
                        o0000000O00O.O00000000000().O0000000000();
                     } finally {
                        if (var7) {
                           var6.O0000000000();
                        }
                     }
                  }
               }
            }
         );
      }
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      super.render(context, mouseX, mouseY, deltaTicks);
   }

   public void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j) {
      AutoBuy var5 = (AutoBuy)WildClient.O00000000.O000000000.O000000000(AutoBuy.class);
      if (var5 != null && var5.O0000000000000) {
         float var6 = (float)this.client.getWindow().getFramebufferWidth() / this.client.getWindow().getScaledWidth();
         float var7 = 350.0F;
         float var8 = 180.0F;
         float var9 = 15.0F;
         float var10 = var7 + var9 + var8;
         float var11 = 260.0F;
         float var12 = (this.client.getWindow().getScaledWidth() - var10) / 2.0F;
         float var13 = (this.client.getWindow().getScaledHeight() - var11) / 2.0F;
         o0000O00OO0O0.O0000000000(var6);
         float var15 = var13;
         o0000O00OO0O0.O00000000(23.0F);
         o0000O00OO0O0.O00000000(var12, var13, var7, var11, 6.0F, (float)this.O000000000O);
         o0000O00OO0O0.O00000000(var12, var13, var7, var11, 6.0F, this.O000000000O);
         float var16 = var12 + var7 + var9;
         o0000O00OO0O0.O00000000(23.0F);
         o0000O00OO0O0.O00000000(var16, var13, var8, var11, 6.0F, (float)this.O000000000O);
         o0000O00OO0O0.O00000000(var16, var13, var8, var11, 6.0F, this.O000000000O);
         float var18 = 13.0F;
         float var19 = RenderManager.O00000000(FontRegistry.O00000000000, "D", var18).O00000000;
         float var20 = RenderManager.O00000000(FontRegistry.O00000000, "Autobuy |", var18).O00000000;
         float var21 = var19 + 4.0F + var20 + 8.0F;

         for (String var25 : O0000000000) {
            var21 += RenderManager.O00000000(FontRegistry.O00000000000, var25, var18).O00000000 + 12.0F;
         }

         o0000O00OO0O0.O00000000(var12 + 10.0F, var13 + 10.0F, var21 + 10.0F, 24.0F, 6.0F, RenderManager.W382.O00000000000(20, 20, 25, 200));
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var12 + 18.0F, var13 + 15.0F, var18, "D", RenderManager.W382.O00000000000(80, 90, 160, 255));
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, var12 + 18.0F + var19 + 4.0F, var13 + 15.0F, var18, "Autobuy |", RenderManager.W382.O00000000000(100, 100, 100, 255)
         );
         float var46 = var12 + 18.0F + var19 + 4.0F + var20 + 10.0F;

         for (int var47 = 0; var47 < O000000000.length; var47++) {
            boolean var49 = var5.O000000000O00O.O0000000000().equals(O000000000[var47]);
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000000, var46, var15 + 15.0F, var18, O0000000000[var47], var49 ? -1 : RenderManager.W382.O00000000000(120, 120, 120, 255)
            );
            var46 += RenderManager.O00000000(FontRegistry.O00000000000, O0000000000[var47], var18).O00000000 + 12.0F;
         }

         float var48 = RenderManager.O00000000(FontRegistry.O00000000, "Autopars", var18).O00000000;
         o0000O00OO0O0.O00000000(var16 + 10.0F, var13 + 10.0F, var19 + 4.0F + var48 + 16.0F, 24.0F, 6.0F, RenderManager.W382.O00000000000(20, 20, 25, 200));
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var16 + 18.0F, var13 + 15.0F, var18, "D", RenderManager.W382.O00000000000(80, 90, 160, 255));
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, var16 + 18.0F + var19 + 4.0F, var13 + 15.0F, var18, "Autopars", RenderManager.W382.O00000000000(100, 100, 100, 255)
         );
         float var50 = var15 + 45.0F;
         float var51 = var11 - 55.0F;
         float var26 = 160.0F;
         float var27 = 160.0F;
         float var28 = var12 + 10.0F;
         float var29 = var28 + var26 + 10.0F;
         float var30 = var16 + 10.0F;
         float var31 = var8 - 20.0F;
         o0000O00OO0O0.O00000000(var28, var50, var26 + 10.0F + var27, var51, 6.0F, this.O000000000O0);
         o0000O00OO0O0.O00000000(var30, var50, var31, var51, 6.0F, this.O000000000O0);
         List var32 = this.O00000000(var5);
         o0000O00OO0O0.O00000000(var28, var50, var26, var51, 8.0F, 8.0F, 8.0F, 8.0F);
         float var33 = 32.0F;
         float var34 = 8.0F;
         int var35 = (int)((var26 - 16.0F) / (var33 + var34));
         float var36 = var28 + 10.0F;
         float var37 = var50 + 10.0F + this.O00000000000OO;

         for (int var38 = 0; var38 < var32.size(); var38++) {
            float var39 = var36 + var38 % var35 * (var33 + var34);
            float var40 = var37 + var38 / var35 * (var33 + var34);
            o0000O00OO0O0.O00000000(var39, var40, var33, var33, 6.0F, this.O000000000O000);
            if (drawContext != null) {
               O00000OO000.O00000000(drawContext, (String)var32.get(var38), var39 + 8.0F, var40 + 8.0F);
            }
         }

         o0000O00OO0O0.O0000000000000();
         o0000O00OO0O0.O00000000(var29, var50, var27, var51, 8.0F, 8.0F, 8.0F, 8.0F);
         float var52 = var50 + 10.0F + this.O0000000000O;

         for (int var53 = this.O000000000000O.size() - 1; var53 >= 0; var53--) {
            AutoBuyScreen.W208 var56 = this.O000000000000O.get(var53);
            var56.O0000000000.O00000000();
            var56.O0000000000.O00000000(var56.O00000000000 ? 0.0 : 1.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
            if (var56.O00000000000 && var56.O0000000000.O000000000000() < 0.01F) {
               AutoBuy.O00000000O000O.remove(var56.O00000000);
               this.O000000000000O.remove(var53);
            } else {
               float var41 = 46.0F * var56.O0000000000.O000000000000();
               float var42 = var29 + 8.0F;
               o0000O00OO0O0.O00000000(var42, var52, var27 - 16.0F, var41, 6.0F, this.O000000000O00);
               o0000O00OO0O0.O00000000(var42 + 6.0F, var52 + 6.0F, 34.0F, 34.0F, 4.0F, this.O000000000O000);
               if (drawContext != null) {
                  O00000OO000.O00000000(drawContext, var56.O00000000, var42 + 15.0F, var52 + 15.0F);
               }

               o0000O00OO0O0.O00000000(var42, var52, var27 - 16.0F, var41, 6.0F, 6.0F, 6.0F, 6.0F);
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var42 + 48.0F, var52 + 10.0F, var18, O000000OOOO000.O00000000000(var56.O00000000), -1);
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000, var42 + 48.0F, var52 + 26.0F, 11.0F, "Цена: ", RenderManager.W382.O00000000000(180, 180, 180, 255)
               );
               float var43 = var42 + 48.0F + RenderManager.O00000000(FontRegistry.O00000000, "Цена: ", 11.0F).O00000000;
               boolean var44 = this.O00000000000O0 == var56;
               o0000O00OO0O0.O00000000(var43, var52 + 24.0F, 60.0F, 16.0F, 4.0F, RenderManager.W382.O00000000000(15, 20, 25, 200));
               if (var44) {
                  o0000O00OO0O0.O00000000(var43, var52 + 24.0F, 60.0F, 16.0F, 4.0F, RenderManager.W382.O00000000000(80, 150, 220, 255), 1.0F);
               }

               String var45 = var56.O000000000 + (var44 && System.currentTimeMillis() % 1000L > 500L ? "_" : "");
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var43 + 4.0F, var52 + 26.0F, 11.0F, var45, -1);
               o0000O00OO0O0.O0000000000000();
               var52 += var41 + 8.0F;
            }
         }

         o0000O00OO0O0.O0000000000000();
         o0000O00OO0O0.O00000000(var30, var50, var31, var51, 8.0F, 8.0F, 8.0F, 8.0F);
         if (this.O00000000000O.isEmpty()) {
            float var54 = var30 + var31 / 2.0F;
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000,
               var54 - RenderManager.O00000000(FontRegistry.O00000000, "ДЛЯ ПАРСА ЦЕНЫ У", 11.0F).O00000000 / 2.0F,
               var50 + var51 / 2.0F - 18.0F,
               11.0F,
               "ДЛЯ ПАРСА ЦЕНЫ У",
               RenderManager.W382.O00000000000(80, 110, 130, 180)
            );
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000,
               var54 - RenderManager.O00000000(FontRegistry.O00000000, "ПРЕДМЕТА,", 11.0F).O00000000 / 2.0F,
               var50 + var51 / 2.0F - 4.0F,
               11.0F,
               "ПРЕДМЕТА,",
               RenderManager.W382.O00000000000(80, 110, 130, 180)
            );
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000,
               var54 - RenderManager.O00000000(FontRegistry.O00000000, "ПЕРЕМЕСТИТЕ ЕГО В", 11.0F).O00000000 / 2.0F,
               var50 + var51 / 2.0F + 10.0F,
               11.0F,
               "ПЕРЕМЕСТИТЕ ЕГО В",
               RenderManager.W382.O00000000000(80, 110, 130, 180)
            );
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000,
               var54 - RenderManager.O00000000(FontRegistry.O00000000, "ОДНУ ИЗ ЯЧЕЕК", 11.0F).O00000000 / 2.0F,
               var50 + var51 / 2.0F + 24.0F,
               11.0F,
               "ОДНУ ИЗ ЯЧЕЕК",
               RenderManager.W382.O00000000000(80, 110, 130, 180)
            );
         } else {
            float var55 = var50 + 10.0F + this.O0000000000O0;

            for (int var57 = this.O00000000000O.size() - 1; var57 >= 0; var57--) {
               AutoBuyScreen.W208 var58 = this.O00000000000O.get(var57);
               var58.O0000000000.O00000000();
               var58.O0000000000.O00000000(var58.O00000000000 ? 0.0 : 1.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
               if (var58.O00000000000 && var58.O0000000000.O000000000000() < 0.01F) {
                  AutoBuy.O00000000O0O.remove(var58.O00000000);
                  this.O00000000000O.remove(var57);
               } else {
                  float var59 = 46.0F * var58.O0000000000.O000000000000();
                  float var60 = var30 + 8.0F;
                  o0000O00OO0O0.O00000000(var60, var55, var31 - 16.0F, var59, 6.0F, this.O000000000O00);
                  o0000O00OO0O0.O00000000(var60 + 6.0F, var55 + 6.0F, 34.0F, 34.0F, 4.0F, this.O000000000O000);
                  if (drawContext != null) {
                     O00000OO000.O00000000(drawContext, var58.O00000000, var60 + 15.0F, var55 + 15.0F);
                  }

                  o0000O00OO0O0.O00000000(var60, var55, var31 - 16.0F, var59, 6.0F, 6.0F, 6.0F, 6.0F);
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var60 + 48.0F, var55 + 17.0F, var18, O000000OOOO000.O00000000000(var58.O00000000), -1);
                  o0000O00OO0O0.O0000000000000();
                  var55 += var59 + 8.0F;
               }
            }
         }

         o0000O00OO0O0.O0000000000000();
         if (this.O0000000000O00 != null) {
            o0000O00OO0O0.O00000000(this.O0000000000O0O, this.O0000000000OO, 32.0F, 32.0F, 6.0F, RenderManager.W382.O00000000000(255, 255, 255, 180));
            if (drawContext != null) {
               O00000OO000.O00000000(drawContext, this.O0000000000O00, this.O0000000000O0O + 8.0F, this.O0000000000OO + 8.0F);
            }

            this.O0000000000O0O = i - this.O0000000000OO0;
            this.O0000000000OO = j - this.O0000000000OOO;
         }

         o0000O00OO0O0.O00000000000O();
      } else {
         this.client.setScreen(null);
      }
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      AutoBuy var6 = (AutoBuy)WildClient.O00000000.O000000000.O000000000(AutoBuy.class);
      float var7 = 350.0F;
      float var8 = 180.0F;
      float var9 = 15.0F;
      float var10 = var7 + var9 + var8;
      float var11 = 260.0F;
      float var12 = (this.width - var10) / 2.0F;
      float var13 = (this.height - var11) / 2.0F;
      float var15 = var13;
      float var16 = var12 + var7 + var9;
      float var17 = 13.0F;
      float var18 = RenderManager.O00000000(FontRegistry.O00000000000, "Litka", var17).O00000000;
      float var19 = RenderManager.O00000000(FontRegistry.O00000000, "Autobuy |", var17).O00000000;
      float var20 = var12 + 18.0F + var18 + 4.0F + var19 + 10.0F;

      for (int var21 = 0; var21 < O000000000.length; var21++) {
         float var22 = RenderManager.O00000000(FontRegistry.O00000000000, O0000000000[var21], var17).O00000000;
         if (mouseX >= var20 - 4.0F && mouseX <= var20 + var22 + 6.0F && mouseY >= var15 + 10.0F && mouseY <= var15 + 34.0F) {
            var6.O000000000O00O.O000000000000 = O000000000[var21];
            var6.O000000000O00O.O00000000000O = var6.O000000000O00O.O00000000000.indexOf(O000000000[var21]);
            return true;
         }

         var20 += var22 + 12.0F;
      }

      float var38 = var15 + 45.0F;
      float var39 = var11 - 55.0F;
      float var23 = var12 + 10.0F;
      float var24 = 160.0F;
      float var25 = var23 + var24 + 10.0F;
      float var26 = 160.0F;
      float var27 = var16 + 10.0F;
      float var28 = var8 - 20.0F;
      if (button == 1) {
         if (mouseX >= var25 && mouseX <= var25 + var26 && mouseY >= var38 && mouseY <= var38 + var39) {
            float var29 = var38 + 10.0F + this.O0000000000O;

            for (AutoBuyScreen.W208 var31 : this.O000000000000O) {
               if (mouseY >= var29 && mouseY <= var29 + 46.0F) {
                  var31.O00000000000 = true;
                  return true;
               }

               var29 += 54.0F;
            }
         }

         if (mouseX >= var27 && mouseX <= var27 + var28 && mouseY >= var38 && mouseY <= var38 + var39) {
            float var40 = var38 + 10.0F + this.O0000000000O0;

            for (AutoBuyScreen.W208 var46 : this.O00000000000O) {
               if (mouseY >= var40 && mouseY <= var40 + 46.0F) {
                  var46.O00000000000 = true;
                  return true;
               }

               var40 += 54.0F;
            }
         }
      }

      this.O00000000000O0 = null;
      if (button == 0) {
         float var41 = var38 + 10.0F + this.O0000000000O;

         for (AutoBuyScreen.W208 var47 : this.O000000000000O) {
            if (mouseY >= var41 + 24.0F && mouseY <= var41 + 40.0F && mouseX >= var25 + 48.0F && mouseX <= var25 + 150.0F) {
               this.O00000000000O0 = var47;
               return true;
            }

            var41 += 54.0F;
         }
      }

      if (button == 0 && mouseX >= var23 && mouseX <= var23 + var24 && mouseY >= var38 && mouseY <= var38 + var39) {
         List var42 = this.O00000000(var6);
         float var45 = 32.0F;
         float var48 = 8.0F;
         int var32 = (int)((var24 - 16.0F) / (var45 + var48));
         float var33 = var23 + 10.0F;
         float var34 = var38 + 10.0F + this.O00000000000OO;

         for (int var35 = 0; var35 < var42.size(); var35++) {
            float var36 = var33 + var35 % var32 * (var45 + var48);
            float var37 = var34 + var35 / var32 * (var45 + var48);
            if (mouseX >= var36 && mouseX <= var36 + var45 && mouseY >= var37 && mouseY <= var37 + var45) {
               this.O0000000000O00 = (String)var42.get(var35);
               this.O0000000000OO0 = (float)mouseX - var36;
               this.O0000000000OOO = (float)mouseY - var37;
               this.O0000000000O0O = var36;
               this.O0000000000OO = var37;
               return true;
            }
         }
      }

      return super.mouseClicked(mouseX, mouseY, button);
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      if (this.O0000000000O00 != null && button == 0) {
         float var6 = 350.0F;
         float var7 = 180.0F;
         float var8 = 15.0F;
         float var9 = var6 + var8 + var7;
         float var10 = 260.0F;
         float var11 = (this.width - var9) / 2.0F;
         float var12 = (this.height - var10) / 2.0F;
         float var13 = var12 + 45.0F;
         float var14 = var10 - 55.0F;
         float var15 = var11 + 10.0F + 160.0F + 10.0F;
         float var16 = 160.0F;
         float var17 = var11 + var6 + var8 + 10.0F;
         float var18 = var7 - 20.0F;
         if (mouseX >= var15 && mouseX <= var15 + var16 && mouseY >= var13 && mouseY <= var13 + var14) {
            if (this.O000000000000O.stream().noneMatch(o00000000 -> o00000000.O00000000.equals(this.O0000000000O00))) {
               this.O000000000000O.add(new AutoBuyScreen.W208(this.O0000000000O00, ""));
               AutoBuy.O00000000O000O.put(this.O0000000000O00, 0L);
            }
         } else if (mouseX >= var17
            && mouseX <= var17 + var18
            && mouseY >= var13
            && mouseY <= var13 + var14
            && this.O00000000000O.stream().noneMatch(o00000000 -> o00000000.O00000000.equals(this.O0000000000O00))) {
            this.O00000000000O.add(new AutoBuyScreen.W208(this.O0000000000O00, ""));
            if (!AutoBuy.O00000000O0O.contains(this.O0000000000O00)) {
               AutoBuy.O00000000O0O.add(this.O0000000000O00);
            }
         }

         this.O0000000000O00 = null;
         return true;
      } else {
         return super.mouseReleased(mouseX, mouseY, button);
      }
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      float var9 = 350.0F;
      float var10 = 180.0F;
      float var11 = 15.0F;
      float var12 = var9 + var11 + var10;
      float var13 = 260.0F;
      float var14 = (this.width - var12) / 2.0F;
      float var15 = (this.height - var13) / 2.0F;
      float var16 = var15 + 45.0F;
      float var17 = var13 - 55.0F;
      float var18 = var14 + 10.0F;
      float var19 = 160.0F;
      float var20 = var18 + var19 + 10.0F;
      float var21 = 160.0F;
      float var22 = var14 + var9 + var11 + 10.0F;
      float var23 = var10 - 20.0F;
      if (mouseX >= var18 && mouseX <= var18 + var19 && mouseY >= var16 && mouseY <= var16 + var17) {
         this.O00000000000OO += (float)(verticalAmount * 22.0);
         if (this.O00000000000OO > 0.0F) {
            this.O00000000000OO = 0.0F;
         }
      } else if (mouseX >= var20 && mouseX <= var20 + var21 && mouseY >= var16 && mouseY <= var16 + var17) {
         this.O0000000000O += (float)(verticalAmount * 22.0);
         if (this.O0000000000O > 0.0F) {
            this.O0000000000O = 0.0F;
         }
      } else if (mouseX >= var22 && mouseX <= var22 + var23 && mouseY >= var16 && mouseY <= var16 + var17) {
         this.O0000000000O0 += (float)(verticalAmount * 22.0);
         if (this.O0000000000O0 > 0.0F) {
            this.O0000000000O0 = 0.0F;
         }
      }

      return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   public boolean charTyped(char chr, int modifiers) {
      if (this.O00000000000O0 != null && Character.isDigit(chr) && this.O00000000000O0.O000000000.length() < 12) {
         this.O00000000000O0.O000000000 = this.O00000000000O0.O000000000 + chr;
         this.O00000000(this.O00000000000O0);
         return true;
      } else {
         return super.charTyped(chr, modifiers);
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (this.O00000000000O0 != null) {
         if (keyCode == 259 && !this.O00000000000O0.O000000000.isEmpty()) {
            this.O00000000000O0.O000000000 = this.O00000000000O0.O000000000.substring(0, this.O00000000000O0.O000000000.length() - 1);
            this.O00000000(this.O00000000000O0);
            return true;
         }

         if (keyCode == 257 || keyCode == 256) {
            this.O00000000000O0 = null;
            return true;
         }
      }

      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   private List<String> O00000000(AutoBuy o000000OO00O0O) {
      if (o000000OO00O0O.O000000000O00O.O0000000000().equals("SpookyTime")) {
         return this.O000000000000;
      } else {
         return o000000OO00O0O.O000000000O00O.O0000000000().equals("HolyWorld") ? this.O0000000000000 : this.O00000000000;
      }
   }

   private void O00000000(AutoBuyScreen.W208 o00000000) {
      try {
         if (this.O000000000000O.contains(o00000000)) {
            long var2 = o00000000.O000000000.isEmpty() ? 0L : Long.parseLong(o00000000.O000000000);
            AutoBuy.O00000000O000O.put(o00000000.O00000000, var2);
         }

         if (WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O0000000000();
         }
      } catch (Exception var4) {
      }
   }

   public boolean shouldPause() {
      return false;
   }

   class W208 {
      String O00000000;
      String O000000000;
      O0000O00O0OO O0000000000 = new O0000O00O0OO();
      boolean O00000000000 = false;

      W208(String string, String string2) {
         this.O00000000 = string;
         this.O000000000 = string2;
      }
   }
}
