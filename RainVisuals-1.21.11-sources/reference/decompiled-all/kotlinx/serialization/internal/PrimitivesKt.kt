package kotlinx.serialization.internal

import kotlin.jvm.internal.BooleanCompanionObject
import kotlin.jvm.internal.ByteCompanionObject
import kotlin.jvm.internal.CharCompanionObject
import kotlin.jvm.internal.DoubleCompanionObject
import kotlin.jvm.internal.FloatCompanionObject
import kotlin.jvm.internal.IntCompanionObject
import kotlin.jvm.internal.LongCompanionObject
import kotlin.jvm.internal.ShortCompanionObject
import kotlin.jvm.internal.StringCompanionObject
import kotlin.reflect.KClass
import kotlin.time.Duration
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from Primitives.kt
private final val BUILTIN_SERIALIZERS: Map<KClass<out Any>, KSerializer<out Any>> =
   MapsKt.mapOf(
      java.lang.String::class to BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE),
      Character::class to BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE),
      CharArray::class to BuiltinSerializersKt.CharArraySerializer(),
      java.lang.Double::class to BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE),
      DoubleArray::class to BuiltinSerializersKt.DoubleArraySerializer(),
      java.lang.Float::class to BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE),
      FloatArray::class to BuiltinSerializersKt.FloatArraySerializer(),
      java.lang.Long::class to BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE),
      LongArray::class to BuiltinSerializersKt.LongArraySerializer(),
      ULong::class to BuiltinSerializersKt.serializer(ULong.Companion),
      ULongArray::class to BuiltinSerializersKt.ULongArraySerializer(),
      Int::class to BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE),
      IntArray::class to BuiltinSerializersKt.IntArraySerializer(),
      UInt::class to BuiltinSerializersKt.serializer(UInt.Companion),
      UIntArray::class to BuiltinSerializersKt.UIntArraySerializer(),
      java.lang.Short::class to BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE),
      ShortArray::class to BuiltinSerializersKt.ShortArraySerializer(),
      UShort::class to BuiltinSerializersKt.serializer(UShort.Companion),
      UShortArray::class to BuiltinSerializersKt.UShortArraySerializer(),
      java.lang.Byte::class to BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE),
      ByteArray::class to BuiltinSerializersKt.ByteArraySerializer(),
      UByte::class to BuiltinSerializersKt.serializer(UByte.Companion),
      UByteArray::class to BuiltinSerializersKt.UByteArraySerializer(),
      java.lang.Boolean::class to BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE),
      BooleanArray::class to BuiltinSerializersKt.BooleanArraySerializer(),
      Unit::class to BuiltinSerializersKt.serializer(Unit.INSTANCE),
      Void::class to BuiltinSerializersKt.NothingSerializer(),
      Duration::class to BuiltinSerializersKt.serializer(Duration.Companion)
   )

private fun String.capitalize(): String {
   val var8: java.lang.String
   if (`$this$capitalize`.length() > 0) {
      val var10000: StringBuilder = StringBuilder()
      val it: Char = `$this$capitalize`.charAt(0)
      val var7: StringBuilder = var10000.append((Object)(if (Character.isLowerCase(it)) CharsKt.titlecase(it) else java.lang.String.valueOf(it)))
      val var10001: java.lang.String = `$this$capitalize`.substring(1)
      var8 = var7.append(var10001).toString()
   } else {
      var8 = `$this$capitalize`
   }

   return var8
}

internal fun <T : Any> KClass<Any>.builtinSerializerOrNull(): KSerializer<Any>? {
   return (KSerializer<T>)BUILTIN_SERIALIZERS.get(`$this$builtinSerializerOrNull`)
}

private fun checkName(serialName: String) {
   for (primitive in BUILTIN_SERIALIZERS.keySet()) {
      val var10000: java.lang.String = primitive.simpleName
      val simpleName: java.lang.String = capitalize(var10000)
      if (StringsKt.equals(serialName, "kotlin.$simpleName", true) || StringsKt.equals(serialName, simpleName, true)) {
         throw IllegalArgumentException(
            StringsKt.trimIndent(
               "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name $serialName there already exist ${capitalize(
                  simpleName
               )}Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            )
         )
      }
   }
}

internal fun PrimitiveDescriptorSafe(serialName: String, kind: PrimitiveKind): SerialDescriptor {
   checkName(serialName)
   return PrimitiveSerialDescriptor(serialName, kind)
}
