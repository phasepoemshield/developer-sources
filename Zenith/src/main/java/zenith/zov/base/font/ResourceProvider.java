package zenith.zov.base.font;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourceManager;
import zenith.ZenithClient;
import zenith.ZenithInternal076;

public final class ResourceProvider implements ZenithInternal076 {
   private static final ResourceManager RESOURCE_MANAGER = MinecraftClient.getInstance().getResourceManager();
   private static final Gson GSON = new Gson();

   public static Identifier getShaderIdentifier(String s) {
      return ZenithClient.StringHolder_10("core/" + s);
   }

   public static <T> T fromJsonToInstance(Identifier Identifier, Class<T> oclass) {
      return (T)GSON.fromJson(toString(Identifier), oclass);
   }

   public static String toString(Identifier Identifier) {
      return toString(Identifier, "\n");
   }

   public static String toString(Identifier Identifier, String s) {
      try {
         String s1;
         try (
            InputStream inputstream = RESOURCE_MANAGER.open(Identifier);
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
         ) {
            s1 = bufferedreader.lines().collect(Collectors.joining(s));
         }

         return s1;
      } catch (IOException ioexception) {
         throw new RuntimeException(ioexception);
      }
   }
}
