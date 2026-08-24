@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.Collections
import java.util.Comparator
import java.util.Random
import kotlin.internal.InlineOnly

// $VF: Compiled from MutableCollectionsJVM.kt
@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun <T> MutableList<Any>.fill(value: Any) {
   Collections.fill(`$this$fill`, value)
}

@Deprecated(message = "Use sortWith(comparator) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(comparator)", imports = []), level = DeprecationLevel.ERROR)
@InlineOnly
public inline fun <T> MutableList<Any>.sort(comparator: Comparator<in Any>) {
   throw NotImplementedError(null, 1, null)
}

public fun <T> MutableList<Any>.sortWith(comparator: Comparator<in Any>) {
   if (`$this$sortWith`.size() > 1) {
      Collections.sort(`$this$sortWith`, comparator)
   }
}

@Deprecated(message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(Comparator(comparison))", imports = []), level = DeprecationLevel.ERROR)
@InlineOnly
public inline fun <T> MutableList<Any>.sort(comparison: (Any, Any) -> Int) {
   throw NotImplementedError(null, 1, null)
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun <T> MutableList<Any>.shuffle() {
   Collections.shuffle(`$this$shuffle`)
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun <T> MutableList<Any>.shuffle(random: Random) {
   Collections.shuffle(`$this$shuffle`, random)
}

open fun CollectionsKt__MutableCollectionsJVMKt() {
}

public fun <T : Comparable<Any>> MutableList<Any>.sort() {
   if (`$this$sort`.size() > 1) {
      Collections.sort(`$this$sort`)
   }
}
