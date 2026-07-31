package ru.metaculture.protection;

import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import org.lwjgl.glfw.GLFW;

public final class O00000OO000O {
   private static final float O000000000 = 0.65F;
   private static final float O0000000000 = 1.0F;
   static final O0000O00O0O0O0 O00000000000 = O0000O00O0O0O0.O00000000(4.0F, 0.85F);
   static final O0000O00O0O0O0 O000000000000 = O0000O00O0O0O0.O00000000(2.5F, 0.9F);
   static final O0000O00O0O0O0 O0000000000000 = O0000O00O0O0O0.O00000000(6.0F, 0.8F);
   static final O0000O00O0O0O0 O000000000000O = O0000O00O0O0O0.O00000000(5.0F, 0.85F);
   private static final O0000O00O0O0O0 O00000000000O = O0000O00O0O0O0.O00000000(2.2F, 1.0F);
   private static final float O00000000000O0 = 12.0F;
   private static final float O00000000000OO = 5.0F;
   private static final float O0000000000O = 6.0F;
   private static final int O0000000000O0 = 32;
   private static final O00000OO000O.W218 O0000000000O00 = new O00000OO000O.W218(0.82F, 1.18F, 0.72F, 0.22F, 6.0F);
   private static final O00000OO000O.W218 O0000000000O0O = new O00000OO000O.W218(0.78F, 1.16F, 0.46F, 0.1F, 6.0F);
   private static final O00000OO000O.W218 O0000000000OO = new O00000OO000O.W218(0.72F, 1.48F, 0.42F, 0.34F, 6.0F);
   private static final O00000OO000O.W218 O0000000000OO0 = new O00000OO000O.W218(0.78F, 1.34F, 0.36F, 0.26F, 6.0F);
   private static final O00000OO000O.W218 O0000000000OOO = new O00000OO000O.W218(0.72F, 1.36F, 0.38F, 0.42F, 6.0F);
   private static final O00000OO000O.W218 O000000000O = new O00000OO000O.W218(0.72F, 1.32F, 0.32F, 0.56F, 6.0F);
   private static final O00000OO000O.W218 O000000000O0 = new O00000OO000O.W218(0.72F, 1.18F, 0.34F, 0.52F, 6.0F);
   private static final O00000OO000O.W218 O000000000O00 = new O00000OO000O.W218(0.7F, 1.42F, 0.45F, 0.72F, 6.0F);
   private static final O00000OO000O.W218 O000000000O000 = new O00000OO000O.W218(0.78F, 1.12F, 0.38F, 0.34F, 6.0F);
   private static final O00000OO000O.W218 O000000000O00O = new O00000OO000O.W218(0.72F, 1.32F, 0.38F, 0.56F, 6.0F);
   private static final O00000OO000O.W218 O000000000O0O = new O00000OO000O.W218(0.76F, 1.32F, 0.24F, 0.3F, 6.0F);
   private static final O00000OO000O.W218 O000000000O0O0 = new O00000OO000O.W218(0.72F, 1.35F, 0.4F, 0.58F, 6.0F);
   private static final O00000OO000O.W218 O000000000O0OO = new O00000OO000O.W218(0.72F, 1.42F, 0.42F, 0.55F, 6.0F);
   private static final O00000OO000O O000000000OO = new O00000OO000O();
   private final Map<String, O00000OO000O.W220> O000000000OO0 = new HashMap<>();
   private final Map<String, O00000OO000O.W223> O000000000OO00 = new ConcurrentHashMap<>();
   private final Map<String, Float> O000000000OO0O = new ConcurrentHashMap<>();
   private final O00000OO000O.W222[] O000000000OOO = new O00000OO000O.W222[32];
   private final O00000OO000O.W222[] O000000000OOO0 = new O00000OO000O.W222[32];
   private final double[] O000000000OOOO = new double[1];
   private final double[] O00000000O = new double[1];
   private final O00000OO000O.W224 O00000000O0 = new O00000OO000O.W224();
   private RenderManager O00000000O00;
   private MinecraftClient O00000000O000;
   private boolean O00000000O0000;
   private float O00000000O000O;
   private float O00000000O00O;
   private boolean O00000000O00O0;
   private boolean O00000000O00OO;
   private boolean O00000000O0O;
   private boolean O00000000O0O0;
   private boolean O00000000O0O00;
   private boolean O00000000O0O0O;
   private boolean O00000000O0OO;
   private boolean O00000000O0OO0;
   private boolean O00000000O0OOO;
   private int O00000000OO;
   private int O00000000OO0;
   private String O00000000OO00 = null;
   private float O00000000OO000 = Float.NaN;
   private float O00000000OO00O = Float.NaN;
   private float O00000000OO0O = 0.0F;
   private float O00000000OO0O0 = Float.NaN;
   private float O00000000OO0OO = Float.MAX_VALUE;
   private boolean O00000000OOO;
   private boolean O00000000OOO0;
   private boolean O00000000OOO00;
   private float O00000000OOO0O;
   private float O00000000OOOO;
   private final O0000O00O0O0OO O00000000OOOO0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000000O, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
   private final O0000O00O0O0OO O00000000OOOOO = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000000000O, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
   private float O0000000O = 1.0F;
   private float O0000000O0 = 1.0F;
   private String O0000000O00 = "Тёмный";
   private float O0000000O000 = 5.5F;
   private float O0000000O0000 = 18.0F;
   private float O0000000O00000 = 0.72F;
   private String O0000000O0000O = "Выпуклая";
   private boolean O0000000O000O = true;
   private boolean O0000000O000O0 = true;
   private boolean O0000000O000OO = true;
   private boolean O0000000O00O = true;
   private boolean O0000000O00O0 = true;
   private boolean O0000000O00O00 = true;
   private int O0000000O00O0O;
   private int O0000000O00OO;
   private Theme O0000000O00OO0;
   private boolean O0000000O00OOO;
   private ColorScheme O0000000O0O;
   public final O00000OO000O.W221 O00000000 = new O00000OO000O.W221();

   private O00000OO000O() {
      for (int var1 = 0; var1 < 32; var1++) {
         this.O000000000OOO[var1] = new O00000OO000O.W222();
         this.O000000000OOO0[var1] = new O00000OO000O.W222();
      }
   }

   public static O00000OO000O O00000000() {
      return O000000000OO;
   }

   public void O000000000() {
      this.O00000000O00OO = false;
      this.O00000000OO00 = null;
   }

   public void O00000000(MinecraftClient minecraftClient, RenderManager o0000O00OO0O0, int i, int j) {
      this.O00000000O000 = minecraftClient;
      this.O00000000O00 = Objects.requireNonNull(o0000O00OO0O0, "renderer");
      this.O00000000OO = Math.max(0, i);
      this.O00000000OO0 = Math.max(0, j);
      this.O00000000O0000 = true;
      this.O00000000O00O0 = false;
      this.O00000000OOO = false;
      this.O00000000OO000 = Float.NaN;
      this.O00000000OO00O = Float.NaN;
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         this.O00000000O0OOO = minecraftClient.currentScreen instanceof ChatScreen;
         long var5 = minecraftClient.getWindow().getHandle();
         if (var5 != 0L) {
            GLFW.glfwGetCursorPos(var5, this.O000000000OOOO, this.O00000000O);
            if (Double.isFinite(this.O000000000OOOO[0]) && Double.isFinite(this.O00000000O[0])) {
               this.O00000000O000O = (float)this.O000000000OOOO[0];
               this.O00000000O00O = (float)this.O00000000O[0];
               this.O00000000O00O0 = true;
            }

            if (this.O00000000O00O0 && this.O00000000O0OOO) {
               boolean var7 = GLFW.glfwGetMouseButton(var5, 0) == 1;
               this.O00000000O0O = var7 && !this.O00000000O0O0;
               this.O00000000O00OO = var7;
               this.O00000000O0O0 = var7;
               boolean var8 = GLFW.glfwGetMouseButton(var5, 2) == 1;
               this.O00000000O0O0O = var8 && !this.O00000000O0O00;
               this.O00000000O0O00 = var8;
               boolean var9 = GLFW.glfwGetMouseButton(var5, 1) == 1;
               this.O00000000O0OO = var9 && !this.O00000000O0OO0;
               this.O00000000O0OO0 = var9;
            } else {
               this.O00000000O00OO = this.O00000000O0O = this.O00000000O0O0O = this.O00000000O0OO = false;
               this.O00000000O0O0 = this.O00000000O0O00 = this.O00000000O0OO0 = false;
            }
         }

         if (!this.O00000000O00OO) {
            this.O00000000OO00 = null;
         }

         if (!this.O00000000O00OO && this.O00000000OOO0) {
            this.O00000000OOO0 = false;
            if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }
         }
      } else {
         this.O00000000O00OO = this.O00000000O0O = this.O00000000O0O0O = this.O00000000O0OO = false;
         this.O00000000O0O0 = this.O00000000O0O00 = this.O00000000O0OO0 = false;
         this.O00000000O0OOO = false;
      }
   }

   public void O0000000000() {
      this.O0000000000O0();
      boolean var1 = this.O00000000O0OOO && this.O00000000O00OO && this.O00000000OO00 != null;
      this.O00000000OOOOO.O0000000000(var1 ? 1.0F : 0.0F);
      float var2 = this.O00000000OOOOO.O00000000();
      if ((this.O00000000O0OOO || !(var2 <= 0.01F)) && this.O00000000OO > 0 && this.O00000000OO0 > 0) {
         ColorScheme var3 = this.O0000000000O00();
         int var4 = var3 == null ? -7473153 : var3.O000000000O0();
         int var5 = var3 == null ? -41059 : var3.O000000000O00();
         O00000OO000O0.O00000000()
            .O00000000(
               this.O00000000OO,
               this.O00000000OO0,
               this.O000000000OOO,
               this.O0000000O00O0O,
               this.O00000000OO00,
               this.O00000000O000O,
               this.O00000000O00O,
               var2,
               var4,
               var5
            );
      }
   }

   public void O00000000(int i, int j, O00000OO000O.W222[] o000000000000s, int k, String string, float f, float g, float h) {
      ColorScheme var9 = this.O0000000000O00();
      int var10 = var9 == null ? -7473153 : var9.O000000000O0();
      int var11 = var9 == null ? -41059 : var9.O000000000O00();
      O00000OO000O0.O00000000().O00000000(i, j, o000000000000s, k, string, f, g, h, var10, var11);
   }

   public void O00000000000() {
      if (this.O00000000O0OOO && this.O00000000O00O0) {
         float var1 = 170.0F;
         float var2 = 24.0F;

         for (Setting var4 : this.O00000000.O00000000()) {
            if (var4 instanceof BooleanSetting) {
               var2 += 28.0F;
            } else if (var4 instanceof NumberSetting) {
               var2 += 40.0F;
            } else if (var4 instanceof ModeSetting) {
               var2 += 28.0F;
            } else if (var4 instanceof GroupSetting var5) {
               var2 += 28.0F + var5.O00000000000.size() * 28.0F * var5.O0000000000000.O000000000000();
            }
         }

         O00000O0O00O.W165 var33 = this.O00000000O00 != null
            ? O00000O0O00O.O00000000(this.O00000000O00, this.O00000000, this.O00000000OOO0O, this.O00000000OOOO, 0.0F, 0.0F)
            : new O00000O0O00O.W165(this.O00000000OOO0O, this.O00000000OOOO, var1, var2);
         boolean var35 = this.O00000000OOO00 && var33.contains(this.O00000000O000O, this.O00000000O00O, 10.0F);
         if (this.O00000000O0OO) {
            if (this.O00000000OOO) {
               this.O00000000OOO00 = false;
            } else if (!var35) {
               this.O00000000OOO00 = !this.O00000000OOO00;
               if (this.O00000000OOO00) {
                  this.O00000000OOO0O = this.O00000000O000O;
                  this.O00000000OOOO = this.O00000000O00O;
               }
            }

            this.O00000000O0OO = false;
         }

         if (this.O00000000O0O && (this.O00000000OOO || !var35 && this.O00000000OOO00)) {
            this.O00000000OOO00 = false;
         }
      }

      if (!this.O00000000O0OOO) {
         this.O00000000OOO00 = false;
      }

      this.O00000000OOOO0.O0000000000(this.O00000000OOO00 ? 1.0F : 0.0F);
      float var31 = this.O00000000OOOO0.O00000000();
      if (var31 > 0.01F && this.O00000000O00 != null) {
         this.O00000000O00.O00000000(this.O00000000OO, this.O00000000OO0);
         O00000O0O00O.O00000000(
            this.O00000000O00,
            this.O00000000,
            this.O00000000OOO0O,
            this.O00000000OOOO,
            0.0F,
            0.0F,
            this.O00000000OO,
            this.O00000000OO0,
            var31,
            this.O00000000O000O,
            this.O00000000O00O,
            this.O00000000O0O,
            this.O00000000O00OO
         );
         this.O00000000O00.O000000000();
         float var32 = this.O00000000.O00000000.O0000000000();
         float var34 = this.O00000000.O000000000.O0000000000();
         String var36 = this.O00000000.O0000000000.O0000000000();
         float var37 = this.O00000000.O00000000000.O0000000000();
         float var6 = this.O00000000.O000000000000.O0000000000();
         float var7 = this.O00000000.O0000000000000.O0000000000();
         String var8 = this.O00000000.O000000000000O.O0000000000();
         boolean var9 = this.O00000000.O00000000000O.O000000000("Тень");
         boolean var10 = this.O00000000.O00000000000O.O000000000("Обводка");
         boolean var11 = this.O00000000.O00000000000O.O000000000("Темные зоны");
         boolean var12 = this.O00000000.O00000000000O.O000000000("Верхняя накладка");
         boolean var13 = this.O00000000.O00000000000O.O000000000("Нижняя накладка");
         boolean var14 = this.O00000000.O00000000000O.O000000000("Тёмный рект поверх");
         if (var32 != this.O0000000O
            || var34 != this.O0000000O0
            || !var36.equals(this.O0000000O00)
            || var37 != this.O0000000O000
            || var6 != this.O0000000O0000
            || var7 != this.O0000000O00000
            || !var8.equals(this.O0000000O0000O)
            || var9 != this.O0000000O000O
            || var10 != this.O0000000O000O0
            || var11 != this.O0000000O000OO
            || var12 != this.O0000000O00O
            || var13 != this.O0000000O00O0
            || var14 != this.O0000000O00O00) {
            this.O0000000O = var32;
            this.O0000000O0 = var34;
            this.O0000000O00 = var36;
            this.O0000000O000 = var37;
            this.O0000000O0000 = var6;
            this.O0000000O00000 = var7;
            this.O0000000O0000O = var8;
            this.O0000000O000O = var9;
            this.O0000000O000O0 = var10;
            this.O0000000O000OO = var11;
            this.O0000000O00O = var12;
            this.O0000000O00O0 = var13;
            this.O0000000O00O00 = var14;

            for (O0000000OOO00 var16 : ru.metaculture.protection.O000000000O0O0.O000000000()) {
               if (var16 != this.O00000000) {
                  for (Setting var18 : var16.O00000000()) {
                     // VF-fix: Vineflower could not reconstruct this Java 21 type-switch
                     // (SwitchBootstraps.typeSwitch); rewritten as an equivalent if/instanceof chain.
                     if (var18 instanceof NumberSetting numberSetting) {
                        if (var18.O00000000.equals("Прозрачность")) {
                           numberSetting.O00000000(var32);
                        } else if (var18.O00000000.equals("Прозрачность тёмных элементов")) {
                           numberSetting.O00000000(var34);
                        } else if (var18.O00000000.equals("Нео дистанция")) {
                           numberSetting.O00000000(var37);
                        } else if (var18.O00000000.equals("Нео размытие")) {
                           numberSetting.O00000000(var6);
                        } else if (var18.O00000000.equals("Нео интенсивность")) {
                           numberSetting.O00000000(var7);
                        }
                     } else if (var18 instanceof ModeSetting modeSetting) {
                        if (var18.O00000000.equals("Стилистика")) {
                           int idx = modeSetting.O00000000000.indexOf(var36);
                           if (idx != -1) {
                              modeSetting.O00000000000O = idx;
                              modeSetting.O000000000000 = var36;
                           }
                        } else if (var18.O00000000.equals("Нео форма")) {
                           int idx = modeSetting.O00000000000.indexOf(var8);
                           if (idx != -1) {
                              modeSetting.O00000000000O = idx;
                              modeSetting.O000000000000 = var8;
                           }
                        }
                     } else if (var18 instanceof GroupSetting groupSetting) {
                        if (var18.O00000000.equals("Визуал")) {
                           for (BooleanSetting var30 : groupSetting.O00000000000) {
                              if (var30.O00000000.equals("Тень")) {
                                 var30.O000000000(var9);
                              }

                              if (var30.O00000000.equals("Обводка")) {
                                 var30.O000000000(var10);
                              }

                              if (var30.O00000000.equals("Темные зоны")) {
                                 var30.O000000000(var11);
                              }

                              if (var30.O00000000.equals("Верхняя накладка")) {
                                 var30.O000000000(var12);
                              }

                              if (var30.O00000000.equals("Нижняя накладка")) {
                                 var30.O000000000(var13);
                              }

                              if (var30.O00000000.equals("Тёмный рект поверх")) {
                                 var30.O000000000(var14);
                              }
                           }
                        }
                     }
                  }
               }
            }

            ru.metaculture.protection.O000000000O0O0.O00000000000();
         }
      }

      this.O00000000O0000 = false;
      this.O00000000O00 = null;
   }

   public O00000OO000O.W219 O00000000(String string, float f, float g, float h, float i) {
      if (!this.O00000000O0000) {
         throw new IllegalStateException("beginFrame must be called first");
      } else {
         String var6 = string.trim();
         O00000OO000O.W223 var7 = this.O000000000OO00.get(var6);
         O00000OO000O.W220 var8 = this.O000000000OO0.computeIfAbsent(string, stringx -> new O00000OO000O.W220());
         var8.O00000000000O0 = O00000000(h);
         var8.O00000000000OO = O00000000(i);
         O00000OO000O.W218 var9 = this.O0000000000(var6);
         boolean var10 = this.O00000000O00O0 && this.O00000000O0OOO;
         Float var11 = var7 == null ? this.O000000000OO0O.remove(var6) : null;
         boolean var12 = var11 != null;
         boolean var13 = var7 != null && var7.userResized() || var12;
         float var14 = var12 ? var11 : this.O00000000(var7, var13);
         O00000OO000O.W224 var15 = this.O0000000000(var6, h, i, var14);
         var14 = var15.O0000000000();
         if (!var8.O0000000000) {
            var8.O000000000000O = var15.O00000000();
            var8.O00000000000O = var15.O000000000();
         }

         float var16 = this.O00000000(var7, f, var8.O000000000000O, var9);
         float var17 = this.O000000000(var7, g, var8.O00000000000O, var9);
         if (var12) {
            this.O00000000(var6, var16, var17, var14, var14, true);
            var7 = this.O000000000OO00.get(var6);
         }

         float var18 = var8.O00000000 ? var8.O0000000000O00.O00000000() : var16;
         float var19 = var8.O00000000 ? var8.O0000000000O0O.O00000000() : var17;
         boolean var20 = O00000000(this.O00000000O000O, this.O00000000O00O, var18, var19, var8.O000000000000O, var8.O00000000000O);
         boolean var21 = O00000000(
            this.O00000000O000O, this.O00000000O00O, var18 + var8.O000000000000O - 12.0F, var19 + var8.O00000000000O - 12.0F, 12.0F, 12.0F
         );
         if (var10 && (var20 || var21)) {
            this.O00000000OOO = true;
         }

         var8.O0000000000OO.O0000000000(!var10 || !var20 && !var21 ? 0.0F : 1.0F);
         if (var10 && this.O00000000O0OO && var20) {
            var8.O00000000000 = !var8.O00000000000;
            this.O00000000OOO00 = false;
            this.O00000000O0OO = false;
         }

         if (!this.O00000000O0OOO) {
            var8.O00000000000 = false;
         }

         var8.O0000000000OO0.O0000000000(var8.O00000000000 ? 1.0F : 0.0F);
         if (var10 && this.O00000000O0O0O && (var20 || var21)) {
            this.O00000000(var6, var8.O0000000000O00.O0000000000(), var8.O0000000000O0O.O0000000000(), 1.0F, 1.0F, false);
            var7 = this.O000000000OO00.get(var6);
            var13 = false;
            var14 = 1.0F;
            var15 = this.O0000000000(var6, h, i, var14);
            var8.O000000000000O = var15.O00000000();
            var8.O00000000000O = var15.O000000000();
            var16 = this.O00000000(var7, f, var8.O000000000000O, var9);
            var17 = this.O000000000(var7, g, var8.O00000000000O, var9);
            if (string.equals(this.O00000000OO00)) {
               this.O00000000OO00 = null;
            }

            var8.O0000000000 = false;
            this.O00000000O0O0O = false;
         }

         if (!var8.O00000000) {
            var8.O0000000000O00.O000000000(var16);
            var8.O0000000000O0O.O000000000(var17);
            var8.O00000000 = true;
         }

         if (!this.O00000000O00OO || !var10) {
            var8.O000000000 = false;
            var8.O0000000000 = false;
         } else if (!var8.O000000000 && !var8.O0000000000 && (this.O00000000OO00 == null || this.O00000000OO00.equals(string))) {
            if (var21) {
               var8.O0000000000 = true;
               this.O00000000OO00 = string;
               var8.O000000000000 = var8.O000000000000O - this.O00000000O000O;
               var8.O0000000000000 = var8.O00000000000O - this.O00000000O00O;
            } else if (var20) {
               var8.O000000000 = true;
               this.O00000000OO00 = string;
               var8.O000000000000 = this.O00000000O000O - var18;
               var8.O0000000000000 = this.O00000000O00O - var19;
            }
         }

         boolean var22 = var8.O000000000 && string.equals(this.O00000000OO00);
         boolean var23 = var8.O0000000000 && string.equals(this.O00000000OO00);
         if (var22 || var23) {
            this.O00000000OOO00 = false;
         }

         boolean var24 = this.O00000000O000 != null
            && this.O00000000O000.getWindow() != null
            && (GLFW.glfwGetKey(this.O00000000O000.getWindow().getHandle(), 341) == 1 || GLFW.glfwGetKey(this.O00000000O000.getWindow().getHandle(), 345) == 1);
         if (var22) {
            var16 = this.O00000000(this.O00000000O000O - var8.O000000000000, var8.O000000000000O, var9);
            var17 = this.O000000000(this.O00000000O00O - var8.O0000000000000, var8.O00000000000O, var9);
            if (var24) {
               var16 = Math.round(var16 / 10.0F) * 10.0F;
               var17 = Math.round(var17 / 10.0F) * 10.0F;
            }

            float var35 = this.O000000000(var6, var16, var8.O000000000000O);
            float var38 = this.O0000000000(var6, var17, var8.O00000000000O);
            var16 = this.O00000000(var35, var8.O000000000000O, var9);
            var17 = this.O000000000(var38, var8.O00000000000O, var9);
            this.O00000000(var6, var16, var17, var14, var14, var13);
         } else if (var23) {
            float var25 = Math.max(1.0F, this.O00000000O000O + var8.O000000000000);
            float var26 = Math.max(1.0F, this.O00000000O00O + var8.O0000000000000);
            float var27 = var25 / Math.max(1.0F, h);
            float var28 = var26 / Math.max(1.0F, i);
            float var29 = (var27 + var28) * 0.5F;
            if (var24) {
               var29 = Math.round(var29 * 20.0F) / 20.0F;
            }

            O00000OO000O.W224 var30 = this.O0000000000(var6, h, i, var29);
            var8.O000000000000O = var30.O00000000();
            var8.O00000000000O = var30.O000000000();
            var14 = var30.O0000000000();
            var16 = this.O00000000(var16, var8.O000000000000O, var9);
            var17 = this.O000000000(var17, var8.O00000000000O, var9);
            this.O00000000(var6, var16, var17, var14, var14, true);
         } else if (var13 && var7 != null && (Math.abs(var7.scaleX() - var14) > 0.001F || Math.abs(var7.scaleY() - var14) > 0.001F)) {
            this.O00000000(var6, var16, var17, var14, var14, Math.abs(var14 - 1.0F) > 0.01F);
         }

         var16 = this.O00000000(var16, var8.O000000000000O, var9);
         var17 = this.O000000000(var17, var8.O00000000000O, var9);
         var8.O0000000000O00.O0000000000(var16);
         var8.O0000000000O0O.O0000000000(var17);
         float var40 = var8.O0000000000O00.O00000000();
         float var41 = var8.O0000000000O0O.O00000000();
         float var42 = !var22 && !var23 ? 1.0F : 0.65F;
         var8.O0000000000O0.O0000000000(var42);
         float var43 = var8.O0000000000O0.O00000000();
         boolean var44 = false;
         if (var43 < 0.99F) {
            this.O00000000O00.O000000000000(var43);
            var44 = true;
         }

         boolean var45 = var10
            && O00000000(this.O00000000O000O, this.O00000000O00O, var40 + var8.O000000000000O - 12.0F, var41 + var8.O00000000000O - 12.0F, 12.0F, 12.0F);
         return var8.O0000000000O
            .O00000000(
               string,
               var40,
               var41,
               var8.O000000000000O,
               var8.O00000000000O,
               var22 || var23,
               var45,
               var44,
               var8.O00000000000,
               var8.O0000000000OO.O00000000(),
               var8.O0000000000OO0.O00000000()
            );
      }
   }

   public O00000OO000O.W219 O000000000(String string, float f, float g, float h, float i) {
      if (!this.O00000000O0000) {
         throw new IllegalStateException("beginFrame must be called first");
      } else {
         String var6 = string.trim();
         O00000OO000O.W223 var7 = this.O000000000OO00.get(var6);
         O00000OO000O.W220 var8 = this.O000000000OO0.computeIfAbsent(string, stringx -> new O00000OO000O.W220());
         var8.O00000000000O0 = O00000000(h);
         var8.O00000000000OO = O00000000(i);
         O00000OO000O.W218 var9 = this.O0000000000(var6);
         boolean var10 = this.O00000000O00O0 && this.O00000000O0OOO;
         Float var11 = var7 == null ? this.O000000000OO0O.remove(var6) : null;
         boolean var12 = var11 != null;
         boolean var13 = var7 != null && var7.userResized() || var12;
         float var14 = var12 ? var11 : this.O00000000(var7, var13);
         O00000OO000O.W224 var15 = this.O0000000000(var6, h, i, var14);
         var14 = var15.O0000000000();
         if (!var8.O0000000000) {
            var8.O000000000000O = var15.O00000000();
            var8.O00000000000O = var15.O000000000();
         }

         float var16 = this.O00000000(var7, f, var8.O000000000000O, var9);
         float var17 = this.O000000000(var7, g, var8.O00000000000O, var9);
         if (var12) {
            this.O00000000(var6, var16, var17, var14, var14, true);
            var7 = this.O000000000OO00.get(var6);
         }

         float var18 = O000000000(f, var16);
         float var19 = O000000000(g, var17);
         boolean var20 = O00000000(this.O00000000O000O, this.O00000000O00O, var18, var19, var8.O000000000000O, var8.O00000000000O);
         boolean var21 = O00000000(
            this.O00000000O000O, this.O00000000O00O, var18 + var8.O000000000000O - 12.0F, var19 + var8.O00000000000O - 12.0F, 12.0F, 12.0F
         );
         if (var10 && (var20 || var21)) {
            this.O00000000OOO = true;
         }

         var8.O0000000000OO.O0000000000(!var10 || !var20 && !var21 ? 0.0F : 1.0F);
         if (var10 && this.O00000000O0OO && var20) {
            var8.O00000000000 = !var8.O00000000000;
            this.O00000000OOO00 = false;
            this.O00000000O0OO = false;
         }

         if (!this.O00000000O0OOO) {
            var8.O00000000000 = false;
         }

         var8.O0000000000OO0.O0000000000(var8.O00000000000 ? 1.0F : 0.0F);
         var8.O000000000 = false;
         if (var10 && this.O00000000O0O0O && (var20 || var21)) {
            this.O00000000(var6, var16, var17, 1.0F, 1.0F, false);
            var7 = this.O000000000OO00.get(var6);
            var13 = false;
            var14 = 1.0F;
            var15 = this.O0000000000(var6, h, i, var14);
            var8.O000000000000O = var15.O00000000();
            var8.O00000000000O = var15.O000000000();
            if (string.equals(this.O00000000OO00)) {
               this.O00000000OO00 = null;
            }

            var8.O0000000000 = false;
            this.O00000000O0O0O = false;
         }

         if (!this.O00000000O00OO || !var10) {
            var8.O0000000000 = false;
         } else if (!var8.O0000000000 && (this.O00000000OO00 == null || this.O00000000OO00.equals(string)) && var21) {
            var8.O0000000000 = true;
            this.O00000000OO00 = string;
            var8.O000000000000 = var8.O000000000000O - this.O00000000O000O;
            var8.O0000000000000 = var8.O00000000000O - this.O00000000O00O;
         }

         boolean var22 = var8.O0000000000 && string.equals(this.O00000000OO00);
         if (var22) {
            this.O00000000OOO00 = false;
            float var23 = Math.max(1.0F, this.O00000000O000O + var8.O000000000000);
            float var24 = Math.max(1.0F, this.O00000000O00O + var8.O0000000000000);
            float var25 = var23 / Math.max(1.0F, h);
            float var26 = var24 / Math.max(1.0F, i);
            float var27 = (var25 + var26) * 0.5F;
            if (this.O00000000O000 != null
               && this.O00000000O000.getWindow() != null
               && (
                  GLFW.glfwGetKey(this.O00000000O000.getWindow().getHandle(), 341) == 1
                     || GLFW.glfwGetKey(this.O00000000O000.getWindow().getHandle(), 345) == 1
               )) {
               var27 = Math.round(var27 * 20.0F) / 20.0F;
            }

            O00000OO000O.W224 var28 = this.O0000000000(var6, h, i, var27);
            var8.O000000000000O = var28.O00000000();
            var8.O00000000000O = var28.O000000000();
            var14 = var28.O0000000000();
            this.O00000000(var6, var16, var17, var14, var14, true);
         } else if (var13 && var7 != null && (Math.abs(var7.scaleX() - var14) > 0.001F || Math.abs(var7.scaleY() - var14) > 0.001F)) {
            this.O00000000(var6, var16, var17, var14, var14, Math.abs(var14 - 1.0F) > 0.01F);
         }

         float var32 = var22 ? 0.65F : 1.0F;
         var8.O0000000000O0.O0000000000(var32);
         float var33 = var8.O0000000000O0.O00000000();
         boolean var34 = false;
         if (var33 < 0.99F) {
            this.O00000000O00.O000000000000(var33);
            var34 = true;
         }

         boolean var35 = var10
            && O00000000(this.O00000000O000O, this.O00000000O00O, var18 + var8.O000000000000O - 12.0F, var19 + var8.O00000000000O - 12.0F, 12.0F, 12.0F);
         return var8.O0000000000O
            .O00000000(
               string,
               var18,
               var19,
               var8.O000000000000O,
               var8.O00000000000O,
               var22,
               var35,
               var34,
               var8.O00000000000,
               var8.O0000000000OO.O00000000(),
               var8.O0000000000OO0.O00000000()
            );
      }
   }

   public O00000OO000O.W219 O00000000(O00000OO000O.W219 o000000000, float f, float g, float h, float i) {
      if (o000000000 != null && o000000000.O00000000 != null && !(f <= 0.0F) && !(g <= 0.0F) && Float.isFinite(f) && Float.isFinite(g)) {
         O00000OO000O.W220 var6 = this.O000000000OO0.get(o000000000.O00000000);
         if (var6 == null) {
            return o000000000;
         } else {
            O00000OO000O.W218 var7 = this.O0000000000(o000000000.O00000000.trim());
            float var8 = (float)Math.sqrt(Math.max(1.0E-4F, f / Math.max(1.0F, h) * (g / Math.max(1.0F, i))));
            O00000OO000O.W224 var9 = this.O0000000000(o000000000.O00000000, h, i, var8);
            float var10 = var9.O00000000();
            float var11 = var9.O000000000();
            float var12 = this.O00000000(o000000000.O000000000, var10, var7);
            float var13 = this.O000000000(o000000000.O0000000000, var11, var7);
            var6.O000000000000O = var10;
            var6.O00000000000O = var11;
            String var14 = o000000000.O00000000.trim();
            float var15 = this.O00000000(Float.isFinite(var6.O0000000000O00.O0000000000()) ? var6.O0000000000O00.O0000000000() : var12, var10, var7);
            float var16 = this.O000000000(Float.isFinite(var6.O0000000000O0O.O0000000000()) ? var6.O0000000000O0O.O0000000000() : var13, var11, var7);
            var6.O0000000000O00.O0000000000(var15);
            var6.O0000000000O0O.O0000000000(var16);
            boolean var17 = Math.abs(var9.O0000000000() - 1.0F) > 0.01F;
            this.O00000000(var14, var15, var16, var9.O0000000000(), var9.O0000000000(), var17);
            boolean var18 = this.O00000000O0OOO
               && this.O00000000O00O0
               && O00000000(this.O00000000O000O, this.O00000000O00O, var12 + var10 - 12.0F, var13 + var11 - 12.0F, 12.0F, 12.0F);
            return o000000000.O00000000(
               o000000000.O00000000,
               var12,
               var13,
               var10,
               var11,
               o000000000.O00000000000O,
               var18,
               o000000000.O00000000000OO,
               o000000000.O0000000000O,
               o000000000.O0000000000000,
               o000000000.O000000000000O
            );
         }
      } else {
         return o000000000;
      }
   }

   public void O00000000(O00000OO000O.W219 o000000000) {
      this.O000000000(
         o000000000,
         o000000000 == null ? 0.0F : o000000000.O000000000,
         o000000000 == null ? 0.0F : o000000000.O0000000000,
         o000000000 == null ? 0.0F : o000000000.O00000000000,
         o000000000 == null ? 0.0F : o000000000.O000000000000
      );
   }

   public void O000000000(O00000OO000O.W219 o000000000, float f, float g, float h, float i) {
      if (o000000000 != null && this.O00000000O00 != null) {
         this.O0000000000(o000000000, f, g, h, i);
         if (this.O00000000O0OOO && o000000000.O00000000 != null) {
            float var10 = Math.max(o000000000.O0000000000000, o000000000.O00000000000O ? 1.0F : 0.0F);
            if (var10 > 0.01F) {
               float var11 = Math.max(5.0F, Math.min(12.0F, Math.min(h, i) * 0.16F));
               int var12 = O0000O000OO000.O0000000000(255, 255, 255, (int)((o000000000.O00000000000O ? 62 : 34) * var10));
               int var13 = O0000O000OO000.O0000000000(125, 210, 255, (int)((o000000000.O00000000000O ? 28 : 14) * var10));
               this.O00000000O00.O00000000(f, g, h, i, var11, o000000000.O00000000000O ? 7.0F : 4.0F, 0.8F, var13);
               this.O00000000O00.O00000000(f, g, h, i, var11, var12, o000000000.O00000000000O ? 1.25F : 1.0F);
            }

            int var14 = !o000000000.O00000000000O0 && !o000000000.O00000000000O ? 721420287 : -2130706433;
            float var15 = f + h - 6.0F;
            float var16 = g + i - 6.0F;
            this.O00000000O00.O00000000(var15, var16, 2.5F, 2.5F, 1.0F, var14);
            this.O00000000O00.O00000000(var15 - 4.5F, var16, 2.5F, 2.5F, 1.0F, var14);
            this.O00000000O00.O00000000(var15, var16 - 4.5F, 2.5F, 2.5F, 1.0F, var14);
            if (o000000000.O0000000000000 > 0.01F && !o000000000.O00000000000O) {
               this.O00000000(this.O00000000O00, f, g, h, o000000000.O0000000000000);
            }

            if (o000000000.O00000000000O) {
               this.O00000000(this.O00000000O00);
            }
         }

         if (o000000000.O00000000000OO) {
            this.O00000000O00.O00000000000OO();
         }
      }
   }

   private void O000000000(O00000OO000O.W219 o000000000) {
      this.O0000000000(
         o000000000,
         o000000000 == null ? 0.0F : o000000000.O000000000,
         o000000000 == null ? 0.0F : o000000000.O0000000000,
         o000000000 == null ? 0.0F : o000000000.O00000000000,
         o000000000 == null ? 0.0F : o000000000.O000000000000
      );
   }

   private void O0000000000(O00000OO000O.W219 o000000000, float f, float g, float h, float i) {
      if (o000000000 != null && o000000000.O00000000 != null && Float.isFinite(f) && Float.isFinite(g) && !(h <= 0.0F) && !(i <= 0.0F)) {
         int var6 = this.O0000000O00OO;
         if (var6 >= 32) {
            if (!o000000000.O00000000000O) {
               return;
            }

            var6 = 31;
         } else {
            this.O0000000O00OO++;
         }

         float var7 = f + h * 0.5F;
         float var8 = g + i * 0.5F;
         float var9 = (float)Math.sqrt(h * h + i * i) * 0.5F;
         float var10 = o000000000.O00000000000O ? 1.0F : 0.34F + Math.min(0.24F, o000000000.O0000000000000 * 0.24F);
         this.O000000000OOO0[var6].O00000000(o000000000.O00000000, var7, var8, Math.max(34.0F, var9), var10, h, i);
      }
   }

   private void O0000000000O0() {
      this.O0000000O00O0O = this.O0000000O00OO;

      for (int var1 = 0; var1 < this.O0000000O00O0O; var1++) {
         this.O000000000OOO[var1].O00000000(this.O000000000OOO0[var1]);
      }

      this.O0000000O00OO = 0;
   }

   private ColorScheme O0000000000O00() {
      Theme var1 = Theme.WILD;
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
         var1 = WildClient.O00000000.O0000000000O.O000000000();
      }

      boolean var2 = var1 == Theme.VERNAL_SOLSTICE || var1 == Theme.SAKURA_BREEZE || var1 == Theme.PORCELAIN_DAWN || var1 == Theme.FRUTIGER_AERO;
      if (this.O0000000O0O == null || this.O0000000O00OO0 != var1 || this.O0000000O00OOO != var2 || var1 == Theme.CUSTOM) {
         this.O0000000O0O = ColorScheme.O00000000(var1, var2);
         this.O0000000O00OO0 = var1;
         this.O0000000O00OOO = var2;
      }

      return this.O0000000O0O;
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      String var6 = "ЛКМ - Для перемещения";
      String var7 = "ПКМ - Для настроек";
      float var8 = 25.0F;
      float var9 = RenderManager.O00000000(FontRegistry.O00000000, var6, var8).O00000000;
      float var10 = RenderManager.O00000000(FontRegistry.O00000000, var7, var8).O00000000;
      float var11 = var8 * 2.0F + 4.0F;
      float var12 = f + h / 2.0F;
      float var13 = g - var11 - 8.0F;
      int var14 = (int)(255.0F * i);
      if (var14 > 5) {
         int var15 = RenderManager.W382.O0000000000(255, 255, 255, var14);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var12 - var9 / 2.0F, var13 + 6.0F, var8, var6, var15);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var12 - var10 / 2.0F, var13 + 6.0F + var8 + 2.0F, var8, var7, var15);
      }
   }

   private float O00000000(O00000OO000O.W223 o0000000000000, float f, float g, O00000OO000O.W218 o00000000) {
      return o0000000000000 != null && this.O00000000OO > 0
         ? this.O00000000(o0000000000000.nx() * this.O00000000OO, g, o00000000)
         : this.O00000000(f, g, o00000000);
   }

   private float O000000000(O00000OO000O.W223 o0000000000000, float f, float g, O00000OO000O.W218 o00000000) {
      return o0000000000000 != null && this.O00000000OO0 > 0
         ? this.O000000000(o0000000000000.ny() * this.O00000000OO0, g, o00000000)
         : this.O000000000(f, g, o00000000);
   }

   private void O00000000(String string, float f, float g, float h, float i, boolean bl) {
      if (this.O00000000OO > 0 && this.O00000000OO0 > 0 && string != null) {
         float var7 = f / this.O00000000OO;
         float var8 = g / this.O00000000OO0;
         O00000OO000O.W223 var9 = this.O000000000OO00.get(string);
         if (!this.O00000000(var9, var7, var8, h, i, bl)) {
            this.O000000000OO00.put(string, new O00000OO000O.W223(var7, var8, h, i, bl));
            this.O00000000OOO0 = true;
         }
      }
   }

   private boolean O00000000(O00000OO000O.W223 o0000000000000, float f, float g, float h, float i, boolean bl) {
      return o0000000000000 == null
         ? false
         : Math.abs(o0000000000000.nx() - f) < 1.0E-5F
            && Math.abs(o0000000000000.ny() - g) < 1.0E-5F
            && Math.abs(o0000000000000.scaleX() - h) < 1.0E-4F
            && Math.abs(o0000000000000.scaleY() - i) < 1.0E-4F
            && o0000000000000.userResized() == bl;
   }

   private float O000000000(String string, float f, float g) {
      this.O00000000OO000 = Float.NaN;
      this.O0000000000O0O();
      this.O00000000(f, 0.0F, 0.0F);
      this.O00000000(f, this.O00000000OO - g, this.O00000000OO);
      this.O00000000(f, this.O00000000OO * 0.5F - g * 0.5F, this.O00000000OO * 0.5F);

      for (Entry var5 : this.O000000000OO0.entrySet()) {
         if (!((String)var5.getKey()).equals(string)) {
            O00000OO000O.W220 var6 = (O00000OO000O.W220)var5.getValue();
            if (var6.O00000000 && !(var6.O000000000000O <= 0.0F) && !(var6.O00000000000O <= 0.0F)) {
               float var7 = var6.O0000000000O00.O0000000000();
               float var8 = var6.O000000000000O;
               this.O00000000(f, var7, var7);
               this.O00000000(f, var7 + var8, var7 + var8);
               this.O00000000(f, var7 - g, var7);
               this.O00000000(f, var7 + var8 - g, var7 + var8);
               this.O00000000(f, var7 + var8 * 0.5F - g * 0.5F, var7 + var8 * 0.5F);
            }
         }
      }

      if (Float.isFinite(this.O00000000OO0O0)) {
         this.O00000000OO000 = this.O00000000OO0O0;
         return this.O00000000OO0O;
      } else {
         return f;
      }
   }

   private float O0000000000(String string, float f, float g) {
      this.O00000000OO00O = Float.NaN;
      this.O0000000000O0O();
      this.O00000000(f, 0.0F, 0.0F);
      this.O00000000(f, this.O00000000OO0 - g, this.O00000000OO0);
      this.O00000000(f, this.O00000000OO0 * 0.5F - g * 0.5F, this.O00000000OO0 * 0.5F);

      for (Entry var5 : this.O000000000OO0.entrySet()) {
         if (!((String)var5.getKey()).equals(string)) {
            O00000OO000O.W220 var6 = (O00000OO000O.W220)var5.getValue();
            if (var6.O00000000 && !(var6.O000000000000O <= 0.0F) && !(var6.O00000000000O <= 0.0F)) {
               float var7 = var6.O0000000000O0O.O0000000000();
               float var8 = var6.O00000000000O;
               this.O00000000(f, var7, var7);
               this.O00000000(f, var7 + var8, var7 + var8);
               this.O00000000(f, var7 - g, var7);
               this.O00000000(f, var7 + var8 - g, var7 + var8);
               this.O00000000(f, var7 + var8 * 0.5F - g * 0.5F, var7 + var8 * 0.5F);
            }
         }
      }

      if (Float.isFinite(this.O00000000OO0O0)) {
         this.O00000000OO00O = this.O00000000OO0O0;
         return this.O00000000OO0O;
      } else {
         return f;
      }
   }

   private void O0000000000O0O() {
      this.O00000000OO0O = 0.0F;
      this.O00000000OO0O0 = Float.NaN;
      this.O00000000OO0OO = Float.MAX_VALUE;
   }

   private void O00000000(float f, float g, float h) {
      float var4 = Math.abs(f - g);
      if (!(var4 > 5.0F) && !(var4 >= this.O00000000OO0OO)) {
         this.O00000000OO0O = g;
         this.O00000000OO0O0 = h;
         this.O00000000OO0OO = var4;
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0) {
      int var2 = O0000O000OO000.O0000000000(125, 210, 255, 118);
      int var3 = O0000O000OO000.O0000000000(125, 210, 255, 32);
      if (Float.isFinite(this.O00000000OO000)) {
         o0000O00OO0O0.O00000000(this.O00000000OO000 - 0.75F, 0.0F, 1.5F, (float)this.O00000000OO0, 1.0F, 9.0F, 2.0F, var3);
         o0000O00OO0O0.O00000000(this.O00000000OO000 - 0.5F, 0.0F, 1.0F, (float)this.O00000000OO0, 0.5F, var2);
      }

      if (Float.isFinite(this.O00000000OO00O)) {
         o0000O00OO0O0.O00000000(0.0F, this.O00000000OO00O - 0.75F, (float)this.O00000000OO, 1.5F, 1.0F, 9.0F, 2.0F, var3);
         o0000O00OO0O0.O00000000(0.0F, this.O00000000OO00O - 0.5F, (float)this.O00000000OO, 1.0F, 0.5F, var2);
      }
   }

   private O00000OO000O.W218 O0000000000(String string) {
      if (O00000000(string, "hotbar")) {
         return O0000000000O00;
      } else if (O00000000(string, "watermark")) {
         return O0000000000O0O;
      } else if (O00000000(string, "targethud")) {
         return O0000000000OO;
      } else if (O00000000(string, "info")) {
         return O0000000000OO0;
      } else if (O00000000(string, "inventory")) {
         return O0000000000OOO;
      } else if (O00000000(string, "autobuy")) {
         return O000000000O;
      } else if (O00000000(string, "music")) {
         return O000000000O0;
      } else if (O00000000(string, "arraylist")) {
         return O000000000O00;
      } else if (O00000000(string, "notifications")) {
         return O000000000O000;
      } else if (O00000000(string, "potions") || O00000000(string, "cooldowns")) {
         return O000000000O00O;
      } else if (O00000000(string, "armor") || O00000000(string, "aistatus")) {
         return O000000000O0O;
      } else {
         return !O00000000(string, "staff") && !O00000000(string, "party") && !O00000000(string, "serverhelper") && !O00000000(string, "hotkeys")
            ? O000000000O0OO
            : O000000000O0O0;
      }
   }

   private static boolean O00000000(String string, String string2) {
      if (string != null && string2 != null && string2.length() <= string.length()) {
         int var2 = string.length() - string2.length();

         for (int var3 = 0; var3 <= var2; var3++) {
            if (string.regionMatches(true, var3, string2, 0, string2.length())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public float O00000000(String string, float f) {
      return this.O00000000(string, f, Float.NaN, Float.NaN);
   }

   public float O00000000(String string, float f, float g, float h) {
      String var5 = string == null ? "" : string.trim();
      O00000OO000O.W220 var6 = this.O000000000OO0.get(var5);
      if (var6 == null && string != null) {
         var6 = this.O000000000OO0.get(string);
      }

      if (var6 != null && var6.O00000000000O0 > 0.0F && var6.O00000000000OO > 0.0F) {
         return this.O000000000(var5, var6.O00000000000O0, var6.O00000000000OO, f);
      } else if (Float.isFinite(g) && g > 0.0F && Float.isFinite(h) && h > 0.0F) {
         return this.O000000000(var5, g, h, f);
      } else {
         O00000OO000O.W218 var7 = this.O0000000000(string);
         return O000000000(O000000000(f, 1.0F), var7.minScale(), var7.maxScale());
      }
   }

   public float O00000000(String string) {
      return this.O00000000(string, Float.NaN, Float.NaN);
   }

   public float O00000000(String string, float f, float g) {
      if (string != null && !string.isBlank()) {
         O00000OO000O.W223 var4 = this.O000000000OO00.get(string);
         Float var5 = var4 == null ? this.O000000000OO0O.get(string) : null;
         float var6 = var5 == null ? this.O00000000(var4, var4 != null && var4.userResized()) : var5;
         return this.O00000000(string, var6, f, g);
      } else {
         return 1.0F;
      }
   }

   public O00000OO000O.W223 O00000000(String string, float f, float g, float h, float i, float j) {
      if (string != null && !string.isBlank() && this.O00000000OO > 0 && this.O00000000OO0 > 0) {
         String var7 = string.trim();
         O00000OO000O.W220 var8 = this.O000000000OO0.get(var7);
         if (var8 == null) {
            var8 = this.O000000000OO0.get(string);
         }

         float var9 = this.O00000000(var7, f, i, j);
         O00000OO000O.W223 var10 = this.O000000000OO00.get(var7);
         if (var10 != null || var8 != null && var8.O00000000) {
            this.O000000000OO0O.remove(var7);
            float var11;
            float var12;
            if (var10 != null) {
               var11 = var10.nx() * this.O00000000OO;
               var12 = var10.ny() * this.O00000000OO0;
            } else if (var8 != null && var8.O00000000) {
               var11 = var8.O0000000000O00.O0000000000();
               var12 = var8.O0000000000O0O.O0000000000();
            } else {
               var11 = O000000000(O000000000(g, 0.5F), 0.0F, 1.0F) * this.O00000000OO;
               var12 = O000000000(O000000000(h, 0.5F), 0.0F, 1.0F) * this.O00000000OO0;
            }

            float var13 = var8 != null && !(var8.O00000000000O0 <= 0.0F) ? var8.O00000000000O0 : O00000000(i);
            float var14 = var8 != null && !(var8.O00000000000OO <= 0.0F) ? var8.O00000000000OO : O00000000(j);
            O00000OO000O.W224 var15 = this.O0000000000(var7, var13, var14, var9);
            O00000OO000O.W218 var16 = this.O0000000000(var7);
            var11 = this.O00000000(var11, var15.O00000000(), var16);
            var12 = this.O000000000(var12, var15.O000000000(), var16);
            this.O00000000(var7, var11, var12, var15.O0000000000(), var15.O0000000000(), true);
            if (var8 != null) {
               var8.O000000000000O = var15.O00000000();
               var8.O00000000000O = var15.O000000000();
               var8.O0000000000O00.O0000000000(var11);
               var8.O0000000000O0O.O0000000000(var12);
            }

            return this.O000000000OO00.get(var7);
         } else {
            this.O000000000OO0O.put(var7, var9);
            return new O00000OO000O.W223(O000000000(O000000000(g, 0.5F), 0.0F, 1.0F), O000000000(O000000000(h, 0.5F), 0.0F, 1.0F), var9, var9, true);
         }
      } else {
         return null;
      }
   }

   public O00000OO000O.W223 O0000000000(String string, float f, float g, float h, float i) {
      if (string != null && !string.isBlank() && this.O00000000OO > 0 && this.O00000000OO0 > 0) {
         String var6 = string.trim();
         O00000OO000O.W220 var7 = this.O000000000OO0.get(var6);
         if (var7 == null) {
            var7 = this.O000000000OO0.get(string);
         }

         O00000OO000O.W223 var8 = this.O000000000OO00.get(var6);
         boolean var9 = var8 != null && var8.userResized() || this.O000000000OO0O.containsKey(var6);
         float var10 = this.O00000000(var6, h, i);
         this.O000000000OO0O.remove(var6);
         float var11 = var7 != null && !(var7.O00000000000O0 <= 0.0F) ? var7.O00000000000O0 : O00000000(h);
         float var12 = var7 != null && !(var7.O00000000000OO <= 0.0F) ? var7.O00000000000OO : O00000000(i);
         O00000OO000O.W224 var13 = this.O0000000000(var6, var11, var12, var10);
         O00000OO000O.W218 var14 = this.O0000000000(var6);
         float var15 = var14.padding();
         float var16 = var14.padding();
         float var17 = Math.max(var15, this.O00000000OO - var13.O00000000() - var14.padding());
         float var18 = Math.max(var16, this.O00000000OO0 - var13.O000000000() - var14.padding());
         float var19 = var15 + (var17 - var15) * O000000000(O000000000(f, 0.5F), 0.0F, 1.0F);
         float var20 = var16 + (var18 - var16) * O000000000(O000000000(g, 0.5F), 0.0F, 1.0F);
         this.O00000000(var6, var19, var20, var13.O0000000000(), var13.O0000000000(), var9 || Math.abs(var13.O0000000000() - 1.0F) > 0.01F);
         if (var7 != null) {
            var7.O000000000000O = var13.O00000000();
            var7.O00000000000O = var13.O000000000();
            var7.O0000000000O00.O0000000000(var19);
            var7.O0000000000O0O.O0000000000(var20);
         }

         return this.O000000000OO00.get(var6);
      } else {
         return null;
      }
   }

   private float O000000000(String string, float f, float g, float h) {
      O00000OO000O.W218 var5 = this.O0000000000(string);
      float var6 = O00000000(f);
      float var7 = O00000000(g);
      float var8 = this.O00000000OO > 1 ? Math.max(1.0F, this.O00000000OO * var5.maxWidthRatio() - var5.padding() * 2.0F) : var6 * var5.maxScale();
      float var9 = this.O00000000OO0 > 1 ? Math.max(1.0F, this.O00000000OO0 * var5.maxHeightRatio() - var5.padding() * 2.0F) : var7 * var5.maxScale();
      float var10 = Math.min(var5.maxScale(), Math.min(var8 / var6, var9 / var7));
      var10 = Math.max(0.08F, var10);
      float var11 = Math.min(var5.minScale(), var10);
      return O000000000(O000000000(h, 1.0F), var11, var10);
   }

   private O00000OO000O.W224 O0000000000(String string, float f, float g, float h) {
      float var5 = O00000000(f);
      float var6 = O00000000(g);
      float var7 = this.O000000000(string, var5, var6, h);
      return this.O00000000O0.O00000000(var5 * var7, var6 * var7, var7);
   }

   private float O00000000(O00000OO000O.W223 o0000000000000, boolean bl) {
      if (bl && o0000000000000 != null) {
         float var3 = O000000000(o0000000000000.scaleX(), 1.0F);
         float var4 = O000000000(o0000000000000.scaleY(), 1.0F);
         return !(var3 <= 0.0F) && !(var4 <= 0.0F) && !(var3 > 12.0F) && !(var4 > 12.0F) ? (float)Math.sqrt(Math.max(1.0E-4F, var3 * var4)) : 1.0F;
      } else {
         return 1.0F;
      }
   }

   private float O00000000(float f, float g, O00000OO000O.W218 o00000000) {
      if (this.O00000000OO <= 0) {
         return O000000000(f, 0.0F);
      } else {
         float var4 = Math.max(0.0F, o00000000 == null ? 6.0F : o00000000.padding());
         float var5 = Math.min(var4, Math.max(0.0F, this.O00000000OO - 1.0F));
         float var6 = Math.max(var5, this.O00000000OO - Math.max(1.0F, g) - var4);
         return O000000000(O000000000(f, var5), var5, var6);
      }
   }

   private float O000000000(float f, float g, O00000OO000O.W218 o00000000) {
      if (this.O00000000OO0 <= 0) {
         return O000000000(f, 0.0F);
      } else {
         float var4 = Math.max(0.0F, o00000000 == null ? 6.0F : o00000000.padding());
         float var5 = Math.min(var4, Math.max(0.0F, this.O00000000OO0 - 1.0F));
         float var6 = Math.max(var5, this.O00000000OO0 - Math.max(1.0F, g) - var4);
         return O000000000(O000000000(f, var5), var5, var6);
      }
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return Float.isFinite(f)
         && Float.isFinite(g)
         && Float.isFinite(h)
         && Float.isFinite(i)
         && Float.isFinite(j)
         && Float.isFinite(k)
         && j > 0.0F
         && k > 0.0F
         && f >= h
         && f <= h + j
         && g >= i
         && g <= i + k;
   }

   private static float O00000000(float f, float g) {
      return Math.max(0.0F, Math.min(f, g));
   }

   private static float O000000000(float f, float g, float h) {
      return h < g ? g : Math.max(g, Math.min(f, h));
   }

   private static float O00000000(float f) {
      return Float.isFinite(f) && f > 1.0F ? f : 1.0F;
   }

   private static float O000000000(float f, float g) {
      return Float.isFinite(f) ? f : g;
   }

   public Map<String, O00000OO000O.W223> O000000000000() {
      return this.O000000000OO00;
   }

   public Map<String, Float> O0000000000000() {
      return this.O000000000OO0O;
   }

   public void O00000000(Map<String, O00000OO000O.W223> map) {
      this.O000000000OO00.clear();
      this.O000000000OO0O.clear();
      if (map != null) {
         this.O000000000OO00.putAll(map);
      }

      this.O000000000OO0.clear();
      this.O00000000OO00 = null;
      this.O00000000OOO0 = false;
   }

   public void O000000000(Map<String, Float> map) {
      this.O000000000OO0O.clear();
      if (map != null) {
         for (Entry var3 : map.entrySet()) {
            String var4 = (String)var3.getKey();
            Float var5 = (Float)var3.getValue();
            if (var4 != null && !var4.isBlank() && var5 != null && Float.isFinite(var5) && !(var5 <= 0.0F) && !this.O000000000OO00.containsKey(var4)) {
               this.O000000000OO0O.put(var4.trim(), this.O00000000(var4, var5));
            }
         }
      }
   }

   public void O000000000(String string) {
      if (string != null && !string.isBlank()) {
         String var2 = string.trim();
         this.O000000000OO00.remove(var2);
         this.O000000000OO0O.remove(var2);
         O00000OO000O.W220 var3 = this.O000000000OO0.remove(var2);
         if (var3 == null) {
            var3 = this.O000000000OO0.remove(string);
         }

         if (var2.equals(this.O00000000OO00) || string.equals(this.O00000000OO00)) {
            this.O00000000OO00 = null;
         }
      }
   }

   @Generated
   public float O000000000000O() {
      return this.O00000000O000O;
   }

   @Generated
   public float O00000000000O() {
      return this.O00000000O00O;
   }

   @Generated
   public boolean O00000000000O0() {
      return this.O00000000O00OO;
   }

   @Generated
   public boolean O00000000000OO() {
      return this.O00000000O0O;
   }

   @Generated
   public String O0000000000O() {
      return this.O00000000OO00;
   }

   record W218(float minScale, float maxScale, float maxWidthRatio, float maxHeightRatio, float padding) {
   }

   public static final class W219 {
      public String O00000000;
      public float O000000000;
      public float O0000000000;
      public float O00000000000;
      public float O000000000000;
      public float O0000000000000;
      public float O000000000000O;
      public boolean O00000000000O;
      public boolean O00000000000O0;
      public boolean O00000000000OO;
      public boolean O0000000000O;

      W219() {
      }

      O00000OO000O.W219 O00000000(String string, float f, float g, float h, float i, boolean bl, boolean bl2, boolean bl3, boolean bl4, float j, float k) {
         this.O00000000 = string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
         this.O00000000000O = bl;
         this.O00000000000O0 = bl2;
         this.O00000000000OO = bl3;
         this.O0000000000O = bl4;
         this.O0000000000000 = j;
         this.O000000000000O = k;
         return this;
      }
   }

   static final class W220 {
      boolean O00000000;
      boolean O000000000;
      boolean O0000000000;
      boolean O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      final O00000OO000O.W219 O0000000000O = new O00000OO000O.W219();
      final O0000O00O0O0OO O0000000000O0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000OO000O.O000000000000, 1.0F, 0.0F, 1.0F, 0.001F, 0.001F);
      final O0000O00O0O0OO O0000000000O00 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000OO000O.O00000000000, 0.0F, -9999.0F, 9999.0F, 0.1F, 0.1F);
      final O0000O00O0O0OO O0000000000O0O = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000OO000O.O00000000000, 0.0F, -9999.0F, 9999.0F, 0.1F, 0.1F);
      final O0000O00O0O0OO O0000000000OO = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000OO000O.O0000000000000, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
      final O0000O00O0O0OO O0000000000OO0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000OO000O.O000000000000O, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
   }

   @O0000000OOO0(
      O00000000 = "GlobalHUD",
      O000000000 = "w"
   )
   public static class W221 extends O0000000OOO00 {
      public final NumberSetting O00000000 = new NumberSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
      public final NumberSetting O000000000 = new NumberSetting("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
      public final ModeSetting O0000000000 = new ModeSetting("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Неоморфизм", "Феррофлюид", "Призма");
      public final NumberSetting O00000000000 = new NumberSetting("Нео дистанция", 5.5F, 2.0F, 18.0F, 0.5F, false)
         .O00000000(() -> !HudElement.O00000000(this.O0000000000.O0000000000()));
      public final NumberSetting O000000000000 = new NumberSetting("Нео размытие", 18.0F, 6.0F, 48.0F, 1.0F, false)
         .O00000000(() -> !HudElement.O00000000(this.O0000000000.O0000000000()));
      public final NumberSetting O0000000000000 = new NumberSetting("Нео интенсивность", 0.72F, 0.1F, 1.0F, 0.05F, true)
         .O00000000(() -> !HudElement.O00000000(this.O0000000000.O0000000000()));
      public final ModeSetting O000000000000O = new ModeSetting("Нео форма", "Выпуклая", "Плоская", "Выпуклая", "Вогнутая")
         .O00000000(() -> !HudElement.O00000000(this.O0000000000.O0000000000()));
      public final GroupSetting O00000000000O = new GroupSetting(
         "Визуал",
         new BooleanSetting("Тень", true),
         new BooleanSetting("Обводка", true),
         new BooleanSetting("Темные зоны", true),
         new BooleanSetting("Верхняя накладка", true),
         new BooleanSetting("Нижняя накладка", true),
         new BooleanSetting("Тёмный рект поверх", true)
      );

      public W221() {
         this.O00000000(this.O00000000);
         this.O00000000(this.O000000000);
         this.O00000000(this.O0000000000);
         this.O00000000(this.O00000000000);
         this.O00000000(this.O000000000000);
         this.O00000000(this.O0000000000000);
         this.O00000000(this.O000000000000O);
         this.O00000000(this.O00000000000O);
         ru.metaculture.protection.O000000000O0O0.O00000000(this);
      }
   }

   public static final class W222 {
      public String O00000000 = "";
      public float O000000000;
      public float O0000000000;
      public float O00000000000;
      public float O000000000000;
      public float O0000000000000;
      public float O000000000000O;

      public void O00000000(String string, float f, float g, float h, float i, float j, float k) {
         this.O00000000 = string == null ? "" : string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
         this.O0000000000000 = j;
         this.O000000000000O = k;
      }

      void O00000000(O00000OO000O.W222 o000000000000) {
         if (o000000000000 == null) {
            this.O00000000("", 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            this.O00000000(
               o000000000000.O00000000,
               o000000000000.O000000000,
               o000000000000.O0000000000,
               o000000000000.O00000000000,
               o000000000000.O000000000000,
               o000000000000.O0000000000000,
               o000000000000.O000000000000O
            );
         }
      }
   }

   public record W223(float nx, float ny, float scaleX, float scaleY, boolean userResized) {
   }

   static final class W224 {
      private float O00000000;
      private float O000000000;
      private float O0000000000;

      O00000OO000O.W224 O00000000(float f, float g, float h) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         return this;
      }

      float O00000000() {
         return this.O00000000;
      }

      float O000000000() {
         return this.O000000000;
      }

      float O0000000000() {
         return this.O0000000000;
      }
   }
}
