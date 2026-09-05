package ru.metaculture.protection;

import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1268;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1714;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_408;
import net.minecraft.class_433;
import net.minecraft.class_437;
import net.minecraft.class_476;
import net.minecraft.class_479;
import net.minecraft.class_7439;
import net.minecraft.class_8646;
import net.minecraft.class_9011;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "MoneyFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Крафтит и продает изумрудные предметы"
)
public class MoneyFarm extends Module {
   private static final String NVNnnvnuunNv = "Изумрудный меч";
   private static final String uVunuUNVVUUV = "Изумрудная кирка";
   private static final String UNnVVNvvnVvU = "Изумрудный топор";
   private static final int uNnUnnuNUnNu = 5;
   private static final long NnUuNNU = 1200L;
   private static final long nNvNUVU = 7000L;
   private static final int UnUNuUU = 9;
   private static final int uUVuVvuNUvnu = 20;
   private static final Pattern UvUvUNuvNU = Pattern.compile("(\\d[\\d\\s.,]*\\d|\\d)");
   private final UvNnUnuNUUU c0oOOCcCoC0 = new UvNnUnuNUUU("Предмет", "Изумрудный меч", "Изумрудный меч", "Изумрудная кирка", "Изумрудный топор");
   private final NVuVVUNUvV VVnVNnunVvu = new NVuVVUNUvV("Цена продажи", "40000").UuUVuuUu(32);
   private final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Задержка (мс)", 100.0F, 50.0F, 5000.0F, 50.0F, false);
   private final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("Авто-покупка", true);
   private final vvNnnUNnVvn NVUunUNUN = new vvNnnUNnVvn("Авто-продажа", false);
   private final nNUuNvVn UUVNuUNUvUnV = new nNUuNvVn("Перевыставить (сек)", 30.0F, 5.0F, 120.0F, 1.0F, false).UuUVuuUu(() -> !this.NVUunUNUN.uUnuvNvvNU());
   private final nNUuNvVn vuvnUnVnUNnV = new nNUuNvVn("Слоты аукциона", 5.0F, 1.0F, 50.0F, 1.0F, false).UuUVuuUu(() -> !this.NVUunUNUN.uUnuvNvvNU());
   private final vvNnnUNnVvn nnuUVNUuvvVU = new vvNnnUNnVvn("Уведомления", true);
   private MoneyFarm.nvnNNunvv nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
   private final VuNvNNvVV nNnVnUNVV = new VuNvNNvVV();
   private final VuNvNNvVV nuunNvv = new VuNvNNvVV();
   private class_2338 uUVVvVVNvvn;
   private int vvUVNVvvNUv = 0;
   private int UuNnnVnuNNV = 0;
   private int uUVvnUuNvvN = 0;
   private int UUuUnNVNuuv = 0;
   private int NVuNUuVnVUN = 0;
   private boolean NVuunNnvvvVu = false;
   private boolean vNnNuuvVn = false;
   private boolean VUuuVUnun = false;
   private boolean vVVuuVVv = false;
   private boolean VuunNUUUvu = false;
   private int NNUUNUuVNNVn = 0;
   private int VvVvnNUnvuvV = 0;
   private int ccOO0COcoco0 = 0;
   private int NUVvUUVuVNVv = 0;
   private boolean nNuVunNUVu = false;
   private int UNvvunVVn = 0;
   private int UnvuVuVnNuvu = -1;
   private long UvNNVUVNVuvV = 0L;
   private long NnunUUnU = 0L;
   private long nvuVvuNnNUnv = 0L;
   private int NnVnNVN = 0;

   public MoneyFarm() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.c0oOOCcCoC0, this.VVnVNnunVvu, this.UUVNuUNUvUnV, this.vuvnUnVnUNnV, this.unNNVVNnvvV, this.NuunnvnN, this.NVUunUNUN, this.nnuUVNUuvvVU
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.nvuVvuNnNUnv();
   }

   @Override
   public void C00OOC00oO() {
      this.nvuVvuNnNUnv();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && var1.uNNnnnuuuN().equals(uvUUuvnunU.NVnVnNnN.RECEIVE)) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var6 = var2.comp_763().getString();
            String var4 = this.vVvUvVVuuNvV(var6);
            if (this.nVVUuvuNnUN != MoneyFarm.nvnNNunvv.BUY_FIND_EMERALD
                  && this.nVVUuvuNnUN != MoneyFarm.nvnNNunvv.BUY_WAITING_CONFIRM
                  && this.nVVUuvuNnUN != MoneyFarm.nvnNNunvv.BUY_CLICK_LIME_PANE
               || !var4.contains("недостаточно") && !var4.contains("не хватает") && !var4.contains("нет монет") && !var4.contains("нет денег")) {
               if (var4.contains("не удалось выставить") && var4.contains("освободите хранилище")) {
                  this.NVuunNnvvvVu = true;
                  this.vNnNuuvVn = false;
                  this.vVVuuVVv = true;
               } else {
                  if (var4.contains("у вас купили") && var4.contains(this.vVvUvVVuuNvV(this.VvVvnNUnvuvV()))) {
                     this.VUuuVUnun = true;
                     this.ccOO0COcoco0++;
                     this.NUVvUUVuVNVv = Math.max(0, this.NUVvUUVuVNVv - 1);
                     this.uUVvnUuNvvN = 0;
                     this.UuNnnVnuNNV = 0;
                     this.nNuVunNUVu = false;
                     this.NnunUUnU = System.currentTimeMillis();
                  }

                  if ((var4.contains("выставлен") || var4.contains("выставлено") || var4.contains("успешно выстав")) && var4.contains("продаж")) {
                     int var5 = this.VvVvnNUnvuvV > 0 ? this.VvVvnNUnvuvV : 1;
                     this.NVuunNnvvvVu = false;
                     this.vNnNuuvVn = true;
                     this.UUuUnNVNuuv += var5;
                     this.NUVvUUVuVNVv += var5;
                     this.ccOO0COcoco0 = Math.max(0, this.ccOO0COcoco0 - var5);
                     this.nNuVunNUVu = true;
                     this.VvVvnNUnvuvV = 0;
                     this.NnunUUnU = System.currentTimeMillis();
                  }
               }
            } else {
               this.vnvvNvUnVv();
               this.uUnuvNvvNU("§cНе хватает монет для покупки.");
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         this.nvvnUnUn();
         this.OCOocoOoOO();
         this.NnunUUnU();
         if (this.NVuunNnvvvVu && this.nVVUuvuNnUN == MoneyFarm.nvnNNunvv.IDLE) {
            this.uUVVvVVNvvn();
         }

         switch (this.nVVUuvuNnUN) {
            case IDLE:
               this.UuuNnUvUuv();
               break;
            case BUY_OPENING_SHOP:
               this.nUUVuvU();
               break;
            case BUY_WAITING_SHOP:
               this.UnUNVVVNuv();
               break;
            case BUY_FIND_GOLD_INGOT:
               this.vNVuvnUUnuUn();
               break;
            case BUY_WAITING_EMERALD_MENU:
               this.UvnvNVnnnnNU();
               break;
            case BUY_FIND_EMERALD:
               this.uVUVnuvnuVuv();
               break;
            case BUY_WAITING_CONFIRM:
               this.NVNnnvnuunNv();
               break;
            case BUY_CLICK_LIME_PANE:
               this.uVunuUNVVUUV();
               break;
            case BUY_CLOSING_SHOP:
               this.UNnVVNvvnVvU();
               break;
            case CHECK_SELL_GUI_OPENING:
               this.uNnUnnuNUnNu();
               break;
            case CHECK_SELL_GUI_WAITING:
               this.NnUuNNU();
               break;
            case CHECK_SELL_GUI_READING:
               this.nNvNUVU();
               break;
            case FINDING_CRAFTING_TABLE:
               this.UnUNuUU();
               break;
            case AIMING_CRAFTING_TABLE:
               this.uUVuVvuNUvnu();
               break;
            case OPENING_CRAFTING_TABLE:
               this.UvUvUNuvNU();
               break;
            case PLACING_ITEMS:
               this.c0oOOCcCoC0();
               break;
            case TAKING_RESULT:
               this.VVnVNnunVvu();
               break;
            case CLOSING_CRAFTING:
               this.unNNVVNnvvV();
               break;
            case SELLING:
               this.NuunnvnN();
               break;
            case WAITING_SELL_RESULT:
               this.NVUunUNUN();
               break;
            case RESALE_SEARCH_OWN_AH:
               this.UUVNuUNUvUnV();
               break;
            case RESALE_WAITING_OWN_AH:
               this.vuvnUnVnUNnV();
               break;
            case RESALE_TAKE_ITEM:
               this.nnuUVNUuvvVU();
               break;
            case RESALE_CLOSING:
               this.nVVUuvuNnUN();
               break;
            case RESALE_SELLING:
               this.nNnVnUNVV();
               break;
            case RESALE_WAIT_SELL_RESULT:
               this.nuunNvv();
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (this.NVuunNnvvvVu) {
            this.uUVVvVVNvvn();
         } else {
            if (this.NVUunUNUN.uUnuvNvvNU() && this.ccOO0COcoco0 > 0) {
               this.VUuuVUnun = false;
               if (!this.nNuVunNUVu) {
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.CHECK_SELL_GUI_OPENING;
                  this.nNnVnUNVV.UuUVuuUu();
                  return;
               }

               if (this.vvUVNVvvNUv() > 0 && this.VUuuVUnun() >= this.vvUVNVvvNUv()) {
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.SELLING;
                  this.nNnVnUNVV.UuUVuuUu();
                  return;
               }
            } else {
               if (this.NVUunUNUN.uUnuvNvvNU() && this.NUVvUUVuVNVv > 0 && System.currentTimeMillis() - this.NnunUUnU >= this.UnvuVuVnNuvu()) {
                  this.uUVVvVVNvvn();
                  return;
               }

               if (this.NVUunUNUN.uUnuvNvvNU() && this.NUVvUUVuVNVv > 0) {
                  return;
               }

               if (this.NVUunUNUN.uUnuvNvvNU() && !this.nNuVunNUVu) {
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.CHECK_SELL_GUI_OPENING;
                  this.nNnVnUNVV.UuUVuuUu();
                  return;
               }
            }

            if (this.NVUunUNUN.uUnuvNvvNU() && this.NUVvUUVuVNVv == 0 && this.vvUVNVvvNUv() > 0 && this.VUuuVUnun() >= this.vvUVNVvvNUv()) {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.SELLING;
               this.nNnVnUNVV.UuUVuuUu();
            } else if (!this.NVUunUNUN.uUnuvNvvNU() || !this.nNuVunNUVu || this.vvUVNVvvNUv() > 0) {
               if (this.NVUunUNUN.uUnuvNvvNU() && this.nNuVunNUVu && this.vvUVNVvvNUv() > 0 && this.VUuuVUnun() >= this.vvUVNVvvNUv()) {
                  if (this.VUuuVUnun() > 0) {
                     this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.SELLING;
                  }

                  this.nNnVnUNVV.UuUVuuUu();
               } else if (this.NuunnvnN.uUnuvNvvNU() && this.uUVvnUuNvvN()) {
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_OPENING_SHOP;
                  this.nNnVnUNVV.UuUVuuUu();
               } else if (this.UUuUnNVNuuv()) {
                  this.uUnuvNvvNU("§cНет палок в инвентаре. Положите палки для крафта.");
               } else if (this.UuNnnVnuNNV()) {
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.FINDING_CRAFTING_TABLE;
                  this.nNnVnUNVV.UuUVuuUu();
               }
            }
         }
      }
   }

   private void nUUVuvU() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (this.C00OOC00oO(150L)) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("shop");
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_WAITING_SHOP;
            this.nNnVnUNVV.UuUVuuUu();
         }
      }
   }

   private void UnUNVVVNuv() {
      if (uUnuvNvvNU.field_1755 instanceof class_476) {
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_FIND_GOLD_INGOT;
         this.nNnVnUNVV.UuUVuuUu();
      } else {
         if (this.nNnVnUNVV.uNNnnnuuuN(10000L)) {
            this.uUnuvNvvNU("§cТаймаут магазина.");
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            int var3 = this.UuUVuuUu(var1, class_1802.field_8695);
            if (var3 != -1) {
               this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_WAITING_EMERALD_MENU;
               this.nNnVnUNVV.UuUVuuUu();
            } else {
               if (this.nNnVnUNVV.uNNnnnuuuN(5000L)) {
                  this.vnvvNvUnVv();
                  this.uUnuvNvvNU("§cЗолотой слиток не найден.");
               }
            }
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void UvnvNVnnnnNU() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (!(uUnuvNvvNU.field_1755 instanceof class_476)) {
            this.NnVnNVN();
         } else {
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_FIND_EMERALD;
            this.nNnVnUNVV.UuUVuuUu();
         }
      }
   }

   private void uVUVnuvnuVuv() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            int var3 = this.nuUnNvnuUu(var1);
            if (var3 != -1) {
               this.UuUVuuUu(var1, var3, 1, class_1713.field_7790);
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_WAITING_CONFIRM;
               this.nNnVnUNVV.UuUVuuUu();
            } else {
               if (this.nNnVnUNVV.uNNnnnuuuN(5000L)) {
                  this.vnvvNvUnVv();
                  this.uUnuvNvvNU("§cИзумруд не найден.");
               }
            }
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void NVNnnvnuunNv() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (!this.uUVvnUuNvvN()) {
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_CLOSING_SHOP;
            this.nNnVnUNVV.UuUVuuUu();
         } else if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (this.VVuuUN(var1)) {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_CLICK_LIME_PANE;
               this.nNnVnUNVV.UuUVuuUu();
            } else {
               if (this.nNnVnUNVV.uNNnnnuuuN(5000L)) {
                  this.vnvvNvUnVv();
                  this.uUnuvNvvNU("§cПодтверждение покупки изумрудов не открылось.");
               }
            }
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void uVunuUNVVUUV() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (!this.uUVvnUuNvvN()) {
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_CLOSING_SHOP;
            this.nNnVnUNVV.UuUVuuUu();
         } else if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (!this.VVuuUN(var1)) {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_WAITING_CONFIRM;
               this.nNnVnUNVV.UuUVuuUu();
            } else {
               int var3 = this.UuUVuuUu(var1.method_17577());
               if (var3 != -1) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.BUY_CLOSING_SHOP;
                  this.nNnVnUNVV.UuUVuuUu();
               } else {
                  if (this.nNnVnUNVV.uNNnnnuuuN(5000L)) {
                     this.vnvvNvUnVv();
                     this.uUnuvNvvNU("§cЛаймовая панель не найдена.");
                  }
               }
            }
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.C00OOC00oO(150L)) {
         this.NnVnNVN();
      }
   }

   private void uNnUnnuNUnNu() {
      if (this.nNnVnUNVV.uNNnnnuuuN(50L)) {
         if (this.C00OOC00oO(uUnuvNvvNU.field_1755)) {
            if (UuUVuuUu(uUnuvNvvNU.field_1755)) {
               uUnuvNvvNU.method_1507(null);
            }

            long var1 = this.nNuVunNUVu();
            if (var1 <= 0L) {
               this.uUnuvNvvNU("§cЦена продажи не задана.");
            } else if (this.VuunNUUUvu()) {
               this.NNUUNUuVNNVn();
               this.UuUVuuUu(var1);
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.CHECK_SELL_GUI_WAITING;
               this.nNnVnUNVV.UuUVuuUu();
            }
         }
      }
   }

   private void NnUuNNU() {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.vNUvnnVnUvu(var1)) {
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.CHECK_SELL_GUI_READING;
         this.nNnVnUNVV.UuUVuuUu();
      } else {
         if (this.nNnVnUNVV.uNNnnnuuuN(7000L)) {
            this.vnvvNvUnVv();
            this.uUnuvNvvNU("§cSellgui не открылся для проверки слотов.");
         }
      }
   }

   private void nNvNUVU() {
      if (this.nNnVnUNVV.uNNnnnuuuN(150L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.vNUvnnVnUvu(var1)) {
            int var3 = this.uUnuvNvvNU(var1);
            this.uUVvnUuNvvN = Math.min(var3, this.UNvvunVVn());
            if (this.ccOO0COcoco0 > 0) {
               this.ccOO0COcoco0 = Math.min(this.ccOO0COcoco0, this.uUVvnUuNvvN);
            }

            this.nNuVunNUVu = true;
            this.UuNnnVnuNNV = 0;
            this.vnvvNvUnVv();
            if (var3 <= 0) {
               this.uUVVvVVNvvn();
            } else {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
               this.nNnVnUNVV.UuUVuuUu();
            }
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void UnUNuUU() {
      if (this.C00OOC00oO(150L)) {
         if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
            this.uUVVvVVNvvn = this.vVVuuVVv();
            if (this.uUVVvVVNvvn == null) {
               this.uUnuvNvvNU("§cВерстак рядом не найден.");
            } else {
               this.NnVnNVN = 0;
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.AIMING_CRAFTING_TABLE;
               this.nNnVnUNVV.UuUVuuUu();
            }
         }
      }
   }

   private void uUVuVvuNUvnu() {
      if (this.uUVVvVVNvvn != null && this.UuUVuuUu(this.uUVVvVVNvvn)) {
         if (uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(this.uUVVvVVNvvn)) > 36.0) {
            this.uUVVvVVNvvn = this.vVVuuVVv();
            if (this.uUVVvVVNvvn == null) {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.FINDING_CRAFTING_TABLE;
               this.nNnVnUNVV.UuUVuuUu();
            } else {
               this.nNnVnUNVV.UuUVuuUu();
               this.NnVnNVN = 0;
            }
         } else if (this.nNnVnUNVV.uNNnnnuuuN(120L)) {
            if (!this.UuUVuuUu(this.uUVVvVVNvvn, 10.0F)) {
               if (this.nNnVnUNVV.uNNnnnuuuN(1200L)) {
                  this.C00OOC00oO(this.uUVVvVVNvvn);
               }

               if (this.nNnVnUNVV.uNNnnnuuuN(1800L)) {
                  this.NnVnNVN++;
                  if (this.NnVnNVN > 2) {
                     this.uUVVvVVNvvn = this.vVVuuVVv();
                     this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.FINDING_CRAFTING_TABLE;
                     this.nNnVnUNVV.UuUVuuUu();
                     return;
                  }

                  this.nNnVnUNVV.UuUVuuUu();
               }
            } else {
               class_2350 var1 = this.uUnuvNvvNU(this.uUVVvVVNvvn);
               class_243 var2 = class_243.method_24953(this.uUVVvVVNvvn).method_1019(class_243.method_24954(var1.method_62675()).method_1021(0.5));
               double var3 = (ThreadLocalRandom.current().nextDouble() - 0.5) * 0.2;
               double var5 = (ThreadLocalRandom.current().nextDouble() - 0.5) * 0.2;
               if (var1.method_10166() != class_2351.field_11052) {
                  var2 = var2.method_1031(var3 * 0.1, 0.0, var5 * 0.1);
               }

               class_3965 var7 = new class_3965(var2, var1, this.uUVVvVVNvvn, false);
               uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var7);
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               if (this.NnVnNVN == 0) {
                  this.nNnVnUNVV.UuUVuuUu();
               }

               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.OPENING_CRAFTING_TABLE;
               this.nNnVnUNVV.UuUVuuUu();
            }
         }
      } else {
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.FINDING_CRAFTING_TABLE;
         this.nNnVnUNVV.UuUVuuUu();
      }
   }

   private void UvUvUNuvNU() {
      if (uUnuvNvvNU.field_1755 instanceof class_479) {
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.PLACING_ITEMS;
         this.nNnVnUNVV.UuUVuuUu();
      } else if (this.nNnVnUNVV.uNNnnnuuuN(80L)) {
         if (this.nNnVnUNVV.uNNnnnuuuN(700L) && this.UuUVuuUu(this.uUVVvVVNvvn, 12.0F)) {
            class_2350 var1 = this.uUnuvNvvNU(this.uUVVvVVNvvn);
            class_243 var2 = class_243.method_24953(this.uUVVvVVNvvn).method_1019(class_243.method_24954(var1.method_62675()).method_1021(0.5));
            class_3965 var3 = new class_3965(var2, var1, this.uUVVvVVNvvn, false);
            uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var3);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.nNnVnUNVV.UuUVuuUu();
         } else {
            if (this.nNnVnUNVV.uNNnnnuuuN(3500L)) {
               this.uUVVvVVNvvn = null;
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.FINDING_CRAFTING_TABLE;
               this.nNnVnUNVV.UuUVuuUu();
            }
         }
      }
   }

   private void c0oOOCcCoC0() {
      if (this.nNnVnUNVV.uNNnnnuuuN(50L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_479 var1) {
            class_1714 var4 = (class_1714)var1.method_17577();
            int var3 = var4.field_7763;
            if (this.ccOO0COcoco0()) {
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 2);
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 5);
               this.UuUVuuUu(var4, var3, class_1802.field_8600, 8);
            } else if (this.NUVvUUVuVNVv()) {
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 1);
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 2);
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 4);
               this.UuUVuuUu(var4, var3, class_1802.field_8600, 5);
               this.UuUVuuUu(var4, var3, class_1802.field_8600, 8);
            } else {
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 1);
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 2);
               this.UuUVuuUu(var4, var3, class_1802.field_8687, 3);
               this.UuUVuuUu(var4, var3, class_1802.field_8600, 5);
               this.UuUVuuUu(var4, var3, class_1802.field_8600, 8);
            }

            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.TAKING_RESULT;
            this.nNnVnUNVV.UuUVuuUu();
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void VVnVNnunVvu() {
      if (this.nNnVnUNVV.uNNnnnuuuN(50L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_479 var1) {
            uUnuvNvvNU.field_1761.method_2906(((class_1714)var1.method_17577()).field_7763, 0, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
            this.vvUVNVvvNUv++;
            this.UuNnnVnuNNV++;
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.CLOSING_CRAFTING;
            this.nNnVnUNVV.UuUVuuUu();
         } else {
            this.NnVnNVN();
         }
      }
   }

   private void unNNVVNnvvV() {
      if (this.nNnVnUNVV.uNNnnnuuuN(50L)) {
         this.vnvvNvUnVv();
         if (this.NVUunUNUN.uUnuvNvvNU()) {
            int var1 = this.vvUVNVvvNUv();
            int var2 = this.VUuuVUnun();
            if (var1 > 0 && var2 < var1) {
               this.nVVUuvuNnUN = this.UuNnnVnuNNV() ? MoneyFarm.nvnNNunvv.FINDING_CRAFTING_TABLE : MoneyFarm.nvnNNunvv.IDLE;
            } else {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.SELLING;
            }
         } else {
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
         }

         this.nNnVnUNVV.UuUVuuUu();
      }
   }

   private void NuunnvnN() {
      if (this.nNnVnUNVV.uNNnnnuuuN(50L)) {
         if (this.NVuunNnvvvVu) {
            this.uUVVvVVNvvn();
         } else {
            long var1 = this.nNuVunNUVu();
            if (var1 <= 0L) {
               this.uUnuvNvvNU("§cЦена продажи не задана.");
            } else if (!this.vNnNuuvVn()) {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
               this.nNnVnUNVV.UuUVuuUu();
            } else if (uUnuvNvvNU.field_1755 instanceof class_476 var3 && this.vNUvnnVnUvu(var3)) {
               this.UuUVuuUu(var3, false);
            } else if (UuUVuuUu(uUnuvNvvNU.field_1755)) {
               uUnuvNvvNU.method_1507(null);
               this.nNnVnUNVV.UuUVuuUu();
            } else if (uUnuvNvvNU.field_1755 != null) {
               this.vnvvNvUnVv();
               this.nNnVnUNVV.UuUVuuUu();
            } else if (this.VuunNUUUvu()) {
               this.NNUUNUuVNNVn();
               this.vNnNuuvVn = false;
               this.NVuunNnvvvVu = false;
               this.UuUVuuUu(var1);
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.WAITING_SELL_RESULT;
               this.nNnVnUNVV.UuUVuuUu();
            }
         }
      }
   }

   private void NVUunUNUN() {
      if (this.NVuunNnvvvVu) {
         this.uUVVvVVNvvn();
      } else if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.vNUvnnVnUvu(var1)) {
         this.UuUVuuUu(var1, false);
      } else if (this.vNnNuuvVn) {
         this.vNnNuuvVn = false;
         this.UuNnnVnuNNV = 0;
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
         this.nNnVnUNVV.UuUVuuUu();
      } else {
         if (this.nNnVnUNVV.uNNnnnuuuN(7000L)) {
            this.vnvvNvUnVv();
            this.nVVUuvuNnUN = this.vNnNuuvVn() ? MoneyFarm.nvnNNunvv.SELLING : MoneyFarm.nvnNNunvv.IDLE;
            this.nNnVnUNVV.UuUVuuUu();
         }
      }
   }

   private void UUVNuUNUvUnV() {
      if (this.nNnVnUNVV.uNNnnnuuuN(this.UvNNVUVNVuvV())) {
         if (UuUVuuUu(uUnuvNvvNU.field_1755)) {
            uUnuvNvvNU.method_1507(null);
         } else if (uUnuvNvvNU.field_1755 != null) {
            return;
         }

         if (!this.vVVuuVVv && this.vNnNuuvVn()) {
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SELLING;
            this.nNnVnUNVV.UuUVuuUu();
         } else {
            this.vVVuuVVv = false;
            String var1 = uUnuvNvvNU.field_1724.method_5477().getString();
            this.UuUVuuUu(var1);
            this.NVuNUuVnVUN = 0;
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_WAITING_OWN_AH;
            this.nNnVnUNVV.UuUVuuUu();
         }
      }
   }

   private void vuvnUnVnUNnV() {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.vuuuNvNuv(var1)) {
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_TAKE_ITEM;
         this.nNnVnUNVV.UuUVuuUu();
      } else {
         if (this.nNnVnUNVV.uNNnnnuuuN(10000L)) {
            this.uUnuvNvvNU("§cТаймаут поиска своих товаров.");
         }
      }
   }

   private void nnuUVNUuvvVU() {
      if (this.nNnVnUNVV.uNNnnnuuuN(200L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (!this.vuuuNvNuv(var1)) {
               if (this.nNnVnUNVV.uNNnnnuuuN(10000L)) {
                  this.vnvvNvUnVv();
                  this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SEARCH_OWN_AH;
                  this.nNnVnUNVV.UuUVuuUu();
               }
            } else {
               int var3 = this.uNNnnnuuuN(var1);
               if (var3 != -1) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7794);
                  this.NVuNUuVnVUN = 0;
                  this.nNnVnUNVV.UuUVuuUu();
               } else if (this.NVuNUuVnVUN++ < 2) {
                  this.nNnVnUNVV.UuUVuuUu();
               } else {
                  this.vnvvNvUnVv();
                  if (this.vNnNuuvVn()) {
                     this.NUVvUUVuVNVv = 0;
                     this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SELLING;
                  } else {
                     this.NVuunNnvvvVu = false;
                     this.UUuUnNVNuuv = 0;
                     this.NUVvUUVuVNVv = 0;
                     this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
                  }

                  this.nNnVnUNVV.UuUVuuUu();
               }
            }
         } else {
            this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SEARCH_OWN_AH;
            this.nNnVnUNVV.UuUVuuUu();
         }
      }
   }

   private int UuUVuuUu(class_476 var1) {
      int var2 = 0;
      int var3 = this.uVUuuVnNVU(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (var5.method_7681() && this.UuUVuuUu(var5.method_7677(), true)) {
            var2++;
         }
      }

      return var2;
   }

   private void nVVUuvuNnUN() {
      if (this.nNnVnUNVV.uNNnnnuuuN(300L)) {
         this.vnvvNvUnVv();
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SELLING;
         this.nNnVnUNVV.UuUVuuUu();
      }
   }

   private void nNnVnUNVV() {
      if (this.nNnVnUNVV.uNNnnnuuuN(50L)) {
         if (this.NVuunNnvvvVu) {
            this.uUVVvVVNvvn();
         } else {
            long var1 = this.nNuVunNUVu();
            if (var1 <= 0L) {
               this.uUnuvNvvNU("§cЦена продажи не задана.");
            } else if (!this.vNnNuuvVn()) {
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SEARCH_OWN_AH;
               this.nNnVnUNVV.UuUVuuUu();
            } else if (uUnuvNvvNU.field_1755 instanceof class_476 var3 && this.vNUvnnVnUvu(var3)) {
               this.UuUVuuUu(var3, true);
            } else if (UuUVuuUu(uUnuvNvvNU.field_1755)) {
               uUnuvNvvNU.method_1507(null);
               this.nNnVnUNVV.UuUVuuUu();
            } else if (uUnuvNvvNU.field_1755 != null) {
               this.vnvvNvUnVv();
               this.nNnVnUNVV.UuUVuuUu();
            } else if (this.VuunNUUUvu()) {
               this.NNUUNUuVNNVn();
               this.vNnNuuvVn = false;
               this.NVuunNnvvvVu = false;
               this.UuUVuuUu(var1);
               this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_WAIT_SELL_RESULT;
               this.nNnVnUNVV.UuUVuuUu();
            }
         }
      }
   }

   private void nuunNvv() {
      if (this.VUuuVUnun) {
         this.VUuuVUnun = false;
      }

      if (this.NVuunNnvvvVu) {
         this.uUVVvVVNvvn();
      } else if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.vNUvnnVnUvu(var1)) {
         this.UuUVuuUu(var1, true);
      } else if (this.vNnNuuvVn) {
         this.vNnNuuvVn = false;
         this.UUuUnNVNuuv = 0;
         this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
         this.nNnVnUNVV.UuUVuuUu();
      } else {
         if (this.nNnVnUNVV.uNNnnnuuuN(7000L)) {
            this.vnvvNvUnVv();
            this.nVVUuvuNnUN = this.vNnNuuvVn() ? MoneyFarm.nvnNNunvv.RESALE_SELLING : MoneyFarm.nvnNNunvv.IDLE;
            this.nNnVnUNVV.UuUVuuUu();
         }
      }
   }

   private void uUVVvVVNvvn() {
      this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.RESALE_SEARCH_OWN_AH;
      this.NVuunNnvvvVu = false;
      this.vNnNuuvVn = false;
      this.vVVuuVVv = true;
      this.UuNnnVnuNNV = 0;
      this.uUVvnUuNvvN = 0;
      this.NUVvUUVuVNVv = 0;
      this.ccOO0COcoco0 = 0;
      this.nNuVunNUVu = false;
      this.nNnVnUNVV.UuUVuuUu();
   }

   private void UuUVuuUu(class_1714 var1, int var2, class_1792 var3, int var4) {
      this.UuUVuuUu(var1, var2, (Predicate<class_1799>)(var1x -> var1x.method_31574(var3)), var4);
   }

   private void UuUVuuUu(class_1714 var1, int var2, Predicate<class_1799> var3, int var4) {
      if (!var1.method_7611(var4).method_7681()) {
         int var5 = -1;

         for (int var6 = 10; var6 < var1.field_7761.size(); var6++) {
            class_1735 var7 = var1.method_7611(var6);
            if (var7.method_7681() && var3.test(var7.method_7677())) {
               var5 = var6;
               break;
            }
         }

         if (var5 != -1) {
            uUnuvNvvNU.field_1761.method_2906(var2, var5, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1761.method_2906(var2, var4, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1761.method_2906(var2, var5, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         }
      }
   }

   private void UuUVuuUu(class_476 var1, boolean var2) {
      class_1703 var3 = var1.method_17577();
      int var4 = this.uVUuuVnNVU(var1);
      if (this.VuunNUUUvu) {
         if (this.nNnVnUNVV.uNNnnnuuuN(1500L)) {
            this.vnvvNvUnVv();
         }
      } else {
         int var5 = 0;

         for (int var6 = this.uUnuvNvvNU(var2); var5 < 4 && this.NNUUNUuVNNVn < var6; var5++) {
            int var7 = this.C00OOC00oO(var1);
            int var8 = this.UuUVuuUu(var3, var4);
            if (var7 == -1 || var8 == -1) {
               break;
            }

            uUnuvNvvNU.field_1761.method_2906(var3.field_7763, var8, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1761.method_2906(var3.field_7763, var7, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            this.NNUUNUuVNNVn++;
         }

         if (var5 > 0) {
            this.nNnVnUNVV.UuUVuuUu();
         } else if (this.NNUUNUuVNNVn <= 0) {
            this.vnvvNvUnVv();
            this.nVVUuvuNnUN = var2 ? MoneyFarm.nvnNNunvv.RESALE_SEARCH_OWN_AH : MoneyFarm.nvnNNunvv.IDLE;
            this.nNnVnUNVV.UuUVuuUu();
         } else {
            int var9 = this.vVvUvVVuuNvV(var1);
            if (var9 != -1) {
               this.UuUVuuUu(var1, var9, 0, class_1713.field_7790);
               this.VuunNUUUvu = true;
               this.VvVvnNUnvuvV = this.NNUUNUuVNNVn;
               this.nNnVnUNVV.UuUVuuUu();
            } else {
               if (this.nNnVnUNVV.uNNnnnuuuN(3000L)) {
                  this.vnvvNvUnVv();
                  this.nVVUuvuNnUN = var2 ? MoneyFarm.nvnNNunvv.RESALE_SELLING : MoneyFarm.nvnNNunvv.SELLING;
                  this.nNnVnUNVV.UuUVuuUu();
               }
            }
         }
      }
   }

   private int uUnuvNvvNU(boolean var1) {
      if (var1) {
         return Integer.MAX_VALUE;
      } else {
         return this.ccOO0COcoco0 > 0 ? this.ccOO0COcoco0 : Math.max(0, this.uUVvnUuNvvN);
      }
   }

   private int C00OOC00oO(class_476 var1) {
      int var2 = Math.min(9, this.uVUuuVnNVU(var1));

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (!var4.method_7681()) {
            return var3;
         }
      }

      return -1;
   }

   private int uUnuvNvvNU(class_476 var1) {
      int var2 = 0;
      int var3 = Math.min(9, this.uVUuuVnNVU(var1));

      for (int var4 = 0; var4 < var3; var4++) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (!var5.method_7681()) {
            var2++;
         }
      }

      return var2;
   }

   private int vvUVNVvvNUv() {
      return this.ccOO0COcoco0 > 0 ? this.ccOO0COcoco0 : this.uUVvnUuNvvN;
   }

   private int UuUVuuUu(class_1703 var1, int var2) {
      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = var1.method_7611(var3);
         if (var4.method_7681() && this.UuUVuuUu(var4.method_7677(), true)) {
            return var3;
         }
      }

      return -1;
   }

   private int vVvUvVVuuNvV(class_476 var1) {
      int var2 = this.uVUuuVnNVU(var1);
      int var3 = -1;

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (var5.method_7681()) {
            class_1799 var6 = var5.method_7677();
            String var7 = this.vVvUvVVuuNvV(var6.method_7964().getString());
            if (var6.method_31574(class_1802.field_8131)
               || var6.method_31574(class_1802.field_8408)
               || var6.method_31574(class_1802.field_8581)
               || var6.method_31574(class_1802.field_8656)) {
               return var4;
            }

            if (var7.contains("выстав") || var7.contains("продать") || var7.contains("подтверд")) {
               var3 = var4;
            }
         }
      }

      return var3;
   }

   private boolean UuNnnVnuNNV() {
      return !this.uUVvnUuNvvN() && !this.UUuUnNVNuuv();
   }

   private boolean uUVvnUuNvvN() {
      return this.UuUVuuUu(class_1802.field_8687) < this.NVuNUuVnVUN();
   }

   private boolean UUuUnNVNuuv() {
      return this.UuUVuuUu(class_1802.field_8600) < this.NVuunNnvvvVu();
   }

   private int NVuNUuVnVUN() {
      return this.ccOO0COcoco0() ? 2 : 3;
   }

   private int NVuunNnvvvVu() {
      return this.ccOO0COcoco0() ? 1 : 2;
   }

   private int UuUVuuUu(class_1792 var1) {
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

   private boolean vNnNuuvVn() {
      return this.VUuuVUnun() > 0;
   }

   private int VUuuVUnun() {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (this.UuUVuuUu(var3, true)) {
               var1 += Math.max(1, var3.method_7947());
            }
         }

         return var1;
      }
   }

   private boolean UuUVuuUu(class_1799 var1, boolean var2) {
      if (var1 != null && !var1.method_7960()) {
         String var3 = this.vVvUvVVuuNvV(var1.method_7964().getString());
         if (var3.contains(this.vVvUvVVuuNvV(this.VvVvnNUnvuvV()))) {
            return true;
         } else if (!var2) {
            return false;
         } else if (this.ccOO0COcoco0()) {
            return var1.method_31574(class_1802.field_8802);
         } else {
            return this.NUVvUUVuVNVv() ? var1.method_31574(class_1802.field_8556) : var1.method_31574(class_1802.field_8377);
         }
      } else {
         return false;
      }
   }

   private int uNNnnnuuuN(class_476 var1) {
      int var2 = this.uVUuuVnNVU(var1);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (this.UuUVuuUu(var4) && this.UuUVuuUu(var4.method_7677(), true)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(class_1735 var1) {
      return var1 != null && var1.method_7681() ? !this.UuUVuuUu(var1.method_7677()) : false;
   }

   private boolean UuUVuuUu(class_1799 var1) {
      return var1.method_31574(class_1802.field_8656)
         || var1.method_31574(class_1802.field_8157)
         || var1.method_31574(class_1802.field_8581)
         || var1.method_31574(class_1802.field_8879)
         || var1.method_31574(class_1802.field_8162);
   }

   private int nuUnNvnuUu(class_476 var1) {
      int var2 = this.uVUuuVnNVU(var1);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (var4.method_7681()) {
            class_1799 var5 = var4.method_7677();
            String var6 = this.vVvUvVVuuNvV(var5.method_7964().getString());
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

   private int UuUVuuUu(class_476 var1, class_1792 var2) {
      int var3 = this.uVUuuVnNVU(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (var5.method_7681() && var5.method_7677().method_31574(var2)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean VVuuUN(class_476 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.vVvUvVVuuNvV(var1.method_25440().getString());
         if (var2.contains("подтверждение покупки")) {
            return this.UuUVuuUu(var1.method_17577()) != -1;
         } else {
            class_1703 var3 = var1.method_17577();
            return this.UuUVuuUu(var3) != -1 && this.C00OOC00oO(var3);
         }
      }
   }

   private boolean vNUvnnVnUvu(class_476 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.vVvUvVVuuNvV(var1.method_25440().getString());
         return var2.contains("продажа") || var2.contains("sellgui") || var2.contains("sell gui");
      }
   }

   private int UuUVuuUu(class_1703 var1) {
      int var2 = Math.min(var1.field_7761.size(), Math.max(0, var1.field_7761.size() - 36));

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         String var5 = this.vVvUvVVuuNvV(var4.method_7964().getString());
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

   private boolean C00OOC00oO(class_1703 var1) {
      int var2 = Math.min(var1.field_7761.size(), Math.max(0, var1.field_7761.size() - 36));
      int var3 = 0;

      while (true) {
         if (var3 >= var2) {
            return false;
         }

         class_1799 var4 = var1.method_7611(var3).method_7677();
         if (var4.method_31574(class_1802.field_8879)) {
            break;
         }

         if (var4.method_31574(class_1802.field_8197)) {
            break;
         }

         var3++;
      }

      return true;
   }

   private void UuUVuuUu(class_476 var1, int var2, int var3, class_1713 var4) {
      uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2, var3, var4, uUnuvNvvNU.field_1724);
   }

   private int uVUuuVnNVU(class_476 var1) {
      int var2 = ((class_1707)var1.method_17577()).method_17388();
      int var3 = ((class_1707)var1.method_17577()).field_7761.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private class_2338 vVVuuVVv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
         class_2338 var2 = null;
         double var3 = Double.MAX_VALUE;
         class_243 var5 = uUnuvNvvNU.field_1724.method_33571();

         for (class_2338 var7 : class_2338.method_10097(var1.method_10069(-5, -5, -5), var1.method_10069(5, 5, 5))) {
            class_2338 var8 = var7.method_10062();
            if (this.UuUVuuUu(var8)) {
               double var9 = uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var8));
               if (!(var9 > 25.0) && this.UuUVuuUu(var8, var5) && var9 < var3) {
                  var3 = var9;
                  var2 = var8;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   private boolean UuUVuuUu(class_2338 var1, class_243 var2) {
      class_243 var3 = class_243.method_24953(var1);
      class_243 var4 = var3.method_1020(var2);
      double var5 = var4.method_1033();
      if (var5 > 5.0) {
         return false;
      } else {
         class_3965 var7 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var2, var3, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724));
         if (var7 == null || var7.method_17783() == class_240.field_1333) {
            return true;
         } else {
            return var7 instanceof class_3965 var8 ? var8.method_17777().equals(var1) : true;
         }
      }
   }

   private boolean UuUVuuUu(class_2338 var1) {
      return uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1687.method_8320(var1).method_27852(class_2246.field_9980);
   }

   private MoneyFarm.NVnVnNnN UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
      return new MoneyFarm.NVnVnNnN(var9, class_3532.method_15363(var10, -90.0F, 90.0F));
   }

   private boolean UuUVuuUu(class_2338 var1, float var2) {
      MoneyFarm.NVnVnNnN var3 = this.UuUVuuUu(class_243.method_24953(var1));
      float var4 = Math.abs(class_3532.method_15393(var3.yaw - uUnuvNvvNU.field_1724.method_36454()));
      float var5 = Math.abs(var3.pitch - uUnuvNvvNU.field_1724.method_36455());
      return var4 <= var2 && var5 <= var2;
   }

   private void C00OOC00oO(class_2338 var1) {
      MoneyFarm.NVnVnNnN var2 = this.UuUVuuUu(class_243.method_24953(var1));
      uUnuvNvvNU.field_1724.method_36456(var2.yaw);
      uUnuvNvvNU.field_1724.method_36457(var2.pitch);
      uUnuvNvvNU.field_1724.field_6241 = var2.yaw;
      uUnuvNvvNU.field_1724.field_6283 = var2.yaw;
   }

   private class_2350 uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var3 = class_243.method_24953(var1);
      class_243 var4 = var2.method_1020(var3);
      double var5 = Math.abs(var4.field_1352);
      double var7 = Math.abs(var4.field_1351);
      double var9 = Math.abs(var4.field_1350);
      if (var7 > var5 && var7 > var9) {
         return var4.field_1351 > 0.0 ? class_2350.field_11036 : class_2350.field_11033;
      } else if (var5 > var9) {
         return var4.field_1352 > 0.0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return var4.field_1350 > 0.0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   private void UuUVuuUu(String var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null && !var1.isBlank()) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah " + var1.trim());
      }
   }

   private boolean vuuuNvNuv(class_476 var1) {
      if (var1 != null && uUnuvNvvNU.field_1724 != null) {
         String var2 = this.vVvUvVVuuNvV(var1.method_25440().getString());
         String var3 = this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_5477().getString());
         return AhHelper.UuUVuuUu(var1) || var2.contains(var3) || var2.contains("мои товары") || var2.contains("мои предметы") || var2.contains("поиск:");
      } else {
         return false;
      }
   }

   private boolean VuunNUUUvu() {
      return System.currentTimeMillis() - this.UvNNVUVNVuvV >= 1200L;
   }

   private void UuUVuuUu(long var1) {
      uUnuvNvvNU.field_1724.field_3944.method_45730("ah sellgui " + var1);
      this.UvNNVUVNVuvV = System.currentTimeMillis();
   }

   private void NNUUNUuVNNVn() {
      this.VuunNUUUvu = false;
      this.NNUUNUuVNNVn = 0;
      this.VvVvnNUnvuvV = 0;
      if (this.ccOO0COcoco0 < 0) {
         this.ccOO0COcoco0 = 0;
      }
   }

   private String VvVvnNUnvuvV() {
      if (this.ccOO0COcoco0()) {
         return "Изумрудный меч";
      } else {
         return this.NUVvUUVuVNVv() ? "Изумрудный топор" : "Изумрудная кирка";
      }
   }

   private boolean ccOO0COcoco0() {
      return this.c0oOOCcCoC0.C00OOC00oO("Изумрудный меч");
   }

   private boolean NUVvUUVuVNVv() {
      return this.c0oOOCcCoC0.C00OOC00oO("Изумрудный топор");
   }

   private long nNuVunNUVu() {
      return this.C00OOC00oO(this.VVnVNnunVvu.uUnuvNvvNU());
   }

   private int UNvvunVVn() {
      return Math.max(1, Math.round(this.vuvnUnVnUNnV.uUnuvNvvNU()));
   }

   private long UnvuVuVnNuvu() {
      return Math.max(1000L, Math.round(this.UUVNuUNUvUnV.uUnuvNvvNU() * 1000.0));
   }

   private long C00OOC00oO(String var1) {
      if (var1 == null) {
         return 0L;
      } else {
         String var2 = var1.toLowerCase(Locale.ROOT).replace(" ", "").replace("_", "").replace(",", "").replace(".", "");
         long var3 = 1L;
         if (var2.endsWith("тысяч")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 5);
         } else if (var2.endsWith("тысячи")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 6);
         } else if (var2.endsWith("тысяча")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 6);
         } else if (var2.endsWith("тыс")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 3);
         } else if (var2.endsWith("k") || var2.endsWith("к")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 1);
         } else if (var2.endsWith("m") || var2.endsWith("м")) {
            var3 = 1000000L;
            var2 = var2.substring(0, var2.length() - 1);
         }

         String var5 = var2.replaceAll("[^0-9]", "");
         if (var5.isEmpty()) {
            return 0L;
         } else {
            try {
               return Math.multiplyExact(Long.parseLong(var5), var3);
            } catch (NumberFormatException | ArithmeticException var7) {
               return 0L;
            }
         }
      }
   }

   private long UvNNVUVNVuvV() {
      return Math.max(50L, (long)Math.round(this.unNNVVNnvvV.uUnuvNvvNU()));
   }

   private void NnunUUnU() {
      if (this.nVVUuvuNnUN != MoneyFarm.nvnNNunvv.AIMING_CRAFTING_TABLE && this.nVVUuvuNnUN != MoneyFarm.nvnNNunvv.OPENING_CRAFTING_TABLE) {
         if (this.nuunNvv.uNNnnnuuuN(10000L)) {
            ThreadLocalRandom var1 = ThreadLocalRandom.current();
            float var2 = var1.nextFloat() * 10.0F - 5.0F;
            float var3 = var1.nextFloat() * 6.0F - 3.0F;
            uUnuvNvvNU.field_1724.method_36456(uUnuvNvvNU.field_1724.method_36454() + var2);
            uUnuvNvvNU.field_1724.method_36457(Math.max(-90.0F, Math.min(90.0F, uUnuvNvvNU.field_1724.method_36455() + var3)));
            this.nuunNvv.UuUVuuUu();
         }
      }
   }

   private void nvuVvuNnNUnv() {
      this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
      this.uUVVvVVNvvn = null;
      this.vvUVNVvvNUv = 0;
      this.UuNnnVnuNNV = 0;
      this.uUVvnUuNvvN = 0;
      this.UUuUnNVNuuv = 0;
      this.NVuNUuVnVUN = 0;
      this.NVuunNnvvvVu = false;
      this.vNnNuuvVn = false;
      this.VUuuVUnun = false;
      this.vVVuuVVv = false;
      this.VuunNUUUvu = false;
      this.NNUUNUuVNNVn = 0;
      this.VvVvnNUnvuvV = 0;
      this.ccOO0COcoco0 = 0;
      this.NUVvUUVuVNVv = 0;
      this.nNuVunNUVu = false;
      this.UNvvunVVn = 0;
      this.UnvuVuVnNuvu = -1;
      this.UvNNVUVNVuvV = 0L;
      this.NnunUUnU = 0L;
      this.nvuVvuNnNUnv = 0L;
      this.nNnVnUNVV.UuUVuuUu();
      this.nuunNvv.UuUVuuUu();
   }

   private void uUnuvNvvNU(String var1) {
      this.nuUnNvnuUu(var1);
      this.NnVnNVN();
   }

   private void NnVnNVN() {
      this.nVVUuvuNnUN = MoneyFarm.nvnNNunvv.IDLE;
      this.UNvvunVVn = 0;
      this.nNnVnUNVV.UuUVuuUu();
   }

   private static boolean UuUVuuUu(class_437 var0) {
      return var0 instanceof class_408 || var0 instanceof class_433;
   }

   private boolean C00OOC00oO(class_437 var1) {
      return var1 == null || UuUVuuUu(var1);
   }

   private void vnvvNvUnVv() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      if (UuUVuuUu(uUnuvNvvNU.field_1755)) {
         uUnuvNvvNU.method_1507(null);
      }
   }

   private boolean C00OOC00oO(long var1) {
      if (this.C00OOC00oO(uUnuvNvvNU.field_1755)) {
         if (UuUVuuUu(uUnuvNvvNU.field_1755)) {
            if (!this.nNnVnUNVV.uNNnnnuuuN(var1)) {
               return false;
            }

            uUnuvNvvNU.method_1507(null);
         }

         this.UNvvunVVn = 0;
         return true;
      } else if (!this.nNnVnUNVV.uNNnnnuuuN(var1)) {
         return false;
      } else {
         this.vnvvNvUnVv();
         this.UNvvunVVn++;
         if (this.UNvvunVVn >= 20) {
            uUnuvNvvNU.method_1507(null);
            this.UNvvunVVn = 0;
            return true;
         } else {
            this.nNnVnUNVV.UuUVuuUu();
            return false;
         }
      }
   }

   private String vVvUvVVuuNvV(String var1) {
      return var1 == null ? "" : var1.replaceAll("(?i)§.", "").replaceAll("(?i)&.", "").toLowerCase(Locale.ROOT).trim();
   }

   private void OCOocoOoOO() {
      if (uUnuvNvvNU.field_1724 != null) {
         if ((this.nVVUuvuNnUN == MoneyFarm.nvnNNunvv.AIMING_CRAFTING_TABLE || this.nVVUuvuNnUN == MoneyFarm.nvnNNunvv.OPENING_CRAFTING_TABLE)
            && this.uUVVvVVNvvn != null) {
            this.C00OOC00oO(class_243.method_24953(this.uUVVvVVNvvn));
         } else {
            this.nvuVvuNnNUnv = 0L;
         }
      }
   }

   private void C00OOC00oO(class_243 var1) {
      MoneyFarm.NVnVnNnN var2 = this.UuUVuuUu(var1);
      float var3 = this.o0Ooc0COOoc();
      boolean var4 = this.nVVUuvuNnUN == MoneyFarm.nvnNNunvv.AIMING_CRAFTING_TABLE;
      float var5 = var4 ? 0.42F : 0.11F;
      float var6 = 1.0F - (float)Math.pow(1.0F - var5, var3);
      float var7 = uUnuvNvvNU.field_1724.method_36454();
      float var8 = uUnuvNvvNU.field_1724.method_36455();
      float var9 = class_3532.method_15393(var2.yaw - var7);
      float var10 = var2.pitch - var8;
      float var11 = var7 + var9 * var6;
      float var12 = class_3532.method_15363(var8 + var10 * var6, -90.0F, 90.0F);
      uUnuvNvvNU.field_1724.method_36456(var11);
      uUnuvNvvNU.field_1724.method_36457(var12);
      uUnuvNvvNU.field_1724.field_6241 = var11;
      uUnuvNvvNU.field_1724.field_6283 = var11;
   }

   private float o0Ooc0COOoc() {
      long var1 = System.nanoTime();
      if (this.nvuVvuNnNUnv == 0L) {
         this.nvuVvuNnNUnv = var1;
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.nvuVvuNnNUnv) / 1.6666667E7F;
         this.nvuVvuNnNUnv = var1;
         return class_3532.method_15363(var3, 0.25F, 4.0F);
      }
   }

   private boolean UuUVuuUu(class_2338 var1, double var2) {
      class_243 var4 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var5 = uUnuvNvvNU.field_1724.method_5828(1.0F);
      class_243 var6 = var4.method_1019(var5.method_1021(var2));
      return uUnuvNvvNU.field_1687.method_17742(new class_3959(var4, var6, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724)) instanceof class_3965 var8
         ? var8.method_17777().equals(var1)
         : false;
   }

   private void nvvnUnUn() {
      this.UnvuVuVnNuvu = -1;
      if (uUnuvNvvNU.field_1687 != null) {
         class_269 var1 = uUnuvNvvNU.field_1687.method_8428();
         if (var1 != null) {
            class_266 var2 = var1.method_1189(class_8646.field_45157);
            if (var2 != null) {
               Collection var3;
               try {
                  var3 = var1.method_1184(var2);
               } catch (Throwable var8) {
                  return;
               }

               for (class_9011 var5 : var3) {
                  if (var5 != null) {
                     String var6 = this.vVvUvVVuuNvV(String.valueOf(var5.comp_2127()));
                     if (var6.contains("монет") || var6.contains("coin") || var6.contains("money") || var6.contains("баланс") || var6.contains("$")) {
                        int var7 = this.uNNnnnuuuN(var6);
                        if (var7 >= 0) {
                           this.UnvuVuVnNuvu = var7;
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private int uNNnnnuuuN(String var1) {
      Matcher var2 = UvUvUNuvNU.matcher(var1);
      int var3 = -1;

      while (var2.find()) {
         String var4 = var2.group(1).replaceAll("[^0-9]", "");
         if (!var4.isBlank() && var4.length() <= 12) {
            try {
               var3 = Integer.parseInt(var4);
            } catch (NumberFormatException var6) {
            }
         }
      }

      return var3;
   }

   private void nuUnNvnuUu(String var1) {
      if (this.nnuUVNUuvvVU.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null) {
         vVnvuVVUunuv.UuUVuuUu("§8[§aMoneyFarm§8] §f" + var1);
      }
   }

   record NVnVnNnN(float yaw, float pitch) {
   }

   static enum nvnNNunvv {
      IDLE,
      BUY_OPENING_SHOP,
      BUY_WAITING_SHOP,
      BUY_FIND_GOLD_INGOT,
      BUY_WAITING_EMERALD_MENU,
      BUY_FIND_EMERALD,
      BUY_WAITING_CONFIRM,
      BUY_CLICK_LIME_PANE,
      BUY_CLOSING_SHOP,
      CHECK_SELL_GUI_OPENING,
      CHECK_SELL_GUI_WAITING,
      CHECK_SELL_GUI_READING,
      FINDING_CRAFTING_TABLE,
      AIMING_CRAFTING_TABLE,
      OPENING_CRAFTING_TABLE,
      PLACING_ITEMS,
      TAKING_RESULT,
      CLOSING_CRAFTING,
      SELLING,
      WAITING_SELL_RESULT,
      RESALE_SEARCH_OWN_AH,
      RESALE_WAITING_OWN_AH,
      RESALE_TAKE_ITEM,
      RESALE_CLOSING,
      RESALE_SELLING,
      RESALE_WAIT_SELL_RESULT;
   }
}
