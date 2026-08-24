package kotlinx.serialization

import java.util.Map.Entry
import kotlin.reflect.KClass

// $VF: Compiled from _Collections.kt
// $VF: local visibility outside of methodSupplier
internal class `SealedClassSerializer$special$$inlined$groupingBy$1` :
   Grouping<Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, java.lang.String> {
   public override fun keyOf(element: Any): Any {
      return ((element as Entry).getValue() as KSerializer).descriptor.serialName
   }

   fun `SealedClassSerializer$special$$inlined$groupingBy$1`(`$receiver`: java.lang.Iterable) {
      this.$this_groupingBy = `$receiver`
   }

   public override fun sourceIterator(): Iterator<Any> {
      return this.$this_groupingBy.iterator()
   }
}
