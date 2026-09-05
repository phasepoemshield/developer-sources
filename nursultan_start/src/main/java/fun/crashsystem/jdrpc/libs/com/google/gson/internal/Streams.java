/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind.TypeAdapters
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.MalformedJsonException
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonIOException;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonNull;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind.TypeAdapters;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams {
    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static void write(JsonElement element, JsonWriter writer) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, element);
    }

    public static JsonElement parse(JsonReader reader) throws JsonParseException {
        boolean isEmpty = true;
        try {
            JsonToken unused = reader.peek();
            isEmpty = false;
            return (JsonElement)TypeAdapters.JSON_ELEMENT.read(reader);
        }
        catch (EOFException e) {
            if (isEmpty) {
                return JsonNull.INSTANCE;
            }
            throw new JsonSyntaxException(e);
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

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer)appendable : new AppendableWriter(appendable);
    }
}

