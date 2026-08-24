package kotlin.collections.builders

import java.io.Externalizable
import java.io.InvalidObjectException
import java.io.ObjectInput
import java.io.ObjectOutput

// $VF: Compiled from ListBuilder.kt
internal class SerializedCollection(collection: Collection<*>, tag: Int) : Externalizable {
   private final val tag: Int
   private final var collection: Collection<*>

   init {
      this.collection = collection
      this.tag = tag
   }

   public override fun readExternal(input: ObjectInput) {
      val flags: Int = input.readByte()
      val tag: Int = flags and 1
      if ((flags and -2) != 0) {
         throw InvalidObjectException("Unsupported flags value: $flags.")
      } else {
         val size: Int = input.readInt()
         if (size < 0) {
            throw InvalidObjectException("Illegal size value: $size.")
         } else {
            var var10000: SerializedCollection
var var10001: java.util.Collection
            when (tag) {
               0 -> {
                  val var13: java.util.List = CollectionsKt.createListBuilder(size)
                  val var14: java.util.List = var13

                  repeat(size) { var16 ->
                     var14.add(input.readObject())
                  }

                  var10000 = this
                  var10001 = CollectionsKt.build(var13)
                  break
               }
               1 -> {
                  val var6: java.util.Set = SetsKt.createSetBuilder(size)
                  val `$this$readExternal_u24lambda_u243`: java.util.Set = var6

                  repeat(size) { var9 ->
                     `$this$readExternal_u24lambda_u243`.add(input.readObject())
                  }

                  var10000 = this
                  var10001 = SetsKt.build(var6)
                  break
               }
               else -> throw InvalidObjectException("Unsupported collection type tag: $tag.")
            }

            var10000.collection = var10001
         }
      }
   }

   public constructor() : this(CollectionsKt.emptyList(), 0)
   private fun readResolve(): Any {
      return this.collection
   }

   public override fun writeExternal(output: ObjectOutput) {
      output.writeByte(this.tag)
      output.writeInt(this.collection.size())

      for (element in this.collection) {
         output.writeObject(element)
      }
   }

   // $VF: Compiled from ListBuilder.kt
   public companion object {
      private const val serialVersionUID: Long = 0L
      public const val tagList: Int = 0
      public const val tagSet: Int = 1
   }
}
