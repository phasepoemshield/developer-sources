package ru.metaculture.protection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_476;
import net.minecraft.class_7439;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoResell",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически перевыставляет товары"
)
public class AutoResell extends Module {
   public static AutoResell NVNnnvnuunNv;
   private final VuNvNNvVV UNnVVNvvnVvU = new VuNvNNvVV();
   private final VuNvNNvVV uNnUnnuNUnNu = new VuNvNNvVV();
   private final VuNvNNvVV NnUuNNU = new VuNvNNvVV();
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим", "Стандарт", "Стандарт", "Князь");
   private final VuNvNNvVV nNvNUVU = new VuNvNNvVV();
   private static final long UnUNuUU = 900L;
   private static final long uUVuVvuNUvnu = 9000L;
   private static final long UvUvUNuvNU = 12000L;
   private final Pattern c0oOOCcCoC0 = Pattern.compile("Подождите (\\d+) сек");
   private AutoResell.NVnVnNnN VVnVNnunVvu = AutoResell.NVnVnNnN.WAITING;
   private long unNNVVNnvvV = 0L;

   public AutoResell() {
      NVNnnvnuunNv = this;
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.VVnVNnunVvu = AutoResell.NVnVnNnN.WAITING;
      this.UNnVVNvvnVvU.UuUVuuUu();
      this.uNnUnnuNUnNu.UuUVuuUu();
      this.NnUuNNU.UuUVuuUu();
      this.nNvNUVU.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      NVUUNNv.C00OOC00oO(false);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (this.uVunuUNVVUUV.C00OOC00oO("Князь")) {
            if (this.nNvNUVU.uNNnnnuuuN(60000L)) {
               uUnuvNvvNU.field_1724.field_3944.method_45730("ah resell");
               this.nNvNUVU.UuUVuuUu();
            }
         } else {
            switch (this.VVnVNnunVvu) {
               case WAITING:
                  if (this.UNnVVNvvnVvU.uNNnnnuuuN(60000L) && NVUUNNv.uVUuuVnNVU()) {
                     this.UuuNnUvUuv();
                  }
                  break;
               case OPENING_MAIN_AH:
                  if (this.vNVuvnUUnuUn()) {
                     if (this.uNnUnnuNUnNu.uNNnnnuuuN(200L)) {
                        this.UuUVuuUu(AutoResell.NVnVnNnN.CLICKING_STORAGE);
                     }
                  } else {
                     if (this.uVUVnuvnuVuv() && this.NnUuNNU.uNNnnnuuuN(900L)) {
                        this.UnUNVVVNuv();
                        this.NnUuNNU.UuUVuuUu();
                     }

                     if (this.uNnUnnuNUnNu.uNNnnnuuuN(this.uVUVnuvnuVuv() ? 9000L : 5000L)) {
                        vVnvuVVUunuv.UuUVuuUu("§c[AutoResell] §fМеню аукциона не открылось.");
                        this.nUUVuvU();
                     }
                  }
                  break;
               case CLICKING_STORAGE:
                  if (this.vNVuvnUUnuUn() && uUnuvNvvNU.field_1755 instanceof class_476 var6) {
                     if (this.UuUVuuUu(var6)) {
                        this.UuUVuuUu(AutoResell.NVnVnNnN.OPENING_STORAGE);
                     } else if (!this.uVUVnuvnuVuv() || this.uNnUnnuNUnNu.uNNnnnuuuN(3000L)) {
                        vVnvuVVUunuv.UuUVuuUu("§c[AutoResell] §fКнопка 'Хранилище' не найдена.");
                        this.nUUVuvU();
                     }
                     break;
                  }

                  this.nUUVuvU();
                  break;
               case OPENING_STORAGE:
                  if (this.UvnvNVnnnnNU()) {
                     if (this.uNnUnnuNUnNu.uNNnnnuuuN(200L)) {
                        this.UuUVuuUu(AutoResell.NVnVnNnN.CLICKING_CLOCK);
                     }
                  } else {
                     if (this.uVUVnuvnuVuv() && this.vNVuvnUUnuUn() && uUnuvNvvNU.field_1755 instanceof class_476 var5 && this.NnUuNNU.uNNnnnuuuN(900L)) {
                        this.UuUVuuUu(var5);
                        this.NnUuNNU.UuUVuuUu();
                     }

                     if (this.uNnUnnuNUnNu.uNNnnnuuuN(this.uVUVnuvnuVuv() ? 9000L : 5000L)) {
                        vVnvuVVUunuv.UuUVuuUu("§c[AutoResell] §fХранилище не открылось.");
                        this.nUUVuvU();
                     }
                  }
                  break;
               case CLICKING_CLOCK:
                  if (this.UvnvNVnnnnNU() && uUnuvNvvNU.field_1755 instanceof class_476 var4) {
                     if (this.C00OOC00oO(var4)) {
                        vVnvuVVUunuv.UuUVuuUu("§d[AutoResell] §fПеревыставляем предметы...");
                        this.UuUVuuUu(AutoResell.NVnVnNnN.WAITING_RESULT);
                     } else if (!this.uVUVnuvnuVuv() || this.uNnUnnuNUnNu.uNNnnnuuuN(3500L)) {
                        NVUUNNv.UnUNVVVNuv();
                        this.nUUVuvU();
                     }
                     break;
                  }

                  this.nUUVuvU();
                  break;
               case WAITING_RESULT:
                  if (this.uVUVnuvnuVuv() && this.UvnvNVnnnnNU() && uUnuvNvvNU.field_1755 instanceof class_476 var2 && this.NnUuNNU.uNNnnnuuuN(900L)) {
                     this.C00OOC00oO(var2);
                     this.NnUuNNU.UuUVuuUu();
                  }

                  if (this.uNnUnnuNUnNu.uNNnnnuuuN(this.uVUVnuvnuVuv() ? 12000L : 10000L)) {
                     vVnvuVVUunuv.UuUVuuUu("§e[AutoResell] §fНет ответа от аукциона, возвращаю AutoBuy.");
                     this.nUUVuvU();
                  }
                  break;
               case COOLDOWN_WAIT:
                  if (this.UNnVVNvvnVvU.uNNnnnuuuN(this.unNNVVNnvvV) && NVUUNNv.uVUuuVnNVU()) {
                     vVnvuVVUunuv.UuUVuuUu("§d[AutoResell] §fПовторная попытка после ожидания...");
                     this.UuuNnUvUuv();
                  }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.UvnvNVnnnnNU()) {
         this.UuUVuuUu(AutoResell.NVnVnNnN.CLICKING_CLOCK);
      } else if (this.vNVuvnUUnuUn()) {
         this.UuUVuuUu(AutoResell.NVnVnNnN.CLICKING_STORAGE);
      } else if (uUnuvNvvNU.field_1724 != null) {
         this.UnUNVVVNuv();
         this.UuUVuuUu(AutoResell.NVnVnNnN.OPENING_MAIN_AH);
      }
   }

   private void nUUVuvU() {
      this.VVnVNnunVvu = AutoResell.NVnVnNnN.WAITING;
      this.UNnVVNvvnVvU.UuUVuuUu();
      this.uNnUnnuNUnNu.UuUVuuUu();
      this.NnUuNNU.UuUVuuUu();
      NVUUNNv.C00OOC00oO(true);
   }

   private void UuUVuuUu(AutoResell.NVnVnNnN var1) {
      this.VVnVNnunVvu = var1;
      this.uNnUnnuNUnNu.UuUVuuUu();
      this.NnUuNNU.UuUVuuUu();
   }

   private void UnUNVVVNuv() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah");
      }
   }

   private boolean vNVuvnUUnuUn() {
      if (!(uUnuvNvvNU.field_1755 instanceof class_476 var1)) {
         return false;
      } else {
         String var3 = var1.method_25440().getString();
         return var3 != null && (var3.contains("Аукцион") || var3.contains("Auction"));
      }
   }

   private boolean UvnvNVnnnnNU() {
      if (!(uUnuvNvvNU.field_1755 instanceof class_476 var1)) {
         return false;
      } else {
         String var3 = var1.method_25440().getString();
         return var3 != null && var3.contains("Хранилище");
      }
   }

   private boolean UuUVuuUu(class_476 var1) {
      int var2 = this.UuUVuuUu(var1, class_1802.field_8466);
      if (var2 == -1) {
         return false;
      } else {
         uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         return true;
      }
   }

   private boolean C00OOC00oO(class_476 var1) {
      int var2 = this.UuUVuuUu(var1, class_1802.field_8557);
      if (var2 == -1) {
         return false;
      } else {
         uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         return true;
      }
   }

   private boolean uVUVnuvnuVuv() {
      return AutoBuy.NVNnnvnuunNv != null && AutoBuy.NVNnnvnuunNv.NnUuNNU.C00OOC00oO("FunTime");
   }

   private int UuUVuuUu(class_476 var1, class_1792 var2) {
      if (var1 != null && var1.method_17577() != null) {
         for (class_1735 var4 : ((class_1707)var1.method_17577()).field_7761) {
            if (var4.field_7874 < ((class_1707)var1.method_17577()).field_7761.size() - 36 && var4.method_7681() && var4.method_7677().method_7909() == var2) {
               return var4.field_7874;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var7 = var2.comp_763().getString();
         if (!var7.contains("Предметы успешно перевыставлены") && (!var7.contains("[✔]") || !var7.contains("перевыставлены"))) {
            if (this.uVUVnuvnuVuv() && var7.contains("В хранилище отсутствуют предметы для перевыставления")) {
               NVUUNNv.UnUNVVVNuv();
               vVnvuVVUunuv.UuUVuuUu("§e[AutoResell] §fХранилище пустое, возвращаю AutoBuy.");
               this.nUUVuvU();
            }
         } else {
            NVUUNNv.nUUVuvU();
            vVnvuVVUunuv.UuUVuuUu("§a[AutoResell] §fГотово.");
            this.nUUVuvU();
         }

         if (this.VVnVNnunVvu != AutoResell.NVnVnNnN.WAITING && var7.contains("Подождите") && var7.contains("сек")) {
            Matcher var4 = this.c0oOOCcCoC0.matcher(var7);
            if (var4.find()) {
               try {
                  int var5 = Integer.parseInt(var4.group(1));
                  vVnvuVVUunuv.UuUVuuUu("§e[AutoResell] §fЖдем " + var5 + " сек (кулдаун)...");
                  this.unNNVVNnvvV = (var5 + 1) * 1000L;
                  this.UuUVuuUu(AutoResell.NVnVnNnN.COOLDOWN_WAIT);
                  this.UNnVVNvvnVvU.UuUVuuUu();
                  NVUUNNv.C00OOC00oO(true);
               } catch (Exception var6) {
               }
            }
         }

         if (var7.contains("Не удалось выставить") && var7.contains("освободите хранилище")) {
            NVUUNNv.nvUVNnuu();
         } else if (var7.contains("У Вас купили") && var7.contains("на /ah")) {
            NVUUNNv.UuuNnUvUuv();
         } else if (var7.contains("выставлен на продажу за")) {
            NVUUNNv.vuuuNvNuv();
         }
      }
   }

   static enum NVnVnNnN {
      WAITING,
      OPENING_MAIN_AH,
      CLICKING_STORAGE,
      OPENING_STORAGE,
      CLICKING_CLOCK,
      WAITING_RESULT,
      COOLDOWN_WAIT;
   }
}
