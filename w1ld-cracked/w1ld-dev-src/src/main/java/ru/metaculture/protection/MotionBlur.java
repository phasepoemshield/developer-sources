package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "MotionBlur",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Физически основанный MotionBlur, очень сильно повышает плавность картинки.",
   vVvUvVVuuNvV = {uVUNNUnNvU.NEW}
)
public final class MotionBlur extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Плавность", 0.68F, 0.0F, 1.0F, 0.01F, true);

   public MotionBlur() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @Override
   public void UuUVuuUu() {
      vuNUvnNUuV.UuUVuuUu().C00OOC00oO();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      vuNUvnNUuV.UuUVuuUu().C00OOC00oO();
   }

   public vuNUvnNUuV.nvnNNunvv UuuNnUvUuv() {
      float var1 = Math.max(0.0F, Math.min(1.0F, this.NVNnnvnuunNv.uUnuvNvvNU()));
      float var2 = var1 * var1 * (3.0F - 2.0F * var1);
      vuNUvnNUuV.nvnNNunvv var3 = new vuNUvnNUuV.nvnNNunvv();
      var3.UuUVuuUu = 0.38F + var2 * 0.92F;
      var3.C00OOC00oO = 1.1F + var2 * 2.25F;
      var3.uUnuvNvvNU = 5 + Math.round(var2 * 7.0F);
      var3.vVvUvVVuuNvV = 24.0F + var2 * 82.0F;
      var3.uNNnnnuuuN = 0.3F + var2 * 0.42F;
      var3.nuUnNvnuUu = 0.22F + var2 * 1.12F;
      var3.VVuuUN = 0.68F;
      var3.vNUvnnVnUvu = 2.85F - var2 * 1.35F;
      var3.uVUuuVnNVU = 0.035F + (1.0F - var2) * 0.075F;
      return var3;
   }
}
