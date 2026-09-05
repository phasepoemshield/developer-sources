package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Quaternionf;
import org.joml.Vector2d;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.wild.mixin.acceser.GameRendererAccessor;

public final class UnVNvNnU {
   private static final float vVvUvVVuuNvV = 0.5F;
   private static final float uNNnnnuuuN = 0.05F;
   private static final Float nuUnNvnuUu = 1.0F;
   public static volatile BooleanSupplier UuUVuuUu = () -> true;
   public static volatile BooleanSupplier C00OOC00oO = () -> true;
   private final vnuUvuuNVNUU VVuuUN;
   private final NNNVvVnnVn vNUvnnVnUvu = new NNNVvVnnVn();
   private final ArrayDeque<UnVNvNnU.nvnNNunvv> uVUuuVnNVU = new ArrayDeque<>();
   private final ArrayDeque<Float> vuuuNvNuv = new ArrayDeque<>();
   private final ArrayDeque<Boolean> nvUVNnuu = new ArrayDeque<>();
   private final ArrayDeque<UnVNvNnU.uunvUUVnuNn> UuuNnUvUuv = new ArrayDeque<>();
   private final ArrayList<UnVNvNnU.uunvUUVnuNn> nUUVuvU = new ArrayList<>();
   private final NVUUNnVvnNNV UnUNVVVNuv = new NVUUNnVvnNNV();
   private static Map<String, VuuUvnvnuu> vNVuvnUUnuUn = new HashMap<>();
   private final oCcccCO UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv = false;
   private int NVNnnvnuunNv = 0;
   private int uVunuUNVVUUV = 0;
   private boolean UNnVVNvvnVvU = false;
   private float uNnUnnuNUnNu = 0.0F;
   private int NnUuNNU = 0;
   private int nNvNUVU = 0;
   private boolean UnUNuUU = false;
   private float uUVuVvuNUvnu = 0.0F;
   private int UvUvUNuvNU = 0;
   private int c0oOOCcCoC0 = 0;
   private int VVnVNnunVvu = 0;
   private int unNNVVNnvvV = 0;
   private static final ThreadLocal<float[]> NuunnvnN = ThreadLocal.withInitial(() -> new float[4]);
   private int NVUunUNUN = 0;
   private int UUVNuUNUvUnV = 0;
   public static class_310 uUnuvNvvNU = class_310.method_1551();
   private static boolean font;

   public UnVNvNnU(vnuUvuuNVNUU var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("GlBackend cannot be null");
      } else {
         this.VVuuUN = var1;
         this.UvnvNVnnnnNU = new oCcccCO(var1);
         this.vNVuvnUUnuUn();
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if (this.uVUVnuvnuVuv) {
            this.UuUVuuUu();
         }

         this.uVUVnuvnuVuv = true;
         this.NVNnnvnuunNv = var1;
         this.uVunuUNVVUUV = var2;
         this.UNnVVNvvnVvU = false;
         this.UnUNuUU = false;
         this.uNnUnnuNUnNu = 0.0F;
         this.uUVuVvuNUvnu = 0.0F;
         this.NnUuNNU = 0;
         this.nNvNUVU = 0;
         this.UvUvUNuvNU = 0;
         this.c0oOOCcCoC0 = 0;
         this.VVnVNnunVvu = 0;
         this.unNNVVNnvvV = 0;
         if (this.VVuuUN != null) {
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(var1, var2);
            this.VVuuUN.uUnuvNvvNU(var1, var2);
            if (var1 != this.NVUunUNUN || var2 != this.UUVNuUNUvUnV) {
               this.NVUunUNUN = var1;
               this.UUVNuUNUvUnV = var2;
            }

            this.VVuuUN.C00OOC00oO(false);
         }

         if (!this.uVUuuVnNVU.isEmpty()) {
            this.uVUuuVnNVU.clear();
         }

         this.UuuNnUvUuv.clear();
         this.UnUNVVVNuv.UuUVuuUu();
         this.vNVuvnUUnuUn();
         this.UvnvNVnnnnNU();
      } else {
         throw new IllegalArgumentException("Width and height must be positive, got: " + var1 + "x" + var2);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu() {
      boolean var5 = false /* VF: Semaphore variable */;

      label56: {
         try {
            var5 = true;
            if (this.UvnvNVnnnnNU != null) {
               this.UvnvNVnnnnNU.UuUVuuUu();
            }

            if (this.VVuuUN != null) {
               this.VVuuUN.UuUVuuUu();
            }

            VUVuvNNVvN.UuUVuuUu().C00OOC00oO();
            var5 = false;
            break label56;
         } catch (Throwable var6) {
            var5 = false;
         } finally {
            if (var5) {
               this.uVUVnuvnuVuv = false;
               this.NVNnnvnuunNv = 0;
               this.uVunuUNVVUUV = 0;
               this.UNnVVNvvnVvU = false;
               this.uNnUnnuNUnNu = 0.0F;
               this.NnUuNNU = 0;
               this.nNvNUVU = 0;
               this.UnUNuUU = false;
               this.uUVuVvuNUvnu = 0.0F;
               this.UvUvUNuvNU = 0;
               this.c0oOOCcCoC0 = 0;
               this.VVnVNnunVvu = 0;
               this.unNNVVNnvvV = 0;
               this.uVUuuVnNVU.clear();
               this.UuuNnUvUuv.clear();
               this.UnUNVVVNuv.UuUVuuUu();
               this.vNVuvnUUnuUn();
               this.UvnvNVnnnnNU();
            }
         }

         this.uVUVnuvnuVuv = false;
         this.NVNnnvnuunNv = 0;
         this.uVunuUNVVUUV = 0;
         this.UNnVVNvvnVvU = false;
         this.uNnUnnuNUnNu = 0.0F;
         this.NnUuNNU = 0;
         this.nNvNUVU = 0;
         this.UnUNuUU = false;
         this.uUVuVvuNUvnu = 0.0F;
         this.UvUvUNuvNU = 0;
         this.c0oOOCcCoC0 = 0;
         this.VVnVNnunVvu = 0;
         this.unNNVVNnvvV = 0;
         this.uVUuuVnNVU.clear();
         this.UuuNnUvUuv.clear();
         this.UnUNVVVNuv.UuUVuuUu();
         this.vNVuvnUUnuUn();
         this.UvnvNVnnnnNU();
         return;
      }

      this.uVUVnuvnuVuv = false;
      this.NVNnnvnuunNv = 0;
      this.uVunuUNVVUUV = 0;
      this.UNnVVNvvnVvU = false;
      this.uNnUnnuNUnNu = 0.0F;
      this.NnUuNNU = 0;
      this.nNvNUVU = 0;
      this.UnUNuUU = false;
      this.uUVuVvuNUvnu = 0.0F;
      this.UvUvUNuvNU = 0;
      this.c0oOOCcCoC0 = 0;
      this.VVnVNnunVvu = 0;
      this.unNNVVNnvvV = 0;
      this.uVUuuVnNVU.clear();
      this.UuuNnUvUuv.clear();
      this.UnUNVVVNuv.UuUVuuUu();
      this.vNVuvnUUnuUn();
      this.UvnvNVnnnnNU();
   }

   private void UnUNVVVNuv() {
      if (!this.uVUVnuvnuVuv) {
         throw new IllegalStateException("begin() must be called before issuing draw commands");
      } else if (this.VVuuUN == null) {
         throw new IllegalStateException("Renderer2D backend is null - initialization failed");
      } else if (this.UvnvNVnnnnNU == null) {
         throw new IllegalStateException("Renderer2D batcher is null - initialization failed");
      }
   }

   private float[] uUnuvNvvNU(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var7 = NuunnvnN.get();
      var7[0] = Math.max(0.0F, var3);
      var7[1] = Math.max(0.0F, var4);
      var7[2] = Math.max(0.0F, var5);
      var7[3] = Math.max(0.0F, var6);
      float var8 = Math.min(Math.abs(var1), Math.abs(var2)) * 0.5F;
      if (var8 <= 0.0F) {
         var7[0] = var7[1] = var7[2] = var7[3] = 0.0F;
         return var7;
      } else {
         var7[0] = Math.min(var7[0], var8);
         var7[1] = Math.min(var7[1], var8);
         var7[2] = Math.min(var7[2], var8);
         var7[3] = Math.min(var7[3], var8);
         return var7;
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, int var5) {
      this.UnUNVVVNuv();
      this.UvnvNVnnnnNU.UuUVuuUu(var1, var2, var3, var4, 0.0F, 0.0F, 0.0F, 0.0F, this.C00OOC00oO(var5), this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      this.UnUNVVVNuv();
      float[] var10 = this.uUnuvNvvNU(var3, var4, var5, var6, var7, var8);
      this.UvnvNVnnnnNU.UuUVuuUu(var1, var2, var3, var4, var10[0], var10[1], var10[2], var10[3], this.C00OOC00oO(var9), this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13,
      boolean var14
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, 0);
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13,
      boolean var14,
      int var15
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15,
      float var16,
      boolean var17
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, 0);
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15,
      float var16,
      boolean var17,
      int var18
   ) {
      this.UnUNVVVNuv();
      float[] var19 = this.uUnuvNvvNU(var3, var4, var5, var6, var7, var8);
      this.UvnvNVnnnnNU
         .UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var19[0],
            var19[1],
            var19[2],
            var19[3],
            this.C00OOC00oO(var9),
            this.C00OOC00oO(var10),
            this.C00OOC00oO(var11),
            this.C00OOC00oO(var12),
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            this.UnUNVVVNuv.uNNnnnuuuN()
         );
   }

   public void UuUVuuUu(int var1, float var2, float var3, float var4, float var5) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, -1, true, false);
   }

   public void UuUVuuUu(int var1, float var2, float var3, float var4, float var5, int var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, true, false);
   }

   public void UuUVuuUu(int var1, float var2, float var3, float var4, float var5, int var6, boolean var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, false);
   }

   public void C00OOC00oO(int var1, float var2, float var3, float var4, float var5) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, -1, true, true);
   }

   public void C00OOC00oO(int var1, float var2, float var3, float var4, float var5, int var6, boolean var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void UuUVuuUu(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.UnUNVVVNuv();
      if (var1 > 0) {
         this.uUnuvNvvNU();
         this.VVuuUN.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, this.C00OOC00oO(-1), this.UnUNVVVNuv.uNNnnnuuuN(), false);
      }
   }

   public void UuUVuuUu(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.UnUNVVVNuv();
      if (var1 > 0) {
         this.uUnuvNvvNU();
         this.VVuuUN.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.C00OOC00oO(-1), this.UnUNVVVNuv.uNNnnnuuuN(), false);
      }
   }

   public void C00OOC00oO(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.UnUNVVVNuv();
      if (var1 > 0) {
         this.uUnuvNvvNU();
         this.VVuuUN.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.C00OOC00oO(-1), this.UnUNVVVNuv.uNNnnnuuuN(), true);
      }
   }

   private void UuUVuuUu(int var1, float var2, float var3, float var4, float var5, int var6, boolean var7, boolean var8) {
      this.UnUNVVVNuv();
      if (var1 > 0) {
         this.uUnuvNvvNU();
         float var9 = var7 ? 1.0F : 0.0F;
         float var10 = var7 ? 0.0F : 1.0F;
         this.VVuuUN.UuUVuuUu(var1, var2, var3, var4, var5, 0.0F, var9, 1.0F, var10, this.C00OOC00oO(var6), this.UnUNVVVNuv.uNNnnnuuuN(), var8);
      }
   }

   public UnVNvNnU.uunvUUVnuNn UuUVuuUu(float var1, float var2, float var3, float var4) {
      return nuuvUNvn.C00OOC00oO() ? null : this.UuUVuuUu(var1, var2, var3, var4, false);
   }

   public UnVNvNnU.uunvUUVnuNn C00OOC00oO(float var1, float var2, float var3, float var4) {
      return !nuuvUNvn.C00OOC00oO() && this.vNUvnnVnUvu.UuUVuuUu() ? this.UuUVuuUu(var1, var2, var3, var4, true) : null;
   }

   private UnVNvNnU.uunvUUVnuNn UuUVuuUu(float var1, float var2, float var3, float var4, boolean var5) {
      this.UnUNVVVNuv();
      if (this.NVNnnvnuunNv > 0 && this.uVunuUNVVUUV > 0 && !(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         int var6 = (int)Math.ceil(var3);
         int var7 = (int)Math.ceil(var4);
         if (var6 > 0 && var7 > 0) {
            this.uUnuvNvvNU();
            vnuUvuuNVNUU.nvnNNunvv var8;
            if (var5) {
               try {
                  var8 = this.VVuuUN.C00OOC00oO(var6, var7);
               } catch (RuntimeException var11) {
                  this.vNUvnnVnUvu.C00OOC00oO();
                  return null;
               }
            } else {
               var8 = this.VVuuUN.UuUVuuUu(var6, var7);
            }

            if (var8 == null) {
               return null;
            } else {
               float[] var9 = this.UuuNnUvUuv.isEmpty() ? this.UnUNVVVNuv.uNNnnnuuuN() : this.UuuNnUvUuv.peek().UnUNVVVNuv;
               UnVNvNnU.uunvUUVnuNn var10 = this.UuUVuuUu(this.UuuNnUvUuv.size());
               var10.UuUVuuUu = var8;
               var10.C00OOC00oO = this.NVNnnvnuunNv;
               var10.uUnuvNvvNU = this.uVunuUNVVUUV;
               var10.vVvUvVVuuNvV = this.UNnVVNvvnVvU;
               var10.uNNnnnuuuN = this.uNnUnnuNUnNu;
               var10.nuUnNvnuUu = this.NnUuNNU;
               var10.VVuuUN = this.nNvNUVU;
               var10.vNUvnnVnUvu = this.UnUNuUU;
               var10.uVUuuVnNVU = this.uUVuVvuNUvnu;
               var10.vuuuNvNuv = this.UvUvUNuvNU;
               var10.nvUVNnuu = this.c0oOOCcCoC0;
               var10.UuuNnUvUuv = this.VVnVNnunVvu;
               var10.nUUVuvU = this.unNNVVNnvvV;
               var10.UnUNVVVNuv = var9;
               var10.vNVuvnUUnuUn = var1;
               var10.UvnvNVnnnnNU = var2;
               this.UnUNVVVNuv.UuUVuuUu(var10.NVNnnvnuunNv);
               var10.uVunuUNVVUUV.clear();
               var10.uVunuUNVVUUV.addAll(this.uVUuuVnNVU);
               var10.UNnVVNvvnVvU.clear();
               var10.UNnVVNvvnVvU.addAll(this.vuuuNvNuv);
               var10.uNnUnnuNUnNu.clear();
               var10.uNnUnnuNUnNu.addAll(this.nvUVNnuu);
               this.UuuNnUvUuv.push(var10);
               this.NVNnnvnuunNv = var6;
               this.uVunuUNVVUUV = var7;
               this.UNnVVNvvnVvU = false;
               this.uNnUnnuNUnNu = 0.0F;
               this.NnUuNNU = 0;
               this.nNvNUVU = 0;
               this.UnUNuUU = false;
               this.uUVuVvuNUvnu = 0.0F;
               this.UvUvUNuvNU = 0;
               this.c0oOOCcCoC0 = 0;
               this.VVnVNnunVvu = 0;
               this.unNNVVNnvvV = 0;
               this.uVUuuVnNVU.clear();
               this.UnUNVVVNuv.UuUVuuUu(var10.uVUVnuvnuVuv, -var1, -var2);
               this.vNVuvnUUnuUn();
               this.UvnvNVnnnnNU();
               this.VVuuUN.C00OOC00oO(false);
               return var10;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private UnVNvNnU.uunvUUVnuNn UuUVuuUu(int var1) {
      while (this.nUUVuvU.size() <= var1) {
         this.nUUVuvU.add(new UnVNvNnU.uunvUUVnuNn());
      }

      return this.nUUVuvU.get(var1);
   }

   public void UuUVuuUu(UnVNvNnU.uunvUUVnuNn var1) {
      this.UnUNVVVNuv();
      if (var1 != null && var1.UuUVuuUu != null) {
         this.uUnuvNvvNU();
         this.VVuuUN.UuUVuuUu(var1.UuUVuuUu);
         this.NVNnnvnuunNv = var1.C00OOC00oO;
         this.uVunuUNVVUUV = var1.uUnuvNvvNU;
         this.UNnVVNvvnVvU = var1.vVvUvVVuuNvV;
         this.uNnUnnuNUnNu = var1.uNNnnnuuuN;
         this.NnUuNNU = var1.nuUnNvnuUu;
         this.nNvNUVU = var1.VVuuUN;
         this.UnUNuUU = var1.vNUvnnVnUvu;
         this.uUVuVvuNUvnu = var1.uVUuuVnNVU;
         this.UvUvUNuvNU = var1.vuuuNvNuv;
         this.c0oOOCcCoC0 = var1.nvUVNnuu;
         this.VVnVNnunVvu = var1.UuuNnUvUuv;
         this.unNNVVNnvvV = var1.nUUVuvU;
         this.UnUNVVVNuv.uUnuvNvvNU(var1.NVNnnvnuunNv);
         if (!this.UuuNnUvUuv.isEmpty()) {
            this.UuuNnUvUuv.pop();
         }

         this.uVUuuVnNVU.clear();
         this.uVUuuVnNVU.addAll(var1.uVunuUNVVUUV);
         this.vuuuNvNuv.clear();
         this.vuuuNvNuv.addAll(var1.UNnVVNvvnVvU);
         this.nvUVNnuu.clear();
         this.nvUVNnuu.addAll(var1.uNnUnnuNUnNu);
         if (this.vuuuNvNuv.isEmpty()) {
            this.vNVuvnUUnuUn();
         }

         if (this.nvUVNnuu.isEmpty()) {
            this.nvUVNnuu.push(false);
         }

         this.VVuuUN.UuUVuuUu(this.nvUVNnuu.peek());
         this.VVuuUN.uUnuvNvvNU();
         if (this.uVUuuVnNVU.isEmpty()) {
            this.VVuuUN.C00OOC00oO(false);
         } else {
            this.UuUVuuUu(this.uVUuuVnNVU.peek());
         }
      }
   }

   public void UuUVuuUu(
      UnVNvNnU.uunvUUVnuNn var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      this.UnUNVVVNuv();
      if (var1 != null && var1.UuUVuuUu != null) {
         float var16 = this.uVUVnuvnuVuv();
         if (!(var16 <= 1.0E-4F)) {
            UnVNvNnU.nvnNNunvv var17 = this.uVUuuVnNVU.peek();
            int var18 = var17 == null ? 0 : var17.x();
            int var19 = var17 == null ? 0 : var17.y();
            int var20 = var17 == null ? this.NVNnnvnuunNv : var17.w();
            int var21 = var17 == null ? this.uVunuUNVVUUV : var17.h();
            float var22 = var17 == null ? 0.0F : var17.roundTopLeft();
            float var23 = var17 == null ? 0.0F : var17.roundTopRight();
            float var24 = var17 == null ? 0.0F : var17.roundBottomRight();
            float var25 = var17 == null ? 0.0F : var17.roundBottomLeft();
            this.VVuuUN
               .UuUVuuUu(
                  var1.UuUVuuUu.UuUVuuUu(),
                  var1.UuUVuuUu.C00OOC00oO(),
                  var1.UuUVuuUu.uUnuvNvvNU(),
                  var2,
                  var3,
                  var4,
                  var5,
                  var6,
                  var7,
                  var8,
                  var9,
                  var10,
                  var11,
                  var12,
                  var13,
                  var14,
                  var15,
                  var16,
                  this.UnUNVVVNuv.uNNnnnuuuN(),
                  var18,
                  var19,
                  var20,
                  var21,
                  var22,
                  var23,
                  var24,
                  var25
               );
         }
      }
   }

   public boolean UuUVuuUu(
      UnVNvNnU.uunvUUVnuNn var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, float var11, float var12
   ) {
      this.UnUNVVVNuv();
      if (var1 != null && var1.UuUVuuUu != null) {
         float var13 = this.uVUVnuvnuVuv();
         if (var13 <= 1.0E-4F) {
            return true;
         } else if (!this.vNUvnnVnUvu.UuUVuuUu()) {
            return false;
         } else {
            UnVNvNnU.nvnNNunvv var14 = this.uVUuuVnNVU.peek();
            int var15 = var14 == null ? 0 : var14.x();
            int var16 = var14 == null ? 0 : var14.y();
            int var17 = var14 == null ? this.NVNnnvnuunNv : var14.w();
            int var18 = var14 == null ? this.uVunuUNVVUUV : var14.h();
            float var19 = var14 == null ? 0.0F : var14.roundTopLeft();
            float var20 = var14 == null ? 0.0F : var14.roundTopRight();
            float var21 = var14 == null ? 0.0F : var14.roundBottomRight();
            float var22 = var14 == null ? 0.0F : var14.roundBottomLeft();

            try {
               this.VVuuUN
                  .UuUVuuUu(
                     var1.UuUVuuUu.UuUVuuUu(),
                     var1.UuUVuuUu.vVvUvVVuuNvV(),
                     var1.UuUVuuUu.uNNnnnuuuN(),
                     var1.UuUVuuUu.C00OOC00oO(),
                     var1.UuUVuuUu.uUnuvNvvNU(),
                     var2,
                     var3,
                     var4,
                     var5,
                     var6,
                     var7,
                     var8,
                     var9,
                     var10,
                     var11,
                     var12,
                     var13,
                     this.UnUNVVVNuv.uNNnnnuuuN(),
                     var15,
                     var16,
                     var17,
                     var18,
                     var19,
                     var20,
                     var21,
                     var22
                  );
               return true;
            } catch (RuntimeException var24) {
               this.vNUvnnVnUvu.C00OOC00oO();
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(
      UnVNvNnU.uunvUUVnuNn var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      int var9,
      int var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.UnUNVVVNuv();
      if (var1 != null && var1.UuUVuuUu != null) {
         float var17 = this.uVUVnuvnuVuv();
         if (var17 <= 1.0E-4F) {
            return true;
         } else if (!this.vNUvnnVnUvu.UuUVuuUu()) {
            return false;
         } else {
            UnVNvNnU.nvnNNunvv var18 = this.uVUuuVnNVU.peek();
            int var19 = var18 == null ? 0 : var18.x();
            int var20 = var18 == null ? 0 : var18.y();
            int var21 = var18 == null ? this.NVNnnvnuunNv : var18.w();
            int var22 = var18 == null ? this.uVunuUNVVUUV : var18.h();
            float var23 = var18 == null ? 0.0F : var18.roundTopLeft();
            float var24 = var18 == null ? 0.0F : var18.roundTopRight();
            float var25 = var18 == null ? 0.0F : var18.roundBottomRight();
            float var26 = var18 == null ? 0.0F : var18.roundBottomLeft();

            try {
               this.VVuuUN
                  .UuUVuuUu(
                     var1.UuUVuuUu.UuUVuuUu(),
                     var1.UuUVuuUu.vVvUvVVuuNvV(),
                     var1.UuUVuuUu.uNNnnnuuuN(),
                     var1.UuUVuuUu.C00OOC00oO(),
                     var1.UuUVuuUu.uUnuvNvvNU(),
                     var2,
                     var3,
                     var4,
                     var5,
                     var6,
                     var7,
                     var8,
                     var9,
                     var10,
                     var11,
                     var12,
                     var13,
                     var14,
                     var15,
                     var16,
                     var17,
                     this.UnUNVVVNuv.uNNnnnuuuN(),
                     var19,
                     var20,
                     var21,
                     var22,
                     var23,
                     var24,
                     var25,
                     var26
                  );
               return true;
            } catch (RuntimeException var28) {
               this.vNUvnnVnUvu.C00OOC00oO();
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(
      UnVNvNnU.uunvUUVnuNn var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, float var11
   ) {
      this.UnUNVVVNuv();
      if (var1 != null && var1.UuUVuuUu != null) {
         float var12 = this.uVUVnuvnuVuv();
         if (var12 <= 1.0E-4F) {
            return true;
         } else if (!this.vNUvnnVnUvu.UuUVuuUu()) {
            return false;
         } else {
            UnVNvNnU.nvnNNunvv var13 = this.uVUuuVnNVU.peek();
            int var14 = var13 == null ? 0 : var13.x();
            int var15 = var13 == null ? 0 : var13.y();
            int var16 = var13 == null ? this.NVNnnvnuunNv : var13.w();
            int var17 = var13 == null ? this.uVunuUNVVUUV : var13.h();
            float var18 = var13 == null ? 0.0F : var13.roundTopLeft();
            float var19 = var13 == null ? 0.0F : var13.roundTopRight();
            float var20 = var13 == null ? 0.0F : var13.roundBottomRight();
            float var21 = var13 == null ? 0.0F : var13.roundBottomLeft();

            try {
               this.VVuuUN
                  .UuUVuuUu(
                     var1.UuUVuuUu.UuUVuuUu(),
                     var1.UuUVuuUu.vVvUvVVuuNvV(),
                     var1.UuUVuuUu.uNNnnnuuuN(),
                     var1.UuUVuuUu.C00OOC00oO(),
                     var1.UuUVuuUu.uUnuvNvvNU(),
                     var2,
                     var3,
                     var4,
                     var5,
                     var6,
                     var7,
                     var8,
                     var9,
                     var10,
                     var11,
                     var12,
                     this.UnUNVVVNuv.uNNnnnuuuN(),
                     var14,
                     var15,
                     var16,
                     var17,
                     var18,
                     var19,
                     var20,
                     var21
                  );
               return true;
            } catch (RuntimeException var23) {
               this.vNUvnnVnUvu.C00OOC00oO();
               return false;
            }
         }
      } else {
         return false;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void C00OOC00oO() {
      if (this.uVUVnuvnuVuv) {
         boolean var5 = false /* VF: Semaphore variable */;

         label66: {
            try {
               var5 = true;
               if (this.UvnvNVnnnnNU != null) {
                  this.UvnvNVnnnnNU.UuUVuuUu();
               }

               if (this.VVuuUN != null) {
                  this.VVuuUN.UuUVuuUu();
               }

               VUVuvNNVvN.UuUVuuUu().C00OOC00oO();
               var5 = false;
               break label66;
            } catch (Exception var6) {
               System.err.println("Error in Renderer2D.end(): " + var6.getMessage());
               var6.printStackTrace();
               var5 = false;
            } finally {
               if (var5) {
                  this.uVUVnuvnuVuv = false;
                  this.NVNnnvnuunNv = 0;
                  this.uVunuUNVVUUV = 0;
                  this.UNnVVNvvnVvU = false;
                  this.uNnUnnuNUnNu = 0.0F;
                  this.NnUuNNU = 0;
                  this.nNvNUVU = 0;
                  this.UnUNuUU = false;
                  this.uUVuVvuNUvnu = 0.0F;
                  this.UvUvUNuvNU = 0;
                  this.c0oOOCcCoC0 = 0;
                  this.VVnVNnunVvu = 0;
                  this.unNNVVNnvvV = 0;
                  this.uVUuuVnNVU.clear();
                  this.UnUNVVVNuv.UuUVuuUu();
                  this.vNVuvnUUnuUn();
                  this.UvnvNVnnnnNU();
               }
            }

            this.uVUVnuvnuVuv = false;
            this.NVNnnvnuunNv = 0;
            this.uVunuUNVVUUV = 0;
            this.UNnVVNvvnVvU = false;
            this.uNnUnnuNUnNu = 0.0F;
            this.NnUuNNU = 0;
            this.nNvNUVU = 0;
            this.UnUNuUU = false;
            this.uUVuVvuNUvnu = 0.0F;
            this.UvUvUNuvNU = 0;
            this.c0oOOCcCoC0 = 0;
            this.VVnVNnunVvu = 0;
            this.unNNVVNnvvV = 0;
            this.uVUuuVnNVU.clear();
            this.UnUNVVVNuv.UuUVuuUu();
            this.vNVuvnUUnuUn();
            this.UvnvNVnnnnNU();
            return;
         }

         this.uVUVnuvnuVuv = false;
         this.NVNnnvnuunNv = 0;
         this.uVunuUNVVUUV = 0;
         this.UNnVVNvvnVvU = false;
         this.uNnUnnuNUnNu = 0.0F;
         this.NnUuNNU = 0;
         this.nNvNUVU = 0;
         this.UnUNuUU = false;
         this.uUVuVvuNUvnu = 0.0F;
         this.UvUvUNuvNU = 0;
         this.c0oOOCcCoC0 = 0;
         this.VVnVNnunVvu = 0;
         this.unNNVVNnvvV = 0;
         this.uVUuuVnNVU.clear();
         this.UnUNVVVNuv.UuUVuuUu();
         this.vNVuvnUUnuUn();
         this.UvnvNVnnnnNU();
      }
   }

   public void uUnuvNvvNU() {
      this.UnUNVVVNuv();
      this.UvnvNVnnnnNU.UuUVuuUu();
   }

   public void vVvUvVVuuNvV() {
      this.UnUNVVVNuv();
      this.uUnuvNvvNU();
      this.nvUVNnuu.push(true);
      this.VVuuUN.UuUVuuUu(true);
   }

   public void uNNnnnuuuN() {
      this.UnUNVVVNuv();
      if (this.nvUVNnuu.size() > 1) {
         this.uUnuvNvvNU();
         this.nvUVNnuu.pop();
         this.VVuuUN.UuUVuuUu(this.nvUVNnuu.peek());
         this.VVuuUN.uUnuvNvvNU();
      }
   }

   public void UuUVuuUu(int var1, int var2, int var3, int var4) {
      this.UuUVuuUu((float)var1, (float)var2, (float)var3, (float)var4, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.UnUNVVVNuv();
      UnVNvNnU.nvnNNunvv var9 = UnVNvNnU.nvnNNunvv.fromRect(var1, var2, var3, var4, var5, var6, var7, var8, this.UnUNVVVNuv.uNNnnnuuuN());
      UnVNvNnU.nvnNNunvv var10 = this.uVUuuVnNVU.isEmpty() ? var9 : UnVNvNnU.nvnNNunvv.intersect(this.uVUuuVnNVU.peek(), var9);
      this.uVUuuVnNVU.push(var10);
      this.UuUVuuUu(var10);
   }

   public void nuUnNvnuUu() {
      this.UnUNVVVNuv();
      if (!this.uVUuuVnNVU.isEmpty()) {
         this.uVUuuVnNVU.pop();
         if (this.uVUuuVnNVU.isEmpty()) {
            this.VVuuUN.C00OOC00oO(false);
         } else {
            this.UuUVuuUu(this.uVUuuVnNVU.peek());
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU.nvnNNunvv var1) {
      if (var1 == null) {
         this.VVuuUN.C00OOC00oO(false);
      } else {
         this.VVuuUN.C00OOC00oO(true);
         this.VVuuUN
            .UuUVuuUu(var1.x(), var1.y(), var1.w(), var1.h(), var1.roundTopLeft(), var1.roundTopRight(), var1.roundBottomRight(), var1.roundBottomLeft());
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, int var5, float var6) {
      this.UnUNVVVNuv();
      var1--;
      var2--;
      var3 += 2.0F;
      var4 += 2.0F;
      this.UvnvNVnnnnNU.UuUVuuUu(var1, var2, var3, var4, 0.0F, 0.0F, 0.0F, 0.0F, this.C00OOC00oO(var5), Math.max(1.0F, var6), this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, float var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, float var10) {
      this.UnUNVVVNuv();
      float[] var11 = this.uUnuvNvvNU(var3, var4, var5, var6, var7, var8);
      var1--;
      var2--;
      var3 += 2.0F;
      var4 += 2.0F;
      if (var11[0] > 0.0F) {
         var11[0]++;
      }

      if (var11[1] > 0.0F) {
         var11[1]++;
      }

      if (var11[2] > 0.0F) {
         var11[2]++;
      }

      if (var11[3] > 0.0F) {
         var11[3]++;
      }

      this.UvnvNVnnnnNU
         .UuUVuuUu(var1, var2, var3, var4, var11[0], var11[1], var11[2], var11[3], this.C00OOC00oO(var9), Math.max(1.0F, var10), this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      this.UnUNVVVNuv();
      this.UvnvNVnnnnNU
         .UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            this.C00OOC00oO(var5),
            this.C00OOC00oO(var6),
            this.C00OOC00oO(var7),
            this.C00OOC00oO(var8),
            this.UnUNVVVNuv.uNNnnnuuuN()
         );
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7, var8, var9);
   }

   public void UuUVuuUu(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      this.UnUNVVVNuv();
      float[] var13 = this.uUnuvNvvNU(var3, var4, var5, var6, var7, var8);
      this.UvnvNVnnnnNU
         .UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var13[0],
            var13[1],
            var13[2],
            var13[3],
            this.C00OOC00oO(var9),
            this.C00OOC00oO(var10),
            this.C00OOC00oO(var11),
            this.C00OOC00oO(var12),
            this.UnUNVVVNuv.uNNnnnuuuN()
         );
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var6, var5);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var7, var6);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var10, var9);
   }

   public void C00OOC00oO(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var6, var6);
   }

   public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var6, var7, var7);
   }

   public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var9, var10, var10);
   }

   public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5, int var6) {
      this.UnUNVVVNuv();
      this.UvnvNVnnnnNU.UuUVuuUu(var1, var2, var3, var4, var5, this.C00OOC00oO(var6), this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      this.UnUNVVVNuv();
      this.UvnvNVnnnnNU.UuUVuuUu(var1, var2, var3, var4, var5, var6, this.C00OOC00oO(var7), this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7, var8);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11) {
      this.UnUNVVVNuv();
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         if (!nuuvUNvn.C00OOC00oO()) {
            boolean var12 = true;

            try {
               var12 = C00OOC00oO == null || C00OOC00oO.getAsBoolean();
            } catch (Throwable var16) {
            }

            float var13 = Math.max(0.0F, var9);
            if (!var12 && var13 > 6.0F) {
               var13 = Math.min(var13, 6.0F);
            }

            float var14 = Math.max(0.0F, var10);
            if (!(var13 <= 0.0F) || !(var14 <= 0.0F)) {
               float[] var15 = vVvUvVVuuNvV(var5, var6, var7, var8);
               UuUVuuUu(var3, var4, var15);
               this.uUnuvNvvNU();
               this.VVuuUN
                  .UuUVuuUu(var1, var2, var3, var4, var15[0], var15[1], var15[2], var15[3], var13, var14, this.C00OOC00oO(var11), this.UnUNVVVNuv.uNNnnnuuuN());
            }
         }
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, 1.0F);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.UnUNVVVNuv();
      if (!nuuvUNvn.C00OOC00oO()) {
         if (this.UNnVVNvvnVvU) {
            float var10 = nuUnNvnuUu(var9) * this.uVUVnuvnuVuv();
            if (!(var10 <= 1.0E-4F)) {
               float[] var11 = vVvUvVVuuNvV(var5, var6, var7, var8);
               UuUVuuUu(var3, var4, var11);
               this.uUnuvNvvNU();
               this.VVuuUN.UuUVuuUu(var1, var2, var3, var4, var11[0], var11[1], var11[2], var11[3], var10, this.UnUNVVVNuv.uNNnnnuuuN());
            }
         }
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, float var7, int var8) {
      this.UnUNVVVNuv();
      float var9 = this.uVUVnuvnuVuv();
      if (!(var9 <= 1.0E-4F)) {
         if (!nuuvUNvn.C00OOC00oO() && this.UNnVVNvvnVvU) {
            float[] var10 = this.uUnuvNvvNU(var3, var4, var5, var5, var5, var5);
            this.uUnuvNvvNU();
            if (!this.VVuuUN
               .UuUVuuUu(var1, var2, var3, var4, var10[0], var10[1], var10[2], var10[3], var6, nuUnNvnuUu(var7), var8, var9, this.UnUNVVVNuv.uNNnnnuuuN())) {
               this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var8, var9);
            }
         } else {
            this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var8, var9);
         }
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      float[] var9 = this.uUnuvNvvNU(var3, var4, var5, var5, var5, var5);
      int var10 = UuNuUunUnV.UuUVuuUu(UuNuUunUnV.UuUVuuUu(var6, var7), var8);
      this.UvnvNVnnnnNU.UuUVuuUu(var1, var2, var3, var4, var9[0], var9[1], var9[2], var9[3], var10, this.UnUNVVVNuv.uNNnnnuuuN());
   }

   public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5) {
      this.C00OOC00oO(var1, var2, var3, var4, var5, 1.0F);
   }

   public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.UnUNVVVNuv();
      if (!nuuvUNvn.C00OOC00oO()) {
         if (this.UnUNuUU) {
            float var7 = nuUnNvnuUu(var6) * this.uVUVnuvnuVuv();
            if (!(var7 <= 1.0E-4F)) {
               this.uUnuvNvvNU();
               this.VVuuUN
                  .UuUVuuUu(
                     var1,
                     var2,
                     var3,
                     var4,
                     Math.max(0.0F, var5),
                     var7,
                     this.UnUNVVVNuv.uNNnnnuuuN(),
                     this.UvUvUNuvNU,
                     this.c0oOOCcCoC0,
                     this.VVnVNnunVvu,
                     this.unNNVVNnvvV
                  );
            }
         }
      }
   }

   public void UuUVuuUu(float var1) {
      this.UnUNVVVNuv();
      if (nuuvUNvn.C00OOC00oO()) {
         this.UNnVVNvvnVvU = false;
         this.NnUuNNU = 0;
         this.nNvNUVU = 0;
      } else {
         try {
            if (UuUVuuUu != null && !UuUVuuUu.getAsBoolean()) {
               this.UNnVVNvvnVvU = false;
               this.NnUuNNU = 0;
               this.nNvNUVU = 0;
               return;
            }
         } catch (Throwable var6) {
         }

         int var2 = this.NVNnnvnuunNv;
         int var3 = this.uVunuUNVVUUV;
         if (var2 > 0 && var3 > 0) {
            float var4 = Math.max(0.5F, var1);
            boolean var5 = this.UNnVVNvvnVvU && this.NnUuNNU == var2 && this.nNvNUVU == var3 && Math.abs(this.uNnUnnuNUnNu - var4) <= 0.05F;
            if (!var5) {
               this.uUnuvNvvNU();
               this.UNnVVNvvnVvU = this.VVuuUN.UuUVuuUu(var2, var3, var4);
               this.uNnUnnuNUnNu = var4;
               this.NnUuNNU = this.UNnVVNvvnVvU ? var2 : 0;
               this.nNvNUVU = this.UNnVVNvvnVvU ? var3 : 0;
            }
         } else {
            this.UNnVVNvvnVvU = false;
            this.NnUuNNU = 0;
            this.nNvNUVU = 0;
         }
      }
   }

   public static void UuUVuuUu(boolean var0) {
      if (var0) {
         GlStateManager._enableBlend();
         GL11.glBlendFunc(770, 771);
         GlStateManager._disableCull();
         GlStateManager._blendFuncSeparate(770, 771, 1, 0);
         GlStateManager._colorMask(true, true, true, true);
      } else {
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._enableBlend();
      }
   }

   public static void C00OOC00oO(boolean var0) {
      if (var0) {
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._blendFuncSeparate(770, 771, 1, 0);
         GlStateManager._enableCull();
         GlStateManager._disableBlend();
      } else {
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._enableBlend();
      }
   }

   public void uUnuvNvvNU(float var1, float var2, float var3, float var4, float var5) {
      this.UnUNVVVNuv();
      if (nuuvUNvn.C00OOC00oO()) {
         this.UnUNuUU = false;
         this.VVnVNnunVvu = 0;
         this.unNNVVNnvvV = 0;
      } else if (this.NVNnnvnuunNv > 0 && this.uVunuUNVVUUV > 0 && !(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         float[] var6 = this.UnUNVVVNuv.uNNnnnuuuN();
         UnVNvNnU.NVnVnNnN var7 = UuUVuuUu(var6, var1, var2, var3, var4);
         int var8 = UuUVuuUu(var7.minX, this.NVNnnvnuunNv);
         int var9 = UuUVuuUu(var7.minY, this.uVunuUNVVUUV);
         int var10 = C00OOC00oO(var7.maxX, this.NVNnnvnuunNv);
         int var11 = C00OOC00oO(var7.maxY, this.uVunuUNVVUUV);
         int var12 = Math.max(0, var10 - var8);
         int var13 = Math.max(0, var11 - var9);
         if (var12 > 0 && var13 > 0) {
            float var14 = Math.max(0.5F, var5);
            boolean var15 = this.UnUNuUU
               && this.UvUvUNuvNU == var8
               && this.c0oOOCcCoC0 == var9
               && this.VVnVNnunVvu == var12
               && this.unNNVVNnvvV == var13
               && Math.abs(this.uUVuVvuNUvnu - var14) <= 0.05F;
            if (!var15) {
               this.uUnuvNvvNU();
               boolean var16 = this.VVuuUN.UuUVuuUu(var8, var9, var12, var13, var14);
               this.UnUNuUU = var16;
               if (var16) {
                  this.uUVuVvuNUvnu = var14;
                  this.UvUvUNuvNU = var8;
                  this.c0oOOCcCoC0 = var9;
                  this.VVnVNnunVvu = var12;
                  this.unNNVVNnvvV = var13;
               } else {
                  this.uUVuVvuNUvnu = 0.0F;
                  this.VVnVNnunVvu = 0;
                  this.unNNVVNnvvV = 0;
               }
            }
         } else {
            this.UnUNuUU = false;
            this.VVnVNnunVvu = 0;
            this.unNNVVNnvvV = 0;
         }
      } else {
         this.UnUNuUU = false;
         this.VVnVNnunVvu = 0;
         this.unNNVVNnvvV = 0;
      }
   }

   private static int UuUVuuUu(float var0, int var1) {
      int var2 = (int)Math.floor(var0);
      if (var2 < 0) {
         return 0;
      } else {
         return var2 > var1 ? var1 : var2;
      }
   }

   private static int C00OOC00oO(float var0, int var1) {
      int var2 = (int)Math.ceil(var0);
      if (var2 < 0) {
         return 0;
      } else {
         return var2 > var1 ? var1 : var2;
      }
   }

   private static UnVNvNnU.NVnVnNnN UuUVuuUu(float[] var0, float var1, float var2, float var3, float var4) {
      float var7 = var1 + var3;
      float var8 = var2 + var4;
      float var9 = UuUVuuUu(var0, var1, var2);
      float var10 = C00OOC00oO(var0, var1, var2);
      float var11 = UuUVuuUu(var0, var7, var2);
      float var12 = C00OOC00oO(var0, var7, var2);
      float var13 = UuUVuuUu(var0, var7, var8);
      float var14 = C00OOC00oO(var0, var7, var8);
      float var15 = UuUVuuUu(var0, var1, var8);
      float var16 = C00OOC00oO(var0, var1, var8);
      float var17 = Math.min(Math.min(var9, var11), Math.min(var13, var15));
      float var18 = Math.max(Math.max(var9, var11), Math.max(var13, var15));
      float var19 = Math.min(Math.min(var10, var12), Math.min(var14, var16));
      float var20 = Math.max(Math.max(var10, var12), Math.max(var14, var16));
      return new UnVNvNnU.NVnVnNnN(var17, var19, var18, var20);
   }

   private static float UuUVuuUu(float[] var0, float var1, float var2) {
      return var0 != null && var0.length >= 6 ? var0[0] * var1 + var0[1] * var2 + var0[2] : var1;
   }

   private static float C00OOC00oO(float[] var0, float var1, float var2) {
      return var0 != null && var0.length >= 6 ? var0[3] * var1 + var0[4] * var2 + var0[5] : var2;
   }

   public void UuUVuuUu(float[] var1) {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.UuUVuuUu();
      this.UnUNVVVNuv.C00OOC00oO(var1);
   }

   public void C00OOC00oO(float[] var1) {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.UuUVuuUu(var1);
   }

   public void C00OOC00oO(float var1) {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.UuUVuuUu(var1);
   }

   public void VVuuUN() {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.vVvUvVVuuNvV();
   }

   public void UuUVuuUu(float var1, float var2) {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.UuUVuuUu(var1, var2);
   }

   public void vNUvnnVnUvu() {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.vVvUvVVuuNvV();
   }

   public void uUnuvNvvNU(float var1) {
      this.C00OOC00oO(var1, var1);
   }

   public void C00OOC00oO(float var1, float var2) {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.UuUVuuUu(var1, var2, 0.0F, 0.0F);
   }

   public void vVvUvVVuuNvV(float var1) {
      this.uUnuvNvvNU(var1, var1);
   }

   public void uUnuvNvvNU(float var1, float var2) {
      this.UnUNVVVNuv();
      if (this.NVNnnvnuunNv > 0 && this.uVunuUNVVUUV > 0) {
         this.UnUNVVVNuv.UuUVuuUu(var1, var2, this.NVNnnvnuunNv * 0.5F, this.uVunuUNVVUUV * 0.5F);
      } else {
         throw new IllegalStateException("Cannot compute frame center before begin(width, height) is called with positive dimensions");
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3) {
      this.uUnuvNvvNU(var1, var1, var2, var3);
   }

   public void uUnuvNvvNU(float var1, float var2, float var3, float var4) {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.UuUVuuUu(var1, var2, var3, var4);
   }

   public void uVUuuVnNVU() {
      this.UnUNVVVNuv();
      this.UnUNVVVNuv.vVvUvVVuuNvV();
   }

   public void uNNnnnuuuN(float var1) {
      this.UnUNVVVNuv();
      float var2 = this.uVUVnuvnuVuv();
      float var3 = nuUnNvnuUu(var1);
      this.vuuuNvNuv.push(var2 * var3);
   }

   public void vuuuNvNuv() {
      this.UnUNVVVNuv();
      if (this.vuuuNvNuv.size() > 1) {
         this.vuuuNvNuv.pop();
      }
   }

   public static VuuUvnvnuu UuUVuuUu(nUVnuvUu var0) {
      return var0 == null ? null : vNVuvnUUnuUn.get(var0.UuUVuuUu);
   }

   public void UuUVuuUu(String var1, VuuUvnvnuu var2) {
      if (var2 != null) {
         vNVuvnUUnuUn.put(var1, var2);
      }
   }

   public void UuUVuuUu(nUVnuvUu var1, VuuUvnvnuu var2) {
      if (var2 != null) {
         vNVuvnUUnuUn.put(var1.UuUVuuUu, var2);
      }
   }

   public NVUUNnVvnNNV nvUVNnuu() {
      return this.UnUNVVVNuv;
   }

   public float[] UuuNnUvUuv() {
      this.UnUNVVVNuv();
      if (this.UuuNnUvUuv.isEmpty()) {
         return this.UnUNVVVNuv.uNNnnnuuuN();
      } else {
         UnVNvNnU.uunvUUVnuNn var1 = this.UuuNnUvUuv.peek();
         float[] var2 = this.UnUNVVVNuv.uNNnnnuuuN();
         float[] var3 = new float[]{var2[0], var2[1], var2[2] + var1.vNVuvnUUnuUn, var2[3], var2[4], var2[5] + var1.UvnvNVnnnnNU, var2[6], var2[7], var2[8]};
         return UuUVuuUu(var1.UnUNVVVNuv, var3);
      }
   }

   public float nUUVuvU() {
      return this.uVUVnuvnuVuv();
   }

   public void UuUVuuUu(nUVnuvUu var1, float var2, float var3, float var4, String var5, int var6) {
      this.UnUNVVVNuv();
      if (var1 == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (!(var4 <= 0.0F)) {
         VuuUvnvnuu var7 = vNVuvnUUnuUn.get(var1.UuUVuuUu);
         if (var7 != null) {
            var7.UuUVuuUu(var2, var3, var4 / 2.0F, var5, this.C00OOC00oO(var6), this.UnUNVVVNuv.uNNnnnuuuN());
         }
      }
   }

   public void UuUVuuUu(nUVnuvUu var1, float var2, float var3, float var4, String var5, int var6, String var7) {
      this.UnUNVVVNuv();
      if (var1 == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (!(var4 <= 0.0F)) {
         VuuUvnvnuu var8 = vNVuvnUUnuUn.get(var1.UuUVuuUu);
         if (var8 != null) {
            var8.UuUVuuUu(var2, var3, var4 / 2.0F, var5, this.C00OOC00oO(var6), var7, this.UnUNVVVNuv.uNNnnnuuuN());
         }
      }
   }

   public void UuUVuuUu(nUVnuvUu var1, float var2, float var3, float var4, String var5, int var6, int var7, float var8) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, "l");
   }

   public void UuUVuuUu(nUVnuvUu var1, float var2, float var3, float var4, String var5, int var6, int var7, float var8, String var9) {
      this.UnUNVVVNuv();
      if (var1 == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (!(var4 <= 0.0F)) {
         VuuUvnvnuu var10 = vNVuvnUUnuUn.get(var1.UuUVuuUu);
         if (var10 != null) {
            var10.UuUVuuUu(var2, var3, var4 / 2.0F, var5, this.C00OOC00oO(var6), this.C00OOC00oO(var7), var8, var9, this.UnUNVVVNuv.uNNnnnuuuN());
         }
      }
   }

   public static VuuUvnvnuu.nvnNNunvv UuUVuuUu(nUVnuvUu var0, String var1, float var2) {
      if (var0 == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (var2 <= 0.0F) {
         return new VuuUvnvnuu.nvnNNunvv(0.0F, 0.0F);
      } else {
         VuuUvnvnuu var3 = vNVuvnUUnuUn.get(var0.UuUVuuUu);
         if (var3 == null) {
            return new VuuUvnvnuu.nvnNNunvv(0.0F, 0.0F);
         } else {
            String var4 = var1 == null ? "" : var1;
            return var3.vVvUvVVuuNvV(var4, var2 / 2.0F);
         }
      }
   }

   private void vNVuvnUUnuUn() {
      this.vuuuNvNuv.clear();
      this.vuuuNvNuv.push(nuUnNvnuUu);
   }

   private void UvnvNVnnnnNU() {
      this.nvUVNnuu.clear();
      this.nvUVNnuu.push(false);
      if (this.VVuuUN != null) {
         this.VVuuUN.UuUVuuUu(false);
      }
   }

   private float uVUVnuvnuVuv() {
      return this.vuuuNvNuv.isEmpty() ? 1.0F : this.vuuuNvNuv.peek();
   }

   private int C00OOC00oO(int var1) {
      float var2 = this.uVUVnuvnuVuv();
      if (var2 >= 0.999F) {
         return var1;
      } else {
         int var3 = var1 >>> 24 & 0xFF;
         int var4 = var1 >>> 16 & 0xFF;
         int var5 = var1 >>> 8 & 0xFF;
         int var6 = var1 & 0xFF;
         int var7 = UuUVuuUu(var3, var2);
         int var8 = UuUVuuUu(var4, var2);
         int var9 = UuUVuuUu(var5, var2);
         int var10 = UuUVuuUu(var6, var2);
         return var7 << 24 | var8 << 16 | var9 << 8 | var10;
      }
   }

   private static int UuUVuuUu(int var0, float var1) {
      float var2 = var0 * var1;
      if (var2 <= 0.0F) {
         return 0;
      } else {
         return var2 >= 255.0F ? 255 : Math.round(var2);
      }
   }

   private static float nuUnNvnuUu(float var0) {
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   static float[] vVvUvVVuuNvV(float var0, float var1, float var2, float var3) {
      float[] var4 = NuunnvnN.get();
      var4[0] = var0;
      var4[1] = var1;
      var4[2] = var2;
      var4[3] = var3;
      return var4;
   }

   static void UuUVuuUu(float var0, float var1, float[] var2) {
      if (var2 != null && var2.length >= 4) {
         float var3 = Math.abs(var0);
         float var4 = Math.abs(var1);

         for (int var5 = 0; var5 < 4; var5++) {
            float var6 = var2[var5];
            if (!Float.isFinite(var6)) {
               var6 = 0.0F;
            }

            var2[var5] = Math.max(0.0F, var6);
         }

         if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
            float var7 = Math.min(var3, var4) * 0.5F;

            for (int var8 = 0; var8 < 4; var8++) {
               var2[var8] = Math.min(var2[var8], var7);
            }
         } else {
            Arrays.fill(var2, 0.0F);
         }
      } else {
         throw new IllegalArgumentException("radii");
      }
   }

   private static boolean vVvUvVVuuNvV(float var0, float var1) {
      return Math.abs(var0 - var1) <= 1.0E-4F;
   }

   private static boolean VVuuUN(float var0) {
      return Math.abs(var0) <= 1.0E-4F;
   }

   static boolean uUnuvNvvNU(float[] var0) {
      return var0 != null && var0.length >= 9
         ? vVvUvVVuuNvV(var0[0], 1.0F)
            && VVuuUN(var0[1])
            && VVuuUN(var0[2])
            && VVuuUN(var0[3])
            && vVvUvVVuuNvV(var0[4], 1.0F)
            && VVuuUN(var0[5])
            && VVuuUN(var0[6])
            && VVuuUN(var0[7])
            && vVvUvVVuuNvV(var0[8], 1.0F)
         : true;
   }

   static boolean vVvUvVVuuNvV(float[] var0) {
      return var0 != null && var0.length >= 9 ? VVuuUN(var0[1]) && VVuuUN(var0[3]) && VVuuUN(var0[6]) && VVuuUN(var0[7]) && vVvUvVVuuNvV(var0[8], 1.0F) : true;
   }

   static float uUnuvNvvNU(float[] var0, float var1, float var2) {
      return var0 != null && var0.length >= 9 ? var0[0] * var1 + var0[1] * var2 + var0[2] : var1;
   }

   static float vVvUvVVuuNvV(float[] var0, float var1, float var2) {
      return var0 != null && var0.length >= 9 ? var0[3] * var1 + var0[4] * var2 + var0[5] : var2;
   }

   static float uNNnnnuuuN(float[] var0) {
      if (var0 != null && var0.length >= 9) {
         float var1 = Math.abs(var0[0]);
         float var2 = Math.abs(var0[4]);
         float var3 = Math.min(var1, var2);
         return var3 <= 1.0E-4F ? 0.0F : var3;
      } else {
         return 1.0F;
      }
   }

   private static float[] UuUVuuUu(float[] var0, float[] var1) {
      return new float[]{
         var0[0] * var1[0] + var0[1] * var1[3] + var0[2] * var1[6],
         var0[0] * var1[1] + var0[1] * var1[4] + var0[2] * var1[7],
         var0[0] * var1[2] + var0[1] * var1[5] + var0[2] * var1[8],
         var0[3] * var1[0] + var0[4] * var1[3] + var0[5] * var1[6],
         var0[3] * var1[1] + var0[4] * var1[4] + var0[5] * var1[7],
         var0[3] * var1[2] + var0[4] * var1[5] + var0[5] * var1[8],
         var0[6] * var1[0] + var0[7] * var1[3] + var0[8] * var1[6],
         var0[6] * var1[1] + var0[7] * var1[4] + var0[8] * var1[7],
         var0[6] * var1[2] + var0[7] * var1[5] + var0[8] * var1[8]
      };
   }

   public static void UuUVuuUu(class_4587 var0, float var1, float var2, float var3) {
      UuUVuuUu(var0, (double)var1, (double)var2, (double)var3);
   }

   public static void UuUVuuUu(class_4587 var0, double var1, double var3, double var5) {
      class_243 var7 = uUnuvNvvNU.method_1561().field_4686.method_19326();
      var0.method_22904(var1 - var7.field_1352, var3 - var7.field_1351, var5 - var7.field_1350);
   }

   public static Vector2d UuUVuuUu(double var0, double var2, double var4) {
      class_4184 var6 = uUnuvNvvNU.method_1561().field_4686;
      if (var6 == null) {
         return new Vector2d(0.0, 0.0);
      } else {
         class_243 var7 = var6.method_19326();
         Quaternionf var8 = new Quaternionf(var6.method_23767());
         var8.conjugate();
         Vector3f var9 = new Vector3f((float)(var7.field_1352 - var0), (float)(var7.field_1351 - var2), (float)(var7.field_1350 - var4));
         var9.rotate(var8);
         float var10 = uUnuvNvvNU.method_61966().method_60636();
         if ((Boolean)uUnuvNvvNU.field_1690.method_42448().method_41753() && uUnuvNvvNU.method_1560() instanceof class_1657 var12) {
            float var13 = var12.field_7483;
            float var14 = var13 - var12.field_7505;
            float var15 = -(var13 + var14 * var10);
            float var16 = var6.method_19330();
            float var17 = Math.abs(class_3532.method_15362(var15 * (float) Math.PI - 0.2F) * var16) * 5.0F;
            Quaternionf var18 = new Quaternionf().rotateAxis((float)Math.toRadians(var17), new Vector3f(1.0F, 0.0F, 0.0F));
            var18.conjugate();
            var9.rotate(var18);
            float var19 = class_3532.method_15374(var15 * (float) Math.PI) * var16 * 3.0F;
            Quaternionf var20 = new Quaternionf().rotateAxis((float)Math.toRadians(var19), new Vector3f(0.0F, 0.0F, 1.0F));
            var20.conjugate();
            var9.rotate(var20);
            Vector3f var21 = new Vector3f(
               class_3532.method_15374(var15 * (float) Math.PI) * var16 * 0.5F, -Math.abs(class_3532.method_15362(var15 * (float) Math.PI) * var16), 0.0F
            );
            var21.y = -var21.y;
            var9.add(var21);
         }

         double var22 = ((GameRendererAccessor)uUnuvNvvNU.field_1773).invokeGetFov(var6, var10, true);
         float var23 = uUnuvNvvNU.method_22683().method_4502() / 2.0F;
         float var24 = var23 / (var9.z() * (float)Math.tan(Math.toRadians(var22 / 2.0)));
         return var9.z() < 0.0F
            ? new Vector2d(-var9.x() * var24 + uUnuvNvvNU.method_22683().method_4486() / 2, uUnuvNvvNU.method_22683().method_4502() / 2 - var9.y() * var24)
            : null;
      }
   }

   record NVnVnNnN(float minX, float minY, float maxX, float maxY) {
   }

   public static class VvunVVUvUNnv {
      public static float UuUVuuUu(int var0) {
         return (var0 >> 16 & 0xFF) / 255.0F;
      }

      public static float C00OOC00oO(int var0) {
         return (var0 >> 8 & 0xFF) / 255.0F;
      }

      public static float uUnuvNvvNU(int var0) {
         return (var0 & 0xFF) / 255.0F;
      }

      public static float vVvUvVVuuNvV(int var0) {
         return (var0 >> 24 & 0xFF) / 255.0F;
      }

      public static Color UuUVuuUu(Color var0, int var1) {
         return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
      }

      public static Color UuUVuuUu(Color var0, Color var1, double var2) {
         float var4 = UuvVnuU.vuuuNvNuv((float)Math.sin((Math.PI * 6) * (var2 / 4.0 % 1.0)) / 2.0F + 0.5F, 0.0F, 1.0F);
         return new Color(VnVnuUn.uUnuvNvvNU(var0.getRGB(), var1.getRGB(), var4), true);
      }

      public static Color C00OOC00oO(Color var0, int var1) {
         return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
      }

      public static int UuUVuuUu(int var0, int var1) {
         return var0 & 16777215 | var1 << 24;
      }

      public static int UuUVuuUu() {
         return nuUnNvnuUu(10, 255);
      }

      private static NvVNvUvunNNu C00OOC00oO() {
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
            return ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
         } else {
            return UUVNUUUnNUv.NVuNUuVnVUN != null ? UUVNUUUnNUv.NVuNUuVnVUN : NvVNvUvunNNu.WILD;
         }
      }

      private static NvVNvUvunNNu uUnuvNvvNU() {
         return UUVNUUUnNUv.NVuunNnvvvVu != null ? UUVNUUUnNUv.NVuunNnvvvVu : C00OOC00oO();
      }

      public static int[] C00OOC00oO(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return new int[]{
            C00OOC00oO(
               UuUVuuUu(var0, 0, UuUVuuUu(var2.UuUVuuUu().getRGB(), var3.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU()))),
               (float)var1
            ),
            C00OOC00oO(
               UuUVuuUu(var0, 90, UuUVuuUu(var2.UuUVuuUu().getRGB(), var3.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU()))),
               (float)var1
            ),
            C00OOC00oO(
               UuUVuuUu(var0, 180, UuUVuuUu(var2.UuUVuuUu().getRGB(), var3.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU()))),
               (float)var1
            ),
            C00OOC00oO(
               UuUVuuUu(var0, 270, UuUVuuUu(var2.UuUVuuUu().getRGB(), var3.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU()))),
               (float)var1
            )
         };
      }

      public static int uUnuvNvvNU(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return UuUVuuUu(
            UuUVuuUu(var2.C00OOC00oO().getRGB(), var3.C00OOC00oO().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            UuUVuuUu(var2.C00OOC00oO().getRGB(), var3.C00OOC00oO().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            var0,
            var1
         );
      }

      public static int vVvUvVVuuNvV(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return UuUVuuUu(
            UuUVuuUu(var2.uUnuvNvvNU().getRGB(), var3.uUnuvNvvNU().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            UuUVuuUu(var2.uUnuvNvvNU().getRGB(), var3.uUnuvNvvNU().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            var0,
            var1
         );
      }

      public static int uNNnnnuuuN(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return UuUVuuUu(
            UuUVuuUu(var2.vVvUvVVuuNvV().getRGB(), var3.vVvUvVVuuNvV().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            UuUVuuUu(var2.vVvUvVVuuNvV().getRGB(), var3.vVvUvVVuuNvV().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            var0,
            var1
         );
      }

      public static int nuUnNvnuUu(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return UuUVuuUu(
            UuUVuuUu(var2.UuUVuuUu().getRGB(), var3.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            UuUVuuUu(var2.UuUVuuUu().getRGB(), var3.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            var0,
            var1
         );
      }

      public static int VVuuUN(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return UuUVuuUu(
            UuUVuuUu(var2.uNNnnnuuuN().getRGB(), var3.uNNnnnuuuN().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            UuUVuuUu(var2.uNNnnnuuuN().getRGB(), var3.uNNnnnuuuN().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            var0,
            var1
         );
      }

      public static int vNUvnnVnUvu(int var0, int var1) {
         NvVNvUvunNNu var2 = C00OOC00oO();
         NvVNvUvunNNu var3 = uUnuvNvvNU();
         return UuUVuuUu(
            UuUVuuUu(var2.nuUnNvnuUu().getRGB(), var3.nuUnNvnuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            UuUVuuUu(var2.nuUnNvnuUu().getRGB(), var3.nuUnNvnuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())),
            var0,
            var1
         );
      }

      public Color C00OOC00oO(Color var1, Color var2, double var3) {
         var3 = 1.0 - var3;
         return new Color(VnVnuUn.C00OOC00oO(var1.getRGB(), var2.getRGB(), var3), true);
      }

      public static Color UuUVuuUu(int var0, int var1, Color var2, Color var3, boolean var4) {
         int var5 = 0;
         if (var0 == 0) {
            var5 = var1 % 360;
         } else {
            var5 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
         }

         var5 = (var5 >= 180 ? 360 - var5 : var5) * 2;
         return var4 ? UuUVuuUu(var2, var3, var5 / 360.0F) : C00OOC00oO(var2, var3, var5 / 360.0F);
      }

      public static Color UuUVuuUu(Color var0, Color var1, float var2) {
         var2 = Math.min(1.0F, Math.max(0.0F, var2));
         float[] var3 = Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), null);
         float[] var4 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
         Color var5 = Color.getHSBColor(UuUVuuUu(var3[0], var4[0], var2), UuUVuuUu(var3[1], var4[1], var2), UuUVuuUu(var3[2], var4[2], var2));
         return new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), (int)UuUVuuUu((float)var0.getAlpha(), (float)var1.getAlpha(), var2));
      }

      public static Color C00OOC00oO(Color var0, Color var1, float var2) {
         return new Color(VnVnuUn.uUnuvNvvNU(var0.getRGB(), var1.getRGB(), var2), true);
      }

      private static float UuUVuuUu(float var0, float var1, float var2) {
         float var3 = Math.max(0.0F, Math.min(1.0F, var2));
         return var0 + (var1 - var0) * var3;
      }

      public static int UuUVuuUu(int var0, int var1, int var2, int var3) {
         double var4 = (System.currentTimeMillis() / var2 + var3) % 360L;
         double var7;
         float var6 = (float)((var7 = var4 % 360.0) / 360.0);
         return VnVnuUn.vVvUvVVuuNvV(var0, var1, var6);
      }

      public static int UuUVuuUu(int var0, float var1) {
         int var2 = var0 >> 16 & 0xFF;
         int var3 = var0 >> 8 & 0xFF;
         int var4 = var0 & 0xFF;
         int var5 = var0 >> 24 & 0xFF;
         float[] var6 = Color.RGBtoHSB(var2, var3, var4, null);
         float var7 = Math.max(0.0F, Math.min(1.0F, var6[2] * var1));
         int var8 = Color.HSBtoRGB(var6[0], var6[1], var7);
         return var8 & 16777215 | var5 << 24;
      }

      public static int UuUVuuUu(int var0, int var1, double var2) {
         return VnVnuUn.C00OOC00oO(var0, var1, var2);
      }

      public static int[] uNNnnnuuuN(int var0) {
         int[] var1 = new int[4];
         if (var0 == 0) {
            var0 = 1;
         }

         var1[0] = UuUVuuUu(var0, 1, 1.0F, 1.0F, 1.0F);
         var1[1] = UuUVuuUu(var0, 90, 1.0F, 1.0F, 1.0F);
         var1[2] = UuUVuuUu(var0, 180, 1.0F, 1.0F, 1.0F);
         var1[3] = UuUVuuUu(var0, 270, 1.0F, 1.0F, 1.0F);
         return var1;
      }

      public static int UuUVuuUu(int var0, int var1, float var2, float var3, float var4) {
         int var5 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
         float var6 = var5 / 360.0F;
         int var7 = Color.HSBtoRGB(var6, var2, var3);
         return uUnuvNvvNU(nUUVuvU(var7), UnUNVVVNuv(var7), vNVuvnUUnuUn(var7), Math.max(0, Math.min(255, (int)(var4 * 255.0F))));
      }

      public static int UuUVuuUu(int var0, int var1, int... var2) {
         int var3 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
         var3 = (var3 > 180 ? 360 - var3 : var3) + 180;
         int var4 = (int)(var3 / 360.0F * var2.length);
         if (var4 == var2.length) {
            var4--;
         }

         int var5 = var2[var4];
         int var6 = var2[var4 == var2.length - 1 ? 0 : var4 + 1];
         return C00OOC00oO(var5, var6, var3 / 360.0F * var2.length - var4);
      }

      public static int C00OOC00oO(int var0, int var1, double var2) {
         return VnVnuUn.C00OOC00oO(var0, var1, var2);
      }

      public static float[] nuUnNvnuUu(int var0) {
         return new float[]{nUUVuvU(var0) / 255.0F, UnUNVVVNuv(var0) / 255.0F, vNVuvnUUnuUn(var0) / 255.0F, UvnvNVnnnnNU(var0) / 255.0F};
      }

      public static int uVUuuVnNVU(int var0, int var1) {
         double var2 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
         double var4;
         return Color.getHSBColor((var4 = var2 % 360.0) / 360.0 < 0.5 ? -((float)(var4 / 360.0)) : (float)(var4 / 360.0), 0.5F, 1.0F).hashCode();
      }

      public static int[] VVuuUN(int var0) {
         int[] var1 = new int[4];
         if (var0 == 0) {
            boolean var2 = true;
         }

         var1[0] = uVUuuVnNVU(25, 1);
         var1[1] = uVUuuVnNVU(25, 90);
         var1[2] = uVUuuVnNVU(25, 180);
         var1[3] = uVUuuVnNVU(25, 270);
         return var1;
      }

      public static int C00OOC00oO(int var0, float var1) {
         return C00OOC00oO(vNUvnnVnUvu(var0), uVUuuVnNVU(var0), vuuuNvNuv(var0), (int)(nvUVNnuu(var0) * var1 / 255.0F));
      }

      public static int C00OOC00oO(int var0, int var1, int var2, int var3) {
         return var3 << 24 | var0 << 16 | var1 << 8 | var2;
      }

      public static int vNUvnnVnUvu(int var0) {
         return var0 >> 16 & 0xFF;
      }

      public static int uVUuuVnNVU(int var0) {
         return var0 >> 8 & 0xFF;
      }

      public static int vuuuNvNuv(int var0) {
         return var0 & 0xFF;
      }

      public static int nvUVNnuu(int var0) {
         return var0 >> 24 & 0xFF;
      }

      public static float[] UuUVuuUu(Color var0) {
         return new float[]{var0.getRed() / 255.0F, var0.getGreen() / 255.0F, var0.getBlue() / 255.0F, var0.getAlpha() / 255.0F};
      }

      public static int vuuuNvNuv(int var0, int var1) {
         return UuUVuuUu(
            UuUVuuUu(
               UUVNUUUnNUv.NVuNUuVnVUN.UuUVuuUu().getRGB(), UUVNUUUnNUv.NVuunNnvvvVu.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())
            ),
            UuUVuuUu(
               UUVNUUUnNUv.NVuNUuVnVUN.UuUVuuUu().getRGB(), UUVNUUUnNUv.NVuunNnvvvVu.UuUVuuUu().getRGB(), (double)(1.0F - UUVNUUUnNUv.uNNnnnuuuN.uVUuuVnNVU())
            ),
            var0,
            var1
         );
      }

      public static int uUnuvNvvNU(int var0, float var1) {
         int var2 = var0 >> 16 & 0xFF;
         int var3 = var0 >> 8 & 0xFF;
         int var4 = var0 & 0xFF;
         return uUnuvNvvNU(var2, var3, var4, (int)var1);
      }

      public static Color UuuNnUvUuv(int var0) {
         int var1 = var0 >> 16 & 0xFF;
         int var2 = var0 >> 8 & 0xFF;
         int var3 = var0 & 0xFF;
         int var4 = var0 >> 24 & 0xFF;
         return new Color(var1, var2, var3, var4);
      }

      public static int nvUVNnuu(int var0, int var1) {
         return uUnuvNvvNU(nUUVuvU(var0), UnUNVVVNuv(var0), vNVuvnUUnuUn(var0), var1);
      }

      public static int vVvUvVVuuNvV(int var0, float var1) {
         return UuUVuuUu(nUUVuvU(var0) * var1, UnUNVVVNuv(var0) * var1, vNVuvnUUnuUn(var0) * var1, (float)UvnvNVnnnnNU(var0));
      }

      public static int nUUVuvU(int var0) {
         return var0 >> 16 & 0xFF;
      }

      public static int UnUNVVVNuv(int var0) {
         return var0 >> 8 & 0xFF;
      }

      public static int vNVuvnUUnuUn(int var0) {
         return var0 & 0xFF;
      }

      public static int UvnvNVnnnnNU(int var0) {
         return var0 >> 24 & 0xFF;
      }

      public static int UuUVuuUu(float var0, float var1, float var2, float var3) {
         return uUnuvNvvNU(
            Math.max(0, Math.min(255, Math.round(var0))),
            Math.max(0, Math.min(255, Math.round(var1))),
            Math.max(0, Math.min(255, Math.round(var2))),
            Math.max(0, Math.min(255, Math.round(var3)))
         );
      }

      public static int UuUVuuUu(int var0, int var1, int var2) {
         return uUnuvNvvNU(var0, var1, var2, 255);
      }

      public static int uUnuvNvvNU(int var0, int var1, int var2, int var3) {
         int var4 = 0;
         var4 |= var3 << 24;
         var4 |= var0 << 16;
         var4 |= var1 << 8;
         return var4 | var2;
      }

      public static int uVUVnuvnuVuv(int var0) {
         return var0 >> 16 & 0xFF;
      }

      public static int NVNnnvnuunNv(int var0) {
         return var0 >> 8 & 0xFF;
      }

      public static int uVunuUNVVUUV(int var0) {
         return var0 & 0xFF;
      }

      public static int UNnVVNvvnVvU(int var0) {
         return var0 >> 24 & 0xFF;
      }

      public static float[] uNnUnnuNUnNu(int var0) {
         return new float[]{(var0 >> 16 & 0xFF) / 255.0F, (var0 >> 8 & 0xFF) / 255.0F, (var0 & 0xFF) / 255.0F, (var0 >> 24 & 0xFF) / 255.0F};
      }

      public static int vVvUvVVuuNvV(int var0, int var1, int var2, int var3) {
         return var3 << 24 | var0 << 16 | var1 << 8 | var2;
      }

      public static int C00OOC00oO(Color var0) {
         int var1 = var0.getAlpha();
         int var2 = var0.getRed();
         int var3 = var0.getGreen();
         int var4 = var0.getBlue();
         return var1 << 24 | var2 << 16 | var3 << 8 | var4;
      }

      public static float[] NnUuNNU(int var0) {
         return new float[]{(var0 >> 16 & 0xFF) / 255.0F, (var0 >> 8 & 0xFF) / 255.0F, (var0 & 0xFF) / 255.0F, (var0 >> 24 & 0xFF) / 255.0F};
      }
   }

   record nvnNNunvv(int x, int y, int w, int h, float roundTopLeft, float roundTopRight, float roundBottomRight, float roundBottomLeft) {
      private static UnVNvNnU.nvnNNunvv fromRect(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
         return fromRect(var0, var1, var2, var3, var4, var5, var6, var7, null);
      }

      static UnVNvNnU.nvnNNunvv fromRect(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float[] var8) {
         if (Float.isFinite(var0) && Float.isFinite(var1) && Float.isFinite(var2) && Float.isFinite(var3)) {
            boolean var9 = var8 != null && var8.length >= 9 && !UnVNvNnU.uUnuvNvvNU(var8);
            float[] var10 = UnVNvNnU.vVvUvVVuuNvV(var4, var5, var6, var7);
            UnVNvNnU.UuUVuuUu(Math.abs(var2), Math.abs(var3), var10);
            if (!var9) {
               float var27 = (float)Math.floor(Math.min(var0, var0 + var2));
               float var28 = (float)Math.floor(Math.min(var1, var1 + var3));
               float var29 = (float)Math.ceil(Math.max(var0, var0 + var2));
               float var30 = (float)Math.ceil(Math.max(var1, var1 + var3));
               int var31 = (int)var27;
               int var32 = (int)var28;
               int var34 = Math.max(0, (int)(var29 - var27));
               int var36 = Math.max(0, (int)(var30 - var28));
               return var34 > 0 && var36 > 0
                  ? new UnVNvNnU.nvnNNunvv(var31, var32, var34, var36, var10[0], var10[1], var10[2], var10[3])
                  : new UnVNvNnU.nvnNNunvv(var31, var32, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
               float var11 = var0 + var2;
               float var12 = var1 + var3;
               float var13 = Float.POSITIVE_INFINITY;
               float var14 = Float.POSITIVE_INFINITY;
               float var15 = Float.NEGATIVE_INFINITY;
               float var16 = Float.NEGATIVE_INFINITY;

               for (int var17 = 0; var17 < 4; var17++) {
                  float var35 = (var17 & 1) == 0 ? var0 : var11;
                  float var37 = var17 < 2 ? var1 : var12;
                  float var38 = UnVNvNnU.uUnuvNvvNU(var8, var35, var37);
                  float var39 = UnVNvNnU.vVvUvVVuuNvV(var8, var35, var37);
                  if (!Float.isFinite(var38) || !Float.isFinite(var39)) {
                     return new UnVNvNnU.nvnNNunvv(0, 0, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
                  }

                  if (var38 < var13) {
                     var13 = var38;
                  }

                  if (var38 > var15) {
                     var15 = var38;
                  }

                  if (var39 < var14) {
                     var14 = var39;
                  }

                  if (var39 > var16) {
                     var16 = var39;
                  }
               }

               float var33 = (float)Math.floor(Math.min(var13, var15));
               float var18 = (float)Math.floor(Math.min(var14, var16));
               float var19 = (float)Math.ceil(Math.max(var13, var15));
               float var20 = (float)Math.ceil(Math.max(var14, var16));
               int var21 = (int)var33;
               int var22 = (int)var18;
               int var23 = Math.max(0, (int)(var19 - var33));
               int var24 = Math.max(0, (int)(var20 - var18));
               if (var23 > 0 && var24 > 0) {
                  if (UnVNvNnU.vVvUvVVuuNvV(var8)) {
                     float var25 = UnVNvNnU.uNNnnnuuuN(var8);
                     if (var25 > 0.0F) {
                        for (int var26 = 0; var26 < var10.length; var26++) {
                           var10[var26] *= var25;
                        }
                     } else {
                        Arrays.fill(var10, 0.0F);
                     }
                  } else {
                     Arrays.fill(var10, 0.0F);
                  }

                  UnVNvNnU.UuUVuuUu(Math.abs(var19 - var33), Math.abs(var20 - var18), var10);
                  return new UnVNvNnU.nvnNNunvv(var21, var22, var23, var24, var10[0], var10[1], var10[2], var10[3]);
               } else {
                  return new UnVNvNnU.nvnNNunvv(var21, var22, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
               }
            }
         } else {
            return new UnVNvNnU.nvnNNunvv(0, 0, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
         }
      }

      static UnVNvNnU.nvnNNunvv intersect(UnVNvNnU.nvnNNunvv var0, UnVNvNnU.nvnNNunvv var1) {
         if (var0 == null) {
            return var1;
         } else if (var1 == null) {
            return var0;
         } else {
            int var2 = Math.max(var0.x, var1.x);
            int var3 = Math.max(var0.y, var1.y);
            int var4 = Math.min(var0.x + var0.w, var1.x + var1.w);
            int var5 = Math.min(var0.y + var0.h, var1.y + var1.h);
            int var6 = Math.max(0, var4 - var2);
            int var7 = Math.max(0, var5 - var3);
            if (var6 <= 0 || var7 <= 0) {
               return new UnVNvNnU.nvnNNunvv(var2, var3, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
            } else if (matchesRect(var2, var3, var6, var7, var1)) {
               return new UnVNvNnU.nvnNNunvv(var2, var3, var6, var7, var1.roundTopLeft, var1.roundTopRight, var1.roundBottomRight, var1.roundBottomLeft);
            } else {
               return matchesRect(var2, var3, var6, var7, var0)
                  ? new UnVNvNnU.nvnNNunvv(var2, var3, var6, var7, var0.roundTopLeft, var0.roundTopRight, var0.roundBottomRight, var0.roundBottomLeft)
                  : new UnVNvNnU.nvnNNunvv(var2, var3, var6, var7, 0.0F, 0.0F, 0.0F, 0.0F);
            }
         }
      }

      private static boolean matchesRect(int var0, int var1, int var2, int var3, UnVNvNnU.nvnNNunvv var4) {
         return var4 != null && var4.x == var0 && var4.y == var1 && var4.w == var2 && var4.h == var3;
      }
   }

   public static final class uunvUUVnuNn {
      vnuUvuuNVNUU.nvnNNunvv UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      boolean vVvUvVVuuNvV;
      float uNNnnnuuuN;
      int nuUnNvnuUu;
      int VVuuUN;
      boolean vNUvnnVnUvu;
      float uVUuuVnNVU;
      int vuuuNvNuv;
      int nvUVNnuu;
      int UuuNnUvUuv;
      int nUUVuvU;
      float[] UnUNVVVNuv;
      float vNVuvnUUnuUn;
      float UvnvNVnnnnNU;
      final float[] uVUVnuvnuVuv = new float[9];
      final ArrayDeque<float[]> NVNnnvnuunNv = new ArrayDeque<>();
      final ArrayDeque<UnVNvNnU.nvnNNunvv> uVunuUNVVUUV = new ArrayDeque<>();
      final ArrayDeque<Float> UNnVVNvvnVvU = new ArrayDeque<>();
      final ArrayDeque<Boolean> uNnUnnuNUnNu = new ArrayDeque<>();

      uunvUUVnuNn() {
      }
   }
}
