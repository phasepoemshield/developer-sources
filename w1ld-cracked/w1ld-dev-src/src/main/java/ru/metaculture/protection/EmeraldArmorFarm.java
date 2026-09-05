package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1706;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1714;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_476;
import net.minecraft.class_479;
import net.minecraft.class_7439;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "EmeraldArmorFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Крафтит изумрудную броню, сливает в наковальне и продает на /ah"
)
public class EmeraldArmorFarm extends Module {
   private static final int NVNnnvnuunNv = 5;
   private static final int uVunuUNVVUUV = 6;
   private static final double UNnVVNvvnVvU = 4.5;
   private static final int uNnUnnuNUnNu = 20;
   private static final long NnUuNNU = 250L;
   private static final long nNvNUVU = 1500L;
   private static final long UnUNuUU = 7000L;
   private static final long uUVuVvuNUvnu = 500L;
   private static final int UvUvUNuvNU = 50;
   private static final int c0oOOCcCoC0 = 48;
   private static final Pattern VVnVNnunVvu = Pattern.compile("(?i)защит\\S{0,3}\\s*:?\\s*([0-9]+|[ivx]+)");
   private static final Pattern unNNVVNnvvV = Pattern.compile(
      "(\\d+)\\s*[/\\\\]\\s*\\d+|(?i)(?:страниц\\w*|стр\\.?|page)\\s*[:#]?\\s*(\\d+)|(?i)(\\d+)\\s*(?:из|of)\\s*\\d+"
   );
   private final UvNnUnuNUUU NuunnvnN = new UvNnUnuNUUU("Сервер", "FunTime", "FunTime", "SpookyTime");
   private final NVuVVUNUvV NVUunUNUN = new NVuVVUNUvV("Цена продажи", "40000").UuUVuuUu(32);
   private final NVuVVUNUvV UUVNuUNUvUnV = new NVuVVUNUvV("Макс. цена опыта", "1000000").UuUVuuUu(32);
   private final UvNnUnuNUUU vuvnUnVnUNnV = new UvNnUnuNUUU("Бутылка опыта", "Опыт 45", "Опыт 15", "Опыт 30", "Опыт 45", "Опыт 50");
   private final nNUuNvVn nnuUVNUuvvVU = new nNUuNvVn("Мин. уровень", 30.0F, 1.0F, 100.0F, 1.0F, false);
   private final nNUuNvVn nVVUuvuNnUN = new nNUuNvVn("Бутылок бросать", 2.0F, 1.0F, 10.0F, 1.0F, false);
   private final nNUuNvVn nNnVnUNVV = new nNUuNvVn("Радиус игроков", 3.0F, 0.0F, 20.0F, 1.0F, false);
   private final nNUuNvVn nuunNvv = new nNUuNvVn("Перевыставить (сек)", 30.0F, 5.0F, 120.0F, 1.0F, false);
   private final nNUuNvVn uUVVvVVNvvn = new nNUuNvVn("Задержка (мс)", 100.0F, 50.0F, 5000.0F, 50.0F, false);
   private final nNUuNvVn vvUVNVvvNUv = new nNUuNvVn("Буфер изумрудов", 128.0F, 64.0F, 512.0F, 64.0F, false);
   private final vvNnnUNnVvn UuNnnVnuNNV = new vvNnnUNnVvn("Уведомления", true);
   private EmeraldArmorFarm.VvunVVUvUNnv uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.IDLE;
   private final VuNvNNvVV UUuUnNVNuuv = new VuNvNNvVV();
   private final VuNvNNvVV NVuNUuVnVUN = new VuNvNNvVV();
   private final VuNvNNvVV NVuunNnvvvVu = new VuNvNNvVV();
   private final VuNvNNvVV vNnNuuvVn = new VuNvNNvVV();
   private final VuNvNNvVV VUuuVUnun = new VuNvNNvVV();
   private final VuNvNNvVV vVVuuVVv = new VuNvNNvVV();
   private EmeraldArmorFarm.NVnVnNnN VuunNUUUvu = EmeraldArmorFarm.NVnVnNnN.NONE;
   private boolean NNUUNUuVNNVn = false;
   private class_2338 VvVvnNUnvuvV;
   private class_2338 ccOO0COcoco0;
   private int NUVvUUVuVNVv = 0;
   private int nNuVunNUVu = 0;
   private boolean UNvvunVVn = false;
   private boolean UnvuVuVnNuvu = false;
   private boolean UvNNVUVNVuvV = false;
   private boolean NnunUUnU = false;
   private boolean nvuVvuNnNUnv = false;
   private int NnVnNVN = 0;
   private int vnvvNvUnVv = 0;
   private int OCOocoOoOO = 0;
   private long o0Ooc0COOoc = 0L;
   private long nvvnUnUn = 0L;
   private long UnUUVuVunvVu = 0L;
   private int nnvuvUNuUnN = 50;

   public EmeraldArmorFarm() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU,
            this.nVVUuvuNnUN,
            this.nNnVnUNVV,
            this.nuunNvv,
            this.uUVVvVVNvvn,
            this.vvUVNVvvNUv,
            this.UuNnnVnuNNV
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.vUvUvUNNuNvn();
   }

   @Override
   public void C00OOC00oO() {
      this.vUvUvUNNuNvn();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && var1.uNNnnnuuuN().equals(uvUUuvnunU.NVnVnNnN.RECEIVE)) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var5 = var2.comp_763().getString();
            String var4 = this.vuuuNvNuv(var5);
            if (this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.BUY_FIND_EMERALD
                  && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.BUY_WAITING_CONFIRM
                  && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.BUY_CLICK_LIME_PANE
                  && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_WAITING_CONFIRM
                  && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CONFIRMING
               || !var4.contains("недостаточно") && !var4.contains("не хватает") && !var4.contains("нет монет") && !var4.contains("нет денег")) {
               if (var4.contains("не удалось выставить") && var4.contains("освободите хранилище")) {
                  this.UvNNVUVNVuvV = true;
                  this.UNvvunVVn = false;
                  this.NnunUUnU = true;
               } else if (this.vVvUvVVuuNvV(var5)) {
                  this.UnvuVuVnNuvu = true;
                  this.NnVnNVN = Math.max(0, this.NnVnNVN - 1);
                  this.nvvnUnUn = System.currentTimeMillis();
               } else {
                  if (this.uUnuvNvvNU(var5)) {
                     this.UvNNVUVNVuvV = false;
                     this.UNvvunVVn = true;
                     this.NnVnNVN++;
                     this.nvvnUnUn = System.currentTimeMillis();
                  }

                  if (var4.contains("вы успешно купили")
                     && (
                        this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_WAITING_CONFIRM
                           || this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CONFIRMING
                           || this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CLOSING
                     )) {
                     this.nvuVvuNnNUnv = true;
                  }
               }
            } else {
               this.VvuUUUNNNv();
               this.uVUuuVnNVU("§cНе хватает монет для покупки.");
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         this.UnnNNvuvvUU();
         this.VvVuvUvvNNVv();
         if (this.UvNNVUVNVuvV && this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.IDLE) {
            this.NNUUNUuVNNVn();
         }

         switch (this.uUVvnUuNvvN) {
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
            case BUY_XP_SEARCHING:
               this.uNnUnnuNUnNu();
               break;
            case BUY_XP_WAITING_AUCTION:
               this.NnUuNNU();
               break;
            case BUY_XP_READING_AUCTION:
               this.nNvNUVU();
               break;
            case BUY_XP_WAITING_CONFIRM:
               this.uUVuVvuNUvnu();
               break;
            case BUY_XP_CONFIRMING:
               this.UvUvUNuvNU();
               break;
            case BUY_XP_CLOSING:
               this.c0oOOCcCoC0();
               break;
            case THROW_XP_WAIT_PLAYERS:
               this.VVnVNnunVvu();
               break;
            case THROW_XP_THROWING:
               this.unNNVVNnvvV();
               break;
            case FINDING_CRAFTING_TABLE:
               this.NuunnvnN();
               break;
            case AIMING_CRAFTING_TABLE:
               this.NVUunUNUN();
               break;
            case OPENING_CRAFTING_TABLE:
               this.UUVNuUNUvUnV();
               break;
            case PLACING_ITEMS:
               this.vuvnUnVnUNnV();
               break;
            case TAKING_RESULT:
               this.nnuUVNUuvvVU();
               break;
            case CLOSING_CRAFTING:
               this.nVVUuvuNnUN();
               break;
            case FINDING_ANVIL:
               this.nNnVnUNVV();
               break;
            case AIMING_ANVIL:
               this.nuunNvv();
               break;
            case OPENING_ANVIL:
               this.uUVVvVVNvvn();
               break;
            case HANDLING_ANVIL:
               this.vvUVNVvvNUv();
               break;
            case CLOSING_ANVIL:
               this.UuNnnVnuNNV();
               break;
            case SELLING:
               this.uUVvnUuNvvN();
               break;
            case WAITING_SELL_RESULT:
               this.UUuUnNVNuuv();
               break;
            case RESALE_SEARCH_OWN_AH:
               this.NVuNUuVnVUN();
               break;
            case RESALE_WAITING_OWN_AH:
               this.NVuunNnvvvVu();
               break;
            case RESALE_TAKE_ITEM:
               this.vNnNuuvVn();
               break;
            case RESALE_CLOSING:
               this.VUuuVUnun();
               break;
            case RESALE_SELLING:
               this.vVVuuVVv();
               break;
            case RESALE_WAIT_SELL_RESULT:
               this.VuunNUUUvu();
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (this.NnVnNVN > 0) {
            if (System.currentTimeMillis() - this.nvvnUnUn >= this.UnnnvvU()) {
               this.NNUUNUuVNNVn();
            }
         } else if (this.ccOO0COcoco0()) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.SELLING;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else if (this.UuUVuuUu(class_1802.field_8687) < this.NnuUnUNnu()) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_OPENING_SHOP;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else {
            EmeraldArmorFarm.NVnVnNnN var1 = this.VvVvnNUnvuvV();
            if (var1 != EmeraldArmorFarm.NVnVnNnN.NONE) {
               if (var1 != this.VuunNUUUvu) {
                  this.VuunNUUUvu = var1;
                  this.NNUUNUuVNNVn = false;
               }

               if (uUnuvNvvNU.field_1724.field_7520 < this.VunnVNvNV()) {
                  if (this.nNuVunNUVu() > 0) {
                     this.vnvvNvUnVv = 0;
                     this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.THROW_XP_WAIT_PLAYERS;
                  } else {
                     this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_SEARCHING;
                  }

                  this.UUuUnNVNuuv.UuUVuuUu();
               } else if (!this.NNUUNUuVNNVn && this.UuUVuuUu(this.VuunNUUUvu, 3) < 4) {
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.FINDING_CRAFTING_TABLE;
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else {
                  this.NNUUNUuVNNVn = true;
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.FINDING_ANVIL;
                  this.UUuUnNVNuuv.UuUVuuUu();
               }
            }
         }
      }
   }

   private void nUUVuvU() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (this.C00OOC00oO(150L)) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("shop");
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_WAITING_SHOP;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void UnUNVVVNuv() {
      if (uUnuvNvvNU.field_1755 instanceof class_476) {
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_FIND_GOLD_INGOT;
         this.UUuUnNVNuuv.UuUVuuUu();
      } else {
         if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
            this.uVUuuVnNVU("§cТаймаут магазина.");
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            int var3 = this.UuUVuuUu(var1, class_1802.field_8695);
            if (var3 != -1) {
               this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_WAITING_EMERALD_MENU;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
                  this.VvuUUUNNNv();
                  this.uVUuuVnNVU("§cЗолотой слиток не найден.");
               }
            }
         } else {
            this.uuVuUuuVVNvN();
         }
      }
   }

   private void UvnvNVnnnnNU() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (!(uUnuvNvvNU.field_1755 instanceof class_476)) {
            this.uuVuUuuVVNvN();
         } else {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_FIND_EMERALD;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void uVUVnuvnuVuv() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            int var3 = this.C00OOC00oO(var1);
            if (var3 != -1) {
               this.UuUVuuUu(var1, var3, 1, class_1713.field_7790);
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_WAITING_CONFIRM;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
                  this.VvuUUUNNNv();
                  this.uVUuuVnNVU("§cИзумруд не найден.");
               }
            }
         } else {
            this.uuVuUuuVVNvN();
         }
      }
   }

   private void NVNnnvnuunNv() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (!this.nvuVvuNnNUnv()) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_CLOSING_SHOP;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (this.uUnuvNvvNU(var1)) {
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_CLICK_LIME_PANE;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
                  this.VvuUUUNNNv();
                  this.uVUuuVnNVU("§cПодтверждение покупки изумрудов не открылось.");
               }
            }
         } else {
            this.uuVuUuuVVNvN();
         }
      }
   }

   private void uVunuUNVVUUV() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (!this.nvuVvuNnNUnv()) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_CLOSING_SHOP;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (!this.uUnuvNvvNU(var1)) {
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_WAITING_CONFIRM;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else {
               int var3 = this.C00OOC00oO(var1.method_17577());
               if (var3 != -1) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_CLOSING_SHOP;
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else {
                  if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
                     this.VvuUUUNNNv();
                     this.uVUuuVnNVU("§cЛаймовая панель не найдена.");
                  }
               }
            }
         } else {
            this.uuVuUuuVVNvN();
         }
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.C00OOC00oO(150L)) {
         this.uuVuUuuVVNvN();
      }
   }

   private void uNnUnnuNUnNu() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu()) && uUnuvNvvNU.field_1755 == null) {
         long var1 = this.UnUUVuVunvVu();
         if (var1 <= 0L) {
            this.uVUuuVnNVU("§cМаксимальная цена опыта не задана.");
         } else {
            this.nuUnNvnuUu(this.UVnuVUUVnnU());
            this.NUVvUUVuVNVv = 0;
            this.nvuVvuNnNUnv = false;
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_WAITING_AUCTION;
            this.UUuUnNVNuuv.UuUVuuUu();
            this.NVuunNnvvvVu.UuUVuuUu();
            this.vNnNuuvVn.UuUVuuUu();
            this.VUuuVUnun.UuUVuuUu();
         }
      }
   }

   private void NnUuNNU() {
      label21: {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (AhHelper.UuUVuuUu(var1)) {
               break label21;
            }

            if (this.uUnuvNvvNU(var1)) {
               break label21;
            }
         }

         if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
            this.uVUuuVnNVU("§cТаймаут поиска опыта.");
         }

         return;
      }

      this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_READING_AUCTION;
      this.UUuUnNVNuuv.UuUVuuUu();
   }

   private void nNvNUVU() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(150L)) {
         if (!(uUnuvNvvNU.field_1755 instanceof class_476 var1)) {
            if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
               this.uuVuUuuVVNvN();
            }
         } else if (this.uUnuvNvvNU(var1)) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CONFIRMING;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else if (!AhHelper.UuUVuuUu(var1)) {
            if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
               this.VvuUUUNNNv();
               this.uVUuuVnNVU("§cОткрылся не экран аукциона при покупке опыта.");
            }
         } else {
            long var11 = this.UnUUVuVunvVu();
            class_1703 var4 = var1.method_17577();
            boolean var5 = false;

            for (int var6 = 0; var6 < Math.min(45, var4.field_7761.size()); var6++) {
               class_1735 var7 = var4.method_7611(var6);
               if (this.UuUVuuUu(var7) && this.uUnuvNvvNU(var7.method_7677())) {
                  long var8 = this.C00OOC00oO(var7);
                  String var10 = this.uUnuvNvvNU(var7);
                  if ((uUnuvNvvNU.field_1724 == null || var10 == null || !var10.equalsIgnoreCase(uUnuvNvvNU.field_1724.method_5477().getString()))
                     && var8 > 0L
                     && var8 <= var11) {
                     var5 = true;
                     if (this.vNnNuuvVn.uNNnnnuuuN(Math.max(50L, this.VUUnuVvVu()))) {
                        uUnuvNvvNU.field_1761.method_2906(var4.field_7763, var6, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
                        this.vNnNuuvVn.UuUVuuUu();
                        this.VUuuVUnun.UuUVuuUu();
                        this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_WAITING_CONFIRM;
                        this.UUuUnNVNuuv.UuUVuuUu();
                        return;
                     }
                     break;
                  }
               }
            }

            if (!var5 && this.NVuunNnvvvVu.uNNnnnuuuN(250L)) {
               if (this.UuUVuuUu(var4)) {
                  this.NVuunNnvvvVu.UuUVuuUu();
               } else {
                  this.VvuUUUNNNv();
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_SEARCHING;
                  this.UUuUnNVNuuv.UuUVuuUu();
               }
            } else if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
               this.VvuUUUNNNv();
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_SEARCHING;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else {
               this.NUVvUUVuVNVv++;
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1703 var1) {
      int var2 = var1.field_7763;
      int var3 = this.UnUNuUU();
      int var4;
      if (var3 > 1) {
         var4 = 48;
      } else if (var3 == 1) {
         var4 = 50;
      } else {
         var4 = this.nnvuvUNuUnN;
         this.nnvuvUNuUnN = var4 == 50 ? 48 : 50;
      }

      if (var4 >= 0 && var4 < var1.field_7761.size()) {
         uUnuvNvvNU.field_1761.method_2906(var2, var4, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         return true;
      } else {
         return false;
      }
   }

   private int UnUNuUU() {
      if (uUnuvNvvNU.field_1755 == null) {
         return -1;
      } else {
         String var1 = this.UuUVuuUu(uUnuvNvvNU.field_1755.method_25440().getString());
         if (var1.isEmpty()) {
            return -1;
         } else {
            Matcher var2 = unNNVVNnvvV.matcher(var1);
            if (!var2.find()) {
               return -1;
            } else {
               String var3 = var2.group(1);
               if (var3 == null) {
                  var3 = var2.group(2);
               }

               if (var3 == null) {
                  var3 = var2.group(3);
               }

               if (var3 == null) {
                  return -1;
               } else {
                  try {
                     int var4 = Integer.parseInt(var3);
                     return var4 < 1 ? -1 : var4;
                  } catch (NumberFormatException var5) {
                     return -1;
                  }
               }
            }
         }
      }
   }

   private String UuUVuuUu(String var1) {
      return var1 == null ? "" : var1.replaceAll("§.", "").toLowerCase(Locale.ROOT).trim();
   }

   private void uUVuVvuNUvnu() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (!this.nvuVvuNnNUnv && this.nNuVunNUVu() <= 0) {
            if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
               if (this.uUnuvNvvNU(var1)) {
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CONFIRMING;
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else {
                  if (this.UUuUnNVNuuv.uNNnnnuuuN(4000L)) {
                     this.VvuUUUNNNv();
                     this.uVUuuVnNVU("§cПодтверждение покупки опыта не открылось.");
                  }
               }
            } else {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(4000L)) {
                  this.uVUuuVnNVU("§cПодтверждение покупки опыта не открылось.");
               }
            }
         } else {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CLOSING;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void UvUvUNuvNU() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (!this.nvuVvuNnNUnv && this.nNuVunNUVu() <= 0) {
            if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
               int var3 = this.C00OOC00oO(var1.method_17577());
               if (var3 != -1 && this.VUuuVUnun.uNNnnnuuuN(Math.max(50L, this.VUUnuVvVu()))) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CLOSING;
                  this.UUuUnNVNuuv.UuUVuuUu();
                  this.VUuuVUnun.UuUVuuUu();
               } else {
                  if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
                     this.VvuUUUNNNv();
                     this.uVUuuVnNVU("§cКнопка подтверждения покупки опыта не найдена.");
                  }
               }
            } else {
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CLOSING;
               this.UUuUnNVNuuv.UuUVuuUu();
            }
         } else {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_CLOSING;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void c0oOOCcCoC0() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(300L)) {
         this.VvuUUUNNNv();
         this.uuVuUuuVVNvN();
      }
   }

   private void VVnVNnunVvu() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(300L)) {
         if (!this.NnVnNVN()) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.THROW_XP_THROWING;
            this.UUuUnNVNuuv.UuUVuuUu();
            this.vVVuuVVv.UuUVuuUu();
         }
      }
   }

   private void unNNVVNnvvV() {
      if (uUnuvNvvNU.field_1724.field_7520 >= this.VunnVNvNV()) {
         this.UvNNVUVNVuvV();
         this.uuVuUuuVVNvN();
      } else if (this.vnvvNvUnVv >= this.NvUVUvVVnUu()) {
         this.UvNNVUVNVuvV();
         this.uuVuUuuVVNvN();
      } else if (this.NnVnNVN()) {
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.THROW_XP_WAIT_PLAYERS;
         this.UUuUnNVNuuv.UuUVuuUu();
      } else if (uUnuvNvvNU.field_1755 != null) {
         this.VvuUUUNNNv();
      } else {
         float var1 = 87.0F + this.UuUVuuUu(-0.5F, 0.5F);
         uUnuvNvvNU.field_1724.method_36457(var1);
         if (!this.UNvvunVVn()) {
            this.UvNNVUVNVuvV();
            this.uuVuUuuVVNvN();
         } else if (this.vVVuuVVv.uNNnnnuuuN(200L)) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.vnvvNvUnVv++;
            this.vVVuuVVv.UuUVuuUu();
         }
      }
   }

   private void NuunnvnN() {
      if (this.C00OOC00oO(150L)) {
         if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
            this.VvVvnNUnvuvV = this.vnvvNvUnVv();
            if (this.VvVvnNUnvuvV == null) {
               this.uVUuuVnNVU("§cВерстак рядом не найден.");
            } else {
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.AIMING_CRAFTING_TABLE;
               this.UUuUnNVNuuv.UuUVuuUu();
            }
         }
      }
   }

   private void NVUunUNUN() {
      if (this.VvVvnNUnvuvV == null || !this.UuUVuuUu(this.VvVvnNUnvuvV)) {
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.FINDING_CRAFTING_TABLE;
         this.UUuUnNVNuuv.UuUVuuUu();
      } else if (this.UuUVuuUu(this.VvVvnNUnvuvV, 4.5) && this.UUuUnNVNuuv.uNNnnnuuuN(220L)) {
         class_3965 var1 = new class_3965(class_243.method_24953(this.VvVvnNUnvuvV), this.uUnuvNvvNU(this.VvVvnNUnvuvV), this.VvVvnNUnvuvV, false);
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.OPENING_CRAFTING_TABLE;
         this.UUuUnNVNuuv.UuUVuuUu();
      }
   }

   private void UUVNuUNUvUnV() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (uUnuvNvvNU.field_1755 instanceof class_479) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.PLACING_ITEMS;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else {
            if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
               this.uVUuuVnNVU("§cВерстак не открылся.");
            }
         }
      }
   }

   private void vuvnUnVnUNnV() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (!(uUnuvNvvNU.field_1755 instanceof class_479 var1)) {
            this.uuVuUuuVVNvN();
         } else {
            class_1714 var9 = (class_1714)var1.method_17577();
            int var3 = var9.field_7763;
            int[] var4 = this.UuUVuuUu(this.VuunNUUUvu);

            for (int var8 : var4) {
               this.UuUVuuUu(var9, var3, class_1802.field_8687, var8);
            }

            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.TAKING_RESULT;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void nnuUVNUuvvVU() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_479 var1) {
            uUnuvNvvNU.field_1761.method_2906(((class_1714)var1.method_17577()).field_7763, 0, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.CLOSING_CRAFTING;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else {
            this.uuVuUuuVVNvN();
         }
      }
   }

   private void nVVUuvuNnUN() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         this.VvuUUUNNNv();
         this.uuVuUuuVVNvN();
      }
   }

   private void nNnVnUNVV() {
      if (this.C00OOC00oO(150L)) {
         if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
            this.ccOO0COcoco0 = this.OCOocoOoOO();
            if (this.ccOO0COcoco0 == null) {
               this.uVUuuVnNVU("§cНаковальня рядом не найдена.");
            } else {
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.AIMING_ANVIL;
               this.UUuUnNVNuuv.UuUVuuUu();
            }
         }
      }
   }

   private void nuunNvv() {
      if (this.ccOO0COcoco0 == null || !this.C00OOC00oO(this.ccOO0COcoco0)) {
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.FINDING_ANVIL;
         this.UUuUnNVNuuv.UuUVuuUu();
      } else if (this.UuUVuuUu(this.ccOO0COcoco0, 4.5) && this.UUuUnNVNuuv.uNNnnnuuuN(220L)) {
         class_3965 var1 = new class_3965(class_243.method_24953(this.ccOO0COcoco0), this.uUnuvNvvNU(this.ccOO0COcoco0), this.ccOO0COcoco0, false);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.OPENING_ANVIL;
         this.UUuUnNVNuuv.UuUVuuUu();
      }
   }

   private void uUVVvVVNvvn() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu())) {
         if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1706) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.HANDLING_ANVIL;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else {
            if (this.UUuUnNVNuuv.uNNnnnuuuN(5000L)) {
               this.uVUuuVnNVU("§cНаковальня не открылась.");
            }
         }
      }
   }

   private void vvUVNVvvNUv() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (uUnuvNvvNU.field_1724.field_7512 instanceof class_1706 var1) {
            if (uUnuvNvvNU.field_1724.field_7520 < this.VunnVNvNV()) {
               this.VvuUUUNNNv();
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.BUY_XP_SEARCHING;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else if (this.VuunNUUUvu != EmeraldArmorFarm.NVnVnNnN.NONE && this.UuUVuuUu(this.VuunNUUUvu, 5) < 1) {
               int var5 = this.UuUVuuUu(this.VuunNUUUvu, 4) >= 2 ? 4 : 3;
               if (var5 == 3 && this.UuUVuuUu(this.VuunNUUUvu, 3) < 2) {
                  this.VvuUUUNNNv();
                  this.NNUUNUuVNNVn = false;
                  this.uuVuUuuVVNvN();
               } else {
                  for (int var3 = 0; var3 < 2; var3++) {
                     class_1799 var4 = this.C00OOC00oO(var1, var3);
                     if (!var4.method_7960() && !this.UuUVuuUu(var4, this.VuunNUUUvu, var5)) {
                        this.UuUVuuUu(var1, var3);
                        this.UUuUnNVNuuv.UuUVuuUu();
                        return;
                     }
                  }

                  for (int var6 = 0; var6 < 2; var6++) {
                     if (this.C00OOC00oO(var1, var6).method_7960()) {
                        int var7 = this.UuUVuuUu(var1, this.VuunNUUUvu, var5);
                        if (var7 == -1) {
                           this.VvuUUUNNNv();
                           this.NNUUNUuVNNVn = false;
                           this.uuVuUuuVVNvN();
                           return;
                        }

                        this.UuUVuuUu(var1, var7, var6);
                        this.UUuUnNVNuuv.UuUVuuUu();
                        return;
                     }
                  }

                  if (!this.C00OOC00oO(var1, 2).method_7960()) {
                     this.UuUVuuUu(var1, 2);
                     this.VvuUUUNNNv();
                     this.uuVuUuuVVNvN();
                  } else {
                     this.UUuUnNVNuuv.UuUVuuUu();
                  }
               }
            } else {
               this.VvuUUUNNNv();
               this.uuVuUuuVVNvN();
            }
         } else {
            this.uuVuUuuVVNvN();
         }
      }
   }

   private void UuNnnVnuNNV() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         this.VvuUUUNNNv();
         this.uuVuUuuVVNvN();
      }
   }

   private void uUVvnUuNvvN() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (this.UvNNVUVNVuvV) {
            this.NNUUNUuVNNVn();
         } else {
            long var1 = this.nvvnUnUn();
            if (var1 <= 0L) {
               this.uVUuuVnNVU("§cЦена продажи не задана.");
            } else if (!this.NUVvUUVuVNVv()) {
               this.uuVuUuuVVNvN();
            } else if (uUnuvNvvNU.field_1755 != null) {
               this.VvuUUUNNNv();
               this.UUuUnNVNuuv.UuUVuuUu();
            } else if (this.o0Ooc0COOoc()) {
               if (!this.NnunUUnU()) {
                  this.uuVuUuuVVNvN();
               } else {
                  this.UNvvunVVn = false;
                  this.UvNNVUVNVuvV = false;
                  this.UuUVuuUu(var1);
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.WAITING_SELL_RESULT;
                  this.UUuUnNVNuuv.UuUVuuUu();
               }
            }
         }
      }
   }

   private void UUuUnNVNuuv() {
      if (this.UvNNVUVNVuvV) {
         this.NNUUNUuVNNVn();
      } else {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.uUnuvNvvNU(var1)) {
            int var3 = this.C00OOC00oO(var1.method_17577());
            if (var3 != -1 && this.VUuuVUnun.uNNnnnuuuN(Math.max(50L, this.VUUnuVvVu()))) {
               this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
               this.VUuuVUnun.UuUVuuUu();
               this.UUuUnNVNuuv.UuUVuuUu();
               return;
            }
         }

         if (this.UNvvunVVn) {
            this.UNvvunVVn = false;
            this.uUVvnUuNvvN = this.NUVvUUVuVNVv() ? EmeraldArmorFarm.VvunVVUvUNnv.SELLING : EmeraldArmorFarm.VvunVVUvUNnv.IDLE;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else {
            if (this.UUuUnNVNuuv.uNNnnnuuuN(7000L)) {
               this.VvuUUUNNNv();
               this.uUVvnUuNvvN = this.NUVvUUVuVNVv() ? EmeraldArmorFarm.VvunVVUvUNnv.SELLING : EmeraldArmorFarm.VvunVVUvUNnv.IDLE;
               this.UUuUnNVNuuv.UuUVuuUu();
            }
         }
      }
   }

   private void NVuNUuVnVUN() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(this.VUUnuVvVu()) && uUnuvNvvNU.field_1755 == null) {
         if (!this.NnunUUnU && this.NUVvUUVuVNVv()) {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SELLING;
            this.UUuUnNVNuuv.UuUVuuUu();
         } else {
            this.NnunUUnU = false;
            String var1 = uUnuvNvvNU.field_1724.method_5477().getString();
            this.VVuuUN(var1);
            this.OCOocoOoOO = 0;
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_WAITING_OWN_AH;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void NVuunNnvvvVu() {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.uNNnnnuuuN(var1)) {
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_TAKE_ITEM;
         this.UUuUnNVNuuv.UuUVuuUu();
      } else {
         if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
            this.uVUuuVnNVU("§cТаймаут поиска своих товаров.");
         }
      }
   }

   private void vNnNuuvVn() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(200L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (!this.uNNnnnuuuN(var1)) {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(10000L)) {
                  this.VvuUUUNNNv();
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SEARCH_OWN_AH;
                  this.UUuUnNVNuuv.UuUVuuUu();
               }
            } else {
               int var3 = this.UuUVuuUu(var1);
               if (var3 != -1) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7794);
                  this.OCOocoOoOO = 0;
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else if (this.OCOocoOoOO++ < 2) {
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else {
                  this.VvuUUUNNNv();
                  if (this.NUVvUUVuVNVv()) {
                     this.NnVnNVN = 0;
                     this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SELLING;
                  } else {
                     this.UvNNVUVNVuvV = false;
                     this.NnVnNVN = 0;
                     this.uuVuUuuVVNvN();
                  }

                  this.UUuUnNVNuuv.UuUVuuUu();
               }
            }
         } else {
            this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SEARCH_OWN_AH;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void VUuuVUnun() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(300L)) {
         this.VvuUUUNNNv();
         this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SELLING;
         this.UUuUnNVNuuv.UuUVuuUu();
      }
   }

   private void vVVuuVVv() {
      if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
         if (this.UvNNVUVNVuvV) {
            this.NNUUNUuVNNVn();
         } else {
            long var1 = this.nvvnUnUn();
            if (var1 <= 0L) {
               this.uVUuuVnNVU("§cЦена продажи не задана.");
            } else if (!this.NUVvUUVuVNVv()) {
               this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SEARCH_OWN_AH;
               this.UUuUnNVNuuv.UuUVuuUu();
            } else if (uUnuvNvvNU.field_1755 != null) {
               this.VvuUUUNNNv();
               this.UUuUnNVNuuv.UuUVuuUu();
            } else if (this.o0Ooc0COOoc()) {
               if (!this.NnunUUnU()) {
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SEARCH_OWN_AH;
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else {
                  this.UNvvunVVn = false;
                  this.UvNNVUVNVuvV = false;
                  this.UuUVuuUu(var1);
                  this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_WAIT_SELL_RESULT;
                  this.UUuUnNVNuuv.UuUVuuUu();
               }
            }
         }
      }
   }

   private void VuunNUUUvu() {
      if (this.UnvuVuVnNuvu) {
         this.UnvuVuVnNuvu = false;
      }

      if (this.UvNNVUVNVuvV) {
         this.NNUUNUuVNNVn();
      } else if (this.UNvvunVVn) {
         this.UNvvunVVn = false;
         this.uuVuUuuVVNvN();
      } else {
         if (this.UUuUnNVNuuv.uNNnnnuuuN(7000L)) {
            this.VvuUUUNNNv();
            this.uUVvnUuNvvN = this.NUVvUUVuVNVv() ? EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SELLING : EmeraldArmorFarm.VvunVVUvUNnv.IDLE;
            this.UUuUnNVNuuv.UuUVuuUu();
         }
      }
   }

   private void NNUUNUuVNNVn() {
      this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.RESALE_SEARCH_OWN_AH;
      this.UvNNVUVNVuvV = false;
      this.UNvvunVVn = false;
      this.NnunUUnU = true;
      this.NnVnNVN = 0;
      this.UUuUnNVNuuv.UuUVuuUu();
   }

   private int[] UuUVuuUu(EmeraldArmorFarm.NVnVnNnN var1) {
      switch (var1) {
         case HELMET:
            return new int[]{1, 2, 3, 4, 6};
         case CHESTPLATE:
            return new int[]{1, 3, 4, 5, 6, 7, 8, 9};
         case LEGGINGS:
            return new int[]{1, 2, 3, 4, 6, 7, 9};
         case BOOTS:
            return new int[]{4, 6, 7, 9};
         default:
            return new int[0];
      }
   }

   private EmeraldArmorFarm.NVnVnNnN VvVvnNUnvuvV() {
      EmeraldArmorFarm.NVnVnNnN[] var1 = new EmeraldArmorFarm.NVnVnNnN[]{
         EmeraldArmorFarm.NVnVnNnN.HELMET, EmeraldArmorFarm.NVnVnNnN.CHESTPLATE, EmeraldArmorFarm.NVnVnNnN.LEGGINGS, EmeraldArmorFarm.NVnVnNnN.BOOTS
      };

      for (EmeraldArmorFarm.NVnVnNnN var5 : var1) {
         if (this.UuUVuuUu(var5, 5) < 1) {
            return var5;
         }
      }

      return EmeraldArmorFarm.NVnVnNnN.NONE;
   }

   private boolean ccOO0COcoco0() {
      return this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.HELMET, 5) >= 1
         && this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.CHESTPLATE, 5) >= 1
         && this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.LEGGINGS, 5) >= 1
         && this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.BOOTS, 5) >= 1;
   }

   private boolean NUVvUUVuVNVv() {
      return this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.HELMET, 5)
            + this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.CHESTPLATE, 5)
            + this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.LEGGINGS, 5)
            + this.UuUVuuUu(EmeraldArmorFarm.NVnVnNnN.BOOTS, 5)
         > 0;
   }

   private int UuUVuuUu(EmeraldArmorFarm.NVnVnNnN var1, int var2) {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < 36; var4++) {
            class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
            if (this.UuUVuuUu(var5) == var1 && this.C00OOC00oO(var5) == var2) {
               var3 += Math.max(1, var5.method_7947());
            }
         }

         return var3;
      }
   }

   private EmeraldArmorFarm.NVnVnNnN UuUVuuUu(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         String var2 = this.vuuuNvNuv(var1.method_7964().getString());
         if (var2.contains("шлем") || var2.contains("каск")) {
            return EmeraldArmorFarm.NVnVnNnN.HELMET;
         } else if (var2.contains("нагрудн") || var2.contains("кирас") || var2.contains("честплейт")) {
            return EmeraldArmorFarm.NVnVnNnN.CHESTPLATE;
         } else if (var2.contains("понож") || var2.contains("леггинс") || var2.contains("штаны")) {
            return EmeraldArmorFarm.NVnVnNnN.LEGGINGS;
         } else if (var2.contains("ботин") || var2.contains("сапог")) {
            return EmeraldArmorFarm.NVnVnNnN.BOOTS;
         } else if (var1.method_31574(class_1802.field_8805)) {
            return EmeraldArmorFarm.NVnVnNnN.HELMET;
         } else if (var1.method_31574(class_1802.field_8058)) {
            return EmeraldArmorFarm.NVnVnNnN.CHESTPLATE;
         } else if (var1.method_31574(class_1802.field_8348)) {
            return EmeraldArmorFarm.NVnVnNnN.LEGGINGS;
         } else {
            return var1.method_31574(class_1802.field_8285) ? EmeraldArmorFarm.NVnVnNnN.BOOTS : EmeraldArmorFarm.NVnVnNnN.NONE;
         }
      } else {
         return EmeraldArmorFarm.NVnVnNnN.NONE;
      }
   }

   private int C00OOC00oO(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         String var2 = this.vuuuNvNuv(var1.method_7964().getString());
         class_9290 var3 = (class_9290)var1.method_58694(class_9334.field_49632);
         if (var3 != null) {
            for (class_2561 var5 : var3.comp_2400()) {
               var2 = var2 + " " + this.vuuuNvNuv(var5.getString());
            }
         }

         Matcher var7 = VVnVNnunVvu.matcher(var2);
         int var8 = 0;

         while (var7.find()) {
            int var6 = this.C00OOC00oO(var7.group(1));
            if (var6 > var8) {
               var8 = var6;
            }
         }

         return var8;
      } else {
         return 0;
      }
   }

   private int C00OOC00oO(String var1) {
      String var2 = var1.trim().toLowerCase(Locale.ROOT);
      if (var2.matches("\\d+")) {
         try {
            return Math.max(0, Math.min(10, Integer.parseInt(var2)));
         } catch (NumberFormatException var5) {
            return 0;
         }
      } else {
         switch (var2) {
            case "i":
               return 1;
            case "ii":
               return 2;
            case "iii":
               return 3;
            case "iv":
               return 4;
            case "v":
               return 5;
            case "vi":
               return 6;
            case "vii":
               return 7;
            case "viii":
               return 8;
            case "ix":
               return 9;
            case "x":
               return 10;
            default:
               return 0;
         }
      }
   }

   private boolean UuUVuuUu(class_1799 var1, EmeraldArmorFarm.NVnVnNnN var2, int var3) {
      if (var1 != null && !var1.method_7960()) {
         return this.UuUVuuUu(var1) != var2 ? false : this.C00OOC00oO(var1) == var3;
      } else {
         return false;
      }
   }

   private int UuUVuuUu(class_1706 var1, EmeraldArmorFarm.NVnVnNnN var2, int var3) {
      for (int var4 = 3; var4 < var1.field_7761.size(); var4++) {
         class_1799 var5 = var1.method_7611(var4).method_7677();
         if (this.UuUVuuUu(var5, var2, var3)) {
            return var4;
         }
      }

      return -1;
   }

   private int nNuVunNUVu() {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (this.uUnuvNvvNU(var3)) {
               var1 += Math.max(1, var3.method_7947());
            }
         }

         return var1;
      }
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      if (var1 == null || var1.method_7960()) {
         return false;
      } else if (!var1.method_31574(class_1802.field_8287)) {
         return false;
      } else {
         String var2 = this.vuuuNvNuv(var1.method_7964().getString());
         class_9290 var3 = (class_9290)var1.method_58694(class_9334.field_49632);
         if (var3 != null) {
            for (class_2561 var5 : var3.comp_2400()) {
               var2 = var2 + " " + this.vuuuNvNuv(var5.getString());
            }
         }

         int var6 = this.nnvuvUNuUnN();
         return var2.contains("опыт с уровнем " + var6) || var2.contains(var6 + " ур");
      }
   }

   private boolean UNvvunVVn() {
      if (uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8287)) {
         return true;
      } else {
         int var1 = this.UnvuVuVnNuvu();
         if (var1 == -1) {
            return false;
         } else if (var1 >= 0 && var1 <= 8) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            return true;
         } else {
            int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1, var2, class_1713.field_7791, uUnuvNvvNU.field_1724);
            return true;
         }
      }
   }

   private int UnvuVuVnNuvu() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
            if (this.uUnuvNvvNU(var2)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private void UvNNVUVNVuvV() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_36457(0.0F);
      }
   }

   private boolean NnunUUnU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.field_7498 != null) {
         if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
            return true;
         } else {
            for (int var1 = 0; var1 < 9; var1++) {
               if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
                  return true;
               }
            }

            int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532();

            for (int var2 = 9; var2 < 36; var2++) {
               if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_31548().method_5438(var2))) {
                  uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, var3, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean vVvUvVVuuNvV(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         EmeraldArmorFarm.NVnVnNnN var2 = this.UuUVuuUu(var1);
         return var2 == EmeraldArmorFarm.NVnVnNnN.NONE ? false : this.C00OOC00oO(var1) == 5;
      } else {
         return false;
      }
   }

   private int UuUVuuUu(class_476 var1) {
      int var2 = this.vVvUvVVuuNvV(var1);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (this.UuUVuuUu(var4) && this.vVvUvVVuuNvV(var4.method_7677())) {
            return var3;
         }
      }

      return -1;
   }

   private void UuUVuuUu(class_1714 var1, int var2, class_1792 var3, int var4) {
      if (!var1.method_7611(var4).method_7681()) {
         int var5 = -1;

         for (int var6 = 10; var6 < var1.field_7761.size(); var6++) {
            class_1735 var7 = var1.method_7611(var6);
            if (var7.method_7681() && var7.method_7677().method_31574(var3)) {
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

   private void UuUVuuUu(class_1706 var1, int var2) {
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
   }

   private void UuUVuuUu(class_1706 var1, int var2, int var3) {
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
   }

   private class_1799 C00OOC00oO(class_1706 var1, int var2) {
      return var1 != null && var2 >= 0 && var2 < var1.field_7761.size() ? var1.method_7611(var2).method_7677() : class_1799.field_8037;
   }

   private boolean nvuVvuNnNUnv() {
      return this.UuUVuuUu(class_1802.field_8687) < this.NnuUnUNnu();
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

   private int C00OOC00oO(class_476 var1) {
      int var2 = this.vVvUvVVuuNvV(var1);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (var4.method_7681()) {
            class_1799 var5 = var4.method_7677();
            String var6 = this.vuuuNvNuv(var5.method_7964().getString());
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
      int var3 = this.vVvUvVVuuNvV(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (var5.method_7681() && var5.method_7677().method_31574(var2)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean uUnuvNvvNU(class_476 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.vuuuNvNuv(var1.method_25440().getString());
         if (var2.contains("подтверждение покупки")) {
            return this.C00OOC00oO(var1.method_17577()) != -1;
         } else {
            class_1703 var3 = var1.method_17577();
            return this.C00OOC00oO(var3) != -1 && this.uUnuvNvvNU(var3);
         }
      }
   }

   private int C00OOC00oO(class_1703 var1) {
      int var2 = Math.min(var1.field_7761.size(), Math.max(0, var1.field_7761.size() - 36));

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         String var5 = this.vuuuNvNuv(var4.method_7964().getString());
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

   private boolean uUnuvNvvNU(class_1703 var1) {
      int var2 = Math.min(var1.field_7761.size(), Math.max(0, var1.field_7761.size() - 36));

      for (int var3 = 0; var3 < var2; var3++) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         if (var4.method_31574(class_1802.field_8879) || var4.method_31574(class_1802.field_8197)) {
            return true;
         }
      }

      return false;
   }

   private void UuUVuuUu(class_476 var1, int var2, int var3, class_1713 var4) {
      uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2, var3, var4, uUnuvNvvNU.field_1724);
   }

   private int vVvUvVVuuNvV(class_476 var1) {
      int var2 = ((class_1707)var1.method_17577()).method_17388();
      int var3 = ((class_1707)var1.method_17577()).field_7761.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private boolean UuUVuuUu(class_1735 var1) {
      return var1 != null && var1.method_7681() ? !this.uNNnnnuuuN(var1.method_7677()) : false;
   }

   private boolean uNNnnnuuuN(class_1799 var1) {
      return var1.method_31574(class_1802.field_8656)
         || var1.method_31574(class_1802.field_8157)
         || var1.method_31574(class_1802.field_8581)
         || var1.method_31574(class_1802.field_8879)
         || var1.method_31574(class_1802.field_8162);
   }

   private long C00OOC00oO(class_1735 var1) {
      return this.NuunnvnN.C00OOC00oO("SpookyTime") ? NunUnvNuvNUU.C00OOC00oO(var1) : UNuvuNVuUnVu.C00OOC00oO(var1);
   }

   private String uUnuvNvvNU(class_1735 var1) {
      return this.NuunnvnN.C00OOC00oO("SpookyTime") ? NunUnvNuvNUU.UuUVuuUu(var1) : UNuvuNVuUnVu.UuUVuuUu(var1);
   }

   private boolean uUnuvNvvNU(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.uNNnnnuuuN(var1).toLowerCase(Locale.ROOT);
         return var2.contains("выстав") && var2.contains("продаж");
      }
   }

   private boolean vVvUvVVuuNvV(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.uNNnnnuuuN(var1).toLowerCase(Locale.ROOT);
         return var2.contains("у вас купили") && (var2.contains("изумруд") || var2.contains(" на /ah") || var2.contains(" за "));
      }
   }

   private String uNNnnnuuuN(String var1) {
      return var1 == null ? "" : var1.replaceAll("§.", "").replace(' ', ' ').trim();
   }

   private boolean NnVnNVN() {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         double var1 = this.unnUnUNVnN();
         if (var1 <= 0.0) {
            return false;
         } else {
            double var3 = var1 * var1;

            for (class_1657 var6 : uUnuvNvvNU.field_1687.method_18456()) {
               if (var6 != null && var6 != uUnuvNvvNU.field_1724 && !var6.method_31481() && uUnuvNvvNU.field_1724.method_5858(var6) <= var3) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private class_2338 vnvvNvUnVv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
         ArrayList var2 = new ArrayList();

         for (class_2338 var4 : class_2338.method_10097(var1.method_10069(-5, -5, -5), var1.method_10069(5, 5, 5))) {
            class_2338 var5 = var4.method_10062();
            if (this.UuUVuuUu(var5) && !(uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var5)) > 25.0)) {
               var2.add(var5);
            }
         }

         return var2.isEmpty() ? null : (class_2338)var2.get(ThreadLocalRandom.current().nextInt(var2.size()));
      } else {
         return null;
      }
   }

   private boolean UuUVuuUu(class_2338 var1) {
      return uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1687.method_8320(var1).method_27852(class_2246.field_9980);
   }

   private class_2338 OCOocoOoOO() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
         class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
         class_2338 var3 = null;
         double var4 = Double.MAX_VALUE;

         for (int var6 = -6; var6 <= 6; var6++) {
            for (int var7 = -2; var7 <= 2; var7++) {
               for (int var8 = -6; var8 <= 6; var8++) {
                  class_2338 var9 = var1.method_10069(var6, var7, var8);
                  if (this.C00OOC00oO(var9)) {
                     class_243 var10 = new class_243(var9.method_10263() + 0.5, var9.method_10264() + 0.9, var9.method_10260() + 0.5);
                     double var11 = var2.method_1025(var10);
                     if (var11 < var4) {
                        var4 = var11;
                        var3 = var9.method_10062();
                     }
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private boolean C00OOC00oO(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2248 var2 = uUnuvNvvNU.field_1687.method_8320(var1).method_26204();
         return var2 == class_2246.field_10535 || var2 == class_2246.field_10105 || var2 == class_2246.field_10414;
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

   private void nuUnNvnuUu(String var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null && !var1.isBlank()) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah search " + var1.trim());
      }
   }

   private void VVuuUN(String var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null && !var1.isBlank()) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah " + var1.trim());
      }
   }

   private boolean uNNnnnuuuN(class_476 var1) {
      if (var1 != null && uUnuvNvvNU.field_1724 != null) {
         String var2 = this.vuuuNvNuv(var1.method_25440().getString());
         String var3 = this.vuuuNvNuv(uUnuvNvvNU.field_1724.method_5477().getString());
         return AhHelper.UuUVuuUu(var1) || var2.contains(var3) || var2.contains("мои товары") || var2.contains("мои предметы") || var2.contains("поиск:");
      } else {
         return false;
      }
   }

   private boolean o0Ooc0COOoc() {
      return System.currentTimeMillis() - this.o0Ooc0COOoc >= 1500L;
   }

   private void UuUVuuUu(long var1) {
      uUnuvNvvNU.field_1724.field_3944.method_45730("ah sell " + var1);
      this.o0Ooc0COOoc = System.currentTimeMillis();
   }

   private long nvvnUnUn() {
      return this.vNUvnnVnUvu(this.NVUunUNUN.uUnuvNvvNU());
   }

   private long UnUUVuVunvVu() {
      return this.vNUvnnVnUvu(this.UUVNuUNUvUnV.uUnuvNvvNU());
   }

   private int nnvuvUNuUnN() {
      String var1 = this.vuvnUnVnUNnV.uUnuvNvvNU().replaceAll("[^0-9]", "");

      try {
         return Math.max(1, Integer.parseInt(var1));
      } catch (NumberFormatException var3) {
         return 45;
      }
   }

   private String UVnuVUUVnnU() {
      return "Опыт с уровнем " + this.nnvuvUNuUnN();
   }

   private int VunnVNvNV() {
      return Math.max(1, Math.round(this.nnuUVNUuvvVU.uUnuvNvvNU()));
   }

   private int NvUVUvVVnUu() {
      return Math.max(1, Math.round(this.nVVUuvuNnUN.uUnuvNvvNU()));
   }

   private int unnUnUNVnN() {
      return Math.max(0, Math.round(this.nNnVnUNVV.uUnuvNvvNU()));
   }

   private int NnuUnUNnu() {
      return Math.max(1, Math.round(this.vvUVNVvvNUv.uUnuvNvvNU()));
   }

   private long UnnnvvU() {
      return Math.max(1000L, Math.round(this.nuunNvv.uUnuvNvvNU() * 1000.0));
   }

   private long VUUnuVvVu() {
      return Math.max(50L, (long)Math.round(this.uUVVvVVNvvn.uUnuvNvvNU()));
   }

   private long vNUvnnVnUvu(String var1) {
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

   private void VvVuvUvvNNVv() {
      if (this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.AIMING_CRAFTING_TABLE
         && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.OPENING_CRAFTING_TABLE
         && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.AIMING_ANVIL
         && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.OPENING_ANVIL) {
         if (this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.THROW_XP_THROWING && this.uUVvnUuNvvN != EmeraldArmorFarm.VvunVVUvUNnv.THROW_XP_WAIT_PLAYERS) {
            if (this.NVuNUuVnVUN.uNNnnnuuuN(10000L)) {
               ThreadLocalRandom var1 = ThreadLocalRandom.current();
               float var2 = var1.nextFloat() * 10.0F - 5.0F;
               float var3 = var1.nextFloat() * 6.0F - 3.0F;
               uUnuvNvvNU.field_1724.method_36456(uUnuvNvvNU.field_1724.method_36454() + var2);
               uUnuvNvvNU.field_1724.method_36457(Math.max(-90.0F, Math.min(90.0F, uUnuvNvvNU.field_1724.method_36455() + var3)));
               this.NVuNUuVnVUN.UuUVuuUu();
            }
         }
      }
   }

   private void UnnNNvuvvUU() {
      if (uUnuvNvvNU.field_1724 != null) {
         class_243 var1 = null;
         if ((this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.AIMING_CRAFTING_TABLE || this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.OPENING_CRAFTING_TABLE)
            && this.VvVvnNUnvuvV != null) {
            var1 = class_243.method_24953(this.VvVvnNUnvuvV);
         } else if ((this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.AIMING_ANVIL || this.uUVvnUuNvvN == EmeraldArmorFarm.VvunVVUvUNnv.OPENING_ANVIL)
            && this.ccOO0COcoco0 != null) {
            var1 = class_243.method_24953(this.ccOO0COcoco0);
         }

         if (var1 == null) {
            this.UnUUVuVunvVu = 0L;
         } else {
            this.UuUVuuUu(var1);
         }
      }
   }

   private void UuUVuuUu(class_243 var1) {
      EmeraldArmorFarm.nvnNNunvv var2 = this.C00OOC00oO(var1);
      float var3 = this.VNNnnVUuvv();
      float var4 = 0.11F;
      float var5 = 1.0F - (float)Math.pow(1.0F - var4, var3);
      float var6 = uUnuvNvvNU.field_1724.method_36454();
      float var7 = uUnuvNvvNU.field_1724.method_36455();
      float var8 = class_3532.method_15393(var2.yaw - var6);
      float var9 = var2.pitch - var7;
      float var10 = var6 + var8 * var5;
      float var11 = class_3532.method_15363(var7 + var9 * var5, -90.0F, 90.0F);
      uUnuvNvvNU.field_1724.method_36456(var10);
      uUnuvNvvNU.field_1724.method_36457(var11);
      uUnuvNvvNU.field_1724.field_6241 = var10;
      uUnuvNvvNU.field_1724.field_6283 = var10;
   }

   private EmeraldArmorFarm.nvnNNunvv C00OOC00oO(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
      return new EmeraldArmorFarm.nvnNNunvv(var9, class_3532.method_15363(var10, -90.0F, 90.0F));
   }

   private float VNNnnVUuvv() {
      long var1 = System.nanoTime();
      if (this.UnUUVuVunvVu == 0L) {
         this.UnUUVuVunvVu = var1;
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.UnUUVuVunvVu) / 1.6666667E7F;
         this.UnUUVuVunvVu = var1;
         return class_3532.method_15363(var3, 0.25F, 4.0F);
      }
   }

   private class_2350 uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_19538();
      class_243 var3 = class_243.method_24953(var1);
      double var4 = var2.field_1352 - var3.field_1352;
      double var6 = var2.field_1350 - var3.field_1350;
      if (Math.abs(var4) > Math.abs(var6)) {
         return var4 > 0.0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return var6 > 0.0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   private float UuUVuuUu(float var1, float var2) {
      return var1 + (var2 - var1) * ThreadLocalRandom.current().nextFloat();
   }

   private void vUvUvUNNuNvn() {
      this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.IDLE;
      this.VuunNUUUvu = EmeraldArmorFarm.NVnVnNnN.NONE;
      this.NNUUNUuVNNVn = false;
      this.VvVvnNUnvuvV = null;
      this.ccOO0COcoco0 = null;
      this.NUVvUUVuVNVv = 0;
      this.nNuVunNUVu = 0;
      this.UNvvunVVn = false;
      this.UnvuVuVnNuvu = false;
      this.UvNNVUVNVuvV = false;
      this.NnunUUnU = false;
      this.nvuVvuNnNUnv = false;
      this.NnVnNVN = 0;
      this.vnvvNvUnVv = 0;
      this.OCOocoOoOO = 0;
      this.o0Ooc0COOoc = 0L;
      this.nvvnUnUn = 0L;
      this.UnUUVuVunvVu = 0L;
      this.nnvuvUNuUnN = 50;
      this.UUuUnNVNuuv.UuUVuuUu();
      this.NVuNUuVnVUN.UuUVuuUu();
      this.NVuunNnvvvVu.UuUVuuUu();
      this.vNnNuuvVn.UuUVuuUu();
      this.VUuuVUnun.UuUVuuUu();
      this.vVVuuVVv.UuUVuuUu();
   }

   private void uVUuuVnNVU(String var1) {
      this.nvUVNnuu(var1);
      this.uuVuUuuVVNvN();
   }

   private void uuVuUuuVVNvN() {
      this.uUVvnUuNvvN = EmeraldArmorFarm.VvunVVUvUNnv.IDLE;
      this.nNuVunNUVu = 0;
      this.UUuUnNVNuuv.UuUVuuUu();
   }

   private void VvuUUUNNNv() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }
   }

   private boolean C00OOC00oO(long var1) {
      if (uUnuvNvvNU.field_1755 == null) {
         this.nNuVunNUVu = 0;
         return true;
      } else if (!this.UUuUnNVNuuv.uNNnnnuuuN(var1)) {
         return false;
      } else {
         this.VvuUUUNNNv();
         this.nNuVunNUVu++;
         if (this.nNuVunNUVu >= 20) {
            uUnuvNvvNU.method_1507(null);
            this.nNuVunNUVu = 0;
            return true;
         } else {
            this.UUuUnNVNuuv.UuUVuuUu();
            return false;
         }
      }
   }

   private String vuuuNvNuv(String var1) {
      return var1 == null ? "" : var1.replaceAll("(?i)§.", "").replaceAll("(?i)&.", "").toLowerCase(Locale.ROOT).trim();
   }

   private void nvUVNnuu(String var1) {
      if (this.UuNnnVnuNNV.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null) {
         vVnvuVVUunuv.UuUVuuUu("§8[§aEmeraldArmorFarm§8] §f" + var1);
      }
   }

   static enum NVnVnNnN {
      HELMET,
      CHESTPLATE,
      LEGGINGS,
      BOOTS,
      NONE;
   }

   static enum VvunVVUvUNnv {
      IDLE,
      BUY_OPENING_SHOP,
      BUY_WAITING_SHOP,
      BUY_FIND_GOLD_INGOT,
      BUY_WAITING_EMERALD_MENU,
      BUY_FIND_EMERALD,
      BUY_WAITING_CONFIRM,
      BUY_CLICK_LIME_PANE,
      BUY_CLOSING_SHOP,
      BUY_XP_SEARCHING,
      BUY_XP_WAITING_AUCTION,
      BUY_XP_READING_AUCTION,
      BUY_XP_WAITING_CONFIRM,
      BUY_XP_CONFIRMING,
      BUY_XP_CLOSING,
      THROW_XP_WAIT_PLAYERS,
      THROW_XP_THROWING,
      FINDING_CRAFTING_TABLE,
      AIMING_CRAFTING_TABLE,
      OPENING_CRAFTING_TABLE,
      PLACING_ITEMS,
      TAKING_RESULT,
      CLOSING_CRAFTING,
      FINDING_ANVIL,
      AIMING_ANVIL,
      OPENING_ANVIL,
      HANDLING_ANVIL,
      CLOSING_ANVIL,
      SELLING,
      WAITING_SELL_RESULT,
      RESALE_SEARCH_OWN_AH,
      RESALE_WAITING_OWN_AH,
      RESALE_TAKE_ITEM,
      RESALE_CLOSING,
      RESALE_SELLING,
      RESALE_WAIT_SELL_RESULT;
   }

   record nvnNNunvv(float yaw, float pitch) {
   }
}
