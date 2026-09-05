/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonNull
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3;

import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonNull;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.mcstructs.converter.DataConverter;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Result;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class JsonConverter_v1_20_3
implements DataConverter<JsonElement> {
    public static final JsonConverter_v1_20_3 INSTANCE = new JsonConverter_v1_20_3();
    private Consumer<String> stringConsumer;

    @Override
    @Nullable
    public Consumer<String> currentConsumer() {
        return this.stringConsumer;
    }

    @Override
    public void setCurrentConsumer(Consumer<String> consumer) {
        this.stringConsumer = consumer;
    }

    @Override
    public DataConverter<JsonElement> forkIfDefault() {
        return this == INSTANCE ? new JsonConverter_v1_20_3() : this;
    }

    @Override
    public <N> N convertTo(DataConverter<N> to, @Nullable JsonElement element) {
        if (to == this) {
            return (N)element;
        }
        if (element == null || element instanceof JsonNull) {
            return to.empty();
        }
        if (element instanceof JsonObject) {
            return this.convertMap(to, element);
        }
        if (element instanceof JsonArray) {
            return this.convertList(to, element);
        }
        JsonPrimitive primitive = element.getAsJsonPrimitive();
        if (primitive.isString()) {
            return to.createString(primitive.getAsString());
        }
        if (primitive.isBoolean()) {
            return to.createBoolean(primitive.getAsBoolean());
        }
        BigDecimal number = primitive.getAsBigDecimal();
        try {
            long l = number.longValueExact();
            if ((long)((byte)l) == l) {
                return to.createByte((byte)l);
            }
            if ((long)((short)l) == l) {
                return to.createShort((short)l);
            }
            if ((long)((int)l) == l) {
                return to.createInt((int)l);
            }
            return to.createLong(l);
        }
        catch (ArithmeticException e) {
            double d = number.doubleValue();
            if ((double)((float)d) == d) {
                return to.createFloat((float)d);
            }
            return to.createDouble(d);
        }
    }

    @Override
    public JsonElement empty() {
        return JsonNull.INSTANCE;
    }

    @Override
    public JsonElement createBoolean(boolean value) {
        return new JsonPrimitive(Boolean.valueOf(value));
    }

    @Override
    public Result<Boolean> asBoolean(JsonElement element) {
        if (element.isJsonPrimitive()) {
            JsonPrimitive primitive = element.getAsJsonPrimitive();
            if (primitive.isBoolean()) {
                return Result.success(primitive.getAsBoolean());
            }
            if (primitive.isNumber()) {
                return Result.success(primitive.getAsNumber().byteValue() != 0);
            }
        }
        return Result.unexpected((Object)element, "boolean");
    }

    @Override
    public JsonElement createNumber(Number number) {
        return new JsonPrimitive(number);
    }

    @Override
    public Result<Number> asNumber(JsonElement element) {
        if (element.isJsonPrimitive()) {
            JsonPrimitive primitive = element.getAsJsonPrimitive();
            if (primitive.isBoolean()) {
                return Result.success(primitive.getAsBoolean() ? 1 : 0);
            }
            if (primitive.isNumber()) {
                return Result.success(primitive.getAsNumber());
            }
        }
        return Result.unexpected((Object)element, "number");
    }

    @Override
    public JsonElement createString(String value) {
        return new JsonPrimitive(value);
    }

    @Override
    public Result<String> asString(JsonElement element) {
        if (!element.isJsonPrimitive() || !element.getAsJsonPrimitive().isString()) {
            return Result.unexpected((Object)element, "string");
        }
        return Result.success(element.getAsJsonPrimitive().getAsString());
    }

    @Override
    public Result<JsonElement> mergeList(@Nullable JsonElement list, List<JsonElement> values) {
        if (list == null) {
            list = new JsonArray();
        }
        if (!list.isJsonArray()) {
            return Result.unexpected((Object)list, JsonArray.class);
        }
        JsonArray jsonArray = list.getAsJsonArray();
        for (JsonElement value : values) {
            jsonArray.add(value);
        }
        return Result.success(jsonArray);
    }

    @Override
    public Result<List<JsonElement>> asList(JsonElement element) {
        if (!element.isJsonArray()) {
            return Result.unexpected((Object)element, JsonArray.class);
        }
        return Result.success(element.getAsJsonArray().asList());
    }

    @Override
    public JsonElement createUnsafeMap(Map<JsonElement, JsonElement> values) {
        JsonObject object = new JsonObject();
        values.forEach((key, value) -> object.add(key.getAsString(), value));
        return object;
    }

    @Override
    public Result<JsonElement> mergeMap(@Nullable JsonElement map, Map<JsonElement, JsonElement> values) {
        if (map == null) {
            map = new JsonObject();
        }
        if (!map.isJsonObject()) {
            return Result.unexpected((Object)map, JsonObject.class);
        }
        JsonObject jsonObject = map.getAsJsonObject();
        for (Map.Entry<JsonElement, JsonElement> entry : values.entrySet()) {
            if (!entry.getKey().isJsonPrimitive() || !entry.getKey().getAsJsonPrimitive().isString()) {
                return Result.unexpected((Object)entry.getKey(), "string");
            }
            jsonObject.add(entry.getKey().getAsString(), entry.getValue());
        }
        return Result.success(jsonObject);
    }

    @Override
    public Result<Map<JsonElement, JsonElement>> asMap(JsonElement element) {
        if (!element.isJsonObject()) {
            return Result.unexpected((Object)element, JsonObject.class);
        }
        HashMap map = new HashMap();
        element.getAsJsonObject().entrySet().forEach(entry -> {
            JsonElement cfr_ignored_0 = (JsonElement)map.put(this.createString((String)entry.getKey()), entry.getValue());
        });
        return Result.success(map);
    }

    @Override
    public Result<Map<String, JsonElement>> asStringTypeMap(JsonElement element) {
        if (!element.isJsonObject()) {
            return Result.unexpected((Object)element, JsonObject.class);
        }
        HashMap map = new HashMap();
        element.getAsJsonObject().entrySet().forEach(entry -> {
            JsonElement cfr_ignored_0 = (JsonElement)map.put(entry.getKey(), entry.getValue());
        });
        return Result.success(map);
    }

    @Override
    public JsonElement createByteArray(byte[] value) {
        JsonArray jsonArray = new JsonArray();
        for (byte b : value) {
            jsonArray.add((Number)b);
        }
        return jsonArray;
    }

    @Override
    public Result<byte[]> asByteArray(JsonElement element) {
        if (!element.isJsonArray()) {
            return Result.unexpected((Object)element, JsonArray.class);
        }
        JsonArray jsonArray = element.getAsJsonArray();
        if (StreamSupport.stream(jsonArray.spliterator(), false).anyMatch(e -> e.isJsonPrimitive() && e.getAsJsonPrimitive().isNumber())) {
            byte[] bytes = new byte[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); ++i) {
                bytes[i] = jsonArray.get(i).getAsByte();
            }
            return Result.success(bytes);
        }
        return Result.unexpected((Object)element, byte[].class);
    }

    @Override
    public JsonElement createIntArray(int[] value) {
        JsonArray jsonArray = new JsonArray();
        for (int i : value) {
            jsonArray.add((Number)i);
        }
        return jsonArray;
    }

    @Override
    public Result<int[]> asIntArray(JsonElement element) {
        if (!element.isJsonArray()) {
            return Result.unexpected((Object)element, JsonArray.class);
        }
        JsonArray jsonArray = element.getAsJsonArray();
        if (StreamSupport.stream(jsonArray.spliterator(), false).anyMatch(e -> e.isJsonPrimitive() && e.getAsJsonPrimitive().isNumber())) {
            int[] ints = new int[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); ++i) {
                ints[i] = jsonArray.get(i).getAsInt();
            }
            return Result.success(ints);
        }
        return Result.unexpected((Object)element, int[].class);
    }

    @Override
    public JsonElement createLongArray(long[] value) {
        JsonArray jsonArray = new JsonArray();
        for (long l : value) {
            jsonArray.add((Number)l);
        }
        return jsonArray;
    }

    @Override
    public Result<long[]> asLongArray(JsonElement element) {
        if (!element.isJsonArray()) {
            return Result.unexpected((Object)element, JsonArray.class);
        }
        JsonArray jsonArray = element.getAsJsonArray();
        if (StreamSupport.stream(jsonArray.spliterator(), false).anyMatch(e -> e.isJsonPrimitive() && e.getAsJsonPrimitive().isNumber())) {
            long[] longs = new long[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); ++i) {
                longs[i] = jsonArray.get(i).getAsLong();
            }
            return Result.success(longs);
        }
        return Result.unexpected((Object)element, long[].class);
    }
}

