package oxxxde

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Locale
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object شغ : ه {
   private final var sortedEntriesCache: List<ذو>?
   private const val NAME_KEY: String = "name"
   public final val filePath: Path
   private const val FRIENDS_KEY: String = "friends"
   private final val gson: Gson = GsonBuilder().setPrettyPrinting().create()
   private final val friendsByName: LinkedHashMap<String, ذو> = LinkedHashMap()
   private const val PIN_KEY: String = "pin"
   private const val ADDED_AT_KEY: String = "addedAt"
   private final val dateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yy", Locale.ROOT)

   private fun sortedEntries(): List<ذو> {
      if (sortedEntriesCache != null) {
         return sortedEntriesCache
      } else {
         val var10000: java.util.Collection = friendsByName.values()
         val var5: java.util.List = CollectionsKt.sortedWith(var10000, ذّ())
         sortedEntriesCache = var5
         return var5
      }
   }

   private fun sanitizeDate(value: String?): String? {
      if (value != null) {
         var var10000: java.lang.String = StringsKt.trim(value).toString()
         if (var10000 != null) {
            var10000 = if (var10000.length() > 0) var10000 else null
            if (var10000 != null) {
               val date: java.lang.String = var10000
               val var3: شغ = this

               var `$this$sanitizeDate_u24lambda_u240`: Any
               try {
                  `$this$sanitizeDate_u24lambda_u240` = var3
                  `$this$sanitizeDate_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(
                     LocalDate.parse(date, dateFormatter).format(dateFormatter)
                  )
               } catch (var8: java.lang.Throwable) {
                  `$this$sanitizeDate_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var8))
               }

               return (if (isFailure) null else `$this$sanitizeDate_u24lambda_u240`) as java.lang.String
            }
         }
      }

      return null
   }

   public fun clear(): Boolean {
      if (friendsByName.isEmpty()) {
         return true
      } else {
         val snapshot: LinkedHashMap = LinkedHashMap<>(friendsByName)
         friendsByName.clear()
         this.invalidateSortedEntries()
         if (this.save()) {
            سؤ.INSTANCE.clearAll()
            return true
         } else {
            friendsByName.putAll(snapshot)
            this.invalidateSortedEntries()
            return false
         }
      }
   }

   private fun currentDate(): String {
      val var10000: java.lang.String = LocalDate.now().format(dateFormatter)
      return var10000
   }

   private fun normalize(name: String): String {
      val var10000: Locale = Locale.ROOT
      val var3: java.lang.String = name.toLowerCase(var10000)
      return var3
   }

   private fun sanitizeName(name: String?): String? {
      if (name != null) {
         val var10000: java.lang.String = StringsKt.trim(name).toString()
         if (var10000 != null) {
            return if (var10000.length() > 0) var10000 else null
         }
      }

      return null
   }

   public fun getFriendEntries(): List<ذو> {
      return this.sortedEntries()
   }

   public fun getFriend(name: String?): ذو? {
      val var10000: java.lang.String = this.sanitizeName(name)
      return if (var10000 == null) null else friendsByName.get(this.normalize(var10000))
   }

   public fun isFriend(name: String?): Boolean {
      val var10000: java.lang.String = this.sanitizeName(name)
      return var10000 != null && friendsByName.containsKey(this.normalize(var10000))
   }

   private fun save(): Boolean {
      this.ensureDirectory()
      val root: JsonObject = JsonObject()
      val friends: JsonArray = JsonArray()

      for (`element$iv` in this.sortedEntries()) {
         val friend: ذو = `element$iv` as ذو
         val entry: JsonObject = JsonObject()
         entry.addProperty("name", friend.name)
         entry.addProperty("addedAt", friend.addedAt)
         entry.addProperty("pin", friend.pin)
         friends.add(entry)
      }

      root.add("friends", friends)
      val var11: شغ = this

      var var12: شغ
      try {
         var12 = var11
         var12 = (شغ)Result.constructor_impl/* $VF was: constructor-impl */(
            Files.writeString(filePath, gson.toJson(root), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)
         )
      } catch (var10: java.lang.Throwable) {
         var12 = (شغ)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var10))
      }

      return isSuccess
   }

   public fun getFriends(): List<String> {
      val `$this$map$iv`: java.lang.Iterable = this.sortedEntries()
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))

      for (`item$iv$iv` in `$this$map$iv`) {
         `destination$iv$iv`.add((`item$iv$iv` as ذو).name)
      }

      return `destination$iv$iv` as MutableList<java.lang.String>
   }

   @JvmStatic
   fun {
      val var1: Path = Paths.get(System.getProperty("user.dir"), "Rain", "friends.json")
      filePath = var1
   }

   public fun getAddedDate(name: String?): String? {
      val var10000: java.lang.String = this.sanitizeName(name)
      if (var10000 == null) {
         return null
      } else {
         val var3: ذو = friendsByName.get(this.normalize(var10000))
         return if (var3 != null) var3.addedAt else null
      }
   }

   @Compile
   public fun add(name: String): دم {
      val var2: java.lang.String = this.sanitizeName(name)
      if (var2 == null) {
         return دم.INVALID_NAME
      } else {
         val var3: java.lang.String = this.normalize(var2)
         if (friendsByName.containsKey(var3)) {
            return دم.ALREADY_ADDED
         } else {
            val var4: ذو = ذو(var2, this.currentDate(), false, 4, null)
            friendsByName.put(var3, var4)
            this.invalidateSortedEntries()
            if (!this.save()) {
               friendsByName.remove(var3)
               this.invalidateSortedEntries()
               return دم.SAVE_FAILED
            } else {
               سؤ.INSTANCE.requestSkin(var4)
               return دم.ADDED
            }
         }
      }
   }

   private fun ensureDirectory() {
      Files.createDirectories(filePath.getParent())
   }

   private fun invalidateSortedEntries() {
      sortedEntriesCache = null
   }

   private fun loadFriends(friends: JsonArray): Boolean {
      var migrated: Boolean = false

      for (`element$iv` in friends) {
         val element: JsonElement = `element$iv` as JsonElement
         if ((`element$iv` as JsonElement).isJsonPrimitive()) {
            val var10000: java.lang.String = INSTANCE.sanitizeName(element.getAsString())
            if (var10000 != null) {
               friendsByName.putIfAbsent(INSTANCE.normalize(var10000), ذو(var10000, INSTANCE.currentDate(), false, 4, null))
               migrated = true
            }
         } else if (element.isJsonObject()) {
            val var13: JsonObject = element.getAsJsonObject()
            var var14: شغ = INSTANCE
            var var10001: JsonElement = var13.get("name")
            val var15: java.lang.String = var14.sanitizeName(if (var10001 != null) var10001.getAsString() else null)
            if (var15 != null) {
               var14 = INSTANCE
               var10001 = var13.get("addedAt")
               val addedAt: java.lang.String = var14.sanitizeDate(if (var10001 != null) var10001.getAsString() else null)
               val var17: JsonElement = var13.get("pin")
               val pin: Boolean = var17 != null && var17.getAsBoolean()
               if (addedAt == null) {
                  migrated = true
               }

               if (!var13.has("pin")) {
                  migrated = true
               }

               val var18: LinkedHashMap = friendsByName
               val var20: java.lang.String = INSTANCE.normalize(var15)
               val var10002: ذو = ذو
               var var10005: java.lang.String = addedAt
               if (addedAt == null) {
                  var10005 = INSTANCE.currentDate()
               }

               var10002./* $VF: Unable to resugar constructor */<init>(var15, var10005, pin)
               var18.putIfAbsent(var20, var10002)
            }
         }
      }

      return migrated
   }

   @Compile
   public override fun load() {
      this.ensureDirectory()
      friendsByName.clear()
      this.invalidateSortedEntries()
      if (Files.exists(filePath)) {
         try {
            val var1: JsonElement = JsonParser.parseString(Files.readString(filePath))
            val var2: JsonArray
            if (var1.isJsonArray()) {
               var2 = var1.getAsJsonArray()
            } else {
               if (!var1.isJsonObject()) {
                  return
               }

               var2 = var1.getAsJsonObject().getAsJsonArray("friends")
            }

            if (var2 == null) {
               return
            }

            if (this.loadFriends(var2)) {
               this.invalidateSortedEntries()
               this.save()
            }

            Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var3: java.lang.Throwable) {
            Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var3))
         }
      }
   }

   public fun remove(name: String): ئ {
      val var10000: java.lang.String = this.sanitizeName(name)
      if (var10000 == null) {
         return ئ.INVALID_NAME
      } else {
         val key: java.lang.String = this.normalize(var10000)
         val var5: ذو = friendsByName.remove(key)
         if (var5 == null) {
            return ئ.NOT_FOUND
         } else {
            this.invalidateSortedEntries()
            if (!this.save()) {
               friendsByName.put(key, var5)
               this.invalidateSortedEntries()
               return ئ.SAVE_FAILED
            } else {
               سؤ.INSTANCE.clear(var5)
               return ئ.REMOVED
            }
         }
      }
   }
}
