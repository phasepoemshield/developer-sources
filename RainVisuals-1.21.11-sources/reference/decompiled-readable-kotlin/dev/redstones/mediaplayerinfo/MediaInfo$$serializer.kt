package dev.redstones.mediaplayerinfo

import kotlinx.serialization.KSerializer
import kotlinx.serialization.UnknownFieldException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.BooleanSerializer
import kotlinx.serialization.internal.ByteArraySerializer
import kotlinx.serialization.internal.GeneratedSerializer
import kotlinx.serialization.internal.LongSerializer
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.StringSerializer

// $VF: Compiled from MediaInfo.kt
/** @deprecated */
@Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = []), level = DeprecationLevel.HIDDEN)
public object `MediaInfo$$serializer` : GeneratedSerializer<MediaInfo> {
   public open fun deserialize(decoder: Decoder): MediaInfo {
      val var2: SerialDescriptor = this.descriptor
      var var3: Boolean = true
      var var5: Int = 0
      var var6: java.lang.String = null
      var var7: java.lang.String = null
      var var8: ByteArray = null
      var var9: Long = 0L
      var var11: Long = 0L
      var var13: Boolean = false
      val var14: CompositeDecoder = decoder.beginStructure(var2)
      if (var14.decodeSequentially()) {
         var6 = var14.decodeStringElement(var2, 0)
         var5 = 0 or 1
         var7 = var14.decodeStringElement(var2, 1)
         var5 = var5 or 2
         var8 = var14.decodeSerializableElement(var2, 2, ByteArraySerializer.INSTANCE, null)
         var5 = var5 or 4
         var9 = var14.decodeLongElement(var2, 3)
         var5 = var5 or 8
         var11 = var14.decodeLongElement(var2, 4)
         var5 = var5 or 16
         var13 = var14.decodeBooleanElement(var2, 5)
         var5 = var5 or 32
      } else {
         while (var3) {
            val var4: Int = var14.decodeElementIndex(var2)
            when (var4) {
               -1 -> {
                  var3 = false
                  continue
               }
               0 -> {
                  var6 = var14.decodeStringElement(var2, 0)
                  var5 |= 1
                  continue
               }
               1 -> {
                  var7 = var14.decodeStringElement(var2, 1)
                  var5 |= 2
                  continue
               }
               2 -> {
                  var8 = var14.decodeSerializableElement(var2, 2, ByteArraySerializer.INSTANCE, var8)
                  var5 |= 4
                  continue
               }
               3 -> {
                  var9 = var14.decodeLongElement(var2, 3)
                  var5 |= 8
                  continue
               }
               4 -> {
                  var11 = var14.decodeLongElement(var2, 4)
                  var5 |= 16
                  continue
               }
               5 -> {
                  var13 = var14.decodeBooleanElement(var2, 5)
                  var5 |= 32
                  continue
               }
               else -> throw UnknownFieldException(var4)
            }
         }
      }

      var14.endStructure(var2)
      return MediaInfo(var5, var6, var7, var8, var9, var11, var13, null)
   }

   @JvmStatic
   fun {
      val var0: PluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor("dev.redstones.mediaplayerinfo.MediaInfo", INSTANCE, 6)
      var0.addElement("title", false)
      var0.addElement("artist", false)
      var0.addElement("artworkPng", false)
      var0.addElement("position", false)
      var0.addElement("duration", false)
      var0.addElement("playing", false)
      descriptor = var0
   }

   public open fun serialize(encoder: Encoder, value: MediaInfo) {
      val var3: SerialDescriptor = this.descriptor
      val var4: CompositeEncoder = encoder.beginStructure(var3)
      MediaInfo.write$Self$MediaPlayerInfo(value, var4, var3)
      var4.endStructure(var3)
   }

   override fun typeParametersSerializers(): Array<KSerializer<*>> {
      GeneratedSerializer.DefaultImpls.typeParametersSerializers(this)
   }

   public open val descriptor: SerialDescriptor
      public open get() {
         return descriptor
      }


   public override fun childSerializers(): Array<KSerializer<*>> {
      return arrayOf(
         StringSerializer.INSTANCE,
         StringSerializer.INSTANCE,
         ByteArraySerializer.INSTANCE,
         LongSerializer.INSTANCE,
         LongSerializer.INSTANCE,
         BooleanSerializer.INSTANCE
      )
   }
}
