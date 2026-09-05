package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_476;
import net.minecraft.class_7439;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoSell",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически выставляет предметы на продажу"
)
public class AutoSell extends Module {
   public static AutoSell NVNnnvnuunNv;
   private static final String uUVuVvuNUvnu = "По одной штуке";
   private static final String UvUvUNuvNU = "Все сразу";
   private static final String c0oOOCcCoC0 = "Одна цена";
   private static final int VVnVNnunVvu = 9;
   private static final long unNNVVNnvvV = 5000L;
   private static final long NuunnvnN = 12000L;
   private static final long NVUunUNUN = 5000L;
   private static final long UUVNuUNUvUnV = 3000L;
   private static final long vuvnUnVnUNnV = 1500L;
   private UvNnUnuNUUU nnuUVNUuvvVU = new UvNnUnuNUUU("Сервер", "FunTime", "HolyWorld", "FunTime");
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим", "По бинду", "По бинду", "Авто");
   public final UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Режим продажи", "По одной штуке", "По одной штуке", "Все сразу", "Одна цена");
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Наценка %", 10.0F, 0.0F, 100.0F, 10.0F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("По бинду") || this.UNnVVNvvnVvU.C00OOC00oO("Одна цена"));
   public final uVNuNUVvn NnUuNNU = new uVNuNUVvn("Бинд продажи", -1).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("По бинду"));
   private final vvNnnUNnVvn nVVUuvuNnUN = new vvNnnUNnVvn("Отладка", false);
   public final NVuVVUNUvV nNvNUVU = new NVuVVUNUvV("Цена одной продажи", "1000").UuUVuuUu(32).UuUVuuUu(() -> !this.UNnVVNvvnVvU.C00OOC00oO("Одна цена"));
   public final UvNnUnuNUUU UnUNuUU = new UvNnUnuNUUU("Выкладка одной цены", "По одной штуке", "По одной штуке", "Все сразу")
      .UuUVuuUu(() -> !this.UNnVVNvvnVvU.C00OOC00oO("Одна цена"));
   private final VuNvNNvVV nNnVnUNVV = new VuNvNNvVV();
   private final VuNvNNvVV nuunNvv = new VuNvNNvVV();
   private final VuNvNNvVV uUVVvVVNvvn = new VuNvNNvVV();
   private static final long vvUVNVvvNUv = 1000L;
   private static final long UuNnnVnuNNV = 4000L;
   private static final long uUVvnUuNvvN = 1000L;
   private AutoSell.NVnVnNnN UUuUnNVNuuv = AutoSell.NVnVnNnN.IDLE;
   private boolean NVuNUuVnVUN = false;
   private long NVuunNnvvvVu = 0L;
   private String vNnNuuvVn = "";
   private boolean VUuuVUnun = false;
   private String vVVuuVVv = "";
   private String VuunNUUUvu = "";
   private class_1792 NNUUNUuVNNVn = class_1802.field_8162;
   private int VvVvnNUnvuvV = 0;
   private boolean ccOO0COcoco0 = false;
   private String NUVvUUVuVNVv = "";
   private String nNuVunNUVu = "";
   private class_1792 UNvvunVVn = class_1802.field_8162;
   private boolean UnvuVuVnNuvu = false;
   private int UvNNVUVNVuvV = 0;
   private boolean NnunUUnU = false;
   private boolean nvuVvuNnNUnv = false;
   private boolean NnVnNVN = false;
   private int vnvvNvUnVv = 0;
   private int OCOocoOoOO = 0;
   private int o0Ooc0COOoc = 0;
   private int nvvnUnUn = 0;
   private int UnUUVuVunvVu = 9;
   private boolean nnvuvUNuUnN = false;
   private boolean UVnuVUUVnnU = false;
   private boolean VunnVNvNV = false;
   private int NvUVUvVVnUu = 0;
   private long unnUnUNVnN = 0L;
   private long NnuUnUNnu = 0L;
   private long UnnnvvU = 0L;
   private long VUUnuVvVu = 0L;
   private int VvVuvUvvNNVv = -1;
   private long UnnNNvuvvUU = 0L;
   private long VNNnnVUuvv = 0L;
   private boolean vUvUvUNNuNvn = false;

   public AutoSell() {
      NVNnnvnuunNv = this;
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.nnuUVNUuvvVU, this.uVunuUNVVUUV, this.uNnUnnuNUnNu, this.NnUuNNU, this.nVVUuvuNnUN, this.UNnVVNvvnVvU, this.nNvNUVU, this.UnUNuUU
         }
      );
   }

   public boolean UuuNnUvUuv() {
      return this.uVunuUNVVUUV.C00OOC00oO("Авто");
   }

   @Override
   public boolean nUUVuvU() {
      return this.VVnVNnunVvu();
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      NVUUNNv.UuUVuuUu(false);
      NVUUNNv.C00OOC00oO(false);
      NVUUNNv.UuUVuuUu();
      this.UnUNVVVNuv();
      this.nNnVnUNVV.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      if (this.NVuNUuVnVUN) {
         NVUUNNv.UuUVuuUu(false);
      }

      if (NVUUNNv.nuUnNvnuUu()) {
         NVUUNNv.C00OOC00oO(false);
      }

      NVUUNNv.UuUVuuUu();
      this.UnUNVVVNuv();
   }

   @Override
   public void UnUNVVVNuv() {
      this.UUuUnNVNuuv = AutoSell.NVnVnNnN.IDLE;
      this.NVuNUuVnVUN = false;
      this.NVuunNnvvvVu = 0L;
      this.vNnNuuvVn = "";
      this.VUuuVUnun = false;
      this.vVVuuVVv = "";
      this.VuunNUUUvu = "";
      this.NNUUNUuVNNVn = class_1802.field_8162;
      this.VvVvnNUnvuvV = 0;
      this.ccOO0COcoco0 = false;
      this.NUVvUUVuVNVv = "";
      this.nNuVunNUVu = "";
      this.UNvvunVVn = class_1802.field_8162;
      this.UnvuVuVnNuvu = false;
      this.UvNNVUVNVuvV = 0;
      this.NnunUUnU = false;
      this.nvuVvuNnNUnv = false;
      this.NnVnNVN = false;
      this.vnvvNvUnVv = 0;
      this.OCOocoOoOO = 0;
      this.o0Ooc0COOoc = 0;
      this.nvvnUnUn = 0;
      this.UnUUVuVunvVu = 9;
      this.nnvuvUNuUnN = false;
      this.UVnuVUUVnnU = false;
      this.VunnVNvNV = false;
      this.NvUVUvVVnUu = 0;
      this.NnuUnUNnu = 0L;
      this.UnnnvvU = 0L;
      this.VUUnuVvVu = 0L;
      this.VvVuvUvvNNVv = -1;
      this.VNNnnVUuvv = 0L;
      this.vUvUvUNNuNvn = false;
   }

   public static void vNVuvnUUnuUn() {
      if (NVNnnvnuunNv != null) {
         NVNnnvnuunNv.UnUNVVVNuv();
      }
   }

   private void UvnvNVnnnnNU() {
      this.uUnuvNvvNU(true);
   }

   private void uUnuvNvvNU(boolean var1) {
      this.UnUNVVVNuv();
      this.nNnVnUNVV.UuUVuuUu();
      if (this.VVnVNnunVvu()
         || this.nNnVnUNVV()
         || !var1
         || !this.UuuNnUvUuv()
         || !NVUUNNv.VVuuUN()
         || !this.UuNnnVnuNNV()
         || !this.uUVvnUuNvvN()
         || !this.uVUVnuvnuVuv()) {
         NVUUNNv.UuUVuuUu(true);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (this.uVunuUNVVUUV.C00OOC00oO("По бинду") && var1.vVvUvVVuuNvV() == this.NnUuNNU.uUnuvNvvNU() && !this.NVuNUuVnVUN && uUnuvNvvNU.field_1724 != null) {
         if (System.currentTimeMillis() - this.UnnNNvuvvUU < 3000L) {
            return;
         }

         if (!this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
            vVnvuVVUunuv.UuUVuuUu("§3[AutoSell] §fВозьмите предмет в руку");
            return;
         }

         if (this.uVUVnuvnuVuv()) {
            this.vUvUvUNNuNvn = true;
            this.UnnNNvuvvUU = System.currentTimeMillis();
            this.uNNnnnuuuN("Запущена продажа по бинду.");
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         boolean var2 = NVUUNNv.uNNnnnuuuN();
         boolean var3 = NVUUNNv.VVuuUN();
         if (this.UuuNnUvUuv() && this.VVnVNnunVvu() && !this.NVuNUuVnVUN) {
            if (this.nNnVnUNVV.uNNnnnuuuN(500L)) {
               if (NVUUNNv.uUnuvNvvNU()) {
                  this.NVuNUuVnVUN = true;
                  this.c0oOOCcCoC0();
                  return;
               }

               if (var3) {
                  if (!this.ccOO0COcoco0 && !this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
                     this.uUVvnUuNvvN();
                  }

                  if (!this.uVUVnuvnuVuv()) {
                     this.UuUVuuUu("§c[AutoSell] §fДля режима одной цены возьмите нужный предмет в руку или дождитесь покупки AutoBuy.");
                     this.nNnVnUNVV.UuUVuuUu();
                  }
               }
            }
         } else if (this.UuuNnUvUuv() && !this.NVuNUuVnVUN && (!this.nNnVnUNVV() || var2) && this.nNnVnUNVV.uNNnnnuuuN(500L) && var3) {
            if (this.nNnVnUNVV()) {
               if (!this.uVUVnuvnuVuv() && var2) {
                  NVUUNNv.UuUVuuUu(true);
               }
            } else if (this.uUVvnUuNvvN()) {
               this.uVUVnuvnuVuv();
            } else if (var2) {
               NVUUNNv.UuUVuuUu(true);
            }
         }

         if (this.NVuNUuVnVUN) {
            if (this.VVnVNnunVvu() && this.UUuUnNVNuuv == AutoSell.NVnVnNnN.IDLE) {
               this.nNvNUVU();
               if (!this.NVuNUuVnVUN || this.UUuUnNVNuuv == AutoSell.NVnVnNnN.IDLE) {
                  return;
               }
            }

            switch (this.UUuUnNVNuuv) {
               case PREPARING:
                  if (this.VVnVNnunVvu()) {
                     if (this.nNnVnUNVV()) {
                        vVnvuVVUunuv.UuUVuuUu("§c[AutoSell] §fРежим одной цены через sellgui доступен только для FunTime.");
                        this.uUnuvNvvNU(false);
                        return;
                     }

                     if (uUnuvNvvNU.field_1755 != null) {
                        this.nnuUVNUuvvVU();
                        this.nuunNvv.UuUVuuUu();
                        return;
                     }

                     if (!this.unNNVVNnvvV()) {
                        this.UvnvNVnnnnNU();
                        return;
                     }

                     if (!this.NuunnvnN()) {
                        this.UvnvNVnnnnNU();
                        return;
                     }

                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SELLGUI_SELLING;
                     this.nuunNvv.UuUVuuUu();
                  } else if (this.nNnVnUNVV()) {
                     if (uUnuvNvvNU.field_1755 != null) {
                        this.nnuUVNUuvvVU();
                     }

                     this.nuunNvv();
                     if ((!this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047()) || !this.uNNnnnuuuN(uUnuvNvvNU.field_1724.method_6047()))
                        && !this.uUVvnUuNvvN()) {
                        if (this.uUVVvVVNvvn.uNNnnnuuuN(4000L)) {
                           this.vVvUvVVuuNvV(true);
                        }

                        return;
                     }

                     this.VvVvnNUnvuvV = 0;
                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.HOLY_SELLING;
                     this.nuunNvv.UuUVuuUu();
                     this.uUVVvVVNvvn.UuUVuuUu();
                  } else {
                     if (this.UuuNnUvUuv()) {
                        if (!this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047()) && !this.uUVvnUuNvvN()) {
                           this.UvnvNVnnnnNU();
                           return;
                        }
                     } else if (!this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
                        this.UvnvNVnnnnNU();
                        return;
                     }

                     if (this.UNnVVNvvnVvU.C00OOC00oO("По одной штуке")) {
                        this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SPLITTING;
                     } else {
                        this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SEARCHING;
                     }

                     this.nuunNvv.UuUVuuUu();
                  }
                  break;
               case SPLITTING:
                  if (this.nuunNvv.uNNnnnuuuN(150L)) {
                     if (this.uUVVvVVNvvn()) {
                        this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SEARCHING;
                     } else {
                        this.UvnvNVnnnnNU();
                     }

                     this.nuunNvv.UuUVuuUu();
                  }
                  break;
               case SEARCHING:
                  if (this.nuunNvv.uNNnnnuuuN(50L)) {
                     class_1799 var10 = uUnuvNvvNU.field_1724.method_6047();
                     if (var10.method_7960()) {
                        this.UUuUnNVNuuv = AutoSell.NVnVnNnN.PREPARING;
                        return;
                     }

                     if (this.UNnVVNvvnVvU.C00OOC00oO("По одной штуке") && var10.method_7947() > 1) {
                        this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SPLITTING;
                        return;
                     }

                     String var13 = this.nuUnNvnuUu(var10);
                     if (var13.isEmpty()) {
                        vVnvuVVUunuv.UuUVuuUu("§3[AutoSell] Не удалось определить имя предмета");
                        this.UvnvNVnnnnNU();
                        return;
                     }

                     this.vNnNuuvVn = var13;
                     if (uUnuvNvvNU.field_1755 != null) {
                        if (uUnuvNvvNU.field_1755 instanceof class_476 var6) {
                           this.VvVuvUvvNNVv = ((class_1707)var6.method_17577()).field_7763;
                        }

                        this.nnuUVNUuvvVU();
                        this.nuunNvv.UuUVuuUu();
                        return;
                     }

                     this.NVNnnvnuunNv();
                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SCANNING;
                     this.VNNnnVUuvv = 0L;
                     this.nuunNvv.UuUVuuUu();
                     this.uUVVvVVNvvn.UuUVuuUu();
                  }
                  break;
               case SCANNING:
                  if (uUnuvNvvNU.field_1755 instanceof class_476 var9 && this.nuUnNvnuUu(var9)) {
                     if (this.VNNnnVUuvv == 0L) {
                        this.VNNnnVUuvv = System.currentTimeMillis();
                        this.uNNnnnuuuN("Аукцион открыт, ожидание 1,5 сек.");
                     }

                     boolean var12 = this.vUvUvUNNuNvn ? System.currentTimeMillis() - this.VNNnnVUuvv >= 1500L : this.nuunNvv.uNNnnnuuuN(350L);
                     if (var12) {
                        try {
                           this.uVUuuVnNVU(var9);
                        } catch (Exception var8) {
                           this.UvnvNVnnnnNU();
                        }
                     }
                  } else if (this.nuunNvv.uNNnnnuuuN(this.nVVUuvuNnUN() ? 6500L : 2000L)) {
                     this.UvnvNVnnnnNU();
                  }
                  break;
               case SELLING:
                  if (this.nuunNvv.uNNnnnuuuN(50L)) {
                     if (this.NVuunNnvvvVu > 0L) {
                        this.uVunuUNVVUUV();
                     }

                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.FINISHING;
                     this.nuunNvv.UuUVuuUu();
                     this.uUVVvVVNvvn.UuUVuuUu();
                  }
                  break;
               case FINISHING:
                  if (this.nVVUuvuNnUN() && this.NVuunNnvvvVu > 0L && this.uUVVvVVNvvn.uNNnnnuuuN(900L)) {
                     this.uVunuUNVVUUV();
                     this.uUVVvVVNvvn.UuUVuuUu();
                  }

                  if (this.nuunNvv.uNNnnnuuuN(this.nVVUuvuNnUN() ? 10000L : 8000L)) {
                     vVnvuVVUunuv.UuUVuuUu("§e[AutoSell] §fНет ответа от аукциона, возвращаю AutoBuy.");
                     this.uUnuvNvvNU(false);
                  }
                  break;
               case SELLGUI_SELLING:
                  this.uNNnnnuuuN(false);
                  break;
               case SELLGUI_WAITING_RESULT:
                  this.nuUnNvnuUu(false);
                  break;
               case RESALE_SEARCH_OWN_AH:
                  this.UnUNuUU();
                  break;
               case RESALE_WAITING_OWN_AH:
                  this.uUVuVvuNUvnu();
                  break;
               case RESALE_TAKE_ITEM:
                  this.UvUvUNuvNU();
                  break;
               case RESALE_SELLING:
                  this.uNNnnnuuuN(true);
                  break;
               case RESALE_WAIT_SELL_RESULT:
                  this.nuUnNvnuUu(true);
                  break;
               case HOLY_SELLING:
                  if (this.uUVVvVVNvvn.uNNnnnuuuN(4000L)) {
                     this.vVvUvVVuuNvV(true);
                  } else if (!this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047()) || !this.uNNnnnuuuN(uUnuvNvvNU.field_1724.method_6047())) {
                     this.VvVvnNUnvuvV = 0;
                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.PREPARING;
                     this.nuunNvv.UuUVuuUu();
                  } else if (this.VvVvnNUnvuvV == 0) {
                     this.UNnVVNvvnVvU();
                     this.VvVvnNUnvuvV = 1;
                     this.nuunNvv.UuUVuuUu();
                  } else if (this.VvVvnNUnvuvV == 1 && this.nuunNvv.uNNnnnuuuN(1000L)) {
                     this.uNnUnnuNUnNu();
                     this.VvVvnNUnvuvV = 2;
                     this.nuunNvv.UuUVuuUu();
                  }
                  break;
               case HOLY_OPENING_AUCTION:
                  if (uUnuvNvvNU.field_1755 instanceof class_476 var4 && this.UuUVuuUu(var4)) {
                     this.vVvUvVVuuNvV(false);
                  } else if (this.nuunNvv.uNNnnnuuuN(1000L)) {
                     this.NnUuNNU();
                     this.nuunNvv.UuUVuuUu();
                  }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var5 = var2.comp_763().getString();
         if (!this.uVUuuVnNVU(var5)) {
            if (this.vNUvnnVnUvu(var5)) {
               NVUUNNv.vuuuNvNuv();
               if (this.NVuNUuVnVUN) {
                  if (this.VVnVNnunVvu()) {
                     int var6 = Math.max(1, this.OCOocoOoOO);
                     this.o0Ooc0COOoc += var6;
                     if (this.UVnuVUUVnnU) {
                        this.UnUUVuVunvVu = Math.max(1, Math.min(this.UnUUVuVunvVu, this.o0Ooc0COOoc));
                     }

                     this.nvvnUnUn = Math.max(0, this.nvvnUnUn - var6);
                     this.OCOocoOoOO = 0;
                     this.UVnuVUUVnnU = false;
                     this.nvuVvuNnNUnv = false;
                     this.NnunUUnU = true;
                     this.UnnnvvU = System.currentTimeMillis();
                     return;
                  }

                  if (this.nNnVnUNVV()) {
                     this.NnUuNNU();
                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.HOLY_OPENING_AUCTION;
                     this.nuunNvv.UuUVuuUu();
                     this.uUVVvVVNvvn.UuUVuuUu();
                  } else {
                     this.uUnuvNvvNU(true);
                  }
               }
            } else if (var5.contains("Не удалось выставить") && var5.contains("освободите хранилище")) {
               NVUUNNv.nvUVNnuu();
               if (this.NVuNUuVnVUN) {
                  if (this.VVnVNnunVvu()) {
                     this.nvuVvuNnNUnv = true;
                     this.OCOocoOoOO = 0;
                     this.UVnuVUUVnnU = false;
                     return;
                  }

                  vVnvuVVUunuv.UuUVuuUu("§c[AutoSell] Хранилище заполнено. Продажа приостановлена.");
                  this.uUnuvNvvNU(false);
               }
            }
         } else {
            NVUUNNv.UuuNnUvUuv();
            if (this.VVnVNnunVvu() && (this.NVuNUuVnVUN || this.o0Ooc0COOoc > 0)) {
               int var4 = this.C00OOC00oO(var5);
               this.o0Ooc0COOoc = Math.max(0, this.o0Ooc0COOoc - var4);
               this.nvvnUnUn += var4;
               this.UnnnvvU = System.currentTimeMillis();
               if (this.NVuNUuVnVUN) {
                  this.UUuUnNVNuuv = AutoSell.NVnVnNnN.IDLE;
                  this.nuunNvv.UuUVuuUu();
               }

               return;
            }

            if (this.NVuNUuVnVUN) {
               if (this.nNnVnUNVV()) {
                  this.vVvUvVVuuNvV(true);
               } else {
                  this.uUnuvNvvNU(false);
               }
            }
         }
      }
   }

   private boolean uVUVnuvnuVuv() {
      if (this.VVnVNnunVvu()) {
         if (this.nNnVnUNVV()) {
            vVnvuVVUunuv.UuUVuuUu("§c[AutoSell] §fРежим одной цены через sellgui доступен только для FunTime.");
            return false;
         }

         if (this.vuvnUnVnUNnV() <= 0L) {
            vVnvuVVUunuv.UuUVuuUu("§c[AutoSell] §fЦена одной продажи не задана.");
            return false;
         }

         if (!this.unNNVVNnvvV()) {
            return false;
         }
      } else if (this.nNnVnUNVV() && !this.nuunNvv()) {
         return false;
      }

      if (!NVUUNNv.vNUvnnVnUvu()) {
         return false;
      } else {
         if (this.VVnVNnunVvu()) {
            this.o0Ooc0COOoc = 0;
            this.nvvnUnUn = 0;
            this.UnUUVuVunvVu = 9;
            this.UnnnvvU = 0L;
            this.OCOocoOoOO = 0;
            this.UVnuVUUVnnU = false;
         }

         this.NVuNUuVnVUN = true;
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.PREPARING;
         this.nuunNvv.UuUVuuUu();
         this.uUVVvVVNvvn.UuUVuuUu();
         return true;
      }
   }

   private void NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1724 != null && !this.vNnNuuvVn.isEmpty()) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah search " + this.vNnNuuvVn);
         this.uNNnnnuuuN("Поиск: " + this.vNnNuuvVn);
      }
   }

   private void uVunuUNVVUUV() {
      if (uUnuvNvvNU.field_1724 != null && this.NVuunNnvvvVu > 0L) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah sell " + this.NVuunNnvvvVu);
         this.uNNnnnuuuN("Выставление за " + this.NVuunNnvvvVu + ".");
      }
   }

   private void vVvUvVVuuNvV(boolean var1) {
      this.UnUNVVVNuv();
      this.nNnVnUNVV.UuUVuuUu();
      NVUUNNv.UuUVuuUu(var1);
   }

   private void UNnVVNvvnVvU() {
      if (uUnuvNvvNU.field_1724 != null) {
         if (uUnuvNvvNU.field_1755 != null) {
            uUnuvNvvNU.field_1724.method_3137();
         }

         uUnuvNvvNU.field_1724.field_3944.method_45730("ah sell auto");
      }
   }

   private void uNnUnnuNUnNu() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah sell auto confirm");
      }
   }

   private void NnUuNNU() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah");
      }
   }

   private boolean UuUVuuUu(class_476 var1) {
      if (var1 == null) {
         return false;
      } else if (AutoBuy.NVNnnvnuunNv != null && AutoBuy.NVNnnvnuunNv.UuUVuuUu(var1)) {
         return true;
      } else {
         String var2 = this.VVuuUN(var1.method_25440().getString()).toLowerCase(Locale.ROOT);
         return var2.contains("аукцион") || var2.contains("auction");
      }
   }

   private void nNvNUVU() {
      if (this.nvuVvuNnNUnv) {
         this.c0oOOCcCoC0();
      } else if (this.nvvnUnUn > 0 && this.NuunnvnN()) {
         if (this.o0Ooc0COOoc < this.UnUUVuVunvVu) {
            this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SELLGUI_SELLING;
            this.nuunNvv.UuUVuuUu();
         } else {
            if (System.currentTimeMillis() - this.UnnnvvU >= 5000L) {
               this.c0oOOCcCoC0();
            }
         }
      } else if (this.o0Ooc0COOoc > 0) {
         if (this.NuunnvnN() && this.o0Ooc0COOoc < this.UnUUVuVunvVu) {
            this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SELLGUI_SELLING;
            this.nuunNvv.UuUVuuUu();
         } else {
            if (System.currentTimeMillis() - this.UnnnvvU >= 5000L) {
               this.c0oOOCcCoC0();
            }
         }
      } else if (this.NuunnvnN()) {
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SELLGUI_SELLING;
         this.nuunNvv.UuUVuuUu();
      } else {
         this.VVuuUN(true);
      }
   }

   private void uNNnnnuuuN(boolean var1) {
      if (this.nuunNvv.uNNnnnuuuN(50L)) {
         if (this.nvuVvuNnNUnv) {
            this.c0oOOCcCoC0();
         } else {
            long var2 = this.vuvnUnVnUNnV();
            if (var2 <= 0L) {
               vVnvuVVUunuv.UuUVuuUu("§c[AutoSell] §fЦена одной продажи не задана.");
               this.VVuuUN(false);
            } else if (this.unNNVVNnvvV() && this.NuunnvnN()) {
               if (uUnuvNvvNU.field_1755 instanceof class_476 var4 && this.uNNnnnuuuN(var4)) {
                  this.UuUVuuUu(var4, var1);
               } else if (uUnuvNvvNU.field_1755 != null) {
                  this.nnuUVNUuvvVU();
                  this.nuunNvv.UuUVuuUu();
               } else if (this.NVUunUNUN()) {
                  this.UUVNuUNUvUnV();
                  this.NnunUUnU = false;
                  this.nvuVvuNnNUnv = false;
                  this.UuUVuuUu(var2);
                  this.UUuUnNVNuuv = var1 ? AutoSell.NVnVnNnN.RESALE_WAIT_SELL_RESULT : AutoSell.NVnVnNnN.SELLGUI_WAITING_RESULT;
                  this.nuunNvv.UuUVuuUu();
                  this.uUVVvVVNvvn.UuUVuuUu();
               }
            } else {
               this.UUuUnNVNuuv = AutoSell.NVnVnNnN.IDLE;
               this.nuunNvv.UuUVuuUu();
            }
         }
      }
   }

   private void nuUnNvnuUu(boolean var1) {
      if (this.nvuVvuNnNUnv) {
         this.c0oOOCcCoC0();
      } else if (uUnuvNvvNU.field_1755 instanceof class_476 var2 && this.uNNnnnuuuN(var2)) {
         this.UuUVuuUu(var2, var1);
      } else if (this.NnunUUnU) {
         this.NnunUUnU = false;
         this.UUVNuUNUvUnV();
         this.UUuUnNVNuuv = this.o0Ooc0COOoc > 0
            ? AutoSell.NVnVnNnN.IDLE
            : (this.NuunnvnN() ? (var1 ? AutoSell.NVnVnNnN.RESALE_SELLING : AutoSell.NVnVnNnN.SELLGUI_SELLING) : AutoSell.NVnVnNnN.IDLE);
         this.nuunNvv.UuUVuuUu();
      } else {
         if (this.nuunNvv.uNNnnnuuuN(12000L)) {
            this.nnuUVNUuvvVU();
            this.OCOocoOoOO = 0;
            this.UUuUnNVNuuv = this.o0Ooc0COOoc > 0
               ? AutoSell.NVnVnNnN.IDLE
               : (this.NuunnvnN() ? (var1 ? AutoSell.NVnVnNnN.RESALE_SELLING : AutoSell.NVnVnNnN.SELLGUI_SELLING) : AutoSell.NVnVnNnN.IDLE);
            if (this.UUuUnNVNuuv == AutoSell.NVnVnNnN.IDLE && this.o0Ooc0COOoc <= 0) {
               this.VVuuUN(false);
            }

            this.nuunNvv.UuUVuuUu();
         }
      }
   }

   private void UnUNuUU() {
      long var1 = System.currentTimeMillis();
      if (var1 >= this.VUUnuVvVu) {
         if (uUnuvNvvNU.field_1755 != null) {
            this.nnuUVNUuvvVU();
            this.VUUnuVvVu = var1 + 350L;
         } else if (!this.VunnVNvNV && !this.NnVnNVN && this.NuunnvnN()) {
            this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SELLING;
            this.nuunNvv.UuUVuuUu();
         } else {
            this.NnVnNVN = false;
            if (uUnuvNvvNU.field_1724 == null) {
               this.VVuuUN(false);
            } else {
               this.NvUVUvVVnUu++;
               this.UuUVuuUu(uUnuvNvvNU.field_1724.method_5477().getString(), this.NvUVUvVVnUu);
               this.vnvvNvUnVv = 0;
               this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_WAITING_OWN_AH;
               this.nuunNvv.UuUVuuUu();
               this.uUVVvVVNvvn.UuUVuuUu();
            }
         }
      }
   }

   private void uUVuVvuNUvnu() {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.VVuuUN(var1)) {
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_TAKE_ITEM;
         this.nuunNvv.UuUVuuUu();
      } else if (this.uUVVvVVNvvn.uNNnnnuuuN(18000L)) {
         vVnvuVVUunuv.UuUVuuUu("§c[AutoSell] §fТаймаут поиска своих товаров.");
         this.VVuuUN(false);
      } else if (uUnuvNvvNU.field_1755 != null && this.nuunNvv.uNNnnnuuuN(1200L)) {
         this.nnuUVNUuvvVU();
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SEARCH_OWN_AH;
         this.VUUnuVvVu = System.currentTimeMillis() + 350L;
         this.nuunNvv.UuUVuuUu();
      } else if (this.nuunNvv.uNNnnnuuuN(4000L)) {
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SEARCH_OWN_AH;
         this.VUUnuVvVu = System.currentTimeMillis();
         this.nuunNvv.UuUVuuUu();
      }
   }

   private void UvUvUNuvNU() {
      if (this.nuunNvv.uNNnnnuuuN(200L)) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
            if (!this.VVuuUN(var1)) {
               if (this.nuunNvv.uNNnnnuuuN(10000L)) {
                  this.nnuUVNUuvvVU();
                  this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SEARCH_OWN_AH;
                  this.nuunNvv.UuUVuuUu();
               }
            } else {
               int var3 = this.C00OOC00oO(var1);
               if (var3 != -1) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7794);
                  this.vnvvNvUnVv = 0;
                  this.nuunNvv.UuUVuuUu();
               } else if (this.vnvvNvUnVv++ < 2) {
                  this.nuunNvv.UuUVuuUu();
               } else {
                  this.nnuUVNUuvvVU();
                  this.nvuVvuNnNUnv = false;
                  if (!this.NuunnvnN()) {
                     vVnvuVVUunuv.UuUVuuUu("§e[AutoSell] §fСвои лоты не найдены, предметов в инвентаре нет.");
                     this.VVuuUN(true);
                  } else {
                     this.VunnVNvNV = false;
                     this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SELLING;
                     this.nuunNvv.UuUVuuUu();
                  }
               }
            }
         } else {
            this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SEARCH_OWN_AH;
            this.nuunNvv.UuUVuuUu();
         }
      }
   }

   private void UuUVuuUu(class_476 var1, boolean var2) {
      class_1703 var3 = var1.method_17577();
      int var4 = this.vNUvnnVnUvu(var1);
      if (this.UnvuVuVnNuvu) {
         if (this.nuunNvv.uNNnnnuuuN(1500L)) {
            this.nnuUVNUuvvVU();
         }
      } else {
         int var5 = 0;

         for (int var6 = this.vNUvnnVnUvu(var2); var5 < 4 && this.UvNNVUVNVuvV < var6; var5++) {
            int var7 = this.uUnuvNvvNU(var1);
            int var8 = this.UuUVuuUu(var3, var4);
            if (var7 == -1) {
               this.nnvuvUNuUnN = true;
               break;
            }

            if (var8 == -1) {
               break;
            }

            if (this.UnUNuUU.C00OOC00oO("По одной штуке")) {
               if (!this.UuUVuuUu(var3, var8, var7)) {
                  break;
               }
            } else {
               uUnuvNvvNU.field_1761.method_2906(var3.field_7763, var8, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.field_1761.method_2906(var3.field_7763, var7, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            }

            this.UvNNVUVNVuvV++;
         }

         if (var5 > 0) {
            this.nuunNvv.UuUVuuUu();
         } else if (this.UvNNVUVNVuvV > 0) {
            int var9 = this.vVvUvVVuuNvV(var1);
            if (var9 != -1) {
               this.UuUVuuUu(var1, var9, 0, class_1713.field_7790);
               this.UnvuVuVnNuvu = true;
               this.OCOocoOoOO = this.UvNNVUVNVuvV;
               this.UVnuVUUVnnU = this.nnvuvUNuUnN;
               if (this.nnvuvUNuUnN) {
                  this.UnUUVuVunvVu = Math.max(1, this.UvNNVUVNVuvV);
               }

               this.nuunNvv.UuUVuuUu();
            } else {
               if (this.nuunNvv.uNNnnnuuuN(3000L)) {
                  this.nnuUVNUuvvVU();
                  this.UUuUnNVNuuv = var2 ? AutoSell.NVnVnNnN.RESALE_SELLING : AutoSell.NVnVnNnN.SELLGUI_SELLING;
                  this.nuunNvv.UuUVuuUu();
               }
            }
         } else {
            this.nnuUVNUuvvVU();
            if (this.nnvuvUNuUnN && this.o0Ooc0COOoc > 0) {
               this.UnUUVuVunvVu = Math.max(1, Math.min(this.UnUUVuVunvVu, this.o0Ooc0COOoc));
               this.UuUVuuUu("§e[AutoSell] §fВ sellgui нет свободных слотов, жду перевыставление.");
            }

            this.UUuUnNVNuuv = var2 ? AutoSell.NVnVnNnN.RESALE_SEARCH_OWN_AH : AutoSell.NVnVnNnN.IDLE;
            if (this.UUuUnNVNuuv == AutoSell.NVnVnNnN.IDLE && this.o0Ooc0COOoc <= 0) {
               this.VVuuUN(true);
            } else {
               this.nuunNvv.UuUVuuUu();
            }
         }
      }
   }

   private void c0oOOCcCoC0() {
      this.nvuVvuNnNUnv = false;
      this.NnunUUnU = false;
      this.NnVnNVN = true;
      this.VunnVNvNV = true;
      this.vnvvNvUnVv = 0;
      this.o0Ooc0COOoc = 0;
      this.nvvnUnUn = 0;
      this.nnvuvUNuUnN = false;
      this.UVnuVUUVnnU = false;
      this.NvUVUvVVnUu = 0;
      this.VUUnuVvVu = System.currentTimeMillis() + 350L;
      this.UUVNuUNUvUnV();
      this.UUuUnNVNuuv = AutoSell.NVnVnNnN.RESALE_SEARCH_OWN_AH;
      this.nuunNvv.UuUVuuUu();
      this.uUVVvVVNvvn.UuUVuuUu();
      this.nnuUVNUuvvVU();
      NVUUNNv.UuUVuuUu(false);
      NVUUNNv.uVUuuVnNVU();
   }

   private void VVuuUN(boolean var1) {
      if (NVUUNNv.nuUnNvnuUu()) {
         NVUUNNv.C00OOC00oO(var1);
      }

      this.uUnuvNvvNU(var1);
   }

   private boolean VVnVNnunVvu() {
      return this.UNnVVNvvnVvU.C00OOC00oO("Одна цена");
   }

   private void UuUVuuUu(String var1) {
      long var2 = System.currentTimeMillis();
      if (var2 - this.NnuUnUNnu >= 3000L) {
         this.NnuUnUNnu = var2;
         vVnvuVVUunuv.UuUVuuUu(var1);
      }
   }

   private boolean unNNVVNnvvV() {
      if (this.ccOO0COcoco0) {
         return true;
      } else if (uUnuvNvvNU.field_1724 != null && this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
         this.UuUVuuUu(uUnuvNvvNU.field_1724.method_6047());
         return true;
      } else {
         AutoBuy.VUnuUnnuNvVu var1 = AutoBuy.UnUNVVVNuv();
         if (var1 != null) {
            this.ccOO0COcoco0 = true;
            this.NUVvUUVuVNVv = var1.C00OOC00oO == null ? "" : var1.C00OOC00oO;
            this.nNuVunNUVu = var1.UuUVuuUu == null ? "" : var1.UuUVuuUu;
            this.UNvvunVVn = class_1802.field_8162;
            return true;
         } else {
            return false;
         }
      }
   }

   private void UuUVuuUu(class_1799 var1) {
      if (this.vVvUvVVuuNvV(var1)) {
         this.ccOO0COcoco0 = true;
         this.NUVvUUVuVNVv = this.nuUnNvnuUu(var1);
         this.nNuVunNUVu = var1.method_7964().getString();
         this.UNvvunVVn = var1.method_7909();
      }
   }

   private boolean NuunnvnN() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else if (this.C00OOC00oO(uUnuvNvvNU.field_1724.method_6047())) {
         return true;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (this.C00OOC00oO(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean C00OOC00oO(class_1799 var1) {
      if (this.vVvUvVVuuNvV(var1) && this.ccOO0COcoco0) {
         if (this.UNvvunVVn != class_1802.field_8162 && var1.method_7909() != this.UNvvunVVn) {
            return false;
         } else {
            String var2 = this.nuUnNvnuUu(this.nuUnNvnuUu(var1));
            String var3 = this.nuUnNvnuUu(this.NUVvUUVuVNVv);
            String var4 = this.nuUnNvnuUu(this.nNuVunNUVu);
            return var3.isEmpty() && var4.isEmpty()
               ? true
               : !var2.isEmpty()
                  && (
                     var2.equals(var3)
                        || var2.equals(var4)
                        || !var3.isEmpty() && (var2.contains(var3) || var3.contains(var2))
                        || !var4.isEmpty() && (var2.contains(var4) || var4.contains(var2))
                  );
         }
      } else {
         return false;
      }
   }

   private int UuUVuuUu(class_1703 var1, int var2) {
      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = var1.method_7611(var3);
         if (var4.method_7681() && this.C00OOC00oO(var4.method_7677())) {
            return var3;
         }
      }

      return -1;
   }

   private int C00OOC00oO(class_476 var1) {
      int var2 = this.vNUvnnVnUvu(var1);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (var4.method_7681() && this.C00OOC00oO(var4.method_7677())) {
            return var3;
         }
      }

      return -1;
   }

   private int uUnuvNvvNU(class_476 var1) {
      int var2 = Math.min(9, this.vNUvnnVnUvu(var1));

      for (int var3 = 0; var3 < var2; var3++) {
         class_1735 var4 = ((class_1707)var1.method_17577()).method_7611(var3);
         if (!var4.method_7681()) {
            return var3;
         }
      }

      return -1;
   }

   private int vVvUvVVuuNvV(class_476 var1) {
      int var2 = this.vNUvnnVnUvu(var1);
      int var3 = -1;

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         class_1735 var5 = ((class_1707)var1.method_17577()).method_7611(var4);
         if (var5.method_7681()) {
            class_1799 var6 = var5.method_7677();
            String var7 = this.VVuuUN(var6.method_7964().getString()).toLowerCase(Locale.ROOT);
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

   private boolean uNNnnnuuuN(class_476 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.VVuuUN(var1.method_25440().getString()).toLowerCase(Locale.ROOT);
         return var2.contains("продажа") || var2.contains("sellgui") || var2.contains("sell gui");
      }
   }

   private boolean nuUnNvnuUu(class_476 var1) {
      if (var1 != null && ((class_1707)var1.method_17577()).field_7763 != this.VvVuvUvvNNVv) {
         if (AhHelper.UuUVuuUu(var1)) {
            return true;
         } else {
            int var2 = Math.min(45, ((class_1707)var1.method_17577()).field_7761.size());

            for (int var3 = 0; var3 < var2; var3++) {
               if (UuUVuuUu(((class_1707)var1.method_17577()).method_7611(var3)) > 0L) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean VVuuUN(class_476 var1) {
      if (var1 != null && uUnuvNvvNU.field_1724 != null) {
         String var2 = this.VVuuUN(var1.method_25440().getString()).toLowerCase(Locale.ROOT);
         String var3 = this.VVuuUN(uUnuvNvvNU.field_1724.method_5477().getString()).toLowerCase(Locale.ROOT);
         return AhHelper.UuUVuuUu(var1) || var2.contains(var3) || var2.contains("мои товары") || var2.contains("мои предметы") || var2.contains("поиск:");
      } else {
         return false;
      }
   }

   private int vNUvnnVnUvu(class_476 var1) {
      int var2 = ((class_1707)var1.method_17577()).method_17388();
      int var3 = ((class_1707)var1.method_17577()).field_7761.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private void UuUVuuUu(class_476 var1, int var2, int var3, class_1713 var4) {
      uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2, var3, var4, uUnuvNvvNU.field_1724);
   }

   private boolean UuUVuuUu(class_1703 var1, int var2, int var3) {
      if (uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         if (var1.method_34255().method_7960()) {
            return false;
         } else {
            uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
            if (!var1.method_34255().method_7960()) {
               uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(String var1, int var2) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null && !var1.isBlank()) {
         String var3 = "ah " + var1.trim();
         uUnuvNvvNU.field_1724.field_3944.method_45730(var3);
      }
   }

   private boolean NVUunUNUN() {
      return System.currentTimeMillis() - this.unnUnUNVnN >= 5000L;
   }

   private void UuUVuuUu(long var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("ah sellgui " + var1);
         this.unnUnUNVnN = System.currentTimeMillis();
      }
   }

   private void UUVNuUNUvUnV() {
      this.UnvuVuVnNuvu = false;
      this.UvNNVUVNVuvV = 0;
      this.OCOocoOoOO = 0;
      this.nnvuvUNuUnN = false;
      this.UVnuVUUVnnU = false;
   }

   private long vuvnUnVnUNnV() {
      return this.vVvUvVVuuNvV(this.nNvNUVU.uUnuvNvvNU());
   }

   private int vNUvnnVnUvu(boolean var1) {
      if (var1) {
         return Integer.MAX_VALUE;
      } else {
         int var2 = Math.max(1, this.UnUUVuVunvVu - this.o0Ooc0COOoc);
         if (this.nvvnUnUn > 0) {
            return Math.max(1, Math.min(this.nvvnUnUn, var2));
         } else {
            return this.o0Ooc0COOoc > 0 ? var2 : Integer.MAX_VALUE;
         }
      }
   }

   private int C00OOC00oO(String var1) {
      if (var1 == null) {
         return 1;
      } else {
         String var2 = this.VVuuUN(var1).toLowerCase(Locale.ROOT);
         int var3 = var2.indexOf(" за ");
         if (var3 > 0) {
            var2 = var2.substring(0, var3);
         }

         int var4 = this.UuUVuuUu(var2, "x");
         if (var4 > 0) {
            return var4;
         } else {
            var4 = this.UuUVuuUu(var2, "х");
            if (var4 > 0) {
               return var4;
            } else {
               var4 = this.C00OOC00oO(var2, "предмет");
               if (var4 > 0) {
                  return var4;
               } else {
                  var4 = this.C00OOC00oO(var2, "шт");
                  return var4 > 0 ? var4 : 1;
               }
            }
         }
      }
   }

   private int UuUVuuUu(String var1, String var2) {
      int var3 = var1.indexOf(var2);
      if (var3 < 0) {
         return 0;
      } else {
         String var4 = var1.substring(var3 + var2.length()).replaceFirst("[^0-9]*", "").replaceFirst("[^0-9].*$", "");
         return this.uUnuvNvvNU(var4);
      }
   }

   private int C00OOC00oO(String var1, String var2) {
      int var3 = var1.indexOf(var2);
      if (var3 <= 0) {
         return 0;
      } else {
         String var4 = var1.substring(0, var3).trim();
         String var5 = var4.replaceFirst("^.*?([0-9]+)\\s*$", "$1");
         return var5.equals(var4) && !var5.matches("[0-9]+") ? 0 : this.uUnuvNvvNU(var5);
      }
   }

   private int uUnuvNvvNU(String var1) {
      if (var1 != null && !var1.isBlank()) {
         try {
            return Math.max(0, Integer.parseInt(var1));
         } catch (NumberFormatException var3) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private long vVvUvVVuuNvV(String var1) {
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

   private void nnuUVNUuvvVU() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }
   }

   private boolean nVVUuvuNnUN() {
      return AutoBuy.NVNnnvnuunNv != null && AutoBuy.NVNnnvnuunNv.NnUuNNU.C00OOC00oO("FunTime");
   }

   private boolean nNnVnUNVV() {
      return this.VVnVNnunVvu()
         ? this.nnuUVNUuvvVU.C00OOC00oO("HolyWorld")
         : this.nnuUVNUuvvVU.C00OOC00oO("HolyWorld") || AutoBuy.NVNnnvnuunNv != null && AutoBuy.NVNnnvnuunNv.NnUuNNU.C00OOC00oO("HolyWorld");
   }

   private boolean nuunNvv() {
      if (!this.nNnVnUNVV()) {
         return true;
      } else if (this.VUuuVUnun) {
         return true;
      } else {
         AutoBuy.VUnuUnnuNvVu var1 = AutoBuy.UnUNVVVNuv();
         if (var1 != null) {
            this.VUuuVUnun = true;
            this.vVVuuVVv = var1.C00OOC00oO == null ? "" : var1.C00OOC00oO;
            this.VuunNUUUvu = var1.UuUVuuUu == null ? "" : var1.UuUVuuUu;
            this.NNUUNUuVNNVn = class_1802.field_8162;
            return true;
         } else if (uUnuvNvvNU.field_1724 != null && this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
            this.uUnuvNvvNU(uUnuvNvvNU.field_1724.method_6047());
            return true;
         } else {
            return false;
         }
      }
   }

   private void uUnuvNvvNU(class_1799 var1) {
      if (this.vVvUvVVuuNvV(var1)) {
         this.VUuuVUnun = true;
         this.vVVuuVVv = this.nuUnNvnuUu(var1);
         this.VuunNUUUvu = var1.method_7964().getString();
         this.NNUUNUuVNNVn = var1.method_7909();
      }
   }

   private boolean uUVVvVVNvvn() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.field_7498 != null) {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
         if (var1.method_7960()) {
            return false;
         } else if (var1.method_7947() == 1) {
            return true;
         } else {
            int var2 = this.vvUVNVvvNUv();
            if (var2 == -1) {
               vVnvuVVUunuv.UuUVuuUu("§3[AutoSell] Нет места для стака");
               return false;
            } else {
               int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532() + 36;
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private int vvUVNVvvNUv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 9; var1 < 36; var1++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
               return var1;
            }
         }

         for (int var2 = 36; var2 < 45; var2++) {
            if (var2 != uUnuvNvvNU.field_1724.method_31548().method_67532() + 36 && uUnuvNvvNU.field_1724.method_31548().method_5438(var2 - 36).method_7960()) {
               return var2;
            }
         }

         return -1;
      }
   }

   private boolean UuNnnVnuNNV() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
         return true;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean uUVvnUuNvvN() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.field_7498 != null) {
         if (this.nNnVnUNVV()) {
            if (!this.nuunNvv()) {
               return false;
            }

            if (this.VUuuVUnun) {
               return this.UUuUnNVNuuv();
            }
         }

         if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_6047())) {
            return true;
         } else {
            for (int var1 = 0; var1 < 9; var1++) {
               if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
                  UVuvVVvnVNu.UuUVuuUu(var1);
                  this.nuunNvv.UuUVuuUu();
                  return true;
               }
            }

            for (int var2 = 9; var2 < 36; var2++) {
               if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_31548().method_5438(var2))) {
                  uUnuvNvvNU.field_1761
                     .method_2906(
                        uUnuvNvvNU.field_1724.field_7498.field_7763,
                        var2,
                        uUnuvNvvNU.field_1724.method_31548().method_67532(),
                        class_1713.field_7791,
                        uUnuvNvvNU.field_1724
                     );
                  this.nuunNvv.UuUVuuUu();
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean UUuUnNVNuuv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.field_7498 != null) {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
         if (this.uNNnnnuuuN(var1)) {
            this.uUnuvNvvNU(var1);
            return true;
         } else {
            for (int var2 = 0; var2 < 9; var2++) {
               class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
               if (this.uNNnnnuuuN(var3)) {
                  this.uUnuvNvvNU(var3);
                  UVuvVVvnVNu.UuUVuuUu(var2);
                  this.nuunNvv.UuUVuuUu();
                  return true;
               }
            }

            int var5 = uUnuvNvvNU.field_1724.method_31548().method_67532();

            for (int var6 = 9; var6 < 36; var6++) {
               class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var6);
               if (this.uNNnnnuuuN(var4)) {
                  this.uUnuvNvvNU(var4);
                  uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var6, var5, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  this.nuunNvv.UuUVuuUu();
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
      return var1 != null && !var1.method_7960() && var1.method_7909() != class_1802.field_8162;
   }

   private boolean uNNnnnuuuN(class_1799 var1) {
      if (this.vVvUvVVuuNvV(var1) && this.VUuuVUnun) {
         if (this.NNUUNUuVNNVn != class_1802.field_8162 && var1.method_7909() != this.NNUUNUuVNNVn) {
            return false;
         } else {
            vNnnVNUVU.nvUnvV var2 = vNnnVNUVU.uUnuvNvvNU(this.vVVuuVVv);
            if (var2 == null) {
               var2 = vNnnVNUVU.uUnuvNvvNU(this.VuunNUUUvu);
            }

            if (var2 != null && vNnnVNUVU.UuUVuuUu(var2, var1, vNnnVNUVU.uNNnnnuuuN(var1), vNnnVNUVU.nuUnNvnuUu(var1))) {
               return true;
            } else {
               String var3 = this.nuUnNvnuUu(this.nuUnNvnuUu(var1));
               String var4 = this.nuUnNvnuUu(this.vVVuuVVv);
               String var5 = this.nuUnNvnuUu(this.VuunNUUUvu);
               return var4.isEmpty() && var5.isEmpty()
                  ? true
                  : !var3.isEmpty()
                     && (
                        var3.equals(var4)
                           || var3.equals(var5)
                           || !var4.isEmpty() && (var3.contains(var4) || var4.contains(var3))
                           || !var5.isEmpty() && (var3.contains(var5) || var5.contains(var3))
                     );
            }
         }
      } else {
         return false;
      }
   }

   private void uVUuuVnNVU(class_476 var1) {
      double var2 = Double.MAX_VALUE;
      boolean var4 = false;
      int var5 = Math.min(45, ((class_1707)var1.method_17577()).field_7761.size());

      for (int var6 = 0; var6 < var5; var6++) {
         class_1735 var7 = ((class_1707)var1.method_17577()).method_7611(var6);
         if (var7.method_7681()) {
            long var8 = UuUVuuUu(var7);
            if (var8 > 0L) {
               int var10 = Math.max(1, var7.method_7677().method_7947());
               double var11 = (double)var8 / var10;
               if (var11 < var2) {
                  var2 = var11;
                  var4 = true;
               }
            }
         }
      }

      String var19 = uUnuvNvvNU.field_1724 != null ? this.nuUnNvnuUu(uUnuvNvvNU.field_1724.method_6047()) : "";
      int var20 = uUnuvNvvNU.field_1724 != null ? Math.max(1, uUnuvNvvNU.field_1724.method_6047().method_7947()) : 1;
      int var21 = this.UNnVVNvvnVvU.C00OOC00oO("Все сразу") ? var20 : 1;
      long var9 = AutoBuy.UuUVuuUu(var19);
      long var22 = var9 > 0L ? Math.max(1L, (long)Math.ceil(var9 * 1.02 * var21)) : 1L;
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_3137();
      }

      if (var4) {
         long var13 = this.UNnVVNvvnVvU.C00OOC00oO("Все сразу") ? (long)(var2 * var20) : (long)var2;
         long var15;
         if (this.UuuNnUvUuv()) {
            var15 = var13 - 1L;
            if (var9 > 0L && var15 < var22) {
               var15 = var22;
            }

            if (var15 < 1L) {
               var15 = 1L;
            }
         } else {
            double var17 = 1.0 + this.uNnUnnuNUnNu.uUnuvNvvNU() / 100.0;
            var15 = (long)(var13 * var17);
         }

         this.NVuunNnvvvVu = var15;
         this.uNNnnnuuuN("Минимальная цена: " + (long)var2 + ", выбрана: " + var15 + ".");
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SELLING;
         this.nuunNvv.UuUVuuUu();
      } else if (this.UuuNnUvUuv() && var9 > 0L) {
         this.NVuunNnvvvVu = var22;
         this.uNNnnnuuuN("Лоты не найдены, выбрана минимальная прибыль: " + var22 + ".");
         this.UUuUnNVNuuv = AutoSell.NVnVnNnN.SELLING;
         this.nuunNvv.UuUVuuUu();
      } else {
         vVnvuVVUunuv.UuUVuuUu("§3[AutoSell] Конкурентов нет, ставьте вручную");
         this.uUnuvNvvNU(false);
      }
   }

   private void uNNnnnuuuN(String var1) {
      if (this.nVVUuvuNnUN.uUnuvNvvNU()) {
         vVnvuVVUunuv.UuUVuuUu("§7[AutoSell] §f" + var1);
      }
   }

   private String nuUnNvnuUu(class_1799 var1) {
      String var2 = var1.method_7964().getString();
      if (var2.contains("TIER WHITE")) {
         return "вайт";
      } else if (var2.contains("TIER BLACK")) {
         return "блэк";
      } else if (var2.contains("Рассадник монстров")) {
         return "Спавнер";
      } else if (var2.contains("Прогрузчик чанков [1x1]")) {
         return "Прогрузчик чанков";
      } else if (var2.contains("Яйцо призыва зомби-крестьянина")) {
         return "Яйцо зомби-крестьянина";
      } else {
         String var3 = var2.replaceAll("(?i)§.", "")
            .replaceAll("(?i)&.", "")
            .replace(' ', ' ')
            .replaceAll("\\[[^\\]]*]", " ")
            .replaceAll("[★✦✧✪✫✬✭✮✯✰❄☃⚒☠❤❣♕♛♜♞♟\ud83c\udf79]", " ")
            .replace("xxx", " ")
            .replaceAll("\\s+", " ")
            .trim();
         if (var3.isEmpty()) {
            var3 = this.VVuuUN(var1.method_7909().method_63680().getString());
         }

         return var3;
      }
   }

   private String nuUnNvnuUu(String var1) {
      return vNnnVNUVU.VVuuUN(this.VVuuUN(var1)).toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private String VVuuUN(String var1) {
      return var1 == null ? "" : var1.replaceAll("§.", "").replace(' ', ' ').trim();
   }

   private boolean vNUvnnVnUvu(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.VVuuUN(var1).toLowerCase(Locale.ROOT);
         return var2.contains("выстав") && var2.contains("продаж");
      }
   }

   private boolean uVUuuVnNVU(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.VVuuUN(var1).toLowerCase(Locale.ROOT);
         return !var2.contains("у вас купили") || !var2.contains("на /ah") && !var2.contains(" за ")
            ? var2.contains("купил у вас") && var2.contains(" за ") && (var2.contains("¤") || var2.contains("$"))
            : true;
      }
   }

   public static long UuUVuuUu(class_1735 var0) {
      if (!var0.method_7681()) {
         return 0L;
      } else {
         class_1799 var1 = var0.method_7677();
         class_9290 var2 = (class_9290)var1.method_57353().method_58694(class_9334.field_49632);
         if (var2 != null) {
            for (class_2561 var4 : var2.comp_2400()) {
               String var5 = var4.getString();
               if (var5.contains("$") || var5.contains("Цена")) {
                  String var6 = var5.replaceAll("[^0-9]", "");
                  if (!var6.isEmpty()) {
                     try {
                        return Long.parseLong(var6);
                     } catch (NumberFormatException var8) {
                     }
                  }
               }
            }
         }

         return 0L;
      }
   }

   static enum NVnVnNnN {
      IDLE,
      PREPARING,
      SPLITTING,
      SEARCHING,
      SCANNING,
      SELLING,
      FINISHING,
      SELLGUI_SELLING,
      SELLGUI_WAITING_RESULT,
      RESALE_SEARCH_OWN_AH,
      RESALE_WAITING_OWN_AH,
      RESALE_TAKE_ITEM,
      RESALE_SELLING,
      RESALE_WAIT_SELL_RESULT,
      HOLY_SELLING,
      HOLY_OPENING_AUCTION;
   }
}
