/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt__ArraysJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000H\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001\u00a2\u0006\u0004\b\b\u0010\t\u001a?\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001b\u001a\u00028\u0001\"\u0010\b\u0000\u0010\u0017*\u0006\u0012\u0002\b\u00030\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0018*\u00028\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001aI\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u001f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f0\u0001\u00a2\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\""}, d2={"T", "", "other", "", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepEqualsImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringImpl", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "result", "", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "contentDeepToStringInternal", "", "flatten", "([[Ljava/lang/Object;)Ljava/util/List;", "C", "R", "Lkotlin/Function0;", "defaultValue", "ifEmpty", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "Lkotlin/Pair;", "unzip", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, xs="kotlin/collections/ArraysKt")
class ArraysKt__ArraysKt
extends ArraysKt__ArraysJVMKt {
    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] $this$flatten) {
        void var1_13;
        Intrinsics.checkNotNullParameter($this$flatten, "<this>");
        Object[] objectArray = (Object[])$this$flatten;
        int n = 0;
        int n2 = objectArray.length;
        for (int i = 0; i < n2; ++i) {
            void var7_8;
            Object object = objectArray[i];
            Object[] it = (Object[])object;
            int n3 = n;
            boolean bl = false;
            int n4 = ((void)var7_8).length;
            n = n3 + n4;
        }
        int n5 = n;
        ArrayList result = new ArrayList(n5);
        n = ((Object[])$this$flatten).length;
        for (int i = 0; i < n; ++i) {
            void var4_5;
            T[] element = $this$flatten[i];
            CollectionsKt.addAll((Collection)result, var4_5);
        }
        return (List)var1_13;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] $this$unzip) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$unzip, "<this>");
        ArrayList<T> listT = new ArrayList<T>($this$unzip.length);
        ArrayList<R> listR = new ArrayList<R>($this$unzip.length);
        int n = $this$unzip.length;
        for (int i = 0; i < n; ++i) {
            Pair<T, R> pair = $this$unzip[i];
            listT.add(pair.getFirst());
            listR.add(pair.getSecond());
        }
        return TuplesKt.to(listT, var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] $this$contentDeepToStringInternal, StringBuilder result, List<Object[]> processed) {
        void var2_2;
        if (processed.contains($this$contentDeepToStringInternal)) {
            result.append("[...]");
            return;
        }
        processed.add($this$contentDeepToStringInternal);
        result.append('[');
        int i = 0;
        int n = $this$contentDeepToStringInternal.length;
        while (i < n) {
            void var3_3;
            T element;
            if (i != 0) {
                result.append(", ");
            }
            T t = element = $this$contentDeepToStringInternal[i];
            if (t == null) {
                result.append("null");
            } else if (t instanceof Object[]) {
                ArraysKt__ArraysKt.contentDeepToStringInternal$ArraysKt__ArraysKt((Object[])element, result, processed);
            } else if (t instanceof byte[]) {
                String string = Arrays.toString((byte[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof short[]) {
                String string = Arrays.toString((short[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof int[]) {
                String string = Arrays.toString((int[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof long[]) {
                String string = Arrays.toString((long[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof float[]) {
                String string = Arrays.toString((float[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof double[]) {
                String string = Arrays.toString((double[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof char[]) {
                String string = Arrays.toString((char[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof boolean[]) {
                String string = Arrays.toString((boolean[])element);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                result.append(string);
            } else if (t instanceof UByteArray) {
                UByteArray uByteArray = (UByteArray)element;
                result.append(UArraysKt.contentToString-2csIQuQ((byte[])(uByteArray != null ? uByteArray.unbox-impl() : null)));
            } else if (t instanceof UShortArray) {
                UShortArray uShortArray = (UShortArray)element;
                result.append(UArraysKt.contentToString-d-6D3K8((short[])(uShortArray != null ? uShortArray.unbox-impl() : null)));
            } else if (t instanceof UIntArray) {
                UIntArray uIntArray = (UIntArray)element;
                result.append(UArraysKt.contentToString-XUkPCBk((int[])(uIntArray != null ? uIntArray.unbox-impl() : null)));
            } else if (t instanceof ULongArray) {
                ULongArray uLongArray = (ULongArray)element;
                result.append(UArraysKt.contentToString-uLth9ew((long[])(uLongArray != null ? uLongArray.unbox-impl() : null)));
            } else {
                void var5_5;
                result.append(var5_5.toString());
            }
            ++var3_3;
        }
        result.append(']');
        var2_2.remove(CollectionsKt.getLastIndex(var2_2));
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <C extends Object[], R> R ifEmpty(C $this$ifEmpty, Function0<? extends R> defaultValue) {
        C c;
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (R)(((C)$this$ifEmpty).length == 0 ? defaultValue.invoke() : c);
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="contentDeepEquals")
    @SinceKotlin(version="1.3")
    @PublishedApi
    public static final <T> boolean contentDeepEquals(@Nullable T[] $this$contentDeepEqualsImpl, @Nullable T[] other) {
        block10: {
            block9: {
                if ($this$contentDeepEqualsImpl == other) {
                    return true;
                }
                if ($this$contentDeepEqualsImpl == null || other == null) break block9;
                if ($this$contentDeepEqualsImpl.length == other.length) break block10;
            }
            return false;
        }
        int i = 0;
        int n = $this$contentDeepEqualsImpl.length;
        while (i < n) {
            void var2_2;
            block11: {
                void var5_5;
                void var4_4;
                Object[] objectArray;
                Object[] objectArray2;
                T v2;
                T v1;
                block13: {
                    block12: {
                        v1 = $this$contentDeepEqualsImpl[i];
                        v2 = other[i];
                        if (v1 == v2) break block11;
                        if (v1 == null) break block12;
                        if (v2 != null) break block13;
                    }
                    return false;
                }
                if (v1 instanceof Object[] && v2 instanceof Object[] ? !ArraysKt.contentDeepEquals(objectArray2 = (Object[])v1, objectArray = (Object[])v2) : (v1 instanceof byte[] && v2 instanceof byte[] ? !Arrays.equals((byte[])v1, (byte[])v2) : (v1 instanceof short[] && v2 instanceof short[] ? !Arrays.equals((short[])v1, (short[])v2) : (v1 instanceof int[] && v2 instanceof int[] ? !Arrays.equals((int[])v1, (int[])v2) : (v1 instanceof long[] && v2 instanceof long[] ? !Arrays.equals((long[])v1, (long[])v2) : (v1 instanceof float[] && v2 instanceof float[] ? !Arrays.equals((float[])v1, (float[])v2) : (v1 instanceof double[] && v2 instanceof double[] ? !Arrays.equals((double[])v1, (double[])v2) : (v1 instanceof char[] && v2 instanceof char[] ? !Arrays.equals((char[])v1, (char[])v2) : (v1 instanceof boolean[] && v2 instanceof boolean[] ? !Arrays.equals((boolean[])v1, (boolean[])v2) : (v1 instanceof UByteArray && v2 instanceof UByteArray ? !UArraysKt.contentEquals-kV0jMPg(((UByteArray)v1).unbox-impl(), ((UByteArray)v2).unbox-impl()) : (v1 instanceof UShortArray && v2 instanceof UShortArray ? !UArraysKt.contentEquals-FGO6Aew(((UShortArray)v1).unbox-impl(), ((UShortArray)v2).unbox-impl()) : (v1 instanceof UIntArray && v2 instanceof UIntArray ? !UArraysKt.contentEquals-KJPZfPQ(((UIntArray)v1).unbox-impl(), ((UIntArray)v2).unbox-impl()) : (v1 instanceof ULongArray && v2 instanceof ULongArray ? !UArraysKt.contentEquals-lec5QzE(((ULongArray)v1).unbox-impl(), ((ULongArray)v2).unbox-impl()) : !Intrinsics.areEqual(var4_4, var5_5)))))))))))))) {
                    return false;
                }
            }
            ++var2_2;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final boolean isNullOrEmpty(Object[] $this$isNullOrEmpty) {
        if ($this$isNullOrEmpty == null) return true;
        if ($this$isNullOrEmpty.length != 0) return false;
        return true;
    }

    @SinceKotlin(version="1.3")
    @JvmName(name="contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] $this$contentDeepToStringImpl) {
        if ($this$contentDeepToStringImpl == null) {
            return "null";
        }
        int length = RangesKt.coerceAtMost($this$contentDeepToStringImpl.length, 0x19999999) * 5 + 2;
        StringBuilder stringBuilder = new StringBuilder(length);
        StringBuilder $this$contentDeepToStringImpl_u24lambda_u242 = stringBuilder;
        boolean bl = false;
        ArraysKt__ArraysKt.contentDeepToStringInternal$ArraysKt__ArraysKt($this$contentDeepToStringImpl, $this$contentDeepToStringImpl_u24lambda_u242, new ArrayList());
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

