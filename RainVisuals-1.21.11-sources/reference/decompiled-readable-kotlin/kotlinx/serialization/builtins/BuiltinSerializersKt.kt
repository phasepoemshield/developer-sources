package kotlinx.serialization.builtins

import kotlin.Char.Companion
import kotlin.collections.Map.Entry
import kotlin.reflect.KClass
import kotlin.time.Duration
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.internal.ArrayListSerializer
import kotlinx.serialization.internal.BooleanArraySerializer
import kotlinx.serialization.internal.BooleanSerializer
import kotlinx.serialization.internal.ByteArraySerializer
import kotlinx.serialization.internal.ByteSerializer
import kotlinx.serialization.internal.CharArraySerializer
import kotlinx.serialization.internal.CharSerializer
import kotlinx.serialization.internal.DoubleArraySerializer
import kotlinx.serialization.internal.DoubleSerializer
import kotlinx.serialization.internal.DurationSerializer
import kotlinx.serialization.internal.FloatArraySerializer
import kotlinx.serialization.internal.FloatSerializer
import kotlinx.serialization.internal.IntArraySerializer
import kotlinx.serialization.internal.IntSerializer
import kotlinx.serialization.internal.LinkedHashMapSerializer
import kotlinx.serialization.internal.LinkedHashSetSerializer
import kotlinx.serialization.internal.LongArraySerializer
import kotlinx.serialization.internal.LongSerializer
import kotlinx.serialization.internal.MapEntrySerializer
import kotlinx.serialization.internal.NothingSerializer
import kotlinx.serialization.internal.NullableSerializer
import kotlinx.serialization.internal.PairSerializer
import kotlinx.serialization.internal.ReferenceArraySerializer
import kotlinx.serialization.internal.ShortArraySerializer
import kotlinx.serialization.internal.ShortSerializer
import kotlinx.serialization.internal.StringSerializer
import kotlinx.serialization.internal.TripleSerializer
import kotlinx.serialization.internal.UByteArraySerializer
import kotlinx.serialization.internal.UByteSerializer
import kotlinx.serialization.internal.UIntArraySerializer
import kotlinx.serialization.internal.UIntSerializer
import kotlinx.serialization.internal.ULongArraySerializer
import kotlinx.serialization.internal.ULongSerializer
import kotlinx.serialization.internal.UShortArraySerializer
import kotlinx.serialization.internal.UShortSerializer
import kotlinx.serialization.internal.UnitSerializer

// $VF: Compiled from BuiltinSerializers.kt
public fun Companion.serializer(): KSerializer<Char> {
   return CharSerializer.INSTANCE
}

public fun <K, V> PairSerializer(keySerializer: KSerializer<Any>, valueSerializer: KSerializer<Any>): KSerializer<Pair<Any, Any>> {
   return PairSerializer(keySerializer, valueSerializer)
}

public fun <T> SetSerializer(elementSerializer: KSerializer<Any>): KSerializer<Set<Any>> {
   return LinkedHashSetSerializer(elementSerializer)
}

@ExperimentalSerializationApi
public fun NothingSerializer(): KSerializer<Nothing> {
   return NothingSerializer.INSTANCE
}

public fun ByteArraySerializer(): KSerializer<ByteArray> {
   return ByteArraySerializer.INSTANCE
}

public fun kotlin.UShort.Companion.serializer(): KSerializer<UShort> {
   return UShortSerializer.INSTANCE
}

public fun kotlin.ULong.Companion.serializer(): KSerializer<ULong> {
   return ULongSerializer.INSTANCE
}

@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
public fun ULongArraySerializer(): KSerializer<ULongArray> {
   return ULongArraySerializer.INSTANCE
}

public fun kotlin.Long.Companion.serializer(): KSerializer<Long> {
   return LongSerializer.INSTANCE
}

public fun kotlin.Double.Companion.serializer(): KSerializer<Double> {
   return DoubleSerializer.INSTANCE
}

@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
public fun UIntArraySerializer(): KSerializer<UIntArray> {
   return UIntArraySerializer.INSTANCE
}

public fun kotlin.Short.Companion.serializer(): KSerializer<Short> {
   return ShortSerializer.INSTANCE
}

public fun kotlin.UInt.Companion.serializer(): KSerializer<UInt> {
   return UIntSerializer.INSTANCE
}

@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
public fun UByteArraySerializer(): KSerializer<UByteArray> {
   return UByteArraySerializer.INSTANCE
}

public fun IntArraySerializer(): KSerializer<IntArray> {
   return IntArraySerializer.INSTANCE
}

public fun <T> ListSerializer(elementSerializer: KSerializer<Any>): KSerializer<List<Any>> {
   return ArrayListSerializer(elementSerializer)
}

public fun kotlin.time.Duration.Companion.serializer(): KSerializer<Duration> {
   return DurationSerializer.INSTANCE
}

public fun ShortArraySerializer(): KSerializer<ShortArray> {
   return ShortArraySerializer.INSTANCE
}

public fun BooleanArraySerializer(): KSerializer<BooleanArray> {
   return BooleanArraySerializer.INSTANCE
}

public final val nullable: KSerializer<Any?>
   public final get() {
      return if (`$this$nullable`.descriptor.isNullable) `$this$nullable` else NullableSerializer(`$this$nullable`)
   }


public fun kotlin.Int.Companion.serializer(): KSerializer<Int> {
   return IntSerializer.INSTANCE
}

@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
public fun UShortArraySerializer(): KSerializer<UShortArray> {
   return UShortArraySerializer.INSTANCE
}

public fun <K, V> MapSerializer(keySerializer: KSerializer<Any>, valueSerializer: KSerializer<Any>): KSerializer<Map<Any, Any>> {
   return LinkedHashMapSerializer(keySerializer, valueSerializer)
}

public fun <A, B, C> TripleSerializer(aSerializer: KSerializer<Any>, bSerializer: KSerializer<Any>, cSerializer: KSerializer<Any>): KSerializer<
      Triple<Any, Any, Any>
   > {
   return TripleSerializer(aSerializer, bSerializer, cSerializer)
}

public fun kotlin.Boolean.Companion.serializer(): KSerializer<Boolean> {
   return BooleanSerializer.INSTANCE
}

public fun <K, V> MapEntrySerializer(keySerializer: KSerializer<Any>, valueSerializer: KSerializer<Any>): KSerializer<Entry<Any, Any>> {
   return MapEntrySerializer(keySerializer, valueSerializer)
}

public fun FloatArraySerializer(): KSerializer<FloatArray> {
   return FloatArraySerializer.INSTANCE
}

@ExperimentalSerializationApi
public fun <T : Any, E : Any?> ArraySerializer(kClass: KClass<Any>, elementSerializer: KSerializer<Any>): KSerializer<Array<Any>> {
   return ReferenceArraySerializer(kClass, elementSerializer)
}

public fun LongArraySerializer(): KSerializer<LongArray> {
   return LongArraySerializer.INSTANCE
}

public fun Unit.serializer(): KSerializer<Unit> {
   return UnitSerializer.INSTANCE
}

public fun kotlin.Float.Companion.serializer(): KSerializer<Float> {
   return FloatSerializer.INSTANCE
}

public fun DoubleArraySerializer(): KSerializer<DoubleArray> {
   return DoubleArraySerializer.INSTANCE
}

public fun kotlin.String.Companion.serializer(): KSerializer<String> {
   return StringSerializer.INSTANCE
}

public fun kotlin.Byte.Companion.serializer(): KSerializer<Byte> {
   return ByteSerializer.INSTANCE
}

public fun CharArraySerializer(): KSerializer<CharArray> {
   return CharArraySerializer.INSTANCE
}

public fun kotlin.UByte.Companion.serializer(): KSerializer<UByte> {
   return UByteSerializer.INSTANCE
}
