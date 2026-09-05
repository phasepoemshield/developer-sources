package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2848;
import net.minecraft.class_3675;
import net.minecraft.class_490;
import net.minecraft.class_2848.class_2849;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoExp",
   C00OOC00oO = "Автоматически использует пузырьки опыта",
   uUnuvNvvNU = oOOOo0.Player
)
public class AutoExp extends Module {
   private final uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Клавиша опыта", -1, true);
   private final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Задержка", 80.0F, 20.0F, 300.0F, 10.0F, false);
   private final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Только изношенное", false);
   private final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Прочность до", 95.0F, 5.0F, 100.0F, 5.0F, false).UuUVuuUu(() -> !this.UNnVVNvvnVvU.uUnuvNvvNU());
   private final VuNvNNvVV NnUuNNU = new VuNvNNvVV();
   private int nNvNUVU = 0;
   private int UnUNuUU = 0;
   private int uUVuVvuNUvnu = -1;
   private int UvUvUNuvNU = -1;
   private class_1268 c0oOOCcCoC0 = class_1268.field_5808;

   public AutoExp() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null || this.NVNnnvnuunNv.uUnuvNvvNU() == -1) {
         this.uVUVnuvnuVuv();
      } else if (this.nNvNUVU > 0) {
         if (this.UnUNuUU > 0) {
            this.NVNnnvnuunNv();
            this.UnUNuUU--;
         } else {
            this.nUUVuvU();
         }
      } else if (this.UNnVVNvvnVvU() && this.NnUuNNU.uNNnnnuuuN((long)this.uVunuUNVVUUV.uUnuvNvvNU())) {
         if (!this.UNnVVNvvnVvU.uUnuvNvvNU() || this.NnUuNNU()) {
            this.UuuNnUvUuv();
         }
      }
   }

   private void UuuNnUvUuv() {
      this.UvUvUNuvNU = uUnuvNvvNU.field_1724.method_31548().method_67532();
      if (uUnuvNvvNU.field_1724.method_6079().method_31574(class_1802.field_8287)) {
         this.c0oOOCcCoC0 = class_1268.field_5810;
         this.nNvNUVU = uUnuvNvvNU.field_1755 instanceof class_490 ? 1 : 2;
      } else {
         int var1 = this.uNnUnnuNUnNu();
         if (var1 != -1) {
            this.uUVuVvuNUvnu = var1;
            this.c0oOOCcCoC0 = class_1268.field_5808;
            this.nNvNUVU = uUnuvNvvNU.field_1755 instanceof class_490 ? 1 : (var1 < 9 ? 2 : 4);
         }
      }
   }

   private void nUUVuvU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         switch (this.nNvNUVU) {
            case 1:
               uUnuvNvvNU.field_1724.method_7346();
               this.nNvNUVU = this.uUVuVvuNUvnu >= 9 ? 4 : 2;
               this.UnUNuUU = 2;
               break;
            case 2:
               this.NVNnnvnuunNv();
               this.UnUNVVVNuv();
               this.nNvNUVU = 3;
               this.UnUNuUU = 1;
               break;
            case 3:
               this.vNVuvnUUnuUn();
               break;
            case 4:
               this.NVNnnvnuunNv();
               this.uVunuUNVVUUV();
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.uUVuVvuNUvnu, this.UvUvUNuvNU, class_1713.field_7791, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.field_1724.method_7346();
               this.nNvNUVU = 5;
               this.UnUNuUU = 2;
               break;
            case 5:
               this.NVNnnvnuunNv();
               this.UnUNVVVNuv();
               this.nNvNUVU = 6;
               this.UnUNuUU = 2;
               break;
            case 6:
               this.NVNnnvnuunNv();
               this.uVunuUNVVUUV();
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.uUVuVvuNUvnu, this.UvUvUNuvNU, class_1713.field_7791, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.field_1724.method_7346();
               this.UvnvNVnnnnNU();
               break;
            default:
               this.uVUVnuvnuVuv();
         }
      } else {
         this.uVUVnuvnuVuv();
      }
   }

   private void UnUNVVVNuv() {
      if (this.c0oOOCcCoC0 == class_1268.field_5808 && this.uUVuVvuNUvnu >= 0 && this.uUVuVvuNUvnu < 9) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.uUVuVvuNUvnu);
      }

      uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, this.c0oOOCcCoC0);
      uUnuvNvvNU.field_1724.method_6104(this.c0oOOCcCoC0);
   }

   private void vNVuvnUUnuUn() {
      if (this.c0oOOCcCoC0 == class_1268.field_5808 && this.uUVuVvuNUvnu >= 0 && this.uUVuVvuNUvnu < 9 && this.UvUvUNuvNU != this.uUVuVvuNUvnu) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.UvUvUNuvNU);
         ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
      }

      this.UvnvNVnnnnNU();
   }

   private void UvnvNVnnnnNU() {
      this.NnUuNNU.UuUVuuUu();
      this.uVUVnuvnuVuv();
   }

   private void uVUVnuvnuVuv() {
      this.nNvNUVU = 0;
      this.UnUNuUU = 0;
      this.uUVuVvuNUvnu = -1;
      this.UvUvUNuvNU = -1;
      this.c0oOOCcCoC0 = class_1268.field_5808;
   }

   private void NVNnnvnuunNv() {
      Sprint.NnUuNNU = 2;
      uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      if (uUnuvNvvNU.field_1724.method_5624()) {
         uUnuvNvvNU.field_1724.method_5728(false);
         if (uUnuvNvvNU.method_1562() != null) {
            uUnuvNvvNU.method_1562().method_52787(new class_2848(uUnuvNvvNU.field_1724, class_2849.field_12985));
         }
      }
   }

   private void uVunuUNVVUUV() {
      if (uUnuvNvvNU.method_1562() != null) {
         uUnuvNvvNU.method_1562().method_52787(new class_2848(uUnuvNvvNU.field_1724, class_2849.field_12988));
      }
   }

   private boolean UNnVVNvvnVvU() {
      if (uUnuvNvvNU.field_1755 == null) {
         return uVNuNUVvn.C00OOC00oO(this.NVNnnvnuunNv.uUnuvNvvNU());
      } else if (uUnuvNvvNU.field_1755 instanceof class_490 && uUnuvNvvNU.method_22683() != null) {
         long var1 = uUnuvNvvNU.method_22683().method_4490();
         int var3 = this.NVNnnvnuunNv.uUnuvNvvNU();
         if (var3 >= 0) {
            return class_3675.method_15987(var1, var3);
         } else {
            return var3 <= -100 ? GLFW.glfwGetMouseButton(var1, -var3 - 100) == 1 : false;
         }
      } else {
         return false;
      }
   }

   private int uNnUnnuNUnNu() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (!var2.method_7960() && var2.method_31574(class_1802.field_8287)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean NnUuNNU() {
      for (int var1 = 0; var1 < uUnuvNvvNU.field_1724.method_31548().method_5439(); var1++) {
         if (this.UuUVuuUu(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
            return true;
         }
      }

      return this.UuUVuuUu(uUnuvNvvNU.field_1724.method_6079());
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (!var1.method_7960() && var1.method_7963()) {
         int var2 = var1.method_7936();
         if (var2 <= 0) {
            return false;
         } else {
            int var3 = var2 - var1.method_7919();
            float var4 = var3 * 100.0F / var2;
            return var4 <= this.uNnUnnuNUnNu.uUnuvNvvNU();
         }
      } else {
         return false;
      }
   }

   @Override
   public void C00OOC00oO() {
      this.uVUVnuvnuVuv();
      super.C00OOC00oO();
   }
}
