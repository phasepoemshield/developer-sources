/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class JsonObject
extends JsonElement {
    private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap(false);

    public boolean isEmpty() {
        return this.members.size() == 0;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public void addProperty(String property, Character value) {
        this.add(property, value == null ? JsonNull.INSTANCE : new JsonPrimitive(value));
    }

    public int size() {
        return this.members.size();
    }

    public JsonPrimitive getAsJsonPrimitive(String memberName) {
        return (JsonPrimitive)this.members.get(memberName);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public void add(String property, JsonElement value) {
        this.members.put(property, value == null ? JsonNull.INSTANCE : value);
    }

    public void addProperty(String property, Number value) {
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

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonObject deepCopy() {
        void var1_1;
        JsonObject result = new JsonObject();
        Iterator<Map.Entry<String, JsonElement>> iterator2 = this.members.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, JsonElement> entry = iterator2.next();
            result.add(entry.getKey(), entry.getValue().deepCopy());
        }
        return var1_1;
    }

    public JsonObject getAsJsonObject(String memberName) {
        return (JsonObject)this.members.get(memberName);
    }
}

