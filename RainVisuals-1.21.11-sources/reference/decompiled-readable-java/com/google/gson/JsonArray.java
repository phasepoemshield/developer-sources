/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray
extends JsonElement
implements Iterable<JsonElement> {
    private final ArrayList<JsonElement> elements;

    public boolean contains(JsonElement element) {
        return this.elements.contains(element);
    }

    @Override
    public String getAsString() {
        return this.getAsSingleElement().getAsString();
    }

    @Override
    public long getAsLong() {
        return this.getAsSingleElement().getAsLong();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public void add(Boolean bool) {
        this.elements.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    @Override
    public short getAsShort() {
        return this.getAsSingleElement().getAsShort();
    }

    public void add(Character character) {
        this.elements.add(character == null ? JsonNull.INSTANCE : new JsonPrimitive(character));
    }

    public List<JsonElement> asList() {
        return new NonNullElementWrapperList<JsonElement>(this.elements);
    }

    public JsonArray(int capacity) {
        this.elements = new ArrayList(capacity);
    }

    @Override
    public byte getAsByte() {
        return this.getAsSingleElement().getAsByte();
    }

    @Override
    public int getAsInt() {
        return this.getAsSingleElement().getAsInt();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonArray deepCopy() {
        if (!this.elements.isEmpty()) {
            void var1_1;
            JsonArray result = new JsonArray(this.elements.size());
            Iterator<JsonElement> iterator2 = this.elements.iterator();
            while (iterator2.hasNext()) {
                JsonElement element = iterator2.next();
                result.add(element.deepCopy());
            }
            return var1_1;
        }
        return new JsonArray();
    }

    public JsonElement set(int index, JsonElement element) {
        return this.elements.set(index, element == null ? JsonNull.INSTANCE : element);
    }

    public JsonArray() {
        this.elements = new ArrayList();
    }

    public boolean remove(JsonElement element) {
        return this.elements.remove(element);
    }

    @Override
    public Number getAsNumber() {
        return this.getAsSingleElement().getAsNumber();
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

    public void add(Number number) {
        this.elements.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    @Override
    public double getAsDouble() {
        return this.getAsSingleElement().getAsDouble();
    }

    public boolean equals(Object o) {
        return o == this || o instanceof JsonArray && ((JsonArray)o).elements.equals(this.elements);
    }

    public void addAll(JsonArray array) {
        this.elements.addAll(array.elements);
    }

    public void add(String string) {
        this.elements.add(string == null ? JsonNull.INSTANCE : new JsonPrimitive(string));
    }

    @Override
    public Iterator<JsonElement> iterator() {
        return this.elements.iterator();
    }

    public int size() {
        return this.elements.size();
    }

    @Override
    public boolean getAsBoolean() {
        return this.getAsSingleElement().getAsBoolean();
    }

    @Override
    public BigDecimal getAsBigDecimal() {
        return this.getAsSingleElement().getAsBigDecimal();
    }

    private JsonElement getAsSingleElement() {
        int size = this.elements.size();
        if (size == 1) {
            return this.elements.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public JsonElement remove(int index) {
        return this.elements.remove(index);
    }

    public void add(JsonElement element) {
        if (element == null) {
            element = JsonNull.INSTANCE;
        }
        this.elements.add(element);
    }

    public JsonElement get(int i) {
        return this.elements.get(i);
    }

    @Override
    public float getAsFloat() {
        return this.getAsSingleElement().getAsFloat();
    }

    public int hashCode() {
        return this.elements.hashCode();
    }
}

