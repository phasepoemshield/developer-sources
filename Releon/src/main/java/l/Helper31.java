package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Helper31 {
   private static Helper31 instance;
   private final Map<String, Helper30> settingsMap = new HashMap<>();
   private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

   private Helper31() {
   }

   public static Helper31 method477() {
      if (instance == null) {
         instance = new Helper31();
      }

      return instance;
   }

   public void method478(String var1, Helper361 var2) {
      String var3 = var1.toLowerCase();
      this.settingsMap.put(var3, new Helper30(var2.method3592(), var2.method3593(), var2.method3594()));
   }

   public void method479(String var1, Helper361 var2) {
      String var3 = var1.toLowerCase();
      Helper30 var4 = this.settingsMap.get(var3);
      if (var4 != null) {
         var2.method3597(var4.buyBelow);
         var2.method3598(var4.sellAbove);
         var2.method3599(var4.minQuantity);
      }
   }

   public boolean method480(String var1) {
      return this.settingsMap.containsKey(var1.toLowerCase());
   }

   public JsonObject method481() {
      JsonObject var1 = new JsonObject();

      for (Entry var3 : this.settingsMap.entrySet()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("buyBelow", ((Helper30)var3.getValue()).buyBelow);
         var4.addProperty("sellAbove", ((Helper30)var3.getValue()).sellAbove);
         var4.addProperty("minQuantity", ((Helper30)var3.getValue()).minQuantity);
         var1.add((String)var3.getKey(), var4);
      }

      return var1;
   }

   public void method482(JsonObject var1) {
      if (var1 != null) {
         for (String var3 : var1.keySet()) {
            String var4 = var3.toLowerCase();
            JsonObject var5 = var1.getAsJsonObject(var3);
            this.settingsMap.put(var4, new Helper30(var5.get("buyBelow").getAsInt(), var5.get("sellAbove").getAsInt(), var5.get("minQuantity").getAsInt()));
         }
      }
   }
}
