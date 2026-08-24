package kotlin.jvm.internal

// $VF: Compiled from ArrayIterator.kt
public fun <T> iterator(array: Array<Any>): Iterator<Any> {
   return (java.util.Iterator<T>)ArrayIterator<>(array)
}
