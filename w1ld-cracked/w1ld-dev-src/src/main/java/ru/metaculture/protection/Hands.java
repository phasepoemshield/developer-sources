package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Hands",
   C00OOC00oO = "Свечение и настройка предметов в руках",
   uUnuvNvvNU = oOOOo0.Visuals
)
public final class Hands extends Module {
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN("Руки", new vvNnnUNnVvn("Правая", true), new vvNnnUNnVvn("Левая", true));
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Эффект", "Свечение + контур", "Свечение + контур", "Свечение", "Контур");
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Радиус", 8.0F, 2.0F, 24.0F, 1.0F, false).UuUVuuUu(this::UnUNVVVNuv);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Сила свечения", 1.8F, 0.25F, 5.0F, 0.05F, false).UuUVuuUu(this::UnUNVVVNuv);
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Толщина контура", 1.5F, 0.5F, 6.0F, 0.5F, false).UuUVuuUu(this::nUUVuvU);
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Прозрачность", 0.9F, 0.05F, 1.0F, 0.01F, true);
   public final UvNnUnuNUUU UnUNuUU = new UvNnUnuNUUU("Источник цвета", "Предмет", "Предмет", "Тема", "Свой");
   public final UvNnUnuNUUU uUVuVvuNUvnu = new UvNnUnuNUUU("Отображение цвета", "Градиент", "Градиент", "Статичный");
   public final VnnUvVNuNuVv UvUvUNuvNU = new VnnUvVNuNuVv("Основной цвет", 55.0F, 0.72F, 1.0F).C00OOC00oO(() -> !this.UnUNuUU.C00OOC00oO("Свой"));
   public final VnnUvVNuNuVv c0oOOCcCoC0 = new VnnUvVNuNuVv("Второй цвет", 76.0F, 0.78F, 1.0F)
      .C00OOC00oO(() -> !this.UnUNuUU.C00OOC00oO("Свой") || this.uUVuVvuNUvnu.C00OOC00oO("Статичный"));
   private C0cc0cCOo0O VVnVNnunVvu;
   private static final class_1268[] unNNVVNnvvV = class_1268.values();
   private final float[] NuunnvnN = new float[3];
   private final float[] NVUunUNUN = new float[3];

   public Hands() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0
         }
      );
   }

   @Override
   public void C00OOC00oO() {
      this.uVUVnuvnuVuv();
      super.C00OOC00oO();
   }

   public boolean UuUVuuUu(class_1268 var1) {
      if (this.nuUnNvnuUu && var1 != null && uUnuvNvvNU.field_1724 != null && !this.UvnvNVnnnnNU() && this.vNVuvnUUnuUn()) {
         class_1306 var2 = var1 == class_1268.field_5808 ? uUnuvNvvNU.field_1724.method_6068() : UuUVuuUu(uUnuvNvvNU.field_1724.method_6068());
         return this.NVNnnvnuunNv.C00OOC00oO(var2 == class_1306.field_6183 ? "Правая" : "Левая");
      } else {
         return false;
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 0
   )
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (!NnuVnuNVV.UuUVuuUu() && var1 != null && var1.vVvUvVVuuNvV() != null) {
         var1.vVvUvVVuuNvV().uUnuvNvvNU();
         this.UuUVuuUu(var1.nuUnNvnuUu(), var1.VVuuUN());
         var1.vVvUvVVuuNvV().uUnuvNvvNU();
      }
   }

   @Override
   public void UuuNnUvUuv() {
      if (NnuVnuNVV.UuUVuuUu() && uUnuvNvvNU.method_22683() != null) {
         this.UuUVuuUu(uUnuvNvvNU.method_22683().method_4489(), uUnuvNvvNU.method_22683().method_4506());
      }
   }

   private void UuUVuuUu(int var1, int var2) {
      if (this.nuUnNvnuUu
         && uUnuvNvvNU.field_1687 != null
         && uUnuvNvvNU.field_1724 != null
         && var1 > 0
         && var2 > 0
         && uUnuvNvvNU.method_22683() != null
         && !uUnuvNvvNU.method_22683().method_65966()) {
         vnNNnvUvUUv var3 = vnNNnvUvUUv.UuUVuuUu();
         if (this.UvnvNVnnnnNU()) {
            var3.UuUVuuUu(false, false, var1, var2);
         } else if (!this.vNVuvnUUnuUn()) {
            var3.UuUVuuUu(false, false, var1, var2);
         } else {
            boolean var4 = false;

            for (class_1268 var8 : unNNVVNnvvV) {
               if (this.UuUVuuUu(var8) && var3.C00OOC00oO(var8)) {
                  int var9 = var3.uUnuvNvvNU(var8);
                  if (var9 > 0) {
                     if (this.VVnVNnunVvu == null) {
                        this.VVnVNnunVvu = new C0cc0cCOo0O();
                     }

                     if (!var4) {
                        this.UuUVuuUu(this.NuunnvnN, this.NVUunUNUN);
                        var4 = true;
                     }

                     int var10 = var3.uNNnnnuuuN(var8);
                     this.VVnVNnunVvu
                        .UuUVuuUu(
                           var9,
                           var3.vVvUvVVuuNvV(var8),
                           var10 > 0 ? var10 : var9,
                           var1,
                           var2,
                           new C0cc0cCOo0O.nvnNNunvv(
                              this.UNnVVNvvnVvU.uUnuvNvvNU() * 2.0F,
                              this.NnUuNNU.uUnuvNvvNU(),
                              this.UnUNVVVNuv() ? 0.0F : this.uNnUnnuNUnNu.uUnuvNvvNU() * 2.0F,
                              this.nUUVuvU() ? 0.0F : 1.35F,
                              this.nNvNUVU.uUnuvNvvNU(),
                              0,
                              this.uUVuVvuNUvnu.C00OOC00oO("Статичный") ? 1 : 0,
                              this.UnUNuUU.C00OOC00oO("Предмет") ? 1 : 0,
                              this.NuunnvnN[0],
                              this.NuunnvnN[1],
                              this.NuunnvnN[2],
                              this.NVUunUNUN[0],
                              this.NVUunUNUN[1],
                              this.NVUunUNUN[2]
                           )
                        );
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(float[] var1, float[] var2) {
      if (this.UnUNuUU.C00OOC00oO("Свой")) {
         UuUVuuUu(this.UvUvUNuvNU.uUnuvNvvNU().getRGB(), var1);
         UuUVuuUu(this.c0oOOCcCoC0.uUnuvNvvNU().getRGB(), var2);
      } else {
         NvVNvUvunNNu var3 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.WILD;
         NUunUunuNV var4 = NUunUunuNV.UuUVuuUu(var3, VVNunVNVuuu.vVvUvVVuuNvV());
         UuUVuuUu(var4.uVunuUNVVUUV(), var1);
         UuUVuuUu(var4.UNnVVNvvnVvU(), var2);
      }
   }

   private boolean nUUVuvU() {
      return this.uVunuUNVVUUV.C00OOC00oO("Свечение");
   }

   private boolean UnUNVVVNuv() {
      return this.uVunuUNVVUUV.C00OOC00oO("Контур");
   }

   private boolean vNVuvnUUnuUn() {
      return uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.method_31044() != null && uUnuvNvvNU.field_1690.method_31044().method_31034();
   }

   private boolean UvnvNVnnnnNU() {
      return uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.field_1842;
   }

   private void uVUVnuvnuVuv() {
      Runnable var1 = () -> {
         vnNNnvUvUUv.UuUVuuUu().C00OOC00oO();
         C0cc0cCOo0O var1x = this.VVnVNnunVvu;
         this.VVnVNnunVvu = null;
         if (var1x != null) {
            var1x.close();
         }
      };
      if (RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L) {
         var1.run();
      } else if (uUnuvNvvNU != null) {
         uUnuvNvvNU.execute(var1);
      }
   }

   private static class_1306 UuUVuuUu(class_1306 var0) {
      return var0 == class_1306.field_6183 ? class_1306.field_6182 : class_1306.field_6183;
   }

   private static void UuUVuuUu(int var0, float[] var1) {
      var1[0] = (var0 >> 16 & 0xFF) / 255.0F;
      var1[1] = (var0 >> 8 & 0xFF) / 255.0F;
      var1[2] = (var0 & 0xFF) / 255.0F;
   }
}
