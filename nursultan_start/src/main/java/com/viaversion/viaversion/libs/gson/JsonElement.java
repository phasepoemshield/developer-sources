/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.internal.Streams
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson;

import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonNull;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.gson.Strictness;
import com.viaversion.viaversion.libs.gson.internal.Streams;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonElement {
    public boolean getAsBoolean() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Deprecated
    public JsonElement() {
    }

    public String toString() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            JsonWriter jsonWriter = new JsonWriter(Streams.writerForAppendable((Appendable)stringBuilder));
            jsonWriter.setStrictness(Strictness.LENIENT);
            Streams.write((JsonElement)this, (JsonWriter)jsonWriter);
            return stringBuilder.toString();
        }
        catch (IOException e) {
            throw new AssertionError((Object)e);
        }
    }

    public boolean isJsonNull() {
        return this instanceof JsonNull;
    }

    public byte getAsByte() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public float getAsFloat() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public short getAsShort() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public abstract JsonElement deepCopy();

    public double getAsDouble() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int getAsInt() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public long getAsLong() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public Number getAsNumber() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String getAsString() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public JsonNull getAsJsonNull() {
        if (this.isJsonNull()) {
            return (JsonNull)this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public JsonArray getAsJsonArray() {
        if (this.isJsonArray()) {
            return (JsonArray)this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public JsonPrimitive getAsJsonPrimitive() {
        if (this.isJsonPrimitive()) {
            return (JsonPrimitive)this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public BigDecimal getAsBigDecimal() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public JsonObject getAsJsonObject() {
        if (this.isJsonObject()) {
            return (JsonObject)this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public boolean isJsonPrimitive() {
        return this instanceof JsonPrimitive;
    }

    public boolean isJsonArray() {
        return this instanceof JsonArray;
    }

    public BigInteger getAsBigInteger() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean isJsonObject() {
        return this instanceof JsonObject;
    }

    @Deprecated
    public char getAsCharacter() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
}

