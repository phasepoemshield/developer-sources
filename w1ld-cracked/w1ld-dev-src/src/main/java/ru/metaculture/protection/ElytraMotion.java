package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1802;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ElytraMotion",
   C00OOC00oO = "Зависает на элитрах перед противником",
   uUnuvNvvNU = oOOOo0.Movement
)
public class ElytraMotion extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция", 2.5F, 1.0F, 3.0F, 0.1F, false);
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("AutoFireworks", false);
   public boolean uVunuUNVVUUV;
   private final VuNvNNvVV NnUuNNU = new VuNvNNvVV();
   public double UNnVVNvvnVvU = 0.0;

   public ElytraMotion() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         this.uVunuUNVVUUV = false;
      } else if (!uUnuvNvvNU.field_1724.method_6128()) {
         this.uVunuUNVVUUV = false;
      } else {
         AttackAura var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AttackAura.class);
         ElytraTarget var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(ElytraTarget.class);
         if (this.UuUVuuUu(var2, var3)) {
            uUnuvNvvNU.field_1690.field_1894.method_23481(false);
            this.uVunuUNVVUUV = true;
            uUnuvNvvNU.field_1724.method_18800(0.0, 0.0, 0.0);
         } else {
            uUnuvNvvNU.field_1690.field_1894.method_23481(true);
            this.uVunuUNVVUUV = false;
         }

         if (this.uNnUnnuNUnNu.uUnuvNvvNU() && AttackAura.ccOO0COcoco0 != null && this.NnUuNNU.uNNnnnuuuN(500L)) {
            int var4 = UVuvVVvnVNu.UuUVuuUu(class_1802.field_8639);
            if (var4 != -1) {
               UVuvVVvnVNu.UuUVuuUu(var4);
               uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            }

            this.NnUuNNU.UuUVuuUu();
         }
      }
   }

   public boolean UuUVuuUu(AttackAura var1, ElytraTarget var2) {
      class_1309 var3 = AttackAura.ccOO0COcoco0;
      if (var3 != null && uUnuvNvvNU.field_1724.method_6128()) {
         double var4 = var3.method_23317() - var3.field_6014;
         double var6 = var3.method_23318() - var3.field_6036;
         double var8 = var3.method_23321() - var3.field_5969;
         double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
         double var12 = var10 * 20.0;
         boolean var14 = var12 < 25.0;
         return var3.method_5739(uUnuvNvvNU.field_1724) < this.NVNnnvnuunNv.uUnuvNvvNU() + (var3.method_6128() ? 0.5F : 0.0F)
            && uUnuvNvvNU.field_1724.method_6128()
            && var14;
      } else {
         return false;
      }
   }

   @Override
   public void C00OOC00oO() {
      this.uVunuUNVVUUV = false;
      super.C00OOC00oO();
   }
}
