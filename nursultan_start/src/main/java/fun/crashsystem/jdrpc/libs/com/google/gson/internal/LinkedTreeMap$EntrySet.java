/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal;

import fun.crashsystem.jdrpc.libs.com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class LinkedTreeMap$EntrySet
extends AbstractSet<Map.Entry<K, V>> {
    final /* synthetic */ LinkedTreeMap this$0;

    LinkedTreeMap$EntrySet(LinkedTreeMap this$0) {
        this.this$0 = this$0;
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        LinkedTreeMap.Node node = this.this$0.findByEntry((Map.Entry)o);
        if (node == null) {
            return false;
        }
        this.this$0.removeInternal(node, true);
        return true;
    }

    @Override
    public int size() {
        return this.this$0.size;
    }

    @Override
    public void clear() {
        this.this$0.clear();
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new LinkedTreeMap.LinkedTreeMapIterator<Map.Entry<K, V>>(){};
    }

    @Override
    public boolean contains(Object o) {
        return o instanceof Map.Entry && this.this$0.findByEntry((Map.Entry)o) != null;
    }
}

