/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.Strictness
 *  com.google.gson.internal.Streams
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class06581
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05032;
import minecraft.class06581;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class05001 {
    private static final Gson N = new GsonBuilder().create();

    public static boolean L(JsonObject jsonObject, String string) {
        if (!class05001.R(jsonObject, string)) {
            return false;
        }
        return jsonObject.getAsJsonPrimitive(string).isBoolean();
    }

    public static boolean L(JsonElement jsonElement) {
        if (!jsonElement.isJsonPrimitive()) {
            return false;
        }
        return jsonElement.getAsJsonPrimitive().isBoolean();
    }

    public static boolean L(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Boolean, was " + class05001.u(jsonElement));
    }

    public static boolean M(@Nullable JsonObject jsonObject, String string) {
        if (jsonObject == null) {
            return false;
        }
        return jsonObject.get(string) != null;
    }

    public static int M(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Int, was " + class05001.u(jsonElement));
    }

    public static int P(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.M(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Int");
    }

    public static char T(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.Z(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Character");
    }

    public static JsonElement B(JsonObject jsonObject, String string) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            throw new JsonSyntaxException("Missing field " + string);
        }
        return jsonElement;
    }

    public static byte B(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsByte();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Byte, was " + class05001.u(jsonElement));
    }

    public static String Z(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.N(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a string");
    }

    public static char Z(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsCharacter();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Character, was " + class05001.u(jsonElement));
    }

    public static float i(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Float, was " + class05001.u(jsonElement));
    }

    public static String i(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
        try {
            class05001.N(jsonWriter, jsonElement, Comparator.naturalOrder());
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
        return stringWriter.toString();
    }

    public static boolean i(JsonObject jsonObject, String string) {
        if (!class05001.M(jsonObject, string)) {
            return false;
        }
        return jsonObject.get(string).isJsonObject();
    }

    public static BigDecimal b(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.z(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a BigDecimal");
    }

    public static byte s(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.B(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Byte");
    }

    public static JsonObject n(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.W(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonObject");
    }

    public static long m(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.R(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Long");
    }

    public static JsonArray m(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonArray, was " + class05001.u(jsonElement));
    }

    public static JsonArray t(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.m(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonArray");
    }

    public static short v(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.E(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Short");
    }

    public static BigInteger j(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.U(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a BigInteger");
    }

    public static BigInteger U(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsBigInteger();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a BigInteger, was " + class05001.u(jsonElement));
    }

    public static boolean U(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.L(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Boolean");
    }

    public static BigDecimal z(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsBigDecimal();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a BigDecimal, was " + class05001.u(jsonElement));
    }

    public static class03556<class06581> z(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.y(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find an item");
    }

    public static double u(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsDouble();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Double, was " + class05001.u(jsonElement));
    }

    public static String u(@Nullable JsonElement jsonElement) {
        String string = StringUtils.abbreviateMiddle((String)String.valueOf(jsonElement), (String)"...", (int)10);
        if (jsonElement == null) {
            return "null (missing)";
        }
        if (jsonElement.isJsonNull()) {
            return "null (json)";
        }
        if (jsonElement.isJsonArray()) {
            return "an array (" + string + ")";
        }
        if (jsonElement.isJsonObject()) {
            return "an object (" + string + ")";
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                return "a number (" + string + ")";
            }
            if (jsonPrimitive.isBoolean()) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }

    public static boolean u(JsonObject jsonObject, String string) {
        if (!class05001.M(jsonObject, string)) {
            return false;
        }
        return jsonObject.get(string).isJsonArray();
    }

    public static class03556<class06581> y(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            String string2 = jsonElement.getAsString();
            return (class03556)class04206.B.L(class01894.N((String)string2)).orElseThrow(() -> new JsonSyntaxException("Expected " + string + " to be an item, was unknown string '" + string2 + "'"));
        }
        throw new JsonSyntaxException("Expected " + string + " to be an item, was " + class05001.u(jsonElement));
    }

    public static boolean y(JsonObject jsonObject, String string) {
        if (!class05001.R(jsonObject, string)) {
            return false;
        }
        return jsonObject.getAsJsonPrimitive(string).isNumber();
    }

    public static <T> T y(Gson gson, Reader reader, TypeToken<T> typeToken) {
        T t = class05001.N(gson, reader, typeToken);
        if (t == null) {
            throw new JsonParseException("JSON data was null or empty");
        }
        return t;
    }

    public static JsonArray y(Reader reader) {
        return class05001.N(N, reader, JsonArray.class);
    }

    public static JsonArray y(String string) {
        return class05001.y(new StringReader(string));
    }

    public static boolean y(JsonElement jsonElement) {
        if (!jsonElement.isJsonPrimitive()) {
            return false;
        }
        return jsonElement.getAsJsonPrimitive().isNumber();
    }

    public static short E(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsShort();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Short, was " + class05001.u(jsonElement));
    }

    public static double E(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.u(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Double");
    }

    public static boolean N(JsonElement jsonElement, int n) {
        try {
            Streams.write((JsonElement)jsonElement, (JsonWriter)new JsonWriter(Streams.writerForAppendable((Appendable)new class05032(n))));
        }
        catch (IllegalStateException illegalStateException) {
            return true;
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
        return false;
    }

    public static <T> T N(@Nullable JsonElement jsonElement, String string, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
        if (jsonElement != null) {
            return (T)jsonDeserializationContext.deserialize(jsonElement, clazz);
        }
        throw new JsonSyntaxException("Missing " + string);
    }

    public static <T> T N(JsonObject jsonObject, String string, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
        if (jsonObject.has(string)) {
            return class05001.N(jsonObject.get(string), string, jsonDeserializationContext, clazz);
        }
        throw new JsonSyntaxException("Missing " + string);
    }

    public static void N(JsonWriter jsonWriter, @Nullable JsonElement jsonElement, @Nullable Comparator<String> comparator) throws IOException {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            jsonWriter.nullValue();
        } else if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                jsonWriter.value(jsonPrimitive.getAsNumber());
            } else if (jsonPrimitive.isBoolean()) {
                jsonWriter.value(jsonPrimitive.getAsBoolean());
            } else {
                jsonWriter.value(jsonPrimitive.getAsString());
            }
        } else if (jsonElement.isJsonArray()) {
            jsonWriter.beginArray();
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                class05001.N(jsonWriter, jsonElement2, comparator);
            }
            jsonWriter.endArray();
        } else if (jsonElement.isJsonObject()) {
            jsonWriter.beginObject();
            for (Map.Entry<String, JsonElement> entry : class05001.N(jsonElement.getAsJsonObject().entrySet(), comparator)) {
                jsonWriter.name(entry.getKey());
                class05001.N(jsonWriter, entry.getValue(), comparator);
            }
            jsonWriter.endObject();
        } else {
            throw new IllegalArgumentException("Couldn't write " + String.valueOf(jsonElement.getClass()));
        }
    }

    public static @Nullable JsonArray N(JsonObject jsonObject, String string, @Nullable JsonArray jsonArray) {
        if (jsonObject.has(string)) {
            return class05001.m(jsonObject.get(string), string);
        }
        return jsonArray;
    }

    public static <T> @Nullable T N(Gson gson, Reader reader, TypeToken<T> typeToken) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setStrictness(Strictness.STRICT);
            return (T)gson.getAdapter(typeToken).read(jsonReader);
        }
        catch (IOException iOException) {
            throw new JsonParseException((Throwable)iOException);
        }
    }

    public static <T> T N(Gson gson, String string, Class<T> clazz) {
        return class05001.N(gson, (Reader)new StringReader(string), clazz);
    }

    private static Collection<Map.Entry<String, JsonElement>> N(Collection<Map.Entry<String, JsonElement>> collection, @Nullable Comparator<String> comparator) {
        if (comparator == null) {
            return collection;
        }
        ArrayList<Map.Entry<String, JsonElement>> arrayList = new ArrayList<Map.Entry<String, JsonElement>>(collection);
        arrayList.sort(Map.Entry.comparingByKey(comparator));
        return arrayList;
    }

    public static <T> @Nullable T N(Gson gson, String string, TypeToken<T> typeToken) {
        return class05001.N(gson, (Reader)new StringReader(string), typeToken);
    }

    public static <T> T N(Gson gson, Reader reader, Class<T> clazz) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setStrictness(Strictness.STRICT);
            Object object = gson.getAdapter(clazz).read(jsonReader);
            if (object == null) {
                throw new JsonParseException("JSON data was null or empty");
            }
            return (T)object;
        }
        catch (IOException iOException) {
            throw new JsonParseException((Throwable)iOException);
        }
    }

    public static JsonObject N(String string) {
        return class05001.N(new StringReader(string));
    }

    public static <T> @Nullable T N(JsonObject jsonObject, String string, @Nullable T t, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
        if (jsonObject.has(string)) {
            return class05001.N(jsonObject.get(string), string, jsonDeserializationContext, clazz);
        }
        return t;
    }

    public static JsonObject N(Reader reader) {
        return class05001.N(N, reader, JsonObject.class);
    }

    public static double N(JsonObject jsonObject, String string, double d) {
        if (jsonObject.has(string)) {
            return class05001.u(jsonObject.get(string), string);
        }
        return d;
    }

    public static float N(JsonObject jsonObject, String string, float f) {
        if (jsonObject.has(string)) {
            return class05001.i(jsonObject.get(string), string);
        }
        return f;
    }

    public static long N(JsonObject jsonObject, String string, long l) {
        if (jsonObject.has(string)) {
            return class05001.R(jsonObject.get(string), string);
        }
        return l;
    }

    public static int N(JsonObject jsonObject, String string, int n) {
        if (jsonObject.has(string)) {
            return class05001.M(jsonObject.get(string), string);
        }
        return n;
    }

    public static byte N(JsonObject jsonObject, String string, byte by) {
        if (jsonObject.has(string)) {
            return class05001.B(jsonObject.get(string), string);
        }
        return by;
    }

    public static String N(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsString();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a string, was " + class05001.u(jsonElement));
    }

    public static @Nullable String N(JsonObject jsonObject, String string, @Nullable String string2) {
        if (jsonObject.has(string)) {
            return class05001.N(jsonObject.get(string), string);
        }
        return string2;
    }

    public static @Nullable class03556<class06581> N(JsonObject jsonObject, String string, @Nullable class03556<class06581> class035562) {
        if (jsonObject.has(string)) {
            return class05001.y(jsonObject.get(string), string);
        }
        return class035562;
    }

    public static boolean N(JsonObject jsonObject, String string, boolean bl) {
        if (jsonObject.has(string)) {
            return class05001.L(jsonObject.get(string), string);
        }
        return bl;
    }

    public static BigDecimal N(JsonObject jsonObject, String string, BigDecimal bigDecimal) {
        if (jsonObject.has(string)) {
            return class05001.z(jsonObject.get(string), string);
        }
        return bigDecimal;
    }

    public static BigInteger N(JsonObject jsonObject, String string, BigInteger bigInteger) {
        if (jsonObject.has(string)) {
            return class05001.U(jsonObject.get(string), string);
        }
        return bigInteger;
    }

    public static short N(JsonObject jsonObject, String string, short s) {
        if (jsonObject.has(string)) {
            return class05001.E(jsonObject.get(string), string);
        }
        return s;
    }

    public static @Nullable JsonObject N(JsonObject jsonObject, String string, @Nullable JsonObject jsonObject2) {
        if (jsonObject.has(string)) {
            return class05001.W(jsonObject.get(string), string);
        }
        return jsonObject2;
    }

    public static boolean N(JsonElement jsonElement) {
        if (!jsonElement.isJsonPrimitive()) {
            return false;
        }
        return jsonElement.getAsJsonPrimitive().isString();
    }

    public static char N(JsonObject jsonObject, String string, char c) {
        if (jsonObject.has(string)) {
            return class05001.Z(jsonObject.get(string), string);
        }
        return c;
    }

    public static boolean N(JsonObject jsonObject, String string) {
        if (!class05001.R(jsonObject, string)) {
            return false;
        }
        return jsonObject.getAsJsonPrimitive(string).isString();
    }

    public static JsonObject W(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonObject, was " + class05001.u(jsonElement));
    }

    public static float W(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class05001.i(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
    }

    public static long R(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsLong();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Long, was " + class05001.u(jsonElement));
    }

    public static boolean R(JsonObject jsonObject, String string) {
        if (!class05001.M(jsonObject, string)) {
            return false;
        }
        return jsonObject.get(string).isJsonPrimitive();
    }
}

