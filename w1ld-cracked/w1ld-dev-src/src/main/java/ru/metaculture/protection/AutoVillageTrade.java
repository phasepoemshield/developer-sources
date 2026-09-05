package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1646;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1728;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1914;
import net.minecraft.class_1916;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2371;
import net.minecraft.class_243;
import net.minecraft.class_2595;
import net.minecraft.class_2863;
import net.minecraft.class_3532;
import net.minecraft.class_3719;
import net.minecraft.class_3965;
import net.minecraft.class_437;
import net.minecraft.class_476;
import net.minecraft.class_492;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoVillageTrade",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически покупает товары у жителей",
   vVvUvVVuuNvV = {uVUNNUnNvU.VIP}
)
public class AutoVillageTrade extends Module {
   private static final String UNnVVNvvnVvU = "Золотой слиток";
   private static final String uNnUnnuNUnNu = "Редстоун";
   private static final String NnUuNNU = "Лазурит";
   private static final String nNvNUVU = "Жемчуг Эндера";
   private static final String UnUNuUU = "Бутылочка опыта";
   private static final String uUVuVvuNUvnu = "Стекло";
   private static final String UvUvUNuvNU = "Бирка";
   private static final String c0oOOCcCoC0 = "Стрелы";
   private static final String VVnVNnunVvu = "Хлеб";
   private static final String unNNVVNnvvV = "Золотая морковь";
   private static final String NuunnvnN = "Кварцевый блок";
   private static final String NVUunUNUN = "Седло";
   private static final long UUVNuUNUvUnV = 10000L;
   private static final int vuvnUnVnUNnV = 2;
   private static final int nnuUVNUuvvVU = 64;
   private static final long nVVUuvuNnUN = 2500L;
   private static final long nNnVnUNVV = 10000L;
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU(
      "Что покупать",
      "Золотой слиток",
      "Золотой слиток",
      "Редстоун",
      "Лазурит",
      "Жемчуг Эндера",
      "Бутылочка опыта",
      "Стекло",
      "Бирка",
      "Стрелы",
      "Хлеб",
      "Золотая морковь",
      "Кварцевый блок",
      "Седло"
   );
   private final nNUuNvVn nuunNvv = new nNUuNvVn("Макс. цена", 64.0F, 1.0F, 64.0F, 1.0F, false);
   private final nNUuNvVn uUVVvVVNvvn = new nNUuNvVn("Запас изумрудов", 64.0F, 0.0F, 2304.0F, 64.0F, false);
   private final nNUuNvVn vvUVNVvvNUv = new nNUuNvVn("Радиус жителя", 4.0F, 2.0F, 8.0F, 0.5F, false);
   private final nNUuNvVn UuNnnVnuNNV = new nNUuNvVn("Задержка (мс)", 120.0F, 50.0F, 1000.0F, 10.0F, false);
   private final nNUuNvVn uUVvnUuNvvN = new nNUuNvVn("КД рескана (сек)", 45.0F, 5.0F, 300.0F, 5.0F, false);
   private final vvNnnUNnVvn UUuUnNVNuuv = new vvNnnUNnVvn("Авто-изумруды", true);
   private final uVNuNUVvn NVuNUuVnVUN = new uVNuNUVvn("Точка", -1);
   private final uVNuNUVvn NVuunNnvvvVu = new uVNuNUVvn("Сундук", -1);
   private final UNNVUuvVNNuv vNnNuuvVn = new UNNVUuvVNNuv("Сброс точек", 0, this::uVUVnuvnuVuv) {
      @Override
      public void vVvUvVVuuNvV() {
         AutoVillageTrade.this.UvnvNVnnnnNU();
      }
   };
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Не отображать экран", false);
   private static class_2338 VUuuVUnun;
   private static class_2338 vVVuuVVv;
   private static class_2338 VuunNUUUvu;
   private final NnuUuVVVvUu NNUUNUuVNNVn = new NnuUuVVVvUu();
   private final VuNvNNvVV VvVvnNUnvuvV = new VuNvNNvVV();
   private final unnunUVvU ccOO0COcoco0 = new unnunUVvU();
   private final Map<UUID, AutoVillageTrade.VvunVVUvUNnv> NUVvUUVuVNVv = new HashMap<>();
   private final List<class_2338> nNuVunNUVu = new ArrayList<>();
   private AutoVillageTrade.NVnVnNnN UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
   private UUID UnvuVuVnNuvu;
   private int UvNNVUVNVuvV = -1;
   private int NnunUUnU;
   private int nvuVvuNnNUnv;
   private int NnVnNVN;
   private long vnvvNvUnVv;
   private long OCOocoOoOO;
   private class_2338 o0Ooc0COOoc;
   private int nvvnUnUn = -1;
   private Boolean UnUUVuVunvVu;
   private Boolean nnvuvUNuUnN;
   private String UVnuVUUVnnU = "Золотой слиток";
   private int VunnVNvNV = -1;
   private int NvUVUvVVnUu;
   private int unnUnUNVnN = -1;
   private long NnuUnUNnu;
   private class_437 UnnnvvU;

   public AutoVillageTrade() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVuNUuVnVUN,
            this.NVuunNnvvvVu,
            this.vNnNuuvVn,
            this.NVNnnvnuunNv,
            this.nuunNvv,
            this.uUVVvVVNvvn,
            this.vvUVNVvvNUv,
            this.UuNnnVnuNNV,
            this.uUVvnUuNvvN,
            this.UUuUnNVNuuv,
            this.uVunuUNVVUUV
         }
      );
   }

   public AutoVillageTrade.nvnNNunvv UuUVuuUu(class_1646 var1) {
      if (this.nuUnNvnuUu && var1 != null) {
         AutoVillageTrade.VvunVVUvUNnv var2 = this.NUVvUUVuVNVv.get(var1.method_5667());
         if (var2 != null && var2.vuuuNvNuv && var2.nuUnNvnuUu != Integer.MAX_VALUE) {
            int var3 = Math.max(0, (var2.uVUuuVnNVU - var2.vNUvnnVnUvu) * var2.VVuuUN);
            boolean var4 = !var2.nvUVNnuu && var2.nuUnNvnuUu <= this.vnvvNvUnVv() && var3 > 0;
            class_1799 var5 = new class_1799(this.NnunUUnU(), Math.max(1, Math.min(99, var3)));
            return new AutoVillageTrade.nvnNNunvv(var5, var2.nuUnNvnuUu, var2.VVuuUN, var3, var4);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.vVvUvVVuuNvV(false);
      this.UVnuVUUVnnU = this.NVNnnvnuunNv.uUnuvNvvNU();
      this.vNnNuuvVn();
      this.NVuNUuVnVUN();
      if (this.nNuVunNUVu.isEmpty()) {
         this.C00OOC00oO("Установи две точки маршрута через бинд «Точка».");
      } else {
         this.nuunNvv();
      }
   }

   @Override
   public void C00OOC00oO() {
      this.NVuunNnvvvVu();
      this.VUuuVUnun();
      this.NNUUNUuVNNVn.UuUVuuUu();
      this.vVvUvVVuuNvV(true);
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (uUnuvNvvNU.field_1724 != null && this.ccOO0COcoco0.vVvUvVVuuNvV(300L)) {
         if (var1.vVvUvVVuuNvV() == this.NVuunNnvvvVu.uUnuvNvvNU()) {
            this.vNVuvnUUnuUn();
            this.ccOO0COcoco0.UuUVuuUu();
         } else if (var1.vVvUvVVuuNvV() == this.NVuNUuVnVUN.uUnuvNvvNU()) {
            if (this.NnVnNVN == 0) {
               VUuuVUnun = uUnuvNvvNU.field_1724.method_24515();
               vVVuuVVv = null;
               this.NnVnNVN = 1;
               this.C00OOC00oO("Точка 1: " + VUuuVUnun.method_23854());
            } else if (this.NnVnNVN == 1) {
               vVVuuVVv = uUnuvNvvNU.field_1724.method_24515();
               this.NnVnNVN = 2;
               this.C00OOC00oO("Точка 2: " + vVVuuVVv.method_23854());
            } else {
               VUuuVUnun = uUnuvNvvNU.field_1724.method_24515();
               vVVuuVVv = null;
               this.NnVnNVN = 1;
               this.C00OOC00oO("Точки сброшены. Точка 1: " + VUuuVUnun.method_23854());
            }

            this.NVuNUuVnVUN();
            if (this.nuUnNvnuUu && !this.nNuVunNUVu.isEmpty()) {
               this.nuunNvv();
            }

            this.ccOO0COcoco0.UuUVuuUu();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(CocoCOCco0C var1) {
      if (this.uVunuUNVVUUV.uUnuvNvvNU() && this.UuUVuuUu(var1.uUnuvNvvNU())) {
         this.UnnnvvU = var1.uUnuvNvvNU();
         var1.vVvUvVVuuNvV();
      }
   }

   private void vNVuvnUUnuUn() {
      if (uUnuvNvvNU.field_1765 instanceof class_3965 var1 && uUnuvNvvNU.field_1687 != null) {
         class_2338 var3 = var1.method_17777();
         if (!this.uNNnnnuuuN(var3)) {
            this.C00OOC00oO("Это не сундук и не бочка.");
         } else {
            VuunNUUUvu = var3;
            this.C00OOC00oO("Сундук для складирования установлен: " + var3.method_23854());
         }
      } else {
         this.C00OOC00oO("Наведи прицел на сундук или бочку.");
      }
   }

   void UvnvNVnnnnNU() {
      VUuuVUnun = null;
      vVVuuVVv = null;
      this.NnVnNVN = 0;
      this.nNuVunNUVu.clear();
      this.NUVvUUVuVNVv.clear();
      this.UnvuVuVnNuvu = null;
      this.UvNNVUVNVuvV = -1;
      this.NnunUUnU = 0;
      this.o0Ooc0COOoc = null;
      this.nvvnUnUn = -1;
      this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
      this.VuunNUUUvu();
      this.NVuunNnvvvVu();
      this.VvVvnNUnvuvV.UuUVuuUu();
      this.C00OOC00oO("Точки маршрута сброшены.");
   }

   private String uVUVnuvnuVuv() {
      if (VUuuVUnun == null && vVVuuVVv == null) {
         return "Точки не заданы";
      } else {
         return vVVuuVVv == null ? "Сбросить 1 точку" : "Сбросить 2 точки";
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.method_1562() != null) {
         if (PlayerHelper.UuuNnUvUuv()) {
            this.NVuunNnvvvVu();
            this.NNUUNUuVNNVn.UuUVuuUu();
         } else {
            if (this.nNuVunNUVu.isEmpty()) {
               this.NVuNUuVnVUN();
               if (this.nNuVunNUVu.isEmpty()) {
                  return;
               }

               this.nuunNvv();
            }

            if (!this.NVNnnvnuunNv.uUnuvNvvNU().equals(this.UVnuVUUVnnU)) {
               this.UVnuVUUVnnU = this.NVNnnvnuunNv.uUnuvNvvNU();
               this.NUVvUUVuVNVv.clear();
               this.VuunNUUUvu();
               this.nuunNvv();
            } else {
               switch (this.UNvvunVVn) {
                  case IDLE:
                     this.NVNnnvnuunNv();
                     break;
                  case SCAN_ROUTE:
                     this.uVunuUNVVUUV();
                     break;
                  case OPEN_SCAN:
                     this.UuUVuuUu(AutoVillageTrade.NVnVnNnN.WAIT_SCAN_SCREEN);
                     break;
                  case WAIT_SCAN_SCREEN:
                     this.UuUVuuUu(AutoVillageTrade.NVnVnNnN.READ_SCAN_SCREEN, AutoVillageTrade.NVnVnNnN.SCAN_ROUTE);
                     break;
                  case READ_SCAN_SCREEN:
                     this.uNnUnnuNUnNu();
                     break;
                  case CLOSE_SCAN_SCREEN:
                     this.C00OOC00oO(AutoVillageTrade.NVnVnNnN.SCAN_ROUTE);
                     break;
                  case MOVE_TO_TRADE:
                     this.UNnVVNvvnVvU();
                     break;
                  case OPEN_TRADE:
                     this.UuUVuuUu(AutoVillageTrade.NVnVnNnN.WAIT_TRADE_SCREEN);
                     break;
                  case WAIT_TRADE_SCREEN:
                     this.UuUVuuUu(AutoVillageTrade.NVnVnNnN.BUY_TRADE, AutoVillageTrade.NVnVnNnN.IDLE);
                     break;
                  case BUY_TRADE:
                     this.NnUuNNU();
                     break;
                  case CLOSE_TRADE_SCREEN:
                     this.C00OOC00oO(AutoVillageTrade.NVnVnNnN.IDLE);
                     break;
                  case MOVE_TO_STORAGE:
                     this.UnUNuUU();
                     break;
                  case OPEN_STORAGE:
                     this.uUVuVvuNUvnu();
                     break;
                  case WAIT_STORAGE_SCREEN:
                     this.UvUvUNuvNU();
                     break;
                  case PUT_STORAGE:
                     this.c0oOOCcCoC0();
                     break;
                  case BUY_EMERALDS_OPEN_SHOP:
                     this.unNNVVNnvvV();
                     break;
                  case BUY_EMERALDS_WAIT_SHOP:
                     this.NuunnvnN();
                     break;
                  case BUY_EMERALDS_FIND_GOLD:
                     this.NVUunUNUN();
                     break;
                  case BUY_EMERALDS_WAIT_MENU:
                     this.UUVNuUNUvUnV();
                     break;
                  case BUY_EMERALDS_FIND_EMERALD:
                     this.vuvnUnVnUNnV();
                     break;
                  case BUY_EMERALDS_WAIT_CONFIRM:
                     this.nnuUVNUuvvVU();
                     break;
                  case BUY_EMERALDS_CONFIRM:
                     this.nVVUuvuNnUN();
                     break;
                  case BUY_EMERALDS_CLOSE:
                     this.nNnVnUNVV();
                     break;
                  case WAIT_RESTOCK:
                     this.VVnVNnunVvu();
               }
            }
         }
      }
   }

   private void NVNnnvnuunNv() {
      if (this.ccOO0COcoco0()) {
         this.nNvNUVU();
      } else if (!this.UUuUnNVNuuv.uUnuvNvvNU() || !this.UNvvunVVn()) {
         AutoVillageTrade.VvunVVUvUNnv var1 = this.UuNnnVnuNNV();
         if (var1 != null) {
            this.UnvuVuVnNuvu = var1.UuUVuuUu;
            this.UvNNVUVNVuvV = var1.uNNnnnuuuN;
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.MOVE_TO_TRADE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else if (this.vvUVNVvvNUv()) {
            this.nuunNvv();
         } else {
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.WAIT_RESTOCK;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      } else if (!this.NUVvUUVuVNVv()) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_OPEN_SHOP;
         this.VvVvnNUnvuvV.UuUVuuUu();
      }
   }

   private void uVunuUNVVUUV() {
      if (this.NnunUUnU >= this.nNuVunNUVu.size()) {
         this.uUVVvVVNvvn();
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         class_2338 var1 = this.nNuVunNUVu.get(this.NnunUUnU);
         this.UuUVuuUu(var1, 0);
         if (this.UuUVuuUu(var1, 1.2)) {
            class_1646 var2 = this.vVvUvVVuuNvV(var1);
            if (var2 == null) {
               this.NnunUUnU++;
            } else {
               this.UnvuVuVnNuvu = var2.method_5667();
               this.UvNNVUVNVuvV = -1;
               this.NVuunNnvvvVu();
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.OPEN_SCAN;
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         }
      }
   }

   private void UNnVVNvvnVvU() {
      AutoVillageTrade.VvunVVUvUNnv var1 = this.uUVvnUuNvvN();
      if (var1 == null) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
      } else if (this.C00OOC00oO(class_1802.field_8687) < Math.max(1, var1.nuUnNvnuUu)) {
         if (!this.UnvuVuVnNuvu()) {
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else if (!this.NUVvUUVuVNVv()) {
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_OPEN_SHOP;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      } else {
         class_1646 var2 = this.UuUVuuUu(var1.UuUVuuUu);
         if (var2 != null) {
            var1.C00OOC00oO = var2.method_24515();
            var1.uUnuvNvvNU = var2.method_5628();
         }

         this.UuUVuuUu(var1.C00OOC00oO, 2);
         if (this.UuUVuuUu(var1.C00OOC00oO, (double)(this.vvUVNVvvNUv.uUnuvNvvNU() + 0.5F))) {
            this.NVuunNnvvvVu();
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.OPEN_TRADE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void UuUVuuUu(AutoVillageTrade.NVnVnNnN var1) {
      class_1646 var2 = this.UuUVuuUu(this.UnvuVuVnNuvu);
      if (var2 != null && var2.method_5805()) {
         if (uUnuvNvvNU.field_1724.method_5707(var2.method_19538()) > this.UuUVuuUu(this.vvUVNVvvNUv.uUnuvNvvNU() + 1.0F)) {
            this.UUuUnNVNuuv();
            this.UNvvunVVn = var1 == AutoVillageTrade.NVnVnNnN.WAIT_SCAN_SCREEN ? AutoVillageTrade.NVnVnNnN.SCAN_ROUTE : AutoVillageTrade.NVnVnNnN.IDLE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else {
            uuUuvNuNVNVU var3 = this.UuUVuuUu(var2.method_33571());
            this.NNUUNUuVNNVn.UuUVuuUu(var3, 45.0F, 45.0F, 2, 15);
            if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 7.0F)) {
               if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
                  uUnuvNvvNU.field_1761.method_2905(uUnuvNvvNU.field_1724, var2, class_1268.field_5808);
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  this.UNvvunVVn = var1;
                  this.VvVvnNUnvuvV.UuUVuuUu();
               }
            }
         }
      } else {
         this.UUuUnNVNuuv();
         this.UNvvunVVn = var1 == AutoVillageTrade.NVnVnNnN.WAIT_SCAN_SCREEN ? AutoVillageTrade.NVnVnNnN.SCAN_ROUTE : AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      }
   }

   private void UuUVuuUu(AutoVillageTrade.NVnVnNnN var1, AutoVillageTrade.NVnVnNnN var2) {
      if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1728) {
         this.UNvvunVVn = var1;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(2500L)) {
            this.UUuUnNVNuuv();
            this.UNvvunVVn = var2;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void uNnUnnuNUnNu() {
      if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1728 var1) {
         this.UuUVuuUu(this.UnvuVuVnNuvu, var1.method_17438());
         this.VuunNUUUvu();
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.CLOSE_SCAN_SCREEN;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.SCAN_ROUTE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      }
   }

   private void NnUuNNU() {
      if (!(uUnuvNvvNU.field_1724.field_7512 instanceof class_1728 var1)) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         AutoVillageTrade.VvunVVUvUNnv var5 = this.UuUVuuUu(this.UnvuVuVnNuvu, var1.method_17438());
         if (var5 != null && var5.vuuuNvNuv && var5.uNNnnnuuuN >= 0 && !var5.nvUVNnuu && var5.nuUnNvnuUu <= this.vnvvNvUnVv()) {
            this.UvNNVUVNVuvV = var5.uNNnnnuuuN;
            if (this.C00OOC00oO(class_1802.field_8687) < var5.nuUnNvnuUu) {
               this.VuunNUUUvu();
               if (!this.UnvuVuVnNuvu()) {
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.CLOSE_TRADE_SCREEN;
                  this.VvVvnNUnvuvV.UuUVuuUu();
               } else if (!this.NUVvUUVuVNVv()) {
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_OPEN_SHOP;
                  this.VvVvnNUnvuvV.UuUVuuUu();
               }
            } else if (this.uUnuvNvvNU(this.NnunUUnU())) {
               if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
                  var1.method_7650(this.UvNNVUVNVuvV);
                  var1.method_20215(this.UvNNVUVNVuvV);
                  uUnuvNvvNU.method_1562().method_52787(new class_2863(this.UvNNVUVNVuvV));
                  class_1735 var3 = var1.method_7611(2);
                  if (var3.method_7681() && var3.method_7677().method_31574(this.NnunUUnU())) {
                     int var4 = Math.max(1, var3.method_7677().method_7947());
                     uUnuvNvvNU.field_1761.method_2906(var1.field_7763, 2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                     var5.UnUNVVVNuv += var4;
                     var5.vNVuvnUUnuUn = var5.vNVuvnUUnuUn + var5.nuUnNvnuUu;
                     var5.nUUVuvU = System.currentTimeMillis();
                     this.VvVvnNUnvuvV.UuUVuuUu();
                  } else {
                     this.VvVvnNUnvuvV.UuUVuuUu();
                  }
               }
            } else {
               if (VuunNUUUvu != null && this.C00OOC00oO(this.NnunUUnU()) > 0) {
                  this.VuunNUUUvu();
                  this.nNvNUVU();
               } else {
                  this.C00OOC00oO("Инвентарь заполнен. Установи сундук для складирования.");
                  this.VuunNUUUvu();
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.CLOSE_TRADE_SCREEN;
               }

               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         } else {
            this.VuunNUUUvu();
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.CLOSE_TRADE_SCREEN;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void C00OOC00oO(AutoVillageTrade.NVnVnNnN var1) {
      if (this.VvVvnNUnvuvV.uNNnnnuuuN(150L)) {
         if (this.VvVvnNUnvuvV()) {
            this.VuunNUUUvu();
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else {
            this.UNvvunVVn = var1;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void nNvNUVU() {
      if (VuunNUUUvu == null) {
         this.C00OOC00oO("Сундук для складирования не установлен.");
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else if (!this.uNNnnnuuuN(VuunNUUUvu)) {
         this.C00OOC00oO("Сундук для складирования недоступен.");
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         this.NVuunNnvvvVu();
         this.VuunNUUUvu();
         this.VunnVNvNV = -1;
         this.NvUVUvVVnUu = 0;
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.MOVE_TO_STORAGE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      }
   }

   private void UnUNuUU() {
      if (VuunNUUUvu != null && this.uNNnnnuuuN(VuunNUUUvu)) {
         this.UuUVuuUu(VuunNUUUvu, 2);
         if (this.UuUVuuUu(VuunNUUUvu, 3.5)) {
            this.NVuunNnvvvVu();
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.OPEN_STORAGE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      } else {
         this.C00OOC00oO("Сундук для складирования недоступен.");
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      }
   }

   private void uUVuVvuNUvnu() {
      if (VuunNUUUvu == null || !this.uNNnnnuuuN(VuunNUUUvu)) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else if (this.NNUUNUuVNNVn() != null) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.PUT_STORAGE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else if (this.vVVuuVVv()) {
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         uuUuvNuNVNVU var1 = this.UuUVuuUu(class_243.method_24953(VuunNUUUvu));
         this.NNUUNUuVNNVn.UuUVuuUu(var1, 35.0F, 35.0F, 4, 15);
         if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1) > 4.0F)) {
            if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
               this.nuUnNvnuUu(VuunNUUUvu);
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.WAIT_STORAGE_SCREEN;
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         }
      }
   }

   private void UvUvUNuvNU() {
      if (this.NNUUNUuVNNVn() != null) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.PUT_STORAGE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(2500L)) {
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.OPEN_STORAGE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void c0oOOCcCoC0() {
      class_476 var1 = this.NNUUNUuVNNVn();
      if (var1 == null) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
      } else {
         int var2 = this.C00OOC00oO(this.NnunUUnU());
         if (var2 <= 0) {
            this.VuunNUUUvu();
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else if (this.VvVvnNUnvuvV.uNNnnnuuuN(150L)) {
            if (this.VunnVNvNV == var2) {
               this.NvUVUvVVnUu++;
               if (this.NvUVUvVVnUu >= 5) {
                  this.C00OOC00oO("Сундук заполнен или предмет не перекладывается.");
                  this.VuunNUUUvu();
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
                  this.VvVvnNUnvuvV.UuUVuuUu();
                  return;
               }
            } else {
               this.NvUVUvVVnUu = 0;
            }

            int var3 = this.UuUVuuUu(var1);
            if (var3 == -1) {
               this.VuunNUUUvu();
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            } else {
               this.VunnVNvNV = var2;
               uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var3, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         }
      }
   }

   private void VVnVNnunVvu() {
      class_2338 var1 = this.nvuVvuNnNUnv();
      if (var1 != null && !this.UuUVuuUu(var1, 1.5)) {
         this.UuUVuuUu(var1, 0);
      } else {
         this.NVuunNnvvvVu();
      }

      if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.o0Ooc0COOoc())) {
         this.nuunNvv();
      }
   }

   private void unNNVVNnvvV() {
      if (!this.UnvuVuVnNuvu()) {
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
      } else if (!this.NUVvUUVuVNVv()) {
         if (this.VvVvnNUnvuvV()) {
            this.VuunNUUUvu();
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("shop");
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_WAIT_SHOP;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void NuunnvnN() {
      if (!this.NUVvUUVuVNVv()) {
         if (this.NNUUNUuVNNVn() != null) {
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_FIND_GOLD;
            this.VvVvnNUnvuvV.UuUVuuUu();
         } else {
            if (this.VvVvnNUnvuvV.uNNnnnuuuN(10000L)) {
               this.C00OOC00oO("Таймаут открытия /shop.");
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         }
      }
   }

   private void NVUunUNUN() {
      if (!this.NUVvUUVuVNVv()) {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
            class_476 var1 = this.NNUUNUuVNNVn();
            if (var1 == null) {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            } else {
               int var2 = this.UuUVuuUu(var1, class_1802.field_8695);
               if (var2 != -1) {
                  this.UuUVuuUu(var1, var2, 0, class_1713.field_7790);
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_WAIT_MENU;
                  this.VvVvnNUnvuvV.UuUVuuUu();
               } else {
                  if (this.VvVvnNUnvuvV.uNNnnnuuuN(5000L)) {
                     this.C00OOC00oO("В /shop не найден раздел золотого слитка.");
                     this.VuunNUUUvu();
                     this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
                     this.VvVvnNUnvuvV.UuUVuuUu();
                  }
               }
            }
         }
      }
   }

   private void UUVNuUNUvUnV() {
      if (!this.NUVvUUVuVNVv()) {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
            if (this.NNUUNUuVNNVn() == null) {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            } else {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_FIND_EMERALD;
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         }
      }
   }

   private void vuvnUnVnUNnV() {
      if (!this.NUVvUUVuVNVv()) {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
            class_476 var1 = this.NNUUNUuVNNVn();
            if (var1 == null) {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            } else {
               int var2 = this.C00OOC00oO(var1);
               if (var2 != -1) {
                  this.UuUVuuUu(var1, var2, 1, class_1713.field_7790);
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_WAIT_CONFIRM;
                  this.VvVvnNUnvuvV.UuUVuuUu();
               } else {
                  if (this.VvVvnNUnvuvV.uNNnnnuuuN(5000L)) {
                     this.C00OOC00oO("В /shop не найден слот изумрудов.");
                     this.VuunNUUUvu();
                     this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
                     this.VvVvnNUnvuvV.UuUVuuUu();
                  }
               }
            }
         }
      }
   }

   private void nnuUVNUuvvVU() {
      if (!this.NUVvUUVuVNVv()) {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
            if (this.NNUUNUuVNNVn() == null) {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            } else {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_CONFIRM;
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         }
      }
   }

   private void nVVUuvuNnUN() {
      if (!this.NUVvUUVuVNVv()) {
         if (this.VvVvnNUnvuvV.uNNnnnuuuN(this.NnVnNVN())) {
            class_476 var1 = this.NNUUNUuVNNVn();
            if (var1 == null) {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            } else {
               int var2 = this.UuUVuuUu(var1.method_17577());
               if (var2 != -1) {
                  this.unnUnUNVnN = this.C00OOC00oO(class_1802.field_8687);
                  this.UuUVuuUu(var1, var2, 0, class_1713.field_7790);
                  this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.BUY_EMERALDS_CLOSE;
                  this.VvVvnNUnvuvV.UuUVuuUu();
               } else {
                  if (this.VvVvnNUnvuvV.uNNnnnuuuN(5000L)) {
                     this.C00OOC00oO("Не найден слот подтверждения покупки изумрудов.");
                     this.VuunNUUUvu();
                     this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
                     this.VvVvnNUnvuvV.UuUVuuUu();
                  }
               }
            }
         }
      }
   }

   private void nNnVnUNVV() {
      if (this.VvVvnNUnvuvV.uNNnnnuuuN(250L)) {
         this.VuunNUUUvu();
         if (this.unnUnUNVnN < 0 || this.C00OOC00oO(class_1802.field_8687) > this.unnUnUNVnN) {
            this.unnUnUNVnN = -1;
            if (VuunNUUUvu != null && this.C00OOC00oO(this.NnunUUnU()) > 0) {
               this.nNvNUVU();
            } else {
               this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         } else if (this.VvVvnNUnvuvV.uNNnnnuuuN(2500L)) {
            this.C00OOC00oO("Покупка изумрудов не изменила инвентарь. Повтор временно остановлен.");
            this.unnUnUNVnN = -1;
            this.NnuUnUNnu = System.currentTimeMillis() + 10000L;
            this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
            this.VvVvnNUnvuvV.UuUVuuUu();
         }
      }
   }

   private void nuunNvv() {
      this.nvuVvuNnNUnv++;
      this.NnunUUnU = 0;
      this.UnvuVuVnNuvu = null;
      this.UvNNVUVNVuvV = -1;
      this.o0Ooc0COOoc = null;
      this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.SCAN_ROUTE;
      this.VvVvnNUnvuvV.UuUVuuUu();
      this.C00OOC00oO("Сканирую жителей: " + this.NVNnnvnuunNv.uUnuvNvvNU() + ".");
   }

   private void uUVVvVVNvvn() {
      this.vnvvNvUnVv = System.currentTimeMillis();
      this.uUnuvNvvNU(false);
   }

   private boolean vvUVNVvvNUv() {
      if (this.NUVvUUVuVNVv.isEmpty()) {
         return true;
      } else {
         long var1 = System.currentTimeMillis();
         return var1 - this.vnvvNvUnVv >= this.o0Ooc0COOoc()
            ? true
            : this.NUVvUUVuVNVv.values().stream().anyMatch(var3 -> var3.nvUVNnuu && var1 - var3.UuuNnUvUuv >= this.o0Ooc0COOoc());
      }
   }

   private AutoVillageTrade.VvunVVUvUNnv UuUVuuUu(UUID var1, class_1916 var2) {
      if (var1 != null && var2 != null) {
         AutoVillageTrade.VvunVVUvUNnv var3 = this.NUVvUUVuVNVv.computeIfAbsent(var1, AutoVillageTrade.VvunVVUvUNnv::new);
         class_1646 var4 = this.UuUVuuUu(var1);
         if (var4 != null) {
            var3.uUnuvNvvNU = var4.method_5628();
            var3.C00OOC00oO = var4.method_24515();
         }

         var3.vVvUvVVuuNvV = this.nvuVvuNnNUnv;
         var3.UuuNnUvUuv = System.currentTimeMillis();
         var3.vuuuNvNuv = false;
         var3.uNNnnnuuuN = -1;
         var3.nuUnNvnuUu = Integer.MAX_VALUE;
         var3.VVuuUN = 1;
         var3.nvUVNnuu = true;
         class_1792 var5 = this.NnunUUnU();

         for (int var6 = 0; var6 < var2.size(); var6++) {
            class_1914 var7 = (class_1914)var2.get(var6);
            class_1799 var8 = var7.method_8250();
            if (!var8.method_7960() && var8.method_31574(var5)) {
               int var9 = this.UuUVuuUu(var7);
               int var10 = Math.max(1, var8.method_7947());
               boolean var11 = !var3.vuuuNvNuv || this.UuUVuuUu(var9, var10) < this.UuUVuuUu(var3.nuUnNvnuUu, var3.VVuuUN);
               if (var11) {
                  var3.vuuuNvNuv = true;
                  var3.uNNnnnuuuN = var6;
                  var3.nuUnNvnuUu = var9;
                  var3.VVuuUN = var10;
                  var3.vNUvnnVnUvu = var7.method_8249();
                  var3.uVUuuVnNVU = var7.method_8248();
                  var3.nvUVNnuu = var7.method_8255() || var9 > this.vnvvNvUnVv();
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private int UuUVuuUu(class_1914 var1) {
      int var2 = 0;
      class_1799 var3 = var1.method_19272();
      class_1799 var4 = var1.method_8247();
      if (!var3.method_7960() && var3.method_31574(class_1802.field_8687)) {
         var2 += var3.method_7947();
      }

      if (!var4.method_7960() && var4.method_31574(class_1802.field_8687)) {
         var2 += var4.method_7947();
      }

      return var2 <= 0 ? Integer.MAX_VALUE : var2;
   }

   private AutoVillageTrade.VvunVVUvUNnv UuNnnVnuNNV() {
      int var1 = this.C00OOC00oO(class_1802.field_8687);
      boolean var2 = this.UnvuVuVnNuvu();
      return this.NUVvUUVuVNVv
         .values()
         .stream()
         .filter(var1x -> var1x.vuuuNvNuv && !var1x.nvUVNnuu && var1x.uNNnnnuuuN >= 0 && var1x.nuUnNvnuUu <= this.vnvvNvUnVv())
         .filter(var2x -> var1 >= var2x.nuUnNvnuUu || var2)
         .min(
            Comparator.<AutoVillageTrade.VvunVVUvUNnv>comparingDouble(var1x -> this.UuUVuuUu(var1x.nuUnNvnuUu, var1x.VVuuUN))
               .thenComparingDouble(var1x -> this.vNUvnnVnUvu(var1x.C00OOC00oO))
         )
         .orElse(null);
   }

   private class_1646 vVvUvVVuuNvV(class_2338 var1) {
      class_1646 var2 = null;
      double var3 = Double.MAX_VALUE;
      double var5 = this.UuUVuuUu(this.vvUVNVvvNUv.uUnuvNvvNU());

      for (class_1297 var8 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var8 instanceof class_1646 var9 && var9.method_5805()) {
            AutoVillageTrade.VvunVVUvUNnv var10 = this.NUVvUUVuVNVv.get(var9.method_5667());
            if (var10 == null || var10.vVvUvVVuuNvV != this.nvuVvuNnNUnv) {
               double var11 = this.UuUVuuUu(var1.method_10263() + 0.5 - var9.method_23317())
                  + this.UuUVuuUu(var1.method_10264() + 0.5 - var9.method_23318())
                  + this.UuUVuuUu(var1.method_10260() + 0.5 - var9.method_23321());
               if (!(var11 > var5) && !(var11 >= var3)) {
                  var2 = var9;
                  var3 = var11;
               }
            }
         }
      }

      return var2;
   }

   private class_1646 UuUVuuUu(UUID var1) {
      if (var1 != null && uUnuvNvvNU.field_1687 != null) {
         for (class_1297 var3 : uUnuvNvvNU.field_1687.method_18112()) {
            if (var3 instanceof class_1646 var4 && var1.equals(var4.method_5667())) {
               return var4;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private AutoVillageTrade.VvunVVUvUNnv uUVvnUuNvvN() {
      return this.UnvuVuVnNuvu == null ? null : this.NUVvUUVuVNVv.get(this.UnvuVuVnNuvu);
   }

   private void UUuUnNVNuuv() {
      if (this.UnvuVuVnNuvu != null) {
         AutoVillageTrade.VvunVVUvUNnv var1 = this.NUVvUUVuVNVv.computeIfAbsent(this.UnvuVuVnNuvu, AutoVillageTrade.VvunVVUvUNnv::new);
         var1.nvUVNnuu = true;
         var1.UuuNnUvUuv = System.currentTimeMillis();
         var1.vVvUvVVuuNvV = this.nvuVvuNnNUnv;
      }
   }

   private void NVuNUuVnVUN() {
      this.nNuVunNUVu.clear();
      if (VUuuVUnun != null && vVVuuVVv != null) {
         int var1 = vVVuuVVv.method_10263() - VUuuVUnun.method_10263();
         int var2 = vVVuuVVv.method_10260() - VUuuVUnun.method_10260();
         int var3 = Math.max(Math.abs(var1), Math.abs(var2));
         if (var3 == 0) {
            this.nNuVunNUVu.add(VUuuVUnun);
         } else {
            for (int var4 = 0; var4 <= var3; var4++) {
               int var5 = VUuuVUnun.method_10263() + Math.round(var1 * ((float)var4 / var3));
               int var6 = VUuuVUnun.method_10260() + Math.round(var2 * ((float)var4 / var3));
               class_2338 var7 = new class_2338(var5, VUuuVUnun.method_10264(), var6);
               if (this.nNuVunNUVu.isEmpty() || !this.nNuVunNUVu.get(this.nNuVunNUVu.size() - 1).equals(var7)) {
                  this.nNuVunNUVu.add(var7);
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_2338 var1, int var2) {
      IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (!var1.equals(this.o0Ooc0COOoc) || var2 != this.nvvnUnUn || !var3.getCustomGoalProcess().isActive()) {
         this.o0Ooc0COOoc = var1;
         this.nvvnUnUn = var2;
         if (var2 > 0) {
            var3.getCustomGoalProcess().setGoalAndPath(new GoalNear(var1, var2));
         } else {
            var3.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var1));
         }
      }
   }

   private void NVuunNnvvvVu() {
      this.o0Ooc0COOoc = null;
      this.nvvnUnUn = -1;

      try {
         BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      } catch (Throwable var2) {
      }
   }

   private void vNnNuuvVn() {
      this.UnUUVuVunvVu = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.nnvuvUNuUnN = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
   }

   private void VUuuVUnun() {
      if (this.UnUUVuVunvVu != null) {
         BaritoneAPI.getSettings().allowBreak.value = this.UnUUVuVunvVu;
      }

      if (this.nnvuvUNuUnN != null) {
         BaritoneAPI.getSettings().allowPlace.value = this.nnvuvUNuUnN;
      }

      this.UnUUVuVunvVu = null;
      this.nnvuvUNuUnN = null;
   }

   private int UuUVuuUu(class_476 var1, class_1792 var2) {
      int var3 = this.uUnuvNvvNU(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (var5.method_7681() && var5.method_7677().method_31574(var2)) {
            return var4;
         }
      }

      return -1;
   }

   private int UuUVuuUu(class_476 var1) {
      int var2 = this.uUnuvNvvNU(var1);
      class_2371 var3 = ((class_1707)var1.method_17577()).field_7761;

      for (int var4 = var2; var4 < var3.size(); var4++) {
         class_1735 var5 = (class_1735)var3.get(var4);
         if (var5.method_7681() && var5.method_7677().method_31574(this.NnunUUnU())) {
            return var4;
         }
      }

      return -1;
   }

   private int C00OOC00oO(class_476 var1) {
      int var2 = this.uUnuvNvvNU(var1);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (var4.method_7681()) {
            class_1799 var5 = var4.method_7677();
            String var6 = this.UuUVuuUu(var5.method_7964().getString());
            if (var5.method_31574(class_1802.field_8687)) {
               return var3;
            }

            if (var5.method_31574(class_1802.field_8407) && (var6.contains("изумруд") || var6.contains("emerald"))) {
               return var3;
            }
         }
      }

      return -1;
   }

   private int UuUVuuUu(class_1703 var1) {
      int var2 = Math.min(var1.field_7761.size(), Math.max(0, var1.field_7761.size() - 36));

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         String var5 = this.UuUVuuUu(var4.method_7964().getString());
         if (var5.contains("купить")
            || var4.method_31574(class_1802.field_8581)
            || var4.method_31574(class_1802.field_8656)
            || var4.method_31574(class_1802.field_8120)
            || var4.method_31574(class_1802.field_8839)) {
            return var3;
         }
      }

      return -1;
   }

   private void UuUVuuUu(class_476 var1, int var2, int var3, class_1713 var4) {
      uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2, var3, var4, uUnuvNvvNU.field_1724);
   }

   private int uUnuvNvvNU(class_476 var1) {
      int var2 = ((class_1707)var1.method_17577()).method_17388();
      int var3 = ((class_1707)var1.method_17577()).field_7761.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
      return uUnuvNvvNU.field_1687 != null && var1 != null
         ? uUnuvNvvNU.field_1687.method_8321(var1) instanceof class_2595 || uUnuvNvvNU.field_1687.method_8321(var1) instanceof class_3719
         : false;
   }

   private void nuUnNvnuUu(class_2338 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && var1 != null) {
         class_2350 var2 = this.VVuuUN(var1);
         class_243 var3 = new class_243(
            var1.method_10263() + 0.5 + var2.method_10148() * 0.5,
            var1.method_10264() + 0.5 + var2.method_10164() * 0.5,
            var1.method_10260() + 0.5 + var2.method_10165() * 0.5
         );
         class_3965 var4 = new class_3965(var3, var2, var1, false);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var4);
      }
   }

   private class_2350 VVuuUN(class_2338 var1) {
      class_243 var2 = class_243.method_24953(var1);
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571().method_1020(var2);
      return class_2350.method_10142(var3.field_1352, var3.field_1351, var3.field_1350);
   }

   private boolean vVVuuVVv() {
      int var1 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      class_1799 var2 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var1);
      if (!this.UuUVuuUu(var2)) {
         return false;
      } else {
         for (int var3 = 0; var3 < 9; var3++) {
            class_1799 var4 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var3);
            if (var4.method_7960() || !this.UuUVuuUu(var4)) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               return true;
            }
         }

         return false;
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         String var2 = var1.method_7964().getString();
         return var1.method_7909() == class_1802.field_8366 || var2.contains("[★]");
      } else {
         return false;
      }
   }

   private void VuunNUUUvu() {
      if (uUnuvNvvNU.field_1724 != null && (uUnuvNvvNU.field_1755 != null || VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU))) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      this.UnnnvvU = null;
   }

   private class_476 NNUUNUuVNNVn() {
      class_476 var1 = VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU, this.UnnnvvU, class_476.class);
      if (var1 == null && this.UnnnvvU instanceof class_476) {
         this.UnnnvvU = null;
      }

      return var1;
   }

   private boolean VvVvnNUnvuvV() {
      return VuUNvNNvvnV.C00OOC00oO(uUnuvNvvNU, this.UnnnvvU) || VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU);
   }

   private boolean UuUVuuUu(class_437 var1) {
      return !(var1 instanceof class_476) && !(var1 instanceof class_492)
         ? false
         : this.UNvvunVVn != AutoVillageTrade.NVnVnNnN.IDLE
            && this.UNvvunVVn != AutoVillageTrade.NVnVnNnN.WAIT_RESTOCK
            && this.UNvvunVVn != AutoVillageTrade.NVnVnNnN.SCAN_ROUTE
            && this.UNvvunVVn != AutoVillageTrade.NVnVnNnN.MOVE_TO_TRADE
            && this.UNvvunVVn != AutoVillageTrade.NVnVnNnN.MOVE_TO_STORAGE;
   }

   private boolean ccOO0COcoco0() {
      return VuunNUUUvu != null && this.C00OOC00oO(this.NnunUUnU()) > 0 && !this.uUnuvNvvNU(this.NnunUUnU());
   }

   private boolean NUVvUUVuVNVv() {
      if (this.nNuVunNUVu()) {
         return false;
      } else if (VuunNUUUvu != null && this.C00OOC00oO(this.NnunUUnU()) > 0) {
         this.VuunNUUUvu();
         this.nNvNUVU();
         return true;
      } else {
         this.C00OOC00oO("Недостаточно места для покупки изумрудов.");
         this.NnuUnUNnu = System.currentTimeMillis() + 10000L;
         this.VuunNUUUvu();
         this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
         this.VvVvnNUnvuvV.UuUVuuUu();
         return true;
      }
   }

   private boolean nNuVunNUVu() {
      return this.UuUVuuUu(class_1802.field_8687) >= 64;
   }

   private boolean UNvvunVVn() {
      return this.UvNNVUVNVuvV() ? false : this.C00OOC00oO(class_1802.field_8687) < this.OCOocoOoOO();
   }

   private boolean UnvuVuVnNuvu() {
      return this.UUuUnNVNuuv.uUnuvNvvNU() && !this.UvNNVUVNVuvV();
   }

   private boolean UvNNVUVNVuvV() {
      return System.currentTimeMillis() < this.NnuUnUNnu;
   }

   private int UuUVuuUu(class_1792 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = new class_1799(var1).method_7914();

         for (int var4 = 0; var4 < 36; var4++) {
            class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
            if (var5.method_7960()) {
               var2 += var3;
            } else if (var5.method_31574(var1)) {
               var2 += Math.max(0, var5.method_7914() - var5.method_7947());
            }
         }

         return var2;
      }
   }

   private int C00OOC00oO(class_1792 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < 36; var3++) {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
            if (!var4.method_7960() && var4.method_31574(var1)) {
               var2 += var4.method_7947();
            }
         }

         return var2;
      }
   }

   private boolean uUnuvNvvNU(class_1792 var1) {
      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (var3.method_7960()) {
            return true;
         }

         if (var3.method_31574(var1) && var3.method_7947() < var3.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private class_1792 NnunUUnU() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();

      return switch (var1) {
         case "Редстоун" -> class_1802.field_8725;
         case "Лазурит" -> class_1802.field_8759;
         case "Жемчуг Эндера" -> class_1802.field_8634;
         case "Бутылочка опыта" -> class_1802.field_8287;
         case "Стекло" -> class_1802.field_8280;
         case "Бирка" -> class_1802.field_8448;
         case "Стрелы" -> class_1802.field_8107;
         case "Хлеб" -> class_1802.field_8229;
         case "Золотая морковь" -> class_1802.field_8071;
         case "Кварцевый блок" -> class_1802.field_20402;
         case "Седло" -> class_1802.field_8175;
         default -> class_1802.field_8695;
      };
   }

   private void uUnuvNvvNU(boolean var1) {
      long var2 = System.currentTimeMillis();
      if (var1 || var2 - this.OCOocoOoOO >= 1000L) {
         this.OCOocoOoOO = var2;
         List var4 = this.NUVvUUVuVNVv
            .values()
            .stream()
            .filter(var0 -> var0.vuuuNvNuv)
            .sorted(
               Comparator.<AutoVillageTrade.VvunVVUvUNnv>comparingDouble(var1x -> this.UuUVuuUu(var1x.nuUnNvnuUu, var1x.VVuuUN))
                  .thenComparingInt(var0 -> var0.uUnuvNvvNU)
            )
            .toList();
         if (var4.isEmpty()) {
            this.C00OOC00oO("Скан завершен: подходящих сделок нет.");
         } else {
            AutoVillageTrade.VvunVVUvUNnv var5 = (AutoVillageTrade.VvunVVUvUNnv)var4.get(0);
            long var6 = var4.stream().filter(var1x -> !var1x.nvUVNnuu && var1x.nuUnNvnuUu <= this.vnvvNvUnVv()).count();
            this.C00OOC00oO(
               "Скан завершен: найдено "
                  + var4.size()
                  + ", доступно сейчас "
                  + var6
                  + ", лучший курс "
                  + var5.nuUnNvnuUu
                  + " изумр. за "
                  + var5.VVuuUN
                  + " шт."
            );
         }
      }
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

   private boolean UuUVuuUu(class_2338 var1, double var2) {
      return this.vNUvnnVnUvu(var1) <= var2 * var2;
   }

   private double vNUvnnVnUvu(class_2338 var1) {
      return uUnuvNvvNU.field_1724 != null && var1 != null
         ? uUnuvNvvNU.field_1724.method_19538().method_1028(var1.method_10263() + 0.5, var1.method_10264(), var1.method_10260() + 0.5)
         : Double.MAX_VALUE;
   }

   private class_2338 nvuVvuNnNUnv() {
      return VUuuVUnun != null && vVVuuVVv != null
         ? new class_2338(
            (VUuuVUnun.method_10263() + vVVuuVVv.method_10263()) / 2, VUuuVUnun.method_10264(), (VUuuVUnun.method_10260() + vVVuuVVv.method_10260()) / 2
         )
         : VUuuVUnun;
   }

   private double UuUVuuUu(int var1, int var2) {
      return (double)var1 / Math.max(1, var2);
   }

   private double UuUVuuUu(double var1) {
      return var1 * var1;
   }

   private long NnVnNVN() {
      return Math.max(50L, (long)Math.round(this.UuNnnVnuNNV.uUnuvNvvNU()));
   }

   private int vnvvNvUnVv() {
      return Math.max(1, Math.round(this.nuunNvv.uUnuvNvvNU()));
   }

   private int OCOocoOoOO() {
      return Math.max(0, Math.round(this.uUVVvVVNvvn.uUnuvNvvNU()));
   }

   private long o0Ooc0COOoc() {
      return Math.max(1000L, (long)Math.round(this.uUVvnUuNvvN.uUnuvNvvNU() * 1000.0F));
   }

   private String UuUVuuUu(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT).replace("§", "");
   }

   private void vVvUvVVuuNvV(boolean var1) {
      this.UNvvunVVn = AutoVillageTrade.NVnVnNnN.IDLE;
      this.UnvuVuVnNuvu = null;
      this.UvNNVUVNVuvV = -1;
      this.NnunUUnU = 0;
      this.o0Ooc0COOoc = null;
      this.nvvnUnUn = -1;
      this.VunnVNvNV = -1;
      this.NvUVUvVVnUu = 0;
      this.unnUnUNVnN = -1;
      this.NnuUnUNnu = 0L;
      this.UnnnvvU = null;
      if (var1) {
         this.nNuVunNUVu.clear();
      }

      this.VvVvnNUnvuvV.UuUVuuUu();
   }

   private void C00OOC00oO(String var1) {
      vVnvuVVUunuv.UuUVuuUu("§8[§aAutoVillageTrade§8] §f" + var1);
   }

   @Generated
   public static class_2338 UuuNnUvUuv() {
      return VUuuVUnun;
   }

   @Generated
   public static void UuUVuuUu(class_2338 var0) {
      VUuuVUnun = var0;
   }

   @Generated
   public static class_2338 nUUVuvU() {
      return vVVuuVVv;
   }

   @Generated
   public static void C00OOC00oO(class_2338 var0) {
      vVVuuVVv = var0;
   }

   @Generated
   public static class_2338 UnUNVVVNuv() {
      return VuunNUUUvu;
   }

   @Generated
   public static void uUnuvNvvNU(class_2338 var0) {
      VuunNUUUvu = var0;
   }

   static enum NVnVnNnN {
      IDLE,
      SCAN_ROUTE,
      OPEN_SCAN,
      WAIT_SCAN_SCREEN,
      READ_SCAN_SCREEN,
      CLOSE_SCAN_SCREEN,
      MOVE_TO_TRADE,
      OPEN_TRADE,
      WAIT_TRADE_SCREEN,
      BUY_TRADE,
      CLOSE_TRADE_SCREEN,
      MOVE_TO_STORAGE,
      OPEN_STORAGE,
      WAIT_STORAGE_SCREEN,
      PUT_STORAGE,
      BUY_EMERALDS_OPEN_SHOP,
      BUY_EMERALDS_WAIT_SHOP,
      BUY_EMERALDS_FIND_GOLD,
      BUY_EMERALDS_WAIT_MENU,
      BUY_EMERALDS_FIND_EMERALD,
      BUY_EMERALDS_WAIT_CONFIRM,
      BUY_EMERALDS_CONFIRM,
      BUY_EMERALDS_CLOSE,
      WAIT_RESTOCK;
   }

   static final class VvunVVUvUNnv {
      final UUID UuUVuuUu;
      class_2338 C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV = -1;
      int uNNnnnuuuN = -1;
      int nuUnNvnuUu = Integer.MAX_VALUE;
      int VVuuUN = 1;
      int vNUvnnVnUvu;
      int uVUuuVnNVU;
      boolean vuuuNvNuv;
      boolean nvUVNnuu = true;
      long UuuNnUvUuv;
      long nUUVuvU;
      int UnUNVVVNuv;
      int vNVuvnUUnuUn;

      private VvunVVUvUNnv(UUID var1) {
         this.UuUVuuUu = var1;
      }
   }

   public record nvnNNunvv(class_1799 itemStack, int price, int itemCount, int availableAmount, boolean ready) {
   }
}
