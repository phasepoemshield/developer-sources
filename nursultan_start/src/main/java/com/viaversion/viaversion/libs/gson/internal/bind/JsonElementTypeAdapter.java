/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonNull
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 *  com.viaversion.viaversion.libs.gson.internal.LazilyParsedNumber
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.gson.stream.JsonToken
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson.internal.bind;

import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonNull;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.gson.TypeAdapter;
import com.viaversion.viaversion.libs.gson.internal.LazilyParsedNumber;
import com.viaversion.viaversion.libs.gson.internal.bind.JsonTreeReader;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.gson.stream.JsonToken;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;

class JsonElementTypeAdapter
extends TypeAdapter<JsonElement> {
    static final JsonElementTypeAdapter ADAPTER = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public void write(JsonWriter out, JsonElement value) throws IOException {
        if (value == null || value.isJsonNull()) {
            out.nullValue();
        } else if (value.isJsonPrimitive()) {
            JsonPrimitive primitive = value.getAsJsonPrimitive();
            if (primitive.isNumber()) {
                out.value(primitive.getAsNumber());
            } else if (primitive.isBoolean()) {
                out.value(primitive.getAsBoolean());
            } else {
                out.value(primitive.getAsString());
            }
        } else if (value.isJsonArray()) {
            out.beginArray();
            for (JsonElement e : value.getAsJsonArray()) {
                this.write(out, e);
            }
            out.endArray();
        } else if (value.isJsonObject()) {
            out.beginObject();
            for (Map.Entry e : value.getAsJsonObject().entrySet()) {
                out.name((String)e.getKey());
                this.write(out, (JsonElement)e.getValue());
            }
            out.endObject();
        } else {
            throw new IllegalArgumentException("Couldn't write " + value.getClass());
        }
    }

    public JsonElement read(JsonReader in) throws IOException {
        if (in instanceof JsonTreeReader) {
            return ((JsonTreeReader)in).nextJsonElement();
        }
        JsonToken peeked = in.peek();
        JsonElement current = this.tryBeginNesting(in, peeked);
        if (current == null) {
            return this.readTerminal(in, peeked);
        }
        ArrayDeque<JsonElement> stack = new ArrayDeque<JsonElement>();
        while (true) {
            if (in.hasNext()) {
                JsonElement value;
                boolean isNesting;
                String name = null;
                if (current instanceof JsonObject) {
                    name = in.nextName();
                }
                boolean bl = isNesting = (value = this.tryBeginNesting(in, peeked = in.peek())) != null;
                if (value == null) {
                    value = this.readTerminal(in, peeked);
                }
                if (current instanceof JsonArray) {
                    ((JsonArray)current).add(value);
                } else {
                    ((JsonObject)current).add(name, value);
                }
                if (!isNesting) continue;
                stack.addLast(current);
                current = value;
                continue;
            }
            if (current instanceof JsonArray) {
                in.endArray();
            } else {
                in.endObject();
            }
            if (stack.isEmpty()) {
                return current;
            }
            current = (JsonElement)stack.removeLast();
        }
    }

    private JsonElement tryBeginNesting(JsonReader in, JsonToken peeked) throws IOException {
        switch (peeked) {
            case BEGIN_ARRAY: {
                in.beginArray();
                return new JsonArray();
            }
            case BEGIN_OBJECT: {
                in.beginObject();
                return new JsonObject();
            }
        }
        return null;
    }

    private JsonElement readTerminal(JsonReader in, JsonToken peeked) throws IOException {
        switch (peeked) {
            case STRING: {
                return new JsonPrimitive(in.nextString());
            }
            case NUMBER: {
                String number = in.nextString();
                return new JsonPrimitive((Number)new LazilyParsedNumber(number));
            }
            case BOOLEAN: {
                return new JsonPrimitive(Boolean.valueOf(in.nextBoolean()));
            }
            case NULL: {
                in.nextNull();
                return JsonNull.INSTANCE;
            }
        }
        throw new IllegalStateException("Unexpected token: " + peeked);
    }
}

