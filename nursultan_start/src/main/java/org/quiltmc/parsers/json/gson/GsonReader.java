/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 */
package org.quiltmc.parsers.json.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import org.quiltmc.parsers.json.JsonReader;

public class GsonReader
extends com.google.gson.stream.JsonReader {
    private final JsonReader delegate;

    public boolean nextBoolean() throws IOException {
        return this.delegate.nextBoolean();
    }

    public void beginObject() throws IOException {
        this.delegate.beginObject();
    }

    public JsonReader getDelegate() {
        return this.delegate;
    }

    public String nextString() throws IOException {
        return this.delegate.nextString();
    }

    public void endObject() throws IOException {
        this.delegate.endObject();
    }

    public void skipValue() throws IOException {
        this.delegate.skipValue();
    }

    public String nextName() throws IOException {
        return this.delegate.nextName();
    }

    public void beginArray() throws IOException {
        this.delegate.beginArray();
    }

    public void endArray() throws IOException {
        this.delegate.endArray();
    }

    public void nextNull() throws IOException {
        this.delegate.nextNull();
    }

    public long nextLong() throws IOException {
        return this.delegate.nextLong();
    }

    public GsonReader(JsonReader reader) {
        super(Reader.nullReader());
        this.delegate = reader;
    }

    public String toString() {
        return this.delegate.toString();
    }

    public boolean hasNext() throws IOException {
        return this.delegate.hasNext();
    }

    public void close() throws IOException {
        this.delegate.close();
        super.close();
    }

    public JsonToken peek() throws IOException {
        switch (this.delegate.peek()) {
            case BEGIN_ARRAY: {
                return JsonToken.BEGIN_ARRAY;
            }
            case END_ARRAY: {
                return JsonToken.END_ARRAY;
            }
            case BEGIN_OBJECT: {
                return JsonToken.BEGIN_OBJECT;
            }
            case END_OBJECT: {
                return JsonToken.END_OBJECT;
            }
            case NAME: {
                return JsonToken.NAME;
            }
            case STRING: {
                return JsonToken.STRING;
            }
            case NUMBER: {
                return JsonToken.NUMBER;
            }
            case BOOLEAN: {
                return JsonToken.BOOLEAN;
            }
            case NULL: {
                return JsonToken.NULL;
            }
            case END_DOCUMENT: {
                return JsonToken.END_DOCUMENT;
            }
        }
        throw new IllegalArgumentException();
    }

    public String getPath() {
        return this.delegate.getPath();
    }

    public double nextDouble() throws IOException {
        return this.delegate.nextDouble();
    }

    public int nextInt() throws IOException {
        return this.delegate.nextInt();
    }

    public String getPreviousPath() {
        return this.delegate.getPreviousPath();
    }
}

