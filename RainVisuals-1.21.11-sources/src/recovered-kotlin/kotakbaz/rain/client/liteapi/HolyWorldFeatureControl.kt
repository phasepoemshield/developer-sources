package kotakbaz.rain.client.liteapi

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.util.ArrayList
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.Locale
import java.util.UUID
import kotakbaz.rain.module.Module
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context
import net.fabricmc.fabric.api.networking.v1.PacketSender
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
import net.minecraft.client.MinecraftClient
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.network.RegistryByteBuf
import net.minecraft.network.codec.PacketCodec
import net.minecraft.network.packet.CustomPayload
import net.minecraft.network.packet.CustomPayload.Id
import net.minecraft.util.Identifier
import oxxxde.اش
import oxxxde.خً
import oxxxde.دِ
import oxxxde.ف

// $VF: Compiled from heavy
public object HolyWorldFeatureControl {
   private final val blockedFeatures: HashSet<String> = HashSet()
   @JvmStatic
   private Identifier channel;
   private final var requestAttempts: Int
   private final val camelSplitRegex: Regex = Regex("(?<=[a-z0-9])([A-Z])")
   private final val moduleFeatures: LinkedHashMap<دِ, Set<String>> = LinkedHashMap()
   private final var lastRequestAt: Long
   private const val DEBUG: Boolean = false
   private const val MAX_REQUEST_ATTEMPTS: Int = 3
   private const val MAX_JSON_LENGTH: Int = 32767
   private const val CLIENT_ID: String = "rain-visuals"
   private const val REQUEST_DELAY_MS: Long = 10000L
   private final var waitingForResponse: Boolean

   private fun receive(json: String) {
      val var2: HolyWorldFeatureControl = this

      try {
         val var29: HolyWorldFeatureControl = var2
         val root: JsonObject = JsonParser.parseString(json).getAsJsonObject()
         var var10000: JsonElement = root.get("ok")
         if (var10000 == null || !var10000.getAsBoolean()) {
            return
         }

         run label89@{
            val var6: JsonObject = root.getAsJsonObject("payload")
            if (var6 != null) {
               val var7: JsonArray = var6.getAsJsonArray("blocklist")
               if (var7 != null) {
                  val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = var7
                  val `destination$iv$iv`: java.util.Collection = ArrayList()

                  for (`element$iv$iv$iv` in `$this$mapNotNullTo$iv$iv`) {
                     run label81@{
                        var10000 = if ((`element$iv$iv$iv` as JsonElement).isJsonPrimitive()) `element$iv$iv$iv` as JsonElement else null
                        if (var10000 != null) {
                           val var35: java.lang.String = var10000.getAsString()
                           if (var35 != null) {
                              var36 = var29.normalizeFeature(var35)
                              return@label81
                           }
                        }

                        var36 = null
                     }

                     if (var36 != null) {
                        `destination$iv$iv`.add(var36)
                     }
                  }

                  val var33: java.util.Set = CollectionsKt.toSet(`destination$iv$iv` as java.util.List)
                  if (var33 != null) {
                     var37 = var33
                     return@label89
                  }
               }
            }

            var37 = SetsKt.emptySet()
         }

         var29.updateBlocklist(var37)
         var29.debug("LiteAPI blocklist: ${var29.toDebugList(var37)}")
         var var38: HolyWorldFeatureControl = var29
         val var31: java.lang.CharSequence = CollectionsKt.joinToString$default(var29.blockedModules(var37), ", ", null, null, 0, null, null, 62, null)
         val var10001: java.lang.CharSequence
         if (StringsKt.isBlank(var31)) {
            var10001 = "none"
            var38 = var29
         } else {
            var10001 = var31
         }

         var38.debug("LiteAPI hidden modules: $var10001")
         waitingForResponse = false
         val var30: Any = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
      } catch (var28: java.lang.Throwable) {
         val `$this$receive_u24lambda_u240`: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var28))
      }
   }

   public fun load(modules: List<دِ>) {
      this.bind(modules)
      PayloadTypeRegistry.playC2S()
         .register(HolyWorldFeatureControl.LiteApiPayload.Companion.getID(), HolyWorldFeatureControl.LiteApiPayload.Companion.getCODEC())
         PayloadTypeRegistry.playS2C()
         .register(HolyWorldFeatureControl.LiteApiPayload.Companion.getID(), HolyWorldFeatureControl.LiteApiPayload.Companion.getCODEC())
         ClientPlayNetworking.registerGlobalReceiver(
         HolyWorldFeatureControl.LiteApiPayload.Companion.getID(), { payload: HolyWorldFeatureControl.LiteApiPayload, var1: Context ->
            INSTANCE.receive(payload.json)
         }
      )
      ClientPlayConnectionEvents.JOIN.register({ var0: ClientPlayNetworkHandler, var1: PacketSender, var2: MinecraftClient ->
         INSTANCE.request()
      })
      ClientPlayConnectionEvents.DISCONNECT.register({ var0: ClientPlayNetworkHandler, var1: MinecraftClient ->
         INSTANCE.reset()
      })
   }

   private fun updateBlocklist(features: Set<String>) {
      if (!(blockedFeatures == features)) {
         blockedFeatures.clear()
         blockedFeatures.addAll(features)
         خً.INSTANCE.syncAvailabilityStates()
      }
   }

   private fun bind(modules: List<دِ>) {
      for (`element$iv` in modules) {
         val module: Module = `element$iv` as Module
         moduleFeatures.put(`element$iv` as Module, INSTANCE.featureAliases((`element$iv` as Module).name))
         module.addVisibleInGuiCondition({ 
            !INSTANCE.isBlocked(`$module`)
         })
         module.addAvailabilityCondition({ 
            !INSTANCE.isBlocked(`$module`)
         })
      }
   }

   public fun isBlocked(module: دِ): Boolean {
      val var10000: java.util.Set = moduleFeatures.get(module)
      val var10: Boolean
      if (var10000 != null) {
         val `$this$any$iv`: java.lang.Iterable = var10000
         val var3: HashSet = blockedFeatures
         var var9: Boolean
         if (`$this$any$iv` is java.util.Collection && (`$this$any$iv` as java.util.Collection).isEmpty()) {
            var9 = false
         } else {
            val var5: java.util.Iterator = `$this$any$iv`.iterator()

            while (true) {
               if (!var5.hasNext()) {
                  var9 = false
                  break
               }

               if (var3.contains(var5.next() as java.lang.String)) {
                  var9 = true
                  break
               }
            }
         }

         var10 = var9
      } else {
         var10 = false
      }

      return var10
   }

   private fun Set<String>.toDebugList(): String {
      val var2: java.lang.CharSequence = CollectionsKt.joinToString$default(
         CollectionsKt.sorted(`$this$toDebugList`), ", ", null, null, 0, null, null, 62, null
      )
      return (if (StringsKt.isBlank(var2)) "empty" else var2) as java.lang.String
   }

   @JvmStatic
   fun {
      val var10000: Identifier = Identifier.of("liteapi", "feature-control")
      channel = var10000
   }

   private fun featureAliases(name: String): Set<String> {
      return SetsKt.setOf(this.normalizeFeature(name), this.normalizeFeature(camelSplitRegex.replace(name, "-$1")))
   }

   public fun tick() {
      if (waitingForResponse) {
         this.request()
      }
   }

   private fun requestJson(): String {
      val payload: JsonObject = JsonObject()
      payload.addProperty("client", "rain-visuals")
      val var2: JsonArray = JsonArray()
      val `$this$requestJson_u24lambda_u240`: JsonArray = var2
      val var10000: java.util.Collection = moduleFeatures.values()

      for (`element$iv` in CollectionsKt.distinct(CollectionsKt.flatten(var10000))) {
         `$this$requestJson_u24lambda_u240`.add(`element$iv` as java.lang.String)
      }

      payload.add("features", var2)
      val var14: JsonObject = JsonObject()
      var14.addProperty("id", UUID.randomUUID().toString())
      var14.addProperty("method", "checkFeatures")
      var14.add("payload", payload)
      val var17: java.lang.String = var14.toString()
      return var17
   }

   private fun reset() {
      waitingForResponse = false
      lastRequestAt = 0L
      requestAttempts = 0
      this.updateBlocklist(SetsKt.emptySet())
   }

   private fun debug(message: String) {
   }

   private fun blockedModules(features: Set<String>): List<String> {
      val `$this$map$iv`: java.util.Map = moduleFeatures
      val `$this$mapTo$iv$iv`: LinkedHashMap = LinkedHashMap()

      for (`$i$f$mapTo` in `$this$map$iv`.entrySet()) {
         val p0: java.lang.Iterable = `$i$f$mapTo`.getValue() as java.util.Set
         var var10000: Boolean
         if (p0 is java.util.Collection && (p0 as java.util.Collection).isEmpty()) {
            var10000 = false
         } else {
            val var11: java.util.Iterator = p0.iterator()

            while (true) {
               if (!var11.hasNext()) {
                  var10000 = false
                  break
               }

               if (features.contains(var11.next() as java.lang.String)) {
                  var10000 = true
                  break
               }
            }
         }

         if (var10000) {
            `$this$mapTo$iv$iv`.put(`$i$f$mapTo`.getKey(), `$i$f$mapTo`.getValue())
         }
      }

      val var16: java.lang.Iterable = `$this$mapTo$iv$iv`.keySet()
      val var19: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var16, 10))

      for (var22 in var16) {
         var19.add((var22 as Module).name)
      }

      return var19 as MutableList<java.lang.String>
   }

   private fun String.normalizeFeature(): String {
      val var10000: Locale = Locale.ROOT
      val var13: java.lang.String = `$this$normalizeFeature`.toLowerCase(var10000)
      val `$this$filterTo$iv$iv`: java.lang.CharSequence = var13
      val `destination$iv$iv`: Appendable = StringBuilder()
      var `index$iv$iv`: Int = 0

      for (var8 in `$this$filterTo$iv$iv`.length()..`index$iv$iv`) {
         val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(`index$iv$iv`)
         if (Character.isLetterOrDigit(`element$iv$iv`) || `element$iv$iv` == '-' || `element$iv$iv` == '_') {
            `destination$iv$iv`.append(`element$iv$iv`)
         }
      }

      return (`destination$iv$iv` as StringBuilder).toString()
   }

   private fun request() {
      val now: Long = System.currentTimeMillis()
      if (requestAttempts < 3 && now - lastRequestAt >= 10000L) {
         if (!ClientPlayNetworking.canSend(HolyWorldFeatureControl.LiteApiPayload.Companion.getID())) {
            waitingForResponse = false
            this.debug("LiteAPI channel unavailable")
         } else {
            lastRequestAt = now
            val var3: Int = requestAttempts++
            waitingForResponse = true
            this.debug("LiteAPI request #${requestAttempts}: ${moduleFeatures.size()} modules")
            val var8: HolyWorldFeatureControl = this

            var `$this$request_u24lambda_u240`: Any
            try {
               ClientPlayNetworking.send(HolyWorldFeatureControl.LiteApiPayload(var8.requestJson()))
               `$this$request_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
            } catch (var7: java.lang.Throwable) {
               `$this$request_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
            }

            val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$request_u24lambda_u240`)
            if (var10000 != null) {
               waitingForResponse = false
               val var13: HolyWorldFeatureControl = INSTANCE
               var var10001: java.lang.String = var10000.getMessage()
               if (var10001 == null) {
                  var10001 = var10000.getClass().getSimpleName()
               }

               var13.debug("LiteAPI request failed: $var10001")
            }
         }
      }
   }

   // $VF: Compiled from heavy
   private data class LiteApiPayload(json: String) : CustomPayload {
      @JvmStatic
      public ف Companion = ف(null);
      @JvmStatic
      private Id<HolyWorldFeatureControl.LiteApiPayload> ID = Id(HolyWorldFeatureControl.channel);
      public final val json: String
      @JvmStatic
      private PacketCodec<RegistryByteBuf, HolyWorldFeatureControl.LiteApiPayload> CODEC;

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === other) {
            return true
         } else {
            return other is HolyWorldFeatureControl.LiteApiPayload && this.json == (other as HolyWorldFeatureControl.LiteApiPayload).json
         }
      }

      fun getId(): Id<out CustomPayload> {
         ID
      }

      @JvmStatic
      fun {
         val var10000: PacketCodec = CustomPayload.codecOf({ payload: HolyWorldFeatureControl.LiteApiPayload, buffer: RegistryByteBuf ->
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
            HolyWorldFeatureControl.LiteApiPayload(java.lang.String(bytes, var10002))
         })
         CODEC = var10000
      }

      public operator fun component1(): String {
         return this.json
      }

      public override fun hashCode(): Int {
         return this.json.hashCode()
      }

      public fun copy(json: String = ...): اش {
         return HolyWorldFeatureControl.LiteApiPayload(json)
      }

      init {
         this.json = json
      }

      public override fun toString(): String {
         return "LiteApiPayload(json=${this.json})"
      }
   }
}
