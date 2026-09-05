/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.registry;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Registry<V> {
    private final Deque<V> _entries = new LinkedList<V>();
    private final Set<V> registered = new HashSet<V>();
    public final Collection<V> entries = Collections.unmodifiableCollection(this._entries);

    public Iterator<V> iterator() {
        return this._entries.iterator();
    }

    public Stream<V> stream() {
        return this._entries.stream();
    }

    public boolean register(V v) {
        if (!this.registered(v)) {
            this._entries.addFirst(v);
            this.registered.add(v);
            return true;
        }
        return false;
    }

    public void unregister(V v) {
        if (!this.registered(v)) {
            return;
        }
        this._entries.remove(v);
        this.registered.remove(v);
    }

    public Iterator<V> descendingIterator() {
        return this._entries.descendingIterator();
    }

    public boolean registered(V v) {
        return this.registered.contains(v);
    }

    public Stream<V> descendingStream() {
        return StreamSupport.stream(Spliterators.spliterator(this.descendingIterator(), (long)this._entries.size(), 16448), false);
    }
}

