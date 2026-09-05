/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.util.List;
import java.util.ListIterator;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonArray$Entry;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;

class JsonArray$EntryIterator
implements ListIterator<JsonElement> {
    private final ListIterator<JsonArray$Entry> delegate;

    public JsonArray$EntryIterator(List<JsonArray$Entry> list) {
        this.delegate = list.listIterator();
    }

    public JsonArray$EntryIterator(List<JsonArray$Entry> list, int n) {
        this.delegate = list.listIterator(n);
    }

    @Override
    public void remove() {
        this.delegate.remove();
    }

    @Override
    public void add(JsonElement jsonElement) {
        this.delegate.add(new JsonArray$Entry(jsonElement));
    }

    @Override
    public boolean hasNext() {
        return this.delegate.hasNext();
    }

    @Override
    public JsonElement next() {
        return this.delegate.next().value;
    }

    @Override
    public void set(JsonElement jsonElement) {
        this.delegate.set(new JsonArray$Entry(jsonElement));
    }

    @Override
    public int previousIndex() {
        return this.delegate.previousIndex();
    }

    @Override
    public boolean hasPrevious() {
        return this.delegate.hasPrevious();
    }

    @Override
    public JsonElement previous() {
        return this.delegate.previous().value;
    }

    @Override
    public int nextIndex() {
        return this.delegate.nextIndex();
    }
}

