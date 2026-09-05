package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ColorPlus",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Цветокоррекция мира — пресеты и тонкая настройка"
)
public class ColorPlus extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Пресет", "Cinematic", uuuUNnu.UuUVuuUu());
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Сила эффекта", 1.0F, 0.0F, 1.0F, 0.01F, true);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Резкость (CAS)", true);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Экспозиция", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Контраст", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Насыщенность", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Vibrance", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Гамма", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn UvUvUNuvNU = new nNUuNvVn("Температура", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Оттенок (зелёный/маджента)", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Интенсивность Bloom", 0.0F, -0.3F, 0.3F, 0.01F, false);
   public final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Сила резкости", 0.0F, -0.3F, 0.3F, 0.01F, false);
   public final nNUuNvVn NuunnvnN = new nNUuNvVn("Виньетка", 0.0F, -0.3F, 0.3F, 0.01F, false);

   public ColorPlus() {
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
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN
         }
      );
   }

   public uuuUNnu UuuNnUvUuv() {
      return uuuUNnu.UuUVuuUu(this.NVNnnvnuunNv.uUnuvNvvNU());
   }
}
