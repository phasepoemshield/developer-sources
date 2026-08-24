@file:JvmMultifileClass
@file:JvmName("SequencesKt")

package kotlin.sequences

import java.util.ArrayList
import kotlin.internal.InlineOnly
import kotlin.internal.LowPriorityInOverloadResolution
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.random.Random

// $VF: Compiled from Sequences.kt
public fun <T> Sequence<Sequence<Any>>.flatten(): Sequence<Any> {
   return flatten$SequencesKt__SequencesKt(`$this$flatten`, { it ->
      it.iterator()
   })
}

public fun <T : Any> generateSequence(seedFunction: () -> Any?, nextFunction: (Any) -> Any?): Sequence<Any> {
   return GeneratorSequence(seedFunction, nextFunction)
}

public fun <T> emptySequence(): Sequence<Any> {
   return EmptySequence.INSTANCE
}

@SinceKotlin(version = "1.3")
public fun <T> Sequence<Any>.ifEmpty(defaultValue: () -> Sequence<Any>): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

@JvmName(name = "flattenSequenceOfIterable")
public fun <T> Sequence<Iterable<Any>>.flatten(): Sequence<Any> {
   return flatten$SequencesKt__SequencesKt(`$this$flatten`, { it ->
      it.iterator()
   })
}

internal fun <T, C, R> flatMapIndexed(source: Sequence<Any>, transform: (Int, Any) -> Any, iterator: (Any) -> Iterator<Any>): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

@InlineOnly
public inline fun <T> Sequence(crossinline iterator: () -> Iterator<Any>): Sequence<Any> {
   return    // $VF: Compiled from Sequences.kt
object : Sequence<Any> {
      public override operator fun iterator(): Iterator<Any> {
         return iterator() as MutableIterator<T>
      }
   }
}

public fun <T> sequenceOf(vararg elements: Any): Sequence<Any> {
   return if (elements.length == 0) SequencesKt.emptySequence() else ArraysKt.asSequence(elements)
}

public fun <T : Any> generateSequence(nextFunction: () -> Any?): Sequence<Any> {
   return SequencesKt.constrainOnce(GeneratorSequence(nextFunction,    // $VF: Compiled from Sequences.kt
{ it: Any ->
      return (T)nextFunction()
   } as Function1))
}

public fun <T, R> Sequence<Pair<Any, Any>>.unzip(): Pair<List<Any>, List<Any>> {
   val listT: ArrayList = ArrayList()
   val listR: ArrayList = ArrayList()

   for (pair in `$this$unzip`) {
      listT.add(pair.first)
      listR.add(pair.second)
   }

   return listT to listR
}

private fun <T, R> Sequence<Any>.flatten(iterator: (Any) -> Iterator<Any>): Sequence<Any> {
   return if (`$this$flatten` is TransformingSequence)
      (`$this$flatten` as TransformingSequence).flatten$kotlin_stdlib(iterator)
      else
      FlatteningSequence(`$this$flatten`, { it ->
         it
      }, iterator)
   }

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <T> Sequence<Any>?.orEmpty(): Sequence<Any> {
   var var10000: Sequence = `$this$orEmpty`
   if (`$this$orEmpty` == null) {
      var10000 = SequencesKt.emptySequence()
   }

   return var10000
}

@LowPriorityInOverloadResolution
public fun <T : Any> generateSequence(seed: Any?, nextFunction: (Any) -> Any?): Sequence<Any> {
   return if (seed == null) EmptySequence.INSTANCE else GeneratorSequence(   // $VF: Compiled from Sequences.kt
{
      return (T)seed
   } as Function0, nextFunction)
}

public fun <T> Iterator<Any>.asSequence(): Sequence<Any> {
   return SequencesKt.constrainOnce(SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(`$this$asSequence`))
}

@SinceKotlin(version = "1.4")
public fun <T> Sequence<Any>.shuffled(): Sequence<Any> {
   return SequencesKt.shuffled(`$this$shuffled`, Random.Default)
}

open fun SequencesKt__SequencesKt() {
}

@SinceKotlin(version = "1.4")
public fun <T> Sequence<Any>.shuffled(random: Random): Sequence<Any> {
   return SequencesKt.sequence(   // $VF: Compiled from Sequences.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

public fun <T> Sequence<Any>.constrainOnce(): Sequence<Any> {
   return if (`$this$constrainOnce` is ConstrainedOnceSequence) `$this$constrainOnce` else ConstrainedOnceSequence(`$this$constrainOnce`)
}
