package ru.metaculture.protection;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1747;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2626;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_3481;
import net.minecraft.class_2846.class_2847;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "AutoLes",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Автоматически фармит для вас лес, и зарабатывает на ReallyWorld"
)
public class AutoLes extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Радиус", 4.0F, 1.0F, 6.0F, 0.5F, false);
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Махать рукой", true);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Авто-сдача", true);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("AutoPay", false);
   public final NVuVVUNUvV NnUuNNU = new NVuVVUNUvV("Ник для перевода денег", "");
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Кол-во монет", 1000.0F, 500.0F, 25000.0F, 1000.0F, false).UuUVuuUu(() -> !this.uNnUnnuNUnNu.uUnuvNvvNU());
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Расписание/с", 20.0F, 1.0F, 60.0F, 1.0F, false);
   private final Map<class_2338, class_2680> uUVuVvuNUvnu = new ConcurrentHashMap<>();
   private final Map<class_2338, Long> UvUvUNuvNU = new ConcurrentHashMap<>();
   private final Set<class_2338> c0oOOCcCoC0 = ConcurrentHashMap.newKeySet();
   private long VVnVNnunVvu = 0L;
   private long unNNVVNnvvV = 0L;
   private long NuunnvnN = 0L;
   private class_2338 NVUunUNUN = null;

   public AutoLes() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.UnUNVVVNuv();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.nUUVuvU();
      this.UnUNVVVNuv();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         long var2 = System.currentTimeMillis();
         if (this.UNnVVNvvnVvU.uUnuvNvvNU() && (float)(var2 - this.VVnVNnunVvu) > this.UnUNuUU.uUnuvNvvNU() * 500.0F) {
            uUnuvNvvNU.method_1562().method_45730("sellwood");
            this.VVnVNnunVvu = var2;
         }

         if (this.uNnUnnuNUnNu.uUnuvNvvNU() && (float)(var2 - this.unNNVVNnvvV) > this.UnUNuUU.uUnuvNvvNU() * 500.0F + 200.0F) {
            uUnuvNvvNU.method_1562().method_45730("pay " + this.NnUuNNU.uUnuvNvvNU() + " " + (int)this.nNvNUVU.uUnuvNvvNU());
            this.unNNVVNnvvV = var2;
         }

         this.UuUVuuUu(var2);
         this.C00OOC00oO(var2);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_2846 var2) {
            if (var2.method_12363() == class_2847.field_12973 || var2.method_12363() == class_2847.field_12968) {
               this.uUnuvNvvNU(var2.method_12362());
            }
         } else if (var1.vVvUvVVuuNvV() instanceof class_2885 var3) {
            if (uUnuvNvvNU.field_1724.method_5998(var3.method_12546()).method_7909() instanceof class_1747) {
               class_2338 var7 = var3.method_12543().method_17777().method_10093(var3.method_12543().method_17780());
               this.c0oOOCcCoC0.add(var7);
               this.uUVuVvuNUvnu.remove(var7);
               this.UvUvUNuvNU.remove(var7);
            }
         } else if (var1.vVvUvVVuuNvV() instanceof class_2626 var4) {
            this.UuUVuuUu(var1, var4);
         }
      }
   }

   private void UuUVuuUu(long var1) {
      if (this.NVUunUNUN != null && (!this.UuUVuuUu(this.NVUunUNUN) || !this.C00OOC00oO(this.NVUunUNUN))) {
         this.NVUunUNUN = null;
      }

      if (this.NVUunUNUN == null) {
         this.UuuNnUvUuv();
      }

      if (this.NVUunUNUN != null && var1 - this.NuunnvnN > 0L) {
         uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12968, this.NVUunUNUN, class_2350.field_11036));
         uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12973, this.NVUunUNUN, class_2350.field_11033));
         this.NuunnvnN = var1;
      }
   }

   private void UuuNnUvUuv() {
      int var1 = (int)this.NVNnnvnuunNv.uUnuvNvvNU();
      class_2338 var2 = uUnuvNvvNU.field_1724.method_24515();
      double var3 = Double.MAX_VALUE;
      class_2338 var5 = null;

      for (class_2338 var7 : class_2338.method_10097(var2.method_10069(-var1, -var1, -var1), var2.method_10069(var1, var1, var1))) {
         if (this.UuUVuuUu(var7)) {
            double var8 = uUnuvNvvNU.field_1724.method_5707(var7.method_46558());
            if (var8 <= var1 * var1 && var8 < var3) {
               var3 = var8;
               var5 = var7.method_10062();
            }
         }
      }

      this.NVUunUNUN = var5;
   }

   private boolean UuUVuuUu(class_2338 var1) {
      return uUnuvNvvNU.field_1687.method_8320(var1).method_26164(class_3481.field_15475);
   }

   private boolean C00OOC00oO(class_2338 var1) {
      float var2 = this.NVNnnvnuunNv.uUnuvNvvNU();
      return uUnuvNvvNU.field_1724.method_5707(var1.method_46558()) <= var2 * var2;
   }

   private void uUnuvNvvNU(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      if (!var2.method_26215()) {
         this.uUVuVvuNUvnu.put(var1, var2);
         this.UvUvUNuvNU.put(var1, System.currentTimeMillis());
         this.UuUVuuUu(var1, var2);
      }
   }

   private void UuUVuuUu(uvUUuvnunU var1, class_2626 var2) {
      class_2338 var3 = var2.method_11309();
      class_2680 var4 = var2.method_11308();
      if (this.uUVuVvuNUvnu.containsKey(var3)) {
         class_2680 var5 = this.uUVuVvuNUvnu.get(var3);
         if (var4.method_26215() || !var4.equals(var5)) {
            var1.C00OOC00oO();
            this.UuUVuuUu(var3, var5);
         }
      } else if (this.c0oOOCcCoC0.contains(var3) && var4.method_26215()) {
         var1.C00OOC00oO();
         uUnuvNvvNU.execute(() -> {
            if (uUnuvNvvNU.field_1687 != null) {
               uUnuvNvvNU.field_1687.method_8652(var3, uUnuvNvvNU.field_1687.method_8320(var3), 0);
            }
         });
      }
   }

   private void C00OOC00oO(long var1) {
      this.uUVuVvuNUvnu.forEach((var3, var4) -> {
         class_2680 var5 = uUnuvNvvNU.field_1687.method_8320(var3);
         if (!var5.equals(var4)) {
            uUnuvNvvNU.field_1687.method_8652(var3, var4, 0);
            if (!var5.method_26215()) {
               this.UvUvUNuvNU.put(var3, var1);
            }
         }

         for (class_2350 var9 : class_2350.values()) {
            class_2338 var10 = var3.method_10093(var9);
            if (this.uUVuVvuNUvnu.containsKey(var10)) {
               class_2680 var11 = this.uUVuVvuNUvnu.get(var10);
               if (!uUnuvNvvNU.field_1687.method_8320(var10).equals(var11)) {
                  uUnuvNvvNU.field_1687.method_8652(var10, var11, 0);
               }
            }
         }
      });
      this.UvUvUNuvNU.entrySet().removeIf(var3 -> {
         if (var1 - var3.getValue() > 300000L) {
            this.uUVuVvuNUvnu.remove(var3.getKey());
            return true;
         } else {
            return false;
         }
      });
   }

   private void UuUVuuUu(class_2338 var1, class_2680 var2) {
      uUnuvNvvNU.execute(() -> {
         if (uUnuvNvvNU.field_1687 != null) {
            uUnuvNvvNU.field_1687.method_8652(var1, var2, 0);
         }
      });
   }

   private void nUUVuvU() {
      if (uUnuvNvvNU.field_1687 != null) {
         uUnuvNvvNU.execute(() -> {
            for (class_2338 var2 : this.uUVuVvuNUvnu.keySet()) {
               uUnuvNvvNU.field_1687.method_8652(var2, class_2246.field_10124.method_9564(), 0);
            }
         });
      }
   }

   private void UnUNVVVNuv() {
      this.NVUunUNUN = null;
      this.VVnVNnunVvu = 0L;
      this.unNNVVNnvvV = 0L;
      this.NuunnvnN = 0L;
      this.uUVuVvuNUvnu.clear();
      this.c0oOOCcCoC0.clear();
      this.UvUvUNuvNU.clear();
   }
}
