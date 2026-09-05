package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.class_10799;
import net.minecraft.class_1297;
import net.minecraft.class_1667;
import net.minecraft.class_1684;
import net.minecraft.class_1685;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5819;
import net.minecraft.class_9799;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2902.class_2903;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_4668.class_4683;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Particles",
   C00OOC00oO = "Улучшенные частицы при атаках и бросках",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class Particles extends Module {
   public static VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Спавнить при", new vvNnnUNnVvn("Атаке", true), new vvNnnUNnVvn("Бросок", true), new vvNnnUNnVvn("В мире", false)
   );
   public static UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU(
      "Тип частиц", "Bloom", "Bloom", "Star", "Snow", "Heart", "Dollar", "Triangle", "Sakura", "Genshin", "Rhombus"
   );
   public static nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Размер", 0.5F, 0.0F, 1.0F, 0.1F, false);
   public static nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Количество", 10.0F, 10.0F, 100.0F, 10.0F, false);
   public static nNUuNvVn NnUuNNU = new nNUuNvVn("Время жизни", 2.0F, 0.5F, 10.0F, 0.5F, false);
   public static nNUuNvVn nNvNUVU = new nNUuNvVn("Радиус в мире", 12.0F, 2.0F, 50.0F, 1.0F, false);
   public static vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Физика", true);
   public static UvNnUnuNUUU uUVuVvuNUvnu = new UvNnUnuNUUU("Режим цвета", "Клиентовский", "Клиентовский", "Свой");
   public static VnnUvVNuNuVv UvUvUNuvNU = new VnnUvVNuNuVv("Кастом цвет", 15.0F, 1.0F, 1.0F).C00OOC00oO(() -> !uUVuVvuNUvnu.C00OOC00oO("Свой"));
   private static final int c0oOOCcCoC0 = 1024;
   private long VVnVNnunVvu = System.nanoTime();
   private static final String unNNVVNnvvV = "wild";
   private static final RenderPipeline NuunnvnN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final Map<Particles.nvnNNunvv, class_1921> NVUunUNUN = new ConcurrentHashMap<>();
   private final List<Particles.NVnVnNnN> UUVNuUNUvUnV = new ArrayList<>();
   private final List<Particles.NVnVnNnN> vuvnUnVnUNnV = new ArrayList<>();
   private final List<Particles.NVnVnNnN> nnuUVNUuvvVU = new ArrayList<>();
   private static final Vector3f nVVUuvuNnUN = new Vector3f(0.0F, 0.0F, 1.0F);

   public Particles() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, uUVuVvuNUvnu, UvUvUNuvNU, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU, nNvNUVU, UnUNuUU});
   }

   private void UuuNnUvUuv() {
      this.UUVNuUNUvUnV.clear();
      this.nnuUVNUuvvVU.clear();
      this.vuvnUnVnUNnV.clear();
   }

   private void UuUVuuUu(List<Particles.NVnVnNnN> var1, class_243 var2, class_243 var3) {
      float var4 = 0.05F + UNnVVNvvnVvU.uUnuvNvvNU() * 0.2F;
      int var5 = uUVuVvuNUvnu.C00OOC00oO("Свой") ? UvUvUNuvNU.uUnuvNvvNU().getRGB() : VnVnuUn.uNnUnnuNUnNu(var1.size() * 100);
      String var7 = uVunuUNVVUUV.uUnuvNvvNU();

      Particles.nvnNNunvv var6 = switch (var7) {
         case "Heart" -> Particles.nvnNNunvv.HEART;
         case "Star" -> Particles.nvnNNunvv.STAR;
         case "Snow" -> Particles.nvnNNunvv.SNOW;
         case "Bloom" -> Particles.nvnNNunvv.BLOOM;
         case "Dollar" -> Particles.nvnNNunvv.DOLLAR;
         case "Triangle" -> Particles.nvnNNunvv.TRIANGLE;
         case "Sakura" -> Particles.nvnNNunvv.SAKURA;
         case "Genshin" -> Particles.nvnNNunvv.GEMINI;
         case "Rhombus" -> Particles.nvnNNunvv.SIMS;
         default -> Particles.nvnNNunvv.BLOOM;
      };
      var1.add(
         new Particles.NVnVnNnN(
            var6,
            var2.method_1031(0.0, var4, 0.0),
            var3,
            var1.size(),
            (int)VnNnNnvuvn.uNNnnnuuuN(VnNnNnvuvn.vVvUvVVuuNvV(0.0F, 360.0F), 15.0),
            var5,
            var4,
            0.2F
         )
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNvNuNnVNUvv var1) {
      class_1297 var2 = var1.uUnuvNvvNU();
      float var3 = 6.0F;
      if (NVNnnvnuunNv.C00OOC00oO("Атаке")) {
         int var4 = (int)uNnUnnuNUnNu.uUnuvNvvNU();

         for (int var5 = 0; var5 < var4; var5++) {
            this.UuUVuuUu(
               this.UUVNuUNUvUnV,
               new class_243(var2.method_23317(), var2.method_23318() + VnNnNnvuvn.vVvUvVVuuNvV(0.0F, var2.method_17682()), var2.method_23321()),
               new class_243(VnNnNnvuvn.vVvUvVVuuNvV(-var3, var3), VnNnNnvuvn.vVvUvVVuuNvV(-var3, var3), VnNnNnvuvn.vVvUvVVuuNvV(-var3, var3))
            );
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UNNVUnNV var1) {
      if (NVNnnvnuunNv.C00OOC00oO("Бросок")) {
         if (uUnuvNvvNU.field_1687 == null) {
            return;
         }

         for (class_1297 var3 : uUnuvNvvNU.field_1687.method_18112()) {
            if ((var3 instanceof class_1684 || var3 instanceof class_1667 || var3 instanceof class_1685)
               && (!(var3 instanceof class_1685 var4) || !var4.method_24828())) {
               boolean var17 = var3.field_6014 != var3.method_23317() || var3.field_6036 != var3.method_23318() || var3.field_5969 != var3.method_23321();
               if (var17) {
                  class_243 var5 = var3.method_19538();
                  int var6 = Math.max(1, (int)(uNnUnnuNUnNu.uUnuvNvvNU() / 10.0F));

                  for (int var7 = 0; var7 < var6; var7++) {
                     this.UuUVuuUu(
                        this.nnuUVNUuvvVU,
                        new class_243(
                           var5.field_1352 + class_3532.method_15366(class_5819.method_43047(), -0.2, 0.2),
                           var5.field_1351 + class_3532.method_15366(class_5819.method_43047(), -0.2, 0.2),
                           var5.field_1350 + class_3532.method_15366(class_5819.method_43047(), -0.2, 0.2)
                        ),
                        new class_243(
                           class_3532.method_15366(class_5819.method_43047(), -1.0, 1.0),
                           class_3532.method_15366(class_5819.method_43047(), -0.3, 0.3),
                           class_3532.method_15366(class_5819.method_43047(), -1.0, 1.0)
                        )
                     );
                  }
               }
            }
         }
      }

      if (NVNnnvnuunNv.C00OOC00oO("В мире")) {
         if (uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1724 == null) {
            return;
         }

         int var14 = (int)nNvNUVU.uUnuvNvvNU();
         int var16 = Math.max(1, (int)(uNnUnnuNUnNu.uUnuvNvvNU() / 2.0F));

         for (int var18 = 0; var18 < var16; var18++) {
            class_243 var19 = uUnuvNvvNU.field_1724
               .method_19538()
               .method_1031(VnNnNnvuvn.vVvUvVVuuNvV((float)(-var14), (float)var14), 0.0, VnNnNnvuvn.vVvUvVVuuNvV((float)(-var14), (float)var14));
            class_2338 var20 = uUnuvNvvNU.field_1687.method_8598(class_2903.field_13197, class_2338.method_49638(var19));
            double var21 = var20.method_10263() + VnNnNnvuvn.vVvUvVVuuNvV(0.0F, 1.0F);
            double var9 = var20.method_10260() + VnNnNnvuvn.vVvUvVVuuNvV(0.0F, 1.0F);
            double var11 = uUnuvNvvNU.field_1724.method_23318() + VnNnNnvuvn.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_17682(), (float)var14);
            class_243 var13 = new class_243(var21, var11, var9);

            while (!uUnuvNvvNU.field_1687.method_22347(class_2338.method_49638(var13)) && var13.field_1351 < uUnuvNvvNU.field_1687.method_31600()) {
               var13 = var13.method_1031(0.0, 1.0, 0.0);
            }

            this.UuUVuuUu(
               this.vuvnUnVnUNnV,
               var13,
               new class_243(
                  uUnuvNvvNU.field_1724.method_18798().field_1352 + VnNnNnvuvn.vVvUvVVuuNvV(-2.0F, 2.0F),
                  VnNnNnvuvn.C00OOC00oO(-0.2, 0.2),
                  uUnuvNvvNU.field_1724.method_18798().field_1350 + VnNnNnvuvn.vVvUvVVuuNvV(-2.0F, 2.0F)
               )
            );
         }
      }

      long var15 = this.nUUVuvU();
      this.UuUVuuUu(this.UUVNuUNUvUnV, var15);
      this.UuUVuuUu(this.nnuUVNUuvvVU, var15);
      this.UuUVuuUu(this.vuvnUnVnUNnV, var15);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      class_4587 var2 = var1.uUnuvNvvNU();
      class_243 var3 = uUnuvNvvNU.field_1773.method_19418().method_19326();
      long var4 = System.nanoTime();
      double var6 = (var4 - this.VVnVNnunVvu) / 1.0E9;
      this.VVnVNnunVvu = var4;
      class_9799 var8 = new class_9799(262144);
      class_4598 var9 = class_4597.method_22991(var8);

      try {
         long var10 = this.nUUVuvU();
         long var12 = Math.min(400L, Math.max(100L, var10 / 5L));
         long var14 = Math.max(var12 + 1L, (long)((float)var10 * 0.62F));
         this.UuUVuuUu(var2, var9, var3, this.UUVNuUNUvUnV, var12, var14, var6);
         this.UuUVuuUu(var2, var9, var3, this.nnuUVNUuvvVU, var12, var14, var6);
         this.UuUVuuUu(var2, var9, var3, this.vuvnUnVnUNnV, var12, var14, var6);
         var9.method_22993();
      } finally {
         var8.close();
      }
   }

   private long nUUVuvU() {
      return Math.max(250L, (long)(NnUuNNU.uUnuvNvvNU() * 1000.0F));
   }

   private void UuUVuuUu(List<Particles.NVnVnNnN> var1, long var2) {
      var1.removeIf(var2x -> var2x.vuuuNvNuv().UuUVuuUu((double)var2));
   }

   private void UuUVuuUu(class_4587 var1, class_4598 var2, class_243 var3, List<Particles.NVnVnNnN> var4, long var5, long var7, double var9) {
      if (!var4.isEmpty()) {
         var1.method_22903();

         for (Particles.NVnVnNnN var12 : var4) {
            var12.UuUVuuUu(UnUNuUU.uUnuvNvvNU(), var9);
            boolean var13 = !var12.vuuuNvNuv().UuUVuuUu((double)var5);
            boolean var14 = var12.vuuuNvNuv().UuUVuuUu((double)var7);
            if (var13) {
               var12.nvUVNnuu().UuUVuuUu(1.0, 0.4, VvVUUNUu.vNUvnnVnUvu, true);
            } else if (var14) {
               var12.nvUVNnuu().UuUVuuUu(0.0, 0.4, VvVUUNUu.vNUvnnVnUvu, true);
            }

            if (var12.NVNnnvnuunNv.C00OOC00oO()) {
               var12.NVNnnvnuunNv.UuUVuuUu();
            }

            float var15 = var12.NVNnnvnuunNv.uNNnnnuuuN();
            int var16 = (int)(var15 * 255.0F);
            if (var16 > 0) {
               int var17 = VnVnuUn.uNNnnnuuuN(var12.VVuuUN(), var16);
               class_243 var18 = var12.uUnuvNvvNU();
               this.UuUVuuUu(var1, var2, var12, (float)var18.field_1352, (float)var18.field_1351, (float)var18.field_1350, var12.vNUvnnVnUvu, var17, var16);
            }
         }

         var1.method_22909();
      }
   }

   private void UuUVuuUu(class_4587 var1, class_4598 var2, Particles.NVnVnNnN var3, float var4, float var5, float var6, float var7, int var8, int var9) {
      var1.method_22903();
      UnVNvNnU.UuUVuuUu(var1, var4, var5, var6);
      var1.method_22907(uUnuvNvvNU.field_1773.method_19418().method_23767());
      class_1921 var10 = NVUunUNUN.computeIfAbsent(
         var3.C00OOC00oO(),
         var0 -> {
            class_2960 var1x = var0.UuUVuuUu();
            return class_1921.method_24049(
               var1x.toString(), 1024, false, true, NuunnvnN, class_4688.method_23598().method_34577(new class_4683(var1x, false)).method_23617(false)
            );
         }
      );
      class_4665 var11 = var1.method_23760();
      Matrix4f var12 = var11.method_23761();
      Matrix3f var13 = var11.method_23762();
      class_4588 var14 = var2.getBuffer(var10);
      this.UuUVuuUu(var14, var12, var13, -var7, -var7, var7 * 2.0F, var7 * 2.0F, var8, var9);
      if (var3.C00OOC00oO == Particles.nvnNNunvv.BLOOM) {
         this.UuUVuuUu(var14, var12, var13, -var7 / 2.0F, -var7 / 2.0F, var7, var7, var8, var9);
      }

      var1.method_22909();
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, Matrix3f var3, float var4, float var5, float var6, float var7, int var8, int var9) {
      int var10 = var8 >> 16 & 0xFF;
      int var11 = var8 >> 8 & 0xFF;
      int var12 = var8 & 0xFF;
      nVVUuvuNnUN.set(0.0F, 0.0F, 1.0F);
      var3.transform(nVVUuvuNnUN);
      nVVUuvuNnUN.normalize();
      float var15 = var4 + var6;
      float var16 = var5 + var7;
      var1.method_22918(var2, var4, var5, 0.0F)
         .method_1336(var10, var11, var12, var9)
         .method_22913(0.0F, 1.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(nVVUuvuNnUN.x, nVVUuvuNnUN.y, nVVUuvuNnUN.z);
      var1.method_22918(var2, var15, var5, 0.0F)
         .method_1336(var10, var11, var12, var9)
         .method_22913(1.0F, 1.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(nVVUuvuNnUN.x, nVVUuvuNnUN.y, nVVUuvuNnUN.z);
      var1.method_22918(var2, var15, var16, 0.0F)
         .method_1336(var10, var11, var12, var9)
         .method_22913(1.0F, 0.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(nVVUuvuNnUN.x, nVVUuvuNnUN.y, nVVUuvuNnUN.z);
      var1.method_22918(var2, var4, var16, 0.0F)
         .method_1336(var10, var11, var12, var9)
         .method_22913(0.0F, 0.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(nVVUuvuNnUN.x, nVVUuvuNnUN.y, nVVUuvuNnUN.z);
   }

   @Override
   public void a_() {
      super.a_();
      this.UuuNnUvUuv();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.UuuNnUvUuv();
   }

   public static class NVnVnNnN {
      private class_238 UuUVuuUu;
      final Particles.nvnNNunvv C00OOC00oO;
      private class_243 uUnuvNvvNU;
      private class_243 vVvUvVVuuNvV;
      private final int uNNnnnuuuN;
      private final int nuUnNvnuUu;
      private final int VVuuUN;
      final float vNUvnnVnUvu;
      private static final double uVUuuVnNVU = 0.05;
      private static final double vuuuNvNuv = 0.0035;
      private static final double nvUVNnuu = 0.985;
      private static final double UuuNnUvUuv = 0.55;
      private static final double nUUVuvU = 0.72;
      private static final double UnUNVVVNuv = 0.003;
      private static final double vNVuvnUUnuUn = 1.0E-6;
      private final double UvnvNVnnnnNU;
      private final UUVuuNuvVuVv uVUVnuvnuVuv = new UUVuuNuvVuVv();
      final VVnnnnN NVNnnvnuunNv = new VVnnnnN();

      public NVnVnNnN(Particles.nvnNNunvv var1, class_243 var2, class_243 var3, int var4, int var5, int var6, float var7, double var8) {
         double var10 = var7 / 2.0;
         this.UuUVuuUu = new class_238(
            new class_243(var2.field_1352 - var10, var2.field_1351 - var10, var2.field_1350 - var10),
            new class_243(var2.field_1352 + var10, var2.field_1351 + var10, var2.field_1350 + var10)
         );
         this.C00OOC00oO = var1;
         this.uUnuvNvvNU = var2;
         this.vVvUvVVuuNvV = var3.method_1021(0.05);
         this.uNNnnnuuuN = var4;
         this.nuUnNvnuUu = var5;
         this.VVuuUN = var6;
         this.vNUvnnVnUvu = var7;
         this.UvnvNVnnnnNU = var8;
         this.uVUVnuvnuVuv.UuUVuuUu();
      }

      public void UuUVuuUu(boolean var1, double var2) {
         double var4 = var2 * 60.0 * this.UvnvNVnnnnNU;
         if (var1 && Module.uUnuvNvvNU.field_1687 != null) {
            this.vVvUvVVuuNvV = this.vVvUvVVuuNvV.method_1021(Math.pow(0.985, var2 * 60.0)).method_1023(0.0, 0.0035 * var2 * 60.0, 0.0);
            this.UuUVuuUu(this.vVvUvVVuuNvV.field_1352 * var4, 0);
            this.UuUVuuUu(this.vVvUvVVuuNvV.field_1351 * var4, 1);
            this.UuUVuuUu(this.vVvUvVVuuNvV.field_1350 * var4, 2);
         } else {
            this.uUnuvNvvNU = this.uUnuvNvvNU.method_1019(this.vVvUvVVuuNvV.method_1021(var4));
            this.UuuNnUvUuv();
         }
      }

      private void UuUVuuUu(double var1, int var3) {
         if (!(Math.abs(var1) <= 1.0E-6)) {
            class_238 var4 = switch (var3) {
               case 0 -> this.UuUVuuUu.method_989(var1, 0.0, 0.0);
               case 1 -> this.UuUVuuUu.method_989(0.0, var1, 0.0);
               default -> this.UuUVuuUu.method_989(0.0, 0.0, var1);
            };
            if (this.UuUVuuUu(var4)) {
               this.UuUVuuUu(var3);
            } else {
               this.UuUVuuUu = var4;

               this.uUnuvNvvNU = switch (var3) {
                  case 0 -> this.uUnuvNvvNU.method_1031(var1, 0.0, 0.0);
                  case 1 -> this.uUnuvNvvNU.method_1031(0.0, var1, 0.0);
                  default -> this.uUnuvNvvNU.method_1031(0.0, 0.0, var1);
               };
            }
         }
      }

      private void UuUVuuUu(int var1) {
         double var2 = this.vVvUvVVuuNvV.field_1352;
         double var4 = this.vVvUvVVuuNvV.field_1351;
         double var6 = this.vVvUvVVuuNvV.field_1350;
         switch (var1) {
            case 0:
               var2 = -var2 * 0.55;
               break;
            case 1:
               if (var4 < 0.0) {
                  var2 *= 0.72;
                  var6 *= 0.72;
               }

               var4 = -var4 * 0.55;
               break;
            default:
               var6 = -var6 * 0.55;
         }

         this.vVvUvVVuuNvV = new class_243(this.UuUVuuUu(var2), this.UuUVuuUu(var4), this.UuUVuuUu(var6));
      }

      private double UuUVuuUu(double var1) {
         return Math.abs(var1) < 0.003 ? 0.0 : var1;
      }

      private boolean UuUVuuUu(class_238 var1) {
         int var2 = class_3532.method_15357(var1.field_1323 + 1.0E-6);
         int var3 = class_3532.method_15357(var1.field_1322 + 1.0E-6);
         int var4 = class_3532.method_15357(var1.field_1321 + 1.0E-6);
         int var5 = class_3532.method_15357(var1.field_1320 - 1.0E-6);
         int var6 = class_3532.method_15357(var1.field_1325 - 1.0E-6);
         int var7 = class_3532.method_15357(var1.field_1324 - 1.0E-6);
         class_2339 var8 = new class_2339();

         for (int var9 = var2; var9 <= var5; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               for (int var11 = var4; var11 <= var7; var11++) {
                  var8.method_10103(var9, var10, var11);
                  class_265 var12 = Module.uUnuvNvvNU.field_1687.method_8320(var8).method_26220(Module.uUnuvNvvNU.field_1687, var8);
                  if (!var12.method_1110()) {
                     for (class_238 var14 : var12.method_1090()) {
                        if (var1.method_994(var14.method_989(var9, var10, var11))) {
                           return true;
                        }
                     }
                  }
               }
            }
         }

         return false;
      }

      private void UuuNnUvUuv() {
         double var1 = this.vNUvnnVnUvu / 2.0;
         this.UuUVuuUu = new class_238(
            new class_243(this.uUnuvNvvNU.field_1352 - var1, this.uUnuvNvvNU.field_1351 - var1, this.uUnuvNvvNU.field_1350 - var1),
            new class_243(this.uUnuvNvvNU.field_1352 + var1, this.uUnuvNvvNU.field_1351 + var1, this.uUnuvNvvNU.field_1350 + var1)
         );
      }

      @Generated
      public class_238 UuUVuuUu() {
         return this.UuUVuuUu;
      }

      @Generated
      public Particles.nvnNNunvv C00OOC00oO() {
         return this.C00OOC00oO;
      }

      @Generated
      public class_243 uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      @Generated
      public class_243 vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      @Generated
      public int uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }

      @Generated
      public int nuUnNvnuUu() {
         return this.nuUnNvnuUu;
      }

      @Generated
      public int VVuuUN() {
         return this.VVuuUN;
      }

      @Generated
      public float vNUvnnVnUvu() {
         return this.vNUvnnVnUvu;
      }

      @Generated
      public double uVUuuVnNVU() {
         return this.UvnvNVnnnnNU;
      }

      @Generated
      public UUVuuNuvVuVv vuuuNvNuv() {
         return this.uVUVnuvnuVuv;
      }

      @Generated
      public VVnnnnN nvUVNnuu() {
         return this.NVNnnvnuunNv;
      }
   }

   static enum nvnNNunvv {
      HEART("heart", false),
      STAR("star", false),
      SNOW("snowflake", false),
      BLOOM("firefly", false),
      DOLLAR("dollar", false),
      TRIANGLE("triangle", false),
      SAKURA("sakura", false),
      GEMINI("genshin", false),
      SIMS("rhombus", false);

      private final class_2960 UuUVuuUu;
      private final boolean C00OOC00oO;

      private nvnNNunvv(String var3, boolean var4) {
         this.UuUVuuUu = class_2960.method_60655("wild", "textures/world/" + var3 + ".png");
         this.C00OOC00oO = var4;
      }

      @Generated
      public class_2960 UuUVuuUu() {
         return this.UuUVuuUu;
      }

      @Generated
      public boolean C00OOC00oO() {
         return this.C00OOC00oO;
      }
   }
}
