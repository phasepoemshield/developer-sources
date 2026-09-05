package ru.metaculture.protection;

import java.util.function.Predicate;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_9334;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoInvisible",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Автоматически пьёт зелье невидимости и возвращает прошлый слот"
)
public class AutoInvisible extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Порог до зелья (сек)", 5.0F, 1.0F, 60.0F, 1.0F, false);
   private static final long uVunuUNVVUUV = 1850L;
   private final VuNvNNvVV UNnVVNvvnVvU = new VuNvNNvVV();
   private boolean uNnUnnuNUnNu;
   private int NnUuNNU = -1;

   public AutoInvisible() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (uUnuvNvvNU.field_1755 != null) {
            if (this.uNnUnnuNUnNu) {
               this.UuuNnUvUuv();
            }
         } else if (this.uNnUnnuNUnNu) {
            if (uUnuvNvvNU.field_1724.method_6115() && !this.UNnVVNvvnVvU.uNNnnnuuuN(1850L)) {
               uUnuvNvvNU.field_1690.field_1904.method_23481(true);
            } else {
               this.UuuNnUvUuv();
            }
         } else if (this.nUUVuvU()) {
            int var2 = this.UuUVuuUu(this::UuUVuuUu);
            if (var2 != -1) {
               int var3 = this.UuUVuuUu(var2);
               if (var3 != -1) {
                  this.NnUuNNU = uUnuvNvvNU.field_1724.method_31548().method_67532();
                  this.C00OOC00oO(var3);
                  uUnuvNvvNU.field_1690.field_1904.method_23481(true);
                  this.uNnUnnuNUnNu = true;
                  this.UNnVVNvvnVvU.UuUVuuUu();
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      if (this.NnUuNNU >= 0 && this.NnUuNNU < 9) {
         this.C00OOC00oO(this.NnUuNNU);
      }

      this.uNnUnnuNUnNu = false;
      this.NnUuNNU = -1;
   }

   private boolean nUUVuvU() {
      class_1293 var1 = uUnuvNvvNU.field_1724.method_6112(class_1294.field_5905);
      return var1 == null || var1.method_5584() <= (int)this.NVNnnvnuunNv.uUnuvNvvNU() * 20;
   }

   private int UuUVuuUu(Predicate<class_1799> var1) {
      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (!var3.method_7960() && var1.test(var3)) {
            return var2;
         }
      }

      return -1;
   }

   private int UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < 9) {
         return var1;
      } else {
         int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();

         for (int var3 = 0; var3 < 9; var3++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var3).method_7960()) {
               var2 = var3;
               break;
            }
         }

         int var4 = var1 < 9 ? var1 + 36 : var1;
         uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var4, var2, class_1713.field_7791, uUnuvNvvNU.field_1724);
         return var2;
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8574)) {
         class_1844 var2 = (class_1844)var1.method_58694(class_9334.field_49651);
         if (var2 == null) {
            return false;
         } else {
            for (class_1293 var4 : var2.method_57397()) {
               if (var4.method_5579().equals(class_1294.field_5905)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private void C00OOC00oO(int var1) {
      uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
      if (uUnuvNvvNU.field_1761 instanceof ClientPlayerInteractionManagerAccessor var2) {
         var2.invokeSyncSelectedSlot();
      }
   }

   @Override
   public void C00OOC00oO() {
      if (this.uNnUnnuNUnNu || uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.field_1904.method_1434()) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         if (this.NnUuNNU >= 0 && this.NnUuNNU < 9 && uUnuvNvvNU.field_1724 != null) {
            this.C00OOC00oO(this.NnUuNNU);
         }
      }

      this.uNnUnnuNUnNu = false;
      this.NnUuNNU = -1;
      super.C00OOC00oO();
   }
}
