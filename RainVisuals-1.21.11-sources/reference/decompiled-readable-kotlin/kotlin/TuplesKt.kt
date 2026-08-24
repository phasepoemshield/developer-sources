@file:JvmName(name = "TuplesKt")

package kotlin

// $VF: Compiled from Tuples.kt
public fun <T> Triple<Any, Any, Any>.toList(): List<Any> {
   return (java.util.List<T>)CollectionsKt.listOf(`$this$toList`.first, `$this$toList`.second, `$this$toList`.third)
}

public fun <T> Pair<Any, Any>.toList(): List<Any> {
   return (java.util.List<T>)CollectionsKt.listOf(`$this$toList`.first, `$this$toList`.second)
}

public infix fun <A, B> Any.to(that: Any): Pair<Any, Any> {
   return (Pair<A, B>)Pair<>(`$this$to`, that)
}
