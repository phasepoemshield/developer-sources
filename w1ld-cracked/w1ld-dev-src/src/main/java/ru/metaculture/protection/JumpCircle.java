package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7833;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "JumpCircle",
   C00OOC00oO = "Красивый круг после прыжка",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class JumpCircle extends Module {
   private static final long NnUuNNU = 250L;
   private static final long nNvNUVU = 1500L;
   private static final long UnUNuUU = 850L;
   private static final float uUVuVvuNUvnu = 1.95F;
   private static final float UvUvUNuvNU = 0.04F;
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Переливание", false);
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Скорость переливания", 1.0F, 0.1F, 3.0F, 0.05F, false);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Яркость", 1.0F, 0.25F, 2.0F, 0.05F, false);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final List<JumpCircle.NVnVnNnN> c0oOOCcCoC0 = new ArrayList<>();
   private long VVnVNnunVvu;

   public JumpCircle() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
      uNUNuuVVVvnN.UuUVuuUu();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVuVvuVnVVV var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.VVnVNnunVvu >= 250L) {
            this.VVnVNnunVvu = var2;
            this.c0oOOCcCoC0.add(new JumpCircle.NVnVnNnN(uUnuvNvvNU.field_1724.method_19538().method_1031(0.0, 0.04F, 0.0), var2));
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (!this.c0oOOCcCoC0.isEmpty()) {
         long var2 = System.currentTimeMillis();
         this.c0oOOCcCoC0.removeIf(var2x -> var2 - var2x.C00OOC00oO > 1500L);
         if (!this.c0oOOCcCoC0.isEmpty()) {
            NvVNvUvunNNu var4 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
               ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
               : NvVNvUvunNNu.WILD;
            int var5 = var4 == NvVNvUvunNNu.WILD ? 8108031 : var4.UuUVuuUu().getRGB() & 16777215;
            int var6 = var5 >> 16 & 0xFF;
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 & 0xFF;
            boolean var9 = this.NVNnnvnuunNv.uUnuvNvvNU();
            uNUNuuVVVvnN.UuUVuuUu(this.uVunuUNVVUUV.uUnuvNvvNU(), this.UNnVVNvvnVvU.uUnuvNvvNU(), this.uNnUnnuNUnNu.uUnuvNvvNU());
            class_4598 var10 = nNNnNvVVv.UuUVuuUu();

            try {
               class_4588 var11 = var10.getBuffer(var9 ? uNUNuuVVVvnN.uUnuvNvvNU() : uNUNuuVVVvnN.C00OOC00oO());
               class_4587 var12 = var1.uUnuvNvvNU();
               class_243 var13 = uUnuvNvvNU.field_1773.method_19418().method_19326();

               for (JumpCircle.NVnVnNnN var15 : this.c0oOOCcCoC0) {
                  long var16 = var2 - var15.C00OOC00oO;
                  if (var16 >= 850L && !var15.nuUnNvnuUu) {
                     var15.uNNnnnuuuN.UuUVuuUu(0.0, 0.65, VnuVvnV.nvUVNnuu);
                     var15.vVvUvVVuuNvV.UuUVuuUu(1.35, 0.65, VnuVvnV.nvUVNnuu);
                     var15.nuUnNvnuUu = true;
                  }

                  var15.uUnuvNvvNU.UuUVuuUu();
                  var15.vVvUvVVuuNvV.UuUVuuUu();
                  var15.uNNnnnuuuN.UuUVuuUu();
                  float var18 = Math.max(0.0F, Math.min(1.0F, (float)var15.uUnuvNvvNU.uVUuuVnNVU()));
                  float var19 = (float)var15.vVvUvVVuuNvV.uVUuuVnNVU();
                  float var20 = Math.max(0.0F, Math.min(1.0F, (float)var15.uNNnnnuuuN.uVUuuVnNVU()));
                  if (!(var20 <= 0.002F) && !(var19 <= 0.001F)) {
                     int var21 = (int)(var20 * var18 * 255.0F);
                     float var22 = 1.95F * var19 * var18;
                     var12.method_22903();
                     var12.method_22904(
                        var15.UuUVuuUu.field_1352 - var13.field_1352,
                        var15.UuUVuuUu.field_1351 - var13.field_1351,
                        var15.UuUVuuUu.field_1350 - var13.field_1350
                     );
                     var12.method_22907(class_7833.field_40714.rotationDegrees(90.0F));
                     this.UuUVuuUu(var11, var12.method_23760().method_23761(), var22, var6, var7, var8, var21);
                     var12.method_22909();
                  }
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
               uNUNuuVVVvnN.uNNnnnuuuN();
            }
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, int var4, int var5, int var6, int var7) {
      float var8 = var3 * 0.5F;
      var1.method_22918(var2, -var8, -var8, 0.0F).method_22913(0.0F, 0.0F).method_1336(var4, var5, var6, var7).method_22914(0.0F, 0.0F, 1.0F);
      var1.method_22918(var2, var8, -var8, 0.0F).method_22913(1.0F, 0.0F).method_1336(var4, var5, var6, var7).method_22914(0.0F, 0.0F, 1.0F);
      var1.method_22918(var2, var8, var8, 0.0F).method_22913(1.0F, 1.0F).method_1336(var4, var5, var6, var7).method_22914(0.0F, 0.0F, 1.0F);
      var1.method_22918(var2, -var8, var8, 0.0F).method_22913(0.0F, 1.0F).method_1336(var4, var5, var6, var7).method_22914(0.0F, 0.0F, 1.0F);
   }

   static final class NVnVnNnN {
      final class_243 UuUVuuUu;
      final long C00OOC00oO;
      final VUvNnVnU uUnuvNvvNU = new VUvNnVnU();
      final VUvNnVnU vVvUvVVuuNvV = new VUvNnVnU();
      final VUvNnVnU uNNnnnuuuN = new VUvNnVnU();
      boolean nuUnNvnuUu;

      NVnVnNnN(class_243 var1, long var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU.UuUVuuUu(1.0, 0.28, VnuVvnV.nvUVNnuu);
         this.vVvUvVVuuNvV.UuUVuuUu(1.0, 0.4, VnuVvnV.UnUNVVVNuv);
         this.uNNnnnuuuN.UuUVuuUu(1.0, 0.18, VnuVvnV.UnUNVVVNuv);
      }
   }
}
