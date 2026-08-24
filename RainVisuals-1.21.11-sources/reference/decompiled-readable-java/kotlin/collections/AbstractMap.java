/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\f\b'\u0018\u0000 1*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00011B\t\b\u0004\u00a2\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\b\u001e\u0010!J#\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\b\u00a2\u0006\u0004\b\u001e\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010&8\b@\bX\u0088\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000#8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/\u00a8\u00062"}, d2={"Lkotlin/collections/AbstractMap;", "K", "V", "", "<init>", "()V", "", "entry", "", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "o", "(Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "", "_keys", "Ljava/util/Set;", "", "_values", "Ljava/util/Collection;", "getKeys", "()Ljava/util/Set;", "keys", "getSize", "size", "getValues", "()Ljava/util/Collection;", "values", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract class AbstractMap<K, V>
implements Map<K, V>,
KMappedMarker {
    @Nullable
    private volatile Set<? extends K> _keys;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private volatile Collection<? extends V> _values;

    public int getSize() {
        return this.entrySet().size();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(@Nullable Object other) {
        void var6_6;
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        if (this.size() != ((Map)other).size()) {
            return false;
        }
        Iterable $this$all$iv = ((Map)other).entrySet();
        boolean $i$f$all = false;
        if ($this$all$iv instanceof Collection) {
            if (((Collection)$this$all$iv).isEmpty()) {
                return true;
            }
        }
        Iterator iterator2 = $this$all$iv.iterator();
        do {
            if (!iterator2.hasNext()) return true;
            Object element$iv = iterator2.next();
            Map.Entry it = (Map.Entry)element$iv;
            boolean bl = false;
        } while (this.containsEntry$kotlin_stdlib((Map.Entry<?, ?>)var6_6));
        return false;
    }

    @NotNull
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new AbstractCollection<V>(this){
                final /* synthetic */ AbstractMap<K, V> this$0;

                @NotNull
                public Iterator<V> iterator() {
                    Iterator<Map.Entry<K, V>> entryIterator = this.this$0.entrySet().iterator();
                    return new Iterator<V>(entryIterator){
                        final /* synthetic */ Iterator<Map.Entry<K, V>> $entryIterator;

                        public boolean hasNext() {
                            return this.$entryIterator.hasNext();
                        }

                        public V next() {
                            return this.$entryIterator.next().getValue();
                        }

                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                        {
                            this.$entryIterator = $entryIterator;
                        }
                    };
                }

                public int getSize() {
                    return this.this$0.size();
                }

                public boolean contains(Object element) {
                    return this.this$0.containsValue(element);
                }
                {
                    this.this$0 = $receiver;
                }
            };
        }
        Collection<? extends V> collection = this._values;
        Intrinsics.checkNotNull(collection);
        return collection;
    }

    @NotNull
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new AbstractSet<K>(this){
                final /* synthetic */ AbstractMap<K, V> this$0;
                {
                    this.this$0 = $receiver;
                }

                public boolean contains(Object element) {
                    return this.this$0.containsKey(element);
                }

                public int getSize() {
                    return this.this$0.size();
                }

                @NotNull
                public Iterator<K> iterator() {
                    Iterator<Map.Entry<K, V>> entryIterator = this.this$0.entrySet().iterator();
                    return new Iterator<K>(entryIterator){
                        final /* synthetic */ Iterator<Map.Entry<K, V>> $entryIterator;

                        public K next() {
                            return this.$entryIterator.next().getKey();
                        }

                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }

                        public boolean hasNext() {
                            return this.$entryIterator.hasNext();
                        }
                        {
                            this.$entryIterator = $entryIterator;
                        }
                    };
                }
            };
        }
        Set<? extends K> set = this._keys;
        Intrinsics.checkNotNull(set);
        return set;
    }

    protected AbstractMap() {
    }

    public static final /* synthetic */ String access$toString(AbstractMap $this, Map.Entry entry) {
        return $this.toString(entry);
    }

    @Override
    public V put(K key, V value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return ((Object)this.entrySet()).hashCode();
    }

    @Override
    public V remove(Object key) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean containsValue(Object value) {
        Map.Entry it;
        Iterable $this$any$iv = this.entrySet();
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            it = (Map.Entry)element$iv;
            boolean bl = false;
        } while (!Intrinsics.areEqual(it.getValue(), value));
        return true;
    }

    private final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return this.toString(entry.getKey()) + '=' + this.toString(entry.getValue());
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> from) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @Nullable
    public V get(Object key) {
        Map.Entry<Object, V> entry = this.implFindEntry(key);
        return (V)(entry != null ? entry.getValue() : null);
    }

    public final boolean containsEntry$kotlin_stdlib(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Map map = this;
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object ourValue = map.get(key);
        if (!Intrinsics.areEqual(value, ourValue)) {
            return false;
        }
        if (ourValue == null) {
            Map map2 = this;
            Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            if (!map2.containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.entrySet(), ", ", "{", "}", 0, null, new Function1<Map.Entry<? extends K, ? extends V>, CharSequence>(this){
            final /* synthetic */ AbstractMap<K, V> this$0;
            {
                this.this$0 = $receiver;
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull Map.Entry<? extends K, ? extends V> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractMap.access$toString(this.this$0, it);
            }
        }, 24, null);
    }

    private final Map.Entry<K, V> implFindEntry(K key) {
        Object v0;
        block1: {
            Iterable $this$firstOrNull$iv = this.entrySet();
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                Map.Entry it = (Map.Entry)element$iv;
                boolean bl = false;
                if (!Intrinsics.areEqual(it.getKey(), key)) continue;
                v0 = element$iv;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    public abstract Set getEntries();

    @Override
    public boolean containsKey(Object key) {
        return this.implFindEntry(key) != null;
    }

    private final String toString(Object o) {
        return o == this ? "(this Map)" : String.valueOf(o);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u00072\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2={"Lkotlin/collections/AbstractMap$Companion;", "", "<init>", "()V", "", "e", "other", "", "entryEquals$kotlin_stdlib", "(Ljava/util/Map$Entry;Ljava/lang/Object;)Z", "entryEquals", "", "entryHashCode$kotlin_stdlib", "(Ljava/util/Map$Entry;)I", "entryHashCode", "", "entryToString$kotlin_stdlib", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "entryToString", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean entryEquals$kotlin_stdlib(@NotNull Map.Entry<?, ?> e, @Nullable Object other) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            if (!Intrinsics.areEqual(e.getKey(), ((Map.Entry)other).getKey())) return false;
            if (!Intrinsics.areEqual(e.getValue(), ((Map.Entry)other).getValue())) return false;
            return true;
        }

        @NotNull
        public final String entryToString$kotlin_stdlib(@NotNull Map.Entry<?, ?> e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Map.Entry<?, ?> $this$entryToString_u24lambda_u241 = e;
            boolean bl = false;
            return "" + $this$entryToString_u24lambda_u241.getKey() + '=' + $this$entryToString_u24lambda_u241.getValue();
        }

        private Companion() {
        }

        public final int entryHashCode$kotlin_stdlib(@NotNull Map.Entry<?, ?> e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Map.Entry<?, ?> $this$entryHashCode_u24lambda_u240 = e;
            boolean bl = false;
            Object obj = $this$entryHashCode_u24lambda_u240.getKey();
            Object obj2 = $this$entryHashCode_u24lambda_u240.getValue();
            return (obj != null ? obj.hashCode() : 0) ^ (obj2 != null ? obj2.hashCode() : 0);
        }
    }
}

