package kotlinx.serialization.internal

import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from JsonInternalDependencies.kt
@CoreFriendModuleApi
public fun SerialDescriptor.jsonCachedSerialNames(): Set<String> {
   return Platform_commonKt.cachedSerialNames(`$this$jsonCachedSerialNames`)
}
