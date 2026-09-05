package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2591;
import net.minecraft.class_2596;
import net.minecraft.class_2622;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2666;
import net.minecraft.class_2672;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2846.class_2847;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "BlockESP",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Подцветка определенных блоков"
)
public class BlockESP extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Обычный", "Обычный", "Производительность");
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Радиус", 48.0F, 16.0F, 128.0F, 8.0F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Производительность"));
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Сквозь стены", true);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Лимит боксов", 512.0F, 128.0F, 2048.0F, 64.0F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Производительность"));
   public static VUVnvvnNN NnUuNNU = new VUVnvvnNN(
      "Блоки",
      new vvNnnUNnVvn("Сундук", true),
      new vvNnnUNnVvn("Сундук ловушка", true),
      new vvNnnUNnVvn("Эндер сундук", true),
      new vvNnnUNnVvn("Спавнер", true),
      new vvNnnUNnVvn("Бочка", true),
      new vvNnnUNnVvn("Воронка", true),
      new vvNnnUNnVvn("Раздатчик", true),
      new vvNnnUNnVvn("Выбрасыватель", true),
      new vvNnnUNnVvn("Печка", true),
      new vvNnnUNnVvn("Шалкер", true),
      new vvNnnUNnVvn("Ваза", true),
      new vvNnnUNnVvn("Подозрительный песок", true),
      new vvNnnUNnVvn("Угольная руда", true),
      new vvNnnUNnVvn("Железная руда", true),
      new vvNnnUNnVvn("Золотая руда", true),
      new vvNnnUNnVvn("Медная руда", true),
      new vvNnnUNnVvn("Лазуритовая руда", true),
      new vvNnnUNnVvn("Редстоуновая руда", true),
      new vvNnnUNnVvn("Алмазная руда", true),
      new vvNnnUNnVvn("Изумрудная руда", true),
      new vvNnnUNnVvn("Кварцевая руда", true),
      new vvNnnUNnVvn("Древние обломки", true)
   );
   public static final Map<class_2591<?>, Integer> nNvNUVU = new HashMap<>();
   private static final int UnUNuUU = 16384;
   private static final double uUVuVvuNUvnu = 6.0;
   private static final int UvUvUNuvNU = 2;
   private static final int c0oOOCcCoC0 = 14;
   private static final int VVnVNnunVvu = 90;
   private static final String[] unNNVVNnvvV = new String[]{
      "Сундук",
      "Сундук ловушка",
      "Эндер сундук",
      "Спавнер",
      "Бочка",
      "Воронка",
      "Раздатчик",
      "Выбрасыватель",
      "Печка",
      "Шалкер",
      "Ваза",
      "Подозрительный песок",
      "Угольная руда",
      "Железная руда",
      "Золотая руда",
      "Медная руда",
      "Лазуритовая руда",
      "Редстоуновая руда",
      "Алмазная руда",
      "Изумрудная руда",
      "Кварцевая руда",
      "Древние обломки"
   };
   private final NnUuunvvvUun NuunnvnN = new NnUuunvvvUun();
   private final VVuNvNvUUvn NVUunUNUN = new VVuNvNvUUvn();
   private final NVuUUNU UUVNuUNUvUnV = new NVuUUNU();
   private final int[] vuvnUnVnUNnV = new int[22];
   private final int[] nnuUVNUuvvVU = new int[22];
   private final long[] nVVUuvuNnUN = new long[4096];
   private int nNnVnUNVV;
   private final BiConsumer<class_2338, class_2680> nuunNvv = (var1, var2) -> {
      if (this.nNnVnUNVV < this.nVVUuvuNnUN.length) {
         this.nVVUuvuNnUN[this.nNnVnUNVV++] = class_2338.method_10064(var1.method_10263(), var1.method_10264(), var1.method_10260());
      }
   };
   private long[] uUVVvVVNvvn;
   private byte[] vvUVNVvvNUv;
   private int[] UuNnnVnuNNV;
   private double uUVvnUuNvvN;
   private double UUuUnNVNuuv;
   private double NVuNUuVnVUN;
   private int NVuunNnvvvVu;
   private int vNnNuuvVn;
   private int VUuuVUnun;
   private int vVVuuVVv;
   private int VuunNUUUvu = -1;
   private int NNUUNUuVNNVn = -1;
   private int VvVvnNUnvuvV = -1;
   private float ccOO0COcoco0 = Float.MAX_VALUE;
   private boolean NUVvUUVuVNVv;

   public BlockESP() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.uNnUnnuNUnNu, this.UNnVVNvvnVvU, NnUuNNU});
      nNvNUVU.clear();
      nNvNUVU.put(class_2591.field_11914, new Color(255, 194, 84).getRGB());
      nNvNUVU.put(class_2591.field_11891, new Color(143, 109, 62).getRGB());
      nNvNUVU.put(class_2591.field_11901, new Color(153, 49, 238).getRGB());
      nNvNUVU.put(class_2591.field_11889, 16777215);
      nNvNUVU.put(class_2591.field_16411, new Color(250, 225, 62).getRGB());
      nNvNUVU.put(class_2591.field_11888, new Color(62, 137, 250).getRGB());
      nNvNUVU.put(class_2591.field_11887, new Color(27, 64, 250).getRGB());
      nNvNUVU.put(class_2591.field_11899, new Color(0, 23, 255).getRGB());
      nNvNUVU.put(class_2591.field_11903, new Color(115, 115, 115).getRGB());
      nNvNUVU.put(class_2591.field_11896, new Color(246, 123, 123).getRGB());
      nNvNUVU.put(class_2591.field_42781, new Color(185, 122, 87).getRGB());
      nNvNUVU.put(class_2591.field_42780, new Color(227, 203, 153).getRGB());
      this.UnUNVVVNuv();
      UvNVnUVVnNN.UuUVuuUu();
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.NuunnvnN.UuUVuuUu();
      this.NVUunUNUN.UuUVuuUu();
      this.VuunNUUUvu = -1;
      this.NNUUNUuVNNVn = -1;
      this.VvVvnNUnvuvV = -1;
      this.VUuuVUnun = 0;
      this.vVVuuVVv = 0;
      this.NUVvUUVuVNVv = true;
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.NVUunUNUN.C00OOC00oO();
      this.NuunnvnN.UuUVuuUu();
      this.NUVvUUVuVNVv = false;
      this.uVUVnuvnuVuv();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.NuunnvnN.UuUVuuUu();
      this.NVUunUNUN.C00OOC00oO();
      VVuNvNvUUvn.UuUVuuUu(this.NVUunUNUN.uNNnnnuuuN());
      this.UUVNuUNUvUnV.UuUVuuUu();
      this.NVUunUNUN.UuUVuuUu();
      this.VUuuVUnun = 0;
      this.vVVuuVVv = 0;
      this.NUVvUUVuVNVv = true;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      class_2596 var2 = var1.vVvUvVVuuNvV();
      if (!var1.uUnuvNvvNU()) {
         if (var2 instanceof class_2626 var9) {
            class_2338 var8 = var9.method_11309();
            this.NuunnvnN.UuUVuuUu(var8.method_10263(), var8.method_10264(), var8.method_10260());
         } else if (var2 instanceof class_2622 var10) {
            class_2338 var15 = var10.method_11293();
            this.NuunnvnN.UuUVuuUu(var15.method_10263(), var15.method_10264(), var15.method_10260());
         } else if (var2 instanceof class_2637 var12) {
            this.nNnVnUNVV = 0;
            var12.method_30621(this.nuunNvv);
            this.NuunnvnN.UuUVuuUu(this.nVVUuvuNnUN, this.nNnVnUNVV);
         } else if (var2 instanceof class_2672 var14) {
            this.NuunnvnN.UuUVuuUu(var14.method_11523(), var14.method_11524());
         } else if (var2 instanceof class_2666 var7) {
            class_1923 var16 = var7.comp_1726();
            this.NuunnvnN.C00OOC00oO(var16.field_9181, var16.field_9180);
         }
      } else {
         if (var2 instanceof class_2846 var3) {
            class_2847 var5 = var3.method_12363();
            if (var5 == class_2847.field_12968 || var5 == class_2847.field_12973) {
               class_2338 var6 = var3.method_12362();
               this.NuunnvnN.UuUVuuUu(var6.method_10263(), var6.method_10264(), var6.method_10260());
            }
         } else if (var2 instanceof class_2885 var4) {
            class_2338 var11 = var4.method_12543().method_17777();
            class_2350 var13 = var4.method_12543().method_17780();
            this.NuunnvnN.UuUVuuUu(var11.method_10263(), var11.method_10264(), var11.method_10260());
            this.NuunnvnN
               .UuUVuuUu(var11.method_10263() + var13.method_10148(), var11.method_10264() + var13.method_10164(), var11.method_10260() + var13.method_10165());
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      class_638 var2 = uUnuvNvvNU.field_1687;
      class_746 var3 = uUnuvNvvNU.field_1724;
      if (var2 != null && var3 != null) {
         boolean var4 = this.NVNnnvnuunNv.C00OOC00oO("Производительность");
         int var5 = uUnuvNvvNU.field_1690.method_38521();
         int var6 = var4 ? Math.min(var5, 6) : var5;
         int var7 = var4 ? class_3532.method_15340((int)this.uNnUnnuNUnNu.uUnuvNvvNU(), 1, 4096) : 16384;
         int var8 = this.vNVuvnUUnuUn();
         if (this.UvnvNVnnnnNU() || var8 != this.VuunNUUUvu || var7 != this.NNUUNUuVNNVn || var6 != this.VvVvnNUnvuvV) {
            this.VuunNUUUvu = var8;
            this.NNUUNUuVNNVn = var7;
            this.VvVvnNUnvuvV = var6;
            this.NUVvUUVuVNVv = true;
         }

         this.NuunnvnN.UuUVuuUu(var5 + 1);
         class_1923 var9 = var3.method_31476();
         this.NuunnvnN.UuUVuuUu(var2, var9.field_9181, var9.field_9180);
         this.vNnNuuvVn++;
         if (this.NuunnvnN.uUnuvNvvNU() || this.NVUunUNUN.vVvUvVVuuNvV()) {
            this.NUVvUUVuVNVv = true;
         }

         if (this.VUuuVUnun != 0 && this.vNnNuuvVn - this.VUuuVUnun >= 0) {
            this.VUuuVUnun = 0;
            this.NUVvUUVuVNVv = true;
         }

         if (this.vVVuuVVv != 0 && this.vNnNuuvVn - this.vVVuuVVv >= 0) {
            this.vVVuuVVv = 0;
            this.NUVvUUVuVNVv = true;
         }

         if (this.NuunnvnN.vVvUvVVuuNvV() && this.UuUVuuUu(var3) > 6.0) {
            this.NUVvUUVuVNVv = true;
         }

         if (this.NUVvUUVuVNVv && !this.NVUunUNUN.uUnuvNvvNU() && this.vNnNuuvVn - this.NVuunNnvvvVu >= 2) {
            this.C00OOC00oO(var3);
         }
      }
   }

   private double UuUVuuUu(class_746 var1) {
      double var2 = var1.method_23317() - this.uUVvnUuNvvN;
      double var4 = var1.method_23318() - this.UUuUnNVNuuv;
      double var6 = var1.method_23321() - this.NVuNUuVnVUN;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && nNNnNvVVv.UuUVuuUu(uUnuvNvvNU)) {
         this.UUVNuUNUvUnV.UuUVuuUu(this.NVUunUNUN.uNNnnnuuuN());
         if (this.UUVNuUNUvUnV.uNNnnnuuuN()) {
            class_243 var2 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            Matrix4f var3 = var1.uUnuvNvvNU().method_23760().method_23761();
            float var4 = Math.min(this.UuuNnUvUuv(), this.ccOO0COcoco0);
            float var5 = var4 * 0.88F;
            this.UUVNuUNUvUnV
               .UuUVuuUu(
                  var3,
                  (float)(var2.field_1352 - this.UUVNuUNUvUnV.C00OOC00oO()),
                  (float)(var2.field_1351 - this.UUVNuUNUvUnV.uUnuvNvvNU()),
                  (float)(var2.field_1350 - this.UUVNuUNUvUnV.vVvUvVVuuNvV()),
                  UuUVuuUu(var2.field_1352),
                  UuUVuuUu(var2.field_1351),
                  UuUVuuUu(var2.field_1350),
                  UUNNUNvuNNUn.C00OOC00oO(),
                  UUNNUNvuNNUn.uUnuvNvvNU(),
                  var5,
                  var4,
                  1.0F,
                  this.UNnVVNvvnVvU.uUnuvNvvNU()
               );
         }
      }
   }

   private static float UuUVuuUu(double var0) {
      return (float)(var0 - Math.floor(var0 * 0.00390625) * 256.0);
   }

   private void C00OOC00oO(class_746 var1) {
      if (this.uUVVvVVNvvn == null || this.uUVVvVVNvvn.length < this.NNUUNUuVNNVn) {
         this.uUVVvVVNvvn = new long[this.NNUUNUuVNNVn];
         this.vvUVNVvvNUv = new byte[this.NNUUNUuVNNVn];
         this.UuNnnVnuNNV = new int[this.NNUUNUuVNNVn];
      }

      this.uUVvnUuNvvN = var1.method_23317();
      this.UUuUnNVNuuv = var1.method_23320();
      this.NVuNUuVnVUN = var1.method_23321();
      this.NVuunNnvvvVu = this.vNnNuuvVn;
      int var2 = this.NuunnvnN
         .UuUVuuUu(
            this.uUVVvVVNvvn,
            this.vvUVNVvvNUv,
            this.UuNnnVnuNNV,
            this.NNUUNUuVNNVn,
            this.VuunNUUUvu,
            this.VvVvnNUnvuvV,
            this.uUVvnUuNvvN,
            this.UUuUnNVNuuv,
            this.NVuNUuVnVUN,
            this.nUUVuvU()
         );
      this.ccOO0COcoco0 = var2 >= this.NNUUNUuVNNVn ? (float)this.NuunnvnN.nuUnNvnuUu() : Float.MAX_VALUE;
      class_2338 var3 = var1.method_24515();
      int var4 = var3.method_10263() & -16;
      int var5 = var3.method_10264() & -16;
      int var6 = var3.method_10260() & -16;
      if (this.NVUunUNUN.UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, this.UuNnnVnuNNV, var2, (int[])this.vuvnUnVnUNnV.clone(), var4, var5, var6)) {
         this.NUVvUUVuVNVv = false;
         if (this.NuunnvnN.VVuuUN() > 0) {
            this.VUuuVUnun = this.vNnNuuvVn + 14;
         }

         if (this.NuunnvnN.uNNnnnuuuN()) {
            this.vVVuuVVv = this.vNnNuuvVn + 90;
         }
      }
   }

   private float UuuNnUvUuv() {
      return this.NVNnnvnuunNv.C00OOC00oO("Производительность") ? this.uVunuUNVVUUV.uUnuvNvvNU() : uUnuvNvvNU.field_1690.method_38521() * 16.0F * 1.5F + 48.0F;
   }

   private double nUUVuvU() {
      return this.UuuNnUvUuv() + 8.0;
   }

   private void UnUNVVVNuv() {
      for (int var1 = 0; var1 < 22; var1++) {
         this.nnuUVNUuvvVU[var1] = -1;

         for (int var2 = 0; var2 < NnUuNNU.vVvUvVVuuNvV.size(); var2++) {
            if (NnUuNNU.vVvUvVVuuNvV.get(var2).UuUVuuUu.equals(unNNVVNnvvV[var1])) {
               this.nnuUVNUuvvVU[var1] = var2;
               break;
            }
         }
      }
   }

   private int vNVuvnUUnuUn() {
      int var1 = 0;

      for (int var2 = 0; var2 < 22; var2++) {
         int var3 = this.nnuUVNUuvvVU[var2];
         if (var3 >= 0 && NnUuNNU.UuUVuuUu(var3)) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }

   private boolean UvnvNVnnnnNU() {
      boolean var1 = false;

      for (int var2 = 0; var2 < 22; var2++) {
         class_2591 var3 = vuUVvnUnUU.UuUVuuUu(var2);
         int var4;
         if (var3 != null) {
            Integer var5 = nNvNUVU.get(var3);
            var4 = var5 == null ? 16777215 : var5 & 16777215;
         } else {
            var4 = vuUVvnUnUU.C00OOC00oO(var2) & 16777215;
         }

         if (this.vuvnUnVnUNnV[var2] != var4) {
            this.vuvnUnVnUNnV[var2] = var4;
            var1 = true;
         }
      }

      return var1;
   }

   private void uVUVnuvnuVuv() {
      if (RenderSystem.isOnRenderThread()) {
         this.UUVNuUNUvUnV.nuUnNvnuUu();
      } else {
         uUnuvNvvNU.execute(this.UUVNuUNUvUnV::nuUnNvnuUu);
      }
   }
}
