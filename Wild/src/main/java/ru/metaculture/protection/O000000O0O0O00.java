package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Stream;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class O000000O0O0O00 implements MinecraftAccessor {
   private static final int O00000000 = 3;
   private static final double O000000000 = 8.0;
   private static final double O0000000000 = 0.14;
   private static final double O00000000000 = 0.08;
   private static final Gson O000000000000 = new GsonBuilder().setPrettyPrinting().create();
   private static final AtomicReference<O000000O0OOOOO> O0000000000000 = new AtomicReference<>(O000000O0OOOOO.idle());
   private static final CopyOnWriteArrayList<Consumer<O000000O0OOOOO>> O000000000000O = new CopyOnWriteArrayList<>();
   private static O000000O0O0O00.W38 O00000000000O = new O000000O0O0O00.W38();
   private static LivingEntity O00000000000O0;
   private static boolean O00000000000OO;
   private static boolean O0000000000O00;
   private static boolean O0000000000O0O;
   private static boolean O0000000000OO;
   private static int O0000000000OO0;
   private static int O0000000000OOO = -1;
   private static int O000000000O = -1;
   private static long O000000000O0;
   private static long O000000000O00 = -1L;
   private static int O000000000O000;
   private static int O000000000O00O = Integer.MIN_VALUE;
   private static long O000000000O0O;
   private static long O000000000O0O0;
   private static int O000000000O0OO;
   private static int O000000000OO;
   private static float O000000000OO0;
   private static float O000000000OO00;
   private static float O000000000OO0O;
   private static float O000000000OOO;
   private static double O000000000OOO0;
   private static O000000O0O0O00.W39 O000000000OOOO;
   private static final float O00000000O = 0.85F;
   private static final float O00000000O0 = 0.3F;
   private static final float O00000000O00 = 0.09F;
   private static final float O00000000O000 = 0.05F;
   private static final float O00000000O0000 = 0.35F;
   private static final float O00000000O000O = 1.5F;
   private static final float O00000000O00O = 0.45F;
   private static final float O00000000O00O0 = 38.0F;
   private static final float O00000000O00OO = 24.0F;
   private static final float O00000000O0O = 12.0F;
   private static final float O00000000O0O0 = 8.0F;
   private static final float O00000000O0O00 = 0.3F;
   private static float O00000000O0O0O;
   private static float O00000000O0OO;
   private static float O00000000O0OO0;
   private static float O00000000O0OOO;
   private static String O00000000OO = "default";
   private static final int O00000000OO0 = 16;
   private static final int O00000000OO00 = 2;
   private static final int O00000000OO000 = 48;
   private static final int O00000000OO00O = 32;
   private static final int O00000000OO0O = 2;
   private static final int O00000000OO0O0 = 3;
   private static final float O00000000OO0OO = 180.0F;
   private static final float O00000000OOO = 90.0F;
   private static final float O00000000OOO0 = 30.0F;
   private static final float O00000000OOO00 = 6.0F;
   private static final float O00000000OOO0O = 3.0F;
   private static final float O00000000OOOO = 0.6F;
   private static final float O00000000OOOO0 = 10.0F;
   private static final float O00000000OOOOO = 0.55F;
   private static final float O0000000O = 35.0F;
   private static final float O0000000O0 = 18.0F;
   private static final float O0000000O00 = 0.5F;
   private static final float[] O0000000O000 = new float[16];
   private static O000000O0OOOO O0000000O0000;
   private static boolean O0000000O00000;
   private static volatile boolean O0000000O0000O;
   private static Thread O0000000O000O;
   private static float O0000000O000O0;
   private static float O0000000O000OO;
   private static float O0000000O00O;
   private static float O0000000O00O0;
   private static float O0000000O00O00;
   private static float O0000000O00O0O;
   private static int O0000000O00OO;
   private static float O0000000O00OO0;
   private static float O0000000O00OOO;
   private static final int[] O0000000O0O = new int[3];
   private static final int O0000000O0O0 = 160;
   private static final float[] O0000000O0O00 = new float[160];
   private static final float[] O0000000O0O000 = new float[160];
   private static int O0000000O0O00O;
   private static volatile boolean O0000000O0O0O;
   private static volatile float[] O0000000O0O0O0;
   private static volatile float[] O0000000O0O0OO;
   private static volatile float O0000000O0OO = -1.0F;
   private static volatile int O0000000O0OO0;
   private static volatile float O0000000O0OO00;
   private static volatile float O0000000O0OO0O;
   private static volatile float O0000000O0OOO;
   private static long O0000000O0OOO0;
   private static int O0000000O0OOOO;

   private O000000O0O0O00() {
   }

   public static synchronized String O00000000() {
      if (a_.player != null && a_.world != null) {
         O00000000000OO = true;
         O0000000000O00 = false;
         O00000000000O = new O000000O0O0O00.W38();
         O00000000000O.O000000000 = System.currentTimeMillis();
         O00000000000O.O000000000000 = O00000000O0000();
         O00000000000O0 = null;
         O0000000000O0O = false;
         O0000000000OO = false;
         O0000000000OO0 = 0;
         O0000000000OOO = -1;
         O000000000O = -1;
         O000000000O0 = 0L;
         O000000000O00 = -1L;
         O000000000O0OO = 0;
         O000000000OO0 = a_.player.getYaw();
         O000000000OO00 = a_.player.getPitch();
         O000000000OO0O = 0.0F;
         O000000000OOO = 0.0F;
         O000000000OOO0 = a_.player.getVelocity().y;
         O00000000("TRAIN start profile=" + O00000000OO + " sens=" + String.format(Locale.ROOT, "%.3f", O00000000000O.O000000000000), false);
         O00000000000("AI recording: waiting target");
         return "Запись начата в профиль '" + O00000000OO + "'. Ударьте игрока, моба или WildBot.";
      } else {
         return "Игрок не готов.";
      }
   }

   public static synchronized String O000000000() {
      if (O00000000000OO) {
         O00000000000OO = false;
         O00000000000O0 = null;
         if (O00000000000O.O0000000000000.isEmpty()) {
            O00000000000("AI recording empty");
            return "Запись остановлена: паттерн пуст.";
         } else if (!O00000000O0O00()) {
            O00000000000("AI save failed");
            return "Не удалось сохранить паттерн.";
         } else {
            O000000000OO = O00000000000O.O0000000000000.size();
            O00000000000("AI ready: " + O000000000OO + " frames");
            return "Профиль '" + O00000000OO + "' сохранён: " + O000000000OO + " тиков, ударов: " + O000000000O0OO + ".";
         }
      } else if (O0000000000O00) {
         O0000000000O00 = false;
         O0000000O00000 = false;
         O0000000000OO = false;
         O000000000OOOO = null;
         O00000000O000O();
         O00000000000("AI stopped");
         return "Воспроизведение остановлено.";
      } else {
         return "AI уже остановлен.";
      }
   }

   public static synchronized String O0000000000() {
      if (O00000000000OO) {
         return "Сначала завершите запись командой .ai stop.";
      } else {
         O000000O0OOOO var0 = O000000O0OOOO.O000000000(O00000000O0O());
         boolean var1 = var0 != null && !var0.O00000000(16, 2);
         if (var1) {
            var0 = null;
         }

         O000000O0O0O00.W38 var2 = O00000000O0O0O();
         boolean var3 = var2 != null && var2.O0000000000000 != null && !var2.O0000000000000.isEmpty();
         if (var0 == null && !var3) {
            O00000000000("AI pattern missing");
            return var1 ? "Модель устарела (новый формат). Переобучите: .ai learn." : "Нет модели и паттерна. Сначала .ai train, затем .ai learn.";
         } else {
            if (var3) {
               O00000000(var2);
               O00000000000O = var2;
            } else {
               O00000000000O = new O000000O0O0O00.W38();
            }

            O000000000OO = O00000000000O.O0000000000000.size();
            O000000000O0OO = O000000000(O00000000000O.O0000000000000);
            O0000000O0000 = var0;
            O0000000O00000 = var0 != null;
            O00000000O000O();
            O0000000000O00 = true;
            O000000000O000 = 0;
            O000000000O00O = Integer.MIN_VALUE;
            O0000000000OO = false;
            O000000000O0O = 0L;
            O000000000O0O0 = 0L;
            O000000000OOOO = null;
            if (O0000000O00000) {
               O00000000("RUN model profile=" + O00000000OO, false);
               O00000000000("AI brain ready");
               return "Нейромодель профиля '" + O00000000OO + "' запущена.";
            } else {
               O00000000("RUN replay profile=" + O00000000OO + " frames=" + O000000000OO, false);
               O00000000000("AI ready: " + O000000000OO + " frames");
               return "Воспроизведение профиля '" + O00000000OO + "' запущено: " + O000000000OO + " тиков (модель не обучена, .ai learn).";
            }
         }
      }
   }

   public static synchronized String O00000000000() {
      if (O00000000000OO) {
         return "Сначала завершите запись командой .ai stop.";
      } else if (O0000000O0000O) {
         return "Обучение уже идёт. Дождитесь завершения.";
      } else {
         O000000O0O0O00.W38 var0 = O00000000O0O0O();
         if (var0 != null && var0.O0000000000000 != null && var0.O0000000000000.size() >= 16) {
            O00000000(var0);
            List var1 = var0.O0000000000000;
            int var2 = var1.size();
            float[] var3 = new float[var2];
            float[] var4 = new float[var2];

            for (int var5 = 0; var5 < var2; var5++) {
               O000000O0O0O00.W39 var6 = (O000000O0O0O00.W39)var1.get(var5);
               var3[var5] = var6 == null ? 0.0F : var6.O0000000000O0;
               var4[var5] = var6 == null ? 0.0F : var6.O0000000000O00;
            }

            float[] var34 = O00000000(var3, 2);
            float[] var35 = O00000000(var4, 2);
            float[] var7 = new float[var2];
            int var8 = 0;

            for (int var9 = 0; var9 < var2; var9++) {
               O000000O0O0O00.W39 var10 = (O000000O0O0O00.W39)var1.get(var9);
               if (var10 != null) {
                  var7[var8++] = (float)var10.O000000000OOO;
               }
            }

            float[] var36 = Arrays.copyOf(var7, var8);
            Arrays.sort(var36);
            float var37 = O00000000(var36, 0.34F);
            float var11 = O00000000(var36, 0.67F);
            float var12 = var37;
            float var13 = var11 <= var37 ? var37 + 0.5F : var11;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            float var17 = 0.0F;

            for (O000000O0O0O00.W39 var19 : (List<O000000O0O0O00.W39>)var1) {
               if (var19 != null && var19.O00000000O000) {
                  var14++;
                  if (var19.O00000000O0000) {
                     var15++;
                  } else {
                     var16++;
                     var17 += Math.abs(var19.O0000000000000) + Math.abs(var19.O000000000000O);
                  }
               }
            }

            float var38 = var14 > 0 ? (float)(var14 - var15) / var14 : 0.0F;
            float var39 = var16 > 0 ? var17 / var16 : 0.0F;
            float var20 = var0.O000000000000;
            ArrayList var21 = new ArrayList();
            ArrayList var22 = new ArrayList();

            for (int var23 = 0; var23 < 3; var23++) {
               var21.add(new ArrayList());
               var22.add(new ArrayList());
            }

            for (int var40 = 0; var40 < var2; var40++) {
               O000000O0O0O00.W39 var24 = (O000000O0O0O00.W39)var1.get(var40);
               if (var24 != null) {
                  int var25 = O00000000(var24.O000000000OOO, var12, var13);
                  ((List)var21.get(var25)).add(var3[var40] - var34[var40]);
                  ((List)var22.get(var25)).add(var4[var40] - var35[var40]);
               }
            }

            ArrayList var41 = new ArrayList();
            ArrayList var42 = new ArrayList();

            for (int var43 = 0; var43 < var2 - 1; var43++) {
               O000000O0O0O00.W39 var26 = (O000000O0O0O00.W39)var1.get(var43);
               O000000O0O0O00.W39 var27 = (O000000O0O0O00.W39)var1.get(var43 + 1);
               if (var26 != null && var27 != null) {
                  float var28 = MathHelper.wrapDegrees(var26.O00000000000 - var26.O000000000);
                  float var29 = var26.O000000000000 - var26.O0000000000;
                  float var30 = 0.0F;
                  float var31 = 0.0F;
                  if (var43 >= 1) {
                     O000000O0O0O00.W39 var32 = (O000000O0O0O00.W39)var1.get(var43 - 1);
                     if (var32 != null) {
                        var30 = var32.O0000000000O0;
                        var31 = var32.O0000000000O00;
                     }
                  }

                  float[] var51 = new float[16];
                  O00000000(
                     var51,
                     var28,
                     var29,
                     var26.O0000000000O0,
                     var26.O0000000000O00,
                     var30,
                     var31,
                     var26.O000000000OOO,
                     var26.O000000000OOO0,
                     var26.O000000000OO00,
                     var26.O00000000O00,
                     var26.O000000000OOOO,
                     var26.O00000000O0,
                     var26.O000000000O0O0,
                     var26.O000000000O0O,
                     var26.O00000000O00O0,
                     var26.O00000000O0O0
                  );
                  float[] var33 = new float[]{MathHelper.clamp(var3[var43 + 1] / 30.0F, -1.0F, 1.0F), MathHelper.clamp(var4[var43 + 1] / 30.0F, -1.0F, 1.0F)};
                  var41.add(var51);
                  var42.add(var33);
               }
            }

            if (var41.size() < 8) {
               return "Слишком мало пар для обучения.";
            } else {
               float[][] var44 = (float[][])var41.toArray(new float[0][]);
               float[][] var45 = (float[][])var42.toArray(new float[0][]);
               float[][] var46 = O00000000(var21);
               float[][] var47 = O00000000(var22);
               O0000000O0O0O0 = O000000000(var3, 160);
               O0000000O0O0OO = O000000000(var4, 160);
               O0000000O0OO0 = var44.length;
               O0000000O0OO = -1.0F;
               int var48 = MathHelper.clamp(500000 / var44.length, 300, 1500);
               String var49 = O00000000OO;
               Path var50 = O00000000O0O();
               O00000000(
                  String.format(
                     Locale.ROOT,
                     "LEARN pairs=%d frames=%d buckets=[%d,%d,%d] thr=[%.2f,%.2f] miss=%.0f%% sens=%.3f epochs=%d",
                     var44.length,
                     var2,
                     var46[0].length,
                     var46[1].length,
                     var46[2].length,
                     var12,
                     var13,
                     var38 * 100.0F,
                     var20,
                     var48
                  ),
                  true
               );
               O0000000O0000O = true;
               O00000000000("AI training: " + var44.length + " pairs");
               O0000000O000O = new Thread(() -> {
                  O000000O0OOOO0 var12x = new O000000O0OOOO0(16, 48, 32, 2);

                  try {
                     var12x.O00000000(var44, var45, var48, 0.002F);
                     float var13x = var12x.O00000000(var44, var45);
                     O0000000O0OO = var13x;
                     O00000000("LEARN done loss=" + String.format(Locale.ROOT, "%.5f", var13x), false);
                     O000000O0OOOO var14x = new O000000O0OOOO(16, 2, 3, var12x, var46, var47);
                     var14x.O00000000000 = var12;
                     var14x.O000000000000 = var13;
                     var14x.O0000000000000 = var20;
                     var14x.O000000000000O = var38;
                     var14x.O00000000000O = var39;
                     boolean var15x = var14x.O00000000(var50);
                     synchronized (O000000O0O0O00.class) {
                        if (var15x && var49.equals(O00000000OO)) {
                           O0000000O0000 = var14x;
                           O0000000O00000 = O0000000000O00;
                        }
                     }

                     O00000000000(var15x ? "AI brain ready (loss " + String.format(Locale.ROOT, "%.4f", var13x) + ")" : "AI train save failed");
                  } catch (Throwable var23x) {
                     O00000000000("AI train failed");
                  } finally {
                     O0000000O0000O = false;
                  }
               }, "Wild-AI-Train");
               O0000000O000O.setDaemon(true);
               O0000000O000O.start();
               return "Обучение профиля '" + var49 + "' запущено в фоне: " + var44.length + " пар, эпох: " + var48 + ".";
            }
         } else {
            return "Недостаточно данных (нужно >= 16 тиков). Сначала .ai train.";
         }
      }
   }

   public static synchronized void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      if (o0000000O0O0OO != null && o0000000O0O0OO.O0000000000() instanceof LivingEntity var1 && var1 != a_.player) {
         if (O00000000000OO) {
            if (O00000000000O0 == null || O00000000000O0.getId() != var1.getId()) {
               O00000000000O0 = var1;
               O000000000OO0 = a_.player.getYaw();
               O000000000OO00 = a_.player.getPitch();
               O000000000OO0O = 0.0F;
               O000000000OOO = 0.0F;
               O000000000OOO0 = a_.player.getVelocity().y;
            }

            long var4 = System.currentTimeMillis();
            O0000000000O0O = true;
            O000000000O = O0000000000OOO < 0 ? -1 : Math.max(0, O0000000000OO0 - O0000000000OOO);
            O000000000O00 = O000000000O0 == 0L ? -1L : Math.max(0L, var4 - O000000000O0);
            O0000000000OOO = O0000000000OO0;
            O000000000O0 = var4;
            O000000000O0OO++;
            O00000000000("AI recording: " + O00000000000O.O0000000000000.size() + " frames");
         }

         if (O0000000000O00) {
            O0000000000OO = false;
            O000000000O0O = System.currentTimeMillis();
            O000000000O0O0 = 0L;
            O00000000(String.format(Locale.ROOT, "ATTACK target=%d dist=%.2f", var1.getId(), a_.player.distanceTo(var1)), false);
         }
      }
   }

   public static synchronized void O000000000000() {
      if (O00000000000OO && a_.player != null && a_.world != null && O00000000000O0 != null && !O00000000000O0.isRemoved()) {
         Vec3d var0 = O00000000(O00000000000O0, a_.player.getYaw(), a_.player.getPitch());
         O000000O0O00OO var1 = O00000000(var0);
         if (var1 != null) {
            float var2 = a_.player.getYaw();
            float var3 = a_.player.getPitch();
            Vec3d var4 = a_.player.getVelocity();
            PlayerInput var5 = a_.player.input == null ? PlayerInput.DEFAULT : a_.player.input.playerInput;
            O000000O0O0O00.W39 var6 = new O000000O0O0O00.W39();
            var6.O00000000 = O0000000000OO0;
            var6.O000000000 = var2;
            var6.O0000000000 = var3;
            var6.O00000000000 = var1.O00000000;
            var6.O000000000000 = var1.O000000000;
            var6.O0000000000000 = MathHelper.wrapDegrees(var2 - var1.O00000000);
            var6.O000000000000O = var3 - var1.O000000000;
            Box var7 = O00000000000O0.getBoundingBox();
            var6.O00000000000O = O000000000(var0.x, var7.minX, var7.maxX, 0.14);
            var6.O00000000000O0 = O000000000(var0.y, var7.minY, var7.maxY, 0.08);
            var6.O00000000000OO = O000000000(var0.z, var7.minZ, var7.maxZ, 0.14);
            var6.O0000000000O = true;
            var6.O0000000000O0 = MathHelper.wrapDegrees(var2 - O000000000OO0);
            var6.O0000000000O00 = var3 - O000000000OO00;
            var6.O0000000000O0O = var6.O0000000000O0 - O000000000OO0O;
            var6.O0000000000OO = var6.O0000000000O00 - O000000000OOO;
            var6.O0000000000OO0 = O000000000(O000000000OO0O, var6.O0000000000O0);
            var6.O0000000000OOO = O000000000(O000000000OOO, var6.O0000000000O00);
            var6.O000000000O = Math.abs(var6.O0000000000O0) < 0.035F && Math.abs(var6.O0000000000O00) < 0.035F;
            var6.O000000000O0 = (var5.forward() ? 1.0F : 0.0F) - (var5.backward() ? 1.0F : 0.0F);
            var6.O000000000O00 = (var5.left() ? 1.0F : 0.0F) - (var5.right() ? 1.0F : 0.0F);
            var6.O000000000O000 = var5.jump();
            var6.O000000000O00O = var5.sneak();
            var6.O000000000O0O = var5.sprint() || a_.player.isSprinting();
            var6.O000000000O0O0 = a_.player.isOnGround();
            var6.O000000000O0OO = var4.x;
            var6.O000000000OO = var4.y;
            var6.O000000000OO0 = var4.z;
            var6.O000000000OO00 = Math.hypot(var4.x, var4.z);
            var6.O000000000OO0O = var4.y - O000000000OOO0;
            var6.O000000000OOO = a_.player.distanceTo(O00000000000O0);
            var6.O000000000OOO0 = O00000000000O0.getY() - a_.player.getY();
            Vec3d var8 = O00000000000(O00000000000O0);
            var6.O000000000OOOO = var8.x;
            var6.O00000000O = var8.y;
            var6.O00000000O0 = var8.z;
            var6.O00000000O00 = Math.hypot(var8.x, var8.z);
            var6.O00000000O000 = O0000000000O0O;
            var6.O00000000O0000 = O0000000000O0O && O000000O0O00.O0000000000(var2, var3, a_.player.distanceTo(O00000000000O0) + 1.0, O00000000000O0, true);
            var6.O00000000O000O = O0000000000O0O ? O000000000O : -1;
            var6.O00000000O00O = O0000000000O0O ? O000000000O00 : -1L;
            var6.O00000000O00O0 = a_.player.getAttackCooldownProgress(0.5F);
            var6.O00000000O00OO = a_.player.handSwinging;
            var6.O00000000O0O = a_.player.handSwingProgress;
            var6.O00000000O0O0 = O00000000000O0.hurtTime;
            O00000000000O.O0000000000000.add(var6);
            O00000000(var6.O0000000000O0, var6.O0000000000O00, false);
            if (var6.O00000000O000) {
               O00000000(
                  String.format(
                     Locale.ROOT,
                     "%s point=(%.2f,%.2f,%.2f) dist=%.2f yawOff=%.2f pitchOff=%.2f int=%dt/%dms",
                     var6.O00000000O0000 ? "HIT" : "MISS",
                     var6.O00000000000O,
                     var6.O00000000000O0,
                     var6.O00000000000OO,
                     var6.O000000000OOO,
                     var6.O0000000000000,
                     var6.O000000000000O,
                     var6.O00000000O000O,
                     var6.O00000000O00O
                  ),
                  true
               );
            } else if ((var6.O00000000 & 7) == 0) {
               O00000000(
                  String.format(
                     Locale.ROOT,
                     "REC t=%d aim=(%.2f,%.2f) yawD=%.2f pitchD=%.2f spd=%.3f dist=%.2f ground=%b sprint=%b",
                     var6.O00000000,
                     var6.O00000000000O,
                     var6.O00000000000O0,
                     var6.O0000000000O0,
                     var6.O0000000000O00,
                     var6.O000000000OO00,
                     var6.O000000000OOO,
                     var6.O000000000O0O0,
                     var6.O000000000O0O
                  ),
                  true
               );
            }

            O0000000000O0O = false;
            O000000000O = -1;
            O000000000O00 = -1L;
            O000000000OO0 = var2;
            O000000000OO00 = var3;
            O000000000OO0O = var6.O0000000000O0;
            O000000000OOO = var6.O0000000000O00;
            O000000000OOO0 = var4.y;
            O0000000000OO0++;
            if ((O0000000000OO0 & 15) == 0) {
               O00000000000("AI recording: " + O00000000000O.O0000000000000.size() + " frames");
            }
         }
      }
   }

   public static synchronized void O00000000(LivingEntity livingEntity) {
      if (O0000000000O00 && !O00000000000OO && a_.player != null && a_.world != null && livingEntity != null) {
         if (O0000000O00000 && O0000000O0000 != null) {
            O000000000(livingEntity);
         } else if (O00000000000O.O0000000000000 != null && !O00000000000O.O0000000000000.isEmpty()) {
            if (O000000000O00O != livingEntity.getId()) {
               O000000000O00O = livingEntity.getId();
               O000000000O000 = ThreadLocalRandom.current().nextInt(O00000000000O.O0000000000000.size());
               O0000000000OO = false;
               O000000000O0O = 0L;
               O000000000O0O0 = 0L;
               O00000000O000();
            }

            O000000O0O0O00.W39 var1 = O00000000000O.O0000000000000.get(O000000000O000);
            O000000000OOOO = var1;
            if (var1.O00000000O000 && !O0000000000OO) {
               O0000000000OO = true;
               long var2 = O00000000(var1);
               O000000000O0O0 = O000000000O0O == 0L ? System.currentTimeMillis() : O000000000O0O + var2;
            }

            Vec3d var21 = O00000000(livingEntity, var1);
            O000000O0O00OO var3 = O00000000(var21);
            if (var3 == null) {
               O00000000O00();
            } else {
               float var4 = a_.player.getYaw();
               float var5 = a_.player.getPitch();
               boolean var6 = O000000O0O00.O0000000000(var4, var5, Math.max(8.0, a_.player.distanceTo(livingEntity) + 1.0), livingEntity, true);
               float var7 = var6 ? 0.85F : 0.3F;
               float var8 = Math.abs(var1.O0000000000O0) + Math.abs(var1.O0000000000O00);
               float var9 = 0.09F + var8 * 0.05F;
               float var10 = O00000000(var9, true);
               float var11 = O00000000(var9, false);
               float var12 = MathHelper.clamp(var1.O0000000000000 * var7 + var10, -12.0F, 12.0F);
               float var13 = MathHelper.clamp(var1.O000000000000O * var7 + var11, -8.0F, 8.0F);
               O00000000O0OO0 = O00000000O0OO0 + (var12 - O00000000O0OO0) * 0.3F;
               O00000000O0OOO = O00000000O0OOO + (var13 - O00000000O0OOO) * 0.3F;
               float var14 = var3.O00000000 + O00000000O0OO0;
               float var15 = MathHelper.clamp(var3.O000000000 + O00000000O0OOO, -90.0F, 90.0F);
               O000000O0O00OO var16 = new O000000O0O00OO(var14, var15);
               float var17;
               float var18;
               if (var6) {
                  var17 = Math.max(0.45F, O000000000(var1.O0000000000O0, var1.O000000000O));
                  var18 = Math.max(0.45F, O000000000(var1.O0000000000O00, var1.O000000000O));
               } else {
                  float var19 = Math.abs(MathHelper.wrapDegrees(var14 - var4));
                  float var20 = Math.abs(var15 - var5);
                  var17 = Math.min(var19, 38.0F);
                  var18 = Math.min(var20, 24.0F);
               }

               O000000O0O0O0.O00000000(var16, var17, var18, 40.0F, 40.0F, 0, 15, false);
               O00000000O00();
               if ((O000000000O000 & 15) == 0) {
                  O00000000000("AI replay: " + O000000000O000 + "/" + O00000000000O.O0000000000000.size());
               }
            }
         }
      }
   }

   private static void O00000000O00() {
      O000000000O000++;
      if (O000000000O000 >= O00000000000O.O0000000000000.size()) {
         O000000000O000 = 0;
         O00000000O000();
      }
   }

   private static void O00000000O000() {
      O00000000O0O0O = 0.0F;
      O00000000O0OO = 0.0F;
      O00000000O0OO0 = 0.0F;
      O00000000O0OOO = 0.0F;
   }

   private static float O00000000(float f, boolean bl) {
      float var2 = (ThreadLocalRandom.current().nextFloat() * 2.0F - 1.0F) * f;
      if (bl) {
         O00000000O0O0O = O00000000O0O0O + (var2 - O00000000O0O0O) * 0.35F;
         return MathHelper.clamp(O00000000O0O0O, -1.5F, 1.5F);
      } else {
         O00000000O0OO = O00000000O0OO + (var2 - O00000000O0OO) * 0.35F;
         return MathHelper.clamp(O00000000O0OO, -1.5F, 1.5F);
      }
   }

   private static void O000000000(LivingEntity livingEntity) {
      if (O000000000O00O != livingEntity.getId()) {
         O000000000O00O = livingEntity.getId();
         O00000000O000O();
      }

      Vec3d var1 = O0000000000(livingEntity);
      O000000O0O00OO var2 = O00000000(var1);
      if (var2 != null) {
         float var3 = a_.player.getYaw();
         float var4 = a_.player.getPitch();
         float var5 = MathHelper.wrapDegrees(var2.O00000000 - var3);
         float var6 = var2.O000000000 - var4;
         Vec3d var7 = a_.player.getVelocity();
         double var8 = Math.hypot(var7.x, var7.z);
         Vec3d var10 = O00000000000(livingEntity);
         double var11 = Math.hypot(var10.x, var10.z);
         double var13 = a_.player.distanceTo(livingEntity);
         O00000000(
            O0000000O000,
            var5,
            var6,
            O0000000O000O0,
            O0000000O000OO,
            O0000000O00O,
            O0000000O00O0,
            var13,
            livingEntity.getY() - a_.player.getY(),
            var8,
            var11,
            var10.x,
            var10.z,
            a_.player.isOnGround(),
            a_.player.isSprinting(),
            a_.player.getAttackCooldownProgress(0.5F),
            livingEntity.hurtTime
         );
         float[] var15 = O0000000O0000.O00000000000O0.O00000000(O0000000O000);
         float var16 = var15[0] * 30.0F;
         float var17 = var15[1] * 30.0F;
         float var18 = O0000000O0000.O00000000000 > 0.0F ? O0000000O0000.O00000000000 : 1.6F;
         float var19 = O0000000O0000.O000000000000 > var18 ? O0000000O0000.O000000000000 : var18 + 0.8F;
         int var20 = O00000000(var13, var18, var19);
         float var21 = O0000000O0000.O000000000(var20, O0000000O0O[var20]);
         float var22 = O0000000O0000.O0000000000(var20, O0000000O0O[var20]);
         if (O0000000O0000.O00000000(var20) > 0) {
            O0000000O0O[var20]++;
         }

         float var23 = MathHelper.clamp(AttackAura.O000000000O00O.O0000000000(), 0.0F, 2.0F);
         O0000000O00O00 = O0000000O00O00 + (var21 * var23 - O0000000O00O00) * 0.55F;
         O0000000O00O0O = O0000000O00O0O + (var22 * var23 - O0000000O00O0O) * 0.55F;
         float var24 = MathHelper.clamp(var16 + O0000000O00O00, -35.0F, 35.0F);
         float var25 = MathHelper.clamp(var17 + O0000000O00O0O, -35.0F, 35.0F);
         var24 = O00000000(var24, var5);
         var25 = O00000000(var25, var6);
         if (AttackAura.O000000000O0O0.O0000000000() && O0000000O0000.O000000000000O > 0.001F) {
            if (O0000000O00OO > 0) {
               var24 = MathHelper.clamp(var24 + O0000000O00OO0, -35.0F, 35.0F);
               var25 = MathHelper.clamp(var25 + O0000000O00OOO, -35.0F, 35.0F);
               O0000000O00OO--;
            } else if (ThreadLocalRandom.current().nextFloat() < O0000000O0000.O000000000000O * 0.015F) {
               float var26 = Math.max(2.0F, O0000000O0000.O00000000000O);
               O0000000O00OO0 = (ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F) * var26 * 0.5F;
               O0000000O00OOO = (ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F) * var26 * 0.3F;
               O0000000O00OO = ThreadLocalRandom.current().nextInt(2, 5);
            }
         }

         O0000000O00O = O0000000O000O0;
         O0000000O00O0 = O0000000O000OO;
         O0000000O000O0 = var24;
         O0000000O000OO = var25;
         O00000000(var24, var25, true);
         O0000000O0OO00 = var5;
         O0000000O0OO0O = var6;
         O0000000O0OOO = Math.abs(O0000000O00O00) + Math.abs(O0000000O00O0O);
         if ((++O0000000O0OOOO & 7) == 0) {
            O00000000(
               String.format(
                  Locale.ROOT,
                  "NN err=(%.2f,%.2f) mean=(%.2f,%.2f) jit=(%.2f,%.2f) delta=(%.2f,%.2f) dist=%.2f bucket=%d",
                  var5,
                  var6,
                  var16,
                  var17,
                  O0000000O00O00,
                  O0000000O00O0O,
                  var24,
                  var25,
                  var13,
                  var20
               ),
               true
            );
         }

         float var32 = var3 + var24;
         float var27 = MathHelper.clamp(var4 + var25, -90.0F, 90.0F);
         float var28 = Math.max(0.25F, Math.abs(var24));
         float var29 = Math.max(0.2F, Math.abs(var25));
         O000000O0O0O0.O00000000(new O000000O0O00OO(var32, var27), var28, var29, 40.0F, 40.0F, 0, 15, false);
      }
   }

   private static Vec3d O0000000000(LivingEntity livingEntity) {
      Vec3d var1 = O000000O0O000.O00000000(livingEntity.getBoundingBox(), false);
      return var1 != null ? var1 : O00000000(livingEntity.getBoundingBox(), livingEntity.getBoundingBox().getCenter());
   }

   private static float[] O00000000(float[] fs, int i) {
      int var2 = fs.length;
      float[] var3 = new float[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = Math.max(0, var4 - i);
         int var6 = Math.min(var2 - 1, var4 + i);
         float var7 = 0.0F;

         for (int var8 = var5; var8 <= var6; var8++) {
            var7 += fs[var8];
         }

         var3[var4] = var7 / (var6 - var5 + 1);
      }

      return var3;
   }

   private static int O00000000(double d, float f, float g) {
      if (d < f) {
         return 0;
      } else {
         return d < g ? 1 : 2;
      }
   }

   private static float O00000000(float[] fs, float f) {
      if (fs.length == 0) {
         return 0.0F;
      } else {
         int var2 = MathHelper.clamp((int)(f * fs.length), 0, fs.length - 1);
         return fs[var2];
      }
   }

   private static float O00000000O0000() {
      try {
         return (float)((Double)a_.options.getMouseSensitivity().getValue()).doubleValue();
      } catch (Throwable var1) {
         return -1.0F;
      }
   }

   private static int O00000000(float f, float g, int i) {
      float var3 = (f + g) / (2.0F * g);
      return MathHelper.clamp((int)(var3 * i), 0, i - 1);
   }

   public static synchronized O000000O0OOO0O O0000000000000() {
      O000000O0OOO0O var0 = new O000000O0OOO0O();
      var0.O000000000 = O00000000OO;
      O000000O0O0O00.W38 var1 = O00000000O0O0O();
      if (var1 != null && var1.O0000000000000 != null && var1.O0000000000000.size() >= 4) {
         O00000000(var1);
         List var2 = var1.O0000000000000;
         int var3 = var2.size();
         var0.O0000000000 = var3;
         var0.O00000000000 = O000000000(var2);
         var0.O00000000000O = var1.O000000000000;
         int var4 = 0;

         for (O000000O0O0O00.W39 var6 : (List<O000000O0O0O00.W39>)var2) {
            if (var6 != null && var6.O00000000O000 && var6.O00000000O0000) {
               var4++;
            }
         }

         var0.O000000000000 = var4;
         var0.O0000000000000 = Math.max(0, var0.O00000000000 - var4);
         var0.O000000000000O = var0.O00000000000 > 0 ? (float)var0.O0000000000000 / var0.O00000000000 : 0.0F;
         float[] var31 = new float[var3];
         int var32 = 0;
         float var7 = Float.MAX_VALUE;
         float var8 = 0.0F;

         for (O000000O0O0O00.W39 var10 : (List<O000000O0O0O00.W39>)var2) {
            if (var10 != null) {
               float var11 = (float)var10.O000000000OOO;
               var31[var32++] = var11;
               if (var11 < var7) {
                  var7 = var11;
               }

               if (var11 > var8) {
                  var8 = var11;
               }
            }
         }

         float[] var33 = Arrays.copyOf(var31, var32);
         Arrays.sort(var33);
         var0.O0000000000O = O00000000(var33, 0.34F);
         var0.O0000000000O0 = O00000000(var33, 0.67F);
         if (var0.O0000000000O0 <= var0.O0000000000O) {
            var0.O0000000000O0 = var0.O0000000000O + 0.5F;
         }

         var0.O00000000000O0 = var7 == Float.MAX_VALUE ? 0.0F : var7;
         var0.O00000000000OO = var8;
         byte var34 = 20;
         var0.O0000000000O0O = var34;
         float[] var35 = new float[var34];
         int[] var12 = new int[var34];
         byte var13 = 21;
         var0.O000000000O = new int[var13];
         var0.O000000000O0 = new int[var13];
         var0.O0000000000OOO = 25.0F;
         float var14 = var0.O00000000000OO - var0.O00000000000O0;
         if (var14 < 0.001F) {
            var14 = 1.0F;
         }

         for (O000000O0O0O00.W39 var16 : (List<O000000O0O0O00.W39>)var2) {
            if (var16 != null) {
               int var17 = O00000000(var16.O000000000OOO, var0.O0000000000O, var0.O0000000000O0);
               var0.O0000000000O00[var17]++;
               float var18 = Math.abs(var16.O0000000000O0) + Math.abs(var16.O0000000000O00);
               int var19 = MathHelper.clamp((int)(((float)var16.O000000000OOO - var0.O00000000000O0) / var14 * var34), 0, var34 - 1);
               var35[var19] += var18;
               var12[var19]++;
               var0.O000000000O[O00000000(var16.O0000000000O0, var0.O0000000000OOO, var13)]++;
               var0.O000000000O0[O00000000(var16.O0000000000O00, var0.O0000000000OOO, var13)]++;
               if (Math.abs(var16.O0000000000O0) > 8.0F) {
                  var0.O000000000O00O++;
               } else {
                  var0.O000000000O0O++;
               }
            }
         }

         var0.O0000000000OO = new float[var34];
         float var36 = 0.0F;

         for (int var37 = 0; var37 < var34; var37++) {
            var0.O0000000000OO[var37] = var12[var37] > 0 ? var35[var37] / var12[var37] : 0.0F;
            if (var0.O0000000000OO[var37] > var36) {
               var36 = var0.O0000000000OO[var37];
            }
         }

         var0.O0000000000OO0 = var36;
         int var38 = 1;
         int var39 = 1;

         for (int var40 = 0; var40 < var13; var40++) {
            if (var0.O000000000O[var40] > var38) {
               var38 = var0.O000000000O[var40];
            }

            if (var0.O000000000O0[var40] > var39) {
               var39 = var0.O000000000O0[var40];
            }
         }

         var0.O000000000O00 = var38;
         var0.O000000000O000 = var39;
         float[] var41 = new float[var3];
         float[] var42 = new float[var3];

         for (int var20 = 0; var20 < var3; var20++) {
            O000000O0O0O00.W39 var21 = (O000000O0O0O00.W39)var2.get(var20);
            var41[var20] = var21 == null ? 0.0F : var21.O0000000000O0;
            var42[var20] = var21 == null ? 0.0F : var21.O0000000000O00;
         }

         var0.O000000000O0O0 = O000000000(var41, 160);
         var0.O000000000O0OO = O000000000(var42, 160);
         O000000O0OOOO var43 = O000000O0OOOO.O000000000(O00000000O0O());
         if (var43 != null && var43.O00000000(16, 2)) {
            var0.O000000000OO00 = true;
            var0.O000000000OO0O = O0000000O0OO;
            float[] var44 = new float[var3];
            float[] var22 = new float[var3];
            float[] var23 = new float[16];

            for (int var24 = 0; var24 < var3 - 1; var24++) {
               O000000O0O0O00.W39 var25 = (O000000O0O0O00.W39)var2.get(var24);
               if (var25 != null) {
                  float var26 = MathHelper.wrapDegrees(var25.O00000000000 - var25.O000000000);
                  float var27 = var25.O000000000000 - var25.O0000000000;
                  float var28 = 0.0F;
                  float var29 = 0.0F;
                  if (var24 >= 1) {
                     O000000O0O0O00.W39 var30 = (O000000O0O0O00.W39)var2.get(var24 - 1);
                     if (var30 != null) {
                        var28 = var30.O0000000000O0;
                        var29 = var30.O0000000000O00;
                     }
                  }

                  O00000000(
                     var23,
                     var26,
                     var27,
                     var25.O0000000000O0,
                     var25.O0000000000O00,
                     var28,
                     var29,
                     var25.O000000000OOO,
                     var25.O000000000OOO0,
                     var25.O000000000OO00,
                     var25.O00000000O00,
                     var25.O000000000OOOO,
                     var25.O00000000O0,
                     var25.O000000000O0O0,
                     var25.O000000000O0O,
                     var25.O00000000O00O0,
                     var25.O00000000O0O0
                  );
                  float[] var45 = var43.O00000000000O0.O00000000(var23);
                  var44[var24] = var45[0] * 30.0F;
                  var22[var24] = var45[1] * 30.0F;
               }
            }

            var0.O000000000OO = O000000000(var44, 160);
            var0.O000000000OO0 = O000000000(var22, 160);
         }

         var0.O00000000 = true;
         return var0;
      } else {
         var0.O00000000 = false;
         return var0;
      }
   }

   private static float O00000000(float f, float g) {
      if (Math.abs(g) < 18.0F) {
         return f;
      } else {
         boolean var2 = Math.signum(f) != Math.signum(g);
         boolean var3 = Math.abs(f) < 1.0F;
         return !var2 && !var3 ? f : MathHelper.clamp(g * 0.5F, -35.0F, 35.0F);
      }
   }

   private static float[][] O00000000(List<List<Float>> list) {
      float[][] var1 = new float[list.size()][];

      for (int var2 = 0; var2 < list.size(); var2++) {
         List var3 = (List)list.get(var2);
         float[] var4 = new float[var3.size()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = (Float)var3.get(var5);
         }

         var1[var2] = var4;
      }

      return var1;
   }

   private static float[] O000000000(float[] fs, int i) {
      float[] var2 = new float[i];
      int var3 = fs.length;
      if (var3 == 0) {
         return var2;
      } else {
         for (int var4 = 0; var4 < i; var4++) {
            int var5 = (int)((long)var4 * var3 / i);
            if (var5 >= var3) {
               var5 = var3 - 1;
            }

            var2[var4] = fs[var5];
         }

         return var2;
      }
   }

   private static void O00000000(float f, float g, boolean bl) {
      O0000000O0O00[O0000000O0O00O] = f;
      O0000000O0O000[O0000000O0O00O] = g;
      O0000000O0O00O = (O0000000O0O00O + 1) % 160;
      O0000000O0O0O = bl;
   }

   public static int O000000000000O() {
      return 160;
   }

   public static float[] O00000000000O() {
      return O0000000O0O00;
   }

   public static float[] O00000000000O0() {
      return O0000000O0O000;
   }

   public static int O00000000000OO() {
      return O0000000O0O00O;
   }

   public static boolean O0000000000O() {
      return O0000000O0O0O;
   }

   public static float[] O0000000000O0() {
      return O0000000O0O0O0;
   }

   public static float[] O0000000000O00() {
      return O0000000O0O0OO;
   }

   public static float O0000000000O0O() {
      return O0000000O0OO;
   }

   public static int O0000000000OO() {
      return O0000000O0OO0;
   }

   public static float O0000000000OO0() {
      return O0000000O0OO00;
   }

   public static float O0000000000OOO() {
      return O0000000O0OO0O;
   }

   public static float O000000000O() {
      return O0000000O0OOO;
   }

   public static boolean O000000000O0() {
      return O0000000O00000 && O0000000O0000 != null;
   }

   public static boolean O000000000O00() {
      return AttackAura.O000000000O0O.O0000000000();
   }

   public static Path O000000000O000() {
      return O000000000OO0O().resolve("logs").resolve(O00000000(O00000000OO) + ".log");
   }

   private static void O00000000(String string, boolean bl) {
      if (AttackAura.O000000000O0O.O0000000000()) {
         long var2 = System.currentTimeMillis();
         String var4 = "[AI] " + string;

         try {
            Path var5 = O000000000O000();
            Files.createDirectories(var5.getParent());
            Files.writeString(var5, var2 + " " + var4 + System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
         } catch (Throwable var6) {
         }

         if (bl && var2 - O0000000O0OOO0 >= 1500L) {
            O0000000O0OOO0 = var2;
            ChatUtil.O00000000(var4);
         }
      }
   }

   private static void O00000000(
      float[] fs,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      double d,
      double e,
      double l,
      double m,
      double n,
      double o,
      boolean bl,
      boolean bl2,
      float p,
      float q
   ) {
      fs[0] = MathHelper.clamp(f / 180.0F, -1.0F, 1.0F);
      fs[1] = MathHelper.clamp(g / 90.0F, -1.0F, 1.0F);
      fs[2] = MathHelper.clamp(h / 30.0F, -1.0F, 1.0F);
      fs[3] = MathHelper.clamp(i / 30.0F, -1.0F, 1.0F);
      fs[4] = MathHelper.clamp(j / 30.0F, -1.0F, 1.0F);
      fs[5] = MathHelper.clamp(k / 30.0F, -1.0F, 1.0F);
      fs[6] = MathHelper.clamp((float)(d / 6.0), 0.0F, 1.5F);
      fs[7] = MathHelper.clamp((float)(e / 3.0), -1.0F, 1.0F);
      fs[8] = MathHelper.clamp((float)(l / 0.6F), 0.0F, 1.5F);
      fs[9] = MathHelper.clamp((float)(m / 0.6F), 0.0F, 1.5F);
      fs[10] = MathHelper.clamp((float)(n / 0.6F), -1.5F, 1.5F);
      fs[11] = MathHelper.clamp((float)(o / 0.6F), -1.5F, 1.5F);
      fs[12] = bl ? 1.0F : 0.0F;
      fs[13] = bl2 ? 1.0F : 0.0F;
      fs[14] = MathHelper.clamp(p, 0.0F, 1.0F);
      fs[15] = MathHelper.clamp(q / 10.0F, 0.0F, 1.0F);
   }

   public static synchronized boolean O000000000O00O() {
      if (!O0000000000O00 || O00000000000OO) {
         return false;
      } else if (O0000000O00000 && O0000000O0000 != null) {
         return a_.player != null && a_.player.getAttackCooldownProgress(0.0F) >= 0.9F;
      } else if (O000000000OOOO == null) {
         return false;
      } else {
         return O000000000O0OO == 0
            ? a_.player != null && a_.player.getAttackCooldownProgress(0.0F) >= 0.92F
            : O0000000000OO && System.currentTimeMillis() >= O000000000O0O0;
      }
   }

   public static synchronized void O000000000O0O() {
      O000000000O000 = 0;
      O000000000O00O = Integer.MIN_VALUE;
      O0000000000OO = false;
      O000000000O0O = 0L;
      O000000000O0O0 = 0L;
      O000000000OOOO = null;
      O00000000O000O();
      O00000000O000();
   }

   private static void O00000000O000O() {
      O0000000O000O0 = 0.0F;
      O0000000O000OO = 0.0F;
      O0000000O00O = 0.0F;
      O0000000O00O0 = 0.0F;
      O0000000O00O00 = 0.0F;
      O0000000O00O0O = 0.0F;
      O0000000O00OO = 0;
      O0000000O00OO0 = 0.0F;
      O0000000O00OOO = 0.0F;

      for (int var0 = 0; var0 < O0000000O0O.length; var0++) {
         O0000000O0O[var0] = 0;
      }
   }

   public static synchronized void O000000000O0O0() {
      if (O00000000000OO && O00000000000O.O0000000000000 != null && !O00000000000O.O0000000000000.isEmpty()) {
         O00000000O0O00();
      }

      O00000000000OO = false;
      O0000000000O00 = false;
   }

   public static boolean O000000000O0OO() {
      return O00000000000OO;
   }

   public static boolean O000000000OO() {
      return O0000000000O00;
   }

   public static O000000O0OOOOO O000000000OO0() {
      return O0000000000000.get();
   }

   public static String O000000000OO00() {
      return O0000000000000.get().text();
   }

   public static void O00000000(Consumer<O000000O0OOOOO> consumer) {
      if (consumer != null) {
         O000000000000O.add(consumer);
         consumer.accept(O0000000000000.get());
      }
   }

   public static void O000000000(Consumer<O000000O0OOOOO> consumer) {
      O000000000000O.remove(consumer);
   }

   public static Path O000000000OO0O() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? WildClient.O00000000.O0000000000000.toPath().resolve("AI")
         : a_.runDirectory.toPath().resolve("Wild").resolve("AI");
   }

   private static Vec3d O00000000(LivingEntity livingEntity, float f, float g) {
      Vec3d var3 = a_.player.getEyePos();
      Vec3d var4 = O000000O0O00.O00000000(g, f);
      Box var5 = livingEntity.getBoundingBox();
      Optional var6 = var5.expand(0.05).raycast(var3, var3.add(var4.multiply(8.0)));
      if (var6.isPresent()) {
         return O00000000(var5, (Vec3d)var6.get());
      } else {
         Vec3d var7 = var5.getCenter();
         double var8 = Math.max(0.1, var7.subtract(var3).dotProduct(var4));
         Vec3d var10 = var3.add(var4.multiply(var8));
         return O00000000(var5, var10);
      }
   }

   private static Vec3d O00000000(LivingEntity livingEntity, O000000O0O0O00.W39 o000000000) {
      Box var2 = livingEntity.getBoundingBox();
      double var3;
      double var5;
      double var7;
      if (o000000000.O0000000000O) {
         var3 = O00000000(o000000000.O00000000000O, 0.14);
         var5 = O00000000(o000000000.O00000000000O0, 0.08);
         var7 = O00000000(o000000000.O00000000000OO, 0.14);
      } else {
         var3 = 0.5;
         var5 = MathHelper.clamp(0.5 + o000000000.O000000000000O / 180.0, 0.25, 0.75);
         var7 = 0.5;
      }

      Vec3d var9 = O00000000000(livingEntity);
      double var10 = MathHelper.clamp(a_.player.distanceTo(livingEntity) / 4.0, 0.25, 0.85);
      var3 += var9.x * var10 / Math.max(0.01, var2.getLengthX());
      var5 += var9.y * var10 / Math.max(0.01, var2.getLengthY());
      var7 += var9.z * var10 / Math.max(0.01, var2.getLengthZ());
      var3 = O00000000(var3, 0.14);
      var5 = O00000000(var5, 0.08);
      var7 = O00000000(var7, 0.14);
      return new Vec3d(MathHelper.lerp(var3, var2.minX, var2.maxX), MathHelper.lerp(var5, var2.minY, var2.maxY), MathHelper.lerp(var7, var2.minZ, var2.maxZ));
   }

   private static O000000O0O00OO O00000000(Vec3d vec3d) {
      if (vec3d != null && a_.player != null) {
         Vec3d var1 = vec3d.subtract(a_.player.getEyePos());
         if (var1.lengthSquared() < 1.0E-8) {
            return null;
         } else {
            float var2 = (float)Math.toDegrees(Math.atan2(-var1.x, var1.z));
            float var3 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var1.y, Math.hypot(var1.x, var1.z))), -90.0, 90.0);
            return new O000000O0O00OO(var2, var3);
         }
      } else {
         return null;
      }
   }

   private static Vec3d O00000000(Box box, Vec3d vec3d) {
      return new Vec3d(O00000000(vec3d.x, box.minX, box.maxX, 0.14), O00000000(vec3d.y, box.minY, box.maxY, 0.08), O00000000(vec3d.z, box.minZ, box.maxZ, 0.14));
   }

   private static double O00000000(double d, double e, double f, double g) {
      double var8 = f - e;
      if (var8 <= 1.0E-6) {
         return e;
      } else {
         double var10 = var8 * g;
         return MathHelper.clamp(d, e + var10, f - var10);
      }
   }

   private static double O000000000(double d, double e, double f, double g) {
      double var8 = f - e;
      return var8 <= 1.0E-6 ? 0.5 : O00000000((d - e) / var8, g);
   }

   private static double O00000000(double d, double e) {
      return MathHelper.clamp(d, e, 1.0 - e);
   }

   private static Vec3d O00000000000(LivingEntity livingEntity) {
      Vec3d var1 = livingEntity.getVelocity();
      Vec3d var2 = new Vec3d(livingEntity.getX() - livingEntity.lastX, livingEntity.getY() - livingEntity.lastY, livingEntity.getZ() - livingEntity.lastZ);
      return var2.lengthSquared() > var1.lengthSquared() ? var2 : var1;
   }

   private static boolean O000000000(float f, float g) {
      return Math.abs(f) > 0.02F && Math.abs(g) > 0.02F && Math.signum(f) != Math.signum(g);
   }

   private static float O000000000(float f, boolean bl) {
      float var2 = Math.abs(f);
      return bl ? 0.0F : var2;
   }

   private static long O00000000(O000000O0O0O00.W39 o000000000) {
      if (o000000000.O00000000O00O > 0L) {
         return o000000000.O00000000O00O;
      } else {
         return o000000000.O00000000O000O > 0 ? o000000000.O00000000O000O * 50L : 0L;
      }
   }

   private static Path O00000000O00O() {
      return O000000000OO0O().resolve("profiles");
   }

   private static Path O00000000O00O0() {
      return O00000000O00O().resolve(O00000000(O00000000OO) + ".json");
   }

   private static Path O00000000O00OO() {
      return O000000000OO0O().resolve("models");
   }

   private static Path O00000000O0O() {
      return O00000000O00OO().resolve(O00000000(O00000000OO) + ".json");
   }

   public static boolean O000000000OOO() {
      return Files.isRegularFile(O00000000O0O());
   }

   public static boolean O000000000OOO0() {
      return O0000000O0000O;
   }

   private static Path O00000000O0O0() {
      return O000000000OO0O().resolve("rotation_pattern.json");
   }

   static String O00000000(String string) {
      String var1 = string != null && !string.isBlank() ? string.trim() : "default";
      var1 = var1.replace('\\', '/');
      int var2 = var1.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var1.substring(var2 + 1);
      }

      if (var1.endsWith(".json")) {
         var1 = var1.substring(0, var1.length() - 5);
      }

      var1 = var1.replaceAll("[^a-zA-Z0-9._-]", "_");
      if (var1.isBlank() || var1.equals(".") || var1.equals("..")) {
         var1 = "default";
      }

      return var1;
   }

   private static String O0000000000(String string) {
      return string != null && string.endsWith(".json") ? string.substring(0, string.length() - 5) : string;
   }

   public static String O000000000OOOO() {
      return O00000000OO;
   }

   public static synchronized String O000000000(String string) {
      if (O00000000000OO) {
         return "Нельзя менять профиль во время записи (.ai stop сначала).";
      } else {
         O00000000OO = O00000000(string);
         O00000000000("AI profile: " + O00000000OO);
         return "Активный профиль: " + O00000000OO;
      }
   }

   public static List<String> O00000000O() {
      ArrayList var0 = new ArrayList();

      try {
         Path var1 = O00000000O00O();
         if (Files.isDirectory(var1)) {
            try (Stream var2 = Files.list(var1)) {
               ((Stream<Path>)var2).filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith(".json"))
                  .forEach(path -> var0.add(O0000000000(path.getFileName().toString())));
            }
         }
      } catch (Throwable var7) {
      }

      ((List<String>)var0).sort(String::compareToIgnoreCase);
      return var0;
   }

   public static synchronized String O00000000O0() {
      List var0 = O00000000O();
      return var0.isEmpty()
         ? "Профили не найдены. Активный: " + O00000000OO
         : "Профили (" + var0.size() + "): " + String.join(", ", var0) + " | активный: " + O00000000OO;
   }

   private static boolean O00000000O0O00() {
      try {
         O00000000(O00000000000O);
         Path var0 = O00000000O00O0();
         Files.createDirectories(var0.getParent());

         try (BufferedWriter var1 = Files.newBufferedWriter(var0, StandardCharsets.UTF_8)) {
            O000000000000.toJson(O00000000000O, var1);
         }

         return true;
      } catch (Throwable var6) {
         return false;
      }
   }

   private static O000000O0O0O00.W38 O00000000O0O0O() {
      try {
         Path var0 = O00000000O00O0();
         if (!Files.isRegularFile(var0)) {
            Path var1 = O00000000O0O0();
            if (!"default".equals(O00000000(O00000000OO)) || !Files.isRegularFile(var1)) {
               return null;
            }

            var0 = var1;
         }

         O000000O0O0O00.W38 var2;
         try (BufferedReader var7 = Files.newBufferedReader(var0, StandardCharsets.UTF_8)) {
            var2 = (O000000O0O0O00.W38)O000000000000.fromJson(var7, O000000O0O0O00.W38.class);
         }

         return var2;
      } catch (Throwable var6) {
         return null;
      }
   }

   private static void O00000000(O000000O0O0O00.W38 o00000000) {
      int var1 = o00000000.O00000000;
      o00000000.O00000000 = 3;
      if (o00000000.O0000000000000 == null) {
         o00000000.O0000000000000 = new ArrayList<>();
      }

      if (var1 < 2) {
         for (O000000O0O0O00.W39 var3 : o00000000.O0000000000000) {
            if (var3 != null) {
               var3.O0000000000O = false;
            }
         }
      }

      if (var1 < 3) {
         float var8 = 0.0F;
         float var9 = 0.0F;
         double var4 = 0.0;

         for (O000000O0O0O00.W39 var7 : o00000000.O0000000000000) {
            if (var7 != null) {
               var7.O0000000000O0O = var7.O0000000000O0 - var8;
               var7.O0000000000OO = var7.O0000000000O00 - var9;
               var7.O000000000OO0O = var7.O000000000OO - var4;
               var7.O0000000000OO0 = O000000000(var8, var7.O0000000000O0);
               var7.O0000000000OOO = O000000000(var9, var7.O0000000000O00);
               var7.O000000000O = Math.abs(var7.O0000000000O0) < 0.035F && Math.abs(var7.O0000000000O00) < 0.035F;
               if (var7.O00000000O00O <= 0L && var7.O00000000O000O > 0) {
                  var7.O00000000O00O = var7.O00000000O000O * 50L;
               }

               var8 = var7.O0000000000O0;
               var9 = var7.O0000000000O00;
               var4 = var7.O000000000OO;
            }
         }
      }

      o00000000.O0000000000 = o00000000.O0000000000000.size();
      o00000000.O00000000000 = O000000000(o00000000.O0000000000000);
   }

   private static int O000000000(List<O000000O0O0O00.W39> list) {
      int var1 = 0;
      if (list != null) {
         for (O000000O0O0O00.W39 var3 : list) {
            if (var3 != null && var3.O00000000O000) {
               var1++;
            }
         }
      }

      return var1;
   }

   private static void O00000000000(String string) {
      long var1 = O00000000000O.O0000000000000 == null ? 0L : O00000000000O.O0000000000000.size();
      O000000O0OOOOO var3 = new O000000O0OOOOO(string, O00000000000OO, O0000000O0000O, var1, O000000000OO, 0L, System.currentTimeMillis());
      O0000000000000.set(var3);

      for (Consumer var5 : O000000000000O) {
         try {
            var5.accept(var3);
         } catch (Throwable var7) {
         }
      }
   }

   static final class W38 {
      int O00000000 = 3;
      long O000000000;
      int O0000000000;
      int O00000000000;
      float O000000000000;
      List<O000000O0O0O00.W39> O0000000000000 = new ArrayList<>();
   }

   static final class W39 {
      int O00000000;
      float O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      double O00000000000O;
      double O00000000000O0;
      double O00000000000OO;
      boolean O0000000000O;
      float O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO;
      boolean O0000000000OO0;
      boolean O0000000000OOO;
      boolean O000000000O;
      float O000000000O0;
      float O000000000O00;
      boolean O000000000O000;
      boolean O000000000O00O;
      boolean O000000000O0O;
      boolean O000000000O0O0;
      double O000000000O0OO;
      double O000000000OO;
      double O000000000OO0;
      double O000000000OO00;
      double O000000000OO0O;
      double O000000000OOO;
      double O000000000OOO0;
      double O000000000OOOO;
      double O00000000O;
      double O00000000O0;
      double O00000000O00;
      boolean O00000000O000;
      boolean O00000000O0000;
      int O00000000O000O;
      long O00000000O00O;
      float O00000000O00O0;
      boolean O00000000O00OO;
      float O00000000O0O;
      int O00000000O0O0;
   }
}
