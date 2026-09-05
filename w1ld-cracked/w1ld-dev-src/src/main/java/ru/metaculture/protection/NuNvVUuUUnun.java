package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1011;
import net.minecraft.class_10192;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_10444;
import net.minecraft.class_1058;
import net.minecraft.class_1059;
import net.minecraft.class_10868;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_5819;
import net.minecraft.class_7764;
import net.minecraft.class_8053;
import net.minecraft.class_811;
import net.minecraft.class_8685;
import net.minecraft.class_9296;
import net.minecraft.class_9334;

public final class NuNvVUuUUnun {
   private static final class_310 UuUVuuUu = class_310.method_1551();
   private static final class_10444 C00OOC00oO = new class_10444();
   private static final class_5819 uUnuvNvvNU = class_5819.method_43049(0L);
   private static final String[] vVvUvVVuuNvV = C00OOC00oO();
   private static final Set<Integer> uNNnnnuuuN = ConcurrentHashMap.newKeySet();
   private static final Map<String, NuNvVUuUUnun.NVnVnNnN> nuUnNvnuUu = new ConcurrentHashMap<>();
   private static final long VVuuUN = 5000L;
   private static Field vNUvnnVnUvu;

   private NuNvVUuUUnun() {
   }

   public static void UuUVuuUu(class_332 var0, class_1799 var1, float var2, float var3, float var4, int var5, boolean var6) {
      UuUVuuUu(var0, UuUVuuUu.field_1724, var1, var2, var3, var4, var5, var6);
   }

   public static void UuUVuuUu(class_332 var0, class_1657 var1, class_1799 var2, float var3, float var4, float var5, int var6, boolean var7) {
      Object var8 = var1 != null ? var1 : UuUVuuUu.field_1724;
      if (var0 != null && var8 != null && var2 != null && !var2.method_7960()) {
         float var9 = UuUVuuUu.method_22683().method_4495();
         float var10 = UuUVuuUu(var3);
         float var11 = UuUVuuUu(var4);
         float var12 = uUnuvNvvNU(var5);
         var0.method_51448().pushMatrix();
         var0.method_51448().translate(var10 / var9, var11 / var9);
         var0.method_51448().scale(var12 / var9, var12 / var9);
         var0.method_51423((class_1309)var8, var2, 0, 0, var6);
         if (var7) {
            var0.method_51431(UuUVuuUu.field_1772, var2, 0, 0);
         }

         var0.method_51448().popMatrix();
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_1799 var1, float var2, float var3, float var4, int var5, boolean var6, int var7) {
      if (var0 != null && UuUVuuUu.field_1724 != null && var1 != null && !var1.method_7960()) {
         if (UuUVuuUu(var0, var1, var2, var3, var4)) {
            if (var6) {
               C00OOC00oO(var0, var1, var2, var3, var4);
            }
         } else {
            try {
               C00OOC00oO.method_65605();
               UuUVuuUu.method_65386().method_65598(C00OOC00oO, var1, class_811.field_4317, UuUVuuUu.field_1687, UuUVuuUu.field_1724, var5);
               uUnuvNvvNU.method_43052(var5);
               class_1058 var8 = C00OOC00oO.method_65603(uUnuvNvvNU);
               if (var8 == null) {
                  return;
               }

               class_1044 var9 = UuUVuuUu.method_1531().method_4619(var8.method_45852());
               if (var9 == null || !(var9.method_68004() instanceof class_10868 var10 && var10.method_68427() > 0)) {
                  return;
               }

               var0.UuUVuuUu(
                  var10.method_68427(),
                  var2,
                  var3,
                  16.0F * var4,
                  16.0F * var4,
                  var8.method_4594(),
                  var8.method_4593(),
                  var8.method_4577(),
                  var8.method_4575(),
                  Math.max(2.0F, 4.0F * var4)
               );
               UuUVuuUu(var0, var1, var8.method_45852(), var10, var2, var3, var4);
            } catch (Throwable var12) {
            }

            if (var6) {
               C00OOC00oO(var0, var1, var2, var3, var4);
            }
         }
      }
   }

   public static int[] UuUVuuUu(class_1799 var0, int var1) {
      if (var0 != null && !var0.method_7960() && UuUVuuUu.field_1724 != null) {
         long var2 = System.currentTimeMillis();
         String var4 = uUnuvNvvNU(var0, var1);
         NuNvVUuUUnun.NVnVnNnN var5 = nuUnNvnuUu.get(var4);
         if (var5 != null && var2 - var5.createdAt <= 5000L) {
            return UuUVuuUu(var5.colors);
         } else {
            int[] var6 = UuUVuuUu(var0);
            if (var6 == null) {
               var6 = C00OOC00oO(var0, var1);
            }

            nuUnNvnuUu.put(var4, new NuNvVUuUUnun.NVnVnNnN(UuUVuuUu(var6), var2));
            return var6;
         }
      } else {
         return null;
      }
   }

   public static int[] UuUVuuUu() {
      return new int[]{UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(220, 255, 245, 255), UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(142, 226, 255, 255)};
   }

   private static int[] C00OOC00oO(class_1799 var0, int var1) {
      try {
         C00OOC00oO.method_65605();
         UuUVuuUu.method_65386().method_65598(C00OOC00oO, var0, class_811.field_4317, UuUVuuUu.field_1687, UuUVuuUu.field_1724, var1);
         uUnuvNvvNU.method_43052(var1);
         class_1058 var2 = C00OOC00oO.method_65603(uUnuvNvvNU);
         if (var2 == null) {
            return null;
         } else {
            class_1011 var3 = UuUVuuUu(var2.method_45851());
            if (var3 == null) {
               return null;
            } else {
               int var4 = Math.min(var2.method_45851().method_45807(), var3.method_4307());
               int var5 = Math.min(var2.method_45851().method_45815(), var3.method_4323());
               return UuUVuuUu(var3, 0, 0, var4, var5);
            }
         }
      } catch (Throwable var6) {
         return null;
      }
   }

   private static int[] UuUVuuUu(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8575)) {
         return null;
      } else {
         try {
            class_9296 var1 = (class_9296)var0.method_58694(class_9334.field_49617);
            if (var1 == null) {
               return null;
            } else {
               class_8685 var2 = UuUVuuUu.method_1582().method_52862(var1.comp_2413());
               if (var2 != null && var2.comp_1626() != null) {
                  if (UuUVuuUu.method_1531().method_4619(var2.comp_1626()) instanceof class_1043 var4) {
                     class_1011 var5 = var4.method_4525();
                     if (var5 != null && var5.method_4307() >= 16 && var5.method_4323() >= 16) {
                        int[] var6 = UuUVuuUu(var5, 8, 8, 8, 8);
                        int[] var7 = var5.method_4307() >= 48 ? UuUVuuUu(var5, 40, 8, 8, 8) : null;
                        return UuUVuuUu(var6, var7);
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               } else {
                  return null;
               }
            }
         } catch (Throwable var8) {
            return null;
         }
      }
   }

   private static boolean UuUVuuUu(UnVNvNnU var0, class_1799 var1, float var2, float var3, float var4) {
      if (!var1.method_31574(class_1802.field_8575)) {
         return false;
      } else {
         try {
            class_9296 var5 = (class_9296)var1.method_58694(class_9334.field_49617);
            if (var5 == null) {
               return false;
            } else {
               class_8685 var6 = UuUVuuUu.method_1582().method_52862(var5.comp_2413());
               if (var6 != null && var6.comp_1626() != null) {
                  class_1044 var7 = UuUVuuUu.method_1531().method_4619(var6.comp_1626());
                  if (var7 != null && var7.method_68004() instanceof class_10868 var8 && var8.method_68427() > 0) {
                     float var13 = 16.0F * var4;
                     float var10 = Math.max(2.0F, 4.0F * var4);
                     int var11 = var8.method_68427();
                     var0.UuUVuuUu(var11, var2, var3, var13, var13, 0.125F, 0.125F, 0.25F, 0.25F, var10);
                     var0.UuUVuuUu(var11, var2, var3, var13, var13, 0.625F, 0.125F, 0.75F, 0.25F, var10);
                     return true;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            }
         } catch (Throwable var12) {
            return false;
         }
      }
   }

   private static class_1011 UuUVuuUu(class_7764 var0) {
      if (var0 == null) {
         return null;
      } else {
         try {
            Field var1 = vNUvnnVnUvu;
            if (var1 == null) {
               for (Field var5 : class_7764.class.getDeclaredFields()) {
                  if (var5.getType() == class_1011.class) {
                     var1 = var5;
                     break;
                  }
               }

               if (var1 == null) {
                  return null;
               }

               var1.setAccessible(true);
               vNUvnnVnUvu = var1;
            }

            return var1.get(var0) instanceof class_1011 var8 ? var8 : null;
         } catch (Throwable var6) {
            return null;
         }
      }
   }

   private static int[] UuUVuuUu(class_1011 var0, int var1, int var2, int var3, int var4) {
      if (var0 != null && var3 > 0 && var4 > 0) {
         NuNvVUuUUnun.nvnNNunvv[] var5 = new NuNvVUuUUnun.nvnNNunvv[24];

         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6] = new NuNvVUuUUnun.nvnNNunvv();
         }

         int var19 = Math.min(var0.method_4307(), var1 + var3);
         int var7 = Math.min(var0.method_4323(), var2 + var4);

         for (int var8 = Math.max(0, var2); var8 < var7; var8++) {
            for (int var9 = Math.max(0, var1); var9 < var19; var9++) {
               int var10 = var0.method_61940(var9, var8);
               int var11 = var10 >>> 24 & 0xFF;
               if (var11 >= 40) {
                  int var12 = var10 >>> 16 & 0xFF;
                  int var13 = var10 >>> 8 & 0xFF;
                  int var14 = var10 & 0xFF;
                  float[] var15 = Color.RGBtoHSB(var12, var13, var14, null);
                  if (!(var15[2] < 0.09F)) {
                     float var16 = var15[1];
                     float var17 = var11 / 255.0F * (0.25F + var16 * 1.9F) * (0.35F + var15[2]);
                     if (var16 < 0.08F) {
                        var17 *= 0.2F;
                     }

                     int var18 = Math.min(var5.length - 1, (int)(var15[0] * var5.length));
                     var5[var18].UuUVuuUu(var12, var13, var14, var17);
                  }
               }
            }
         }

         int var20 = UuUVuuUu(var5, -1);
         if (var20 >= 0 && !(var5[var20].vVvUvVVuuNvV < 0.75F)) {
            int var21 = UuUVuuUu(var5, var20);
            int var22 = var5[var20].UuUVuuUu();
            int var23 = var21 >= 0 && var5[var21].vVvUvVVuuNvV >= var5[var20].vVvUvVVuuNvV * 0.18F ? var5[var21].UuUVuuUu() : UuUVuuUu(var22);
            return UuUVuuUu(var22, var23);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static int UuUVuuUu(NuNvVUuUUnun.nvnNNunvv[] var0, int var1) {
      int var2 = -1;
      float var3 = 0.0F;

      for (int var4 = 0; var4 < var0.length; var4++) {
         if (var4 != var1 && !(var0[var4].vVvUvVVuuNvV <= var3) && (var1 < 0 || UuUVuuUu(var4, var1, var0.length) >= 3)) {
            var2 = var4;
            var3 = var0[var4].vVvUvVVuuNvV;
         }
      }

      return var2;
   }

   private static int UuUVuuUu(int var0, int var1, int var2) {
      int var3 = Math.abs(var0 - var1);
      return Math.min(var3, var2 - var3);
   }

   private static int UuUVuuUu(int var0) {
      float[] var1 = Color.RGBtoHSB(UnVNvNnU.VvunVVUvUNnv.nUUVuvU(var0), UnVNvNnU.VvunVVUvUNnv.UnUNVVVNuv(var0), UnVNvNnU.VvunVVUvUNnv.vNVuvnUUnuUn(var0), null);
      float var2 = (var1[0] + 0.08F) % 1.0F;
      int var3 = Color.HSBtoRGB(var2, Math.min(1.0F, var1[1] * 1.08F), Math.min(1.0F, var1[2] * 1.18F));
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var3 >>> 16 & 0xFF, var3 >>> 8 & 0xFF, var3 & 0xFF, 255);
   }

   private static int[] UuUVuuUu(int var0, int var1) {
      int var2 = C00OOC00oO(var0);
      int var3 = C00OOC00oO(var1);
      if (C00OOC00oO(var2, var3) < 42) {
         var3 = UuUVuuUu(var2);
         var3 = C00OOC00oO(var3);
      }

      return new int[]{var2, var3};
   }

   private static int C00OOC00oO(int var0) {
      int var1 = UnVNvNnU.VvunVVUvUNnv.nUUVuvU(var0);
      int var2 = UnVNvNnU.VvunVVUvUNnv.UnUNVVVNuv(var0);
      int var3 = UnVNvNnU.VvunVVUvUNnv.vNVuvnUUnuUn(var0);
      float[] var4 = Color.RGBtoHSB(var1, var2, var3, null);
      float var5 = var1 * 0.2126F + var2 * 0.7152F + var3 * 0.0722F;
      if (var4[1] < 0.1F && var5 < 150.0F) {
         return UuUVuuUu()[0];
      } else {
         float var6 = Math.min(1.0F, Math.max(var4[1] * 1.12F, 0.38F));
         float var7 = Math.min(1.0F, Math.max(var4[2], 0.78F));
         if (var5 < 115.0F) {
            var7 = Math.max(var7, 0.88F);
         }

         int var8 = Color.HSBtoRGB(var4[0], var6, var7);
         return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var8 >>> 16 & 0xFF, var8 >>> 8 & 0xFF, var8 & 0xFF, 255);
      }
   }

   private static int C00OOC00oO(int var0, int var1) {
      int var2 = UnVNvNnU.VvunVVUvUNnv.nUUVuvU(var0) - UnVNvNnU.VvunVVUvUNnv.nUUVuvU(var1);
      int var3 = UnVNvNnU.VvunVVUvUNnv.UnUNVVVNuv(var0) - UnVNvNnU.VvunVVUvUNnv.UnUNVVVNuv(var1);
      int var4 = UnVNvNnU.VvunVVUvUNnv.vNVuvnUUnuUn(var0) - UnVNvNnU.VvunVVUvUNnv.vNVuvnUUnuUn(var1);
      return Math.abs(var2) + Math.abs(var3) + Math.abs(var4);
   }

   private static int[] UuUVuuUu(int[] var0, int[] var1) {
      if (var0 == null) {
         return var1;
      } else {
         return var1 == null ? var0 : new int[]{var0[0], var1[1]};
      }
   }

   private static String uUnuvNvvNU(class_1799 var0, int var1) {
      return var0.method_7909() + "|" + var0.method_7964().getString() + "|" + var0.method_57353() + "|" + var1;
   }

   private static int[] UuUVuuUu(int[] var0) {
      return var0 == null ? null : new int[]{var0[0], var0[1]};
   }

   public static void UuUVuuUu(class_2960 var0) {
      if (var0 != null) {
         try {
            class_1044 var1 = UuUVuuUu.method_1531().method_4619(var0);
            if (var1 != null && var1.method_68004() instanceof class_10868 var2 && var2.method_68427() > 0) {
               int var5 = var2.method_68427();
               if (uNNnnnuuuN.add(var5)) {
                  GlStateManager._bindTexture(var5);
                  GlStateManager._texParameter(3553, 10241, 9728);
                  GlStateManager._texParameter(3553, 10240, 9728);
               }
            }
         } catch (Throwable var4) {
         }
      }
   }

   public static float UuUVuuUu(float var0) {
      return Math.round(var0);
   }

   public static float C00OOC00oO(float var0) {
      return Math.max(1.0F, (float)Math.round(var0));
   }

   public static float uUnuvNvvNU(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? Math.max(0.0625F, Math.round(var0 * 16.0F) / 16.0F) : 1.0F;
   }

   public static void UuUVuuUu(class_332 var0, RenderPipeline var1, class_2960 var2, float var3, float var4, float var5, int var6, int var7) {
      if (var0 != null && var1 != null && var2 != null) {
         float var8 = UuUVuuUu.method_22683().method_4495();
         var0.method_51448().pushMatrix();
         var0.method_51448().translate(var3 / var8, var4 / var8);
         var0.method_51448().scale(var5 / var8, var5 / var8);
         var0.method_25290(var1, var2, 0, 0, 0.0F, 0.0F, var6, var7, var6, var7);
         var0.method_51448().popMatrix();
      }
   }

   private static void C00OOC00oO(UnVNvNnU var0, class_1799 var1, float var2, float var3, float var4) {
      if (var1.method_7947() > 1) {
         int var5 = var1.method_7947();
         String var6 = var5 >= 0 && var5 < vVvUvVVuuNvV.length ? vVvUvVVuuNvV[var5] : "999+";
         float var7 = Math.max(7.0F, 18.0F * var4);
         float var8 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var6, var7).UuUVuuUu;
         float var9 = var2 + 16.0F * var4 - var8 - 1.0F * var4;
         float var10 = var3 + 15.0F * var4;
         var0.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var9, var10, var7, var6, UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, 255));
      }
   }

   private static String[] C00OOC00oO() {
      String[] var0 = new String[1000];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = Integer.toString(var1);
      }

      return var0;
   }

   private static void UuUVuuUu(UnVNvNnU var0, class_1799 var1, class_2960 var2, class_10868 var3, float var4, float var5, float var6) {
      class_8053 var7 = (class_8053)var1.method_58694(class_9334.field_49607);
      if (var7 != null) {
         String var8 = C00OOC00oO(var1);
         if (var8 != null) {
            String var9 = var7.comp_3179().method_40230().map(var0x -> var0x.method_29177().method_12832()).orElse(null);
            if (var9 != null && !var9.isEmpty()) {
               class_1059 var10 = UuUVuuUu.method_1554().method_24153(var2);
               if (var10 != null) {
                  class_2960 var11 = class_2960.method_60655(var2.method_12836(), "trims/items/" + var8 + "_trim_" + var9);
                  class_1058 var12 = var10.method_4608(var11);
                  if (var12 != null && var11.equals(var12.method_45851().method_45816())) {
                     var0.UuUVuuUu(
                        var3.method_68427(),
                        var4,
                        var5,
                        16.0F * var6,
                        16.0F * var6,
                        var12.method_4594(),
                        var12.method_4593(),
                        var12.method_4577(),
                        var12.method_4575(),
                        Math.max(2.0F, 4.0F * var6)
                     );
                  }
               }
            }
         }
      }
   }

   private static String C00OOC00oO(class_1799 var0) {
      class_10192 var1 = (class_10192)var0.method_58694(class_9334.field_54196);
      if (var1 == null) {
         return null;
      } else {
         return switch (var1.comp_3174()) {
            case field_6169 -> "helmet";
            case field_6174 -> "chestplate";
            case field_6172 -> "leggings";
            case field_6166 -> "boots";
            default -> null;
         };
      }
   }

   record NVnVnNnN(int[] colors, long createdAt) {
   }

   static final class nvnNNunvv {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      float vVvUvVVuuNvV;

      void UuUVuuUu(int var1, int var2, int var3, float var4) {
         this.UuUVuuUu += var1 * var4;
         this.C00OOC00oO += var2 * var4;
         this.uUnuvNvvNU += var3 * var4;
         this.vVvUvVVuuNvV += var4;
      }

      int UuUVuuUu() {
         return this.vVvUvVVuuNvV <= 0.0F
            ? UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(220, 255, 245, 255)
            : UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(
               Math.round(this.UuUVuuUu / this.vVvUvVVuuNvV),
               Math.round(this.C00OOC00oO / this.vVvUvVVuuNvV),
               Math.round(this.uUnuvNvvNU / this.vVvUvVVuuNvV),
               255
            );
      }
   }
}
