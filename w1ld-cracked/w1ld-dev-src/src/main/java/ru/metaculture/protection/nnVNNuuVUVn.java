package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.class_10182;
import net.minecraft.class_1297;
import net.minecraft.class_1661;
import net.minecraft.class_1934;
import net.minecraft.class_2535;
import net.minecraft.class_2649;
import net.minecraft.class_2651;
import net.minecraft.class_2653;
import net.minecraft.class_2656;
import net.minecraft.class_2664;
import net.minecraft.class_2668;
import net.minecraft.class_2696;
import net.minecraft.class_2708;
import net.minecraft.class_2735;
import net.minecraft.class_2748;
import net.minecraft.class_2749;
import net.minecraft.class_2793;
import net.minecraft.class_2799;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_434;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_743;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_9834;
import net.minecraft.class_9835;
import net.minecraft.class_9836;
import net.minecraft.class_2668.class_5402;
import net.minecraft.class_2799.class_2800;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_2828.class_2830;
import net.minecraft.class_2828.class_2831;
import net.minecraft.class_2828.class_5911;
import org.wild.mixin.acceser.MinecraftClientAccessor;

public final class nnVNNuuVUVn {
   public static final List<vUNVNUnuv> UuUVuuUu = new CopyOnWriteArrayList<>();
   public static final List<vUNVNUnuv> C00OOC00oO = new CopyOnWriteArrayList<>();
   private static final Set<String> uUnuvNvvNU = ConcurrentHashMap.newKeySet();
   private static final Object vVvUvVVuuNvV = new Object();
   private static final Map<String, nnVNNuuVUVn.VvunVVUvUNnv> uNNnnnuuuN = new LinkedHashMap<>();
   private static final AtomicLong nuUnNvnuUu = new AtomicLong();
   private static volatile vUNVNUnuv VVuuUN;
   private static class_638 vNUvnnVnUvu;
   private static class_746 uVUuuVnNVU;
   private static class_636 vuuuNvNuv;
   private static boolean nvUVNnuu;
   private static boolean UuuNnUvUuv;
   private static vUNVNUnuv nUUVuvU;
   private static vUNVNUnuv UnUNVVVNuv;
   private static double vNVuvnUUnuUn;
   private static double UvnvNVnnnnNU;
   private static double uVUVnuvnuVuv;
   private static float NVNnnvnuunNv;
   private static float uVunuUNVVUUV;
   private static boolean UNnVVNvvnVvU;
   private static boolean uNnUnnuNUnNu;
   private static int NnUuNNU;

   private nnVNNuuVUVn() {
   }

   public static vUNVNUnuv UuUVuuUu() {
      return VVuuUN;
   }

   public static List<nnVNNuuVUVn.NVnVnNnN> C00OOC00oO() {
      synchronized (vVvUvVVuuNvV) {
         ArrayList var1 = new ArrayList(uNNnnnuuuN.size());

         for (nnVNNuuVUVn.VvunVVUvUNnv var3 : uNNnnnuuuN.values()) {
            var1.add(var3.UuUVuuUu());
         }

         return List.copyOf(var1);
      }
   }

   public static nnVNNuuVUVn.NVnVnNnN UuUVuuUu(String var0) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var2 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         return var2 == null ? null : var2.UuUVuuUu();
      }
   }

   public static boolean C00OOC00oO(String var0) {
      nnVNNuuVUVn.NVnVnNnN var1 = UuUVuuUu(var0);
      if (var1 != null && !var1.address().isBlank()) {
         class_310 var2 = vNVuvnUUnuUn();
         if (var2 != null && !var2.method_18854()) {
            var2.execute(() -> C00OOC00oO(var0));
            return true;
         } else {
            uUnuvNvvNU(var0);
            return OCO0OoO.UuUVuuUu(var1.name(), var1.address());
         }
      } else {
         return false;
      }
   }

   public static boolean uUnuvNvvNU(String var0) {
      Thread var2 = null;
      boolean var3 = false;
      vUNVNUnuv var1;
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var5 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var5 == null) {
            return false;
         }

         var1 = var5.VVuuUN;
         if (var1 == null) {
            if (!var5.uUnuvNvvNU.UuUVuuUu()) {
               return false;
            }

            var2 = var5.vNUvnnVnUvu;
            var5.vNUvnnVnUvu = null;
            var5.nuUnNvnuUu = nuUnNvnuUu.incrementAndGet();
            var5.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.DISCONNECTED, "Connection cancelled");
            var3 = true;
         } else {
            var5.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.DISCONNECTED, "Disconnected by user");
         }
      }

      if (var3) {
         if (var2 != null) {
            var2.interrupt();
         }

         nuUnNvnuUu(var0);
         return true;
      } else {
         uUnuvNvvNU(var1);
         return true;
      }
   }

   public static boolean vVvUvVVuuNvV(String var0) {
      String var1 = vuuuNvNuv(var0);
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var3 = uNNnnnuuuN.get(var1);
         if (var3 == null || var3.VVuuUN != null || var3.uUnuvNvvNU.UuUVuuUu()) {
            return false;
         }

         uNNnnnuuuN.remove(var1);
      }

      nuUnNvnuUu(var0);
      VvNvUNnUuUv.C00OOC00oO();
      return true;
   }

   static boolean UuUVuuUu(String var0, String var1) {
      String var2 = var0 == null ? "" : var0.trim();
      String var3 = var1 == null ? "" : var1.trim();
      String var4 = vuuuNvNuv(var2);
      if (!var4.isEmpty() && !var3.isEmpty()) {
         synchronized (vVvUvVVuuNvV) {
            if (uNNnnnuuuN.containsKey(var4)) {
               return false;
            } else {
               uNNnnnuuuN.put(var4, nnVNNuuVUVn.VvunVVUvUNnv.UuUVuuUu(var2, var3));
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public static class_746 uUnuvNvvNU() {
      return uVUuuVnNVU;
   }

   public static boolean UuUVuuUu(class_634 var0) {
      if (VVuuUN == null) {
         return false;
      } else if (var0 instanceof nNnnNNnNVvUv) {
         return false;
      } else {
         class_310 var1 = vNVuvnUUnuUn();
         return var1 != null && var0 != var1.method_1562();
      }
   }

   public static void UuUVuuUu(class_2708 var0, class_634 var1) {
      class_2535 var2 = var1.method_48296();
      class_746 var3 = uVUuuVnNVU;
      if (var3 != null && !var3.method_5765()) {
         class_10182 var4 = class_10182.method_63638(var3);
         class_10182 var5 = class_10182.method_63639(var4, var0.comp_3228(), var0.comp_3229());
         var3.method_33574(var5.comp_3148());
         var3.method_18799(var5.comp_3149());
         var3.method_36456(var5.comp_3150());
         var3.method_36457(var5.comp_3151());
      }

      var2.method_10743(new class_2793(var0.comp_3133()));
      if (var3 != null) {
         var2.method_10743(
            new class_2830(
               var3.method_23317(), var3.method_23318(), var3.method_23321(), var3.method_36454(), var3.method_36455(), var3.method_24828(), var3.field_5976
            )
         );
         UuUVuuUu(var3);
      }
   }

   public static boolean UuUVuuUu(vUNVNUnuv var0) {
      class_310 var1 = vNVuvnUUnuUn();
      if (var0 != null
         && var1 != null
         && var1.method_18854()
         && !UuuNnUvUuv
         && UuUVuuUu.contains(var0)
         && var0.uNNnnnuuuN()
         && var0.vuuuNvNuv()
         && var0.VVuuUN() != null
         && var0.vNUvnnVnUvu() != null
         && var0.uVUuuVnNVU() != null) {
         vUNVNUnuv var2 = VVuuUN;
         if (VVuuUN == null) {
            if (var1.field_1687 == null
               || var1.field_1724 == null
               || var1.field_1761 == null
               || var1.field_1724.field_3944 == null
               || !var1.field_1724.field_3944.method_48296().method_10758()) {
               return false;
            }

            vNUvnnVnUvu = var1.field_1687;
            uVUuuVnNVU = var1.field_1724;
            vuuuNvNuv = var1.field_1761;
         }

         if (var2 != null && var2 != var0 && var2.vNUvnnVnUvu() != null) {
            var2.vNUvnnVnUvu().field_3913 = new class_744();
         }

         VVuuUN = var0;
         if (uVUuuVnNVU != null) {
            uVUuuVnNVU.field_3913 = new class_744();
            nvUVNnuu = false;
            UuUVuuUu(uVUuuVnNVU);
         }

         var1.field_1687 = var0.VVuuUN();
         ((MinecraftClientAccessor)var1).wild$setWorld(var0.VVuuUN());
         var1.field_1724 = var0.vNUvnnVnUvu();
         var1.field_1761 = var0.uVUuuVnNVU();
         var0.vNUvnnVnUvu().field_3913 = new class_743(var1.field_1690);
         var1.method_1504(var0.vNUvnnVnUvu());
         var1.field_1769.method_3279();
         return true;
      } else {
         return false;
      }
   }

   public static void vVvUvVVuuNvV() {
      uVUVnuvnuVuv();
      class_310 var0 = vNVuvnUUnuUn();
      vUNVNUnuv var1 = VVuuUN;
      VVuuUN = null;
      if (var1 != null || vNUvnnVnUvu != null || uVUuuVnNVU != null || vuuuNvNuv != null) {
         if (var0 == null) {
            vNUvnnVnUvu = null;
            uVUuuVnNVU = null;
            vuuuNvNuv = null;
         } else {
            if (var1 != null && var1.vNUvnnVnUvu() != null) {
               var1.vNUvnnVnUvu().field_3913 = new class_744();
            }

            if (vNUvnnVnUvu != null) {
               var0.field_1687 = vNUvnnVnUvu;
               ((MinecraftClientAccessor)var0).wild$setWorld(vNUvnnVnUvu);
            }

            if (uVUuuVnNVU != null) {
               uVUuuVnNVU.field_3913 = new class_743(var0.field_1690);
               var0.field_1724 = uVUuuVnNVU;
               var0.method_1504(uVUuuVnNVU);
            }

            if (vuuuNvNuv != null) {
               var0.field_1761 = vuuuNvNuv;
            }

            nvUVNnuu = false;
            var0.field_1769.method_3279();
            vNUvnnVnUvu = null;
            uVUuuVnNVU = null;
            vuuuNvNuv = null;
         }
      }
   }

   public static synchronized boolean uNNnnnuuuN(String var0) {
      String var1 = vuuuNvNuv(var0);
      return !var1.isEmpty() && vNUvnnVnUvu(var1) == null ? uUnuvNvvNU.add(var1) : false;
   }

   public static void nuUnNvnuUu(String var0) {
      uUnuvNvvNU.remove(vuuuNvNuv(var0));
   }

   static void UuUVuuUu(String var0, long var1) {
      if (uUnuvNvvNU(var0, var1)) {
         nuUnNvnuUu(var0);
      }
   }

   public static boolean C00OOC00oO(vUNVNUnuv var0) {
      if (!uNNnnnuuuN(var0)) {
         return false;
      } else {
         C00OOC00oO.remove(var0);
         if (!UuUVuuUu.contains(var0)) {
            var0.UuuNnUvUuv().UuUVuuUu();
            UuUVuuUu.add(var0);
         }

         if (!uNNnnnuuuN(var0)) {
            UuUVuuUu.remove(var0);
            return false;
         } else {
            return true;
         }
      }
   }

   public static void uUnuvNvvNU(vUNVNUnuv var0) {
      if (var0 != null) {
         class_310 var1 = vNVuvnUUnuUn();
         if (var1 != null && !var1.method_18854()) {
            var1.execute(() -> uUnuvNvvNU(var0));
         } else {
            boolean var2 = var0.UnUNVVVNuv();
            if (VVuuUN == var0) {
               vVvUvVVuuNvV();
            }

            if (nUUVuvU == var0) {
               nUUVuvU = null;
               UuuNnUvUuv = false;
            }

            if (UnUNVVVNuv == var0) {
               UnUNVVVNuv = null;
            }

            C00OOC00oO.remove(var0);
            UuUVuuUu.remove(var0);
            if (vNUvnnVnUvu(var0)) {
               nuUnNvnuUu(var0.UuUVuuUu());
            }

            if (var2) {
               try {
                  var0.UuuNnUvUuv().vVvUvVVuuNvV();
               } catch (Throwable var5) {
               }
            }

            try {
               var0.vVvUvVVuuNvV();
            } catch (Throwable var4) {
            }

            var0.UvnvNVnnnnNU();
         }
      }
   }

   public static vUNVNUnuv VVuuUN(String var0) {
      return vNUvnnVnUvu(vuuuNvNuv(var0));
   }

   public static List<vUNVNUnuv> uNNnnnuuuN() {
      ArrayList var0 = new ArrayList(UuUVuuUu.size() + C00OOC00oO.size());
      var0.addAll(UuUVuuUu);

      for (vUNVNUnuv var2 : C00OOC00oO) {
         if (!var0.contains(var2)) {
            var0.add(var2);
         }
      }

      return List.copyOf(var0);
   }

   public static void nuUnNvnuUu() {
      for (vUNVNUnuv var1 : C00OOC00oO) {
         nuUnNvnuUu(var1);
      }

      for (vUNVNUnuv var3 : UuUVuuUu) {
         if (nuUnNvnuUu(var3) && UuUVuuUu.contains(var3) && var3 != VVuuUN) {
            VVuuUN(var3);
         }
      }

      if (VVuuUN != null) {
         UvnvNVnnnnNU();
      }
   }

   private static void UvnvNVnnnnNU() {
      class_746 var0 = uVUuuVnNVU;
      if (var0 != null) {
         class_634 var1 = var0.field_3944;
         if (var1 != null) {
            class_2535 var2 = var1.method_48296();
            if (var2 != null && var2.method_10758()) {
               if (var2.method_10744() == var1) {
                  try {
                     var2.method_10754();
                     if (VVuuUN == null || uVUuuVnNVU != var0) {
                        return;
                     }

                     if (var0.method_6032() <= 0.0F) {
                        if (!nvUVNnuu) {
                           nvUVNnuu = true;
                           var1.method_52787(new class_2799(class_2800.field_12774));
                        }
                     } else {
                        nvUVNnuu = false;
                     }

                     var0.method_5773();
                     UuUVuuUu(var0, var1);
                     var1.method_52787(class_9836.field_52333);
                  } catch (Throwable var5) {
                     var5.printStackTrace();
                     vUNVNUnuv var4 = VVuuUN;
                     if (var4 != null) {
                        OCO0OoO.UuUVuuUu(var4, "§cbackground host tick failed: " + var5.getClass().getSimpleName());
                     }

                     vVvUvVVuuNvV();
                  }
               }
            } else {
               if (var2 != null) {
                  var2.method_10768();
               }

               if (VVuuUN != null) {
                  vVvUvVVuuNvV();
               }
            }
         }
      }
   }

   private static void UuUVuuUu(class_746 var0) {
      vNVuvnUUnuUn = var0.method_23317();
      UvnvNVnnnnNU = var0.method_23318();
      uVUVnuvnuVuv = var0.method_23321();
      NVNnnvnuunNv = var0.method_36454();
      uVunuUNVVUUV = var0.method_36455();
      UNnVVNvvnVvU = var0.method_24828();
      uNnUnnuNUnNu = var0.field_5976;
      NnUuNNU = 0;
   }

   private static void UuUVuuUu(class_746 var0, class_634 var1) {
      double var2 = var0.method_23317() - vNVuvnUUnuUn;
      double var4 = var0.method_23318() - UvnvNVnnnnNU;
      double var6 = var0.method_23321() - uVUVnuvnuVuv;
      double var8 = var0.method_36454() - NVNnnvnuunNv;
      double var10 = var0.method_36455() - uVunuUNVVUUV;
      NnUuNNU++;
      boolean var12 = class_3532.method_41190(var2, var4, var6) > class_3532.method_33723(2.0E-4) || NnUuNNU >= 20;
      boolean var13 = var8 != 0.0 || var10 != 0.0;
      if (var12 && var13) {
         var1.method_52787(
            new class_2830(
               var0.method_23317(), var0.method_23318(), var0.method_23321(), var0.method_36454(), var0.method_36455(), var0.method_24828(), var0.field_5976
            )
         );
      } else if (var12) {
         var1.method_52787(new class_2829(var0.method_23317(), var0.method_23318(), var0.method_23321(), var0.method_24828(), var0.field_5976));
      } else if (var13) {
         var1.method_52787(new class_2831(var0.method_36454(), var0.method_36455(), var0.method_24828(), var0.field_5976));
      } else if (UNnVVNvvnVvU != var0.method_24828() || uNnUnnuNUnNu != var0.field_5976) {
         var1.method_52787(new class_5911(var0.method_24828(), var0.field_5976));
      }

      if (var12) {
         vNVuvnUUnuUn = var0.method_23317();
         UvnvNVnnnnNU = var0.method_23318();
         uVUVnuvnuVuv = var0.method_23321();
         NnUuNNU = 0;
      }

      if (var13) {
         NVNnnvnuunNv = var0.method_36454();
         uVunuUNVVUUV = var0.method_36455();
      }

      UNnVVNvvnVvU = var0.method_24828();
      uNnUnnuNUnNu = var0.field_5976;
   }

   public static void UuUVuuUu(class_2749 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         var1.method_3138(var0.method_11833());
         var1.method_7344().method_7580(var0.method_11831());
         var1.method_7344().method_7581(var0.method_11834());
      }
   }

   public static void UuUVuuUu(class_2664 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         var0.comp_2884().ifPresent(var1::method_45319);
      }
   }

   public static void UuUVuuUu(class_2649 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         if (var0.comp_3837() == 0) {
            var1.field_7498.method_7610(var0.comp_3838(), var0.comp_3839(), var0.comp_3840());
         } else if (var0.comp_3837() == var1.field_7512.field_7763) {
            var1.field_7512.method_7610(var0.comp_3838(), var0.comp_3839(), var0.comp_3840());
         }
      }
   }

   public static void UuUVuuUu(class_2696 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         var1.method_31549().field_7479 = var0.method_11698();
         var1.method_31549().field_7477 = var0.method_11696();
         var1.method_31549().field_7480 = var0.method_11695();
         var1.method_31549().field_7478 = var0.method_11699();
         var1.method_31549().method_7248(var0.method_11690());
         var1.method_31549().method_7250(var0.method_11691());
      }
   }

   public static void UuUVuuUu(class_2668 var0) {
      class_746 var1 = uVUuuVnNVU;
      class_638 var2 = vNUvnnVnUvu;
      class_5402 var3 = var0.method_11491();
      float var4 = var0.method_11492();
      if (var3 == class_2668.field_25648) {
         if (vuuuNvNuv != null) {
            vuuuNvNuv.method_2907(class_1934.method_8384(class_3532.method_15375(var4 + 0.5F)));
         }
      } else if (var2 != null && var3 == class_2668.field_25646) {
         var2.method_28104().method_157(true);
         var2.method_8519(0.0F);
      } else if (var2 != null && var3 == class_2668.field_25647) {
         var2.method_28104().method_157(false);
         var2.method_8519(1.0F);
      } else if (var2 != null && var3 == class_2668.field_25652) {
         var2.method_8519(var4);
      } else if (var2 != null && var3 == class_2668.field_25653) {
         var2.method_8496(var4);
      } else if (var1 != null && var3 == class_2668.field_25656) {
         var1.method_22420(var4 == 0.0F);
      } else if (var1 != null && var3 == class_2668.field_46189) {
         var1.method_53848(var4 == 1.0F);
      }
   }

   public static void UuUVuuUu(class_2735 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null && class_1661.method_7380(var0.comp_3325())) {
         var1.method_31548().method_61496(var0.comp_3325());
      }
   }

   public static void UuUVuuUu(class_2748 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         var1.method_3145(var0.method_11830(), var0.method_11827(), var0.method_11828());
      }
   }

   public static void UuUVuuUu(class_2653 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         if (var0.method_11452() == 0) {
            var1.field_7498.method_7619(var0.method_11450(), var0.method_37439(), var0.method_11449());
         } else if (var1.field_7512.field_7763 == var0.method_11452()) {
            var1.field_7512.method_7619(var0.method_11450(), var0.method_37439(), var0.method_11449());
         }
      }
   }

   public static void UuUVuuUu(class_2651 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null && var1.field_7512.field_7763 == var0.method_11448()) {
         var1.field_7512.method_7606(var0.method_11445(), var0.method_11446());
      }
   }

   public static void UuUVuuUu(class_9834 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         var1.field_7512.method_34254(var0.comp_2890());
      }
   }

   public static void UuUVuuUu(class_9835 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         var1.method_31548().method_5447(var0.comp_2891(), var0.comp_2892());
      }
   }

   public static void VVuuUN() {
      class_746 var0 = uVUuuVnNVU;
      if (var0 != null) {
         var0.field_7512 = var0.field_7498;
      }
   }

   public static void UuUVuuUu(class_2656 var0) {
      class_746 var1 = uVUuuVnNVU;
      if (var1 != null) {
         if (var0.comp_2199() == 0) {
            var1.method_7357().method_7900(var0.comp_3082());
         } else {
            var1.method_7357().method_7906(var0.comp_3082(), var0.comp_2199());
         }
      }
   }

   public static void vNUvnnVnUvu() {
      vUNVNUnuv var0 = VVuuUN;
      if (var0 != null) {
         vVvUvVVuuNvV();
         UnUNVVVNuv = var0;
      }
   }

   public static void uVUuuVnNVU() {
      vUNVNUnuv var0 = UnUNVVVNuv;
      UnUNVVVNuv = null;
      nvUVNnuu = false;
      if (VVuuUN == null && var0 != null && UuUVuuUu.contains(var0) && var0.uNNnnnuuuN() && var0.vuuuNvNuv()) {
         UuUVuuUu(var0);
      }
   }

   public static boolean vuuuNvNuv() {
      return UuuNnUvUuv;
   }

   public static void nvUVNnuu() {
      vUNVNUnuv var0 = VVuuUN;
      if (var0 != null) {
         vVvUvVVuuNvV();
         nUUVuvU = var0;
         UuuNnUvUuv = true;
      }
   }

   public static void UuuNnUvUuv() {
      vUNVNUnuv var0 = nUUVuvU;
      UuuNnUvUuv = false;
      nUUVuvU = null;
      if (VVuuUN == null && var0 != null && UuUVuuUu.contains(var0) && var0.uNNnnnuuuN() && var0.vuuuNvNuv()) {
         class_310 var1 = vNVuvnUUnuUn();
         if (var1 != null) {
            if (var1.field_1755 instanceof class_434) {
               var1.method_1507(null);
            }

            UuUVuuUu(var0);
         }
      }
   }

   public static void C00OOC00oO(class_634 var0) {
      if (!(var0 instanceof nNnnNNnNVvUv)) {
         if (VVuuUN != null && uVUuuVnNVU != null && uVUuuVnNVU.field_3944 == var0) {
            vVvUvVVuuNvV();
         } else {
            uVUVnuvnuVuv();
         }
      }
   }

   public static void nUUVuvU() {
      uVUVnuvnuVuv();
   }

   private static boolean nuUnNvnuUu(vUNVNUnuv var0) {
      try {
         if (var0.uUnuvNvvNU().method_10758()) {
            var0.uUnuvNvvNU().method_10754();
            return true;
         } else {
            var0.uUnuvNvvNU().method_10768();
            uUnuvNvvNU(var0);
            return false;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
         String var2 = "network tick failed: " + var3.getClass().getSimpleName();
         UuUVuuUu(var0, var2);
         OCO0OoO.UuUVuuUu(var0, "§c" + var2);
         uUnuvNvvNU(var0);
         return false;
      }
   }

   private static void VVuuUN(vUNVNUnuv var0) {
      VnUvNVNVNUUn var1 = var0.VVuuUN();
      VNNVunUvvnn var2 = var0.vNUvnnVnUvu();
      class_636 var3 = var0.uVUuuVnNVU();
      if (var1 != null && var2 != null && var3 != null && var0.vuuuNvNuv()) {
         try {
            VVUvVnVVV.UuUVuuUu(var0, () -> {
               if (var2.method_6032() <= 0.0F) {
                  if (!var0.nvUVNnuu()) {
                     var0.C00OOC00oO(true);
                     var0.UuUVuuUu(new class_2799(class_2800.field_12774));
                  }
               } else {
                  var0.C00OOC00oO(false);
               }

               var3.method_2927();
               var1.method_18116();
               var1.method_8441(() -> true);
               var0.UuUVuuUu(class_9836.field_52333);
            });
         } catch (Throwable var6) {
            var6.printStackTrace();
            String var5 = "world tick failed: " + var6.getClass().getSimpleName();
            UuUVuuUu(var0, var5);
            OCO0OoO.UuUVuuUu(var0, "§c" + var5);
            uUnuvNvvNU(var0);
         }
      }
   }

   public static void UnUNVVVNuv() {
      ArrayList var0 = new ArrayList();
      synchronized (vVvUvVVuuNvV) {
         for (nnVNNuuVUVn.VvunVVUvUNnv var3 : uNNnnnuuuN.values()) {
            if (var3.VVuuUN == null && var3.uUnuvNvvNU.UuUVuuUu()) {
               if (var3.vNUvnnVnUvu != null) {
                  var0.add(var3.vNUvnnVnUvu);
                  var3.vNUvnnVnUvu = null;
               }

               var3.nuUnNvnuUu = nuUnNvnuUu.incrementAndGet();
               var3.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.DISCONNECTED, "Connection cancelled");
            }
         }
      }

      for (Thread var9 : var0) {
         var9.interrupt();
      }

      for (vUNVNUnuv var10 : UuUVuuUu) {
         uUnuvNvvNU(var10);
      }

      for (vUNVNUnuv var11 : C00OOC00oO) {
         uUnuvNvvNU(var11);
      }

      UuUVuuUu.clear();
      C00OOC00oO.clear();
      uUnuvNvvNU.clear();
      uVUVnuvnuVuv();
   }

   public static vUNVNUnuv UuUVuuUu(class_1297 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (vUNVNUnuv var2 : UuUVuuUu) {
            if (var2.vNUvnnVnUvu() == var0) {
               return var2;
            }
         }

         return null;
      }
   }

   public static boolean C00OOC00oO(class_1297 var0) {
      for (vUNVNUnuv var2 : UuUVuuUu) {
         if (var2.vNUvnnVnUvu() == var0) {
            return true;
         }
      }

      return false;
   }

   public static class_310 vNVuvnUUnuUn() {
      return class_310.method_1551();
   }

   private static void uVUVnuvnuVuv() {
      UuuNnUvUuv = false;
      nUUVuvU = null;
      UnUNVVVNuv = null;

      for (vUNVNUnuv var1 : UuUVuuUu) {
         var1.uUnuvNvvNU(false);
      }

      for (vUNVNUnuv var3 : C00OOC00oO) {
         var3.uUnuvNvvNU(false);
      }
   }

   private static vUNVNUnuv vNUvnnVnUvu(String var0) {
      if (var0.isEmpty()) {
         return null;
      } else {
         for (vUNVNUnuv var2 : UuUVuuUu) {
            if (vuuuNvNuv(var2.UuUVuuUu()).equals(var0)) {
               return var2;
            }
         }

         for (vUNVNUnuv var4 : C00OOC00oO) {
            if (vuuuNvNuv(var4.UuUVuuUu()).equals(var0)) {
               return var4;
            }
         }

         return null;
      }
   }

   static long C00OOC00oO(String var0, String var1) {
      String var2 = vuuuNvNuv(var0);
      if (!var2.isEmpty() && var1 != null && !var1.isBlank()) {
         long var3;
         synchronized (vVvUvVVuuNvV) {
            nnVNNuuVUVn.VvunVVUvUNnv var6 = uNNnnnuuuN.get(var2);
            if (var6 != null && (var6.VVuuUN != null || var6.uUnuvNvvNU.UuUVuuUu())) {
               return -1L;
            }

            var3 = nuUnNvnuUu.incrementAndGet();
            if (var6 == null) {
               var6 = new nnVNNuuVUVn.VvunVVUvUNnv(var0.trim(), var1.trim(), var3);
               uNNnnnuuuN.put(var2, var6);
            } else {
               var6.UuUVuuUu = var0.trim();
               var6.C00OOC00oO = var1.trim();
               var6.nuUnNvnuUu = var3;
               var6.VVuuUN = null;
               var6.vNUvnnVnUvu = null;
               var6.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.RESOLVING, "Resolving " + var6.C00OOC00oO + " ...");
            }
         }

         VvNvUNnUuUv.C00OOC00oO();
         return var3;
      } else {
         return -1L;
      }
   }

   static boolean C00OOC00oO(String var0, long var1) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var4 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         return var4 != null && var4.nuUnNvnuUu == var1 && var4.uUnuvNvvNU.UuUVuuUu();
      }
   }

   static boolean uUnuvNvvNU(String var0, long var1) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var4 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         return var4 != null && var4.nuUnNvnuUu == var1;
      }
   }

   static boolean vVvUvVVuuNvV(vUNVNUnuv var0) {
      synchronized (vVvUvVVuuNvV) {
         return uVUuuVnNVU(var0) != null;
      }
   }

   static boolean uNNnnnuuuN(vUNVNUnuv var0) {
      synchronized (vVvUvVVuuNvV) {
         return var0 != null && !var0.vNVuvnUUnuUn() && var0.uNNnnnuuuN() && uVUuuVnNVU(var0) != null;
      }
   }

   static boolean UuUVuuUu(String var0, long var1, Thread var3) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var5 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var5 != null && var5.nuUnNvnuUu == var1 && var5.uUnuvNvvNU.UuUVuuUu()) {
            var5.vNUvnnVnUvu = var3;
            return true;
         } else {
            return false;
         }
      }
   }

   static void C00OOC00oO(String var0, long var1, Thread var3) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var5 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var5 != null && var5.nuUnNvnuUu == var1 && var5.vNUvnnVnUvu == var3) {
            var5.vNUvnnVnUvu = null;
         }
      }
   }

   static boolean UuUVuuUu(String var0, long var1, vUNVNUnuv var3) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var5 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var5 != null
            && var5.nuUnNvnuUu == var1
            && var5.uUnuvNvvNU.UuUVuuUu()
            && var5.VVuuUN == null
            && var3 != null
            && !var3.vNVuvnUUnuUn()
            && vNUvnnVnUvu(vuuuNvNuv(var0)) == null) {
            var5.VVuuUN = var3;
            var5.uNNnnnuuuN = System.currentTimeMillis();
            if (!C00OOC00oO.contains(var3)) {
               C00OOC00oO.add(var3);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   static void UuUVuuUu(String var0, long var1, nnVNNuuVUVn.nvnNNunvv var3, String var4) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var6 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var6 != null && var6.nuUnNvnuUu == var1 && var6.uUnuvNvvNU.UuUVuuUu() && var6.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
            var6.UuUVuuUu(var3, var4);
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void UuUVuuUu(String var0, long var1, String var3) {
      Object var4 = vVvUvVVuuNvV;
      synchronized (vVvUvVVuuNvV){} // $VF: monitorenter 

      try {
         nnVNNuuVUVn.VvunVVUvUNnv var5 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var5 != null && var5.nuUnNvnuUu == var1) {
            if (var5.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
               var5.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.ERROR, var3);
            }

            // $VF: monitorexit
         } else {
            // $VF: monitorexit
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void UuUVuuUu(vUNVNUnuv var0, nnVNNuuVUVn.nvnNNunvv var1, String var2) {
      Object var3 = vVvUvVVuuNvV;
      synchronized (vVvUvVVuuNvV){} // $VF: monitorenter 

      try {
         nnVNNuuVUVn.VvunVVUvUNnv var4 = uVUuuVnNVU(var0);
         if (var4 != null && (var4.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR || var1 == nnVNNuuVUVn.nvnNNunvv.ERROR)) {
            var4.UuUVuuUu(var1, var2);
            // $VF: monitorexit
         } else {
            // $VF: monitorexit
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void UuUVuuUu(vUNVNUnuv var0, String var1) {
      Object var2 = vVvUvVVuuNvV;
      synchronized (vVvUvVVuuNvV){} // $VF: monitorenter 

      try {
         nnVNNuuVUVn.VvunVVUvUNnv var3 = uVUuuVnNVU(var0);
         if (var3 != null && var3.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
            var3.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.ERROR, var1);
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   static void C00OOC00oO(vUNVNUnuv var0, String var1) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var3 = uVUuuVnNVU(var0);
         if (var3 != null && var3.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
            var3.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.DISCONNECTED, var1);
         }
      }
   }

   static void uUnuvNvvNU(String var0, String var1) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var3 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var3 != null && var3.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
            var3.UuUVuuUu(var1);
         }
      }
   }

   static void C00OOC00oO(String var0, long var1, String var3) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var5 = uNNnnnuuuN.get(vuuuNvNuv(var0));
         if (var5 != null && var5.nuUnNvnuUu == var1 && var5.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
            var5.UuUVuuUu(var3);
         }
      }
   }

   static void uUnuvNvvNU(vUNVNUnuv var0, String var1) {
      synchronized (vVvUvVVuuNvV) {
         nnVNNuuVUVn.VvunVVUvUNnv var3 = uVUuuVnNVU(var0);
         if (var3 != null && var3.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR) {
            var3.UuUVuuUu(var1);
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean vNUvnnVnUvu(vUNVNUnuv var0) {
      Object var1 = vVvUvVVuuNvV;
      synchronized (vVvUvVVuuNvV){} // $VF: monitorenter 

      try {
         nnVNNuuVUVn.VvunVVUvUNnv var2 = uVUuuVnNVU(var0);
         if (var2 == null) {
            // $VF: monitorexit
            return false;
         } else {
            var2.nuUnNvnuUu = nuUnNvnuUu.incrementAndGet();
            var2.VVuuUN = null;
            var2.vNUvnnVnUvu = null;
            if (var2.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.ERROR && var2.uUnuvNvvNU != nnVNNuuVUVn.nvnNNunvv.DISCONNECTED) {
               var2.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.DISCONNECTED, "Disconnected");
            } else {
               var2.uNNnnnuuuN = System.currentTimeMillis();
            }

            // $VF: monitorexit
            return true;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   private static nnVNNuuVUVn.VvunVVUvUNnv uVUuuVnNVU(vUNVNUnuv var0) {
      if (var0 == null) {
         return null;
      } else {
         nnVNNuuVUVn.VvunVVUvUNnv var1 = uNNnnnuuuN.get(vuuuNvNuv(var0.UuUVuuUu()));
         return var1 != null && var1.VVuuUN == var0 ? var1 : null;
      }
   }

   static String uVUuuVnNVU(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)\\u00A7[0-9A-FK-OR]", "").trim();
   }

   private static String vuuuNvNuv(String var0) {
      return var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
   }

   public record NVnVnNnN(String name, String address, nnVNNuuVUVn.nvnNNunvv state, String status, long updatedAt, vUNVNUnuv bot) {
      public boolean isOnline() {
         return this.bot != null && this.bot.uNNnnnuuuN() && this.bot.vuuuNvNuv();
      }

      public boolean isConnecting() {
         return this.state.UuUVuuUu();
      }
   }

   static final class VvunVVUvUNnv {
      String UuUVuuUu;
      String C00OOC00oO;
      nnVNNuuVUVn.nvnNNunvv uUnuvNvvNU;
      private String vVvUvVVuuNvV;
      long uNNnnnuuuN;
      long nuUnNvnuUu;
      vUNVNUnuv VVuuUN;
      Thread vNUvnnVnUvu;

      VvunVVUvUNnv(String var1, String var2, long var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.nuUnNvnuUu = var3;
         this.uUnuvNvvNU = nnVNNuuVUVn.nvnNNunvv.RESOLVING;
         this.vVvUvVVuuNvV = "Resolving " + var2 + " ...";
         this.uNNnnnuuuN = System.currentTimeMillis();
      }

      static nnVNNuuVUVn.VvunVVUvUNnv UuUVuuUu(String var0, String var1) {
         nnVNNuuVUVn.VvunVVUvUNnv var2 = new nnVNNuuVUVn.VvunVVUvUNnv(var0, var1, 0L);
         var2.UuUVuuUu(nnVNNuuVUVn.nvnNNunvv.SAVED, "Saved profile");
         return var2;
      }

      void UuUVuuUu(nnVNNuuVUVn.nvnNNunvv var1, String var2) {
         this.uUnuvNvvNU = var1;
         this.vVvUvVVuuNvV = nnVNNuuVUVn.uVUuuVnNVU(var2);
         this.uNNnnnuuuN = System.currentTimeMillis();
      }

      void UuUVuuUu(String var1) {
         this.vVvUvVVuuNvV = nnVNNuuVUVn.uVUuuVnNVU(var1);
         this.uNNnnnuuuN = System.currentTimeMillis();
      }

      nnVNNuuVUVn.NVnVnNnN UuUVuuUu() {
         return new nnVNNuuVUVn.NVnVnNnN(this.UuUVuuUu, this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV, this.uNNnnnuuuN, this.VVuuUN);
      }
   }

   public static enum nvnNNunvv {
      SAVED,
      RESOLVING,
      CONNECTING,
      LOGIN,
      CONFIGURING,
      JOINED,
      RECONFIGURING,
      DISCONNECTED,
      ERROR;

      public boolean UuUVuuUu() {
         return this == RESOLVING || this == CONNECTING || this == LOGIN || this == CONFIGURING || this == RECONFIGURING;
      }
   }
}
