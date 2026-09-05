package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_2868;
import net.minecraft.class_476;
import net.minecraft.class_7439;
import net.minecraft.class_8646;
import net.minecraft.class_9011;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class nNuuUUuvVU extends UNUuvUN {
   private static final int UuUVuuUu = 1;
   private static final int C00OOC00oO = 66;
   private static final long uUnuvNvvNU = 180L;
   private static final long vVvUvVVuuNvV = 650L;
   private static final long uNNnnnuuuN = 20000L;
   private static final long nuUnNvnuUu = 1000L;
   private static final long VVuuUN = 300000L;
   private static final long vNUvnnVnUvu = 600000L;
   private static nNuuUUuvVU uVUuuVnNVU;
   private static final Pattern vuuuNvNuv = Pattern.compile(
      "(?iu)(?:клан\\s*лайт|кланлайт|clan\\s*lite|clanlite|лайт|lite|анарх(?:ия|ии)?|anarchy)[^\\d#№]{0,24}[#№]?\\s*(\\d{1,2})(?!\\d)"
   );
   private static final Pattern nUUVuvU = Pattern.compile("(?u)[#№]\\s*(\\d{1,2})(?!\\d)");
   private static final Pattern UnUNVVVNuv = Pattern.compile("(?iu)анарх(?:ия)?\\s*[-#№]?\\s*(\\d{1,2})(?!\\d)");
   private int vNVuvnUUnuUn = -1;
   private boolean UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv;
   private boolean NVNnnvnuunNv;
   private boolean uVunuUNVVUUV;
   private long UNnVVNvvnVvU;
   private long uNnUnnuNUnNu;
   private long NnUuNNU;
   private long nNvNUVU;
   private long UnUNuUU;
   private boolean uUVuVvuNUvnu;
   private long UvUvUNuvNU;

   public nNuuUUuvVU() {
      super("rct", "Перезаход на выбранную Лайт анархию", ".rct [1-66]");
      uVUuuVnNVU = this;
   }

   public static nNuuUUuvVU vVvUvVVuuNvV() {
      return uVUuuVnNVU;
   }

   public void UuUVuuUu(boolean var1) {
      if (this.uUVuVvuNUvnu != var1) {
         this.uUVuVvuNUvnu = var1;
         this.UvUvUNuvNU = var1 ? this.uNNnnnuuuN() : 0L;
      }
   }

   private long uNNnnnuuuN() {
      return System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(300000L, 600001L);
   }

   private void nuUnNvnuUu() {
      if (this.uUVuVvuNUvnu) {
         if (this.UvUvUNuvNU == 0L) {
            this.UvUvUNuvNU = this.uNNnnnuuuN();
         } else if (System.currentTimeMillis() >= this.UvUvUNuvNU) {
            int var1 = this.UuUVuuUu(this.vNUvnnVnUvu());
            this.UvUvUNuvNU = this.uNNnnnuuuN();
            this.C00OOC00oO(new String[]{String.valueOf(var1)});
         }
      }
   }

   private int UuUVuuUu(int var1) {
      byte var2 = 66;
      if (var2 <= 1) {
         return 1;
      } else {
         int var3;
         do {
            var3 = 1 + ThreadLocalRandom.current().nextInt(var2);
         } while (var3 == var1);

         return var3;
      }
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (a_.field_1724 != null && a_.field_1724.field_3944 != null) {
         if (var1.length > 1) {
            this.nUUVuvU();
         } else {
            int var2;
            if (var1.length == 0) {
               var2 = this.uVUuuVnNVU();
               if (var2 < 1 || var2 > 66) {
                  vVnvuVVUunuv.UuUVuuUu("§c[RCT] Ошибка парса");
                  return;
               }
            } else {
               var2 = this.C00OOC00oO(var1[0]);
               if (var2 < 1 || var2 > 66) {
                  vVnvuVVUunuv.UuUVuuUu("§c[RCT] Номер анархии должен быть от 1 до 66.");
                  return;
               }
            }

            this.vNVuvnUUnuUn = var2;
            this.UvnvNVnnnnNU = true;
            this.NVNnnvnuunNv = false;
            this.uVunuUNVVUUV = false;
            this.UNnVVNvvnVvU = System.currentTimeMillis();
            this.uNnUnnuNUnNu = this.UNnVVNvvnVvU;
            this.NnUuNNU = 0L;
            this.nNvNUVU = 0L;
            this.UnUNuUU = 0L;
            this.uVUVnuvnuVuv = this.vuuuNvNuv();
            if (a_.field_1755 != null) {
               a_.field_1724.method_3137();
            }

            if (this.uVUVnuvnuVuv) {
               a_.field_1724.field_3944.method_45730("hub");
               a_.field_1724.field_3944.method_45730("an" + this.vNVuvnUUnuUn);
               this.UnUNuUU = this.UNnVVNvvnVvU + 1000L;
               vVnvuVVUunuv.UuUVuuUu("§7[RCT] FunTime переход на анархию §f#" + this.vNVuvnUUnuUn + "§7...");
            } else {
               a_.field_1724.field_3944.method_45730("hub");
               vVnvuVVUunuv.UuUVuuUu("§7[RCT] Переход на Лайт анархию §f#" + this.vNVuvnUUnuUn + "§7...");
            }
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("§c[RCT] Игрок не подключен к серверу.");
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (a_.field_1724 != null && a_.field_1687 != null && a_.field_1761 != null) {
         if (!this.UvnvNVnnnnNU) {
            this.nuUnNvnuUu();
         } else {
            long var2 = System.currentTimeMillis();
            if (var2 - this.UNnVVNvvnVvU > 20000L) {
               this.uNNnnnuuuN("Истекло время ожидания меню или подключения.");
            } else if (this.uVUVnuvnuVuv) {
               this.UuUVuuUu(var2);
            } else if (this.uVunuUNVVUUV && this.vNUvnnVnUvu() == this.vNVuvnUUnuUn) {
               this.nvUVNnuu();
            } else if (this.uVunuUNVVUUV && var2 - this.NnUuNNU > 8000L) {
               this.uNNnnnuuuN("Сервер не подтвердил подключение к анархии #" + this.vNVuvnUUnuUn + ".");
            } else if (a_.field_1755 instanceof class_476 var4) {
               this.UuUVuuUu(var4, var2);
            } else {
               if (var2 - this.uNnUnnuNUnNu >= 650L) {
                  this.VVuuUN();
                  this.uNnUnnuNUnNu = var2;
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_476 var1, long var2) {
      if (var2 - this.uNnUnnuNUnNu >= 180L) {
         String var4 = this.vVvUvVVuuNvV(var1.method_25440().getString());
         if (!var4.contains("выберите режим") && !var4.contains("select mode")) {
            if (var4.contains("выбор лайт анархии") || var4.contains("lite anarchy")) {
               class_1735 var8 = this.C00OOC00oO(var1);
               if (var8 == null) {
                  if (this.NVNnnvnuunNv && var2 - this.uNnUnnuNUnNu >= 1200L) {
                     this.NVNnnvnuunNv = false;
                  }

                  if (!this.NVNnnvnuunNv) {
                     List var6 = this.uUnuvNvvNU(var1)
                        .stream()
                        .filter(var0 -> var0.method_7677().method_31574(class_1802.field_8694))
                        .sorted(Comparator.comparingInt(var0 -> var0.field_7874))
                        .toList();
                     int var7 = this.uUnuvNvvNU(this.vNVuvnUUnuUn);
                     if (var7 >= 0 && var7 < var6.size()) {
                        this.UuUVuuUu(var1, (class_1735)var6.get(var7));
                        this.NVNnnvnuunNv = true;
                        this.uNnUnnuNUnNu = var2;
                     }
                  }
               } else {
                  if (!this.uVunuUNVVUUV || var2 - this.uNnUnnuNUnNu >= 1200L) {
                     this.UuUVuuUu(var1, var8);
                     this.uVunuUNVVUUV = true;
                     this.NnUuNNU = var2;
                     this.uNnUnnuNUnNu = var2;
                  }
               }
            }
         } else {
            if (this.nNvNUVU == 0L) {
               this.nNvNUVU = var2;
            }

            class_1735 var5 = this.UuUVuuUu(var1);
            if (var5 != null) {
               this.UuUVuuUu(var1, var5, class_1713.field_7790);
               this.NVNnnvnuunNv = false;
               this.nNvNUVU = 0L;
               this.uNnUnnuNUnNu = var2;
            } else if (var2 - this.nNvNUVU >= 3000L) {
               this.uNNnnnuuuN("Режим Лайт отсутствует в меню выбора.");
            }
         }
      }
   }

   private class_1735 UuUVuuUu(class_476 var1) {
      class_1735 var2 = null;

      for (class_1735 var4 : this.uUnuvNvvNU(var1)) {
         class_1799 var5 = var4.method_7677();
         if (var5.method_31574(class_1802.field_8575)) {
            String var6 = this.vVvUvVVuuNvV(var5.method_7964().getString());
            if (var6.equals("лайт") || var6.equals("lite")) {
               return var4;
            }

            String var7 = this.UuUVuuUu(var5);
            if ((var7.contains("анархия лайт") || var7.contains("lite anarchy"))
               && (var7.matches("(?s).*анархия\\s*1\\D+16.*") || var7.matches("(?s).*anarchy\\s*1\\D+16.*"))) {
               var2 = var4;
            }
         }
      }

      return var2;
   }

   private class_1735 C00OOC00oO(class_476 var1) {
      Pattern var2 = Pattern.compile("(?iu)#\\s*0*" + this.vNVuvnUUnuUn + "(?!\\d)");

      for (class_1735 var4 : this.uUnuvNvvNU(var1)) {
         class_1799 var5 = var4.method_7677();
         if (!var5.method_7960() && !var5.method_31574(class_1802.field_8694) && var2.matcher(this.UuUVuuUu(var5)).find()) {
            return var4;
         }
      }

      return null;
   }

   private List<class_1735> uUnuvNvvNU(class_476 var1) {
      ArrayList var2 = new ArrayList();
      class_1703 var3 = var1.method_17577();

      for (class_1735 var5 : var3.field_7761) {
         if (a_.field_1724 == null || var5.field_7871 != a_.field_1724.method_31548()) {
            var2.add(var5);
         }
      }

      return var2;
   }

   private String UuUVuuUu(class_1799 var1) {
      StringBuilder var2 = new StringBuilder(var1.method_7964().getString());
      class_9290 var3 = (class_9290)var1.method_58694(class_9334.field_49632);
      if (var3 != null) {
         for (class_2561 var5 : var3.comp_2400()) {
            var2.append(' ').append(var5.getString());
         }
      }

      return this.vVvUvVVuuNvV(var2.toString());
   }

   private void UuUVuuUu(class_476 var1, class_1735 var2) {
      this.UuUVuuUu(var1, var2, class_1713.field_7794);
   }

   private void UuUVuuUu(class_476 var1, class_1735 var2, class_1713 var3) {
      a_.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var2.field_7874, 0, var3, a_.field_1724);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (this.UvnvNVnnnnNU && var1.uNNnnnuuuN() == uvUUuvnunU.NVnVnNnN.RECEIVE) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var4 = this.vVvUvVVuuNvV(var2.comp_763().getString());
            if (!var4.isEmpty()) {
               if (!this.uVunuUNVVUUV || !var4.contains("вы уже подключены к этому серверу") && !var4.contains("already connected to this server")) {
                  if (this.uUnuvNvvNU(var4)) {
                     this.uNNnnnuuuN("Подключение не выполнено: " + var2.comp_763().getString());
                  }
               } else {
                  this.nvUVNnuu();
               }
            }
         }
      }
   }

   private void VVuuUN() {
      class_1661 var1 = a_.field_1724.method_31548();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.method_5438(var2).method_31574(class_1802.field_8251)) {
            if (var1.method_67532() != var2) {
               var1.method_61496(var2);
               a_.field_1724.field_3944.method_52787(new class_2868(var2));
            }

            a_.field_1761.method_2919(a_.field_1724, class_1268.field_5808);
            return;
         }
      }
   }

   private void UuUVuuUu(long var1) {
      if (this.vNUvnnVnUvu() == this.vNVuvnUUnuUn) {
         this.nvUVNnuu();
      } else if (this.UnUNuUU != 0L && var1 >= this.UnUNuUU) {
         a_.field_1724.field_3944.method_45730("an" + this.vNVuvnUUnuUn);
         this.UnUNuUU = 0L;
         this.uNnUnnuNUnNu = var1;
      } else {
         if (this.UnUNuUU == 0L && var1 - this.uNnUnnuNUnNu >= 4000L) {
            this.uNNnnnuuuN("FunTime не подтвердил подключение к анархии #" + this.vNVuvnUUnuUn + ".");
         }
      }
   }

   private int vNUvnnVnUvu() {
      int var1 = this.uVUuuVnNVU();
      if (this.C00OOC00oO(var1)) {
         return var1;
      } else {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         return this.C00OOC00oO(vnvuUUVun.UuUVuuUu.uUnuvNvvNU());
      }
   }

   private int uVUuuVnNVU() {
      if (a_.field_1687 == null) {
         return -1;
      } else {
         class_269 var1 = a_.field_1687.method_8428();
         ArrayList var2 = new ArrayList();
         this.UuUVuuUu(var1.method_1189(class_8646.field_45157), var1, var2);

         for (class_266 var4 : var1.method_1151()) {
            this.UuUVuuUu(var4, var1, var2);
         }

         for (String var9 : var2) {
            int var5 = this.UuUVuuUu(UnUNVVVNuv, var9);
            if (this.C00OOC00oO(var5)) {
               return var5;
            }
         }

         for (String var10 : var2) {
            int var12 = this.UuUVuuUu(vuuuNvNuv, var10);
            if (this.C00OOC00oO(var12)) {
               return var12;
            }
         }

         for (String var11 : var2) {
            int var13 = this.UuUVuuUu(nUUVuvU, var11);
            if (this.C00OOC00oO(var13)) {
               return var13;
            }
         }

         return -1;
      }
   }

   private void UuUVuuUu(class_266 var1, class_269 var2, List<String> var3) {
      if (var1 != null) {
         var3.add(var1.method_1114().getString());

         for (class_9011 var6 : var2.method_1184(var1)) {
            class_268 var7 = var2.method_1164(var6.comp_2127());
            var3.add(class_268.method_1142(var7, class_2561.method_43470(var6.comp_2127())).getString());
         }
      }
   }

   private boolean vuuuNvNuv() {
      if (a_.field_1687 == null) {
         return false;
      } else {
         class_269 var1 = a_.field_1687.method_8428();
         class_266 var2 = var1.method_1189(class_8646.field_45157);
         if (var2 != null && this.UuUVuuUu(var2.method_1114().getString())) {
            return true;
         } else {
            for (class_266 var4 : var1.method_1151()) {
               if (this.UuUVuuUu(var4.method_1114().getString())) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private boolean UuUVuuUu(String var1) {
      String var2 = this.vVvUvVVuuNvV(var1);
      return var2.contains("анархия-") || var2.contains("анархия #") || var2.contains("anarchy-");
   }

   private int UuUVuuUu(Pattern var1, String var2) {
      Matcher var3 = var1.matcher(this.vVvUvVVuuNvV(var2));
      return !var3.find() ? -1 : this.C00OOC00oO(var3.group(1));
   }

   private boolean C00OOC00oO(int var1) {
      return var1 >= 1 && var1 <= 66;
   }

   private int C00OOC00oO(String var1) {
      if (var1 == null) {
         return -1;
      } else {
         String var2 = var1.replaceAll("\\D+", "");
         if (var2.isEmpty()) {
            return -1;
         } else {
            try {
               return Integer.parseInt(var2);
            } catch (NumberFormatException var4) {
               return -1;
            }
         }
      }
   }

   private int uUnuvNvvNU(int var1) {
      if (var1 <= 15) {
         return 0;
      } else if (var1 <= 31) {
         return 1;
      } else {
         return var1 <= 47 ? 2 : 3;
      }
   }

   private boolean uUnuvNvvNU(String var1) {
      return var1.contains("сервер заполнен")
         || var1.contains("были кикнуты при подключении")
         || var1.contains("не удалось подключ")
         || var1.contains("ошибка подключения")
         || var1.contains("сервер недоступен")
         || var1.contains("нет свободных слотов")
         || var1.contains("failed to connect")
         || var1.contains("could not connect")
         || var1.contains("server is full")
         || var1.contains("server unavailable");
   }

   private String vVvUvVVuuNvV(String var1) {
      return var1 == null ? "" : var1.replaceAll("(?i)§.", "").replace(' ', ' ').replaceAll("\\s+", " ").trim().toLowerCase(Locale.ROOT);
   }

   private void nvUVNnuu() {
      this.UuuNnUvUuv();
   }

   private void uNNnnnuuuN(String var1) {
      vVnvuVVUunuv.UuUVuuUu("§c[RCT] " + var1);
      this.UuuNnUvUuv();
   }

   private void UuuNnUvUuv() {
      this.UvnvNVnnnnNU = false;
      this.uVUVnuvnuVuv = false;
      this.NVNnnvnuunNv = false;
      this.uVunuUNVVUUV = false;
      this.vNVuvnUUnuUn = -1;
      this.UNnVVNvvnVvU = 0L;
      this.uNnUnnuNUnNu = 0L;
      this.NnUuNNU = 0L;
      this.nNvNUVU = 0L;
      this.UnUNuUU = 0L;
   }

   private void nUUVuvU() {
      vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      vVnvuVVUunuv.UuUVuuUu("§7Без номера команда использует текущую анархию из scoreboard.");
   }

   static {
      Loader.initialize();
   }
}
