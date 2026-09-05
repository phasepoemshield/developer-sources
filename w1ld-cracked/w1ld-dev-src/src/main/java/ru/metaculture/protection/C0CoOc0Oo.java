package ru.metaculture.protection;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.util.Locale;
import net.minecraft.class_310;
import net.minecraft.class_640;

public final class C0CoOc0Oo {
   private static final String UuUVuuUu = "Диагностика Wild Core";
   private static final String C00OOC00oO = "рендер, шейдеры, GL и локальные слепки";
   private static final String uUnuvNvvNU = "Слепок";
   private static final String vVvUvVVuuNvV = "Папка";
   private static final String uNNnnnuuuN = "Логи";
   private static final String nuUnNvnuUu = "Состояние";
   private static final String VVuuUN = "Tracker ID";
   private static final String vNUvnnVnUvu = "Code";
   private static final String uVUuuVnNVU = "Очередь";
   private static final String vuuuNvNuv = "Ошибки";
   private static final String nvUVNnuu = "CFI chain";
   private static final String UuuNnUvUuv = "Текстурные Юниты";
   private static final String nUUVuvU = "Матрицы";
   private static final String UnUNVVVNuv = "Frames";
   private static final String vNVuvnUUnuUn = "Anomalies";
   private static final String UvnvNVnnnnNU = "Что сейчас ломается";
   private static final String uVUVnuvnuVuv = "Файл слепка";
   private static final String NVNnnvnuunNv = "Mixin policy";
   private static final String uVunuUNVVUUV = "Privacy";
   private static final String UNnVVNvvnVvU = "Гайдлайн";
   private static final String uNnUnnuNUnNu = "1 смотри Code/Stage";
   private static final String NnUuNNU = "2 жми Слепок";
   private static final String nNvNUVU = "3 открой Логи";
   private static final String UnUNuUU = "4 передай Tracker ID";
   private static final String uUVuVvuNUvnu = "Шейдерных исключений нет";
   private static final String UvUvUNuvNU = "Нажми Логи, чтобы загрузить latest.log";
   private static final String c0oOOCcCoC0 = "Встроенный viewer";
   private static final String VVnVNnunVvu = "latest.log tail";
   private static final String unNNVVNnvvV = "Буфер событий";
   private static final String NuunnvnN = "Core Load";
   private static final String NVUunUNUN = "Render TPS";
   private static final String UUVNuUNUvUnV = "Latency";
   private static final float vuvnUnVnUNnV = 44.0F;
   private static final float nnuUVNUuvvVU = 10.0F;
   private static final Cc0cOoOcC0o nVVUuvuNnUN = Cc0cOoOcC0o.UuuNnUvUuv();
   private final UnUnVNnvnV nNnVnUNVV = new UnUnVNnvnV();
   private final C0CoOc0Oo.NVnVnNnN nuunNvv = new C0CoOc0Oo.NVnVnNnN();
   private final nnUNUvNvVNn uUVVvVVNvvn = new nnUNUvNvVNn(0.0F);
   private long vvUVNVvvNUv = Long.MIN_VALUE;
   private static float UuNnnVnuNNV;
   private static float uUVvnUuNvvN;
   private static float UUuUnNVNuuv;
   private static float NVuNUuVnVUN;
   private static float NVuunNnvvvVu;
   private static float vNnNuuvVn;
   private static float VUuuVUnun;
   private static float vVVuuVVv;

   public static float UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(nUUVuvU(var0, var1) + vNVuvnUUnuUn(var0, var1) - UuUVuuUu(var1) - C00OOC00oO(var1) - uUnuvNvvNU(var1) - var1.UuUVuuUu(16.0F));
   }

   public static float C00OOC00oO(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(nUUVuvU(var0, var1) + vNVuvnUUnuUn(var0, var1) - C00OOC00oO(var1) - uUnuvNvvNU(var1) - var1.UuUVuuUu(8.0F));
   }

   public static float uUnuvNvvNU(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(nUUVuvU(var0, var1) + vNVuvnUUnuUn(var0, var1) - uUnuvNvvNU(var1));
   }

   public static float vVvUvVVuuNvV(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(UnUNVVVNuv(var0, var1) + var1.UuUVuuUu(3.0F));
   }

   public static float UuUVuuUu(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(94.0F);
   }

   public static float C00OOC00oO(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(78.0F);
   }

   public static float uUnuvNvvNU(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(68.0F);
   }

   public static float vVvUvVVuuNvV(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(24.0F);
   }

   public static boolean UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3) {
      return nunvNNUnvU.UuUVuuUu(var2, var3, uNNnnnuuuN(var0, var1), nuUnNvnuUu(var0, var1), VVuuUN(var0, var1), vNUvnnVnUvu(var0, var1));
   }

   public static boolean C00OOC00oO(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3) {
      if (!(VUuuVUnun <= 0.5F) && !(UUuUnNVNuuv <= 1.0F) && !(NVuNUuVnVUN <= 1.0F)) {
         float var4 = uNNnnnuuuN(var1);
         float var5 = Math.round(uUVvnUuNvvN + NVuNUuVnVUN - var4);
         return nunvNNUnvU.UuUVuuUu(var2, var3, UuNnnVnuNNV, var5 - var1.UuUVuuUu(4.0F), UUuUnNVNuuv, var1.UuUVuuUu(12.0F));
      } else {
         return false;
      }
   }

   public static boolean uUnuvNvvNU(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3) {
      if (!(vVVuuVVv <= 0.5F) && !(UUuUnNVNuuv <= 1.0F) && !(NVuNUuVnVUN <= 1.0F)) {
         float var4 = uNNnnnuuuN(var1);
         float var5 = Math.round(UuNnnVnuNNV + UUuUnNVNuuv - var4);
         return nunvNNUnvU.UuUVuuUu(var2, var3, var5 - var1.UuUVuuUu(4.0F), uUVvnUuNvvN, var1.UuUVuuUu(12.0F), NVuNUuVnVUN);
      } else {
         return false;
      }
   }

   public static float UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2) {
      float var3 = nuUnNvnuUu(var1);
      float var4 = Math.max(1.0F, UUuUnNVNuuv - var3);
      return UuUVuuUu((var2 - UuNnnVnuNNV - var3 * 0.5F) / var4);
   }

   public static float C00OOC00oO(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2) {
      float var3 = VVuuUN(var1);
      float var4 = Math.max(1.0F, NVuNUuVnVUN - var3);
      return UuUVuuUu((var2 - uUVvnUuNvvN - var3 * 0.5F) / var4);
   }

   private static float uNNnnnuuuN(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      float var2 = nUUVuvU(var0, var1);
      float var3 = vNVuvnUUnuUn(var0, var1);
      float var4 = UuUVuuUu(var3, var1);
      return Math.round(var2 + var4 + var1.UuUVuuUu(10.0F));
   }

   private static float nuUnNvnuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      float var2 = UnUNVVVNuv(var0, var1);
      float var3 = UvnvNVnnnnNU(var0, var1);
      float var4 = Math.round(var2 + var1.UuUVuuUu(44.0F));
      float var5 = Math.round(var3 - var1.UuUVuuUu(44.0F));
      float var6 = C00OOC00oO(var5, var1);
      return Math.round(var4 + var6 + var1.UuUVuuUu(8.0F));
   }

   private static float VVuuUN(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      float var2 = vNVuvnUUnuUn(var0, var1);
      float var3 = UuUVuuUu(var2, var1);
      return Math.round(var2 - var3 - var1.UuUVuuUu(10.0F));
   }

   private static float vNUvnnVnUvu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      float var2 = UvnvNVnnnnNU(var0, var1);
      float var3 = Math.round(var2 - var1.UuUVuuUu(44.0F));
      float var4 = C00OOC00oO(var3, var1);
      return Math.max(var1.UuUVuuUu(24.0F), var3 - var4 - var1.UuUVuuUu(8.0F));
   }

   private static float uVUuuVnNVU(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(uNNnnnuuuN(var0, var1) + var1.UuUVuuUu(10.0F));
   }

   private static float vuuuNvNuv(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(nuUnNvnuUu(var0, var1) + var1.UuUVuuUu(30.0F));
   }

   private static float nvUVNnuu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(VVuuUN(var0, var1) - var1.UuUVuuUu(20.0F));
   }

   private static float UuuNnUvUuv(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.max(var1.UuUVuuUu(24.0F), vNUvnnVnUvu(var0, var1) - var1.UuUVuuUu(38.0F));
   }

   private static float UuUVuuUu(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float UuUVuuUu(float var0, nUvnuVnNUU var1) {
      return Math.round(UuUVuuUu(var0 * 0.265F, var1.UuUVuuUu(150.0F), var1.UuUVuuUu(182.0F)));
   }

   private static float C00OOC00oO(float var0, nUvnuVnNUU var1) {
      return Math.round(UuUVuuUu(var0 * 0.31F, var1.UuUVuuUu(104.0F), var1.UuUVuuUu(124.0F)));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      vVnvuVuVvnun.UuUVuuUu().UuUVuuUu(this.nNnVnUNVV);
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      long var7 = var2.nvuVvuNnNUnv();
      if (var7 != this.vvUVNVvvNUv) {
         this.vvUVNVvvNUv = var7;
         this.UuUVuuUu();
      }

      this.nuunNvv.C00OOC00oO();
      float var9 = var2.UuUVuuUu(vnvnUnVnuunn.uVUuuVnNVU());
      if (!(var9 <= 0.001F)) {
         float var10 = nUUVuvU(var3, var5);
         float var11 = UnUNVVVNuv(var3, var5);
         float var12 = vNVuvnUUnuUn(var3, var5);
         float var13 = UvnvNVnnnnNU(var3, var5);
         var1.uNNnnnuuuN(var9);

         try {
            this.UuUVuuUu(var1, var5, var6, var10, var11, var12, var9);
            float var14 = Math.round(var11 + var5.UuUVuuUu(44.0F));
            float var15 = Math.round(var13 - var5.UuUVuuUu(44.0F));
            float var16 = UuUVuuUu(var12, var5);
            this.uUnuvNvvNU(var1, var5, var6, var10, var14, var16, var15);
            float var17 = Math.round(var10 + var16 + var5.UuUVuuUu(10.0F));
            float var18 = Math.round(var12 - var16 - var5.UuUVuuUu(10.0F));
            float var19 = this.nNnVnUNVV.NuunnvnN ? 1.0F : 0.0F;
            float var20 = UuUVuuUu(var2.UuUVuuUu(vnvnUnVnuunn.vuuuNvNuv(), var19, var19 > 0.0F ? Cc0cOoOcC0o.UuuNnUvUuv() : Cc0cOoOcC0o.vNVuvnUUnuUn()));
            float var21 = C00OOC00oO(var20);
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var17, var14, var18, var15, var5.UuUVuuUu(9.0F), var5.UuUVuuUu(9.0F), var5.UuUVuuUu(9.0F), var5.UuUVuuUu(9.0F));

            try {
               if (var21 < 0.999F) {
                  var1.uNNnnnuuuN(1.0F - var21);
                  var1.UuUVuuUu(-var5.UuUVuuUu(14.0F) * var21, 0.0F);
                  var1.UuUVuuUu(1.0F - var21 * 0.018F, var17 + var18 * 0.5F, var14 + var15 * 0.5F);

                  try {
                     this.vVvUvVVuuNvV(var1, var5, var6, var17, var14, var18, var15);
                  } finally {
                     var1.uVUuuVnNVU();
                     var1.vNUvnnVnUvu();
                     var1.vuuuNvNuv();
                  }
               }

               if (var21 > 0.001F) {
                  var1.uNNnnnuuuN(var21);
                  var1.UuUVuuUu(var5.UuUVuuUu(18.0F) * (1.0F - var21), var5.UuUVuuUu(5.0F) * (1.0F - var21));
                  var1.UuUVuuUu(0.982F + var21 * 0.018F, var17 + var18 * 0.5F, var14 + var15 * 0.5F);
                  boolean var38 = false /* VF: Semaphore variable */;

                  try {
                     var38 = true;
                     this.UuUVuuUu(var1, var2, var5, var6, var17, var14, var18, var15);
                     var38 = false;
                  } finally {
                     if (var38) {
                        var1.uVUuuVnNVU();
                        var1.vNUvnnVnUvu();
                        var1.vuuuNvNuv();
                     }
                  }

                  var1.uVUuuVnNVU();
                  var1.vNUvnnVnUvu();
                  var1.vuuuNvNuv();
               }
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }

            if (var21 <= 0.001F) {
               uUnuvNvvNU();
            }
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   private void UuUVuuUu() {
      this.nuunNvv.UuUVuuUu();
      this.uUVVvVVNvvn.UuUVuuUu(0.0F);
      uUnuvNvvNU();
      vVnvuVuVvnun.UuUVuuUu().vNVuvnUUnuUn();
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7) {
      float var8 = var2.UuUVuuUu(32.0F);
      this.C00OOC00oO(var1, var2, var3, var4, var5, var8, var7);
      float var9 = var4 + var8 + var2.UuUVuuUu(11.0F);
      if (!var3.uNnUnnuNUnNu()) {
         var1.vVvUvVVuuNvV();

         try {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var2,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9,
               var5 - var2.UuUVuuUu(1.0F),
               var2.UuUVuuUu(17.0F),
               13.0F,
               "Диагностика Wild Core",
               NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 40)
            );
         } finally {
            var1.uNNnnnuuuN();
         }
      }

      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var9,
         var5 - var2.UuUVuuUu(1.0F),
         var2.UuUVuuUu(17.0F),
         13.0F,
         "Диагностика Wild Core",
         nunvNNUnvU.UuUVuuUu(var3)
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var9,
         var5 + var2.UuUVuuUu(16.0F),
         var2.UuUVuuUu(14.0F),
         9.0F,
         "рендер, шейдеры, GL и локальные слепки",
         nunvNNUnvU.C00OOC00oO(var3)
      );
      this.UuUVuuUu(var1, var2, var3, UuUVuuUu(var2, var4, var6), var5 + var2.UuUVuuUu(3.0F), UuUVuuUu(var2), "Слепок", var3.uVunuUNVVUUV(), false, 0);
      this.UuUVuuUu(var1, var2, var3, C00OOC00oO(var2, var4, var6), var5 + var2.UuUVuuUu(3.0F), C00OOC00oO(var2), "Папка", var3.UNnVVNvvnVvU(), false, 1);
      this.UuUVuuUu(
         var1, var2, var3, uUnuvNvvNU(var2, var4, var6), var5 + var2.UuUVuuUu(3.0F), uUnuvNvvNU(var2), "Логи", var3.uVunuUNVVUUV(), this.nNnVnUNVV.NuunnvnN, 2
      );
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7) {
      var1.uUnuvNvvNU();
      occc0oc00ooO.UuUVuuUu(Math.round(var4), Math.round(var5), Math.round(var6), var3.uVunuUNVVUUV(), var3.UNnVVNvvnVvU(), UuUVuuUu(var7), var3.uNnUnnuNUnNu());
      float var8 = 0.5F + 0.5F * (float)Math.sin((float)System.currentTimeMillis() * 0.00108F);
      float var9 = 15.0F;
      float var10 = var9 * (1.08F + var8 * 0.04F);
      float var11 = var4 + var6 * 0.5F;
      float var12 = var5 + var6 * 0.5F;
      float var13 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vNUvnnVnUvu, "w", var9);
      float var14 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vNUvnnVnUvu, "w", var10);
      float var15 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vNUvnnVnUvu, var9);
      float var16 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vNUvnnVnUvu, var10);
      float var17 = var12 - var15 * 0.5F - var2.UuUVuuUu(1.0F);
      float var18 = var12 - var16 * 0.5F - var2.UuUVuuUu(1.0F);
      if (!var3.uNnUnnuNUnNu()) {
         var1.vVvUvVVuuNvV();

         try {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var2,
               vNvnnVvvVUu.vNUvnnVnUvu,
               var11 - var14 * 0.5F,
               var18,
               var10,
               "w",
               NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 110), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 130), var8)
            );
         } finally {
            var1.uNNnnnuuuN();
         }
      }

      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vNUvnnVnUvu, var11 - var13 * 0.5F, var17, var9, "w", NUunUunuNV.UuUVuuUu(nunvNNUnvU.vVvUvVVuuNvV(var3), 246));
   }

   private void uUnuvNvvNU(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7) {
      float var8 = var2.UuUVuuUu(10.0F);
      int var9 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.35F) : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), var3.vuuuNvNuv(), 0.36F);
      var1.UuUVuuUu(var4, var5, var6, var7, var8, var9);
      var1.UuUVuuUu(var4, var5, var6, var7, var8, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 92 : 20), Math.max(0.6F, var2.UuUVuuUu(0.65F)));
      float var10 = var2.UuUVuuUu(9.0F);
      float var11 = var2.UuUVuuUu(4.0F);
      float var12 = var2.UuUVuuUu(35.0F);
      float var13 = Math.max(var2.UuUVuuUu(180.0F), var7 - var10 * 2.0F - var12 - var11 * 4.0F);
      float var14 = var13 / 5.0F;
      float var15 = var5 + var10;
      String var16 = this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? "Nominal" : "Anomaly";
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4 + var10,
         var15,
         var6 - var10 * 2.0F,
         var14,
         "Состояние",
         var16,
         this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? var3.uVunuUNVVUUV() : var3.C00OOC00oO()
      );
      var15 += var14 + var11;
      this.UuUVuuUu(var1, var2, var3, var4 + var10, var15, var6 - var10 * 2.0F, var14, "Tracker ID", this.nNnVnUNVV.vVvUvVVuuNvV, nunvNNUnvU.UuUVuuUu(var3));
      var15 += var14 + var11;
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4 + var10,
         var15,
         var6 - var10 * 2.0F,
         var14,
         "Code",
         this.nNnVnUNVV.uNNnnnuuuN,
         this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? nunvNNUnvU.C00OOC00oO(var3) : var3.C00OOC00oO()
      );
      var15 += var14 + var11;
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4 + var10,
         var15,
         var6 - var10 * 2.0F,
         var14,
         "Ошибки",
         this.nNnVnUNVV.NVNnnvnuunNv,
         "0".equals(this.nNnVnUNVV.NVNnnvnuunNv) ? nunvNNUnvU.C00OOC00oO(var3) : var3.C00OOC00oO()
      );
      var15 += var14 + var11;
      this.UuUVuuUu(var1, var2, var3, var4 + var10, var15, var6 - var10 * 2.0F, var14, "Очередь", this.nNnVnUNVV.UuuNnUvUuv, nunvNNUnvU.UuUVuuUu(var3));
      float var17 = Math.round(var5 + var7 - var10 - var12 + var2.UuUVuuUu(14.0F));
      float var18 = Math.round(var4 + var10);
      float var19 = Math.round(var6 - var10 * 2.0F);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var18, var17, var2.UuUVuuUu(13.0F), 9.5F, "Буфер событий", nunvNNUnvU.UuUVuuUu(var3));
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var18 + var19 - var2.UuUVuuUu(28.0F),
         var17,
         var2.UuUVuuUu(13.0F),
         8.5F,
         this.nNnVnUNVV.UvUvUNuvNU + "/32",
         nunvNNUnvU.C00OOC00oO(var3)
      );
      float var20 = Math.round(var17 + var2.UuUVuuUu(18.0F));
      float var21 = Math.min(1.0F, this.nNnVnUNVV.UvUvUNuvNU / 32.0F);
      var1.UuUVuuUu(var18, var20, var19, var2.UuUVuuUu(5.0F), var2.UuUVuuUu(2.5F), var3.nvUVNnuu());
      var1.UuUVuuUu(var18, var20, var19 * var21, var2.UuUVuuUu(5.0F), var2.UuUVuuUu(2.5F), var3.uVunuUNVVUUV(), var3.UNnVVNvvnVvU());
   }

   private void vVvUvVVuuNvV(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7) {
      float var8 = var2.UuUVuuUu(8.0F);
      float var9 = var2.UuUVuuUu(9.0F);
      float var10 = UuUVuuUu(var7 * 0.22F, var2.UuUVuuUu(78.0F), var2.UuUVuuUu(96.0F));
      float var11 = Math.round((var6 - var8 * 2.0F) / 3.0F);
      float var12 = UuUVuuUu(this.uUVVvVVNvvn.UuUVuuUu(1.0F, nVVUuvuNnUN));
      int var13 = this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? var3.uVunuUNVVUUV() : var3.C00OOC00oO();
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4,
         var5,
         var11,
         var10,
         var9,
         "Core Load",
         this.nuunNvv.nuUnNvnuUu(),
         "CFI chain  " + this.nNnVnUNVV.uUnuvNvvNU,
         var3.uVunuUNVVUUV(),
         this.nuunNvv.uUnuvNvvNU,
         this.nuunNvv.uUnuvNvvNU(),
         C00OOC00oO(var12, 0.0F, 0.78F)
      );
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4 + var11 + var8,
         var5,
         var11,
         var10,
         var9,
         "Render TPS",
         this.nuunNvv.VVuuUN(),
         "Frames  " + this.nNnVnUNVV.NnUuNNU,
         var3.UNnVVNvvnVvU(),
         this.nuunNvv.vVvUvVVuuNvV,
         this.nuunNvv.vVvUvVVuuNvV(),
         C00OOC00oO(var12, 0.12F, 0.9F)
      );
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4 + (var11 + var8) * 2.0F,
         var5,
         var6 - var11 * 2.0F - var8 * 2.0F,
         var10,
         var9,
         "Latency",
         this.nuunNvv.vNUvnnVnUvu(),
         "Anomalies  " + this.nNnVnUNVV.uNnUnnuNUnNu,
         var13,
         this.nuunNvv.uNNnnnuuuN,
         this.nuunNvv.uNNnnnuuuN(),
         C00OOC00oO(var12, 0.24F, 1.0F)
      );
      float var14 = Math.round(var5 + var10 + var8);
      float var15 = UuUVuuUu(var7 * 0.29F, var2.UuUVuuUu(88.0F), var2.UuUVuuUu(106.0F));
      float var16 = Math.round(var6 * 0.58F);
      this.UuUVuuUu(var1, var2, var3, var4, var14, var16, var15, var9);
      float var17 = Math.round(var4 + var16 + var8);
      float var18 = Math.round(var6 - var16 - var8);
      float var19 = Math.round((var15 - var8) * 0.5F);
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var17,
         var14,
         var18,
         var19,
         var9,
         "Текстурные Юниты",
         this.uNNnnnuuuN(),
         this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? var3.UNnVVNvvnVvU() : var3.C00OOC00oO()
      );
      this.UuUVuuUu(var1, var2, var3, var17, var14 + var19 + var8, var18, var19, var9, "Матрицы", this.vVvUvVVuuNvV(), this.UuUVuuUu(var3));
      float var20 = Math.round(var14 + var15 + var8);
      float var21 = UuUVuuUu(var7 * 0.14F, var2.UuUVuuUu(42.0F), var2.UuUVuuUu(50.0F));
      String var22 = this.nNnVnUNVV.nvUVNnuu != null && !"none".equals(this.nNnVnUNVV.nvUVNnuu) ? this.nNnVnUNVV.nvUVNnuu : this.nNnVnUNVV.uVUuuVnNVU;
      this.UuUVuuUu(var1, var2, var3, var4, var20, var6, var21, var9, "Файл слепка", var22, var3.UNnVVNvvnVvU());
      float var23 = Math.round(var20 + var21 + var8);
      float var24 = UuUVuuUu(var7 * 0.13F, var2.UuUVuuUu(40.0F), var2.UuUVuuUu(46.0F));
      this.C00OOC00oO(var1, var2, var3, var4, var23, var6, var24, var9);
      float var25 = Math.round(var23 + var24 + var8);
      this.uUnuvNvvNU(var1, var2, var3, var4, var25, var6, Math.max(var2.UuUVuuUu(46.0F), var7 - (var25 - var5)), var9);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8) {
      float var9 = var3.UuUVuuUu(8.0F);
      float var10 = var3.UuUVuuUu(9.0F);
      float var11 = C00OOC00oO(var8, var3);
      float var12 = Math.round(var7 * 0.58F);
      this.UuUVuuUu(var1, var3, var4, var5, var6, var12, var11, var10);
      float var13 = Math.round(var5 + var12 + var9);
      float var14 = Math.round(var7 - var12 - var9);
      float var15 = Math.round((var11 - var9 * 2.0F) / 3.0F);
      this.UuUVuuUu(var1, var3, var4, var13, var6, var14, var15, var10, "CFI chain", this.nNnVnUNVV.uUnuvNvvNU, var4.uVunuUNVVUUV());
      this.UuUVuuUu(
         var1,
         var3,
         var4,
         var13,
         var6 + var15 + var9,
         var14,
         var15,
         var10,
         "Текстурные Юниты",
         this.uNNnnnuuuN(),
         this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? var4.UNnVVNvvnVvU() : var4.C00OOC00oO()
      );
      this.UuUVuuUu(
         var1,
         var3,
         var4,
         var13,
         var6 + (var15 + var9) * 2.0F,
         var14,
         var11 - var15 * 2.0F - var9 * 2.0F,
         var10,
         "Матрицы",
         this.vVvUvVVuuNvV(),
         this.UuUVuuUu(var4)
      );
      float var16 = Math.round(var6 + var11 + var9);
      this.UuUVuuUu(var1, var2, var3, var4, var5, var16, var7, var8 - var11 - var9, var10);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, String var7, int var8, boolean var9, int var10) {
      float var11 = Math.round(var4);
      float var12 = Math.round(var5);
      float var13 = Math.round(var6);
      float var14 = vVvUvVVuuNvV(var2);
      float var15 = var2.UuUVuuUu(7.0F);
      float var16 = var9 ? 1.0F : 0.0F;
      int var17 = var3.uNnUnnuNUnNu()
         ? nunvNNUnvU.UuUVuuUu(var3, 0.38F + var16 * 0.34F)
         : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), NUunUunuNV.UuUVuuUu(var8, 22), 0.36F + var16 * 0.2F);
      var1.UuUVuuUu(var11, var12, var13, var14, var15, var17);
      var1.UuUVuuUu(var11, var12, var13, var14, var15, NUunUunuNV.UuUVuuUu(var8, var3.uNnUnnuNUnNu() ? 68 : 58), Math.max(0.5F, var2.UuUVuuUu(0.55F)));
      float var18 = var2.UuUVuuUu(18.0F);
      float var19 = var11 + var2.UuUVuuUu(4.0F);
      float var20 = var12 + Math.round((var14 - var18) * 0.5F);
      var1.UuUVuuUu(var19, var20, var18, var18, var2.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var8, var9 ? 68 : 38));
      this.UuUVuuUu(var1, var2, var19 + var18 * 0.5F, var20 + var18 * 0.5F, var10, var9 ? var3.NVNnnvnuunNv() : var8, var3);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var11 + var2.UuUVuuUu(28.0F), var12, var14, 9.0F, var7, nunvNNUnvU.UuUVuuUu(var3));
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, float var3, float var4, int var5, int var6, NUunUunuNV var7) {
      float var8 = var2.UuUVuuUu(1.0F);
      int var9 = NUunUunuNV.UuUVuuUu(var6, 235);
      if (var5 == 0) {
         var1.UuUVuuUu(var3 - 4.8F * var8, var4 - 4.4F * var8, 9.6F * var8, 8.8F * var8, 2.2F * var8, NUunUunuNV.UuUVuuUu(var9, 92));
         var1.UuUVuuUu(var3 - 2.8F * var8, var4 + 1.2F * var8, 1.4F * var8, 2.6F * var8, 0.7F * var8, var9);
         var1.UuUVuuUu(var3 - 0.2F * var8, var4 - 1.8F * var8, 1.4F * var8, 5.6F * var8, 0.7F * var8, var9);
         var1.UuUVuuUu(var3 + 2.4F * var8, var4 - 4.0F * var8, 1.4F * var8, 7.8F * var8, 0.7F * var8, var9);
      } else if (var5 == 1) {
         var1.UuUVuuUu(var3 - 5.2F * var8, var4 - 2.8F * var8, 10.4F * var8, 6.8F * var8, 1.8F * var8, NUunUunuNV.UuUVuuUu(var9, 108));
         var1.UuUVuuUu(var3 - 4.2F * var8, var4 - 4.4F * var8, 4.8F * var8, 2.6F * var8, 1.1F * var8, NUunUunuNV.UuUVuuUu(var9, 178));
         var1.UuUVuuUu(var3 - 2.6F * var8, var4 + 0.1F * var8, 5.2F * var8, 1.1F * var8, 0.55F * var8, var9);
      } else {
         var1.UuUVuuUu(var3 - 4.8F * var8, var4 - 4.0F * var8, 9.6F * var8, 1.3F * var8, 0.65F * var8, var9);
         var1.UuUVuuUu(var3 - 4.8F * var8, var4 - 0.6F * var8, 9.6F * var8, 1.3F * var8, 0.65F * var8, var9);
         var1.UuUVuuUu(var3 - 4.8F * var8, var4 + 2.8F * var8, 7.1F * var8, 1.3F * var8, 0.65F * var8, NUunUunuNV.UuUVuuUu(var9, 190));
         var1.C00OOC00oO(var3 + 4.5F * var8, var4 + 3.4F * var8, 1.15F * var8, 0.0F, 1.0F, var7.UNnVVNvvnVvU());
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, String var9, String var10, int var11
   ) {
      float var12 = Math.round(var4);
      float var13 = Math.round(var5);
      float var14 = Math.round(var6);
      float var15 = Math.round(var7);
      float var16 = var12 + var2.UuUVuuUu(27.0F);
      float var17 = Math.max(var2.UuUVuuUu(12.0F), var14 - var2.UuUVuuUu(37.0F));
      float var18 = var2.UuUVuuUu(11.0F);
      float var19 = var2.UuUVuuUu(12.0F);
      float var20 = Math.round(var13 + var2.UuUVuuUu(18.0F));
      int var21 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.18F) : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), NUunUunuNV.UuUVuuUu(var11, 10), 0.16F);
      var1.UuUVuuUu(var12, var13, var14, var15, var8, var21);
      var1.UuUVuuUu(
         var12, var13, var14, var15, var8, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 54 : 20), Math.max(0.5F, var2.UuUVuuUu(0.55F))
      );
      this.UuUVuuUu(var1, var2, var12 + var2.UuUVuuUu(14.0F), var13 + var2.UuUVuuUu(8.0F), var11, var3);
      this.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var16, var13 + var2.UuUVuuUu(2.0F), var18, 9.5F, var9, nunvNNUnvU.C00OOC00oO(var3), var17);
      this.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var16, var20, var19, 9.0F, var10, nunvNNUnvU.UuUVuuUu(var3), var17);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = Math.round(var4);
      float var10 = Math.round(var5);
      float var11 = Math.round(var6);
      float var12 = Math.round(var7);
      boolean var13 = "0".equals(this.nNnVnUNVV.NVNnnvnuunNv);
      int var14 = var13 ? var3.UNnVVNvvnVvU() : var3.C00OOC00oO();
      int var15 = var3.uNnUnnuNUnNu()
         ? nunvNNUnvU.UuUVuuUu(var3, var13 ? 0.2F : 0.31F)
         : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), NUunUunuNV.UuUVuuUu(var14, var13 ? 12 : 28), 0.24F);
      var1.UuUVuuUu(var9, var10, var11, var12, var8, var15);
      var1.UuUVuuUu(
         var9, var10, var11, var12, var8, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 58 : 22), Math.max(0.55F, var2.UuUVuuUu(0.6F))
      );
      float var16 = var2.UuUVuuUu(14.0F);
      float var17 = var9 + var16 + var2.UuUVuuUu(14.0F);
      float var18 = Math.max(var2.UuUVuuUu(16.0F), var11 - var16 - var2.UuUVuuUu(24.0F));
      this.UuUVuuUu(var1, var2, var9 + var16, var10 + var2.UuUVuuUu(12.0F), var14, var3);
      this.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var17,
         var10 + var2.UuUVuuUu(5.0F),
         var2.UuUVuuUu(14.0F),
         10.0F,
         "Что сейчас ломается",
         nunvNNUnvU.C00OOC00oO(var3),
         var18
      );
      this.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var17,
         var10 + var2.UuUVuuUu(22.0F),
         var2.UuUVuuUu(16.0F),
         10.0F,
         var13 ? "Шейдерных исключений нет" : this.nNnVnUNVV.vNVuvnUUnuUn,
         nunvNNUnvU.UuUVuuUu(var3),
         var18
      );
      this.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var17,
         var10 + var2.UuUVuuUu(42.0F),
         var2.UuUVuuUu(14.0F),
         9.0F,
         var13 ? this.nNnVnUNVV.uVunuUNVVUUV : this.nNnVnUNVV.UvnvNVnnnnNU,
         var13 ? nunvNNUnvU.C00OOC00oO(var3) : var14,
         var18
      );
      this.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var17,
         var10 + var2.UuUVuuUu(59.0F),
         var2.UuUVuuUu(15.0F),
         8.5F,
         var13 ? "Нажми Логи, чтобы загрузить latest.log" : this.nNnVnUNVV.uVUVnuvnuVuv,
         var13 ? nunvNNUnvU.C00OOC00oO(var3) : nunvNNUnvU.UuUVuuUu(var3),
         var18
      );
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = Math.round(var4);
      float var10 = Math.round(var5);
      float var11 = Math.round(var6);
      float var12 = Math.round((var11 - var2.UuUVuuUu(8.0F)) * 0.5F);
      this.C00OOC00oO(var1, var2, var3, var9, var10, var12, var7, var8, "Mixin policy", this.nNnVnUNVV.nUUVuvU, var3.uVunuUNVVUUV());
      this.C00OOC00oO(
         var1,
         var2,
         var3,
         var9 + var12 + var2.UuUVuuUu(8.0F),
         var10,
         var11 - var12 - var2.UuUVuuUu(8.0F),
         var7,
         var8,
         "Privacy",
         this.nNnVnUNVV.UnUNVVVNuv,
         var3.UNnVVNvvnVvU()
      );
   }

   private void C00OOC00oO(
      UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, String var9, String var10, int var11
   ) {
      int var12 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.18F) : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), NUunUunuNV.UuUVuuUu(var11, 14), 0.18F);
      var1.UuUVuuUu(var4, var5, (float)Math.round(var6), (float)Math.round(var7), var8, var12);
      var1.UuUVuuUu(
         var4,
         var5,
         (float)Math.round(var6),
         (float)Math.round(var7),
         var8,
         NUunUunuNV.UuUVuuUu(var11, var3.uNnUnnuNUnNu() ? 46 : 42),
         Math.max(0.5F, var2.UuUVuuUu(0.55F))
      );
      float var13 = var4 + var2.UuUVuuUu(12.0F);
      float var14 = Math.max(var2.UuUVuuUu(12.0F), var6 - var2.UuUVuuUu(24.0F));
      this.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var13, var5 + var2.UuUVuuUu(5.0F), var2.UuUVuuUu(13.0F), 9.5F, var9, nunvNNUnvU.C00OOC00oO(var3), var14
      );
      this.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var13, var5 + var2.UuUVuuUu(21.0F), var2.UuUVuuUu(14.0F), 9.0F, var10, nunvNNUnvU.UuUVuuUu(var3), var14
      );
   }

   private void uUnuvNvvNU(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = Math.round(var4);
      float var10 = Math.round(var5);
      float var11 = Math.round(var6);
      float var12 = Math.round(var7);
      int var13 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.24F) : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), var3.vuuuNvNuv(), 0.32F);
      var1.UuUVuuUu(var9, var10, var11, var12, var8, var13);
      var1.UuUVuuUu(
         var9, var10, var11, var12, var8, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 76 : 24), Math.max(0.55F, var2.UuUVuuUu(0.6F))
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var9 + var2.UuUVuuUu(14.0F),
         var10 + var2.UuUVuuUu(5.0F),
         var2.UuUVuuUu(13.0F),
         9.5F,
         "Гайдлайн",
         nunvNNUnvU.C00OOC00oO(var3)
      );
      float var14 = var10 + var2.UuUVuuUu(25.0F);
      this.UuUVuuUu(var1, var2, var3, var9 + var2.UuUVuuUu(14.0F), var14, "1 смотри Code/Stage", var3.uVunuUNVVUUV());
      this.UuUVuuUu(var1, var2, var3, var9 + var11 * 0.29F, var14, "2 жми Слепок", var3.UNnVVNvvnVvU());
      this.UuUVuuUu(var1, var2, var3, var9 + var11 * 0.53F, var14, "3 открой Логи", var3.uVunuUNVVUUV());
      this.UuUVuuUu(var1, var2, var3, var9 + var11 * 0.76F, var14, "4 передай Tracker ID", var3.UNnVVNvvnVvU());
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = Math.round(var5);
      float var11 = Math.round(var6);
      float var12 = Math.round(var7);
      float var13 = Math.round(var8);
      int var14 = var4.uNnUnnuNUnNu()
         ? NUunUunuNV.UuUVuuUu(247, 248, 252, 226)
         : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(5, 7, 12, 238), NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 34), 0.22F);
      var1.UuUVuuUu(var10, var11, var12, var13, var9, var14);
      var1.UuUVuuUu(
         var10, var11, var12, var13, var9, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), var4.uNnUnnuNUnNu() ? 58 : 76), Math.max(0.55F, var3.UuUVuuUu(0.6F))
      );
      this.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var10 + var3.UuUVuuUu(14.0F),
         var11 + var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(16.0F),
         10.5F,
         "Встроенный viewer",
         nunvNNUnvU.UuUVuuUu(var4),
         var3.UuUVuuUu(138.0F)
      );
      this.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var10 + var3.UuUVuuUu(166.0F),
         var11 + var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(16.0F),
         8.5F,
         this.nNnVnUNVV.UNnVVNvvnVvU,
         nunvNNUnvU.C00OOC00oO(var4),
         Math.max(var3.UuUVuuUu(40.0F), var12 - var3.UuUVuuUu(276.0F))
      );
      this.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var10 + var12 - var3.UuUVuuUu(92.0F),
         var11 + var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(16.0F),
         8.5F,
         "latest.log tail",
         nunvNNUnvU.C00OOC00oO(var4),
         var3.UuUVuuUu(80.0F)
      );
      float var15 = var10 + var3.UuUVuuUu(10.0F);
      float var16 = var11 + var3.UuUVuuUu(30.0F);
      float var17 = var12 - var3.UuUVuuUu(20.0F);
      float var18 = Math.max(var3.UuUVuuUu(24.0F), var13 - var3.UuUVuuUu(38.0F));
      int var19 = Math.min(this.nNnVnUNVV.c0oOOCcCoC0, 96);
      float var20 = Math.max(var3.UuUVuuUu(14.0F), Math.min(var3.UuUVuuUu(18.0F), var18 / Math.max(1, Math.min(96, 14))));
      float var21 = var3.UuUVuuUu(62.0F);
      float var22 = Math.max(var18, var19 * var20);
      float var23 = var17;

      for (int var24 = 0; var24 < var19; var24++) {
         float var25 = var21 + var3.UuUVuuUu(24.0F) + nunvNNUnvU.UuUVuuUu(var3, vNvnnVvvVUu.UuUVuuUu, this.UuUVuuUu(this.nNnVnUNVV.nNvNUVU[var24]), 8.0F);
         var23 = Math.max(var23, var25);
      }

      float var34 = Math.max(0.0F, var22 - var18);
      float var35 = Math.max(0.0F, var23 - var17);
      UuUVuuUu(var15, var16, var17, var18, var23, var22, var35, var34);
      var2.UuUVuuUu(var34, var35);
      float var26 = Math.min(var2.vuvvuVuVv(), var34);
      float var27 = Math.min(var2.uunNUuunVU(), var35);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var15, var16, var17, var18, var3.UuUVuuUu(6.0F), var3.UuUVuuUu(6.0F), var3.UuUVuuUu(6.0F), var3.UuUVuuUu(6.0F));

      try {
         for (int var28 = 0; var28 < var19; var28++) {
            float var29 = var16 + var28 * var20 - var26;
            if (!(var29 + var20 < var16) && !(var29 > var16 + var18)) {
               this.UuUVuuUu(var1, var3, var4, var15, var29, var17, var20, this.nNnVnUNVV.nNvNUVU[var28], this.nNnVnUNVV.UnUNuUU[var28], var27);
            }
         }

         if (var19 == 0) {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var3,
               vNvnnVvvVUu.UuUVuuUu,
               var15 + var3.UuUVuuUu(9.0F),
               var16 + var3.UuUVuuUu(3.0F),
               var3.UuUVuuUu(16.0F),
               9.0F,
               "Нажми Логи, чтобы загрузить latest.log",
               nunvNNUnvU.C00OOC00oO(var4)
            );
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      if (var34 > 0.5F) {
         float var36 = uNNnnnuuuN(var3);
         float var38 = Math.round(var15 + var17 - var36);
         float var30 = VVuuUN(var3);
         float var31 = Math.round(var16 + (var18 - var30) * (var26 / Math.max(1.0F, var34)));
         nunvNNUnvU.C00OOC00oO(var1, var3, var4, var38, var16, var36, var18, var31, var30, 0.0F, 0.42F);
      }

      if (var35 > 0.5F) {
         float var37 = uNNnnnuuuN(var3);
         float var39 = Math.round(var16 + var18 - var37);
         float var40 = nuUnNvnuUu(var3);
         float var41 = Math.round(var15 + (var17 - var40) * (var27 / Math.max(1.0F, var35)));
         var1.UuUVuuUu(var15, var39, var17, var37, var37 * 0.5F, NUunUunuNV.UuUVuuUu(var4.vNUvnnVnUvu(), var4.vuuuNvNuv(), 0.42F));
         var1.UuUVuuUu(var41, var39, var40, var37, var37 * 0.5F, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 165), NUunUunuNV.UuUVuuUu(var4.UNnVVNvvnVvU(), 150));
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, String var8, int var9, float var10) {
      int var11 = this.UuUVuuUu(var3, var9);
      if (var9 >= 2) {
         var1.UuUVuuUu(var4, var5, var6, var7, var2.UuUVuuUu(3.0F), NUunUunuNV.UuUVuuUu(var11, var9 == 3 ? 24 : 16));
      }

      float var12 = var4 + var2.UuUVuuUu(7.0F);
      float var13 = var5 + var7 * 0.5F;
      var1.C00OOC00oO(var12, var13, var2.UuUVuuUu(2.2F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var11, 230));
      nunvNNUnvU.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4 + var2.UuUVuuUu(16.0F), var5, var7, 7.0F, this.UuUVuuUu(var9), NUunUunuNV.UuUVuuUu(var11, 238)
      );
      float var14 = var4 + var2.UuUVuuUu(72.0F);
      float var15 = Math.max(var2.UuUVuuUu(18.0F), var6 - var2.UuUVuuUu(76.0F));
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var14, var5, var15, var7, 0.0F, 0.0F, 0.0F, 0.0F);

      try {
         nunvNNUnvU.UuUVuuUu(
            var1, var2, vNvnnVvvVUu.UuUVuuUu, var14 - var10, var5, var7, 8.0F, this.UuUVuuUu(var8), var9 == 3 ? var3.C00OOC00oO() : nunvNNUnvU.UuUVuuUu(var3)
         );
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, String var6, int var7) {
      float var8 = var2.UuUVuuUu(4.0F);
      var1.C00OOC00oO(var4, var5 + var2.UuUVuuUu(8.0F), var8, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var7, 210));
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var4 + var2.UuUVuuUu(9.0F), var5, var2.UuUVuuUu(16.0F), 8.5F, var6, nunvNNUnvU.UuUVuuUu(var3));
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, String var8, String var9, int var10) {
      float var11 = Math.round(var4);
      float var12 = Math.round(var5);
      float var13 = Math.round(var6);
      float var14 = Math.round(var7);
      float var15 = var2.UuUVuuUu(10.0F);
      int var16 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.13F) : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), var3.vuuuNvNuv(), 0.22F);
      var1.UuUVuuUu(var11, var12, var13, var14, var2.UuUVuuUu(7.0F), var16);
      var1.UuUVuuUu(
         var11,
         var12,
         var13,
         var14,
         var2.UuUVuuUu(7.0F),
         NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 52 : 15),
         Math.max(0.45F, var2.UuUVuuUu(0.5F))
      );
      float var17 = Math.max(var2.UuUVuuUu(12.0F), var13 - var15 * 2.0F);
      this.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var11 + var15, var12 + var2.UuUVuuUu(5.0F), var2.UuUVuuUu(13.0F), 9.5F, var8, nunvNNUnvU.C00OOC00oO(var3), var17
      );
      this.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var11 + var15, var12 + var2.UuUVuuUu(19.0F), var2.UuUVuuUu(15.0F), 9.0F, var9, var10, var17);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, nUVnuvUu var3, float var4, float var5, float var6, float var7, String var8, int var9, float var10) {
      String var11 = this.UuUVuuUu(var8);
      float var12 = Math.max(var2.UuUVuuUu(8.0F), var10);
      float var13 = nunvNNUnvU.UuUVuuUu(var2, var3, var11, var7);
      if (var13 <= var12) {
         nunvNNUnvU.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var11, var9);
      } else {
         float var14 = var13 - var12 + var2.UuUVuuUu(5.0F);
         float var15 = var14 * this.C00OOC00oO();
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(var4, var5, var12, var6, 0.0F, 0.0F, 0.0F, 0.0F);

         try {
            nunvNNUnvU.UuUVuuUu(var1, var2, var3, var4 - var15, var5, var6, var7, var11, var9);
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }
   }

   private float C00OOC00oO() {
      float var1 = (float)(System.currentTimeMillis() % 7200L) / 7200.0F;
      if (var1 < 0.18F) {
         return 0.0F;
      } else if (var1 < 0.44F) {
         return C00OOC00oO((var1 - 0.18F) / 0.26F);
      } else if (var1 < 0.62F) {
         return 1.0F;
      } else {
         return var1 < 0.88F ? 1.0F - C00OOC00oO((var1 - 0.62F) / 0.26F) : 0.0F;
      }
   }

   private static float C00OOC00oO(float var0) {
      float var1 = UuUVuuUu(var0);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return UuUVuuUu((var0 - var1) / Math.max(0.001F, var2 - var1));
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      nUvnuVnNUU var2,
      NUunUunuNV var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      String var9,
      String var10,
      String var11,
      int var12,
      float[] var13,
      float var14,
      float var15
   ) {
      float var16 = Math.round(var4);
      float var17 = Math.round(var5);
      float var18 = Math.round(var6);
      float var19 = Math.round(var7);
      int var20 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.16F) : NUunUunuNV.UuUVuuUu(var3.vNUvnnVnUvu(), NUunUunuNV.UuUVuuUu(var12, 12), 0.18F);
      var1.UuUVuuUu(var16, var17, var18, var19, var8, var20);
      var1.UuUVuuUu(var16, var17, var18, var19, var8, NUunUunuNV.UuUVuuUu(var12, var3.uNnUnnuNUnNu() ? 54 : 40), Math.max(0.5F, var2.UuUVuuUu(0.6F)));
      float var21 = var2.UuUVuuUu(10.0F);
      float var22 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var10, 10.5F);
      float var23 = Math.max(var2.UuUVuuUu(12.0F), var18 - var21 * 2.0F - var22 - var2.UuUVuuUu(6.0F));
      this.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var16 + var21, var17 + var2.UuUVuuUu(6.0F), var2.UuUVuuUu(12.0F), 9.0F, var9, nunvNNUnvU.C00OOC00oO(var3), var23
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var16 + var18 - var21 - var22,
         var17 + var2.UuUVuuUu(5.0F),
         var2.UuUVuuUu(13.0F),
         10.5F,
         var10,
         NUunUunuNV.UuUVuuUu(var12, 235)
      );
      float var24 = var16 + var21;
      float var25 = var17 + var2.UuUVuuUu(24.0F);
      float var26 = Math.max(var2.UuUVuuUu(8.0F), var18 - var21 * 2.0F);
      float var27 = var17 + var19 - var2.UuUVuuUu(15.0F);
      float var28 = Math.max(var2.UuUVuuUu(8.0F), var27 - var25);
      this.UuUVuuUu(var1, var2, var3, var24, var25, var26, var28, var12, var13, var14, C00OOC00oO(var15));
      this.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var16 + var21,
         var17 + var19 - var2.UuUVuuUu(13.0F),
         var2.UuUVuuUu(11.0F),
         7.5F,
         var11,
         nunvNNUnvU.C00OOC00oO(var3),
         Math.max(var2.UuUVuuUu(12.0F), var18 - var21 * 2.0F)
      );
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, int var8, float[] var9, float var10, float var11
   ) {
      var1.UuUVuuUu(var4, var5 + var7 - var2.UuUVuuUu(0.75F), var6, var2.UuUVuuUu(0.75F), 0.0F, NUunUunuNV.UuUVuuUu(var8, var3.uNnUnnuNUnNu() ? 40 : 32));
      int var12 = var9.length;
      if (var12 >= 2 && !(var10 <= 1.0E-4F) && !(var11 <= 0.001F)) {
         float var13 = var6 / (var12 - 1);
         int var14 = NUunUunuNV.UuUVuuUu(var8, var3.uNnUnnuNUnNu() ? 118 : 150);
         int var15 = NUunUunuNV.UuUVuuUu(var8, var3.uNnUnnuNUnNu() ? 12 : 18);
         int var16 = NUunUunuNV.UuUVuuUu(var8, 235);
         float var17 = 0.0F;
         float var18 = 0.0F;

         for (int var19 = 0; var19 < var12; var19++) {
            float var20 = UuUVuuUu(this.nuunNvv.UuUVuuUu(var9, var19) / var10) * var11;
            float var21 = var20 * var7;
            float var22 = var4 + var19 * var13;
            float var23 = var5 + var7 - var21;
            if (var21 > 0.5F) {
               var1.C00OOC00oO(var22 - var13 * 0.5F, var23, var13 + var2.UuUVuuUu(0.6F), var21, 0.0F, var14, var15);
            }

            if (var19 > 0) {
               this.UuUVuuUu(var1, var2, var17, var18, var22, var23, var16);
            }

            var17 = var22;
            var18 = var23;
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = var5 - var3;
      float var9 = var6 - var4;
      float var10 = (float)Math.sqrt(var8 * var8 + var9 * var9);
      float var11 = Math.max(1.0F, var2.UuUVuuUu(1.4F));
      if (var10 < 0.001F) {
         var1.UuUVuuUu(var3 - var11 * 0.5F, var4 - var11 * 0.5F, var11, var11, var11 * 0.5F, var7);
      } else {
         float var12 = (float)Math.toDegrees(Math.atan2(var9, var8));
         var1.UuUVuuUu(var3, var4);
         var1.C00OOC00oO(var12);

         try {
            var1.UuUVuuUu(0.0F, -var11 * 0.5F, var10, var11, var11 * 0.5F, var7);
         } finally {
            var1.VVuuUN();
            var1.vNUvnnVnUvu();
         }
      }
   }

   private static void UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      UuNnnVnuNNV = var0;
      uUVvnUuNvvN = var1;
      UUuUnNVNuuv = var2;
      NVuNUuVnVUN = var3;
      NVuunNnvvvVu = var4;
      vNnNuuvVn = var5;
      VUuuVUnun = var6;
      vVVuuVVv = var7;
   }

   private static void uUnuvNvvNU() {
      UuNnnVnuNNV = 0.0F;
      uUVvnUuNvvN = 0.0F;
      UUuUnNVNuuv = 0.0F;
      NVuNUuVnVUN = 0.0F;
      NVuunNnvvvVu = 0.0F;
      vNnNuuvVn = 0.0F;
      VUuuVUnun = 0.0F;
      vVVuuVVv = 0.0F;
   }

   private static float uNNnnnuuuN(nUvnuVnNUU var0) {
      return Math.max(var0.UuUVuuUu(5.0F), var0.UuUVuuUu(4.0F));
   }

   private static float nuUnNvnuUu(nUvnuVnNUU var0) {
      return !(UUuUnNVNuuv <= 1.0F) && !(NVuunNnvvvVu <= UUuUnNVNuuv)
         ? Math.max(var0.UuUVuuUu(28.0F), UUuUnNVNuuv * UUuUnNVNuuv / Math.max(UUuUnNVNuuv, NVuunNnvvvVu))
         : UUuUnNVNuuv;
   }

   private static float VVuuUN(nUvnuVnNUU var0) {
      return !(NVuNUuVnVUN <= 1.0F) && !(vNnNuuvVn <= NVuNUuVnVUN)
         ? Math.max(var0.UuUVuuUu(18.0F), NVuNUuVnVUN * NVuNUuVnVUN / Math.max(NVuNUuVnVUN, vNnNuuvVn))
         : NVuNUuVnVUN;
   }

   private String vVvUvVVuuNvV() {
      String var1 = this.UuUVuuUu(this.nNnVnUNVV.VVuuUN);
      return var1.toLowerCase(Locale.ROOT).contains("finite") ? "OK" : "CORRUPTED";
   }

   private String uNNnnnuuuN() {
      return this.nNnVnUNVV.uUVuVvuNUvnu == 0 ? "Изолированы [TextureUnitGuard]" : this.UuUVuuUu(this.nNnVnUNVV.nuUnNvnuUu);
   }

   private int UuUVuuUu(NUunUunuNV var1) {
      return "OK".equals(this.vVvUvVVuuNvV()) ? var1.uVunuUNVVUUV() : var1.C00OOC00oO();
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, float var3, float var4, int var5, NUunUunuNV var6) {
      float var7 = var2.UuUVuuUu(1.0F);
      var1.UuUVuuUu(
         var3 - 5.2F * var7,
         var4 - 5.2F * var7,
         10.4F * var7,
         10.4F * var7,
         3.0F * var7,
         NUunUunuNV.UuUVuuUu(var5, var6.uNnUnnuNUnNu() ? 96 : 124),
         Math.max(0.6F, var2.UuUVuuUu(0.65F))
      );
      var1.UuUVuuUu(var3 - 0.9F * var7, var4 - 3.7F * var7, 1.8F * var7, 7.4F * var7, 0.9F * var7, NUunUunuNV.UuUVuuUu(var5, 214));
      var1.UuUVuuUu(var3 - 3.6F * var7, var4 + 1.9F * var7, 7.2F * var7, 1.5F * var7, 0.75F * var7, NUunUunuNV.UuUVuuUu(var5, 178));
   }

   private int UuUVuuUu(NUunUunuNV var1, int var2) {
      return switch (var2) {
         case 2 -> var1.uUnuvNvvNU();
         case 3 -> var1.C00OOC00oO();
         case 4 -> var1.uVunuUNVVUUV();
         default -> var1.UNnVVNvvnVvU();
      };
   }

   private String UuUVuuUu(int var1) {
      return switch (var1) {
         case 2 -> "WARN";
         case 3 -> "ERROR";
         case 4 -> "GL";
         default -> "INFO";
      };
   }

   private String UuUVuuUu(String var1) {
      return var1 != null && !var1.isBlank() ? var1 : "none";
   }

   private static float UuUVuuUu(nUvnuVnNUU var0, float var1, float var2) {
      return Math.round(var1 + var2 - UuUVuuUu(var0) - C00OOC00oO(var0) - uUnuvNvvNU(var0) - var0.UuUVuuUu(16.0F));
   }

   private static float C00OOC00oO(nUvnuVnNUU var0, float var1, float var2) {
      return Math.round(var1 + var2 - C00OOC00oO(var0) - uUnuvNvvNU(var0) - var0.UuUVuuUu(8.0F));
   }

   private static float uUnuvNvvNU(nUvnuVnNUU var0, float var1, float var2) {
      return Math.round(var1 + var2 - uUnuvNvvNU(var0));
   }

   private static float nUUVuvU(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.vNVuvnUUnuUn() + var1.UuUVuuUu(18.0F));
   }

   private static float UnUNVVVNuv(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.UvnvNVnnnnNU() + var1.UuUVuuUu(18.0F));
   }

   private static float vNVuvnUUnuUn(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.uVUVnuvnuVuv() - var1.UuUVuuUu(36.0F));
   }

   private static float UvnvNVnnnnNU(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.NVNnnvnuunNv() - var1.UuUVuuUu(36.0F));
   }

   static final class NVnVnNnN {
      private static final int UuUVuuUu = 48;
      private static final long C00OOC00oO = 50L;
      final float[] uUnuvNvvNU = new float[48];
      final float[] vVvUvVVuuNvV = new float[48];
      final float[] uNNnnnuuuN = new float[48];
      private int nuUnNvnuUu;
      private long VVuuUN;
      private float vNUvnnVnUvu;
      private float uVUuuVnNVU;
      private float vuuuNvNuv;
      private OperatingSystemMXBean nvUVNnuu;
      private boolean UuuNnUvUuv;

      void UuUVuuUu() {
         this.vNUvnnVnUvu = this.uVUuuVnNVU();
         this.uVUuuVnNVU = this.vuuuNvNuv();
         this.vuuuNvNuv = this.nvUVNnuu();

         for (int var1 = 0; var1 < 48; var1++) {
            this.uUnuvNvvNU[var1] = this.vNUvnnVnUvu;
            this.vVvUvVVuuNvV[var1] = this.uVUuuVnNVU;
            this.uNNnnnuuuN[var1] = this.vuuuNvNuv;
         }

         this.nuUnNvnuUu = 47;
         this.VVuuUN = System.currentTimeMillis();
      }

      void C00OOC00oO() {
         this.vNUvnnVnUvu = this.uVUuuVnNVU();
         this.uVUuuVnNVU = this.vuuuNvNuv();
         this.vuuuNvNuv = this.nvUVNnuu();
         long var1 = System.currentTimeMillis();
         if (var1 - this.VVuuUN < 50L) {
            this.uUnuvNvvNU[this.nuUnNvnuUu] = this.vNUvnnVnUvu;
            this.vVvUvVVuuNvV[this.nuUnNvnuUu] = this.uVUuuVnNVU;
            this.uNNnnnuuuN[this.nuUnNvnuUu] = this.vuuuNvNuv;
         } else {
            this.VVuuUN = var1;
            this.nuUnNvnuUu = (this.nuUnNvnuUu + 1) % 48;
            this.uUnuvNvvNU[this.nuUnNvnuUu] = this.vNUvnnVnUvu;
            this.vVvUvVVuuNvV[this.nuUnNvnuUu] = this.uVUuuVnNVU;
            this.uNNnnnuuuN[this.nuUnNvnuUu] = this.vuuuNvNuv;
         }
      }

      float UuUVuuUu(float[] var1, int var2) {
         return var1[(this.nuUnNvnuUu + 1 + var2) % 48];
      }

      float uUnuvNvvNU() {
         return 1.0F;
      }

      float vVvUvVVuuNvV() {
         float var1 = 1.0F;

         for (int var2 = 0; var2 < 48; var2++) {
            var1 = Math.max(var1, this.vVvUvVVuuNvV[var2]);
         }

         return Math.max(60.0F, var1 * 1.12F);
      }

      float uNNnnnuuuN() {
         float var1 = 1.0F;

         for (int var2 = 0; var2 < 48; var2++) {
            var1 = Math.max(var1, this.uNNnnnuuuN[var2]);
         }

         return Math.max(80.0F, var1 * 1.2F);
      }

      String nuUnNvnuUu() {
         return Math.round(this.vNUvnnVnUvu * 100.0F) + "%";
      }

      String VVuuUN() {
         return Integer.toString(Math.round(this.uVUuuVnNVU));
      }

      String vNUvnnVnUvu() {
         return Math.round(this.vuuuNvNuv) + " ms";
      }

      private float uVUuuVnNVU() {
         try {
            if (!this.UuuNnUvUuv) {
               this.UuuNnUvUuv = true;
               if (ManagementFactory.getOperatingSystemMXBean() instanceof OperatingSystemMXBean var2) {
                  this.nvUVNnuu = var2;
               }
            }

            if (this.nvUVNnuu != null) {
               double var4 = this.nvUVNnuu.getProcessCpuLoad();
               if (var4 >= 0.0) {
                  return (float)Math.min(1.0, var4);
               }
            }
         } catch (Throwable var3) {
         }

         return this.vNUvnnVnUvu;
      }

      private float vuuuNvNuv() {
         try {
            class_310 var1 = class_310.method_1551();
            if (var1 != null) {
               return Math.max(0.0F, (float)var1.method_47599());
            }
         } catch (Throwable var2) {
         }

         return this.uVUuuVnNVU;
      }

      private float nvUVNnuu() {
         try {
            class_310 var1 = class_310.method_1551();
            if (var1 != null && var1.field_1724 != null && var1.method_1562() != null) {
               class_640 var2 = var1.method_1562().method_2871(var1.field_1724.method_5667());
               if (var2 != null) {
                  return Math.max(0.0F, (float)var2.method_2959());
               }
            }
         } catch (Throwable var3) {
         }

         return this.vuuuNvNuv;
      }
   }
}
