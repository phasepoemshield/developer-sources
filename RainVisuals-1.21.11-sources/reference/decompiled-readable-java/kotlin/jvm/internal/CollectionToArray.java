/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000*\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\b\u0004\u0010\b\u001a\u0080\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000b2(\u0010\u000f\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000eH\u0082\b\u00a2\u0006\u0004\b\u0010\u0010\u0011\"\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"", "collection", "", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "collectionToArray", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "Lkotlin/Function0;", "empty", "Lkotlin/Function1;", "", "alloc", "Lkotlin/Function2;", "trim", "toArrayImpl", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "EMPTY", "[Ljava/lang/Object;", "MAX_SIZE", "I", "kotlin-stdlib"})
@JvmName(name="CollectionToArray")
public final class CollectionToArray {
    private static final int MAX_SIZE = 0x7FFFFFFD;
    @NotNull
    private static final Object[] EMPTY;

    /*
     * WARNING - void declaration
     */
    @Deprecated(message="This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince="1.9")
    @NotNull
    @JvmName(name="toArray")
    public static final Object[] toArray(@NotNull Collection<?> collection) {
        Object[] objectArray;
        block9: {
            Intrinsics.checkNotNullParameter(collection, "collection");
            boolean $i$f$toArrayImpl = false;
            int size$iv = collection.size();
            if (size$iv == 0) {
                boolean bl = false;
                objectArray = EMPTY;
            } else {
                Iterator<?> iter$iv = collection.iterator();
                if (!iter$iv.hasNext()) {
                    boolean bl = false;
                    objectArray = EMPTY;
                } else {
                    void var7_10;
                    void var8_11;
                    void result$iv22;
                    int size = size$iv;
                    boolean bl = false;
                    Object[] result$iv22 = new Object[result$iv22];
                    int i$iv = 0;
                    while (true) {
                        int n = i$iv++;
                        result$iv22[n] = iter$iv.next();
                        if (i$iv >= result$iv22.length) {
                            void var6_9;
                            if (!iter$iv.hasNext()) {
                                objectArray = result$iv22;
                                break block9;
                            }
                            int newSize$iv = i$iv * 3 + 1 >>> 1;
                            if (newSize$iv <= i$iv) {
                                if (i$iv >= 0x7FFFFFFD) {
                                    throw new OutOfMemoryError();
                                }
                                newSize$iv = 0x7FFFFFFD;
                            }
                            Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(result$iv22, (int)var6_9), "copyOf(...)");
                            continue;
                        }
                        if (!iter$iv.hasNext()) break;
                    }
                    int size2 = i$iv;
                    Object[] result = result$iv22;
                    boolean bl2 = false;
                    T[] TArray = Arrays.copyOf(var8_11, (int)var7_10);
                    objectArray = TArray;
                    Intrinsics.checkNotNullExpressionValue(TArray, "copyOf(...)");
                }
            }
        }
        return objectArray;
    }

    /*
     * WARNING - void declaration
     */
    @Deprecated(message="This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince="1.9")
    @NotNull
    @JvmName(name="toArray")
    public static final Object[] toArray(@NotNull Collection<?> collection, @Nullable Object[] a2) {
        Object[] objectArray;
        block16: {
            Intrinsics.checkNotNullParameter(collection, "collection");
            if (a2 == null) {
                throw new NullPointerException();
            }
            boolean $i$f$toArrayImpl = false;
            int size$iv = collection.size();
            if (size$iv == 0) {
                boolean bl = false;
                if (a2.length > 0) {
                    a2[0] = null;
                }
                objectArray = a2;
            } else {
                Iterator<?> iter$iv = collection.iterator();
                if (!iter$iv.hasNext()) {
                    boolean bl = false;
                    if (a2.length > 0) {
                        a2[0] = null;
                    }
                    objectArray = a2;
                } else {
                    Object[] objectArray2;
                    int size = size$iv;
                    boolean bl = false;
                    if (size <= a2.length) {
                        objectArray2 = a2;
                    } else {
                        Object object = Array.newInstance(a2.getClass().getComponentType(), size);
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objectArray2 = (Object[])object;
                    }
                    Object[] result$iv = objectArray2;
                    int i$iv = 0;
                    while (true) {
                        result$iv[i$iv++] = iter$iv.next();
                        if (i$iv >= result$iv.length) {
                            void var6_8;
                            if (!iter$iv.hasNext()) {
                                objectArray = result$iv;
                                break block16;
                            }
                            int newSize$iv = i$iv * 3 + 1 >>> 1;
                            if (newSize$iv <= i$iv) {
                                if (i$iv >= 0x7FFFFFFD) {
                                    throw new OutOfMemoryError();
                                }
                                newSize$iv = 0x7FFFFFFD;
                            }
                            Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(result$iv, (int)var6_8), "copyOf(...)");
                            continue;
                        }
                        if (!iter$iv.hasNext()) break;
                    }
                    int size2 = i$iv;
                    Object[] result = result$iv;
                    boolean bl2 = false;
                    if (result == a2) {
                        a2[size2] = null;
                        objectArray = a2;
                    } else {
                        void var8_10;
                        void var9_11;
                        T[] TArray = Arrays.copyOf(var9_11, (int)var8_10);
                        objectArray = TArray;
                        Intrinsics.checkNotNullExpressionValue(TArray, "copyOf(...)");
                    }
                }
            }
        }
        return objectArray;
    }

    static {
        boolean $i$f$emptyArray = false;
        EMPTY = new Object[0];
    }

    private static final Object[] toArrayImpl(Collection<?> collection, Function0<Object[]> empty, Function1<? super Integer, Object[]> alloc, Function2<? super Object[], ? super Integer, Object[]> trim) {
        boolean $i$f$toArrayImpl = false;
        int size = collection.size();
        if (size == 0) {
            return empty.invoke();
        }
        Iterator<?> iter = collection.iterator();
        if (!iter.hasNext()) {
            return empty.invoke();
        }
        Object[] result = alloc.invoke((Integer)size);
        int i = 0;
        while (true) {
            result[i++] = iter.next();
            if (i >= result.length) {
                if (!iter.hasNext()) {
                    return result;
                }
                int newSize = i * 3 + 1 >>> 1;
                if (newSize <= i) {
                    if (i >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                    newSize = 0x7FFFFFFD;
                }
                Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(result, newSize), "copyOf(...)");
                continue;
            }
            if (!iter.hasNext()) break;
        }
        return trim.invoke((Object[])result, (Integer)i);
    }
}

