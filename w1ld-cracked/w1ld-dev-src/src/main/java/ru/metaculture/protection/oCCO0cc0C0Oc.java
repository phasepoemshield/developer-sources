package ru.metaculture.protection;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.LockSupport;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_2848.class_2849;

public final class oCCO0cc0C0Oc implements O000c0oocoo {
   private static final SecureRandom vVvUvVVuuNvV = new SecureRandom();
   static final class_310 uNNnnnuuuN = class_310.method_1551();
   public static long UuUVuuUu;
   public static int C00OOC00oO;
   public static int uUnuvNvvNU;
   private static final UUVuuNuvVuVv nuUnNvnuUu = new UUVuuNuvVuVv();
   private static boolean VVuuUN;
   private static int vNUvnnVnUvu;

   public static void UuUVuuUu() {
      UuUVuuUu++;
   }

   public static void C00OOC00oO() {
      UuUVuuUu = 0L;
   }

   public static boolean uUnuvNvvNU() {
      return UuUVuuUu % 7L == 3L;
   }

   public static class_1657 vVvUvVVuuNvV() {
      return uNNnnnuuuN.field_1724;
   }

   public static class_1937 uNNnnnuuuN() {
      return uNNnnnuuuN.field_1687;
   }

   public static float UuUVuuUu(float var0) {
      float var1 = 0.2F;
      return (float)(var0 + (vVvUvVVuuNvV.nextGaussian() * 0.2F * 2.0 - 0.2F));
   }

   public static boolean UuUVuuUu(int var0) {
      return vVvUvVVuuNvV.nextInt(var0 + 1) >= 1.0F * (1.0F / Math.max((float)var0, 1.0F));
   }

   public static boolean nuUnNvnuUu() {
      return vVvUvVVuuNvV.nextInt(2) == 1;
   }

   public static float UuUVuuUu(float var0, float var1) {
      return vVvUvVVuuNvV.nextFloat(var0, var1);
   }

   public static float VVuuUN() {
      return UuUVuuUu(0.0F, 1.0F);
   }

   public static int vNUvnnVnUvu() {
      return nuUnNvnuUu() ? 1 : -1;
   }

   public static int uVUuuVnNVU() {
      if (uNNnnnuuuN.field_1724 == null) {
         return -1;
      } else {
         for (int var0 = 0; var0 < 9; var0++) {
            if (uNNnnnuuuN.field_1724.method_31548().method_5438(var0).method_7909() instanceof class_1743) {
               return var0;
            }
         }

         return -1;
      }
   }

   public static Runnable[] UuUVuuUu(class_1309 var0, boolean var1) {
      Runnable[] var2 = new Runnable[]{() -> {}, () -> {}};
      if (var1 && uNNnnnuuuN.field_1724 != null) {
         if (var0 instanceof class_1657 var3) {
            if (!var3.method_6039()) {
               return var2;
            }

            class_1799 var4 = var3.method_6047();
            class_1799 var5 = var3.method_6079();
            class_1792 var6 = var4.method_7960() ? null : var4.method_7909();
            class_1792 var7 = var5.method_7960() ? null : var5.method_7909();
            if (var6 == class_1802.field_8255 || var7 == class_1802.field_8255) {
               int var9 = uNNnnnuuuN.field_1724.method_31548().method_67532();
               int var8;
               if ((var8 = uVUuuVnNVU()) != -1 && var8 != var9) {
                  var2[0] = () -> {
                     if (uNNnnnuuuN.method_1562() != null) {
                        uNNnnnuuuN.method_1562().method_52787(new class_2868(var8));
                     }
                  };
                  var2[1] = () -> {
                     if (uNNnnnuuuN.method_1562() != null) {
                        uNNnnnuuuN.method_1562().method_52787(new class_2868(var9));
                     }
                  };
               }
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static Runnable[] UuUVuuUu(boolean var0) {
      Runnable[] var1 = new Runnable[]{() -> {}, () -> {}};
      if (var0 && uNNnnnuuuN.field_1724 != null) {
         if (uNNnnnuuuN.field_1724.method_6039()) {
            class_1268 var2 = uNNnnnuuuN.field_1724.method_6058();
            if (var2 == null) {
               return var1;
            }

            var1[0] = () -> uNNnnnuuuN.method_1562().method_52787(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
            var1[1] = () -> uNNnnnuuuN.method_1562()
               .method_52787(new class_2886(var2, 0, uNNnnnuuuN.field_1724.method_36454(), uNNnnnuuuN.field_1724.method_36455()));
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static Runnable[] C00OOC00oO(boolean var0) {
      Runnable[] var1 = new Runnable[]{() -> {}, () -> {}};
      if (var0 && uNNnnnuuuN.field_1724 != null) {
         if (uNNnnnuuuN.field_1724.method_5624() && !uNNnnnuuuN.field_1724.method_24828() && !uNNnnnuuuN.field_1724.method_5777(class_3486.field_15517)) {
            var1[0] = () -> {
               uNNnnnuuuN.field_1724.method_5728(false);
               uNNnnnuuuN.method_1562().method_52787(new class_2848(uNNnnnuuuN.field_1724, class_2849.field_12985));
            };
            var1[1] = () -> {
               uNNnnnuuuN.field_1724.method_5728(true);
               uNNnnnuuuN.method_1562().method_52787(new class_2848(uNNnnnuuuN.field_1724, class_2849.field_12981));
            };
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static boolean uUnuvNvvNU(boolean var0) {
      if (!var0 || uNNnnnuuuN.field_1724 == null) {
         return true;
      } else if (uNNnnnuuuN.field_1724.method_5681()) {
         return true;
      } else {
         if (!(uNNnnnuuuN.field_1724.field_6017 > 0.0)) {
            C00OOC00oO = 2;
         }

         if (C00OOC00oO > 0) {
            C00OOC00oO--;
         }

         if (C00OOC00oO == 0 && uNNnnnuuuN.field_1724.field_6017 > 0.0) {
            return true;
         } else {
            boolean var1 = uNNnnnuuuN.field_1687.method_8320(uNNnnnuuuN.field_1724.method_24515()).method_27852(class_2246.field_10343);
            boolean var2 = !uNNnnnuuuN.field_1724.method_70673() && (uNNnnnuuuN.field_1724.method_5799() || uNNnnnuuuN.field_1724.method_5771())
               || uNNnnnuuuN.field_1724.method_5777(class_3486.field_15517)
               || uNNnnnuuuN.field_1724.method_5777(class_3486.field_15518)
               || var1;
            return var2
               || !uNNnnnuuuN.field_1724.method_70673() && uNNnnnuuuN.field_1724.field_6012 > 6 && AttackAura.uUVvnUuNvvN.C00OOC00oO("Умные криты")
               || uNNnnnuuuN.field_1724.method_6101()
               || uNNnnnuuuN.field_1724.method_5765()
               || uNNnnnuuuN.field_1724.method_6059(class_1294.field_5919)
               || uNNnnnuuuN.field_1724.method_6059(class_1294.field_5902)
               || uNNnnnuuuN.field_1724.method_6059(class_1294.field_5906)
               || uNNnnnuuuN.field_1724.method_31549().field_7479;
         }
      }
   }

   public static boolean UuUVuuUu(class_1309 var0, Runnable var1, Runnable var2, class_1268 var3, boolean var4) {
      return UuUVuuUu(var0, var1, var2, var3, var4, null, false);
   }

   public static boolean UuUVuuUu(class_1309 var0, Runnable var1, Runnable var2, class_1268 var3, boolean var4, Runnable var5) {
      return oCCO0cc0C0Oc.NVnVnNnN.UuUVuuUu(var0, var1, var2, var3, var4, var5);
   }

   public static void vuuuNvNuv() {
      oCCO0cc0C0Oc.NVnVnNnN.UuUVuuUu();
   }

   public static void nvUVNnuu() {
      oCCO0cc0C0Oc.NVnVnNnN.C00OOC00oO();
   }

   public static boolean UuUVuuUu(class_1309 var0) {
      return oCCO0cc0C0Oc.NVnVnNnN.UuUVuuUu(var0);
   }

   static boolean UuUVuuUu(class_1309 var0, Runnable var1, Runnable var2, class_1268 var3, boolean var4, Runnable var5, boolean var6) {
      if (var6 && !C00OOC00oO(var0)) {
         return false;
      } else {
         if (var1 != null) {
            var1.run();
         }

         boolean var7 = !var6 || C00OOC00oO(var0);
         if (var7 && var0 != null && uNNnnnuuuN.field_1761 != null && uNNnnnuuuN.field_1724 != null) {
            uNNnnnuuuN.field_1761.method_2918(uNNnnnuuuN.field_1724, var0);
            if (var3 != null) {
               uNNnnnuuuN.field_1724.method_6104(var3);
            }

            if (var4) {
               UuUVuuUu();
            } else {
               C00OOC00oO();
            }

            nuUnNvnuUu.UuUVuuUu();
            uUnuvNvvNU++;
         }

         if (var2 != null) {
            var2.run();
         }

         if (var7 && var0 != null && var5 != null) {
            var5.run();
         }

         return var7 && var0 != null;
      }
   }

   private static boolean C00OOC00oO(class_1309 var0) {
      return var0 != null
         && var0 == AttackAura.ccOO0COcoco0
         && var0.method_5805()
         && !var0.method_31481()
         && uNNnnnuuuN.field_1724 != null
         && uNNnnnuuuN.field_1724.method_5805()
         && uNNnnnuuuN.field_1687 != null
         && uNNnnnuuuN.field_1761 != null;
   }

   public static long UuuNnUvUuv() {
      if (uNNnnnuuuN.field_1724 == null) {
         return 500L;
      } else {
         double var0 = uNNnnnuuuN.field_1724.method_45325(class_5134.field_23723);
         float var2 = 0.2F;
         long var3 = (long)(1.0 / var0 * 1000.0 * (1.0F - var2));
         if (AttackAura.nuunNvv.C00OOC00oO("Динамичный")) {
            var3 += ThreadLocalRandom.current().nextLong(40L, 60L);
         } else {
            var3 += 30L;
         }

         return Math.max(var3, 400L);
      }
   }

   public static boolean UuUVuuUu(long var0) {
      return nuUnNvnuUu.UuUVuuUu((double)(UuuNnUvUuv() + var0));
   }

   public static boolean nUUVuvU() {
      return UuUVuuUu(0L);
   }

   public static boolean C00OOC00oO(long var0) {
      return nuUnNvnuUu.UuUVuuUu((double)var0);
   }

   public static float UnUNVVVNuv() {
      return Math.min((float)nuUnNvnuUu.C00OOC00oO() / (float)UuuNnUvUuv(), 1.0F);
   }

   public static float vNVuvnUUnuUn() {
      return (float)nuUnNvnuUu.C00OOC00oO();
   }

   public static boolean UuUVuuUu(class_1309 var0, double var1) {
      return var0 != null
         && VuUVUvnU.UuUVuuUu(class_3532.method_15393(uNNnnnuuuN.field_1724.method_36454()), uNNnnnuuuN.field_1724.method_36455(), (float)var1, var0);
   }

   public static boolean UuUVuuUu(class_1309 var0, double var1, boolean var3) {
      return var0 != null && uNNnnnuuuN.field_1724 != null && nVuVUNvVV.vVvUvVVuuNvV()
         ? VuUVUvnU.uUnuvNvvNU(
            class_3532.method_15393(nVuVUNvVV.UuUVuuUu(uNNnnnuuuN.field_1724.method_36454())),
            nVuVUNvVV.C00OOC00oO(uNNnnnuuuN.field_1724.method_36455()),
            var1,
            var0,
            var3
         )
         : false;
   }

   public static boolean UuUVuuUu(class_1309 var0, boolean var1, boolean var2, boolean var3, long var4, float[] var6) {
      if (var2 && var0 != null && !uvnuUUnunNn.UuUVuuUu(var0, var6[0], true)) {
         return false;
      } else if (!UuUVuuUu(var4)) {
         return false;
      } else {
         boolean var7 = uUnuvNvvNU(var3);
         if (var7 && var1 && !UuUVuuUu(var0, var6[0])) {
            var7 = false;
         }

         return var7;
      }
   }

   public static boolean UuUVuuUu(class_1309 var0, boolean var1, boolean var2, long var3, float[] var5) {
      return UuUVuuUu(var0, var1, true, var2, var3, var5);
   }

   public static boolean UuUVuuUu(class_1309 var0, float[] var1) {
      return var0 != null
         && UuUVuuUu(var0, false, false, -80L, var1)
         && !uNNnnnuuuN.field_1724.method_24828()
         && !uNNnnnuuuN.field_1724.method_5777(class_3486.field_15517)
         && uNNnnnuuuN.field_1724.method_18798().field_1351 <= 0.0030162615090425808;
   }

   public static boolean C00OOC00oO(class_1309 var0, float[] var1) {
      return var0 != null
         && UuUVuuUu(var0, false, false, -60L, var1)
         && !uNNnnnuuuN.field_1724.method_24828()
         && !uNNnnnuuuN.field_1724.method_5777(class_3486.field_15517)
         && uNNnnnuuuN.field_1724.method_18798().field_1351 <= 0.16477328182606651;
   }

   private static int NVNnnvnuunNv() {
      return 3;
   }

   public static void UvnvNVnnnnNU() {
      VVuuUN = false;
      vNUvnnVnUvu = 0;
   }

   public static void UuUVuuUu(class_1309 var0, boolean var1, boolean var2, boolean var3) {
      if (var0 == null || vNUvnnVnUvu == 0 || !var3 || var0.field_6235 != 0) {
         UvnvNVnnnnNU();
      }

      if (var3 && var0 != null && C00OOC00oO(uUnuvNvvNU() ? 250L : 150L) && uNNnnnuuuN.field_1724.field_6252) {
         if (!VVuuUN && vNUvnnVnUvu == 0 && var0.field_6235 == 0) {
            VVuuUN = true;
            vNUvnnVnUvu = NVNnnvnuunNv();
         }

         if (VVuuUN && vNUvnnVnUvu > 0 && (!var2 || UuUVuuUu(var0, 6.0)) && UuUVuuUu(var0, () -> {}, () -> {}, class_1268.field_5808, var1)) {
            vNUvnnVnUvu--;
         }
      }
   }

   @Generated
   private oCCO0cc0C0Oc() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static UUVuuNuvVuVv uVUVnuvnuVuv() {
      return nuUnNvnuUu;
   }

   static final class NVnVnNnN {
      private static final double UuUVuuUu = 45.0;
      private static final double C00OOC00oO = 49.2;
      private static final double uUnuvNvvNU = 4.5;
      private static final long vVvUvVVuuNvV = 250000L;
      private static final long uNNnnnuuuN = 120000L;
      private static final Object nuUnNvnuUu = new Object();
      private static final Thread VVuuUN = new Thread(oCCO0cc0C0Oc.NVnVnNnN::uUnuvNvvNU, "Wild Adaptive Tick Edge");
      private static volatile boolean vNUvnnVnUvu;
      private static volatile boolean uVUuuVnNVU;
      private static volatile long vuuuNvNuv;
      private static volatile class_1309 nvUVNnuu;
      private static volatile Runnable UuuNnUvUuv;
      private static volatile Runnable nUUVuvU;
      private static volatile Runnable UnUNVVVNuv;
      private static volatile class_1268 vNVuvnUUnuUn;
      private static volatile boolean UvnvNVnnnnNU;

      private NVnVnNnN() {
      }

      static void UuUVuuUu() {
         if (!vNUvnnVnUvu) {
            synchronized (nuUnNvnuUu) {
               if (!vNUvnnVnUvu) {
                  vNUvnnVnUvu = true;
                  VVuuUN.start();
               }
            }
         }
      }

      static boolean UuUVuuUu(class_1309 var0, Runnable var1, Runnable var2, class_1268 var3, boolean var4, Runnable var5) {
         UuUVuuUu();
         long var6 = System.nanoTime();
         if (!UVVNuuUvuu.C00OOC00oO(var6)) {
            return oCCO0cc0C0Oc.UuUVuuUu(var0, var1, var2, var3, var4, var5, false);
         } else if (uVUuuVnNVU && nvUVNnuu == var0) {
            return false;
         } else {
            double var8 = UVVNuuUvuu.vVvUvVVuuNvV(var6);
            double var10 = UVVNuuUvuu.uUnuvNvvNU(var6);
            if (!(var10 <= 4.5) && (!(var8 >= 45.0) || !(var8 <= 49.2))) {
               long var12 = UVVNuuUvuu.UuUVuuUu(var6, 45.0);
               if (var12 <= 250000L) {
                  return oCCO0cc0C0Oc.UuUVuuUu(var0, var1, var2, var3, var4, var5, true);
               } else {
                  UuUVuuUu(var6 + var12, var0, var1, var2, var3, var4, var5);
                  return false;
               }
            } else {
               return oCCO0cc0C0Oc.UuUVuuUu(var0, var1, var2, var3, var4, var5, true);
            }
         }
      }

      static boolean UuUVuuUu(class_1309 var0) {
         return uVUuuVnNVU && nvUVNnuu == var0;
      }

      private static void UuUVuuUu(long var0, class_1309 var2, Runnable var3, Runnable var4, class_1268 var5, boolean var6, Runnable var7) {
         synchronized (nuUnNvnuUu) {
            nvUVNnuu = var2;
            UuuNnUvUuv = var3;
            nUUVuvU = var4;
            vNVuvnUUnuUn = var5;
            UvnvNVnnnnNU = var6;
            UnUNVVVNuv = var7;
            vuuuNvNuv = var0;
            uVUuuVnNVU = true;
         }

         LockSupport.unpark(VVuuUN);
      }

      static void C00OOC00oO() {
         synchronized (nuUnNvnuUu) {
            uVUuuVnNVU = false;
            nvUVNnuu = null;
            UuuNnUvUuv = null;
            nUUVuvU = null;
            UnUNVVVNuv = null;
            vNVuvnUUnuUn = null;
            UvnvNVnnnnNU = false;
            vuuuNvNuv = 0L;
         }
      }

      private static void uUnuvNvvNU() {
         while (true) {
            if (!uVUuuVnNVU) {
               LockSupport.park();
            } else {
               long var0 = vuuuNvNuv;
               long var2 = var0 - System.nanoTime();
               if (var2 > 120000L) {
                  LockSupport.parkNanos(var2 - 120000L);
               } else {
                  long var4;
                  while ((var4 = System.nanoTime()) < var0 && uVUuuVnNVU && vuuuNvNuv == var0) {
                     Thread.onSpinWait();
                  }

                  if (var4 >= var0) {
                     UuUVuuUu(var0);
                  }
               }
            }
         }
      }

      private static void UuUVuuUu(long var0) {
         class_1309 var2;
         Runnable var3;
         Runnable var4;
         Runnable var5;
         class_1268 var6;
         boolean var7;
         synchronized (nuUnNvnuUu) {
            if (!uVUuuVnNVU || vuuuNvNuv != var0) {
               return;
            }

            var2 = nvUVNnuu;
            var3 = UuuNnUvUuv;
            var4 = nUUVuvU;
            var6 = vNVuvnUUnuUn;
            var7 = UvnvNVnnnnNU;
            var5 = UnUNVVVNuv;
            uVUuuVnNVU = false;
            nvUVNnuu = null;
            UuuNnUvUuv = null;
            nUUVuvU = null;
            UnUNVVVNuv = null;
            vNVuvnUUnuUn = null;
            UvnvNVnnnnNU = false;
            vuuuNvNuv = 0L;
         }

         oCCO0cc0C0Oc.uNNnnnuuuN.execute(() -> {
            try {
               oCCO0cc0C0Oc.UuUVuuUu(var2, var3, var4, var6, var7, var5, true);
            } catch (Throwable var7x) {
            }
         });
      }

      static {
         VVuuUN.setDaemon(true);
      }
   }
}
