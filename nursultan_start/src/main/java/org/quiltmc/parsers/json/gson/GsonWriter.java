/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.stream.JsonWriter
 *  org.quiltmc.parsers.json.JsonWriter
 */
package org.quiltmc.parsers.json.gson;

import java.io.IOException;
import java.io.Writer;
import org.quiltmc.parsers.json.JsonWriter;

public class GsonWriter
extends com.google.gson.stream.JsonWriter {
    private final JsonWriter delegate;

    public GsonWriter(JsonWriter writer) {
        super(Writer.nullWriter());
        this.delegate = writer;
    }

    public JsonWriter getDelegate() {
        return this.delegate;
    }

    public com.google.gson.stream.JsonWriter beginArray() throws IOException {
        this.delegate.beginArray();
        return this;
    }

    public com.google.gson.stream.JsonWriter endArray() throws IOException {
        this.delegate.endArray();
        return this;
    }

    public com.google.gson.stream.JsonWriter beginObject() throws IOException {
        this.delegate.beginObject();
        return this;
    }

    public com.google.gson.stream.JsonWriter endObject() throws IOException {
        this.delegate.endObject();
        return this;
    }

    public com.google.gson.stream.JsonWriter name(String name) throws IOException {
        this.delegate.name(name);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(String value) throws IOException {
        this.delegate.value(value);
        return this;
    }

    public com.google.gson.stream.JsonWriter jsonValue(String value) throws IOException {
        this.delegate.jsonValue(value);
        return this;
    }

    public com.google.gson.stream.JsonWriter nullValue() throws IOException {
        this.delegate.nullValue();
        return this;
    }

    public com.google.gson.stream.JsonWriter value(boolean value) throws IOException {
        this.delegate.value(value);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(Boolean value) throws IOException {
        this.delegate.value(value);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(float value) throws IOException {
        this.delegate.value((double)value);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(double value) throws IOException {
        this.delegate.value(value);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(long value) throws IOException {
        this.delegate.value(value);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(Number value) throws IOException {
        this.delegate.value(value);
        return this;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public void close() throws IOException {
        this.delegate.close();
        super.close();
    }
}

