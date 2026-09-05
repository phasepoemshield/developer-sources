package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_10799;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2664;
import net.minecraft.class_2846;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4588;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AncientXray",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Поиск обломков после взрыва ТНТ",
   vVvUvVVuuNvV = {uVUNNUnNvU.VIP}
)
public class AncientXray extends Module {
   private final Set<class_2338> NVNnnvnuunNv = ConcurrentHashMap.newKeySet();
   private final Set<class_2338> uVunuUNVVUUV = ConcurrentHashMap.newKeySet();
   private final List<AncientXray.NVnVnNnN> UNnVVNvvnVvU = new ArrayList<>();
   private static final int uNnUnnuNUnNu = 28;
   private static final int[] NnUuNNU = new int[]{4, 10, 20, 40};
   private long nNvNUVU = 0L;
   private static final int UnUNuUU = 4096;
   private static final RenderPipeline uUVuVvuNUvnu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "block_esp_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 UvUvUNuvNU = class_1921.method_24049(
      "block_esp_box", 4096, false, true, uUVuVvuNUvnu, class_4688.method_23598().method_23617(false)
   );

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.NVNnnvnuunNv.clear();
      this.uVunuUNVVUUV.clear();
      this.UNnVVNvvnVvU.clear();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         this.UuuNnUvUuv();
      }
   }

   @Override
   public void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         Iterator var1 = this.UNnVVNvvnVvU.iterator();

         while (var1.hasNext()) {
            AncientXray.NVnVnNnN var2 = (AncientXray.NVnVnNnN)var1.next();
            var2.C00OOC00oO--;
            if (var2.C00OOC00oO <= 0) {
               this.C00OOC00oO(var2.UuUVuuUu, 28);
               var1.remove();
            }
         }

         if (System.currentTimeMillis() - this.nNvNUVU > 50L) {
            for (class_2338 var3 : this.NVNnnvnuunNv) {
               if (!this.uVunuUNVVUUV.contains(var3)) {
                  this.uVunuUNVVUUV.add(var3);
                  this.vVvUvVVuuNvV(var3);
                  this.nNvNUVU = System.currentTimeMillis();
                  break;
               }
            }
         }
      }
   }

   public void nUUVuvU() {
      this.NVNnnvnuunNv.clear();
      this.uVunuUNVVUUV.clear();
      this.UNnVVNvvnVvU.clear();
   }

   public void UuUVuuUu(class_2338 var1, int var2) {
      if (var1 != null) {
         this.UNnVVNvvnVvU.add(new AncientXray.NVnVnNnN(var1.method_10062(), var2));
      }
   }

   public void UuUVuuUu(class_2338 var1, class_2248 var2) {
      this.C00OOC00oO(var1, var2);
   }

   public List<class_2338> UnUNVVVNuv() {
      return new ArrayList<>(this.NVNnnvnuunNv);
   }

   public void UuUVuuUu(class_2338 var1) {
      this.NVNnnvnuunNv.remove(var1);
      this.uVunuUNVVUUV.remove(var1);
   }

   public boolean C00OOC00oO(class_2338 var1) {
      return this.NVNnnvnuunNv.contains(var1);
   }

   public boolean uUnuvNvvNU(class_2338 var1) {
      return this.uNNnnnuuuN(var1);
   }

   private void vVvUvVVuuNvV(class_2338 var1) {
      if (uUnuvNvvNU.method_1562() != null) {
         uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12968, var1, class_2350.field_11036));
         uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12971, var1, class_2350.field_11036));
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1687 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_2664 var2) {
            class_2338 var10 = class_2338.method_49638(var2.comp_2883());

            for (int var9 : NnUuNNU) {
               this.UuUVuuUu(var10, var9);
            }
         } else if (var1.vVvUvVVuuNvV() instanceof class_2626 var3) {
            this.C00OOC00oO(var3.method_11309(), var3.method_11308().method_26204());
         } else if (var1.vVvUvVVuuNvV() instanceof class_2637 var4) {
            var4.method_30621((var1x, var2x) -> this.C00OOC00oO(var1x, var2x.method_26204()));
         }
      }
   }

   private void C00OOC00oO(class_2338 var1, class_2248 var2) {
      class_2338 var3 = var1.method_10062();
      if (var2 == class_2246.field_22109) {
         if (this.uNNnnnuuuN(var3) && this.NVNnnvnuunNv.add(var3)) {
            vVnvuVVUunuv.UuUVuuUu("§6[AncientXray] §fОбломок найден §e" + var3.method_23854());
         }
      } else {
         this.NVNnnvnuunNv.remove(var3);
         this.uVunuUNVVUUV.remove(var3);
      }
   }

   private void C00OOC00oO(class_2338 var1, int var2) {
      if (uUnuvNvvNU.field_1687 != null) {
         class_2339 var3 = new class_2339();

         for (int var4 = -var2; var4 <= var2; var4++) {
            for (int var5 = -var2; var5 <= var2; var5++) {
               for (int var6 = -var2; var6 <= var2; var6++) {
                  var3.method_10103(var1.method_10263() + var4, var1.method_10264() + var5, var1.method_10260() + var6);
                  if (this.uNNnnnuuuN(var3)) {
                     class_2338 var7 = var3.method_10062();
                     if (this.NVNnnvnuunNv.add(var7)) {
                        vVnvuVVUunuv.UuUVuuUu("§fОбнаружен обломок: §e" + var7.method_23854());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2248 var2 = uUnuvNvvNU.field_1687.method_8320(var1).method_26204();
         return var2 == class_2246.field_22109 && this.nuUnNvnuUu(var1) && !this.VVuuUN(var1) && this.vNUvnnVnUvu(var1) && !this.uVUuuVnNVU(var1);
      }
   }

   private boolean nuUnNvnuUu(class_2338 var1) {
      int var2 = 0;

      for (class_2350 var6 : class_2350.values()) {
         class_2248 var7 = uUnuvNvvNU.field_1687.method_8320(var1.method_10093(var6)).method_26204();
         if (var7 == class_2246.field_10124 || var7 == class_2246.field_10164 || var7 == class_2246.field_10543) {
            if (++var2 >= 2) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean VVuuUN(class_2338 var1) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               class_2248 var6 = uUnuvNvvNU.field_1687.method_8320(var1.method_10069(var3, var4, var5)).method_26204();
               if (var6 == class_2246.field_10213 || var6 == class_2246.field_23077) {
                  if (++var2 >= 4) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean vNUvnnVnUvu(class_2338 var1) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               class_2248 var6 = uUnuvNvvNU.field_1687.method_8320(var1.method_10069(var3, var4, var5)).method_26204();
               if (var6 == class_2246.field_10124 || var6 == class_2246.field_10164 || var6 == class_2246.field_10543) {
                  if (++var2 >= 4) {
                     return true;
                  }
               }
            }
         }
      }

      return var2 >= 4;
   }

   private boolean uVUuuVnNVU(class_2338 var1) {
      int var2 = 0;

      for (int var3 = -3; var3 <= 2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -2; var5 <= 3; var5++) {
               if (uUnuvNvvNU.field_1687.method_8320(var1.method_10069(var3, var4, var5)).method_26204() == class_2246.field_22109) {
                  if (++var2 > 6) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && !this.NVNnnvnuunNv.isEmpty()) {
         class_4598 var2 = nNNnNvVVv.UuUVuuUu();

         try {
            class_243 var3 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            Matrix4f var4 = var1.uUnuvNvvNU().method_23760().method_23761();
            int var5 = -2147418368;
            class_4588 var6 = var2.getBuffer(UvUvUNuvNU);

            for (class_2338 var8 : this.NVNnnvnuunNv) {
               if (!uUnuvNvvNU.field_1687.method_8320(var8).method_27852(class_2246.field_22109)) {
                  this.NVNnnvnuunNv.remove(var8);
               } else {
                  float var9 = (float)(var8.method_10263() - var3.field_1352);
                  float var10 = (float)(var8.method_10264() - var3.field_1351);
                  float var11 = (float)(var8.method_10260() - var3.field_1350);
                  float var12 = var9 + 1.0F;
                  float var13 = var10 + 1.0F;
                  float var14 = var11 + 1.0F;
                  uUVNNUvvn.NVnVnNnN.NVnVnNnN.UuUVuuUu(var6, var4, var9, var10, var11, var12, var13, var14, var5);
               }
            }
         } finally {
            nNNnNvVVv.C00OOC00oO();
         }
      }
   }

   static class NVnVnNnN {
      class_2338 UuUVuuUu;
      int C00OOC00oO;

      NVnVnNnN(class_2338 var1, int var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
