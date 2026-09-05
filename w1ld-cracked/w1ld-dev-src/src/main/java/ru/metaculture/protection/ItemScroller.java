package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_465;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.HandledScreenAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ItemScroller",
   C00OOC00oO = "Ускоряет перекладывание",
   uUnuvNvvNU = oOOOo0.Misc
)
public class ItemScroller extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Задержка", 10.0F, 0.0F, 100.0F, 1.0F, false);
   private static ItemScroller uVunuUNVVUUV;
   private final VuNvNNvVV UNnVVNvvnVvU = new VuNvNNvVV();

   public ItemScroller() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
      uVunuUNVVUUV = this;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
         if (uUnuvNvvNU.field_1755 instanceof class_465 var2) {
            if (uUnuvNvvNU.method_22683() != null) {
               long var3 = uUnuvNvvNU.method_22683().method_4490();
               boolean var5 = GLFW.glfwGetKey(var3, 340) == 1 || GLFW.glfwGetKey(var3, 344) == 1;
               boolean var6 = GLFW.glfwGetMouseButton(var3, 0) == 1;
               if (var5 && var6) {
                  long var7 = (long)this.NVNnnvnuunNv.uUnuvNvvNU();
                  if (this.UNnVVNvvnVvU.uNNnnnuuuN(var7)) {
                     double var9 = uUnuvNvvNU.field_1729.method_1603() * uUnuvNvvNU.method_22683().method_4486() / uUnuvNvvNU.method_22683().method_4480();
                     double var11 = uUnuvNvvNU.field_1729.method_1604() * uUnuvNvvNU.method_22683().method_4502() / uUnuvNvvNU.method_22683().method_4507();
                     class_1735 var13 = ((HandledScreenAccessor)var2).getSlotAtPosition(var9, var11);
                     if (var13 != null && var13.method_7681()) {
                        uUnuvNvvNU.field_1761.method_2906(var2.method_17577().field_7763, var13.field_7874, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                        this.UNnVVNvvnVvU.UuUVuuUu();
                     }
                  }
               }
            }
         }
      }
   }

   @Generated
   public static ItemScroller UuuNnUvUuv() {
      return uVunuUNVVUUV;
   }
}
