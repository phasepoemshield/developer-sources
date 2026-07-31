package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AutoBuyAutoBuyConfig extends Helper95 {
   private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

   public AutoBuyAutoBuyConfig() {
      super("AutoBuy/AutoBuyConfig");
   }

   @Override
   public void method583(File var1) {
      File var2 = new File(var1.getParentFile(), "AutoBuy");
      if (!var2.exists()) {
         var2.mkdirs();
      }

      File var3 = new File(var2, "AutoBuyConfig.json");
      if (var3.exists()) {
         try {
            try (FileReader var4 = new FileReader(var3)) {
               JsonObject var5 = (JsonObject)this.gson.fromJson(var4, JsonObject.class);
               if (var5 != null) {
                  if (var5.has("enabled_items")) {
                     JsonObject var6 = var5.getAsJsonObject("enabled_items");

                     for (Helper465 var8 : Helper359.method3582()) {
                        if (var6.has(var8.method364())) {
                           var8.method367(var6.get(var8.method364()).getAsBoolean());
                        }
                     }
                  }

                  if (var5.has("settings")) {
                     JsonObject var12 = var5.getAsJsonObject("settings");
                     Helper31.method477().method482(var12);
                     Helper359.method3583();
                  }
               }
            }
         } catch (IOException var11) {
            throw new Helper122("Failed to load AutoBuyConfig from file", var11);
         }
      }
   }

   @Override
   public void method584(File var1) {
      File var2 = new File(var1.getParentFile(), "AutoBuy");
      if (!var2.exists()) {
         var2.mkdirs();
      }

      JsonObject var3 = new JsonObject();
      JsonObject var4 = new JsonObject();

      for (Helper465 var6 : Helper359.method3582()) {
         var4.addProperty(var6.method364(), var6.isEnabled());
      }

      var3.add("enabled_items", var4);
      JsonObject var13 = Helper31.method477().method481();
      var3.add("settings", var13);
      File var14 = new File(var2, "AutoBuyConfig.json");

      try {
         try (FileWriter var7 = new FileWriter(var14)) {
            this.gson.toJson(var3, var7);
         }
      } catch (IOException var12) {
         throw new Helper111("Failed to save AutoBuyConfig to file", var12);
      }
   }
}
