package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public final class RotationBuilderScreen extends Screen {
   private static volatile boolean O00000000;
   private static final String[] O000000000 = new String[]{"FunTime", "Spooky", "Holy", "Matrix", "Smooth", "Snap", "Custom"};
   private final O000000OO00 O0000000000;
   private final O00000OO0000O O00000000000;
   private List<RotationBuilderScreen.W217> O000000000000 = new ArrayList<>();
   private final List<RotationBuilderScreen.W217> O0000000000000 = new ArrayList<>();
   private final List<RotationBuilderScreen.W217> O000000000000O = new ArrayList<>();
   private final List<RotationBuilderScreen.W213> O00000000000O = new ArrayList<>();
   private final Map<String, O0000O00O0OO> O00000000000O0 = new HashMap<>();
   private final Map<String, O0000O00O0OO> O00000000000OO = new HashMap<>();
   private final Map<String, O0000O00O0OO> O0000000000O = new HashMap<>();
   private final Map<String, O0000O00O0OO> O0000000000O0 = new HashMap<>();
   private final O0000O00O0OO O0000000000O00 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000000O0O = new O0000O00O0OO();
   private final O0000O00O0OO O0000000000OO = new O0000O00O0OO();
   private final O0000O00O0OO O0000000000OO0 = new O0000O00O0OO();
   private int O0000000000OOO;
   private RotationBuilderScreen.W212 O000000000O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O0 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O00 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O000 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O00O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O0O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O0O0 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000O0OO = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OO = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OO0 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OO00 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OO0O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OOO = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OOO0 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O000000000OOOO = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O = RotationBuilderScreen.W212.O00000000();
   private final List<RotationBuilderScreen.W216> O00000000O0 = new ArrayList<>();
   private String O00000000O00 = "";
   private long O00000000O000;
   private RotationBuilderScreen.W212 O00000000O0000 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O000O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O00O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O00O0 = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O00OO = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O0O = RotationBuilderScreen.W212.O00000000();
   private RotationBuilderScreen.W212 O00000000O0O0 = RotationBuilderScreen.W212.O00000000();
   private float O00000000O0O00;
   private float O00000000O0O0O;
   private float O00000000O0OO;
   private float O00000000O0OO0;
   private RotationBuilderScreen.W217 O00000000O0OOO;
   private int O00000000OO = -1;
   private int O00000000OO0 = -1;
   private float O00000000OO00;
   private float O00000000OO000;
   private float O00000000OO00O;
   private float O00000000OO0O;
   private float O00000000OO0O0;
   private float O00000000OO0OO;
   private float O00000000OOO;
   private float O00000000OOO0;
   private boolean O00000000OOO00;
   private long O00000000OOO0O;
   private int O00000000OOOO;
   private long O00000000OOOO0;
   private boolean O00000000OOOOO;
   private boolean O0000000O;
   private boolean O0000000O0;
   private boolean O0000000O00;
   private String O0000000O000 = "";
   private String O0000000O0000;
   private float O0000000O00000;
   private float O0000000O0000O;

   public RotationBuilderScreen() {
      super(Text.literal("Rotation Builder"));
      this.O0000000000 = O000000OO00.O00000000();
      this.O00000000000 = O00000OO0000O.O00000000();
      this.O0000000000O00.O0000000000000(0.0);
      this.O0000000000O0O.O0000000000000(1.0);
      this.O0000000000OO.O0000000000000(0.0);
      this.O0000000000OO0.O0000000000000(0.0);
      O0000000000O0O();
      this.O00000000();
   }

   private void O00000000() {
      this.O0000000000000.clear();
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость Yaw мин", 0.0F, 180.0F, 35.0F, true, () -> this.O0000000000.O0000000000O, f -> this.O0000000000.O0000000000O = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость Yaw макс", 0.0F, 180.0F, 55.0F, true, () -> this.O0000000000.O0000000000O0, f -> this.O0000000000.O0000000000O0 = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость Pitch мин", 0.0F, 120.0F, 6.0F, true, () -> this.O0000000000.O0000000000O00, f -> this.O0000000000.O0000000000O00 = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость Pitch макс", 0.0F, 120.0F, 12.0F, true, () -> this.O0000000000.O0000000000O0O, f -> this.O0000000000.O0000000000O0O = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость удара Yaw", 0.0F, 240.0F, 65.0F, true, () -> this.O0000000000.O0000000000OO, f -> this.O0000000000.O0000000000OO = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость удара Pitch", 0.0F, 240.0F, 22.0F, true, () -> this.O0000000000.O0000000000OO0, f -> this.O0000000000.O0000000000OO0 = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Рандом Yaw", 0.0F, 20.0F, 4.0F, false, () -> this.O0000000000.O0000000000OOO, f -> this.O0000000000.O0000000000OOO = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217("Рандом Pitch", 0.0F, 20.0F, 3.0F, false, () -> this.O0000000000.O000000000O, f -> this.O0000000000.O000000000O = f)
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217("Осцилляция X", 0.0F, 1.0F, 0.2F, false, () -> this.O0000000000.O000000000O0, f -> this.O0000000000.O000000000O0 = f)
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Осцилляция Y", 0.0F, 1.0F, 0.12F, false, () -> this.O0000000000.O000000000O00, f -> this.O0000000000.O000000000O00 = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Частота осцилляции", 0.2F, 3.0F, 1.0F, false, () -> this.O0000000000.O000000000O000, f -> this.O0000000000.O000000000O000 = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Боковая точка", 0.0F, 0.6F, 0.0F, false, () -> this.O0000000000.O000000000O00O, f -> this.O0000000000.O000000000O00O = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость возврата", 5.0F, 120.0F, 30.0F, true, () -> this.O0000000000.O000000000O0O, f -> this.O0000000000.O000000000O0O = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Смена точки (сек)", 0.1F, 3.0F, 0.9F, false, () -> this.O0000000000.O000000000OO, f -> this.O0000000000.O000000000OO = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость смены точек", 0.1F, 3.0F, 1.0F, false, () -> this.O0000000000.O00000000O00, f -> this.O0000000000.O00000000O00 = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Интерполяция оверлея", 0.05F, 1.0F, 0.35F, false, () -> this.O0000000000.O00000000O, f -> this.O0000000000.O00000000O = f
            )
         );
      this.O0000000000000
         .add(
            new RotationBuilderScreen.W217(
               "Скорость прицела", 0.2F, 3.0F, 1.0F, false, () -> this.O0000000000.O00000000O0, f -> this.O0000000000.O00000000O0 = f
            )
         );
      this.O000000000000O.clear();
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Смещение Yaw", -30.0F, 30.0F, 0.0F, true, () -> this.O0000000000.O000000000OO00, f -> this.O0000000000.O000000000OO00 = f
            )
         );
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Смещение Pitch", -30.0F, 30.0F, 0.0F, true, () -> this.O0000000000.O000000000OO0O, f -> this.O0000000000.O000000000OO0O = f
            )
         );
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Pitch минимум", -90.0F, 0.0F, -90.0F, true, () -> this.O0000000000.O000000000OOO, f -> this.O0000000000.O000000000OOO = f
            )
         );
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Pitch максимум", 0.0F, 90.0F, 90.0F, true, () -> this.O0000000000.O000000000OOO0, f -> this.O0000000000.O000000000OOO0 = f
            )
         );
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Упреждение цели", 0.0F, 0.6F, 0.0F, false, () -> this.O0000000000.O000000000OOOO, f -> this.O0000000000.O000000000OOOO = f
            )
         );
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Угол отвода", 0.0F, 90.0F, 80.0F, true, () -> this.O0000000000.O00000000O0000, f -> this.O0000000000.O00000000O0000 = f
            )
         );
      this.O000000000000O
         .add(
            new RotationBuilderScreen.W217(
               "Интервал отвода (сек)", 1.5F, 15.0F, 5.0F, false, () -> this.O0000000000.O00000000O000O, f -> this.O0000000000.O00000000O000O = f
            )
         );
      this.O000000000000 = this.O0000000000000;
   }

   public boolean shouldPause() {
      return false;
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      this.O0000000000(this.O00000000((double)mouseX), this.O000000000((double)mouseY));
      super.render(context, mouseX, mouseY, deltaTicks);
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public void O00000000(RenderManager o0000O00OO0O0, int i, int j) {
      if (o0000O00OO0O0 != null && i > 0 && j > 0) {
         this.O0000000000OO();
         this.O0000000000O00();
         this.O0000000000O00.O00000000();
         this.O0000000000O00
            .O00000000(
               this.O0000000O0 ? 0.0 : 1.0,
               this.O0000000O0 ? 0.18F : 0.22F,
               this.O0000000O0 ? O0000O00O0OO0O.O0000000000O00 : O0000O00O0OO0O.O000000000OOOO,
               false
            );
         float var4 = O00000000(this.O0000000000O00.O000000000000(), 0.0F, 1.0F);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, O00000000(0, 0, 0, Math.round(150.0F * var4)));
         o0000O00OO0O0.O000000000000(var4);
         float var5 = 0.97F + 0.03F * var4;
         o0000O00OO0O0.O0000000000(var5, var5, i * 0.5F, j * 0.5F);
         this.O000000000(o0000O00OO0O0, i, j);
         this.O00000000(o0000O00OO0O0);
         this.O00000000(o0000O00OO0O0, this.O000000000());
         this.O000000000000(o0000O00OO0O0);
         this.O000000000(o0000O00OO0O0);
         o0000O00OO0O0.O00000000000O0();
         o0000O00OO0O0.O00000000000OO();
         if (this.O0000000O0 && var4 <= 0.015F) {
            this.O0000000000();
         }
      }
   }

   private float O000000000() {
      long var1 = System.currentTimeMillis();
      if (this.O00000000OOO0O == 0L) {
         this.O00000000OOO0O = var1;
      }

      float var3 = (float)(var1 - this.O00000000OOO0O) / 1000.0F;
      this.O00000000OOO0O = var1;
      return Math.min(0.1F, Math.max(0.0F, var3));
   }

   private void O000000000(RenderManager o0000O00OO0O0, int i, int j) {
      float var4 = O00000000(i - 120.0F, 620.0F, 780.0F);
      float var5 = O00000000(j - 120.0F, 420.0F, 520.0F);
      float var6 = (i - var4) * 0.5F;
      float var7 = (j - var5) * 0.5F;
      this.O000000000O = new RotationBuilderScreen.W212(var6, var7, var4, var5);
      o0000O00OO0O0.O00000000(20.0F);
      o0000O00OO0O0.O00000000(var6, var7, var4, var5, 16.0F, 1.0F);
      o0000O00OO0O0.O00000000(var6, var7, var4, var5, 16.0F, O00000000(13, 15, 21, 180));
      o0000O00OO0O0.O00000000(var6, var7, var4, var5, 16.0F, O00000000(255, 255, 255, 26), 2.0F);
   }

   private void O00000000(RenderManager o0000O00OO0O0) {
      float var2 = this.O000000000O.O00000000 + 18.0F;
      float var3 = this.O000000000O.O000000000 + 16.0F;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var2, var3 + 14.0F, 26.0F, "Rotation Builder", O00000000(245, 248, 255, 246));
      boolean var4 = System.currentTimeMillis() < this.O00000000O000 && !this.O00000000O00.isEmpty();
      if (var4) {
         float var5 = O00000000(this.O0000000000OO.O000000000000(), 0.0F, 1.0F);
         long var6 = this.O00000000O000 - System.currentTimeMillis();
         if (var6 < 400L) {
            var5 *= O00000000((float)var6 / 400.0F, 0.0F, 1.0F);
         }

         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var2, var3 + 34.0F, 22.0F, this.O00000000O00, O00000000(120, 220, 150, Math.round(235.0F * var5)));
      } else {
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000,
            var2,
            var3 + 32.0F,
            24.0F,
            "Текущий присет ротации: " + this.O0000000000.O00000000000O0 + " - " + this.O0000000000.O00000000000O,
            O00000000(154, 164, 180, 222)
         );
      }

      this.O00000000000O.clear();
      float var18 = var2;
      float var19 = this.O000000000O.O000000000 + 58.0F;

      for (String var10 : O000000000) {
         float var11 = TextMeasureCache.O000000000(FontRegistry.O00000000, var10, 14.0F) + 18.0F;
         boolean var12 = var10.equals(this.O0000000000.O00000000000O0)
            || var10.equals(this.O0000000000.O000000000000O)
            || "Custom".equals(var10) && "Custom".equals(this.O0000000000.O00000000000O);
         this.O00000000000O.add(new RotationBuilderScreen.W213(var10, new RotationBuilderScreen.W212(var18, var19, var11, 24.0F), var12));
         var18 += var11 + 7.0F;
      }

      for (RotationBuilderScreen.W213 var22 : this.O00000000000O) {
         float var23 = this.O00000000("chip." + var22.label, var22.bounds.O00000000(this.O00000000OO00O, this.O00000000OO0O));
         float var24 = this.O000000000("chip." + var22.label, var22.active);
         float var25 = this.O000000000000O("chip." + var22.label);
         float var26 = 1.0F - var25 * 0.06F;
         float var13 = var22.bounds.O00000000 + var22.bounds.O0000000000 * 0.5F;
         float var14 = var22.bounds.O000000000 + var22.bounds.O00000000000 * 0.5F;
         int var15 = O00000000(O00000000(255, 255, 255, Math.round(12.0F + var23 * 18.0F)), O00000000(95, 190, 255, 64), var24);
         o0000O00OO0O0.O0000000000(var26, var26, var13, var14);
         o0000O00OO0O0.O00000000(var22.bounds.O00000000, var22.bounds.O000000000, var22.bounds.O0000000000, var22.bounds.O00000000000, 7.0F, var15);
         float var16 = TextMeasureCache.O000000000(FontRegistry.O00000000, var22.label, 20.0F);
         int var17 = O00000000(O00000000(188, 198, 212, 226), O00000000(235, 248, 255, 246), var24);
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000,
            var22.bounds.O00000000 + (var22.bounds.O0000000000 - var16) * 0.5F,
            var22.bounds.O000000000 + 16.0F,
            20.0F,
            var22.label,
            var17
         );
         o0000O00OO0O0.O00000000000O0();
      }

      this.O000000000O00O = new RotationBuilderScreen.W212(this.O000000000O.O00000000 + this.O000000000O.O0000000000 - 18.0F - 26.0F, var3, 26.0F, 26.0F);
      this.O00000000(o0000O00OO0O0, "screen.close", this.O000000000O00O, "l", FontRegistry.O000000000000, 26.0F, false);
      this.O000000000OO0 = new RotationBuilderScreen.W212(this.O000000000O00O.O00000000 - 8.0F - 26.0F, var3, 26.0F, 26.0F);
      this.O00000000(o0000O00OO0O0, "presets.open", this.O000000000OO0, "I", FontRegistry.O0000000000, 18.0F, this.O00000000OOOOO);
      float var21 = 104.0F;
      this.O000000000O0O = new RotationBuilderScreen.W212(this.O000000000O.O00000000 + this.O000000000O.O0000000000 - 18.0F - var21, var19, var21, 24.0F);
      this.O00000000(
         o0000O00OO0O0,
         "clear",
         this.O000000000O0O,
         "Очистить точки",
         O00000000(255, 120, 120, 26),
         O00000000(255, 120, 120, 70),
         O00000000(245, 220, 220, 232)
      );
      this.O000000000O0O0 = new RotationBuilderScreen.W212(this.O000000000O0O.O00000000 - 8.0F - 78.0F, var19, 78.0F, 24.0F);
      this.O00000000(
         o0000O00OO0O0, "reset", this.O000000000O0O0, "Сброс", O00000000(255, 255, 255, 14), O00000000(255, 255, 255, 36), O00000000(235, 242, 255, 230)
      );
      this.O000000000OO = new RotationBuilderScreen.W212(this.O000000000O0O0.O00000000 - 8.0F - 92.0F, var19, 92.0F, 24.0F);
      this.O00000000(
         o0000O00OO0O0, "paste", this.O000000000OO, "Вставить", O00000000(120, 200, 255, 22), O00000000(120, 200, 255, 66), O00000000(225, 240, 255, 232)
      );
      this.O000000000O0OO = new RotationBuilderScreen.W212(this.O000000000OO.O00000000 - 8.0F - 100.0F, var19, 100.0F, 24.0F);
      this.O00000000(
         o0000O00OO0O0, "copy", this.O000000000O0OO, "Копировать", O00000000(120, 255, 180, 22), O00000000(120, 255, 180, 66), O00000000(225, 255, 240, 232)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, String string, RotationBuilderScreen.W212 o00000000, String string2, FontObject o0000O0O00O00O, float f, boolean bl
   ) {
      float var8 = this.O00000000(string, o00000000.O00000000(this.O00000000OO00O, this.O00000000OO0O));
      float var9 = this.O000000000(string, bl);
      float var10 = this.O000000000000O(string);
      float var11 = 1.0F - var10 * 0.08F;
      int var12 = O00000000(O00000000(255, 255, 255, Math.round(10.0F + var8 * 18.0F)), O00000000(95, 190, 255, 62), var9);
      int var13 = O00000000(O00000000(255, 255, 255, 22), O00000000(95, 210, 255, 112), var9);
      o0000O00OO0O0.O0000000000(var11, var11, o00000000.O00000000 + o00000000.O0000000000 * 0.5F, o00000000.O000000000 + o00000000.O00000000000 * 0.5F);
      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 8.0F, var12);
      float var14 = TextMeasureCache.O000000000(o0000O0O00O00O, string2, f);
      o0000O00OO0O0.O00000000(
         o0000O0O00O00O,
         o00000000.O00000000 + (o00000000.O0000000000 - var14) * 0.5F,
         o00000000.O000000000 + o00000000.O00000000000 * 0.5F + f * 0.28F,
         f,
         string2,
         O00000000(226, 239, 250, Math.round(224.0F + var8 * 26.0F))
      );
      o0000O00OO0O0.O00000000000O0();
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, RotationBuilderScreen.W212 o00000000, String string2, int i, int j, int k) {
      float var8 = this.O00000000(string, o00000000.O00000000(this.O00000000OO00O, this.O00000000OO0O));
      float var9 = this.O000000000000O(string);
      float var10 = 1.0F - var9 * 0.07F;
      float var11 = o00000000.O00000000 + o00000000.O0000000000 * 0.5F;
      float var12 = o00000000.O000000000 + o00000000.O00000000000 * 0.5F;
      int var13 = O00000000(i, j, var8);
      o0000O00OO0O0.O0000000000(var10, var10, var11, var12);
      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 7.0F, var13);
      this.O00000000(o0000O00OO0O0, string2, o00000000, 22.0F, k);
      o0000O00OO0O0.O00000000000O0();
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      float var2 = O00000000(this.O0000000000OO0.O000000000000(), 0.0F, 1.0F);
      if (var2 <= 0.01F) {
         this.O000000000OO00 = RotationBuilderScreen.W212.O00000000();
         this.O00000000O0.clear();
      } else {
         float var3 = Math.min(336.0F, this.O000000000O.O0000000000 - 36.0F);
         float var4 = this.O000000000O.O00000000000 - 72.0F;
         float var5 = this.O000000000O.O00000000 + this.O000000000O.O0000000000 - var3 - 18.0F;
         float var6 = this.O000000000O.O000000000 + 54.0F;
         float var7 = 1.0F - (float)Math.pow(1.0F - var2, 3.0);
         float var8 = var6 - 28.0F * (1.0F - var7);
         this.O000000000OO00 = new RotationBuilderScreen.W212(var5, var8, var3, var4);
         o0000O00OO0O0.O00000000(
            this.O000000000O.O00000000,
            this.O000000000O.O000000000,
            this.O000000000O.O0000000000,
            this.O000000000O.O00000000000,
            16.0F,
            O00000000(13, 15, 21, Math.round(180.0F * var2))
         );
         o0000O00OO0O0.O000000000000(var2);
         o0000O00OO0O0.O00000000(var5, var8, var3, var4, 14.0F, O00000000(13, 15, 21, 255));
         float var9 = 14.0F;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var5 + var9, var8 + 23.0F, 24.0F, "Сохранённые ротации", O00000000(242, 247, 255, 246));
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, var5 + var9, var8 + 41.0F, 22.0F, "Локальные пресеты текущего конструктора", O00000000(142, 154, 174, 210)
         );
         this.O000000000OO0O = new RotationBuilderScreen.W212(var5 + var3 - var9 - 24.0F, var8 + 12.0F, 24.0F, 26.0F);
         this.O00000000(o0000O00OO0O0, "presets.close", this.O000000000OO0O, "l", FontRegistry.O000000000000, 26.0F, false);
         this.O000000000OOO = new RotationBuilderScreen.W212(var5 + var9, var8 + 54.0F, var3 - var9 * 2.0F, 30.0F);
         float var10 = this.O00000000("presets.name", this.O000000000OOO.O00000000(this.O00000000OO00O, this.O00000000OO0O));
         float var11 = this.O000000000("presets.name.active", this.O0000000O);
         int var12 = O00000000(O00000000(255, 255, 255, Math.round(10.0F + var10 * 8.0F)), O00000000(95, 190, 255, 28), var11);
         int var13 = O00000000(O00000000(255, 255, 255, 24), O00000000(95, 210, 255, 124), var11);
         o0000O00OO0O0.O00000000(
            this.O000000000OOO.O00000000, this.O000000000OOO.O000000000, this.O000000000OOO.O0000000000, this.O000000000OOO.O00000000000, 8.0F, var12
         );
         String var14 = this.O0000000O000.isEmpty() && !this.O0000000O ? "Название пресета" : this.O0000000O000;
         int var15 = this.O0000000O000.isEmpty() && !this.O0000000O ? O00000000(128, 140, 158, 190) : O00000000(229, 238, 250, 236);
         String var16 = this.O00000000(var14, this.O000000000OOO.O0000000000 - 22.0F, 21.0F);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, this.O000000000OOO.O00000000 + 10.0F, this.O000000000OOO.O000000000 + 20.0F, 21.0F, var16, var15);
         if (this.O0000000O && System.currentTimeMillis() / 480L % 2L == 0L) {
            float var17 = this.O000000000OOO.O00000000 + 10.0F + TextMeasureCache.O000000000(FontRegistry.O00000000, var16, 21.0F) + 1.0F;
            o0000O00OO0O0.O00000000(var17, this.O000000000OOO.O000000000 + 7.0F, 1.0F, 16.0F, 0.5F, O00000000(110, 215, 255, 230));
         }

         float var36 = var8 + 92.0F;
         float var18 = (var3 - var9 * 2.0F - 8.0F) * 0.5F;
         this.O000000000OOO0 = new RotationBuilderScreen.W212(var5 + var9, var36, var18, 28.0F);
         this.O000000000OOOO = new RotationBuilderScreen.W212(this.O000000000OOO0.O00000000 + var18 + 8.0F, var36, var18, 28.0F);
         this.O00000000(
            o0000O00OO0O0,
            "presets.create",
            this.O000000000OOO0,
            "Сохранить новый",
            O00000000(95, 210, 255, 22),
            O00000000(95, 210, 255, 62),
            O00000000(228, 247, 255, 238)
         );
         o0000O00OO0O0.O000000000000(this.O0000000O0000 == null ? 0.42F : 1.0F);
         this.O00000000(
            o0000O00OO0O0,
            "presets.update",
            this.O000000000OOOO,
            "Обновить",
            O00000000(120, 255, 180, 18),
            O00000000(120, 255, 180, 54),
            O00000000(226, 255, 240, 232)
         );
         o0000O00OO0O0.O00000000000OO();
         float var19 = var8 + 132.0F;
         float var20 = var8 + var4 - var9;
         this.O00000000O = new RotationBuilderScreen.W212(var5 + var9, var19, var3 - var9 * 2.0F, Math.max(20.0F, var20 - var19));
         o0000O00OO0O0.O00000000(
            this.O00000000O.O00000000, this.O00000000O.O000000000, this.O00000000O.O0000000000, this.O00000000O.O00000000000, 8.0F, 8.0F, 8.0F, 8.0F
         );
         List var21 = this.O00000000000.O000000000();
         this.O00000000O0.clear();
         float var22 = 58.0F;
         float var23 = 8.0F;
         float var24 = var19 - this.O0000000O00000;
         if (var21.isEmpty()) {
            o0000O00OO0O0.O00000000(
               this.O00000000O.O00000000, this.O00000000O.O000000000, this.O00000000O.O0000000000, 64.0F, 10.0F, O00000000(255, 255, 255, 8)
            );
            this.O00000000(
               o0000O00OO0O0,
               "Сохранённых пресетов пока нет",
               new RotationBuilderScreen.W212(this.O00000000O.O00000000, this.O00000000O.O000000000, this.O00000000O.O0000000000, 64.0F),
               24.0F,
               O00000000(145, 157, 176, 206)
            );
         } else {
            for (O00000OO0000O.W210 var26 : (List<O00000OO0000O.W210>)var21) {
               RotationBuilderScreen.W212 var27 = new RotationBuilderScreen.W212(this.O00000000O.O00000000, var24, this.O00000000O.O0000000000, var22);
               boolean var28 = var26.id().equals(this.O0000000O0000);
               float var29 = this.O00000000("preset.row." + var26.id(), var27.O00000000(this.O00000000OO00O, this.O00000000OO0O));
               float var30 = this.O000000000("preset.row.active." + var26.id(), var28);
               int var31 = O00000000(O00000000(255, 255, 255, Math.round(12.0F + var29 * 13.0F)), O00000000(95, 190, 255, 34), var30);
               o0000O00OO0O0.O00000000(var27.O00000000, var27.O000000000, var27.O0000000000, var27.O00000000000, 10.0F, var31);
               String var32 = this.O00000000(var26.name(), var27.O0000000000 - 154.0F, 24.0F);
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000000,
                  var27.O00000000 + 11.0F,
                  var27.O000000000 + 25.0F,
                  24.0F,
                  var32,
                  var28 ? O00000000(231, 248, 255, 246) : O00000000(218, 227, 240, 232)
               );
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000,
                  var27.O00000000 + 11.0F,
                  var27.O000000000 + 40.0F,
                  20.0F,
                  var28 ? "Выбран для редактирования" : "Нажмите, чтобы выбрать",
                  O00000000(135, 149, 169, 196)
               );
               RotationBuilderScreen.W212 var33 = new RotationBuilderScreen.W212(
                  var27.O00000000 + var27.O0000000000 - 128.0F, var27.O000000000 + 9.0F, 72.0F, 22.0F
               );
               RotationBuilderScreen.W212 var34 = new RotationBuilderScreen.W212(
                  var27.O00000000 + var27.O0000000000 - 50.0F, var27.O000000000 + 9.0F, 20.0F, 22.0F
               );
               RotationBuilderScreen.W212 var35 = new RotationBuilderScreen.W212(
                  var27.O00000000 + var27.O0000000000 - 24.0F, var27.O000000000 + 9.0F, 20.0F, 22.0F
               );
               this.O00000000(o0000O00OO0O0, "preset.apply." + var26.id(), var33, "Применить", false);
               this.O000000000(o0000O00OO0O0, "preset.copy." + var26.id(), var34, "k", FontRegistry.O0000000000, 18.0F, false);
               this.O000000000(o0000O00OO0O0, "preset.delete." + var26.id(), var35, "l", FontRegistry.O000000000000, 20.0F, true);
               this.O00000000O0.add(new RotationBuilderScreen.W216(var26, var27, var33, var34, var35));
               var24 += var22 + var23;
            }
         }

         o0000O00OO0O0.O0000000000000();
         float var37 = var21.isEmpty() ? 64.0F : var21.size() * (var22 + var23) - var23;
         this.O0000000O0000O = Math.max(0.0F, var37 - this.O00000000O.O00000000000);
         this.O0000000O00000 = O00000000(this.O0000000O00000, 0.0F, this.O0000000O0000O);
         if (this.O0000000O0000O > 0.0F) {
            float var38 = this.O00000000O.O00000000000;
            float var39 = Math.max(30.0F, var38 * (var38 / (var38 + this.O0000000O0000O)));
            float var40 = this.O00000000O.O000000000 + (var38 - var39) * (this.O0000000O00000 / this.O0000000O0000O);
            o0000O00OO0O0.O00000000(
               this.O00000000O.O00000000 + this.O00000000O.O0000000000 - 3.0F, this.O00000000O.O000000000, 2.0F, var38, 1.0F, O00000000(255, 255, 255, 14)
            );
            o0000O00OO0O0.O00000000(this.O00000000O.O00000000 + this.O00000000O.O0000000000 - 3.0F, var40, 2.0F, var39, 1.0F, O00000000(95, 210, 255, 116));
         }

         o0000O00OO0O0.O00000000000OO();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, RotationBuilderScreen.W212 o00000000, String string2, boolean bl) {
      this.O000000000(o0000O00OO0O0, string, o00000000, string2, FontRegistry.O00000000, string2.length() > 2 ? 16.0F : 19.0F, bl);
   }

   private void O000000000(
      RenderManager o0000O00OO0O0, String string, RotationBuilderScreen.W212 o00000000, String string2, FontObject o0000O0O00O00O, float f, boolean bl
   ) {
      float var8 = this.O00000000(string, o00000000.O00000000(this.O00000000OO00O, this.O00000000OO0O));
      float var9 = this.O000000000000O(string);
      int var10 = bl ? O00000000(255, 105, 120, 18) : O00000000(255, 255, 255, 12);
      int var11 = bl ? O00000000(255, 105, 120, 54) : O00000000(95, 210, 255, 42);
      int var12 = bl ? O00000000(255, 204, 210, 232) : O00000000(218, 235, 248, 226);
      o0000O00OO0O0.O0000000000(
         1.0F - var9 * 0.08F, 1.0F - var9 * 0.08F, o00000000.O00000000 + o00000000.O0000000000 * 0.5F, o00000000.O000000000 + o00000000.O00000000000 * 0.5F
      );
      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 6.0F, O00000000(var10, var11, var8));
      float var13 = TextMeasureCache.O000000000(o0000O0O00O00O, string2, f);
      o0000O00OO0O0.O00000000(
         o0000O0O00O00O,
         o00000000.O00000000 + (o00000000.O0000000000 - var13) * 0.5F,
         o00000000.O000000000 + o00000000.O00000000000 * 0.5F + f * 0.28F,
         f,
         string2,
         var12
      );
      o0000O00OO0O0.O00000000000O0();
   }

   private String O00000000(String string, float f, float g) {
      if (string != null && !string.isEmpty()) {
         String var4 = string;

         while (var4.length() > 1 && TextMeasureCache.O000000000(FontRegistry.O00000000, var4, g) > f) {
            var4 = var4.substring(1);
         }

         return var4;
      } else {
         return "";
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f) {
      float var3 = this.O000000000O.O000000000 + 90.0F;
      float var4 = this.O000000000O.O00000000 + 18.0F;
      float var5 = 238.0F;
      float var6 = this.O000000000O.O000000000 + this.O000000000O.O00000000000 - var3 - 18.0F;
      this.O000000000O0 = new RotationBuilderScreen.W212(var4, var3, var5, var6);
      o0000O00OO0O0.O00000000(var4, var3, var5, var6, 14.0F, O00000000(255, 255, 255, 10));
      o0000O00OO0O0.O00000000(var4, var3, var5, var6, 14.0F, O00000000(255, 255, 255, 20), 2.0F);
      float var7 = O00000000(this.O0000000000O0O.O000000000000(), 0.0F, 1.0F);
      o0000O00OO0O0.O000000000000(var7);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         var4 + 12.0F,
         var3 + 18.0F,
         24.0F,
         this.O0000000000OOO == 0 ? "Привью режим поведение ротации" : "Превью вектора",
         O00000000(176, 186, 202, 224)
      );
      float var8 = var3 + 30.0F;
      float var9 = var6 - 46.0F;
      this.O00000000O0OO0 = var9 * 0.82F;
      this.O00000000O0OO = this.O00000000O0OO0 * 0.42F;
      this.O00000000O0O00 = var4 + var5 * 0.5F;
      this.O00000000O0O0O = var8 + var9 - 10.0F;
      if (this.O0000000000OOO == 0) {
         this.O000000000(f);
      } else {
         this.O00000000(f);
      }

      O00000OO0000OO.O00000000(
         o0000O00OO0O0,
         var4 + 4.0F,
         var8,
         var5 - 8.0F,
         var9,
         this.O00000000O0O00,
         this.O00000000O0O0O,
         this.O00000000O0OO,
         this.O00000000O0OO0,
         this.O0000000000OOO == 0 ? 1.0F : 0.55F
      );
      if (this.O0000000000OOO == 0) {
         this.O00000000000(o0000O00OO0O0);
         this.O0000000000(o0000O00OO0O0);
      } else {
         this.O00000000(o0000O00OO0O0, var4, var8, var5, var9);
      }

      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         var4 + 12.0F,
         var3 + var6 + 13.0F,
         18.0F,
         this.O0000000000OOO == 0
            ? "ЛКМ - точка на модели : ПКМ - удалить · " + this.O0000000000.O00000000O00O.size() + "/12"
            : "Голубой - база/смещение · жёлтый - упреждение · красный - итог",
         O00000000(146, 156, 172, 206)
      );
      o0000O00OO0O0.O00000000000OO();
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O00000OO0000OO.O00000000(
         o0000O00OO0O0,
         this.O00000000O0O00,
         this.O00000000O0O0O,
         this.O00000000O0OO,
         this.O00000000O0OO0,
         this.O0000000000.O000000000OO00,
         this.O0000000000.O000000000OO0O,
         this.O0000000000.O000000000OOO,
         this.O0000000000.O000000000OOO0,
         this.O0000000000.O000000000OOOO,
         this.O00000000OO0O0,
         this.O00000000OO0OO,
         1.0F
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         f + 12.0F,
         g + 6.0F,
         22.0F,
         String.format("Yaw %.1f° - Pitch %.1f°", this.O00000000OOO, this.O00000000OOO0),
         O00000000(210, 220, 235, 220)
      );
   }

   private void O00000000(float f) {
      float var2 = this.O0000000000.O000000000OO00;
      float var3 = Math.max(this.O0000000000.O000000000OOO, Math.min(this.O0000000000.O000000000OOO0, this.O0000000000.O000000000OO0O));
      float var4 = Math.max(0.05F, this.O0000000000.O00000000O) * (0.5F + this.O0000000000.O00000000O0 * 0.5F) * Math.min(1.0F, f * 30.0F + 0.15F);
      float[] var5 = O00000OO0000OO.O000000000(this.O00000000O0O00, this.O00000000O0O0O, this.O00000000O0OO, this.O00000000O0OO0, var2, var3);
      if (!this.O00000000OOO00) {
         this.O00000000OOO = var2;
         this.O00000000OOO0 = var3;
         this.O00000000OO0O0 = var5[0];
         this.O00000000OO0OO = var5[1];
         this.O00000000OOO00 = true;
      } else {
         this.O00000000OOO = this.O00000000OOO + (var2 - this.O00000000OOO) * var4;
         this.O00000000OOO0 = this.O00000000OOO0 + (var3 - this.O00000000OOO0) * var4;
         float[] var6 = O00000OO0000OO.O000000000(
            this.O00000000O0O00, this.O00000000O0O0O, this.O00000000O0OO, this.O00000000O0OO0, this.O00000000OOO, this.O00000000OOO0
         );
         this.O00000000OO0O0 = this.O00000000OO0O0 + (var6[0] - this.O00000000OO0O0) * var4;
         this.O00000000OO0OO = this.O00000000OO0OO + (var6[1] - this.O00000000OO0OO) * var4;
      }
   }

   private void O0000000000(RenderManager o0000O00OO0O0) {
      float var2 = 0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 320.0);

      for (int var3 = 0; var3 < this.O0000000000.O00000000O00O.size(); var3++) {
         O000000OO00.W44 var4 = this.O0000000000.O00000000O00O.get(var3);
         float var5 = this.O00000000O0O00 + var4.O00000000 * this.O00000000O0OO;
         float var6 = this.O00000000O0O0O - var4.O000000000 * this.O00000000O0OO0;
         boolean var7 = var3 == this.O00000000OO0;
         float var8 = this.O000000000000O("point." + var3);
         float var9 = 1.0F + var8 * 0.35F;
         if (var7) {
            float var10 = (8.0F + var2 * 2.0F) * var9;
            o0000O00OO0O0.O00000000(var5 - var10, var6 - var10, var10 * 2.0F, var10 * 2.0F, 6.0F, O00000000(95, 210, 255, 70));
         }

         float var11 = 4.0F * var9;
         o0000O00OO0O0.O00000000(var5 - var11, var6 - var11, var11 * 2.0F, var11 * 2.0F, 6.0F, O00000000(95, 210, 255, 238));
      }
   }

   private void O00000000000(RenderManager o0000O00OO0O0) {
      float var2 = 3.0F + (this.O0000000000.O0000000000OOO + this.O0000000000.O000000000O) * 0.6F;
      o0000O00OO0O0.O00000000(this.O00000000OO0O0 - var2, this.O00000000OO0OO - var2, var2 * 2.0F, var2 * 2.0F, 12.0F, O00000000(255, 110, 130, 42));
      o0000O00OO0O0.O00000000(this.O00000000OO0O0 - 7.0F, this.O00000000OO0OO - 0.7F, 14.0F, 1.4F, 0.0F, O00000000(255, 90, 110, 235));
      o0000O00OO0O0.O00000000(this.O00000000OO0O0 - 0.7F, this.O00000000OO0OO - 7.0F, 1.4F, 14.0F, 0.0F, O00000000(255, 90, 110, 235));
   }

   private void O000000000(float f) {
      long var4 = System.currentTimeMillis();
      float var2;
      float var3;
      if (!this.O0000000000.O00000000O00O.isEmpty()) {
         if (var4 >= this.O00000000OOOO0) {
            if ("Random".equals(this.O0000000000.O000000000O0OO)) {
               this.O00000000OOOO = (int)(Math.random() * this.O0000000000.O00000000O00O.size());
            } else {
               this.O00000000OOOO = (this.O00000000OOOO + 1) % this.O0000000000.O00000000O00O.size();
            }

            this.O00000000OOOO0 = var4 + (long)(this.O0000000000.O000000000OO * 1000.0F / Math.max(0.1F, this.O0000000000.O00000000O00));
         }

         O000000OO00.W44 var6 = this.O0000000000.O00000000O00O.get(Math.min(this.O00000000OOOO, this.O0000000000.O00000000O00O.size() - 1));
         var2 = this.O00000000O0O00 + var6.O00000000 * this.O00000000O0OO;
         var3 = this.O00000000O0O0O - var6.O000000000 * this.O00000000O0OO0;
      } else {
         float[] var14 = O00000OO0000OO.O00000000(this.O00000000O0O00, this.O00000000O0O0O, this.O00000000O0OO, this.O00000000O0OO0, 0.0F, 0.5625F);
         var2 = var14[0];
         var3 = var14[1];
      }

      var2 += (float)(Math.sin(var4 / (250.0 / Math.max(0.2F, this.O0000000000.O000000000O000))) * this.O0000000000.O000000000O0 * this.O00000000O0OO * 0.5);
      var3 += (float)(Math.cos(var4 / (520.0 / Math.max(0.2F, this.O0000000000.O000000000O000))) * this.O0000000000.O000000000O00 * this.O00000000O0OO0 * 0.3F);
      var2 += (float)(Math.cos(var4 / 40.0) * this.O0000000000.O0000000000OOO * 0.6F);
      var3 += (float)(Math.sin(var4 / 70.0) * this.O0000000000.O000000000O * 0.6F);
      if (!this.O00000000OOO00) {
         this.O00000000OO0O0 = var2;
         this.O00000000OO0OO = var3;
         this.O00000000OOO00 = true;
      } else {
         float var15 = (this.O0000000000.O0000000000O + this.O0000000000.O0000000000O0) * 0.5F;
         float var7 = (this.O0000000000.O0000000000O00 + this.O0000000000.O0000000000O0O) * 0.5F;
         float var8 = Math.max(0.01F, var15 / 180.0F * this.O00000000O0OO * f * 22.0F);
         float var9 = Math.max(0.01F, var7 / 120.0F * this.O00000000O0OO0 * f * 22.0F);
         this.O00000000OO0O0 = this.O00000000OO0O0 + O00000000(var2 - this.O00000000OO0O0, -var8, var8);
         this.O00000000OO0OO = this.O00000000OO0OO + O00000000(var3 - this.O00000000OO0OO, -var9, var9);
      }
   }

   private void O000000000000(RenderManager o0000O00OO0O0) {
      float var2 = this.O000000000O0.O00000000 + this.O000000000O0.O0000000000 + 16.0F;
      float var3 = this.O000000000O.O000000000 + 90.0F;
      float var4 = this.O000000000O.O00000000 + this.O000000000O.O0000000000 - var2 - 18.0F;
      float var5 = this.O000000000O.O000000000 + this.O000000000O.O00000000000 - var3 - 18.0F;
      this.O000000000O00 = new RotationBuilderScreen.W212(var2, var3, var4, var5);
      o0000O00OO0O0.O00000000(var2, var3, var4, var5, 11.0F, O00000000(255, 255, 255, 10));
      o0000O00OO0O0.O00000000(var2, var3, var4, var5, 11.0F, O00000000(255, 255, 255, 20), 2.0F);
      this.O000000000O000 = new RotationBuilderScreen.W212(var2 + 1.0F, var3 + 1.0F, var4 - 2.0F, var5 - 2.0F);
      o0000O00OO0O0.O00000000(
         this.O000000000O000.O00000000,
         this.O000000000O000.O000000000,
         this.O000000000O000.O0000000000,
         this.O000000000O000.O00000000000,
         11.0F,
         11.0F,
         11.0F,
         11.0F
      );
      float var6 = var2 + 14.0F;
      float var7 = var4 - 28.0F;
      this.O00000000(o0000O00OO0O0, var6, var3 + 12.0F, var7);
      float var8 = O00000000(this.O0000000000O0O.O000000000000(), 0.0F, 1.0F);
      o0000O00OO0O0.O000000000000(var8);
      float var9 = var3 + 48.0F - this.O00000000OO00;
      this.O000000000000 = this.O0000000000OOO == 0 ? this.O0000000000000 : this.O000000000000O;
      float var10 = (var7 - 8.0F) * 0.5F;
      if (this.O0000000000OOO == 0) {
         this.O00000000O00O = new RotationBuilderScreen.W212(var6, var9, var10, 24.0F);
         this.O000000000(o0000O00OO0O0, "pmode", this.O00000000O00O, "Точка: " + this.O0000000000O0(), false);
         this.O00000000O00O0 = new RotationBuilderScreen.W212(var6 + var10 + 8.0F, var9, var10, 24.0F);
         this.O000000000(o0000O00OO0O0, "mmode", this.O00000000O00O0, "Точки: " + this.O0000000000.O000000000O0OO, false);
         var9 += 32.0F;
         this.O00000000O00OO = new RotationBuilderScreen.W212(var6, var9, var7, 24.0F);
         this.O000000000(
            o0000O00OO0O0, "mhead", this.O00000000O00OO, this.O0000000000.O000000000O0O0 ? "Голова: ВКЛ" : "Голова: ВЫКЛ", this.O0000000000.O000000000O0O0
         );
         var9 += 36.0F;
      } else {
         this.O00000000O0O = new RotationBuilderScreen.W212(var6, var9, var10, 24.0F);
         this.O000000000(o0000O00OO0O0, "pfollow", this.O00000000O0O, "Pitch: " + this.O0000000000.O000000000OO0, false);
         this.O00000000O0O0 = new RotationBuilderScreen.W212(var6 + var10 + 8.0F, var9, var10, 24.0F);
         this.O000000000(
            o0000O00OO0O0, "laway", this.O00000000O0O0, this.O0000000000.O00000000O000 ? "Отвод: ВКЛ" : "Отвод: ВЫКЛ", this.O0000000000.O00000000O000
         );
         var9 += 36.0F;
      }

      for (RotationBuilderScreen.W217 var12 : this.O000000000000) {
         var12.O00000000(var6, var9, var7);
         this.O00000000(o0000O00OO0O0, var12);
         var9 += 34.0F;
      }

      o0000O00OO0O0.O00000000000OO();
      float var18 = var9 + this.O00000000OO00;
      float var19 = var3 + var5 - 12.0F;
      this.O00000000OO000 = Math.max(0.0F, var18 - var19);
      this.O00000000OO00 = O00000000(this.O00000000OO00, 0.0F, this.O00000000OO000);
      o0000O00OO0O0.O0000000000000();
      if (this.O00000000OO000 > 0.0F) {
         float var13 = var5 - 16.0F;
         float var14 = Math.max(30.0F, var13 * (var5 / (var5 + this.O00000000OO000)));
         float var15 = var3 + 8.0F + (var13 - var14) * (this.O00000000OO00 / this.O00000000OO000);
         o0000O00OO0O0.O00000000(var2 + var4 - 6.0F, var3 + 8.0F, 3.0F, var13, 1.5F, O00000000(255, 255, 255, 18));
         o0000O00OO0O0.O00000000(var2 + var4 - 6.0F, var15, 3.0F, var14, 1.5F, O00000000(95, 210, 255, 130));
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h) {
      float var5 = (h - 8.0F) * 0.5F;
      this.O00000000O0000 = new RotationBuilderScreen.W212(f, g, var5, 26.0F);
      this.O00000000O000O = new RotationBuilderScreen.W212(f + var5 + 8.0F, g, var5, 26.0F);
      this.O00000000(o0000O00OO0O0, this.O00000000O0000, "Настройки для ротации ", this.O0000000000OOO == 0);
      this.O00000000(o0000O00OO0O0, this.O00000000O000O, "Вектор головы", this.O0000000000OOO == 1);
   }

   private void O00000000(RenderManager o0000O00OO0O0, RotationBuilderScreen.W212 o00000000, String string, boolean bl) {
      String var5 = "tab." + string;
      float var6 = this.O00000000(var5, o00000000.O00000000(this.O00000000OO00O, this.O00000000OO0O));
      float var7 = this.O000000000(var5, bl);
      float var8 = this.O000000000000O(var5);
      float var9 = 1.0F - var8 * 0.05F;
      float var10 = o00000000.O00000000 + o00000000.O0000000000 * 0.5F;
      float var11 = o00000000.O000000000 + o00000000.O00000000000 * 0.5F;
      int var12 = O00000000(O00000000(255, 255, 255, Math.round(10.0F + var6 * 16.0F)), O00000000(95, 190, 255, 60), var7);
      o0000O00OO0O0.O0000000000(var9, var9, var10, var11);
      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 8.0F, var12);
      float var13 = TextMeasureCache.O000000000(FontRegistry.O00000000, string, 22.0F);
      int var14 = O00000000(O00000000(190, 200, 214, 224), O00000000(235, 248, 255, 246), var7);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000, o00000000.O00000000 + (o00000000.O0000000000 - var13) * 0.5F, o00000000.O000000000 + 18.0F, 22.0F, string, var14
      );
      o0000O00OO0O0.O00000000000O0();
   }

   private void O000000000(RenderManager o0000O00OO0O0, String string, RotationBuilderScreen.W212 o00000000, String string2, boolean bl) {
      float var6 = this.O00000000(string, o00000000.O00000000(this.O00000000OO00O, this.O00000000OO0O));
      float var7 = this.O000000000(string, bl);
      float var8 = this.O000000000000O(string);
      float var9 = 1.0F - var8 * 0.05F;
      float var10 = o00000000.O00000000 + o00000000.O0000000000 * 0.5F;
      float var11 = o00000000.O000000000 + o00000000.O00000000000 * 0.5F;
      int var12 = O00000000(O00000000(255, 255, 255, Math.round(14.0F + var6 * 20.0F)), O00000000(95, 190, 255, 60), var7);
      int var13 = O00000000(O00000000(255, 255, 255, 24), O00000000(95, 210, 255, 124), var7);
      o0000O00OO0O0.O0000000000(var9, var9, var10, var11);
      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 7.0F, var12);
      o0000O00OO0O0.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000, 7.0F, var13, 1.0F);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, o00000000.O00000000 + 9.0F, o00000000.O000000000 + 16.0F, 22.0F, string2, O00000000(212, 222, 236, 232));
      o0000O00OO0O0.O00000000000O0();
   }

   private void O00000000(RenderManager o0000O00OO0O0, RotationBuilderScreen.W217 o0000000000000) {
      float var3 = o0000000000000.O0000000000000.get();
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         o0000000000000.O00000000000O,
         o0000000000000.O00000000000O0 + 10.0F,
         22.0F,
         o0000000000000.O00000000,
         O00000000(190, 200, 214, 224)
      );
      String var4 = o0000000000000.O000000000000 ? String.valueOf(Math.round(var3)) : String.format("%.2f", var3);
      float var5 = TextMeasureCache.O000000000(FontRegistry.O00000000, var4, 22.0F);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         o0000000000000.O00000000000O + o0000000000000.O00000000000OO - var5,
         o0000000000000.O00000000000O0 + 10.0F,
         22.0F,
         var4,
         O00000000(240, 246, 255, 226)
      );
      float var6 = o0000000000000.O00000000000O0 + 20.0F;
      float var7 = this.O00000000(o0000000000000);
      float var8 = this.O000000000000O("slider." + o0000000000000.O00000000);
      float var9 = 1.0F + var8 * 0.18F;
      o0000O00OO0O0.O00000000(o0000000000000.O00000000000O, var6, o0000000000000.O00000000000OO, 5.0F, 2.5F, O00000000(255, 255, 255, 28));
      o0000O00OO0O0.O00000000(o0000000000000.O00000000000O, var6, o0000000000000.O00000000000OO * var7, 5.0F, 2.5F, O00000000(95, 210, 255, 165));
      float var10 = o0000000000000.O00000000000O + o0000000000000.O00000000000OO * var7 - 4.0F;
      float var11 = var6 - 2.5F;
      float var12 = 9.0F * var9;
      float var13 = 10.0F * var9;
      o0000O00OO0O0.O00000000(var10 - (var12 - 9.0F) * 0.5F, var11 - (var13 - 10.0F) * 0.5F, var12, var13, 4.5F, O00000000(235, 250, 255, 246));
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      this.O0000000000(this.O00000000(mouseX), this.O000000000(mouseY));
      if (this.O0000000O0) {
         return true;
      } else if (button == 0 && this.O000000000OO0.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
         this.O0000000000000("presets.open");
         this.O00000000OOOOO = !this.O00000000OOOOO;
         this.O0000000O = false;
         return true;
      } else if (this.O0000000000OO0.O000000000000() > 0.04F) {
         if (this.O000000000OO00.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
            if (button == 0) {
               this.O00000000000();
            }

            return true;
         } else if (button == 0) {
            this.O00000000OOOOO = false;
            this.O0000000O = false;
            return true;
         } else {
            return true;
         }
      } else if (button == 0) {
         if (this.O000000000O00O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
            this.O0000000000000("screen.close");
            this.close();
            return true;
         } else {
            for (RotationBuilderScreen.W213 var13 : this.O00000000000O) {
               if (var13.bounds.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                  this.O0000000000000("chip." + var13.label);
                  this.O0000000000.O00000000(var13.label);
                  return true;
               }
            }

            if (this.O000000000O0O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               this.O0000000000000("clear");
               this.O0000000000.O0000000000();
               this.O00000000OO0 = -1;
               return true;
            } else if (this.O000000000O0O0.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               this.O0000000000000("reset");
               this.O0000000000.O00000000000();
               this.O00000000OO0 = -1;
               this.O00000000OOO00 = false;
               return true;
            } else if (this.O000000000O0OO.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               this.O0000000000000("copy");
               this.O00000000000O();
               return true;
            } else if (this.O000000000OO.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               this.O0000000000000("paste");
               this.O00000000000O0();
               return true;
            } else if (!this.O000000000O000.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               int var11 = this.O00000000(this.O00000000OO00O, this.O00000000OO0O);
               if (var11 >= 0) {
                  this.O0000000000000("point." + var11);
                  this.O00000000OO0 = var11;
                  this.O00000000OO = var11;
                  return true;
               } else if (this.O000000000(this.O00000000OO00O, this.O00000000OO0O)) {
                  float var14 = O00000000((this.O00000000OO00O - this.O00000000O0O00) / this.O00000000O0OO, -0.5F, 0.5F);
                  float var8 = O00000000((this.O00000000O0O0O - this.O00000000OO0O) / this.O00000000O0OO0, 0.0F, 1.0F);
                  this.O0000000000.O00000000(var14, var8);
                  this.O00000000OO0 = this.O0000000000.O00000000O00O.size() - 1;
                  this.O0000000000000("point." + this.O00000000OO0);
                  return true;
               } else {
                  return true;
               }
            } else if (this.O00000000O0000.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               this.O0000000000000("tab.Настройки для ротации ");
               this.O00000000(0);
               return true;
            } else if (this.O00000000O000O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               this.O0000000000000("tab.Вектор головы");
               this.O00000000(1);
               return true;
            } else {
               if (this.O0000000000OOO == 0) {
                  if (this.O00000000O00O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("pmode");
                     this.O0000000000O();
                     return true;
                  }

                  if (this.O00000000O00O0.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("mmode");
                     this.O0000000000.O000000000O0OO = O00000000(O000000OO00.O000000000, this.O0000000000.O000000000O0OO, 1);
                     O000000OO00.O0000000000000();
                     return true;
                  }

                  if (this.O00000000O00OO.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("mhead");
                     this.O0000000000.O000000000O0O0 = !this.O0000000000.O000000000O0O0;
                     O000000OO00.O0000000000000();
                     return true;
                  }
               } else {
                  if (this.O00000000O0O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("pfollow");
                     this.O0000000000.O000000000OO0 = O00000000(O000000OO00.O0000000000, this.O0000000000.O000000000OO0, 1);
                     O000000OO00.O0000000000000();
                     return true;
                  }

                  if (this.O00000000O0O0.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("laway");
                     this.O0000000000.O00000000O000 = !this.O0000000000.O00000000O000;
                     O000000OO00.O0000000000000();
                     return true;
                  }
               }

               for (RotationBuilderScreen.W217 var15 : this.O000000000000) {
                  if (var15.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("slider." + var15.O00000000);
                     this.O00000000O0OOO = var15;
                     var15.O00000000(this.O00000000OO00O);
                     O000000OO00.O0000000000000();
                     return true;
                  }
               }

               return true;
            }
         }
      } else {
         if (button == 1) {
            if (this.O000000000O000.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               if (this.O0000000000OOO == 0 && this.O00000000O00O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                  this.O0000000000000("pmode");
                  this.O0000000000.O00000000000OO = O00000000(O000000OO00.O00000000, this.O0000000000.O00000000000OO, -1);
                  O000000OO00.O0000000000000();
                  return true;
               }

               if (this.O0000000000OOO == 0 && this.O00000000O00O0.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                  this.O0000000000000("mmode");
                  this.O0000000000.O000000000O0OO = O00000000(O000000OO00.O000000000, this.O0000000000.O000000000O0OO, -1);
                  O000000OO00.O0000000000000();
                  return true;
               }

               if (this.O0000000000OOO == 1 && this.O00000000O0O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                  this.O0000000000000("pfollow");
                  this.O0000000000.O000000000OO0 = O00000000(O000000OO00.O0000000000, this.O0000000000.O000000000OO0, -1);
                  O000000OO00.O0000000000000();
                  return true;
               }

               for (RotationBuilderScreen.W217 var7 : this.O000000000000) {
                  if (var7.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("slider." + var7.O00000000);
                     var7.O000000000000O.set(var7.O00000000000);
                     this.O0000000000.O000000000();
                     O000000OO00.O0000000000000();
                     return true;
                  }
               }

               return true;
            }

            int var6 = this.O00000000(this.O00000000OO00O, this.O00000000OO0O);
            if (var6 >= 0) {
               this.O0000000000000("point." + var6);
               this.O0000000000.O00000000(this.O0000000000.O00000000O00O.get(var6));
               this.O00000000OO0 = -1;
               return true;
            }
         }

         return true;
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      this.O0000000000(this.O00000000(mouseX), this.O000000000(mouseY));
      if (this.O00000000O0OOO != null) {
         this.O0000000000.O000000000();
         O000000OO00.O0000000000000();
         this.O00000000O0OOO = null;
      }

      if (this.O00000000OO >= 0) {
         O000000OO00.O0000000000000();
         this.O00000000OO = -1;
      }

      return true;
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      this.O0000000000(this.O00000000(mouseX), this.O000000000(mouseY));
      if (this.O0000000000OO0.O000000000000() > 0.04F) {
         return true;
      } else if (this.O00000000O0OOO != null) {
         this.O00000000O0OOO.O00000000(this.O00000000OO00O);
         return true;
      } else if (this.O00000000OO >= 0 && this.O00000000OO < this.O0000000000.O00000000O00O.size()) {
         O000000OO00.W44 var10 = this.O0000000000.O00000000O00O.get(this.O00000000OO);
         var10.O00000000 = O00000000((this.O00000000OO00O - this.O00000000O0O00) / this.O00000000O0OO, -0.5F, 0.5F);
         var10.O000000000 = O00000000((this.O00000000O0O0O - this.O00000000OO0O) / this.O00000000O0OO0, 0.0F, 1.0F);
         return true;
      } else {
         return true;
      }
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      this.O0000000000(this.O00000000(mouseX), this.O000000000(mouseY));
      if (this.O0000000000OO0.O000000000000() > 0.04F) {
         if (this.O00000000O.O00000000(this.O00000000OO00O, this.O00000000OO0O) && this.O0000000O0000O > 0.0F) {
            this.O0000000O00000 = O00000000(this.O0000000O00000 - (float)verticalAmount * 30.0F, 0.0F, this.O0000000O0000O);
         }

         return true;
      } else if (this.O000000000O00.O00000000(this.O00000000OO00O, this.O00000000OO0O) && this.O00000000OO000 > 0.0F) {
         this.O00000000OO00 = O00000000(this.O00000000OO00 - (float)verticalAmount * 28.0F, 0.0F, this.O00000000OO000);
         return true;
      } else {
         return true;
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (!(this.O0000000000OO0.O000000000000() > 0.04F)) {
         if (keyCode == 256) {
            this.close();
            return true;
         } else {
            return super.keyPressed(keyCode, scanCode, modifiers);
         }
      } else {
         if (this.O0000000O) {
            if (keyCode == 259 && !this.O0000000O000.isEmpty()) {
               this.O0000000O000 = this.O0000000O000.substring(0, this.O0000000O000.length() - 1);
               return true;
            }

            if (keyCode == 86 && (modifiers & 2) != 0 && this.client != null && this.client.keyboard != null) {
               this.O00000000000(this.client.keyboard.getClipboard());
               return true;
            }

            if (keyCode == 257 || keyCode == 335) {
               this.O000000000000();
               return true;
            }
         }

         if (keyCode == 256) {
            if (this.O0000000O) {
               this.O0000000O = false;
            } else {
               this.O00000000OOOOO = false;
            }

            return true;
         } else {
            return true;
         }
      }
   }

   public boolean charTyped(char chr, int modifiers) {
      if (this.O0000000000OO0.O000000000000() > 0.04F && this.O0000000O) {
         if (!Character.isISOControl(chr)) {
            this.O00000000000(String.valueOf(chr));
         }

         return true;
      } else {
         return super.charTyped(chr, modifiers);
      }
   }

   public void close() {
      if (!this.O0000000O0) {
         this.O00000000OOOOO = false;
         this.O0000000O = false;
         this.O0000000O0 = true;
      }
   }

   private void O0000000000() {
      if (!this.O0000000O00) {
         this.O0000000O00 = true;
         this.O0000000000.O000000000();
         O000000OO00.O0000000000000();
         super.close();
      }
   }

   private int O00000000(float f, float g) {
      for (int var3 = this.O0000000000.O00000000O00O.size() - 1; var3 >= 0; var3--) {
         O000000OO00.W44 var4 = this.O0000000000.O00000000O00O.get(var3);
         float var5 = this.O00000000O0O00 + var4.O00000000 * this.O00000000O0OO;
         float var6 = this.O00000000O0O0O - var4.O000000000 * this.O00000000O0OO0;
         if (Math.hypot(f - var5, g - var6) <= 8.0) {
            return var3;
         }
      }

      return -1;
   }

   private boolean O000000000(float f, float g) {
      float var3 = (f - this.O00000000O0O00) / this.O00000000O0OO;
      float var4 = (this.O00000000O0O0O - g) / this.O00000000O0OO0;
      return O00000OO0000OO.O0000000000(var3, var4);
   }

   private void O00000000000() {
      if (this.O000000000OO0O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
         this.O0000000000000("presets.close");
         this.O00000000OOOOO = false;
         this.O0000000O = false;
      } else if (this.O000000000OOO.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
         this.O0000000000000("presets.name");
         this.O0000000O = true;
      } else {
         this.O0000000O = false;
         if (this.O000000000OOO0.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
            this.O0000000000000("presets.create");
            this.O0000000000000();
         } else if (this.O000000000OOOO.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
            this.O0000000000000("presets.update");
            this.O000000000000O();
         } else {
            if (this.O00000000O.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
               for (RotationBuilderScreen.W216 var2 : this.O00000000O0) {
                  String var3 = var2.preset.id();
                  if (var2.apply.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("preset.apply." + var3);
                     this.O00000000(var3);
                     return;
                  }

                  if (var2.copy.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("preset.copy." + var3);
                     this.O000000000(var3);
                     return;
                  }

                  if (var2.delete.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("preset.delete." + var3);
                     this.O0000000000(var3);
                     return;
                  }

                  if (var2.card.O00000000(this.O00000000OO00O, this.O00000000OO0O)) {
                     this.O0000000000000("preset.row." + var3);
                     this.O0000000O0000 = var3;
                     this.O0000000O000 = var2.preset.name();
                     return;
                  }
               }
            }
         }
      }
   }

   private void O000000000000() {
      if (this.O0000000O0000 == null) {
         this.O0000000000000();
      } else {
         this.O000000000000O();
      }
   }

   private void O0000000000000() {
      if (this.O0000000O000.trim().isEmpty()) {
         this.O000000000000("Введите название пресета");
         this.O0000000O = true;
      } else {
         O00000OO0000O.W210 var1 = this.O00000000000.O00000000(this.O0000000O000, this.O0000000000);
         if (var1 == null) {
            this.O000000000000("Не удалось сохранить пресет");
         } else {
            this.O0000000O0000 = var1.id();
            this.O0000000O000 = var1.name();
            this.O0000000O00000 = 0.0F;
            this.O000000000000("Пресет сохранён");
         }
      }
   }

   private void O000000000000O() {
      if (this.O0000000O0000 == null) {
         this.O000000000000("Сначала выберите пресет");
      } else if (this.O0000000O000.trim().isEmpty()) {
         this.O000000000000("Введите название пресета");
         this.O0000000O = true;
      } else {
         O00000OO0000O.W210 var1 = this.O00000000000.O00000000(this.O0000000O0000, this.O0000000O000, this.O0000000000);
         if (var1 == null) {
            this.O000000000000("Не удалось обновить пресет");
         } else {
            this.O0000000O000 = var1.name();
            this.O000000000000("Пресет обновлён");
         }
      }
   }

   private void O00000000(String string) {
      if (!this.O00000000000.O00000000(string)) {
         this.O000000000000("Не удалось применить пресет");
      } else {
         this.O00000000000OO();
         O00000OO0000O.W210 var2 = this.O00000000000.O0000000000(string);
         this.O0000000O0000 = string;
         this.O0000000O000 = var2 == null ? this.O0000000O000 : var2.name();
         this.O00000000OO0 = -1;
         this.O00000000OO = -1;
         this.O00000000OOO00 = false;
         this.O00000000();
         this.O000000000000("Пресет применён");
      }
   }

   private void O000000000(String string) {
      O00000OO0000O.W210 var2 = this.O00000000000.O0000000000(string);
      if (var2 != null && this.client != null && this.client.keyboard != null) {
         this.client.keyboard.setClipboard(var2.key());
         this.O000000000000("Код пресета скопирован");
      } else {
         this.O000000000000("Не удалось скопировать код");
      }
   }

   private void O0000000000(String string) {
      if (!this.O00000000000.O000000000(string)) {
         this.O000000000000("Не удалось удалить пресет");
      } else {
         if (string.equals(this.O0000000O0000)) {
            this.O0000000O0000 = null;
            this.O0000000O000 = "";
         }

         this.O0000000O00000 = O00000000(this.O0000000O00000, 0.0F, this.O0000000O0000O);
         this.O000000000000("Пресет удалён");
      }
   }

   private void O00000000000(String string) {
      if (string != null && !string.isEmpty() && this.O0000000O000.length() < 40) {
         StringBuilder var2 = new StringBuilder(this.O0000000O000);

         for (int var3 = 0; var3 < string.length() && var2.length() < 40; var3++) {
            char var4 = string.charAt(var3);
            if (!Character.isISOControl(var4)) {
               var2.append(var4);
            }
         }

         this.O0000000O000 = var2.toString();
      }
   }

   private void O00000000000O() {
      try {
         String var1 = this.O0000000000.O000000000000();
         if (this.client != null && this.client.keyboard != null) {
            this.client.keyboard.setClipboard(var1);
            this.O000000000000("Ключ скопирован в буфер обмена");
         } else {
            this.O000000000000("Не удалось получить буфер обмена");
         }
      } catch (Throwable var2) {
         this.O000000000000("Ошибка при создании ключа");
      }
   }

   private void O00000000000O0() {
      try {
         if (this.client == null || this.client.keyboard == null) {
            this.O000000000000("Не удалось получить буфер обмена");
            return;
         }

         String var1 = this.client.keyboard.getClipboard();
         if (var1 == null || var1.trim().isEmpty()) {
            this.O000000000000("Буфер обмена пуст");
            return;
         }

         if (O000000OO00.O000000000(var1)) {
            this.O00000000000OO();
            this.O00000000();
            this.O00000000OO0 = -1;
            this.O000000000000("Ключ применён");
         } else {
            this.O000000000000("Неверный ключ");
         }
      } catch (Throwable var2) {
         this.O000000000000("Ошибка при вставке ключа");
      }
   }

   private void O00000000000OO() {
      int var1 = AttackAura.O000000000O00.O00000000000.indexOf("Custom");
      if (var1 >= 0) {
         AttackAura.O000000000O00.O00000000000O = var1;
         AttackAura.O000000000O00.O000000000000 = AttackAura.O000000000O00.O00000000000.get(var1);
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O0000000000();
         }
      }
   }

   private void O000000000000(String string) {
      this.O00000000O00 = string;
      this.O00000000O000 = System.currentTimeMillis() + 2600L;
      this.O0000000000OO.O0000000000000(0.0);
      this.O0000000000OO.O00000000(1.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
   }

   private void O00000000(int i) {
      if (this.O0000000000OOO != i) {
         this.O0000000000OOO = i;
         this.O00000000OO00 = 0.0F;
         this.O00000000OOO00 = false;
         this.O0000000000O0O.O0000000000000(0.0);
         this.O0000000000O0O.O00000000(1.0, 0.26F, O0000O00O0OO0O.O0000000000O0O, false);
      }
   }

   private void O0000000000O() {
      this.O0000000000.O00000000000OO = O00000000(O000000OO00.O00000000, this.O0000000000.O00000000000OO, 1);
      O000000OO00.O0000000000000();
   }

   private static String O00000000(String[] strings, String string, int i) {
      int var3 = 0;

      for (int var4 = 0; var4 < strings.length; var4++) {
         if (strings[var4].equals(string)) {
            var3 = var4;
            break;
         }
      }

      var3 = (var3 + i % strings.length + strings.length) % strings.length;
      return strings[var3];
   }

   private String O0000000000O0() {
      return this.O0000000000.O00000000O00O.isEmpty() ? this.O0000000000.O00000000000OO : "Custom";
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, RotationBuilderScreen.W212 o00000000, float f, int i) {
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

   private float O00000000(String string, boolean bl) {
      O0000O00O0OO var3 = this.O00000000000O0.computeIfAbsent(string, stringx -> {
         O0000O00O0OO var2 = new O0000O00O0OO();
         var2.O0000000000000(bl ? 1.0 : 0.0);
         return var2;
      });
      var3.O00000000();
      var3.O00000000(bl ? 1.0 : 0.0, 0.14F, O0000O00O0OO0O.O0000000000O0O, false);
      return O00000000(var3.O000000000000(), 0.0F, 1.0F);
   }

   private void O0000000000O00() {
      this.O0000000000O0O.O00000000();
      this.O0000000000OO.O00000000();
      this.O0000000000OO0.O00000000();
      this.O0000000000OO0
         .O00000000(
            this.O00000000OOOOO ? 1.0 : 0.0,
            this.O00000000OOOOO ? 0.24F : 0.18F,
            this.O00000000OOOOO ? O0000O00O0OO0O.O000000000OOOO : O0000O00O0OO0O.O0000000000O00,
            false
         );
      long var1 = this.O00000000O000 - System.currentTimeMillis();
      if (var1 > 0L && var1 < 400L) {
         this.O0000000000OO.O00000000(0.0, 0.28F, O0000O00O0OO0O.O0000000000O00, false);
      }
   }

   private void O0000000000000(String string) {
      O0000O00O0OO var2 = this.O00000000000OO.computeIfAbsent(string, stringx -> {
         O0000O00O0OO var1 = new O0000O00O0OO();
         var1.O0000000000000(0.0);
         return var1;
      });
      var2.O0000000000000(1.0);
      var2.O00000000(0.0, 0.16F, O0000O00O0OO0O.O00000000000O, false);
   }

   private float O000000000000O(String string) {
      O0000O00O0OO var2 = this.O00000000000OO.get(string);
      if (var2 == null) {
         return 0.0F;
      } else {
         var2.O00000000();
         return O00000000(var2.O000000000000(), 0.0F, 1.0F);
      }
   }

   private float O000000000(String string, boolean bl) {
      O0000O00O0OO var3 = this.O0000000000O.computeIfAbsent(string, stringx -> {
         O0000O00O0OO var2 = new O0000O00O0OO();
         var2.O0000000000000(bl ? 1.0 : 0.0);
         return var2;
      });
      var3.O00000000();
      var3.O00000000(bl ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
      return O00000000(var3.O000000000000(), 0.0F, 1.0F);
   }

   private float O00000000(RotationBuilderScreen.W217 o0000000000000) {
      float var2 = O00000000(
         (o0000000000000.O0000000000000.get() - o0000000000000.O000000000) / (o0000000000000.O0000000000 - o0000000000000.O000000000), 0.0F, 1.0F
      );
      O0000O00O0OO var3 = this.O0000000000O0.computeIfAbsent(o0000000000000.O00000000, string -> {
         O0000O00O0OO var2x = new O0000O00O0OO();
         var2x.O0000000000000(var2);
         return var2x;
      });
      var3.O00000000();
      float var4 = this.O00000000O0OOO == o0000000000000 ? 0.08F : 0.16F;
      var3.O00000000(var2, var4, O0000O00O0OO0O.O0000000000O0O, false);
      return O00000000(var3.O000000000000(), 0.0F, 1.0F);
   }

   private static int O00000000(int i, int j, float f) {
      f = Math.max(0.0F, Math.min(1.0F, f));
      int var3 = i >> 24 & 0xFF;
      int var4 = i >> 16 & 0xFF;
      int var5 = i >> 8 & 0xFF;
      int var6 = i & 0xFF;
      int var7 = j >> 24 & 0xFF;
      int var8 = j >> 16 & 0xFF;
      int var9 = j >> 8 & 0xFF;
      int var10 = j & 0xFF;
      int var11 = Math.round(var3 + (var7 - var3) * f);
      int var12 = Math.round(var4 + (var8 - var4) * f);
      int var13 = Math.round(var5 + (var9 - var5) * f);
      int var14 = Math.round(var6 + (var10 - var6) * f);
      return O00000000(var12, var13, var14, var11);
   }

   private static void O0000000000O0O() {
      if (!O00000000) {
         O00000000 = true;
         EventManager.O00000000(new Object() {
            @EventHandler
            public void O00000000(O0000000O00O o0000000O00O) {
               if (o0000000O00O.O0000000000() != null && o0000000O00O.O0000000000().currentScreen instanceof RotationBuilderScreen var2) {
                  var2.O00000000(o0000000O00O.O00000000000(), o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
                  if (o0000000O00O.O00000000000() != null) {
                     o0000000O00O.O00000000000().O0000000000();
                  }
               }
            }
         });
      }
   }

   private void O0000000000(float f, float g) {
      this.O00000000OO00O = f;
      this.O00000000OO0O = g;
   }

   private void O0000000000OO() {
      if (this.client != null && this.client.getWindow() != null && this.client.mouse != null) {
         double var1 = this.client.getWindow().getFramebufferWidth();
         double var3 = this.client.getWindow().getFramebufferHeight();
         if (!(var1 <= 0.0) && !(var3 <= 0.0)) {
            double var5 = this.client.mouse.getX();
            double var7 = this.client.mouse.getY();
            if (var5 >= 0.0 && var7 >= 0.0 && var5 <= var1 + 2.0 && var7 <= var3 + 2.0) {
               this.O0000000000((float)var5, (float)var7);
            }
         }
      }
   }

   private float O00000000(double d) {
      if (this.client != null && this.client.getWindow() != null) {
         int var3 = this.client.getWindow().getFramebufferWidth();
         int var4 = this.client.getWindow().getScaledWidth();
         return var3 > 0 && var4 > 0 ? (float)(d * var3 / Math.max(1.0, (double)var4)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private float O000000000(double d) {
      if (this.client != null && this.client.getWindow() != null) {
         int var3 = this.client.getWindow().getFramebufferHeight();
         int var4 = this.client.getWindow().getScaledHeight();
         return var3 > 0 && var4 > 0 ? (float)(d * var3 / Math.max(1.0, (double)var4)) : (float)d;
      } else {
         return (float)d;
      }
   }

   static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static int O00000000(int i, int j, int k, int l) {
      return RenderManager.W382.O00000000000(i, j, k, Math.max(0, Math.min(255, l)));
   }

   static final class W212 {
      final float O00000000;
      final float O000000000;
      final float O0000000000;
      final float O00000000000;

      W212(float f, float g, float h, float i) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
      }

      static RotationBuilderScreen.W212 O00000000() {
         return new RotationBuilderScreen.W212(0.0F, 0.0F, 0.0F, 0.0F);
      }

      boolean O00000000(float f, float g) {
         return f >= this.O00000000 && g >= this.O000000000 && f <= this.O00000000 + this.O0000000000 && g <= this.O000000000 + this.O00000000000;
      }
   }

   record W213(String label, RotationBuilderScreen.W212 bounds, boolean active) {
   }

   interface W214 {
      float get();
   }

   interface W215 {
      void set(float f);
   }

   record W216(
      O00000OO0000O.W210 preset,
      RotationBuilderScreen.W212 card,
      RotationBuilderScreen.W212 apply,
      RotationBuilderScreen.W212 copy,
      RotationBuilderScreen.W212 delete
   ) {
   }

   final class W217 {
      final String O00000000;
      final float O000000000;
      final float O0000000000;
      final float O00000000000;
      final boolean O000000000000;
      final RotationBuilderScreen.W214 O0000000000000;
      final RotationBuilderScreen.W215 O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;

      W217(String string, float f, float g, float h, boolean bl, RotationBuilderScreen.W214 o0000000000, RotationBuilderScreen.W215 o00000000000) {
         this.O00000000 = string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = bl;
         this.O0000000000000 = o0000000000;
         this.O000000000000O = o00000000000;
      }

      void O00000000(float f, float g, float h) {
         this.O00000000000O = f;
         this.O00000000000O0 = g;
         this.O00000000000OO = h;
      }

      boolean O00000000(float f, float g) {
         return f >= this.O00000000000O && f <= this.O00000000000O + this.O00000000000OO && g >= this.O00000000000O0 && g <= this.O00000000000O0 + 30.0F;
      }

      void O00000000(float f) {
         float var2 = RotationBuilderScreen.O00000000((f - this.O00000000000O) / this.O00000000000OO, 0.0F, 1.0F);
         float var3 = this.O000000000 + var2 * (this.O0000000000 - this.O000000000);
         if (this.O000000000000) {
            var3 = Math.round(var3);
         } else {
            var3 = Math.round(var3 * 100.0F) / 100.0F;
         }

         this.O000000000000O.set(RotationBuilderScreen.O00000000(var3, this.O000000000, this.O0000000000));
      }
   }
}
