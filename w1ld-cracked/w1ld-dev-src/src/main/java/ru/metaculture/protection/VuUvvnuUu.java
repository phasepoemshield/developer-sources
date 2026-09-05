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
import net.minecraft.class_10185;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class VuUvvnuUu implements O000c0oocoo {
   private static final int UuUVuuUu = 3;
   private static final double C00OOC00oO = 8.0;
   private static final double uUnuvNvvNU = 0.14;
   private static final double vVvUvVVuuNvV = 0.08;
   private static final Gson uNNnnnuuuN = new GsonBuilder().setPrettyPrinting().create();
   private static final AtomicReference<VnUNuvv> nuUnNvnuUu = new AtomicReference<>(VnUNuvv.idle());
   private static final CopyOnWriteArrayList<Consumer<VnUNuvv>> VVuuUN = new CopyOnWriteArrayList<>();
   private static VuUvvnuUu.NVnVnNnN vNUvnnVnUvu = new VuUvvnuUu.NVnVnNnN();
   private static class_1309 uVUuuVnNVU;
   private static boolean vuuuNvNuv;
   private static boolean nUUVuvU;
   private static boolean UnUNVVVNuv;
   private static boolean vNVuvnUUnuUn;
   private static int UvnvNVnnnnNU;
   private static int uVUVnuvnuVuv = -1;
   private static int NVNnnvnuunNv = -1;
   private static long uVunuUNVVUUV;
   private static long UNnVVNvvnVvU = -1L;
   private static int uNnUnnuNUnNu;
   private static int NnUuNNU = Integer.MIN_VALUE;
   private static long nNvNUVU;
   private static long UnUNuUU;
   private static int uUVuVvuNUvnu;
   private static int UvUvUNuvNU;
   private static float c0oOOCcCoC0;
   private static float VVnVNnunVvu;
   private static float unNNVVNnvvV;
   private static float NuunnvnN;
   private static double NVUunUNUN;
   private static VuUvvnuUu.nvnNNunvv UUVNuUNUvUnV;
   private static final float vuvnUnVnUNnV = 0.85F;
   private static final float nnuUVNUuvvVU = 0.3F;
   private static final float nVVUuvuNnUN = 0.09F;
   private static final float nNnVnUNVV = 0.05F;
   private static final float nuunNvv = 0.35F;
   private static final float uUVVvVVNvvn = 1.5F;
   private static final float vvUVNVvvNUv = 0.45F;
   private static final float UuNnnVnuNNV = 38.0F;
   private static final float uUVvnUuNvvN = 24.0F;
   private static final float UUuUnNVNuuv = 12.0F;
   private static final float NVuNUuVnVUN = 8.0F;
   private static final float NVuunNnvvvVu = 0.3F;
   private static float vNnNuuvVn;
   private static float VUuuVUnun;
   private static float vVVuuVVv;
   private static float VuunNUUUvu;
   private static String NNUUNUuVNNVn = "default";
   private static final int VvVvnNUnvuvV = 16;
   private static final int ccOO0COcoco0 = 2;
   private static final int NUVvUUVuVNVv = 48;
   private static final int nNuVunNUVu = 32;
   private static final int UNvvunVVn = 2;
   private static final int UnvuVuVnNuvu = 3;
   private static final float UvNNVUVNVuvV = 180.0F;
   private static final float NnunUUnU = 90.0F;
   private static final float nvuVvuNnNUnv = 30.0F;
   private static final float NnVnNVN = 6.0F;
   private static final float vnvvNvUnVv = 3.0F;
   private static final float OCOocoOoOO = 0.6F;
   private static final float o0Ooc0COOoc = 10.0F;
   private static final float nvvnUnUn = 0.55F;
   private static final float UnUUVuVunvVu = 35.0F;
   private static final float nnvuvUNuUnN = 18.0F;
   private static final float UVnuVUUVnnU = 0.5F;
   private static final float[] VunnVNvNV = new float[16];
   private static nNnNNuUnU NvUVUvVVnUu;
   private static boolean unnUnUNVnN;
   private static volatile boolean NnuUnUNnu;
   private static Thread UnnnvvU;
   private static float VUUnuVvVu;
   private static float VvVuvUvvNNVv;
   private static float UnnNNvuvvUU;
   private static float VNNnnVUuvv;
   private static float vUvUvUNNuNvn;
   private static float uuVuUuuVVNvN;
   private static int VvuUUUNNNv;
   private static float uuuVnuvnnNnU;
   private static float nNunUnVN;
   private static final int[] VnVuuvVvnNv = new int[3];
   private static final int vuvvuVuVv = 160;
   private static final float[] uunNUuunVU = new float[160];
   private static final float[] NvnuuuvnVV = new float[160];
   private static int NnUVNnuvUv;
   private static volatile boolean UuuuNNunN;
   private static volatile float[] NNVNuUvVn;
   private static volatile float[] vuNnuUnu;
   private static volatile float uuvvuNvuUNVV = -1.0F;
   private static volatile int uVvunVUNuUvu;
   private static volatile float NVNnnvVnvV;
   private static volatile float vUNuuvvnVnv;
   private static volatile float unnnNUNnVu;
   private static long NvnnUUuVvNU;
   private static int vVvuUVnV;

   private VuUvvnuUu() {
   }

   public static synchronized String UuUVuuUu() {
      if (a_.field_1724 != null && a_.field_1687 != null) {
         vuuuNvNuv = true;
         nUUVuvU = false;
         vNUvnnVnUvu = new VuUvvnuUu.NVnVnNnN();
         vNUvnnVnUvu.C00OOC00oO = System.currentTimeMillis();
         vNUvnnVnUvu.uNNnnnuuuN = nuunNvv();
         uVUuuVnNVU = null;
         UnUNVVVNuv = false;
         vNVuvnUUnuUn = false;
         UvnvNVnnnnNU = 0;
         uVUVnuvnuVuv = -1;
         NVNnnvnuunNv = -1;
         uVunuUNVVUUV = 0L;
         UNnVVNvvnVvU = -1L;
         uUVuVvuNUvnu = 0;
         c0oOOCcCoC0 = a_.field_1724.method_36454();
         VVnVNnunVvu = a_.field_1724.method_36455();
         unNNVVNnvvV = 0.0F;
         NuunnvnN = 0.0F;
         NVUunUNUN = a_.field_1724.method_18798().field_1351;
         UuUVuuUu("TRAIN start profile=" + NNUUNUuVNNVn + " sens=" + String.format(Locale.ROOT, "%.3f", vNUvnnVnUvu.uNNnnnuuuN), false);
         vVvUvVVuuNvV("AI recording: waiting target");
         return "Запись начата в профиль '" + NNUUNUuVNNVn + "'. Ударьте игрока, моба или WildBot.";
      } else {
         return "Игрок не готов.";
      }
   }

   public static synchronized String C00OOC00oO() {
      if (vuuuNvNuv) {
         vuuuNvNuv = false;
         uVUuuVnNVU = null;
         if (vNUvnnVnUvu.nuUnNvnuUu.isEmpty()) {
            vVvUvVVuuNvV("AI recording empty");
            return "Запись остановлена: паттерн пуст.";
         } else if (!NVuunNnvvvVu()) {
            vVvUvVVuuNvV("AI save failed");
            return "Не удалось сохранить паттерн.";
         } else {
            UvUvUNuvNU = vNUvnnVnUvu.nuUnNvnuUu.size();
            vVvUvVVuuNvV("AI ready: " + UvUvUNuvNU + " frames");
            return "Профиль '" + NNUUNUuVNNVn + "' сохранён: " + UvUvUNuvNU + " тиков, ударов: " + uUVuVvuNUvnu + ".";
         }
      } else if (nUUVuvU) {
         nUUVuvU = false;
         unnUnUNVnN = false;
         vNVuvnUUnuUn = false;
         UUVNuUNUvUnV = null;
         uUVVvVVNvvn();
         vVvUvVVuuNvV("AI stopped");
         return "Воспроизведение остановлено.";
      } else {
         return "AI уже остановлен.";
      }
   }

   public static synchronized String uUnuvNvvNU() {
      if (vuuuNvNuv) {
         return "Сначала завершите запись командой .ai stop.";
      } else {
         nNnNNuUnU var0 = nNnNNuUnU.C00OOC00oO(UUuUnNVNuuv());
         boolean var1 = var0 != null && !var0.UuUVuuUu(16, 2);
         if (var1) {
            var0 = null;
         }

         VuUvvnuUu.NVnVnNnN var2 = vNnNuuvVn();
         boolean var3 = var2 != null && var2.nuUnNvnuUu != null && !var2.nuUnNvnuUu.isEmpty();
         if (var0 == null && !var3) {
            vVvUvVVuuNvV("AI pattern missing");
            return var1 ? "Модель устарела (новый формат). Переобучите: .ai learn." : "Нет модели и паттерна. Сначала .ai train, затем .ai learn.";
         } else {
            if (var3) {
               UuUVuuUu(var2);
               vNUvnnVnUvu = var2;
            } else {
               vNUvnnVnUvu = new VuUvvnuUu.NVnVnNnN();
            }

            UvUvUNuvNU = vNUvnnVnUvu.nuUnNvnuUu.size();
            uUVuVvuNUvnu = C00OOC00oO(vNUvnnVnUvu.nuUnNvnuUu);
            NvUVUvVVnUu = var0;
            unnUnUNVnN = var0 != null;
            uUVVvVVNvvn();
            nUUVuvU = true;
            uNnUnnuNUnNu = 0;
            NnUuNNU = Integer.MIN_VALUE;
            vNVuvnUUnuUn = false;
            nNvNUVU = 0L;
            UnUNuUU = 0L;
            UUVNuUNUvUnV = null;
            if (unnUnUNVnN) {
               UuUVuuUu("RUN model profile=" + NNUUNUuVNNVn, false);
               vVvUvVVuuNvV("AI brain ready");
               return "Нейромодель профиля '" + NNUUNUuVNNVn + "' запущена.";
            } else {
               UuUVuuUu("RUN replay profile=" + NNUUNUuVNNVn + " frames=" + UvUvUNuvNU, false);
               vVvUvVVuuNvV("AI ready: " + UvUvUNuvNU + " frames");
               return "Воспроизведение профиля '" + NNUUNUuVNNVn + "' запущено: " + UvUvUNuvNU + " тиков (модель не обучена, .ai learn).";
            }
         }
      }
   }

   public static synchronized String vVvUvVVuuNvV() {
      if (vuuuNvNuv) {
         return "Сначала завершите запись командой .ai stop.";
      } else if (NnuUnUNnu) {
         return "Обучение уже идёт. Дождитесь завершения.";
      } else {
         VuUvvnuUu.NVnVnNnN var0 = vNnNuuvVn();
         if (var0 != null && var0.nuUnNvnuUu != null && var0.nuUnNvnuUu.size() >= 16) {
            UuUVuuUu(var0);
            List var1 = var0.nuUnNvnuUu;
            int var2 = var1.size();
            float[] var3 = new float[var2];
            float[] var4 = new float[var2];

            for (int var5 = 0; var5 < var2; var5++) {
               VuUvvnuUu.nvnNNunvv var6 = (VuUvvnuUu.nvnNNunvv)var1.get(var5);
               var3[var5] = var6 == null ? 0.0F : var6.UuuNnUvUuv;
               var4[var5] = var6 == null ? 0.0F : var6.nUUVuvU;
            }

            float[] var34 = UuUVuuUu(var3, 2);
            float[] var35 = UuUVuuUu(var4, 2);
            float[] var7 = new float[var2];
            int var8 = 0;

            for (int var9 = 0; var9 < var2; var9++) {
               VuUvvnuUu.nvnNNunvv var10 = (VuUvvnuUu.nvnNNunvv)var1.get(var9);
               if (var10 != null) {
                  var7[var8++] = (float)var10.NuunnvnN;
               }
            }

            float[] var36 = Arrays.copyOf(var7, var8);
            Arrays.sort(var36);
            float var37 = UuUVuuUu(var36, 0.34F);
            float var11 = UuUVuuUu(var36, 0.67F);
            float var12 = var37;
            float var13 = var11 <= var37 ? var37 + 0.5F : var11;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            float var17 = 0.0F;

            for (VuUvvnuUu.nvnNNunvv var19 : var1) {
               if (var19 != null && var19.nNnVnUNVV) {
                  var14++;
                  if (var19.nuunNvv) {
                     var15++;
                  } else {
                     var16++;
                     var17 += Math.abs(var19.nuUnNvnuUu) + Math.abs(var19.VVuuUN);
                  }
               }
            }

            float var38 = var14 > 0 ? (float)(var14 - var15) / var14 : 0.0F;
            float var39 = var16 > 0 ? var17 / var16 : 0.0F;
            float var20 = var0.uNNnnnuuuN;
            ArrayList var21 = new ArrayList();
            ArrayList var22 = new ArrayList();

            for (int var23 = 0; var23 < 3; var23++) {
               var21.add(new ArrayList());
               var22.add(new ArrayList());
            }

            for (int var40 = 0; var40 < var2; var40++) {
               VuUvvnuUu.nvnNNunvv var24 = (VuUvvnuUu.nvnNNunvv)var1.get(var40);
               if (var24 != null) {
                  int var25 = UuUVuuUu(var24.NuunnvnN, var12, var13);
                  ((List)var21.get(var25)).add(var3[var40] - var34[var40]);
                  ((List)var22.get(var25)).add(var4[var40] - var35[var40]);
               }
            }

            ArrayList var41 = new ArrayList();
            ArrayList var42 = new ArrayList();

            for (int var43 = 0; var43 < var2 - 1; var43++) {
               VuUvvnuUu.nvnNNunvv var26 = (VuUvvnuUu.nvnNNunvv)var1.get(var43);
               VuUvvnuUu.nvnNNunvv var27 = (VuUvvnuUu.nvnNNunvv)var1.get(var43 + 1);
               if (var26 != null && var27 != null) {
                  float var28 = class_3532.method_15393(var26.vVvUvVVuuNvV - var26.C00OOC00oO);
                  float var29 = var26.uNNnnnuuuN - var26.uUnuvNvvNU;
                  float var30 = 0.0F;
                  float var31 = 0.0F;
                  if (var43 >= 1) {
                     VuUvvnuUu.nvnNNunvv var32 = (VuUvvnuUu.nvnNNunvv)var1.get(var43 - 1);
                     if (var32 != null) {
                        var30 = var32.UuuNnUvUuv;
                        var31 = var32.nUUVuvU;
                     }
                  }

                  float[] var51 = new float[16];
                  UuUVuuUu(
                     var51,
                     var28,
                     var29,
                     var26.UuuNnUvUuv,
                     var26.nUUVuvU,
                     var30,
                     var31,
                     var26.NuunnvnN,
                     var26.NVUunUNUN,
                     var26.VVnVNnunVvu,
                     var26.nVVUuvuNnUN,
                     var26.UUVNuUNUvUnV,
                     var26.nnuUVNUuvvVU,
                     var26.UnUNuUU,
                     var26.nNvNUVU,
                     var26.UuNnnVnuNNV,
                     var26.NVuNUuVnVUN
                  );
                  float[] var33 = new float[]{
                     class_3532.method_15363(var3[var43 + 1] / 30.0F, -1.0F, 1.0F), class_3532.method_15363(var4[var43 + 1] / 30.0F, -1.0F, 1.0F)
                  };
                  var41.add(var51);
                  var42.add(var33);
               }
            }

            if (var41.size() < 8) {
               return "Слишком мало пар для обучения.";
            } else {
               float[][] var44 = var41.toArray(new float[0][]);
               float[][] var45 = var42.toArray(new float[0][]);
               float[][] var46 = UuUVuuUu(var21);
               float[][] var47 = UuUVuuUu(var22);
               NNVNuUvVn = C00OOC00oO(var3, 160);
               vuNnuUnu = C00OOC00oO(var4, 160);
               uVvunVUNuUvu = var44.length;
               uuvvuNvuUNVV = -1.0F;
               int var48 = class_3532.method_15340(500000 / var44.length, 300, 1500);
               String var49 = NNUUNUuVNNVn;
               Path var50 = UUuUnNVNuuv();
               UuUVuuUu(
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
               NnuUnUNnu = true;
               vVvUvVVuuNvV("AI training: " + var44.length + " pairs");
               UnnnvvU = new Thread(() -> {
                  OcOOo0COoCoc var12x = new OcOOo0COoCoc(16, 48, 32, 2);
                  boolean var22x = false /* VF: Semaphore variable */;

                  label77: {
                     try {
                        var22x = true;
                        var12x.UuUVuuUu(var44, var45, var48, 0.002F);
                        float var13x = var12x.UuUVuuUu(var44, var45);
                        uuvvuNvuUNVV = var13x;
                        UuUVuuUu("LEARN done loss=" + String.format(Locale.ROOT, "%.5f", var13x), false);
                        nNnNNuUnU var14x = new nNnNNuUnU(16, 2, 3, var12x, var46, var47);
                        var14x.vVvUvVVuuNvV = var12;
                        var14x.uNNnnnuuuN = var13;
                        var14x.nuUnNvnuUu = var20;
                        var14x.VVuuUN = var38;
                        var14x.vNUvnnVnUvu = var39;
                        boolean var15x = var14x.UuUVuuUu(var50);
                        synchronized (VuUvvnuUu.class) {
                           if (var15x && var49.equals(NNUUNUuVNNVn)) {
                              NvUVUvVVnUu = var14x;
                              unnUnUNVnN = nUUVuvU;
                           }
                        }

                        vVvUvVVuuNvV(var15x ? "AI brain ready (loss " + String.format(Locale.ROOT, "%.4f", var13x) + ")" : "AI train save failed");
                        var22x = false;
                        break label77;
                     } catch (Throwable var24x) {
                        vVvUvVVuuNvV("AI train failed");
                        var22x = false;
                     } finally {
                        if (var22x) {
                           NnuUnUNnu = false;
                        }
                     }

                     NnuUnUNnu = false;
                     return;
                  }

                  NnuUnUNnu = false;
               }, "Wild-AI-Train");
               UnnnvvU.setDaemon(true);
               UnnnvvU.start();
               return "Обучение профиля '" + var49 + "' запущено в фоне: " + var44.length + " пар, эпох: " + var48 + ".";
            }
         } else {
            return "Недостаточно данных (нужно >= 16 тиков). Сначала .ai train.";
         }
      }
   }

   public static synchronized void UuUVuuUu(uNvNuNnVNUvv var0) {
      if (var0 != null && var0.uUnuvNvvNU() instanceof class_1309 var1 && var1 != a_.field_1724) {
         if (vuuuNvNuv) {
            if (uVUuuVnNVU == null || uVUuuVnNVU.method_5628() != var1.method_5628()) {
               uVUuuVnNVU = var1;
               c0oOOCcCoC0 = a_.field_1724.method_36454();
               VVnVNnunVvu = a_.field_1724.method_36455();
               unNNVVNnvvV = 0.0F;
               NuunnvnN = 0.0F;
               NVUunUNUN = a_.field_1724.method_18798().field_1351;
            }

            long var4 = System.currentTimeMillis();
            UnUNVVVNuv = true;
            NVNnnvnuunNv = uVUVnuvnuVuv < 0 ? -1 : Math.max(0, UvnvNVnnnnNU - uVUVnuvnuVuv);
            UNnVVNvvnVvU = uVunuUNVVUUV == 0L ? -1L : Math.max(0L, var4 - uVunuUNVVUUV);
            uVUVnuvnuVuv = UvnvNVnnnnNU;
            uVunuUNVVUUV = var4;
            uUVuVvuNUvnu++;
            vVvUvVVuuNvV("AI recording: " + vNUvnnVnUvu.nuUnNvnuUu.size() + " frames");
         }

         if (nUUVuvU) {
            vNVuvnUUnuUn = false;
            nNvNUVU = System.currentTimeMillis();
            UnUNuUU = 0L;
            UuUVuuUu(String.format(Locale.ROOT, "ATTACK target=%d dist=%.2f", var1.method_5628(), a_.field_1724.method_5739(var1)), false);
         }
      }
   }

   public static synchronized void uNNnnnuuuN() {
      if (vuuuNvNuv && a_.field_1724 != null && a_.field_1687 != null && uVUuuVnNVU != null && !uVUuuVnNVU.method_31481()) {
         class_243 var0 = UuUVuuUu(uVUuuVnNVU, a_.field_1724.method_36454(), a_.field_1724.method_36455());
         uuUuvNuNVNVU var1 = UuUVuuUu(var0);
         if (var1 != null) {
            float var2 = a_.field_1724.method_36454();
            float var3 = a_.field_1724.method_36455();
            class_243 var4 = a_.field_1724.method_18798();
            class_10185 var5 = a_.field_1724.field_3913 == null ? class_10185.field_54098 : a_.field_1724.field_3913.field_54155;
            VuUvvnuUu.nvnNNunvv var6 = new VuUvvnuUu.nvnNNunvv();
            var6.UuUVuuUu = UvnvNVnnnnNU;
            var6.C00OOC00oO = var2;
            var6.uUnuvNvvNU = var3;
            var6.vVvUvVVuuNvV = var1.UuUVuuUu;
            var6.uNNnnnuuuN = var1.C00OOC00oO;
            var6.nuUnNvnuUu = class_3532.method_15393(var2 - var1.UuUVuuUu);
            var6.VVuuUN = var3 - var1.C00OOC00oO;
            class_238 var7 = uVUuuVnNVU.method_5829();
            var6.vNUvnnVnUvu = C00OOC00oO(var0.field_1352, var7.field_1323, var7.field_1320, 0.14);
            var6.uVUuuVnNVU = C00OOC00oO(var0.field_1351, var7.field_1322, var7.field_1325, 0.08);
            var6.vuuuNvNuv = C00OOC00oO(var0.field_1350, var7.field_1321, var7.field_1324, 0.14);
            var6.nvUVNnuu = true;
            var6.UuuNnUvUuv = class_3532.method_15393(var2 - c0oOOCcCoC0);
            var6.nUUVuvU = var3 - VVnVNnunVvu;
            var6.UnUNVVVNuv = var6.UuuNnUvUuv - unNNVVNnvvV;
            var6.vNVuvnUUnuUn = var6.nUUVuvU - NuunnvnN;
            var6.UvnvNVnnnnNU = C00OOC00oO(unNNVVNnvvV, var6.UuuNnUvUuv);
            var6.uVUVnuvnuVuv = C00OOC00oO(NuunnvnN, var6.nUUVuvU);
            var6.NVNnnvnuunNv = Math.abs(var6.UuuNnUvUuv) < 0.035F && Math.abs(var6.nUUVuvU) < 0.035F;
            var6.uVunuUNVVUUV = (var5.comp_3159() ? 1.0F : 0.0F) - (var5.comp_3160() ? 1.0F : 0.0F);
            var6.UNnVVNvvnVvU = (var5.comp_3161() ? 1.0F : 0.0F) - (var5.comp_3162() ? 1.0F : 0.0F);
            var6.uNnUnnuNUnNu = var5.comp_3163();
            var6.NnUuNNU = var5.comp_3164();
            var6.nNvNUVU = var5.comp_3165() || a_.field_1724.method_5624();
            var6.UnUNuUU = a_.field_1724.method_24828();
            var6.uUVuVvuNUvnu = var4.field_1352;
            var6.UvUvUNuvNU = var4.field_1351;
            var6.c0oOOCcCoC0 = var4.field_1350;
            var6.VVnVNnunVvu = Math.hypot(var4.field_1352, var4.field_1350);
            var6.unNNVVNnvvV = var4.field_1351 - NVUunUNUN;
            var6.NuunnvnN = a_.field_1724.method_5739(uVUuuVnNVU);
            var6.NVUunUNUN = uVUuuVnNVU.method_23318() - a_.field_1724.method_23318();
            class_243 var8 = vVvUvVVuuNvV(uVUuuVnNVU);
            var6.UUVNuUNUvUnV = var8.field_1352;
            var6.vuvnUnVnUNnV = var8.field_1351;
            var6.nnuUVNUuvvVU = var8.field_1350;
            var6.nVVUuvuNnUN = Math.hypot(var8.field_1352, var8.field_1350);
            var6.nNnVnUNVV = UnUNVVVNuv;
            var6.nuunNvv = UnUNVVVNuv && VuUVUvnU.uUnuvNvvNU(var2, var3, a_.field_1724.method_5739(uVUuuVnNVU) + 1.0, uVUuuVnNVU, true);
            var6.uUVVvVVNvvn = UnUNVVVNuv ? NVNnnvnuunNv : -1;
            var6.vvUVNVvvNUv = UnUNVVVNuv ? UNnVVNvvnVvU : -1L;
            var6.UuNnnVnuNNV = a_.field_1724.method_7261(0.5F);
            var6.uUVvnUuNvvN = a_.field_1724.field_6252;
            var6.UUuUnNVNuuv = a_.field_1724.field_6251;
            var6.NVuNUuVnVUN = uVUuuVnNVU.field_6235;
            vNUvnnVnUvu.nuUnNvnuUu.add(var6);
            UuUVuuUu(var6.UuuNnUvUuv, var6.nUUVuvU, false);
            if (var6.nNnVnUNVV) {
               UuUVuuUu(
                  String.format(
                     Locale.ROOT,
                     "%s point=(%.2f,%.2f,%.2f) dist=%.2f yawOff=%.2f pitchOff=%.2f int=%dt/%dms",
                     var6.nuunNvv ? "HIT" : "MISS",
                     var6.vNUvnnVnUvu,
                     var6.uVUuuVnNVU,
                     var6.vuuuNvNuv,
                     var6.NuunnvnN,
                     var6.nuUnNvnuUu,
                     var6.VVuuUN,
                     var6.uUVVvVVNvvn,
                     var6.vvUVNVvvNUv
                  ),
                  true
               );
            } else if ((var6.UuUVuuUu & 7) == 0) {
               UuUVuuUu(
                  String.format(
                     Locale.ROOT,
                     "REC t=%d aim=(%.2f,%.2f) yawD=%.2f pitchD=%.2f spd=%.3f dist=%.2f ground=%b sprint=%b",
                     var6.UuUVuuUu,
                     var6.vNUvnnVnUvu,
                     var6.uVUuuVnNVU,
                     var6.UuuNnUvUuv,
                     var6.nUUVuvU,
                     var6.VVnVNnunVvu,
                     var6.NuunnvnN,
                     var6.UnUNuUU,
                     var6.nNvNUVU
                  ),
                  true
               );
            }

            UnUNVVVNuv = false;
            NVNnnvnuunNv = -1;
            UNnVVNvvnVvU = -1L;
            c0oOOCcCoC0 = var2;
            VVnVNnunVvu = var3;
            unNNVVNnvvV = var6.UuuNnUvUuv;
            NuunnvnN = var6.nUUVuvU;
            NVUunUNUN = var4.field_1351;
            UvnvNVnnnnNU++;
            if ((UvnvNVnnnnNU & 15) == 0) {
               vVvUvVVuuNvV("AI recording: " + vNUvnnVnUvu.nuUnNvnuUu.size() + " frames");
            }
         }
      }
   }

   public static synchronized void UuUVuuUu(class_1309 var0) {
      if (nUUVuvU && !vuuuNvNuv && a_.field_1724 != null && a_.field_1687 != null && var0 != null) {
         if (unnUnUNVnN && NvUVUvVVnUu != null) {
            C00OOC00oO(var0);
         } else if (vNUvnnVnUvu.nuUnNvnuUu != null && !vNUvnnVnUvu.nuUnNvnuUu.isEmpty()) {
            if (NnUuNNU != var0.method_5628()) {
               NnUuNNU = var0.method_5628();
               uNnUnnuNUnNu = ThreadLocalRandom.current().nextInt(vNUvnnVnUvu.nuUnNvnuUu.size());
               vNVuvnUUnuUn = false;
               nNvNUVU = 0L;
               UnUNuUU = 0L;
               nNnVnUNVV();
            }

            VuUvvnuUu.nvnNNunvv var1 = vNUvnnVnUvu.nuUnNvnuUu.get(uNnUnnuNUnNu);
            UUVNuUNUvUnV = var1;
            if (var1.nNnVnUNVV && !vNVuvnUUnuUn) {
               vNVuvnUUnuUn = true;
               long var2 = UuUVuuUu(var1);
               UnUNuUU = nNvNUVU == 0L ? System.currentTimeMillis() : nNvNUVU + var2;
            }

            class_243 var21 = UuUVuuUu(var0, var1);
            uuUuvNuNVNVU var3 = UuUVuuUu(var21);
            if (var3 == null) {
               nVVUuvuNnUN();
            } else {
               float var4 = a_.field_1724.method_36454();
               float var5 = a_.field_1724.method_36455();
               boolean var6 = VuUVUvnU.uUnuvNvvNU(var4, var5, Math.max(8.0, a_.field_1724.method_5739(var0) + 1.0), var0, true);
               float var7 = var6 ? 0.85F : 0.3F;
               float var8 = Math.abs(var1.UuuNnUvUuv) + Math.abs(var1.nUUVuvU);
               float var9 = 0.09F + var8 * 0.05F;
               float var10 = UuUVuuUu(var9, true);
               float var11 = UuUVuuUu(var9, false);
               float var12 = class_3532.method_15363(var1.nuUnNvnuUu * var7 + var10, -12.0F, 12.0F);
               float var13 = class_3532.method_15363(var1.VVuuUN * var7 + var11, -8.0F, 8.0F);
               vVVuuVVv = vVVuuVVv + (var12 - vVVuuVVv) * 0.3F;
               VuunNUUUvu = VuunNUUUvu + (var13 - VuunNUUUvu) * 0.3F;
               float var14 = var3.UuUVuuUu + vVVuuVVv;
               float var15 = class_3532.method_15363(var3.C00OOC00oO + VuunNUUUvu, -90.0F, 90.0F);
               uuUuvNuNVNVU var16 = new uuUuvNuNVNVU(var14, var15);
               float var17;
               float var18;
               if (var6) {
                  var17 = Math.max(0.45F, C00OOC00oO(var1.UuuNnUvUuv, var1.NVNnnvnuunNv));
                  var18 = Math.max(0.45F, C00OOC00oO(var1.nUUVuvU, var1.NVNnnvnuunNv));
               } else {
                  float var19 = Math.abs(class_3532.method_15393(var14 - var4));
                  float var20 = Math.abs(var15 - var5);
                  var17 = Math.min(var19, 38.0F);
                  var18 = Math.min(var20, 24.0F);
               }

               COC0OCc.UuUVuuUu(var16, var17, var18, 40.0F, 40.0F, 0, 15, false);
               nVVUuvuNnUN();
               if ((uNnUnnuNUnNu & 15) == 0) {
                  vVvUvVVuuNvV("AI replay: " + uNnUnnuNUnNu + "/" + vNUvnnVnUvu.nuUnNvnuUu.size());
               }
            }
         }
      }
   }

   private static void nVVUuvuNnUN() {
      uNnUnnuNUnNu++;
      if (uNnUnnuNUnNu >= vNUvnnVnUvu.nuUnNvnuUu.size()) {
         uNnUnnuNUnNu = 0;
         nNnVnUNVV();
      }
   }

   private static void nNnVnUNVV() {
      vNnNuuvVn = 0.0F;
      VUuuVUnun = 0.0F;
      vVVuuVVv = 0.0F;
      VuunNUUUvu = 0.0F;
   }

   private static float UuUVuuUu(float var0, boolean var1) {
      float var2 = (ThreadLocalRandom.current().nextFloat() * 2.0F - 1.0F) * var0;
      if (var1) {
         vNnNuuvVn = vNnNuuvVn + (var2 - vNnNuuvVn) * 0.35F;
         return class_3532.method_15363(vNnNuuvVn, -1.5F, 1.5F);
      } else {
         VUuuVUnun = VUuuVUnun + (var2 - VUuuVUnun) * 0.35F;
         return class_3532.method_15363(VUuuVUnun, -1.5F, 1.5F);
      }
   }

   private static void C00OOC00oO(class_1309 var0) {
      if (NnUuNNU != var0.method_5628()) {
         NnUuNNU = var0.method_5628();
         uUVVvVVNvvn();
      }

      class_243 var1 = uUnuvNvvNU(var0);
      uuUuvNuNVNVU var2 = UuUVuuUu(var1);
      if (var2 != null) {
         float var3 = a_.field_1724.method_36454();
         float var4 = a_.field_1724.method_36455();
         float var5 = class_3532.method_15393(var2.UuUVuuUu - var3);
         float var6 = var2.C00OOC00oO - var4;
         class_243 var7 = a_.field_1724.method_18798();
         double var8 = Math.hypot(var7.field_1352, var7.field_1350);
         class_243 var10 = vVvUvVVuuNvV(var0);
         double var11 = Math.hypot(var10.field_1352, var10.field_1350);
         double var13 = a_.field_1724.method_5739(var0);
         UuUVuuUu(
            VunnVNvNV,
            var5,
            var6,
            VUUnuVvVu,
            VvVuvUvvNNVv,
            UnnNNvuvvUU,
            VNNnnVUuvv,
            var13,
            var0.method_23318() - a_.field_1724.method_23318(),
            var8,
            var11,
            var10.field_1352,
            var10.field_1350,
            a_.field_1724.method_24828(),
            a_.field_1724.method_5624(),
            a_.field_1724.method_7261(0.5F),
            var0.field_6235
         );
         float[] var15 = NvUVUvVVnUu.uVUuuVnNVU.UuUVuuUu(VunnVNvNV);
         float var16 = var15[0] * 30.0F;
         float var17 = var15[1] * 30.0F;
         float var18 = NvUVUvVVnUu.vVvUvVVuuNvV > 0.0F ? NvUVUvVVnUu.vVvUvVVuuNvV : 1.6F;
         float var19 = NvUVUvVVnUu.uNNnnnuuuN > var18 ? NvUVUvVVnUu.uNNnnnuuuN : var18 + 0.8F;
         int var20 = UuUVuuUu(var13, var18, var19);
         float var21 = NvUVUvVVnUu.C00OOC00oO(var20, VnVuuvVvnNv[var20]);
         float var22 = NvUVUvVVnUu.uUnuvNvvNU(var20, VnVuuvVvnNv[var20]);
         if (NvUVUvVVnUu.UuUVuuUu(var20) > 0) {
            VnVuuvVvnNv[var20]++;
         }

         float var23 = class_3532.method_15363(AttackAura.NnUuNNU.uUnuvNvvNU(), 0.0F, 2.0F);
         vUvUvUNNuNvn = vUvUvUNNuNvn + (var21 * var23 - vUvUvUNNuNvn) * 0.55F;
         uuVuUuuVVNvN = uuVuUuuVVNvN + (var22 * var23 - uuVuUuuVVNvN) * 0.55F;
         float var24 = class_3532.method_15363(var16 + vUvUvUNNuNvn, -35.0F, 35.0F);
         float var25 = class_3532.method_15363(var17 + uuVuUuuVVNvN, -35.0F, 35.0F);
         var24 = UuUVuuUu(var24, var5);
         var25 = UuUVuuUu(var25, var6);
         if (AttackAura.UnUNuUU.uUnuvNvvNU() && NvUVUvVVnUu.VVuuUN > 0.001F) {
            if (VvuUUUNNNv > 0) {
               var24 = class_3532.method_15363(var24 + uuuVnuvnnNnU, -35.0F, 35.0F);
               var25 = class_3532.method_15363(var25 + nNunUnVN, -35.0F, 35.0F);
               VvuUUUNNNv--;
            } else if (ThreadLocalRandom.current().nextFloat() < NvUVUvVVnUu.VVuuUN * 0.015F) {
               float var26 = Math.max(2.0F, NvUVUvVVnUu.vNUvnnVnUvu);
               uuuVnuvnnNnU = (ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F) * var26 * 0.5F;
               nNunUnVN = (ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F) * var26 * 0.3F;
               VvuUUUNNNv = ThreadLocalRandom.current().nextInt(2, 5);
            }
         }

         UnnNNvuvvUU = VUUnuVvVu;
         VNNnnVUuvv = VvVuvUvvNNVv;
         VUUnuVvVu = var24;
         VvVuvUvvNNVv = var25;
         UuUVuuUu(var24, var25, true);
         NVNnnvVnvV = var5;
         vUNuuvvnVnv = var6;
         unnnNUNnVu = Math.abs(vUvUvUNNuNvn) + Math.abs(uuVuUuuVVNvN);
         if ((++vVvuUVnV & 7) == 0) {
            UuUVuuUu(
               String.format(
                  Locale.ROOT,
                  "NN err=(%.2f,%.2f) mean=(%.2f,%.2f) jit=(%.2f,%.2f) delta=(%.2f,%.2f) dist=%.2f bucket=%d",
                  var5,
                  var6,
                  var16,
                  var17,
                  vUvUvUNNuNvn,
                  uuVuUuuVVNvN,
                  var24,
                  var25,
                  var13,
                  var20
               ),
               true
            );
         }

         float var32 = var3 + var24;
         float var27 = class_3532.method_15363(var4 + var25, -90.0F, 90.0F);
         float var28 = Math.max(0.25F, Math.abs(var24));
         float var29 = Math.max(0.2F, Math.abs(var25));
         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var32, var27), var28, var29, 40.0F, 40.0F, 0, 15, false);
      }
   }

   private static class_243 uUnuvNvvNU(class_1309 var0) {
      class_243 var1 = nVvuVvVNVUun.UuUVuuUu(var0.method_5829(), false);
      return var1 != null ? var1 : UuUVuuUu(var0.method_5829(), var0.method_5829().method_1005());
   }

   private static float[] UuUVuuUu(float[] var0, int var1) {
      int var2 = var0.length;
      float[] var3 = new float[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = Math.max(0, var4 - var1);
         int var6 = Math.min(var2 - 1, var4 + var1);
         float var7 = 0.0F;

         for (int var8 = var5; var8 <= var6; var8++) {
            var7 += var0[var8];
         }

         var3[var4] = var7 / (var6 - var5 + 1);
      }

      return var3;
   }

   private static int UuUVuuUu(double var0, float var2, float var3) {
      if (var0 < var2) {
         return 0;
      } else {
         return var0 < var3 ? 1 : 2;
      }
   }

   private static float UuUVuuUu(float[] var0, float var1) {
      if (var0.length == 0) {
         return 0.0F;
      } else {
         int var2 = class_3532.method_15340((int)(var1 * var0.length), 0, var0.length - 1);
         return var0[var2];
      }
   }

   private static float nuunNvv() {
      try {
         return (float)((Double)a_.field_1690.method_42495().method_41753()).doubleValue();
      } catch (Throwable var1) {
         return -1.0F;
      }
   }

   private static int UuUVuuUu(float var0, float var1, int var2) {
      float var3 = (var0 + var1) / (2.0F * var1);
      return class_3532.method_15340((int)(var3 * var2), 0, var2 - 1);
   }

   public static synchronized VNVuNNvvuNnu nuUnNvnuUu() {
      VNVuNNvvuNnu var0 = new VNVuNNvvuNnu();
      var0.C00OOC00oO = NNUUNUuVNNVn;
      VuUvvnuUu.NVnVnNnN var1 = vNnNuuvVn();
      if (var1 != null && var1.nuUnNvnuUu != null && var1.nuUnNvnuUu.size() >= 4) {
         UuUVuuUu(var1);
         List var2 = var1.nuUnNvnuUu;
         int var3 = var2.size();
         var0.uUnuvNvvNU = var3;
         var0.vVvUvVVuuNvV = C00OOC00oO(var2);
         var0.vNUvnnVnUvu = var1.uNNnnnuuuN;
         int var4 = 0;

         for (VuUvvnuUu.nvnNNunvv var6 : var2) {
            if (var6 != null && var6.nNnVnUNVV && var6.nuunNvv) {
               var4++;
            }
         }

         var0.uNNnnnuuuN = var4;
         var0.nuUnNvnuUu = Math.max(0, var0.vVvUvVVuuNvV - var4);
         var0.VVuuUN = var0.vVvUvVVuuNvV > 0 ? (float)var0.nuUnNvnuUu / var0.vVvUvVVuuNvV : 0.0F;
         float[] var31 = new float[var3];
         int var32 = 0;
         float var7 = Float.MAX_VALUE;
         float var8 = 0.0F;

         for (VuUvvnuUu.nvnNNunvv var10 : var2) {
            if (var10 != null) {
               float var11 = (float)var10.NuunnvnN;
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
         var0.nvUVNnuu = UuUVuuUu(var33, 0.34F);
         var0.UuuNnUvUuv = UuUVuuUu(var33, 0.67F);
         if (var0.UuuNnUvUuv <= var0.nvUVNnuu) {
            var0.UuuNnUvUuv = var0.nvUVNnuu + 0.5F;
         }

         var0.uVUuuVnNVU = var7 == Float.MAX_VALUE ? 0.0F : var7;
         var0.vuuuNvNuv = var8;
         byte var34 = 20;
         var0.UnUNVVVNuv = var34;
         float[] var35 = new float[var34];
         int[] var12 = new int[var34];
         byte var13 = 21;
         var0.NVNnnvnuunNv = new int[var13];
         var0.uVunuUNVVUUV = new int[var13];
         var0.uVUVnuvnuVuv = 25.0F;
         float var14 = var0.vuuuNvNuv - var0.uVUuuVnNVU;
         if (var14 < 0.001F) {
            var14 = 1.0F;
         }

         for (VuUvvnuUu.nvnNNunvv var16 : var2) {
            if (var16 != null) {
               int var17 = UuUVuuUu(var16.NuunnvnN, var0.nvUVNnuu, var0.UuuNnUvUuv);
               var0.nUUVuvU[var17]++;
               float var18 = Math.abs(var16.UuuNnUvUuv) + Math.abs(var16.nUUVuvU);
               int var19 = class_3532.method_15340((int)(((float)var16.NuunnvnN - var0.uVUuuVnNVU) / var14 * var34), 0, var34 - 1);
               var35[var19] += var18;
               var12[var19]++;
               var0.NVNnnvnuunNv[UuUVuuUu(var16.UuuNnUvUuv, var0.uVUVnuvnuVuv, var13)]++;
               var0.uVunuUNVVUUV[UuUVuuUu(var16.nUUVuvU, var0.uVUVnuvnuVuv, var13)]++;
               if (Math.abs(var16.UuuNnUvUuv) > 8.0F) {
                  var0.NnUuNNU++;
               } else {
                  var0.nNvNUVU++;
               }
            }
         }

         var0.vNVuvnUUnuUn = new float[var34];
         float var36 = 0.0F;

         for (int var37 = 0; var37 < var34; var37++) {
            var0.vNVuvnUUnuUn[var37] = var12[var37] > 0 ? var35[var37] / var12[var37] : 0.0F;
            if (var0.vNVuvnUUnuUn[var37] > var36) {
               var36 = var0.vNVuvnUUnuUn[var37];
            }
         }

         var0.UvnvNVnnnnNU = var36;
         int var38 = 1;
         int var39 = 1;

         for (int var40 = 0; var40 < var13; var40++) {
            if (var0.NVNnnvnuunNv[var40] > var38) {
               var38 = var0.NVNnnvnuunNv[var40];
            }

            if (var0.uVunuUNVVUUV[var40] > var39) {
               var39 = var0.uVunuUNVVUUV[var40];
            }
         }

         var0.UNnVVNvvnVvU = var38;
         var0.uNnUnnuNUnNu = var39;
         float[] var41 = new float[var3];
         float[] var42 = new float[var3];

         for (int var20 = 0; var20 < var3; var20++) {
            VuUvvnuUu.nvnNNunvv var21 = (VuUvvnuUu.nvnNNunvv)var2.get(var20);
            var41[var20] = var21 == null ? 0.0F : var21.UuuNnUvUuv;
            var42[var20] = var21 == null ? 0.0F : var21.nUUVuvU;
         }

         var0.UnUNuUU = C00OOC00oO(var41, 160);
         var0.uUVuVvuNUvnu = C00OOC00oO(var42, 160);
         nNnNNuUnU var43 = nNnNNuUnU.C00OOC00oO(UUuUnNVNuuv());
         if (var43 != null && var43.UuUVuuUu(16, 2)) {
            var0.VVnVNnunVvu = true;
            var0.unNNVVNnvvV = uuvvuNvuUNVV;
            float[] var44 = new float[var3];
            float[] var22 = new float[var3];
            float[] var23 = new float[16];

            for (int var24 = 0; var24 < var3 - 1; var24++) {
               VuUvvnuUu.nvnNNunvv var25 = (VuUvvnuUu.nvnNNunvv)var2.get(var24);
               if (var25 != null) {
                  float var26 = class_3532.method_15393(var25.vVvUvVVuuNvV - var25.C00OOC00oO);
                  float var27 = var25.uNNnnnuuuN - var25.uUnuvNvvNU;
                  float var28 = 0.0F;
                  float var29 = 0.0F;
                  if (var24 >= 1) {
                     VuUvvnuUu.nvnNNunvv var30 = (VuUvvnuUu.nvnNNunvv)var2.get(var24 - 1);
                     if (var30 != null) {
                        var28 = var30.UuuNnUvUuv;
                        var29 = var30.nUUVuvU;
                     }
                  }

                  UuUVuuUu(
                     var23,
                     var26,
                     var27,
                     var25.UuuNnUvUuv,
                     var25.nUUVuvU,
                     var28,
                     var29,
                     var25.NuunnvnN,
                     var25.NVUunUNUN,
                     var25.VVnVNnunVvu,
                     var25.nVVUuvuNnUN,
                     var25.UUVNuUNUvUnV,
                     var25.nnuUVNUuvvVU,
                     var25.UnUNuUU,
                     var25.nNvNUVU,
                     var25.UuNnnVnuNNV,
                     var25.NVuNUuVnVUN
                  );
                  float[] var45 = var43.uVUuuVnNVU.UuUVuuUu(var23);
                  var44[var24] = var45[0] * 30.0F;
                  var22[var24] = var45[1] * 30.0F;
               }
            }

            var0.UvUvUNuvNU = C00OOC00oO(var44, 160);
            var0.c0oOOCcCoC0 = C00OOC00oO(var22, 160);
         }

         var0.UuUVuuUu = true;
         return var0;
      } else {
         var0.UuUVuuUu = false;
         return var0;
      }
   }

   private static float UuUVuuUu(float var0, float var1) {
      if (Math.abs(var1) < 18.0F) {
         return var0;
      } else {
         boolean var2 = Math.signum(var0) != Math.signum(var1);
         boolean var3 = Math.abs(var0) < 1.0F;
         return !var2 && !var3 ? var0 : class_3532.method_15363(var1 * 0.5F, -35.0F, 35.0F);
      }
   }

   private static float[][] UuUVuuUu(List<List<Float>> var0) {
      float[][] var1 = new float[var0.size()][];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         List var3 = (List)var0.get(var2);
         float[] var4 = new float[var3.size()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = (Float)var3.get(var5);
         }

         var1[var2] = var4;
      }

      return var1;
   }

   private static float[] C00OOC00oO(float[] var0, int var1) {
      float[] var2 = new float[var1];
      int var3 = var0.length;
      if (var3 == 0) {
         return var2;
      } else {
         for (int var4 = 0; var4 < var1; var4++) {
            int var5 = (int)((long)var4 * var3 / var1);
            if (var5 >= var3) {
               var5 = var3 - 1;
            }

            var2[var4] = var0[var5];
         }

         return var2;
      }
   }

   private static void UuUVuuUu(float var0, float var1, boolean var2) {
      uunNUuunVU[NnUVNnuvUv] = var0;
      NvnuuuvnVV[NnUVNnuvUv] = var1;
      NnUVNnuvUv = (NnUVNnuvUv + 1) % 160;
      UuuuNNunN = var2;
   }

   public static int VVuuUN() {
      return 160;
   }

   public static float[] vNUvnnVnUvu() {
      return uunNUuunVU;
   }

   public static float[] uVUuuVnNVU() {
      return NvnuuuvnVV;
   }

   public static int vuuuNvNuv() {
      return NnUVNnuvUv;
   }

   public static boolean nvUVNnuu() {
      return UuuuNNunN;
   }

   public static float[] UuuNnUvUuv() {
      return NNVNuUvVn;
   }

   public static float[] nUUVuvU() {
      return vuNnuUnu;
   }

   public static float UnUNVVVNuv() {
      return uuvvuNvuUNVV;
   }

   public static int vNVuvnUUnuUn() {
      return uVvunVUNuUvu;
   }

   public static float UvnvNVnnnnNU() {
      return NVNnnvVnvV;
   }

   public static float uVUVnuvnuVuv() {
      return vUNuuvvnVnv;
   }

   public static float NVNnnvnuunNv() {
      return unnnNUNnVu;
   }

   public static boolean uVunuUNVVUUV() {
      return unnUnUNVnN && NvUVUvVVnUu != null;
   }

   public static boolean UNnVVNvvnVvU() {
      return AttackAura.nNvNUVU.uUnuvNvvNU();
   }

   public static Path uNnUnnuNUnNu() {
      return unNNVVNnvvV().resolve("logs").resolve(UuUVuuUu(NNUUNUuVNNVn) + ".log");
   }

   private static void UuUVuuUu(String var0, boolean var1) {
      if (AttackAura.nNvNUVU.uUnuvNvvNU()) {
         long var2 = System.currentTimeMillis();
         String var4 = "[AI] " + var0;

         try {
            Path var5 = uNnUnnuNUnNu();
            Files.createDirectories(var5.getParent());
            Files.writeString(var5, var2 + " " + var4 + System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
         } catch (Throwable var6) {
         }

         if (var1 && var2 - NvnnUUuVvNU >= 1500L) {
            NvnnUUuVvNU = var2;
            vVnvuVVUunuv.UuUVuuUu(var4);
         }
      }
   }

   private static void UuUVuuUu(
      float[] var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      boolean var19,
      boolean var20,
      float var21,
      float var22
   ) {
      var0[0] = class_3532.method_15363(var1 / 180.0F, -1.0F, 1.0F);
      var0[1] = class_3532.method_15363(var2 / 90.0F, -1.0F, 1.0F);
      var0[2] = class_3532.method_15363(var3 / 30.0F, -1.0F, 1.0F);
      var0[3] = class_3532.method_15363(var4 / 30.0F, -1.0F, 1.0F);
      var0[4] = class_3532.method_15363(var5 / 30.0F, -1.0F, 1.0F);
      var0[5] = class_3532.method_15363(var6 / 30.0F, -1.0F, 1.0F);
      var0[6] = class_3532.method_15363((float)(var7 / 6.0), 0.0F, 1.5F);
      var0[7] = class_3532.method_15363((float)(var9 / 3.0), -1.0F, 1.0F);
      var0[8] = class_3532.method_15363((float)(var11 / 0.6F), 0.0F, 1.5F);
      var0[9] = class_3532.method_15363((float)(var13 / 0.6F), 0.0F, 1.5F);
      var0[10] = class_3532.method_15363((float)(var15 / 0.6F), -1.5F, 1.5F);
      var0[11] = class_3532.method_15363((float)(var17 / 0.6F), -1.5F, 1.5F);
      var0[12] = var19 ? 1.0F : 0.0F;
      var0[13] = var20 ? 1.0F : 0.0F;
      var0[14] = class_3532.method_15363(var21, 0.0F, 1.0F);
      var0[15] = class_3532.method_15363(var22 / 10.0F, 0.0F, 1.0F);
   }

   public static synchronized boolean NnUuNNU() {
      if (!nUUVuvU || vuuuNvNuv) {
         return false;
      } else if (unnUnUNVnN && NvUVUvVVnUu != null) {
         return a_.field_1724 != null && a_.field_1724.method_7261(0.0F) >= 0.9F;
      } else if (UUVNuUNUvUnV == null) {
         return false;
      } else {
         return uUVuVvuNUvnu == 0 ? a_.field_1724 != null && a_.field_1724.method_7261(0.0F) >= 0.92F : vNVuvnUUnuUn && System.currentTimeMillis() >= UnUNuUU;
      }
   }

   public static synchronized void nNvNUVU() {
      uNnUnnuNUnNu = 0;
      NnUuNNU = Integer.MIN_VALUE;
      vNVuvnUUnuUn = false;
      nNvNUVU = 0L;
      UnUNuUU = 0L;
      UUVNuUNUvUnV = null;
      uUVVvVVNvvn();
      nNnVnUNVV();
   }

   private static void uUVVvVVNvvn() {
      VUUnuVvVu = 0.0F;
      VvVuvUvvNNVv = 0.0F;
      UnnNNvuvvUU = 0.0F;
      VNNnnVUuvv = 0.0F;
      vUvUvUNNuNvn = 0.0F;
      uuVuUuuVVNvN = 0.0F;
      VvuUUUNNNv = 0;
      uuuVnuvnnNnU = 0.0F;
      nNunUnVN = 0.0F;

      for (int var0 = 0; var0 < VnVuuvVvnNv.length; var0++) {
         VnVuuvVvnNv[var0] = 0;
      }
   }

   public static synchronized void UnUNuUU() {
      if (vuuuNvNuv && vNUvnnVnUvu.nuUnNvnuUu != null && !vNUvnnVnUvu.nuUnNvnuUu.isEmpty()) {
         NVuunNnvvvVu();
      }

      vuuuNvNuv = false;
      nUUVuvU = false;
   }

   public static boolean uUVuVvuNUvnu() {
      return vuuuNvNuv;
   }

   public static boolean UvUvUNuvNU() {
      return nUUVuvU;
   }

   public static VnUNuvv c0oOOCcCoC0() {
      return nuUnNvnuUu.get();
   }

   public static String VVnVNnunVvu() {
      return nuUnNvnuUu.get().text();
   }

   public static void UuUVuuUu(Consumer<VnUNuvv> var0) {
      if (var0 != null) {
         VVuuUN.add(var0);
         var0.accept(nuUnNvnuUu.get());
      }
   }

   public static void C00OOC00oO(Consumer<VnUNuvv> var0) {
      VVuuUN.remove(var0);
   }

   public static Path unNNVVNnvvV() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu.toPath().resolve("AI")
         : a_.field_1697.toPath().resolve("Wild").resolve("AI");
   }

   private static class_243 UuUVuuUu(class_1309 var0, float var1, float var2) {
      class_243 var3 = a_.field_1724.method_33571();
      class_243 var4 = VuUVUvnU.UuUVuuUu(var2, var1);
      class_238 var5 = var0.method_5829();
      Optional var6 = var5.method_1014(0.05).method_992(var3, var3.method_1019(var4.method_1021(8.0)));
      if (var6.isPresent()) {
         return UuUVuuUu(var5, (class_243)var6.get());
      } else {
         class_243 var7 = var5.method_1005();
         double var8 = Math.max(0.1, var7.method_1020(var3).method_1026(var4));
         class_243 var10 = var3.method_1019(var4.method_1021(var8));
         return UuUVuuUu(var5, var10);
      }
   }

   private static class_243 UuUVuuUu(class_1309 var0, VuUvvnuUu.nvnNNunvv var1) {
      class_238 var2 = var0.method_5829();
      double var3;
      double var5;
      double var7;
      if (var1.nvUVNnuu) {
         var3 = UuUVuuUu(var1.vNUvnnVnUvu, 0.14);
         var5 = UuUVuuUu(var1.uVUuuVnNVU, 0.08);
         var7 = UuUVuuUu(var1.vuuuNvNuv, 0.14);
      } else {
         var3 = 0.5;
         var5 = class_3532.method_15350(0.5 + var1.VVuuUN / 180.0, 0.25, 0.75);
         var7 = 0.5;
      }

      class_243 var9 = vVvUvVVuuNvV(var0);
      double var10 = class_3532.method_15350(a_.field_1724.method_5739(var0) / 4.0, 0.25, 0.85);
      var3 += var9.field_1352 * var10 / Math.max(0.01, var2.method_17939());
      var5 += var9.field_1351 * var10 / Math.max(0.01, var2.method_17940());
      var7 += var9.field_1350 * var10 / Math.max(0.01, var2.method_17941());
      var3 = UuUVuuUu(var3, 0.14);
      var5 = UuUVuuUu(var5, 0.08);
      var7 = UuUVuuUu(var7, 0.14);
      return new class_243(
         class_3532.method_16436(var3, var2.field_1323, var2.field_1320),
         class_3532.method_16436(var5, var2.field_1322, var2.field_1325),
         class_3532.method_16436(var7, var2.field_1321, var2.field_1324)
      );
   }

   private static uuUuvNuNVNVU UuUVuuUu(class_243 var0) {
      if (var0 != null && a_.field_1724 != null) {
         class_243 var1 = var0.method_1020(a_.field_1724.method_33571());
         if (var1.method_1027() < 1.0E-8) {
            return null;
         } else {
            float var2 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
            float var3 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var1.field_1351, Math.hypot(var1.field_1352, var1.field_1350))), -90.0, 90.0);
            return new uuUuvNuNVNVU(var2, var3);
         }
      } else {
         return null;
      }
   }

   private static class_243 UuUVuuUu(class_238 var0, class_243 var1) {
      return new class_243(
         UuUVuuUu(var1.field_1352, var0.field_1323, var0.field_1320, 0.14),
         UuUVuuUu(var1.field_1351, var0.field_1322, var0.field_1325, 0.08),
         UuUVuuUu(var1.field_1350, var0.field_1321, var0.field_1324, 0.14)
      );
   }

   private static double UuUVuuUu(double var0, double var2, double var4, double var6) {
      double var8 = var4 - var2;
      if (var8 <= 1.0E-6) {
         return var2;
      } else {
         double var10 = var8 * var6;
         return class_3532.method_15350(var0, var2 + var10, var4 - var10);
      }
   }

   private static double C00OOC00oO(double var0, double var2, double var4, double var6) {
      double var8 = var4 - var2;
      return var8 <= 1.0E-6 ? 0.5 : UuUVuuUu((var0 - var2) / var8, var6);
   }

   private static double UuUVuuUu(double var0, double var2) {
      return class_3532.method_15350(var0, var2, 1.0 - var2);
   }

   private static class_243 vVvUvVVuuNvV(class_1309 var0) {
      class_243 var1 = var0.method_18798();
      class_243 var2 = new class_243(var0.method_23317() - var0.field_6014, var0.method_23318() - var0.field_6036, var0.method_23321() - var0.field_5969);
      return var2.method_1027() > var1.method_1027() ? var2 : var1;
   }

   private static boolean C00OOC00oO(float var0, float var1) {
      return Math.abs(var0) > 0.02F && Math.abs(var1) > 0.02F && Math.signum(var0) != Math.signum(var1);
   }

   private static float C00OOC00oO(float var0, boolean var1) {
      float var2 = Math.abs(var0);
      return var1 ? 0.0F : var2;
   }

   private static long UuUVuuUu(VuUvvnuUu.nvnNNunvv var0) {
      if (var0.vvUVNVvvNUv > 0L) {
         return var0.vvUVNVvvNUv;
      } else {
         return var0.uUVVvVVNvvn > 0 ? var0.uUVVvVVNvvn * 50L : 0L;
      }
   }

   private static Path vvUVNVvvNUv() {
      return unNNVVNnvvV().resolve("profiles");
   }

   private static Path UuNnnVnuNNV() {
      return vvUVNVvvNUv().resolve(UuUVuuUu(NNUUNUuVNNVn) + ".json");
   }

   private static Path uUVvnUuNvvN() {
      return unNNVVNnvvV().resolve("models");
   }

   private static Path UUuUnNVNuuv() {
      return uUVvnUuNvvN().resolve(UuUVuuUu(NNUUNUuVNNVn) + ".json");
   }

   public static boolean NuunnvnN() {
      return Files.isRegularFile(UUuUnNVNuuv());
   }

   public static boolean NVUunUNUN() {
      return NnuUnUNnu;
   }

   private static Path NVuNUuVnVUN() {
      return unNNVVNnvvV().resolve("rotation_pattern.json");
   }

   static String UuUVuuUu(String var0) {
      String var1 = var0 != null && !var0.isBlank() ? var0.trim() : "default";
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

   private static String uUnuvNvvNU(String var0) {
      return var0 != null && var0.endsWith(".json") ? var0.substring(0, var0.length() - 5) : var0;
   }

   public static String UUVNuUNUvUnV() {
      return NNUUNUuVNNVn;
   }

   public static synchronized String C00OOC00oO(String var0) {
      if (vuuuNvNuv) {
         return "Нельзя менять профиль во время записи (.ai stop сначала).";
      } else {
         NNUUNUuVNNVn = UuUVuuUu(var0);
         vVvUvVVuuNvV("AI profile: " + NNUUNUuVNNVn);
         return "Активный профиль: " + NNUUNUuVNNVn;
      }
   }

   public static List<String> vuvnUnVnUNnV() {
      ArrayList var0 = new ArrayList();

      try {
         Path var1 = vvUVNVvvNUv();
         if (Files.isDirectory(var1)) {
            try (Stream var2 = Files.list(var1)) {
               var2.filter(var0x -> Files.isRegularFile(var0x) && var0x.getFileName().toString().endsWith(".json"))
                  .forEach(var1x -> var0.add(uUnuvNvvNU(var1x.getFileName().toString())));
            }
         }
      } catch (Throwable var7) {
      }

      var0.sort(String::compareToIgnoreCase);
      return var0;
   }

   public static synchronized String nnuUVNUuvvVU() {
      List var0 = vuvnUnVnUNnV();
      return var0.isEmpty()
         ? "Профили не найдены. Активный: " + NNUUNUuVNNVn
         : "Профили (" + var0.size() + "): " + String.join(", ", var0) + " | активный: " + NNUUNUuVNNVn;
   }

   private static boolean NVuunNnvvvVu() {
      try {
         UuUVuuUu(vNUvnnVnUvu);
         Path var0 = UuNnnVnuNNV();
         Files.createDirectories(var0.getParent());

         try (BufferedWriter var1 = Files.newBufferedWriter(var0, StandardCharsets.UTF_8)) {
            uNNnnnuuuN.toJson(vNUvnnVnUvu, var1);
         }

         return true;
      } catch (Throwable var6) {
         return false;
      }
   }

   private static VuUvvnuUu.NVnVnNnN vNnNuuvVn() {
      try {
         Path var0 = UuNnnVnuNNV();
         if (!Files.isRegularFile(var0)) {
            Path var1 = NVuNUuVnVUN();
            if (!"default".equals(UuUVuuUu(NNUUNUuVNNVn)) || !Files.isRegularFile(var1)) {
               return null;
            }

            var0 = var1;
         }

         VuUvvnuUu.NVnVnNnN var2;
         try (BufferedReader var7 = Files.newBufferedReader(var0, StandardCharsets.UTF_8)) {
            var2 = (VuUvvnuUu.NVnVnNnN)uNNnnnuuuN.fromJson(var7, VuUvvnuUu.NVnVnNnN.class);
         }

         return var2;
      } catch (Throwable var6) {
         return null;
      }
   }

   private static void UuUVuuUu(VuUvvnuUu.NVnVnNnN var0) {
      int var1 = var0.UuUVuuUu;
      var0.UuUVuuUu = 3;
      if (var0.nuUnNvnuUu == null) {
         var0.nuUnNvnuUu = new ArrayList<>();
      }

      if (var1 < 2) {
         for (VuUvvnuUu.nvnNNunvv var3 : var0.nuUnNvnuUu) {
            if (var3 != null) {
               var3.nvUVNnuu = false;
            }
         }
      }

      if (var1 < 3) {
         float var8 = 0.0F;
         float var9 = 0.0F;
         double var4 = 0.0;

         for (VuUvvnuUu.nvnNNunvv var7 : var0.nuUnNvnuUu) {
            if (var7 != null) {
               var7.UnUNVVVNuv = var7.UuuNnUvUuv - var8;
               var7.vNVuvnUUnuUn = var7.nUUVuvU - var9;
               var7.unNNVVNnvvV = var7.UvUvUNuvNU - var4;
               var7.UvnvNVnnnnNU = C00OOC00oO(var8, var7.UuuNnUvUuv);
               var7.uVUVnuvnuVuv = C00OOC00oO(var9, var7.nUUVuvU);
               var7.NVNnnvnuunNv = Math.abs(var7.UuuNnUvUuv) < 0.035F && Math.abs(var7.nUUVuvU) < 0.035F;
               if (var7.vvUVNVvvNUv <= 0L && var7.uUVVvVVNvvn > 0) {
                  var7.vvUVNVvvNUv = var7.uUVVvVVNvvn * 50L;
               }

               var8 = var7.UuuNnUvUuv;
               var9 = var7.nUUVuvU;
               var4 = var7.UvUvUNuvNU;
            }
         }
      }

      var0.uUnuvNvvNU = var0.nuUnNvnuUu.size();
      var0.vVvUvVVuuNvV = C00OOC00oO(var0.nuUnNvnuUu);
   }

   private static int C00OOC00oO(List<VuUvvnuUu.nvnNNunvv> var0) {
      int var1 = 0;
      if (var0 != null) {
         for (VuUvvnuUu.nvnNNunvv var3 : var0) {
            if (var3 != null && var3.nNnVnUNVV) {
               var1++;
            }
         }
      }

      return var1;
   }

   private static void vVvUvVVuuNvV(String var0) {
      long var1 = vNUvnnVnUvu.nuUnNvnuUu == null ? 0L : vNUvnnVnUvu.nuUnNvnuUu.size();
      VnUNuvv var3 = new VnUNuvv(var0, vuuuNvNuv, NnuUnUNnu, var1, UvUvUNuvNU, 0L, System.currentTimeMillis());
      nuUnNvnuUu.set(var3);

      for (Consumer var5 : VVuuUN) {
         try {
            var5.accept(var3);
         } catch (Throwable var7) {
         }
      }
   }

   static final class NVnVnNnN {
      int UuUVuuUu = 3;
      long C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
      float uNNnnnuuuN;
      List<VuUvvnuUu.nvnNNunvv> nuUnNvnuUu = new ArrayList<>();
   }

   static final class nvnNNunvv {
      int UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      double vNUvnnVnUvu;
      double uVUuuVnNVU;
      double vuuuNvNuv;
      boolean nvUVNnuu;
      float UuuNnUvUuv;
      float nUUVuvU;
      float UnUNVVVNuv;
      float vNVuvnUUnuUn;
      boolean UvnvNVnnnnNU;
      boolean uVUVnuvnuVuv;
      boolean NVNnnvnuunNv;
      float uVunuUNVVUUV;
      float UNnVVNvvnVvU;
      boolean uNnUnnuNUnNu;
      boolean NnUuNNU;
      boolean nNvNUVU;
      boolean UnUNuUU;
      double uUVuVvuNUvnu;
      double UvUvUNuvNU;
      double c0oOOCcCoC0;
      double VVnVNnunVvu;
      double unNNVVNnvvV;
      double NuunnvnN;
      double NVUunUNUN;
      double UUVNuUNUvUnV;
      double vuvnUnVnUNnV;
      double nnuUVNUuvvVU;
      double nVVUuvuNnUN;
      boolean nNnVnUNVV;
      boolean nuunNvv;
      int uUVVvVVNvvn;
      long vvUVNVvvNUv;
      float UuNnnVnuNNV;
      boolean uUVvnUuNvvN;
      float UUuUnNVNuuv;
      int NVuNUuVnVUN;
   }
}
