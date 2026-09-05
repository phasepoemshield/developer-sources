package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1753;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2846;
import net.minecraft.class_2886;
import net.minecraft.class_2846.class_2847;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FastBow",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Автоматический спам стрелами"
)
public class FastBow extends Module {
   private final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Задержка", 10.0F, 1.0F, 10.0F, 1.0F, false);

   public FastBow() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!this.UuuNnUvUuv()) {
         if (this.nUUVuvU()) {
            this.UnUNVVVNuv();
            uUnuvNvvNU.field_1724.method_6075();
         }
      }
   }

   private boolean UuuNnUvUuv() {
      return uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.method_1562() == null;
   }

   private boolean nUUVuvU() {
      boolean var1 = uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1753;
      boolean var2 = uUnuvNvvNU.field_1724.method_6115();
      return var1 && var2 ? uUnuvNvvNU.field_1724.method_6048() >= this.NVNnnvnuunNv.uUnuvNvvNU() : false;
   }

   private void UnUNVVVNuv() {
      class_2846 var1 = new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033);
      class_2886 var2 = new class_2886(class_1268.field_5808, 0, uUnuvNvvNU.field_1724.method_36454(), uUnuvNvvNU.field_1724.method_36455());
      uUnuvNvvNU.method_1562().method_52787(var1);
      uUnuvNvvNU.method_1562().method_52787(var2);
   }
}
