/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.internal.NonNullElementWrapperList
 */
package com.viaversion.viaversion.libs.gson;

import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonNull;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray
extends JsonElement
implements Iterable<JsonElement> {
    private final ArrayList<JsonElement> elements;

    @Override
    public boolean getAsBoolean() {
        return this.getAsSingleElement().getAsBoolean();
    }

    public List<JsonElement> asList() {
        return new NonNullElementWrapperList(this.elements);
    }

    public JsonArray() {
        this.elements = new ArrayList();
    }

    public JsonArray(int capacity) {
        this.elements = new ArrayList(capacity);
    }

    public JsonElement remove(int index) {
        return this.elements.remove(index);
    }

    public boolean remove(JsonElement element) {
        return this.elements.remove(element);
    }

    public int size() {
        return this.elements.size();
    }

    public JsonElement get(int i) {
        return this.elements.get(i);
    }

    public boolean equals(Object o) {
        return o == this || o instanceof JsonArray && ((JsonArray)o).elements.equals(this.elements);
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public void add(Boolean bool) {
        this.elements.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void add(String string) {
        this.elements.add(string == null ? JsonNull.INSTANCE : new JsonPrimitive(string));
    }

    public void add(JsonElement element) {
        if (element == null) {
            element = JsonNull.INSTANCE;
        }
        this.elements.add(element);
    }

    public void add(Character character) {
        this.elements.add(character == null ? JsonNull.INSTANCE : new JsonPrimitive(character));
    }

    public void add(Number number) {
        this.elements.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    @Override
    public Iterator<JsonElement> iterator() {
        return this.elements.iterator();
    }

    public boolean contains(JsonElement element) {
        return this.elements.contains(element);
    }

    public void addAll(JsonArray array) {
        this.elements.addAll(array.elements);
    }

    public JsonElement set(int index, JsonElement element) {
        return this.elements.set(index, element == null ? JsonNull.INSTANCE : element);
    }

    @Override
    public byte getAsByte() {
        return this.getAsSingleElement().getAsByte();
    }

    @Override
    public float getAsFloat() {
        return this.getAsSingleElement().getAsFloat();
    }

    @Override
    public short getAsShort() {
        return this.getAsSingleElement().getAsShort();
    }

    @Override
    public JsonArray deepCopy() {
        if (!this.elements.isEmpty()) {
            JsonArray result = new JsonArray(this.elements.size());
            for (JsonElement element : this.elements) {
                result.add(element.deepCopy());
            }
            return result;
        }
        return new JsonArray();
    }

    private JsonElement getAsSingleElement() {
        int size = this.elements.size();
        if (size == 1) {
            return this.elements.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override
    public double getAsDouble() {
        return this.getAsSingleElement().getAsDouble();
    }

    @Override
    public int getAsInt() {
        return this.getAsSingleElement().getAsInt();
    }

    @Override
    public long getAsLong() {
        return this.getAsSingleElement().getAsLong();
    }

    @Override
    public Number getAsNumber() {
        return this.getAsSingleElement().getAsNumber();
    }

    @Override
    public String getAsString() {
        return this.getAsSingleElement().getAsString();
    }

    @Override
    public BigDecimal getAsBigDecimal() {
        return this.getAsSingleElement().getAsBigDecimal();
    }

    @Override
    public BigInteger getAsBigInteger() {
        return this.getAsSingleElement().getAsBigInteger();
    }

    @Override
    @Deprecated
    public char getAsCharacter() {
        return this.getAsSingleElement().getAsCharacter();
    }
}

