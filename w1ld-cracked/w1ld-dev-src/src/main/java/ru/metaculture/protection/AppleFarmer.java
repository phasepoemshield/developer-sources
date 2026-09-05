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
import net.minecraft.class_1794;
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
   UuUVuuUu = "AppleFarmer",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически фармит для вас яблоки"
)
public class AppleFarmer extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция", 4.5F, 3.0F, 4.5F, 0.1F, true);
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Авто-пополнение из сундуков", true);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Чинить при прочности <", 150.0F, 20.0F, 1000.0F, 10.0F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.uUnuvNvvNU());
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Радиус поиска сундуков", 12.0F, 4.0F, 40.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.uUnuvNvvNU());
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Разгрузка при свободных слотах ≤", 3.0F, 0.0F, 10.0F, 1.0F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.uUnuvNvvNU());
   private AppleFarmer.NVnVnNnN nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
   private class_2338 UnUNuUU = null;
   private final List<class_2338> uUVuVvuNUvnu = new ArrayList<>();
   private static final int UvUvUNuvNU = 2;
   private static final int c0oOOCcCoC0 = 4;
   private static final int VVnVNnunVvu = 8;
   private class_2350 unNNVVNnvvV = class_2350.field_11043;
   private class_2338 NuunnvnN = null;
   private int NVUunUNUN = 0;
   private int UUVNuUNUvUnV = 0;
   private IBaritone vuvnUnVnUNnV;
   private boolean nnuUVNUuvvVU = false;
   private class_2338 nVVUuvuNnUN = null;
   private AppleFarmer.VvunVVUvUNnv nNnVnUNVV = AppleFarmer.VvunVVUvUNnv.NONE;
   private AppleFarmer.nvnNNunvv nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
   private class_2338 uUVVvVVNvvn = null;
   private boolean vvUVNVvvNUv = false;
   private boolean UuNnnVnuNNV = false;
   private int uUVvnUuNvvN = 0;
   private boolean UUuUnNVNuuv = false;
   private int NVuNUuVnVUN = -1;
   private int NVuunNnvvvVu = -1;
   private float vNnNuuvVn = 0.0F;
   private final VuNvNNvVV VUuuVUnun = new VuNvNNvVV();
   private final VuNvNNvVV vVVuuVVv = new VuNvNNvVV();
   private final VuNvNNvVV VuunNUUUvu = new VuNvNNvVV();
   private final VuNvNNvVV NNUUNUuVNNVn = new VuNvNNvVV();
   private final VuNvNNvVV VvVvnNUnvuvV = new VuNvNNvVV();
   private final VuNvNNvVV ccOO0COcoco0 = new VuNvNNvVV();
   private final Queue<Runnable> NUVvUUVuVNVv = new ArrayDeque<>();
   private boolean nNuVunNUVu = false;
   private static final int UNvvunVVn = 64;
   private static final int UnvuVuVnNuvu = 64;
   private static final int UvNNVUVNVuvV = 128;
   private static final int NnunUUnU = 64;

   public AppleFarmer() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.vuvnUnVnUNnV = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
      this.UnUNuUU = null;
      this.uUVuVvuNUvnu.clear();
      this.NuunnvnN = null;
      this.UUVNuUNUvUnV = 0;
      this.nnuUVNUuvvVU = false;
      this.nVVUuvuNnUN = null;
      this.nNuVunNUVu = false;
      this.nuunNvv();
      this.NVUunUNUN = 0;
   }

   @Override
   public void C00OOC00oO() {
      if (uUnuvNvvNU.field_1724 != null && this.UUuUnNVNuuv) {
         try {
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, 45, this.NVuNUuVnVUN, class_1713.field_7791, uUnuvNvvNU.field_1724);
            if (this.NVuNUuVnVUN >= 0) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(this.NVuNUuVnVUN);
            }

            uUnuvNvvNU.field_1724.method_36457(this.vNnNuuvVn);
         } catch (Exception var2) {
         }
      }

      this.UUuUnNVNuuv = false;
      if (this.vuvnUnVnUNnV != null) {
         this.vuvnUnVnUNnV.getPathingBehavior().cancelEverything();
      }

      this.nuunNvv();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      this.NuunnvnN = null;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (!PlayerHelper.UuuNnUvUuv()) {
            if (this.uVunuUNVVUUV.uUnuvNvvNU()) {
               if (this.nNnVnUNVV != AppleFarmer.VvunVVUvUNnv.NONE && uUnuvNvvNU.field_1755 instanceof class_476 var4) {
                  if (this.nNnVnUNVV == AppleFarmer.VvunVVUvUNnv.UNLOAD) {
                     this.C00OOC00oO(var4);
                  } else {
                     this.UuUVuuUu(var4);
                  }

                  return;
               }

               if (this.nNnVnUNVV == AppleFarmer.VvunVVUvUNnv.NONE && this.nnuUVNUuvvVU && uUnuvNvvNU.field_1755 == null) {
                  AppleFarmer.VvunVVUvUNnv var2 = this.uVUVnuvnuVuv();
                  if (var2 != AppleFarmer.VvunVVUvUNnv.NONE) {
                     this.nNnVnUNVV = var2;
                     this.uNnUnnuNUnNu();
                  }
               }

               if (this.nNnVnUNVV != AppleFarmer.VvunVVUvUNnv.NONE) {
                  this.NnUuNNU();
                  return;
               }
            }

            if (uUnuvNvvNU.field_1755 == null) {
               this.UUVNuUNUvUnV++;
               if (this.UUVNuUNUvUnV > 4) {
                  this.VUuuVUnun();
                  this.UUVNuUNUvUnV = 0;
               }

               this.NVUunUNUN++;
               if (this.nNvNUVU == AppleFarmer.NVnVnNnN.BREAKING || this.NVUunUNUN >= 2) {
                  switch (this.nNvNUVU) {
                     case FIND_SPOT:
                        this.UuuNnUvUuv();
                        break;
                     case PLACE:
                        this.nUUVuvU();
                        break;
                     case BONEMEAL:
                        this.UnUNVVVNuv();
                        break;
                     case SCAN_TREE:
                        this.vNVuvnUUnuUn();
                        break;
                     case BREAKING:
                        this.UvnvNVnnnnNU();
                  }
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (!this.nnuUVNUuvvVU) {
         this.nVVUuvuNnUN = uUnuvNvvNU.field_1724.method_24515();
         this.unNNVVNnvvV = uUnuvNvvNU.field_1724.method_5735();
         this.nnuUVNUuvvVU = true;
      }

      class_2338 var1 = this.nVVUuvuNnUN;
      class_2338 var2 = var1.method_10093(this.unNNVVNnvvV);
      class_2338 var3 = var1.method_10079(this.unNNVVNnvvV, 2);
      class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var3);
      if (this.vNUvnnVnUvu(var2) && this.vNUvnnVnUvu(var2.method_10084())) {
         if (var4.method_26204() == class_2246.field_10394) {
            this.UnUNuUU = var3;
            this.nNvNUVU = AppleFarmer.NVnVnNnN.BONEMEAL;
            this.NVUunUNUN = 0;
         } else if (this.C00OOC00oO(var4)) {
            this.UnUNuUU = var3;
            this.nNvNUVU = AppleFarmer.NVnVnNnN.SCAN_TREE;
            this.NVUunUNUN = 0;
         } else {
            class_2338 var5 = var3.method_10074();
            if (this.VVuuUN(var5) && var4.method_45474()) {
               this.UnUNuUU = var5.method_10084();
               this.nNvNUVU = AppleFarmer.NVnVnNnN.PLACE;
            } else {
               vVnvuVVUunuv.UuUVuuUu("§c[AppleFarmer] §fВстаньте напротив места посадки: земля должна быть через один блок перед вами");
               this.a_();
            }

            this.NVUunUNUN = 0;
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("§c[AppleFarmer] §fМежду вами и местом посадки должен быть свободный блок");
         this.a_();
         this.NVUunUNUN = 0;
      }
   }

   private void nUUVuvU() {
      if (this.UnUNuUU == null) {
         this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
      } else {
         class_2680 var1 = uUnuvNvvNU.field_1687.method_8320(this.UnUNuUU);
         if (var1.method_26204() == class_2246.field_10394) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.BONEMEAL;
            this.NVUunUNUN = 0;
         } else if (!var1.method_45474()) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
            this.NVUunUNUN = 0;
         } else {
            int var2 = this.C00OOC00oO(class_1802.field_17535);
            if (var2 == -1) {
               var2 = this.uUnuvNvvNU(class_1802.field_17535);
            }

            if (var2 == -1) {
               if (this.uVunuUNVVUUV.uUnuvNvvNU()) {
                  this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
                  this.NVUunUNUN = 0;
               } else {
                  vVnvuVVUunuv.UuUVuuUu("§c[AppleFarmer] §fНет саженцев");
                  this.a_();
               }
            } else if (this.uNNnnnuuuN(this.UnUNuUU.method_10074())) {
               int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532();
               uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
               this.vVvUvVVuuNvV(this.UnUNuUU.method_10074());
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               this.nNvNUVU = AppleFarmer.NVnVnNnN.BONEMEAL;
               this.NVUunUNUN = 0;
            }
         }
      }
   }

   private void UnUNVVVNuv() {
      if (this.UnUNuUU != null) {
         class_2680 var1 = uUnuvNvvNU.field_1687.method_8320(this.UnUNuUU);
         if (this.C00OOC00oO(var1)) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.SCAN_TREE;
         } else if (var1.method_45474()) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.PLACE;
         } else if (var1.method_26204() != class_2246.field_10394) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
         } else {
            int var2 = this.C00OOC00oO(class_1802.field_8324);
            if (var2 == -1) {
               var2 = this.uUnuvNvvNU(class_1802.field_8324);
            }

            if (var2 == -1) {
               if (this.uVunuUNVVUUV.uUnuvNvvNU()) {
                  this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
                  this.NVUunUNUN = 0;
               } else {
                  vVnvuVVUunuv.UuUVuuUu("§c[AppleFarmer] §fНет костной муки");
                  this.a_();
               }
            } else if (this.uNNnnnuuuN(this.UnUNuUU)) {
               int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532();
               uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
               this.vVvUvVVuuNvV(this.UnUNuUU);
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               this.NVUunUNUN = 0;
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      this.uUVuVvuNUvnu.clear();
      class_2338 var1 = this.UnUNuUU;
      if (var1 == null) {
         this.nNvNUVU = AppleFarmer.NVnVnNnN.PLACE;
      } else {
         double var2 = Math.min(this.NVNnnvnuunNv.uUnuvNvvNU(), 4.5F);
         int var4 = (int)Math.ceil(var2) + 1;
         class_2338 var5 = this.nnuUVNUuvvVU && this.nVVUuvuNnUN != null ? this.nVVUuvuNnUN : uUnuvNvvNU.field_1724.method_24515();

         for (int var6 = -var4; var6 <= var4; var6++) {
            for (int var7 = -2; var7 <= 8; var7++) {
               for (int var8 = -var4; var8 <= var4; var8++) {
                  class_2338 var9 = var5.method_10069(var6, var7, var8);
                  class_2680 var10 = uUnuvNvvNU.field_1687.method_8320(var9);
                  if (this.UuUVuuUu(var10) && this.uVUuuVnNVU(var9) && (!this.C00OOC00oO(var10) || this.UuUVuuUu(var9, var1))) {
                     this.uUVuVvuNUvnu.add(var9);
                  }
               }
            }
         }

         if (this.uUVuVvuNUvnu.isEmpty()) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.PLACE;
         } else {
            this.uUVuVvuNUvnu.sort(this::C00OOC00oO);
            this.NuunnvnN = null;
            this.nNvNUVU = AppleFarmer.NVnVnNnN.BREAKING;
         }
      }
   }

   private boolean UuUVuuUu(class_2338 var1, class_2338 var2) {
      return Math.abs(var1.method_10263() - var2.method_10263()) <= 4 && Math.abs(var1.method_10260() - var2.method_10260()) <= 4;
   }

   private void UvnvNVnnnnNU() {
      this.uUVuVvuNUvnu.removeIf(var1x -> !this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var1x)) || !this.uVUuuVnNVU(var1x));
      if (this.uUVuVvuNUvnu.isEmpty()) {
         this.nNvNUVU = AppleFarmer.NVnVnNnN.PLACE;
         this.NuunnvnN = null;
      } else {
         class_2338 var1 = this.NVuunNnvvvVu();
         if (var1 == null) {
            this.nNvNUVU = AppleFarmer.NVnVnNnN.SCAN_TREE;
            this.NuunnvnN = null;
            this.NVUunUNUN = 0;
         } else {
            class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
            class_3965 var3 = this.vuuuNvNuv(var1);
            if (var3 == null) {
               this.NuunnvnN = null;
            } else {
               boolean var4 = this.uUnuvNvvNU(var2);
               boolean var5 = this.C00OOC00oO(var2);
               if (var5) {
                  this.uUnuvNvvNU(true);
               } else if (var4) {
                  this.uUnuvNvvNU(false);
               }

               uuUuvNuNVNVU var6 = this.UuUVuuUu(var3.method_17784());
               COC0OCc.UuUVuuUu(var6, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
               if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var6) > 6.0F)) {
                  if (!var1.equals(this.NuunnvnN)) {
                     uUnuvNvvNU.field_1761.method_2910(var1, var3.method_17780());
                     this.NuunnvnN = var1;
                  } else {
                     uUnuvNvvNU.field_1761.method_2902(var1, var3.method_17780());
                  }

                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               }
            }
         }
      }
   }

   private AppleFarmer.VvunVVUvUNnv uVUVnuvnuVuv() {
      if (this.NVNnnvnuunNv()) {
         return AppleFarmer.VvunVVUvUNnv.UNLOAD;
      } else if (this.UNnVVNvvnVvU.uUnuvNvvNU() > 0.0F && this.uUVVvVVNvvn() != -1) {
         return AppleFarmer.VvunVVUvUNnv.REPAIR;
      } else {
         if (this.nNvNUVU == AppleFarmer.NVnVnNnN.FIND_SPOT) {
            if (this.UuUVuuUu(class_1802.field_8324) == 0) {
               return AppleFarmer.VvunVVUvUNnv.BONEMEAL;
            }

            if (this.UuUVuuUu(class_1802.field_17535) == 0) {
               return AppleFarmer.VvunVVUvUNnv.SAPLING;
            }
         }

         return AppleFarmer.VvunVVUvUNnv.NONE;
      }
   }

   private boolean NVNnnvnuunNv() {
      if (this.nNuVunNUVu) {
         if (!this.ccOO0COcoco0.uNNnnnuuuN(30000L)) {
            return false;
         }

         this.nNuVunNUVu = false;
      }

      return this.uVunuUNVVUUV() <= (int)this.NnUuNNU.uUnuvNvvNU() && this.UNnVVNvvnVvU();
   }

   private int uVunuUNVVUUV() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7960()) {
            var1++;
         }
      }

      return var1;
   }

   private boolean UNnVVNvvnVvU() {
      return this.UuUVuuUu(class_1802.field_8583) > 0
         || this.UuUVuuUu(class_1802.field_8279) > 0
         || this.UuUVuuUu(class_1802.field_8600) > 0
         || this.UuUVuuUu(class_1802.field_17535) > 64;
   }

   private void uNnUnnuNUnNu() {
      this.vvUVNVvvNUv = false;
      this.UuNnnVnuNNV = false;
      this.uUVvnUuNvvN = 0;
      this.uUVVvVVNvvn = null;
      this.UUuUnNVNuuv = false;
      this.NVuunNnvvvVu = -1;
      this.NUVvUUVuVNVv.clear();
      this.NuunnvnN = null;
      this.uUVuVvuNUvnu.clear();
      this.VUuuVUnun.UuUVuuUu();
      this.vVVuuVVv.UuUVuuUu();
      this.VuunNUUUvu.UuUVuuUu();
      this.NNUUNUuVNNVn.UuUVuuUu();
      switch (this.nNnVnUNVV) {
         case REPAIR:
            this.nuunNvv = this.UuUVuuUu(class_1802.field_8287) > 0 ? AppleFarmer.nvnNNunvv.REPAIRING : AppleFarmer.nvnNNunvv.FIND_CHEST;
            break;
         case BONEMEAL:
            this.nuunNvv = this.UuNnnVnuNNV() ? AppleFarmer.nvnNNunvv.CRAFTING : AppleFarmer.nvnNNunvv.FIND_CHEST;
            break;
         default:
            this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
      }
   }

   private void NnUuNNU() {
      if (uUnuvNvvNU.field_1755 == null || uUnuvNvvNU.field_1755 instanceof class_476) {
         switch (this.nuunNvv) {
            case FIND_CHEST:
               this.nNvNUVU();
               break;
            case GOING:
               this.UnUNuUU();
               break;
            case ROTATING:
               this.uUVuVvuNUvnu();
               break;
            case OPENING:
               this.UvUvUNuvNU();
               break;
            case WAIT_GUI:
               this.c0oOOCcCoC0();
               break;
            case CRAFTING:
               this.unNNVVNnvvV();
               break;
            case REPAIRING:
               this.NVUunUNUN();
               break;
            case RETURNING:
               this.vuvnUnVnUNnV();
               break;
            case FACING:
               this.nnuUVNUuvvVU();
               break;
            default:
               this.nNnVnUNVV();
         }
      }
   }

   private void nNvNUVU() {
      this.uUVVvVVNvvn = this.uUnuvNvvNU(this.nNnVnUNVV);
      if (this.uUVVvVVNvvn == null) {
         this.C00OOC00oO(
            "§c[AppleFarmer] §fНе найден сундук «" + this.vVvUvVVuuNvV(this.nNnVnUNVV) + "» в радиусе " + (int)this.uNnUnnuNUnNu.uUnuvNvvNU() + " бл."
         );
      } else {
         if (this.uVUuuVnNVU(this.uUVVvVVNvvn) && this.uUnuvNvvNU(this.uUVVvVVNvvn)) {
            this.nuunNvv = AppleFarmer.nvnNNunvv.ROTATING;
            this.VUuuVUnun.UuUVuuUu();
         } else {
            this.vvUVNVvvNUv = true;
            this.nuunNvv = AppleFarmer.nvnNNunvv.GOING;
            this.vVVuuVVv.UuUVuuUu();
            this.VuunNUUUvu.UuUVuuUu();
         }
      }
   }

   private void UnUNuUU() {
      if (this.uUVVvVVNvvn != null && this.C00OOC00oO(this.uUVVvVVNvvn)) {
         double var1 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.uUVVvVVNvvn));
         if (var1 <= this.NVNnnvnuunNv.uUnuvNvvNU() && this.uUnuvNvvNU(this.uUVVvVVNvvn)) {
            if (this.vuvnUnVnUNnV != null) {
               this.vuvnUnVnUNnV.getPathingBehavior().cancelEverything();
            }

            this.nuunNvv = AppleFarmer.nvnNNunvv.ROTATING;
            this.VUuuVUnun.UuUVuuUu();
         } else {
            if (this.vuvnUnVnUNnV != null && (!this.vuvnUnVnUNnV.getCustomGoalProcess().isActive() || this.vVVuuVVv.uNNnnnuuuN(1500L))) {
               this.vuvnUnVnUNnV.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.uUVVvVVNvvn, 2));
               this.vVVuuVVv.UuUVuuUu();
            }

            if (this.VuunNUUUvu.uNNnnnuuuN(15000L)) {
               this.C00OOC00oO("§c[AppleFarmer] §fНе удалось дойти до сундука «" + this.vVvUvVVuuNvV(this.nNnVnUNVV) + "»");
            }
         }
      } else {
         this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
      }
   }

   private void uUVuVvuNUvnu() {
      if (this.uUVVvVVNvvn == null) {
         this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
      } else {
         if (this.uNNnnnuuuN(this.uUVVvVVNvvn)) {
            this.nuunNvv = AppleFarmer.nvnNNunvv.OPENING;
            this.VUuuVUnun.UuUVuuUu();
         }
      }
   }

   private void UvUvUNuvNU() {
      if (this.VUuuVUnun.uNNnnnuuuN(200L)) {
         this.vVvUvVVuuNvV(this.uUVVvVVNvvn);
         this.nuunNvv = AppleFarmer.nvnNNunvv.WAIT_GUI;
         this.VUuuVUnun.UuUVuuUu();
      }
   }

   private void c0oOOCcCoC0() {
      if (!(uUnuvNvvNU.field_1755 instanceof class_476)) {
         if (this.VUuuVUnun.uNNnnnuuuN(2500L)) {
            this.uUVvnUuNvvN++;
            if (this.uUVvnUuNvvN > 3) {
               this.C00OOC00oO("§c[AppleFarmer] §fНе удалось открыть сундук «" + this.vVvUvVVuuNvV(this.nNnVnUNVV) + "»");
            } else {
               this.nuunNvv = AppleFarmer.nvnNNunvv.ROTATING;
               this.VUuuVUnun.UuUVuuUu();
            }
         }
      }
   }

   private void UuUVuuUu(class_476 var1) {
      class_1707 var2 = (class_1707)var1.method_17577();
      int var3 = var2.field_7761.size() - 36;
      if (var3 <= 0) {
         this.UuUVuuUu("§c[AppleFarmer] §fСундук пуст");
      } else if (this.NNUUNUuVNNVn.uNNnnnuuuN(120L)) {
         if (this.UuUVuuUu(this.nNnVnUNVV)) {
            this.VVnVNnunVvu();
         } else {
            int var4 = this.UuUVuuUu(var2, var3, this.nNnVnUNVV);
            if (var4 == -1) {
               if (this.UuNnnVnuNNV) {
                  this.VVnVNnunVvu();
               } else {
                  this.UuUVuuUu("§c[AppleFarmer] §fВ сундуке «" + this.vVvUvVVuuNvV(this.nNnVnUNVV) + "» нет нужных предметов");
               }
            } else {
               uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.UuNnnVnuNNV = true;
               this.NNUUNUuVNNVn.UuUVuuUu();
            }
         }
      }
   }

   private void C00OOC00oO(class_476 var1) {
      class_1707 var2 = (class_1707)var1.method_17577();
      int var3 = var2.field_7761.size() - 36;
      if (var3 <= 0) {
         this.UuUVuuUu("§c[AppleFarmer] §fСундук пуст");
      } else if (this.NNUUNUuVNNVn.uNNnnnuuuN(120L)) {
         for (int var4 = var3; var4 < var2.field_7761.size(); var4++) {
            class_1799 var5 = ((class_1735)var2.field_7761.get(var4)).method_7677();
            if (this.UuUVuuUu(var5) && this.UuUVuuUu(var2, var3, var5)) {
               uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.UuNnnVnuNNV = true;
               this.NNUUNUuVNNVn.UuUVuuUu();
               return;
            }
         }

         if (!this.UuNnnVnuNNV) {
            this.nNuVunNUVu = true;
            this.ccOO0COcoco0.UuUVuuUu();
            vVnvuVVUunuv.UuUVuuUu("§c[AppleFarmer] §fСундук «яблоки» переполнен — некуда разгружать");
         }

         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_7346();
         }

         this.nVVUuvuNnUN();
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else {
         class_1792 var2 = var1.method_7909();
         if (var2 == class_1802.field_8583 || var2 == class_1802.field_8279 || var2 == class_1802.field_8600) {
            return true;
         } else {
            return var2 == class_1802.field_17535 ? this.UuUVuuUu(class_1802.field_17535) > 64 : false;
         }
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

   private boolean UuUVuuUu(AppleFarmer.VvunVVUvUNnv var1) {
      return switch (var1) {
         case REPAIR -> this.UuUVuuUu(class_1802.field_8287) >= 64;
         case BONEMEAL -> this.vvUVNVvvNUv() >= 128;
         case SAPLING -> this.UuUVuuUu(class_1802.field_17535) >= 64;
         default -> true;
      };
   }

   private int UuUVuuUu(class_1707 var1, int var2, AppleFarmer.VvunVVUvUNnv var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         class_1799 var5 = ((class_1735)var1.field_7761.get(var4)).method_7677();
         if (!var5.method_7960() && this.UuUVuuUu(var5.method_7909(), var3)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(class_1792 var1, AppleFarmer.VvunVVUvUNnv var2) {
      return switch (var2) {
         case REPAIR -> var1 == class_1802.field_8287;
         case BONEMEAL -> var1 == class_1802.field_8324 || var1 == class_1802.field_8606 || var1 == class_1802.field_8242;
         case SAPLING -> var1 == class_1802.field_17535;
         default -> false;
      };
   }

   private void VVnVNnunVvu() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      AppleFarmer.nvnNNunvv var1 = this.C00OOC00oO(this.nNnVnUNVV);
      this.nuunNvv = var1;
      if (var1 == AppleFarmer.nvnNNunvv.RETURNING) {
         this.vVVuuVVv.UuUVuuUu();
         this.VuunNUUUvu.UuUVuuUu();
      }

      this.VUuuVUnun.UuUVuuUu();
      this.NNUUNUuVNNVn.UuUVuuUu();
      this.NUVvUUVuVNVv.clear();
   }

   private AppleFarmer.nvnNNunvv C00OOC00oO(AppleFarmer.VvunVVUvUNnv var1) {
      return switch (var1) {
         case REPAIR -> AppleFarmer.nvnNNunvv.REPAIRING;
         case BONEMEAL -> AppleFarmer.nvnNNunvv.CRAFTING;
         default -> AppleFarmer.nvnNNunvv.RETURNING;
      };
   }

   private void UuUVuuUu(String var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      this.C00OOC00oO(var1);
   }

   private void unNNVVNnvvV() {
      if (uUnuvNvvNU.field_1755 == null) {
         if (!this.NUVvUUVuVNVv.isEmpty()) {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(90L)) {
               this.NUVvUUVuVNVv.poll().run();
               this.NNUUNUuVNNVn.UuUVuuUu();
            }
         } else if (this.UuUVuuUu(class_1802.field_8324) >= 128) {
            this.nVVUuvuNnUN();
         } else {
            int var1 = this.uUVvnUuNvvN();
            if (var1 == -1) {
               this.nVVUuvuNnUN();
            } else {
               int var2 = uUnuvNvvNU.field_1724.field_7498.field_7763;
               this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var2, var1, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
               this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var2, 1, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
               this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var2, 0, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
               this.NUVvUUVuVNVv.add(this::NuunnvnN);
            }
         }
      }
   }

   private void NuunnvnN() {
      int var1 = uUnuvNvvNU.field_1724.field_7498.field_7763;

      for (int var2 = 1; var2 <= 4; var2++) {
         if (((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var2)).method_7681()) {
            uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
         }
      }

      if (!uUnuvNvvNU.field_1724.field_7498.method_34255().method_7960()) {
         int var3 = this.UUuUnNVNuuv();
         if (var3 != -1) {
            uUnuvNvvNU.field_1761.method_2906(var1, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         }
      }
   }

   private void NVUunUNUN() {
      if (uUnuvNvvNU.field_1755 == null) {
         int var1 = uUnuvNvvNU.field_1724.field_7498.field_7763;
         if (!this.UUuUnNVNuuv) {
            int var4 = this.uUVVvVVNvvn();
            if (var4 == -1) {
               this.nVVUuvuNnUN();
            } else if (this.UuUVuuUu(class_1802.field_8287) == 0) {
               this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
            } else if (!uUnuvNvvNU.field_1724.method_6079().method_7960()) {
               int var5 = this.UUuUnNVNuuv();
               if (var5 == -1) {
                  this.C00OOC00oO("§c[AppleFarmer] §fОсвободите офф-хенд или место в инвентаре для починки");
               } else {
                  uUnuvNvvNU.field_1761.method_2906(var1, 45, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
                  uUnuvNvvNU.field_1761.method_2906(var1, var5, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               }
            } else {
               this.NVuNUuVnVUN = var4;
               this.vNnNuuvVn = uUnuvNvvNU.field_1724.method_36455();
               uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
               uUnuvNvvNU.field_1761.method_2906(var1, 45, var4, class_1713.field_7791, uUnuvNvvNU.field_1724);
               if (!this.UUVNuUNUvUnV()) {
                  uUnuvNvvNU.field_1761.method_2906(var1, 45, var4, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
                  this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
               } else {
                  this.UUuUnNVNuuv = true;
                  this.NVuunNnvvvVu = -1;
                  this.VvVvnNUnvuvV.UuUVuuUu();
                  this.VUuuVUnun.UuUVuuUu();
               }
            }
         } else {
            class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
            if (!var2.method_7960() && var2.method_7963() && var2.method_7919() != 0) {
               if (uUnuvNvvNU.field_1724.method_6047().method_7909() != class_1802.field_8287 && !this.UUVNuUNUvUnV()) {
                  this.UuUVuuUu(var1);
                  this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
               } else {
                  int var3 = var2.method_7919();
                  if (this.NVuunNnvvvVu == -1) {
                     this.NVuunNnvvvVu = var3;
                  }

                  if (var3 < this.NVuunNnvvvVu) {
                     this.NVuunNnvvvVu = var3;
                     this.VvVvnNUnvuvV.UuUVuuUu();
                  } else if (this.VvVvnNUnvuvV.uNNnnnuuuN(4000L)) {
                     this.UuUVuuUu(var1);
                     this.C00OOC00oO("§c[AppleFarmer] §fИнструмент не чинится (нет «Починки»?)");
                     return;
                  }

                  if (this.VUuuVUnun.uNNnnnuuuN(120L)) {
                     uUnuvNvvNU.field_1724.method_36457(90.0F);
                     uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                     this.VUuuVUnun.UuUVuuUu();
                  }
               }
            } else {
               this.UuUVuuUu(var1);
            }
         }
      }
   }

   private void UuUVuuUu(int var1) {
      uUnuvNvvNU.field_1761.method_2906(var1, 45, this.NVuNUuVnVUN, class_1713.field_7791, uUnuvNvvNU.field_1724);
      if (this.NVuNUuVnVUN >= 0) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.NVuNUuVnVUN);
      }

      uUnuvNvvNU.field_1724.method_36457(this.vNnNuuvVn);
      if (!uUnuvNvvNU.field_1724.method_6079().method_7960()) {
         int var2 = this.UUuUnNVNuuv();
         if (var2 != -1) {
            uUnuvNvvNU.field_1761.method_2906(var1, 45, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         }
      }

      this.UUuUnNVNuuv = false;
   }

   private boolean UUVNuUNUvUnV() {
      int var1 = this.NVuNUuVnVUN();
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

   private void vuvnUnVnUNnV() {
      if (this.vvUVNVvvNUv && this.nVVUuvuNnUN != null && this.vuvnUnVnUNnV != null) {
         if (!uUnuvNvvNU.field_1724.method_24515().equals(this.nVVUuvuNnUN)
            && !(uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.nVVUuvuNnUN)) <= 0.7)) {
            if (!this.vuvnUnVnUNnV.getCustomGoalProcess().isActive() || this.vVVuuVVv.uNNnnnuuuN(1500L)) {
               this.vuvnUnVnUNnV.getCustomGoalProcess().setGoalAndPath(new GoalBlock(this.nVVUuvuNnUN));
               this.vVVuuVVv.UuUVuuUu();
            }

            if (this.VuunNUUUvu.uNNnnnuuuN(20000L)) {
               this.vuvnUnVnUNnV.getPathingBehavior().cancelEverything();
               this.nuunNvv = AppleFarmer.nvnNNunvv.FACING;
            }
         } else {
            this.vuvnUnVnUNnV.getPathingBehavior().cancelEverything();
            this.nuunNvv = AppleFarmer.nvnNNunvv.FACING;
            this.VUuuVUnun.UuUVuuUu();
         }
      } else {
         this.nuunNvv = AppleFarmer.nvnNNunvv.FACING;
      }
   }

   private void nnuUVNUuvvVU() {
      if (this.nnuUVNUuvvVU) {
         uUnuvNvvNU.field_1724.method_36456(this.UuUVuuUu(this.unNNVVNnvvV));
         uUnuvNvvNU.field_1724.method_36457(0.0F);
      }

      this.nNnVnUNVV();
   }

   private float UuUVuuUu(class_2350 var1) {
      return switch (var1) {
         case field_11035 -> 0.0F;
         case field_11039 -> 90.0F;
         case field_11043 -> 180.0F;
         case field_11034 -> -90.0F;
         default -> uUnuvNvvNU.field_1724.method_36454();
      };
   }

   private void nVVUuvuNnUN() {
      this.nuunNvv = AppleFarmer.nvnNNunvv.RETURNING;
      this.vVVuuVVv.UuUVuuUu();
      this.VuunNUUUvu.UuUVuuUu();
   }

   private void nNnVnUNVV() {
      if (this.vuvnUnVnUNnV != null) {
         this.vuvnUnVnUNnV.getPathingBehavior().cancelEverything();
      }

      this.nuunNvv();
      this.nNvNUVU = AppleFarmer.NVnVnNnN.FIND_SPOT;
      this.NVUunUNUN = 0;
      this.NuunnvnN = null;
      this.uUVuVvuNUvnu.clear();
   }

   private void C00OOC00oO(String var1) {
      vVnvuVVUunuv.UuUVuuUu(var1);
      if (this.vuvnUnVnUNnV != null) {
         this.vuvnUnVnUNnV.getPathingBehavior().cancelEverything();
      }

      this.nuunNvv();
      this.a_();
   }

   private void nuunNvv() {
      this.nNnVnUNVV = AppleFarmer.VvunVVUvUNnv.NONE;
      this.nuunNvv = AppleFarmer.nvnNNunvv.FIND_CHEST;
      this.uUVVvVVNvvn = null;
      this.vvUVNVvvNUv = false;
      this.UuNnnVnuNNV = false;
      this.uUVvnUuNvvN = 0;
      this.UUuUnNVNuuv = false;
      this.NVuNUuVnVUN = -1;
      this.NVuunNnvvvVu = -1;
      this.NUVvUUVuVNVv.clear();
   }

   private int uUVVvVVNvvn() {
      for (int var1 = 0; var1 < 9; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (!var2.method_7960() && var2.method_7963() && (var2.method_7909() instanceof class_1743 || var2.method_7909() instanceof class_1794)) {
            int var3 = var2.method_7936() - var2.method_7919();
            if (var3 <= (int)this.UNnVVNvvnVvU.uUnuvNvvNU()) {
               return var1;
            }
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

   private int vvUVNVvvNUv() {
      return this.UuUVuuUu(class_1802.field_8324) + this.UuUVuuUu(class_1802.field_8606) * 3 + this.UuUVuuUu(class_1802.field_8242) * 9;
   }

   private boolean UuNnnVnuNNV() {
      return this.UuUVuuUu(class_1802.field_8606) > 0 || this.UuUVuuUu(class_1802.field_8242) > 0;
   }

   private int uUVvnUuNvvN() {
      for (int var1 = 9; var1 <= 44; var1++) {
         class_1792 var2 = ((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7677().method_7909();
         if (var2 == class_1802.field_8606 || var2 == class_1802.field_8242) {
            return var1;
         }
      }

      return -1;
   }

   private int UUuUnNVNuuv() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (!((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7681()) {
            return var1;
         }
      }

      return -1;
   }

   private int NVuNUuVnVUN() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7677().method_7909() == class_1802.field_8287) {
            return var1;
         }
      }

      return -1;
   }

   private class_2338 uUnuvNvvNU(AppleFarmer.VvunVVUvUNnv var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         class_2338 var2 = this.nnuUVNUuvvVU && this.nVVUuvuNnUN != null ? this.nVVUuvuNnUN : uUnuvNvvNU.field_1724.method_24515();
         int var3 = (int)this.uNnUnnuNUnNu.uUnuvNvvNU();
         class_2338 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (class_2338 var8 : class_2338.method_10097(var2.method_10069(-var3, -5, -var3), var2.method_10069(var3, 5, var3))) {
            if (this.C00OOC00oO(var8) && this.UuUVuuUu(var8, var1)) {
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

   private boolean UuUVuuUu(class_2338 var1, AppleFarmer.VvunVVUvUNnv var2) {
      String var3 = this.UuUVuuUu(var1).toLowerCase(Locale.ROOT);
      if (var3.isEmpty()) {
         return false;
      } else {
         String var4;
         String[] var5;
         switch (var2) {
            case REPAIR:
               var4 = "опыт";
               var5 = new String[]{"кост", "яблок"};
               break;
            case BONEMEAL:
               var4 = "кост";
               var5 = new String[]{"опыт", "яблок"};
               break;
            case SAPLING:
            case UNLOAD:
               var4 = "яблок";
               var5 = new String[]{"опыт", "кост"};
               break;
            default:
               return false;
         }

         if (!var3.contains(var4)) {
            return false;
         } else {
            for (String var9 : var5) {
               if (var3.contains(var9)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private String UuUVuuUu(class_2338 var1) {
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

   private boolean C00OOC00oO(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2586 var2 = uUnuvNvvNU.field_1687.method_8321(var1);
         return var2 instanceof class_2595 || var2 instanceof class_3719 || var2 instanceof class_2627;
      }
   }

   private boolean uUnuvNvvNU(class_2338 var1) {
      return this.vuuuNvNuv(var1) != null;
   }

   private String vVvUvVVuuNvV(AppleFarmer.VvunVVUvUNnv var1) {
      return switch (var1) {
         case REPAIR -> "опыт";
         case BONEMEAL -> "кости";
         case SAPLING, UNLOAD -> "яблоки";
         default -> "";
      };
   }

   private void vVvUvVVuuNvV(class_2338 var1) {
      class_243 var2 = this.UuUVuuUu(var1, class_2350.field_11036);
      class_3965 var3 = new class_3965(var2, class_2350.field_11036, var1, false);
      uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var3);
      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
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

   private uuUuvNuNVNVU nuUnNvnuUu(class_2338 var1) {
      return this.UuUVuuUu(new class_243(var1.method_10263() + 0.5, var1.method_10264() + 0.5, var1.method_10260() + 0.5));
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
      class_2248 var2 = uUnuvNvvNU.field_1687.method_8320(var1).method_26204();
      return var2 == class_2246.field_10219 || var2 == class_2246.field_10566 || var2 == class_2246.field_10253 || var2 == class_2246.field_10520;
   }

   private boolean vNUvnnVnUvu(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      return var2.method_26215() || var2.method_45474();
   }

   private boolean UuUVuuUu(class_2680 var1) {
      return this.C00OOC00oO(var1) || this.uUnuvNvvNU(var1);
   }

   private boolean C00OOC00oO(class_2680 var1) {
      return var1.method_26204() == class_2246.field_10431;
   }

   private boolean uUnuvNvvNU(class_2680 var1) {
      return var1.method_26204() == class_2246.field_10503;
   }

   private boolean uVUuuVnNVU(class_2338 var1) {
      double var2 = Math.min(this.NVNnnvnuunNv.uUnuvNvvNU(), 4.5F);
      return uUnuvNvvNU.field_1724.method_33571().method_1025(class_243.method_24953(var1)) <= var2 * var2;
   }

   private int C00OOC00oO(class_2338 var1, class_2338 var2) {
      boolean var3 = this.C00OOC00oO(uUnuvNvvNU.field_1687.method_8320(var1));
      boolean var4 = this.C00OOC00oO(uUnuvNvvNU.field_1687.method_8320(var2));
      if (var3 != var4) {
         return var3 ? 1 : -1;
      } else if (var3) {
         return Integer.compare(var1.method_10264(), var2.method_10264());
      } else {
         class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
         double var6 = var5.method_1025(class_243.method_24953(var1));
         double var8 = var5.method_1025(class_243.method_24953(var2));
         return Double.compare(var6, var8);
      }
   }

   private class_2338 NVuunNnvvvVu() {
      for (class_2338 var2 : this.uUVuVvuNUvnu) {
         if (this.vuuuNvNuv(var2) != null) {
            return var2;
         }
      }

      return null;
   }

   private class_3965 vuuuNvNuv(class_2338 var1) {
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

   private void uUnuvNvvNU(boolean var1) {
      int var2 = -1;
      class_1799 var3 = uUnuvNvvNU.field_1724.method_6047();
      if (!var1 || !(var3.method_7909() instanceof class_1743)) {
         if (var1 || !(var3.method_7909() instanceof class_1794)) {
            for (int var4 = 0; var4 < 9; var4++) {
               class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
               if (!var5.method_7960()) {
                  if (var1 && var5.method_7909() instanceof class_1743) {
                     var2 = var4;
                     break;
                  }

                  if (!var1 && var5.method_7909() instanceof class_1794) {
                     var2 = var4;
                     break;
                  }
               }
            }

            if (var2 != -1) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
            }
         }
      }
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
         int var4 = this.vNnNuuvVn();
         if (var4 == -1) {
            return -1;
         } else {
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, var4, class_1713.field_7791, uUnuvNvvNU.field_1724);
            return var4;
         }
      }
   }

   private int vNnNuuvVn() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         class_1792 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3).method_7909();
         if (!(var2 instanceof class_1743)
            && !(var2 instanceof class_1794)
            && var2 != class_1802.field_17535
            && var2 != class_1802.field_8324
            && var2 != class_1802.field_8606
            && var2 != class_1802.field_8242
            && var2 != class_1802.field_8287) {
            return var3;
         }
      }

      return -1;
   }

   private void VUuuVUnun() {
      for (int var1 = 0; var1 < 9; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         boolean var3 = var2.method_7909() == class_1802.field_8324 || var2.method_7909() == class_1802.field_17535;
         if (var3 && var2.method_7947() < 64) {
            int var4 = -1;
            int var5 = var2.method_7947();

            for (int var6 = 9; var6 < 36; var6++) {
               class_1799 var7 = uUnuvNvvNU.field_1724.method_31548().method_5438(var6);
               if (var7.method_7909() == var2.method_7909() && var7.method_7947() > var5) {
                  var4 = var6;
                  var5 = var7.method_7947();
                  if (var5 == 64) {
                     break;
                  }
               }
            }

            if (var4 != -1) {
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var4, var1, class_1713.field_7791, uUnuvNvvNU.field_1724);
               this.UUVNuUNUvUnV = 0;
               return;
            }
         }
      }
   }

   static enum NVnVnNnN {
      FIND_SPOT,
      PLACE,
      BONEMEAL,
      SCAN_TREE,
      BREAKING;
   }

   static enum VvunVVUvUNnv {
      NONE,
      REPAIR,
      BONEMEAL,
      SAPLING,
      UNLOAD;
   }

   static enum nvnNNunvv {
      FIND_CHEST,
      GOING,
      ROTATING,
      OPENING,
      WAIT_GUI,
      CRAFTING,
      REPAIRING,
      RETURNING,
      FACING;
   }
}
