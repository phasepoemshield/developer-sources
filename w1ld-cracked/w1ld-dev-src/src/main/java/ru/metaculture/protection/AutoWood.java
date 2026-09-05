package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import net.minecraft.class_1268;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2625;
import net.minecraft.class_2627;
import net.minecraft.class_2680;
import net.minecraft.class_3719;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_476;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoWood",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически выращивает и добывает дерево"
)
public class AutoWood extends Module {
   public UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Что добывать", "Тёмный дуб", "Тропик дерево", "Тёмный дуб", "Еловое дерево");
   public UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Что делать с деревом", "Ничего", "Ничего", "Продавать на ауке", "Складывать в сундук");
   public nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Порог дерева", 64.0F, 64.0F, 640.0F, 64.0F, false).UuUVuuUu(() -> this.uVunuUNVVUUV.C00OOC00oO("Ничего"));
   public vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Чинить топор", false);
   public nNUuNvVn NnUuNNU = new nNUuNvVn("Порог для починки топора", 300.0F, 100.0F, 2031.0F, 100.0F, false).UuUVuuUu(() -> !this.uNnUnnuNUnNu.uUnuvNvvNU());
   public vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Пополнять муку из сундука", true);
   public nNUuNvVn UnUNuUU = new nNUuNvVn("Радиус поиска сундуков", 12.0F, 4.0F, 40.0F, 1.0F, false);
   private static final double uUVuVvuNUvnu = 4.5;
   private static final int UvUvUNuvNU = 6;
   private static final int c0oOOCcCoC0 = 64;
   private static final int VVnVNnunVvu = 128;
   private AutoWood.NVnVnNnN unNNVVNnvvV = AutoWood.NVnVnNnN.SETUP;
   private final List<List<class_2338>> NuunnvnN = new ArrayList<>();
   private boolean NVUunUNUN = false;
   private class_2338 UUVNuUNUvUnV = null;
   private int vuvnUnVnUNnV = 0;
   private int nnuUVNUuvvVU = -1;
   private class_2338 nVVUuvuNnUN = null;
   private int nNnVnUNVV = 0;
   private AutoWood.uunvUUVnuNn nuunNvv = AutoWood.uunvUUVnuNn.NONE;
   private int uUVVvVVNvvn = 0;
   private boolean vvUVNVvvNUv = false;
   private boolean UuNnnVnuNNV = false;
   private IBaritone uUVvnUuNvvN;
   private AutoWood.VvunVVUvUNnv UUuUnNVNuuv = AutoWood.VvunVVUvUNnv.NONE;
   private AutoWood.nvnNNunvv NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
   private class_2338 NVuunNnvvvVu = null;
   private boolean vNnNuuvVn = false;
   private boolean VUuuVUnun = false;
   private int vVVuuVVv = 0;
   private boolean VuunNUUUvu = false;
   private int NNUUNUuVNNVn = -1;
   private int VvVvnNUnvuvV = -1;
   private float ccOO0COcoco0 = 0.0F;
   private final VuNvNNvVV NUVvUUVuVNVv = new VuNvNNvVV();
   private final VuNvNNvVV nNuVunNUVu = new VuNvNNvVV();
   private final VuNvNNvVV UNvvunVVn = new VuNvNNvVV();
   private final VuNvNNvVV UnvuVuVnNuvu = new VuNvNNvVV();
   private final VuNvNNvVV UvNNVUVNVuvV = new VuNvNNvVV();
   private final VuNvNNvVV NnunUUnU = new VuNvNNvVV();
   private final VuNvNNvVV nvuVvuNnNUnv = new VuNvNNvVV();
   private final VuNvNNvVV NnVnNVN = new VuNvNNvVV();
   private final VuNvNNvVV vnvvNvUnVv = new VuNvNNvVV();
   private final VuNvNNvVV OCOocoOoOO = new VuNvNNvVV();
   private final Queue<Runnable> o0Ooc0COOoc = new ArrayDeque<>();

   public AutoWood() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.uUVvnUuNvvN = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.unNNVVNnvvV = AutoWood.NVnVnNnN.SETUP;
      this.NuunnvnN.clear();
      this.NVUunUNUN = false;
      this.UUVNuUNUvUnV = null;
      this.vuvnUnVnUNnV = 0;
      this.nnuUVNUuvvVU = -1;
      this.nVVUuvuNnUN = null;
      this.nuunNvv = AutoWood.uunvUUVnuNn.NONE;
      this.uUVVvVVNvvn = 0;
      this.vvUVNVvvNUv = false;
      this.UuNnnVnuNNV = false;
      this.NVuunNnvvvVu();
      this.nNnVnUNVV = 0;
   }

   @Override
   public void C00OOC00oO() {
      if (uUnuvNvvNU.field_1724 != null && this.VuunNUUUvu) {
         try {
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, 45, this.NNUUNUuVNNVn, class_1713.field_7791, uUnuvNvvNU.field_1724);
            if (this.NNUUNUuVNNVn >= 0) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(this.NNUUNUuVNNVn);
            }

            uUnuvNvvNU.field_1724.method_36457(this.ccOO0COcoco0);
         } catch (Exception var2) {
         }
      }

      this.VuunNUUUvu = false;
      if (this.uUVvnUuNvvN != null) {
         this.uUVvnUuNvvN.getPathingBehavior().cancelEverything();
      }

      this.NVuunNnvvvVu();
      this.nuunNvv = AutoWood.uunvUUVnuNn.NONE;
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (!PlayerHelper.UuuNnUvUuv()) {
            if (this.UUuUnNVNuuv != AutoWood.VvunVVUvUNnv.NONE && uUnuvNvvNU.field_1755 instanceof class_476 var2) {
               if (this.UUuUnNVNuuv == AutoWood.VvunVVUvUNnv.DEPOSIT) {
                  this.C00OOC00oO(var2);
               } else {
                  this.UuUVuuUu(var2);
               }
            } else if (this.UUuUnNVNuuv != AutoWood.VvunVVUvUNnv.NONE) {
               this.NuunnvnN();
            } else if (this.nuunNvv != AutoWood.uunvUUVnuNn.NONE) {
               this.nNvNUVU();
            } else if (uUnuvNvvNU.field_1755 == null) {
               if (!this.NVUunUNUN) {
                  this.uVUVnuvnuVuv();
               } else if (this.uNnUnnuNUnNu.uUnuvNvvNU() && this.vNnNuuvVn() != -1) {
                  this.UUuUnNVNuuv = AutoWood.VvunVVUvUNnv.REPAIR;
                  this.unNNVVNnvvV();
               } else if (this.uNnUnnuNUnNu()) {
                  this.nuunNvv = AutoWood.uunvUUVnuNn.EQUIP;
                  this.uUVVvVVNvvn = 0;
               } else if (this.NnUuNNU()) {
                  this.UUuUnNVNuuv = AutoWood.VvunVVUvUNnv.DEPOSIT;
                  this.unNNVVNnvvV();
               } else {
                  this.nNnVnUNVV++;
                  if (this.unNNVVNnvvV == AutoWood.NVnVnNnN.WAIT_FELL || this.nNnVnUNVV >= 2) {
                     switch (this.unNNVVNnvvV) {
                        case FARM:
                           this.NVNnnvnuunNv();
                           break;
                        case WAIT_FELL:
                           this.UNnVVNvvnVvU();
                           break;
                        default:
                           this.unNNVVNnvvV = AutoWood.NVnVnNnN.FARM;
                     }
                  }
               }
            }
         }
      }
   }

   private class_1792 UuuNnUvUuv() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();

      return switch (var1) {
         case "Тропик дерево" -> class_1802.field_17538;
         case "Еловое дерево" -> class_1802.field_17536;
         default -> class_1802.field_17540;
      };
   }

   private class_2248 nUUVuvU() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();

      return switch (var1) {
         case "Тропик дерево" -> class_2246.field_10276;
         case "Еловое дерево" -> class_2246.field_10217;
         default -> class_2246.field_10160;
      };
   }

   private class_2248 UnUNVVVNuv() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();

      return switch (var1) {
         case "Тропик дерево" -> class_2246.field_10306;
         case "Еловое дерево" -> class_2246.field_10037;
         default -> class_2246.field_10010;
      };
   }

   private class_2248 vNVuvnUUnuUn() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();

      return switch (var1) {
         case "Тропик дерево" -> class_2246.field_10335;
         case "Еловое дерево" -> class_2246.field_9988;
         default -> class_2246.field_10035;
      };
   }

   private class_1792 UvnvNVnnnnNU() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();

      return switch (var1) {
         case "Тропик дерево" -> class_1802.field_8125;
         case "Еловое дерево" -> class_1802.field_8684;
         default -> class_1802.field_8652;
      };
   }

   private void uVUVnuvnuVuv() {
      this.NuunnvnN.clear();
      ArrayList var1 = new ArrayList();
      this.UuUVuuUu(this.nUUVuvU(), var1, false);
      this.UuUVuuUu(this.UnUNVVVNuv(), var1, true);
      if (this.NuunnvnN.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§c[AutoWood] §fПоставьте саженцы квадратами 2×2 рядом с собой и включите модуль");
         this.a_();
      } else {
         this.UUVNuUNUvUnV = uUnuvNvvNU.field_1724.method_24515();
         this.NVUunUNUN = true;
         this.unNNVVNnvvV = AutoWood.NVnVnNnN.FARM;
         this.vuvnUnVnUNnV = 0;
         this.nNnVnUNVV = 0;
         vVnvuVVUunuv.UuUVuuUu("§a[AutoWood] §fНайдено площадок 2×2: " + this.NuunnvnN.size());
      }
   }

   private void UuUVuuUu(class_2248 var1, List<class_2338> var2, boolean var3) {
      class_2338 var4 = uUnuvNvvNU.field_1724.method_24515();

      for (class_2338 var6 : class_2338.method_10097(var4.method_10069(-6, -3, -6), var4.method_10069(6, 3, 6))) {
         if (this.UuUVuuUu(var6, var1)) {
            class_2338 var7 = var6.method_10062();
            if (!var3 || uUnuvNvvNU.field_1687.method_8320(var7.method_10074()).method_26204() != var1) {
               List var8 = List.of(var7, var7.method_10078(), var7.method_10072(), var7.method_10078().method_10072());
               boolean var9 = false;

               for (class_2338 var11 : var8) {
                  if (var2.contains(var11)) {
                     var9 = true;
                     break;
                  }
               }

               if (!var9) {
                  boolean var13 = true;

                  for (class_2338 var12 : var8) {
                     if (!this.VVuuUN(var12)) {
                        var13 = false;
                        break;
                     }
                  }

                  if (var13) {
                     this.NuunnvnN.add(new ArrayList<>(var8));
                     var2.addAll(var8);
                  }
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(class_2338 var1, class_2248 var2) {
      return uUnuvNvvNU.field_1687.method_8320(var1).method_26204() == var2
         && uUnuvNvvNU.field_1687.method_8320(var1.method_10078()).method_26204() == var2
         && uUnuvNvvNU.field_1687.method_8320(var1.method_10072()).method_26204() == var2
         && uUnuvNvvNU.field_1687.method_8320(var1.method_10078().method_10072()).method_26204() == var2;
   }

   private void NVNnnvnuunNv() {
      boolean var1 = false;

      for (int var2 = 0; var2 < this.NuunnvnN.size(); var2++) {
         if (this.UuUVuuUu(var2)) {
            var1 = true;
            if (this.C00OOC00oO(var2)) {
               return;
            }
         }
      }

      if (!var1) {
         for (List var3 : this.NuunnvnN) {
            for (class_2338 var5 : var3) {
               class_2680 var6 = uUnuvNvvNU.field_1687.method_8320(var5);
               if (var6.method_26204() != this.nUUVuvU()) {
                  this.UuUVuuUu(var5, var6);
                  return;
               }
            }
         }

         this.nVVUuvuNnUN = null;
         this.uVunuUNVVUUV();
      }
   }

   private boolean UuUVuuUu(int var1) {
      for (class_2338 var3 : this.NuunnvnN.get(var1)) {
         if (uUnuvNvvNU.field_1687.method_8320(var3).method_26204() == this.UnUNVVVNuv()) {
            return true;
         }
      }

      return false;
   }

   private void UuUVuuUu(class_2338 var1, class_2680 var2) {
      if (var2.method_26204() == this.vNVuvnUUnuUn()) {
         this.UuUVuuUu(var1);
      } else {
         this.nVVUuvuNnUN = null;
         if (!var2.method_45474()) {
            if (this.OCOocoOoOO.uNNnnnuuuN(15000L)) {
               vVnvuVVUunuv.UuUVuuUu("§e[AutoWood] §fМесто посадки занято посторонним блоком, жду освобождения");
               this.OCOocoOoOO.UuUVuuUu();
            }
         } else {
            int var3 = this.C00OOC00oO(this.UuuNnUvUuv());
            if (var3 == -1) {
               var3 = this.uUnuvNvvNU(this.UuuNnUvUuv());
            }

            if (var3 == -1) {
               if (this.OCOocoOoOO.uNNnnnuuuN(15000L)) {
                  vVnvuVVUunuv.UuUVuuUu("§e[AutoWood] §fНет саженцев в инвентаре, жду дроп с листвы");
                  this.OCOocoOoOO.UuUVuuUu();
               }
            } else if (this.nuUnNvnuUu(var1.method_10074())) {
               int var4 = uUnuvNvvNU.field_1724.method_31548().method_67532();
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               this.uNNnnnuuuN(var1.method_10074());
               uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
               this.nNnVnUNVV = 0;
            }
         }
      }
   }

   private void UuUVuuUu(class_2338 var1) {
      class_3965 var2 = this.vNUvnnVnUvu(var1);
      if (var2 == null) {
         this.nVVUuvuNnUN = null;
      } else {
         uuUuvNuNVNVU var3 = this.UuUVuuUu(var2.method_17784());
         COC0OCc.UuUVuuUu(var3, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
         if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 6.0F)) {
            if (!var1.equals(this.nVVUuvuNnUN)) {
               uUnuvNvvNU.field_1761.method_2910(var1, var2.method_17780());
               this.nVVUuvuNnUN = var1;
            } else {
               uUnuvNvvNU.field_1761.method_2902(var1, var2.method_17780());
            }

            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         }
      }
   }

   private void uVunuUNVVUUV() {
      if (!this.NuunnvnN.isEmpty()) {
         int var1 = this.NuunnvnN.size();

         for (int var2 = 0; var2 < var1; var2++) {
            int var3 = (this.vuvnUnVnUNnV + var2) % var1;
            class_2338 var4 = null;

            for (class_2338 var6 : this.NuunnvnN.get(var3)) {
               if (uUnuvNvvNU.field_1687.method_8320(var6).method_26204() == this.nUUVuvU()) {
                  var4 = var6;
                  break;
               }
            }

            if (var4 != null) {
               int var7 = this.C00OOC00oO(class_1802.field_8324);
               if (var7 == -1) {
                  var7 = this.uUnuvNvvNU(class_1802.field_8324);
               }

               if (var7 == -1) {
                  if (this.nNvNUVU.uUnuvNvvNU()) {
                     this.UUuUnNVNuuv = AutoWood.VvunVVUvUNnv.BONEMEAL;
                     this.unNNVVNnvvV();
                     return;
                  }

                  vVnvuVVUunuv.UuUVuuUu("§c[AutoWood] §fЗакончилась костная мука — выключаюсь");
                  this.a_();
                  return;
               }

               if (!this.nuUnNvnuUu(var4)) {
                  return;
               }

               int var8 = uUnuvNvvNU.field_1724.method_31548().method_67532();
               uUnuvNvvNU.field_1724.method_31548().method_61496(var7);
               this.uNNnnnuuuN(var4);
               uUnuvNvvNU.field_1724.method_31548().method_61496(var8);
               this.vuvnUnVnUNnV = (var3 + 1) % var1;
               this.nNnVnUNVV = 0;
               return;
            }
         }
      }
   }

   private boolean C00OOC00oO(int var1) {
      class_2338 var2 = null;
      class_3965 var3 = null;

      for (class_2338 var5 : this.NuunnvnN.get(var1)) {
         if (uUnuvNvvNU.field_1687.method_8320(var5).method_26204() == this.UnUNVVVNuv()) {
            class_3965 var6 = this.vNUvnnVnUvu(var5);
            if (var6 != null) {
               var2 = var5;
               var3 = var6;
               break;
            }
         }
      }

      if (var2 == null) {
         return false;
      } else {
         if (!(uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1743)) {
            int var7 = this.VUuuVUnun();
            if (var7 == -1) {
               if (this.OCOocoOoOO.uNNnnnuuuN(15000L)) {
                  vVnvuVVUunuv.UuUVuuUu("§e[AutoWood] §fНет топора в хотбаре, жду");
                  this.OCOocoOoOO.UuUVuuUu();
               }

               return true;
            }

            uUnuvNvvNU.field_1724.method_31548().method_61496(var7);
         }

         uuUuvNuNVNVU var8 = this.UuUVuuUu(var3.method_17784());
         COC0OCc.UuUVuuUu(var8, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
         if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var8) > 6.0F) {
            return true;
         } else {
            uUnuvNvvNU.field_1761.method_2910(var2, var3.method_17780());
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.nnuUVNUuvvVU = var1;
            this.NnunUUnU.UuUVuuUu();
            this.unNNVVNnvvV = AutoWood.NVnVnNnN.WAIT_FELL;
            this.nNnVnUNVV = 0;
            return true;
         }
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.nnuUVNUuvvVU < 0 || this.nnuUVNUuvvVU >= this.NuunnvnN.size()) {
         this.unNNVVNnvvV = AutoWood.NVnVnNnN.FARM;
      } else if (!this.UuUVuuUu(this.nnuUVNUuvvVU)) {
         this.nnuUVNUuvvVU = -1;
         this.unNNVVNnvvV = AutoWood.NVnVnNnN.FARM;
         this.nNnVnUNVV = 0;
      } else {
         if (this.NnunUUnU.uNNnnnuuuN(2000L)) {
            this.unNNVVNnvvV = AutoWood.NVnVnNnN.FARM;
            this.nNnVnUNVV = 0;
         }
      }
   }

   private boolean uNnUnnuNUnNu() {
      if (!this.uVunuUNVVUUV.C00OOC00oO("Продавать на ауке")) {
         return false;
      } else if (this.unNNVVNnvvV != AutoWood.NVnVnNnN.FARM) {
         return false;
      } else {
         if (this.vvUVNVvvNUv) {
            if (!this.NnVnNVN.uNNnnnuuuN(30000L)) {
               return false;
            }

            this.vvUVNVvvNUv = false;
         }

         return this.UuUVuuUu(this.UvnvNVnnnnNU()) >= (int)this.UNnVVNvvnVvU.uUnuvNvvNU();
      }
   }

   private boolean NnUuNNU() {
      if (!this.uVunuUNVVUUV.C00OOC00oO("Складывать в сундук")) {
         return false;
      } else if (this.unNNVVNnvvV != AutoWood.NVnVnNnN.FARM) {
         return false;
      } else {
         if (this.UuNnnVnuNNV) {
            if (!this.vnvvNvUnVv.uNNnnnuuuN(30000L)) {
               return false;
            }

            this.UuNnnVnuNNV = false;
         }

         return this.UuUVuuUu(this.UvnvNVnnnnNU()) >= (int)this.UNnVVNvvnVvU.uUnuvNvvNU();
      }
   }

   private void nNvNUVU() {
      switch (this.nuunNvv) {
         case EQUIP:
            this.UnUNuUU();
            break;
         case COMMAND:
            this.uUVuVvuNUvnu();
            break;
         case CONFIRM:
            this.UvUvUNuvNU();
            break;
         case WAIT_RESULT:
            this.c0oOOCcCoC0();
            break;
         default:
            this.VVnVNnunVvu();
      }
   }

   private void UnUNuUU() {
      if (uUnuvNvvNU.field_1755 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      } else if (this.UuUVuuUu(this.UvnvNVnnnnNU()) < 64) {
         this.VVnVNnunVvu();
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = 0; var3 < 9; var3++) {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
            if (var4.method_7909() == this.UvnvNVnnnnNU() && var4.method_7947() > var2) {
               var1 = var3;
               var2 = var4.method_7947();
            }
         }

         if (var1 != -1) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            if (uUnuvNvvNU.field_1724.method_6047().method_7909() == this.UvnvNVnnnnNU()) {
               this.nuunNvv = AutoWood.uunvUUVnuNn.COMMAND;
               this.nvuVvuNnNUnv.UuUVuuUu();
            }
         } else {
            int var7 = -1;
            var2 = 0;

            for (int var8 = 9; var8 < 36; var8++) {
               class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var8);
               if (var5.method_7909() == this.UvnvNVnnnnNU() && var5.method_7947() > var2) {
                  var7 = var8;
                  var2 = var5.method_7947();
               }
            }

            if (var7 == -1) {
               this.VVnVNnunVvu();
            } else {
               int var9 = this.NUVvUUVuVNVv();
               if (var9 == -1) {
                  var9 = 0;
               }

               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var7, var9, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }
         }
      }
   }

   private void uUVuVvuNUvnu() {
      if (uUnuvNvvNU.field_1724.method_6047().method_7909() != this.UvnvNVnnnnNU()) {
         this.nuunNvv = AutoWood.uunvUUVnuNn.EQUIP;
      } else if (uUnuvNvvNU.field_1755 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      } else {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah sell auto");
         this.nvuVvuNnNUnv.UuUVuuUu();
         this.nuunNvv = AutoWood.uunvUUVnuNn.CONFIRM;
      }
   }

   private void UvUvUNuvNU() {
      if (this.nvuVvuNnNUnv.uNNnnnuuuN(1000L)) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah sell auto confirm");
         this.nvuVvuNnNUnv.UuUVuuUu();
         this.nuunNvv = AutoWood.uunvUUVnuNn.WAIT_RESULT;
      }
   }

   private void c0oOOCcCoC0() {
      if (uUnuvNvvNU.field_1724.method_6047().method_7909() != this.UvnvNVnnnnNU()) {
         this.uUVVvVVNvvn = 0;
         if (this.UuUVuuUu(this.UvnvNVnnnnNU()) >= 64) {
            this.nuunNvv = AutoWood.uunvUUVnuNn.EQUIP;
         } else {
            this.VVnVNnunVvu();
         }
      } else {
         if (this.nvuVvuNnNUnv.uNNnnnuuuN(6000L)) {
            this.uUVVvVVNvvn++;
            if (this.uUVVvVVNvvn >= 3) {
               vVnvuVVUunuv.UuUVuuUu("§c[AutoWood] §fНе удалось продать дерево на аукционе, попробую позже");
               this.vvUVNVvvNUv = true;
               this.NnVnNVN.UuUVuuUu();
               this.VVnVNnunVvu();
            } else {
               this.nuunNvv = AutoWood.uunvUUVnuNn.COMMAND;
               this.nvuVvuNnNUnv.UuUVuuUu();
            }
         }
      }
   }

   private void VVnVNnunVvu() {
      this.nuunNvv = AutoWood.uunvUUVnuNn.NONE;
      this.nNnVnUNVV = 0;
   }

   private void unNNVVNnvvV() {
      this.vNnNuuvVn = false;
      this.VUuuVUnun = false;
      this.vVVuuVVv = 0;
      this.NVuunNnvvvVu = null;
      this.VuunNUUUvu = false;
      this.VvVvnNUnvuvV = -1;
      this.o0Ooc0COOoc.clear();
      this.NUVvUUVuVNVv.UuUVuuUu();
      this.nNuVunNUVu.UuUVuuUu();
      this.UNvvunVVn.UuUVuuUu();
      this.UnvuVuVnNuvu.UuUVuuUu();
      switch (this.UUuUnNVNuuv) {
         case REPAIR:
            this.NVuNUuVnVUN = this.UuUVuuUu(class_1802.field_8287) > 0 ? AutoWood.nvnNNunvv.REPAIRING : AutoWood.nvnNNunvv.FIND_CHEST;
            break;
         case BONEMEAL:
            this.NVuNUuVnVUN = this.VuunNUUUvu() ? AutoWood.nvnNNunvv.CRAFTING : AutoWood.nvnNNunvv.FIND_CHEST;
            break;
         default:
            this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
      }
   }

   private void NuunnvnN() {
      if (uUnuvNvvNU.field_1755 == null || uUnuvNvvNU.field_1755 instanceof class_476) {
         switch (this.NVuNUuVnVUN) {
            case FIND_CHEST:
               this.NVUunUNUN();
               break;
            case GOING:
               this.UUVNuUNUvUnV();
               break;
            case ROTATING:
               this.vuvnUnVnUNnV();
               break;
            case OPENING:
               this.nnuUVNUuvvVU();
               break;
            case WAIT_GUI:
               this.nVVUuvuNnUN();
               break;
            case CRAFTING:
               this.nuunNvv();
               break;
            case REPAIRING:
               this.vvUVNVvvNUv();
               break;
            case RETURNING:
               this.uUVvnUuNvvN();
               break;
            default:
               this.NVuNUuVnVUN();
         }
      }
   }

   private void NVUunUNUN() {
      this.NVuunNnvvvVu = this.C00OOC00oO(this.UUuUnNVNuuv);
      if (this.NVuunNnvvvVu == null) {
         this.C00OOC00oO(
            "§c[AutoWood] §fНе найден сундук «" + this.uUnuvNvvNU(this.UUuUnNVNuuv) + "» в радиусе " + (int)this.UnUNuUU.uUnuvNvvNU() + " бл. — выключаюсь"
         );
      } else {
         if (this.VVuuUN(this.NVuunNnvvvVu) && this.vVvUvVVuuNvV(this.NVuunNnvvvVu)) {
            this.NVuNUuVnVUN = AutoWood.nvnNNunvv.ROTATING;
            this.NUVvUUVuVNVv.UuUVuuUu();
         } else {
            this.vNnNuuvVn = true;
            this.NVuNUuVnVUN = AutoWood.nvnNNunvv.GOING;
            this.nNuVunNUVu.UuUVuuUu();
            this.UNvvunVVn.UuUVuuUu();
         }
      }
   }

   private void UUVNuUNUvUnV() {
      if (this.NVuunNnvvvVu != null && this.uUnuvNvvNU(this.NVuunNnvvvVu)) {
         double var1 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.NVuunNnvvvVu));
         if (var1 <= 4.5 && this.vVvUvVVuuNvV(this.NVuunNnvvvVu)) {
            if (this.uUVvnUuNvvN != null) {
               this.uUVvnUuNvvN.getPathingBehavior().cancelEverything();
            }

            this.NVuNUuVnVUN = AutoWood.nvnNNunvv.ROTATING;
            this.NUVvUUVuVNVv.UuUVuuUu();
         } else {
            if (this.uUVvnUuNvvN != null && (!this.uUVvnUuNvvN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(1500L))) {
               this.uUVvnUuNvvN.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.NVuunNnvvvVu, 2));
               this.nNuVunNUVu.UuUVuuUu();
            }

            if (this.UNvvunVVn.uNNnnnuuuN(15000L)) {
               this.C00OOC00oO("§c[AutoWood] §fНе удалось дойти до сундука «" + this.uUnuvNvvNU(this.UUuUnNVNuuv) + "»");
            }
         }
      } else {
         this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
      }
   }

   private void vuvnUnVnUNnV() {
      if (this.NVuunNnvvvVu == null) {
         this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
      } else {
         if (this.nuUnNvnuUu(this.NVuunNnvvvVu)) {
            this.NVuNUuVnVUN = AutoWood.nvnNNunvv.OPENING;
            this.NUVvUUVuVNVv.UuUVuuUu();
         }
      }
   }

   private void nnuUVNUuvvVU() {
      if (this.NUVvUUVuVNVv.uNNnnnuuuN(200L)) {
         this.uNNnnnuuuN(this.NVuunNnvvvVu);
         this.NVuNUuVnVUN = AutoWood.nvnNNunvv.WAIT_GUI;
         this.NUVvUUVuVNVv.UuUVuuUu();
      }
   }

   private void nVVUuvuNnUN() {
      if (!(uUnuvNvvNU.field_1755 instanceof class_476)) {
         if (this.NUVvUUVuVNVv.uNNnnnuuuN(2500L)) {
            this.vVVuuVVv++;
            if (this.vVVuuVVv > 3) {
               this.C00OOC00oO("§c[AutoWood] §fНе удалось открыть сундук «" + this.uUnuvNvvNU(this.UUuUnNVNuuv) + "»");
            } else {
               this.NVuNUuVnVUN = AutoWood.nvnNNunvv.ROTATING;
               this.NUVvUUVuVNVv.UuUVuuUu();
            }
         }
      }
   }

   private void UuUVuuUu(class_476 var1) {
      class_1707 var2 = (class_1707)var1.method_17577();
      int var3 = var2.field_7761.size() - 36;
      if (var3 <= 0) {
         this.UuUVuuUu("§c[AutoWood] §fСундук «" + this.uUnuvNvvNU(this.UUuUnNVNuuv) + "» пуст — выключаюсь");
      } else if (this.UnvuVuVnNuvu.uNNnnnuuuN(120L)) {
         if (this.UuUVuuUu(this.UUuUnNVNuuv)) {
            this.nNnVnUNVV();
         } else {
            int var4 = this.UuUVuuUu(var2, var3, this.UUuUnNVNuuv);
            if (var4 == -1) {
               if (this.VUuuVUnun) {
                  this.nNnVnUNVV();
               } else {
                  this.UuUVuuUu("§c[AutoWood] §fВ сундуке «" + this.uUnuvNvvNU(this.UUuUnNVNuuv) + "» нет нужных предметов — выключаюсь");
               }
            } else {
               uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.VUuuVUnun = true;
               this.UnvuVuVnNuvu.UuUVuuUu();
            }
         }
      }
   }

   private void C00OOC00oO(class_476 var1) {
      class_1707 var2 = (class_1707)var1.method_17577();
      int var3 = var2.field_7761.size() - 36;
      if (var3 <= 0) {
         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_7346();
         }

         this.UUuUnNVNuuv();
      } else if (this.UnvuVuVnNuvu.uNNnnnuuuN(120L)) {
         for (int var4 = var3; var4 < var2.field_7761.size(); var4++) {
            class_1799 var5 = ((class_1735)var2.field_7761.get(var4)).method_7677();
            if (var5.method_7909() == this.UvnvNVnnnnNU() && this.UuUVuuUu(var2, var3, var5)) {
               uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.VUuuVUnun = true;
               this.UnvuVuVnNuvu.UuUVuuUu();
               return;
            }
         }

         if (!this.VUuuVUnun) {
            this.UuNnnVnuNNV = true;
            this.vnvvNvUnVv.UuUVuuUu();
            vVnvuVVUunuv.UuUVuuUu("§c[AutoWood] §fСундук «лут/дерево» переполнен — некуда складывать, попробую позже");
         }

         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_7346();
         }

         this.UUuUnNVNuuv();
      }
   }

   private boolean UuUVuuUu(class_1707 var1, int var2, class_1799 var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         class_1799 var5 = ((class_1735)var1.field_7761.get(var4)).method_7677();
         if (var5.method_7960()) {
            return true;
         }

         if (var5.method_7909() == var3.method_7909() && var5.method_7947() < var5.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private boolean UuUVuuUu(AutoWood.VvunVVUvUNnv var1) {
      return switch (var1) {
         case REPAIR -> this.UuUVuuUu(class_1802.field_8287) >= 64;
         case BONEMEAL -> this.vVVuuVVv() >= 128;
         default -> true;
      };
   }

   private int UuUVuuUu(class_1707 var1, int var2, AutoWood.VvunVVUvUNnv var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         class_1799 var5 = ((class_1735)var1.field_7761.get(var4)).method_7677();
         if (!var5.method_7960() && this.UuUVuuUu(var5.method_7909(), var3)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(class_1792 var1, AutoWood.VvunVVUvUNnv var2) {
      return switch (var2) {
         case REPAIR -> var1 == class_1802.field_8287;
         case BONEMEAL -> var1 == class_1802.field_8324 || var1 == class_1802.field_8606 || var1 == class_1802.field_8242;
         default -> false;
      };
   }

   private void nNnVnUNVV() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }
      this.NVuNUuVnVUN = switch (this.UUuUnNVNuuv) {
         case REPAIR -> AutoWood.nvnNNunvv.REPAIRING;
         case BONEMEAL -> AutoWood.nvnNNunvv.CRAFTING;
         default -> AutoWood.nvnNNunvv.RETURNING;
      };
      if (this.NVuNUuVnVUN == AutoWood.nvnNNunvv.RETURNING) {
         this.nNuVunNUVu.UuUVuuUu();
         this.UNvvunVVn.UuUVuuUu();
      }

      this.NUVvUUVuVNVv.UuUVuuUu();
      this.UnvuVuVnNuvu.UuUVuuUu();
      this.o0Ooc0COOoc.clear();
   }

   private void UuUVuuUu(String var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      this.C00OOC00oO(var1);
   }

   private void nuunNvv() {
      if (uUnuvNvvNU.field_1755 == null) {
         if (!this.o0Ooc0COOoc.isEmpty()) {
            if (this.UnvuVuVnNuvu.uNNnnnuuuN(90L)) {
               this.o0Ooc0COOoc.poll().run();
               this.UnvuVuVnNuvu.UuUVuuUu();
            }
         } else if (this.UuUVuuUu(class_1802.field_8324) >= 128) {
            this.UUuUnNVNuuv();
         } else {
            int var1 = this.NNUUNUuVNNVn();
            if (var1 == -1) {
               if (this.UuUVuuUu(class_1802.field_8324) == 0) {
                  this.C00OOC00oO("§c[AutoWood] §fКостная мука закончилась и крафтить не из чего — выключаюсь");
               } else {
                  this.UUuUnNVNuuv();
               }
            } else {
               int var2 = uUnuvNvvNU.field_1724.field_7498.field_7763;
               this.o0Ooc0COOoc.add(() -> uUnuvNvvNU.field_1761.method_2906(var2, var1, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
               this.o0Ooc0COOoc.add(() -> uUnuvNvvNU.field_1761.method_2906(var2, 1, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
               this.o0Ooc0COOoc.add(() -> uUnuvNvvNU.field_1761.method_2906(var2, 0, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
               this.o0Ooc0COOoc.add(this::uUVVvVVNvvn);
            }
         }
      }
   }

   private void uUVVvVVNvvn() {
      int var1 = uUnuvNvvNU.field_1724.field_7498.field_7763;

      for (int var2 = 1; var2 <= 4; var2++) {
         if (((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var2)).method_7681()) {
            uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
         }
      }

      if (!uUnuvNvvNU.field_1724.field_7498.method_34255().method_7960()) {
         int var3 = this.VvVvnNUnvuvV();
         if (var3 != -1) {
            uUnuvNvvNU.field_1761.method_2906(var1, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         }
      }
   }

   private void vvUVNVvvNUv() {
      if (uUnuvNvvNU.field_1755 == null) {
         int var1 = uUnuvNvvNU.field_1724.field_7498.field_7763;
         if (!this.VuunNUUUvu) {
            int var4 = this.vNnNuuvVn();
            if (var4 == -1) {
               this.UUuUnNVNuuv();
            } else if (this.UuUVuuUu(class_1802.field_8287) == 0) {
               this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
            } else if (!uUnuvNvvNU.field_1724.method_6079().method_7960()) {
               int var5 = this.VvVvnNUnvuvV();
               if (var5 == -1) {
                  this.C00OOC00oO("§c[AutoWood] §fОсвободите офф-хенд или место в инвентаре для починки");
               } else {
                  uUnuvNvvNU.field_1761.method_2906(var1, 45, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
                  uUnuvNvvNU.field_1761.method_2906(var1, var5, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               }
            } else {
               this.NNUUNUuVNNVn = var4;
               this.ccOO0COcoco0 = uUnuvNvvNU.field_1724.method_36455();
               uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
               uUnuvNvvNU.field_1761.method_2906(var1, 45, var4, class_1713.field_7791, uUnuvNvvNU.field_1724);
               if (!this.UuNnnVnuNNV()) {
                  uUnuvNvvNU.field_1761.method_2906(var1, 45, var4, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
                  this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
               } else {
                  this.VuunNUUUvu = true;
                  this.VvVvnNUnvuvV = -1;
                  this.UvNNVUVNVuvV.UuUVuuUu();
                  this.NUVvUUVuVNVv.UuUVuuUu();
               }
            }
         } else {
            class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
            if (!var2.method_7960() && var2.method_7963() && var2.method_7919() != 0) {
               if (uUnuvNvvNU.field_1724.method_6047().method_7909() != class_1802.field_8287 && !this.UuNnnVnuNNV()) {
                  this.uUnuvNvvNU(var1);
                  this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
               } else {
                  int var3 = var2.method_7919();
                  if (this.VvVvnNUnvuvV == -1) {
                     this.VvVvnNUnvuvV = var3;
                  }

                  if (var3 < this.VvVvnNUnvuvV) {
                     this.VvVvnNUnvuvV = var3;
                     this.UvNNVUVNVuvV.UuUVuuUu();
                  } else if (this.UvNNVUVNVuvV.uNNnnnuuuN(4000L)) {
                     this.uUnuvNvvNU(var1);
                     this.C00OOC00oO("§c[AutoWood] §fТопор не чинится (нет «Починки»?)");
                     return;
                  }

                  if (this.NUVvUUVuVNVv.uNNnnnuuuN(120L)) {
                     uUnuvNvvNU.field_1724.method_36457(90.0F);
                     uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                     this.NUVvUUVuVNVv.UuUVuuUu();
                  }
               }
            } else {
               this.uUnuvNvvNU(var1);
            }
         }
      }
   }

   private void uUnuvNvvNU(int var1) {
      uUnuvNvvNU.field_1761.method_2906(var1, 45, this.NNUUNUuVNNVn, class_1713.field_7791, uUnuvNvvNU.field_1724);
      if (this.NNUUNUuVNNVn >= 0) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.NNUUNUuVNNVn);
      }

      uUnuvNvvNU.field_1724.method_36457(this.ccOO0COcoco0);
      if (!uUnuvNvvNU.field_1724.method_6079().method_7960()) {
         int var2 = this.VvVvnNUnvuvV();
         if (var2 != -1) {
            uUnuvNvvNU.field_1761.method_2906(var1, 45, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         }
      }

      this.VuunNUUUvu = false;
      this.UUuUnNVNuuv();
   }

   private boolean UuNnnVnuNNV() {
      int var1 = this.ccOO0COcoco0();
      if (var1 == -1) {
         return false;
      } else {
         if (var1 >= 36 && var1 <= 44) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1 - 36);
         } else {
            uUnuvNvvNU.field_1761
               .method_2906(
                  uUnuvNvvNU.field_1724.field_7498.field_7763,
                  var1,
                  uUnuvNvvNU.field_1724.method_31548().method_67532(),
                  class_1713.field_7791,
                  uUnuvNvvNU.field_1724
               );
         }

         return true;
      }
   }

   private void uUVvnUuNvvN() {
      if (this.vNnNuuvVn && this.UUVNuUNUvUnV != null && this.uUVvnUuNvvN != null) {
         if (!uUnuvNvvNU.field_1724.method_24515().equals(this.UUVNuUNUvUnV)
            && !(uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.UUVNuUNUvUnV)) <= 0.7)) {
            if (!this.uUVvnUuNvvN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(1500L)) {
               this.uUVvnUuNvvN.getCustomGoalProcess().setGoalAndPath(new GoalBlock(this.UUVNuUNUvUnV));
               this.nNuVunNUVu.UuUVuuUu();
            }

            if (this.UNvvunVVn.uNNnnnuuuN(20000L)) {
               this.uUVvnUuNvvN.getPathingBehavior().cancelEverything();
               this.NVuNUuVnVUN();
            }
         } else {
            this.uUVvnUuNvvN.getPathingBehavior().cancelEverything();
            this.NVuNUuVnVUN();
         }
      } else {
         this.NVuNUuVnVUN();
      }
   }

   private void UUuUnNVNuuv() {
      this.NVuNUuVnVUN = AutoWood.nvnNNunvv.RETURNING;
      this.nNuVunNUVu.UuUVuuUu();
      this.UNvvunVVn.UuUVuuUu();
   }

   private void NVuNUuVnVUN() {
      if (this.uUVvnUuNvvN != null) {
         this.uUVvnUuNvvN.getPathingBehavior().cancelEverything();
      }

      this.NVuunNnvvvVu();
      this.unNNVVNnvvV = AutoWood.NVnVnNnN.FARM;
      this.nNnVnUNVV = 0;
   }

   private void C00OOC00oO(String var1) {
      vVnvuVVUunuv.UuUVuuUu(var1);
      if (this.uUVvnUuNvvN != null) {
         this.uUVvnUuNvvN.getPathingBehavior().cancelEverything();
      }

      this.NVuunNnvvvVu();
      this.a_();
   }

   private void NVuunNnvvvVu() {
      this.UUuUnNVNuuv = AutoWood.VvunVVUvUNnv.NONE;
      this.NVuNUuVnVUN = AutoWood.nvnNNunvv.FIND_CHEST;
      this.NVuunNnvvvVu = null;
      this.vNnNuuvVn = false;
      this.VUuuVUnun = false;
      this.vVVuuVVv = 0;
      this.VuunNUUUvu = false;
      this.NNUUNUuVNNVn = -1;
      this.VvVvnNUnvuvV = -1;
      this.o0Ooc0COOoc.clear();
   }

   private int vNnNuuvVn() {
      if (!this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
            if (!var2.method_7960() && var2.method_7963() && var2.method_7909() instanceof class_1743) {
               int var3 = var2.method_7936() - var2.method_7919();
               if (var3 <= (int)this.NnUuNNU.uUnuvNvvNU()) {
                  return var1;
               }
            }
         }

         return -1;
      }
   }

   private int VUuuVUnun() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7909() instanceof class_1743) {
            return var1;
         }
      }

      return -1;
   }

   private int UuUVuuUu(class_1792 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 36; var3++) {
         class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
         if (var4.method_7909() == var1) {
            var2 += var4.method_7947();
         }
      }

      return var2;
   }

   private int vVVuuVVv() {
      return this.UuUVuuUu(class_1802.field_8324) + this.UuUVuuUu(class_1802.field_8606) * 3 + this.UuUVuuUu(class_1802.field_8242) * 9;
   }

   private boolean VuunNUUUvu() {
      return this.UuUVuuUu(class_1802.field_8606) > 0 || this.UuUVuuUu(class_1802.field_8242) > 0;
   }

   private int NNUUNUuVNNVn() {
      for (int var1 = 9; var1 <= 44; var1++) {
         class_1792 var2 = ((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7677().method_7909();
         if (var2 == class_1802.field_8606 || var2 == class_1802.field_8242) {
            return var1;
         }
      }

      return -1;
   }

   private int VvVvnNUnvuvV() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (!((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7681()) {
            return var1;
         }
      }

      return -1;
   }

   private int ccOO0COcoco0() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7677().method_7909() == class_1802.field_8287) {
            return var1;
         }
      }

      return -1;
   }

   private class_2338 C00OOC00oO(AutoWood.VvunVVUvUNnv var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         class_2338 var2 = this.UUVNuUNUvUnV != null ? this.UUVNuUNUvUnV : uUnuvNvvNU.field_1724.method_24515();
         int var3 = (int)this.UnUNuUU.uUnuvNvvNU();
         class_2338 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (class_2338 var8 : class_2338.method_10097(var2.method_10069(-var3, -5, -var3), var2.method_10069(var3, 5, var3))) {
            if (this.uUnuvNvvNU(var8) && this.UuUVuuUu(var8, var1)) {
               double var9 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var8));
               if (var9 < var5) {
                  var5 = var9;
                  var4 = var8.method_10062();
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private boolean UuUVuuUu(class_2338 var1, AutoWood.VvunVVUvUNnv var2) {
      String var3 = this.C00OOC00oO(var1).toLowerCase(Locale.ROOT);
      if (var3.isEmpty()) {
         return false;
      } else {
         String[] var4;
         String[] var5;
         switch (var2) {
            case REPAIR:
               var4 = new String[]{"опыт"};
               var5 = new String[]{"кост", "мука"};
               break;
            case BONEMEAL:
               var4 = new String[]{"кост", "мука"};
               var5 = new String[]{"опыт", "лут", "дерев"};
               break;
            case DEPOSIT:
               var4 = new String[]{"лут", "дерев"};
               var5 = new String[]{"опыт", "кост", "мука"};
               break;
            default:
               return false;
         }

         boolean var6 = false;

         for (String var10 : var4) {
            if (var3.contains(var10)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return false;
         } else {
            for (String var14 : var5) {
               if (var3.contains(var14)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private String C00OOC00oO(class_2338 var1) {
      if (var1 != null && uUnuvNvvNU.field_1687 != null) {
         class_2625 var2 = null;
         double var3 = Double.MAX_VALUE;
         class_2338 var5 = var1.method_10069(-1, -1, -1);
         class_2338 var6 = var1.method_10069(1, 1, 1);

         for (class_2338 var8 : class_2338.method_10097(var5, var6)) {
            if (uUnuvNvvNU.field_1687.method_8321(var8) instanceof class_2625 var10) {
               double var11 = var8.method_10262(var1);
               if (var11 < var3) {
                  var3 = var11;
                  var2 = var10;
               }
            }
         }

         return var2 == null ? "" : this.UuUVuuUu(var2);
      } else {
         return "";
      }
   }

   private String UuUVuuUu(class_2625 var1) {
      StringBuilder var2 = new StringBuilder();

      for (class_2561 var6 : var1.method_49853().method_49877(false)) {
         var2.append(var6.getString()).append(' ');
      }

      for (class_2561 var10 : var1.method_49854().method_49877(false)) {
         var2.append(var10.getString()).append(' ');
      }

      return var2.toString().replaceAll("§.", "").trim();
   }

   private boolean uUnuvNvvNU(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2586 var2 = uUnuvNvvNU.field_1687.method_8321(var1);
         return var2 instanceof class_2595 || var2 instanceof class_3719 || var2 instanceof class_2627;
      }
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      return this.vNUvnnVnUvu(var1) != null;
   }

   private String uUnuvNvvNU(AutoWood.VvunVVUvUNnv var1) {
      return switch (var1) {
         case REPAIR -> "опыт";
         case BONEMEAL -> "костная мука";
         case DEPOSIT -> "лут/дерево";
         default -> "";
      };
   }

   private void uNNnnnuuuN(class_2338 var1) {
      class_243 var2 = this.UuUVuuUu(var1, class_2350.field_11036);
      class_3965 var3 = new class_3965(var2, class_2350.field_11036, var1, false);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var3);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
   }

   private boolean nuUnNvnuUu(class_2338 var1) {
      uuUuvNuNVNVU var2 = this.UuUVuuUu(this.UuUVuuUu(var1, class_2350.field_11036));
      COC0OCc.UuUVuuUu(var2, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
      return new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var2) <= 6.0F;
   }

   private class_243 UuUVuuUu(class_2338 var1, class_2350 var2) {
      return new class_243(
         var1.method_10263() + 0.5 + var2.method_10148() * 0.5,
         var1.method_10264() + 0.5 + var2.method_10164() * 0.5,
         var1.method_10260() + 0.5 + var2.method_10165() * 0.5
      );
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return new uuUuvNuNVNVU(0.0F, 0.0F);
      } else {
         class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
         double var3 = var1.field_1352 - var2.field_1352;
         double var5 = var1.field_1351 - var2.field_1351;
         double var7 = var1.field_1350 - var2.field_1350;
         double var9 = Math.sqrt(var3 * var3 + var7 * var7);
         float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
         float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
         return new uuUuvNuNVNVU(var11, var12);
      }
   }

   private boolean VVuuUN(class_2338 var1) {
      return uUnuvNvvNU.field_1724.method_33571().method_1025(class_243.method_24953(var1)) <= 20.25;
   }

   private class_3965 vNUvnnVnUvu(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               class_243 var19 = new class_243(var1.method_10263() + var7, var1.method_10264() + var12, var1.method_10260() + var17);
               class_3965 var20 = uUnuvNvvNU.field_1687
                  .method_17742(new class_3959(var2, var19, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
               if (var20.method_17783() == class_240.field_1332 && var20.method_17777().equals(var1)) {
                  return var20;
               }
            }
         }
      }

      return null;
   }

   private int C00OOC00oO(class_1792 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7909() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int uUnuvNvvNU(class_1792 var1) {
      int var2 = -1;

      for (int var3 = 9; var3 < 36; var3++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var3).method_7909() == var1) {
            var2 = var3;
            break;
         }
      }

      if (var2 == -1) {
         return -1;
      } else {
         int var4 = this.NUVvUUVuVNVv();
         if (var4 == -1) {
            return -1;
         } else {
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, var4, class_1713.field_7791, uUnuvNvvNU.field_1724);
            return var4;
         }
      }
   }

   private int NUVvUUVuVNVv() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         class_1792 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3).method_7909();
         if (!(var2 instanceof class_1743)
            && var2 != this.UuuNnUvUuv()
            && var2 != class_1802.field_8324
            && var2 != class_1802.field_8606
            && var2 != class_1802.field_8242
            && var2 != class_1802.field_8287) {
            return var3;
         }
      }

      return -1;
   }

   static enum NVnVnNnN {
      SETUP,
      FARM,
      WAIT_FELL;
   }

   static enum VvunVVUvUNnv {
      NONE,
      REPAIR,
      BONEMEAL,
      DEPOSIT;
   }

   static enum nvnNNunvv {
      FIND_CHEST,
      GOING,
      ROTATING,
      OPENING,
      WAIT_GUI,
      CRAFTING,
      REPAIRING,
      RETURNING;
   }

   static enum uunvUUVnuNn {
      NONE,
      EQUIP,
      COMMAND,
      CONFIRM,
      WAIT_RESULT;
   }
}
