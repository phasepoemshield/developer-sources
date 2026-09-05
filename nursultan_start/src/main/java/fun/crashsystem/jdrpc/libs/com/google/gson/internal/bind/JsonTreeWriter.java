/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonNull
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonNull;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class JsonTreeWriter
extends JsonWriter {
    private static final Writer UNWRITABLE_WRITER = new Writer(){

        @Override
        public void write(char[] buffer, int offset, int counter) {
            throw new AssertionError();
        }

        @Override
        public void flush() {
            throw new AssertionError();
        }

        @Override
        public void close() {
            throw new AssertionError();
        }
    };
    private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");
    private final List<JsonElement> stack = new ArrayList<JsonElement>();
    private String pendingName;
    private JsonElement product = JsonNull.INSTANCE;

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
    }

    public JsonElement get() {
        if (!this.stack.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.stack);
        }
        return this.product;
    }

    private JsonElement peek() {
        return this.stack.get(this.stack.size() - 1);
    }

    private void put(JsonElement value) {
        if (this.pendingName != null) {
            if (!value.isJsonNull() || this.getSerializeNulls()) {
                JsonObject object = (JsonObject)this.peek();
                object.add(this.pendingName, value);
            }
            this.pendingName = null;
        } else if (this.stack.isEmpty()) {
            this.product = value;
        } else {
            JsonElement element = this.peek();
            if (element instanceof JsonArray) {
                ((JsonArray)element).add(value);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter beginArray() throws IOException {
        JsonArray array = new JsonArray();
        this.put((JsonElement)array);
        this.stack.add((JsonElement)array);
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter endArray() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        JsonElement element = this.peek();
        if (element instanceof JsonArray) {
            this.stack.remove(this.stack.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter beginObject() throws IOException {
        JsonObject object = new JsonObject();
        this.put((JsonElement)object);
        this.stack.add((JsonElement)object);
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter endObject() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        JsonElement element = this.peek();
        if (element instanceof JsonObject) {
            this.stack.remove(this.stack.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter name(String name) throws IOException {
        Objects.requireNonNull(name, "name == null");
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        JsonElement element = this.peek();
        if (element instanceof JsonObject) {
            this.pendingName = name;
            return this;
        }
        throw new IllegalStateException("Please begin an object before writing a name.");
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(String value) throws IOException {
        if (value == null) {
            return this.nullValue();
        }
        this.put((JsonElement)new JsonPrimitive(value));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(boolean value) throws IOException {
        this.put((JsonElement)new JsonPrimitive(Boolean.valueOf(value)));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(Boolean value) throws IOException {
        if (value == null) {
            return this.nullValue();
        }
        this.put((JsonElement)new JsonPrimitive(value));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(float value) throws IOException {
        if (!this.isLenient() && (Float.isNaN(value) || Float.isInfinite(value))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + value);
        }
        this.put((JsonElement)new JsonPrimitive((Number)Float.valueOf(value)));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(double value) throws IOException {
        if (!this.isLenient() && (Double.isNaN(value) || Double.isInfinite(value))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + value);
        }
        this.put((JsonElement)new JsonPrimitive((Number)value));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(long value) throws IOException {
        this.put((JsonElement)new JsonPrimitive((Number)value));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter value(Number value) throws IOException {
        double d;
        if (value == null) {
            return this.nullValue();
        }
        if (!this.isLenient() && (Double.isNaN(d = value.doubleValue()) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + value);
        }
        this.put((JsonElement)new JsonPrimitive(value));
        return this;
    }

    @Override
    @CanIgnoreReturnValue
    public JsonWriter nullValue() throws IOException {
        this.put((JsonElement)JsonNull.INSTANCE);
        return this;
    }

    @Override
    public JsonWriter jsonValue(String value) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public void close() throws IOException {
        if (!this.stack.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.stack.add((JsonElement)SENTINEL_CLOSED);
    }
}

