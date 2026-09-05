package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2664;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5498;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "AutoAncientBot",
   C00OOC00oO = "Автоматический фарм древних обломков через ТНТ",
   uUnuvNvvNU = oOOOo0.Misc
)
public class AutoAncientBot extends Module {
   private final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Логи в чат", true);
   private final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Пёрки", true);
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Мин. дистанция пёрки", 16.0F, 8.0F, 48.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.uUnuvNvvNU());
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Debug", false);
   private static final int NnUuNNU = 26;
   private static final int nNvNUVU = 6;
   private static final int UnUNuUU = 2;
   private static final int uUVuVvuNUvnu = 36;
   private static final int UvUvUNuvNU = 36;
   private static final int c0oOOCcCoC0 = 18000;
   private static final int VVnVNnunVvu = 2500;
   private static final int unNNVVNnvvV = 2500;
   private static final int NuunnvnN = 16;
   private static final int NVUunUNUN = 19;
   private static final int UUVNuUNUvUnV = 7000;
   private static final int vuvnUnVnUNnV = 300;
   private static final int nnuUVNUuvvVU = 3500;
   private static final int nVVUuvuNnUN = 2;
   private static final int nNnVnUNVV = 22000;
   private static final int nuunNvv = 2;
   private static final double uUVVvVVNvvn = 4.2;
   private static final float vvUVNVvvNUv = 4.0F;
   private static final float UuNnnVnuNNV = 140.0F;
   private static final float uUVvnUuNvvN = 34.0F;
   private static final float UUuUnNVNuuv = 1.35F;
   private static final long NVuNUuVnVUN = 90L;
   private static final long NVuunNnvvvVu = 3000L;
   private static final long vNnNuuvVn = 9000L;
   private static final int VUuuVUnun = 2;
   private static final int vVVuuVVv = 4;
   private static final int VuunNUUUvu = 900;
   private static final int NNUUNUuVNNVn = 900;
   private static final int VvVvnNUnvuvV = 1400;
   private static final int ccOO0COcoco0 = 8000;
   private static final int NUVvUUVuVNVv = 1400;
   private static final double nNuVunNUVu = 9.0;
   private static final int UNvvunVVn = 2500;
   private static final int UnvuVuVnNuvu = 3;
   private static final double UvNNVUVNVuvV = 0.03;
   private static final double NnunUUnU = 0.99;
   private static final double nvuVvuNnNUnv = 1.5;
   private static final int NnVnNVN = 160;
   private static final double vnvvNvUnVv = 1.8;
   private static final double OCOocoOoOO = 27.0;
   private static final int o0Ooc0COOoc = 2500;
   private static final int nvvnUnUn = 1200;
   private static final int UnUUVuVunvVu = 2000;
   private static final int nnvuvUNuUnN = 5000;
   private static final double UVnuVUUVnnU = 25.0;
   private static final int VunnVNvNV = 3500;
   private static final float NvUVUvVVnUu = 8.0F;
   private AutoAncientBot.uunvUUVnuNn unnUnUNVnN = AutoAncientBot.uunvUUVnuNn.SEARCHING;
   private AutoAncientBot.nvnNNunvv NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
   private final VuNvNNvVV UnnnvvU = new VuNvNNvVV();
   private final VuNvNNvVV VUUnuVvVu = new VuNvNNvVV();
   private final VuNvNNvVV VvVuvUvvNNVv = new VuNvNNvVV();
   private final VuNvNNvVV UnnNNvuvvUU = new VuNvNNvVV();
   private final VuNvNNvVV VNNnnVUuvv = new VuNvNNvVV();
   private final VuNvNNvVV vUvUvUNNuNvn = new VuNvNNvVV();
   private final VuNvNNvVV uuVuUuuVVNvN = new VuNvNNvVV();
   private final VuNvNNvVV VvuUUUNNNv = new VuNvNNvVV();
   private final VuNvNNvVV uuuVnuvnnNnU = new VuNvNNvVV();
   private final VuNvNNvVV nNunUnVN = new VuNvNNvVV();
   private final VuNvNNvVV VnVuuvVvnNv = new VuNvNNvVV();
   private final VuNvNNvVV vuvvuVuVv = new VuNvNNvVV();
   private final VuNvNNvVV uunNUuunVU = new VuNvNNvVV();
   private final VuNvNNvVV NvnuuuvnVV = new VuNvNNvVV();
   private final VuNvNNvVV NnUVNnuvUv = new VuNvNNvVV();
   private final Set<class_2338> UuuuNNunN = new HashSet<>();
   private final Set<class_2338> NNVNuUvVn = new HashSet<>();
   private final Map<class_2338, Boolean> vuNnuUnu = new HashMap<>();
   private class_2338 uuvvuNvuUNVV;
   private class_2338 uVvunVUNuUvu;
   private class_2338 NVNnnvVnvV;
   private class_2338 vUNuuvvnVnv;
   private class_2338 unnnNUNnVu;
   private class_2338 NvnnUUuVvNU;
   private class_2338 vVvuUVnV;
   private class_2338 nvuUVvuuN;
   private boolean CC0COO;
   private boolean uNnNUNvuVnu;
   private boolean VnnnvUunNvuu;
   private boolean VuuUVVu;
   private boolean nUNnuUNnV;
   private boolean VuNVnvNNuNnn;
   private boolean uvVuuuvvVU;
   private List<class_2248> NNnvvunuVNUn = List.of();
   private List<class_1792> nVuuUnnUUVU = List.of();
   private double nUununvNvvn;
   private int NuvunVvnnN;
   private int vuvnnvuNVvu;
   private int NVvnvnn;
   private int vUvVUNnN;
   private class_2338 NUuVnnuUnvu;
   private int vnuNNVvVVuN = -1;
   private int Oco0Oococc = -1;
   private int uNUnUuUnvnnU = -1;
   private int OoccOc0CO = -1;
   private boolean UvuVvvVuUuuu;
   private boolean NUUVUvvuNNVU;
   private boolean VUNvNUuNVnn;
   private boolean UNNunNuUNVuU;
   private boolean NuUuUvUUvU;
   private boolean VUVvNvvVUN;
   private boolean UvvNuvUNNNUv;
   private class_243 NunUUVVVuu;
   private AutoAncientBot.VvunVVUvUNnv uNUnuUUvvuU = AutoAncientBot.VvunVVUvUNnv.IDLE;
   private class_243 vvVVVvVNVVVN;
   private class_243 uUuuVvVunVVu;
   private String NuUvUNN;
   private float vunuUUVVUv;
   private float uuuNUnuvvNNv;
   private int unUVnu = -1;
   private int NvNUuuuvUvu;
   private class_243 nNVVUnuVVVuV;
   private boolean vnVuunuNN;
   private int UvUNuNvvNVNv;
   private int vNnNNNuVVnUv;
   private int UVUnUvUNU;
   private int UvUnnnn;
   private int occOCoc0OcO;
   private long VnvunuuvUNu;

   public AutoAncientBot() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @Override
   public void UuUVuuUu() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         AttackAura var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AttackAura.class);
         if (var1 != null && var1.nuUnNvnuUu) {
            vVnvuVVUunuv.UuUVuuUu("[AutoAncient] Disable HitAura first.");
            this.a_();
         } else if (this.UuUVuuUu(class_2246.field_10375.method_8389()) != -1 && this.UuUVuuUu(class_1802.field_8884) != -1) {
            super.UuUVuuUu();
            if (uUnuvNvvNU.field_1690 != null) {
               uUnuvNvvNU.field_1690.method_31043(class_5498.field_26664);
            }

            AncientXray var2 = this.nNvNUVU();
            if (var2 != null) {
               var2.nUUVuvU();
            }

            this.c0oOOCcCoC0();
            this.UuuuNNunN.clear();
            this.NNVNuUvVn.clear();
            this.vuNnuUnu.clear();
            this.NvnnUUuVvNU = null;
            this.vVvuUVnV = null;
            this.nvuUVvuuN = null;
            this.uuvvuNvuUNVV = null;
            this.uVvunVUNuUvu = null;
            this.NVNnnvVnvV = null;
            this.vUNuuvvnVnv = null;
            this.unnnNUNnVu = null;
            this.CC0COO = false;
            this.NuvunVvnnN = 0;
            this.vnuNNVvVVuN = -1;
            this.Oco0Oococc = -1;
            this.uNUnUuUnvnnU = -1;
            this.OoccOc0CO = -1;
            this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
            this.UNNunNuUNVuU = false;
            this.NunUUVVVuu = null;
            this.uuVuUuuVVNvN.UuUVuuUu();
            this.VvuUUUNNNv.UuUVuuUu();
            this.uuuVnuvnnNnU.UuUVuuUu();
            this.nNunUnVN.UuUVuuUu();
            this.VnVuuvVvnNv.UuUVuuUu();
            this.UvuVvvVuUuuu = false;
            this.NUUVUvvuNNVU = false;
            this.VUNvNUuNVnn = false;
            this.NuUuUvUUvU = false;
            this.VUVvNvvVUN = false;
            this.UvvNuvUNNNUv = false;
            this.uNnNUNvuVnu = false;
            this.uNUnuUUvvuU = AutoAncientBot.VvunVVUvUNnv.IDLE;
            this.vvVVVvVNVVVN = null;
            this.uUuuVvVunVVu = null;
            this.NuUvUNN = null;
            this.unUVnu = -1;
            this.NvNUuuuvUvu = 0;
            this.nNVVUnuVVVuV = null;
            this.uunNUuunVU.UuUVuuUu();
            this.NvnuuuvnVV.UuUVuuUu();
            this.NnUVNnuvUv.UuUVuuUu();
            this.VUUnuVvVu.UuUVuuUu();
            this.VvVuvUvvNNVv.UuUVuuUu();
            this.NVvnvnn = 0;
            this.vnVuunuNN = false;
            this.UvUNuNvvNVNv = 0;
            this.vNnNNNuVVnUv = 0;
            this.UVUnUvUNU = 0;
            this.UvUnnnn = 0;
            this.occOCoc0OcO = 0;
            this.VnvunuuvUNu = System.currentTimeMillis();
            this.nUununvNvvn = Math.toRadians(uUnuvNvvNU.field_1724.method_36454()) + (Math.PI / 2);
            this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
            this.C00OOC00oO("Запущен. ТНТ: " + this.C00OOC00oO(class_2246.field_10375.method_8389()) + ", пёрок: " + this.C00OOC00oO(class_1802.field_8634));
            if (this.uVunuUNVVUUV.uUnuvNvvNU() && this.UuUVuuUu(class_1802.field_8634) == -1) {
               this.C00OOC00oO("Пёрок в хотбаре нет — броски работать не будут.");
            }

            NNvvnnunn.C00OOC00oO = true;
            NNvvnnunn.UuUVuuUu = true;
            NNvvnnunn.uUnuvNvvNU = uUnuvNvvNU.field_1724.method_36454();
            NNvvnnunn.vVvUvVVuuNvV = uUnuvNvvNU.field_1724.method_36455();
            this.UuUVuuUu("enabled");
         } else {
            vVnvuVVUunuv.UuUVuuUu("[AutoAncient] TNT and flint must be in hotbar.");
            this.a_();
         }
      } else {
         this.a_();
      }
   }

   @Override
   public void C00OOC00oO() {
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.C00OOC00oO = false;
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.vNVuvnUUnuUn(var1);
      this.uVUVnuvnuVuv(var1);
      this.uNnUnnuNUnNu();
      this.uUVuVvuNUvnu();
      this.uVUVnuvnuVuv();
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
         uUnuvNvvNU.field_1690.field_1903.method_23481(false);
      }

      var1.getMineProcess().cancel();
      var1.getBuilderProcess().onLostControl();
      this.vNVuvnUUnuUn();
      var1.getSelectionManager().removeAllSelections();
      this.uuvvuNvuUNVV = null;
      if (this.uNnNUNvuVnu) {
         var1.getCommandManager().execute("resume");
         this.uNnNUNvuVnu = false;
      }

      this.VVnVNnunVvu();
      if (this.VnvunuuvUNu > 0L) {
         long var2 = Math.max(1L, (System.currentTimeMillis() - this.VnvunuuvUNu) / 1000L);
         this.C00OOC00oO(
            "Итог: обломков "
               + this.UVUnUvUNU
               + ", ТНТ "
               + this.UvUnnnn
               + " (съедено "
               + this.vNnNNNuVVnUv
               + "), пёрок "
               + this.occOCoc0OcO
               + ", время "
               + var2 / 60L
               + " мин "
               + var2 % 60L
               + " с"
         );
         this.VnvunuuvUNu = 0L;
      }

      this.UuUVuuUu("disabled");
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         AncientXray var2 = this.nNvNUVU();
         if (var2 == null) {
            vVnvuVVUunuv.UuUVuuUu("[AutoAncient] AncientXray module is not registered.");
            this.a_();
         } else {
            if (!var2.nuUnNvnuUu) {
               var2.UuuNnUvUuv();
            }

            IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
            if (!this.nUUVuvU(var3)) {
               if (!this.uNnUnnuNUnNu(var3)) {
                  if (!this.UnUNVVVNuv(var3)) {
                     if (!this.NVNnnvnuunNv(var3)) {
                        if (!this.UvnvNVnnnnNU(var3)) {
                           if (this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.MINING
                              && this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.PLACING_TNT
                              && this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.IGNITING_TNT
                              && this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION) {
                              class_2338 var4 = this.vVvUvVVuuNvV(var2);
                              if (var4 != null) {
                                 this.vNVuvnUUnuUn();
                                 this.C00OOC00oO(var4);
                                 return;
                              }
                           }

                           switch (this.unnUnUNVnN) {
                              case SEARCHING:
                                 this.UuUVuuUu(var3);
                                 break;
                              case MOVING_SEARCH:
                                 this.C00OOC00oO(var3);
                                 break;
                              case MOVING_SITE:
                                 this.uUnuvNvvNU(var3);
                                 break;
                              case CLEARING_SITE:
                                 this.vVvUvVVuuNvV(var3);
                                 break;
                              case PLACING_TNT:
                                 this.uNNnnnuuuN(var3);
                                 break;
                              case IGNITING_TNT:
                                 this.nuUnNvnuUu(var3);
                                 break;
                              case WAITING_EXPLOSION:
                                 this.UuuNnUvUuv();
                                 break;
                              case WAITING_SCAN:
                                 this.UuUVuuUu(var2);
                                 break;
                              case MINING:
                                 this.UuUVuuUu(var3, var2);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1687 != null) {
         AncientXray var2 = this.nNvNUVU();
         if (var2 != null) {
            if (var1.vVvUvVVuuNvV() instanceof class_2664 var3) {
               class_2338 var7 = class_2338.method_49638(var3.comp_2883());
               if (this.uNnUnnuNUnNu(var7)) {
                  this.CC0COO = true;
                  this.unnnNUNnVu = var7;
                  this.UuuuNNunN.clear();
                  this.vuNnuUnu.clear();
                  this.NNVNuUvVn.add(var7.method_10062());
                  this.UNNunNuUNVuU = false;
                  if (!var2.nuUnNvnuUu) {
                     var2.UuUVuuUu(var7, 10);
                  }

                  if (this.unnUnUNVnN == AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION) {
                     this.C00OOC00oO("Взрыв! Сканирую обломки...");
                  }

                  if (this.unnUnUNVnN == AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION || this.unnUnUNVnN == AutoAncientBot.uunvUUVnuNn.WAITING_SCAN) {
                     this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.WAITING_SCAN);
                  }
               }
            } else if (var1.vVvUvVVuuNvV() instanceof class_2626 var4) {
               if (this.vUNuuvvnVnv != null && var4.method_11309().equals(this.vUNuuvvnVnv) && var4.method_11308().method_27852(class_2246.field_10375)) {
                  this.vnVuunuNN = true;
               }

               if (!var2.nuUnNvnuUu) {
                  var2.UuUVuuUu(var4.method_11309(), var4.method_11308().method_26204());
               }
            } else if (var1.vVvUvVVuuNvV() instanceof class_2637 var5) {
               var5.method_30621((var2x, var3x) -> {
                  if (this.vUNuuvvnVnv != null && var2x.equals(this.vUNuuvvnVnv) && var3x.method_27852(class_2246.field_10375)) {
                     this.vnVuunuNN = true;
                  }

                  if (!var2.nuUnNvnuUu) {
                     var2.UuUVuuUu(var2x, var3x.method_26204());
                  }
               });
            }
         }
      }
   }

   private void UuUVuuUu(IBaritone var1) {
      this.uVUVnuvnuVuv();
      class_2338 var2 = this.nUUVuvU();
      if (var2 != null) {
         this.NVNnnvVnvV = var2;
         this.UuUVuuUu(var1, var2);
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.MOVING_SITE);
         this.C00OOC00oO("Место для взрыва: " + var2.method_23854());
      } else {
         this.nvUVNnuu(var1);
      }
   }

   private void C00OOC00oO(IBaritone var1) {
      if (!this.UuUVuuUu(this.uVvunVUNuUvu, "лечу к зоне поиска")) {
         if (this.uVunuUNVVUUV(var1)) {
            this.UNnVVNvvnVvU(var1);
         } else {
            if (this.uVvunVUNuUvu == null
               || this.C00OOC00oO(this.uVvunVUNuUvu, 9.0)
               || this.UnnnvvU.uNNnnnuuuN(18000L)
               || !this.UuuNnUvUuv(var1) && this.UnnnvvU.uNNnnnuuuN(2500L)) {
               this.vNVuvnUUnuUn();
               this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
            }
         }
      }
   }

   private void uUnuvNvvNU(IBaritone var1) {
      if (this.NVNnnvVnvV == null) {
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
      } else if (!this.UuUVuuUu(this.NVNnnvVnvV, "лечу к месту взрыва")) {
         if (this.uVunuUNVVUUV(var1)) {
            this.UNnVVNvvnVvU(var1);
         } else if (this.UnnnvvU.uNNnnnuuuN(22000L)) {
            this.NuvunVvnnN++;
            this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
         } else if (this.C00OOC00oO(this.NVNnnvVnvV, 10.0) || !this.UuuNnUvUuv(var1) && this.UnnnvvU.uNNnnnuuuN(2500L)) {
            this.vNVuvnUUnuUn();
            if (!this.vVvUvVVuuNvV(this.NVNnnvVnvV)) {
               this.NuvunVvnnN++;
               this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
            } else {
               this.vUNuuvvnVnv = this.nuUnNvnuUu(this.NVNnnvVnvV);
               if (this.vUNuuvvnVnv == null) {
                  this.NuvunVvnnN++;
                  this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
               } else {
                  this.UvUNuNvvNVNv = 0;
                  this.vnVuunuNN = false;
                  this.vVvuUVnV = null;
                  this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.CLEARING_SITE);
                  this.C00OOC00oO("Расчищаю площадку: " + this.vUNuuvvnVnv.method_23854());
               }
            }
         }
      }
   }

   private void vVvUvVVuuNvV(IBaritone var1) {
      if (this.vUNuuvvnVnv == null) {
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
      } else if (this.vNUvnnVnUvu(this.vUNuuvvnVnv)) {
         this.vNVuvnUUnuUn();
         this.vVvuUVnV = null;
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.PLACING_TNT);
      } else if (this.UnnnvvU.uNNnnnuuuN(14000L)) {
         this.NuvunVvnnN++;
         this.vNVuvnUUnuUn();
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
      } else {
         class_2338 var2 = this.UuUVuuUu(this.vUNuuvvnVnv);
         if (var2 == null) {
            this.NuvunVvnnN++;
            this.vNVuvnUUnuUn();
            this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
         } else {
            class_3965 var3 = this.UuuNnUvUuv(var2);
            if (var3 == null) {
               if (this.uVunuUNVVUUV(var1)) {
                  this.UNnVVNvvnVvU(var1);
               } else {
                  this.C00OOC00oO(var1, this.vUNuuvvnVnv);
               }
            } else {
               AutoAncientBot.NVnVnNnN var4 = this.UuUVuuUu(var3.method_17777(), 3000L);
               if (var4 == AutoAncientBot.NVnVnNnN.STUCK) {
                  this.NuvunVvnnN++;
                  this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
               } else {
                  if (var4 == AutoAncientBot.NVnVnNnN.NO_REACH) {
                     this.C00OOC00oO(var1, this.vUNuuvvnVnv);
                  }
               }
            }
         }
      }
   }

   private class_2338 UuUVuuUu(class_2338 var1) {
      if (!uUnuvNvvNU.field_1687.method_8320(var1).method_45474()) {
         return var1;
      } else {
         return !uUnuvNvvNU.field_1687.method_8320(var1.method_10084()).method_45474() ? var1.method_10084() : null;
      }
   }

   private void uNNnnnuuuN(IBaritone var1) {
      if (this.vUNuuvvnVnv == null) {
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
      } else if (uUnuvNvvNU.field_1687.method_8320(this.vUNuuvvnVnv).method_27852(class_2246.field_10375)) {
         if (this.vnVuunuNN) {
            if (this.VNNnnVUuvv.uNNnnnuuuN(1400L)) {
               this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.IGNITING_TNT);
            }
         } else {
            if (this.VNNnnVUuvv.uNNnnnuuuN(2500L)) {
               this.vNnNNNuVVnUv++;
               this.UvUNuNvvNVNv++;
               this.C00OOC00oO("Сервер съел ТНТ — переставляю (#" + this.vNnNNNuVVnUv + ")");
               this.UuUVuuUu(this.vUNuuvvnVnv, 0);
               if (this.UvUNuNvvNVNv >= 3) {
                  this.C00OOC00oO("ТНТ пропадает на этом месте — ищу другое");
                  this.NuvunVvnnN++;
                  this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
                  return;
               }

               this.UnnnvvU.UuUVuuUu();
               this.VNNnnVUuvv.UuUVuuUu();
            }
         }
      } else if (!this.UNnVVNvvnVvU(this.vUNuuvvnVnv)) {
         if (this.uVunuUNVVUUV(var1)) {
            this.UNnVVNvvnVvU(var1);
         } else {
            this.C00OOC00oO(var1, this.vUNuuvvnVnv);
         }
      } else {
         this.vNVuvnUUnuUn();
         if (!this.vNUvnnVnUvu(this.vUNuuvvnVnv)) {
            this.NuvunVvnnN++;
            this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
         } else {
            class_243 var2 = new class_243(this.vUNuuvvnVnv.method_10263() + 0.5, this.vUNuuvvnVnv.method_10264(), this.vUNuuvvnVnv.method_10260() + 0.5);
            uuUuvNuNVNVU var3 = this.UuUVuuUu(var2);
            this.UuUVuuUu(var3);
            if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
               if (this.VNNnnVUuvv.uNNnnnuuuN(900L)) {
                  if (!this.uVUuuVnNVU(this.vUNuuvvnVnv)) {
                     if (this.UnUNVVVNuv()) {
                        return;
                     }

                     this.a_();
                     return;
                  }

                  this.VNNnnVUuvv.UuUVuuUu();
               }

               if (this.UnnnvvU.uNNnnnuuuN(8000L)) {
                  this.NuvunVvnnN++;
                  this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
               }
            }
         }
      }
   }

   private void nuUnNvnuUu(IBaritone var1) {
      if (this.vUNuuvvnVnv == null) {
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
      } else if (!uUnuvNvvNU.field_1687.method_8320(this.vUNuuvvnVnv).method_27852(class_2246.field_10375)) {
         if (this.UnnnvvU.uNNnnnuuuN(600L)) {
            this.vNVuvnUUnuUn();
            this.CC0COO = false;
            this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION);
         }
      } else if (!this.UNnVVNvvnVvU(this.vUNuuvvnVnv)) {
         if (this.uVunuUNVVUUV(var1)) {
            this.UNnVVNvvnVvU(var1);
         } else {
            this.C00OOC00oO(var1, this.vUNuuvvnVnv);
         }
      } else {
         this.vNVuvnUUnuUn();
         class_3965 var2 = this.UnUNVVVNuv(this.vUNuuvvnVnv);
         if (var2 != null) {
            uuUuvNuNVNVU var3 = this.UuUVuuUu(var2.method_17784());
            this.UuUVuuUu(var3);
            if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
               if (this.UnnnvvU.uNNnnnuuuN(1400L)) {
                  if (this.VNNnnVUuvv.uNNnnnuuuN(900L)) {
                     if (!this.vuuuNvNuv(this.vUNuuvvnVnv)) {
                        this.NuvunVvnnN++;
                        this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
                        return;
                     }

                     this.CC0COO = false;
                     this.UvUnnnn++;
                     this.vNVuvnUUnuUn();
                     this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION);
                     this.C00OOC00oO("Поджёг ТНТ #" + this.UvUnnnn + " (" + this.vUNuuvvnVnv.method_23854() + ")");
                  }
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (!this.CC0COO
         && this.vUNuuvvnVnv != null
         && uUnuvNvvNU.field_1687.method_8320(this.vUNuuvvnVnv).method_27852(class_2246.field_10375)
         && this.UnnnvvU.uNNnnnuuuN(1800L)) {
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.IGNITING_TNT);
      } else {
         if (this.CC0COO || this.UnnnvvU.uNNnnnuuuN(6500L)) {
            this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.WAITING_SCAN);
         }
      }
   }

   private void UuUVuuUu(AncientXray var1) {
      if (this.UnnnvvU.uNNnnnuuuN(1200L)) {
         class_2338 var2 = this.vVvUvVVuuNvV(var1);
         if (var2 != null) {
            this.C00OOC00oO(var2);
         } else if (this.UuUVuuUu(class_2246.field_10375.method_8389()) == -1 && this.unnnNUNnVu != null && !this.UNNunNuUNVuU) {
            var1.UuUVuuUu(this.unnnNUNnVu, 2);
            this.UNNunNuUNVuU = true;
            this.C00OOC00oO("ТНТ закончилась — финальный скан вокруг взрыва");
            this.UnnnvvU.UuUVuuUu();
         } else {
            if (this.UnnnvvU.uNNnnnuuuN(4500L)) {
               this.C00OOC00oO("Обломков рядом нет — ищу новое место");
               this.NvnnUUuVvNU = null;
               this.vVvuUVnV = null;
               this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
               this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
               this.nvUVNnuu(BaritoneAPI.getProvider().getPrimaryBaritone());
            }
         }
      }
   }

   private void UuUVuuUu(IBaritone var1, AncientXray var2) {
      if (this.NnuUnUNnu != AutoAncientBot.nvnNNunvv.BREAKING) {
         this.uVUVnuvnuVuv();
      }

      List var3 = this.C00OOC00oO(var2);
      if (var3.isEmpty()) {
         this.VVuuUN(var1);
         this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.SEARCHING);
         this.nvUVNnuu(var1);
      } else if (this.NvnnUUuVvNU != null && !var3.contains(this.NvnnUUuVvNU)) {
         this.UnUNuUU();
         this.uUnuvNvvNU(var2);
      } else if (this.NvnnUUuVvNU != null && !uUnuvNvvNU.field_1687.method_8320(this.NvnnUUuVvNU).method_27852(class_2246.field_22109)) {
         this.UnUNuUU();
         this.uUnuvNvvNU(var2);
      } else {
         class_2338 var4 = this.NvnnUUuVvNU == null ? this.UuUVuuUu(var3) : this.NvnnUUuVvNU;
         if (this.NvnnUUuVvNU != null && this.NvnnUUuVvNU.equals(var4)) {
            if (this.NnuUnUNnu == AutoAncientBot.nvnNNunvv.APPROACHING) {
               this.C00OOC00oO(var1, var2);
            } else {
               if (this.NnuUnUNnu == AutoAncientBot.nvnNNunvv.BREAKING) {
                  this.uUnuvNvvNU(var1, var2);
               }
            }
         } else {
            if (this.NvnnUUuVvNU == null) {
               this.vuvnnvuNVvu = 0;
            }

            this.UuUVuuUu(var1, var4, true);
         }
      }
   }

   private void UuUVuuUu(IBaritone var1, class_2338 var2, boolean var3) {
      this.NvnnUUuVvNU = var2.method_10062();
      this.uVUVnuvnuVuv();
      this.vNVuvnUUnuUn();
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
      this.NVvnvnn = 0;
      this.vUvVUNnN = 0;
      this.NUuVnnuUnvu = null;
      this.vVvuUVnV = null;
      this.UnnNNvuvvUU.UuUVuuUu();
      this.vUvUvUNNuNvn.UuUVuuUu();
      if (var3) {
         this.UnnnvvU.UuUVuuUu();
      }

      this.UuUVuuUu("target ore " + this.NvnnUUuVvNU.method_23854());
   }

   private void VVuuUN(IBaritone var1) {
      var1.getMineProcess().cancel();
      var1.getBuilderProcess().onLostControl();
      this.vNVuvnUUnuUn();
      var1.getSelectionManager().removeAllSelections();
      this.NvnnUUuVvNU = null;
      this.vVvuUVnV = null;
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
      this.uVUVnuvnuVuv();
   }

   private List<class_2338> C00OOC00oO(AncientXray var1) {
      ArrayList var2 = new ArrayList<>(var1.UnUNVVVNuv());
      var2.removeIf(var2x -> {
         boolean var3 = !uUnuvNvvNU.field_1687.method_8320(var2x).method_27852(class_2246.field_22109);
         if (var3) {
            var1.UuUVuuUu(var2x);
         }

         if (!var3 && !this.UuuuNNunN.contains(var2x) && this.NVNnnvnuunNv(var2x)) {
            this.UuuuNNunN.add(var2x.method_10062());
            var1.UuUVuuUu(var2x);
            this.C00OOC00oO("Пропускаю обломок " + var2x.method_23854() + " — замурован в лаве, не подойти");
            return true;
         } else {
            return var3 || this.UuuuNNunN.contains(var2x);
         }
      });
      return var2;
   }

   private class_2338 UuUVuuUu(List<class_2338> var1) {
      return var1.stream()
         .min(Comparator.comparingDouble(var0 -> uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var0))))
         .orElse((class_2338)var1.get(0));
   }

   private void C00OOC00oO(IBaritone var1, AncientXray var2) {
      this.uVUVnuvnuVuv();
      if (this.nUUVuvU(this.NvnnUUuVvNU)) {
         this.uVUuuVnNVU(var1);
      } else if (this.vUvUvUNNuNvn.uNNnnnuuuN(22000L)) {
         this.UuUVuuUu(var2, "не смог дойти");
      } else if (!this.UuUVuuUu(this.NvnnUUuVvNU, "лечу к обломку")) {
         this.UuUVuuUu(var1, this.NvnnUUuVvNU, 2);
      }
   }

   private void uUnuvNvvNU(IBaritone var1, AncientXray var2) {
      class_3965 var3 = this.UuuNnUvUuv(this.NvnnUUuVvNU);
      if (var3 == null) {
         this.vVvuUVnV = null;
         if (this.uuVuUuuVVNvN.uNNnnnuuuN(900L)) {
            this.vUvVUNnN++;
            if (this.vUvVUNnN > 4) {
               this.UuUVuuUu(var2, "не удержаться рядом (лава/обрыв)");
               return;
            }

            this.vNUvnnVnUvu(var1);
            this.UuUVuuUu("lost reach " + this.NvnnUUuVvNU.method_23854());
         }
      } else {
         this.uuVuUuuVVNvN.UuUVuuUu();
         class_2338 var4 = var3.method_17777();
         if (!var4.equals(this.NUuVnnuUnvu)) {
            this.NUuVnnuUnvu = var4.method_10062();
            this.vUvVUNnN = 0;
         }

         boolean var5 = var4.equals(this.NvnnUUuVvNU);
         AutoAncientBot.NVnVnNnN var6 = this.UuUVuuUu(var4, var5 ? 9000L : 3000L);
         if (var6 != AutoAncientBot.NVnVnNnN.STUCK) {
            if (this.UnnnvvU.uNNnnnuuuN(18000L)) {
               if (this.vuuuNvNuv(var1)) {
                  this.vuvnnvuNVvu++;
                  this.UuUVuuUu("retry ore " + this.NvnnUUuVvNU.method_23854() + " #" + this.vuvnnvuNVvu);
                  this.vNUvnnVnUvu(var1);
                  this.UnnnvvU.UuUVuuUu();
                  return;
               }

               this.UuUVuuUu(var2, "не выкопался за таймаут");
            }
         } else {
            this.NVvnvnn++;
            if (var5 || this.NVvnvnn > 2) {
               this.UuUVuuUu(var2, "фантомные блоки, ресинк");
            }
         }
      }
   }

   private void vNUvnnVnUvu(IBaritone var1) {
      this.uVUVnuvnuVuv();
      this.uuVuUuuVVNvN.UuUVuuUu();
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
      this.vUvUvUNNuNvn.UuUVuuUu();
      this.UuUVuuUu(var1, this.NvnnUUuVvNU, 2);
   }

   private void uVUuuVnNVU(IBaritone var1) {
      this.vNVuvnUUnuUn();
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.BREAKING;
      this.NVvnvnn = 0;
      this.vVvuUVnV = null;
      this.UnnnvvU.UuUVuuUu();
      this.uuVuUuuVVNvN.UuUVuuUu();
      this.UuUVuuUu("break ore " + this.NvnnUUuVvNU.method_23854());
   }

   private void C00OOC00oO(class_2338 var1) {
      this.NvnnUUuVvNU = var1.method_10062();
      this.vuvnnvuNVvu = 0;
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
      this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.MINING);
      this.UuUVuuUu(BaritoneAPI.getProvider().getPrimaryBaritone(), this.NvnnUUuVvNU, true);
      AncientXray var2 = this.nNvNUVU();
      int var3 = var2 == null ? 0 : this.C00OOC00oO(var2).size();
      this.C00OOC00oO("Иду к обломку " + this.NvnnUUuVvNU.method_23854() + (var3 > 1 ? " (в очереди: " + var3 + ")" : ""));
   }

   private boolean vuuuNvNuv(IBaritone var1) {
      if (this.NvnnUUuVvNU != null && this.vuvnnvuNVvu < 2) {
         if (!uUnuvNvvNU.field_1687.method_8320(this.NvnnUUuVvNU).method_27852(class_2246.field_22109)) {
            return false;
         } else {
            double var2 = uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(this.NvnnUUuVvNU));
            return var1.getPathingBehavior().isPathing() || var2 <= 144.0 || this.nNvNUVU(this.NvnnUUuVvNU);
         }
      } else {
         return false;
      }
   }

   private void uUnuvNvvNU(AncientXray var1) {
      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      var2.getBuilderProcess().onLostControl();
      this.vNVuvnUUnuUn();
      var2.getSelectionManager().removeAllSelections();
      var1.UuUVuuUu(this.NvnnUUuVvNU);
      this.NvnnUUuVvNU = null;
      this.vVvuUVnV = null;
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
      this.uVUVnuvnuVuv();
   }

   private void UuUVuuUu(class_2338 var1, int var2) {
      if (uUnuvNvvNU.method_1562() != null) {
         for (int var3 = -var2; var3 <= var2; var3++) {
            for (int var4 = -var2; var4 <= var2; var4++) {
               for (int var5 = -var2; var5 <= var2; var5++) {
                  class_2338 var6 = var1.method_10069(var3, var4, var5);
                  uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12968, var6, class_2350.field_11036));
                  uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12971, var6, class_2350.field_11036));
               }
            }
         }
      }
   }

   private void UuUVuuUu(AncientXray var1, String var2) {
      if (this.NvnnUUuVvNU != null) {
         this.UuuuNNunN.add(this.NvnnUUuVvNU.method_10062());
         var1.UuUVuuUu(this.NvnnUUuVvNU);
         this.C00OOC00oO("Пропускаю обломок " + this.NvnnUUuVvNU.method_23854() + " — " + var2);
      }

      IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
      var3.getMineProcess().cancel();
      var3.getBuilderProcess().onLostControl();
      this.vNVuvnUUnuUn();
      var3.getSelectionManager().removeAllSelections();
      this.NvnnUUuVvNU = null;
      this.vVvuUVnV = null;
      this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
      this.uVUVnuvnuVuv();
   }

   private class_2338 vVvUvVVuuNvV(AncientXray var1) {
      return this.C00OOC00oO(var1)
         .stream()
         .min(Comparator.comparingDouble(var0 -> uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var0))))
         .orElse(null);
   }

   private void nvUVNnuu(IBaritone var1) {
      class_2338 var2 = uUnuvNvvNU.field_1724.method_24515();
      if (this.NuvunVvnnN > 0 && this.NuvunVvnnN % 4 == 0) {
         this.nUununvNvvn++;
      }

      byte var3 = 36;
      int var4 = var2.method_10263() + (int)Math.round(Math.cos(this.nUununvNvvn) * var3);
      int var5 = var2.method_10260() + (int)Math.round(Math.sin(this.nUununvNvvn) * var3);
      this.uVvunVUNuUvu = new class_2338(var4, this.vVvUvVVuuNvV(var2.method_10264()), var5);
      this.UuUVuuUu(var1, this.uVvunVUNuUvu);
      this.NuvunVvnnN++;
      this.UuUVuuUu(AutoAncientBot.uunvUUVnuNn.MOVING_SEARCH);
      this.UuUVuuUu("search " + this.uVvunVUNuUvu.method_23854());
   }

   private class_2338 nUUVuvU() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      byte var2 = 26;
      class_2338 var3 = null;
      int var4 = Integer.MIN_VALUE;

      for (int var5 = -var2; var5 <= var2; var5 += 4) {
         for (int var6 = -var2; var6 <= var2; var6 += 4) {
            for (byte var7 = -6; var7 <= 6; var7 += 2) {
               class_2338 var8 = new class_2338(var1.method_10263() + var5, var1.method_10264() + var7, var1.method_10260() + var6);
               int var9 = this.uUnuvNvvNU(var8);
               if (var9 != Integer.MIN_VALUE && (var3 == null || var9 > var4)) {
                  var3 = var8;
                  var4 = var9;
               }
            }
         }
      }

      return var3;
   }

   private int uUnuvNvvNU(class_2338 var1) {
      if (this.uNNnnnuuuN(var1)) {
         return Integer.MIN_VALUE;
      } else if (!this.NnUuNNU(var1.method_10074())) {
         return Integer.MIN_VALUE;
      } else {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;

         for (int var6 = -5; var6 <= 5; var6++) {
            for (int var7 = -3; var7 <= 3; var7++) {
               for (int var8 = -5; var8 <= 5; var8++) {
                  class_2338 var9 = var1.method_10069(var6, var7, var8);
                  class_2680 var10 = uUnuvNvvNU.field_1687.method_8320(var9);
                  class_2248 var11 = var10.method_26204();
                  var2++;
                  if (this.UuUVuuUu(var11)) {
                     var4++;
                  } else if (var11 == class_2246.field_10164) {
                     var5++;
                  } else if (this.C00OOC00oO(var11)) {
                     var3++;
                  }
               }
            }
         }

         if (!(var3 < var2 * 0.48) && !(var4 > var2 * 0.34) && !(var5 > var2 * 0.2)) {
            double var12 = uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var1));
            return var3 * 3 - var4 * 4 - var5 * 5 - (int)(var12 * 0.02) + this.uNNnnnuuuN(var1.method_10264());
         } else {
            return Integer.MIN_VALUE;
         }
      }
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      return this.uUnuvNvvNU(var1) != Integer.MIN_VALUE;
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
      double var2 = 842.4;

      for (class_2338 var5 : this.NNVNuUvVn) {
         if (this.C00OOC00oO(var1, var5) <= var2) {
            return true;
         }
      }

      return false;
   }

   private class_2338 nuUnNvnuUu(class_2338 var1) {
      class_2338 var2 = null;

      for (int var3 = 0; var3 <= 2; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               class_2338 var6 = var1.method_10069(var4, var3, var5);
               if (this.VVuuUN(var6)) {
                  if (this.vNUvnnVnUvu(var6)) {
                     return var6.method_10062();
                  }

                  if (var2 == null) {
                     var2 = var6.method_10062();
                  }
               }
            }
         }
      }

      if (var2 != null) {
         return var2;
      } else {
         return this.VVuuUN(var1) ? var1.method_10062() : null;
      }
   }

   private boolean VVuuUN(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var1.method_10084());
      return this.NnUuNNU(var1.method_10074()) && var2.method_26227().method_15769() && var3.method_26227().method_15769();
   }

   private boolean vNUvnnVnUvu(class_2338 var1) {
      return this.NnUuNNU(var1.method_10074())
         && uUnuvNvvNU.field_1687.method_8320(var1).method_45474()
         && uUnuvNvvNU.field_1687.method_8320(var1.method_10084()).method_45474();
   }

   private boolean UnUNVVVNuv() {
      AncientXray var1 = this.nNvNUVU();
      if (var1 == null) {
         return false;
      } else {
         class_2338 var2 = this.vVvUvVVuuNvV(var1);
         if (var2 == null) {
            return false;
         } else {
            this.C00OOC00oO(var2);
            return true;
         }
      }
   }

   private boolean uVUuuVnNVU(class_2338 var1) {
      int var2 = this.UuUVuuUu(class_2246.field_10375.method_8389());
      if (var2 == -1) {
         vVnvuVVUunuv.UuUVuuUu("[AutoAncient] TNT is missing from hotbar.");
         return false;
      } else {
         UVuvVVvnVNu.UuUVuuUu(var2);
         this.vnVuunuNN = false;
         class_2338 var3 = var1.method_10074();
         class_3965 var4 = new class_3965(
            new class_243(var1.method_10263() + 0.5, var1.method_10264(), var1.method_10260() + 0.5), class_2350.field_11036, var3, false
         );
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var4);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         return true;
      }
   }

   private boolean vuuuNvNuv(class_2338 var1) {
      int var2 = this.UuUVuuUu(class_1802.field_8884);
      if (var2 == -1) {
         vVnvuVVUunuv.UuUVuuUu("[AutoAncient] Flint and steel is missing from hotbar.");
         this.a_();
         return false;
      } else {
         class_3965 var3 = this.UnUNVVVNuv(var1);
         if (var3 == null) {
            return false;
         } else {
            UVuvVVvnVNu.UuUVuuUu(var2);
            class_3965 var4 = this.UvnvNVnnnnNU();
            class_3965 var5 = var4 != null && var4.method_17777().equals(var1) ? var4 : var3;
            uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var5);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            return true;
         }
      }
   }

   private AutoAncientBot.NVnVnNnN UuUVuuUu(class_2338 var1, long var2) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         class_3965 var4 = this.UnUNVVVNuv(var1);
         if (var4 != null && !(uUnuvNvvNU.field_1724.method_33571().method_1022(var4.method_17784()) > 4.2)) {
            this.vNVuvnUUnuUn();
            uuUuvNuNVNVU var5 = this.UuUVuuUu(var4.method_17784());
            this.UuUVuuUu(var5);
            if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var5) > 4.0F) {
               return AutoAncientBot.NVnVnNnN.AIMING;
            } else {
               class_3965 var6 = this.UvnvNVnnnnNU();
               class_3965 var7 = var6 != null && var6.method_17777().equals(var1) ? var6 : var4;
               if (!var1.equals(this.vVvuUVnV)) {
                  if (!this.VvVuvUvvNNVv.uNNnnnuuuN(90L)) {
                     return AutoAncientBot.NVnVnNnN.AIMING;
                  }

                  uUnuvNvvNU.field_1761.method_2910(var1, var7.method_17780());
                  this.vVvuUVnV = var1.method_10062();
                  this.VUUnuVvVu.UuUVuuUu();
                  this.VvVuvUvvNNVv.UuUVuuUu();
               } else {
                  if (this.VUUnuVvVu.uNNnnnuuuN(var2)) {
                     this.nvUVNnuu(var1);
                     this.vVvuUVnV = null;
                     return AutoAncientBot.NVnVnNnN.STUCK;
                  }

                  uUnuvNvvNU.field_1761.method_2902(var1, var7.method_17780());
               }

               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               return AutoAncientBot.NVnVnNnN.BREAKING;
            }
         } else {
            return AutoAncientBot.NVnVnNnN.NO_REACH;
         }
      } else {
         return AutoAncientBot.NVnVnNnN.NO_REACH;
      }
   }

   private void nvUVNnuu(class_2338 var1) {
      if (uUnuvNvvNU.method_1562() != null) {
         uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12971, var1, class_2350.field_11033));
      }
   }

   private void vNVuvnUUnuUn() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (var1.getPathingBehavior().isPathing() || var1.getCustomGoalProcess().isActive()) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.uuvvuNvuUNVV = null;
   }

   private boolean UuuNnUvUuv(IBaritone var1) {
      return var1.getPathingBehavior().isPathing() || var1.getCustomGoalProcess().isActive();
   }

   private void UuUVuuUu(IBaritone var1, class_2338 var2, int var3) {
      class_2338 var4 = var2.method_10062();
      boolean var5 = !var4.equals(this.uuvvuNvuUNVV);
      if (var5 || !var1.getCustomGoalProcess().isActive() && this.UnnNNvuvvUU.uNNnnnuuuN(600L)) {
         var1.getCustomGoalProcess().setGoalAndPath(new GoalNear(var4, var3));
         this.uuvvuNvuUNVV = var4;
         this.UnnNNvuvvUU.UuUVuuUu();
         if (var5) {
            this.NnUuNNU();
            this.UuUVuuUu("walk " + var4.method_23854());
         }
      }
   }

   private void UuUVuuUu(uuUuvNuNVNVU var1) {
      float var2 = new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1);
      float var3 = Math.max(34.0F, Math.min(140.0F, var2 * 1.35F));
      COC0OCc.UuUVuuUu(var1, var3, var3, var3, var3, 2, 20, false);
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new uuUuvNuNVNVU(var11, class_3532.method_15363(var12, -90.0F, 90.0F));
   }

   private class_3965 UvnvNVnnnnNU() {
      double var1 = Math.toRadians(uUnuvNvvNU.field_1724.method_36454());
      double var3 = Math.toRadians(uUnuvNvvNU.field_1724.method_36455());
      double var5 = Math.cos(var3);
      class_243 var7 = new class_243(-Math.sin(var1) * var5, -Math.sin(var3), Math.cos(var1) * var5);
      class_243 var8 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var9 = var8.method_1019(var7.method_1021(4.6000000000000005));
      class_3965 var10 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var8, var9, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var10.method_17783() == class_240.field_1332 ? var10 : null;
   }

   private class_3965 UuuNnUvUuv(class_2338 var1) {
      return this.UuUVuuUu(var1, 4.2);
   }

   private class_3965 UuUVuuUu(class_2338 var1, double var2) {
      class_3965 var4 = this.UnUNVVVNuv(var1);
      if (var4 == null) {
         class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
         class_3965 var6 = uUnuvNvvNU.field_1687
            .method_17742(new class_3959(var5, class_243.method_24953(var1), class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
         if (var6.method_17783() != class_240.field_1332) {
            return null;
         }

         class_2338 var7 = var6.method_17777();
         if (!var7.equals(var1) && uUnuvNvvNU.field_1687.method_8320(var7).method_26214(uUnuvNvvNU.field_1687, var7) < 0.0F) {
            return null;
         }

         var4 = var6;
      }

      return uUnuvNvvNU.field_1724.method_33571().method_1022(var4.method_17784()) > var2 ? null : var4;
   }

   private boolean nUUVuvU(class_2338 var1) {
      return var1 != null && this.UuUVuuUu(var1, 3.7) != null;
   }

   private class_3965 UnUNVVVNuv(class_2338 var1) {
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

   private void uVUVnuvnuVuv() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
      }

      this.vVvuUVnV = null;
   }

   private boolean nUUVuvU(IBaritone var1) {
      boolean var2 = PlayerHelper.UuuNnUvUuv();
      if (var2) {
         if (!this.uNnNUNvuVnu) {
            var1.getCommandManager().execute("pause");
            this.uNnNUNvuVnu = true;
            this.uVUVnuvnuVuv();
         }

         return true;
      } else {
         if (this.uNnNUNvuVnu) {
            var1.getCommandManager().execute("resume");
            this.uNnNUNvuVnu = false;
         }

         return false;
      }
   }

   private boolean UnUNVVVNuv(IBaritone var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null || uUnuvNvvNU.field_1690 == null) {
         return false;
      } else if (this.VUVvNvvVUN) {
         if (this.NVNnnvnuunNv() && this.uNUnUuUnvnnU >= 0 && this.UuUVuuUu(this.uNUnUuUnvnnU) && !this.VnVuuvVvnNv.uNNnnnuuuN(3500L)) {
            UVuvVVvnVNu.UuUVuuUu(this.uNUnUuUnvnnU);
            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
            if (!uUnuvNvvNU.field_1724.method_6115()) {
               uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            }

            return true;
         } else {
            this.vNVuvnUUnuUn(var1);
            return false;
         }
      } else if (!this.NVNnnvnuunNv()) {
         this.UvvNuvUNNNUv = false;
         return false;
      } else {
         int var2 = this.uVunuUNVVUUV();
         if (var2 == -1) {
            if (!this.UvvNuvUNNNUv) {
               vVnvuVVUunuv.UuUVuuUu("[AutoAncient] Fire resistance potion is missing from hotbar.");
               this.UvvNuvUNNNUv = true;
            }

            return false;
         } else {
            this.UvvNuvUNNNUv = false;
            this.uVUVnuvnuVuv(var1);
            this.VUVvNvvVUN = true;
            this.uNUnUuUnvnnU = var2;
            this.OoccOc0CO = uUnuvNvvNU.field_1724.method_31548().method_67532();
            this.VnVuuvVvnNv.UuUVuuUu();
            if (!this.VUNvNUuNVnn) {
               var1.getCommandManager().execute("pause");
               this.VUNvNUuNVnn = true;
            }

            this.uVUVnuvnuVuv();
            UVuvVVvnVNu.UuUVuuUu(this.uNUnUuUnvnnU);
            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            this.UuUVuuUu("drink fire res " + this.uNUnUuUnvnnU);
            return true;
         }
      }
   }

   private void vNVuvnUUnuUn(IBaritone var1) {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      }

      if (uUnuvNvvNU.field_1724 != null && this.OoccOc0CO >= 0 && this.OoccOc0CO < 9) {
         UVuvVVvnVNu.UuUVuuUu(this.OoccOc0CO);
      }

      if (var1 != null && this.VUNvNUuNVnn) {
         var1.getCommandManager().execute("resume");
      }

      this.VUNvNUuNVnn = false;
      this.VUVvNvvVUN = false;
      this.uNUnUuUnvnnU = -1;
      this.OoccOc0CO = -1;
   }

   private boolean NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         class_1293 var1 = uUnuvNvvNU.field_1724.method_6112(class_1294.field_5918);
         return var1 == null || var1.method_5584() <= 300;
      }
   }

   private int uVunuUNVVUUV() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (this.UuUVuuUu(var1)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private boolean UuUVuuUu(int var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 >= 0 && var1 <= 8) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (!var2.method_7960() && var2.method_31574(class_1802.field_8574)) {
            class_1844 var3 = (class_1844)var2.method_58694(class_9334.field_49651);
            if (var3 == null) {
               return false;
            } else {
               for (class_1293 var5 : var3.method_57397()) {
                  class_6880 var6 = var5.method_5579();
                  if (var6.equals(class_1294.field_5918)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean UvnvNVnnnnNU(IBaritone var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null || uUnuvNvvNU.field_1690 == null) {
         return false;
      } else if (this.NuUuUvUUvU) {
         if (uUnuvNvvNU.field_1724.method_7344().method_7586() < 19
            && this.vnuNNVvVVuN >= 0
            && this.C00OOC00oO(this.vnuNNVvVVuN)
            && !this.nNunUnVN.uNNnnnuuuN(7000L)) {
            UVuvVVvnVNu.UuUVuuUu(this.vnuNNVvVVuN);
            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
            if (!uUnuvNvvNU.field_1724.method_6115()) {
               uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            }

            return true;
         } else {
            this.uVUVnuvnuVuv(var1);
            return false;
         }
      } else if (this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.PLACING_TNT
         && this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.IGNITING_TNT
         && this.unnUnUNVnN != AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION) {
         if (uUnuvNvvNU.field_1724.method_7344().method_7586() <= 16 && uUnuvNvvNU.field_1724.method_7332(false)) {
            int var2 = this.UNnVVNvvnVvU();
            if (var2 == -1) {
               return false;
            } else {
               this.NuUuUvUUvU = true;
               this.vnuNNVvVVuN = var2;
               this.Oco0Oococc = uUnuvNvvNU.field_1724.method_31548().method_67532();
               this.nNunUnVN.UuUVuuUu();
               if (!this.NUUVUvvuNNVU) {
                  var1.getCommandManager().execute("pause");
                  this.NUUVUvvuNNVU = true;
               }

               this.uVUVnuvnuVuv();
               UVuvVVvnVNu.UuUVuuUu(this.vnuNNVvVVuN);
               uUnuvNvvNU.field_1690.field_1904.method_23481(true);
               uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
               this.UuUVuuUu("eat " + this.vnuNNVvVVuN);
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void uVUVnuvnuVuv(IBaritone var1) {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      }

      if (uUnuvNvvNU.field_1724 != null && this.Oco0Oococc >= 0 && this.Oco0Oococc < 9) {
         UVuvVVvnVNu.UuUVuuUu(this.Oco0Oococc);
      }

      if (var1 != null && this.NUUVUvvuNNVU) {
         var1.getCommandManager().execute("resume");
      }

      this.NUUVUvvuNNVU = false;
      this.NuUuUvUUvU = false;
      this.vnuNNVvVVuN = -1;
      this.Oco0Oococc = -1;
   }

   private int UNnVVNvvnVvU() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (this.C00OOC00oO(var1)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private boolean C00OOC00oO(int var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 >= 0 && var1 <= 8) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         return !var2.method_7960() && var2.method_57826(class_9334.field_50075);
      } else {
         return false;
      }
   }

   private boolean NVNnnvnuunNv(IBaritone var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1690 == null) {
         return false;
      } else if (!uUnuvNvvNU.field_1724.method_5771()) {
         if (this.UvuVvvVuUuuu) {
            this.uNnUnnuNUnNu();
         }

         return false;
      } else {
         if (!this.UvuVvvVuUuuu) {
            this.NnUVNnuvUv.UuUVuuUu();
            this.C00OOC00oO("Упал в лаву — выбираюсь");
         }

         this.UvuVvvVuUuuu = true;
         this.uVUVnuvnuVuv(var1);
         this.uVUVnuvnuVuv();
         this.vVvuUVnV = null;
         BaritoneAPI.getSettings().assumeWalkOnLava.value = true;
         if (this.nvuUVvuuN == null || this.uuuVnuvnnNnU.uNNnnnuuuN(2500L)) {
            class_2338 var2 = this.uUnuvNvvNU(10);
            if (var2 != null) {
               this.nvuUVvuuN = var2.method_10062();
               this.uuuVnuvnnNnU.UuUVuuUu();
               this.UuUVuuUu("lava escape " + this.nvuUVvuuN.method_23854());
            }
         }

         if (this.nvuUVvuuN != null) {
            this.UuUVuuUu(var1, this.nvuUVvuuN, 1);
         }

         if (this.uNUnuUUvvuU == AutoAncientBot.VvunVVUvUNnv.IDLE && this.uVunuUNVVUUV.uUnuvNvvNU() && this.NnUVNnuvUv.uNNnnnuuuN(3500L)) {
            class_2338 var3 = this.uUnuvNvvNU(24);
            if (var3 != null && this.UuUVuuUu(class_243.method_24955(var3), "выбираюсь из лавы")) {
               this.NnUVNnuvUv.UuUVuuUu();
               uUnuvNvvNU.field_1690.field_1903.method_23481(true);
               return true;
            }

            this.NnUVNnuvUv.UuUVuuUu();
         }

         uUnuvNvvNU.field_1690.field_1903.method_23481(true);
         return true;
      }
   }

   private void uNnUnnuNUnNu() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1903.method_23481(false);
      }

      if (this.VnnnvUunNvuu) {
         BaritoneAPI.getSettings().assumeWalkOnLava.value = false;
      }

      this.UvuVvvVuUuuu = false;
      this.nvuUVvuuN = null;
   }

   private class_2338 uUnuvNvvNU(int var1) {
      class_2338 var2 = uUnuvNvvNU.field_1724.method_24515();
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (int var6 = -var1; var6 <= var1; var6++) {
         for (int var7 = -2; var7 <= 7; var7++) {
            for (int var8 = -var1; var8 <= var1; var8++) {
               class_2338 var9 = var2.method_10069(var6, var7, var8);
               if (this.vNVuvnUUnuUn(var9)) {
                  double var10 = uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var9)) + Math.max(0, var7) * 0.6;
                  if (var10 < var4) {
                     var4 = var10;
                     var3 = var9.method_10062();
                  }
               }
            }
         }
      }

      return var3;
   }

   private boolean vNVuvnUUnuUn(class_2338 var1) {
      return this.NnUuNNU(var1.method_10074())
         && this.UvnvNVnnnnNU(var1)
         && this.UvnvNVnnnnNU(var1.method_10084())
         && !this.uVUVnuvnuVuv(var1.method_10074())
         && !this.uVUVnuvnuVuv(var1)
         && !this.uVUVnuvnuVuv(var1.method_10084());
   }

   private boolean UvnvNVnnnnNU(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      return var2.method_26227().method_15769() && var2.method_26220(uUnuvNvvNU.field_1687, var1).method_1110();
   }

   private boolean uVUVnuvnuVuv(class_2338 var1) {
      return uUnuvNvvNU.field_1687.method_8320(var1).method_27852(class_2246.field_10164);
   }

   private boolean NVNnnvnuunNv(class_2338 var1) {
      int var2 = 0;

      for (class_2350 var6 : class_2350.values()) {
         class_2338 var7 = var1.method_10093(var6);
         if (this.uVUVnuvnuVuv(var7)) {
            var2++;
         } else if (this.uVunuUNVVUUV(var7)) {
            return false;
         }
      }

      return var2 == 0 ? false : this.vuNnuUnu.computeIfAbsent(var1.method_10062(), var1x -> this.C00OOC00oO(var1x, 4) == null);
   }

   private boolean uVunuUNVVUUV(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      return var2.method_26227().method_15769() && var2.method_26220(uUnuvNvvNU.field_1687, var1).method_1110();
   }

   private boolean uVunuUNVVUUV(IBaritone var1) {
      if (uUnuvNvvNU.field_1724 != null && var1.getPathingBehavior().isPathing()) {
         class_243 var2 = uUnuvNvvNU.field_1724.method_19538();
         if (this.NunUUVVVuu != null && !(var2.method_1025(this.NunUUVVVuu) > 0.04)) {
            return this.VvuUUUNNNv.uNNnnnuuuN(2500L);
         } else {
            this.NunUUVVVuu = var2;
            this.VvuUUUNNNv.UuUVuuUu();
            return false;
         }
      } else {
         this.NnUuNNU();
         return false;
      }
   }

   private void NnUuNNU() {
      this.NunUUVVVuu = uUnuvNvvNU.field_1724 == null ? null : uUnuvNvvNU.field_1724.method_19538();
      this.VvuUUUNNNv.UuUVuuUu();
   }

   private void UNnVVNvvnVvU(IBaritone var1) {
      this.uVUVnuvnuVuv();
      this.UuUVuuUu(uUnuvNvvNU.field_1724.method_24515(), 1);
      this.vNVuvnUUnuUn();
      switch (this.unnUnUNVnN) {
         case MOVING_SEARCH:
            if (this.uVvunVUNuUvu != null) {
               this.UuUVuuUu(var1, this.uVvunVUNuUvu);
            }
            break;
         case MOVING_SITE:
            if (this.NVNnnvVnvV != null) {
               this.UuUVuuUu(var1, this.NVNnnvVnvV);
            }
            break;
         case CLEARING_SITE:
            if (this.vUNuuvvnVnv != null) {
               this.C00OOC00oO(var1, this.vUNuuvvnVnv);
            }
            break;
         case PLACING_TNT:
         case IGNITING_TNT:
            if (this.vUNuuvvnVnv != null) {
               this.C00OOC00oO(var1, this.vUNuuvvnVnv);
            }
      }

      this.NnUuNNU();
      this.UuUVuuUu("path rebuild");
   }

   private void UuUVuuUu(IBaritone var1, class_2338 var2) {
      this.UuUVuuUu(var1, var2, 1);
   }

   private void C00OOC00oO(IBaritone var1, class_2338 var2) {
      this.UuUVuuUu(var1, var2, 2);
   }

   private boolean UNnVVNvvnVvU(class_2338 var1) {
      return uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var1)) <= 9.0;
   }

   private int vVvUvVVuuNvV(int var1) {
      return var1 + class_3532.method_15340(36 - var1, -4, 4);
   }

   private int uNNnnnuuuN(int var1) {
      int var2 = Math.abs(var1 - 36);
      return Math.max(-120, 90 - var2 * 6);
   }

   private boolean uNnUnnuNUnNu(class_2338 var1) {
      return this.vUNuuvvnVnv != null
         ? this.UuUVuuUu(var1, this.vUNuuvvnVnv) <= 2304.0
         : this.unnUnUNVnN == AutoAncientBot.uunvUUVnuNn.WAITING_EXPLOSION || this.unnUnUNVnN == AutoAncientBot.uunvUUVnuNn.WAITING_SCAN;
   }

   private boolean C00OOC00oO(class_2338 var1, double var2) {
      return uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var1)) <= var2;
   }

   private boolean NnUuNNU(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      return !var2.method_45474() && var2.method_26227().method_15769();
   }

   private boolean nNvNUVU(class_2338 var1) {
      for (class_2350 var5 : class_2350.values()) {
         class_2248 var6 = uUnuvNvvNU.field_1687.method_8320(var1.method_10093(var5)).method_26204();
         if (this.UuUVuuUu(var6) || var6 == class_2246.field_10164) {
            return true;
         }
      }

      return false;
   }

   private boolean UuUVuuUu(class_2248 var1) {
      return var1 == class_2246.field_10124 || var1 == class_2246.field_10543 || var1 == class_2246.field_10243;
   }

   private boolean C00OOC00oO(class_2248 var1) {
      return var1 == class_2246.field_10515
         || var1 == class_2246.field_22091
         || var1 == class_2246.field_29032
         || var1 == class_2246.field_23869
         || var1 == class_2246.field_10114
         || var1 == class_2246.field_22090
         || var1 == class_2246.field_10255
         || var1 == class_2246.field_23077
         || var1 == class_2246.field_10213;
   }

   private int UuUVuuUu(class_1792 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private double UuUVuuUu(class_2338 var1, class_2338 var2) {
      double var3 = var1.method_10263() - var2.method_10263();
      double var5 = var1.method_10264() - var2.method_10264();
      double var7 = var1.method_10260() - var2.method_10260();
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   private double C00OOC00oO(class_2338 var1, class_2338 var2) {
      double var3 = var1.method_10263() - var2.method_10263();
      double var5 = var1.method_10260() - var2.method_10260();
      return var3 * var3 + var5 * var5;
   }

   private void UuUVuuUu(AutoAncientBot.uunvUUVnuNn var1) {
      if (this.unnUnUNVnN != var1) {
         this.UuUVuuUu(this.unnUnUNVnN + " -> " + var1);
      }

      this.unnUnUNVnN = var1;
      this.UnnnvvU.UuUVuuUu();
      this.VNNnnVUuvv.UuUVuuUu();
   }

   private AncientXray nNvNUVU() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AncientXray.class);
   }

   private void UuUVuuUu(String var1) {
      if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         vVnvuVVUunuv.UuUVuuUu("[AutoAncient] " + var1);
      }
   }

   private void C00OOC00oO(String var1) {
      if (this.NVNnnvnuunNv.uUnuvNvvNU()) {
         vVnvuVVUunuv.UuUVuuUu("[AutoAncient] " + var1);
      }
   }

   private void UnUNuUU() {
      if (this.NvnnUUuVvNU != null && this.NnuUnUNnu == AutoAncientBot.nvnNNunvv.BREAKING) {
         if (!uUnuvNvvNU.field_1687.method_8320(this.NvnnUUuVvNU).method_27852(class_2246.field_22109)) {
            this.UVUnUvUNU++;
            this.C00OOC00oO("Обломок добыт (всего: " + this.UVUnUvUNU + ")");
         }
      }
   }

   private int C00OOC00oO(class_1792 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < 36; var3++) {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
            if (var4.method_31574(var1)) {
               var2 += var4.method_7947();
            }
         }

         return var2;
      }
   }

   private boolean uNnUnnuNUnNu(IBaritone var1) {
      if (this.uNUnuUUvvuU == AutoAncientBot.VvunVVUvUNnv.IDLE) {
         return false;
      } else if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1690 != null) {
         if (uUnuvNvvNU.field_1724.method_5771()) {
            uUnuvNvvNU.field_1690.field_1903.method_23481(true);
         }

         if (this.unUVnu >= 0 && this.uNUnuUUvvuU == AutoAncientBot.VvunVVUvUNnv.AWAITING) {
            UVuvVVvnVNu.UuUVuuUu(this.unUVnu);
            this.unUVnu = -1;
         }

         if (this.uNUnuUUvvuU == AutoAncientBot.VvunVVUvUNnv.AIMING) {
            if (this.vuvvuVuVv.uNNnnnuuuN(2000L)) {
               this.UuUVuuUu("pearl aim timeout");
               this.uUVuVvuNUvnu();
               return false;
            } else {
               int var6 = this.UuUVuuUu(class_1802.field_8634);
               if (var6 == -1) {
                  this.uUVuVvuNUvnu();
                  return false;
               } else {
                  uuUuvNuNVNVU var7 = new uuUuvNuNVNVU(this.vunuUUVVUv, this.uuuNUnuvvNNv);
                  this.UuUVuuUu(var7);
                  if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var7) > 2.5F) {
                     return true;
                  } else {
                     class_243 var4 = uUnuvNvvNU.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
                     AutoAncientBot.nvUnvV var5 = this.UuUVuuUu(var4, this.vvVVVvVNVVVN);
                     if (var5 != null && !(var5.uUnuvNvvNU > 1.8) && this.C00OOC00oO(var5.vVvUvVVuuNvV)) {
                        this.vunuUUVVUv = var5.UuUVuuUu;
                        this.uuuNUnuvvNNv = var5.C00OOC00oO;
                        if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(new uuUuvNuNVNVU(this.vunuUUVVUv, this.uuuNUnuvvNNv)) > 2.5F) {
                           return true;
                        } else {
                           this.unUVnu = uUnuvNvvNU.field_1724.method_31548().method_67532();
                           UVuvVVvnVNu.UuUVuuUu(var6);
                           uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
                           uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                           this.occOCoc0OcO++;
                           this.uunNUuunVU.UuUVuuUu();
                           this.uUuuVvVunVVu = uUnuvNvvNU.field_1724.method_19538();
                           this.uNUnuUUvvuU = AutoAncientBot.VvunVVUvUNnv.AWAITING;
                           this.vuvvuVuVv.UuUVuuUu();
                           return true;
                        }
                     } else {
                        this.UuUVuuUu("pearl solution lost");
                        this.uUVuVvuNUvnu();
                        return false;
                     }
                  }
               }
            }
         } else {
            boolean var2 = this.vvVVVvVNVVVN != null && uUnuvNvvNU.field_1724.method_5707(this.vvVVVvVNVVVN) <= 25.0;
            boolean var3 = this.uUuuVvVunVVu != null && uUnuvNvvNU.field_1724.method_19538().method_1025(this.uUuuVvVunVVu) > 64.0;
            if (var2 || var3) {
               this.C00OOC00oO("Телепорт: " + this.NuUvUNN);
               this.NvNUuuuvUvu = 0;
               this.nNVVUnuVVVuV = null;
               this.NnUuNNU(var1);
               this.uUVuVvuNUvnu();
               return false;
            } else if (this.vuvvuVuVv.uNNnnnuuuN(5000L)) {
               this.NvNUuuuvUvu++;
               this.nNVVUnuVVVuV = this.vvVVVvVNVVVN;
               this.C00OOC00oO("Пёрка не долетела — эта цель в бане, иду пешком");
               this.uUVuVvuNUvnu();
               return false;
            } else {
               return true;
            }
         }
      } else {
         this.uUVuVvuNUvnu();
         return false;
      }
   }

   private void NnUuNNU(IBaritone var1) {
      this.UuUVuuUu(uUnuvNvvNU.field_1724.method_24515(), 1);
      this.uuvvuNvuUNVV = null;
      if (this.unnUnUNVnN == AutoAncientBot.uunvUUVnuNn.MINING) {
         this.NnuUnUNnu = AutoAncientBot.nvnNNunvv.APPROACHING;
         this.vVvuUVnV = null;
         this.vUvUvUNNuNvn.UuUVuuUu();
      } else {
         this.UNnVVNvvnVvU(var1);
      }

      this.NnUuNNU();
   }

   private void uUVuVvuNUvnu() {
      if (this.unUVnu >= 0) {
         UVuvVVvnVNu.UuUVuuUu(this.unUVnu);
         this.unUVnu = -1;
      }

      this.uNUnuUUvvuU = AutoAncientBot.VvunVVUvUNnv.IDLE;
      this.vvVVVvVNVVVN = null;
      this.NuUvUNN = null;
      this.uUuuVvVunVVu = null;
   }

   private boolean UuUVuuUu(class_2338 var1, String var2) {
      if (var1 == null || !this.uVunuUNVVUUV.uUnuvNvvNU() || this.uNUnuUUvvuU != AutoAncientBot.VvunVVUvUNnv.IDLE) {
         return false;
      } else if (!this.UvUvUNuvNU()) {
         return false;
      } else {
         class_243 var3 = class_243.method_24953(var1);
         if (var3.field_1351 - uUnuvNvvNU.field_1724.method_23318() > 2.5) {
            return false;
         } else {
            double var4 = var3.field_1352 - uUnuvNvvNU.field_1724.method_23317();
            double var6 = var3.field_1350 - uUnuvNvvNU.field_1724.method_23321();
            double var8 = var4 * var4 + var6 * var6;
            double var10 = this.UNnVVNvvnVvU.uUnuvNvvNU();
            if (var8 < var10 * var10) {
               return false;
            } else if (!this.NvnuuuvnVV.uNNnnnuuuN(1200L)) {
               return false;
            } else {
               this.NvnuuuvnVV.UuUVuuUu();
               class_2338 var12 = var1;
               if (var8 > 729.0) {
                  class_243 var13 = var3.method_1020(uUnuvNvvNU.field_1724.method_19538()).method_1029();
                  var12 = class_2338.method_49638(uUnuvNvvNU.field_1724.method_19538().method_1019(var13.method_1021(27.0)));
               }

               class_2338 var14 = this.C00OOC00oO(var12, 5);
               return var14 != null && this.UuUVuuUu(class_243.method_24955(var14), var2);
            }
         }
      }
   }

   private boolean UvUvUNuvNU() {
      long var1 = 2500L * (1L + Math.min(this.NvNUuuuvUvu, 3));
      return this.uunNUuunVU.uNNnnnuuuN(var1);
   }

   private boolean UuUVuuUu(class_243 var1, String var2) {
      if (!this.uVunuUNVVUUV.uUnuvNvvNU() || this.uNUnuUUvvuU != AutoAncientBot.VvunVVUvUNnv.IDLE || var1 == null) {
         return false;
      } else if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null) {
         return false;
      } else if (this.NuUuUvUUvU || this.VUVvNvvVUN) {
         return false;
      } else if (!this.UvUvUNuvNU()) {
         return false;
      } else if (this.UuUVuuUu(class_1802.field_8634) == -1) {
         return false;
      } else {
         boolean var3 = uUnuvNvvNU.field_1724.method_5771();
         if (!var3 && uUnuvNvvNU.field_1724.method_6032() < 8.0F) {
            return false;
         } else if (!var3 && var1.field_1351 - uUnuvNvvNU.field_1724.method_23318() > 2.5) {
            return false;
         } else if (this.nNVVUnuVVVuV != null && var1.method_1025(this.nNVVUnuVVVuV) < 16.0) {
            return false;
         } else {
            class_243 var4 = uUnuvNvvNU.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
            AutoAncientBot.nvUnvV var5 = this.UuUVuuUu(var4, var1);
            if (var5 != null && !(var5.uUnuvNvvNU > 1.8) && this.C00OOC00oO(var5.vVvUvVVuuNvV)) {
               this.vvVVVvVNVVVN = var1;
               this.NuUvUNN = var2;
               this.vunuUUVVUv = var5.UuUVuuUu;
               this.uuuNUnuvvNNv = var5.C00OOC00oO;
               this.uNUnuUUvvuU = AutoAncientBot.VvunVVUvUNnv.AIMING;
               this.vuvvuVuVv.UuUVuuUu();
               this.uVUVnuvnuVuv();
               this.vNVuvnUUnuUn();
               this.C00OOC00oO(
                  "Кидаю пёрку: "
                     + var2
                     + " → "
                     + (int)Math.floor(var1.field_1352)
                     + " "
                     + (int)Math.floor(var1.field_1351)
                     + " "
                     + (int)Math.floor(var1.field_1350)
               );
               return true;
            } else {
               this.UuUVuuUu("pearl no solution: " + var2);
               return false;
            }
         }
      }
   }

   private class_2338 C00OOC00oO(class_2338 var1, int var2) {
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (int var6 = -var2; var6 <= var2; var6++) {
         for (int var7 = -var2; var7 <= var2; var7++) {
            for (int var8 = -var2; var8 <= var2; var8++) {
               class_2338 var9 = var1.method_10069(var6, var7, var8);
               if (this.vNVuvnUUnuUn(var9)) {
                  double var10 = this.UuUVuuUu(var9, var1);
                  if (var10 < var4) {
                     var4 = var10;
                     var3 = var9.method_10062();
                  }
               }
            }
         }
      }

      return var3;
   }

   private boolean C00OOC00oO(class_243 var1) {
      class_2338 var2 = class_2338.method_49638(var1);
      if (!this.uVUVnuvnuVuv(var2) && !this.uVUVnuvnuVuv(var2.method_10084())) {
         for (int var3 = 1; var3 <= 4; var3++) {
            class_2338 var4 = var2.method_10087(var3);
            if (this.uVUVnuvnuVuv(var4)) {
               return false;
            }

            if (this.NnUuNNU(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private AutoAncientBot.nvUnvV UuUVuuUu(class_243 var1, class_243 var2) {
      double var3 = var2.field_1352 - var1.field_1352;
      double var5 = var2.field_1350 - var1.field_1350;
      float var7 = (float)Math.toDegrees(Math.atan2(-var3, var5));
      AutoAncientBot.nvUnvV var8 = null;

      for (float var9 = -6.0F; var9 <= 6.0F; var9 += 2.0F) {
         float var10 = var7 + var9;

         for (float var11 = -40.0F; var11 <= 80.0F; var11 += 2.0F) {
            AutoAncientBot.nvUnvV var12 = this.UuUVuuUu(var1, var2, var10, var11);
            if (var12 != null && (var8 == null || var12.uUnuvNvvNU < var8.uUnuvNvvNU)) {
               var8 = var12;
            }
         }
      }

      if (var8 == null) {
         return null;
      } else {
         AutoAncientBot.nvUnvV var13 = var8;

         for (float var14 = var8.UuUVuuUu - 2.0F; var14 <= var8.UuUVuuUu + 2.0F; var14 += 0.5F) {
            for (float var15 = var8.C00OOC00oO - 2.0F; var15 <= var8.C00OOC00oO + 2.0F; var15 += 0.3F) {
               AutoAncientBot.nvUnvV var16 = this.UuUVuuUu(var1, var2, var14, var15);
               if (var16 != null && var16.uUnuvNvvNU < var13.uUnuvNvvNU) {
                  var13 = var16;
               }
            }
         }

         return var13;
      }
   }

   private AutoAncientBot.nvUnvV UuUVuuUu(class_243 var1, class_243 var2, float var3, float var4) {
      class_243 var5 = this.UuUVuuUu(var3, var4);
      class_243 var6 = this.C00OOC00oO(var1, var5);
      if (var6 == null) {
         return null;
      } else {
         double var7 = Math.sqrt(var6.method_1025(var2));
         return new AutoAncientBot.nvUnvV(class_3532.method_15393(var3), class_3532.method_15363(var4, -90.0F, 90.0F), var7, var6);
      }
   }

   private class_243 UuUVuuUu(float var1, float var2) {
      float var3 = var1 * (float) (Math.PI / 180.0);
      float var4 = var2 * (float) (Math.PI / 180.0);
      double var5 = -class_3532.method_15374(var3) * class_3532.method_15362(var4);
      double var7 = -class_3532.method_15374(var4);
      double var9 = class_3532.method_15362(var3) * class_3532.method_15362(var4);
      class_243 var11 = new class_243(var5, var7, var9).method_1029().method_1021(1.5);
      class_243 var12 = uUnuvNvvNU.field_1724.method_60478();
      return var11.method_1031(var12.field_1352, uUnuvNvvNU.field_1724.method_24828() ? 0.0 : var12.field_1351, var12.field_1350);
   }

   private class_243 C00OOC00oO(class_243 var1, class_243 var2) {
      if (uUnuvNvvNU.field_1687 == null) {
         return null;
      } else {
         class_243 var3 = var1;
         class_243 var4 = var2;

         for (int var5 = 0; var5 < 160; var5++) {
            var4 = var4.method_1023(0.0, 0.03, 0.0).method_1021(0.99);
            class_243 var6 = var3.method_1019(var4);
            class_3965 var7 = uUnuvNvvNU.field_1687
               .method_17742(new class_3959(var3, var6, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724));
            if (var7.method_17783() != class_240.field_1333) {
               return var7.method_17784();
            }

            var3 = var6;
         }

         return var3;
      }
   }

   private void c0oOOCcCoC0() {
      Settings var1 = BaritoneAPI.getSettings();
      this.VuuUVVu = (Boolean)var1.allowPlace.value;
      this.nUNnuUNnV = (Boolean)var1.allowBreak.value;
      this.VuNVnvNNuNnn = (Boolean)var1.assumeWalkOnLava.value;
      this.uvVuuuvvVU = (Boolean)var1.walkWhileBreaking.value;
      List var2 = (List)var1.blocksToAvoid.value;
      this.NNnvvunuVNUn = (List<class_2248>)(var2 == null ? List.of() : new ArrayList<>(var2));
      List var3 = (List)var1.acceptableThrowawayItems.value;
      this.nVuuUnnUUVU = (List<class_1792>)(var3 == null ? List.of() : new ArrayList<>(var3));
      var1.allowPlace.value = true;
      var1.allowBreak.value = true;
      var1.assumeWalkOnLava.value = false;
      var1.walkWhileBreaking.value = false;
      if (var2 != null) {
         var2.remove(class_2246.field_10164);
      }

      if (var3 != null) {
         var3.remove(class_2246.field_10375.method_8389());
         this.UuUVuuUu(var3, class_2246.field_10515.method_8389());
         this.UuUVuuUu(var3, class_2246.field_23869.method_8389());
         this.UuUVuuUu(var3, class_2246.field_22091.method_8389());
         this.UuUVuuUu(var3, class_2246.field_10445.method_8389());
      }

      this.VnnnvUunNvuu = true;
   }

   private void VVnVNnunVvu() {
      if (this.VnnnvUunNvuu) {
         Settings var1 = BaritoneAPI.getSettings();
         var1.allowPlace.value = this.VuuUVVu;
         var1.allowBreak.value = this.nUNnuUNnV;
         var1.assumeWalkOnLava.value = this.VuNVnvNNuNnn;
         var1.walkWhileBreaking.value = this.uvVuuuvvVU;
         List var2 = (List)var1.blocksToAvoid.value;
         if (var2 != null) {
            var2.clear();
            var2.addAll(this.NNnvvunuVNUn);
         }

         List var3 = (List)var1.acceptableThrowawayItems.value;
         if (var3 != null) {
            var3.clear();
            var3.addAll(this.nVuuUnnUUVU);
         }

         this.VnnnvUunNvuu = false;
      }
   }

   private void UuUVuuUu(List<class_1792> var1, class_1792 var2) {
      if (!var1.contains(var2)) {
         var1.add(var2);
      }
   }

   static enum NVnVnNnN {
      AIMING,
      BREAKING,
      STUCK,
      NO_REACH;
   }

   static enum VvunVVUvUNnv {
      IDLE,
      AIMING,
      AWAITING;
   }

   static final class nvUnvV {
      final float UuUVuuUu;
      final float C00OOC00oO;
      final double uUnuvNvvNU;
      final class_243 vVvUvVVuuNvV;

      nvUnvV(float var1, float var2, double var3, class_243 var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var5;
      }
   }

   static enum nvnNNunvv {
      APPROACHING,
      BREAKING;
   }

   static enum uunvUUVnuNn {
      SEARCHING,
      MOVING_SEARCH,
      MOVING_SITE,
      CLEARING_SITE,
      PLACING_TNT,
      IGNITING_TNT,
      WAITING_EXPLOSION,
      WAITING_SCAN,
      MINING;
   }
}
