package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class O00000O0OOOO00 {
   private static final String[] O00000000 = new String[]{"north", "east", "south", "west", "up", "down"};

   private O00000O0OOOO00() {
   }

   public static O00000O0OOOO0 O00000000(String string) {
      JSONObject var1 = new JSONObject(string);
      int var2 = 16;
      int var3 = 16;
      JSONObject var4 = var1.optJSONObject("resolution");
      if (var4 != null) {
         var2 = var4.optInt("width", 16);
         var3 = var4.optInt("height", 16);
      }

      List var5 = O00000000(var1.optJSONArray("textures"), var2, var3);
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
                  O00000O0OOOO0.W199 var13 = O00000000(var10);
                  if (var13 != null) {
                     var7.put(var12, var13);
                  }
               } else if ("cube".equals(var11)) {
                  O00000O0OOOO0.W197 var22 = O000000000(var10);
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
         O00000O0OOOO0.W196 var20 = null;

         for (int var21 = 0; var21 < var19.length(); var21++) {
            Object var23 = var19.get(var21);
            if (var23 instanceof JSONObject var14) {
               O00000O0OOOO0.W196 var16 = O00000000(var14, var6, var7);
               if (var16 != null) {
                  var18.add(var16);
               }
            } else if (var23 instanceof String var15) {
               O00000O0OOOO0.W197 var24 = (O00000O0OOOO0.W197)var6.get(var15);
               O00000O0OOOO0.W199 var17 = (O00000O0OOOO0.W199)var7.get(var15);
               if (var24 != null || var17 != null) {
                  if (var20 == null) {
                     var20 = new O00000O0OOOO0.W196("root", 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                     var18.add(var20);
                  }

                  if (var24 != null) {
                     var20.O00000000000OO().add(var24);
                  }

                  if (var17 != null) {
                     var20.O0000000000O().add(var17);
                  }
               }
            }
         }
      }

      return new O00000O0OOOO0(var2, var3, var5, var18);
   }

   private static List<O00000O0OOOO0.W201> O00000000(JSONArray jSONArray, int i, int j) {
      ArrayList var3 = new ArrayList();
      if (jSONArray == null) {
         return var3;
      } else {
         for (int var4 = 0; var4 < jSONArray.length(); var4++) {
            JSONObject var5 = jSONArray.optJSONObject(var4);
            if (var5 != null) {
               String var6 = var5.optString("name", "texture_" + var4);
               int var7 = var5.optInt("uv_width", var5.optInt("width", i));
               int var8 = var5.optInt("uv_height", var5.optInt("height", j));
               byte[] var9 = O000000000(var5.optString("source", ""));
               var3.add(new O00000O0OOOO0.W201(var6, var9, var7, var8));
            }
         }

         return var3;
      }
   }

   private static byte[] O000000000(String string) {
      if (string != null && !string.isEmpty()) {
         int var1 = string.indexOf(44);
         String var2 = string.startsWith("data:") && var1 >= 0 ? string.substring(var1 + 1) : string;

         try {
            return Base64.getDecoder().decode(var2.replaceAll("\\s", ""));
         } catch (RuntimeException var4) {
            return new byte[0];
         }
      } else {
         return new byte[0];
      }
   }

   private static O00000O0OOOO0.W196 O00000000(JSONObject jSONObject, Map<String, O00000O0OOOO0.W197> map, Map<String, O00000O0OOOO0.W199> map2) {
      String var3 = jSONObject.optString("name", "");
      float[] var4 = O00000000(jSONObject.optJSONArray("origin"), 0.0F);
      float[] var5 = O00000000(jSONObject.optJSONArray("rotation"), 0.0F);
      O00000O0OOOO0.W196 var6 = new O00000O0OOOO0.W196(var3, var4[0], var4[1], var4[2], var5[0], var5[1], var5[2]);
      JSONArray var7 = jSONObject.optJSONArray("children");
      if (var7 != null) {
         for (int var8 = 0; var8 < var7.length(); var8++) {
            Object var9 = var7.get(var8);
            if (var9 instanceof JSONObject var10) {
               O00000O0OOOO0.W196 var12 = O00000000(var10, map, map2);
               if (var12 != null) {
                  var6.O00000000000O0().add(var12);
               }
            } else if (var9 instanceof String var11) {
               O00000O0OOOO0.W197 var14 = (O00000O0OOOO0.W197)map.get(var11);
               if (var14 != null) {
                  var6.O00000000000OO().add(var14);
               }

               O00000O0OOOO0.W199 var13 = (O00000O0OOOO0.W199)map2.get(var11);
               if (var13 != null) {
                  var6.O0000000000O().add(var13);
               }
            }
         }
      }

      return var6;
   }

   private static O00000O0OOOO0.W199 O00000000(JSONObject jSONObject) {
      float[] var1 = O00000000(jSONObject.optJSONArray("origin"), 0.0F);
      float[] var2 = O00000000(jSONObject.optJSONArray("rotation"), 0.0F);
      JSONObject var3 = jSONObject.optJSONObject("vertices");
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

         JSONObject var23 = jSONObject.optJSONObject("faces");
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
                        var24.add(new O00000O0OOOO0.W200(var14, var15, var16, var17, var11.optInt("texture", 0)));
                     }
                  }
               }
            }

            return var24.isEmpty()
               ? null
               : new O00000O0OOOO0.W199(var1[0], var1[1], var1[2], var2[0], var2[1], var2[2], var5, (O00000O0OOOO0.W200[])var24.toArray(new O00000O0OOOO0.W200[0]));
         }
      } else {
         return null;
      }
   }

   private static O00000O0OOOO0.W197 O000000000(JSONObject jSONObject) {
      float[] var1 = O00000000(jSONObject.optJSONArray("from"), 0.0F);
      float[] var2 = O00000000(jSONObject.optJSONArray("to"), 0.0F);
      float[] var3 = O00000000(jSONObject.optJSONArray("origin"), 0.0F);
      float[] var4 = O00000000(jSONObject.optJSONArray("rotation"), 0.0F);
      float var5 = (float)jSONObject.optDouble("inflate", 0.0);
      JSONObject var6 = jSONObject.optJSONObject("faces");
      O00000O0OOOO0.W198[] var7 = new O00000O0OOOO0.W198[O00000000.length];
      boolean var8 = false;
      if (var6 != null) {
         for (int var9 = 0; var9 < O00000000.length; var9++) {
            JSONObject var10 = var6.optJSONObject(O00000000[var9]);
            if (var10 != null && !var10.isNull("texture")) {
               JSONArray var11 = var10.optJSONArray("uv");
               if (var11 != null && var11.length() >= 4) {
                  int var12 = var10.optInt("texture", 0);
                  var7[var9] = new O00000O0OOOO0.W198(
                     var12, (float)var11.optDouble(0, 0.0), (float)var11.optDouble(1, 0.0), (float)var11.optDouble(2, 0.0), (float)var11.optDouble(3, 0.0)
                  );
                  var8 = true;
               }
            }
         }
      }

      return !var8
         ? null
         : new O00000O0OOOO0.W197(var1[0], var1[1], var1[2], var2[0], var2[1], var2[2], var3[0], var3[1], var3[2], var4[0], var4[1], var4[2], var5, var7);
   }

   private static float[] O00000000(JSONArray jSONArray, float f) {
      float[] var2 = new float[]{f, f, f};
      if (jSONArray == null) {
         return var2;
      } else {
         for (int var3 = 0; var3 < 3 && var3 < jSONArray.length(); var3++) {
            var2[var3] = (float)jSONArray.optDouble(var3, f);
         }

         return var2;
      }
   }
}
