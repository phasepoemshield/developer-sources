package kotlin.collections.builders

import java.io.Externalizable
import java.io.InvalidObjectException
import java.io.ObjectInput
import java.io.ObjectOutput

// $VF: Compiled from MapBuilder.kt
private class SerializedMap(map: Map<*, *>) : Externalizable {
   private final var map: Map<*, *>

   private fun readResolve(): Any {
      return this.map
   }

   public override fun writeExternal(output: ObjectOutput) {
      output.writeByte(0)
      output.writeInt(this.map.size())

      for (entry in this.map.entrySet()) {
         output.writeObject(entry.getKey())
         output.writeObject(entry.getValue())
      }
   }

   init {
      this.map = map
   }

   public constructor() : this(MapsKt.emptyMap())
   public override fun readExternal(input: ObjectInput) {
      val flags: Int = input.readByte()
      if (flags != 0) {
         throw InvalidObjectException("Unsupported flags value: $flags")
      } else {
         val size: Int = input.readInt()
         if (size < 0) {
            throw InvalidObjectException("Illegal size value: $size.")
         } else {
            val var4: java.util.Map = MapsKt.createMapBuilder(size)
            val `$this$readExternal_u24lambda_u241`: java.util.Map = var4

            repeat(size) { var7 ->
               `$this$readExternal_u24lambda_u241`.put(input.readObject(), input.readObject())
            }

            this.map = MapsKt.build(var4)
         }
      }
   }

   // $VF: Compiled from MapBuilder.kt
   public companion object {
      private const val serialVersionUID: Long = 0L
   }
}
