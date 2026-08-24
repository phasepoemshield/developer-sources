/*
 * Decompiled with CFR 0.152.
 */
package kotlin.enums;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesSerializationProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001d"}, d2={"Lkotlin/enums/EnumEntriesList;", "", "T", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "element", "", "contains", "(Ljava/lang/Enum;)Z", "", "index", "get", "(I)Ljava/lang/Enum;", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "", "writeReplace", "()Ljava/lang/Object;", "[Ljava/lang/Enum;", "getSize", "()I", "size", "kotlin-stdlib"})
@SinceKotlin(version="1.8")
final class EnumEntriesList<T extends Enum<T>>
extends AbstractList<T>
implements EnumEntries<T>,
Serializable {
    @NotNull
    private final T[] entries;

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    @Override
    public boolean contains(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        Enum target = (Enum)ArraysKt.getOrNull(this.entries, ((Enum)element).ordinal());
        return target == element;
    }

    @Override
    @NotNull
    public T get(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.entries.length);
        return this.entries[index];
    }

    @Override
    public int getSize() {
        return this.entries.length;
    }

    public EnumEntriesList(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.entries = entries;
    }

    @Override
    public int lastIndexOf(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.indexOf((Object)element);
    }

    @Override
    public int indexOf(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = ((Enum)element).ordinal();
        Enum target = (Enum)ArraysKt.getOrNull(this.entries, ordinal);
        return target == element ? ordinal : -1;
    }
}

