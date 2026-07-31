package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import net.minecraft.client.MinecraftClient;
import org.apache.commons.io.FileUtils;

public class Helper16 {
   private static final File CONFIG_DIR = new File(MinecraftClient.getInstance().runDirectory, "Dfwfwf");
   private static final File CONFIG_FILE = new File(CONFIG_DIR, "Proxyconfig.json");
   public static HashMap<String, Helper29> accounts = new HashMap<>();
   public static String lastPlayerName = "";

   public Helper16() {
   }

   public static void method376() {
      try {
         if (!CONFIG_DIR.exists()) {
            CONFIG_DIR.mkdirs();
         }

         if (!CONFIG_FILE.exists()) {
            if (!CONFIG_FILE.createNewFile()) {
               System.out.println("Error creating Proxyconfig.json file");
            }

            method378();
            return;
         }

         String var0 = FileUtils.readFileToString(CONFIG_FILE, StandardCharsets.UTF_8);
         if (!var0.isEmpty()) {
            JsonObject var1 = JsonParser.parseString(var0).getAsJsonObject();
            if (var1.has("proxy-enabled")) {
               Helper301.proxyEnabled = var1.get("proxy-enabled").getAsBoolean();
            }

            Type var2 = new Helper15().getType();
            if (var1.has("accounts")) {
               accounts = (HashMap<String, Helper29>)new Gson().fromJson(var1.get("accounts"), var2);
            }

            if (accounts == null) {
               accounts = new HashMap<>();
            }

            if (accounts.containsKey("")) {
               Helper301.proxy = accounts.get("");
            } else {
               Helper301.proxy = new Helper29();
            }
         }
      } catch (Exception var3) {
         System.out.println("Error reading Proxyconfig.json file");
         var3.printStackTrace();
      }
   }

   public static void method377(Helper29 var0) {
      accounts.put("", var0);
   }

   public static void method378() {
      try {
         if (!CONFIG_DIR.exists()) {
            CONFIG_DIR.mkdirs();
         }

         JsonElement var0 = new Gson().toJsonTree(accounts);
         JsonObject var1 = new JsonObject();
         var1.addProperty("proxy-enabled", Helper301.proxyEnabled);
         var1.add("accounts", var0);
         Gson var2 = new GsonBuilder().setPrettyPrinting().create();
         FileUtils.write(CONFIG_FILE, var2.toJson(var1), StandardCharsets.UTF_8);
      } catch (IOException var3) {
         System.out.println("Error writing Proxyconfig.json file");
         var3.printStackTrace();
      }
   }
}
