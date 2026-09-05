package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class VnnUvVNuNuVv extends nvUuvVvuuN {
   public static final int vVvUvVVuuNvV = 8;
   public float uNNnnnuuuN;
   public float nuUnNvnuUu;
   public float VVuuUN;
   public float vNUvnnVnUvu;
   public float uVUuuVnNVU;
   public boolean vuuuNvNuv;
   public String nvUVNnuu;
   public UUVVvUvuNNn UuuNnUvUuv = new VUnvnVNv(300, 1.0);
   public float nUUVuvU = 1.0F;
   public float UnUNVVVNuv = 1.0F;
   public float vNVuvnUUnuUn = 1.0F;
   public final List<Integer> UvnvNVnnnnNU = new ArrayList<>();
   protected float uVUVnuvnuVuv;
   protected float NVNnnvnuunNv;
   protected float uVunuUNVVUUV;
   protected float UNnVVNvvnVvU;

   public VnnUvVNuNuVv(String var1, float var2) {
      this.UuUVuuUu = var1;
      this.nuUnNvnuUu = 0.0F;
      this.VVuuUN = 106.0F;
      this.vNUvnnVnUvu = 1.0F;
      if (!(var2 < this.nuUnNvnuUu) && !(var2 > this.VVuuUN)) {
         this.uNNnnnuuuN = var2;
         this.nUUVuvU = 1.0F;
         this.UnUNVVVNuv = 1.0F;
         this.vNVuvnUUnuUn = 1.0F;
      } else {
         this.UuUVuuUu((int)var2);
      }

      this.vuuuNvNuv();
   }

   public VnnUvVNuNuVv(String var1, float var2, float var3, float var4) {
      this(var1, var2, var3, var4, 1.0F);
   }

   public VnnUvVNuNuVv(String var1, float var2, float var3, float var4, float var5) {
      this.UuUVuuUu = var1;
      this.nuUnNvnuUu = 0.0F;
      this.uNNnnnuuuN = var2;
      this.VVuuUN = 106.0F;
      this.vNUvnnVnUvu = 1.0F;
      this.nUUVuvU = uUnuvNvvNU(var3);
      this.UnUNVVVNuv = uUnuvNvvNU(var4);
      this.vNVuvnUUnuUn = uUnuvNvvNU(var5);
      this.vuuuNvNuv();
   }

   public VnnUvVNuNuVv C00OOC00oO(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   public Color uUnuvNvvNU() {
      float var1 = this.vVvUvVVuuNvV();
      Color var2 = Color.getHSBColor(var1, this.nUUVuvU, this.UnUNVVVNuv);
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), Math.round(this.vNVuvnUUnuUn * 255.0F));
   }

   public void UuUVuuUu(Color var1) {
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      this.uNNnnnuuuN = var2[0] * this.VVuuUN;
      this.nUUVuvU = var2[1];
      this.UnUNVVVNuv = var2[2];
      this.vNVuvnUUnuUn = var1.getAlpha() / 255.0F;
   }

   public void UuUVuuUu(int var1) {
      int var2 = var1 >= 0 && var1 <= 16777215 ? 0xFF000000 | var1 : var1;
      this.UuUVuuUu(new Color(var2, true));
   }

   public float vVvUvVVuuNvV() {
      return uUnuvNvvNU(this.uNNnnnuuuN / this.VVuuUN);
   }

   public float uNNnnnuuuN() {
      return this.vVvUvVVuuNvV() * 360.0F;
   }

   public void UuUVuuUu(float var1) {
      float var2 = var1 % 360.0F;
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      this.uNNnnnuuuN = var2 / 360.0F * this.VVuuUN;
   }

   public void C00OOC00oO(float var1) {
      this.vNVuvnUUnuUn = uUnuvNvvNU(var1);
   }

   public void C00OOC00oO(int var1) {
      this.UvnvNVnnnnNU.removeIf(var1x -> var1x == var1);
      this.UvnvNVnnnnNU.add(0, var1);

      while (this.UvnvNVnnnnNU.size() > 8) {
         this.UvnvNVnnnnNU.remove(this.UvnvNVnnnnNU.size() - 1);
      }
   }

   public void VVuuUN() {
      this.C00OOC00oO(this.uVUuuVnNVU());
   }

   public void uUnuvNvvNU(int var1) {
      if (var1 >= 0 && var1 < this.UvnvNVnnnnNU.size()) {
         this.UuUVuuUu(this.UvnvNVnnnnNU.get(var1));
      }
   }

   public void vVvUvVVuuNvV(int var1) {
      if (var1 >= 0 && var1 < this.UvnvNVnnnnNU.size()) {
         this.UvnvNVnnnnNU.remove(var1);
      }
   }

   public int vNUvnnVnUvu() {
      return this.uUnuvNvvNU().getRGB();
   }

   public int uVUuuVnNVU() {
      return this.uUnuvNvvNU().getRGB();
   }

   public int uNNnnnuuuN(int var1) {
      Color var2 = this.uUnuvNvvNU();
      return var1 << 24 | var2.getRed() << 16 | var2.getGreen() << 8 | var2.getBlue();
   }

   private static float uUnuvNvvNU(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? Math.min(var0, 1.0F) : 0.0F;
   }

   protected void vuuuNvNuv() {
      this.uVUVnuvnuVuv = this.uNNnnnuuuN;
      this.NVNnnvnuunNv = this.nUUVuvU;
      this.uVunuUNVVUUV = this.UnUNVVVNuv;
      this.UNnVVNvvnVvU = this.vNVuvnUUnuUn;
   }

   @Override
   public void C00OOC00oO() {
      this.uNNnnnuuuN = this.uVUVnuvnuVuv;
      this.nUUVuvU = this.NVNnnvnuunNv;
      this.UnUNVVVNuv = this.uVunuUNVVUUV;
      this.vNVuvnUUnuUn = this.UNnVVNvvnVvU;
      this.vuuuNvNuv = false;
   }
}
