package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class UnvUvUvVVvv {
   private static final String[] UuUVuuUu = new String[]{"north", "east", "south", "west", "up", "down"};

   private UnvUvUvVVvv() {
   }

   public static vvNvVvVUVv UuUVuuUu(String var0) {
      JSONObject var1 = new JSONObject(var0);
      int var2 = 16;
      int var3 = 16;
      JSONObject var4 = var1.optJSONObject("resolution");
      if (var4 != null) {
         var2 = var4.optInt("width", 16);
         var3 = var4.optInt("height", 16);
      }

      List var5 = UuUVuuUu(var1.optJSONArray("textures"), var2, var3);
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      JSONArray var8 = var1.optJSONArray("elements");
      if (var8 != null) {
         for (int var9 = 0; var9 < var8.length(); var9++) {
            JSONObject var10 = var8.optJSONObject(var9);
            if (var10 != null) {
               String var11 = var10.optString("type", "cube");
               String var12 = var10.optString("uuid", "el" + var9);
               if ("mesh".equals(var11)) {
                  vvNvVvVUVv.uunvUUVnuNn var13 = UuUVuuUu(var10);
                  if (var13 != null) {
                     var7.put(var12, var13);
                  }
               } else if ("cube".equals(var11)) {
                  vvNvVvVUVv.nvnNNunvv var22 = C00OOC00oO(var10);
                  if (var22 != null) {
                     var6.put(var12, var22);
                  }
               }
            }
         }
      }

      ArrayList var18 = new ArrayList();
      JSONArray var19 = var1.optJSONArray("outliner");
      if (var19 != null) {
         vvNvVvVUVv.NVnVnNnN var20 = null;

         for (int var21 = 0; var21 < var19.length(); var21++) {
            Object var23 = var19.get(var21);
            if (var23 instanceof JSONObject var14) {
               vvNvVvVUVv.NVnVnNnN var16 = UuUVuuUu(var14, var6, var7);
               if (var16 != null) {
                  var18.add(var16);
               }
            } else if (var23 instanceof String var15) {
               vvNvVvVUVv.nvnNNunvv var24 = (vvNvVvVUVv.nvnNNunvv)var6.get(var15);
               vvNvVvVUVv.uunvUUVnuNn var17 = (vvNvVvVUVv.uunvUUVnuNn)var7.get(var15);
               if (var24 != null || var17 != null) {
                  if (var20 == null) {
                     var20 = new vvNvVvVUVv.NVnVnNnN("root", 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                     var18.add(var20);
                  }

                  if (var24 != null) {
                     var20.vuuuNvNuv().add(var24);
                  }

                  if (var17 != null) {
                     var20.nvUVNnuu().add(var17);
                  }
               }
            }
         }
      }

      return new vvNvVvVUVv(var2, var3, var5, var18);
   }

   private static List<vvNvVvVUVv.VUnuUnnuNvVu> UuUVuuUu(JSONArray var0, int var1, int var2) {
      ArrayList var3 = new ArrayList();
      if (var0 == null) {
         return var3;
      } else {
         for (int var4 = 0; var4 < var0.length(); var4++) {
            JSONObject var5 = var0.optJSONObject(var4);
            if (var5 != null) {
               String var6 = var5.optString("name", "texture_" + var4);
               int var7 = var5.optInt("uv_width", var5.optInt("width", var1));
               int var8 = var5.optInt("uv_height", var5.optInt("height", var2));
               byte[] var9 = C00OOC00oO(var5.optString("source", ""));
               var3.add(new vvNvVvVUVv.VUnuUnnuNvVu(var6, var9, var7, var8));
            }
         }

         return var3;
      }
   }

   private static byte[] C00OOC00oO(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         int var1 = var0.indexOf(44);
         String var2 = var0.startsWith("data:") && var1 >= 0 ? var0.substring(var1 + 1) : var0;

         try {
            return Base64.getDecoder().decode(var2.replaceAll("\\s", ""));
         } catch (RuntimeException var4) {
            return new byte[0];
         }
      } else {
         return new byte[0];
      }
   }

   private static vvNvVvVUVv.NVnVnNnN UuUVuuUu(JSONObject var0, Map<String, vvNvVvVUVv.nvnNNunvv> var1, Map<String, vvNvVvVUVv.uunvUUVnuNn> var2) {
      String var3 = var0.optString("name", "");
      float[] var4 = UuUVuuUu(var0.optJSONArray("origin"), 0.0F);
      float[] var5 = UuUVuuUu(var0.optJSONArray("rotation"), 0.0F);
      vvNvVvVUVv.NVnVnNnN var6 = new vvNvVvVUVv.NVnVnNnN(var3, var4[0], var4[1], var4[2], var5[0], var5[1], var5[2]);
      JSONArray var7 = var0.optJSONArray("children");
      if (var7 != null) {
         for (int var8 = 0; var8 < var7.length(); var8++) {
            Object var9 = var7.get(var8);
            if (var9 instanceof JSONObject var10) {
               vvNvVvVUVv.NVnVnNnN var12 = UuUVuuUu(var10, var1, var2);
               if (var12 != null) {
                  var6.uVUuuVnNVU().add(var12);
               }
            } else if (var9 instanceof String var11) {
               vvNvVvVUVv.nvnNNunvv var14 = (vvNvVvVUVv.nvnNNunvv)var1.get(var11);
               if (var14 != null) {
                  var6.vuuuNvNuv().add(var14);
               }

               vvNvVvVUVv.uunvUUVnuNn var13 = (vvNvVvVUVv.uunvUUVnuNn)var2.get(var11);
               if (var13 != null) {
                  var6.nvUVNnuu().add(var13);
               }
            }
         }
      }

      return var6;
   }

   private static vvNvVvVUVv.uunvUUVnuNn UuUVuuUu(JSONObject var0) {
      float[] var1 = UuUVuuUu(var0.optJSONArray("origin"), 0.0F);
      float[] var2 = UuUVuuUu(var0.optJSONArray("rotation"), 0.0F);
      JSONObject var3 = var0.optJSONObject("vertices");
      if (var3 != null && !var3.isEmpty()) {
         HashMap var4 = new HashMap();
         float[] var5 = new float[var3.length() * 3];
         int var6 = 0;

         for (String var8 : var3.keySet()) {
            JSONArray var9 = var3.optJSONArray(var8);
            if (var9 != null && var9.length() >= 3) {
               var4.put(var8, var6);
               var5[var6 * 3] = (float)var9.optDouble(0, 0.0);
               var5[var6 * 3 + 1] = (float)var9.optDouble(1, 0.0);
               var5[var6 * 3 + 2] = (float)var9.optDouble(2, 0.0);
               var6++;
            }
         }

         JSONObject var23 = var0.optJSONObject("faces");
         if (var23 == null) {
            return null;
         } else {
            ArrayList var24 = new ArrayList();

            for (String var10 : var23.keySet()) {
               JSONObject var11 = var23.optJSONObject(var10);
               if (var11 != null) {
                  JSONArray var12 = var11.optJSONArray("vertices");
                  JSONObject var13 = var11.optJSONObject("uv");
                  if (var12 != null && var12.length() >= 3) {
                     int var14 = Math.min(4, var12.length());
                     int[] var15 = new int[4];
                     float[] var16 = new float[4];
                     float[] var17 = new float[4];
                     boolean var18 = true;

                     for (int var19 = 0; var19 < var14; var19++) {
                        String var20 = var12.optString(var19, "");
                        Integer var21 = (Integer)var4.get(var20);
                        if (var21 == null) {
                           var18 = false;
                           break;
                        }

                        var15[var19] = var21;
                        JSONArray var22 = var13 == null ? null : var13.optJSONArray(var20);
                        var16[var19] = var22 == null ? 0.0F : (float)var22.optDouble(0, 0.0);
                        var17[var19] = var22 == null ? 0.0F : (float)var22.optDouble(1, 0.0);
                     }

                     if (var18) {
                        var24.add(new vvNvVvVUVv.nvUnvV(var14, var15, var16, var17, var11.optInt("texture", 0)));
                     }
                  }
               }
            }

            return var24.isEmpty()
               ? null
               : new vvNvVvVUVv.uunvUUVnuNn(var1[0], var1[1], var1[2], var2[0], var2[1], var2[2], var5, var24.toArray(new vvNvVvVUVv.nvUnvV[0]));
         }
      } else {
         return null;
      }
   }

   private static vvNvVvVUVv.nvnNNunvv C00OOC00oO(JSONObject var0) {
      float[] var1 = UuUVuuUu(var0.optJSONArray("from"), 0.0F);
      float[] var2 = UuUVuuUu(var0.optJSONArray("to"), 0.0F);
      float[] var3 = UuUVuuUu(var0.optJSONArray("origin"), 0.0F);
      float[] var4 = UuUVuuUu(var0.optJSONArray("rotation"), 0.0F);
      float var5 = (float)var0.optDouble("inflate", 0.0);
      JSONObject var6 = var0.optJSONObject("faces");
      vvNvVvVUVv.VvunVVUvUNnv[] var7 = new vvNvVvVUVv.VvunVVUvUNnv[UuUVuuUu.length];
      boolean var8 = false;
      if (var6 != null) {
         for (int var9 = 0; var9 < UuUVuuUu.length; var9++) {
            JSONObject var10 = var6.optJSONObject(UuUVuuUu[var9]);
            if (var10 != null && !var10.isNull("texture")) {
               JSONArray var11 = var10.optJSONArray("uv");
               if (var11 != null && var11.length() >= 4) {
                  int var12 = var10.optInt("texture", 0);
                  var7[var9] = new vvNvVvVUVv.VvunVVUvUNnv(
                     var12, (float)var11.optDouble(0, 0.0), (float)var11.optDouble(1, 0.0), (float)var11.optDouble(2, 0.0), (float)var11.optDouble(3, 0.0)
                  );
                  var8 = true;
               }
            }
         }
      }

      return !var8
         ? null
         : new vvNvVvVUVv.nvnNNunvv(var1[0], var1[1], var1[2], var2[0], var2[1], var2[2], var3[0], var3[1], var3[2], var4[0], var4[1], var4[2], var5, var7);
   }

   private static float[] UuUVuuUu(JSONArray var0, float var1) {
      float[] var2 = new float[]{var1, var1, var1};
      if (var0 == null) {
         return var2;
      } else {
         for (int var3 = 0; var3 < 3 && var3 < var0.length(); var3++) {
            var2[var3] = (float)var0.optDouble(var3, var1);
         }

         return var2;
      }
   }
}
