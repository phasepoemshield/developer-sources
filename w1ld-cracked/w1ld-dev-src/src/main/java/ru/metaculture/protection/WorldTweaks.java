package ru.metaculture.protection;

import java.awt.Color;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "WorldTweaks",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Кинематографичная атмосфера: ветер, туман, тонировка неба",
   vVvUvVVuuNvV = {uVUNNUnNvU.NEW}
)
public final class WorldTweaks extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Wind Speed", 0.72F, 0.0F, 2.0F, 0.01F, false);
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Wind Direction", 35.0F, 0.0F, 360.0F, 1.0F, false);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Fog Density", 0.032F, 0.0F, 0.1F, 0.001F, false);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Horizon Dissolve", 0.82F, 0.0F, 1.0F, 0.01F, true);
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Sky Lift", 0.64F, 0.0F, 1.0F, 0.01F, true);
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Edge Softness", 0.72F, 0.0F, 1.0F, 0.01F, true);
   public final UNvnUnnvUV UnUNuUU = new UNvnUnnvUV("Atmosphere Tint", 6978453);

   public WorldTweaks() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU});
   }

   public static boolean UuuNnUvUuv() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         WorldTweaks var0 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(WorldTweaks.class);
         return var0 != null && var0.nuUnNvnuUu;
      } else {
         return false;
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 0
   )
   public void UuUVuuUu(uUnnuUn var1) {
      if (var1 != null
         && var1.uUnuvNvvNU() != null
         && var1.uUnuvNvvNU().field_1687 != null
         && var1.uUnuvNvvNU().field_1724 != null
         && var1.uNNnnnuuuN() != null) {
         uUvNNnvNvN.nvnNNunvv var2 = new uUvNNnvNvN.nvnNNunvv();
         Color var3 = this.UnUNuUU.uUnuvNvvNU();
         float var4 = (float)Math.toRadians(this.uVunuUNVVUUV.uUnuvNvvNU());
         var2.UuUVuuUu = this.NVNnnvnuunNv.uUnuvNvvNU();
         var2.C00OOC00oO = (float)Math.cos(var4);
         var2.uUnuvNvvNU = 0.0F;
         var2.vVvUvVVuuNvV = (float)Math.sin(var4);
         var2.uNNnnnuuuN = this.UNnVVNvvnVvU.uUnuvNvvNU();
         var2.nuUnNvnuUu = this.uNnUnnuNUnNu.uUnuvNvvNU();
         var2.VVuuUN = this.NnUuNNU.uUnuvNvvNU();
         var2.vNUvnnVnUvu = this.nNvNUVU.uUnuvNvvNU();
         var2.uVUuuVnNVU = var3.getRed() / 255.0F;
         var2.vuuuNvNuv = var3.getGreen() / 255.0F;
         var2.nvUVNnuu = var3.getBlue() / 255.0F;
         var2.vNVuvnUUnuUn = ((float)var1.uUnuvNvvNU().field_1687.method_8510() + var1.uVUuuVnNVU()) * 0.05F;
         uUvNNnvNvN.UuUVuuUu().UuUVuuUu(var1.uUnuvNvvNU(), var1.uNNnnnuuuN().UuUVuuUu(), var1.VVuuUN(), var1.vNUvnnVnUvu(), var2);
      }
   }
}
