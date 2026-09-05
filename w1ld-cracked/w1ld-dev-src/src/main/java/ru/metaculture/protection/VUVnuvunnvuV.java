package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9779;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;

public final class VUVnuvunnvuV implements AutoCloseable {
   private static final int UuUVuuUu = 262144;
   private static final class_9799 C00OOC00oO = new class_9799(262144);
   private static final class_4598 uUnuvNvvNU = class_4597.method_22991(C00OOC00oO);
   private final class_4184 vVvUvVVuuNvV;
   private final class_4587 uNNnnnuuuN;
   private final Matrix4f nuUnNvnuUu;
   private final Matrix4f VVuuUN;
   private final Matrix4f vNUvnnVnUvu;
   private final class_9799 uVUuuVnNVU;
   private final class_4598 vuuuNvNuv;
   private final float nvUVNnuu;
   private boolean UuuNnUvUuv;

   private VUVnuvunnvuV(class_4184 var1, class_4587 var2, Matrix4f var3, Matrix4f var4, Matrix4f var5, class_9799 var6, class_4598 var7, float var8) {
      this.vVvUvVVuuNvV = var1;
      this.uNNnnnuuuN = var2;
      this.nuUnNvnuUu = var3;
      this.VVuuUN = var4;
      this.vNUvnnVnUvu = var5;
      this.uVUuuVnNVU = var6;
      this.vuuuNvNuv = var7;
      this.nvUVNnuu = var8;
   }

   public static VUVnuvunnvuV UuUVuuUu(class_310 var0, class_9779 var1, class_4184 var2, Matrix4f var3, Matrix4f var4) {
      Objects.requireNonNull(var0, "client");
      Objects.requireNonNull(var1, "tickCounter");
      Objects.requireNonNull(var2, "camera");
      Objects.requireNonNull(var3, "positionMatrix");
      Objects.requireNonNull(var4, "projectionMatrix");
      class_4587 var5 = new class_4587();
      Matrix4f var6 = new Matrix4f(var3);
      Matrix4f var7 = new Matrix4f(var6);
      var5.method_34425(new Matrix4f(var6));
      C00OOC00oO.method_60809();
      class_9799 var8 = C00OOC00oO;
      class_4598 var9 = uUnuvNvvNU;
      float var10 = var1.method_60637(false);
      return new VUVnuvunnvuV(var2, var5, var6, var7, new Matrix4f(var4), var8, var9, var10);
   }

   public class_4184 UuUVuuUu() {
      return this.vVvUvVVuuNvV;
   }

   public class_4587 C00OOC00oO() {
      return this.uNNnnnuuuN;
   }

   public Matrix4f uUnuvNvvNU() {
      return new Matrix4f(this.nuUnNvnuUu);
   }

   public Matrix4f vVvUvVVuuNvV() {
      return new Matrix4f(this.VVuuUN);
   }

   public Matrix4f uNNnnnuuuN() {
      return new Matrix4f(this.vNUvnnVnUvu);
   }

   public float nuUnNvnuUu() {
      return this.nvUVNnuu;
   }

   public class_4598 VVuuUN() {
      if (this.UuuNnUvUuv) {
         throw new IllegalStateException("Cannot access buffers after the world renderer has been closed.");
      } else {
         return this.vuuuNvNuv;
      }
   }

   public class_4588 UuUVuuUu(class_1921 var1) {
      Objects.requireNonNull(var1, "layer");
      if (this.UuuNnUvUuv) {
         throw new IllegalStateException("Cannot request buffers after the world renderer has been closed.");
      } else {
         return this.vuuuNvNuv.getBuffer(var1);
      }
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, class_243 var3, class_243 var4, int var5, boolean var6) {
      Objects.requireNonNull(var1, "v0");
      Objects.requireNonNull(var2, "v1");
      Objects.requireNonNull(var3, "v2");
      Objects.requireNonNull(var4, "v3");
      class_1921 var7 = var6 ? OOcCooOcCcO.UuUVuuUu() : OOcCooOcCcO.C00OOC00oO();
      nvNUnuU var8 = new nvNUnuU(this, this.uNNnnnuuuN.method_23760(), this.UuUVuuUu(var7));
      var8.UuUVuuUu(var1, var2, var3, var4, var5);
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, class_243 var3, class_243 var4, int var5, int var6, int var7, int var8) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, true);
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, class_243 var3, class_243 var4, int var5, int var6, int var7, int var8, boolean var9) {
      Objects.requireNonNull(var1, "v0");
      Objects.requireNonNull(var2, "v1");
      Objects.requireNonNull(var3, "v2");
      Objects.requireNonNull(var4, "v3");
      class_1921 var10 = var9 ? OOcCooOcCcO.vVvUvVVuuNvV() : OOcCooOcCcO.uNNnnnuuuN();
      nvNUnuU var11 = new nvNUnuU(this, this.uNNnnnuuuN.method_23760(), this.UuUVuuUu(var10));
      var11.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, int var3, boolean var4) {
      Objects.requireNonNull(var1, "min");
      Objects.requireNonNull(var2, "max");
      class_1921 var5 = var4 ? OOcCooOcCcO.UuUVuuUu() : OOcCooOcCcO.uUnuvNvvNU();
      nvNUnuU var6 = new nvNUnuU(this, this.uNNnnnuuuN.method_23760(), this.UuUVuuUu(var5));
      var6.UuUVuuUu(var1, var2, var3);
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, double var3, int var5, boolean var6) {
      Objects.requireNonNull(var1, "start");
      Objects.requireNonNull(var2, "end");
      if (!Double.isFinite(var3)) {
         throw new IllegalArgumentException("Line width must be finite.");
      } else if (var3 < 0.0) {
         throw new IllegalArgumentException("Line width cannot be negative.");
      } else {
         class_1921 var7 = var6 ? OOcCooOcCcO.UuUVuuUu(var3) : OOcCooOcCcO.C00OOC00oO(var3);
         nvNUnuU var8 = new nvNUnuU(this, this.uNNnnnuuuN.method_23760(), this.UuUVuuUu(var7));
         var8.C00OOC00oO(var1, var2, var5);
      }
   }

   public void UuUVuuUu(
      class_243 var1,
      class_243 var2,
      class_243 var3,
      class_243 var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      Objects.requireNonNull(var1, "v0");
      Objects.requireNonNull(var2, "v1");
      Objects.requireNonNull(var3, "v2");
      Objects.requireNonNull(var4, "v3");
      class_1921 var14 = OOcCooOcCcO.nuUnNvnuUu();
      nvNUnuU var15 = new nvNUnuU(this, this.uNNnnnuuuN.method_23760(), this.UuUVuuUu(var14));
      var15.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public void vNUvnnVnUvu() {
      if (!this.UuuNnUvUuv) {
         this.vuuuNvNuv.method_22993();
      }
   }

   @Override
   public void close() {
      if (!this.UuuNnUvUuv) {
         this.UuuNnUvUuv = true;
         this.vuuuNvNuv.method_22993();
         this.uVUuuVnNVU.method_60809();
      }
   }
}
