/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.MarshallerImpl
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.CommentSerializer
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonArray$Entry;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonArray$EntryIterator;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.MarshallerImpl;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.CommentSerializer;

public class JsonArray
extends JsonElement
implements Iterable<JsonElement>,
List<JsonElement> {
    private List<JsonArray$Entry> entries = new ArrayList<JsonArray$Entry>();
    protected Marshaller marshaller = MarshallerImpl.getFallback();

    public String getString(int n, String string) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asString();
        }
        return string;
    }

    public JsonArray() {
    }

    public JsonArray(Collection<?> collection, Marshaller marshaller) {
        this.marshaller = marshaller;
        for (Object obj : collection) {
            this.add(marshaller.serialize(obj));
        }
    }

    public <T> JsonArray(T[] TArray, Marshaller marshaller) {
        this.marshaller = marshaller;
        for (T t : TArray) {
            this.add(marshaller.serialize(t));
        }
    }

    @Override
    public JsonElement remove(int n) {
        return this.entries.remove((int)n).value;
    }

    @Override
    public boolean remove(Object object) {
        for (int i = 0; i < this.entries.size(); ++i) {
            JsonArray$Entry jsonArray$Entry = this.entries.get(i);
            if (!jsonArray$Entry.value.equals(object)) continue;
            this.entries.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Nullable
    public <E> E get(@Nonnull Class<E> clazz, int n) {
        Object object = this.get(n);
        return this.marshaller.marshall(clazz, (JsonElement)object);
    }

    @Override
    public JsonElement get(int n) {
        return this.entries.get((int)n).value;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof JsonArray)) {
            return false;
        }
        List<JsonArray$Entry> list = this.entries;
        List<JsonArray$Entry> list2 = ((JsonArray)object).entries;
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); ++i) {
            JsonArray$Entry jsonArray$Entry = list.get(i);
            JsonArray$Entry jsonArray$Entry2 = list2.get(i);
            if (!jsonArray$Entry.value.equals(jsonArray$Entry2.value)) {
                return false;
            }
            if (Objects.equals(jsonArray$Entry.getComment(), jsonArray$Entry2.getComment())) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return this.toJson(true, false, 0);
    }

    @Override
    public int hashCode() {
        return this.entries.hashCode();
    }

    @Override
    public JsonArray clone() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.marshaller = this.marshaller;
        for (JsonArray$Entry jsonArray$Entry : this.entries) {
            jsonArray.add((JsonElement)jsonArray$Entry.value.clone(), jsonArray$Entry.getComment());
        }
        return jsonArray;
    }

    @Override
    public int indexOf(Object object) {
        if (object == null) {
            return -1;
        }
        for (int i = 0; i < this.entries.size(); ++i) {
            JsonElement jsonElement = this.entries.get((int)i).value;
            if (jsonElement == null || !jsonElement.equals(object)) continue;
            return i;
        }
        return -1;
    }

    public boolean getBoolean(int n, boolean bl) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asBoolean(bl);
        }
        return bl;
    }

    public byte getByte(int n, byte by) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asByte(by);
        }
        return by;
    }

    public short getShort(int n, short s) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asShort(s);
        }
        return s;
    }

    public char getChar(int n, char c) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asChar(c);
        }
        return c;
    }

    public int getInt(int n, int n2) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asInt(n2);
        }
        return n2;
    }

    public long getLong(int n, long l) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asLong(l);
        }
        return l;
    }

    public float getFloat(int n, float f) {
        Object object = this.get(n);
        if (object != null && object instanceof JsonPrimitive) {
            return ((JsonPrimitive)object).asFloat(f);
        }
        return f;
    }

    public double getDouble(int n, double d) {
        Object object = this.get(n);
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
    public int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        }
        for (int i = this.entries.size() - 1; i >= 0; --i) {
            JsonElement jsonElement = this.entries.get((int)i).value;
            if (jsonElement == null || !jsonElement.equals(object)) continue;
            return i;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override
    public void add(int n, JsonElement jsonElement) {
        this.entries.add(n, new JsonArray$Entry(jsonElement));
    }

    public boolean add(@Nonnull JsonElement jsonElement, String string) {
        JsonArray$Entry jsonArray$Entry = new JsonArray$Entry();
        jsonArray$Entry.value = jsonElement;
        jsonArray$Entry.setComment(string);
        this.entries.add(jsonArray$Entry);
        return true;
    }

    @Override
    public boolean add(@Nonnull JsonElement jsonElement) {
        JsonArray$Entry jsonArray$Entry = new JsonArray$Entry();
        jsonArray$Entry.value = jsonElement;
        this.entries.add(jsonArray$Entry);
        return true;
    }

    @Override
    public List<JsonElement> subList(int n, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] objectArray) {
        if (objectArray.length < this.entries.size()) {
            objectArray = new Object[this.entries.size()];
        }
        for (int i = 0; i < this.entries.size(); ++i) {
            objectArray[i] = this.entries.get((int)i).value;
        }
        if (objectArray.length > this.entries.size()) {
            objectArray[this.entries.size()] = null;
        }
        return objectArray;
    }

    public JsonElement[] toArray() {
        JsonElement[] jsonElementArray = new JsonElement[this.entries.size()];
        for (int i = 0; i < this.entries.size(); ++i) {
            jsonElementArray[i] = this.entries.get((int)i).value;
        }
        return jsonElementArray;
    }

    @Override
    public Iterator<JsonElement> iterator() {
        return new JsonArray$EntryIterator(this.entries);
    }

    @Override
    public boolean contains(Object object) {
        if (object == null || !(object instanceof JsonElement)) {
            return false;
        }
        for (JsonArray$Entry jsonArray$Entry : this.entries) {
            if (!jsonArray$Entry.value.equals(object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends JsonElement> collection) {
        boolean bl = false;
        for (JsonElement jsonElement : collection) {
            bl |= this.add(jsonElement);
        }
        return bl;
    }

    @Override
    public boolean addAll(int n, Collection<? extends JsonElement> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = n;
        for (JsonElement jsonElement : collection) {
            this.entries.add(n2, new JsonArray$Entry(jsonElement));
            ++n2;
        }
        return true;
    }

    @Override
    public JsonElement set(int n, JsonElement jsonElement) {
        JsonArray$Entry jsonArray$Entry = new JsonArray$Entry(jsonElement);
        JsonArray$Entry jsonArray$Entry2 = this.entries.get(n);
        if (jsonArray$Entry2 != null) {
            jsonArray$Entry.setComment(jsonArray$Entry2.getComment());
        }
        this.entries.set(n, jsonArray$Entry);
        return jsonArray$Entry2 == null ? null : jsonArray$Entry2.value;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("removeAll not supported");
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("retainAll not supported");
    }

    @Override
    public ListIterator<JsonElement> listIterator(int n) {
        return new JsonArray$EntryIterator(this.entries, n);
    }

    @Override
    public ListIterator<JsonElement> listIterator() {
        return new JsonArray$EntryIterator(this.entries);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object obj : collection) {
            if (this.contains(obj)) continue;
            return false;
        }
        return true;
    }

    public String getComment(int n) {
        return this.entries.get(n).getComment();
    }

    public void setComment(int n, String string) {
        this.entries.get(n).setComment(string);
    }

    @Override
    public void toJson(Writer writer, JsonGrammar jsonGrammar, int n) throws IOException {
        int n2;
        int n3 = jsonGrammar.bareRootObject ? n - 1 : n;
        writer.append("[");
        if (this.entries.size() > 0) {
            if (jsonGrammar.printWhitespace) {
                writer.append('\n');
            } else {
                writer.append(' ');
            }
        }
        for (n2 = 0; n2 < this.entries.size(); ++n2) {
            JsonArray$Entry jsonArray$Entry = this.entries.get(n2);
            if (jsonGrammar.printWhitespace) {
                for (int i = 0; i < n3 + 1; ++i) {
                    writer.append("\t");
                }
            }
            CommentSerializer.print((Writer)writer, (String)jsonArray$Entry.getComment(), (int)n3, (JsonGrammar)jsonGrammar);
            writer.append(jsonArray$Entry.value.toJson(jsonGrammar, n + 1));
            if (jsonGrammar.printCommas) {
                if (n2 < this.entries.size() - 1 || jsonGrammar.printTrailingCommas) {
                    writer.append(",");
                    if (n2 < this.entries.size() - 1 && !jsonGrammar.printWhitespace) {
                        writer.append(' ');
                    }
                }
            } else {
                writer.append(" ");
            }
            if (!jsonGrammar.printWhitespace) continue;
            writer.append('\n');
        }
        if (this.entries.size() > 0 && jsonGrammar.printWhitespace && n > 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                writer.append("\t");
            }
        }
        if (this.entries.size() > 0 && !jsonGrammar.printWhitespace) {
            writer.append(' ');
        }
        writer.append(']');
    }

    @Override
    public String toJson(boolean bl, boolean bl2, int n) {
        JsonGrammar jsonGrammar = JsonGrammar.builder().withComments(bl).printWhitespace(bl2).build();
        return this.toJson(jsonGrammar, n);
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }
}

