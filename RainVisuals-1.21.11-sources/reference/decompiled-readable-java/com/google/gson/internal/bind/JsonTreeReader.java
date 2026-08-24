/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class JsonTreeReader
extends JsonReader {
    private static final Reader UNREADABLE_READER = new Reader(){

        @Override
        public void close() {
            throw new AssertionError();
        }

        @Override
        public int read(char[] buffer, int offset, int count) {
            throw new AssertionError();
        }
    };
    private int stackSize = 0;
    private int[] pathIndices;
    private Object[] stack = new Object[32];
    private String[] pathNames = new String[32];
    private static final Object SENTINEL_CLOSED = new Object();

    /*
     * WARNING - void declaration
     */
    @Override
    public int nextInt() throws IOException {
        void var2_2;
        JsonToken token = this.peek();
        if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.NUMBER) + " but was " + (Object)((Object)token) + this.locationString());
        }
        int result = ((JsonPrimitive)this.peekStack()).getAsInt();
        this.popStack();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return (int)var2_2;
    }

    @Override
    public void beginArray() throws IOException {
        this.expect(JsonToken.BEGIN_ARRAY);
        JsonArray array = (JsonArray)this.peekStack();
        this.push(array.iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override
    public String nextName() throws IOException {
        return this.nextName(false);
    }

    @Override
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object o = this.peekStack();
        if (o instanceof Iterator) {
            boolean isObject = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator iterator2 = (Iterator)o;
            if (iterator2.hasNext()) {
                if (isObject) {
                    return JsonToken.NAME;
                }
                this.push(iterator2.next());
                return this.peek();
            }
            return isObject ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
        }
        if (o instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (o instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (o instanceof JsonPrimitive) {
            JsonPrimitive primitive = (JsonPrimitive)o;
            if (primitive.isString()) {
                return JsonToken.STRING;
            }
            if (primitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (primitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (o instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (o == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + o.getClass().getName() + " is not supported");
    }

    @Override
    public String getPreviousPath() {
        return this.getPath(true);
    }

    /*
     * WARNING - void declaration
     */
    private String getPath(boolean usePreviousPath) {
        void var2_2;
        StringBuilder result = new StringBuilder().append('$');
        int i = 0;
        while (i < this.stackSize) {
            void var3_3;
            block10: {
                block9: {
                    void var4_4;
                    block11: {
                        int pathIndex;
                        block12: {
                            if (!(this.stack[i] instanceof JsonArray)) break block9;
                            if (++i >= this.stackSize) break block10;
                            if (!(this.stack[i] instanceof Iterator)) break block10;
                            pathIndex = this.pathIndices[i];
                            if (!usePreviousPath || pathIndex <= 0) break block11;
                            if (i == this.stackSize - 1) break block12;
                            if (i != this.stackSize - 2) break block11;
                        }
                        --pathIndex;
                    }
                    result.append('[').append((int)var4_4).append(']');
                    break block10;
                }
                if (this.stack[i] instanceof JsonObject) {
                    if (++i < this.stackSize) {
                        if (this.stack[i] instanceof Iterator) {
                            result.append('.');
                            if (this.pathNames[i] != null) {
                                result.append(this.pathNames[var3_3]);
                            }
                        }
                    }
                }
            }
            ++var3_3;
        }
        return var2_2.toString();
    }

    @Override
    public void skipValue() throws IOException {
        JsonToken peeked = this.peek();
        switch (peeked) {
            case NAME: {
                String unused = this.nextName(true);
                break;
            }
            case END_ARRAY: {
                this.endArray();
                break;
            }
            case END_OBJECT: {
                this.endObject();
                break;
            }
            case END_DOCUMENT: {
                break;
            }
            default: {
                this.popStack();
                if (this.stackSize <= 0) break;
                int n = this.stackSize - 1;
                this.pathIndices[n] = this.pathIndices[n] + 1;
            }
        }
    }

    @Override
    public void endObject() throws IOException {
        this.expect(JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        this.popStack();
        this.popStack();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
    }

    @Override
    public void close() throws IOException {
        Object[] objectArray = new Object[1];
        objectArray[0] = SENTINEL_CLOSED;
        this.stack = objectArray;
        this.stackSize = 1;
    }

    @Override
    public boolean hasNext() throws IOException {
        JsonToken token = this.peek();
        return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY && token != JsonToken.END_DOCUMENT;
    }

    private void expect(JsonToken expected) throws IOException {
        if (this.peek() != expected) {
            throw new IllegalStateException("Expected " + (Object)((Object)expected) + " but was " + (Object)((Object)this.peek()) + this.locationString());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean nextBoolean() throws IOException {
        void var1_1;
        this.expect(JsonToken.BOOLEAN);
        boolean result = ((JsonPrimitive)this.popStack()).getAsBoolean();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return (boolean)var1_1;
    }

    JsonElement nextJsonElement() throws IOException {
        JsonToken peeked = this.peek();
        if (peeked == JsonToken.NAME || peeked == JsonToken.END_ARRAY || peeked == JsonToken.END_OBJECT || peeked == JsonToken.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + (Object)((Object)peeked) + " when reading a JsonElement.");
        }
        JsonElement element = (JsonElement)this.peekStack();
        this.skipValue();
        return element;
    }

    @Override
    public void endArray() throws IOException {
        this.expect(JsonToken.END_ARRAY);
        this.popStack();
        this.popStack();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
    }

    @Override
    public void beginObject() throws IOException {
        this.expect(JsonToken.BEGIN_OBJECT);
        JsonObject object = (JsonObject)this.peekStack();
        this.push(object.entrySet().iterator());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public long nextLong() throws IOException {
        void var2_2;
        JsonToken token = this.peek();
        if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.NUMBER) + " but was " + (Object)((Object)token) + this.locationString());
        }
        long result = ((JsonPrimitive)this.peekStack()).getAsLong();
        this.popStack();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return (long)var2_2;
    }

    @Override
    public void nextNull() throws IOException {
        this.expect(JsonToken.NULL);
        this.popStack();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
    }

    @Override
    public String getPath() {
        return this.getPath(false);
    }

    private String locationString() {
        return " at path " + this.getPath();
    }

    /*
     * WARNING - void declaration
     */
    private void push(Object newTop) {
        void var1_1;
        if (this.stackSize == this.stack.length) {
            int newLength = this.stackSize * 2;
            this.stack = Arrays.copyOf(this.stack, newLength);
            this.pathIndices = Arrays.copyOf(this.pathIndices, newLength);
            this.pathNames = Arrays.copyOf(this.pathNames, newLength);
        }
        int n = this.stackSize;
        this.stackSize = n + 1;
        this.stack[n] = var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String nextString() throws IOException {
        void var2_2;
        JsonToken token = this.peek();
        if (token != JsonToken.STRING && token != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.STRING) + " but was " + (Object)((Object)token) + this.locationString());
        }
        String result = ((JsonPrimitive)this.popStack()).getAsString();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private String nextName(boolean skipName) throws IOException {
        void var4_4;
        this.expect(JsonToken.NAME);
        Iterator i = (Iterator)this.peekStack();
        Map.Entry entry = (Map.Entry)i.next();
        String result = (String)entry.getKey();
        this.pathNames[this.stackSize - 1] = skipName ? "<skipped>" : result;
        this.push(entry.getValue());
        return var4_4;
    }

    public void promoteNameToValue() throws IOException {
        this.expect(JsonToken.NAME);
        Iterator i = (Iterator)this.peekStack();
        Map.Entry entry = (Map.Entry)i.next();
        this.push(entry.getValue());
        this.push(new JsonPrimitive((String)entry.getKey()));
    }

    /*
     * WARNING - void declaration
     */
    private Object popStack() {
        void var1_1;
        Object result = this.stack[--this.stackSize];
        this.stack[this.stackSize] = null;
        return var1_1;
    }

    public JsonTreeReader(JsonElement element) {
        super(UNREADABLE_READER);
        this.pathIndices = new int[32];
        this.push(element);
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + this.locationString();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public double nextDouble() throws IOException {
        void var2_2;
        JsonToken token = this.peek();
        if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.NUMBER) + " but was " + (Object)((Object)token) + this.locationString());
        }
        double result = ((JsonPrimitive)this.peekStack()).getAsDouble();
        if (!this.isLenient() && (Double.isNaN(result) || Double.isInfinite(result))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + result);
        }
        this.popStack();
        if (this.stackSize > 0) {
            int n = this.stackSize - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return (double)var2_2;
    }
}

