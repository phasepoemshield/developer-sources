/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonArray;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonNull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject$1;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject$Entry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.MarshallerImpl;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.CommentSerializer;

public class JsonObject
extends JsonElement
implements Map<String, JsonElement> {
    protected Marshaller marshaller = MarshallerImpl.getFallback();
    private List<JsonObject$Entry> entries = new ArrayList<JsonObject$Entry>();

    @Override
    @Nullable
    public JsonElement remove(@Nullable Object object) {
        if (object == null || !(object instanceof String)) {
            return null;
        }
        for (int i = 0; i < this.entries.size(); ++i) {
            JsonObject$Entry jsonObject$Entry = this.entries.get(i);
            if (!jsonObject$Entry.key.equalsIgnoreCase((String)object)) continue;
            return this.entries.remove((int)i).value;
        }
        return null;
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Nullable
    public <E> E get(@Nonnull Class<E> clazz, @Nonnull String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Cannot get from empty key");
        }
        Object object = this.get(string);
        return this.marshaller.marshall(clazz, (JsonElement)object);
    }

    @Override
    @Nullable
    public JsonElement get(@Nullable Object object) {
        if (object == null || !(object instanceof String)) {
            return null;
        }
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase((String)object)) continue;
            return jsonObject$Entry.value;
        }
        return null;
    }

    @Override
    @Nullable
    public JsonElement put(@Nonnull String string, @Nonnull JsonElement jsonElement) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            JsonElement jsonElement2 = jsonObject$Entry.value;
            jsonObject$Entry.value = jsonElement;
            return jsonElement2;
        }
        JsonObject$Entry jsonObject$Entry = new JsonObject$Entry(null);
        jsonObject$Entry.key = string;
        jsonObject$Entry.value = jsonElement;
        this.entries.add(jsonObject$Entry);
        return null;
    }

    public JsonElement put(@Nonnull String string, @Nonnull JsonElement jsonElement, @Nullable String string2) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            JsonElement jsonElement2 = jsonObject$Entry.value;
            jsonObject$Entry.value = jsonElement;
            jsonObject$Entry.comment = string2;
            return jsonElement2;
        }
        JsonObject$Entry jsonObject$Entry = new JsonObject$Entry(null);
        if (jsonElement instanceof JsonObject) {
            ((JsonObject)jsonElement).marshaller = this.marshaller;
        }
        if (jsonElement instanceof JsonArray) {
            ((JsonArray)jsonElement).marshaller = this.marshaller;
        }
        jsonObject$Entry.key = string;
        jsonObject$Entry.value = jsonElement;
        jsonObject$Entry.comment = string2;
        this.entries.add(jsonObject$Entry);
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof JsonObject)) {
            return false;
        }
        JsonObject jsonObject = (JsonObject)object;
        if (this.entries.size() != jsonObject.entries.size()) {
            return false;
        }
        for (int i = 0; i < this.entries.size(); ++i) {
            JsonObject$Entry jsonObject$Entry;
            JsonObject$Entry jsonObject$Entry2 = this.entries.get(i);
            if (jsonObject$Entry2.equals(jsonObject$Entry = jsonObject.entries.get(i))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return this.toJson(true, false, 0);
    }

    @Override
    public Collection<JsonElement> values() {
        ArrayList<JsonElement> arrayList = new ArrayList<JsonElement>();
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            arrayList.add(jsonObject$Entry.value);
        }
        return arrayList;
    }

    @Override
    public int hashCode() {
        return this.entries.hashCode();
    }

    @Override
    public JsonObject clone() {
        JsonObject jsonObject = new JsonObject();
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            jsonObject.put(jsonObject$Entry.key, (JsonElement)jsonObject$Entry.value.clone(), jsonObject$Entry.comment);
        }
        jsonObject.marshaller = this.marshaller;
        return jsonObject;
    }

    public boolean getBoolean(@Nonnull String string, boolean bl) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asBoolean(bl);
        }
        return bl;
    }

    public byte getByte(@Nonnull String string, byte by) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asByte(by);
        }
        return by;
    }

    public short getShort(@Nonnull String string, short s) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asShort(s);
        }
        return s;
    }

    public char getChar(@Nonnull String string, char c) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asChar(c);
        }
        return c;
    }

    public int getInt(@Nonnull String string, int n) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asInt(n);
        }
        return n;
    }

    public long getLong(@Nonnull String string, long l) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asLong(l);
        }
        return l;
    }

    public float getFloat(@Nonnull String string, float f) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asFloat(f);
        }
        return f;
    }

    public double getDouble(@Nonnull String string, double d) {
        Object object = this.get(string);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asDouble(d);
        }
        return d;
    }

    @Override
    public void clear() {
        this.entries.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override
    public Set<Map.Entry<String, JsonElement>> entrySet() {
        LinkedHashSet<Map.Entry<String, JsonElement>> linkedHashSet = new LinkedHashSet<Map.Entry<String, JsonElement>>();
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            linkedHashSet.add(new JsonObject$1(this, jsonObject$Entry));
        }
        return linkedHashSet;
    }

    @Override
    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        for (Map.Entry<? extends String, ? extends JsonElement> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public boolean containsKey(@Nullable Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof String)) {
            return false;
        }
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase((String)object)) continue;
            return true;
        }
        return false;
    }

    @Override
    @Nonnull
    public Set<String> keySet() {
        HashSet<String> hashSet = new HashSet<String>();
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            hashSet.add(jsonObject$Entry.key);
        }
        return hashSet;
    }

    @Override
    public boolean containsValue(@Nullable Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof JsonElement)) {
            return false;
        }
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.value.equals(object)) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public JsonObject getObject(@Nonnull String string) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            if (jsonObject$Entry.value instanceof JsonObject) {
                return (JsonObject)jsonObject$Entry.value;
            }
            return null;
        }
        return null;
    }

    @Nullable
    public String getComment(@Nonnull String string) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            return jsonObject$Entry.comment;
        }
        return null;
    }

    public void setComment(@Nonnull String string, @Nullable String string2) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            jsonObject$Entry.comment = string2;
            return;
        }
    }

    @Override
    public String toJson(JsonGrammar jsonGrammar, int n) {
        int n2;
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = n == 0 && jsonGrammar.bareRootObject;
        int n4 = jsonGrammar.bareRootObject ? Math.max(n - 1, 0) : n;
        int n5 = n3 = jsonGrammar.bareRootObject ? n : n + 1;
        if (!bl) {
            stringBuilder.append("{");
            if (jsonGrammar.printWhitespace && this.entries.size() > 0) {
                stringBuilder.append('\n');
            } else {
                stringBuilder.append(' ');
            }
        }
        for (n2 = 0; n2 < this.entries.size(); ++n2) {
            int n6;
            JsonObject$Entry jsonObject$Entry = this.entries.get(n2);
            if (jsonGrammar.printWhitespace) {
                for (n6 = 0; n6 < n3; ++n6) {
                    stringBuilder.append("\t");
                }
            }
            CommentSerializer.print(stringBuilder, jsonObject$Entry.comment, Math.max(n4, 0), jsonGrammar);
            int n7 = n6 = !jsonGrammar.printUnquotedKeys ? 1 : 0;
            if (jsonObject$Entry.key.contains(" ")) {
                n6 = 1;
            }
            if (n6 != 0) {
                stringBuilder.append("\"");
            }
            stringBuilder.append(jsonObject$Entry.key);
            if (n6 != 0) {
                stringBuilder.append("\"");
            }
            stringBuilder.append(": ");
            stringBuilder.append(jsonObject$Entry.value.toJson(jsonGrammar, n + 1));
            if (jsonGrammar.printCommas) {
                if (n2 < this.entries.size() - 1 || jsonGrammar.printTrailingCommas) {
                    stringBuilder.append(",");
                    if (n2 < this.entries.size() - 1 && !jsonGrammar.printWhitespace) {
                        stringBuilder.append(' ');
                    }
                }
            } else {
                stringBuilder.append(" ");
            }
            if (!jsonGrammar.printWhitespace) continue;
            stringBuilder.append('\n');
        }
        if (!bl) {
            if (this.entries.size() > 0) {
                if (jsonGrammar.printWhitespace) {
                    for (n2 = 0; n2 < n4; ++n2) {
                        stringBuilder.append("\t");
                    }
                } else {
                    stringBuilder.append(' ');
                }
            }
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toJson(boolean bl, boolean bl2, int n) {
        JsonGrammar jsonGrammar = JsonGrammar.builder().withComments(bl).printWhitespace(bl2).build();
        return this.toJson(jsonGrammar, n);
    }

    public <E extends JsonElement> E recursiveGetOrCreate(@Nonnull Class<E> clazz, @Nonnull String string, @Nonnull E e, @Nullable String string2) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Cannot get from empty key");
        }
        String[] stringArray = string.split("\\.");
        Object object = this;
        for (int i = 0; i < stringArray.length; ++i) {
            Object object2;
            String string3 = stringArray[i];
            if (string3.isEmpty()) {
                throw new IllegalArgumentException("Cannot get from broken key '" + string + "'");
            }
            Object object3 = ((JsonObject)object).get(string3);
            if (i < stringArray.length - 1) {
                if (object3 instanceof JsonObject) {
                    object = (JsonObject)object3;
                    continue;
                }
                object2 = new JsonObject();
                ((JsonObject)object).put(string3, (JsonElement)object2);
                object = object2;
                continue;
            }
            if (object3 != null && clazz.isAssignableFrom(object3.getClass())) {
                return (E)object3;
            }
            object2 = e.clone();
            ((JsonObject)object).put(string, (JsonElement)object2, string2);
            return (E)object2;
        }
        throw new IllegalArgumentException("Cannot get from broken key '" + string + "'");
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    @Nullable
    public <E> E recursiveGet(@Nonnull Class<E> clazz, @Nonnull String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Cannot get from empty key");
        }
        String[] stringArray = string.split("\\.");
        JsonObject jsonObject = this;
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.isEmpty()) {
                throw new IllegalArgumentException("Cannot get from broken key '" + string + "'");
            }
            Object object = jsonObject.get(string2);
            if (i < stringArray.length - 1) {
                if (!(object instanceof JsonObject)) {
                    return null;
                }
            } else {
                return this.marshaller.marshall(clazz, (JsonElement)object);
            }
            jsonObject = (JsonObject)object;
        }
        throw new IllegalArgumentException("Cannot get from broken key '" + string + "'");
    }

    @Nullable
    public <T> T putDefault(@Nonnull String string, @Nonnull T t, @Nullable String string2) {
        return this.putDefault(string, t, t.getClass(), string2);
    }

    @Nonnull
    public JsonElement putDefault(@Nonnull String string, @Nonnull JsonElement jsonElement, @Nullable String string2) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            return jsonObject$Entry.value;
        }
        JsonObject$Entry jsonObject$Entry = new JsonObject$Entry(null);
        jsonObject$Entry.key = string;
        jsonObject$Entry.value = jsonElement;
        jsonObject$Entry.comment = string2;
        this.entries.add(jsonObject$Entry);
        return jsonElement;
    }

    @Nullable
    public <T> T putDefault(@Nonnull String string, @Nonnull T t, Class<? extends T> clazz, @Nullable String string2) {
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            if (!jsonObject$Entry.key.equalsIgnoreCase(string)) continue;
            return this.marshaller.marshall(clazz, jsonObject$Entry.value);
        }
        JsonObject$Entry jsonObject$Entry = new JsonObject$Entry(null);
        jsonObject$Entry.key = string;
        jsonObject$Entry.value = this.marshaller.serialize(t);
        if (jsonObject$Entry.value == null) {
            jsonObject$Entry.value = JsonNull.INSTANCE;
        }
        jsonObject$Entry.comment = string2;
        this.entries.add(jsonObject$Entry);
        return t;
    }

    @Nonnull
    public JsonObject getDelta(@Nonnull JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        for (JsonObject$Entry jsonObject$Entry : this.entries) {
            String string = jsonObject$Entry.key;
            Object object = jsonObject.get(string);
            if (object == null) {
                jsonObject2.put(jsonObject$Entry.key, jsonObject$Entry.value, jsonObject$Entry.comment);
                continue;
            }
            if (jsonObject$Entry.value instanceof JsonObject && object instanceof JsonObject) {
                JsonObject jsonObject3 = ((JsonObject)jsonObject$Entry.value).getDelta((JsonObject)object);
                if (jsonObject3.isEmpty()) continue;
                jsonObject2.put(jsonObject$Entry.key, jsonObject3, jsonObject$Entry.comment);
                continue;
            }
            if (jsonObject$Entry.value.equals(object)) continue;
            jsonObject2.put(jsonObject$Entry.key, jsonObject$Entry.value, jsonObject$Entry.comment);
        }
        return jsonObject2;
    }
}

