package kotlin.jvm.optionals

import java.util.Optional

// $VF: Compiled from Optionals.kt
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.8")
public fun <T : Any, C : MutableCollection<in Any>> Optional<Any>.toCollection(destination: Any): Any {
   if (`$this$toCollection`.isPresent()) {
      val var10001: Any = `$this$toCollection`.get()
      destination.add(var10001)
   }

   return (C)destination
}

@SinceKotlin(version = "1.8")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun <T> Optional<out Any>.getOrElse(defaultValue: () -> Any): Any {
   return (T)(if (`$this$getOrElse`.isPresent()) `$this$getOrElse`.get() else defaultValue())
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.8")
public fun <T : Any> Optional<out Any>.toSet(): Set<Any> {
   return (java.util.Set<T>)(if (`$this$toSet`.isPresent()) SetsKt.setOf(`$this$toSet`.get()) else SetsKt.emptySet())
}

@SinceKotlin(version = "1.8")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T : Any> Optional<out Any>.toList(): List<Any> {
   return (java.util.List<T>)(if (`$this$toList`.isPresent()) CollectionsKt.listOf(`$this$toList`.get()) else CollectionsKt.emptyList())
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.8")
public fun <T : Any> Optional<out Any>.asSequence(): Sequence<Any> {
   return (Sequence<T>)(if (`$this$asSequence`.isPresent()) SequencesKt.sequenceOf(`$this$asSequence`.get()) else SequencesKt.emptySequence())
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.8")
public fun <T> Optional<out Any>.getOrDefault(defaultValue: Any): Any {
   return (T)(if (`$this$getOrDefault`.isPresent()) `$this$getOrDefault`.get() else defaultValue)
}

@SinceKotlin(version = "1.8")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T : Any> Optional<Any>.getOrNull(): Any? {
   return (T)`$this$getOrNull`.orElse(null)
}
