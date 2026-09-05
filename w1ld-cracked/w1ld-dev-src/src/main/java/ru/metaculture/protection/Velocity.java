package ru.metaculture.protection;

import net.minecraft.class_2743;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Velocity",
   C00OOC00oO = "Убирает откидывание",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.MATRIX, uVUNNUnNvU.GRIM}
)
public class Velocity extends Module {
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Обход", "Vanilla", "Vanilla", "Lag", "Funtime");

   public Velocity() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (!VUUuVvvnNVUu.UuUVuuUu()) {
         if (NVNnnvnuunNv.C00OOC00oO("Vanilla") && var1.vVvUvVVuuNvV() instanceof class_2743 var2 && var2.method_11818() == uUnuvNvvNU.field_1724.method_5628()
            )
          {
            var1.C00OOC00oO();
         }

         if (NVNnnvnuunNv.C00OOC00oO("Funtime")
            && var1.vVvUvVVuuNvV() instanceof class_2743 var4
            && var4.method_11818() == uUnuvNvvNU.field_1724.method_5628()
            && uUnuvNvvNU.field_1724.field_27857) {
            var1.C00OOC00oO();
         }

         if (NVNnnvnuunNv.C00OOC00oO("Lag")) {
            if (var1.vVvUvVVuuNvV() instanceof class_2743 var5 && var5.method_11818() == uUnuvNvvNU.field_1724.method_5628()) {
               var1.C00OOC00oO();
            }

            if (var1.uUnuvNvvNU()) {
               var1.C00OOC00oO();
            }
         }
      }
   }
}
