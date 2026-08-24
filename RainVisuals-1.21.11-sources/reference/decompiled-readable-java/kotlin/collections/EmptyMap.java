/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u000bJ\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cR(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030)8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\u00a8\u0006-"}, d2={"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "(Ljava/lang/Void;)Z", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "hashCode", "()I", "isEmpty", "()Z", "readResolve", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "serialVersionUID", "J", "getSize", "size", "", "getValues", "()Ljava/util/Collection;", "values", "kotlin-stdlib"})
final class EmptyMap
implements Serializable,
KMappedMarker,
Map {
    @NotNull
    public static final EmptyMap INSTANCE = new EmptyMap();
    private static final long serialVersionUID = 8246714829545688274L;

    @Nullable
    public Void get(@Nullable Object key) {
        return null;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public Set<Map.Entry> getEntries() {
        return EmptySet.INSTANCE;
    }

    private EmptyMap() {
    }

    @NotNull
    public String toString() {
        return "{}";
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof Map && ((Map)other).isEmpty();
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @NotNull
    public Collection getValues() {
        return EmptyList.INSTANCE;
    }

    public Void remove(Object key) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @NotNull
    public Set<Object> getKeys() {
        return EmptySet.INSTANCE;
    }

    public boolean containsValue(@NotNull Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return false;
    }

    public void putAll(Map from) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int getSize() {
        return 0;
    }

    @Override
    public boolean containsKey(@Nullable Object key) {
        return false;
    }

    public Void put(Object key, Void value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

