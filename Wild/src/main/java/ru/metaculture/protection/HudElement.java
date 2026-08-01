package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;

public abstract class HudElement extends O0000000OOO00 {
   public static final String O000000000 = "Тёмный";
   public static final String O0000000000 = "Светлый";
   public static final String O00000000000 = "Блюр";
   public static final String O000000000000 = "Неоморфизм";
   public static final String O0000000000000 = "Феррофлюид";
   public static final String O000000000000O = "Призма";
   public static final String O00000000000O = "Призма Core";
   public static final String O00000000000O0 = "Нео дистанция";
   public static final String O00000000000OO = "Нео размытие";
   public static final String O0000000000O = "Нео интенсивность";
   public static final String O0000000000O0 = "Нео форма";
   public static final String O0000000000O00 = "Плоская";
   public static final String O0000000000O0O = "Выпуклая";
   public static final String O0000000000OO = "Вогнутая";
   protected static final float O0000000000OO0 = 7.0F;
   protected static final float O0000000000OOO = 5.0F;
   protected static final float O000000000O = 10.0F;
   public final NumberSetting O000000000O0 = new NumberSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   public final NumberSetting O000000000O00 = new NumberSetting("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
   public final ModeSetting O000000000O000 = new ModeSetting("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Неоморфизм", "Феррофлюид", "Призма");
   public final NumberSetting O000000000O00O = new NumberSetting("Нео дистанция", 5.5F, 2.0F, 18.0F, 0.5F, false).O00000000(() -> !this.O0000000000O());
   public final NumberSetting O000000000O0O = new NumberSetting("Нео размытие", 18.0F, 6.0F, 48.0F, 1.0F, false).O00000000(() -> !this.O0000000000O());
   public final NumberSetting O000000000O0O0 = new NumberSetting("Нео интенсивность", 0.72F, 0.1F, 1.0F, 0.05F, true).O00000000(() -> !this.O0000000000O());
   public final ModeSetting O000000000O0OO = new ModeSetting("Нео форма", "Выпуклая", "Плоская", "Выпуклая", "Вогнутая").O00000000(() -> !this.O0000000000O());
   public final GroupSetting O000000000OO = new GroupSetting(
      "Визуал",
      new BooleanSetting("Тень", true),
      new BooleanSetting("Обводка", true),
      new BooleanSetting("Темные зоны", true),
      new BooleanSetting("Верхняя накладка", true),
      new BooleanSetting("Нижняя накладка", true),
      new BooleanSetting("Тёмный рект поверх", true)
   );
   private Theme O00000000;
   private boolean O000000000OO0;
   private ColorScheme O000000000OO00;
   private O0000O000OO.W351 O000000000OO0O;
   private Theme O000000000OOO;
   private long O000000000OOO0 = Long.MIN_VALUE;
   private int O000000000OOOO;
   private float O00000000O = 0.5F;
   private float O00000000O0 = 0.5F;
   private int O00000000O00;
   private final O0000O000O00O O00000000O000 = new O0000O000O00O(0.0F);
   private static final O0000O000OO O00000000O0000 = O0000O000OO.O00000000();

   public HudElement() {
      this.O00000000(this.O000000000O0);
      this.O00000000(this.O000000000O00);
      this.O00000000(this.O000000000O000);
      this.O00000000(this.O000000000O00O);
      this.O00000000(this.O000000000O0O);
      this.O00000000(this.O000000000O0O0);
      this.O00000000(this.O000000000O0OO);
      this.O00000000(this.O000000000OO);
   }

   public int O00000000(float f) {
      if (this.O0000000000O()) {
         return O00000OOOO00O0.O00000000(f);
      } else if (this.O0000000000O0()) {
         int var7 = (int)(232.0F * f);
         float var8 = this.O0000000000OO();
         int var9 = O0000O000OO000.O0000000000(
            O0000O000OO000.O0000000000(13, 15, 24, var7), O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O00(), var7), 0.12F
         );
         int var5 = O0000O000OO000.O0000000000(
            O0000O000OO000.O0000000000(250, 253, 255, (int)(152.0F * f)),
            O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O0(), (int)(132.0F * f)),
            0.055F
         );
         return O0000O000OO000.O0000000000(var9, var5, var8);
      } else if (this.O0000000000O00()) {
         int var6 = (int)(172.0F * f);
         return O0000O000OO000.O0000000000(
            O0000O000OO000.O0000000000(14, 18, 30, var6), O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O00(), var6), 0.1F
         );
      } else {
         int var2 = (int)(255.0F * f);
         if (this.O0000000000O0O()) {
            return O0000O000OO000.O00000000(this.O000000000O0(), (int)((this.O000000000() ? 152 : 176) * f));
         } else {
            String var3 = this.O000000000O000.O0000000000();

            return switch (var3) {
               case "Светлый" -> O0000O000OO000.O0000000000(240, 240, 245, var2);
               case "Блюр" -> O0000O000OO000.O0000000000(21, 22, 26, this.O00000000000O0() ? (int)(122.0F * f) : 0);
               default -> O0000O000OO000.O0000000000(20, 20, 20, var2);
            };
         }
      }
   }

   public int O000000000(float f) {
      return this.O00000000(f, this.O000000000000O());
   }

   public int O0000000000(float f) {
      return this.O00000000(f, this.O00000000000O());
   }

   private int O00000000(float f, boolean bl) {
      if (!bl) {
         return O0000O000OO000.O0000000000(0, 0, 0, 0);
      } else if (this.O0000000000O()) {
         return O00000OOOO00O0.O00000000(f);
      } else {
         float var3 = this.O00000000000OO(f);
         if (this.O0000000000O0()) {
            int var9 = (int)(202.0F * var3);
            float var10 = this.O0000000000OO();
            int var11 = O0000O000OO000.O0000000000(
               O0000O000OO000.O0000000000(15, 18, 30, var9), O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O0(), var9), 0.1F
            );
            int var7 = O0000O000OO000.O0000000000(
               O0000O000OO000.O0000000000(255, 255, 255, (int)(132.0F * var3)),
               O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O00(), (int)(118.0F * var3)),
               0.06F
            );
            return O0000O000OO000.O0000000000(var11, var7, var10);
         } else if (this.O0000000000O00()) {
            int var8 = (int)(150.0F * var3);
            return O0000O000OO000.O0000000000(
               O0000O000OO000.O0000000000(12, 16, 26, var8), O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O0(), var8), 0.08F
            );
         } else {
            int var4 = (int)(255.0F * var3);
            if (this.O0000000000O0O()) {
               return O0000O000OO000.O00000000(this.O000000000O00(), (int)((this.O000000000() ? 138 : 160) * var3));
            } else {
               String var5 = this.O000000000O000.O0000000000();

               return switch (var5) {
                  case "Светлый" -> O0000O000OO000.O0000000000(200, 200, 205, var4);
                  case "Блюр" -> O0000O000OO000.O0000000000(21, 22, 26, (int)(184.0F * var3));
                  default -> O0000O000OO000.O0000000000(25, 25, 25, var4);
               };
            }
         }
      }
   }

   public int O00000000000(float f) {
      if (this.O0000000000O()) {
         return O0000O000OO000.O0000000000(0, 0, 0, 0);
      } else if (this.O0000000000O0()) {
         float var6 = this.O0000000000OO();
         int var7 = O0000O000OO000.O00000000(this.O000000000O0O0(), (int)(92.0F * f));
         int var8 = O0000O000OO000.O0000000000(
            O0000O000OO000.O0000000000(20, 28, 42, (int)(56.0F * f)), O0000O000OO000.O00000000(this.O000000000O0OO(), (int)(76.0F * f)), 0.35F
         );
         return O0000O000OO000.O0000000000(var7, var8, var6);
      } else if (this.O0000000000O00()) {
         int var5 = O0000O000OO000.O0000000000(this.O0000000000OOO().O000000000O0(), this.O0000000000OOO().O000000000O00(), 0.5F);
         return O0000O000OO000.O00000000(var5, (int)(70.0F * f));
      } else {
         int var2 = (int)(255.0F * f);
         if (this.O0000000000OO0() == Theme.VERNAL_SOLSTICE) {
            return O0000O000OO000.O0000000000(5, 17, 5, (int)(46.0F * f));
         } else if (this.O0000000000O0O()) {
            return O0000O000OO000.O00000000(this.O000000000O000(), (int)((this.O000000000() ? 38 : 48) * f));
         } else {
            String var3 = this.O000000000O000.O0000000000();

            return switch (var3) {
               case "Светлый" -> O0000O000OO000.O0000000000(200, 200, 200, var2);
               case "Блюр" -> O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * f));
               default -> O0000O000OO000.O0000000000(45, 45, 45, var2);
            };
         }
      }
   }

   public int O000000000000(float f) {
      if (this.O0000000000O()) {
         return O00000OOOO00O0.O000000000(f);
      } else if (this.O0000000000O0()) {
         float var5 = this.O0000000000OO();
         int var3 = O0000O000OO000.O0000000000(242, 245, 255, (int)(255.0F * f));
         int var4 = O0000O000OO000.O0000000000(18, 25, 38, (int)(255.0F * f));
         return O0000O000OO000.O0000000000(var3, var4, var5);
      } else if (this.O0000000000O00()) {
         return O0000O000OO000.O0000000000(244, 247, 255, (int)(255.0F * f));
      } else {
         int var2 = (int)(255.0F * f);
         if (this.O0000000000OO0() == Theme.VERNAL_SOLSTICE) {
            return O0000O000OO000.O0000000000(5, 17, 5, var2);
         } else if (this.O0000000000O0O()) {
            return O0000O000OO000.O00000000(this.O000000000O00O(), var2);
         } else {
            return this.O000000000O000.O0000000000().equals("Светлый")
               ? O0000O000OO000.O0000000000(20, 20, 20, var2)
               : O0000O000OO000.O0000000000(255, 255, 255, var2);
         }
      }
   }

   public int O0000000000000(float f) {
      if (this.O0000000000O()) {
         return O00000OOOO00O0.O0000000000(f);
      } else if (this.O0000000000O0()) {
         float var5 = this.O0000000000OO();
         int var6 = O0000O000OO000.O0000000000(170, 177, 196, (int)(214.0F * f));
         int var7 = O0000O000OO000.O0000000000(72, 84, 108, (int)(224.0F * f));
         return O0000O000OO000.O0000000000(var6, var7, var5);
      } else if (this.O0000000000O00()) {
         return O0000O000OO000.O0000000000(176, 184, 204, (int)(220.0F * f));
      } else {
         int var2 = (int)(255.0F * f);
         if (this.O0000000000OO0() == Theme.VERNAL_SOLSTICE) {
            return O0000O000OO000.O0000000000(5, 17, 5, (int)(184.0F * f));
         } else if (this.O0000000000O0O()) {
            return O0000O000OO000.O00000000(this.O000000000O0O(), var2);
         } else {
            String var3 = this.O000000000O000.O0000000000();

            return switch (var3) {
               case "Светлый" -> O0000O000OO000.O0000000000(80, 80, 80, var2);
               case "Блюр" -> O0000O000OO000.O0000000000(255, 255, 255, (int)(122.0F * f));
               default -> O0000O000OO000.O0000000000(170, 170, 170, var2);
            };
         }
      }
   }

   public int O000000000000O(float f) {
      return this.O0000000000O0()
         ? O0000O000OO000.O00000000(ColorScheme.O00000000(this.O000000000O0O0(), this.O000000000O0OO(), 0.55F), (int)(255.0F * f))
         : O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O00(), (int)(255.0F * f));
   }

   public int O00000000000O(float f) {
      return this.O0000000000O0()
         ? O0000O000OO000.O00000000(this.O000000000O0O0(), (int)(255.0F * f))
         : O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O0(), (int)(255.0F * f));
   }

   public int O00000000000O0(float f) {
      return this.O0000000000O0()
         ? O0000O000OO000.O00000000(this.O000000000O0OO(), (int)(255.0F * f))
         : O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O00(), (int)(255.0F * f));
   }

   public float O00000000000OO(float f) {
      return f * this.O000000000O00.O0000000000();
   }

   public float O0000000000() {
      return this.O000000000O000.O0000000000().equals("Блюр") ? 1.0F : 1.5F;
   }

   public boolean O00000000000() {
      return !this.O0000000000O() && this.O000000000OO.O000000000("Тень");
   }

   public boolean O000000000000() {
      return !this.O0000000000O() && this.O000000000OO.O000000000("Обводка");
   }

   public boolean O0000000000000() {
      return this.O000000000OO.O000000000("Темные зоны");
   }

   public boolean O000000000000O() {
      return this.O0000000000000() && this.O000000000OO.O000000000("Верхняя накладка");
   }

   public boolean O00000000000O() {
      return this.O0000000000000() && this.O000000000OO.O000000000("Нижняя накладка");
   }

   public boolean O00000000000O0() {
      return this.O000000000OO.O000000000("Тёмный рект поверх");
   }

   public boolean O00000000000OO() {
      return !this.O0000000000O() && !this.O0000000000O0() && !this.O0000000000O00() ? this.O000000000O000.O0000000000().equals("Блюр") : false;
   }

   public boolean O0000000000O() {
      return "Неоморфизм".equals(this.O000000000O000.O0000000000());
   }

   public boolean O0000000000O0() {
      return "Феррофлюид".equals(this.O000000000O000.O0000000000());
   }

   public boolean O0000000000O00() {
      return "Призма".equals(this.O000000000O000.O0000000000()) || "Призма Core".equals(this.O000000000O000.O0000000000());
   }

   public static boolean O00000000(String string) {
      return "Неоморфизм".equals(string);
   }

   public static boolean O000000000(String string) {
      return "Феррофлюид".equals(string);
   }

   public static boolean O0000000000(String string) {
      return "Призма".equals(string);
   }

   public boolean O00000000(float f, float g, float h, float i, float j, boolean bl, float k) {
      return this.O0000000000O()
         && O00000OOOO00O0.O00000000(
            null,
            f,
            g,
            h,
            i,
            j,
            bl,
            k,
            O00000OOOO00O0.O00000000(
               this.O000000000O00O.O0000000000(), this.O000000000O0O.O0000000000(), this.O000000000O0O0.O0000000000(), this.O000000000O0OO.O0000000000()
            )
         );
   }

   public boolean O00000000(float f, float g, float h, float i, float j, boolean bl, float k, int l) {
      return this.O0000000000O()
         && O00000OOOO00O0.O00000000(
            null, f, g, h, i, j, this.O000000000O00O.O0000000000(), this.O000000000O0O.O0000000000(), this.O000000000O0O0.O0000000000(), l, bl, k
         );
   }

   public boolean O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, boolean bl, float o) {
      return this.O0000000000O() && O00000OOOO00O0.O00000000(null, f, g, h, i, j, k, l, m, n, bl, o);
   }

   public void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      this.O00000000(f, g, h, i);
      if (!O00000OOOO00O0.O00000000(null, f, g, h, i, j, k)) {
         if (!this.O00000000(f, g, h, i, j, false, k)) {
            if (!this.O00000000(o0000O00OO0O0, f, g, h, i, j, false, k)) {
               if (!this.O000000000(o0000O00OO0O0, f, g, h, i, j, false, k)) {
                  if (this.O00000000000()) {
                     o0000O00OO0O0.O00000000(f, g, h, i, j, this.O0000000000O0O() ? 6.0F : 4.0F, 1.0F, this.O0000000000O(k));
                  }

                  if (this.O00000000000OO()) {
                     o0000O00OO0O0.O00000000(23.0F);
                     o0000O00OO0O0.O00000000(f, g, h, i, j, k);
                  }

                  if (this.O0000000000O0O() && !this.O00000000000OO()) {
                     this.O00000000(o0000O00OO0O0, f, g, h, i, j, this.O00000000(k), false, k);
                  } else {
                     o0000O00OO0O0.O00000000(f, g, h, i, j, this.O00000000(k));
                  }

                  if (this.O000000000000()) {
                     o0000O00OO0O0.O00000000(f, g, h, i, j, this.O00000000000(k), this.O0000000000());
                  }
               }
            }
         }
      }
   }

   public void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      this.O00000000(f, g, h, i);
      if (!this.O00000000(o0000O00OO0O0, f, g, h, i, j, true, k)) {
         if (!this.O000000000(o0000O00OO0O0, f, g, h, i, j, true, k)) {
            if (this.O00000000000O()) {
               if (!this.O00000000(f, g, h, i, j, true, k)) {
                  if (this.O0000000000O0O() && !this.O00000000000OO()) {
                     this.O00000000(o0000O00OO0O0, f, g, h, i, j, this.O0000000000(k), true, k);
                  } else {
                     o0000O00OO0O0.O00000000(f, g, h, i, j, this.O0000000000(k));
                  }

                  if (this.O000000000000()) {
                     o0000O00OO0O0.O00000000(f, g, h, i, j, this.O00000000000(k), Math.max(1.0F, this.O0000000000() * 0.65F));
                  }
               }
            }
         }
      }
   }

   protected boolean O0000000000O0O() {
      return "Светлый".equals(this.O000000000O000.O0000000000()) || O00000OOOO00O0.O00000000000();
   }

   private boolean O000000000() {
      Theme var1 = this.O0000000000OO0();
      return this.O0000000000O0O() && (var1 == Theme.SAKURA_BREEZE || var1 == Theme.SAKURA);
   }

   protected float O0000000000OO() {
      return this.O00000000O000.O00000000(this.O0000000000O0O() ? 1.0F : 0.0F, O0000O000O0O00.O0000000000OO0());
   }

   protected void O00000000(float f, float g, float h, float i) {
      int var5 = 0;
      int var6 = 0;

      try {
         MinecraftClient var7 = MinecraftClient.getInstance();
         if (var7 != null && var7.getWindow() != null) {
            var5 = var7.getWindow().getFramebufferWidth();
            var6 = var7.getWindow().getFramebufferHeight();
         }
      } catch (Throwable var11) {
      }

      if (var5 > 0 && var6 > 0 && Float.isFinite(f) && Float.isFinite(g) && Float.isFinite(h) && Float.isFinite(i)) {
         this.O00000000O = this.O0000000000O0((f + h * 0.5F) / var5);
         this.O00000000O0 = this.O0000000000O0((g + i * 0.5F) / var6);
         int var12 = Math.round(this.O00000000O * 2048.0F);
         int var8 = Math.round(this.O00000000O0 * 2048.0F);
         int var9 = Math.round(Math.max(1.0F, h) * 0.25F);
         int var10 = Math.round(Math.max(1.0F, i) * 0.25F);
         this.O00000000O00 = (var12 * 7349 ^ var8 * 9151) * 31 ^ var9 * 131 ^ var10;
      } else {
         this.O00000000O = 0.5F;
         this.O00000000O0 = 0.5F;
         this.O00000000O00 = 0;
      }
   }

   private boolean O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, boolean bl, float k) {
      return this.O0000000000O0()
         && O00000O00OO0O0.O00000000(
            o0000O00OO0O0,
            f,
            g,
            h,
            i,
            j,
            k,
            bl,
            this.O00000000(k),
            this.O00000000000(k),
            this.O00000000000O(k),
            this.O00000000000O0(k),
            this.O00000000000(),
            true,
            this.O0000000000OO()
         );
   }

   private boolean O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, boolean bl, float k) {
      return this.O0000000000O00()
         && O00000O0O000.O00000000(
            o0000O00OO0O0,
            f,
            g,
            h,
            i,
            j,
            k,
            bl,
            this.O00000000(k),
            this.O00000000000(k),
            this.O00000000000O(k),
            this.O00000000000O0(k),
            this.O00000000000(),
            this.O000000000000(),
            this.O0000000000OO()
         );
   }

   private Theme O0000000000OO0() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
   }

   private ColorScheme O0000000000OOO() {
      Theme var1 = this.O0000000000OO0();
      boolean var2 = this.O0000000000O0O();
      long var3 = System.currentTimeMillis();
      long var5 = var3 / 16L;
      if (this.O000000000OO00 == null
         || this.O00000000 != var1
         || this.O000000000OO0 != var2
         || this.O000000000OOO0 != var5
         || this.O000000000OOOO != this.O00000000O00
         || var1 == Theme.CUSTOM) {
         ColorScheme var7 = ColorScheme.O00000000(var1, var2);
         this.O000000000OO00 = this.O00000000(var1, ColorScheme.O00000000(var1, var7, var3), var3);
         this.O00000000 = var1;
         this.O000000000OO0 = var2;
         this.O000000000OOO0 = var5;
         this.O000000000OOOO = this.O00000000O00;
      }

      return this.O000000000OO00;
   }

   private ColorScheme O00000000(Theme o0000000OOO, ColorScheme o0000O000O0OO, long l) {
      O0000O000OO.W351 var5 = this.O000000000O();
      int[] var6 = var5 == null ? null : var5.O0000000000000();
      if (o0000O000O0OO != null && var6 != null && var6.length >= 2) {
         float var7 = this.O00000000(l);
         int var8 = this.O00000000(var6, var7);
         int var9 = this.O00000000(var6, var7 + 0.31F);
         int var10 = this.O00000000(var6, var7 + 0.67F);
         float var11 = var6.length > 2 ? 1.0F : 0.52F;
         float var12 = 0.34F + 0.3F * var11;
         float var13 = o0000O000O0OO.O000000000O000() ? 0.018F + 0.02F * var11 : 0.045F + 0.05F * var11;
         float var14 = o0000O000O0OO.O000000000O000() ? 0.06F + 0.035F * var11 : 0.16F + 0.1F * var11;
         int var15 = O0000O000OO000.O0000000000(o0000O000O0OO.O000000000O0(), O0000O000OO000.O0000000000(var8, -1, 0.1F), var12);
         int var16 = O0000O000OO000.O0000000000(o0000O000O0OO.O000000000O00(), var9, var12);
         int var17 = ColorScheme.O000000000(o0000O000O0OO.O0000000000000(), var10, var13);
         int var18 = ColorScheme.O000000000(o0000O000O0OO.O000000000000O(), var9, var13 * 1.08F);
         int var19 = ColorScheme.O000000000(o0000O000O0OO.O0000000000O0O(), var8, var14);
         int var20 = ColorScheme.O000000000(o0000O000O0OO.O0000000000OO(), var9, var14);
         int var21 = o0000O000O0OO.O000000000O000()
            ? o0000O000O0OO.O0000000000OO0()
            : ColorScheme.O000000000(o0000O000O0OO.O0000000000OO0(), var10, 0.1F + 0.08F * var11);
         int var22 = o0000O000O0OO.O000000000O000()
            ? o0000O000O0OO.O0000000000OOO()
            : ColorScheme.O000000000(o0000O000O0OO.O0000000000OOO(), var8, 0.08F + 0.06F * var11);
         int var23 = o0000O000O0OO.O000000000O000()
            ? o0000O000O0OO.O000000000O()
            : O0000O000OO000.O0000000000(o0000O000O0OO.O000000000O(), var8, 0.025F + 0.025F * var11);
         return ColorScheme.O000000000000()
            .O00000000(var17)
            .O000000000(var18)
            .O0000000000(o0000O000O0OO.O00000000000O())
            .O00000000000(o0000O000O0OO.O00000000000O0())
            .O000000000000(o0000O000O0OO.O00000000000OO())
            .O0000000000000(o0000O000O0OO.O0000000000O())
            .O000000000000O(o0000O000O0OO.O0000000000O0())
            .O00000000000O(o0000O000O0OO.O0000000000O00())
            .O00000000000O0(var19)
            .O00000000000OO(var20)
            .O0000000000O(var21)
            .O0000000000O0(var22)
            .O0000000000O00(var23)
            .O0000000000O0O(var15)
            .O0000000000OO(var16)
            .O00000000(o0000O000O0OO.O000000000O000())
            .O00000000();
      } else {
         return o0000O000O0OO;
      }
   }

   private float O00000000(long l) {
      float var3 = (float)(l % 14000L) / 14000.0F;
      float var4 = (float)Math.sin((this.O00000000O * 1.72F - this.O00000000O0 * 1.18F + var3 * 1.35F) * (float) (Math.PI * 2)) * 0.055F;
      return this.O00000000O * 0.54F + this.O00000000O0 * 0.36F + var3 * 0.58F + var4;
   }

   private int O00000000(int[] is, float f) {
      if (is.length == 1) {
         return is[0];
      } else {
         float var3 = f - (float)Math.floor(f);
         float var4 = var3 * (is.length - 1);
         int var5 = Math.min(is.length - 2, Math.max(0, (int)Math.floor(var4)));
         return O0000O000OO000.O0000000000(is[var5], is[var5 + 1], var4 - var5);
      }
   }

   private float O0000000000O0(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private O0000O000OO.W351 O000000000O() {
      Theme var1 = this.O0000000000OO0();
      if (this.O000000000OO0O == null || this.O000000000OOO != var1 || var1 == Theme.CUSTOM) {
         this.O000000000OO0O = O00000000O0000.O000000000(var1);
         this.O000000000OOO = var1;
      }

      return this.O000000000OO0O;
   }

   private int O000000000O0() {
      ColorScheme var1 = this.O0000000000OOO();
      if (this.O000000000()) {
         int var4 = O0000O000OO000.O0000000000(-1283, var1.O000000000O0(), 0.05F);
         return O0000O000OO000.O0000000000(var4, var1.O000000000O00(), 0.03F);
      } else {
         int var2 = O0000O000OO000.O0000000000(-196865, var1.O000000000O0(), 0.026F);
         O0000O000OO.W351 var3 = this.O000000000O();
         if (var3 != null && var3.O000000000000()) {
            var2 = O0000O000OO000.O0000000000(var2, var3.O0000000000(), 0.022F);
         }

         return var2;
      }
   }

   private int O000000000O00() {
      ColorScheme var1 = this.O0000000000OOO();
      if (this.O000000000()) {
         int var4 = O0000O000OO000.O0000000000(-1, var1.O000000000O00(), 0.07F);
         return O0000O000OO000.O0000000000(var4, var1.O000000000O0(), 0.03F);
      } else {
         int var2 = O0000O000OO000.O0000000000(-1, var1.O000000000O00(), 0.022F);
         O0000O000OO.W351 var3 = this.O000000000O();
         if (var3 != null && var3.O000000000000()) {
            var2 = O0000O000OO000.O0000000000(var2, var3.O00000000000(), 0.018F);
         }

         return var2;
      }
   }

   private int O000000000O000() {
      ColorScheme var1 = this.O0000000000OOO();
      int var2 = O0000O000OO000.O0000000000(var1.O000000000O0(), var1.O000000000O00(), 0.44F);
      return this.O000000000() ? O0000O000OO000.O0000000000(-7582617, var2, 0.48F) : O0000O000OO000.O0000000000(-15261133, var2, 0.34F);
   }

   private int O000000000O00O() {
      ColorScheme var1 = this.O0000000000OOO();
      return O0000O000OO000.O0000000000(-15722718, var1.O000000000O0(), 0.035F);
   }

   private int O000000000O0O() {
      ColorScheme var1 = this.O0000000000OOO();
      return O0000O000OO000.O0000000000(-12168086, var1.O000000000O00(), 0.055F);
   }

   public int O0000000000O(float f) {
      if (this.O0000000000O0O()) {
         ColorScheme var2 = this.O0000000000OOO();
         if (this.O000000000()) {
            int var4 = O0000O000OO000.O0000000000(-2779216, var2.O000000000O00(), 0.26F);
            return O0000O000OO000.O00000000(var4, (int)(34.0F * f));
         } else {
            int var3 = O0000O000OO000.O0000000000(-10787208, var2.O000000000O00(), 0.1F);
            return O0000O000OO000.O00000000(var3, (int)(46.0F * f));
         }
      } else {
         return O0000O000OO000.O0000000000(0, 0, 0, (int)(80.0F * f));
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, int k, boolean bl, float l) {
      int var10 = O0000O000OO000.O00000000(k);
      ColorScheme var11 = this.O0000000000OOO();
      float var12 = this.O000000000() ? 0.115F : 0.055F;
      float var13 = this.O000000000() ? 0.085F : 0.04F;
      int var14 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(k, var11.O000000000O0(), bl ? var12 * 0.76F : var12), var10);
      int var15 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(k, var11.O000000000O00(), bl ? var13 * 0.7F : var13), var10);
      o0000O00OO0O0.O000000000(f, g, h, i, j, var14, var15);
      if (!bl && i > 10.0F) {
         float var16 = Math.max(4.0F, Math.min(i * 0.36F, 18.0F));
         int var17 = O0000O000OO000.O0000000000(255, 255, 255, (int)((this.O000000000() ? 34 : 24) * l));
         o0000O00OO0O0.O000000000(
            f + 1.0F, g + 1.0F, Math.max(1.0F, h - 2.0F), var16, Math.max(0.0F, j - 1.0F), var17, O0000O000OO000.O0000000000(255, 255, 255, 0)
         );
      }
   }

   private int O000000000O0O0() {
      return ColorScheme.O000000000(O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O0(), 255), -1, 0.2F);
   }

   private int O000000000O0OO() {
      return ColorScheme.O000000000(O0000O000OO000.O00000000(this.O0000000000OOO().O000000000O00(), 255), -1, 0.12F);
   }
}
