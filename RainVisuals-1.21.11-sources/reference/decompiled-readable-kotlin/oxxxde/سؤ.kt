package oxxxde

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.mojang.authlib.GameProfile
import com.mojang.authlib.yggdrasil.ProfileResult
import java.io.Closeable
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URI
import java.net.URLConnection
import java.net.URLEncoder
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.util.Locale
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.ConcurrentHashMap.KeySetView
import java.util.concurrent.atomic.AtomicInteger
import kotakbaz.rain.friend.FriendManager$FriendEntry
import net.minecraft.client.util.DefaultSkinHelper
import net.minecraft.util.Identifier

// $VF: Compiled from heavy
public object سؤ {
   private final val skinExecutor: ExecutorService = Executors.newFixedThreadPool(2, { runnable: Runnable ->
      val var1: Thread = Thread(runnable, "Rain-Friend-Skin-${skinThreadCounter.incrementAndGet()}")
      var1.setDaemon(true)
      var1
   })

   private final val loadingSkins: KeySetView<String, Boolean> = ConcurrentHashMap.newKeySet()
   private final val failedSkins: KeySetView<String, Boolean> = ConcurrentHashMap.newKeySet()
   private final val uuidCache: ConcurrentHashMap<String, UUID> = ConcurrentHashMap()
   @JvmStatic
   private Identifier fallbackTexture;
   private final val skinThreadCounter: AtomicInteger = AtomicInteger()

   @JvmStatic
   fun {
      val var10000: Identifier = DefaultSkinHelper.getTexture()
      fallbackTexture = var10000
   }

   private fun fetchOnlineUUID(name: String): UUID? {
      val var4: URLConnection = URI("https://api.mojang.com/users/profiles/minecraft/${URLEncoder.encode(name, StandardCharsets.UTF_8)}")
         .toURL()
         .openConnection()
         val connection: HttpURLConnection = var4 as HttpURLConnection

      try {
         connection.setConnectTimeout(5000)
         connection.setReadTimeout(5000)
         connection.setRequestProperty("Accept", "application/json")
         val var23: Int = connection.getResponseCode()
         if (200 > var23 || var23 >= 300) {
            return null
         }

         val var24: Closeable = InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)
         var var5: java.lang.Throwable = null

         var var26: UUID
         try {
            run label130@{
               val var8: JsonObject = Gson().fromJson(var24 as InputStreamReader, JsonObject.class)
               if (var8 != null) {
                  val var9: JsonElement = var8.get("id")
                  if (var9 != null) {
                     val var10: java.lang.String = var9.getAsString()
                     if (var10 != null) {
                        var26 = UUID.fromString(Regex("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})").replaceFirst(var10, "$1-$2-$3-$4-$5"))
                        return@label130
                     }
                  }
               }

               return null
            }
         } catch (var20: java.lang.Throwable) {
            var5 = var20
            throw var20
         } finally {
            CloseableKt.closeFinally(var24, var5)
         }

         var25 = var26
      } finally {
         (var4 as HttpURLConnection).disconnect()
      }

      return var25
   }

   public fun clearAll() {
      loadingSkins.clear()
      failedSkins.clear()

      for (`element$iv` in شغ.INSTANCE.getFriends()) {
         val var10000: FriendManager$FriendEntry = شغ.INSTANCE.getFriend(`element$iv` as java.lang.String)
         if (var10000 != null) {
            var10000.setSkinTexture(null)
         }
      }
   }

   public fun resolveUUID(name: String): UUID {
      val normalizedName: java.lang.String = this.normalize(name)
      val `$this$getOrPut$iv`: ConcurrentMap = uuidCache
      var var10000: Any = uuidCache.get(normalizedName)
      if (var10000 == null) {
         val var7: سؤ = INSTANCE

         var `$this$resolveUUID_u24lambda_u240_u240`: Any
         try {
            `$this$resolveUUID_u24lambda_u240_u240` = Result.constructor_impl/* $VF was: constructor-impl */(var7.fetchOnlineUUID(name))
         } catch (var13: java.lang.Throwable) {
            `$this$resolveUUID_u24lambda_u240_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var13))
         }

         val var19: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$resolveUUID_u24lambda_u240_u240`)
         if (var19 != null) {
            var19.printStackTrace()
         }

         var var20: UUID = (if (isFailure) null else `$this$resolveUUID_u24lambda_u240_u240`) as UUID
         if (var20 == null) {
            var20 = INSTANCE.offlineUUID(name)
         }

         var10000 = `$this$getOrPut$iv`.putIfAbsent(normalizedName, var20)
         if (var10000 == null) {
            var10000 = var20
         }
      }

      return var10000 as UUID
   }

   public fun requestSkin(friend: ذو) {
      val normalizedName: java.lang.String = this.normalize(friend.name)
      if (friend.getSkinTexture() == null) {
         if (!failedSkins.contains(normalizedName)) {
            if (loadingSkins.add(normalizedName)) {
               skinExecutor.execute({ 
                  INSTANCE.loadSkin(`$friend`, `$normalizedName`)
               })
            }
         }
      }
   }

   fun resolveTexture(friend: FriendManager$FriendEntry): Identifier {
      val var10000: Identifier = friend.getSkinTexture()
      if (var10000 != null) {
         var10000
      } else {
         this.requestSkin(friend)
         fallbackTexture
      }
   }

   fun resolveTexture(name: java.lang.String): Identifier {
      val var10000: FriendManager$FriendEntry = شغ.INSTANCE.getFriend(name)
      if (var10000 != null) {
         val var4: Identifier = this.resolveTexture(var10000)
         if (var4 != null) {
            var4
         }
      }

      fallbackTexture
   }

   private fun normalize(name: String): String {
      val var10000: Locale = Locale.ROOT
      val var3: java.lang.String = name.toLowerCase(var10000)
      return var3
   }

   private fun loadSkin(friend: ذو, normalizedName: String) {
      val name: java.lang.String = friend.name
      var waitingForSkinFuture: Boolean = false

      try {
         var var10000: GameProfile
         run label74@{
            val var16: Boolean = true
            val uuid: UUID = this.resolveUUID(name)
            var10000 = DefaultSkinHelper.getSkinTextures(uuid)
            var10000 = var10000.body().id()
            val var19: ProfileResult = ضك.getMc().getApiServices().sessionService().fetchProfile(uuid, true)
            if (var19 != null) {
               var10000 = var19.profile()
               if (var10000 != null) {
                  return@label74
               }
            }

            var10000 = GameProfile(uuid, name)
         }

         val var21: CompletableFuture = ضك.getMc().getSkinProvider().fetchSkinTextures(var10000)
         waitingForSkinFuture = true
         var21.whenComplete({ p0: Any, p1: Any ->
            `$tmp0`(p0, p1)
         })
         return
      } catch (var13: Exception) {
         var13.printStackTrace()
         failedSkins.add(normalizedName)
      } finally {
         if (var12) {
            if (!waitingForSkinFuture) {
               loadingSkins.remove(normalizedName)
            }
         }
      }

      if (!waitingForSkinFuture) {
         loadingSkins.remove(normalizedName)
      }

      val var12: <unknown>
   }

   private fun offlineUUID(name: String): UUID {
      val var3: java.lang.String = "OfflinePlayer:$name"
      val var10000: Charset = StandardCharsets.UTF_8
      val var4: ByteArray = var3.getBytes(var10000)
      val var2: UUID = UUID.nameUUIDFromBytes(var4)
      return var2
   }

   public fun clear(friend: ذو) {
      val normalizedName: java.lang.String = this.normalize(friend.name)
      loadingSkins.remove(normalizedName)
      failedSkins.remove(normalizedName)
      friend.setSkinTexture(null)
   }
}
