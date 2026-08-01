package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.screen.ChatScreen;
import org.wild.module.api.Module;

@O0000000OOO0(
   O00000000 = "ArrayList",
   O000000000 = "n"
)
public final class ArrayListHud extends HudElement {
   private static final String O000000000OO0 = "Прямоугольник";
   private static final String O000000000OO00 = "Обволакивание";
   private static final String O000000000OO0O = "Классический";
   private static final String O000000000OOO = "Новый";
   private static final String O000000000OOO0 = "Ferrofluid SDF";
   private static final ArrayListHud O000000000OOOO = new ArrayListHud();
   private static final int O00000000O = 96;
   private static final List<ArrayListHud.W141> O00000000O0 = new ArrayList<>(64);
   private static final Map<Module, ArrayListHud.W141> O00000000O00 = new IdentityHashMap<>(128);
   private static final O0000O000O0O00 O00000000O000 = new O0000O000O0O00(0.068F, 0.72F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000O0000 = new O0000O000O0O00(0.105F, 0.84F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000O000O = new O0000O000O0O00(0.064F, 0.76F, 0.01F, 0.01F);
   private static final O0000O000O0O00 O00000000O00O = new O0000O000O0O00(0.075F, 0.7F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000O00O0 = new O0000O000O0O00(0.082F, 0.62F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000O00OO = new O0000O000O0O00(0.12F, 0.82F, 0.001F, 0.001F);
   static final O0000O000O0O00 O00000000O0O = new O0000O000O0O00(0.07F, 0.68F, 0.01F, 0.01F);
   static final O0000O000O0O00 O00000000O0O0 = new O0000O000O0O00(0.078F, 0.66F, 0.01F, 0.01F);
   private static final O0000O000O0O00 O00000000O0O00 = new O0000O000O0O00(0.09F, 0.74F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000O0O0O = new O0000O000O0O00(0.062F, 0.8F, 0.001F, 0.001F);
   private static final O0000O000O00O O00000000O0OO = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O00000000O0OO0 = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O00000000O0OOO = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O00000000OO = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O00000000OO0 = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O00000000OO00 = new O0000O000O00O(0.0F);
   private static final O0000O00O0OO O00000000OO000 = new O0000O00O0OO();
   private static final O0000O00O0OO O00000000OO00O = new O0000O00O0OO();
   private static final O0000O00O0OO O00000000OO0O = new O0000O00O0OO();
   private static final O0000O00O0OO O00000000OO0O0 = new O0000O00O0OO();
   private static final float[] O00000000OO0OO = new float[384];
   private static final float[] O00000000OOO = new float[384];
   private static float[] O00000000OOO0 = new float[96];
   private static float[] O00000000OOO00 = new float[96];
   private static boolean O00000000OOO0O;
   public static final ArrayList<Module> O00000000 = new ArrayList<>(64);
   private final GroupSetting O00000000OOOO = new GroupSetting(
      "Фильтр", new BooleanSetting("Combat", true), new BooleanSetting("Movement", true), new BooleanSetting("Player", true), new BooleanSetting("Misc", true)
   );
   private final GroupSetting O00000000OOOO0 = new GroupSetting(
      "Вид",
      new BooleanSetting("Иконки категорий", true),
      new BooleanSetting("Индикатор", true),
      new BooleanSetting("Мягкое свечение", true),
      new BooleanSetting("Показывать бинд", false)
   );
   private final ModeSetting O00000000OOOOO = new ModeSetting("Стиль отображения", "Новый", "Классический", "Новый");
   private final ModeSetting O0000000O = new ModeSetting("Форма фона", "Прямоугольник", "Прямоугольник", "Обволакивание");
   private final NumberSetting O0000000O0 = new NumberSetting("Интервал строк", 0.0F, 0.0F, 8.0F, 0.5F, false);
   private final BooleanSetting O0000000O00 = new BooleanSetting("Ferrofluid SDF", true);
   private final NumberSetting O0000000O000 = new NumberSetting("Слияние капель", 12.0F, 4.0F, 24.0F, 0.5F, false)
      .O00000000(() -> !this.O0000000O00.O0000000000() && !this.O0000000000O0());

   private ArrayListHud() {
      this.O00000000(
         new Setting[]{this.O00000000OOOO, this.O00000000OOOO0, this.O00000000OOOOO, this.O0000000O00, this.O0000000O000, this.O0000000O, this.O0000000O0}
      );
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static ArrayListHud O000000000() {
      return O000000000OOOO;
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O000000000OOOO.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (MinecraftAccessor.a_.player != null && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         this.O0000000000OOO();
         if (this.O0000000000OO0()) {
            this.O0000000000(o0000O00OO0O0);
         } else {
            this.O00000000000(o0000O00OO0O0);
         }
      }
   }

   private boolean O0000000000OO0() {
      return this.O00000000OOOOO.O000000000("Классический");
   }

   private void O0000000000(RenderManager o0000O00OO0O0) {
      boolean var2 = !O00000000O0.isEmpty() || MinecraftAccessor.a_.currentScreen instanceof ChatScreen;
      O00000000OO000.O00000000();
      O00000000OO000.O00000000(var2 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
      float var3 = O00000000OO000.O000000000000();
      if (!(var3 <= 0.01F)) {
         boolean var4 = this.O00000000OOOO0.O000000000("Иконки категорий");
         boolean var5 = this.O00000000OOOO0.O000000000("Индикатор");
         boolean var6 = this.O00000000OOOO0.O000000000("Мягкое свечение");
         boolean var7 = this.O00000000OOOO0.O000000000("Показывать бинд");
         float var8 = 24.0F;
         float var9 = 32.0F;
         float var10 = this.O0000000O0.O0000000000();
         float var11 = 13.0F;
         float var12 = 4.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         int var15 = 0;

         for (ArrayListHud.W141 var17 : O00000000O0) {
            float var18 = var17.O0000000000.O000000000000();
            if (!(var18 <= 0.01F)) {
               var15++;
               var13 = Math.max(var13, var17.O00000000(var8, var11, var5, var4, var7));
               var14 += var9 * var18;
               if (var15 > 1) {
                  var14 += var10 * var18;
               }
            }
         }

         boolean var51 = var15 > 0;
         if (!var51) {
            var13 = TextMeasureCache.O000000000(FontRegistry.O00000000, "Нет активных модулей ", var8) + var11 * 2.0F;
            var14 = var9;
         }

         float var52 = var13 + var12 * 2.0F;
         float var53 = var14 + var12 * 2.0F;
         O00000000OO00O.O00000000();
         O00000000OO0O.O00000000();
         O00000000OO00O.O00000000(var52, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         O00000000OO0O.O00000000(var53, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         float var19 = Math.max(32.0F, O00000000OO00O.O000000000000());
         float var20 = Math.max(32.0F, O00000000OO0O.O000000000000());
         float var21 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
         float var22 = Math.max(10.0F, var21 - var19 - 10.0F);
         float var23 = 120.0F;
         O00000OO000O.W219 var24 = O00000OO000O.O00000000().O00000000("HUD_ArrayList", var22, var23, var19, var20);
         float var25 = var24.O000000000;
         float var26 = var24.O0000000000;
         float var27 = var24.O00000000000;
         float var28 = var24.O000000000000;
         this.O00000000(var25, var26, var27, var28);
         float var29 = var27 / Math.max(1.0F, var19);
         float var30 = var28 / Math.max(1.0F, var20);
         float var31 = Math.min(var29, var30);
         float var32 = var9 * var30;
         float var33 = var10 * var30;
         float var34 = var11 * var29;
         float var35 = var12 * var29;
         float var36 = var12 * var30;
         float var37 = var8 * var31;
         float var38 = var3 * this.O000000000O0.O0000000000();
         int var39 = this.O000000000000(var38);
         int var40 = this.O0000000000000(var38);
         float var41 = var25 + var27 * 0.5F > var21 * 0.5F ? 1.0F : 0.0F;
         O00000000OO0O0.O00000000();
         O00000000OO0O0.O00000000(var41, 0.26F, O0000O00O0OO0O.O0000000000O0O, false);
         float var42 = O00000000OO0O0.O000000000000();
         float var43 = var13 * var29;
         float var44 = var26 + var36;
         if (var51) {
            this.O00000000(o0000O00OO0O0, var25 + var35, var44, var32, var33, var11, var8, var29, var30, var38, var5, var4, var7, var6, var42);

            for (ArrayListHud.W141 var46 : O00000000O0) {
               float var47 = var46.O0000000000.O000000000000();
               if (!(var47 <= 0.01F)) {
                  float var48 = var46.O00000000(var8, var11, var5, var4, var7);
                  float var49 = Math.max(1.0F, var48 * var29 * var47);
                  float var50 = var25 + var35 + (var43 - var49) * var42;
                  this.O00000000(
                     o0000O00OO0O0, var46, var50, var44, var49, var32, var34, var37, var29, var30, var38, var47, var39, var40, var5, var4, var7, var42
                  );
                  var44 += var32 * var47 + var33 * var47;
               }
            }
         } else {
            this.O00000000(o0000O00OO0O0, var25 + var35, var44, Math.max(1.0F, var27 - var35 * 2.0F), var32, var34, var37, var38, var40, true);
         }

         O00000OO000O.O00000000().O00000000(var24);
         O00000O0O00O.O00000000(
            o0000O00OO0O0,
            this,
            var24,
            O00000OO000O.O00000000(),
            MinecraftAccessor.a_.getWindow().getScaledWidth(),
            MinecraftAccessor.a_.getWindow().getScaledHeight()
         );
      }
   }

   private void O00000000000(RenderManager o0000O00OO0O0) {
      boolean var2 = !O00000000O0.isEmpty() || MinecraftAccessor.a_.currentScreen instanceof ChatScreen;
      if (var2 && !O00000000OOO0O) {
         O00000000OO00.O0000000000(Math.max(O00000000OO00.O000000000(), 1.2F));
         O00000000OO0.O00000000(0.0F);
      }

      O00000000OOO0O = var2;
      float var3 = O0000000000O0O(O00000000O0OO.O00000000(var2 ? 1.0F : 0.0F, var2 ? O00000000O000 : O00000000O0000));
      float var4 = O0000000000O0O(O00000000OO0.O00000000(var2 ? 1.0F : 0.0F, O00000000O0O00));
      float var5 = Math.max(0.0F, O00000000OO00.O00000000(0.0F, O00000000O0O0O));
      if (!(var3 <= 0.01F)) {
         boolean var6 = this.O00000000OOOO0.O000000000("Иконки категорий");
         boolean var7 = this.O00000000OOOO0.O000000000("Индикатор");
         boolean var8 = this.O00000000OOOO0.O000000000("Мягкое свечение");
         boolean var9 = this.O00000000OOOO0.O000000000("Показывать бинд");
         float var10 = 24.0F;
         float var11 = 32.0F;
         float var12 = this.O0000000O0.O0000000000();
         float var13 = 13.0F;
         float var14 = 4.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         int var17 = 0;

         for (ArrayListHud.W141 var19 : O00000000O0) {
            float var20 = O0000000000O0O(var19.O00000000000.O000000000());
            if (!(var20 <= 0.01F) || !(Math.abs(var19.O00000000000.O0000000000()) <= 0.01F)) {
               var17++;
               var15 = Math.max(var15, var19.O00000000(var10, var13, var7, var6, var9));
               var16 += var11 * var20;
               if (var17 > 1) {
                  var16 += var12 * var20;
               }
            }
         }

         boolean var56 = var17 > 0;
         if (!var56) {
            var15 = TextMeasureCache.O000000000(FontRegistry.O00000000, "Нет активных модулей ", var10) + var13 * 2.0F;
            var16 = var11;
         }

         float var57 = var15 + var14 * 2.0F;
         float var58 = var16 + var14 * 2.0F;
         float var21 = Math.max(32.0F, O00000000O0OO0.O00000000(var57, O00000000O000O));
         float var22 = Math.max(32.0F, O00000000O0OOO.O00000000(var58, O00000000O000O));
         float var23 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
         float var24 = Math.max(10.0F, var23 - var21 - 10.0F);
         float var25 = 120.0F;
         O00000OO000O.W219 var26 = O00000OO000O.O00000000().O00000000("HUD_ArrayList", var24, var25, var21, var22);
         float var27 = var26.O000000000;
         float var28 = var26.O0000000000;
         float var29 = var26.O00000000000;
         float var30 = var26.O000000000000;
         this.O00000000(var27, var28, var29, var30);
         float var31 = var29 / Math.max(1.0F, var21);
         float var32 = var30 / Math.max(1.0F, var22);
         float var33 = Math.min(var31, var32);
         float var34 = var11 * var32;
         float var35 = var12 * var32;
         float var36 = var13 * var31;
         float var37 = var14 * var31;
         float var38 = var14 * var32;
         float var39 = var10 * var33;
         float var40 = var3 * this.O000000000O0.O0000000000();
         int var41 = this.O000000000000(var40);
         int var42 = this.O0000000000000(var40);
         float var43 = var27 + var29 * 0.5F > var23 * 0.5F ? 1.0F : 0.0F;
         float var44 = O0000000000O0O(O00000000OO.O00000000(var43, O00000000O00O));
         float var45 = var15 * var31;
         float var46 = var27 + var37;
         float var47 = var28 + var38;
         O00000OO000O var48 = O00000OO000O.O00000000();
         float var49 = var48.O000000000000O();
         float var50 = var48.O00000000000O();
         float var51 = MinecraftAccessor.a_.currentScreen instanceof ChatScreen && O00000000(var49, var50, var27, var28, var29, var30) ? 1.0F : 0.0F;
         boolean var52 = this.O0000000000O() && !this.O0000000O.O000000000("Обволакивание");
         int var53 = var56 ? this.O00000000(var46, var47, var45, var34, var35, var10, var13, var31, var44, var7, var6, var9, var17, var52) : 0;
         if (var56 && var53 > 0) {
            this.O00000000(o0000O00OO0O0, var32, var40 * (0.82F + var4 * 0.18F), var7, var8, var44, var49, var50, var51, var5);

            for (ArrayListHud.W141 var55 : O00000000O0) {
               if (var55.O00000000()) {
                  this.O000000000(
                     o0000O00OO0O0,
                     var55,
                     var55.O0000000000OOO,
                     var55.O000000000O,
                     var55.O000000000O0,
                     var55.O000000000O00,
                     var36,
                     var39,
                     var31,
                     var32,
                     var40,
                     O0000000000O0O(var55.O00000000000.O000000000()),
                     var41,
                     var42,
                     var7,
                     var6,
                     var9,
                     var44
                  );
               }
            }
         } else {
            this.O00000000(o0000O00OO0O0, var46, var47, Math.max(1.0F, var29 - var37 * 2.0F), var34, var36, var39, var40, var42, false);
         }

         O00000OO000O.O00000000().O00000000(var26);
         O00000O0O00O.O00000000(
            o0000O00OO0O0,
            this,
            var26,
            O00000OO000O.O00000000(),
            MinecraftAccessor.a_.getWindow().getScaledWidth(),
            MinecraftAccessor.a_.getWindow().getScaledHeight()
         );
      }
   }

   private int O00000000(
      float f, float g, float h, float i, float j, float k, float l, float m, float n, boolean bl, boolean bl2, boolean bl3, int o, boolean bl4
   ) {
      float var15 = g;
      int var16 = 0;

      for (ArrayListHud.W141 var18 : O00000000O0) {
         float var19 = O0000000000O0O(var18.O00000000000.O000000000());
         if (var19 <= 0.01F && Math.abs(var18.O00000000000.O0000000000()) <= 0.01F) {
            var18.O000000000O0O0 = false;
         } else {
            float var20 = Math.max(1.0F, var18.O00000000(k, l, bl, bl2, bl3) * m);
            float var21 = bl4 ? h : Math.max(1.0F, var20 * (0.32F + var19 * 0.68F));
            float var22 = Math.max(0.0F, i * var19);
            float var23 = f + (h - var21) * n;
            var18.O00000000(var23, var15, var21, var22);
            var18.O000000000O0O0 = var18.O000000000O0 > 0.75F && var18.O000000000O00 > 0.75F;
            var15 += i * var19;
            if (++var16 < o) {
               var15 += j * var19;
            }
         }
      }

      return var16;
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, boolean bl, boolean bl2, float h, float i, float j, float k, float l) {
      int var11 = 0;
      float var12 = Float.MAX_VALUE;
      float var13 = Float.MAX_VALUE;
      float var14 = -Float.MAX_VALUE;
      float var15 = -Float.MAX_VALUE;
      float var16 = Float.MAX_VALUE;
      float var17 = 0.0F;
      float var18 = 0.0F;

      for (ArrayListHud.W141 var20 : O00000000O0) {
         if (var20.O00000000() && var11 < 96) {
            var11++;
            var12 = Math.min(var12, var20.O0000000000OOO);
            var13 = Math.min(var13, var20.O000000000O);
            var14 = Math.max(var14, var20.O0000000000OOO + var20.O000000000O0);
            var15 = Math.max(var15, var20.O000000000O + var20.O000000000O00);
            var16 = Math.min(var16, var20.O000000000O0);
            var17 = Math.max(var17, var20.O000000000O0);
            var18 = Math.max(var18, Math.min(1.0F, (Math.abs(var20.O000000000000O.O0000000000()) + Math.abs(var20.O00000000000O.O0000000000())) * 0.012F));
         }
      }

      if (var11 > 0 && var12 != Float.MAX_VALUE && var13 != Float.MAX_VALUE && !(var14 <= var12) && !(var15 <= var13)) {
         boolean var34 = this.O0000000O.O000000000("Обволакивание");
         boolean var35 = this.O0000000O00.O0000000000() || this.O0000000000O0();
         float var21 = Math.max(1.0F, var15 - var13);
         float var22 = Math.max(1.0F, var21 / var11);
         float var23 = Math.min(15.0F * f, var22 * 0.5F);
         if (O00000000OOO0.length < var11) {
            O00000000OOO0 = new float[var11];
            O00000000OOO00 = new float[var11];
         }

         float[] var24 = O00000000OOO0;
         float[] var25 = O00000000OOO00;
         float var26 = var34 ? var17 : var14 - var12;
         float var27 = Math.max(l, var18);
         int var28 = 0;

         for (ArrayListHud.W141 var30 : O00000000O0) {
            if (var30.O00000000() && var28 < var11) {
               int var31 = var28 * 4;
               float var32 = var34 ? var30.O0000000000OOO : var12;
               float var33 = var34 ? var30.O000000000O0 : var26;
               O00000000OO0OO[var31] = var32;
               O00000000OO0OO[var31 + 1] = var30.O000000000O;
               O00000000OO0OO[var31 + 2] = var33;
               O00000000OO0OO[var31 + 3] = var30.O000000000O00;
               O00000000OOO[var31] = var30.O000000000000O.O0000000000();
               O00000000OOO[var31 + 1] = var30.O00000000000O.O0000000000();
               O00000000OOO[var31 + 2] = Math.max(0.0F, var30.O0000000000000.O000000000());
               O00000000OOO[var31 + 3] = O0000000000O0O(var30.O000000000000.O000000000());
               var24[var28] = var33;
               var25[var28] = Math.max(1.0F, var30.O000000000O - var13 + var30.O000000000O00);
               var27 = Math.max(var27, O00000000OOO[var31 + 2]);
               var28++;
            }
         }

         int var36 = this.O0000000000O0(g);
         float var37 = this.O0000000000OO();
         if (var35) {
            float var38 = Math.max(2.0F, this.O0000000O000.O0000000000() * f);
            float var40 = this.O0000000000O() ? 1.0F : 0.0F;
            boolean var41 = O00000O00O0OOO.O00000000(
               o0000O00OO0O0,
               MinecraftAccessor.a_.getWindow().getFramebufferWidth(),
               MinecraftAccessor.a_.getWindow().getFramebufferHeight(),
               O00000000OO0OO,
               O00000000OOO,
               var11,
               var23,
               h,
               g,
               var36,
               this.O00000000000(g),
               this.O00000000000O(g),
               this.O00000000000O0(g),
               this.O000000000000() || this.O0000000000O0(),
               bl2 || this.O00000000000(),
               bl,
               var37,
               i,
               j,
               k,
               var27,
               var38,
               var40
            );
            if (var41) {
               return;
            }
         }

         if (this.O0000000000O()) {
            this.O00000000(o0000O00OO0O0, var12, var13, var26, var21, var23, g);
         } else if (this.O0000000000O00()) {
            this.O00000000(o0000O00OO0O0, var12, var13, var26, var21, var23, g);
         } else {
            float var39 = Math.max(1.5F, 2.0F * f);
            if (bl2) {
               this.O00000000(
                  o0000O00OO0O0,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  f,
                  var23,
                  var39,
                  O0000O000OO000.O00000000(this.O00000000000O(g), Math.round(52.0F * g)),
                  Math.max(8.0F, 10.0F * f),
                  Math.max(1.0F, 1.4F * f),
                  h
               );
               this.O00000000(
                  o0000O00OO0O0,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  f,
                  var23,
                  var39,
                  O0000O000OO000.O00000000(this.O00000000000O0(g), Math.round(32.0F * g)),
                  Math.max(16.0F, 22.0F * f),
                  Math.max(2.0F, 3.0F * f),
                  h
               );
            }

            if (this.O000000000OO.O000000000("Тень")) {
               this.O00000000(
                  o0000O00OO0O0,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  f,
                  var23,
                  var39,
                  this.O0000000000O(g),
                  Math.max(4.0F, 4.0F * f),
                  Math.max(1.0F, 1.0F * f),
                  h
               );
            }

            this.O00000000(o0000O00OO0O0, var12, var13, var26, var24, var25, var11, var16, var21, var22, f, var23, var39, var36, g, false, true, h);
            if (this.O000000000000()) {
               this.O00000000(
                  o0000O00OO0O0,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  f,
                  var23,
                  this.O00000000000(g),
                  Math.max(1.0F, this.O0000000000() * 0.55F),
                  h
               );
            }
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      boolean bl,
      boolean bl2,
      boolean bl3,
      boolean bl4,
      float o
   ) {
      int var16 = 0;

      for (ArrayListHud.W141 var18 : O00000000O0) {
         float var19 = var18.O0000000000.O000000000000();
         if (!(var19 <= 0.01F)) {
            var16++;
         }
      }

      if (var16 > 0) {
         if (O00000000OOO0.length < var16) {
            O00000000OOO0 = new float[var16];
            O00000000OOO00 = new float[var16];
         }

         float[] var31 = O00000000OOO0;
         float[] var32 = O00000000OOO00;
         float var33 = 0.0F;
         float var20 = Float.MAX_VALUE;
         float var21 = 0.0F;
         int var22 = 0;

         for (ArrayListHud.W141 var24 : O00000000O0) {
            float var25 = var24.O0000000000.O000000000000();
            if (!(var25 <= 0.01F)) {
               float var26 = Math.max(1.0F, var24.O00000000(k, j, bl, bl2, bl3) * l);
               float var27 = h * var25 + (var22 < var16 - 1 ? i * var25 : 0.0F);
               var33 += var27;
               var31[var22] = var26;
               var32[var22] = var33;
               var20 = Math.min(var20, var26);
               var21 = Math.max(var21, var26);
               var22++;
            }
         }

         if (!(var20 <= 1.0F) && !(var33 <= 1.0F)) {
            float var34 = Math.min(15.0F * m, h * 0.5F);
            int var35 = this.O0000000000O00(n);
            float var36 = Math.max(1.5F, 2.0F * l);
            boolean var37 = this.O0000000O.O000000000("Обволакивание");
            if (this.O0000000000O00()) {
               this.O00000000(o0000O00OO0O0, f, g, var21, var33, var34, n);
               if (bl) {
                  float var39 = Math.max(1.35F, 1.8F * l);
                  float var40 = f + O00000000(5.0F * l, var21 - 5.0F * l - var39, o);
                  o0000O00OO0O0.O000000000(var40, g + 5.0F * m, var39, Math.max(1.0F, var33 - 10.0F * m), var39, this.O00000000000O(n), this.O00000000000O0(n));
               }
            } else {
               if (bl4) {
                  if (var37) {
                     this.O00000000(
                        o0000O00OO0O0,
                        f,
                        g,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        h,
                        m,
                        var34,
                        var36,
                        O0000O000OO000.O00000000(this.O00000000000O(n), Math.round(52.0F * n)),
                        Math.max(8.0F, 10.0F * m),
                        Math.max(1.0F, 1.4F * m),
                        o
                     );
                     this.O00000000(
                        o0000O00OO0O0,
                        f,
                        g,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        h,
                        m,
                        var34,
                        var36,
                        O0000O000OO000.O00000000(this.O00000000000O0(n), Math.round(32.0F * n)),
                        Math.max(16.0F, 22.0F * m),
                        Math.max(2.0F, 3.0F * m),
                        o
                     );
                  } else {
                     o0000O00OO0O0.O00000000(
                        f,
                        g,
                        var21,
                        var33,
                        var34,
                        Math.max(8.0F, 10.0F * m),
                        Math.max(1.0F, 1.4F * m),
                        O0000O000OO000.O00000000(this.O00000000000O(n), Math.round(52.0F * n))
                     );
                     o0000O00OO0O0.O00000000(
                        f,
                        g,
                        var21,
                        var33,
                        var34,
                        Math.max(16.0F, 22.0F * m),
                        Math.max(2.0F, 3.0F * m),
                        O0000O000OO000.O00000000(this.O00000000000O0(n), Math.round(32.0F * n))
                     );
                  }
               }

               if (this.O000000000OO.O000000000("Тень")) {
                  if (var37) {
                     this.O00000000(
                        o0000O00OO0O0,
                        f,
                        g,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        h,
                        m,
                        var34,
                        var36,
                        this.O0000000000O(n),
                        Math.max(4.0F, 4.0F * m),
                        Math.max(1.0F, 1.0F * m),
                        o
                     );
                  } else {
                     o0000O00OO0O0.O00000000(f, g, var21, var33, var34, Math.max(4.0F, 4.0F * m), Math.max(1.0F, 1.0F * m), this.O0000000000O(n));
                  }
               }

               if (this.O00000000000OO()) {
                  if (var37) {
                     this.O00000000(o0000O00OO0O0, f, g, var21, var31, var32, var16, var20, var33, h, m, var34, var36, var35, n, true, false, o);
                  } else {
                     o0000O00OO0O0.O00000000(23.0F);
                     o0000O00OO0O0.O00000000(f, g, var21, var33, var34, n);
                  }
               }

               if (var37) {
                  this.O00000000(o0000O00OO0O0, f, g, var21, var31, var32, var16, var20, var33, h, m, var34, var36, var35, n, false, true, o);
               } else {
                  o0000O00OO0O0.O00000000(f, g, var21, var33, var34, var35);
               }

               if (this.O000000000000()) {
                  if (var37) {
                     this.O00000000(
                        o0000O00OO0O0,
                        f,
                        g,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        h,
                        m,
                        var34,
                        this.O00000000000(n),
                        Math.max(1.0F, this.O0000000000() * 0.55F),
                        o
                     );
                  } else {
                     o0000O00OO0O0.O00000000(f, g, var21, var33, var34, this.O00000000000(n), Math.max(1.0F, this.O0000000000() * 0.55F));
                  }
               }

               if (bl) {
                  float var38 = Math.max(1.35F, 1.8F * l);
                  float var28 = f + O00000000(5.0F * l, var21 - 5.0F * l - var38, o);
                  int var29 = this.O00000000000O(n);
                  int var30 = this.O00000000000O0(n);
                  o0000O00OO0O0.O000000000(var28, g + 5.0F * m, var38, Math.max(1.0F, var33 - 10.0F * m), var38, var29, var30);
               }
            }
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float[] fs,
      float[] gs,
      int i,
      float j,
      float k,
      float l,
      float m,
      float n,
      int o,
      float p,
      float q
   ) {
      if (i > 0 && O0000O000OO000.O00000000(o) > 0) {
         float var16 = Math.max(1.0F, p);
         float var17 = var16 * 0.5F;
         O00000000(o0000O00OO0O0, f, h, 0.0F, g + n, var16, Math.max(1.0F, k - n * 2.0F), var17, o, q);
         O00000000(o0000O00OO0O0, f, h, n, g, Math.max(1.0F, fs[0] - n * 2.0F), var16, var17, o, q);

         for (int var18 = 0; var18 < i; var18++) {
            float var19 = var18 == 0 ? 0.0F : gs[var18 - 1];
            float var20 = gs[var18];
            float var21 = var18 == 0 ? fs[var18] : fs[var18 - 1];
            float var22 = var18 == i - 1 ? fs[var18] : fs[var18 + 1];
            float var23 = var18 == 0 ? n : (fs[var18] > var21 + 0.5F ? this.O000000000(n, fs[var18] - var21, l, m) : 0.0F);
            float var24 = var18 == i - 1 ? n : (fs[var18] > var22 + 0.5F ? this.O000000000(n, fs[var18] - var22, l, m) : 0.0F);
            float var25 = g + var19 + var23;
            float var26 = g + var20 - var24;
            if (var26 > var25) {
               O00000000(o0000O00OO0O0, f, h, fs[var18] - var16, var25, var16, var26 - var25, var17, o, q);
            }

            if (var18 < i - 1 && Math.abs(fs[var18] - fs[var18 + 1]) > 0.5F) {
               float var27 = Math.min(fs[var18], fs[var18 + 1]);
               float var28 = Math.max(fs[var18], fs[var18 + 1]);
               float var29 = var28 - var27;
               float var30 = this.O000000000(n, var29, l, m);
               O00000000(o0000O00OO0O0, f, h, var27 + var30 * 0.35F, g + var20 - var17, Math.max(1.0F, var29 - var30 * 0.7F), var16, var17, o, q);
            }
         }

         float var31 = fs[i - 1];
         O00000000(o0000O00OO0O0, f, h, n, g + k - var16, Math.max(1.0F, var31 - n * 2.0F), var16, var17, o, q);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float[] fs,
      float[] gs,
      int i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      int p,
      float q,
      boolean bl,
      boolean bl2,
      float r
   ) {
      for (int var19 = 0; var19 < i; var19++) {
         float var20 = var19 == 0 ? 0.0F : gs[var19 - 1];
         float var21 = gs[var19] - var20;
         float var22 = var19 == 0 ? fs[var19] : fs[var19 - 1];
         float var23 = var19 == i - 1 ? fs[var19] : fs[var19 + 1];
         float var24 = var19 == 0 ? n : 0.0F;
         float var25 = var19 == i - 1 ? n : 0.0F;
         float var26 = var19 == 0 ? n : (fs[var19] > var22 + 0.5F ? this.O000000000(n, fs[var19] - var22, l, m) : 0.0F);
         float var27 = var19 == i - 1 ? n : (fs[var19] > var23 + 0.5F ? this.O000000000(n, fs[var19] - var23, l, m) : 0.0F);
         this.O00000000(o0000O00OO0O0, f, g + var20, h, 0.0F, fs[var19], var21, var24, var26, var27, var25, p, q, bl, bl2, r);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float[] fs, float[] gs, int i, float j, float k, float l, float m, float n, int o, float p
   ) {
      int var15 = O0000O000OO000.O00000000(o);
      if (var15 > 0) {
         float var16 = 0.0F;
         this.O00000000(o0000O00OO0O0, f, g, h, fs, gs, i, j, k, l, m, n, var16, o, 1.0F, false, true, p);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float[] fs,
      float[] gs,
      int i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      int p,
      float q,
      float r,
      float s
   ) {
      if (O0000O000OO000.O00000000(p) > 0 && !(q <= 0.0F) && !(r <= 0.0F)) {
         for (int var18 = 0; var18 < i; var18++) {
            float var19 = var18 == 0 ? 0.0F : gs[var18 - 1];
            float var20 = gs[var18] - var19;
            float var21 = var18 == 0 ? fs[var18] : fs[var18 - 1];
            float var22 = var18 == i - 1 ? fs[var18] : fs[var18 + 1];
            float var23 = var18 == 0 ? n : 0.0F;
            float var24 = var18 == i - 1 ? n : 0.0F;
            float var25 = var18 == 0 ? n : (fs[var18] > var21 + 0.5F ? this.O000000000(n, fs[var18] - var21, l, m) : 0.0F);
            float var26 = var18 == i - 1 ? n : (fs[var18] > var22 + 0.5F ? this.O000000000(n, fs[var18] - var22, l, m) : 0.0F);
            this.O00000000(o0000O00OO0O0, f, g + var19, h, 0.0F, fs[var18], var20, var23, var25, var26, var24, p, q, r, s);
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, int p, float q, float r, float s
   ) {
      if (!(j <= 0.5F) && !(k <= 0.5F)) {
         float var16 = f + O00000000(i, h - i - j, s);
         float var17 = O00000000(l, m, s);
         float var18 = O00000000(m, l, s);
         float var19 = O00000000(n, o, s);
         float var20 = O00000000(o, n, s);
         o0000O00OO0O0.O00000000(var16, g, j, k, var17, var18, var19, var20, q, r, p);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      int p,
      float q,
      boolean bl,
      boolean bl2,
      float r
   ) {
      if (!(j <= 0.5F) && !(k <= 0.5F)) {
         float var17 = f + O00000000(i, h - i - j, r);
         float var18 = O00000000(l, m, r);
         float var19 = O00000000(m, l, r);
         float var20 = O00000000(n, o, r);
         float var21 = O00000000(o, n, r);
         if (bl) {
            o0000O00OO0O0.O00000000(23.0F);
            o0000O00OO0O0.O00000000(var17, g, j, k, var18, var19, var20, var21, q);
         }

         if (bl2) {
            o0000O00OO0O0.O00000000(var17, g, j, k, var18, var19, var20, var21, p);
         }
      }
   }

   private float O000000000(float f, float g, float h, float i) {
      float var5 = Math.max(4.0F * i, 3.0F);
      float var6 = Math.max(0.0F, g) * 0.72F;
      float var7 = h * 0.42F;
      return Math.min(f, Math.max(var5, Math.min(var6, var7)));
   }

   private int O0000000000O0(float f) {
      int var2 = this.O00000000(f);
      if (!"Тёмный".equals(this.O000000000O000.O0000000000()) && (this.O0000000000OO0() || !this.O0000000000O0())) {
         return var2;
      } else {
         int var3 = Math.round((210.0F - 92.0F * this.O0000000000OO()) * f);
         return O0000O000OO000.O00000000(var2, Math.max(O0000O000OO000.O00000000(var2), var3));
      }
   }

   private int O0000000000O00(float f) {
      int var2 = this.O00000000(f);
      if ("Тёмный".equals(this.O000000000O000.O0000000000())) {
         int var3 = Math.round(210.0F * f);
         return O0000O000OO000.O00000000(var2, Math.max(O0000O000OO000.O00000000(var2), var3));
      } else {
         return var2;
      }
   }

   private void O0000000000OOO() {
      O00000000.clear();
      O00000000O0.clear();
      boolean var1 = this.O0000000000OO0();

      for (Module var3 : WildClient.O00000000.O000000000.O000000000()) {
         if (var3 != null && var3.O00000000000O != Category.Visuals && !"Menu".equals(var3.O00000000000) && this.O00000000(var3.O00000000000O)) {
            ArrayListHud.W141 var4 = O00000000O00.computeIfAbsent(var3, ArrayListHud.W141::new);
            var4.O00000000(var3);
            if (var1) {
               var4.O0000000000.O00000000();
               var4.O0000000000.O00000000(var3.O0000000000000 ? 1.0 : 0.0, 0.23F, O0000O00O0OO0O.O0000000000O0O, false);
               if (var3.O0000000000000) {
                  O00000000.add(var3);
               }

               if (var3.O0000000000000 || var4.O0000000000.O000000000000() > 0.01F) {
                  O00000000O0.add(var4);
               }
            } else {
               float var5 = var4.O00000000000.O00000000(var3.O0000000000000 ? 1.0F : 0.0F, var3.O0000000000000 ? O00000000O00O0 : O00000000O00OO);
               var4.O000000000000.O00000000(var3.O0000000000000 ? 1.0F : 0.0F, O00000000O0O00);
               var4.O0000000000000.O00000000(0.0F, O00000000O0O0O);
               if (var3.O0000000000000) {
                  O00000000.add(var3);
               }

               if (var3.O0000000000000 || var5 > 0.01F || Math.abs(var4.O00000000000.O0000000000()) > 0.01F) {
                  O00000000O0.add(var4);
               }
            }
         }
      }

      O00000000O0.sort(ArrayListHud.W141.O00000000);
   }

   private boolean O00000000(Category o0000000OO0O0O) {
      return switch (o0000000OO0O0O == null ? Category.Misc : o0000000OO0O0O) {
         case Combat -> this.O00000000OOOO.O000000000("Combat");
         case Movement -> this.O00000000OOOO.O000000000("Movement");
         case Player -> this.O00000000OOOO.O000000000("Player");
         case Misc -> this.O00000000OOOO.O000000000("Misc");
         case Visuals -> false;
      };
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      ArrayListHud.W141 o00000000,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      int p,
      int q,
      boolean bl,
      boolean bl2,
      boolean bl3,
      float r
   ) {
      int var19 = Math.round(255.0F * n * o);
      int var20 = O0000O000OO000.O00000000(p, var19);
      int var21 = O0000O000OO000.O00000000(q, Math.round(O0000O000OO000.O00000000(q) * o));
      float var22 = bl ? 8.0F * l : 0.0F;
      float var23 = k * 0.92F;
      float var24 = bl2 && o00000000.O0000000000O0 != null ? TextMeasureCache.O000000000(FontRegistry.O00000000000O, o00000000.O0000000000O0, var23) : 0.0F;
      float var25 = bl2 && o00000000.O0000000000O0 != null ? 7.0F * l : 0.0F;
      String var26 = bl3 ? o00000000.O0000000000O00 : "";
      boolean var27 = !var26.isEmpty();
      float var28 = var27 ? 6.0F * l : 0.0F;
      float var29 = var27 ? TextMeasureCache.O000000000(FontRegistry.O00000000, var26, k) : 0.0F;
      float var30 = Math.max(12.0F * l, h - j * 2.0F - var22 - var24 - var25 - var28 - var29);
      String var31 = O00000000(o00000000.O0000000000O, k, var30);
      float var32 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var31, k);
      float var33 = var24 + var25 + var32 + var28 + var29;
      float var34 = f + j + var22;
      float var35 = var34 + (var24 > 0.0F ? var24 + var25 : 0.0F);
      float var36 = f + h - j - var22 - var33;
      float var37 = var36 + (var24 > 0.0F ? var24 + var25 : 0.0F);
      float var38 = O00000000(var34, var36, r);
      float var39 = O00000000(var35, var37, r);
      float var40 = var39 + var32 + var28;
      if (bl2 && o00000000.O0000000000O0 != null) {
         int var41 = O0000O000OO000.O00000000(this.O00000000000O(n), var19);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var38, g + i * 0.5F + 5.0F * m, var23, o00000000.O0000000000O0, var41);
      }

      float var43 = g + i * 0.5F + 5.0F * m;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var39, var43, k, var31, var20);
      if (var27) {
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var40, var43, k, var26, var21);
      }

      if (o < 0.98F) {
         float var42 = 3.0F * m;
         o0000O00OO0O0.O000000000(f + h - j * 0.5F, g + i * 0.5F, var42, 0.0F, 360.0F, var21);
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0,
      ArrayListHud.W141 o00000000,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      int p,
      int q,
      boolean bl,
      boolean bl2,
      boolean bl3,
      float r
   ) {
      if (!(h <= 2.0F) && !(i <= 4.0F) && !(o <= 0.005F)) {
         float var19 = O0000000000O0O(o00000000.O000000000000.O000000000());
         float var20 = Math.min(1.0F, Math.max(0.0F, o00000000.O0000000000000.O000000000()));
         int var21 = Math.round(255.0F * n * o * (0.58F + var19 * 0.42F));
         int var22 = O0000O000OO000.O00000000(p, var21);
         int var23 = O0000O000OO000.O00000000(q, Math.round(O0000O000OO000.O00000000(q) * o));
         float var24 = bl ? 8.0F * l : 0.0F;
         float var25 = k * 0.92F;
         float var26 = bl2 && o00000000.O0000000000O0 != null ? TextMeasureCache.O000000000(FontRegistry.O00000000000O, o00000000.O0000000000O0, var25) : 0.0F;
         float var27 = bl2 && o00000000.O0000000000O0 != null ? 7.0F * l : 0.0F;
         String var28 = bl3 ? o00000000.O0000000000O00 : "";
         boolean var29 = !var28.isEmpty();
         float var30 = var29 ? 6.0F * l : 0.0F;
         float var31 = var29 ? TextMeasureCache.O000000000(FontRegistry.O00000000, var28, k) : 0.0F;
         float var32 = Math.max(12.0F * l, h - j * 2.0F - var24 - var26 - var27 - var30 - var31);
         String var33 = O00000000(o00000000.O0000000000O, k, var32);
         float var34 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var33, k);
         float var35 = var26 + var27 + var34 + var30 + var31;
         float var36 = f + j + var24;
         float var37 = var36 + (var26 > 0.0F ? var26 + var27 : 0.0F);
         float var38 = f + h - j - var24 - var35;
         float var39 = var38 + (var26 > 0.0F ? var26 + var27 : 0.0F);
         float var40 = O00000000(var36, var38, r);
         float var41 = O00000000(var37, var39, r);
         float var42 = var41 + var34 + var30;
         float var43 = g + i * 0.5F + 5.0F * m + O000000000(o00000000.O00000000000O.O0000000000() * 0.018F, -2.8F * m, 2.8F * m);
         float var44 = Math.min(12.0F * m, Math.max(1.0F, i * 0.5F));
         o0000O00OO0O0.O00000000(f + 1.0F, g + 1.0F, Math.max(1.0F, h - 2.0F), Math.max(1.0F, i - 2.0F), var44, var44, var44, var44);

         try {
            if (bl2 && o00000000.O0000000000O0 != null) {
               int var45 = O0000O000OO000.O0000000000(
                  O0000O000OO000.O00000000(this.O00000000000O(n), var21), O0000O000OO000.O0000000000(255, 255, 255, var21), var20 * 0.22F
               );
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var40, var43, var25, o00000000.O0000000000O0, var45);
            }

            int var49 = O0000O000OO000.O0000000000(var22, O0000O000OO000.O0000000000(255, 255, 255, var21), var20 * 0.14F);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var41, var43, k, var33, var49);
            if (var29) {
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var42, var43, k, var28, var23);
            }
         } finally {
            o0000O00OO0O0.O0000000000000();
         }

         if (o < 0.98F) {
            float var50 = 3.0F * m;
            o0000O00OO0O0.O000000000(f + h - j * 0.5F, g + i * 0.5F, var50, 0.0F, 360.0F, var23);
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, int m, boolean bl) {
      float var11 = Math.min(10.0F, i * 0.45F);
      this.O00000000(o0000O00OO0O0, f, g, h, i, var11, l, bl);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, f + j, g + i * 0.5F + 5.0F, k, "Нет активных модулей ", m);
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, boolean bl) {
      if (this.O000000000OO.O000000000("Тень")) {
         if (bl) {
            o0000O00OO0O0.O00000000(f, g, h, i, j, 4.0F, 1.0F, O0000O000OO000.O0000000000(0, 0, 0, Math.round(80.0F * k)));
         } else {
            o0000O00OO0O0.O00000000(f, g, h, i, j, this.O0000000000O0O() ? 6.0F : 4.0F, 1.0F, this.O0000000000O(k));
         }
      }

      if (this.O00000000000OO()) {
         o0000O00OO0O0.O00000000(23.0F);
         o0000O00OO0O0.O00000000(f, g, h, i, j, k);
      }

      if (!bl && this.O0000000000O0()) {
         this.O000000000(o0000O00OO0O0, f, g, h, i, j, k);
      } else if (this.O0000000000O()) {
         o0000O00OO0O0.O00000000(f, g, h, i, j, this.O00000000(k));
      } else {
         o0000O00OO0O0.O00000000(f, g, h, i, j, this.O00000000000O() ? this.O0000000000(k) : this.O00000000(k));
         if (this.O000000000000()) {
            o0000O00OO0O0.O00000000(f, g, h, i, j, this.O00000000000(k), Math.max(1.0F, this.O0000000000() * 0.55F));
         }
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, int m, float n) {
      o0000O00OO0O0.O00000000(f + O00000000(h, g - h - j, n), i, j, k, l, m);
   }

   private static float O00000000(float f, float g, float h) {
      return f + (g - f) * Math.max(0.0F, Math.min(1.0F, h));
   }

   private static float O0000000000O0O(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   private static String O00000000(String string, float f, float g) {
      if (string != null && !string.isEmpty() && !(TextMeasureCache.O000000000(FontRegistry.O00000000000, string, f) <= g)) {
         String var3 = "...";
         float var4 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var3, f);
         if (var4 >= g) {
            return var3;
         } else {
            int var5 = 0;
            int var6 = string.length();

            while (var5 < var6) {
               int var7 = var5 + var6 + 1 >>> 1;
               if (TextMeasureCache.O000000000(FontRegistry.O00000000000, string.substring(0, var7), f) + var4 <= g) {
                  var5 = var7;
               } else {
                  var6 = var7 - 1;
               }
            }

            return var5 <= 0 ? var3 : string.substring(0, var5) + var3;
         }
      } else {
         return string == null ? "" : string;
      }
   }

   static final class W141 {
      static final Comparator<ArrayListHud.W141> O00000000 = (o00000000, o000000002) -> {
         int var2 = Float.compare(o000000002.O0000000000O0O, o00000000.O0000000000O0O);
         return var2 != 0 ? var2 : o00000000.O0000000000O.compareToIgnoreCase(o000000002.O0000000000O);
      };
      private final Module O000000000;
      final O0000O00O0OO O0000000000 = new O0000O00O0OO();
      final O0000O000O00O O00000000000 = new O0000O000O00O(0.0F);
      final O0000O000O00O O000000000000 = new O0000O000O00O(0.0F);
      final O0000O000O00O O0000000000000 = new O0000O000O00O(0.0F);
      final O0000O000O00O O000000000000O = new O0000O000O00O(0.0F);
      final O0000O000O00O O00000000000O = new O0000O000O00O(0.0F);
      private final O0000O000O00O O00000000000O0 = new O0000O000O00O(1.0F);
      private final O0000O000O00O O00000000000OO = new O0000O000O00O(1.0F);
      String O0000000000O = "";
      String O0000000000O0;
      String O0000000000O00 = "";
      private float O0000000000O0O;
      private float O0000000000OO;
      private float O0000000000OO0;
      float O0000000000OOO;
      float O000000000O;
      float O000000000O0 = 1.0F;
      float O000000000O00 = 1.0F;
      private boolean O000000000O000;
      private boolean O000000000O00O;
      private boolean O000000000O0O;
      boolean O000000000O0O0;

      private W141(Module module) {
         this.O000000000 = module;
      }

      void O00000000(Module module) {
         boolean var2 = module.O0000000000000;
         if (!this.O000000000O000) {
            this.O00000000000.O00000000(var2 ? 1.0F : 0.0F);
            this.O000000000000.O00000000(var2 ? 1.0F : 0.0F);
            this.O000000000O0O = var2;
            this.O000000000O000 = true;
         } else if (var2 != this.O000000000O0O) {
            this.O0000000000000.O0000000000(Math.min(2.25F, this.O0000000000000.O000000000() + (var2 ? 1.2F : 0.72F)));
            if (var2) {
               this.O000000000000.O00000000(0.0F);
            }

            this.O000000000O0O = var2;
         }

         String var3 = module.O00000000000OO();
         if (var3 == null || var3.isEmpty()) {
            var3 = module.O00000000000;
         }

         if (!var3.equals(this.O0000000000O)) {
            this.O0000000000O = var3;
            this.O0000000000O0O = TextMeasureCache.O000000000(FontRegistry.O00000000000, this.O0000000000O, 24.0F);
         }

         String var4 = module.O00000000000O == null ? null : module.O00000000000O.O00000000();
         if (var4 == null) {
            this.O0000000000O0 = null;
            this.O0000000000OO = 0.0F;
         } else if (!var4.equals(this.O0000000000O0)) {
            this.O0000000000O0 = var4;
            this.O0000000000OO = TextMeasureCache.O000000000(FontRegistry.O00000000000O, this.O0000000000O0, 22.08F);
         }

         String var5 = module.O000000000000 == -1 ? "" : "[" + O0000O000OO0O0.O00000000(module.O000000000000) + "]";
         if (!var5.equals(this.O0000000000O00)) {
            this.O0000000000O00 = var5;
            this.O0000000000OO0 = this.O0000000000O00.isEmpty() ? 0.0F : TextMeasureCache.O000000000(FontRegistry.O00000000, this.O0000000000O00, 24.0F);
         }
      }

      float O00000000(float f, float g, boolean bl, boolean bl2, boolean bl3) {
         float var6 = bl2 && this.O0000000000O0 != null ? TextMeasureCache.O000000000(FontRegistry.O00000000000O, this.O0000000000O0, f * 0.92F) + 7.0F : 0.0F;
         float var7 = bl3 && !this.O0000000000O00.isEmpty() ? TextMeasureCache.O000000000(FontRegistry.O00000000, this.O0000000000O00, f) + 6.0F : 0.0F;
         return TextMeasureCache.O000000000(FontRegistry.O00000000000, this.O0000000000O, f) + var6 + var7 + g * 2.0F + (bl ? 8.0F : 0.0F);
      }

      void O00000000(float f, float g, float h, float i) {
         if (!this.O000000000O00O) {
            this.O000000000000O.O00000000(f);
            this.O00000000000O.O00000000(g);
            this.O00000000000O0.O00000000(h);
            this.O00000000000OO.O00000000(i);
            this.O000000000O00O = true;
         } else {
            this.O000000000000O.O00000000(f, ArrayListHud.O00000000O0O);
            this.O00000000000O.O00000000(g, ArrayListHud.O00000000O0O);
            this.O00000000000O0.O00000000(h, ArrayListHud.O00000000O0O0);
            this.O00000000000OO.O00000000(i, ArrayListHud.O00000000O0O0);
         }

         this.O0000000000OOO = this.O000000000000O.O000000000();
         this.O000000000O = this.O00000000000O.O000000000();
         this.O000000000O0 = Math.max(0.0F, this.O00000000000O0.O000000000());
         this.O000000000O00 = Math.max(0.0F, this.O00000000000OO.O000000000());
      }

      boolean O00000000() {
         return this.O000000000O0O0;
      }
   }
}
