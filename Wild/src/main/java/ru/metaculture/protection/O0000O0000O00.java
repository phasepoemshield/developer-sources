package ru.metaculture.protection;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;

public final class O0000O0000O00 {
   private static final String O00000000 = "Диагностика Wild Core";
   private static final String O000000000 = "рендер, шейдеры, GL и локальные слепки";
   private static final String O0000000000 = "Слепок";
   private static final String O00000000000 = "Папка";
   private static final String O000000000000 = "Логи";
   private static final String O0000000000000 = "Состояние";
   private static final String O000000000000O = "Tracker ID";
   private static final String O00000000000O = "Code";
   private static final String O00000000000O0 = "Очередь";
   private static final String O00000000000OO = "Ошибки";
   private static final String O0000000000O = "CFI chain";
   private static final String O0000000000O0 = "Текстурные Юниты";
   private static final String O0000000000O00 = "Матрицы";
   private static final String O0000000000O0O = "Frames";
   private static final String O0000000000OO = "Anomalies";
   private static final String O0000000000OO0 = "Что сейчас ломается";
   private static final String O0000000000OOO = "Файл слепка";
   private static final String O000000000O = "Mixin policy";
   private static final String O000000000O0 = "Privacy";
   private static final String O000000000O00 = "Гайдлайн";
   private static final String O000000000O000 = "1 смотри Code/Stage";
   private static final String O000000000O00O = "2 жми Слепок";
   private static final String O000000000O0O = "3 открой Логи";
   private static final String O000000000O0O0 = "4 передай Tracker ID";
   private static final String O000000000O0OO = "Шейдерных исключений нет";
   private static final String O000000000OO = "Нажми Логи, чтобы загрузить latest.log";
   private static final String O000000000OO0 = "Встроенный viewer";
   private static final String O000000000OO00 = "latest.log tail";
   private static final String O000000000OO0O = "Буфер событий";
   private static final String O000000000OOO = "Core Load";
   private static final String O000000000OOO0 = "Render TPS";
   private static final String O000000000OOOO = "Latency";
   private static final float O00000000O = 44.0F;
   private static final float O00000000O0 = 10.0F;
   private static final O0000O000O0O00 O00000000O00 = O0000O000O0O00.O0000000000O0();
   private final O00000000OOO O00000000O000 = new O00000000OOO();
   private final O0000O0000O00.W334 O00000000O0000 = new O0000O0000O00.W334();
   private final O0000O000O000O O00000000O000O = new O0000O000O000O(0.0F);
   private long O00000000O00O = Long.MIN_VALUE;
   private static float O00000000O00O0;
   private static float O00000000O00OO;
   private static float O00000000O0O;
   private static float O00000000O0O0;
   private static float O00000000O0O00;
   private static float O00000000O0O0O;
   private static float O00000000O0OO;
   private static float O00000000O0OO0;

   public static float O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(
         O0000000000O00(o00000OOOOOOOO, o0000O00000)
            + O0000000000OO(o00000OOOOOOOO, o0000O00000)
            - O00000000(o0000O00000)
            - O000000000(o0000O00000)
            - O0000000000(o0000O00000)
            - o0000O00000.O00000000(16.0F)
      );
   }

   public static float O000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(
         O0000000000O00(o00000OOOOOOOO, o0000O00000)
            + O0000000000OO(o00000OOOOOOOO, o0000O00000)
            - O000000000(o0000O00000)
            - O0000000000(o0000O00000)
            - o0000O00000.O00000000(8.0F)
      );
   }

   public static float O0000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(O0000000000O00(o00000OOOOOOOO, o0000O00000) + O0000000000OO(o00000OOOOOOOO, o0000O00000) - O0000000000(o0000O00000));
   }

   public static float O00000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(O0000000000O0O(o00000OOOOOOOO, o0000O00000) + o0000O00000.O00000000(3.0F));
   }

   public static float O00000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(94.0F);
   }

   public static float O000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(78.0F);
   }

   public static float O0000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(68.0F);
   }

   public static float O00000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(24.0F);
   }

   public static boolean O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      return O0000O00000OO.O00000000(
         f,
         g,
         O000000000000(o00000OOOOOOOO, o0000O00000),
         O0000000000000(o00000OOOOOOOO, o0000O00000),
         O000000000000O(o00000OOOOOOOO, o0000O00000),
         O00000000000O(o00000OOOOOOOO, o0000O00000)
      );
   }

   public static boolean O000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      if (!(O00000000O0OO <= 0.5F) && !(O00000000O0O <= 1.0F) && !(O00000000O0O0 <= 1.0F)) {
         float var4 = O000000000000(o0000O00000);
         float var5 = Math.round(O00000000O00OO + O00000000O0O0 - var4);
         return O0000O00000OO.O00000000(f, g, O00000000O00O0, var5 - o0000O00000.O00000000(4.0F), O00000000O0O, o0000O00000.O00000000(12.0F));
      } else {
         return false;
      }
   }

   public static boolean O0000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      if (!(O00000000O0OO0 <= 0.5F) && !(O00000000O0O <= 1.0F) && !(O00000000O0O0 <= 1.0F)) {
         float var4 = O000000000000(o0000O00000);
         float var5 = Math.round(O00000000O00O0 + O00000000O0O - var4);
         return O0000O00000OO.O00000000(f, g, var5 - o0000O00000.O00000000(4.0F), O00000000O00OO, o0000O00000.O00000000(12.0F), O00000000O0O0);
      } else {
         return false;
      }
   }

   public static float O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f) {
      float var3 = O0000000000000(o0000O00000);
      float var4 = Math.max(1.0F, O00000000O0O - var3);
      return O00000000((f - O00000000O00O0 - var3 * 0.5F) / var4);
   }

   public static float O000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f) {
      float var3 = O000000000000O(o0000O00000);
      float var4 = Math.max(1.0F, O00000000O0O0 - var3);
      return O00000000((f - O00000000O00OO - var3 * 0.5F) / var4);
   }

   private static float O000000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = O0000000000O00(o00000OOOOOOOO, o0000O00000);
      float var3 = O0000000000OO(o00000OOOOOOOO, o0000O00000);
      float var4 = O00000000(var3, o0000O00000);
      return Math.round(var2 + var4 + o0000O00000.O00000000(10.0F));
   }

   private static float O0000000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = O0000000000O0O(o00000OOOOOOOO, o0000O00000);
      float var3 = O00000000000O(o0000O00000);
      float var4 = Math.round(var2 + o0000O00000.O00000000(44.0F));
      float var5 = Math.round(var3 - o0000O00000.O00000000(44.0F));
      float var6 = O000000000(var5, o0000O00000);
      return Math.round(var4 + var6 + o0000O00000.O00000000(8.0F));
   }

   private static float O000000000000O(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = O0000000000OO(o00000OOOOOOOO, o0000O00000);
      float var3 = O00000000(var2, o0000O00000);
      return Math.round(var2 - var3 - o0000O00000.O00000000(10.0F));
   }

   private static float O00000000000O(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = O00000000000O(o0000O00000);
      float var3 = Math.round(var2 - o0000O00000.O00000000(44.0F));
      float var4 = O000000000(var3, o0000O00000);
      return Math.max(o0000O00000.O00000000(24.0F), var3 - var4 - o0000O00000.O00000000(8.0F));
   }

   private static float O00000000000O0(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(O000000000000(o00000OOOOOOOO, o0000O00000) + o0000O00000.O00000000(10.0F));
   }

   private static float O00000000000OO(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(O0000000000000(o00000OOOOOOOO, o0000O00000) + o0000O00000.O00000000(30.0F));
   }

   private static float O0000000000O(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(O000000000000O(o00000OOOOOOOO, o0000O00000) - o0000O00000.O00000000(20.0F));
   }

   private static float O0000000000O0(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.max(o0000O00000.O00000000(24.0F), O00000000000O(o00000OOOOOOOO, o0000O00000) - o0000O00000.O00000000(38.0F));
   }

   private static float O00000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static float O00000000(float f, O0000O00000 o0000O00000) {
      return Math.round(O00000000(f * 0.265F, o0000O00000.O00000000(150.0F), o0000O00000.O00000000(182.0F)));
   }

   private static float O000000000(float f, O0000O00000 o0000O00000) {
      return Math.round(O00000000(f * 0.31F, o0000O00000.O00000000(104.0F), o0000O00000.O00000000(124.0F)));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO) {
      O00000000OO0OO.O00000000().O00000000(this.O00000000O000);
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      long var7 = o0000O000O0O0.O00000000OO00O();
      if (var7 != this.O00000000O00O) {
         this.O00000000O00O = var7;
         this.O00000000();
      }

      this.O00000000O0000.O000000000();
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000O());
      if (!(var9 <= 0.001F)) {
         float var10 = O0000000000O00(o00000OOOOOOOO, var5);
         float var11 = O0000000000O0O(o00000OOOOOOOO, var5);
         float var12 = O0000000000OO(o00000OOOOOOOO, var5);
         float var13 = O00000000000O(var5);
         o0000O00OO0O0.O000000000000(var9);

         try {
            this.O00000000(o0000O00OO0O0, var5, var6, var10, var11, var12, var9);
            float var14 = Math.round(var11 + var5.O00000000(44.0F));
            float var15 = Math.round(var13 - var5.O00000000(44.0F));
            float var16 = O00000000(var12, var5);
            this.O0000000000(o0000O00OO0O0, var5, var6, var10, var14, var16, var15);
            float var17 = Math.round(var10 + var16 + var5.O00000000(10.0F));
            float var18 = Math.round(var12 - var16 - var5.O00000000(10.0F));
            float var19 = this.O00000000O000.O000000000OOO ? 1.0F : 0.0F;
            float var20 = O00000000(
               o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000O(), var19, var19 > 0.0F ? O0000O000O0O00.O0000000000O0() : O0000O000O0O00.O0000000000OO())
            );
            float var21 = O000000000(var20);
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var17, var14, var18, var15, var5.O00000000(9.0F), var5.O00000000(9.0F), var5.O00000000(9.0F), var5.O00000000(9.0F));

            try {
               if (var21 < 0.999F) {
                  o0000O00OO0O0.O000000000000(1.0F - var21);
                  o0000O00OO0O0.O00000000(-var5.O00000000(14.0F) * var21, 0.0F);
                  o0000O00OO0O0.O00000000(1.0F - var21 * 0.018F, var17 + var18 * 0.5F, var14 + var15 * 0.5F);

                  try {
                     this.O00000000000(o0000O00OO0O0, var5, var6, var17, var14, var18, var15);
                  } finally {
                     o0000O00OO0O0.O00000000000O0();
                     o0000O00OO0O0.O00000000000O();
                     o0000O00OO0O0.O00000000000OO();
                  }
               }

               if (var21 > 0.001F) {
                  o0000O00OO0O0.O000000000000(var21);
                  o0000O00OO0O0.O00000000(var5.O00000000(18.0F) * (1.0F - var21), var5.O00000000(5.0F) * (1.0F - var21));
                  o0000O00OO0O0.O00000000(0.982F + var21 * 0.018F, var17 + var18 * 0.5F, var14 + var15 * 0.5F);
                  boolean var38 = false /* VF: Semaphore variable */;

                  try {
                     var38 = true;
                     this.O00000000(o0000O00OO0O0, o0000O000O0O0, var5, var6, var17, var14, var18, var15);
                     var38 = false;
                  } finally {
                     if (var38) {
                        o0000O00OO0O0.O00000000000O0();
                        o0000O00OO0O0.O00000000000O();
                        o0000O00OO0O0.O00000000000OO();
                     }
                  }

                  o0000O00OO0O0.O00000000000O0();
                  o0000O00OO0O0.O00000000000O();
                  o0000O00OO0O0.O00000000000OO();
               }
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            if (var21 <= 0.001F) {
               O0000000000();
            }
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O00000000() {
      this.O00000000O0000.O00000000();
      this.O00000000O000O.O00000000(0.0F);
      O0000000000();
      O00000000OO0OO.O00000000().O0000000000OO();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var8 = o0000O00000.O00000000(32.0F);
      this.O000000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, g, var8, i);
      float var9 = f + var8 + o0000O00000.O00000000(11.0F);
      if (!o0000O000O0OO.O000000000O000()) {
         o0000O00OO0O0.O00000000000();

         try {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var9,
               g - o0000O00000.O00000000(1.0F),
               o0000O00000.O00000000(17.0F),
               13.0F,
               "Диагностика Wild Core",
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 40)
            );
         } finally {
            o0000O00OO0O0.O000000000000();
         }
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var9,
         g - o0000O00000.O00000000(1.0F),
         o0000O00000.O00000000(17.0F),
         13.0F,
         "Диагностика Wild Core",
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var9,
         g + o0000O00000.O00000000(16.0F),
         o0000O00000.O00000000(14.0F),
         9.0F,
         "рендер, шейдеры, GL и локальные слепки",
         O0000O00000OO.O000000000(o0000O000O0OO)
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         O00000000(o0000O00000, f, h),
         g + o0000O00000.O00000000(3.0F),
         O00000000(o0000O00000),
         "Слепок",
         o0000O000O0OO.O000000000O0(),
         false,
         0
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         O000000000(o0000O00000, f, h),
         g + o0000O00000.O00000000(3.0F),
         O000000000(o0000O00000),
         "Папка",
         o0000O000O0OO.O000000000O00(),
         false,
         1
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         O0000000000(o0000O00000, f, h),
         g + o0000O00000.O00000000(3.0F),
         O0000000000(o0000O00000),
         "Логи",
         o0000O000O0OO.O000000000O0(),
         this.O00000000O000.O000000000OOO,
         2
      );
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      o0000O00OO0O0.O0000000000();
      O0000O0000O0O0.O00000000(
         Math.round(f), Math.round(g), Math.round(h), o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00(), O00000000(i), o0000O000O0OO.O000000000O000()
      );
      float var8 = 0.5F + 0.5F * (float)Math.sin((float)System.currentTimeMillis() * 0.00108F);
      float var9 = 15.0F;
      float var10 = var9 * (1.08F + var8 * 0.04F);
      float var11 = f + h * 0.5F;
      float var12 = g + h * 0.5F;
      float var13 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000O, "W", var9);
      float var14 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000O, "W", var10);
      float var15 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000O, var9);
      float var16 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000O, var10);
      float var17 = var12 - var15 * 0.5F - o0000O00000.O00000000(1.0F);
      float var18 = var12 - var16 * 0.5F - o0000O00000.O00000000(1.0F);
      if (!o0000O000O0OO.O000000000O000()) {
         o0000O00OO0O0.O00000000000();

         try {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000O,
               var11 - var14 * 0.5F,
               var18,
               var10,
               "W",
               ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 110), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 130), var8)
            );
         } finally {
            o0000O00OO0O0.O000000000000();
         }
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000O,
         var11 - var13 * 0.5F,
         var17,
         var9,
         "W",
         ColorScheme.O00000000(O0000O00000OO.O00000000000(o0000O000O0OO), 246)
      );
   }

   private void O0000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var8 = o0000O00000.O00000000(10.0F);
      int var9 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.35F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), 0.36F);
      o0000O00OO0O0.O00000000(f, g, h, i, var8, var9);
      o0000O00OO0O0.O00000000(
         f,
         g,
         h,
         i,
         var8,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 92 : 20),
         Math.max(0.6F, o0000O00000.O00000000(0.65F))
      );
      float var10 = o0000O00000.O00000000(9.0F);
      float var11 = o0000O00000.O00000000(4.0F);
      float var12 = o0000O00000.O00000000(35.0F);
      float var13 = Math.max(o0000O00000.O00000000(180.0F), i - var10 * 2.0F - var12 - var11 * 4.0F);
      float var14 = var13 / 5.0F;
      float var15 = g + var10;
      String var16 = this.O00000000O000.O000000000O0OO == 0 ? "Nominal" : "Anomaly";
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + var10,
         var15,
         h - var10 * 2.0F,
         var14,
         "Состояние",
         var16,
         this.O00000000O000.O000000000O0OO == 0 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000()
      );
      var15 += var14 + var11;
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + var10,
         var15,
         h - var10 * 2.0F,
         var14,
         "Tracker ID",
         this.O00000000O000.O00000000000,
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
      var15 += var14 + var11;
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + var10,
         var15,
         h - var10 * 2.0F,
         var14,
         "Code",
         this.O00000000O000.O000000000000,
         this.O00000000O000.O000000000O0OO == 0 ? O0000O00000OO.O000000000(o0000O000O0OO) : o0000O000O0OO.O000000000()
      );
      var15 += var14 + var11;
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + var10,
         var15,
         h - var10 * 2.0F,
         var14,
         "Ошибки",
         this.O00000000O000.O000000000O,
         "0".equals(this.O00000000O000.O000000000O) ? O0000O00000OO.O000000000(o0000O000O0OO) : o0000O000O0OO.O000000000()
      );
      var15 += var14 + var11;
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + var10,
         var15,
         h - var10 * 2.0F,
         var14,
         "Очередь",
         this.O00000000O000.O0000000000O0,
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
      float var17 = Math.round(g + i - var10 - var12 + o0000O00000.O00000000(14.0F));
      float var18 = Math.round(f + var10);
      float var19 = Math.round(h - var10 * 2.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var18,
         var17,
         o0000O00000.O00000000(13.0F),
         9.5F,
         "Буфер событий",
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var18 + var19 - o0000O00000.O00000000(28.0F),
         var17,
         o0000O00000.O00000000(13.0F),
         8.5F,
         this.O00000000O000.O000000000OO + "/32",
         O0000O00000OO.O000000000(o0000O000O0OO)
      );
      float var20 = Math.round(var17 + o0000O00000.O00000000(18.0F));
      float var21 = Math.min(1.0F, this.O00000000O000.O000000000OO / 32.0F);
      o0000O00OO0O0.O00000000(var18, var20, var19, o0000O00000.O00000000(5.0F), o0000O00000.O00000000(2.5F), o0000O000O0OO.O0000000000O());
      o0000O00OO0O0.O00000000(
         var18, var20, var19 * var21, o0000O00000.O00000000(5.0F), o0000O00000.O00000000(2.5F), o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00()
      );
   }

   private void O00000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var8 = o0000O00000.O00000000(8.0F);
      float var9 = o0000O00000.O00000000(9.0F);
      float var10 = O00000000(i * 0.22F, o0000O00000.O00000000(78.0F), o0000O00000.O00000000(96.0F));
      float var11 = Math.round((h - var8 * 2.0F) / 3.0F);
      float var12 = O00000000(this.O00000000O000O.O00000000(1.0F, O00000000O00));
      int var13 = this.O00000000O000.O000000000O0OO == 0 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000();
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f,
         g,
         var11,
         var10,
         var9,
         "Core Load",
         this.O00000000O0000.O0000000000000(),
         "CFI chain  " + this.O00000000O000.O0000000000,
         o0000O000O0OO.O000000000O0(),
         this.O00000000O0000.O0000000000,
         this.O00000000O0000.O0000000000(),
         O000000000(var12, 0.0F, 0.78F)
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + var11 + var8,
         g,
         var11,
         var10,
         var9,
         "Render TPS",
         this.O00000000O0000.O000000000000O(),
         "Frames  " + this.O00000000O000.O000000000O00O,
         o0000O000O0OO.O000000000O00(),
         this.O00000000O0000.O00000000000,
         this.O00000000O0000.O00000000000(),
         O000000000(var12, 0.12F, 0.9F)
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         f + (var11 + var8) * 2.0F,
         g,
         h - var11 * 2.0F - var8 * 2.0F,
         var10,
         var9,
         "Latency",
         this.O00000000O0000.O00000000000O(),
         "Anomalies  " + this.O00000000O000.O000000000O000,
         var13,
         this.O00000000O0000.O000000000000,
         this.O00000000O0000.O000000000000(),
         O000000000(var12, 0.24F, 1.0F)
      );
      float var14 = Math.round(g + var10 + var8);
      float var15 = O00000000(i * 0.29F, o0000O00000.O00000000(88.0F), o0000O00000.O00000000(106.0F));
      float var16 = Math.round(h * 0.58F);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, var14, var16, var15, var9);
      float var17 = Math.round(f + var16 + var8);
      float var18 = Math.round(h - var16 - var8);
      float var19 = Math.round((var15 - var8) * 0.5F);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var17,
         var14,
         var18,
         var19,
         var9,
         "Текстурные Юниты",
         this.O000000000000(),
         this.O00000000O000.O000000000O0OO == 0 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000()
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var17,
         var14 + var19 + var8,
         var18,
         var19,
         var9,
         "Матрицы",
         this.O00000000000(),
         this.O00000000(o0000O000O0OO)
      );
      float var20 = Math.round(var14 + var15 + var8);
      float var21 = O00000000(i * 0.14F, o0000O00000.O00000000(42.0F), o0000O00000.O00000000(50.0F));
      String var22 = this.O00000000O000.O0000000000O != null && !"none".equals(this.O00000000O000.O0000000000O)
         ? this.O00000000O000.O0000000000O
         : this.O00000000O000.O00000000000O0;
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, var20, h, var21, var9, "Файл слепка", var22, o0000O000O0OO.O000000000O00());
      float var23 = Math.round(var20 + var21 + var8);
      float var24 = O00000000(i * 0.13F, o0000O00000.O00000000(40.0F), o0000O00000.O00000000(46.0F));
      this.O000000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, var23, h, var24, var9);
      float var25 = Math.round(var23 + var24 + var8);
      this.O0000000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, var25, h, Math.max(o0000O00000.O00000000(46.0F), i - (var25 - g)), var9);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i
   ) {
      float var9 = o0000O00000.O00000000(8.0F);
      float var10 = o0000O00000.O00000000(9.0F);
      float var11 = O000000000(i, o0000O00000);
      float var12 = Math.round(h * 0.58F);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, g, var12, var11, var10);
      float var13 = Math.round(f + var12 + var9);
      float var14 = Math.round(h - var12 - var9);
      float var15 = Math.round((var11 - var9 * 2.0F) / 3.0F);
      this.O00000000(
         o0000O00OO0O0, o0000O00000, o0000O000O0OO, var13, g, var14, var15, var10, "CFI chain", this.O00000000O000.O0000000000, o0000O000O0OO.O000000000O0()
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var13,
         g + var15 + var9,
         var14,
         var15,
         var10,
         "Текстурные Юниты",
         this.O000000000000(),
         this.O00000000O000.O000000000O0OO == 0 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000()
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var13,
         g + (var15 + var9) * 2.0F,
         var14,
         var11 - var15 * 2.0F - var9 * 2.0F,
         var10,
         "Матрицы",
         this.O00000000000(),
         this.O00000000(o0000O000O0OO)
      );
      float var16 = Math.round(g + var11 + var9);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O00000, o0000O000O0OO, f, var16, h, i - var11 - var9, var10);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, String string, int i, boolean bl, int j
   ) {
      float var11 = Math.round(f);
      float var12 = Math.round(g);
      float var13 = Math.round(h);
      float var14 = O00000000000(o0000O00000);
      float var15 = o0000O00000.O00000000(7.0F);
      float var16 = bl ? 1.0F : 0.0F;
      int var17 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.38F + var16 * 0.34F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(i, 22), 0.36F + var16 * 0.2F);
      o0000O00OO0O0.O00000000(var11, var12, var13, var14, var15, var17);
      o0000O00OO0O0.O00000000(
         var11, var12, var13, var14, var15, ColorScheme.O00000000(i, o0000O000O0OO.O000000000O000() ? 68 : 58), Math.max(0.5F, o0000O00000.O00000000(0.55F))
      );
      float var18 = o0000O00000.O00000000(18.0F);
      float var19 = var11 + o0000O00000.O00000000(4.0F);
      float var20 = var12 + Math.round((var14 - var18) * 0.5F);
      o0000O00OO0O0.O00000000(var19, var20, var18, var18, o0000O00000.O00000000(5.0F), ColorScheme.O00000000(i, bl ? 68 : 38));
      this.O00000000(o0000O00OO0O0, o0000O00000, var19 + var18 * 0.5F, var20 + var18 * 0.5F, j, bl ? o0000O000O0OO.O000000000O() : i, o0000O000O0OO);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var11 + o0000O00000.O00000000(28.0F),
         var12,
         var14,
         9.0F,
         string,
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, int i, int j, ColorScheme o0000O000O0OO) {
      float var8 = o0000O00000.O00000000(1.0F);
      int var9 = ColorScheme.O00000000(j, 235);
      if (i == 0) {
         o0000O00OO0O0.O00000000(f - 4.8F * var8, g - 4.4F * var8, 9.6F * var8, 8.8F * var8, 2.2F * var8, ColorScheme.O00000000(var9, 92));
         o0000O00OO0O0.O00000000(f - 2.8F * var8, g + 1.2F * var8, 1.4F * var8, 2.6F * var8, 0.7F * var8, var9);
         o0000O00OO0O0.O00000000(f - 0.2F * var8, g - 1.8F * var8, 1.4F * var8, 5.6F * var8, 0.7F * var8, var9);
         o0000O00OO0O0.O00000000(f + 2.4F * var8, g - 4.0F * var8, 1.4F * var8, 7.8F * var8, 0.7F * var8, var9);
      } else if (i == 1) {
         o0000O00OO0O0.O00000000(f - 5.2F * var8, g - 2.8F * var8, 10.4F * var8, 6.8F * var8, 1.8F * var8, ColorScheme.O00000000(var9, 108));
         o0000O00OO0O0.O00000000(f - 4.2F * var8, g - 4.4F * var8, 4.8F * var8, 2.6F * var8, 1.1F * var8, ColorScheme.O00000000(var9, 178));
         o0000O00OO0O0.O00000000(f - 2.6F * var8, g + 0.1F * var8, 5.2F * var8, 1.1F * var8, 0.55F * var8, var9);
      } else {
         o0000O00OO0O0.O00000000(f - 4.8F * var8, g - 4.0F * var8, 9.6F * var8, 1.3F * var8, 0.65F * var8, var9);
         o0000O00OO0O0.O00000000(f - 4.8F * var8, g - 0.6F * var8, 9.6F * var8, 1.3F * var8, 0.65F * var8, var9);
         o0000O00OO0O0.O00000000(f - 4.8F * var8, g + 2.8F * var8, 7.1F * var8, 1.3F * var8, 0.65F * var8, ColorScheme.O00000000(var9, 190));
         o0000O00OO0O0.O000000000(f + 4.5F * var8, g + 3.4F * var8, 1.15F * var8, 0.0F, 1.0F, o0000O000O0OO.O000000000O00());
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      String string,
      String string2,
      int k
   ) {
      float var12 = Math.round(f);
      float var13 = Math.round(g);
      float var14 = Math.round(h);
      float var15 = Math.round(i);
      float var16 = var12 + o0000O00000.O00000000(27.0F);
      float var17 = Math.max(o0000O00000.O00000000(12.0F), var14 - o0000O00000.O00000000(37.0F));
      float var18 = o0000O00000.O00000000(11.0F);
      float var19 = o0000O00000.O00000000(12.0F);
      float var20 = Math.round(var13 + o0000O00000.O00000000(18.0F));
      int var21 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.18F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(k, 10), 0.16F);
      o0000O00OO0O0.O00000000(var12, var13, var14, var15, j, var21);
      o0000O00OO0O0.O00000000(
         var12,
         var13,
         var14,
         var15,
         j,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 54 : 20),
         Math.max(0.5F, o0000O00000.O00000000(0.55F))
      );
      this.O00000000(o0000O00OO0O0, o0000O00000, var12 + o0000O00000.O00000000(14.0F), var13 + o0000O00000.O00000000(8.0F), k, o0000O000O0OO);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var16,
         var13 + o0000O00000.O00000000(2.0F),
         var18,
         9.5F,
         string,
         O0000O00000OO.O000000000(o0000O000O0OO),
         var17
      );
      this.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, var16, var20, var19, 9.0F, string2, O0000O00000OO.O00000000(o0000O000O0OO), var17);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j) {
      float var9 = Math.round(f);
      float var10 = Math.round(g);
      float var11 = Math.round(h);
      float var12 = Math.round(i);
      boolean var13 = "0".equals(this.O00000000O000.O000000000O);
      int var14 = var13 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000();
      int var15 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, var13 ? 0.2F : 0.31F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(var14, var13 ? 12 : 28), 0.24F);
      o0000O00OO0O0.O00000000(var9, var10, var11, var12, j, var15);
      o0000O00OO0O0.O00000000(
         var9,
         var10,
         var11,
         var12,
         j,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 58 : 22),
         Math.max(0.55F, o0000O00000.O00000000(0.6F))
      );
      float var16 = o0000O00000.O00000000(14.0F);
      float var17 = var9 + var16 + o0000O00000.O00000000(14.0F);
      float var18 = Math.max(o0000O00000.O00000000(16.0F), var11 - var16 - o0000O00000.O00000000(24.0F));
      this.O00000000(o0000O00OO0O0, o0000O00000, var9 + var16, var10 + o0000O00000.O00000000(12.0F), var14, o0000O000O0OO);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var17,
         var10 + o0000O00000.O00000000(5.0F),
         o0000O00000.O00000000(14.0F),
         10.0F,
         "Что сейчас ломается",
         O0000O00000OO.O000000000(o0000O000O0OO),
         var18
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var17,
         var10 + o0000O00000.O00000000(22.0F),
         o0000O00000.O00000000(16.0F),
         10.0F,
         var13 ? "Шейдерных исключений нет" : this.O00000000O000.O0000000000OO,
         O0000O00000OO.O00000000(o0000O000O0OO),
         var18
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var17,
         var10 + o0000O00000.O00000000(42.0F),
         o0000O00000.O00000000(14.0F),
         9.0F,
         var13 ? this.O00000000O000.O000000000O0 : this.O00000000O000.O0000000000OO0,
         var13 ? O0000O00000OO.O000000000(o0000O000O0OO) : var14,
         var18
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var17,
         var10 + o0000O00000.O00000000(59.0F),
         o0000O00000.O00000000(15.0F),
         8.5F,
         var13 ? "Нажми Логи, чтобы загрузить latest.log" : this.O00000000O000.O0000000000OOO,
         var13 ? O0000O00000OO.O000000000(o0000O000O0OO) : O0000O00000OO.O00000000(o0000O000O0OO),
         var18
      );
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j) {
      float var9 = Math.round(f);
      float var10 = Math.round(g);
      float var11 = Math.round(h);
      float var12 = Math.round((var11 - o0000O00000.O00000000(8.0F)) * 0.5F);
      this.O000000000(
         o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9, var10, var12, i, j, "Mixin policy", this.O00000000O000.O0000000000O00, o0000O000O0OO.O000000000O0()
      );
      this.O000000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var9 + var12 + o0000O00000.O00000000(8.0F),
         var10,
         var11 - var12 - o0000O00000.O00000000(8.0F),
         i,
         j,
         "Privacy",
         this.O00000000O000.O0000000000O0O,
         o0000O000O0OO.O000000000O00()
      );
   }

   private void O000000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      String string,
      String string2,
      int k
   ) {
      int var12 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.18F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(k, 14), 0.18F);
      o0000O00OO0O0.O00000000(f, g, (float)Math.round(h), (float)Math.round(i), j, var12);
      o0000O00OO0O0.O00000000(
         f,
         g,
         (float)Math.round(h),
         (float)Math.round(i),
         j,
         ColorScheme.O00000000(k, o0000O000O0OO.O000000000O000() ? 46 : 42),
         Math.max(0.5F, o0000O00000.O00000000(0.55F))
      );
      float var13 = f + o0000O00000.O00000000(12.0F);
      float var14 = Math.max(o0000O00000.O00000000(12.0F), h - o0000O00000.O00000000(24.0F));
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var13,
         g + o0000O00000.O00000000(5.0F),
         o0000O00000.O00000000(13.0F),
         9.5F,
         string,
         O0000O00000OO.O000000000(o0000O000O0OO),
         var14
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var13,
         g + o0000O00000.O00000000(21.0F),
         o0000O00000.O00000000(14.0F),
         9.0F,
         string2,
         O0000O00000OO.O00000000(o0000O000O0OO),
         var14
      );
   }

   private void O0000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j) {
      float var9 = Math.round(f);
      float var10 = Math.round(g);
      float var11 = Math.round(h);
      float var12 = Math.round(i);
      int var13 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.24F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), 0.32F);
      o0000O00OO0O0.O00000000(var9, var10, var11, var12, j, var13);
      o0000O00OO0O0.O00000000(
         var9,
         var10,
         var11,
         var12,
         j,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 76 : 24),
         Math.max(0.55F, o0000O00000.O00000000(0.6F))
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var9 + o0000O00000.O00000000(14.0F),
         var10 + o0000O00000.O00000000(5.0F),
         o0000O00000.O00000000(13.0F),
         9.5F,
         "Гайдлайн",
         O0000O00000OO.O000000000(o0000O000O0OO)
      );
      float var14 = var10 + o0000O00000.O00000000(25.0F);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9 + o0000O00000.O00000000(14.0F), var14, "1 смотри Code/Stage", o0000O000O0OO.O000000000O0());
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9 + var11 * 0.29F, var14, "2 жми Слепок", o0000O000O0OO.O000000000O00());
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9 + var11 * 0.53F, var14, "3 открой Логи", o0000O000O0OO.O000000000O0());
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9 + var11 * 0.76F, var14, "4 передай Tracker ID", o0000O000O0OO.O000000000O00());
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j
   ) {
      float var10 = Math.round(f);
      float var11 = Math.round(g);
      float var12 = Math.round(h);
      float var13 = Math.round(i);
      int var14 = o0000O000O0OO.O000000000O000()
         ? ColorScheme.O00000000(247, 248, 252, 226)
         : ColorScheme.O00000000(ColorScheme.O00000000(5, 7, 12, 238), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 34), 0.22F);
      o0000O00OO0O0.O00000000(var10, var11, var12, var13, j, var14);
      o0000O00OO0O0.O00000000(
         var10,
         var11,
         var12,
         var13,
         j,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O000() ? 58 : 76),
         Math.max(0.55F, o0000O00000.O00000000(0.6F))
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var10 + o0000O00000.O00000000(14.0F),
         var11 + o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(16.0F),
         10.5F,
         "Встроенный viewer",
         O0000O00000OO.O00000000(o0000O000O0OO),
         o0000O00000.O00000000(138.0F)
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var10 + o0000O00000.O00000000(166.0F),
         var11 + o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(16.0F),
         8.5F,
         this.O00000000O000.O000000000O00,
         O0000O00000OO.O000000000(o0000O000O0OO),
         Math.max(o0000O00000.O00000000(40.0F), var12 - o0000O00000.O00000000(276.0F))
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var10 + var12 - o0000O00000.O00000000(92.0F),
         var11 + o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(16.0F),
         8.5F,
         "latest.log tail",
         O0000O00000OO.O000000000(o0000O000O0OO),
         o0000O00000.O00000000(80.0F)
      );
      float var15 = var10 + o0000O00000.O00000000(10.0F);
      float var16 = var11 + o0000O00000.O00000000(30.0F);
      float var17 = var12 - o0000O00000.O00000000(20.0F);
      float var18 = Math.max(o0000O00000.O00000000(24.0F), var13 - o0000O00000.O00000000(38.0F));
      int var19 = Math.min(this.O00000000O000.O000000000OO0, 96);
      float var20 = Math.max(o0000O00000.O00000000(14.0F), Math.min(o0000O00000.O00000000(18.0F), var18 / Math.max(1, Math.min(96, 14))));
      float var21 = o0000O00000.O00000000(62.0F);
      float var22 = Math.max(var18, var19 * var20);
      float var23 = var17;

      for (int var24 = 0; var24 < var19; var24++) {
         float var25 = var21
            + o0000O00000.O00000000(24.0F)
            + O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, this.O00000000(this.O00000000O000.O000000000O0O[var24]), 8.0F);
         var23 = Math.max(var23, var25);
      }

      float var34 = Math.max(0.0F, var22 - var18);
      float var35 = Math.max(0.0F, var23 - var17);
      O00000000(var15, var16, var17, var18, var23, var22, var35, var34);
      o0000O000O0O0.O00000000(var34, var35);
      float var26 = Math.min(o0000O000O0O0.O0000000O00O0O(), var34);
      float var27 = Math.min(o0000O000O0O0.O0000000O00OO(), var35);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         var15, var16, var17, var18, o0000O00000.O00000000(6.0F), o0000O00000.O00000000(6.0F), o0000O00000.O00000000(6.0F), o0000O00000.O00000000(6.0F)
      );

      try {
         for (int var28 = 0; var28 < var19; var28++) {
            float var29 = var16 + var28 * var20 - var26;
            if (!(var29 + var20 < var16) && !(var29 > var16 + var18)) {
               this.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  o0000O000O0OO,
                  var15,
                  var29,
                  var17,
                  var20,
                  this.O00000000O000.O000000000O0O[var28],
                  this.O00000000O000.O000000000O0O0[var28],
                  var27
               );
            }
         }

         if (var19 == 0) {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var15 + o0000O00000.O00000000(9.0F),
               var16 + o0000O00000.O00000000(3.0F),
               o0000O00000.O00000000(16.0F),
               9.0F,
               "Нажми Логи, чтобы загрузить latest.log",
               O0000O00000OO.O000000000(o0000O000O0OO)
            );
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      if (var34 > 0.5F) {
         float var36 = O000000000000(o0000O00000);
         float var38 = Math.round(var15 + var17 - var36);
         float var30 = O000000000000O(o0000O00000);
         float var31 = Math.round(var16 + (var18 - var30) * (var26 / Math.max(1.0F, var34)));
         O0000O00000OO.O000000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var38, var16, var36, var18, var31, var30, 0.0F, 0.42F);
      }

      if (var35 > 0.5F) {
         float var37 = O000000000000(o0000O00000);
         float var39 = Math.round(var16 + var18 - var37);
         float var40 = O0000000000000(o0000O00000);
         float var41 = Math.round(var15 + (var17 - var40) * (var27 / Math.max(1.0F, var35)));
         o0000O00OO0O0.O00000000(
            var15, var39, var17, var37, var37 * 0.5F, ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), 0.42F)
         );
         o0000O00OO0O0.O00000000(
            var41,
            var39,
            var40,
            var37,
            var37 * 0.5F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 165),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 150)
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, String string, int j, float k
   ) {
      int var11 = this.O00000000(o0000O000O0OO, j);
      if (j >= 2) {
         o0000O00OO0O0.O00000000(f, g, h, i, o0000O00000.O00000000(3.0F), ColorScheme.O00000000(var11, j == 3 ? 24 : 16));
      }

      float var12 = f + o0000O00000.O00000000(7.0F);
      float var13 = g + i * 0.5F;
      o0000O00OO0O0.O000000000(var12, var13, o0000O00000.O00000000(2.2F), 0.0F, 1.0F, ColorScheme.O00000000(var11, 230));
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         f + o0000O00000.O00000000(16.0F),
         g,
         i,
         7.0F,
         this.O00000000(j),
         ColorScheme.O00000000(var11, 238)
      );
      float var14 = f + o0000O00000.O00000000(72.0F);
      float var15 = Math.max(o0000O00000.O00000000(18.0F), h - o0000O00000.O00000000(76.0F));
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(var14, g, var15, i, 0.0F, 0.0F, 0.0F, 0.0F);
      boolean var18 = false /* VF: Semaphore variable */;

      try {
         var18 = true;
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            var14 - k,
            g,
            i,
            8.0F,
            this.O00000000(string),
            j == 3 ? o0000O000O0OO.O000000000() : O0000O00000OO.O00000000(o0000O000O0OO)
         );
         var18 = false;
      } finally {
         if (var18) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, String string, int i) {
      float var8 = o0000O00000.O00000000(4.0F);
      o0000O00OO0O0.O000000000(f, g + o0000O00000.O00000000(8.0F), var8, 0.0F, 1.0F, ColorScheme.O00000000(i, 210));
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(9.0F),
         g,
         o0000O00000.O00000000(16.0F),
         8.5F,
         string,
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, String string, String string2, int j
   ) {
      float var11 = Math.round(f);
      float var12 = Math.round(g);
      float var13 = Math.round(h);
      float var14 = Math.round(i);
      float var15 = o0000O00000.O00000000(10.0F);
      int var16 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.13F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), 0.22F);
      o0000O00OO0O0.O00000000(var11, var12, var13, var14, o0000O00000.O00000000(7.0F), var16);
      o0000O00OO0O0.O00000000(
         var11,
         var12,
         var13,
         var14,
         o0000O00000.O00000000(7.0F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 52 : 15),
         Math.max(0.45F, o0000O00000.O00000000(0.5F))
      );
      float var17 = Math.max(o0000O00000.O00000000(12.0F), var13 - var15 * 2.0F);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var11 + var15,
         var12 + o0000O00000.O00000000(5.0F),
         o0000O00000.O00000000(13.0F),
         9.5F,
         string,
         O0000O00000OO.O000000000(o0000O000O0OO),
         var17
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var11 + var15,
         var12 + o0000O00000.O00000000(19.0F),
         o0000O00000.O00000000(15.0F),
         9.0F,
         string2,
         j,
         var17
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f, float g, float h, float i, String string, int j, float k
   ) {
      String var11 = this.O00000000(string);
      float var12 = Math.max(o0000O00000.O00000000(8.0F), k);
      float var13 = O0000O00000OO.O00000000(o0000O00000, o0000O0O00O00O, var11, i);
      if (var13 <= var12) {
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, f, g, h, i, var11, j);
      } else {
         float var14 = var13 - var12 + o0000O00000.O00000000(5.0F);
         float var15 = var14 * this.O000000000();
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, var12, h, 0.0F, 0.0F, 0.0F, 0.0F);
         boolean var18 = false /* VF: Semaphore variable */;

         try {
            var18 = true;
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, f - var15, g, h, i, var11, j);
            var18 = false;
         } finally {
            if (var18) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private float O000000000() {
      float var1 = (float)(System.currentTimeMillis() % 7200L) / 7200.0F;
      if (var1 < 0.18F) {
         return 0.0F;
      } else if (var1 < 0.44F) {
         return O000000000((var1 - 0.18F) / 0.26F);
      } else if (var1 < 0.62F) {
         return 1.0F;
      } else {
         return var1 < 0.88F ? 1.0F - O000000000((var1 - 0.62F) / 0.26F) : 0.0F;
      }
   }

   private static float O000000000(float f) {
      float var1 = O00000000(f);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float O000000000(float f, float g, float h) {
      return O00000000((f - g) / Math.max(0.001F, h - g));
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      String string,
      String string2,
      String string3,
      int k,
      float[] fs,
      float l,
      float m
   ) {
      float var16 = Math.round(f);
      float var17 = Math.round(g);
      float var18 = Math.round(h);
      float var19 = Math.round(i);
      int var20 = o0000O000O0OO.O000000000O000()
         ? O0000O00000OO.O00000000(o0000O000O0OO, 0.16F)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(k, 12), 0.18F);
      o0000O00OO0O0.O00000000(var16, var17, var18, var19, j, var20);
      o0000O00OO0O0.O00000000(
         var16, var17, var18, var19, j, ColorScheme.O00000000(k, o0000O000O0OO.O000000000O000() ? 54 : 40), Math.max(0.5F, o0000O00000.O00000000(0.6F))
      );
      float var21 = o0000O00000.O00000000(10.0F);
      float var22 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string2, 10.5F);
      float var23 = Math.max(o0000O00000.O00000000(12.0F), var18 - var21 * 2.0F - var22 - o0000O00000.O00000000(6.0F));
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var16 + var21,
         var17 + o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(12.0F),
         9.0F,
         string,
         O0000O00000OO.O000000000(o0000O000O0OO),
         var23
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var16 + var18 - var21 - var22,
         var17 + o0000O00000.O00000000(5.0F),
         o0000O00000.O00000000(13.0F),
         10.5F,
         string2,
         ColorScheme.O00000000(k, 235)
      );
      float var24 = var16 + var21;
      float var25 = var17 + o0000O00000.O00000000(24.0F);
      float var26 = Math.max(o0000O00000.O00000000(8.0F), var18 - var21 * 2.0F);
      float var27 = var17 + var19 - o0000O00000.O00000000(15.0F);
      float var28 = Math.max(o0000O00000.O00000000(8.0F), var27 - var25);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var24, var25, var26, var28, k, fs, l, O000000000(m));
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var16 + var21,
         var17 + var19 - o0000O00000.O00000000(13.0F),
         o0000O00000.O00000000(11.0F),
         7.5F,
         string3,
         O0000O00000OO.O000000000(o0000O000O0OO),
         Math.max(o0000O00000.O00000000(12.0F), var18 - var21 * 2.0F)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, int j, float[] fs, float k, float l
   ) {
      o0000O00OO0O0.O00000000(
         f, g + i - o0000O00000.O00000000(0.75F), h, o0000O00000.O00000000(0.75F), 0.0F, ColorScheme.O00000000(j, o0000O000O0OO.O000000000O000() ? 40 : 32)
      );
      int var12 = fs.length;
      if (var12 >= 2 && !(k <= 1.0E-4F) && !(l <= 0.001F)) {
         float var13 = h / (var12 - 1);
         int var14 = ColorScheme.O00000000(j, o0000O000O0OO.O000000000O000() ? 118 : 150);
         int var15 = ColorScheme.O00000000(j, o0000O000O0OO.O000000000O000() ? 12 : 18);
         int var16 = ColorScheme.O00000000(j, 235);
         float var17 = 0.0F;
         float var18 = 0.0F;

         for (int var19 = 0; var19 < var12; var19++) {
            float var20 = O00000000(this.O00000000O0000.O00000000(fs, var19) / k) * l;
            float var21 = var20 * i;
            float var22 = f + var19 * var13;
            float var23 = g + i - var21;
            if (var21 > 0.5F) {
               o0000O00OO0O0.O000000000(var22 - var13 * 0.5F, var23, var13 + o0000O00000.O00000000(0.6F), var21, 0.0F, var14, var15);
            }

            if (var19 > 0) {
               this.O00000000(o0000O00OO0O0, o0000O00000, var17, var18, var22, var23, var16);
            }

            var17 = var22;
            var18 = var23;
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, float h, float i, int j) {
      float var8 = h - f;
      float var9 = i - g;
      float var10 = (float)Math.sqrt(var8 * var8 + var9 * var9);
      float var11 = Math.max(1.0F, o0000O00000.O00000000(1.4F));
      if (var10 < 0.001F) {
         o0000O00OO0O0.O00000000(f - var11 * 0.5F, g - var11 * 0.5F, var11, var11, var11 * 0.5F, j);
      } else {
         float var12 = (float)Math.toDegrees(Math.atan2(var9, var8));
         o0000O00OO0O0.O00000000(f, g);
         o0000O00OO0O0.O000000000(var12);

         try {
            o0000O00OO0O0.O00000000(0.0F, -var11 * 0.5F, var10, var11, var11 * 0.5F, j);
         } finally {
            o0000O00OO0O0.O000000000000O();
            o0000O00OO0O0.O00000000000O();
         }
      }
   }

   private static void O00000000(float f, float g, float h, float i, float j, float k, float l, float m) {
      O00000000O00O0 = f;
      O00000000O00OO = g;
      O00000000O0O = h;
      O00000000O0O0 = i;
      O00000000O0O00 = j;
      O00000000O0O0O = k;
      O00000000O0OO = l;
      O00000000O0OO0 = m;
   }

   private static void O0000000000() {
      O00000000O00O0 = 0.0F;
      O00000000O00OO = 0.0F;
      O00000000O0O = 0.0F;
      O00000000O0O0 = 0.0F;
      O00000000O0O00 = 0.0F;
      O00000000O0O0O = 0.0F;
      O00000000O0OO = 0.0F;
      O00000000O0OO0 = 0.0F;
   }

   private static float O000000000000(O0000O00000 o0000O00000) {
      return Math.max(o0000O00000.O00000000(5.0F), o0000O00000.O00000000(4.0F));
   }

   private static float O0000000000000(O0000O00000 o0000O00000) {
      return !(O00000000O0O <= 1.0F) && !(O00000000O0O00 <= O00000000O0O)
         ? Math.max(o0000O00000.O00000000(28.0F), O00000000O0O * O00000000O0O / Math.max(O00000000O0O, O00000000O0O00))
         : O00000000O0O;
   }

   private static float O000000000000O(O0000O00000 o0000O00000) {
      return !(O00000000O0O0 <= 1.0F) && !(O00000000O0O0O <= O00000000O0O0)
         ? Math.max(o0000O00000.O00000000(18.0F), O00000000O0O0 * O00000000O0O0 / Math.max(O00000000O0O0, O00000000O0O0O))
         : O00000000O0O0;
   }

   private String O00000000000() {
      String var1 = this.O00000000(this.O00000000O000.O000000000000O);
      return var1.toLowerCase(Locale.ROOT).contains("finite") ? "OK" : "CORRUPTED";
   }

   private String O000000000000() {
      return this.O00000000O000.O000000000O0OO == 0 ? "Изолированы [TextureUnitGuard]" : this.O00000000(this.O00000000O000.O0000000000000);
   }

   private int O00000000(ColorScheme o0000O000O0OO) {
      return "OK".equals(this.O00000000000()) ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, int i, ColorScheme o0000O000O0OO) {
      float var7 = o0000O00000.O00000000(1.0F);
      o0000O00OO0O0.O00000000(
         f - 5.2F * var7,
         g - 5.2F * var7,
         10.4F * var7,
         10.4F * var7,
         3.0F * var7,
         ColorScheme.O00000000(i, o0000O000O0OO.O000000000O000() ? 96 : 124),
         Math.max(0.6F, o0000O00000.O00000000(0.65F))
      );
      o0000O00OO0O0.O00000000(f - 0.9F * var7, g - 3.7F * var7, 1.8F * var7, 7.4F * var7, 0.9F * var7, ColorScheme.O00000000(i, 214));
      o0000O00OO0O0.O00000000(f - 3.6F * var7, g + 1.9F * var7, 7.2F * var7, 1.5F * var7, 0.75F * var7, ColorScheme.O00000000(i, 178));
   }

   private int O00000000(ColorScheme o0000O000O0OO, int i) {
      return switch (i) {
         case 2 -> o0000O000O0OO.O0000000000();
         case 3 -> o0000O000O0OO.O000000000();
         case 4 -> o0000O000O0OO.O000000000O0();
         default -> o0000O000O0OO.O000000000O00();
      };
   }

   private String O00000000(int i) {
      return switch (i) {
         case 2 -> "WARN";
         case 3 -> "ERROR";
         case 4 -> "GL";
         default -> "INFO";
      };
   }

   private String O00000000(String string) {
      return string != null && !string.isBlank() ? string : "none";
   }

   private static float O00000000(O0000O00000 o0000O00000, float f, float g) {
      return Math.round(f + g - O00000000(o0000O00000) - O000000000(o0000O00000) - O0000000000(o0000O00000) - o0000O00000.O00000000(16.0F));
   }

   private static float O000000000(O0000O00000 o0000O00000, float f, float g) {
      return Math.round(f + g - O000000000(o0000O00000) - O0000000000(o0000O00000) - o0000O00000.O00000000(8.0F));
   }

   private static float O0000000000(O0000O00000 o0000O00000, float f, float g) {
      return Math.round(f + g - O0000000000(o0000O00000));
   }

   private static float O0000000000O00(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O0000000000O() + o0000O00000.O00000000(18.0F));
   }

   private static float O0000000000O0O(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O0000000000O0() + o0000O00000.O00000000(18.0F));
   }

   private static float O0000000000OO(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      return Math.round(o00000OOOOOOOO.O0000000000O00() - o0000O00000.O00000000(36.0F));
   }

   private static float O00000000000O(O0000O00000 o0000O00000) {
      return Math.round(o0000O00000.O0000000000O00() - o0000O00000.O00000000(36.0F));
   }

   static final class W334 {
      private static final int O00000000 = 48;
      private static final long O000000000 = 50L;
      final float[] O0000000000 = new float[48];
      final float[] O00000000000 = new float[48];
      final float[] O000000000000 = new float[48];
      private int O0000000000000;
      private long O000000000000O;
      private float O00000000000O;
      private float O00000000000O0;
      private float O00000000000OO;
      private OperatingSystemMXBean O0000000000O;
      private boolean O0000000000O0;

      void O00000000() {
         this.O00000000000O = this.O00000000000O0();
         this.O00000000000O0 = this.O00000000000OO();
         this.O00000000000OO = this.O0000000000O();

         for (int var1 = 0; var1 < 48; var1++) {
            this.O0000000000[var1] = this.O00000000000O;
            this.O00000000000[var1] = this.O00000000000O0;
            this.O000000000000[var1] = this.O00000000000OO;
         }

         this.O0000000000000 = 47;
         this.O000000000000O = System.currentTimeMillis();
      }

      void O000000000() {
         this.O00000000000O = this.O00000000000O0();
         this.O00000000000O0 = this.O00000000000OO();
         this.O00000000000OO = this.O0000000000O();
         long var1 = System.currentTimeMillis();
         if (var1 - this.O000000000000O < 50L) {
            this.O0000000000[this.O0000000000000] = this.O00000000000O;
            this.O00000000000[this.O0000000000000] = this.O00000000000O0;
            this.O000000000000[this.O0000000000000] = this.O00000000000OO;
         } else {
            this.O000000000000O = var1;
            this.O0000000000000 = (this.O0000000000000 + 1) % 48;
            this.O0000000000[this.O0000000000000] = this.O00000000000O;
            this.O00000000000[this.O0000000000000] = this.O00000000000O0;
            this.O000000000000[this.O0000000000000] = this.O00000000000OO;
         }
      }

      float O00000000(float[] fs, int i) {
         return fs[(this.O0000000000000 + 1 + i) % 48];
      }

      float O0000000000() {
         return 1.0F;
      }

      float O00000000000() {
         float var1 = 1.0F;

         for (int var2 = 0; var2 < 48; var2++) {
            var1 = Math.max(var1, this.O00000000000[var2]);
         }

         return Math.max(60.0F, var1 * 1.12F);
      }

      float O000000000000() {
         float var1 = 1.0F;

         for (int var2 = 0; var2 < 48; var2++) {
            var1 = Math.max(var1, this.O000000000000[var2]);
         }

         return Math.max(80.0F, var1 * 1.2F);
      }

      String O0000000000000() {
         return Math.round(this.O00000000000O * 100.0F) + "%";
      }

      String O000000000000O() {
         return Integer.toString(Math.round(this.O00000000000O0));
      }

      String O00000000000O() {
         return Math.round(this.O00000000000OO) + " ms";
      }

      private float O00000000000O0() {
         try {
            if (!this.O0000000000O0) {
               this.O0000000000O0 = true;
               if (ManagementFactory.getOperatingSystemMXBean() instanceof OperatingSystemMXBean var2) {
                  this.O0000000000O = var2;
               }
            }

            if (this.O0000000000O != null) {
               double var4 = this.O0000000000O.getProcessCpuLoad();
               if (var4 >= 0.0) {
                  return (float)Math.min(1.0, var4);
               }
            }
         } catch (Throwable var3) {
         }

         return this.O00000000000O;
      }

      private float O00000000000OO() {
         try {
            MinecraftClient var1 = MinecraftClient.getInstance();
            if (var1 != null) {
               return Math.max(0.0F, (float)var1.getCurrentFps());
            }
         } catch (Throwable var2) {
         }

         return this.O00000000000O0;
      }

      private float O0000000000O() {
         try {
            MinecraftClient var1 = MinecraftClient.getInstance();
            if (var1 != null && var1.player != null && var1.getNetworkHandler() != null) {
               PlayerListEntry var2 = var1.getNetworkHandler().getPlayerListEntry(var1.player.getUuid());
               if (var2 != null) {
                  return Math.max(0.0F, (float)var2.getLatency());
               }
            }
         } catch (Throwable var3) {
         }

         return this.O00000000000OO;
      }
   }
}
