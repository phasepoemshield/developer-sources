package kotlin.collections

import kotlin.jvm.internal.markers.KMutableSet

// $VF: Compiled from AbstractMutableSet.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractMutableSet<E> : java.util.AbstractSet<E>, java.util.Set<E>, KMutableSet {
   open fun AbstractMutableSet() {
   }

   public abstract override fun add(element: Any): Boolean {
   }

   abstract fun getSize(): Int
}
