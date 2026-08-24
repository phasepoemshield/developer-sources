/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2={"E", "", "size", "", "arrayOfUninitializedElements", "(I)[Ljava/lang/Object;", "T", "newSize", "copyOfUninitializedElements", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "", "resetAt", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "resetRange", "([Ljava/lang/Object;II)V", "offset", "length", "", "other", "", "subarrayContentEquals", "([Ljava/lang/Object;IILjava/util/List;)Z", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "", "thisCollection", "", "subarrayContentToString", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", "kotlin-stdlib"})
public final class ListBuilderKt {
    /*
     * WARNING - void declaration
     */
    private static final <T> boolean subarrayContentEquals(T[] $this$subarrayContentEquals, int offset, int length, List<?> other) {
        if (length != other.size()) {
            return false;
        }
        int i = 0;
        while (i < length) {
            void var4_4;
            if (!Intrinsics.areEqual($this$subarrayContentEquals[offset + i], other.get(i))) {
                return false;
            }
            ++var4_4;
        }
        return true;
    }

    public static final <E> void resetAt(@NotNull E[] $this$resetAt, int index) {
        Intrinsics.checkNotNullParameter($this$resetAt, "<this>");
        $this$resetAt[index] = null;
    }

    @NotNull
    public static final <T> T[] copyOfUninitializedElements(@NotNull T[] $this$copyOfUninitializedElements, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOfUninitializedElements, "<this>");
        T[] TArray = Arrays.copyOf($this$copyOfUninitializedElements, newSize);
        Intrinsics.checkNotNullExpressionValue(TArray, "copyOf(...)");
        return TArray;
    }

    private static final <T> String subarrayContentToString(T[] $this$subarrayContentToString, int offset, int length, Collection<? extends T> thisCollection) {
        StringBuilder sb = new StringBuilder(2 + length * 3);
        sb.append("[");
        for (int i = 0; i < length; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            T nextElement = $this$subarrayContentToString[offset + i];
            if (nextElement == thisCollection) {
                sb.append("(this Collection)");
                continue;
            }
            sb.append(nextElement);
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final <E> E[] arrayOfUninitializedElements(int size) {
        int n;
        boolean bl = size >= 0;
        if (!bl) {
            boolean bl2 = false;
            String string = "capacity must be non-negative.";
            throw new IllegalArgumentException(string.toString());
        }
        return new Object[n];
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> int subarrayContentHashCode(T[] $this$subarrayContentHashCode, int offset, int length) {
        void var3_3;
        int result = 1;
        for (int i = 0; i < length; ++i) {
            T nextElement = $this$subarrayContentHashCode[offset + i];
            T t = nextElement;
            result = result * 31 + (t != null ? t.hashCode() : 0);
        }
        return (int)var3_3;
    }

    public static final /* synthetic */ String access$subarrayContentToString(Object[] $receiver, int offset, int length, Collection thisCollection) {
        return ListBuilderKt.subarrayContentToString($receiver, offset, length, thisCollection);
    }

    public static final <E> void resetRange(@NotNull E[] $this$resetRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$resetRange, "<this>");
        for (int index = fromIndex; index < toIndex; ++index) {
            ListBuilderKt.resetAt($this$resetRange, index);
        }
    }

    public static final /* synthetic */ boolean access$subarrayContentEquals(Object[] $receiver, int offset, int length, List other) {
        return ListBuilderKt.subarrayContentEquals($receiver, offset, length, other);
    }

    public static final /* synthetic */ int access$subarrayContentHashCode(Object[] $receiver, int offset, int length) {
        return ListBuilderKt.subarrayContentHashCode($receiver, offset, length);
    }
}

