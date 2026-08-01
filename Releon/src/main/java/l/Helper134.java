package l;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

public final class Helper134 {
   private static final ResourceManager RESOURCE_MANAGER = MinecraftClient.getInstance().getResourceManager();
   private static final Gson GSON = new Gson();

   public Helper134() {
   }

   public static Identifier method1170(String var0) {
      return Identifier.of("mre", "core/" + var0);
   }

   public static JsonObject method1171(Identifier var0) {
      return JsonParser.parseString(method1173(var0)).getAsJsonObject();
   }

   public static <T> T method1172(Identifier var0, Class<T> var1) {
      return (T)GSON.fromJson(method1173(var0), var1);
   }

   public static String method1173(Identifier var0) {
      return method1174(var0, "\n");
   }

   public static String method1174(Identifier var0, String var1) {
      try {
         String var4;
         try (
            InputStream var2 = RESOURCE_MANAGER.open(var0);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2));
         ) {
            var4 = var3.lines().collect(Collectors.joining(var1));
         }

         return var4;
      } catch (IOException var10) {
         throw new RuntimeException(var10);
      }
   }
}
