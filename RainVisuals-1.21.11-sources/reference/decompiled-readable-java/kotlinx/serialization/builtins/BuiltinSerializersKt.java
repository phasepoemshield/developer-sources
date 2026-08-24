/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.builtins;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u00ae\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00018\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001aD\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\f\b\u0001\u0010\u0002\u0018\u0001*\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\b\u00a2\u0006\u0004\b\b\u0010\n\u001a\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u00a2\u0006\u0004\b\u000f\u0010\r\u001a\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u00a2\u0006\u0004\b\u0011\u0010\r\u001a\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u00a2\u0006\u0004\b\u0013\u0010\r\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005\u00a2\u0006\u0004\b\u0015\u0010\r\u001a\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005\u00a2\u0006\u0004\b\u0017\u0010\r\u001a-\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0005\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b\u0019\u0010\n\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005\u00a2\u0006\u0004\b\u001b\u0010\r\u001aG\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u0005\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\b!\u0010\"\u001aG\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#0\u0005\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\b$\u0010\"\u001a\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0005H\u0007\u00a2\u0006\u0004\b&\u0010\r\u001aG\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0005\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\b(\u0010\"\u001a-\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0\u0005\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b*\u0010\n\u001a\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0005\u00a2\u0006\u0004\b,\u0010\r\u001aa\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002030\u0005\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.\"\u0004\b\u0002\u0010/2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\u00a2\u0006\u0004\b4\u00105\u001a\u0015\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0005H\u0007\u00a2\u0006\u0004\b7\u0010\r\u001a\u0015\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0005H\u0007\u00a2\u0006\u0004\b9\u0010\r\u001a\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0005H\u0007\u00a2\u0006\u0004\b;\u0010\r\u001a\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0005H\u0007\u00a2\u0006\u0004\b=\u0010\r\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0005*\u00020>\u00a2\u0006\u0004\b@\u0010A\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020C0\u0005*\u00020B\u00a2\u0006\u0004\b@\u0010D\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020F0\u0005*\u00020E\u00a2\u0006\u0004\b@\u0010G\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020I0\u0005*\u00020H\u00a2\u0006\u0004\b@\u0010J\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020L0\u0005*\u00020K\u00a2\u0006\u0004\b@\u0010M\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020O0\u0005*\u00020N\u00a2\u0006\u0004\b@\u0010P\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020R0\u0005*\u00020Q\u00a2\u0006\u0004\b@\u0010S\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020U0\u0005*\u00020T\u00a2\u0006\u0004\b@\u0010V\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020X0\u0005*\u00020W\u00a2\u0006\u0004\b@\u0010Y\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020[0\u0005*\u00020Z\u00a2\u0006\u0004\b@\u0010\\\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020^0\u0005*\u00020]\u00a2\u0006\u0004\b@\u0010_\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020a0\u0005*\u00020`\u00a2\u0006\u0004\b@\u0010b\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020d0\u0005*\u00020c\u00a2\u0006\u0004\b@\u0010e\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020f0\u0005*\u00020f\u00a2\u0006\u0004\b@\u0010g\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020i0\u0005*\u00020h\u00a2\u0006\u0004\b@\u0010j\"3\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F\u00a2\u0006\f\u0012\u0004\bl\u0010m\u001a\u0004\bk\u0010\n\u00a8\u0006o"}, d2={"", "T", "E", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "elementSerializer", "", "ArraySerializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "BooleanArraySerializer", "()Lkotlinx/serialization/KSerializer;", "", "ByteArraySerializer", "", "CharArraySerializer", "", "DoubleArraySerializer", "", "FloatArraySerializer", "", "IntArraySerializer", "", "ListSerializer", "", "LongArraySerializer", "K", "V", "keySerializer", "valueSerializer", "", "MapEntrySerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "MapSerializer", "", "NothingSerializer", "Lkotlin/Pair;", "PairSerializer", "", "SetSerializer", "", "ShortArraySerializer", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "Lkotlin/Triple;", "TripleSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UByteArray;", "UByteArraySerializer", "Lkotlin/UIntArray;", "UIntArraySerializer", "Lkotlin/ULongArray;", "ULongArraySerializer", "Lkotlin/UShortArray;", "UShortArraySerializer", "Lkotlin/Boolean$Companion;", "", "serializer", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Byte$Companion;", "", "(Lkotlin/jvm/internal/ByteCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Char$Companion;", "", "(Lkotlin/jvm/internal/CharCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Double$Companion;", "", "(Lkotlin/jvm/internal/DoubleCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Float$Companion;", "", "(Lkotlin/jvm/internal/FloatCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Long$Companion;", "", "(Lkotlin/jvm/internal/LongCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Short$Companion;", "", "(Lkotlin/jvm/internal/ShortCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "(Lkotlin/jvm/internal/StringCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "(Lkotlin/UByte$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "(Lkotlin/UInt$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "(Lkotlin/ULong$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "(Lkotlin/UShort$Companion;)Lkotlinx/serialization/KSerializer;", "", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration$Companion;", "Lkotlin/time/Duration;", "(Lkotlin/time/Duration$Companion;)Lkotlinx/serialization/KSerializer;", "getNullable", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"})
public final class BuiltinSerializersKt {
    @NotNull
    public static final KSerializer<Character> serializer(@NotNull CharCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return CharSerializer.INSTANCE;
    }

    @NotNull
    public static final <K, V> KSerializer<Pair<K, V>> PairSerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new PairSerializer<K, V>(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <T> KSerializer<Set<T>> SetSerializer(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new LinkedHashSetSerializer<T>(elementSerializer);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer NothingSerializer() {
        return NothingSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<UShort> serializer(@NotNull UShort.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<ULong> serializer(@NotNull ULong.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return ULongSerializer.INSTANCE;
    }

    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<ULongArray> ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Long> serializer(@NotNull LongCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return LongSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        boolean $i$f$ArraySerializer = false;
        Intrinsics.reifiedOperationMarker(4, "T");
        return BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Object.class), elementSerializer);
    }

    @NotNull
    public static final KSerializer<Double> serializer(@NotNull DoubleCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @NotNull
    @ExperimentalUnsignedTypes
    public static final KSerializer<UIntArray> UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Short> serializer(@NotNull ShortCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return ShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<UInt> serializer(@NotNull UInt.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UIntSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UByteArray> UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    @NotNull
    public static final <T> KSerializer<List<T>> ListSerializer(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ArrayListSerializer<T>(elementSerializer);
    }

    @NotNull
    public static final KSerializer<Duration> serializer(@NotNull Duration.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return DurationSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    @NotNull
    public static final <T> KSerializer<T> getNullable(@NotNull KSerializer<T> $this$nullable) {
        Intrinsics.checkNotNullParameter($this$nullable, "<this>");
        return $this$nullable.getDescriptor().isNullable() ? $this$nullable : (KSerializer)new NullableSerializer<T>($this$nullable);
    }

    @NotNull
    public static final KSerializer<Integer> serializer(@NotNull IntCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return IntSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UShortArray> UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    @NotNull
    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer<K, V>(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <A, B, C> KSerializer<Triple<A, B, C>> TripleSerializer(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new TripleSerializer<A, B, C>(aSerializer, bSerializer, cSerializer);
    }

    @NotNull
    public static final KSerializer<Boolean> serializer(@NotNull BooleanCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    @NotNull
    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new MapEntrySerializer<K, V>(keySerializer, valueSerializer);
    }

    @NotNull
    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(@NotNull KClass<T> kClass, @NotNull KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer<T, E>(kClass, elementSerializer);
    }

    @NotNull
    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Unit> serializer(@NotNull Unit $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UnitSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Float> serializer(@NotNull FloatCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return FloatSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<String> serializer(@NotNull StringCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return StringSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Byte> serializer(@NotNull ByteCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return ByteSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<UByte> serializer(@NotNull UByte.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UByteSerializer.INSTANCE;
    }
}

