package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "VisibleEating",
   C00OOC00oO = "Показывает еду и зелья, которые используют игроки",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class VisibleEating extends Module {
   public static final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Размер", 24.0F, 16.0F, 42.0F, 1.0F, false);
   public static final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Дистанция", 64.0F, 8.0F, 160.0F, 2.0F, false);
   public static final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Сдвиг по Y", -28.0F, -120.0F, 120.0F, 1.0F, false);
   public static final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Только видимые", false);
   public static final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Показывать себя", false);
   public static final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Фон", true);
   private static final float UnUNuUU = 0.42F;
   private static final float uUVuVvuNUvnu = 6.0F;
   private static final float UvUvUNuvNU = 0.52F;
   private final nnvNuuNvvuu c0oOOCcCoC0 = new nnvNuuNvvuu() {};
   private final Map<UUID, VisibleEating.NVnVnNnN> VVnVNnunVvu = new HashMap<>();

   public VisibleEating() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU, nNvNUVU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         UnVNvNnU var2 = var1.vVvUvVVuuNvV();
         float var3 = uUnuvNvvNU.method_61966().method_60637(true);
         int var4 = var1.nuUnNvnuUu();
         int var5 = var1.VVuuUN();
         HashSet var6 = new HashSet();

         for (class_1657 var8 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var8 != null) {
               var6.add(var8.method_5667());
               boolean var9 = this.UuUVuuUu(var8) && var8.method_6115();
               class_1799 var10 = var9 ? var8.method_6030() : class_1799.field_8037;
               boolean var11 = var9 && !var10.method_7960() && (var10.method_7976() == class_1839.field_8950 || var10.method_7976() == class_1839.field_8946);
               VisibleEating.NVnVnNnN var12 = this.VVnVNnunVvu.computeIfAbsent(var8.method_5667(), var0 -> new VisibleEating.NVnVnNnN());
               var12.uNNnnnuuuN = var11;
               if (var11) {
                  var12.uUnuvNvvNU = var10.method_7972();
                  var12.vVvUvVVuuNvV = this.UuUVuuUu(var8, var10);
               } else {
                  var12.vVvUvVVuuNvV = 0.0F;
               }
            }
         }

         this.VVnVNnunVvu.entrySet().removeIf(var1x -> {
            VisibleEating.NVnVnNnN var2x = var1x.getValue();
            if (!var6.contains(var1x.getKey())) {
               var2x.uNNnnnuuuN = false;
               var2x.uUnuvNvvNU = null;
            }

            return var2x.UuUVuuUu.nvUVNnuu() <= 0.005F && !var2x.uNNnnnuuuN;
         });
         this.UuUVuuUu(var2, var3, var4, var5);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, int var3, int var4) {
      if (!this.VVnVNnunVvu.isEmpty()) {
         NUunUunuNV var5 = NUunUunuNV.UuUVuuUu(this.UuuNnUvUuv(), VVNunVNVuuu.vVvUvVVuuNvV());
         int var6 = var5.uVunuUNVVUUV();
         int var7 = VnVnuUn.uUnuvNvvNU(255, 255, 255, 42);
         float var8 = NVNnnvnuunNv.uUnuvNvvNU();
         float var9 = var8 * 0.52F;
         float var10 = NuNvVUuUUnun.uUnuvNvvNU(var9 / 16.0F);
         float var11 = var8 * 0.52F;
         float var12 = Math.max(2.0F, var8 * 0.11F);

         for (Entry var14 : this.VVnVNnunVvu.entrySet()) {
            VisibleEating.NVnVnNnN var15 = (VisibleEating.NVnVnNnN)var14.getValue();
            var15.UuUVuuUu.UuUVuuUu();
            var15.UuUVuuUu.UuUVuuUu(var15.uNNnnnuuuN ? 1.0 : 0.0, 0.25, VnuVvnV.UNnVVNvvnVvU);
            if (!(var15.UuUVuuUu.nvUVNnuu() <= 0.005F) && var15.uUnuvNvvNU != null && !var15.uUnuvNvvNU.method_7960()) {
               class_1657 var16 = uUnuvNvvNU.field_1687.method_18470((UUID)var14.getKey());
               if (var16 != null) {
                  class_243 var17 = var16.method_30950(var2).method_1031(0.0, var16.method_17682() + 0.42F, 0.0);
                  class_243 var18 = VnNnNnvuvn.UuUVuuUu(var17);
                  if (!(var18.field_1350 <= 0.001F) && !(var18.field_1350 > 1.0)) {
                     float var19 = (float)var18.field_1352;
                     float var20 = (float)var18.field_1351 + UNnVVNvvnVvU.uUnuvNvvNU();
                     if (!(var19 < -6.0F) && !(var19 > var3 + 6.0F) && !(var20 < -6.0F) && !(var20 > var4 + 6.0F)) {
                        float var21 = (float)var15.UuUVuuUu.nvUVNnuu();
                        var15.C00OOC00oO.UuUVuuUu();
                        var15.C00OOC00oO.UuUVuuUu(var15.vVvUvVVuuNvV, 0.35F, VnuVvnV.UNnVVNvvnVvU);
                        float var22 = Math.max(0.01F, (float)var15.C00OOC00oO.nvUVNnuu());
                        if (nNvNUVU.uUnuvNvvNU()) {
                           float var23 = var12 + 5.0F;
                           float var24 = (var11 + var23) * 2.0F;
                           float var25 = var19 - var24 * 0.5F;
                           float var26 = var20 - var24 * 0.5F;
                           this.c0oOOCcCoC0.UuUVuuUu(var1, var25, var26, var24, var24, var24 * 0.32F, var21);
                        }

                        var1.UuUVuuUu(var19, var20, var11, 0.0F, 1.0F, var12, var7);
                        var1.UuUVuuUu(var19, var20, var11, 90.0F, var22, var12, NUunUunuNV.UuUVuuUu(var6, (int)(235.0F * var21)));
                        NuNvVUuUUnun.UuUVuuUu(var1, var15.uUnuvNvvNU, var19 - var9 * 0.5F, var20 - var9 * 0.5F, var10, 0, false, 0);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1657 var1) {
      if (var1 == null || !var1.method_5805() || var1.method_7325()) {
         return false;
      } else if (var1 == uUnuvNvvNU.field_1724 && !NnUuNNU.uUnuvNvvNU()) {
         return false;
      } else {
         return var1.method_5858(uUnuvNvvNU.field_1724) > uVunuUNVVUUV.uUnuvNvvNU() * uVunuUNVVUUV.uUnuvNvvNU()
            ? false
            : !uNnUnnuNUnNu.uUnuvNvvNU() || uUnuvNvvNU.field_1724.method_6057(var1);
      }
   }

   private float UuUVuuUu(class_1657 var1, class_1799 var2) {
      if (var2 != null && !var2.method_7960()) {
         int var3 = var2.method_7935(var1);
         return var3 <= 0 ? 0.0F : class_3532.method_15363((float)var1.method_6048() / var3, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   private NvVNvUvunNNu UuuNnUvUuv() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null
            && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
            && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
   }

   @Override
   public void C00OOC00oO() {
      this.VVnVNnunVvu.clear();
      super.C00OOC00oO();
   }

   static class NVnVnNnN {
      final uVVuNvUUV UuUVuuUu = new uVVuNvUUV();
      final uVVuNvUUV C00OOC00oO = new uVVuNvUUV();
      class_1799 uUnuvNvvNU;
      float vVvUvVVuuNvV;
      boolean uNNnnnuuuN;
   }
}
