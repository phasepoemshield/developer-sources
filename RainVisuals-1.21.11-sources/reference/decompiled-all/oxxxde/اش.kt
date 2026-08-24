package oxxxde

import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import net.minecraft.network.RegistryByteBuf
import net.minecraft.network.codec.PacketCodec
import net.minecraft.network.packet.CustomPayload
import net.minecraft.network.packet.CustomPayload.Id

// $VF: Compiled from heavy
private data class اش(json: String) : CustomPayload {
   @JvmStatic
   public ف Companion = ف(null);
   @JvmStatic
   private Id<اش> ID = Id(حْ.access$getChannel$p());
   public final val json: String
   @JvmStatic
   private PacketCodec<RegistryByteBuf, اش> CODEC;

   public override operator fun equals(other: Any?): Boolean {
      label22@
      if (this === other) {
         return true
      } else {
         return other is اش && this.json == (other as اش).json
      }
   }

   fun getId(): Id<out CustomPayload> {
      ID
   }

   @JvmStatic
   fun {
      val var10000: PacketCodec = CustomPayload.codecOf({ payload: اش, buffer: RegistryByteBuf ->
         val var2: java.lang.String = payload.json
         val var10001: Charset = StandardCharsets.UTF_8
         val var3: ByteArray = var2.getBytes(var10001)
         buffer.writeBytes(var3)
      }, { buffer: RegistryByteBuf ->
         val readable: Int = buffer.readableBytes()
         val bytes: ByteArray = ByteArray(RangesKt.coerceAtMost(readable, 32767))
         buffer.readBytes(bytes)
         if (readable > 32767) {
            buffer.skipBytes(readable - 32767)
         }

         val var10002: Charset = StandardCharsets.UTF_8
         اش(java.lang.String(bytes, var10002))
      })
      CODEC = var10000
   }

   public operator fun component1(): String {
      return this.json
   }

   public override fun hashCode(): Int {
      return this.json.hashCode()
   }

   public fun copy(json: String = this.json): اش {
      return اش(json)
   }

   init {
      this.json = json
   }

   public override fun toString(): String {
      return "LiteApiPayload(json=${this.json})"
   }
}
