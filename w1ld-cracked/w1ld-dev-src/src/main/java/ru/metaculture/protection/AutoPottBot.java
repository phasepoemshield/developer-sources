package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1708;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1842;
import net.minecraft.class_1844;
import net.minecraft.class_1847;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2589;
import net.minecraft.class_2595;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_3965;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "AutoPottBot",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = ""
)
public class AutoPottBot extends Module {
   private static final long unNNVVNnvvV = 20000L;
   private static final long NuunnvnN = 1500L;
   private static final long NVUunUNUN = 4000L;
   private static final long UUVNuUNUvUnV = 1600L;
   private static final long vuvnUnVnUNnV = 8000L;
   private static final long nnuUVNUuvvVU = 15000L;
   private static final int nVVUuvuNnUN = 3;
   private static final int nNnVnUNVV = 4;
   private static final int nuunNvv = 5;
   private static final int uUVVvVVNvvn = 3;
   private static final int vvUVNVvvNUv = 3;
   private static final int UuNnnVnuNNV = 5;
   public static volatile boolean NVNnnvnuunNv;
   public static volatile String uVunuUNVVUUV = "—";
   public static volatile int UNnVVNvvnVvU;
   public static volatile int uNnUnnuNUnNu;
   public static volatile int NnUuNNU;
   public static volatile int nNvNUVU;
   public static volatile int UnUNuUU;
   public static volatile int uUVuVvuNUvnu;
   public static volatile int[] UvUvUNuvNU = new int[7];
   public static volatile List<AutoPottBot.VUnuUnnuNvVu> c0oOOCcCoC0 = List.of();
   public static volatile List<String> VVnVNnunVvu = List.of();
   private final vvNnnUNnVvn uUVvnUuNvvN = new vvNnnUNnVvn("Зелье силы", true);
   private final vvNnnUNnVvn UUuUnNVNuuv = new vvNnnUNnVvn("Зелье скорости", false);
   private final vvNnnUNnVvn NVuNUuVnVUN = new vvNnnUNnVvn("Зелье огнестойкости", false);
   private final VUVnvvnNN NVuunNnvvvVu = new VUVnvvnNN("Варить", this.uUVvnUuNvvN, this.UUuUnNVNuuv, this.NVuNUuVnVUN);
   private final nNUuNvVn vNnNuuvVn = new nNUuNvVn("Задержка кликов", 120.0F, 30.0F, 600.0F, 10.0F, false);
   private final nNUuNvVn VUuuVUnun = new nNUuNvVn("Радиус варок", 4.5F, 2.0F, 6.0F, 0.5F, false);
   private final vvNnnUNnVvn vVVuuVVv = new vvNnnUNnVvn("Наполнять бутылки", true);
   private final nNUuNvVn VuunNUUUvu = new nNUuNvVn("Буфер воды", 12.0F, 3.0F, 24.0F, 1.0F, false);
   private final vvNnnUNnVvn NNUUNUuVNNVn = new vvNnnUNnVvn("Складывать в сундук", true);
   private final VuNvNNvVV VvVvnNUnvuvV = new VuNvNNvVV();
   private final VuNvNNvVV ccOO0COcoco0 = new VuNvNNvVV();
   private final Map<class_2338, AutoPottBot.nvUnvV> NUVvUUVuVNVv = new LinkedHashMap<>();
   private final Map<String, Long> nNuVunNUVu = new HashMap<>();
   private AutoPottBot.nvnNNunvv UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
   private class_2338 UnvuVuVnNuvu;
   private class_2338 UvNNVUVNVuvV;
   private class_2338 NnunUUnU;
   private int nvuVvuNnNUnv;
   private int NnVnNVN;
   private int vnvvNvUnVv;
   private long OCOocoOoOO;
   private int o0Ooc0COOoc;

   public AutoPottBot() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVuunNnvvvVu, this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv, this.VuunNUUUvu, this.NNUUNUuVNNVn});
   }

   @Override
   public void UuUVuuUu() {
      this.UuuNnUvUuv();
      NVNnnvnuunNv = true;
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      NVNnnvnuunNv = false;
      if (uUnuvNvvNU.field_1724 != null && (uUnuvNvvNU.field_1724.field_7512 instanceof class_1708 || uUnuvNvvNU.field_1724.field_7512 instanceof class_1707)) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      this.UuuNnUvUuv();
      super.C00OOC00oO();
   }

   private void UuuNnUvUuv() {
      this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      this.UnvuVuVnNuvu = null;
      this.UvNNVUVNVuvV = null;
      this.NnunUUnU = null;
      this.OCOocoOoOO = 0L;
      this.NnVnNVN = 0;
      this.o0Ooc0COOoc = 0;
      this.NUVvUUVuVNVv.clear();
      this.nNuVunNUVu.clear();
      this.VvVvnNUnvuvV.UuUVuuUu();
      this.ccOO0COcoco0.UuUVuuUu();
      c0oOOCcCoC0 = List.of();
      VVnVNnunVvu = List.of();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         this.nUUVuvU();
         switch (this.UNvvunVVn) {
            case SCAN:
               this.UnUNVVVNuv();
               break;
            case OPENING:
               this.UvnvNVnnnnNU();
               break;
            case SERVICING:
               this.uVUVnuvnuVuv();
               break;
            case CLOSING:
               this.NVNnnvnuunNv();
               break;
            case FILL_WATER:
               this.uVunuUNVVUUV();
               break;
            case DEPOSIT_OPEN:
               this.UnUNuUU();
               break;
            case DEPOSIT_MOVE:
               this.uUVuVvuNUvnu();
         }

         this.nVVUuvuNnUN();
      }
   }

   private void nUUVuvU() {
      long var1 = System.currentTimeMillis();
      int var3 = (int)Math.ceil(this.VUuuVUnun.uUnuvNvvNU() + 4.0);
      class_2338 var4 = uUnuvNvvNU.field_1724.method_24515();

      for (int var5 = -var3; var5 <= var3; var5++) {
         for (int var6 = -var3; var6 <= var3; var6++) {
            for (int var7 = -var3; var7 <= var3; var7++) {
               class_2338 var8 = var4.method_10069(var5, var6, var7);
               if (uUnuvNvvNU.field_1687.method_8321(var8) instanceof class_2589) {
                  AutoPottBot.nvUnvV var9 = this.NUVvUUVuVNVv.get(var8);
                  if (var9 == null) {
                     this.NUVvUUVuVNVv.put(var8.method_10062(), new AutoPottBot.nvUnvV(var8.method_10062()));
                  } else {
                     var9.vuuuNvNuv = var1;
                  }
               }
            }
         }
      }

      Iterator var10 = this.NUVvUUVuVNVv.entrySet().iterator();

      while (var10.hasNext()) {
         AutoPottBot.nvUnvV var11 = (AutoPottBot.nvUnvV)((Entry)var10.next()).getValue();
         if (uUnuvNvvNU.field_1687.method_8321(var11.UuUVuuUu) instanceof class_2589) {
            var11.vuuuNvNuv = var1;
         } else if (var1 - var11.vuuuNvNuv > 8000L) {
            var10.remove();
         }
      }
   }

   private void UnUNVVVNuv() {
      if (!(uUnuvNvvNU.field_1724.field_7512 instanceof class_1708) && !(uUnuvNvvNU.field_1724.field_7512 instanceof class_1707)) {
         if (this.NNUUNUuVNNVn.uUnuvNvvNU() && this.NVUunUNUN() <= 3 && this.UUVNuUNUvUnV() > 0) {
            class_2338 var1 = this.nnuUVNUuvvVU();
            if (var1 != null) {
               this.UvNNVUVNVuvV = var1;
               this.UNvvunVVn = AutoPottBot.nvnNNunvv.DEPOSIT_OPEN;
               this.ccOO0COcoco0.UuUVuuUu();
               this.VvVvnNUnvuvV.UuUVuuUu();
               return;
            }
         }

         if (this.vVVuuVVv.uUnuvNvvNU()
            && this.C00OOC00oO(class_1802.field_8469) > 0
            && this.vuvnUnVnUNnV() < 3
            && System.currentTimeMillis() >= this.OCOocoOoOO) {
            int var7 = this.UNnVVNvvnVvU();
            int var2 = this.vuvnUnVnUNnV();
            int var3 = Math.min((int)this.VuunNUUUvu.uUnuvNvvNU(), Math.max(3, var7));
            int var4 = Math.max(0, this.NVUunUNUN() - 5);
            int var5 = Math.min(var3, var2 + var4);
            if (var7 > 0 && var5 > var2) {
               class_2338 var6 = this.uNnUnnuNUnNu();
               if (var6 != null) {
                  if (this.NnUuNNU()) {
                     this.NnunUUnU = var6;
                     this.nvuVvuNnNUnv = var5;
                     this.NnVnNVN = 0;
                     this.vnvvNvUnVv = var2;
                     this.UNvvunVVn = AutoPottBot.nvnNNunvv.FILL_WATER;
                     this.VvVvnNUnvuvV.UuUVuuUu();
                     return;
                  }

                  this.UuUVuuUu("Бутылочки в хотбар");
               }
            }
         }

         AutoPottBot.nvUnvV var8 = this.vNVuvnUUnuUn();
         if (var8 != null) {
            this.UnvuVuVnNuvu = var8.UuUVuuUu;
            this.UNvvunVVn = AutoPottBot.nvnNNunvv.OPENING;
            this.ccOO0COcoco0.UuUVuuUu();
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      } else {
         uUnuvNvvNU.field_1724.method_7346();
      }
   }

   private AutoPottBot.nvUnvV vNVuvnUUnuUn() {
      long var1 = System.currentTimeMillis();
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571();
      double var4 = this.VUuuVUnun.uUnuvNvvNU() * this.VUuuVUnun.uUnuvNvvNU();
      boolean var6 = this.unNNVVNnvvV();
      AutoPottBot.nvUnvV var7 = null;
      int var8 = -1;
      double var9 = Double.MAX_VALUE;

      for (AutoPottBot.nvUnvV var12 : this.NUVvUUVuVNVv.values()) {
         double var13 = class_243.method_24953(var12.UuUVuuUu).method_1025(var3);
         if (!(var13 > var4) && var1 >= var12.uVUuuVnNVU && (!var12.nuUnNvnuUu || var1 >= var12.vNUvnnVnUvu)) {
            int var15 = this.UuUVuuUu(var12, var6);
            if (var15 > 0 && (var15 > var8 || var15 == var8 && var13 < var9)) {
               var7 = var12;
               var8 = var15;
               var9 = var13;
            }
         }
      }

      return var7;
   }

   private int UuUVuuUu(AutoPottBot.nvUnvV var1, boolean var2) {
      return switch (var1.uUnuvNvvNU) {
         case UNKNOWN -> 2;
         case EMPTY -> var2 ? 1 : 0;
         case WATER, AWKWARD, BASE -> 3;
         case FINAL -> 4;
         default -> 0;
      };
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1708) {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SERVICING;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else if (this.UnvuVuVnNuvu == null || !(uUnuvNvvNU.field_1687.method_8321(this.UnvuVuVnNuvu) instanceof class_2589)) {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      } else if (this.ccOO0COcoco0.nuUnNvnuUu(1600L)) {
         AutoPottBot.nvUnvV var1 = this.NUVvUUVuVNVv.get(this.UnvuVuVnNuvu);
         if (var1 != null) {
            var1.uVUuuVnNVU = System.currentTimeMillis() + 4500L;
         }

         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      } else {
         if (this.VvVvnNUnvuvV.nuUnNvnuUu(450L)) {
            this.uUnuvNvvNU(this.UnvuVuVnNuvu);
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void uVUVnuvnuVuv() {
      if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1708 var1) {
         AutoPottBot.nvUnvV var6 = this.NUVvUUVuVNVv.get(this.UnvuVuVnNuvu);
         if (var6 == null) {
            this.UNvvunVVn = AutoPottBot.nvnNNunvv.CLOSING;
         } else if (this.VvVvnNUnvuvV.nuUnNvnuUu((long)this.vNnNuuvVn.uUnuvNvvNU())) {
            this.VvVvnNUnvuvV.UuUVuuUu();
            AutoPottBot.NVnVnNnN var3 = this.UuUVuuUu(var1, var6);
            switch (var3) {
               case CONTINUE:
               default:
                  break;
               case BREW_STARTED:
                  long var7 = System.currentTimeMillis();
                  var6.nuUnNvnuUu = true;
                  var6.VVuuUN = var7;
                  var6.vNUvnnVnUvu = var7 + 20000L;
                  var6.uVUuuVnNVU = var6.vNUvnnVnUvu;
                  this.UNvvunVVn = AutoPottBot.nvnNNunvv.CLOSING;
                  break;
               case DONE:
                  long var4 = var6.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.EMPTY ? 4000L : 1500L;
                  var6.uVUuuVnNVU = System.currentTimeMillis() + var4;
                  this.UNvvunVVn = AutoPottBot.nvnNNunvv.CLOSING;
            }
         }
      } else {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      }
   }

   private AutoPottBot.NVnVnNnN UuUVuuUu(class_1708 var1, AutoPottBot.nvUnvV var2) {
      boolean var3 = !var1.method_7611(3).method_7677().method_7960();
      int var4 = this.C00OOC00oO(var1, var2);
      boolean var5 = var4 >= 0;
      var2.vVvUvVVuuNvV = var5;
      var2.uNNnnnuuuN = var5 ? Math.min(3, var4 + (var3 ? 1 : 0)) : 0;
      var2.uUnuvNvvNU = this.UuUVuuUu(var4, var3);
      if (var3) {
         var2.nuUnNvnuUu = true;
         if (var2.vNUvnnVnUvu == 0L) {
            var2.VVuuUN = System.currentTimeMillis();
            var2.vNUvnnVnUvu = var2.VVuuUN + 20000L;
         }

         return AutoPottBot.NVnVnNnN.DONE;
      } else {
         var2.nuUnNvnuUu = false;
         if (var2.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.OTHER) {
            return AutoPottBot.NVnVnNnN.DONE;
         } else if (var2.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.FINAL) {
            if (this.NVUunUNUN() <= 0) {
               return AutoPottBot.NVnVnNnN.DONE;
            } else {
               for (int var10 = 0; var10 < 3; var10++) {
                  if (!var1.method_7611(var10).method_7677().method_7960()) {
                     this.UuUVuuUu(var10);
                  }
               }

               var2.vVvUvVVuuNvV = false;
               var2.uNNnnnuuuN = 0;
               var2.uUnuvNvvNU = AutoPottBot.uunvUUVnuNn.EMPTY;
               return AutoPottBot.NVnVnNnN.CONTINUE;
            }
         } else {
            if (!var5) {
               AutoPottBot.VvunVVUvUNnv var6 = this.NuunnvnN();
               if (var6 == null) {
                  return AutoPottBot.NVnVnNnN.DONE;
               }

               var2.C00OOC00oO = var6;
            }

            if (var1.method_17377() <= 0 && var1.method_7611(4).method_7677().method_7960() && this.UuUVuuUu(class_1802.field_8183, 4)) {
               return AutoPottBot.NVnVnNnN.CONTINUE;
            } else {
               if (this.UuUVuuUu(var1)) {
                  int var8 = this.UuUVuuUu((Predicate<class_1799>)(var1x -> this.UuUVuuUu(var1x, class_1847.field_8991)));
                  if (var8 != -1) {
                     this.UuUVuuUu(var8);
                     return AutoPottBot.NVnVnNnN.CONTINUE;
                  }

                  if (this.C00OOC00oO(var1) == 0) {
                     return AutoPottBot.NVnVnNnN.DONE;
                  }
               }

               AutoPottBot.VvunVVUvUNnv var9 = var2.C00OOC00oO != null ? var2.C00OOC00oO : this.NuunnvnN();
               if (var9 == null) {
                  return AutoPottBot.NVnVnNnN.DONE;
               } else {
                  var2.C00OOC00oO = var9;

                  class_1792 var7 = switch (var2.uUnuvNvvNU) {
                     case WATER -> class_1802.field_8790;
                     case AWKWARD -> var9.C00OOC00oO;
                     case BASE -> var9.uUnuvNvvNU;
                     default -> null;
                  };
                  if (var7 == null) {
                     return AutoPottBot.NVnVnNnN.DONE;
                  } else if (!this.UuUVuuUu(var7)) {
                     return AutoPottBot.NVnVnNnN.DONE;
                  } else {
                     return this.UuUVuuUu(var7, 3) ? AutoPottBot.NVnVnNnN.BREW_STARTED : AutoPottBot.NVnVnNnN.DONE;
                  }
               }
            }
         }
      }
   }

   private void NVNnnvnuunNv() {
      uUnuvNvvNU.field_1724.method_7346();
      this.UnvuVuVnNuvu = null;
      this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
   }

   private void uVunuUNVVUUV() {
      if (!(uUnuvNvvNU.field_1724.field_7512 instanceof class_1708) && !(uUnuvNvvNU.field_1724.field_7512 instanceof class_1707)) {
         if (this.vuvnUnVnUNnV() < this.nvuVvuNnNUnv && this.C00OOC00oO(class_1802.field_8469) > 0) {
            if (this.NnVnNVN > this.nvuVvuNnNUnv * 2 + 20) {
               if (this.vuvnUnVnUNnV() <= this.vnvvNvUnVv) {
                  this.OCOocoOoOO = System.currentTimeMillis() + 6000L;
                  this.UuUVuuUu("Источник воды недосягаем");
               }

               this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
            } else {
               if (this.NnunUUnU == null || !this.UuUVuuUu(this.NnunUUnU)) {
                  this.NnunUUnU = this.uNnUnnuNUnNu();
                  if (this.NnunUUnU == null) {
                     this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
                     return;
                  }
               }

               if (!this.nNvNUVU()) {
                  this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
               } else if (this.VvVvnNUnvuvV.nuUnNvnuUu((long)this.vNnNuuvVn.uUnuvNvvNU())) {
                  this.VvVvnNUnvuvV.UuUVuuUu();
                  this.C00OOC00oO(this.NnunUUnU);
                  uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
                  this.NnVnNVN++;
               }
            }
         } else {
            this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
         }
      } else {
         uUnuvNvvNU.field_1724.method_7346();
      }
   }

   private int UNnVVNvvnVvU() {
      int var1 = 0;

      for (AutoPottBot.nvUnvV var3 : this.NUVvUUVuVNVv.values()) {
         if (var3.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.EMPTY || var3.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.UNKNOWN) {
            var1++;
         }
      }

      return var1 * 3;
   }

   private class_2338 uNnUnnuNUnNu() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      int var2 = (int)Math.ceil(this.VUuuVUnun.uUnuvNvvNU());
      double var3 = this.VUuuVUnun.uUnuvNvvNU() * this.VUuuVUnun.uUnuvNvvNU();
      class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
      class_2338 var6 = null;
      double var7 = Double.MAX_VALUE;

      for (int var9 = -var2; var9 <= var2; var9++) {
         for (int var10 = -var2; var10 <= var2; var10++) {
            for (int var11 = -var2; var11 <= var2; var11++) {
               class_2338 var12 = var1.method_10069(var9, var10, var11);
               if (this.UuUVuuUu(var12)) {
                  double var13 = class_243.method_24953(var12).method_1025(var5);
                  if (var13 <= var3 && var13 < var7) {
                     var7 = var13;
                     var6 = var12.method_10062();
                  }
               }
            }
         }
      }

      return var6;
   }

   private boolean UuUVuuUu(class_2338 var1) {
      class_3610 var2 = uUnuvNvvNU.field_1687.method_8316(var1);
      return var2.method_15771() && var2.method_15767(class_3486.field_15517);
   }

   private boolean NnUuNNU() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7909() == class_1802.field_8469) {
            return true;
         }
      }

      return false;
   }

   private boolean nNvNUVU() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7909() == class_1802.field_8469) {
            if (uUnuvNvvNU.field_1724.method_31548().method_67532() != var1) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            }

            return true;
         }
      }

      return false;
   }

   private void C00OOC00oO(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.method_10263() + 0.5 - var2.field_1352;
      double var5 = var1.method_10264() + 0.5 - var2.field_1351;
      double var7 = var1.method_10260() + 0.5 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.toDegrees(Math.atan2(var7, var3)) - 90.0);
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      uUnuvNvvNU.field_1724.method_36456(var11);
      uUnuvNvvNU.field_1724.method_36457(Math.max(-90.0F, Math.min(90.0F, var12)));
   }

   private void UuUVuuUu(String var1) {
      long var2 = System.currentTimeMillis();
      Long var4 = this.nNuVunNUVu.get(var1);
      if (var4 == null || var2 - var4 > 15000L) {
         this.nNuVunNUVu.put(var1, var2);
         vVnvuVVUunuv.UuUVuuUu("§8[AutoPottBot] §c" + var1);
      }
   }

   private void UnUNuUU() {
      if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1707) {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.DEPOSIT_MOVE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else if (this.UvNNVUVNVuvV == null || !(uUnuvNvvNU.field_1687.method_8321(this.UvNNVUVNVuvV) instanceof class_2595)) {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      } else if (this.ccOO0COcoco0.nuUnNvnuUu(1600L)) {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      } else {
         if (this.VvVvnNUnvuvV.nuUnNvnuUu(450L)) {
            this.uUnuvNvvNU(this.UvNNVUVNVuvV);
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void uUVuVvuNUvnu() {
      if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1707 var1) {
         if (this.VvVvnNUnvuvV.nuUnNvnuUu((long)this.vNnNuuvVn.uUnuvNvvNU())) {
            this.VvVvnNUnvuvV.UuUVuuUu();
            int var4 = var1.method_17388() * 9;

            for (int var3 = var4; var3 < var1.field_7761.size(); var3++) {
               if (this.uUnuvNvvNU(((class_1735)var1.field_7761.get(var3)).method_7677())) {
                  this.UuUVuuUu(var3, 0, class_1713.field_7794);
                  return;
               }
            }

            uUnuvNvvNU.field_1724.method_7346();
            this.UvNNVUVNVuvV = null;
            this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
         }
      } else {
         this.UNvvunVVn = AutoPottBot.nvnNNunvv.SCAN;
      }
   }

   private List<AutoPottBot.VvunVVUvUNnv> UvUvUNuvNU() {
      ArrayList var1 = new ArrayList(3);
      if (this.uUVvnUuNvvN.uUnuvNvvNU()) {
         var1.add(AutoPottBot.VvunVVUvUNnv.STRENGTH);
      }

      if (this.UUuUnNVNuuv.uUnuvNvvNU()) {
         var1.add(AutoPottBot.VvunVVUvUNnv.SWIFTNESS);
      }

      if (this.NVuNUuVnVUN.uUnuvNvvNU()) {
         var1.add(AutoPottBot.VvunVVUvUNnv.FIRE_RESISTANCE);
      }

      return var1;
   }

   private Map<class_1792, Integer> c0oOOCcCoC0() {
      HashMap var1 = new HashMap();

      for (AutoPottBot.nvUnvV var3 : this.NUVvUUVuVNVv.values()) {
         if (var3.vVvUvVVuuNvV && var3.C00OOC00oO != null) {
            if (var3.uNNnnnuuuN < 1) {
               UuUVuuUu(var1, class_1802.field_8790, 1);
            }

            if (var3.uNNnnnuuuN < 2) {
               UuUVuuUu(var1, var3.C00OOC00oO.C00OOC00oO, 1);
            }

            if (var3.uNNnnnuuuN < 3) {
               UuUVuuUu(var1, var3.C00OOC00oO.uUnuvNvvNU, 1);
            }
         }
      }

      return var1;
   }

   private List<AutoPottBot.VvunVVUvUNnv> VVnVNnunVvu() {
      Map var1 = this.c0oOOCcCoC0();
      int var2 = this.vuvnUnVnUNnV();
      ArrayList var3 = new ArrayList(3);

      for (AutoPottBot.VvunVVUvUNnv var5 : this.UvUvUNuvNU()) {
         int var6 = this.C00OOC00oO(class_1802.field_8790) - var1.getOrDefault(class_1802.field_8790, 0);
         int var7 = this.C00OOC00oO(var5.C00OOC00oO) - var1.getOrDefault(var5.C00OOC00oO, 0);
         int var8 = this.C00OOC00oO(var5.uUnuvNvvNU) - var1.getOrDefault(var5.uUnuvNvvNU, 0);
         if (var2 >= 1 && var6 >= 1 && var7 >= 1 && var8 >= 1) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private boolean unNNVVNnvvV() {
      return !this.VVnVNnunVvu().isEmpty();
   }

   private AutoPottBot.VvunVVUvUNnv NuunnvnN() {
      List var1 = this.VVnVNnunVvu();
      if (var1.isEmpty()) {
         return null;
      } else {
         AutoPottBot.VvunVVUvUNnv var2 = (AutoPottBot.VvunVVUvUNnv)var1.get(Math.floorMod(this.o0Ooc0COOoc, var1.size()));
         this.o0Ooc0COOoc++;
         return var2;
      }
   }

   private int C00OOC00oO(class_1708 var1, AutoPottBot.nvUnvV var2) {
      class_6880 var3 = null;
      int var4 = 0;

      for (int var5 = 0; var5 < 3; var5++) {
         class_1799 var6 = var1.method_7611(var5).method_7677();
         if (var6.method_7909() == class_1802.field_8574) {
            var4++;
            if (var3 == null) {
               var3 = this.C00OOC00oO(var6);
            }
         }
      }

      if (var4 == 0 || var3 == null) {
         return -1;
      } else if (this.UuUVuuUu(var3, class_1847.field_8991)) {
         return 0;
      } else if (this.UuUVuuUu(var3, class_1847.field_8999)) {
         return 1;
      } else {
         for (AutoPottBot.VvunVVUvUNnv var8 : AutoPottBot.VvunVVUvUNnv.values()) {
            if (this.UuUVuuUu(var3, var8.uNNnnnuuuN)) {
               var2.C00OOC00oO = var8;
               return 3;
            }

            if (this.UuUVuuUu(var3, var8.vVvUvVVuuNvV)) {
               var2.C00OOC00oO = var8;
               return 2;
            }
         }

         return -2;
      }
   }

   private AutoPottBot.uunvUUVnuNn UuUVuuUu(int var1, boolean var2) {
      return switch (var1) {
         case -1 -> AutoPottBot.uunvUUVnuNn.EMPTY;
         case 0 -> AutoPottBot.uunvUUVnuNn.WATER;
         case 1 -> AutoPottBot.uunvUUVnuNn.AWKWARD;
         case 2 -> AutoPottBot.uunvUUVnuNn.BASE;
         case 3 -> AutoPottBot.uunvUUVnuNn.FINAL;
         default -> AutoPottBot.uunvUUVnuNn.OTHER;
      };
   }

   private boolean UuUVuuUu(class_1708 var1) {
      for (int var2 = 0; var2 < 3; var2++) {
         if (var1.method_7611(var2).method_7677().method_7960()) {
            return true;
         }
      }

      return false;
   }

   private int C00OOC00oO(class_1708 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 3; var3++) {
         if (!var1.method_7611(var3).method_7677().method_7960()) {
            var2++;
         }
      }

      return var2;
   }

   private boolean UuUVuuUu(class_1792 var1, int var2) {
      int var3 = this.UuUVuuUu((Predicate<class_1799>)(var1x -> var1x.method_7909() == var1));
      if (var3 == -1) {
         return false;
      } else {
         this.UuUVuuUu(var3, 0, class_1713.field_7790);
         this.UuUVuuUu(var2, 1, class_1713.field_7790);
         this.UuUVuuUu(var3, 0, class_1713.field_7790);
         return true;
      }
   }

   private int UuUVuuUu(Predicate<class_1799> var1) {
      class_1703 var2 = uUnuvNvvNU.field_1724.field_7512;

      for (int var3 = 5; var3 < var2.field_7761.size(); var3++) {
         class_1799 var4 = ((class_1735)var2.field_7761.get(var3)).method_7677();
         if (!var4.method_7960() && var1.test(var4)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(class_1792 var1) {
      return this.UuUVuuUu((Predicate<class_1799>)(var1x -> var1x.method_7909() == var1)) != -1;
   }

   private boolean UuUVuuUu(class_1799 var1, class_6880<class_1842> var2) {
      if (var1.method_7909() != class_1802.field_8574) {
         return false;
      } else {
         class_6880 var3 = this.C00OOC00oO(var1);
         return var3 != null && this.UuUVuuUu(var3, var2);
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      return var1.method_7909() == class_1802.field_8574 || var1.method_7909() == class_1802.field_8436 || var1.method_7909() == class_1802.field_8150;
   }

   private class_6880<class_1842> C00OOC00oO(class_1799 var1) {
      class_1844 var2 = (class_1844)var1.method_58694(class_9334.field_49651);
      return var2 != null && !var2.comp_2378().isEmpty() ? (class_6880)var2.comp_2378().get() : null;
   }

   private boolean UuUVuuUu(class_6880<class_1842> var1, class_6880<class_1842> var2) {
      return var1 == var2
         || var1.method_40230().isPresent() && var2.method_40230().isPresent() && ((class_5321)var1.method_40230().get()).equals(var2.method_40230().get());
   }

   private int NVUunUNUN() {
      int var1 = 0;

      for (int var2 = 0; var2 < uUnuvNvvNU.field_1724.method_31548().method_5439(); var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7960()) {
            var1++;
         }
      }

      return var1;
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      if (!this.UuUVuuUu(var1)) {
         return false;
      } else {
         class_6880 var2 = this.C00OOC00oO(var1);
         return var2 == null ? false : !this.UuUVuuUu(var2, class_1847.field_8991) && !this.UuUVuuUu(var2, class_1847.field_8999);
      }
   }

   private int UUVNuUNUvUnV() {
      int var1 = 0;

      for (int var2 = 0; var2 < uUnuvNvvNU.field_1724.method_31548().method_5439(); var2++) {
         if (this.uUnuvNvvNU(uUnuvNvvNU.field_1724.method_31548().method_5438(var2))) {
            var1++;
         }
      }

      return var1;
   }

   private int C00OOC00oO(class_1792 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < uUnuvNvvNU.field_1724.method_31548().method_5439(); var3++) {
         class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
         if (var4.method_7909() == var1) {
            var2 += var4.method_7947();
         }
      }

      return var2;
   }

   private int vuvnUnVnUNnV() {
      int var1 = 0;

      for (int var2 = 0; var2 < uUnuvNvvNU.field_1724.method_31548().method_5439(); var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (var3.method_7909() == class_1802.field_8574) {
            class_6880 var4 = this.C00OOC00oO(var3);
            if (var4 != null && this.UuUVuuUu(var4, class_1847.field_8991)) {
               var1 += var3.method_7947();
            }
         }
      }

      return var1;
   }

   private class_2338 nnuUVNUuvvVU() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      int var2 = (int)Math.ceil(this.VUuuVUnun.uUnuvNvvNU() + 1.0);
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;
      class_243 var6 = uUnuvNvvNU.field_1724.method_33571();

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            for (int var9 = -var2; var9 <= var2; var9++) {
               class_2338 var10 = var1.method_10069(var7, var8, var9);
               if (uUnuvNvvNU.field_1687.method_8321(var10) instanceof class_2595) {
                  double var11 = class_243.method_24953(var10).method_1025(var6);
                  if (var11 < var4) {
                     var4 = var11;
                     var3 = var10.method_10062();
                  }
               }
            }
         }
      }

      return var3;
   }

   private void uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = new class_243(var1.method_10263() + 0.5, var1.method_10264() + 0.5, var1.method_10260() + 0.5);
      class_3965 var3 = new class_3965(var2, class_2350.field_11036, var1, false);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var3);
   }

   private void UuUVuuUu(int var1) {
      this.UuUVuuUu(var1, 0, class_1713.field_7794);
   }

   private void UuUVuuUu(int var1, int var2, class_1713 var3) {
      uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7512.field_7763, var1, var2, var3, uUnuvNvvNU.field_1724);
   }

   private void nVVUuvuNnUN() {
      long var1 = System.currentTimeMillis();
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      ArrayList var6 = new ArrayList(this.NUVvUUVuVNVv.size());

      for (AutoPottBot.nvUnvV var8 : this.NUVvUUVuVNVv.values()) {
         if (var8.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.FINAL) {
            var5++;
         } else if (var8.nuUnNvnuUu && var1 < var8.vNUvnnVnUvu) {
            var3++;
         } else if (var8.uUnuvNvvNU != AutoPottBot.uunvUUVnuNn.OTHER) {
            var4++;
         }

         var6.add(new AutoPottBot.VUnuUnnuNvVu(var8.C00OOC00oO(), var8.UuUVuuUu(), var8.UuUVuuUu(var1), var8.C00OOC00oO(var1)));
      }

      var6.sort((var0, var1x) -> Float.compare(var1x.progress(), var0.progress()));
      UvUvUNuvNU = new int[]{
         this.vuvnUnVnUNnV(),
         this.C00OOC00oO(class_1802.field_8790),
         this.C00OOC00oO(class_1802.field_8183),
         this.C00OOC00oO(class_1802.field_8601),
         this.C00OOC00oO(class_1802.field_8479),
         this.C00OOC00oO(class_1802.field_8135),
         this.C00OOC00oO(class_1802.field_8725)
      };
      uUVuVvuNUvnu = this.C00OOC00oO(class_1802.field_8469);
      UNnVVNvvnVvU = this.NUVvUUVuVNVv.size();
      uNnUnnuNUnNu = var3;
      NnUuNNU = var4;
      nNvNUVU = var5;
      UnUNuUU = this.nNnVnUNVV();
      c0oOOCcCoC0 = var6;
      uVunuUNVVUUV = this.UNvvunVVn.UuUVuuUu;
      VVnVNnunVvu = this.nuunNvv();
      this.uUVVvVVNvvn();
   }

   private int nNnVnUNVV() {
      List var1 = this.UvUvUNuvNU();
      if (var1.isEmpty()) {
         return 0;
      } else {
         Map var2 = this.c0oOOCcCoC0();
         int var3 = this.vuvnUnVnUNnV();
         int var4 = Math.max(0, this.C00OOC00oO(class_1802.field_8790) - var2.getOrDefault(class_1802.field_8790, 0));
         int var5 = 0;

         for (AutoPottBot.VvunVVUvUNnv var7 : var1) {
            int var8 = this.C00OOC00oO(var7.C00OOC00oO) - var2.getOrDefault(var7.C00OOC00oO, 0);
            int var9 = this.C00OOC00oO(var7.uUnuvNvvNU) - var2.getOrDefault(var7.uUnuvNvvNU, 0);
            var5 += Math.max(0, Math.min(var8, var9));
         }

         var5 = Math.min(var5, var4);
         return Math.max(0, Math.min(var3, var5 * 3));
      }
   }

   private List<String> nuunNvv() {
      List var1 = this.UvUvUNuvNU();
      if (var1.isEmpty()) {
         return List.of("Не выбрано зелье");
      } else {
         Map var2 = this.c0oOOCcCoC0();
         ArrayList var3 = new ArrayList();
         if (this.vuvnUnVnUNnV() < 1) {
            boolean var4 = this.vVVuuVVv.uUnuvNvvNU() && this.C00OOC00oO(class_1802.field_8469) > 0;
            if (!var4) {
               var3.add(this.C00OOC00oO(class_1802.field_8469) > 0 ? "Источник воды" : "Вода / Бутылочки");
            }
         }

         if (this.C00OOC00oO(class_1802.field_8790) - var2.getOrDefault(class_1802.field_8790, 0) < 1) {
            var3.add("Адский нарост");
         }

         for (AutoPottBot.VvunVVUvUNnv var5 : var1) {
            if (this.C00OOC00oO(var5.C00OOC00oO) - var2.getOrDefault(var5.C00OOC00oO, 0) < 1) {
               UuUVuuUu(var3, var5.C00OOC00oO.method_63680().getString());
            }

            if (this.C00OOC00oO(var5.uUnuvNvvNU) - var2.getOrDefault(var5.uUnuvNvvNU, 0) < 1) {
               UuUVuuUu(var3, var5.uUnuvNvvNU.method_63680().getString());
            }
         }

         if (this.C00OOC00oO(class_1802.field_8183) <= 0) {
            UuUVuuUu(var3, "Огненный порошок (топливо)");
         }

         return var3;
      }
   }

   private void uUVVvVVNvvn() {
      boolean var1 = false;

      for (AutoPottBot.nvUnvV var3 : this.NUVvUUVuVNVv.values()) {
         if (var3.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.EMPTY || var3.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.UNKNOWN) {
            var1 = true;
            break;
         }
      }

      if (var1 && !VVnVNnunVvu.isEmpty()) {
         long var7 = System.currentTimeMillis();

         for (String var5 : VVnVNnunVvu) {
            Long var6 = this.nNuVunNUVu.get(var5);
            if (var6 == null || var7 - var6 > 15000L) {
               this.nNuVunNUVu.put(var5, var7);
               vVnvuVVUunuv.UuUVuuUu("§8[AutoPottBot] §cНе хватает: §f" + var5);
            }
         }
      }
   }

   private static void UuUVuuUu(Map<class_1792, Integer> var0, class_1792 var1, int var2) {
      var0.merge(var1, var2, Integer::sum);
   }

   private static void UuUVuuUu(List<String> var0, String var1) {
      if (!var0.contains(var1)) {
         var0.add(var1);
      }
   }

   static enum NVnVnNnN {
      CONTINUE,
      BREW_STARTED,
      DONE;
   }

   public record VUnuUnnuNvVu(String name, int color, float progress, String label) {
   }

   static enum VvunVVUvUNnv {
      STRENGTH("Сила", class_1802.field_8183, class_1802.field_8601, class_1847.field_8978, class_1847.field_8993, 14042437),
      SWIFTNESS("Скорость", class_1802.field_8479, class_1802.field_8601, class_1847.field_9005, class_1847.field_8966, 5227511),
      FIRE_RESISTANCE("Огнестойкость", class_1802.field_8135, class_1802.field_8725, class_1847.field_8987, class_1847.field_8969, 16750592);

      final String UuUVuuUu;
      final class_1792 C00OOC00oO;
      final class_1792 uUnuvNvvNU;
      final class_6880<class_1842> vVvUvVVuuNvV;
      final class_6880<class_1842> uNNnnnuuuN;
      final int nuUnNvnuUu;

      private VvunVVUvUNnv(String var3, class_1792 var4, class_1792 var5, class_6880<class_1842> var6, class_6880<class_1842> var7, int var8) {
         this.UuUVuuUu = var3;
         this.C00OOC00oO = var4;
         this.uUnuvNvvNU = var5;
         this.vVvUvVVuuNvV = var6;
         this.uNNnnnuuuN = var7;
         this.nuUnNvnuUu = var8;
      }
   }

   static final class nvUnvV {
      final class_2338 UuUVuuUu;
      AutoPottBot.VvunVVUvUNnv C00OOC00oO;
      AutoPottBot.uunvUUVnuNn uUnuvNvvNU = AutoPottBot.uunvUUVnuNn.UNKNOWN;
      boolean vVvUvVVuuNvV;
      int uNNnnnuuuN;
      boolean nuUnNvnuUu;
      long VVuuUN;
      long vNUvnnVnUvu;
      long uVUuuVnNVU;
      long vuuuNvNuv = System.currentTimeMillis();

      nvUnvV(class_2338 var1) {
         this.UuUVuuUu = var1;
      }

      float UuUVuuUu(long var1) {
         if (this.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.FINAL) {
            return 1.0F;
         } else if (this.nuUnNvnuUu && this.vNUvnnVnUvu > this.VVuuUN) {
            float var3 = (float)(var1 - this.VVuuUN) / (float)(this.vNUvnnVnUvu - this.VVuuUN);
            return var3 < 0.0F ? 0.0F : Math.min(var3, 1.0F);
         } else {
            return 0.0F;
         }
      }

      int UuUVuuUu() {
         if (this.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.FINAL) {
            return 5954680;
         } else {
            return this.C00OOC00oO != null ? this.C00OOC00oO.nuUnNvnuUu : 9868960;
         }
      }

      String C00OOC00oO() {
         return this.C00OOC00oO != null ? this.C00OOC00oO.UuUVuuUu : "—";
      }

      String C00OOC00oO(long var1) {
         if (this.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.FINAL) {
            return this.C00OOC00oO() + " ✓";
         } else if (this.nuUnNvnuUu && var1 < this.vNUvnnVnUvu) {
            return this.C00OOC00oO() + " " + (int)(this.UuUVuuUu(var1) * 100.0F) + "%";
         } else if (this.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.EMPTY) {
            return "Свободна";
         } else {
            return this.uUnuvNvvNU == AutoPottBot.uunvUUVnuNn.UNKNOWN ? "…" : this.C00OOC00oO() + " готова";
         }
      }
   }

   static enum nvnNNunvv {
      SCAN("Поиск"),
      OPENING("Открытие"),
      SERVICING("Загрузка"),
      CLOSING("Закрытие"),
      FILL_WATER("Налив воды"),
      DEPOSIT_OPEN("Сундук"),
      DEPOSIT_MOVE("Разгрузка");

      final String UuUVuuUu;

      private nvnNNunvv(String var3) {
         this.UuUVuuUu = var3;
      }
   }

   static enum uunvUUVnuNn {
      UNKNOWN,
      EMPTY,
      WATER,
      AWKWARD,
      BASE,
      FINAL,
      OTHER;
   }
}
