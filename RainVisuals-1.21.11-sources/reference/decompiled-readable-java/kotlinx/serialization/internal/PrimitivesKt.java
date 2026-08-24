/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011\"6\u0010\u0013\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\r0\u00128\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2={"", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveDescriptorSafe", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "checkName", "(Ljava/lang/String;)V", "", "T", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "builtinSerializerOrNull", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "capitalize", "(Ljava/lang/String;)Ljava/lang/String;", "", "BUILTIN_SERIALIZERS", "Ljava/util/Map;", "getBUILTIN_SERIALIZERS$annotations", "()V", "kotlinx-serialization-core"})
public final class PrimitivesKt {
    @NotNull
    private static final Map<KClass<? extends Object>, KSerializer<? extends Object>> BUILTIN_SERIALIZERS;

    static {
        Pair[] pairArray = new Pair[28];
        pairArray[0] = TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
        pairArray[1] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
        pairArray[2] = TuplesKt.to(Reflection.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer());
        pairArray[3] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
        pairArray[4] = TuplesKt.to(Reflection.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        pairArray[5] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
        pairArray[6] = TuplesKt.to(Reflection.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        pairArray[7] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
        pairArray[8] = TuplesKt.to(Reflection.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer());
        pairArray[9] = TuplesKt.to(Reflection.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.Companion));
        pairArray[10] = TuplesKt.to(Reflection.getOrCreateKotlinClass(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer());
        pairArray[11] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
        pairArray[12] = TuplesKt.to(Reflection.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer());
        pairArray[13] = TuplesKt.to(Reflection.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.Companion));
        pairArray[14] = TuplesKt.to(Reflection.getOrCreateKotlinClass(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer());
        pairArray[15] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
        pairArray[16] = TuplesKt.to(Reflection.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        pairArray[17] = TuplesKt.to(Reflection.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.Companion));
        pairArray[18] = TuplesKt.to(Reflection.getOrCreateKotlinClass(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer());
        pairArray[19] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
        pairArray[20] = TuplesKt.to(Reflection.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        pairArray[21] = TuplesKt.to(Reflection.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.Companion));
        pairArray[22] = TuplesKt.to(Reflection.getOrCreateKotlinClass(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer());
        pairArray[23] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
        pairArray[24] = TuplesKt.to(Reflection.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        pairArray[25] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE));
        pairArray[26] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer());
        pairArray[27] = TuplesKt.to(Reflection.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.Companion));
        BUILTIN_SERIALIZERS = MapsKt.mapOf(pairArray);
    }

    private static /* synthetic */ void getBUILTIN_SERIALIZERS$annotations() {
    }

    /*
     * WARNING - void declaration
     */
    private static final String capitalize(String $this$capitalize) {
        String string;
        String string2 = $this$capitalize;
        boolean bl = ((CharSequence)string2).length() > 0;
        if (bl) {
            void var2_2;
            char it = string2.charAt(0);
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl2 = false;
            StringBuilder stringBuilder2 = stringBuilder.append((Object)(Character.isLowerCase(it) ? CharsKt.titlecase(it) : String.valueOf((char)var2_2)));
            String string3 = string2;
            int n = 1;
            String string4 = string3.substring(n);
            Intrinsics.checkNotNullExpressionValue(string4, "substring(...)");
            string = stringBuilder2.append(string4).toString();
        } else {
            string = string2;
        }
        return string;
    }

    @Nullable
    public static final <T> KSerializer<T> builtinSerializerOrNull(@NotNull KClass<T> $this$builtinSerializerOrNull) {
        Intrinsics.checkNotNullParameter($this$builtinSerializerOrNull, "<this>");
        return BUILTIN_SERIALIZERS.get($this$builtinSerializerOrNull);
    }

    private static final void checkName(String serialName) {
        Set<KClass<? extends Object>> keys2 = BUILTIN_SERIALIZERS.keySet();
        Iterator<KClass<? extends Object>> iterator2 = keys2.iterator();
        while (iterator2.hasNext()) {
            KClass<? extends Object> primitive = iterator2.next();
            String string = primitive.getSimpleName();
            Intrinsics.checkNotNull(string);
            String simpleName = PrimitivesKt.capitalize(string);
            String qualifiedName = "kotlin." + simpleName;
            if (!StringsKt.equals(serialName, qualifiedName, true)) {
                if (!StringsKt.equals(serialName, simpleName, true)) continue;
            }
            throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exist " + PrimitivesKt.capitalize(simpleName) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
        }
    }

    @NotNull
    public static final SerialDescriptor PrimitiveDescriptorSafe(@NotNull String serialName, @NotNull PrimitiveKind kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        PrimitivesKt.checkName(serialName);
        return new PrimitiveSerialDescriptor(serialName, kind);
    }
}

