/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.collections.builders.ListBuilderKt;
import kotlin.collections.builders.MapBuilderEntries;
import kotlin.collections.builders.MapBuilderKeys;
import kotlin.collections.builders.MapBuilderValues;
import kotlin.collections.builders.SerializedMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0092\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\f\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001B\t\b\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u0006\u0010\nBG\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0004\b\u0006\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001dH\u0000\u00a2\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010 \u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b!\u0010\u0007J\u001b\u0010'\u001a\u00020$2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0000\u00a2\u0006\u0004\b%\u0010&J#\u0010,\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0000\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020$2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020$2\u0006\u0010/\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020$2\u000e\u00101\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0002\u00a2\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b5\u0010\nJ\u0017\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b7\u0010\nJ\u001b\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000\u00a2\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u00010<H\u0096\u0002\u00a2\u0006\u0004\b=\u0010.J\u0017\u0010>\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b>\u0010\u0016J\u0017\u0010?\u001a\u00020\b2\u0006\u0010/\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\b?\u0010\u0016J\u001a\u0010@\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\bB\u0010\u0016J\u000f\u0010C\u001a\u00020\bH\u0016\u00a2\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016\u00a2\u0006\u0004\bE\u0010FJ\u001b\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000\u00a2\u0006\u0004\bH\u0010IJ!\u0010K\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\bK\u0010LJ%\u0010N\u001a\u00020\u001d2\u0014\u0010M\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0016\u00a2\u0006\u0004\bN\u0010OJ)\u0010P\u001a\u00020$2\u0018\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(0\"H\u0002\u00a2\u0006\u0004\bP\u0010&J#\u0010Q\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002\u00a2\u0006\u0004\bQ\u0010+J\u0017\u0010S\u001a\u00020$2\u0006\u0010R\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bU\u0010\u0007J\u0017\u0010W\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bW\u0010\nJ\u0019\u0010X\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bX\u0010AJ#\u0010Z\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0000\u00a2\u0006\u0004\bY\u0010+J\u0017\u0010\\\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\\\u0010\nJ\u0017\u0010^\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\b]\u0010\u0016J\u0017\u0010`\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b`\u0010\nJ\u0017\u0010c\u001a\u00020$2\u0006\u0010a\u001a\u00028\u0001H\u0000\u00a2\u0006\u0004\bb\u0010.J\u0017\u0010e\u001a\u00020$2\u0006\u0010d\u001a\u00020\bH\u0002\u00a2\u0006\u0004\be\u0010TJ\u000f\u0010g\u001a\u00020fH\u0016\u00a2\u0006\u0004\bg\u0010hJ\u001b\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iH\u0000\u00a2\u0006\u0004\bj\u0010kJ\u000f\u0010m\u001a\u00020<H\u0002\u00a2\u0006\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020\b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\bo\u0010DR&\u0010u\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010r0q8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bs\u0010tR$\u0010w\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010yR\u0016\u0010z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b|\u0010DR&\u0010\u007f\u001a\u00020$2\u0006\u0010~\u001a\u00020$8\u0000@BX\u0080\u000e\u00a2\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010FR\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000q8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\f\u0010\u0084\u0001R\"\u0010\u0086\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010{R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010{R\u0018\u0010\u0088\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0088\u0001\u0010{R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010yR'\u0010\u0089\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020\b8\u0016@RX\u0096\u000e\u00a2\u0006\u000e\n\u0005\b\u0089\u0001\u0010{\u001a\u0005\b\u008a\u0001\u0010DR\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008b\u00018VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\r\u0010\u0084\u0001R\"\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u00a8\u0006\u0098\u0001"}, d2={"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "key", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "addKey", "allocateValuesArray", "()[Ljava/lang/Object;", "", "build", "()Ljava/util/Map;", "", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "clear", "compact", "", "m", "", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "containsAllEntries", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "other", "contentEquals", "(Ljava/util/Map;)Z", "minCapacity", "ensureCapacity", "n", "ensureExtraCapacity", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator", "", "equals", "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "()I", "isEmpty", "()Z", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Ljava/util/Map;)V", "putAllEntries", "putEntry", "i", "putRehash", "(I)Z", "registerModification", "newHashSize", "rehash", "remove", "removeEntry$kotlin_stdlib", "removeEntry", "removedHash", "removeHashAt", "removeKey$kotlin_stdlib", "removeKey", "index", "removeKeyAt", "element", "removeValue$kotlin_stdlib", "removeValue", "extraCapacity", "shouldCompact", "", "toString", "()Ljava/lang/String;", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator", "writeReplace", "()Ljava/lang/Object;", "getCapacity$kotlin_stdlib", "capacity", "", "", "getEntries", "()Ljava/util/Set;", "entries", "Lkotlin/collections/builders/MapBuilderEntries;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "[I", "hashShift", "I", "getHashSize", "hashSize", "<set-?>", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "getKeys", "keys", "[Ljava/lang/Object;", "Lkotlin/collections/builders/MapBuilderKeys;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "modCount", "size", "getSize", "", "getValues", "()Ljava/util/Collection;", "values", "Lkotlin/collections/builders/MapBuilderValues;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"})
public final class MapBuilder<K, V>
implements Map<K, V>,
Serializable,
KMutableMap {
    private boolean isReadOnly;
    private int size;
    @NotNull
    private K[] keysArray;
    @NotNull
    private int[] presenceArray;
    @NotNull
    private int[] hashArray;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private int length;
    private static final int TOMBSTONE = -1;
    private int hashShift;
    private int maxProbeDistance;
    @Nullable
    private MapBuilderKeys<K> keysView;
    @Nullable
    private V[] valuesArray;
    @NotNull
    private static final MapBuilder Empty;
    private int modCount;
    @Nullable
    private MapBuilderEntries<K, V> entriesView;
    @Nullable
    private MapBuilderValues<V> valuesView;
    @NotNull
    public static final Companion Companion;
    private static final int INITIAL_CAPACITY = 8;
    private static final int MAGIC = -1640531527;

    /*
     * WARNING - void declaration
     */
    @Override
    public int hashCode() {
        void var1_1;
        int result = 0;
        EntriesItr<K, V> it = this.entriesIterator$kotlin_stdlib();
        while (it.hasNext()) {
            result += it.nextHashCode$kotlin_stdlib();
        }
        return (int)var1_1;
    }

    @NotNull
    public final Map<K, V> build() {
        Map map;
        this.checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (this.size() > 0) {
            map = this;
        } else {
            MapBuilder mapBuilder = Empty;
            Intrinsics.checkNotNull(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
            map = mapBuilder;
        }
        return map;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other == this || other instanceof Map && this.contentEquals((Map)other);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public V put(K key, V value) {
        void var2_2;
        this.checkIsMutable$kotlin_stdlib();
        int index = this.addKey$kotlin_stdlib(key);
        V[] valuesArray = this.allocateValuesArray();
        if (index < 0) {
            void var5_5;
            V oldValue = valuesArray[-index - 1];
            valuesArray[-index - 1] = value;
            return var5_5;
        }
        valuesArray[var3_3] = var2_2;
        return null;
    }

    private final void removeKeyAt(int index) {
        ListBuilderKt.resetAt(this.keysArray, index);
        this.removeHashAt(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        int n = this.size();
        this.size = n + -1;
        this.registerModification();
    }

    public MapBuilder(int initialCapacity) {
        this(ListBuilderKt.arrayOfUninitializedElements(initialCapacity), null, new int[initialCapacity], new int[MapBuilder.Companion.computeHashSize(initialCapacity)], 2, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean shouldCompact(int extraCapacity) {
        int spareCapacity = this.getCapacity$kotlin_stdlib() - this.length;
        int gaps = this.length - this.size();
        if (spareCapacity >= extraCapacity) return false;
        if (gaps + spareCapacity < extraCapacity) return false;
        if (gaps < this.getCapacity$kotlin_stdlib() / 4) return false;
        return true;
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries<K, V> cur = this.entriesView;
        if (cur == null) {
            MapBuilderEntries mapBuilderEntries = new MapBuilderEntries(this);
            this.entriesView = mapBuilderEntries;
            return mapBuilderEntries;
        }
        return cur;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @NotNull
    public final ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new ValuesItr(this);
    }

    @Override
    public boolean containsKey(Object key) {
        return this.findKey(key) >= 0;
    }

    private final int findKey(K key) {
        int hash = this.hash(key);
        int probesLeft = this.maxProbeDistance;
        while (true) {
            int index;
            if ((index = this.hashArray[hash]) == 0) {
                return -1;
            }
            if (index > 0) {
                if (Intrinsics.areEqual(this.keysArray[index - 1], key)) {
                    return index - 1;
                }
            }
            if (--probesLeft < 0) {
                return -1;
            }
            if (hash-- != 0) continue;
            int n = this.getHashSize() - 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > this.getCapacity$kotlin_stdlib()) {
            int newSize = AbstractList.Companion.newCapacity$kotlin_stdlib(this.getCapacity$kotlin_stdlib(), minCapacity);
            this.keysArray = ListBuilderKt.copyOfUninitializedElements(this.keysArray, newSize);
            this.valuesArray = this.valuesArray != null ? ListBuilderKt.copyOfUninitializedElements(this.valuesArray, newSize) : null;
            int[] nArray = Arrays.copyOf(this.presenceArray, newSize);
            Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
            this.presenceArray = nArray;
            int newHashSize = MapBuilder.Companion.computeHashSize(newSize);
            if (newHashSize > this.getHashSize()) {
                void var3_3;
                this.rehash((int)var3_3);
            }
        }
    }

    private final Object writeReplace() {
        if (!this.isReadOnly) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        return new SerializedMap(this);
    }

    private final void ensureExtraCapacity(int n) {
        if (this.shouldCompact(n)) {
            this.rehash(this.getHashSize());
        } else {
            this.ensureCapacity(this.length + n);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int index = this.addKey$kotlin_stdlib(entry.getKey());
        V[] valuesArray = this.allocateValuesArray();
        if (index >= 0) {
            valuesArray[index] = entry.getValue();
            return true;
        }
        V oldValue = valuesArray[-index - 1];
        if (!Intrinsics.areEqual(entry.getValue(), oldValue)) {
            void var1_1;
            valuesArray[-index - 1] = var1_1.getValue();
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public V get(Object key) {
        void var2_2;
        int index = this.findKey(key);
        if (index < 0) {
            return null;
        }
        Intrinsics.checkNotNull(this.valuesArray);
        return this.valuesArray[var2_2];
    }

    /*
     * WARNING - void declaration
     */
    private final int findValue(V value) {
        block1: {
            void var2_2;
            int i = this.length;
            while (true) {
                if (--i < 0) break block1;
                if (this.presenceArray[i] < 0) continue;
                Intrinsics.checkNotNull(this.valuesArray);
                if (Intrinsics.areEqual(this.valuesArray[i], value)) break;
            }
            return (int)var2_2;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    public final int removeKey$kotlin_stdlib(K key) {
        void var2_2;
        this.checkIsMutable$kotlin_stdlib();
        int index = this.findKey(key);
        if (index < 0) {
            return -1;
        }
        this.removeKeyAt(index);
        return (int)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public final int addKey$kotlin_stdlib(K key) {
        this.checkIsMutable$kotlin_stdlib();
        block0: while (true) {
            int hash = this.hash(key);
            int tentativeMaxProbeDistance = RangesKt.coerceAtMost(this.maxProbeDistance * 2, this.getHashSize() / 2);
            int probeDistance = 0;
            while (true) {
                int index;
                if ((index = this.hashArray[hash]) <= 0) {
                    void var6_7;
                    if (this.length >= this.getCapacity$kotlin_stdlib()) {
                        this.ensureExtraCapacity(1);
                        continue block0;
                    }
                    int n = this.length;
                    this.length = n + 1;
                    int putIndex = n;
                    this.keysArray[putIndex] = key;
                    this.presenceArray[putIndex] = hash;
                    this.hashArray[hash] = putIndex + 1;
                    n = this.size();
                    this.size = n + 1;
                    this.registerModification();
                    if (probeDistance > this.maxProbeDistance) {
                        this.maxProbeDistance = probeDistance;
                    }
                    return (int)var6_7;
                }
                if (Intrinsics.areEqual(this.keysArray[index - 1], key)) {
                    return -index;
                }
                if (++probeDistance > tentativeMaxProbeDistance) {
                    this.rehash(this.getHashSize() * 2);
                    continue block0;
                }
                if (hash-- != 0) continue;
                int n = this.getHashSize() - 1;
            }
            break;
        }
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Iterator<?> it = m.iterator();
        while (it.hasNext()) {
            Object entry = it.next();
            try {
                if (entry != null) {
                    if (this.containsEntry$kotlin_stdlib((Map.Entry)entry)) continue;
                }
                return false;
            }
            catch (ClassCastException classCastException) {
                return false;
            }
        }
        return true;
    }

    private final int hash(K key) {
        K k = key;
        return (k != null ? k.hashCode() : 0) * -1640531527 >>> this.hashShift;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public Set<K> getKeys() {
        Set set;
        MapBuilderKeys<K> cur = this.keysView;
        if (cur == null) {
            void var2_2;
            MapBuilderKeys mapBuilderKeys = new MapBuilderKeys(this);
            this.keysView = mapBuilderKeys;
            set = (Set)var2_2;
        } else {
            set = cur;
        }
        return set;
    }

    @Override
    public void clear() {
        this.checkIsMutable$kotlin_stdlib();
        IntIterator intIterator = new IntRange(0, this.length - 1).iterator();
        while (intIterator.hasNext()) {
            int i = intIterator.nextInt();
            int hash = this.presenceArray[i];
            if (hash < 0) continue;
            this.hashArray[hash] = 0;
            this.presenceArray[var2_2] = -1;
        }
        ListBuilderKt.resetRange(this.keysArray, 0, this.length);
        if (this.valuesArray != null) {
            ListBuilderKt.resetRange(this.valuesArray, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.registerModification();
    }

    @NotNull
    public final KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new KeysItr(this);
    }

    private final void registerModification() {
        ++this.modCount;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean bl;
        if (from.isEmpty()) {
            return false;
        }
        this.ensureExtraCapacity(from.size());
        Iterator<Map.Entry<K, V>> it = from.iterator();
        boolean updated = false;
        while (it.hasNext()) {
            if (!this.putEntry(it.next())) continue;
            bl = true;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private final V[] allocateValuesArray() {
        void var2_2;
        V[] curValuesArray = this.valuesArray;
        if (curValuesArray != null) {
            return curValuesArray;
        }
        E[] newValuesArray = ListBuilderKt.arrayOfUninitializedElements(this.getCapacity$kotlin_stdlib());
        this.valuesArray = newValuesArray;
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public V remove(Object key) {
        void var4_4;
        int index = this.removeKey$kotlin_stdlib(key);
        if (index < 0) {
            return null;
        }
        Intrinsics.checkNotNull(this.valuesArray);
        V[] valuesArray = this.valuesArray;
        V oldValue = valuesArray[index];
        ListBuilderKt.resetAt(valuesArray, index);
        return var4_4;
    }

    private final boolean putRehash(int i) {
        int hash = this.hash(this.keysArray[i]);
        int probesLeft = this.maxProbeDistance;
        while (true) {
            int index;
            if ((index = this.hashArray[hash]) == 0) {
                this.hashArray[hash] = i + 1;
                this.presenceArray[i] = hash;
                return true;
            }
            if (--probesLeft < 0) {
                return false;
            }
            if (hash-- != 0) continue;
            int n = this.getHashSize() - 1;
        }
    }

    private MapBuilder(K[] keysArray, V[] valuesArray, int[] presenceArray, int[] hashArray, int maxProbeDistance, int length) {
        this.keysArray = keysArray;
        this.valuesArray = valuesArray;
        this.presenceArray = presenceArray;
        this.hashArray = hashArray;
        this.maxProbeDistance = maxProbeDistance;
        this.length = length;
        this.hashShift = MapBuilder.Companion.computeShift(this.getHashSize());
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override
    public boolean containsValue(Object value) {
        return this.findValue(value) >= 0;
    }

    private final void rehash(int newHashSize) {
        this.registerModification();
        if (this.length > this.size()) {
            this.compact();
        }
        if (newHashSize != this.getHashSize()) {
            this.hashArray = new int[newHashSize];
            this.hashShift = MapBuilder.Companion.computeShift(newHashSize);
        } else {
            ArraysKt.fill(this.hashArray, 0, 0, this.getHashSize());
        }
        int i = 0;
        while (i < this.length) {
            if (this.putRehash(i++)) continue;
            throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        }
    }

    private final boolean contentEquals(Map<?, ?> other) {
        return this.size() == other.size() && this.containsAllEntries$kotlin_stdlib((Collection)other.entrySet());
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public int getSize() {
        return this.size;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public Collection<V> getValues() {
        Collection collection;
        MapBuilderValues<V> cur = this.valuesView;
        if (cur == null) {
            void var2_2;
            MapBuilderValues mapBuilderValues = new MapBuilderValues(this);
            this.valuesView = mapBuilderValues;
            collection = (Collection)var2_2;
        } else {
            collection = cur;
        }
        return collection;
    }

    public MapBuilder() {
        this(8);
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    @NotNull
    public final EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new EntriesItr(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(2 + this.size() * 3);
        sb.append("{");
        int i = 0;
        EntriesItr<K, V> it = this.entriesIterator$kotlin_stdlib();
        while (it.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            it.nextAppendString(sb);
            ++i;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private final void removeHashAt(int removedHash) {
        void var5_5;
        int hash = removedHash;
        int hole = removedHash;
        int probeDistance = 0;
        int patchAttemptsLeft = RangesKt.coerceAtMost(this.maxProbeDistance * 2, this.getHashSize() / 2);
        do {
            void var2_2;
            if (hash-- == 0) {
                hash = this.getHashSize() - 1;
            }
            if (++probeDistance > this.maxProbeDistance) {
                this.hashArray[hole] = 0;
                return;
            }
            int index = this.hashArray[hash];
            if (index == 0) {
                this.hashArray[hole] = 0;
                return;
            }
            if (index < 0) {
                this.hashArray[hole] = -1;
                hole = hash;
                probeDistance = 0;
                continue;
            }
            int otherHash = this.hash(this.keysArray[index - 1]);
            if ((otherHash - hash & this.getHashSize() - 1) < probeDistance) continue;
            this.hashArray[hole] = index;
            this.presenceArray[index - 1] = hole;
            void var3_3 = var2_2;
            boolean bl = false;
        } while (--var5_5 >= 0);
        this.hashArray[var3_3] = -1;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        this.checkIsMutable$kotlin_stdlib();
        int index = this.findValue(element);
        if (index < 0) {
            return false;
        }
        this.removeKeyAt(index);
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int index = this.findKey(entry.getKey());
        if (index < 0) {
            return false;
        }
        Intrinsics.checkNotNull(this.valuesArray);
        return Intrinsics.areEqual(this.valuesArray[index], entry.getValue());
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.checkIsMutable$kotlin_stdlib();
        int index = this.findKey(entry.getKey());
        if (index < 0) {
            return false;
        }
        Intrinsics.checkNotNull(this.valuesArray);
        if (!Intrinsics.areEqual(this.valuesArray[index], entry.getValue())) {
            return false;
        }
        this.removeKeyAt(index);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void compact() {
        void var2_2;
        int j = 0;
        V[] valuesArray = this.valuesArray;
        for (int i = 0; i < this.length; ++i) {
            if (this.presenceArray[i] < 0) continue;
            this.keysArray[j] = this.keysArray[i];
            if (valuesArray != null) {
                valuesArray[j] = valuesArray[i];
            }
            ++j;
        }
        ListBuilderKt.resetRange(this.keysArray, j, this.length);
        if (valuesArray != null) {
            ListBuilderKt.resetRange(valuesArray, j, this.length);
        }
        this.length = var2_2;
    }

    static {
        MapBuilder mapBuilder;
        Companion = new Companion(null);
        MapBuilder it = mapBuilder = new MapBuilder(0);
        boolean bl = false;
        it.isReadOnly = true;
        Empty = mapBuilder;
    }

    @Override
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.checkIsMutable$kotlin_stdlib();
        this.putAllEntries((Collection)from.entrySet());
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    public static final class ValuesItr<K, V>
    extends Itr<K, V>
    implements Iterator<V>,
    KMutableIterator {
        @Override
        public V next() {
            this.checkForComodification$kotlin_stdlib();
            if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int n = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(n + 1);
            this.setLastIndex$kotlin_stdlib(n);
            Object[] objectArray = this.getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objectArray);
            Object result = objectArray[this.getLastIndex$kotlin_stdlib()];
            this.initNext$kotlin_stdlib();
            return (V)result;
        }

        public ValuesItr(@NotNull MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            super(map);
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2={"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "next", "()Lkotlin/collections/builders/MapBuilder$EntryRef;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "nextAppendString", "(Ljava/lang/StringBuilder;)V", "", "nextHashCode$kotlin_stdlib", "()I", "nextHashCode", "kotlin-stdlib"})
    public static final class EntriesItr<K, V>
    extends Itr<K, V>
    implements Iterator<Map.Entry<K, V>>,
    KMutableIterator {
        public EntriesItr(@NotNull MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            super(map);
        }

        @Override
        @NotNull
        public EntryRef<K, V> next() {
            this.checkForComodification$kotlin_stdlib();
            if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int n = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(n + 1);
            this.setLastIndex$kotlin_stdlib(n);
            EntryRef result = new EntryRef(this.getMap$kotlin_stdlib(), this.getLastIndex$kotlin_stdlib());
            this.initNext$kotlin_stdlib();
            return result;
        }

        public final void nextAppendString(@NotNull StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int n = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(n + 1);
            this.setLastIndex$kotlin_stdlib(n);
            Object key = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()];
            if (key == this.getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(key);
            }
            sb.append('=');
            Object[] objectArray = this.getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objectArray);
            Object value = objectArray[this.getLastIndex$kotlin_stdlib()];
            if (value == this.getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(value);
            }
            this.initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int n = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(n + 1);
            this.setLastIndex$kotlin_stdlib(n);
            Object object = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()];
            int n2 = object != null ? object.hashCode() : 0;
            Object[] objectArray = this.getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objectArray);
            Object object2 = objectArray[this.getLastIndex$kotlin_stdlib()];
            int result = n2 ^ (object2 != null ? object2.hashCode() : 0);
            this.initNext$kotlin_stdlib();
            return n;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    public static final class KeysItr<K, V>
    extends Itr<K, V>
    implements Iterator<K>,
    KMutableIterator {
        public KeysItr(@NotNull MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            super(map);
        }

        @Override
        public K next() {
            this.checkForComodification$kotlin_stdlib();
            if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int n = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(n + 1);
            this.setLastIndex$kotlin_stdlib(n);
            Object result = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()];
            this.initNext$kotlin_stdlib();
            return (K)result;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00028\u0003H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001a\u001a\u00028\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00028\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019\u00a8\u0006\u001e"}, d2={"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "", "index", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "I", "getKey", "()Ljava/lang/Object;", "key", "Lkotlin/collections/builders/MapBuilder;", "getValue", "value", "kotlin-stdlib"})
    public static final class EntryRef<K, V>
    implements Map.Entry<K, V>,
    KMutableMap.Entry {
        @NotNull
        private final MapBuilder<K, V> map;
        private final int index;

        @Override
        public int hashCode() {
            K k = this.getKey();
            V v = this.getValue();
            return (k != null ? k.hashCode() : 0) ^ (v != null ? v.hashCode() : 0);
        }

        @Override
        public V getValue() {
            Object[] objectArray = ((MapBuilder)this.map).valuesArray;
            Intrinsics.checkNotNull(objectArray);
            return (V)objectArray[this.index];
        }

        @Override
        public K getKey() {
            return (K)((MapBuilder)this.map).keysArray[this.index];
        }

        @Override
        public boolean equals(@Nullable Object other) {
            return other instanceof Map.Entry && Intrinsics.areEqual(((Map.Entry)other).getKey(), this.getKey()) && Intrinsics.areEqual(((Map.Entry)other).getValue(), this.getValue());
        }

        public EntryRef(@NotNull MapBuilder<K, V> map, int index) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = index;
        }

        @NotNull
        public String toString() {
            return "" + this.getKey() + '=' + this.getValue();
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public V setValue(V newValue) {
            void var3_3;
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] valuesArray = ((MapBuilder)this.map).allocateValuesArray();
            Object oldValue = valuesArray[this.index];
            valuesArray[this.index] = newValue;
            return var3_3;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0004\b\u0011\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2={"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "checkForComodification$kotlin_stdlib", "()V", "checkForComodification", "", "hasNext", "()Z", "initNext$kotlin_stdlib", "initNext", "remove", "", "expectedModCount", "I", "index", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "Lkotlin/collections/builders/MapBuilder;", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "kotlin-stdlib"})
    public static class Itr<K, V> {
        @NotNull
        private final MapBuilder<K, V> map;
        private int lastIndex;
        private int index;
        private int expectedModCount;

        public final void setIndex$kotlin_stdlib(int n) {
            this.index = n;
        }

        public final void setLastIndex$kotlin_stdlib(int n) {
            this.lastIndex = n;
        }

        public final boolean hasNext() {
            return this.index < ((MapBuilder)this.map).length;
        }

        public final int getIndex$kotlin_stdlib() {
            return this.index;
        }

        public final void remove() {
            this.checkForComodification$kotlin_stdlib();
            boolean bl = this.lastIndex != -1;
            if (!bl) {
                boolean bl2 = false;
                String string = "Call next() before removing element from the iterator.";
                throw new IllegalStateException(string.toString());
            }
            this.map.checkIsMutable$kotlin_stdlib();
            ((MapBuilder)this.map).removeKeyAt(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder)this.map).modCount;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.lastIndex;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < ((MapBuilder)this.map).length && ((MapBuilder)this.map).presenceArray[this.index] < 0) {
                int n = this.index;
                this.index = n + 1;
            }
        }

        @NotNull
        public final MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.map;
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (((MapBuilder)this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public Itr(@NotNull MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder)this.map).modCount;
            this.initNext$kotlin_stdlib();
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0011\u00a8\u0006\u0015"}, d2={"Lkotlin/collections/builders/MapBuilder$Companion;", "", "<init>", "()V", "", "capacity", "computeHashSize", "(I)I", "hashSize", "computeShift", "Lkotlin/collections/builders/MapBuilder;", "", "Empty", "Lkotlin/collections/builders/MapBuilder;", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private final int computeShift(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        private Companion() {
        }

        private final int computeHashSize(int capacity) {
            return Integer.highestOneBit(RangesKt.coerceAtLeast(capacity, 1) * 3);
        }

        @NotNull
        public final MapBuilder getEmpty$kotlin_stdlib() {
            return Empty;
        }
    }
}

