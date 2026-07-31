package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoCfg extends Helper95 {
   private final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   private final Helper241 moduleRepository;
   private final Helper75 draggableRepository;

   public AutoCfg(Helper241 var1, Helper75 var2) {
      super("AutoCfg");
      this.moduleRepository = var1;
      this.draggableRepository = var2;
   }

   @Override
   public void method584(File var1) {
      this.method879(var1, this.getName() + ".json");
   }

   @Override
   public void method583(File var1) {
      this.method880(var1, this.getName() + ".json");
   }

   @Override
   public void method879(File var1, String var2) {
      JsonObject var3 = this.method881();
      File var4 = new File(var1, var2);
      this.method883(var3, var4);
      super.method879(var1, var2);
   }

   @Override
   public void method880(File var1, String var2) {
      File var3 = new File(var1, var2);
      JsonObject var4 = this.method884(var3);
      if (var4 != null) {
         this.method885(var4);
      }

      super.method880(var1, var2);
   }

   private JsonObject method881() {
      JsonObject var1 = new JsonObject();

      for (Helper242 var3 : this.moduleRepository.method2314()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("bind", var3.getKey());
         var4.addProperty("state", var3.isState());
         var3.settings().forEach(var2 -> this.method882(var4, var2));
         var1.add(var3.getName().toLowerCase(), var4);
      }

      for (Helper119 var6 : this.draggableRepository.method788()) {
         JsonObject var7 = new JsonObject();
         var7.addProperty("posX", var6.method981());
         var7.addProperty("posY", var6.method982());
         var1.add(var6.getName().toLowerCase(), var7);
      }

      return var1;
   }

   private void method882(JsonObject var1, Helper264 var2) {
      if (var2 instanceof Setting3 var3) {
         var1.addProperty(var2.getName(), var3.method2200());
      }

      if (var2 instanceof Setting2 var7) {
         var1.addProperty(var2.getName(), var7.method2082());
      }

      if (var2 instanceof Setting7 var8) {
         var1.addProperty(var2.getName(), var8.method2553());
      }

      if (var2 instanceof Setting9 var9) {
         var1.addProperty(var2.getName(), var9.getKey());
      }

      if (var2 instanceof Setting6 var10) {
         var1.addProperty(var2.getName(), var10.method2403());
      }

      if (var2 instanceof Setting5 var11) {
         var1.addProperty(var2.getName(), var11.method2386());
      }

      if (var2 instanceof Setting8 var12) {
         List var4 = var12.method2590();
         String var5 = String.join(",", var4);
         var1.addProperty(var2.getName(), var5);
      }

      if (var2 instanceof Setting1 var13) {
         JsonObject var14 = new JsonObject();
         var14.addProperty("state", var13.method1974());

         for (Helper264 var6 : var13.method1975()) {
            this.method882(var14, var6);
         }

         var1.add(var2.getName(), var14);
      }
   }

   private void method883(JsonObject var1, File var2) {
      try {
         try (FileWriter var3 = new FileWriter(var2)) {
            this.GSON.toJson(var1, var3);
         }
      } catch (IOException var8) {
         throw new Helper111("Failed to save module to file", var8);
      }
   }

   private JsonObject method884(File var1) {
      try {
         JsonObject var3;
         try (FileReader var2 = new FileReader(var1)) {
            var3 = JsonParser.parseReader(var2).getAsJsonObject();
         }

         return var3;
      } catch (IOException var7) {
         throw new Helper122("Failed to load module from file", var7);
      } catch (JsonIOException | JsonSyntaxException var8) {
         throw new Helper122("Failed to parse JSON from file", var8);
      }
   }

   private void method885(JsonObject var1) {
      for (Helper242 var3 : this.moduleRepository.method2314()) {
         JsonObject var4 = var1.getAsJsonObject(var3.getName().toLowerCase());
         if (var4 != null) {
            if (var4.has("bind") && var4.has("state")) {
               var3.setKey(var4.get("bind").getAsInt());
               var3.setState(var4.get("state").getAsBoolean());
            }

            var3.settings().forEach(var2 -> this.method886(var4, var2));
         }
      }

      for (Helper119 var6 : this.draggableRepository.method788()) {
         JsonObject var7 = var1.getAsJsonObject(var6.getName().toLowerCase());
         if (var7 != null && var7.has("posX") && var7.has("posY")) {
            var6.method973(var7.get("posX").getAsInt());
            var6.method974(var7.get("posY").getAsInt());
         }
      }
   }

   private void method886(JsonObject var1, Helper264 var2) {
      JsonElement var3 = var1.get(var2.getName());
      if (var3 != null && !var3.isJsonNull()) {
         if (var2 instanceof Setting3 var4) {
            var4.method2201(var3.getAsBoolean());
         }

         if (var2 instanceof Setting2 var8) {
            var8.method2086(var3.getAsFloat());
         }

         if (var2 instanceof Setting7 var9) {
            var9.method2555(var3.getAsInt());
         }

         if (var2 instanceof Setting9 var10) {
            var10.method2706(var3.getAsInt());
         }

         if (var2 instanceof Setting6 var11) {
            var11.method2407(var3.getAsString());
         }

         if (var2 instanceof Setting5 var12) {
            var12.method2389(var3.getAsString());
         }

         if (var2 instanceof Setting8 var13) {
            String var5 = var3.getAsString();
            ArrayList var6 = new ArrayList<>(Arrays.asList(var5.split(",")));
            var6.removeIf(var1x -> !var13.method2589().contains(var1x));
            var13.method2592(var6);
         }

         if (var2 instanceof Setting1 var14) {
            JsonObject var15 = var3.getAsJsonObject();
            if (var15.has("state")) {
               var14.method1976(var15.get("state").getAsBoolean());
            }

            for (Helper264 var7 : var14.method1975()) {
               this.method886(var15, var7);
            }
         }
      }
   }
}
