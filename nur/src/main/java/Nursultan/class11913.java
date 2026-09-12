package Nursultan;

import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import minecraft.class01391;
import minecraft.class01422;
import minecraft.class02579;
import minecraft.class02583;
import minecraft.class02609;
import minecraft.class06830;
import minecraft.class07311;
import minecraft.class07331;

public class class11913 extends class01422 {
   private static String[] j;
   public Object N_0;
   public Object N_1;
   public static Object y_0;
   public static Object y_1 = N(0.2F, 1.0F, -0.7F);
   public static Object y_2 = N(-0.2F, 1.0F, 0.7F);

   public void L() {
   }

   private static void M() {
      j = new String[3];
      j[0] = "glint";
      j[1] = "Sampler0";
      j[2] = "Sampler0";
   }

   private float M(int var1) {
      return ((float)var1 / 16.0F + 0.5F) / 16.0F;
   }

   public class11913() {
      super(new class02579(256), new LinkedHashMap());
      this.i();
      this.N_0 = new LinkedHashMap();
      this.N_1 = new ArrayList();
   }

   static {
      M();
      z();
   }

   private void i() {
   }

   private static void z() {
      y_0 = j[2];
   }

   public void u() {
   }

   private int y(ByteBuffer var1, int var2) {
      int var3 = var1.get(var2) & 255;
      int var4 = var1.get(var2 + 1) & 255;
      int var5 = var1.get(var2 + 2) & 255;
      return (var1.get(var2 + 3) & 0xFF) << 24 | var3 << 16 | var4 << 8 | var5;
   }

   private GpuTextureView y(class07311 var1) {
      Map<String, class06830> var3 = ((class11105)var1).nursultan$getRenderSetup().N();
      class06830 var4 = var3.get(j[1]);
      if (var4 == null) {
         var4 = var3.values().stream().findFirst().orElse(null);
      }

      return var4 == null ? null : var4.N();
   }

   public List<class11904> y() {
      this.i();
      ArrayList var1 = new ArrayList(((Map)this.N_0).size());
      ((Map)this.N_0).forEach((var2, var3) -> {
         class11904 var4 = this.N(var2, var3.N());
         if (var4 != null) {
            var1.add(var4);
         }
      });
      return var1;
   }

   public void N(class07311 var1) {
   }

   private int[] N(class_5596 var1, int var2) {
      if (var1 == class_5596.field_27382) {
         int var8 = var2 / 4;
         int[] var9 = new int[var8 * 6];

         for (int var5 = 0; var5 < var8; var5++) {
            int var6 = var5 * 4;
            int var7 = var5 * 6;
            var9[var7] = var6;
            var9[var7 + 1] = var6 + 1;
            var9[var7 + 2] = var6 + 2;
            var9[var7 + 3] = var6 + 2;
            var9[var7 + 4] = var6 + 3;
            var9[var7 + 5] = var6;
         }

         return var9;
      } else if (var1 != class_5596.field_27379) {
         return null;
      } else {
         int[] var3 = new int[var2];
         int var4 = 0;

         while (var4 < var2) {
            var3[var4] = var4++;
         }

         return var3;
      }
   }

   private float N(ByteBuffer var1, int var2) {
      float var3 = (float)var1.get(var2) / 127.0F;
      float var4 = (float)var1.get(var2 + 1) / 127.0F;
      float var5 = (float)var1.get(var2 + 2) / 127.0F;
      float var6 = Math.max(0.0F, ((float[])y_1)[0] * var3 + ((float[])y_1)[1] * var4 + ((float[])y_1)[2] * var5);
      float var7 = Math.max(0.0F, ((float[])y_2)[0] * var3 + ((float[])y_2)[1] * var4 + ((float[])y_2)[2] * var5);
      return Math.min(1.0F, (var6 + var7) * 0.6F + 0.4F);
   }

   public void N() {
      this.i();
      ((Map)this.N_0).clear();
      ((List)this.N_1).forEach(class02579::close);
      ((List)this.N_1).clear();
   }

   private static float[] N(float var0, float var1, float var2) {
      float var3 = (float)Math.sqrt((double)(var0 * var0 + var1 * var1 + var2 * var2));
      return new float[]{var0 / var3, var1 / var3, var2 / var3};
   }

   private int N(int var1, float var2) {
      int var3 = var1 >>> 24;
      int var4 = (int)((float)(var1 >> 16 & 0xFF) * var2);
      int var5 = (int)((float)(var1 >> 8 & 0xFF) * var2);
      int var6 = (int)((float)(var1 & 0xFF) * var2);
      return var3 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private class11904 N(class07311 var1, class02609 var2) {
      if (var2 == null) {
         return null;
      } else if (var1.field_64011.contains(j[0])) {
         var2.close();
         return null;
      } else {
         class02609 var3 = var2;

         Object var26;
         label122: {
            Object var28;
            label123: {
               class11904 var29;
               label124: {
                  Object var7;
                  try {
                     GpuTextureView var4 = this.y(var1);
                     if (var4 == null) {
                        var26 = null;
                        break label122;
                     }

                     class02583 var5 = var2.L();
                     VertexFormat var6 = var5.N();
                     if (var6.contains(VertexFormatElement.POSITION) && var6.contains(VertexFormatElement.UV0)) {
                        int[] var27 = this.N(var5.u(), var5.y());
                        if (var27 == null) {
                           var28 = null;
                           break label123;
                        }

                        int var8 = var6.getVertexSize();
                        int var9 = var6.getOffset(VertexFormatElement.POSITION);
                        int var10 = var6.getOffset(VertexFormatElement.UV0);
                        int var11 = var6.contains(VertexFormatElement.COLOR) ? var6.getOffset(VertexFormatElement.COLOR) : -1;
                        int var12 = var6.contains(VertexFormatElement.UV2) ? var6.getOffset(VertexFormatElement.UV2) : -1;
                        int var13 = var6.contains(VertexFormatElement.NORMAL) ? var6.getOffset(VertexFormatElement.NORMAL) : -1;
                        ByteBuffer var14 = var2.N().duplicate().order(ByteOrder.nativeOrder());
                        int var15 = var5.y();
                        float[] var16 = new float[var15 * 3];
                        float[] var17 = new float[var15 * 2];
                        int[] var18 = new int[var15];
                        float[] var19 = new float[var15 * 2];
                        float[] var20 = new float[var15 * 3];

                        for (int var21 = 0; var21 < var15; var21++) {
                           int var22 = var21 * var8;
                           var16[var21 * 3] = var14.getFloat(var22 + var9);
                           var16[var21 * 3 + 1] = var14.getFloat(var22 + var9 + 4);
                           var16[var21 * 3 + 2] = var14.getFloat(var22 + var9 + 8);
                           var17[var21 * 2] = var14.getFloat(var22 + var10);
                           var17[var21 * 2 + 1] = var14.getFloat(var22 + var10 + 4);
                           var19[var21 * 2] = this.M(var12 < 0 ? 240 : var14.getShort(var22 + var12));
                           var19[var21 * 2 + 1] = this.M(var12 < 0 ? 240 : var14.getShort(var22 + var12 + 2));
                           int var23 = var11 < 0 ? -1 : this.y(var14, var22 + var11);
                           if (var13 >= 0) {
                              var20[var21 * 3] = (float)var14.get(var22 + var13) / 127.0F;
                              var20[var21 * 3 + 1] = (float)var14.get(var22 + var13 + 1) / 127.0F;
                              var20[var21 * 3 + 2] = (float)var14.get(var22 + var13 + 2) / 127.0F;
                              var23 = this.N(var23, this.N(var14, var22 + var13));
                           } else {
                              var20[var21 * 3 + 2] = 1.0F;
                           }

                           var18[var21] = var23;
                        }

                        var29 = new class11904(var4, var16, var17, var18, var19, var20, var27);
                        break label124;
                     }

                     var7 = null;
                  } catch (Throwable var25) {
                     if (var2 != null) {
                        try {
                           var3.close();
                        } catch (Throwable var24) {
                           var25.addSuppressed(var24);
                        }
                     }

                     throw var25;
                  }

                  if (var2 != null) {
                     var2.close();
                  }

                  return (class11904)var7;
               }

               if (var2 != null) {
                  var2.close();
               }

               return var29;
            }

            if (var2 != null) {
               var2.close();
            }

            return (class11904)var28;
         }

         if (var2 != null) {
            var2.close();
         }

         return (class11904)var26;
      }
   }

   public class01391 method_73477(class07311 var1) {
      this.i();
      return (class01391)((Map)this.N_0).computeIfAbsent(var1, var1x -> {
         this.i();
         class02579 var2 = new class02579(var1x.method_22722());
         ((List)this.N_1).add(var2);
         return new class07331(var2, var1x.method_23033(), var1x.method_23031());
      });
   }
}
