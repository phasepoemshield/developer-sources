package oxxxde

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import java.net.http.HttpClient
import java.time.Duration
import java.util.ArrayList
import java.util.UUID
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean
import net.minecraft.client.MinecraftClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object تَ {
   private final var lastFailureLogAt: Long
   private final var lastRequestAt: Long
   private final var initialized: Boolean
   private final var closed: Boolean
   private final val logger: Logger = LoggerFactory.getLogger("Rain Socials")
   private const val MAX_UUIDS_PER_CHECK: Int = 100
   private final var onlineUsers: Set<UUID> = SetsKt.emptySet()

   private final val executor: ExecutorService = Executors.newSingleThreadExecutor({ runnable: Runnable ->
      val var1: Thread = Thread(runnable, "Rain-Socials")
      var1.setDaemon(true)
      var1
   })

   private const val CHECK_INTERVAL_MS: Long = 10000L
   private final val requestInFlight: AtomicBoolean = AtomicBoolean()
   private final val httpClient: HttpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build()
   private const val FAILURE_LOG_INTERVAL_MS: Long = 60000L
   private final var lastServerAddress: String?

   private fun check(uuids: List<UUID>): Set<UUID> {
      throw UnsupportedOperationException("Rain network disabled")
   }

   @Compile
   public fun isRainUser(uuid: UUID): Boolean {
      return onlineUsers.contains(uuid)
   }

   @Compile
   fun checkIfNeeded(client: MinecraftClient) {
   }

   private fun logFailure(error: Throwable) {
      val now: Long = System.currentTimeMillis()
      if (now - lastFailureLogAt >= 60000L) {
         lastFailureLogAt = now
         logger.warn("Failed to update Rain users: {}", error.getMessage())
      }
   }

   private fun parseOnlineUsers(json: String): Set<UUID> {
      val root: JsonElement = JsonParser.parseString(json)
      if (!root.isJsonObject()) {
         throw IllegalArgumentException("Social API response is not an object".toString())
      } else {
         val online: JsonElement = root.getAsJsonObject().get("online")
         if (online == null || !online.isJsonArray()) {
            throw IllegalArgumentException("Social API response does not contain online users".toString())
         } else {
            val var10000: JsonArray = online.getAsJsonArray()
            val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = var10000
            val `destination$iv$iv`: java.util.Collection = ArrayList()

            for (`element$iv$iv$iv` in `$this$mapNotNullTo$iv$iv`) {
               val element: JsonElement = `element$iv$iv$iv` as JsonElement
               val var17: تَ = INSTANCE

               var `$this$parseOnlineUsers_u24lambda_u242_u240`: Any
               try {
                  `$this$parseOnlineUsers_u24lambda_u242_u240` = Result.constructor_impl/* $VF was: constructor-impl */(UUID.fromString(element.getAsString()))
               } catch (var22: java.lang.Throwable) {
                  `$this$parseOnlineUsers_u24lambda_u242_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var22))
               }

               val var28: UUID = (if (isFailure) null else `$this$parseOnlineUsers_u24lambda_u242_u240`) as UUID
               if (var28 != null) {
                  `destination$iv$iv`.add(var28)
               }
            }

            return CollectionsKt.toSet(`destination$iv$iv`)
         }
      }
   }

   @Compile
   public fun initialize() {
   }

   @Compile
   private fun checkBatch(uuids: List<UUID>): Set<UUID> {
      throw UnsupportedOperationException("Rain network disabled")
   }

   public fun shutdown() {
      closed = true
      onlineUsers = SetsKt.emptySet()
      executor.shutdownNow()
   }
}
