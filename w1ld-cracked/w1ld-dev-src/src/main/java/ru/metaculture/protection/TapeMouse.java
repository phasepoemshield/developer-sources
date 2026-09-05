package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.MinecraftClientAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "TapeMouse",
   C00OOC00oO = "Кто ваще это юзает ?-?",
   uUnuvNvvNU = oOOOo0.Misc
)
public class TapeMouse extends Module {
   private final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Кнопка", "ЛКМ", "ЛКМ", "ПКМ", "Обе");
   private final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим ударов", "По кулдауну", "По кулдауну", "По задержке", "CPS");
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Задержка", 1000.0F, 100.0F, 5000.0F, 100.0F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("По задержке"));
   private final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("CPS минимум", 8.0F, 1.0F, 20.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("CPS"));
   private final nNUuNvVn NnUuNNU = new nNUuNvVn("CPS максимум", 12.0F, 1.0F, 20.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("CPS"));
   private final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Проверка на энтити", false);
   private final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Только при зажатии", false);
   private final UUVuuNuvVuVv uUVuVvuNUvnu = new UUVuuNuvVuVv();
   private final UUVuuNuvVuVv UvUvUNuvNU = new UUVuuNuvVuVv();
   private long c0oOOCcCoC0;
   private long VVnVNnunVvu;

   public TapeMouse() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.UnUNVVVNuv();
   }

   @Override
   public void a_() {
      super.a_();
      this.UnUNVVVNuv();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1755 == null) {
         if (this.NVNnnvnuunNv.C00OOC00oO("ЛКМ") || this.NVNnnvnuunNv.C00OOC00oO("Обе")) {
            this.uUnuvNvvNU(true);
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("ПКМ") || this.NVNnnvnuunNv.C00OOC00oO("Обе")) {
            this.uUnuvNvvNU(false);
         }
      }
   }

   private void uUnuvNvvNU(boolean var1) {
      if (!var1 || !this.nNvNUVU.uUnuvNvvNU() || this.UuuNnUvUuv()) {
         if (!this.UnUNuUU.uUnuvNvvNU() || this.UuUVuuUu(var1 ? 0 : 1)) {
            UUVuuNuvVuVv var2 = var1 ? this.uUVuVvuNUvnu : this.UvUvUNuvNU;
            if (this.uVunuUNVVUUV.C00OOC00oO("По кулдауну")) {
               if (this.vVvUvVVuuNvV(var1)) {
                  this.uNNnnnuuuN(var1);
               }
            } else if (this.uVunuUNVVUUV.C00OOC00oO("По задержке")) {
               if (var2.UuUVuuUu((double)this.UNnVVNvvnVvU.uUnuvNvvNU())) {
                  this.uNNnnnuuuN(var1);
                  var2.UuUVuuUu();
               }
            } else {
               long var3 = var1 ? this.c0oOOCcCoC0 : this.VVnVNnunVvu;
               if (var2.UuUVuuUu((double)var3)) {
                  this.uNNnnnuuuN(var1);
                  var2.UuUVuuUu();
                  long var5 = this.nUUVuvU();
                  if (var1) {
                     this.c0oOOCcCoC0 = var5;
                  } else {
                     this.VVnVNnunVvu = var5;
                  }
               }
            }
         }
      }
   }

   private boolean vVvUvVVuuNvV(boolean var1) {
      return var1 ? uUnuvNvvNU.field_1724.method_7261(0.0F) >= 1.0F : ((MinecraftClientAccessor)uUnuvNvvNU).getItemUseCooldown() <= 0;
   }

   private void uNNnnnuuuN(boolean var1) {
      MinecraftClientAccessor var2 = (MinecraftClientAccessor)uUnuvNvvNU;
      if (var1) {
         var2.invokeDoAttack();
      } else {
         var2.invokeDoItemUse();
         if (this.uVunuUNVVUUV.C00OOC00oO("По кулдауну")) {
            var2.setItemUseCooldown(4);
         }
      }
   }

   private boolean UuuNnUvUuv() {
      return uUnuvNvvNU.field_1765 != null && uUnuvNvvNU.field_1765.method_17783() == class_240.field_1331;
   }

   private boolean UuUVuuUu(int var1) {
      return uUnuvNvvNU.method_22683() == null ? false : GLFW.glfwGetMouseButton(uUnuvNvvNU.method_22683().method_4490(), var1) == 1;
   }

   private long nUUVuvU() {
      float var1 = Math.min(this.uNnUnnuNUnNu.uUnuvNvvNU(), this.NnUuNNU.uUnuvNvvNU());
      float var2 = Math.max(this.uNnUnnuNUnNu.uUnuvNvvNU(), this.NnUuNNU.uUnuvNvvNU());
      double var3 = var1 >= var2 ? var1 : var1 + ThreadLocalRandom.current().nextDouble() * (var2 - var1);
      if (var3 < 0.1) {
         var3 = 0.1;
      }

      return (long)(1000.0 / var3);
   }

   private void UnUNVVVNuv() {
      this.uUVuVvuNUvnu.UuUVuuUu();
      this.UvUvUNuvNU.UuUVuuUu();
      this.c0oOOCcCoC0 = this.nUUVuvU();
      this.VVnVNnunVvu = this.nUUVuvU();
   }
}
