package zenith;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class JsonDeserializerImpl$EventBus implements JsonDeserializer<StringHolder$Helper_13>, JsonSerializer<StringHolder$Helper_13> {
   public JsonElement StringHolder_8(StringHolder$Helper_13 lll111l1$ii1il11l111ii11iil, Type type, JsonSerializationContext jsonserializationcontext) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("name", lll111l1$ii1il11l111ii11iil.name());
      jsonobject.addProperty("key", lll111l1$ii1il11l111ii11iil.ZenithInternal120());
      jsonobject.addProperty("command", lll111l1$ii1il11l111ii11iil.TextHolder());
      return jsonobject;
   }

   public StringHolder$Helper_13 StringHolder_8(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
      JsonObject jsonobject = jsonelement.getAsJsonObject();
      String s = getString(jsonobject, "name", "");
      int i = getInt(jsonobject, "key");
      String s1 = getString(jsonobject, "command", "");
      return new StringHolder$Helper_13(s, i, s1);
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
         throw new JsonParseException("Missing key " + s);
      }
   }
}
