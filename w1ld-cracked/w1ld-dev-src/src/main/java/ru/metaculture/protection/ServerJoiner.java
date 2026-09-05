package ru.metaculture.protection;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1802;
import net.minecraft.class_2868;
import net.minecraft.class_465;
import net.minecraft.class_7439;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ServerJoiner",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Авто-заход на сервера (FunTime/SpookyTime)"
)
public class ServerJoiner extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "FunTime", "FunTime", "SpookyTime");
   private static final Pattern uNnUnnuNUnNu = Pattern.compile("anarchy\\s*(\\d+)");
   public final NVuVVUNUvV uVunuUNVVUUV = new NVuVVUNUvV("Анархия", "101").UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("FunTime"));
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Выключать после входа", true);
   private final VuNvNNvVV NnUuNNU = new VuNvNNvVV();
   private int nNvNUVU = -1;
   private boolean UnUNuUU;
   private boolean uUVuVvuNUvnu;

   public ServerJoiner() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.UnUNuUU = false;
      this.uUVuVvuNUvnu = false;
      this.NnUuNNU.UuUVuuUu();
      if (this.NVNnnvnuunNv.C00OOC00oO("FunTime")) {
         this.nNvNUVU = this.UvnvNVnnnnNU();
         if (this.nNvNUVU <= 0) {
            vVnvuVVUunuv.UuUVuuUu("[ServerJoiner] Укажи корректную анархию в настройке.");
            this.a_();
            return;
         }

         this.vNVuvnUUnuUn();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && !this.UnUNuUU) {
         if (this.NVNnnvnuunNv.C00OOC00oO("FunTime")) {
            if (this.NnUuNNU.uNNnnnuuuN(50L)) {
               this.vNVuvnUUnuUn();
               this.NnUuNNU.UuUVuuUu();
            }
         } else if (this.NVNnnvnuunNv.C00OOC00oO("SpookyTime")) {
            if (this.uUVuVvuNUvnu && !this.UnUNVVVNuv()) {
               this.UuUVuuUu("[ServerJoiner] Успешный вход на дуэли SpookyTime.");
               return;
            }

            this.UuuNnUvUuv();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (this.NVNnnvnuunNv.C00OOC00oO("FunTime") && var1.uNNnnnuuuN().equals(uvUUuvnunU.NVnVnNnN.RECEIVE)) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var7 = this.C00OOC00oO(var2.comp_763().getString());
            if (!var7.isEmpty() && !var7.contains("сервер заполнен") && !var7.contains("были кикнуты при подключении")) {
               if (this.uUnuvNvvNU(var7)) {
                  this.UuUVuuUu("[ServerJoiner] Уже подключен к этой анархии.");
               } else {
                  Matcher var4 = uNnUnnuNUnNu.matcher(var7);
                  if (var4.find()) {
                     try {
                        if (Integer.parseInt(var4.group(1)) == this.nNvNUVU) {
                           this.UuUVuuUu("[ServerJoiner] Зашёл на /an" + this.nNvNUVU + ".");
                        }
                     } catch (NumberFormatException var6) {
                     }
                  }
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1755 instanceof class_465 var1) {
         if (!this.UuUVuuUu(var1)) {
            vVnvuVVUunuv.UuUVuuUu("[ServerJoiner] Открыт неверный экран для SpookyTime, модуль выключен.");
            this.UuUVuuUu(false);
            return;
         }

         class_1703 var5 = var1.method_17577();

         for (int var3 = 0; var3 < var5.field_7761.size(); var3++) {
            class_1735 var4 = (class_1735)var5.field_7761.get(var3);
            if (var4.method_7677().method_31574(class_1802.field_23141)) {
               uUnuvNvvNU.field_1761.method_2906(var5.field_7763, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.method_1507(null);
               this.uUVuVvuNUvnu = true;
               this.NnUuNNU.UuUVuuUu();
               return;
            }
         }
      } else if (this.NnUuNNU.uNNnnnuuuN(500L)) {
         this.nUUVuvU();
         this.NnUuNNU.UuUVuuUu();
      }
   }

   private boolean UuUVuuUu(class_465<?> var1) {
      return this.C00OOC00oO(var1.method_25440().getString()).equals("выберите режим: ");
   }

   private void nUUVuvU() {
      class_1661 var1 = uUnuvNvvNU.field_1724.method_31548();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.method_5438(var2).method_31574(class_1802.field_8251)) {
            if (var1.method_67532() != var2) {
               var1.method_61496(var2);
               uUnuvNvvNU.method_1562().method_52787(new class_2868(var2));
            }

            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            return;
         }
      }
   }

   private boolean UnUNVVVNuv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         class_1661 var1 = uUnuvNvvNU.field_1724.method_31548();

         for (int var2 = 0; var2 < 9; var2++) {
            if (var1.method_5438(var2).method_31574(class_1802.field_8251)) {
               return true;
            }
         }

         return false;
      }
   }

   private void vNVuvnUUnuUn() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3944 != null) {
         uUnuvNvvNU.field_1724.field_3944.method_45729("/an" + this.nNvNUVU);
      }
   }

   private void UuUVuuUu(String var1) {
      this.UnUNuUU = true;
      vVnvuVVUunuv.UuUVuuUu(var1);
      if (this.UNnVVNvvnVvU.uUnuvNvvNU()) {
         this.a_();
      }
   }

   private int UvnvNVnnnnNU() {
      String var1 = this.uVunuUNVVUUV.uUnuvNvvNU();
      if (var1 == null) {
         return -1;
      } else {
         String var2 = var1.replaceAll("\\D+", "");
         return var2.isEmpty() ? -1 : Integer.parseInt(var2);
      }
   }

   private String C00OOC00oO(String var1) {
      return var1 == null ? "" : var1.replaceAll("§.", "").toLowerCase(Locale.ROOT).trim();
   }

   private boolean uUnuvNvvNU(String var1) {
      return var1.contains("вы уже подключены к этому серверу") || var1.contains("already connected to this server");
   }
}
