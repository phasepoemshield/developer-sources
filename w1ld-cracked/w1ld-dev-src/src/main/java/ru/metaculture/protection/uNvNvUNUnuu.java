package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class uNvNvUNUnuu {
   private static final List<vVvnUVnUvv> UuUVuuUu = new ArrayList<>();
   private static final Gson C00OOC00oO = new GsonBuilder().setPrettyPrinting().create();
   private static JsonObject uUnuvNvvNU = new JsonObject();
   private static boolean vVvUvVVuuNvV;

   private static File nuUnNvnuUu() {
      return new File(NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "hudP.cfg");
   }

   @Compile
   public static void UuUVuuUu() {
      if (vVvUvVVuuNvV) {
         VVuuUN();
         vNUvnnVnUvu();
      } else {
         File var0 = nuUnNvnuUu();
         if (var0.exists()) {
            try (FileReader var1 = new FileReader(var0)) {
               JsonObject var2 = (JsonObject)C00OOC00oO.fromJson(var1, JsonObject.class);
               Field var3 = uNvNvUNUnuu.class.getDeclaredField("uUnuvNvvNU");
               var3.setAccessible(true);
               var3.set(null, var2);
               if (uUnuvNvvNU != null) {
                  VVuuUN();
               }

               if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }
            } catch (Exception var6) {
            }
         }
      }
   }

   @Compile
   public static void UuUVuuUu(vVvnUVnUvv var0) {
      if (var0 != null && UuUVuuUu(var0.getClass()) && !UuUVuuUu.contains(var0)) {
         UuUVuuUu.add(var0);
         UuUVuuUu(var0);
      }
   }

   public static List<vVvnUVnUvv> C00OOC00oO() {
      return UuUVuuUu.stream().filter(var0 -> var0 != null && UuUVuuUu(var0.getClass())).toList();
   }

   public static void uUnuvNvvNU() {
      uUnuvNvvNU = new JsonObject();

      for (vVvnUVnUvv var1 : C00OOC00oO()) {
         for (nvUuvVvuuN var3 : var1.UuUVuuUu()) {
            if (var3 != null && !var3.uUnuvNvvNU) {
               var3.C00OOC00oO();
            }
         }
      }

      vVvUvVVuuNvV();
   }

   public static boolean UuUVuuUu(Class<?> var0) {
      return var0 != null && uVvnVvvUVUv.UuUVuuUu(var0.getAnnotation(uNUunUnnnVu.class));
   }

   @Compile
   private static void C00OOC00oO(vVvnUVnUvv var0) {
      if (var0 != null) {
         Class var1 = var0.getClass();
         if (var1 != null) {
            vuUuvvvNnVV var2 = var1.getAnnotation(vuUuvvvNnVV.class);
            if (var2 != null) {
               JsonObject var3 = uUnuvNvvNU;
               String var4 = var2.UuUVuuUu();
               if (var3 != null && var3.has(var4)) {
                  JsonObject var5 = uUnuvNvvNU;
                  String var6 = var2.UuUVuuUu();
                  JsonObject var7 = var5 == null ? null : var5.getAsJsonObject(var6);
                  List var8 = var0.UuUVuuUu();
                  if (var8 != null) {
                     Iterator var9 = var8.iterator();
                     if (var9 != null) {
                        while (var9.hasNext()) {
                           nvUuvVvuuN var10 = (nvUuvVvuuN)var9.next();
                           if (var10 != null && !var10.uUnuvNvvNU) {
                              if (var10 instanceof vvNnnUNnVvn var11) {
                                 if (var7 != null && var7.has(var11.UuUVuuUu)) {
                                    JsonElement var24 = var7.get(var11.UuUVuuUu);
                                    var11.C00OOC00oO(var24 != null && var24.getAsBoolean());
                                 }
                              } else if (var10 instanceof nNUuNvVn var12) {
                                 if (var7 != null && var7.has(var12.UuUVuuUu)) {
                                    JsonElement var23 = var7.get(var12.UuUVuuUu);
                                    var12.UuUVuuUu(var23 == null ? 0.0F : var23.getAsFloat());
                                 }
                              } else if (var10 instanceof UvNnUnuNUUU var13) {
                                 if (var7 != null && var7.has(var13.UuUVuuUu)) {
                                    JsonElement var22 = var7.get(var13.UuUVuuUu);
                                    String var25 = var22 == null ? null : var22.getAsString();
                                    List var26 = var13.vVvUvVVuuNvV;
                                    int var27 = var26 == null ? -1 : var26.indexOf(var25);
                                    if (var27 >= 0) {
                                       var13.vNUvnnVnUvu = var27;
                                       var13.uNNnnnuuuN = var26 == null ? null : (String)var26.get(var27);
                                    }
                                 }
                              } else if (var10 instanceof ili11Iii1Ii var14) {
                                 if (var7 != null && var7.has(var14.UuUVuuUu)) {
                                    JsonElement var21 = var7.get(var14.UuUVuuUu);
                                    var14.uUnuvNvvNU(var21 == null ? null : var21.getAsString());
                                 }
                              } else if (var10 instanceof VUVnvvnNN var15 && var7 != null && var7.has(var15.UuUVuuUu)) {
                                 JsonObject var16 = var7.getAsJsonObject(var15.UuUVuuUu);
                                 List var17 = var15.vVvUvVVuuNvV;
                                 if (var17 != null) {
                                    Iterator var18 = var17.iterator();
                                    if (var18 != null) {
                                       while (var18.hasNext()) {
                                          vvNnnUNnVvn var19 = (vvNnnUNnVvn)var18.next();
                                          if (var16 != null && var16.has(var19.UuUVuuUu)) {
                                             JsonElement var20 = var16.get(var19.UuUVuuUu);
                                             var19.C00OOC00oO(var20 != null && var20.getAsBoolean());
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static void vVvUvVVuuNvV() {
      uUnuvNvvNU = uNNnnnuuuN();
      vNUvnnVnUvu();
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   public static JsonObject uNNnnnuuuN() {
      JsonObject var0 = new JsonObject();

      for (vVvnUVnUvv var2 : C00OOC00oO()) {
         vuUuvvvNnVV var3 = var2.getClass().getAnnotation(vuUuvvvNnVV.class);
         if (var3 != null) {
            JsonObject var4 = new JsonObject();

            for (nvUuvVvuuN var6 : var2.UuUVuuUu()) {
               if (var6 != null && !var6.uUnuvNvvNU) {
                  if (var6 instanceof vvNnnUNnVvn var7) {
                     var4.addProperty(var7.UuUVuuUu, var7.uUnuvNvvNU());
                  } else if (var6 instanceof nNUuNvVn var8) {
                     var4.addProperty(var8.UuUVuuUu, var8.uUnuvNvvNU());
                  } else if (var6 instanceof UvNnUnuNUUU var9) {
                     var4.addProperty(var9.UuUVuuUu, var9.uUnuvNvvNU());
                  } else if (var6 instanceof ili11Iii1Ii var10) {
                     var4.addProperty(var10.UuUVuuUu, var10.VVuuUN());
                  } else if (var6 instanceof VUVnvvnNN var11) {
                     JsonObject var12 = new JsonObject();

                     for (vvNnnUNnVvn var14 : var11.vVvUvVVuuNvV) {
                        var12.addProperty(var14.UuUVuuUu, var14.uUnuvNvvNU());
                     }

                     var4.add(var11.UuUVuuUu, var12);
                  }
               }
            }

            var0.add(var3.UuUVuuUu(), var4);
         }
      }

      return var0;
   }

   public static void UuUVuuUu(JsonObject var0) {
      if (var0 != null) {
         uUnuvNvvNU = var0.deepCopy();
         vVvUvVVuuNvV = true;
         VVuuUN();
         vNUvnnVnUvu();
      }
   }

   private static void VVuuUN() {
      for (vVvnUVnUvv var1 : UuUVuuUu) {
         C00OOC00oO(var1);
      }
   }

   private static void vNUvnnVnUvu() {
      try {
         File var0 = nuUnNvnuUu();
         if (!var0.getParentFile().exists()) {
            var0.getParentFile().mkdirs();
         }

         try (FileWriter var1 = new FileWriter(var0)) {
            C00OOC00oO.toJson(uUnuvNvvNU, var1);
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   static {
      Loader.initialize();
   }
}
