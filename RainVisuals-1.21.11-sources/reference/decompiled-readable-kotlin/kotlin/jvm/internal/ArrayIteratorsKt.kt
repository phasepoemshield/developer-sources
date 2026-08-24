package kotlin.jvm.internal

// $VF: Compiled from ArrayIterators.kt
public fun iterator(array: ByteArray): ByteIterator {
   return ArrayByteIterator(array)
}

public fun iterator(array: ShortArray): ShortIterator {
   return ArrayShortIterator(array)
}

public fun iterator(array: CharArray): CharIterator {
   return ArrayCharIterator(array)
}

public fun iterator(array: BooleanArray): BooleanIterator {
   return ArrayBooleanIterator(array)
}

public fun iterator(array: LongArray): LongIterator {
   return ArrayLongIterator(array)
}

public fun iterator(array: DoubleArray): DoubleIterator {
   return ArrayDoubleIterator(array)
}

public fun iterator(array: IntArray): IntIterator {
   return ArrayIntIterator(array)
}

public fun iterator(array: FloatArray): FloatIterator {
   return ArrayFloatIterator(array)
}
