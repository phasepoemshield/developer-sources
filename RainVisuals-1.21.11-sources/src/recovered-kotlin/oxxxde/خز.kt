package oxxxde

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.net.URI
import java.net.http.HttpClient
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.nio.file.StandardOpenOption
import java.time.Duration
import java.util.ArrayList
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean
import kotakbaz.rain.client.notification.RemoteNotificationService$NotificationResponse
import kotakbaz.rain.client.notification.RemoteNotificationService$RemoteAction
import kotakbaz.rain.client.notification.RemoteNotificationService$RemoteNotification
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link
import net.minecraft.client.MinecraftClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory

// $VF: Compiled from heavy
public object خز {
   private final val executor: ExecutorService = Executors.newSingleThreadExecutor({ runnable: Runnable ->
      val var1: Thread = Thread(runnable, "Rain-Remote-Notifications")
      var1.setDaemon(true)
      var1
   })

   private final var cursor: Long
   private const val POLL_INTERVAL_MS: Long = 10000L
   private final val requestInFlight: AtomicBoolean = AtomicBoolean()
   private final val pending: ArrayDeque<ثن> = ArrayDeque()
   private final var initialized: Boolean
   private final var closed: Boolean
   private final var sessionSynchronized: Boolean
   private final val httpClient: HttpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build()
   private final var lastFailureLogAt: Long
   private final var lastRequestAt: Long
   private final val logger: Logger = LoggerFactory.getLogger("Rain Notifications")
   private final val cursorFile: Path
   private const val FAILURE_LOG_INTERVAL_MS: Long = 60000L

   private fun JsonObject.notificationAction(): صظ? {
      val var10000: JsonElement = `$this$notificationAction`.get("action")
      if (var10000 == null) {
         return null
      } else {
         val value: JsonElement = var10000
         if (!var10000.isJsonObject()) {
            return null
         } else {
            var `$this$notificationAction_u24lambda_u240`: Any
            try {
               val action: JsonObject = value.getAsJsonObject()
               val var17: خز = INSTANCE
               val label: java.lang.String = var17.string(action, "label")
               val url: java.lang.String = INSTANCE.string(action, "url")
               if (StringsKt.isBlank(label) || label.length() > 32) {
                  throw IllegalArgumentException("Failed requirement.".toString())
               }

               if (url.length() > 2048) {
                  throw IllegalArgumentException("Failed requirement.".toString())
               }

               val uri: URI = URI.create(url)
               if (!StringsKt.equals(uri.getScheme(), "https", true)) {
                  throw IllegalArgumentException("Failed requirement.".toString())
               }

               val var9: java.lang.CharSequence = uri.getHost()
               if (var9 == null || StringsKt.isBlank(var9)) {
                  throw IllegalArgumentException("Failed requirement.".toString())
               }

               if (uri.getUserInfo() != null) {
                  throw IllegalArgumentException("Failed requirement.".toString())
               }

               val var10003: java.lang.String = uri.toASCIIString()
               `$this$notificationAction_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(
                  RemoteNotificationService$RemoteAction(label, var10003)
               )
            } catch (var12: java.lang.Throwable) {
               `$this$notificationAction_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var12))
            }

            return (if (isFailure) null else `$this$notificationAction_u24lambda_u240`) as RemoteNotificationService$RemoteAction
         }
      }
   }

   private fun persistCursor(value: Long) {
      val var3: خز = this

      var `$this$persistCursor_u24lambda_u240`: خز
      try {
         `$this$persistCursor_u24lambda_u240` = var3
         Files.createDirectories(cursorFile.getParent())
         val var6: Path = Files.createTempFile(cursorFile.getParent(), "notification-cursor.", ".tmp")

         var var23: Path
         try {
            Files.writeString(var6, java.lang.String.valueOf(value), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)

            try {
               var23 = Files.move(var6, cursorFile, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
            } catch (var13: AtomicMoveNotSupportedException) {
               var23 = Files.move(var6, cursorFile, StandardCopyOption.REPLACE_EXISTING)
            }

            var23 = var23
         } finally {
            Files.deleteIfExists(var6)
         }

         `$this$persistCursor_u24lambda_u240` = (خز)Result.constructor_impl/* $VF was: constructor-impl */(var23)
      } catch (var15: java.lang.Throwable) {
         `$this$persistCursor_u24lambda_u240` = (خز)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var15))
      }

      val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$persistCursor_u24lambda_u240`)
      if (var10000 != null) {
         INSTANCE.logFailure(var10000)
      }
   }

   private fun JsonObject.toNotification(after: Long): ثن? {
      val var4: JsonObject = `$this$toNotification`

      var `$this$toNotification_u24lambda_u240`: Any
      try {
         val id: Long = INSTANCE.long(var4, "id")
         if (id <= after) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         if (INSTANCE.long(var4, "expiresAt") <= System.currentTimeMillis()) {
            throw IllegalArgumentException("Failed requirement.".toString())
         }

         `$this$toNotification_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(
            RemoteNotificationService$RemoteNotification(
               id, INSTANCE.string(var4, "title"), INSTANCE.string(var4, "message"), INSTANCE.string(var4, "level"), INSTANCE.notificationAction(var4)
            )
         )
      } catch (var13: java.lang.Throwable) {
         `$this$toNotification_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var13))
      }

      return (if (isFailure) null else `$this$toNotification_u24lambda_u240`) as RemoteNotificationService$RemoteNotification
   }

   @JvmStatic
   fun {
      val var1: Path = Paths.get(System.getProperty("user.dir"), "Rain", "other", "notification-cursor.txt")
      cursorFile = var1
   }

   fun requestIfNeeded(client: MinecraftClient) {
   }

   private fun JsonObject.boolean(name: String): Boolean {
      val value: JsonElement = `$this$boolean`.get(name)
      if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isBoolean()) {
         throw IllegalArgumentException("Failed requirement.".toString())
      } else {
         return value.getAsBoolean()
      }
   }

   private fun logFailure(error: Throwable) {
      val now: Long = System.currentTimeMillis()
      if (now - lastFailureLogAt >= 60000L) {
         lastFailureLogAt = now
         logger.warn("Failed to update remote notifications: {}", error.getMessage())
      }
   }

   fun flushPending(client: MinecraftClient) {
      if (client.player != null) {
         while (!pending.isEmpty()) {
            val notification: RemoteNotificationService$RemoteNotification = pending.removeFirst()
            val var10000: RainMainMenuScreen$Link = RainMainMenuScreen$Link.INSTANCE
            val var10001: Long = notification.id
            val var10002: java.lang.String = notification.title
            val var10003: java.lang.String = notification.message
            val var10004: java.lang.String = notification.level
            val var10005: RemoteNotificationService$RemoteAction = notification.action
            val var3: java.lang.String = if (var10005 != null) var10005.label else null
            val var10006: RemoteNotificationService$RemoteAction = notification.action
            var10000.showRemoteNotification(var10001, var10002, var10003, var10004, var3, if (var10006 != null) var10006.url else null)
         }
      }
   }

   private fun readCursor(): Long {
      val var1: خز = this

      var `$this$readCursor_u24lambda_u240`: خز
      try {
         `$this$readCursor_u24lambda_u240` = var1
         val var10000: java.lang.String = Files.readString(cursorFile)
         `$this$readCursor_u24lambda_u240` = (خز)Result.constructor_impl/* $VF was: constructor-impl */(
            java.lang.Long.parseLong(StringsKt.trim(var10000).toString())
         )
      } catch (var4: java.lang.Throwable) {
         `$this$readCursor_u24lambda_u240` = (خز)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var4))
      }

      return RangesKt.coerceAtLeast(((if (isFailure) 0L else `$this$readCursor_u24lambda_u240`) as java.lang.Number).longValue(), 0L)
   }

   private fun request(after: Long): اع {
      throw UnsupportedOperationException("Rain network disabled")
   }

   private fun JsonObject.string(name: String): String {
      val value: JsonElement = `$this$string`.get(name)
      if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isString()) {
         throw IllegalArgumentException("Failed requirement.".toString())
      } else {
         val var10000: java.lang.String = value.getAsString()
         return var10000
      }
   }

   public fun initialize() {
   }

   public fun shutdown() {
      closed = true
      رظ.INSTANCE.unregister(حؤ.INSTANCE)
      executor.shutdownNow()
   }

   private fun parseResponse(json: String, after: Long): اع {
      val root: JsonElement = JsonParser.parseString(json)
      if (!root.isJsonObject()) {
         throw IllegalArgumentException("Notification API response is not an object".toString())
      } else {
         val response: JsonObject = root.getAsJsonObject()
         val nextCursor: Long = this.long(response, "nextCursor")
         if (nextCursor < after) {
            throw IllegalArgumentException("Notification API returned an invalid cursor".toString())
         } else {
            val latestId: Long = this.long(response, "latestId")
            if (latestId < nextCursor) {
               throw IllegalArgumentException("Notification API returned an invalid latest ID".toString())
            } else {
               var var10000: java.util.List
               run label96@{
                  val `$this$sortedBy$iv`: JsonElement = response.get("notifications")
                  if (`$this$sortedBy$iv` != null) {
                     val `$i$f$sortedBy`: JsonElement = if (`$this$sortedBy$iv`.isJsonArray()) `$this$sortedBy$iv` else null
                     if (`$i$f$sortedBy` != null) {
                        val var40: JsonArray = `$i$f$sortedBy`.getAsJsonArray()
                        if (var40 != null) {
                           val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = var40
                           val `destination$iv$iv`: java.util.Collection = ArrayList()

                           for (`element$iv$iv$iv` in `$this$mapNotNullTo$iv$iv`) {
                              run label88@{
                                 val var30: JsonElement = if ((`element$iv$iv$iv` as JsonElement).isJsonObject()) `element$iv$iv$iv` as JsonElement else null
                                 if (var30 != null) {
                                    val var43: JsonObject = var30.getAsJsonObject()
                                    if (var43 != null) {
                                       var44 = INSTANCE.toNotification(var43, after)
                                       return@label88
                                    }
                                 }

                                 var44 = null
                              }

                              if (var44 != null) {
                                 `destination$iv$iv`.add(var44)
                              }
                           }

                           var10000 = `destination$iv$iv` as java.util.List
                           return@label96
                        }
                     }
                  }

                  var10000 = null
               }

               if (var10000 == null) {
                  var10000 = CollectionsKt.emptyList()
               }

               return RemoteNotificationService$NotificationResponse(
                  CollectionsKt.sortedWith(var10000, دز<>()), nextCursor, latestId, this.boolean(response, "hasMore")
               )
            }
         }
      }
   }

   private fun JsonObject.long(name: String): Long {
      val value: JsonElement = `$this$long`.get(name)
      if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isNumber()) {
         throw IllegalArgumentException("Failed requirement.".toString())
      } else {
         val var10000: java.lang.String = value.getAsString()
         return java.lang.Long.parseLong(var10000)
      }
   }
}
