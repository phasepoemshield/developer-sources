package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.class_10730;
import net.minecraft.class_124;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2868;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_7439;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoFTCraftMembrana",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автокрафт Божьей Ауры"
)
public final class AutoFTCraftMembrana extends Module {
   private static final long uVunuUNVVUUV = 550L;
   private static final long UNnVVNvvnVvU = 50L;
   private static final long uNnUnnuNUnNu = 78L;
   private static final long NnUuNNU = 1000L;
   private static final int nNvNUVU = 50;
   private static final int UnUNuUU = 48;
   private static final long uUVuVvuNUvnu = 500L;
   private static final long UvUvUNuvNU = 900L;
   public static volatile boolean NVNnnvnuunNv;
   private final NVuVVUNUvV c0oOOCcCoC0 = new NVuVVUNUvV("Макс цена алмазов (стак)", "150000").UuUVuuUu(9);
   private final NVuVVUNUvV VVnVNnunVvu = new NVuVVUNUvV("Макс цена незерита", "500000").UuUVuuUu(9);
   private final NVuVVUNUvV unNNVVNnvvV = new NVuVVUNUvV("Цена продажи", "700000").UuUVuuUu(9);
   private final nNUuNvVn NuunnvnN = new nNUuNvVn("Разброс цены", 5000.0F, 0.0F, 50000.0F, 100.0F, false);
   private final nNUuNvVn NVUunUNUN = new nNUuNvVn("Перевыставить (сек)", 30.0F, 5.0F, 120.0F, 1.0F, false);
   private final nNUuNvVn UUVNuUNUvUnV = new nNUuNvVn("Слоты аукциона", 5.0F, 1.0F, 50.0F, 1.0F, false);
   private final nNUuNvVn vuvnUnVnUNnV = new nNUuNvVn("Задержка (мс)", 350.0F, 100.0F, 1500.0F, 50.0F, false);
   private final nNUuNvVn nnuUVNUuvvVU = new nNUuNvVn("Скорость ротации", 8.0F, 2.0F, 20.0F, 1.0F, false);
   private final vvNnnUNnVvn nVVUuvuNnUN = new vvNnnUNnVvn("Отладка", true);
   private final VuNvNNvVV nNnVnUNVV = new VuNvNNvVV();
   private final VuNvNNvVV nuunNvv = new VuNvNNvVV();
   private final VuNvNNvVV uUVVvVVNvvn = new VuNvNNvVV();
   private final VuNvNNvVV vvUVNVvvNUv = new VuNvNNvVV();
   private final VuNvNNvVV UuNnnVnuNNV = new VuNvNNvVV();
   private final Queue<String> uUVvnUuNvvN = new ConcurrentLinkedQueue<>();
   private final Set<class_2338> UUuUnNVNuuv = new HashSet<>();
   private AutoFTCraftMembrana.nvnNNunvv NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.IDLE;
   private class_2338 NVuunNnvvvVu;
   private int vNnNuuvVn;
   private int VUuuVUnun;
   private int vVVuuVVv;
   private int VuunNUUUvu;
   private int NNUUNUuVNNVn;
   private int VvVvnNUnvuvV;
   private boolean ccOO0COcoco0;
   private boolean NUVvUUVuVNVv;
   private boolean nNuVunNUVu;
   private boolean UNvvunVVn;
   private boolean UnvuVuVnNuvu;
   private boolean UvNNVUVNVuvV;
   private boolean NnunUUnU;
   private boolean nvuVvuNnNUnv;
   private int NnVnNVN = 50;
   private int vnvvNvUnVv = -1;
   private int OCOocoOoOO;
   private long o0Ooc0COOoc;
   private long nvvnUnUn;
   private AutoFTCraftMembrana.nvnNNunvv UnUUVuVunvVu;
   private long nnvuvUNuUnN;
   private long UVnuVUUVnnU;
   private long VunnVNvNV;
   private float NvUVUvVVnUu;
   private float unnUnUNVnN;
   private float NnuUnUNnu;
   private float UnnnvvU;
   private float VUUnuVvVu;
   private float VvVuvUvvNNVv;
   private float UnnNNvuvvUU;
   private float VNNnnVUuvv;
   private float vUvUvUNNuNvn;

   public AutoFTCraftMembrana() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU,
            this.nVVUuvuNnUN
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.VuunNUUUvu();
      NVNnnvnuunNv = true;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.SYNC_AUCTION;
      this.UuUVuuUu("Включен", true);
   }

   @Override
   public void C00OOC00oO() {
      NVNnnvnuunNv = false;
      this.VuunNUUUvu();
      super.C00OOC00oO();
      this.UuUVuuUu("Выключен", true);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         try {
            if (this.uUVVvVVNvvn()) {
               this.uUnuvNvvNU(null);
            }

            this.nUUVuvU();
            if (this.UUuUnNVNuuv()) {
               this.nvvnUnUn = 0L;
               return;
            }

            if (this.NVuNUuVnVUN == AutoFTCraftMembrana.nvnNNunvv.MILK_COW) {
               if (this.vvUVNVvvNUv.UuUVuuUu(50L)) {
                  this.vvUVNVvvNUv.UuUVuuUu();
                  this.vNVuvnUUnuUn();
               }

               return;
            }

            if (this.NVuNUuVnVUN == AutoFTCraftMembrana.nvnNNunvv.REMOVE_UNSOLD) {
               this.nNvNUVU();
               return;
            }

            this.NNUUNUuVNNVn();
            if (!this.nNnVnUNVV.UuUVuuUu((long)this.vuvnUnVnUNnV.uUnuvNvvNU())) {
               return;
            }

            this.nNnVnUNVV.UuUVuuUu();
            this.UuuNnUvUuv();
         } catch (Throwable var3) {
            vVnvuVVUunuv.UuUVuuUu("§8[§6AutoFTCraftMembrana§8] §cОшибка: " + var3.getMessage());
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.IDLE;
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UUvNUNvUVnu var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null || this.UUuUnNVNuuv()) {
         this.nvvnUnUn = 0L;
      } else if (!this.uUVVvVVNvvn() || !this.uUnuvNvvNU(var1)) {
         if (this.vNnNuuvVn()) {
            this.nvvnUnUn = 0L;
         } else {
            this.C00OOC00oO(var1);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.uNNnnnuuuN() == uvUUuvnunU.NVnVnNnN.RECEIVE) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var6;
            try {
               var6 = var2.comp_763().getString();
            } catch (Throwable var5) {
               return;
            }

            String var4 = this.vVvUvVVuuNvV(var6).toLowerCase(Locale.ROOT);
            if (!var4.isBlank()) {
               this.uUVvnUuNvvN.add(var4);
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      int var1 = Math.max(0, this.nVVUuvuNnUN() - this.vuvnUnVnUNnV() - this.nnuUVNUuvvVU());
      switch (this.NVuNUuVnVUN) {
         case IDLE:
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
            break;
         case SYNC_AUCTION:
            this.UnUNuUU();
            break;
         case READ_AUCTION:
            this.uUVuVvuNUvnu();
            break;
         case CHECK:
            this.UnUNVVVNuv();
            break;
         case MILK_COW:
            this.vNVuvnUUnuUn();
            break;
         case BUY_DIAMOND:
            this.UuUVuuUu(class_1802.field_8477, this.c0oOOCcCoC0, "Алмаз", 64, var1 * 4);
            break;
         case BUY_NETHERITE:
            this.UuUVuuUu(class_1802.field_22020, this.VVnVNnunVvu, "Незеритовый слиток", 0, var1);
            break;
         case FIND_STATION:
            this.UvnvNVnnnnNU();
            break;
         case OPEN_STATION:
            this.uVUVnuvnuVuv();
            break;
         case CRAFT:
            this.uVunuUNVVUUV();
            break;
         case SELL:
            this.UNnVVNvvnVvU();
            break;
         case WAIT_SALES:
            this.uNnUnnuNUnNu();
            break;
         case OPEN_AUCTION:
            this.NnUuNNU();
            break;
         case REMOVE_UNSOLD:
            this.nNvNUVU();
      }
   }

   private void nUUVuvU() {
      String var1;
      while ((var1 = this.uUVvnUuNvvN.poll()) != null) {
         this.UuUVuuUu(var1);
      }
   }

   private void UuUVuuUu(String var1) {
      if (var1.contains("не хватает монет")) {
         this.nvuVvuNnNUnv = true;
         this.NVuunNnvvvVu();
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.WAIT_SALES;
         this.uUVVvVVNvvn.UuUVuuUu();
         this.UuUVuuUu("Недостаточно монет для покупки", true);
      } else if (var1.contains("освободите хранилище") || var1.contains("уберите предметы с продажи")) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.OPEN_AUCTION;
      } else if (!var1.contains("не можете продать воздух") && !var1.contains("не можете продать пустоту")) {
         if ((!var1.contains("выставлен") || !var1.contains("продаж")) && !var1.contains("listed")) {
            if (this.C00OOC00oO(var1)) {
               this.nvuVvuNnNUnv = false;
               this.VUuuVUnun++;
               this.uUVVvVVNvvn.UuUVuuUu();
               if (this.vuvnUnVnUNnV() > 0 && this.nnuUVNUuvvVU() < this.nVVUuvuNnUN()) {
                  this.NVUunUNUN();
               }
            }
         } else {
            this.VuunNUUUvu = 0;
         }
      } else {
         this.VuunNUUUvu++;
         if (this.vVVuuVVv > 0) {
            this.vVVuuVVv--;
         } else {
            this.vNnNuuvVn = Math.max(0, this.vNnNuuvVn - 1);
         }

         if (this.VuunNUUUvu >= 3) {
            this.VuunNUUUvu = 0;
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         } else {
            this.NVUunUNUN();
         }
      }
   }

   private void UnUNVVVNuv() {
      int var1 = this.C00OOC00oO(class_1802.field_8550);
      int var2 = this.C00OOC00oO(class_1802.field_8103);
      int var3 = this.C00OOC00oO(class_1802.field_8477);
      int var4 = this.C00OOC00oO(class_1802.field_22020);
      int var5 = this.vuvnUnVnUNnV();
      int var6 = this.nVVUuvuNnUN();
      int var7 = this.nnuUVNUuvvVU();
      int var9 = var5 + var7;
      int var10 = this.UuUVuuUu(var2, var3, var4);
      int var11 = Math.max(0, var6 - var9);
      int var12 = var11 * 4;
      if (var7 >= var6) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.WAIT_SALES;
         this.uUVVvVVNvvn.UuUVuuUu();
      } else if (var5 > 0 && var9 >= var6) {
         this.c0oOOCcCoC0();
      } else if (var2 < 4 && var1 > 0) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.MILK_COW;
      } else if (var10 > 0 && var9 < var6) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.FIND_STATION;
      } else if (this.nvuVvuNnNUnv && var11 > 0) {
         if (var5 > 0) {
            this.c0oOOCcCoC0();
         } else if (var7 > 0) {
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.WAIT_SALES;
         } else {
            if (var10 <= 0) {
               this.uNNnnnuuuN("Не хватает монет для закупки.");
            }
         }
      } else if (var3 < var12) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.BUY_DIAMOND;
         this.OCOocoOoOO = var3;
         this.ccOO0COcoco0 = false;
         this.NnunUUnU = false;
         this.nuunNvv.UuUVuuUu();
      } else if (var4 < var11) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.BUY_NETHERITE;
         this.OCOocoOoOO = var4;
         this.ccOO0COcoco0 = false;
         this.NnunUUnU = false;
         this.nuunNvv.UuUVuuUu();
      } else if (var2 >= 4 && var3 >= 4 && var4 >= 1 && var9 < var6) {
         this.nvuVvuNnNUnv = false;
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.FIND_STATION;
      } else {
         if (var2 < 4 && var1 == 0) {
            if (var5 > 0) {
               this.c0oOOCcCoC0();
               return;
            }

            this.uNNnnnuuuN("Нет пустых ведер для молока, выключаюсь.");
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.vNnNuuvVn()) {
         this.NVuunNnvvvVu();
         this.nuunNvv.UuUVuuUu();
      } else {
         class_10730 var1 = this.UvUvUNuvNU();
         if (var1 == null) {
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         } else if (uUnuvNvvNU.field_1724.method_5858(var1) > 20.25) {
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         } else if (this.UuUVuuUu(class_1802.field_8550)) {
            if (this.UuUVuuUu(var1, 4.5)) {
               uUnuvNvvNU.field_1761.method_2905(uUnuvNvvNU.field_1724, var1, class_1268.field_5808);
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               this.nuunNvv.UuUVuuUu();
               this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
            }
         }
      }
   }

   private void UuUVuuUu(class_1792 var1, NVuVVUNUvV var2, String var3, int var4, int var5) {
      class_1703 var6 = uUnuvNvvNU.field_1724.field_7512;
      int var7 = this.UuUVuuUu(var2);
      if (!this.vNnNuuvVn()) {
         if (!this.ccOO0COcoco0) {
            this.NVuunNnvvvVu();
            this.uUnuvNvvNU("ah search " + var3);
            this.NnVnNVN = 50;
            this.vnvvNvUnVv = -1;
            this.ccOO0COcoco0 = true;
            this.NnunUUnU = false;
            this.nuunNvv.UuUVuuUu();
         } else {
            if (this.nuunNvv.UuUVuuUu(3500L)) {
               this.ccOO0COcoco0 = false;
            }
         }
      } else {
         int var8 = this.C00OOC00oO(var1);
         if (var8 <= this.OCOocoOoOO && var8 < var5) {
            if (this.vnvvNvUnVv != var6.field_7763) {
               this.vnvvNvUnVv = var6.field_7763;
               this.nuunNvv.UuUVuuUu();
            } else if (this.nuunNvv.UuUVuuUu(550L)) {
               String var9 = this.NVuNUuVnVUN();
               boolean var10 = var9.contains("подтвержд") || var9.contains("покупк") || var9.contains("confirm") || var9.contains("подозрительн");
               if (this.NnunUUnU && !var10 && var6.field_7761.size() > 36) {
                  boolean var11 = false;
                  boolean var12 = false;
                  int var13 = var6.field_7761.size() - 36;

                  for (int var14 = 0; var14 < var13; var14++) {
                     class_1799 var15 = ((class_1735)var6.field_7761.get(var14)).method_7677();
                     if (var15.method_31574(class_1802.field_8581)) {
                        var11 = true;
                     }

                     if (var15.method_31574(class_1802.field_8879)) {
                        var12 = true;
                     }
                  }

                  if (var11 && var12) {
                     var10 = true;
                  }
               }

               if (var10) {
                  int var19 = this.vVvUvVVuuNvV(var6);
                  if (var19 >= 0) {
                     this.UuUVuuUu(var6, var19, 0, class_1713.field_7790);
                     this.NVuunNnvvvVu();
                     this.nuunNvv.UuUVuuUu();
                     this.NnunUUnU = false;
                     this.ccOO0COcoco0 = false;
                     this.nvuVvuNnNUnv = false;
                     this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
                  } else if (this.nuunNvv.UuUVuuUu(3000L)) {
                     this.NVuunNnvvvVu();
                     this.ccOO0COcoco0 = false;
                     this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
                  }
               } else if (this.NnunUUnU) {
                  if (this.nuunNvv.UuUVuuUu(2000L)) {
                     this.NnunUUnU = false;
                  }
               } else {
                  int var18 = Math.max(0, var6.field_7761.size() - 36);
                  int var20 = -1;
                  int var21 = Integer.MAX_VALUE;

                  for (int var22 = 0; var22 < var18; var22++) {
                     class_1735 var23 = (class_1735)var6.field_7761.get(var22);
                     if (var23.method_7681()) {
                        class_1799 var16 = var23.method_7677();
                        if (var16.method_31574(var1) && (var4 <= 0 || var16.method_7947() == var4)) {
                           int var17 = UNuvuNVuUnVu.C00OOC00oO(var23);
                           if (var17 > 0 && var17 <= var7 && var17 < var21) {
                              var21 = var17;
                              var20 = var22;
                           }
                        }
                     }
                  }

                  if (var20 < 0) {
                     if (this.nuunNvv.UuUVuuUu(1000L)) {
                        this.UuUVuuUu(var6);
                     }
                  } else {
                     this.UuUVuuUu(var6, var20, 0, class_1713.field_7790);
                     this.nuunNvv();
                     this.NnunUUnU = true;
                     this.nuunNvv.UuUVuuUu();
                  }
               }
            }
         } else {
            this.nvuVvuNnNUnv = false;
            this.NVuunNnvvvVu();
            this.ccOO0COcoco0 = false;
            this.NnunUUnU = false;
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         }
      }
   }

   private boolean UuUVuuUu(class_1703 var1) {
      if (this.NnVnNVN >= 0 && this.NnVnNVN < var1.field_7761.size()) {
         this.UuUVuuUu(var1, this.NnVnNVN, 0, class_1713.field_7790);
         this.NnVnNVN = this.NnVnNVN == 50 ? 48 : 50;
         this.nuunNvv.UuUVuuUu();
         return true;
      } else {
         return false;
      }
   }

   private void UvnvNVnnnnNU() {
      this.NVuunNnvvvVu = this.UUVNuUNUvUnV();
      if (this.NVuunNnvvvVu == null) {
         this.uNNnnnuuuN("Верстак рядом не найден, выключаюсь.");
      } else {
         this.NNUUNUuVNNVn = 0;
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.OPEN_STATION;
         this.nuunNvv.UuUVuuUu();
      }
   }

   private void uVUVnuvnuVuv() {
      if (this.NVuunNnvvvVu == null) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.FIND_STATION;
      } else if (this.vNnNuuvVn()) {
         this.NVuunNnvvvVu();
      } else if (!this.UuUVuuUu(this.NVuunNnvvvVu)) {
         this.NVuunNnvvvVu = null;
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.FIND_STATION;
      } else if (this.NNUUNUuVNNVn >= 5) {
         this.NVNnnvnuunNv();
      } else {
         class_3965 var1 = this.UuUVuuUu(this.NVuunNnvvvVu, 4.5);
         if (var1 == null) {
            if (this.nuunNvv.UuUVuuUu(1500L)) {
               this.NVNnnvnuunNv();
            }
         } else if (this.nuunNvv.UuUVuuUu(220L)) {
            uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            this.NNUUNUuVNNVn++;
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CRAFT;
            this.nuunNvv.UuUVuuUu();
         }
      }
   }

   private void NVNnnvnuunNv() {
      if (this.NVuunNnvvvVu != null) {
         this.UUuUnNVNuuv.add(this.NVuunNnvvvVu);
      }

      this.NVuunNnvvvVu = null;
      this.NNUUNUuVNNVn = 0;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.FIND_STATION;
      this.nuunNvv.UuUVuuUu();
   }

   private void uVunuUNVVUUV() {
      class_1703 var1 = uUnuvNvvNU.field_1724.field_7512;
      boolean var2 = var1 != null && uUnuvNvvNU.field_1755 != null && var1 != uUnuvNvvNU.field_1724.field_7498 && var1.field_7761.size() == 46;
      if (!var2) {
         if (this.nuunNvv.UuUVuuUu(1500L)) {
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.OPEN_STATION;
         }
      } else {
         this.UUuUnNVNuuv.clear();
         if (!var1.method_34255().method_7960()) {
            int var4 = this.UuUVuuUu(var1, var1.method_34255());
            if (var4 >= 0) {
               this.UuUVuuUu(var1, var4, 0, class_1713.field_7790);
            }
         } else {
            if (var1.method_7611(0).method_7681()) {
               class_1799 var3 = var1.method_7611(0).method_7677();
               if (this.UuUVuuUu(var3)) {
                  this.UuUVuuUu(var1, 0, 0, class_1713.field_7794);
                  return;
               }
            }

            if (this.C00OOC00oO(class_1802.field_8103) >= 4 && this.C00OOC00oO(class_1802.field_8477) >= 4 && this.C00OOC00oO(class_1802.field_22020) >= 1) {
               this.C00OOC00oO(var1);
            } else {
               this.NVuunNnvvvVu();
               this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
            }
         }
      }
   }

   private void UNnVVNvvnVvU() {
      int var1 = this.nVVUuvuNnUN();
      class_1703 var2 = uUnuvNvvNU.field_1724.field_7512;
      boolean var3 = var2 != null && uUnuvNvvNU.field_1755 != null && var2 != uUnuvNvvNU.field_1724.field_7498;
      if (this.nNuVunNUVu) {
         this.UuUVuuUu(var2, var3);
      } else {
         int var4 = this.vuvnUnVnUNnV();
         if (this.nnuUVNUuvvVU() >= var1 || var4 <= 0) {
            this.NuunnvnN();
         } else if (var3) {
            this.uUnuvNvvNU(var2);
         } else {
            if (!this.NUVvUUVuVNVv || this.nuunNvv.UuUVuuUu(3000L)) {
               this.NVuunNnvvvVu();
               this.uUnuvNvvNU("ah sellgui " + this.nNnVnUNVV());
               this.NUVvUUVuVNVv = true;
               this.nuunNvv.UuUVuuUu();
            }
         }
      }
   }

   private void UuUVuuUu(class_1703 var1, boolean var2) {
      if (!var2) {
         this.vVVuuVVv = 0;
         this.NuunnvnN();
      } else {
         if (!this.UNvvunVVn) {
            int var3 = this.uNNnnnuuuN(var1);
            if (var3 >= 0) {
               this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
               this.vNnNuuvVn = this.vNnNuuvVn + this.vVVuuVVv;
               this.vVVuuVVv = 0;
               this.UNvvunVVn = true;
               this.nuunNvv.UuUVuuUu();
            } else if (this.nuunNvv.UuUVuuUu(2000L)) {
               this.vVVuuVVv = 0;
               this.NuunnvnN();
            }
         } else if (this.nuunNvv.UuUVuuUu(2000L)) {
            this.NuunnvnN();
         }
      }
   }

   private void uNnUnnuNUnNu() {
      int var1 = this.vuvnUnVnUNnV();
      int var2 = this.nVVUuvuNnUN();
      long var3 = (long)(this.NVUunUNUN.uUnuvNvvNU() * 1000.0F);
      if (this.UvNNVUVNVuvV) {
         if (this.uUVVvVVNvvn.UuUVuuUu(var3)) {
            this.UvNNVUVNVuvV = false;
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.OPEN_AUCTION;
            this.nuunNvv.UuUVuuUu();
         }
      } else if (var1 + this.nnuUVNUuvvVU() < var2) {
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
      } else if (this.uUVVvVVNvvn.UuUVuuUu(var3)) {
         if (this.nnuUVNUuvvVU() > 0) {
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.OPEN_AUCTION;
         } else {
            this.vVVuuVVv();
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         }
      }
   }

   private void NnUuNNU() {
      this.NVuunNnvvvVu();
      this.uUnuvNvvNU("ah " + this.VUuuVUnun());
      this.vnvvNvUnVv = -1;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.REMOVE_UNSOLD;
      this.nuunNvv.UuUVuuUu();
      this.UuNnnVnuNNV.UuUVuuUu();
   }

   private void nNvNUVU() {
      class_1703 var1 = uUnuvNvvNU.field_1724.field_7512;
      if (!this.vNnNuuvVn()) {
         if (this.nuunNvv.UuUVuuUu(3000L)) {
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.OPEN_AUCTION;
         }
      } else if (this.vnvvNvUnVv != var1.field_7763) {
         this.vnvvNvUnVv = var1.field_7763;
         this.nuunNvv.UuUVuuUu();
         this.UuNnnVnuNNV.UuUVuuUu();
      } else if (this.nuunNvv.UuUVuuUu(550L)) {
         if (this.UuNnnVnuNNV.UuUVuuUu(78L)) {
            this.UuNnnVnuNNV.UuUVuuUu();
            int var2 = Math.max(0, var1.field_7761.size() - 36);

            for (int var3 = 0; var3 < var2; var3++) {
               class_1735 var4 = (class_1735)var1.field_7761.get(var3);
               if (var4.method_7681() && this.UuUVuuUu(var4.method_7677())) {
                  this.UuUVuuUu(var1, var3, 0, class_1713.field_7790);
                  return;
               }
            }

            this.NVuunNnvvvVu();
            this.vVVuuVVv();
            this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         }
      }
   }

   private void UnUNuUU() {
      this.NVuunNnvvvVu();
      this.uUnuvNvvNU("ah " + this.VUuuVUnun());
      this.VvVvnNUnvuvV++;
      this.vnvvNvUnVv = -1;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.READ_AUCTION;
      this.nuunNvv.UuUVuuUu();
   }

   private void uUVuVvuNUvnu() {
      class_1703 var1 = uUnuvNvvNU.field_1724.field_7512;
      if (!this.vNnNuuvVn()) {
         if (this.nuunNvv.UuUVuuUu(3000L)) {
            if (this.VvVvnNUnvuvV < 3) {
               this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.SYNC_AUCTION;
            } else {
               this.vVVuuVVv();
               this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
            }

            this.nuunNvv.UuUVuuUu();
         }
      } else if (this.vnvvNvUnVv != var1.field_7763) {
         this.vnvvNvUnVv = var1.field_7763;
         this.nuunNvv.UuUVuuUu();
      } else if (this.nuunNvv.UuUVuuUu(550L)) {
         int var2 = 0;
         int var3 = Math.max(0, var1.field_7761.size() - 36);

         for (int var4 = 0; var4 < var3; var4++) {
            if (this.UuUVuuUu(var1.method_7611(var4).method_7677())) {
               var2++;
            }
         }

         this.vNnNuuvVn = var2;
         this.VUuuVUnun = 0;
         this.vVVuuVVv = 0;
         this.NVuunNnvvvVu();
         this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.CHECK;
         this.nuunNvv.UuUVuuUu();
      }
   }

   private class_10730 UvUvUNuvNU() {
      class_10730 var1 = null;
      double var2 = Double.MAX_VALUE;
      class_238 var4 = new class_238(uUnuvNvvNU.field_1724.method_24515()).method_1014(4.0);

      for (class_1297 var6 : uUnuvNvvNU.field_1687.method_8335(uUnuvNvvNU.field_1724, var4)) {
         if (var6 instanceof class_10730 var7) {
            double var8 = uUnuvNvvNU.field_1724.method_5858(var7);
            if (var8 < var2) {
               var2 = var8;
               var1 = var7;
            }
         }
      }

      return var1;
   }

   private void C00OOC00oO(class_1703 var1) {
      int[] var2 = new int[]{1, 3, 7, 9};

      for (int var6 : var2) {
         this.UuUVuuUu(var1, var0 -> var0.method_31574(class_1802.field_8477), var6);
      }

      int[] var8 = new int[]{2, 4, 6, 8};

      for (int var7 : var8) {
         this.UuUVuuUu(var1, var0 -> var0.method_31574(class_1802.field_8103), var7);
      }

      this.UuUVuuUu(var1, var0 -> var0.method_31574(class_1802.field_22020), 5);
   }

   private void c0oOOCcCoC0() {
      this.NVuunNnvvvVu();
      this.VuunNUUUvu = 0;
      this.NUVvUUVuVNVv = false;
      this.nNuVunNUVu = false;
      this.UNvvunVVn = false;
      this.UnvuVuVnNuvu = false;
      this.vVVuuVVv = 0;
      this.UvNNVUVNVuvV = false;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.SELL;
      this.nuunNvv.UuUVuuUu();
   }

   private void uUnuvNvvNU(class_1703 var1) {
      if (this.nnuUVNUuvvVU() + this.vVVuuVVv >= this.nVVUuvuNnUN()) {
         this.VVnVNnunVvu();
      } else {
         int var2 = this.nuUnNvnuUu(var1);
         if (var2 < 0) {
            this.VVnVNnunVvu();
         } else if (this.VVuuUN(var1) < 0) {
            if (this.UnvuVuVnNuvu) {
               this.VVnVNnunVvu();
            } else {
               this.unNNVVNnvvV();
            }
         } else {
            this.UuUVuuUu(var1, var2, 0, class_1713.field_7790);

            while (this.UuUVuuUu(var1.method_34255()) && this.nnuUVNUuvvVU() + this.vVVuuVVv < this.nVVUuvuNnUN()) {
               int var3 = this.VVuuUN(var1);
               if (var3 < 0) {
                  break;
               }

               this.UuUVuuUu(var1, var3, 1, class_1713.field_7790);
               this.vVVuuVVv++;
               this.UnvuVuVnNuvu = true;
            }

            this.vNUvnnVnUvu(var1);
            boolean var4 = this.nnuUVNUuvvVU() + this.vVVuuVVv >= this.nVVUuvuNnUN() || this.VVuuUN(var1) < 0 || this.vuvnUnVnUNnV() <= 0;
            if (var4) {
               this.VVnVNnunVvu();
            } else {
               this.nuunNvv.UuUVuuUu();
            }
         }
      }
   }

   private void VVnVNnunVvu() {
      if (this.UnvuVuVnNuvu) {
         this.nNuVunNUVu = true;
         this.UNvvunVVn = false;
         this.nuunNvv.UuUVuuUu();
      } else {
         this.NuunnvnN();
      }
   }

   private void unNNVVNnvvV() {
      this.UvNNVUVNVuvV = true;
      this.UuUVuuUu("Нет свободных ячеек аукциона, жду", true);
      this.NuunnvnN();
   }

   private void NuunnvnN() {
      class_1703 var1 = uUnuvNvvNU.field_1724.field_7512;
      if (this.vNnNuuvVn()) {
         this.vNUvnnVnUvu(var1);
      }

      this.NVuunNnvvvVu();
      this.NUVvUUVuVNVv = false;
      this.nNuVunNUVu = false;
      this.UNvvunVVn = false;
      this.UnvuVuVnNuvu = false;
      this.vVVuuVVv = 0;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.WAIT_SALES;
      this.uUVVvVVNvvn.UuUVuuUu();
   }

   private void NVUunUNUN() {
      this.NUVvUUVuVNVv = false;
      this.nNuVunNUVu = false;
      this.UNvvunVVn = false;
      this.UnvuVuVnNuvu = false;
      this.vVVuuVVv = 0;
      this.UvNNVUVNVuvV = false;
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.SELL;
      this.nuunNvv.UuUVuuUu();
   }

   private void UuUVuuUu(class_1703 var1, Predicate<class_1799> var2, int var3) {
      class_1735 var4 = var1.method_7611(var3);
      if (var4.method_7681()) {
         if (!var2.test(var4.method_7677())) {
            this.UuUVuuUu(var1, var3, 0, class_1713.field_7794);
         }
      } else {
         int var5 = this.UuUVuuUu(var1, var2);
         if (var5 >= 0) {
            this.UuUVuuUu(var1, var5, 0, class_1713.field_7790);
            this.UuUVuuUu(var1, var3, 1, class_1713.field_7790);
            if (!var1.method_34255().method_7960()) {
               this.UuUVuuUu(var1, var5, 0, class_1713.field_7790);
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1792 var1) {
      if (this.vNnNuuvVn()) {
         return false;
      } else {
         int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(var1)) {
            return true;
         } else {
            for (int var3 = 0; var3 <= 8; var3++) {
               if (uUnuvNvvNU.field_1724.method_31548().method_5438(var3).method_31574(var1)) {
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
                  uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2868(var3));
                  return true;
               }
            }

            for (int var4 = 9; var4 < 36; var4++) {
               if (uUnuvNvvNU.field_1724.method_31548().method_5438(var4).method_31574(var1)) {
                  uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var4, var2, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  return uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(var1);
               }
            }

            return false;
         }
      }
   }

   private int vVvUvVVuuNvV(class_1703 var1) {
      int var2 = Math.max(0, var1.field_7761.size() - 36);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1799 var4 = ((class_1735)var1.field_7761.get(var3)).method_7677();
         if (!var4.method_7960()
            && (var4.method_31574(class_1802.field_8581) || this.C00OOC00oO(var4).contains("купить") || this.C00OOC00oO(var4).contains("confirm"))) {
            return var3;
         }
      }

      return -1;
   }

   private int uNNnnnuuuN(class_1703 var1) {
      int var2 = Math.max(0, var1.field_7761.size() - 36);

      for (int var3 = 0; var3 < var2; var3++) {
         class_1799 var4 = ((class_1735)var1.field_7761.get(var3)).method_7677();
         if (!var4.method_7960()) {
            String var5 = this.C00OOC00oO(var4);
            if (var5.contains("подтверд") || var5.contains("confirm")) {
               return var3;
            }
         }
      }

      return -1;
   }

   private int UuUVuuUu(class_1703 var1, Predicate<class_1799> var2) {
      for (int var3 = 10; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = (class_1735)var1.field_7761.get(var3);
         if (var4.method_7681() && var2.test(var4.method_7677())) {
            return var3;
         }
      }

      return -1;
   }

   private int UuUVuuUu(class_1703 var1, class_1799 var2) {
      for (int var3 = 10; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = (class_1735)var1.field_7761.get(var3);
         if (var4.method_7681() && var4.method_7677().method_31574(var2.method_7909()) && var4.method_7677().method_7947() < var4.method_7677().method_7914()) {
            return var3;
         }
      }

      for (int var5 = 10; var5 < var1.field_7761.size(); var5++) {
         if (!((class_1735)var1.field_7761.get(var5)).method_7681()) {
            return var5;
         }
      }

      return -1;
   }

   private int nuUnNvnuUu(class_1703 var1) {
      int var2 = Math.max(0, var1.field_7761.size() - 36);

      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = (class_1735)var1.field_7761.get(var3);
         if (var4.method_7681() && this.UuUVuuUu(var4.method_7677())) {
            return var3;
         }
      }

      return -1;
   }

   private int VVuuUN(class_1703 var1) {
      int var2 = Math.max(0, var1.field_7761.size() - 36);

      for (int var3 = 0; var3 < var2; var3++) {
         if (!((class_1735)var1.field_7761.get(var3)).method_7681()) {
            return var3;
         }
      }

      return -1;
   }

   private void vNUvnnVnUvu(class_1703 var1) {
      class_1799 var2 = var1.method_34255();
      if (!var2.method_7960()) {
         int var3 = Math.max(0, var1.field_7761.size() - 36);

         for (int var4 = var3; var4 < var1.field_7761.size(); var4++) {
            class_1799 var5 = ((class_1735)var1.field_7761.get(var4)).method_7677();
            if (var5.method_31574(var2.method_7909()) && var5.method_7947() < var5.method_7914()) {
               this.UuUVuuUu(var1, var4, 0, class_1713.field_7790);
               return;
            }
         }

         for (int var6 = var3; var6 < var1.field_7761.size(); var6++) {
            if (!((class_1735)var1.field_7761.get(var6)).method_7681()) {
               this.UuUVuuUu(var1, var6, 0, class_1713.field_7790);
               return;
            }
         }
      }
   }

   private class_2338 UUVNuUNUvUnV() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      class_2339 var2 = new class_2339();
      ArrayList var3 = new ArrayList();

      for (int var4 = -4; var4 <= 4; var4++) {
         for (int var5 = -2; var5 <= 2; var5++) {
            for (int var6 = -4; var6 <= 4; var6++) {
               var2.method_10103(var1.method_10263() + var4, var1.method_10264() + var5, var1.method_10260() + var6);
               if (this.UuUVuuUu(var2) && !this.UUuUnNVNuuv.contains(var2) && !(uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var2)) > 25.0)) {
                  var3.add(var2.method_10062());
               }
            }
         }
      }

      return var3.isEmpty() ? null : (class_2338)var3.get(ThreadLocalRandom.current().nextInt(var3.size()));
   }

   private boolean UuUVuuUu(class_2338 var1) {
      return uUnuvNvvNU.field_1687.method_8320(var1).method_27852(class_2246.field_9980);
   }

   private boolean UuUVuuUu(class_1799 var1) {
      return var1 != null && !var1.method_7960()
         ? var1.method_31574(class_1802.field_8614) && (vnVVvun.VuunNUUUvu(var1) || this.C00OOC00oO(var1).contains("божья аура"))
         : false;
   }

   private int C00OOC00oO(class_1792 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 36; var3++) {
         class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
         if (!var4.method_7960() && var4.method_31574(var1)) {
            var2 += var4.method_7947();
         }
      }

      return var2;
   }

   private int vuvnUnVnUNnV() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (this.UuUVuuUu(var3)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private int nnuUVNUuvvVU() {
      return Math.max(0, this.vNnNuuvVn - this.VUuuVUnun);
   }

   private int nVVUuvuNnUN() {
      return Math.max(1, (int)this.UUVNuUNUvUnV.uUnuvNvvNU());
   }

   private int UuUVuuUu(int var1, int var2, int var3) {
      return var1 < 4 ? 0 : Math.max(0, Math.min(var2 / 4, var3));
   }

   private int UuUVuuUu(NVuVVUNUvV var1) {
      String var2 = var1.uUnuvNvvNU();
      if (var2 == null) {
         return 0;
      } else {
         String var3 = var2.replaceAll("[^0-9]", "");
         if (var3.isBlank()) {
            return 0;
         } else {
            try {
               long var4 = Long.parseLong(var3);
               return var4 > 2147483647L ? Integer.MAX_VALUE : (int)var4;
            } catch (NumberFormatException var6) {
               return 0;
            }
         }
      }
   }

   private int nNnVnUNVV() {
      int var1 = this.UuUVuuUu(this.unNNVVNnvvV);
      int var2 = (int)this.NuunnvnN.uUnuvNvvNU();
      if (var2 <= 0) {
         return var1;
      } else {
         int var3 = Math.max(1, var1 - var2);
         int var4 = var1 + var2;
         return var3 + (int)(Math.random() * (var4 - var3 + 1));
      }
   }

   private AutoFTCraftMembrana.NVnVnNnN UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
      return new AutoFTCraftMembrana.NVnVnNnN(var9, class_3532.method_15363(var10, -90.0F, 90.0F));
   }

   private void C00OOC00oO(UUvNUNvUVnu var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         class_243 var2 = null;
         if (this.NVuNUuVnVUN == AutoFTCraftMembrana.nvnNNunvv.MILK_COW) {
            class_10730 var3 = this.UvUvUNuvNU();
            if (var3 != null) {
               var2 = var3.method_19538().method_1031(0.0, Math.min(1.15, var3.method_17682() * 0.72), 0.0);
            }
         } else if (this.NVuNUuVnVUN == AutoFTCraftMembrana.nvnNNunvv.OPEN_STATION && this.NVuunNnvvvVu != null) {
            var2 = class_243.method_24953(this.NVuunNnvvvVu);
         }

         if (var2 == null) {
            this.nvvnUnUn = 0L;
         } else {
            this.UuUVuuUu(var2, var1);
         }
      }
   }

   private void nuunNvv() {
      if (uUnuvNvvNU.field_1724 != null) {
         long var1 = System.currentTimeMillis();
         long var3 = ThreadLocalRandom.current().nextLong(500L, 901L);
         this.nnvuvUNuUnN = var1;
         this.UVnuVUUVnnU = var1 + var3;
         this.VunnVNvNV = 0L;
         this.NvUVUvVVnUu = uUnuvNvvNU.field_1724.method_36454();
         this.unnUnUNVnN = uUnuvNvvNU.field_1724.method_36455();
         this.NnuUnUNnu = (float)ThreadLocalRandom.current().nextDouble(0.0, Math.PI * 2);
         this.UnnnvvU = ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F;
         this.VUUnuVvVu = (float)ThreadLocalRandom.current().nextDouble(8.0, 28.0);
         this.VvVuvUvvNNVv = (float)ThreadLocalRandom.current().nextDouble(3.0, 12.0);
         this.UnnNNvuvvUU = this.UnnnvvU * (float)ThreadLocalRandom.current().nextDouble(4.0, 16.0);
         this.VNNnnVUuvv = (float)ThreadLocalRandom.current().nextDouble(-5.0, 5.0);
         this.vUvUvUNNuNvn = (float)ThreadLocalRandom.current().nextDouble(0.1, 0.3);
      }
   }

   private boolean uUVVvVVNvvn() {
      return this.UVnuVUUVnnU > 0L && System.currentTimeMillis() < this.UVnuVUUVnnU;
   }

   private boolean uUnuvNvvNU(UUvNUNvUVnu var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         long var2 = System.currentTimeMillis();
         if (var2 < this.UVnuVUUVnnU && this.nnvuvUNuUnN > 0L) {
            float var4 = Math.max(1.0F, (float)(this.UVnuVUUVnnU - this.nnvuvUNuUnN));
            float var5 = class_3532.method_15363((float)(var2 - this.nnvuvUNuUnN) / var4, 0.0F, 1.0F);
            float var6 = var5 * var5 * (3.0F - 2.0F * var5);
            float var7 = this.NnuUnUNnu + var6 * 5.3407073F;
            float var8 = this.NvUVUvVVnUu + (float)Math.sin(var7) * this.VUUnuVvVu + this.UnnNNvuvvUU * var6;
            float var9 = this.unnUnUNVnN + (float)Math.sin(var7 * 0.55F) * this.VvVuvUvvNNVv + this.VNNnnVUuvv * var6;
            float var10 = uUnuvNvvNU.field_1724.method_36454();
            float var11 = uUnuvNvvNU.field_1724.method_36455();
            float var12 = this.vvUVNVvvNUv();
            float var13 = 1.0F - (float)Math.pow(1.0F - this.vUvUvUNNuNvn, var12);
            float var14 = var10 + class_3532.method_15393(var8 - var10) * var13;
            float var15 = var11 + (class_3532.method_15363(var9, -89.0F, 89.0F) - var11) * var13;
            uUnuvNvvNU.field_1724.method_36456(var14);
            uUnuvNvvNU.field_1724.method_36457(var15);
            uUnuvNvvNU.field_1724.field_6241 = var14;
            if (var1 != null) {
               var1.UuUVuuUu(var14);
               var1.C00OOC00oO(var15);
            }

            return true;
         } else {
            this.UuNnnVnuNNV();
            return false;
         }
      }
   }

   private float vvUVNVvvNUv() {
      long var1 = System.nanoTime();
      if (this.VunnVNvNV == 0L) {
         this.VunnVNvNV = var1;
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.VunnVNvNV) / 1.6666667E7F;
         this.VunnVNvNV = var1;
         return class_3532.method_15363(var3, 0.25F, 4.0F);
      }
   }

   private void UuNnnVnuNNV() {
      this.nnvuvUNuUnN = 0L;
      this.UVnuVUUVnnU = 0L;
      this.VunnVNvNV = 0L;
   }

   private void UuUVuuUu(class_243 var1, UUvNUNvUVnu var2) {
      AutoFTCraftMembrana.NVnVnNnN var3 = this.UuUVuuUu(var1);
      float var4 = this.uUVvnUuNvvN();
      float var5 = class_3532.method_15363(this.nnuUVNUuvvVU.uUnuvNvvNU() / 100.0F, 0.02F, 0.2F);
      float var6 = 1.0F - (float)Math.pow(1.0F - var5, var4);
      float var7 = uUnuvNvvNU.field_1724.method_36454();
      float var8 = uUnuvNvvNU.field_1724.method_36455();
      float var9 = class_3532.method_15393(var3.yaw - var7);
      float var10 = var3.pitch - var8;
      float var11 = var7 + var9 * var6;
      float var12 = class_3532.method_15363(var8 + var10 * var6, -90.0F, 90.0F);
      uUnuvNvvNU.field_1724.method_36456(var11);
      uUnuvNvvNU.field_1724.method_36457(var12);
      uUnuvNvvNU.field_1724.field_6241 = var11;
      uUnuvNvvNU.field_1724.field_6283 = var11;
      var2.UuUVuuUu(var11);
      var2.C00OOC00oO(var12);
   }

   private float uUVvnUuNvvN() {
      long var1 = System.nanoTime();
      if (this.nvvnUnUn == 0L) {
         this.nvvnUnUn = var1;
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.nvvnUnUn) / 1.6666667E7F;
         this.nvvnUnUn = var1;
         return class_3532.method_15363(var3, 0.25F, 4.0F);
      }
   }

   private boolean UuUVuuUu(class_10730 var1, double var2) {
      class_3966 var4 = VuUVUvnU.C00OOC00oO(uUnuvNvvNU.field_1724.method_36454(), uUnuvNvvNU.field_1724.method_36455(), var2, var1, false);
      return var4 != null && var4.method_17782() == var1;
   }

   private class_3965 UuUVuuUu(class_2338 var1, double var2) {
      class_243 var4 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var5 = uUnuvNvvNU.field_1724.method_5828(1.0F);
      class_243 var6 = var4.method_1019(var5.method_1021(var2));
      if (uUnuvNvvNU.field_1687.method_17742(new class_3959(var4, var6, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724)) instanceof class_3965 var8
         )
       {
         return var8.method_17777().equals(var1) ? var8 : null;
      } else {
         return null;
      }
   }

   private boolean UUuUnNVNuuv() {
      return PlayerHelper.UuuNnUvUuv() || PlayerHelper.nVVUuvuNnUN || PlayerHelper.nNnVnUNVV || uUnuvNvvNU.field_1724.method_6115();
   }

   private String C00OOC00oO(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         try {
            return this.vVvUvVVuuNvV(var1.method_7964().getString()).toLowerCase(Locale.ROOT);
         } catch (Throwable var3) {
            return "";
         }
      } else {
         return "";
      }
   }

   private String NVuNUuVnVUN() {
      if (uUnuvNvvNU.field_1755 == null) {
         return "";
      } else {
         try {
            class_2561 var1 = uUnuvNvvNU.field_1755.method_25440();
            return var1 == null ? "" : this.vVvUvVVuuNvV(var1.getString()).toLowerCase(Locale.ROOT);
         } catch (Throwable var2) {
            return "";
         }
      }
   }

   private boolean C00OOC00oO(String var1) {
      return (var1.contains("купили") || var1.contains("куплен")) && (var1.contains("аура") || var1.contains("мембран") || var1.contains("membrane"));
   }

   private void UuUVuuUu(class_1703 var1, int var2, int var3, class_1713 var4) {
      uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, var3, var4, uUnuvNvvNU.field_1724);
   }

   private void NVuunNnvvvVu() {
      if (this.vNnNuuvVn()) {
         uUnuvNvvNU.field_1724.method_7346();
      }
   }

   private boolean vNnNuuvVn() {
      return uUnuvNvvNU.field_1755 != null && uUnuvNvvNU.field_1724.field_7512 != null && uUnuvNvvNU.field_1724.field_7512 != uUnuvNvvNU.field_1724.field_7498;
   }

   private void uUnuvNvvNU(String var1) {
      uUnuvNvvNU.field_1724.field_3944.method_45730(var1);
   }

   private String VUuuVUnun() {
      try {
         return uUnuvNvvNU.field_1724.method_5477().getString();
      } catch (Throwable var2) {
         return "";
      }
   }

   private String vVvUvVVuuNvV(String var1) {
      if (var1 == null) {
         return "";
      } else {
         String var2;
         try {
            var2 = class_124.method_539(var1);
         } catch (Throwable var4) {
            var2 = var1;
         }

         return var2 == null ? "" : var2.replace(' ', ' ').trim();
      }
   }

   private void vVVuuVVv() {
      this.vNnNuuvVn = 0;
      this.VUuuVUnun = 0;
      this.vVVuuVVv = 0;
      this.VuunNUUUvu = 0;
   }

   private void VuunNUUUvu() {
      this.NVuunNnvvvVu = null;
      this.UUuUnNVNuuv.clear();
      this.NNUUNUuVNNVn = 0;
      this.ccOO0COcoco0 = false;
      this.NUVvUUVuVNVv = false;
      this.nNuVunNUVu = false;
      this.UNvvunVVn = false;
      this.UnvuVuVnNuvu = false;
      this.UvNNVUVNVuvV = false;
      this.NnunUUnU = false;
      this.nvuVvuNnNUnv = false;
      this.NnVnNVN = 50;
      this.vnvvNvUnVv = -1;
      this.VvVvnNUnvuvV = 0;
      this.OCOocoOoOO = 0;
      this.o0Ooc0COOoc = 0L;
      this.nvvnUnUn = 0L;
      this.UnUUVuVunvVu = null;
      this.UuNnnVnuNNV();
      this.uUVvnUuNvvN.clear();
      this.vVVuuVVv();
      this.nNnVnUNVV.UuUVuuUu();
      this.nuunNvv.UuUVuuUu();
      this.uUVVvVVNvvn.UuUVuuUu();
      this.vvUVNVvvNUv.UuUVuuUu();
      this.UuNnnVnuNNV.UuUVuuUu();
      this.NVuNUuVnVUN = AutoFTCraftMembrana.nvnNNunvv.IDLE;
   }

   private void UuUVuuUu(String var1, boolean var2) {
      if (this.nVVUuvuNnUN.uUnuvNvvNU()) {
         if (!var2) {
            long var3 = System.currentTimeMillis();
            if (this.UnUUVuVunvVu == this.NVuNUuVnVUN && var3 - this.o0Ooc0COOoc < 2500L) {
               return;
            }

            this.UnUUVuVunvVu = this.NVuNUuVnVUN;
            this.o0Ooc0COOoc = var3;
         }

         vVnvuVVUunuv.UuUVuuUu("§8[§6AutoFTCraftMembrana§8] §7[" + this.NVuNUuVnVUN + "] §f" + var1);
      }
   }

   private void NNUUNUuVNNVn() {
      if (this.nVVUuvuNnUN.uUnuvNvvNU()) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.o0Ooc0COOoc >= 5000L) {
            if (this.UnUUVuVunvVu == this.NVuNUuVnVUN) {
               vVnvuVVUunuv.UuUVuuUu(
                  "§8[§6AutoFTCraftMembrana§8] §7["
                     + this.NVuNUuVnVUN
                     + "] §fMilk="
                     + this.C00OOC00oO(class_1802.field_8103)
                     + " Dia="
                     + this.C00OOC00oO(class_1802.field_8477)
                     + " Neth="
                     + this.C00OOC00oO(class_1802.field_22020)
                     + " Crafted="
                     + this.vuvnUnVnUNnV()
                     + " AH="
                     + this.nnuUVNUuvvVU()
                     + "/"
                     + this.nVVUuvuNnUN()
               );
               this.o0Ooc0COOoc = var1;
            }
         }
      }
   }

   private void uNNnnnuuuN(String var1) {
      vVnvuVVUunuv.UuUVuuUu("§8[§6AutoFTCraftMembrana§8] §c" + var1);
      if (this.nuUnNvnuUu) {
         this.a_();
      }
   }

   record NVnVnNnN(float yaw, float pitch) {
   }

   static enum nvnNNunvv {
      IDLE,
      SYNC_AUCTION,
      READ_AUCTION,
      CHECK,
      MILK_COW,
      BUY_DIAMOND,
      BUY_NETHERITE,
      FIND_STATION,
      OPEN_STATION,
      CRAFT,
      SELL,
      WAIT_SALES,
      OPEN_AUCTION,
      REMOVE_UNSOLD;
   }
}
