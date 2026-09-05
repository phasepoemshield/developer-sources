package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.MemoryUtil;

public final class VVNunVNVuuu {
   private static final String UuUVuuUu = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String C00OOC00oO = "assets/wild/shaders/advanced_neumorphism.frag";
   private static final String uUnuvNvvNU = "assets/wild/shaders/advanced_neumorphism_batch.vert";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/advanced_neumorphism_batch.frag";
   private static final int uNNnnnuuuN = 128;
   private static final int nuUnNvnuUu = 7;
   private static final int VVuuUN = 3;
   private static final OO0OCoOC vNUvnnVnUvu = OO0OCoOC.UuUVuuUu();
   private static Boolean uVUuuVnNVU;
   private static Method vuuuNvNuv;
   private static Method nvUVNnuu;
   private static vVvUNNUVVnNn UuuNnUvUuv;
   private static vVvUNNUVVnNn nUUVuvU;
   private static int UnUNVVVNuv;
   private static int vNVuvnUUnuUn;
   private static int UvnvNVnnnnNU;
   private static int uVUVnuvnuVuv;
   private static final VVNunVNVuuu.NVnVnNnN[] NVNnnvnuunNv = nUUVuvU();
   private static final FloatBuffer uVunuUNVVUUV = MemoryUtil.memAllocFloat(3584);
   private static String UNnVVNvvnVvU = "";

   private VVNunVNVuuu() {
   }

   public static void UuUVuuUu() {
      if (UvnvNVnnnnNU++ == 0) {
         uVUVnuvnuVuv = 0;
         UnVNvNnU var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var0 != null) {
            try {
               var0.uUnuvNvvNU();
            } catch (Throwable var2) {
            }
         }
      }
   }

   public static void C00OOC00oO() {
      if (uVUVnuvnuVuv > 0) {
         UnVNvNnU var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var0 != null) {
            try {
               var0.uUnuvNvvNU();
            } catch (Throwable var2) {
            }
         }

         uVUuuVnNVU();
         uVUVnuvnuVuv = 0;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void uUnuvNvvNU() {
      if (UvnvNVnnnnNU <= 0) {
         UvnvNVnnnnNU = 0;
      } else {
         boolean var2 = false /* VF: Semaphore variable */;

         try {
            var2 = true;
            C00OOC00oO();
            var2 = false;
         } finally {
            if (var2) {
               UvnvNVnnnnNU--;
               if (UvnvNVnnnnNU == 0) {
                  uVUVnuvnuVuv = 0;
               }
            }
         }

         UvnvNVnnnnNU--;
         if (UvnvNVnnnnNU == 0) {
            uVUVnuvnuVuv = 0;
         }
      }
   }

   public static boolean UuUVuuUu(VnuVUNUv var0) {
      return uNNnUu.UuUVuuUu().uNNnnnuuuN(var0);
   }

   public static boolean UuUVuuUu(
      VnuVUNUv var0, float var1, float var2, float var3, float var4, int var5, int var6, float var7, float var8, NUunUunuNV var9, float var10
   ) {
      return !UuUVuuUu(var0) ? false : uVNnuvnVvvu.UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static String C00OOC00oO(VnuVUNUv var0) {
      return uVvVnUU.UuUVuuUu().C00OOC00oO(var0);
   }

   public static String uUnuvNvvNU(VnuVUNUv var0) {
      return uVvVnUU.UuUVuuUu().UuUVuuUu(var0);
   }

   public static boolean UuUVuuUu(
      String var0, float var1, float var2, float var3, float var4, int var5, int var6, float var7, float var8, NUunUunuNV var9, float var10
   ) {
      return uNNnUu.UuUVuuUu().uNNnnnuuuN(var0)
         ? uVNnuvnVvvu.UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10)
         : NuVunNnUvvN.UuUVuuUu().UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static boolean UuUVuuUu(class_4587 var0, float var1, float var2, float var3, float var4, float var5) {
      return UuUVuuUu(var0, var1, var2, var3, var4, var5, 1.0F);
   }

   public static boolean UuUVuuUu(class_4587 var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      String var7 = Hud.UuuNnUvUuv();
      return UuUVuuUu(var0, var7, var1, var2, var3, var4, var5, var6);
   }

   public static boolean UuUVuuUu(class_4587 var0, String var1, float var2, float var3, float var4, float var5, float var6) {
      return UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, 1.0F);
   }

   public static boolean UuUVuuUu(class_4587 var0, float var1, float var2, float var3, float var4, float var5, boolean var6) {
      return UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, 1.0F);
   }

   public static boolean UuUVuuUu(class_4587 var0, float var1, float var2, float var3, float var4, float var5, boolean var6, float var7) {
      return UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, nvUVNnuu());
   }

   public static boolean UuUVuuUu(
      class_4587 var0, float var1, float var2, float var3, float var4, float var5, boolean var6, float var7, VVNunVNVuuu.VvunVVUvUNnv var8
   ) {
      VVNunVNVuuu.VvunVVUvUNnv var9 = var8 == null ? nvUVNnuu() : var8;
      return C00OOC00oO(var0, var1, var2, var3, var4, var5, var9.distance(), var9.blur(), var9.intensity(), var9.shape(), var6, var7);
   }

   public static boolean UuUVuuUu(
      class_4587 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10
   ) {
      return UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 1.0F);
   }

   public static boolean UuUVuuUu(
      class_4587 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10, float var11
   ) {
      return C00OOC00oO(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void C00OOC00oO(
      class_4587 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10
   ) {
      C00OOC00oO(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 1.0F);
   }

   private static boolean C00OOC00oO(
      class_4587 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10, float var11
   ) {
      class_310 var12 = class_310.method_1551();
      if (var12 != null && var12.method_22683() != null && !(var3 <= 1.0F) && !(var4 <= 1.0F) && !(var11 <= 0.001F)) {
         int var13 = var12.method_22683().method_4489();
         int var14 = var12.method_22683().method_4506();
         if (var13 > 0 && var14 > 0) {
            UnVNvNnU var15 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
            if (UvnvNVnnnnNU <= 0 && var15 != null) {
               try {
                  var15.uUnuvNvvNU();
               } catch (Throwable var32) {
               }
            }

            VVNunVNVuuu.nvnNNunvv var16 = UuUVuuUu(var15, var0, var1, var2, var3, var4);
            float var17 = var16.maxX - var16.minX;
            float var18 = var16.maxY - var16.minY;
            if (!(var17 <= 1.0F) && !(var18 <= 1.0F)) {
               VVNunVNVuuu.VvunVVUvUNnv var19 = new VVNunVNVuuu.VvunVVUvUNnv(var6, var7, var8, var9);
               float var20 = Math.min(var17 / Math.max(var3, 1.0F), var18 / Math.max(var4, 1.0F));
               float var21 = Math.max(0.0F, var5 * var20);
               float var22 = Math.max(0.5F, var19.distance() * var20);
               float var23 = Math.max(1.0F, var19.blur() * var20);
               VVNunVNVuuu.VvunVVUvUNnv var24 = new VVNunVNVuuu.VvunVVUvUNnv(var22, var23, var19.intensity(), var19.shape());
               float var25 = var10 ? Math.max(2.0F, Math.min(18.0F, var22 + var23 * 0.32F)) : Math.max(6.0F, Math.min(96.0F, var22 + var23 * 1.35F));
               float var26 = var16.minX - var25;
               float var27 = var16.minY - var25;
               float var28 = var17 + var25 * 2.0F;
               float var29 = var18 + var25 * 2.0F;
               OO0OCoOC.nvnNNunvv var30 = OO0OCoOC.UuUVuuUu(vVvUvVVuuNvV());
               if (UvnvNVnnnnNU <= 0) {
                  vVvUNNUVVnNn var31 = VVuuUN();
                  return var31 == null
                     ? false
                     : UuUVuuUu(
                        var31,
                        var26,
                        var27,
                        var28,
                        var29,
                        var16.minX,
                        var16.minY,
                        var17,
                        var18,
                        var21,
                        var13,
                        var14,
                        var30,
                        var10,
                        Math.min(1.0F, var11),
                        var24
                     );
               } else if (vNUvnnVnUvu() == null) {
                  return false;
               } else {
                  UuUVuuUu(var26, var27, var28, var29, var16.minX, var16.minY, var17, var18, var21, var13, var14, var30, var10, Math.min(1.0F, var11), var24);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static VVNunVNVuuu.VvunVVUvUNnv UuUVuuUu(float var0, float var1, float var2, String var3) {
      return new VVNunVNVuuu.VvunVVUvUNnv(var0, var1, var2, vVvUvVVuuNvV(var3));
   }

   public static boolean vVvUvVVuuNvV() {
      return vNUvnnVnUvu.uUnuvNvvNU(nuUnNvnuUu());
   }

   public static int UuUVuuUu(float var0) {
      return UuUVuuUu(OO0OCoOC.UuUVuuUu(vVvUvVVuuNvV()).baseColor(), var0);
   }

   public static int C00OOC00oO(float var0) {
      return UuUVuuUu(vVvUvVVuuNvV() ? -14670285 : -591617, var0);
   }

   public static int uUnuvNvvNU(float var0) {
      return UuUVuuUu(vVvUvVVuuNvV() ? -10194811 : -5524281, var0);
   }

   public static boolean UuUVuuUu(class_4587 var0, String var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String var8 = var1 == null ? "" : var1.trim();
      if (var8.isBlank()) {
         return false;
      } else {
         class_310 var9 = class_310.method_1551();
         if (var9 != null && var9.method_22683() != null && !(var4 <= 1.0F) && !(var5 <= 1.0F) && !(var7 <= 0.001F)) {
            int var10 = var9.method_22683().method_4489();
            int var11 = var9.method_22683().method_4506();
            if (var10 > 0 && var11 > 0) {
               VnuVUNUv var12 = uUnuvNvvNU(var8);
               if (var12 != VnuVUNUv.HUD) {
                  return false;
               } else {
                  vVvUNNUVVnNn var13 = vvVvVNN.vVvUvVVuuNvV(var8);
                  NNnUUVVnuUV var14 = uNNnUu.UuUVuuUu().C00OOC00oO(var8);
                  if (var13 != null && var14 != null) {
                     UnVNvNnU var15 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
                     if (var15 != null) {
                        try {
                           var15.uUnuvNvvNU();
                        } catch (Throwable var24) {
                        }
                     }

                     VVNunVNVuuu.nvnNNunvv var16 = UuUVuuUu(var15, var0, var2, var3, var4, var5);
                     float var17 = var16.maxX - var16.minX;
                     float var18 = var16.maxY - var16.minY;
                     if (!(var17 <= 1.0F) && !(var18 <= 1.0F)) {
                        float var19 = Math.min(var17 / Math.max(var4, 1.0F), var18 / Math.max(var5, 1.0F));
                        float var20 = Math.max(0.0F, var6 * var19);
                        float var21 = nNuUNVu.UuUVuuUu().VVuuUN();
                        float var22 = nNuUNVu.UuUVuuUu().vNUvnnVnUvu();
                        NUunUunuNV var23 = uNNnnnuuuN();
                        return UuUVuuUu(
                           var13,
                           var14,
                           uNNnUu.UuUVuuUu().uVUuuVnNVU(var8),
                           var16.minX,
                           var16.minY,
                           var17,
                           var18,
                           var16.minX,
                           var16.minY,
                           var17,
                           var18,
                           var20,
                           var10,
                           var11,
                           var21,
                           var22,
                           var23,
                           Math.min(1.0F, var7)
                        );
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static boolean UuUVuuUu(
      class_4587 var0,
      VnuVUNUv var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      NUunUunuNV var11,
      float var12
   ) {
      if (var1 != null && var1.vVvUvVVuuNvV() == VnuVUNUv.HUD && !(var4 <= 1.0F) && !(var5 <= 1.0F) && var7 > 0 && var8 > 0 && !(var12 <= 0.001F)) {
         UnVNvNnU var13 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var13 != null) {
            try {
               var13.uUnuvNvvNU();
            } catch (Throwable var25) {
            }
         }

         VVNunVNVuuu.nvnNNunvv var14 = UuUVuuUu(var13, var0, var2, var3, var4, var5);
         float var15 = var14.maxX - var14.minX;
         float var16 = var14.maxY - var14.minY;
         if (!(var15 <= 1.0F) && !(var16 <= 1.0F)) {
            float var17 = Math.min(var15 / Math.max(var4, 1.0F), var16 / Math.max(var5, 1.0F));
            float var18 = Math.max(0.0F, var6 * var17);
            float var19 = Math.max(12.0F, Math.min(64.0F, Math.min(var15, var16) * 0.38F));
            float var20 = var14.minX - var19;
            float var21 = var14.minY - var19;
            float var22 = var15 + var19 * 2.0F;
            float var23 = var16 + var19 * 2.0F;
            NUunUunuNV var24 = var11 == null ? uNNnnnuuuN() : var11;
            return uVNnuvnVvvu.UuUVuuUu(
               var1, var20, var21, var22, var23, var14.minX, var14.minY, var15, var16, var18, var7, var8, var9, var10, var24, Math.min(1.0F, var12)
            );
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean UuUVuuUu(
      String var0, int var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, NUunUunuNV var10, float var11
   ) {
      return !uNNnUu.UuUVuuUu().uNNnnnuuuN(var0) ? false : uVNnuvnVvvu.UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void UuUVuuUu(String var0) {
      NuVunNnUvvN.UuUVuuUu().UuUVuuUu(var0);
   }

   private static NUunUunuNV uNNnnnuuuN() {
      NvVNvUvunNNu var0 = nuUnNvnuUu();
      return NUunUunuNV.UuUVuuUu(var0, vNUvnnVnUvu.uUnuvNvvNU(var0));
   }

   private static NvVNvUvunNNu nuUnNvnuUu() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
   }

   private static boolean C00OOC00oO(String var0) {
      return uUnuvNvvNU(var0) == VnuVUNUv.HUD;
   }

   private static VnuVUNUv uUnuvNvvNU(String var0) {
      nuVVnvn var1 = uNNnUu.UuUVuuUu().uUnuvNvvNU(var0);
      return var1 == null ? VnuVUNUv.PREVIEW_ONLY : VnuVUNUv.UuUVuuUu(var1.C00OOC00oO()).vVvUvVVuuNvV();
   }

   private static synchronized vVvUNNUVVnNn VVuuUN() {
      if (UuuNnUvUuv != null) {
         return UuuNnUvUuv;
      } else {
         try {
            UuuNnUvUuv = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/advanced_neumorphism.frag");
            UNnVVNvvnVvU = "";
            return UuuNnUvUuv;
         } catch (Throwable var1) {
            UNnVVNvvnVvU = var1.getMessage() == null ? var1.getClass().getSimpleName() : var1.getMessage();
            UuuNnUvUuv = null;
            vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderApply.acquireNeumorphicProgram", var1);
            throw new IllegalStateException("unreachable shader failure", var1);
         }
      }
   }

   private static synchronized vVvUNNUVVnNn vNUvnnVnUvu() {
      if (nUUVuvU != null) {
         return nUUVuvU;
      } else {
         try {
            nUUVuvU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/advanced_neumorphism_batch.vert", "assets/wild/shaders/advanced_neumorphism_batch.frag");
            int var0 = GL31.glGetUniformBlockIndex(nUUVuvU.uUnuvNvvNU(), "NeumorphicPlateBlock");
            if (var0 >= 0) {
               GL31.glUniformBlockBinding(nUUVuvU.uUnuvNvvNU(), var0, 3);
            }

            if (UnUNVVVNuv == 0) {
               UnUNVVVNuv = GL30.glGenVertexArrays();
            }

            if (vNVuvnUUnuUn == 0) {
               vNVuvnUUnuUn = GL15.glGenBuffers();
               GL15.glBindBuffer(35345, vNVuvnUUnuUn);
               GL15.glBufferData(35345, uVunuUNVVUUV.capacity() * 4L, 35040);
               GL15.glBindBuffer(35345, 0);
            }

            UNnVVNvvnVvU = "";
            return nUUVuvU;
         } catch (Throwable var1) {
            UNnVVNvvnVvU = var1.getMessage() == null ? var1.getClass().getSimpleName() : var1.getMessage();
            nUUVuvU = null;
            vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderApply.acquireNeumorphicBatchProgram", var1);
            throw new IllegalStateException("unreachable shader failure", var1);
         }
      }
   }

   private static void UuUVuuUu(
      float var0,
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
      OO0OCoOC.nvnNNunvv var11,
      boolean var12,
      float var13,
      VVNunVNVuuu.VvunVVUvUNnv var14
   ) {
      if (uVUVnuvnuVuv >= 128) {
         C00OOC00oO();
      }

      VVNunVNVuuu.NVnVnNnN var15 = NVNnnvnuunNv[uVUVnuvnuVuv++];
      var15.UuUVuuUu(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var14.distance(),
         var14.blur(),
         var14.intensity(),
         var14.shape(),
         var12 ? 1 : 0,
         var9,
         var10,
         var11.baseColor(),
         var11.darkShadowColor(),
         var11.lightShadowColor(),
         var13
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void uVUuuVnNVU() {
      vVvUNNUVVnNn var0 = vNUvnnVnUvu();
      if (var0 != null && uVUVnuvnuVuv > 0) {
         int var1 = 0;
         int var2 = 0;

         for (int var3 = 0; var3 < uVUVnuvnuVuv; var3++) {
            var1 = Math.max(var1, NVNnnvnuunNv[var3].vNVuvnUUnuUn);
            var2 = Math.max(var2, NVNnnvnuunNv[var3].UvnvNVnnnnNU);
         }

         if (var1 > 0 && var2 > 0) {
            vuuuNvNuv();
            VvuuVNVUn.NVnVnNnN var11 = VvuuVNVUn.UuUVuuUu();
            boolean var8 = false /* VF: Semaphore variable */;

            label90: {
               try {
                  var8 = true;
                  GL11.glViewport(0, 0, var1, var2);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  var0.UuUVuuUu();
                  UuUVuuUu(var0, "uViewport", var1, var2);
                  UuUVuuUu(var0, "u_LightDirection", -1.0F, -1.0F);
                  GL15.glBindBuffer(35345, vNVuvnUUnuUn);
                  GL15.glBufferSubData(35345, 0L, uVunuUNVVUUV);
                  GL30.glBindBufferBase(35345, 3, vNVuvnUUnuUn);
                  GL30.glBindVertexArray(UnUNVVVNuv);
                  GL31.glDrawArraysInstanced(4, 0, 6, uVUVnuvnuVuv);
                  GL30.glBindVertexArray(0);
                  GL30.glBindBufferBase(35345, 3, 0);
                  GL15.glBindBuffer(35345, 0);
                  var8 = false;
                  break label90;
               } catch (Throwable var9) {
                  UNnVVNvvnVvU = var9.getMessage() == null ? var9.getClass().getSimpleName() : var9.getMessage();
                  vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderApply.drawNeumorphicBatch", var9);
                  var8 = false;
               } finally {
                  if (var8) {
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var11);
                     UuuNnUvUuv();
                  }
               }

               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var11);
               UuuNnUvUuv();
               return;
            }

            GL20.glUseProgram(0);
            VvuuVNVUn.uUnuvNvvNU(var11);
            UuuNnUvUuv();
         }
      }
   }

   private static void vuuuNvNuv() {
      uVunuUNVVUUV.clear();
      short var0 = 128;
      byte var1 = 0;
      int var2 = var0 * 4;
      int var3 = var0 * 8;
      int var4 = var0 * 12;
      int var5 = var0 * 16;
      int var6 = var0 * 20;
      int var7 = var0 * 24;

      for (int var8 = 0; var8 < uVUVnuvnuVuv; var8++) {
         VVNunVNVuuu.NVnVnNnN var9 = NVNnnvnuunNv[var8];
         UuUVuuUu(var1 + var8 * 4, var9.UuUVuuUu, var9.C00OOC00oO, var9.uUnuvNvvNU, var9.vVvUvVVuuNvV);
         UuUVuuUu(var2 + var8 * 4, var9.uNNnnnuuuN, var9.nuUnNvnuUu, var9.VVuuUN, var9.vNUvnnVnUvu);
         UuUVuuUu(var3 + var8 * 4, var9.uVUuuVnNVU, var9.vuuuNvNuv, var9.nvUVNnuu, var9.UuuNnUvUuv);
         UuUVuuUu(var4 + var8 * 4, UuUVuuUu(var9.uVUVnuvnuVuv), C00OOC00oO(var9.uVUVnuvnuVuv), uUnuvNvvNU(var9.uVUVnuvnuVuv), var9.UNnVVNvvnVvU);
         UuUVuuUu(var5 + var8 * 4, UuUVuuUu(var9.NVNnnvnuunNv), C00OOC00oO(var9.NVNnnvnuunNv), uUnuvNvvNU(var9.NVNnnvnuunNv), vVvUvVVuuNvV(var9.NVNnnvnuunNv));
         UuUVuuUu(var6 + var8 * 4, UuUVuuUu(var9.uVunuUNVVUUV), C00OOC00oO(var9.uVunuUNVVUUV), uUnuvNvvNU(var9.uVunuUNVVUUV), vVvUvVVuuNvV(var9.uVunuUNVVUUV));
         UuUVuuUu(var7 + var8 * 4, var9.nUUVuvU, var9.UnUNVVVNuv, 0.0F, 0.0F);
      }

      uVunuUNVVUUV.position(0);
      uVunuUNVVUUV.limit(uVunuUNVVUUV.capacity());
   }

   private static void UuUVuuUu(int var0, float var1, float var2, float var3, float var4) {
      uVunuUNVVUUV.put(var0, var1);
      uVunuUNVVUUV.put(var0 + 1, var2);
      uVunuUNVVUUV.put(var0 + 2, var3);
      uVunuUNVVUUV.put(var0 + 3, var4);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean UuUVuuUu(
      vVvUNNUVVnNn var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      OO0OCoOC.nvnNNunvv var12,
      boolean var13,
      float var14,
      VVNunVNVuuu.VvunVVUvUNnv var15
   ) {
      nnUnNnuvvN var16 = uVvVnUU.UuUVuuUu().C00OOC00oO();
      if (var0 != null && var16 != null && var12 != null) {
         VvuuVNVUn.NVnVnNnN var17 = VvuuVNVUn.UuUVuuUu();
         boolean var22 = false /* VF: Semaphore variable */;

         boolean var18;
         try {
            var22 = true;
            GL11.glViewport(0, 0, var10, var11);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDepthMask(false);
            GlStateManager._enableBlend();
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL11.glDisable(36281);
            var0.UuUVuuUu();
            UuUVuuUu(var0, "uViewport", var10, var11);
            UuUVuuUu(var0, "uRect", var1, var2, var3, var4);
            UuUVuuUu(var0, "u_ElementRect", var5, var6, var7, var8);
            UuUVuuUu(var0, "u_Resolution", Math.max(1.0F, (float)var10), Math.max(1.0F, (float)var11));
            UuUVuuUu(var0, "u_Radius", Math.max(0.0F, var9));
            UuUVuuUu(var0, "u_ElementRadius", Math.max(0.0F, var9));
            UuUVuuUu(var0, "u_BaseColor", UuUVuuUu(var12.baseColor()), C00OOC00oO(var12.baseColor()), uUnuvNvvNU(var12.baseColor()));
            UuUVuuUu(var0, "u_LightShadowColor", UuUVuuUu(var12.lightShadowColor()), C00OOC00oO(var12.lightShadowColor()), uUnuvNvvNU(var12.lightShadowColor()));
            UuUVuuUu(var0, "u_DarkShadowColor", UuUVuuUu(var12.darkShadowColor()), C00OOC00oO(var12.darkShadowColor()), uUnuvNvvNU(var12.darkShadowColor()));
            UuUVuuUu(var0, "u_LightShadowAlpha", vVvUvVVuuNvV(var12.lightShadowColor()));
            UuUVuuUu(var0, "u_DarkShadowAlpha", vVvUvVVuuNvV(var12.darkShadowColor()));
            UuUVuuUu(var0, "u_Alpha", var14);
            UuUVuuUu(var0, "u_Inset", var13 ? 1 : 0);
            UuUVuuUu(var0, "u_Distance", var15.distance());
            UuUVuuUu(var0, "u_Blur", var15.blur());
            UuUVuuUu(var0, "u_Intensity", var15.intensity());
            UuUVuuUu(var0, "u_ShapeType", var15.shape());
            UuUVuuUu(var0, "u_Shape", var15.shape());
            UuUVuuUu(var0, "u_LightDirection", -1.0F, -1.0F);
            var16.UuUVuuUu();
            var18 = true;
            var22 = false;
         } catch (Throwable var23) {
            UNnVVNvvnVvU = var23.getMessage() == null ? var23.getClass().getSimpleName() : var23.getMessage();
            vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderApply.drawNeumorphicProgram", var23);
            throw new IllegalStateException("unreachable shader failure", var23);
         } finally {
            if (var22) {
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var17);
               UuuNnUvUuv();
            }
         }

         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var17);
         UuuNnUvUuv();
         return var18;
      } else {
         return false;
      }
   }

   private static VVNunVNVuuu.VvunVVUvUNnv nvUVNnuu() {
      try {
         nNuUNVu.uunvUUVnuNn var0 = nNuUNVu.UuUVuuUu().UuUVuuUu;
         return UuUVuuUu(var0.vVvUvVVuuNvV.uUnuvNvvNU(), var0.uNNnnnuuuN.uUnuvNvvNU(), var0.nuUnNvnuUu.uUnuvNvvNU(), var0.VVuuUN.uUnuvNvvNU());
      } catch (Throwable var1) {
         return new VVNunVNVuuu.VvunVVUvUNnv(5.5F, 18.0F, 0.72F, 1);
      }
   }

   private static int vVvUvVVuuNvV(String var0) {
      if ("Вогнутая".equals(var0)) {
         return 2;
      } else {
         return "Выпуклая".equals(var0) ? 1 : 0;
      }
   }

   private static boolean UuUVuuUu(
      vVvUNNUVVnNn var0,
      NNnUUVVnuUV var1,
      Map<String, float[]> var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      int var13,
      float var14,
      float var15,
      NUunUunuNV var16,
      float var17
   ) {
      nnUnNnuvvN var18 = uVvVnUU.UuUVuuUu().C00OOC00oO();
      if (var0 != null && var1 != null && var18 != null) {
         VvuuVNVUn.NVnVnNnN var19 = VvuuVNVUn.UuUVuuUu();

         boolean var24;
         try {
            GL11.glViewport(0, 0, var12, var13);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDepthMask(false);
            GlStateManager._enableBlend();
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL11.glDisable(36281);
            var0.UuUVuuUu();
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, uVvVnUU.UuUVuuUu().uNNnnnuuuN());
            UuUVuuUu(var0, "u_DiffuseMap", 0);
            UuUVuuUu(var0, "uViewport", var12, var13);
            UuUVuuUu(var0, "uRect", var3, var4, var5, var6);
            UuUVuuUu(var0, "u_ElementRect", var7, var8, var9, var10);
            UuUVuuUu(var0, "u_ElementRadius", Math.max(0.0F, var11));
            UuUVuuUu(var0, "u_GlobalUV", var7 / Math.max(1.0F, (float)var12), var8 / Math.max(1.0F, (float)var13));
            UuUVuuUu(var0, "u_Resolution", Math.max(1.0F, (float)var12), Math.max(1.0F, (float)var13));
            UuUVuuUu(var0, "u_Time", uVvVnUU.UuUVuuUu().uUnuvNvvNU());
            UuUVuuUu(var0, "u_Mouse", var14 - var7, var15 - var8);
            int var20 = var16 == null ? -1 : var16.uVunuUNVVUUV();
            int var21 = var16 == null ? -16777216 : var16.UNnVVNvvnVvU();
            int var22 = var16 == null ? -15724520 : var16.nuUnNvnuUu();
            int var23 = var16 == null ? -14671832 : var16.VVuuUN();
            UuUVuuUu(var0, "u_AccentTop", UuUVuuUu(var20), C00OOC00oO(var20), uUnuvNvvNU(var20));
            UuUVuuUu(var0, "u_AccentBottom", UuUVuuUu(var21), C00OOC00oO(var21), uUnuvNvvNU(var21));
            UuUVuuUu(var0, "u_ThemeColors[0]", UuUVuuUu(var22), C00OOC00oO(var22), uUnuvNvvNU(var22), vVvUvVVuuNvV(var22));
            UuUVuuUu(var0, "u_ThemeColors[1]", UuUVuuUu(var23), C00OOC00oO(var23), uUnuvNvvNU(var23), vVvUvVVuuNvV(var23));
            UuUVuuUu(var0, "u_ThemeColors[2]", UuUVuuUu(var20), C00OOC00oO(var20), uUnuvNvvNU(var20), var17);
            UuUVuuUu(var0, "u_ThemeColors[3]", UuUVuuUu(var21), C00OOC00oO(var21), uUnuvNvvNU(var21), var17);
            UuUVuuUu(var0, "u_Alpha", var17);
            UuUVuuUu(var0, var1, var2);
            var18.UuUVuuUu();
            var24 = true;
         } catch (Throwable var28) {
            vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderApply.drawHudProgram", var28);
            throw new IllegalStateException("unreachable shader failure", var28);
         } finally {
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            VvuuVNVUn.uUnuvNvvNU(var19);
            UuuNnUvUuv();
         }

         return var24;
      } else {
         return false;
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2) {
      int var3 = var0.UuUVuuUu(var1);
      if (var3 >= 0) {
         GL20.glUniform1f(var3, var2);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, int var2) {
      int var3 = var0.UuUVuuUu(var1);
      if (var3 >= 0) {
         GL20.glUniform1i(var3, var2);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3) {
      int var4 = var0.UuUVuuUu(var1);
      if (var4 >= 0) {
         GL20.glUniform2f(var4, var2, var3);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3, float var4) {
      int var5 = var0.UuUVuuUu(var1);
      if (var5 >= 0) {
         GL20.glUniform3f(var5, var2, var3, var4);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3, float var4, float var5) {
      int var6 = var0.UuUVuuUu(var1);
      if (var6 >= 0) {
         GL20.glUniform4f(var6, var2, var3, var4, var5);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, NNnUUVVnuUV var1, Map<String, float[]> var2) {
      if (var0 != null && var1 != null && !var1.exposedUniforms().isEmpty()) {
         for (ccCoCoOCocoo var4 : var1.exposedUniforms()) {
            float[] var5 = var2 == null ? null : (float[])var2.get(var4.uniformName());
            if (var5 == null || var5.length == 0) {
               var5 = var4.defaults();
            }

            if (var4.kind() == ccCoCoOCocoo.NVnVnNnN.FLOAT) {
               UuUVuuUu(var0, var4.uniformName(), var5[0]);
            } else {
               float var6 = var5.length > 0 ? var5[0] : 0.0F;
               float var7 = var5.length > 1 ? var5[1] : 0.0F;
               float var8 = var5.length > 2 ? var5[2] : 0.0F;
               float var9 = var5.length > 3 ? var5[3] : 1.0F;
               UuUVuuUu(var0, var4.uniformName(), var6, var7, var8, var9);
            }
         }
      }
   }

   private static void UuuNnUvUuv() {
      GL20.glUseProgram(0);
      if (!Boolean.FALSE.equals(uVUuuVnNVU)) {
         try {
            if (uVUuuVnNVU == null) {
               Class var0 = Class.forName("com.mojang.blaze3d.systems.RenderSystem");
               Class var1 = Class.forName("net.minecraft.client.render.GameRenderer");
               vuuuNvNuv = var0.getMethod("setShader", Supplier.class);
               nvUVNnuu = var1.getMethod("getPositionColorProgram");
               uVUuuVnNVU = true;
            }

            Supplier var3 = () -> {
               try {
                  return nvUVNnuu.invoke(null);
               } catch (Throwable var1x) {
                  return null;
               }
            };
            vuuuNvNuv.invoke(null, var3);
         } catch (Throwable var2) {
            uVUuuVnNVU = false;
         }
      }
   }

   private static float UuUVuuUu(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static float vVvUvVVuuNvV(int var0) {
      return (var0 >>> 24 & 0xFF) / 255.0F;
   }

   private static int UuUVuuUu(int var0, float var1) {
      int var2 = Math.max(0, Math.min(255, Math.round(var1 * 255.0F)));
      return var0 & 16777215 | var2 << 24;
   }

   private static VVNunVNVuuu.nvnNNunvv UuUVuuUu(UnVNvNnU var0, class_4587 var1, float var2, float var3, float var4, float var5) {
      float[] var6 = var0 == null ? null : var0.nvUVNnuu().uNNnnnuuuN();
      Matrix4f var7 = var1 == null ? null : new Matrix4f(var1.method_23760().method_23761());
      float var10 = var2 + var4;
      float var11 = var3 + var5;
      VVNunVNVuuu.uunvUUVnuNn var12 = UuUVuuUu(var6, var7, var2, var3);
      VVNunVNVuuu.uunvUUVnuNn var13 = UuUVuuUu(var6, var7, var10, var3);
      VVNunVNVuuu.uunvUUVnuNn var14 = UuUVuuUu(var6, var7, var10, var11);
      VVNunVNVuuu.uunvUUVnuNn var15 = UuUVuuUu(var6, var7, var2, var11);
      float var16 = Math.min(Math.min(var12.x, var13.x), Math.min(var14.x, var15.x));
      float var17 = Math.min(Math.min(var12.y, var13.y), Math.min(var14.y, var15.y));
      float var18 = Math.max(Math.max(var12.x, var13.x), Math.max(var14.x, var15.x));
      float var19 = Math.max(Math.max(var12.y, var13.y), Math.max(var14.y, var15.y));
      return new VVNunVNVuuu.nvnNNunvv(var16, var17, var18, var19);
   }

   private static VVNunVNVuuu.uunvUUVnuNn UuUVuuUu(float[] var0, Matrix4f var1, float var2, float var3) {
      float var4 = var0 != null && var0.length >= 6 ? var0[0] * var2 + var0[1] * var3 + var0[2] : var2;
      float var5 = var0 != null && var0.length >= 6 ? var0[3] * var2 + var0[4] * var3 + var0[5] : var3;
      if (var1 != null) {
         Vector4f var6 = var1.transform(new Vector4f(var4, var5, 0.0F, 1.0F));
         float var7 = Math.abs(var6.w) <= 1.0E-6F ? 1.0F : 1.0F / var6.w;
         var4 = var6.x * var7;
         var5 = var6.y * var7;
      }

      return new VVNunVNVuuu.uunvUUVnuNn(var4, var5);
   }

   static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   private static VVNunVNVuuu.NVnVnNnN[] nUUVuvU() {
      VVNunVNVuuu.NVnVnNnN[] var0 = new VVNunVNVuuu.NVnVnNnN[128];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = new VVNunVNVuuu.NVnVnNnN();
      }

      return var0;
   }

   static final class NVnVnNnN {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
      float vuuuNvNuv;
      float nvUVNnuu;
      float UuuNnUvUuv;
      float nUUVuvU;
      float UnUNVVVNuv;
      int vNVuvnUUnuUn;
      int UvnvNVnnnnNU;
      int uVUVnuvnuVuv;
      int NVNnnvnuunNv;
      int uVunuUNVVUUV;
      float UNnVVNvvnVvU;

      void UuUVuuUu(
         float var1,
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
         int var13,
         int var14,
         int var15,
         int var16,
         int var17,
         int var18,
         int var19,
         float var20
      ) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
         this.vuuuNvNuv = var10;
         this.nvUVNnuu = var11;
         this.UuuNnUvUuv = var12;
         this.nUUVuvU = var13;
         this.UnUNVVVNuv = var14;
         this.vNVuvnUUnuUn = var15;
         this.UvnvNVnnnnNU = var16;
         this.uVUVnuvnuVuv = var17;
         this.NVNnnvnuunNv = var18;
         this.uVunuUNVVUUV = var19;
         this.UNnVVNvvnVvU = var20;
      }
   }

   public record VvunVVUvUNnv(float distance, float blur, float intensity, int shape) {
      public VvunVVUvUNnv(float distance, float blur, float intensity, int shape) {
         distance = VVNunVNVuuu.UuUVuuUu(distance, 1.0F, 36.0F);
         blur = VVNunVNVuuu.UuUVuuUu(blur, 2.0F, 96.0F);
         intensity = VVNunVNVuuu.UuUVuuUu(intensity, 0.0F, 1.4F);
         shape = Math.max(0, Math.min(2, shape));
         this.distance = distance;
         this.blur = blur;
         this.intensity = intensity;
         this.shape = shape;
      }
   }

   record nvnNNunvv(float minX, float minY, float maxX, float maxY) {
   }

   record uunvUUVnuNn(float x, float y) {
   }
}
