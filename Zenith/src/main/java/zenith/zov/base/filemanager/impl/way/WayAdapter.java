package zenith.zov.base.filemanager.impl.way;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.util.math.BlockPos;

public final class WayAdapter implements JsonDeserializer<Way>, JsonSerializer<Way> {
   public JsonElement serialize(PathNodeMaker1 PathNodeMaker1, Type type, JsonSerializationContext jsonserializationcontext) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("name", PathNodeMaker1.name());
      jsonobject.addProperty("server", PathNodeMaker1.server());
      JsonObject jsonobject1 = new JsonObject();
      BlockPos BlockPos = PathNodeMaker1.getNodePosition();
      jsonobject1.addProperty("x", BlockPos.getX());
      jsonobject1.addProperty("y", BlockPos.getY());
      jsonobject1.addProperty("z", BlockPos.getZ());
      jsonobject.add("pos", jsonobject1);
      return jsonobject;
   }

   public PathNodeMaker1 deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
      JsonObject jsonobject = jsonelement.getAsJsonObject();
      String s = getString(jsonobject, "name", "");
      String s1 = getString(jsonobject, "server", "");
      JsonObject jsonobject1 = jsonobject.getAsJsonObject("pos");
      if (jsonobject1 == null) {
         throw new JsonParseException("Missing 'pos' for Way");
      } else {
         int i = getInt(jsonobject1, "x");
         int j = getInt(jsonobject1, "y");
         int k = getInt(jsonobject1, "z");
         return new PathNodeMaker1(s, new BlockPos(i, j, k), s1);
      }
   }

   private static String getString(JsonObject jsonobject, String s, String s1) {
      JsonElement jsonelement = jsonobject.get(s);
      return jsonelement != null && !jsonelement.isJsonNull() ? jsonelement.getAsString() : s1;
   }

   private static int getInt(JsonObject jsonobject, String s) {
      JsonElement jsonelement = jsonobject.get(s);
      if (jsonelement != null && !jsonelement.isJsonNull()) {
         return jsonelement.getAsInt();
      } else {
         throw new JsonParseException("Missing int: " + s);
      }
   }
}
