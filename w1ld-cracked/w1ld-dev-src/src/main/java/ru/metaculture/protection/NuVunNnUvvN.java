package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class NuVunNnUvvN {
   private static final NuVunNnUvvN UuUVuuUu = new NuVunNnUvvN();
   private final Map<String, NuVunNnUvvN.NVnVnNnN> C00OOC00oO = new HashMap<>();
   private oo0OOO00o0O uUnuvNvvNU;
   private nvvuUNnNvN vVvUvVVuuNvV;

   private NuVunNnUvvN() {
   }

   public static NuVunNnUvvN UuUVuuUu() {
      return UuUVuuUu;
   }

   public synchronized void UuUVuuUu(oo0OOO00o0O var1, nvvuUNnNvN var2) {
      this.uUnuvNvvNU = var1;
      this.vVvUvVVuuNvV = var2;
   }

   public synchronized boolean UuUVuuUu(
      String var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, NUunUunuNV var10, float var11
   ) {
      return this.UuUVuuUu(var1, null, var2, var3, var4, var5, var2, var3, var4, var5, 0.0F, var6, var7, var8, var9, var10, var11);
   }

   public synchronized boolean UuUVuuUu(
      String var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      float var13,
      float var14,
      NUunUunuNV var15,
      float var16
   ) {
      return this.UuUVuuUu(var1, VnuVUNUv.HUD, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   private boolean UuUVuuUu(
      String var1,
      VnuVUNUv var2,
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
      if (var1 == null || var1.isBlank() || this.uUnuvNvvNU == null || this.vVvUvVVuuNvV == null) {
         return false;
      } else if (!(var5 <= 1.0F) && !(var6 <= 1.0F) && !(var9 <= 1.0F) && !(var10 <= 1.0F) && !(var17 <= 0.001F)) {
         NuVunNnUvvN.NVnVnNnN var18 = this.UuUVuuUu(var1, var2);
         if (var18 != null && var18.uUnuvNvvNU != null) {
            nnUnNnuvvN var19 = uVvVnUU.UuUVuuUu().C00OOC00oO();
            if (var19 == null) {
               return false;
            } else {
               VvuuVNVUn.NVnVnNnN var20 = VvuuVNVUn.UuUVuuUu();

               boolean var25;
               try {
                  GL11.glViewport(0, 0, var12, var13);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  var18.uUnuvNvvNU.UuUVuuUu();
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, uVvVnUU.UuUVuuUu().uNNnnnuuuN());
                  UuUVuuUu(var18.uUnuvNvvNU, "u_DiffuseMap", 0);
                  UuUVuuUu(var18.uUnuvNvvNU, "uViewport", var12, var13);
                  UuUVuuUu(var18.uUnuvNvvNU, "uRect", var3, var4, var5, var6);
                  UuUVuuUu(var18.uUnuvNvvNU, "u_ElementRect", var7, var8, var9, var10);
                  UuUVuuUu(var18.uUnuvNvvNU, "u_ElementRadius", Math.max(0.0F, var11));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_Time", uVvVnUU.UuUVuuUu().uUnuvNvvNU());
                  UuUVuuUu(var18.uUnuvNvvNU, "u_Resolution", Math.max(1.0F, (float)var12), Math.max(1.0F, (float)var13));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_GlobalUV", var7 / Math.max(1.0F, (float)var12), var8 / Math.max(1.0F, (float)var13));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_Mouse", var14 - var7, var15 - var8);
                  int var21 = var16 == null ? -1 : var16.uVunuUNVVUUV();
                  int var22 = var16 == null ? -16777216 : var16.UNnVVNvvnVvU();
                  int var23 = var16 == null ? -15724520 : var16.nuUnNvnuUu();
                  int var24 = var16 == null ? -14671832 : var16.VVuuUN();
                  UuUVuuUu(var18.uUnuvNvvNU, "u_AccentTop", UuUVuuUu(var21), C00OOC00oO(var21), uUnuvNvvNU(var21));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_AccentBottom", UuUVuuUu(var22), C00OOC00oO(var22), uUnuvNvvNU(var22));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_ThemeColors[0]", UuUVuuUu(var23), C00OOC00oO(var23), uUnuvNvvNU(var23), vVvUvVVuuNvV(var23));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_ThemeColors[1]", UuUVuuUu(var24), C00OOC00oO(var24), uUnuvNvvNU(var24), vVvUvVVuuNvV(var24));
                  UuUVuuUu(var18.uUnuvNvvNU, "u_ThemeColors[2]", UuUVuuUu(var21), C00OOC00oO(var21), uUnuvNvvNU(var21), var17);
                  UuUVuuUu(var18.uUnuvNvvNU, "u_ThemeColors[3]", UuUVuuUu(var22), C00OOC00oO(var22), uUnuvNvvNU(var22), var17);
                  UuUVuuUu(var18.uUnuvNvvNU, "u_Alpha", var17);
                  UuUVuuUu(var18.uUnuvNvvNU, var18.C00OOC00oO);
                  var19.UuUVuuUu();
                  var25 = true;
               } catch (Throwable var29) {
                  vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("NamedThemeCache.draw:" + var1, var29);
                  throw new IllegalStateException("unreachable shader failure", var29);
               } finally {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  VvuuVNVUn.uUnuvNvvNU(var20);
               }

               return var25;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public synchronized void UuUVuuUu(String var1) {
      if (var1 != null) {
         String var2 = var1.trim();
         this.C00OOC00oO.entrySet().removeIf(var1x -> {
            String var2x = var1x.getKey();
            boolean var3x = var2x.equals(var2) || var2x.startsWith(var2 + "#");
            if (var3x && var1x.getValue() != null && var1x.getValue().uUnuvNvvNU != null) {
               var1x.getValue().uUnuvNvvNU.C00OOC00oO();
               var1x.getValue().uUnuvNvvNU = null;
            }

            return var3x;
         });
         VUvUNNUvvNVN var3 = lllilIiI11l.UuUVuuUu()
            .C00OOC00oO()
            .stream()
            .filter(var1x -> var2.equals(var1x.C00OOC00oO()) || var2.equals(var1x.UuUVuuUu()))
            .findFirst()
            .orElse(null);
         if (var3 != null && !var3.UuUVuuUu().equals(var2)) {
            String var4 = var3.UuUVuuUu();
            this.C00OOC00oO.entrySet().removeIf(var1x -> {
               String var2x = var1x.getKey();
               boolean var3x = var2x.equals(var4) || var2x.startsWith(var4 + "#");
               if (var3x && var1x.getValue() != null && var1x.getValue().uUnuvNvvNU != null) {
                  var1x.getValue().uUnuvNvvNU.C00OOC00oO();
                  var1x.getValue().uUnuvNvvNU = null;
               }

               return var3x;
            });
         }
      }
   }

   public synchronized void C00OOC00oO() {
      for (NuVunNnUvvN.NVnVnNnN var2 : this.C00OOC00oO.values()) {
         if (var2.uUnuvNvvNU != null) {
            var2.uUnuvNvvNU.C00OOC00oO();
            var2.uUnuvNvvNU = null;
         }
      }

      this.C00OOC00oO.clear();
   }

   private NuVunNnUvvN.NVnVnNnN UuUVuuUu(String var1, VnuVUNUv var2) {
      VUvUNNUvvNVN var3 = lllilIiI11l.UuUVuuUu()
         .C00OOC00oO()
         .stream()
         .filter(var1x -> var1.equals(var1x.UuUVuuUu()) || var1.equals(var1x.C00OOC00oO()))
         .findFirst()
         .orElse(null);
      if (var3 == null) {
         return null;
      } else {
         String var4 = var2 == null ? var3.UuUVuuUu() : var3.UuUVuuUu() + "#" + var2.UuUVuuUu();
         NuVunNnUvvN.NVnVnNnN var5 = this.C00OOC00oO.get(var4);
         String var6 = var2 == null ? var3.vVvUvVVuuNvV() : var3.vVvUvVVuuNvV() + "#" + var2.UuUVuuUu();
         if (var5 != null && var5.UuUVuuUu != null && var5.UuUVuuUu.equals(var6) && var5.uUnuvNvvNU != null) {
            return var5;
         } else {
            try {
               nuVVnvn var7 = VnnVNVNVUnnn.UuUVuuUu(var3.vVvUvVVuuNvV(), this.vVvUvVVuuNvV);
               if (var2 != null) {
                  var7.UuUVuuUu(var2.UuUVuuUu());
               }

               NNnUUVVnuUV var8 = this.uUnuvNvvNU.UuUVuuUu(var7);
               if (var5 != null && var5.uUnuvNvvNU != null) {
                  var5.uUnuvNvvNU.C00OOC00oO();
                  var5.uUnuvNvvNU = null;
               }

               if (var5 == null) {
                  var5 = new NuVunNnUvvN.NVnVnNnN();
                  this.C00OOC00oO.put(var4, var5);
               }

               var5.UuUVuuUu = var6;
               var5.C00OOC00oO = var8;
               var5.uUnuvNvvNU = new vVvUNNUVVnNn(UvnUNnnVnu.UuUVuuUu("assets/wild/shaders/mainmenu/menu_quad.vert"), var8.fragmentSource());
               var5.vVvUvVVuuNvV = var8.error();
               return var5;
            } catch (Throwable var9) {
               if (var5 == null) {
                  var5 = new NuVunNnUvvN.NVnVnNnN();
                  this.C00OOC00oO.put(var3.UuUVuuUu(), var5);
               }

               var5.vVvUvVVuuNvV = var9.getMessage() == null ? var9.getClass().getSimpleName() : var9.getMessage();
               var5.uUnuvNvvNU = null;
               var5.C00OOC00oO = null;
               vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("NamedThemeCache.compile:" + var3.UuUVuuUu(), var9);
               throw new IllegalStateException("unreachable shader failure", var9);
            }
         }
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

   private static void UuUVuuUu(vVvUNNUVVnNn var0, NNnUUVVnuUV var1) {
      if (var0 != null && var1 != null && !var1.exposedUniforms().isEmpty()) {
         for (ccCoCoOCocoo var3 : var1.exposedUniforms()) {
            float[] var4 = var3.defaults();
            if (var3.kind() == ccCoCoOCocoo.NVnVnNnN.FLOAT) {
               UuUVuuUu(var0, var3.uniformName(), var4[0]);
            } else {
               float var5 = var4.length > 0 ? var4[0] : 0.0F;
               float var6 = var4.length > 1 ? var4[1] : 0.0F;
               float var7 = var4.length > 2 ? var4[2] : 0.0F;
               float var8 = var4.length > 3 ? var4[3] : 1.0F;
               UuUVuuUu(var0, var3.uniformName(), var5, var6, var7, var8);
            }
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

   static final class NVnVnNnN {
      String UuUVuuUu = "";
      NNnUUVVnuUV C00OOC00oO;
      vVvUNNUVVnNn uUnuvNvvNU;
      String vVvUvVVuuNvV = "";
   }
}
