package kotlin.collections.builders

import java.io.NotSerializableException
import java.io.Serializable
import java.util.Arrays
import java.util.ConcurrentModificationException
import java.util.NoSuchElementException
import kotlin.collections.MutableMap.MutableEntry
import kotlin.jvm.internal.markers.KMutableIterator
import kotlin.jvm.internal.markers.KMutableMap

// $VF: Compiled from MapBuilder.kt
internal class MapBuilder<K, V> private constructor(vararg keysArray: Any,
      vararg valuesArray: Any,
      presenceArray: IntArray,
      hashArray: IntArray,
      maxProbeDistance: Int,
      length: Int
   ) :
   java.util.Map<K, V>,
   Serializable,
   KMutableMap {
   internal final var isReadOnly: Boolean
      private set

   public open var size: Int
      private set

   private final var keysArray: Array<Any>
   private final var presenceArray: IntArray
   private final var hashArray: IntArray
   private final var length: Int
   private final var hashShift: Int
   private final var maxProbeDistance: Int
   private final var keysView: MapBuilderKeys<Any>?
   private final var valuesArray: Array<Any>?
   private final var modCount: Int
   private final var entriesView: MapBuilderEntries<Any, Any>?
   private final var valuesView: MapBuilderValues<Any>?

   public override fun hashCode(): Int {
      var result: Int = 0
      val it: MapBuilder.EntriesItr = this.entriesIterator$kotlin_stdlib()

      while (it.hasNext()) {
         result += it.nextHashCode$kotlin_stdlib()
      }

      return result
   }

   public fun build(): Map<Any, Any> {
      this.checkIsMutable$kotlin_stdlib()
      this.isReadOnly = true
      var var10000: java.util.Map
      if (this.size() > 0) {
         var10000 = this
      } else {
         var10000 = Empty
         var10000 = var10000
      }

      return var10000
   }

   public override operator fun equals(other: Any?): Boolean {
      return other === this || other is java.util.Map && this.contentEquals(other as MutableMap<*, *>)
   }

   public override fun put(key: Any, value: Any): Any? {
      this.checkIsMutable$kotlin_stdlib()
      val index: Int = this.addKey$kotlin_stdlib((K)key)
      val valuesArray: Array<Any> = this.allocateValuesArray()
      if (index < 0) {
         val oldValue: Any = valuesArray[-index - 1]
         valuesArray[-index - 1] = value
         return (V)oldValue
      } else {
         valuesArray[index] = value
         return null
      }
   }

   private fun removeKeyAt(index: Int) {
      ListBuilderKt.resetAt(this.keysArray, index)
      this.removeHashAt(this.presenceArray[index])
      this.presenceArray[index] = -1
      this.size = this.size() + -1
      this.registerModification()
   }

   public constructor(initialCapacity: Int) : this(
         (K[])ListBuilderKt.arrayOfUninitializedElements(initialCapacity),
         null,
         IntArray(initialCapacity),
         IntArray(Companion.computeHashSize(initialCapacity)),
         2,
         0
      )
   private fun shouldCompact(extraCapacity: Int): Boolean {
      val spareCapacity: Int = this.capacity - this.length
      val gaps: Int = this.length - this.size()
      return spareCapacity < extraCapacity && gaps + spareCapacity >= extraCapacity && gaps >= this.capacity / 4
   }

   public open val entries: MutableSet<MutableEntry<Any, Any>>
      public open get() {
         if (this.entriesView == null) {
            val var2: MapBuilderEntries = MapBuilderEntries<>(this)
            this.entriesView = var2
            return var2
         } else {
            return this.entriesView as MutableSet<MutableMap.MutableEntry<K, V>>
         }
      }


   public override fun isEmpty(): Boolean {
      return this.size() == 0
   }

   internal final val capacity: Int
      internal final get() {
         return this.keysArray.length
      }


   internal fun valuesIterator(): kotlin.collections.builders.MapBuilder.ValuesItr<Any, Any> {
      return MapBuilder.ValuesItr<>(this)
   }

   public override fun containsKey(key: Any): Boolean {
      return this.findKey((K)key) >= 0
   }

   private fun findKey(key: Any): Int {
      var hash: Int = this.hash((K)key)
      val probesLeft: Int = this.maxProbeDistance

      while (true) {
         val index: Int = this.hashArray[hash]
         if (this.hashArray[hash] == 0) {
            return -1
         }

         if (index > 0 && this.keysArray[index - 1] == key) {
            return index - 1
         }

         if (--probesLeft < 0) {
            return -1
         }

         if (hash-- == 0) {
            hash = this.hashSize - 1
         }
      }
   }

   private fun ensureCapacity(minCapacity: Int) {
      if (minCapacity < 0) {
         throw OutOfMemoryError()
      } else {
         if (minCapacity > this.capacity) {
            val newSize: Int = AbstractList.Companion.newCapacity$kotlin_stdlib(this.capacity, minCapacity)
            this.keysArray = ListBuilderKt.copyOfUninitializedElements(this.keysArray, newSize)
            this.valuesArray = if (this.valuesArray != null) ListBuilderKt.copyOfUninitializedElements(this.valuesArray, newSize) else null
            val var10001: IntArray = Arrays.copyOf(this.presenceArray, newSize)
            this.presenceArray = var10001
            val newHashSize: Int = Companion.computeHashSize(newSize)
            if (newHashSize > this.hashSize) {
               this.rehash(newHashSize)
            }
         }
      }
   }

   private fun writeReplace(): Any {
      if (this.isReadOnly) {
         return SerializedMap(this)
      } else {
         throw NotSerializableException("The map cannot be serialized while it is being built.")
      }
   }

   private fun ensureExtraCapacity(n: Int) {
      if (this.shouldCompact(n)) {
         this.rehash(this.hashSize)
      } else {
         this.ensureCapacity(this.length + n)
      }
   }

   private fun putEntry(entry: kotlin.collections.Map.Entry<Any, Any>): Boolean {
      val index: Int = this.addKey$kotlin_stdlib((K)entry.getKey())
      val valuesArray: Array<Any> = this.allocateValuesArray()
      if (index >= 0) {
         valuesArray[index] = entry.getValue()
         return true
      } else if (!(entry.getValue() == valuesArray[-index - 1])) {
         valuesArray[-index - 1] = entry.getValue()
         return true
      } else {
         return false
      }
   }

   public override operator fun get(key: Any): Any? {
      val index: Int = this.findKey((K)key)
      if (index < 0) {
         return null
      } else {
         val var10000: Array<Any> = this.valuesArray
         return (V)var10000[index]
      }
   }

   private fun findValue(value: Any): Int {
      val i: Int = this.length

      while (--i >= 0) {
         if (this.presenceArray[i] >= 0) {
            val var10000: Array<Any> = this.valuesArray
            if (var10000[i] == value) {
               return i
            }
         }
      }

      return -1
   }

   internal fun removeKey(key: Any): Int {
      this.checkIsMutable$kotlin_stdlib()
      val index: Int = this.findKey((K)key)
      if (index < 0) {
         return -1
      } else {
         this.removeKeyAt(index)
         return index
      }
   }

   internal fun addKey(key: Any): Int {
      this.checkIsMutable$kotlin_stdlib()

      label51@ while (true) {
         var hash: Int = this.hash((K)key)
         val tentativeMaxProbeDistance: Int = RangesKt.coerceAtMost(this.maxProbeDistance * 2, this.hashSize / 2)
         val probeDistance: Int = 0

         while (true) {
            val index: Int = this.hashArray[hash]
            if (this.hashArray[hash] <= 0) {
               if (this.length < this.capacity) {
                  val putIndex: Int = this.length++
                  this.keysArray[putIndex] = (K)key
                  this.presenceArray[putIndex] = hash
                  this.hashArray[hash] = putIndex + 1
                  this.size = this.size() + 1
                  this.registerModification()
                  if (probeDistance > this.maxProbeDistance) {
                     this.maxProbeDistance = probeDistance
                  }

                  return putIndex
               }

               this.ensureExtraCapacity(1)
               continue@label51
            }

            if (this.keysArray[index - 1] == key) {
               return -index
            }

            if (++probeDistance > tentativeMaxProbeDistance) {
               this.rehash(this.hashSize * 2)
               continue@label51
            }

            if (hash-- == 0) {
               hash = this.hashSize - 1
            }
         }
      }
   }

   internal fun containsAllEntries(m: Collection<*>): Boolean {
      for (entry in m) {
         try {
            if (entry == null || !this.containsEntry$kotlin_stdlib(entry as MutableMap.MutableEntry<K, V>)) {
               return false
            }
         } catch (var5: ClassCastException) {
            return false
         }
      }

      return true
   }

   private fun hash(key: Any): Int {
      return (if (key != null) key.hashCode() else 0) * -1640531527 ushr this.hashShift
   }

   public open val keys: MutableSet<Any>
      public open get() {
         val var10000: java.util.Set
         if (this.keysView == null) {
            val var2: MapBuilderKeys = MapBuilderKeys<>(this)
            this.keysView = var2
            var10000 = var2
         } else {
            var10000 = this.keysView
         }

         return var10000
      }


   public override fun clear() {
      this.checkIsMutable$kotlin_stdlib()
      val var1: IntIterator = IntRange(0, this.length - 1).iterator()

      while (var1.hasNext()) {
         val i: Int = var1.nextInt()
         val hash: Int = this.presenceArray[i]
         if (this.presenceArray[i] >= 0) {
            this.hashArray[hash] = 0
            this.presenceArray[i] = -1
         }
      }

      ListBuilderKt.resetRange(this.keysArray, 0, this.length)
      if (this.valuesArray != null) {
         ListBuilderKt.resetRange(this.valuesArray, 0, this.length)
      }

      this.size = 0
      this.length = 0
      this.registerModification()
   }

   internal fun keysIterator(): kotlin.collections.builders.MapBuilder.KeysItr<Any, Any> {
      return MapBuilder.KeysItr<>(this)
   }

   private fun registerModification() {
      this.modCount++
   }

   private fun putAllEntries(from: Collection<kotlin.collections.Map.Entry<Any, Any>>): Boolean {
      if (from.isEmpty()) {
         return false
      } else {
         this.ensureExtraCapacity(from.size())
         val it: java.util.Iterator = from.iterator()
         var updated: Boolean = false

         while (it.hasNext()) {
            if (this.putEntry(it.next() as MutableMap.MutableEntry<K, V>)) {
               updated = true
            }
         }

         return updated
      }
   }

   private fun allocateValuesArray(): Array<Any> {
      if (this.valuesArray != null) {
         return this.valuesArray
      } else {
         val newValuesArray: Array<Any> = ListBuilderKt.arrayOfUninitializedElements(this.capacity)
         this.valuesArray = (V[])newValuesArray
         return (V[])newValuesArray
      }
   }

   public override fun remove(key: Any): Any? {
      val index: Int = this.removeKey$kotlin_stdlib((K)key)
      if (index < 0) {
         return null
      } else {
         val var10000: Array<Any> = this.valuesArray
         val oldValue: Any = var10000[index]
         ListBuilderKt.resetAt(var10000, index)
         return (V)oldValue
      }
   }

   private fun putRehash(i: Int): Boolean {
      var hash: Int = this.hash(this.keysArray[i])
      val probesLeft: Int = this.maxProbeDistance

      while (true) {
         if (this.hashArray[hash] == 0) {
            this.hashArray[hash] = i + 1
            this.presenceArray[i] = hash
            return true
         }

         if (--probesLeft < 0) {
            return false
         }

         if (hash-- == 0) {
            hash = this.hashSize - 1
         }
      }
   }

   init {
      this.keysArray = (K[])keysArray
      this.valuesArray = (V[])valuesArray
      this.presenceArray = presenceArray
      this.hashArray = hashArray
      this.maxProbeDistance = maxProbeDistance
      this.length = length
      this.hashShift = Companion.computeShift(this.hashSize)
   }

   public override fun containsValue(value: Any): Boolean {
      return this.findValue((V)value) >= 0
   }

   private fun rehash(newHashSize: Int) {
      this.registerModification()
      if (this.length > this.size()) {
         this.compact()
      }

      if (newHashSize != this.hashSize) {
         this.hashArray = IntArray(newHashSize)
         this.hashShift = Companion.computeShift(newHashSize)
      } else {
         ArraysKt.fill((int[])this.hashArray, (int)0, 0, this.hashSize)
      }

      val i: Int = 0

      while (i < this.length) {
         if (!this.putRehash(i++)) {
            throw IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?")
         }
      }
   }

   private fun contentEquals(other: Map<*, *>): Boolean {
      return this.size() == other.size() && this.containsAllEntries$kotlin_stdlib(other.entrySet())
   }

   internal fun checkIsMutable() {
      if (this.isReadOnly) {
         throw UnsupportedOperationException()
      }
   }

   public open val values: MutableCollection<Any>
      public open get() {
         val var10000: java.util.Collection
         if (this.valuesView == null) {
            val var2: MapBuilderValues = MapBuilderValues<>(this)
            this.valuesView = var2
            var10000 = var2
         } else {
            var10000 = this.valuesView
         }

         return var10000
      }


   public constructor() : this(8)
   private final val hashSize: Int
      private final get() {
         return this.hashArray.length
      }


   internal fun entriesIterator(): kotlin.collections.builders.MapBuilder.EntriesItr<Any, Any> {
      return MapBuilder.EntriesItr<>(this)
   }

   public override fun toString(): String {
      val sb: StringBuilder = StringBuilder(2 + this.size() * 3)
      sb.append("{")
      var i: Int = 0

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val it: MapBuilder.EntriesItr = this.entriesIterator$kotlin_stdlib()
      while (true) {
         if (it.hasNext()) break
         if (i > 0) {
            sb.append(", ")
         }

         it.nextAppendString(sb)

         i++
      }

      sb.append("}")
      val var10000: java.lang.String = sb.toString()
      return var10000
   }

   private fun removeHashAt(removedHash: Int) {
      var hash: Int = removedHash
      var hole: Int = removedHash
      var probeDistance: Int = 0
      val patchAttemptsLeft: Int = RangesKt.coerceAtMost(this.maxProbeDistance * 2, this.hashSize / 2)

      do {
         if (hash-- == 0) {
            hash = this.hashSize - 1
         }

         if (++probeDistance > this.maxProbeDistance) {
            this.hashArray[hole] = 0
            return
         }

         val index: Int = this.hashArray[hash]
         if (this.hashArray[hash] == 0) {
            this.hashArray[hole] = 0
            return
         }

         if (index < 0) {
            this.hashArray[hole] = -1
            hole = hash
            probeDistance = 0
         } else if ((this.hash(this.keysArray[index - 1]) - hash and this.hashSize - 1) >= probeDistance) {
            this.hashArray[hole] = index
            this.presenceArray[index - 1] = hole
            hole = hash
            probeDistance = 0
         }
      } while (--patchAttemptsLeft >= 0)

      this.hashArray[hole] = -1
   }

   internal fun removeValue(element: Any): Boolean {
      this.checkIsMutable$kotlin_stdlib()
      val index: Int = this.findValue((V)element)
      if (index < 0) {
         return false
      } else {
         this.removeKeyAt(index)
         return true
      }
   }

   internal fun containsEntry(entry: kotlin.collections.Map.Entry<Any, Any>): Boolean {
      val index: Int = this.findKey((K)entry.getKey())
      if (index < 0) {
         return false
      } else {
         val var10000: Array<Any> = this.valuesArray
         return var10000[index] == entry.getValue()
      }
   }

   internal fun removeEntry(entry: kotlin.collections.Map.Entry<Any, Any>): Boolean {
      this.checkIsMutable$kotlin_stdlib()
      val index: Int = this.findKey((K)entry.getKey())
      if (index < 0) {
         return false
      } else {
         val var10000: Array<Any> = this.valuesArray
         if (!(var10000[index] == entry.getValue())) {
            return false
         } else {
            this.removeKeyAt(index)
            return true
         }
      }
   }

   private fun compact() {
      var i: Int = 0
      var j: Int = 0
      val valuesArray: Array<Any> = this.valuesArray

      while (i < this.length) {
         if (this.presenceArray[i] >= 0) {
            this.keysArray[j] = this.keysArray[i]
            if (valuesArray != null) {
               valuesArray[j] = valuesArray[i]
            }

            j++
         }

         i++
      }

      ListBuilderKt.resetRange(this.keysArray, j, this.length)
      if (valuesArray != null) {
         ListBuilderKt.resetRange(valuesArray, j, this.length)
      }

      this.length = j
   }

   @JvmStatic
   fun {
      val var0: MapBuilder = MapBuilder(0)
      var0.isReadOnly = true
      Empty = var0
   }

   public override fun putAll(from: Map<out Any, Any>) {
      this.checkIsMutable$kotlin_stdlib()
      this.putAllEntries(from.entrySet())
   }

   // $VF: Compiled from MapBuilder.kt
   internal companion object {
      internal final val Empty: MapBuilder<Nothing, Nothing>
      private const val INITIAL_CAPACITY: Int = 8
      private const val INITIAL_MAX_PROBE_DISTANCE: Int = 2
      private const val MAGIC: Int = -1640531527
      private const val TOMBSTONE: Int = -1

      private fun computeShift(hashSize: Int): Int {
         return Integer.numberOfLeadingZeros(hashSize) + 1
      }

      private fun computeHashSize(capacity: Int): Int {
         return Integer.highestOneBit(RangesKt.coerceAtLeast(capacity, 1) * 3)
      }
   }

   // $VF: Compiled from MapBuilder.kt
   internal class EntriesItr<K, V>(map: MapBuilder<Any, Any>) : MapBuilder.Itr(map), java.util.Iterator<java.util.Map.Entry<K, V>>, KMutableIterator {
      public open operator fun next(): kotlin.collections.builders.MapBuilder.EntryRef<Any, Any> {
         this.checkForComodification$kotlin_stdlib()
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw NoSuchElementException()
         } else {
            val result: Int = this.getIndex$kotlin_stdlib()
            this.setIndex$kotlin_stdlib(result + 1)
            this.setLastIndex$kotlin_stdlib(result)
            val var2: MapBuilder.EntryRef = MapBuilder.EntryRef<>(this.getMap$kotlin_stdlib(), this.getLastIndex$kotlin_stdlib())
            this.initNext$kotlin_stdlib()
            return var2
         }
      }

      public fun nextAppendString(sb: StringBuilder) {
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw NoSuchElementException()
         } else {
            val key: Int = this.getIndex$kotlin_stdlib()
            this.setIndex$kotlin_stdlib(key + 1)
            this.setLastIndex$kotlin_stdlib(key)
            val var4: Any = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()]
            if (var4 === this.getMap$kotlin_stdlib()) {
               sb.append("(this Map)")
            } else {
               sb.append(var4)
            }

            sb.append('=')
            val var10000: Array<Any> = this.getMap$kotlin_stdlib().valuesArray
            val value: Any = var10000[this.getLastIndex$kotlin_stdlib()]
            if (value === this.getMap$kotlin_stdlib()) {
               sb.append("(this Map)")
            } else {
               sb.append(value)
            }

            this.initNext$kotlin_stdlib()
         }
      }

      internal fun nextHashCode(): Int {
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw NoSuchElementException()
         } else {
            var result: Int = this.getIndex$kotlin_stdlib()
            this.setIndex$kotlin_stdlib(result + 1)
            this.setLastIndex$kotlin_stdlib(result)
            var var10000: Int = (int)this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()]
            var10000 = if (var10000 != null) var10000.hashCode() else 0
            var var10001: Any = this.getMap$kotlin_stdlib().valuesArray
            var10001 = ((Object[])var10001)[this.getLastIndex$kotlin_stdlib()]
            result = var10000 xor (if (var10001 != null) var10001.hashCode() else 0)
            this.initNext$kotlin_stdlib()
            return result
         }
      }
   }

   // $VF: Compiled from MapBuilder.kt
   internal class EntryRef<K, V>(map: MapBuilder<Any, Any>, index: Int) : KMutableMap.Entry, java.util.Map.Entry {
      private final val map: MapBuilder<Any, Any>
      private final val index: Int

      public override fun hashCode(): Int {
         var var10000: Int = (int)this.key
         var10000 = if (var10000 != null) var10000.hashCode() else 0
         val var10001: Any = this.value
         return var10000 xor (if (var10001 != null) var10001.hashCode() else 0)
      }

      public open val value: Any
         public open get() {
            val var10000: Array<Any> = this.map.valuesArray
            return (V)var10000[this.index]
         }


      public open val key: Any
         public open get() {
            return this.map.keysArray[this.index]
         }


      public override operator fun equals(other: Any?): Boolean {
         return other is java.util.Map.Entry && (other as java.util.Map.Entry).getKey() == this.key && (other as java.util.Map.Entry).getValue() == this.value
      }

      init {
         this.map = map
         this.index = index
      }

      public override fun toString(): String {
         return "${this.key}=${this.value}"
      }

      public override fun setValue(newValue: Any): Any {
         this.map.checkIsMutable$kotlin_stdlib()
         val valuesArray: Array<Any> = this.map.allocateValuesArray()
         val oldValue: Any = valuesArray[this.index]
         valuesArray[this.index] = newValue
         return (V)oldValue
      }
   }

   // $VF: Compiled from MapBuilder.kt
   internal open class Itr<K, V>(map: MapBuilder<Any, Any>) {
      internal final val map: MapBuilder<Any, Any>
      internal final var lastIndex: Int
      internal final var index: Int
      private final var expectedModCount: Int

      public fun hasNext(): Boolean {
         return this.index < this.map.length
      }

      public fun remove() {
         this.checkForComodification$kotlin_stdlib()
         if (this.lastIndex == -1) {
            throw IllegalStateException("Call next() before removing element from the iterator.".toString())
         } else {
            this.map.checkIsMutable$kotlin_stdlib()
            this.map.removeKeyAt(this.lastIndex)
            this.lastIndex = -1
            this.expectedModCount = this.map.modCount
         }
      }

      internal fun initNext() {
         while (this.index < this.map.length && this.map.presenceArray[this.index] < 0) {
            val var1: Int = this.index++
         }
      }

      internal fun checkForComodification() {
         if (this.map.modCount != this.expectedModCount) {
            throw ConcurrentModificationException()
         }
      }

      init {
         this.map = map
         this.lastIndex = -1
         this.expectedModCount = this.map.modCount
         this.initNext$kotlin_stdlib()
      }
   }

   // $VF: Compiled from MapBuilder.kt
   internal class KeysItr<K, V>(map: MapBuilder<Any, Any>) : MapBuilder.Itr(map), java.util.Iterator<K>, KMutableIterator {
      public override operator fun next(): Any {
         this.checkForComodification$kotlin_stdlib()
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw NoSuchElementException()
         } else {
            val result: Int = this.getIndex$kotlin_stdlib()
            this.setIndex$kotlin_stdlib(result + 1)
            this.setLastIndex$kotlin_stdlib(result)
            val var2: Any = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()]
            this.initNext$kotlin_stdlib()
            return (K)var2
         }
      }
   }

   // $VF: Compiled from MapBuilder.kt
   internal class ValuesItr<K, V>(map: MapBuilder<Any, Any>) : MapBuilder.Itr(map), KMutableIterator, java.util.Iterator {
      public override operator fun next(): Any {
         this.checkForComodification$kotlin_stdlib()
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw NoSuchElementException()
         } else {
            val result: Int = this.getIndex$kotlin_stdlib()
            this.setIndex$kotlin_stdlib(result + 1)
            this.setLastIndex$kotlin_stdlib(result)
            val var10000: Array<Any> = this.getMap$kotlin_stdlib().valuesArray
            val var2: Any = var10000[this.getLastIndex$kotlin_stdlib()]
            this.initNext$kotlin_stdlib()
            return (V)var2
         }
      }
   }
}
