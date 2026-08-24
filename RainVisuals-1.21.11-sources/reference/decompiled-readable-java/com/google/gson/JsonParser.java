/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    /*
     * WARNING - void declaration
     */
    public static JsonElement parseReader(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            void var2_5;
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement element = JsonParser.parseReader(jsonReader);
            if (!element.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return var2_5;
        }
        catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        }
        catch (IOException e) {
            throw new JsonIOException(e);
        }
        catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static JsonElement parseString(String json) throws JsonSyntaxException {
        return JsonParser.parseReader(new StringReader(json));
    }

    @Deprecated
    public JsonElement parse(JsonReader json) throws JsonIOException, JsonSyntaxException {
        return JsonParser.parseReader(json);
    }

    @Deprecated
    public JsonElement parse(String json) throws JsonSyntaxException {
        return JsonParser.parseString(json);
    }

    @Deprecated
    public JsonElement parse(Reader json) throws JsonSyntaxException, JsonIOException {
        return JsonParser.parseReader(json);
    }

    @Deprecated
    public JsonParser() {
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JsonElement parseReader(JsonReader reader) throws JsonSyntaxException, JsonIOException {
        boolean lenient = reader.isLenient();
        reader.setLenient(true);
        try {
            void e;
            JsonElement jsonElement = Streams.parse(reader);
            reader.setLenient(lenient);
            return e;
        }
        catch (StackOverflowError e) {
            try {
                throw new JsonParseException("Failed parsing JSON source: " + reader + " to Json", e);
                catch (OutOfMemoryError e2) {
                    throw new JsonParseException("Failed parsing JSON source: " + reader + " to Json", e2);
                }
            }
            catch (Throwable throwable) {
                void var1_1;
                reader.setLenient((boolean)var1_1);
                throw throwable;
            }
        }
    }
}

