/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonNull;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive;
import fun.crashsystem.jdrpc.libs.com.google.gson.Strictness;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
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
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
            jsonWriter.setStrictness(Strictness.LENIENT);
            Streams.write(this, jsonWriter);
            return stringWriter.toString();
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

