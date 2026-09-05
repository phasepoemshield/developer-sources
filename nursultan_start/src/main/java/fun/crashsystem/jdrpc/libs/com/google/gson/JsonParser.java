/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.MalformedJsonException
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonIOException;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException;
import fun.crashsystem.jdrpc.libs.com.google.gson.Strictness;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    public static JsonElement parseString(String json) throws JsonSyntaxException {
        return JsonParser.parseReader(new StringReader(json));
    }

    @Deprecated
    public JsonParser() {
    }

    @Deprecated
    public JsonElement parse(String json) throws JsonSyntaxException {
        return JsonParser.parseString(json);
    }

    @Deprecated
    public JsonElement parse(Reader json) throws JsonIOException, JsonSyntaxException {
        return JsonParser.parseReader(json);
    }

    @Deprecated
    public JsonElement parse(JsonReader json) throws JsonIOException, JsonSyntaxException {
        return JsonParser.parseReader(json);
    }

    public static JsonElement parseReader(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement element = JsonParser.parseReader(jsonReader);
            if (!element.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return element;
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

    public static JsonElement parseReader(JsonReader reader) throws JsonIOException, JsonSyntaxException {
        Strictness strictness = reader.getStrictness();
        if (strictness == Strictness.LEGACY_STRICT) {
            reader.setStrictness(Strictness.LENIENT);
        }
        try {
            JsonElement jsonElement = Streams.parse(reader);
            return jsonElement;
        }
        catch (StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + reader + " to Json", e);
        }
        catch (OutOfMemoryError e) {
            throw new JsonParseException("Failed parsing JSON source: " + reader + " to Json", e);
        }
        finally {
            reader.setStrictness(strictness);
        }
    }
}

