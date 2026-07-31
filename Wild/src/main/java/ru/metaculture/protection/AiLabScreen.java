package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;

public final class AiLabScreen extends Screen {
   private static volatile boolean O00000000;
   private static final String[] O000000000 = new String[]{"Аналитика", "Обучение", "Сравнение"};
   private static final float O0000000000 = 52.0F;
   private static final float O00000000000 = 28.0F;
   private static final float O000000000000 = 30.0F;
   private static final float O0000000000000 = 28.0F;
   private static final float O000000000000O = 28.0F;
   private static final float O00000000000O = 24.0F;
   private static final float O00000000000O0 = 22.0F;
   private static final float O00000000000OO = 28.0F;
   private final O0000O00O0OO O0000000000O = new O0000O00O0OO();
   private final List<AiLabScreen.W204> O0000000000O0 = new ArrayList<>();
   private final List<AiLabScreen.W207> O0000000000O00 = new ArrayList<>();
   private float O0000000000O0O;
   private float O0000000000OO;
   private float O0000000000OO0 = 1.0F;
   private float O0000000000OOO;
   private float O000000000O;
   private boolean O000000000O0;
   private int O000000000O00;
   private AiLabScreen.W207 O000000000O000;
   private O000000O0OOO0O O000000000O00O;
   private long O000000000O0O;
   private AiLabScreen.W203 O000000000O0O0 = new AiLabScreen.W203(0.0F, 0.0F, 0.0F, 0.0F);
   private AiLabScreen.W203 O000000000O0OO = new AiLabScreen.W203(0.0F, 0.0F, 0.0F, 0.0F);
   private final AiLabScreen.W203[] O000000000OO = new AiLabScreen.W203[]{
      new AiLabScreen.W203(0.0F, 0.0F, 0.0F, 0.0F), new AiLabScreen.W203(0.0F, 0.0F, 0.0F, 0.0F), new AiLabScreen.W203(0.0F, 0.0F, 0.0F, 0.0F)
   };

   public AiLabScreen() {
      super(Text.literal("AI Lab"));
      O0000000000();
      this.O00000000();
   }

   private void O00000000() {
      this.O000000000O00O = O000000O0O0O00.O0000000000000();
      this.O000000000O0O = System.currentTimeMillis();
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      this.O00000000(this.O00000000((double)mouseX), this.O000000000((double)mouseY));
      super.render(context, mouseX, mouseY, deltaTicks);
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public void O00000000(RenderManager o0000O00OO0O0, int i, int j) {
      if (o0000O00OO0O0 != null && i > 0 && j > 0) {
         this.O00000000000();
         long var4 = System.currentTimeMillis();
         if (!O000000O0O0O00.O000000000O0OO() && var4 - this.O000000000O0O > 2000L) {
            this.O00000000();
         }

         this.O0000000000O.O00000000();
         this.O0000000000O
            .O00000000(
               this.O000000000O0 ? 0.0 : 1.0,
               this.O000000000O0 ? 0.18F : 0.22F,
               this.O000000000O0 ? O0000O00O0OO0O.O0000000000O00 : O0000O00O0OO0O.O000000000OOOO,
               false
            );
         float var6 = O00000000(this.O0000000000O.O000000000000(), 0.0F, 1.0F);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, O00000000(0, 0, 0, Math.round(170.0F * var6)));
         o0000O00OO0O0.O000000000000(var6);
         float var7 = (0.97F + 0.03F * var6) * 0.9F;
         this.O0000000000OO0 = var7;
         this.O0000000000OOO = i * 0.5F;
         this.O000000000O = j * 0.5F;
         o0000O00OO0O0.O0000000000(var7, var7, i * 0.5F, j * 0.5F);
         float var8 = O00000000(i - 80.0F, 900.0F, 1120.0F);
         float var9 = O00000000(j - 70.0F, 600.0F, 780.0F);
         float var10 = (i - var8) * 0.5F;
         float var11 = (j - var9) * 0.5F;
         this.O000000000O0O0 = new AiLabScreen.W203(var10, var11, var8, var9);
         o0000O00OO0O0.O00000000(20.0F);
         o0000O00OO0O0.O00000000(var10, var11, var8, var9, 18.0F, 1.0F);
         o0000O00OO0O0.O00000000(var10, var11, var8, var9, 18.0F, O00000000(13, 15, 21, 186));
         o0000O00OO0O0.O00000000(var10, var11, var8, var9, 18.0F, O00000000(255, 255, 255, 26), 2.0F);
         this.O0000000000O0.clear();
         this.O0000000000O00.clear();
         this.O00000000(o0000O00OO0O0);
         this.O000000000(o0000O00OO0O0);
         float var12 = var10 + 24.0F;
         float var13 = var11 + 170.0F;
         float var14 = var8 - 48.0F;
         float var15 = var9 - 170.0F - 24.0F;
         switch (this.O000000000O00) {
            case 1:
               this.O000000000(o0000O00OO0O0, var12, var13, var14, var15);
               break;
            case 2:
               this.O0000000000(o0000O00OO0O0, var12, var13, var14, var15);
               break;
            default:
               this.O00000000(o0000O00OO0O0, var12, var13, var14, var15);
         }

         o0000O00OO0O0.O00000000000O0();
         o0000O00OO0O0.O00000000000OO();
         if (this.O000000000O0 && var6 <= 0.015F) {
            MinecraftClient.getInstance().execute(() -> {
               if (MinecraftClient.getInstance().currentScreen == this) {
                  MinecraftClient.getInstance().setScreen(null);
               }
            });
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0) {
      float var2 = this.O000000000O0O0.O00000000 + 24.0F;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var2, this.O000000000O0O0.O000000000 + 54.0F, 52.0F, "AI Lab", O00000000(245, 248, 255, 246));
      String var3 = "Профиль " + O000000O0O0O00.O000000000OOOO() + "  •  " + O000000O0O0O00.O000000000OO00();
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var2, this.O000000000O0O0.O000000000 + 88.0F, 28.0F, var3, O00000000(150, 160, 178, 220));
      float var4 = 44.0F;
      this.O000000000O0OO = new AiLabScreen.W203(
         this.O000000000O0O0.O00000000 + this.O000000000O0O0.O0000000000 - var4 - 18.0F, this.O000000000O0O0.O000000000 + 18.0F, var4, var4
      );
      boolean var5 = this.O000000000O0OO.O00000000(this.O0000000000O0O, this.O0000000000OO);
      o0000O00OO0O0.O00000000(
         this.O000000000O0OO.O00000000,
         this.O000000000O0OO.O000000000,
         var4,
         var4,
         10.0F,
         O00000000(var5 ? 235 : 40, var5 ? 80 : 44, var5 ? 92 : 52, var5 ? 235 : 150)
      );
      this.O00000000(o0000O00OO0O0, "X", this.O000000000O0OO, 30.0F, O00000000(245, 245, 250, 240));
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      float var2 = this.O000000000O0O0.O00000000 + 24.0F;
      float var3 = this.O000000000O0O0.O000000000 + 108.0F;
      float var4 = 200.0F;
      float var5 = 46.0F;

      for (int var6 = 0; var6 < O000000000.length; var6++) {
         AiLabScreen.W203 var7 = new AiLabScreen.W203(var2 + var6 * (var4 + 10.0F), var3, var4, var5);
         this.O000000000OO[var6] = var7;
         boolean var8 = this.O000000000O00 == var6;
         boolean var9 = var7.O00000000(this.O0000000000O0O, this.O0000000000OO);
         int var10 = var8 ? O00000000(96, 150, 240, 210) : O00000000(255, 255, 255, var9 ? 26 : 14);
         o0000O00OO0O0.O00000000(var7.O00000000, var7.O000000000, var7.O0000000000, var7.O00000000000, 10.0F, var10);
         this.O00000000(o0000O00OO0O0, O000000000[var6], var7, 30.0F, var8 ? O00000000(255, 255, 255, 246) : O00000000(180, 188, 204, 220));
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O000000O0OOO0O var6 = this.O000000000O00O;
      if (var6 != null && var6.O00000000) {
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000,
            f,
            g + 22.0F,
            28.0F,
            "Кадров "
               + var6.O0000000000
               + "   Удары "
               + var6.O00000000000
               + "   Промахи "
               + Math.round(var6.O000000000000O * 100.0F)
               + "%   Сенса "
               + String.format(Locale.ROOT, "%.2f", var6.O00000000000O)
               + "   Дист "
               + O0000000000(var6.O00000000000O0)
               + "-"
               + O0000000000(var6.O00000000000OO)
               + "м",
            O00000000(200, 208, 222, 230)
         );
         float var7 = (h - 18.0F) * 0.5F;
         float var8 = g + 44.0F;
         float var9 = (i - 44.0F - 18.0F) * 0.5F - 9.0F;
         this.O00000000(o0000O00OO0O0, f, var8, var7, var9, var6);
         this.O000000000(o0000O00OO0O0, f + var7 + 18.0F, var8, var7, var9, var6);
         float var10 = var8 + var9 + 18.0F;
         this.O00000000(o0000O00OO0O0, f, var10, var7, var9, "Yaw дельты", var6.O000000000O, var6.O000000000O00, O00000000(110, 200, 255, 255));
         this.O00000000(
            o0000O00OO0O0, f + var7 + 18.0F, var10, var7, var9, "Pitch дельты", var6.O000000000O0, var6.O000000000O000, O00000000(255, 156, 86, 255)
         );
      } else {
         this.O000000000(o0000O00OO0O0, f, g, h, i, "Нет записи. Вкладка Обучение -> Запись, затем вернись.");
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, O000000O0OOO0O o000000O0OOO0O) {
      this.O00000000(o0000O00OO0O0, f, g, h, i, "Дистанция: распределение");
      float var7 = f + 16.0F;
      float var8 = g + 44.0F;
      float var9 = h - 32.0F;
      float var10 = i - 58.0F;
      int var11 = Math.max(1, o000000O0OOO0O.O0000000000O00[0] + o000000O0OOO0O.O0000000000O00[1] + o000000O0OOO0O.O0000000000O00[2]);
      String[] var12 = new String[]{"Близко <" + O0000000000(o000000O0OOO0O.O0000000000O), "Средне", "Далеко >" + O0000000000(o000000O0OOO0O.O0000000000O0)};
      int[] var13 = new int[]{O00000000(92, 235, 182, 255), O00000000(110, 200, 255, 255), O00000000(255, 156, 86, 255)};
      float var14 = var9 / 3.0F - 14.0F;

      for (int var15 = 0; var15 < 3; var15++) {
         float var16 = (float)o000000O0OOO0O.O0000000000O00[var15] / var11;
         float var17 = var7 + var15 * (var9 / 3.0F) + 7.0F;
         float var18 = Math.max(3.0F, var16 * (var10 - 28.0F));
         o0000O00OO0O0.O00000000(var17, var8 + var10 - 26.0F - var18, var14, var18, 5.0F, var13[var15]);
         String var19 = Math.round(var16 * 100.0F) + "%";
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var17, var8 + var10 - 2.0F, 22.0F, var12[var15], O00000000(170, 178, 194, 220));
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var17, var8 + var10 - 30.0F - var18, 24.0F, var19, O00000000(235, 240, 250, 235));
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, O000000O0OOO0O o000000O0OOO0O) {
      this.O00000000(o0000O00OO0O0, f, g, h, i, "Скорость аима <-> дистанция");
      float var7 = f + 16.0F;
      float var8 = g + 44.0F;
      float var9 = h - 32.0F;
      float var10 = i - 64.0F;
      float var11 = Math.max(1.0F, o000000O0OOO0O.O0000000000OO0);
      int var12 = o000000O0OOO0O.O0000000000OO == null ? 0 : o000000O0OOO0O.O0000000000OO.length;
      float var13 = var12 > 0 ? var9 / var12 : var9;

      for (int var14 = 0; var14 < var12; var14++) {
         float var15 = o000000O0OOO0O.O0000000000OO[var14] / var11;
         float var16 = Math.max(1.0F, var15 * (var10 - 4.0F));
         o0000O00OO0O0.O00000000(var7 + var14 * var13, var8 + var10 - var16, Math.max(1.0F, var13 * 0.85F), var16, 0.0F, O00000000(120, 170, 255, 230));
      }

      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000, var7, var8 + var10 + 18.0F, 22.0F, O0000000000(o000000O0OOO0O.O00000000000O0) + "м", O00000000(150, 158, 174, 200)
      );
      String var17 = O0000000000(o000000O0OOO0O.O00000000000OO) + "м";
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         var7 + var9 - TextMeasureCache.O000000000(FontRegistry.O00000000, var17, 22.0F),
         var8 + var10 + 18.0F,
         22.0F,
         var17,
         O00000000(150, 158, 174, 200)
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, String string, int[] is, int j, int k) {
      this.O00000000(o0000O00OO0O0, f, g, h, i, string);
      if (is != null) {
         float var10 = f + 16.0F;
         float var11 = g + 44.0F;
         float var12 = h - 32.0F;
         float var13 = i - 58.0F;
         float var14 = var12 / is.length;
         float var15 = Math.max(1.0F, (float)j);

         for (int var16 = 0; var16 < is.length; var16++) {
            float var17 = Math.max(1.0F, is[var16] / var15 * (var13 - 2.0F));
            o0000O00OO0O0.O00000000(var10 + var16 * var14, var11 + var13 - var17, Math.max(1.0F, var14 * 0.8F), var17, 0.0F, k);
         }

         o0000O00OO0O0.O00000000(var10 + var12 * 0.5F - 0.5F, var11, 1.0F, var13, O00000000(255, 255, 255, 40));
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      List var6 = O000000O0O0O00.O00000000O();
      String var7 = O000000O0O0O00.O000000000OOOO();
      this.O00000000(o0000O00OO0O0, f, g, h, 86.0F, "Профиль");
      AiLabScreen.W203 var8 = new AiLabScreen.W203(f + 16.0F, g + 40.0F, 38.0F, 34.0F);
      AiLabScreen.W203 var9 = new AiLabScreen.W203(f + 16.0F + 44.0F, g + 40.0F, 220.0F, 34.0F);
      AiLabScreen.W203 var10 = new AiLabScreen.W203(var9.O00000000 + var9.O0000000000 + 8.0F, g + 40.0F, 38.0F, 34.0F);
      this.O00000000(o0000O00OO0O0, var8, "<", false, false, () -> this.O00000000(var6, -1));
      o0000O00OO0O0.O00000000(var9.O00000000, var9.O000000000, var9.O0000000000, var9.O00000000000, 7.0F, O00000000(255, 255, 255, 16));
      this.O00000000(o0000O00OO0O0, var7, var9, 28.0F, O00000000(235, 240, 250, 235));
      this.O00000000(o0000O00OO0O0, var10, ">", false, false, () -> this.O00000000(var6, 1));
      float var11 = g + 104.0F;
      float var12 = (h - 24.0F) / 4.0F - 8.0F;
      boolean var13 = O000000O0O0O00.O000000000O0OO();
      boolean var14 = O000000O0O0O00.O000000000OO();
      boolean var15 = O000000O0O0O00.O000000000OOO0();
      this.O00000000(o0000O00OO0O0, new AiLabScreen.W203(f, var11, var12, 42.0F), var13 ? "Запись..." : "Запись", false, var13, O000000O0O0O00::O00000000);
      this.O00000000(o0000O00OO0O0, new AiLabScreen.W203(f + (var12 + 10.0F), var11, var12, 42.0F), "Стоп", true, false, () -> {
         O000000O0O0O00.O000000000();
         this.O00000000();
      });
      this.O00000000(
         o0000O00OO0O0,
         new AiLabScreen.W203(f + (var12 + 10.0F) * 2.0F, var11, var12, 42.0F),
         var15 ? "Обучение..." : "Обучить",
         false,
         var15,
         O000000O0O0O00::O00000000000
      );
      this.O00000000(
         o0000O00OO0O0, new AiLabScreen.W203(f + (var12 + 10.0F) * 3.0F, var11, var12, 42.0F), var14 ? "Идёт" : "Запуск", false, var14, this::O000000000
      );
      float var16 = var11 + 58.0F;
      this.O00000000(o0000O00OO0O0, f, var16, h, 120.0F, "Параметры");
      this.O00000000(
         o0000O00OO0O0,
         new AiLabScreen.W203(f + 16.0F, var16 + 46.0F, h - 32.0F, 30.0F),
         "AI Jitter (сила твоей тряски)",
         0.0F,
         2.0F,
         false,
         AttackAura.O000000000O00O::O0000000000,
         AttackAura.O000000000O00O::O00000000
      );
      AiLabScreen.W203 var17 = new AiLabScreen.W203(f + 16.0F, var16 + 84.0F, 230.0F, 28.0F);
      boolean var18 = AttackAura.O000000000O0O.O0000000000();
      this.O00000000(
         o0000O00OO0O0,
         var17,
         var18 ? "Логи: ВКЛ" : "Логи: ВЫКЛ",
         false,
         var18,
         () -> AttackAura.O000000000O0O.O000000000(!AttackAura.O000000000O0O.O0000000000())
      );
      AiLabScreen.W203 var19 = new AiLabScreen.W203(var17.O00000000 + var17.O0000000000 + 12.0F, var16 + 84.0F, 260.0F, 28.0F);
      boolean var20 = AttackAura.O000000000O0O0.O0000000000();
      this.O00000000(
         o0000O00OO0O0,
         var19,
         var20 ? "Промахи: ВКЛ" : "Промахи: ВЫКЛ",
         false,
         var20,
         () -> AttackAura.O000000000O0O0.O000000000(!AttackAura.O000000000O0O0.O0000000000())
      );
      O000000O0OOO0O var21 = this.O000000000O00O;
      float var22 = var16 + 132.0F;
      String var23 = var21 != null && var21.O00000000 ? String.valueOf(var21.O0000000000) : "-";
      String var24 = O000000O0O0O00.O0000000000O0O() < 0.0F ? "-" : String.format(Locale.ROOT, "%.4f", O000000O0O0O00.O0000000000O0O());
      String var25 = var21 != null && var21.O00000000
         ? "[" + var21.O0000000000O00[0] + "," + var21.O0000000000O00[1] + "," + var21.O0000000000O00[2] + "]"
         : "-";
      String var26 = var21 != null && var21.O00000000 ? Math.round(var21.O000000000000O * 100.0F) + "%" : "-";
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         f,
         var22 + 12.0F,
         28.0F,
         "Кадров " + var23 + "   Loss " + var24 + "   Бакеты " + var25 + "   Промахи " + var26,
         O00000000(195, 204, 220, 230)
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         f,
         var22 + 44.0F,
         24.0F,
         "Совет: пиши на РАЗНЫХ дистанциях и веди по таргету плавно, не только флик.",
         O00000000(150, 158, 176, 205)
      );
   }

   private void O0000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O000000O0OOO0O var6 = this.O000000000O00O;
      if (var6 != null && var6.O00000000) {
         float var7 = (i - 18.0F) * 0.5F - 6.0F;
         this.O00000000(o0000O00OO0O0, f, g, h, var7, "Yaw: ты vs нейросеть", var6.O000000000O0O0, var6.O000000000OO00 ? var6.O000000000OO : null);
         this.O00000000(
            o0000O00OO0O0, f, g + var7 + 18.0F, h, var7, "Pitch: ты vs нейросеть", var6.O000000000O0OO, var6.O000000000OO00 ? var6.O000000000OO0 : null
         );
         if (!var6.O000000000OO00) {
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000, f + 16.0F, g + 34.0F, 24.0F, "Модель не обучена — оранжевой линии нет. Жми Обучить.", O00000000(255, 180, 110, 230)
            );
         } else {
            String var8 = var6.O000000000OO0O < 0.0F ? "-" : String.format(Locale.ROOT, "%.4f", var6.O000000000OO0O);
            String var9 = "Loss " + var8;
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000,
               f + h - TextMeasureCache.O000000000(FontRegistry.O00000000, var9, 24.0F) - 16.0F,
               g + 34.0F,
               24.0F,
               var9,
               O00000000(150, 200, 255, 230)
            );
         }
      } else {
         this.O000000000(o0000O00OO0O0, f, g, h, i, "Нет данных. Сначала запись и обучение.");
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, String string, float[] fs, float[] gs) {
      this.O00000000(o0000O00OO0O0, f, g, h, i, string);
      float var9 = f + 14.0F;
      float var10 = g + 42.0F;
      float var11 = h - 28.0F;
      float var12 = i - 64.0F;
      float var13 = var10 + var12 * 0.5F;
      o0000O00OO0O0.O00000000(var9, var13 - 0.5F, var11, 1.0F, O00000000(255, 255, 255, 36));
      float var14 = 6.0F;
      if (fs != null) {
         for (float var18 : fs) {
            var14 = Math.max(var14, Math.abs(var18));
         }
      }

      if (gs != null) {
         for (float var23 : gs) {
            var14 = Math.max(var14, Math.abs(var23));
         }
      }

      var14 = Math.min(var14, 35.0F);
      this.O00000000(o0000O00OO0O0, var9, var13, var11, var12 * 0.5F - 2.0F, fs, var14, O00000000(120, 210, 255, 235));
      this.O00000000(o0000O00OO0O0, var9, var13, var11, var12 * 0.5F - 2.0F, gs, var14, O00000000(255, 150, 90, 235));
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var9, var10 + var12 + 18.0F, 22.0F, "ты", O00000000(120, 210, 255, 220));
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var9 + 48.0F, var10 + var12 + 18.0F, 22.0F, "нейросеть", O00000000(255, 150, 90, 220));
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float[] fs, float j, int k) {
      if (fs != null && fs.length != 0) {
         float var9 = h / fs.length;
         float var10 = i / j;

         for (int var11 = 0; var11 < fs.length; var11++) {
            float var12 = MathHelper.clamp(fs[var11] * var10, -i, i);
            if (var12 >= 0.0F) {
               o0000O00OO0O0.O00000000(f + var11 * var9, g - var12, Math.max(1.0F, var9 * 0.8F), var12, k);
            } else {
               o0000O00OO0O0.O00000000(f + var11 * var9, g, Math.max(1.0F, var9 * 0.8F), -var12, k);
            }
         }
      }
   }

   private void O000000000() {
      O000000O0O0O00.O0000000000();
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null && AttackAura.O000000000O00.O00000000000.contains("AI")) {
         AttackAura.O000000000O00.O000000000000 = "AI";
         AttackAura.O000000000O00.O00000000000O = AttackAura.O000000000O00.O00000000000.indexOf("AI");
         AttackAura var1 = WildClient.O00000000.O000000000.O00000000(AttackAura.class);
         if (var1 != null && !var1.O0000000000000) {
            var1.O00000000(true);
         }
      }
   }

   private void O00000000(List<String> list, int i) {
      if (list != null && !list.isEmpty()) {
         int var3 = list.indexOf(O000000O0O0O00.O000000000OOOO());
         var3 = Math.floorMod((var3 < 0 ? 0 : var3) + i, list.size());
         O000000O0O0O00.O000000000((String)list.get(var3));
         this.O00000000();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, String string) {
      o0000O00OO0O0.O00000000(f, g, h, i, 12.0F, O00000000(255, 255, 255, 12));
      o0000O00OO0O0.O00000000(f, g, h, i, 12.0F, O00000000(255, 255, 255, 22), 1.0F);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, f + 16.0F, g + 26.0F, 28.0F, string, O00000000(210, 218, 232, 235));
   }

   private void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, String string) {
      float var7 = TextMeasureCache.O000000000(FontRegistry.O00000000, string, 28.0F);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, f + (h - var7) * 0.5F, g + i * 0.5F, 28.0F, string, O00000000(170, 178, 196, 220));
   }

   private void O00000000(RenderManager o0000O00OO0O0, AiLabScreen.W203 o00000000, String string, boolean bl, boolean bl2, Runnable runnable) {
      boolean var7 = o00000000.O00000000(this.O0000000000O0O, this.O0000000000OO);
      int var8;
      if (bl2) {
         var8 = O00000000(96, 150, 240, 220);
      } else if (bl) {
         var8 = O00000000(var7 ? 230 : 150, var7 ? 78 : 52, var7 ? 90 : 60, var7 ? 230 : 170);
      } else {
         var8 = O00000000(255, 255, 255, var7 ? 34 : 18);
      }

      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 8.0F, var8);
      this.O00000000(o0000O00OO0O0, string, o00000000, 28.0F, O00000000(238, 242, 250, 240));
      this.O0000000000O0.add(new AiLabScreen.W204(o00000000, runnable));
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      AiLabScreen.W203 o00000000,
      String string,
      float f,
      float g,
      boolean bl,
      AiLabScreen.W205 o0000000000,
      AiLabScreen.W206 o00000000000
   ) {
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         o00000000.O00000000,
         o00000000.O000000000 - 6.0F,
         24.0F,
         string + "  " + String.format(Locale.ROOT, "%.2f", o0000000000.get()),
         O00000000(190, 198, 214, 225)
      );
      float var9 = o00000000.O000000000 + 16.0F;
      o0000O00OO0O0.O00000000(o00000000.O00000000, var9, o00000000.O0000000000, 6.0F, 3.0F, O00000000(255, 255, 255, 30));
      float var10 = O00000000((o0000000000.get() - f) / (g - f), 0.0F, 1.0F);
      o0000O00OO0O0.O00000000(o00000000.O00000000, var9, o00000000.O0000000000 * var10, 6.0F, 3.0F, O00000000(110, 170, 255, 235));
      o0000O00OO0O0.O000000000(o00000000.O00000000 + o00000000.O0000000000 * var10, var9 + 3.0F, 8.0F, 0.0F, 360.0F, O00000000(235, 242, 255, 245));
      this.O0000000000O00
         .add(
            new AiLabScreen.W207(
               string, f, g, bl, o0000000000, o00000000000, new AiLabScreen.W203(o00000000.O00000000, var9 - 12.0F, o00000000.O0000000000, 30.0F)
            )
         );
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, AiLabScreen.W203 o00000000, float f, int i) {
      float var6 = TextMeasureCache.O000000000(FontRegistry.O00000000, string, f);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         o00000000.O00000000 + (o00000000.O0000000000 - var6) * 0.5F,
         o00000000.O000000000 + o00000000.O00000000000 * 0.5F + f * 0.2F,
         f,
         string,
         i
      );
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      float var6 = this.O00000000(this.O00000000(mouseX));
      float var7 = this.O000000000(this.O000000000(mouseY));
      if (this.O000000000O0OO.O00000000(var6, var7)) {
         this.close();
         return true;
      } else {
         for (int var8 = 0; var8 < this.O000000000OO.length; var8++) {
            if (this.O000000000OO[var8].O00000000(var6, var7)) {
               this.O000000000O00 = var8;
               return true;
            }
         }

         for (AiLabScreen.W207 var9 : this.O0000000000O00) {
            if (var9.O000000000000O.O00000000(var6, var7)) {
               this.O000000000O000 = var9;
               var9.O00000000(var6);
               return true;
            }
         }

         for (AiLabScreen.W204 var12 : this.O0000000000O0) {
            if (var12.bounds().O00000000(var6, var7)) {
               var12.action().run();
               return true;
            }
         }

         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      this.O000000000O000 = null;
      return super.mouseReleased(mouseX, mouseY, button);
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      if (this.O000000000O000 != null) {
         this.O000000000O000.O00000000(this.O00000000(this.O00000000(mouseX)));
         return true;
      } else {
         return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         this.close();
         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   public void close() {
      this.O000000000O0 = true;
   }

   public boolean shouldPause() {
      return false;
   }

   private static void O0000000000() {
      if (!O00000000) {
         O00000000 = true;
         EventManager.O00000000(new Object() {
            @EventHandler
            public void O00000000(O0000000O00O o0000000O00O) {
               if (o0000000O00O.O0000000000() != null && o0000000O00O.O0000000000().currentScreen instanceof AiLabScreen var2) {
                  var2.O00000000(o0000000O00O.O00000000000(), o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
                  if (o0000000O00O.O00000000000() != null) {
                     o0000000O00O.O00000000000().O0000000000();
                  }
               }
            }
         });
      }
   }

   private void O00000000(float f, float g) {
      this.O0000000000O0O = this.O00000000(f);
      this.O0000000000OO = this.O000000000(g);
   }

   private float O00000000(float f) {
      return this.O0000000000OO0 <= 0.0F ? f : (f - this.O0000000000OOO) / this.O0000000000OO0 + this.O0000000000OOO;
   }

   private float O000000000(float f) {
      return this.O0000000000OO0 <= 0.0F ? f : (f - this.O000000000O) / this.O0000000000OO0 + this.O000000000O;
   }

   private void O00000000000() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null && var1.getWindow() != null && var1.mouse != null) {
         double var2 = var1.getWindow().getFramebufferWidth();
         double var4 = var1.getWindow().getFramebufferHeight();
         if (!(var2 <= 0.0) && !(var4 <= 0.0)) {
            double var6 = var1.mouse.getX();
            double var8 = var1.mouse.getY();
            if (var6 >= 0.0 && var8 >= 0.0 && var6 <= var2 + 2.0 && var8 <= var4 + 2.0) {
               this.O00000000((float)var6, (float)var8);
            }
         }
      }
   }

   private float O00000000(double d) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3 != null && var3.getWindow() != null) {
         int var4 = var3.getWindow().getFramebufferWidth();
         int var5 = var3.getWindow().getScaledWidth();
         return var4 > 0 && var5 > 0 ? (float)(d * var4 / Math.max(1.0, (double)var5)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private float O000000000(double d) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3 != null && var3.getWindow() != null) {
         int var4 = var3.getWindow().getFramebufferHeight();
         int var5 = var3.getWindow().getScaledHeight();
         return var4 > 0 && var5 > 0 ? (float)(d * var4 / Math.max(1.0, (double)var5)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private static String O0000000000(float f) {
      return String.format(Locale.ROOT, "%.1f", f);
   }

   static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static int O00000000(int i, int j, int k, int l) {
      return RenderManager.W382.O00000000000(i, j, k, Math.max(0, Math.min(255, l)));
   }

   static final class W203 {
      final float O00000000;
      final float O000000000;
      final float O0000000000;
      final float O00000000000;

      W203(float f, float g, float h, float i) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
      }

      boolean O00000000(float f, float g) {
         return f >= this.O00000000 && f <= this.O00000000 + this.O0000000000 && g >= this.O000000000 && g <= this.O000000000 + this.O00000000000;
      }
   }

   record W204(AiLabScreen.W203 bounds, Runnable action) {
   }

   interface W205 {
      float get();
   }

   interface W206 {
      void set(float f);
   }

   final class W207 {
      final String O00000000;
      final float O000000000;
      final float O0000000000;
      final boolean O00000000000;
      final AiLabScreen.W205 O000000000000;
      final AiLabScreen.W206 O0000000000000;
      final AiLabScreen.W203 O000000000000O;

      W207(String string, float f, float g, boolean bl, AiLabScreen.W205 o0000000000, AiLabScreen.W206 o00000000000, AiLabScreen.W203 o00000000) {
         this.O00000000 = string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = bl;
         this.O000000000000 = o0000000000;
         this.O0000000000000 = o00000000000;
         this.O000000000000O = o00000000;
      }

      void O00000000(float f) {
         float var2 = AiLabScreen.O00000000((f - this.O000000000000O.O00000000) / this.O000000000000O.O0000000000, 0.0F, 1.0F);
         float var3 = this.O000000000 + var2 * (this.O0000000000 - this.O000000000);
         if (this.O00000000000) {
            var3 = Math.round(var3);
         } else {
            var3 = Math.round(var3 * 100.0F) / 100.0F;
         }

         this.O0000000000000.set(AiLabScreen.O00000000(var3, this.O000000000, this.O0000000000));
      }
   }
}
