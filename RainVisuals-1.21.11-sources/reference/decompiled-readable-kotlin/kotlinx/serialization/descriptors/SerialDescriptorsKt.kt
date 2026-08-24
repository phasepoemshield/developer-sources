package kotlinx.serialization.descriptors

import kotlin.jvm.functions.Function1
import kotlin.reflect.KType
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.SerializersKt
import kotlinx.serialization.internal.ArrayListClassDesc
import kotlinx.serialization.internal.HashMapClassDesc
import kotlinx.serialization.internal.HashSetClassDesc
import kotlinx.serialization.internal.PrimitivesKt
import kotlinx.serialization.internal.SerialDescriptorForNullable

// $VF: Compiled from SerialDescriptors.kt
@ExperimentalSerializationApi
public fun listSerialDescriptor(elementDescriptor: SerialDescriptor): SerialDescriptor {
   return ArrayListClassDesc(elementDescriptor)
}

@ExperimentalSerializationApi
public fun mapSerialDescriptor(keyDescriptor: SerialDescriptor, valueDescriptor: SerialDescriptor): SerialDescriptor {
   return HashMapClassDesc(keyDescriptor, valueDescriptor)
}

@ExperimentalSerializationApi
public fun SerialDescriptor(serialName: String, original: SerialDescriptor): SerialDescriptor {
   if (StringsKt.isBlank(serialName)) {
      throw IllegalArgumentException("Blank serial names are prohibited".toString())
   } else if (original.kind is PrimitiveKind) {
      throw IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead".toString())
   } else if (serialName == original.serialName) {
      throw IllegalArgumentException(
         ("The name of the wrapped descriptor ($serialName) cannot be the same as the name of the original descriptor (${original.serialName})").toString()
      )
   } else {
      return WrappedSerialDescriptor(serialName, original)
   }
}

@ExperimentalSerializationApi
public fun setSerialDescriptor(elementDescriptor: SerialDescriptor): SerialDescriptor {
   return HashSetClassDesc(elementDescriptor)
}

public final val nullable: SerialDescriptor
   public final get() {
      return if (`$this$nullable`.isNullable) `$this$nullable` else SerialDescriptorForNullable(`$this$nullable`)
   }


public fun PrimitiveSerialDescriptor(serialName: String, kind: PrimitiveKind): SerialDescriptor {
   if (StringsKt.isBlank(serialName)) {
      throw IllegalArgumentException("Blank serial names are prohibited".toString())
   } else {
      return PrimitivesKt.PrimitiveDescriptorSafe(serialName, kind)
   }
}

@InternalSerializationApi
public fun buildSerialDescriptor(
   serialName: String,
   kind: SerialKind,
   vararg typeParameters: SerialDescriptor,
   builder: (ClassSerialDescriptorBuilder) -> Unit = {
      } as Function1
): SerialDescriptor {
   if (StringsKt.isBlank(serialName)) {
      throw IllegalArgumentException("Blank serial names are prohibited".toString())
   } else if (kind == StructureKind.CLASS.INSTANCE) {
      throw IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString())
   } else {
      val sdBuilder: ClassSerialDescriptorBuilder = ClassSerialDescriptorBuilder(serialName)
      builder(sdBuilder)
      return SerialDescriptorImpl(serialName, kind, sdBuilder.elementNames.size(), ArraysKt.toList(typeParameters), sdBuilder)
   }
}

public fun serialDescriptor(type: KType): SerialDescriptor {
   return SerializersKt.serializer(type).descriptor
}

public fun buildClassSerialDescriptor(serialName: String, vararg typeParameters: SerialDescriptor, builderAction: (ClassSerialDescriptorBuilder) -> Unit = {
   } as Function1): SerialDescriptor {
   if (StringsKt.isBlank(serialName)) {
      throw IllegalArgumentException("Blank serial names are prohibited".toString())
   } else {
      val sdBuilder: ClassSerialDescriptorBuilder = ClassSerialDescriptorBuilder(serialName)
      builderAction(sdBuilder)
      return SerialDescriptorImpl(serialName, StructureKind.CLASS.INSTANCE, sdBuilder.elementNames.size(), ArraysKt.toList(typeParameters), sdBuilder)
   }
}
