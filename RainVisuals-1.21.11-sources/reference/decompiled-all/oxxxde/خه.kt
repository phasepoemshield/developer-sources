package oxxxde

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.io.InputStream
import java.net.http.HttpClient
import java.net.http.HttpHeaders
import java.net.http.HttpRequest
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.time.Duration
import java.util.ArrayList
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionException
import java.util.concurrent.ExecutionException
import java.util.concurrent.atomic.AtomicLong
import org.slf4j.Logger
import org.slf4j.LoggerFactory

// $VF: Compiled from heavy
public object خه {
   private const val MAX_RECEIVED_CONFIGS: Int = 100
   private final val cloudKeyRegex: Regex = Regex("^RAIN-CONFIG-[A-HJ-NP-Z2-9]{4}-[A-HJ-NP-Z2-9]{4}-[A-HJ-NP-Z2-9]{4}$")
   private final val cloudIdRegex: Regex = Regex("^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$", RegexOption.IGNORE_CASE)
   private const val MAX_OWNED_CONFIGS: Int = 10
   private final val logger: Logger = LoggerFactory.getLogger("Rain Cloud Config API")
   private const val MAX_SHARE_REQUEST_BYTES: Int = 262144
   private const val MAX_SINGLE_RESPONSE_BYTES: Int = 524288
   private final val usernameRegex: Regex = Regex("^[A-Za-z0-9_]{3,16}$")
   private const val MAX_LIBRARY_RESPONSE_BYTES: Int = 29360128
   private final val httpClient: HttpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(6L)).build()
   private final val operationSequence: AtomicLong = AtomicLong()

   private fun unwrapCompletionError(error: Throwable): Throwable {
      var cause: java.lang.Throwable = error

      while ((cause is CompletionException || cause is ExecutionException) && cause.getCause() != null) {
         val var10000: java.lang.Throwable = cause.getCause()
         cause = var10000
      }

      return cause
   }

   private fun saveOrShare(configName: String, keyCount: Int, maxActivations: Int?): CompletableFuture<ضغ> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   private fun parseRedeemedCloudConfig(root: JsonObject): ضٌ {
      val var2: خه = this

      var error: Any
      try {
         error = var2
         val configId: java.lang.String = root.get("configId").getAsString()
         val name: java.lang.String = root.get("name").getAsString()
         val author: java.lang.String = root.get("author").getAsString()
         val ownerName: java.lang.String = root.get("ownerName").getAsString()
         val contentHash: java.lang.String = root.get("contentHash").getAsString()
         val payload: JsonObject = root.getAsJsonObject("payload")
         val var10000: Regex = cloudIdRegex
         if (!(var10000 matches configId as java.lang.CharSequence)) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (StringsKt.isBlank(name) || name.length() > 64) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (StringsKt.isBlank(author) || author.length() > 64) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (!(usernameRegex matches ownerName as java.lang.CharSequence)) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         val var21: اك = اك.INSTANCE
         if (!var21.verifyCloudPayloadHash(payload, contentHash)) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         error = Result.constructor_impl/* $VF was: constructor-impl */(
            ضٌ(configId, name, author, ownerName, contentHash, payload, root.get("alreadyActivated").getAsBoolean())
         )
      } catch (var12: java.lang.Throwable) {
         error = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var12))
      }

      val var22: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(error)
      if (var22 == null) {
         return error as ضٌ
      } else {
         throw شئ("invalid_server_response", var22, null, null, 12, null)
      }
   }

   public fun revokeKey(keyId: String): CompletableFuture<Unit> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun listOwned(): CompletableFuture<List<ضغ>> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   private fun send(request: HttpRequest, maximumResponseBytes: Int): CompletableFuture<JsonObject> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun createShare(configName: String, maxActivations: Int?): CompletableFuture<ضغ> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun saveOwned(configName: String): CompletableFuture<ضغ> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun redeem(key: String): CompletableFuture<ضٌ> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   private fun parseResponse(request: HttpRequest, statusCode: Int, headers: HttpHeaders, body: String): JsonObject {
      val parsed: خه = this

      var root: خه
      try {
         root = parsed
         رق.INSTANCE.requireValidResponse(request, statusCode, headers, body)
         root = (خه)Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
      } catch (var32: java.lang.Throwable) {
         root = (خه)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var32))
      }

      var var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(root)
      if (var10000 != null) {
         val var68: Logger = logger
         val var9: Array<Any> = arrayOf(request.method(), request.uri().getPath(), statusCode, var10000.getClass().getName(), null, null)
         var var10004: java.lang.String = var10000.getMessage()
         if (var10004 == null) {
            var10004 = "no message"
         }

         var9[4] = var10004
         var9[5] = var10000
         var68.error("Cloud API response signature validation failed: method={}, path={}, status={}, exception={}: {}", var9)
      }

      ResultKt.throwOnFailure(root)
      root = this

      var var41: Any
      try {
         var41 = root
         var41 = Result.constructor_impl/* $VF was: constructor-impl */(JsonParser.parseString(body).getAsJsonObject())
      } catch (var31: java.lang.Throwable) {
         var41 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var31))
      }

      if (200 > statusCode || statusCode >= 300) {
         run label151@{
            var39 = (if (isFailure) null else var41) as JsonObject
            if (var39 != null) {
               val var47: JsonElement = var39.get("error")
               if (var47 != null) {
                  val var50: JsonElement = if (var47.isJsonPrimitive()) var47 else null
                  if (var50 != null) {
                     val var54: java.lang.String = var50.getAsString()
                     if (var54 != null) {
                        var71 = var54
                        return@label151
                     }
                  }
               }
            }

            var71 = "http_$statusCode"
         }

         run label160@{
            if (var39 != null) {
               val var51: JsonElement = var39.get("details")
               if (var51 != null) {
                  val var55: JsonElement = if (var51.isJsonArray()) var51 else null
                  if (var55 != null) {
                     val var59: JsonArray = var55.getAsJsonArray()
                     if (var59 != null) {
                        val it: java.lang.Iterable = var59
                        val var16: java.util.Collection = ArrayList()

                        for (`element$iv$iv$iv` in it) {
                           val var72: JsonElement = if ((`element$iv$iv$iv` as JsonElement).isJsonPrimitive()) `element$iv$iv$iv` as JsonElement else null
                           val var73: java.lang.String = if (var72 != null) var72.getAsString() else null
                           if (var73 != null) {
                              var16.add(var73)
                           }
                        }

                        val var64: java.lang.String = CollectionsKt.joinToString$default(var16 as java.util.List, ",", null, null, 0, null, null, 62, null)
                        if (var64 != null) {
                           var74 = if (!StringsKt.isBlank(var64)) var64 else null
                           return@label160
                        }
                     }
                  }
               }
            }

            var74 = null
         }

         logger.error(
            "Cloud API rejected request: method={}, path={}, status={}, reason={}, response='{}'",
            request.method(),
            request.uri().getPath(),
            statusCode,
            var71,
            StringsKt.take(Regex("\\s+").replace(body, " "), 300)
         )
         throw شئ(var71, null, statusCode, var74, 2, null)
      } else {
         var10000 = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var41)
         if (var10000 == null) {
            return var41 as JsonObject
         } else {
            val var70: Logger = logger
            val var10: Array<Any> = arrayOf(request.method(), request.uri().getPath(), statusCode, body.length(), var10000.getClass().getName(), null, null)
            var var76: java.lang.String = var10000.getMessage()
            if (var76 == null) {
               var76 = "no message"
            }

            var10[5] = var76
            var10[6] = var10000
            var70.error("Cloud API returned invalid JSON: method={}, path={}, status={}, bodyLength={}, exception={}: {}", var10)
            throw شئ("invalid_server_response", var10000, statusCode, null, 8, null)
         }
      }
   }

   private fun parseCloudConfig(root: JsonObject): ضغ {
      val var2: خه = this

      var error: java.lang.Throwable
      try {
         val var54: خه = var2
         val id: java.lang.String = root.get("id").getAsString()
         val ownerName: java.lang.String = root.get("ownerName").getAsString()
         val name: java.lang.String = root.get("name").getAsString()
         val author: java.lang.String = root.get("author").getAsString()
         val contentHash: java.lang.String = root.get("contentHash").getAsString()
         val payload: JsonObject = root.getAsJsonObject("payload")
         val revision: Int = root.get("revision").getAsInt()
         val revoked: Boolean = root.get("revoked").getAsBoolean()
         val keyElements: JsonArray = root.getAsJsonArray("keys")
         var var10000: Regex = cloudIdRegex
         if (!(var10000 matches id as java.lang.CharSequence)) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (!(usernameRegex matches ownerName as java.lang.CharSequence)) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (StringsKt.isBlank(name) || name.length() > 64) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (StringsKt.isBlank(author) || author.length() > 64) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (revision < 1) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (keyElements.size() > 100) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         val var76: اك = اك.INSTANCE
         if (!var76.verifyCloudPayloadHash(payload, contentHash)) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         val `$this$map$iv`: java.lang.Iterable = keyElements
         val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(keyElements, 10))

         for (`item$iv$iv` in `$this$map$iv`) {
            var key: JsonObject
            var keyId: java.lang.String
            var secret: java.lang.String
            run label204@{
               key = (`item$iv$iv` as JsonElement).getAsJsonObject()
               keyId = key.get("id").getAsString()
               secret = key.get("key").getAsString()
               val usedActivations: JsonElement = key.get("maxActivations")
               if (usedActivations != null) {
                  val remainingActivations: JsonElement = if (!usedActivations.isJsonNull()) usedActivations else null
                  if (remainingActivations != null) {
                     var77 = remainingActivations.getAsInt()
                     return@label204
                  }
               }

               var77 = null
            }

            var var65: Int
            run label207@{
               var65 = key.get("usedActivations").getAsInt()
               val var66: JsonElement = key.get("remainingActivations")
               if (var66 != null) {
                  val var68: JsonElement = if (!var66.isJsonNull()) var66 else null
                  if (var68 != null) {
                     var78 = var68.getAsInt()
                     return@label207
                  }
               }

               var78 = null
            }

            var10000 = cloudIdRegex
            if (!(var10000 matches keyId as java.lang.CharSequence)) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            var10000 = cloudKeyRegex
            if (!(var10000 matches secret as java.lang.CharSequence)) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            run label212@{
               if (var77 != null) {
                  val var67: Int = var77
                  if (1 > var67 || var67 >= 1001) {
                     var81 = false
                     return@label212
                  }
               }

               var81 = true
            }

            if (!var81) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            if (var65 < 0) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            if (var78 != null && var78 < 0) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            `destination$iv$iv`.add(شق(keyId, secret, var77, var65, var78, key.get("revoked").getAsBoolean()))
         }

         error = (java.lang.Throwable)Result.constructor_impl/* $VF was: constructor-impl */(
            ضغ(id, ownerName, name, author, contentHash, payload, revision, revoked, `destination$iv$iv` as MutableList<شق>)
         )
      } catch (var52: java.lang.Throwable) {
         error = (java.lang.Throwable)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var52))
      }

      val var82: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(error)
      if (var82 == null) {
         return error as ضغ
      } else {
         throw شئ("invalid_server_response", var82, null, null, 12, null)
      }
   }

   private fun <T> failedFuture(error: Throwable): CompletableFuture<Any> {
      val var2: CompletableFuture = CompletableFuture()
      var2.completeExceptionally(error)
      return var2
   }

   private fun post(path: String, body: String, maximumResponseBytes: Int): CompletableFuture<JsonObject> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun revokeConfig(configId: String): CompletableFuture<Unit> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun listLibrary(): CompletableFuture<ته> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   public fun removeReceived(configId: String): CompletableFuture<Unit> {
      return CompletableFuture.failedFuture(UnsupportedOperationException("Rain network disabled"))
   }

   private fun readBoundedUtf8(input: InputStream, maximumBytes: Int): String {
      val bytes: ByteArray = input.readNBytes(maximumBytes + 1)
      if (bytes.length > maximumBytes) {
         throw شئ("server_response_too_large", null, null, null, 14, null)
      } else {
         val var10000: Charset = StandardCharsets.UTF_8
         return java.lang.String(bytes, var10000)
      }
   }
}
