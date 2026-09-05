package ru.metaculture.protection;

import net.minecraft.class_1802;
import net.minecraft.class_2886;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "WindHop",
   C00OOC00oO = "Подхватывает импульс заряда ветра прыжком",
   uUnuvNvvNU = oOOOo0.Player
)
public class WindHop extends Module {
   private static final int NVNnnvnuunNv = 2;
   private final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Подхват импульса", true);
   private int UNnVVNvvnVvU = -1;
   private boolean uNnUnnuNUnNu;

   public WindHop() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.uVunuUNVVUUV});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.uUnuvNvvNU() && this.uVunuUNVVUUV.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_2886 var2 && uUnuvNvvNU.field_1724.method_5998(var2.method_12551()).method_31574(class_1802.field_49098)) {
            this.UNnVVNvvnVvU = 2;
            this.uNnUnnuNUnNu = false;
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (!this.uVunuUNVVUUV.uUnuvNvvNU()) {
         this.UuuNnUvUuv();
      } else if (this.UNnVVNvvnVvU > 0) {
         this.UNnVVNvvnVvU--;
      } else {
         if (this.UNnVVNvvnVvU == 0) {
            this.UNnVVNvvnVvU = -1;
            this.uNnUnnuNUnNu = true;
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNVVnVUNun var1) {
      if (this.uNnUnnuNUnNu && this.uVunuUNVVUUV.uUnuvNvvNU()) {
         var1.UuUVuuUu(true);
         this.UuuNnUvUuv();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NnVNuVNVuU var1) {
      this.UuuNnUvUuv();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.UuuNnUvUuv();
   }

   @Override
   public void C00OOC00oO() {
      this.UuuNnUvUuv();
      super.C00OOC00oO();
   }

   private void UuuNnUvUuv() {
      this.UNnVVNvvnVvU = -1;
      this.uNnUnnuNUnNu = false;
   }
}
