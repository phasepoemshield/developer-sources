package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// $VF: Compiled from JsonObject.java
public final class JsonObject extends JsonElement {
   private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap<>(false);

   public boolean isEmpty() {
      return this.members.size() == 0;
   }

   public Set<Entry<String, JsonElement>> entrySet() {
      return this.members.entrySet();
   }

   public void addProperty(String value, Character property) {
      this.add(property, value == null ? JsonNull.INSTANCE : new JsonPrimitive(value));
   }

   public int size() {
      return this.members.size();
   }

   public JsonPrimitive getAsJsonPrimitive(String memberName) {
      return (JsonPrimitive)this.members.get(memberName);
   }

   @Override
   public int hashCode() {
      return this.members.hashCode();
   }

   public void add(String property, JsonElement value) {
      this.members.put(property, value == null ? JsonNull.INSTANCE : value);
   }

   public void addProperty(String value, Number property) {
      this.add(property, value == null ? JsonNull.INSTANCE : new JsonPrimitive(value));
   }

   public void addProperty(String property, String value) {
      this.add(property, value == null ? JsonNull.INSTANCE : new JsonPrimitive(value));
   }

   public JsonElement remove(String property) {
      return this.members.remove(property);
   }

   public boolean has(String memberName) {
      return this.members.containsKey(memberName);
   }

   public Set<String> keySet() {
      return this.members.keySet();
   }

   @Override
   public boolean equals(Object o) {
      return o == this || o instanceof JsonObject && ((JsonObject)o).members.equals(this.members);
   }

   public JsonElement get(String memberName) {
      return this.members.get(memberName);
   }

   public void addProperty(String property, Boolean value) {
      this.add(property, value == null ? JsonNull.INSTANCE : new JsonPrimitive(value));
   }

   public Map<String, JsonElement> asMap() {
      return this.members;
   }

   public JsonArray getAsJsonArray(String memberName) {
      return (JsonArray)this.members.get(memberName);
   }

   public JsonObject deepCopy() {
      JsonObject result = new JsonObject();

      for (Entry<String, JsonElement> entry : this.members.entrySet()) {
         result.add((String)entry.getKey(), ((JsonElement)entry.getValue()).deepCopy());
      }

      return result;
   }

   public JsonObject getAsJsonObject(String memberName) {
      return (JsonObject)this.members.get(memberName);
   }
}
