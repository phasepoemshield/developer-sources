package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class O000000000O0O0 {
   private static final List<O0000000OOO00> O00000000 = new ArrayList<>();
   private static final Gson O000000000 = new GsonBuilder().setPrettyPrinting().create();
   private static JsonObject O0000000000 = new JsonObject();
   private static boolean O00000000000;

   private static File O0000000000000() {
      return new File(WildClient.O00000000.O0000000000000, "hudP.cfg");
   }

   @Compile
   public static void O00000000() {}

   @Compile
   public static void O00000000(O0000000OOO00 o0000000OOO00) {}

   public static List<O0000000OOO00> O000000000() {
      return O00000000.stream().filter(o0000000OOO00 -> o0000000OOO00 != null && O00000000(o0000000OOO00.getClass())).toList();
   }

   public static void O0000000000() {
      O0000000000 = new JsonObject();

      for (O0000000OOO00 var1 : O000000000()) {
         for (Setting var3 : var1.O00000000()) {
            if (var3 != null && !var3.O0000000000) {
               var3.O000000000();
            }
         }
      }

      O00000000000();
   }

   public static boolean O00000000(Class<?> class_) {
      return class_ != null && ModuleManager.O00000000(class_.getAnnotation(ModuleAccess.class));
   }

   @Compile
   private static void O000000000(O0000000OOO00 o0000000OOO00) {}

   public static void O00000000000() {
      O0000000000 = O000000000000();
      O00000000000O();
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   public static JsonObject O000000000000() {
      JsonObject var0 = new JsonObject();

      for (O0000000OOO00 var2 : O000000000()) {
         O0000000OOO0 var3 = var2.getClass().getAnnotation(O0000000OOO0.class);
         if (var3 != null) {
            JsonObject var4 = new JsonObject();

            for (Setting var6 : var2.O00000000()) {
               if (var6 != null && !var6.O0000000000) {
                  if (var6 instanceof BooleanSetting var7) {
                     var4.addProperty(var7.O00000000, var7.O0000000000());
                  } else if (var6 instanceof NumberSetting var8) {
                     var4.addProperty(var8.O00000000, var8.O0000000000());
                  } else if (var6 instanceof ModeSetting var9) {
                     var4.addProperty(var9.O00000000, var9.O0000000000());
                  } else if (var6 instanceof O000000O00 var10) {
                     var4.addProperty(var10.O00000000, var10.O000000000000O());
                  } else if (var6 instanceof GroupSetting var11) {
                     JsonObject var12 = new JsonObject();

                     for (BooleanSetting var14 : var11.O00000000000) {
                        var12.addProperty(var14.O00000000, var14.O0000000000());
                     }

                     var4.add(var11.O00000000, var12);
                  }
               }
            }

            var0.add(var3.O00000000(), var4);
         }
      }

      return var0;
   }

   public static void O00000000(JsonObject jsonObject) {
      if (jsonObject != null) {
         O0000000000 = jsonObject.deepCopy();
         O00000000000 = true;
         O000000000000O();
         O00000000000O();
      }
   }

   private static void O000000000000O() {
      for (O0000000OOO00 var1 : O00000000) {
         O000000000(var1);
      }
   }

   private static void O00000000000O() {
      try {
         File var0 = O0000000000000();
         if (!var0.getParentFile().exists()) {
            var0.getParentFile().mkdirs();
         }

         try (FileWriter var1 = new FileWriter(var0)) {
            O000000000.toJson(O0000000000, var1);
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   static {
      Loader.initialize();
   }
}
