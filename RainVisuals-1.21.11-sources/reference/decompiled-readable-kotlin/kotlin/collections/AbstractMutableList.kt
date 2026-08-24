package kotlin.collections

import kotlin.jvm.internal.markers.KMutableList

// $VF: Compiled from AbstractMutableList.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractMutableList<E> : java.util.AbstractList<E>, java.util.List<E>, KMutableList {
   public abstract fun removeAt(index: Int): Any {
   }

   public abstract override operator fun set(index: Int, element: Any): Any {
   }

   public abstract override fun add(index: Int, element: Any) {
   }

   abstract fun getSize(): Int

   open fun AbstractMutableList() {
   }
}
