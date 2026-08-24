package oxxxde

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive
import java.awt.Color
import java.io.Closeable
import java.io.File
import java.io.InputStream
import java.io.Serializable
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.nio.file.StandardOpenOption
import java.security.MessageDigest
import java.time.Instant
import java.util.ArrayList
import java.util.HashSet
import java.util.HexFormat
import java.util.Locale
import java.util.stream.Stream
import kotlin.jdk7.AutoCloseableKt
import kotlin.jvm.internal.Ref
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object اك {
   private const val UNKNOWN_AUTHOR: String = "Unknown"
   private final val manualConfigNameRegex: Regex = Regex("^[A-Za-z]+$")
   private final var visibleConfigsCache: List<صٌ>
   private const val LEGACY_CLICK_GUI_MODULE_NAME: String = "ClickGui"
   private final val selectedConfigPath: Path
   private final val logger: Logger
   private const val FORMAT_VERSION_KEY: String = "FormatVersion"
   private final var cleanRuntimeSnapshot: ضج?
   private final var selectedConfigName: String?
   private final val gson: Gson
   private final val legacyConfigPath: Path
   private final val reservedWindowsNames: Set<String>
   public final val configPath: Path
   public const val AUTO_LOAD_CONFIG: String = "AutoLoad"
   private final var stateVersion: Int
   private const val CLICK_GUI_SETTINGS_KEY: String = "ClickGuiSettings"
   private const val CLOUD_IDENTITY_FILE_NAME: String = "cloud_identity.json"
   private final var activeConfigName: String?
   private const val SELECTED_CONFIG_FILE_NAME: String = "selected_config.txt"
   private const val LEGACY_AUTHOR_KEY: String = "Author"
   private const val CURRENT_FORMAT_VERSION: Int = 2
   private const val CLOUD_ORIGIN_KEY: String = "CloudOrigin"
   private const val DRAGS_FILE_NAME: String = "drags.json"
   private const val MAX_LOCAL_CONFIG_BYTES: Int = 524288
   private final var visibleConfigNamesCache: List<String>
   private final var activeCloudOrigin: دة?
   private const val LEGACY_CLICK_GUI_MODULE_KEY: String = "ClickGuiModule"
   private const val AUTHOR_KEY: String = "Author"
   private const val WAYPOINT_FILE_NAME: String = "way.json"
   private final var visibleConfigsDirty: Boolean
   private const val CONTENT_KEY: String = "Content"

   private fun persistSelectedConfigName() {
      val var1: اك = this

      try {
         val var6: اك = var1
         Files.createDirectories(selectedConfigPath.getParent())
         val var10000: Any
         if (selectedConfigName == null) {
            var10000 = Files.deleteIfExists(selectedConfigPath)
         } else {
            var6.writeAtomically(selectedConfigPath, selectedConfigName)
            var10000 = Unit.INSTANCE
         }

         val var7: Any = Result.constructor_impl/* $VF was: constructor-impl */(var10000)
      } catch (var5: java.lang.Throwable) {
         val `$this$persistSelectedConfigName_u24lambda_u240`: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var5))
      }
   }

   private fun availableCloudConfigName(preferredName: String): String {
      val var15: java.lang.String = StringsKt.take(
         StringsKt.trimEnd(Regex("[\\\\/:*?\"<>|\\p{Cntrl}]").replace(StringsKt.trim(preferredName).toString(), ""), '.', ' '), 48
      )
      var var23: java.lang.String = if (INSTANCE.isValidName(var15) && !StringsKt.equals(var15, "AutoLoad", true)) var15 else null
      if (var23 == null) {
         var23 = "CloudConfig"
      }

      val sanitized: java.lang.String = var23
      val var16: java.lang.Iterable = this.getConfigNames()
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var16, 10))

      for (`item$iv$iv` in var16) {
         var23 = (`item$iv$iv` as java.lang.String).toLowerCase(Locale.ROOT)
         `destination$iv$iv`.add(var23)
      }

      val existing: HashSet = CollectionsKt.toHashSet(`destination$iv$iv` as java.util.List)
      var var10001: java.lang.String = var23.toLowerCase(Locale.ROOT)
      if (!existing.contains(var10001)) {
         return var23
      } else {
         for (var17 in 2..999) {
            val var20: java.lang.String = "${StringsKt.take(sanitized, RangesKt.coerceAtLeast(48 - java.lang.String.valueOf(var17).length(), 1))}$var17"
            var10001 = var20.toLowerCase(Locale.ROOT)
            if (!existing.contains(var10001) && this.isValidName(var20)) {
               return var20
            }
         }

         return "Cloud${System.currentTimeMillis()}"
      }
   }

   public fun captureCleanRuntimeSnapshot() {
      if (cleanRuntimeSnapshot == null) {
         this.validateConfigKeys()
         cleanRuntimeSnapshot = this.captureRuntimeSnapshot()
      }
   }

   public fun getCloudOrigin(name: String): دة? {
      if (!this.isValidName(name)) {
         return null
      } else {
         val var10001: Path = configPath.resolve("$name.json")
         return this.readCloudOrigin(var10001)
      }
   }

   public fun hashCloudPayload(payload: JsonObject): String {
      val var10000: MessageDigest = MessageDigest.getInstance("SHA-256")
      val var10001: ByteArray = this.canonicalJson(payload).getBytes(Charsets.UTF_8)
      val var3: java.lang.String = HexFormat.of().formatHex(var10000.digest(var10001))
      return var3
   }

   private fun rebuildVisibleConfigs(force: Boolean) {
      if (force || visibleConfigsDirty) {
         val refreshedConfigs: java.util.List = this.loadVisibleConfigs()
         visibleConfigsDirty = false
         if (!(refreshedConfigs == visibleConfigsCache)) {
            visibleConfigsCache = refreshedConfigs
            val `$this$mapTo$iv$iv`: java.lang.Iterable = refreshedConfigs
            val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(refreshedConfigs, 10))

            for (`item$iv$iv` in `$this$mapTo$iv$iv`) {
               `destination$iv$iv`.add((`item$iv$iv` as صٌ).name)
            }

            visibleConfigNamesCache = `destination$iv$iv` as MutableList<java.lang.String>
            val var13: Int = stateVersion++
         }
      }
   }

   public fun isCloudConfig(name: String): Boolean {
      if (!this.isValidName(name)) {
         return false
      } else {
         val var10001: Path = configPath.resolve("$name.json")
         return this.readCloudOrigin(var10001) != null
      }
   }

   private fun parseModule(module: دِ, json: JsonObject, formatVersion: Int): دء {
      var var10000: JsonElement = json.get("key")
      val var14: Int = if (var10000 != null) this.parseInt(var10000) else null
      var10000 = json.get("enabled")
      val var16: java.lang.Boolean = if (var10000 != null) this.parseBoolean(var10000) else null
      val var11: JsonObject = this.optionalObject(json, "Settings")
      var var17: java.util.List = if (var11 != null) INSTANCE.parseSettings(module.settings, var11, formatVersion, module) else null
      if (var17 == null) {
         var17 = CollectionsKt.emptyList()
      }

      return دء(module, var14, var16, var17)
   }

   private fun serializeCloudOrigin(origin: دة): JsonObject {
      val var2: JsonObject = JsonObject()
      var2.addProperty("ConfigId", origin.configId)
      var2.addProperty("OwnerName", origin.ownerName)
      var2.addProperty("ContentHash", origin.contentHash)
      var2.addProperty("ImportedAt", origin.importedAt)
      var2.addProperty("Owned", origin.owned)
      var2.addProperty("Revision", origin.revision)
      val var5: java.lang.String = origin.cloudName
      if (var5 != null) {
         val var9: java.lang.String = if (!StringsKt.isBlank(var5)) var5 else null
         if (var9 != null) {
            var2.addProperty("Name", var9)
         }
      }

      var2.addProperty("Shared", origin.shared)
      var2.addProperty("AccountSynced", origin.accountSynced)
      return var2
   }

   public fun canCreate(name: String): Boolean {
      val normalized: java.lang.String = StringsKt.trim(name).toString()
      if (this.isValidName(normalized) && !StringsKt.equals(normalized, "AutoLoad", true)) {
         val `$this$none$iv`: java.lang.Iterable = this.getConfigNames()
         var var10000: Boolean
         if (`$this$none$iv` is java.util.Collection && (`$this$none$iv` as java.util.Collection).isEmpty()) {
            var10000 = true
         } else {
            val var5: java.util.Iterator = `$this$none$iv`.iterator()

            while (true) {
               if (!var5.hasNext()) {
                  var10000 = true
                  break
               }

               if (StringsKt.equals(var5.next() as java.lang.String, normalized, true)) {
                  var10000 = false
                  break
               }
            }
         }

         return var10000
      } else {
         return false
      }
   }

   private fun validateSettingKeys(owner: String, settings: List<رف<*>>) {
      val keys: HashSet = HashSet()

      for (`element$iv` in settings) {
         val setting: رف = `element$iv` as رف
         if (!keys.add((`element$iv` as رف).configKey)) {
            throw IllegalArgumentException(("Duplicate setting config key '${setting.configKey}' in $owner").toString())
         }
      }
   }

   private fun restoreRuntimeSnapshot(snapshot: ضج) {
      for (`element$iv` in snapshot.clickGuiSettings) {
         val update: إ = `element$iv` as إ
         val `$this$forEach$iv`: اك = INSTANCE

         try {
            `$this$forEach$iv`.applySettingUpdate(update)
            val var37: Any = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var20: java.lang.Throwable) {
            val `$this$restoreRuntimeSnapshot_u24lambda_u242_u240`: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var20))
         }
      }

      for (var27 in snapshot.modules) {
         val var29: دء = var27 as دء
         val var33: اك = INSTANCE

         try {
            val var10000: دِ = var29.getModule()
            val var10001: Int = var29.key
            if (var10001 == null) {
               throw IllegalArgumentException("Required value was null.".toString())
            }

            var10000.setKey(var10001.intValue())
            val var39: Any = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var19: java.lang.Throwable) {
            val var38: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var19))
         }

         for (`element$iv` in var29.settings) {
            val it: إ = `element$iv` as إ
            val var14: اك = INSTANCE

            try {
               var14.applySettingUpdate(it)
               val var49: Any = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
            } catch (var18: java.lang.Throwable) {
               val `$this$restoreRuntimeSnapshot_u24lambda_u241_u241_u240`: Any = Result.constructor_impl/* $VF was: constructor-impl */(
                  ResultKt.createFailure(var18)
               )
            }
         }
      }

      for (var28 in snapshot.modules) {
         val var30: دء = var28 as دء
         val var35: اك = INSTANCE

         try {
            val var50: دِ = var30.getModule()
            val var51: java.lang.Boolean = var30.enabled
            if (var51 == null) {
               throw IllegalArgumentException("Required value was null.".toString())
            }

            var50.setEnabled(var51)
            val var42: Any = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var17: java.lang.Throwable) {
            val var41: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var17))
         }
      }
   }

   private fun moveConfigFile(source: Path, target: Path, caseOnlyRename: Boolean) {
      if (!caseOnlyRename) {
         try {
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE)
         } catch (var13: AtomicMoveNotSupportedException) {
            Files.move(source, target)
         }
      } else {
         val temporary: Path = Files.createTempFile(configPath, ".rename-", ".tmp")
         var movedToTemporary: Boolean = false

         try {
            Files.move(source, temporary, StandardCopyOption.REPLACE_EXISTING)
            movedToTemporary = true

            try {
               val var19: Path = Files.move(temporary, target, StandardCopyOption.ATOMIC_MOVE)
            } catch (var14: AtomicMoveNotSupportedException) {
               val var17: Path = Files.move(temporary, target)
            }
         } catch (var15: java.lang.Throwable) {
            if (movedToTemporary && Files.exists(temporary) && !Files.exists(source)) {
               var `$this$moveConfigFile_u24lambda_u240`: Any
               try {
                  `$this$moveConfigFile_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(Files.move(temporary, source))
               } catch (var12: java.lang.Throwable) {
                  `$this$moveConfigFile_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var12))
               }

               val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$moveConfigFile_u24lambda_u240`)
               if (var10000 != null) {
                  ExceptionsKt.addSuppressed(var15, var10000)
               }
            } else if (!movedToTemporary) {
               Files.deleteIfExists(temporary)
            }

            throw var15
         }
      }
   }

   public fun isImportedCloudConfig(name: String): Boolean {
      val var10000: دة = this.getCloudOrigin(name)
      return var10000 != null && !var10000.owned
   }

   private fun serializeModule(module: دِ): JsonObject {
      val json: JsonObject = JsonObject()
      json.addProperty("enabled", module.isPreferredEnabled())
      json.addProperty("key", module.getKey())
      json.add("Settings", this.serializeSettings(module.settings))
      return json
   }

   private fun migrateLegacyConfigs() {
      if (!(legacyConfigPath == configPath) && Files.isDirectory(legacyConfigPath)) {
         val migrated: Ref.BooleanRef = Ref.BooleanRef()
         val var2: AutoCloseable = Files.list(legacyConfigPath)
         var var3: java.lang.Throwable = null

         try {
            (var2 as Stream).filter({ p0: Any ->
               `$tmp0`(p0)
            }).forEach({ p0: Any ->
               `$tmp0`(p0)
            })
         } catch (var8: java.lang.Throwable) {
            var3 = var8
            throw var8
         } finally {
            AutoCloseableKt.closeFinally(var2, var3)
         }

         if (migrated.element) {
            this.markVisibleConfigsDirty()
         }
      }
   }

   public fun markOwnedCloudConfig(
      name: String,
      configId: String,
      ownerName: String,
      contentHash: String,
      revision: Int,
      cloudName: String = name,
      shared: Boolean? = null
   ): Boolean {
      if (this.isValidName(name) && !StringsKt.isBlank(configId) && Regex("^[0-9a-f]{64}$") matches contentHash as java.lang.CharSequence && revision >= 1) {
         val var46: Path = configPath.resolve("$name.json")
         if (!Files.isRegularFile(var46)) {
            return false
         } else {
            val var9: اك = this

            var `$this$markOwnedCloudConfig_u24lambda_u240`: اك
            try {
               `$this$markOwnedCloudConfig_u24lambda_u240` = var9
               val var10000: Gson = gson
               val var69: JsonObject = var10000.fromJson(`$this$markOwnedCloudConfig_u24lambda_u240`.readConfigText(var46), JsonObject.class)
               if (var69 == null) {
                  throw IllegalStateException("Config root is missing".toString())
               }

               val previousOrigin: دة = `$this$markOwnedCloudConfig_u24lambda_u240`.readCloudOrigin(var69)
               if (previousOrigin != null && !previousOrigin.owned) {
                  throw IllegalArgumentException("Imported cloud configs cannot become owned configs".toString())
               }

               `$this$markOwnedCloudConfig_u24lambda_u240`.parseConfigRoot(var69)
               `$this$markOwnedCloudConfig_u24lambda_u240`.refreshVisibleConfigsNow()

               run label221@{
                  for (`element$iv` in visibleConfigsCache) {
                     val validationError: صٌ = `element$iv` as صٌ
                     val var70: دة = (`element$iv` as صٌ).getCloudOrigin()
                     if (var70 != null && var70.owned && validationError.getCloudOrigin().configId == configId) {
                        var71 = `element$iv`
                        return@label221
                     }
                  }

                  var71 = null
               }

               var existingOwned: صٌ
               var var78: Long
               var var10001: java.lang.String
               var var10002: java.lang.String
               run label227@{
                  existingOwned = var71 as صٌ
                  var72 = configId
                  var10001 = StringsKt.take(ownerName, 64)
                  var10002 = contentHash
                  if (previousOrigin != null) {
                     val var59: java.lang.Long = previousOrigin.importedAt
                     val var27: Boolean = var59.longValue() > 0L
                     var72 = configId
                     var10002 = contentHash
                     val var10003: java.lang.Long = if (var27) var59 else null
                     if ((if (var27) var59 else null) != null) {
                        var78 = var10003
                        return@label227
                     }
                  }

                  run label226@{
                     if (existingOwned != null) {
                        val var76: دة = existingOwned.getCloudOrigin()
                        if (var76 != null) {
                           val var28: java.lang.Long = var76.importedAt
                           var77 = if (var28.longValue() > 0L) var28 else null
                           return@label226
                        }
                     }

                     var77 = null
                  }

                  var78 = var77 ?: Instant.now().toEpochMilli()
               }

               val var81: Boolean
               if (shared != null) {
                  var81 = shared
               } else {
                  var var10007: java.lang.Boolean = if (previousOrigin != null) previousOrigin.shared else null
                  if (var10007 != null) {
                     var81 = var10007
                  } else {
                     run label230@{
                        if (existingOwned != null) {
                           val var79: دة = existingOwned.getCloudOrigin()
                           if (var79 != null) {
                              var10007 = var79.shared
                              return@label230
                           }
                        }

                        var10007 = null
                     }

                     var81 = var10007 != null && var10007
                  }
               }

               val var52: دة = دة(var72, var10001, var10002, var78, true, revision, cloudName, var81, false, 256, null)
               var69.add("CloudOrigin", `$this$markOwnedCloudConfig_u24lambda_u240`.serializeCloudOrigin(var52))
               val var56: Path = configPath.resolve(
                  "${if (previousOrigin != null && previousOrigin.owned)
                     name
                     else
                     (if (existingOwned != null) existingOwned.name else `$this$markOwnedCloudConfig_u24lambda_u240`.availableCloudConfigName(cloudName))}.json"
               )
               var10002 = gson.toJson(var69)
               `$this$markOwnedCloudConfig_u24lambda_u240`.writeAtomically(var56, var10002)
               val var57: اك = `$this$markOwnedCloudConfig_u24lambda_u240`

               var var60: Any
               try {
                  var60 = Result.constructor_impl/* $VF was: constructor-impl */(var57.parseConfig(var56))
               } catch (var44: java.lang.Throwable) {
                  var60 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var44))
               }

               val var73: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var60)
               if (var73 != null) {
                  if (!var56.equals(var46) && existingOwned == null) {
                     Files.deleteIfExists(var56)
                  }

                  throw var73
               }

               if (var56.equals(var46) && StringsKt.equals(activeConfigName, name, true)) {
                  activeCloudOrigin = var52
               }

               `$this$markOwnedCloudConfig_u24lambda_u240`.markVisibleConfigsDirty()
               `$this$markOwnedCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
            } catch (var45: java.lang.Throwable) {
               `$this$markOwnedCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var45))
            }

            val var74: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$markOwnedCloudConfig_u24lambda_u240`)
            if (var74 != null) {
               logger.error("Failed to mark '$name' as an owned cloud config", var74)
            }

            return isSuccess
         }
      } else {
         return false
      }
   }

   public fun importCloudConfig(preferredName: String, ownerName: String, configId: String, contentHash: String, payload: JsonObject): String? {
      if (!StringsKt.isBlank(configId) && this.verifyCloudPayloadHash(payload, contentHash)) {
         val var6: اك = this

         var `$this$importCloudConfig_u24lambda_u240`: اك
         try {
            `$this$importCloudConfig_u24lambda_u240` = var6
            if (payload.has("CloudOrigin")) {
               throw IllegalArgumentException("Cloud payload already has provenance".toString())
            }

            `$this$importCloudConfig_u24lambda_u240`.parseConfigRoot(payload)
            `$this$importCloudConfig_u24lambda_u240`.ensureConfigDirectory()
            val origin: دة = دة(
               configId, StringsKt.take(ownerName, 64), contentHash, Instant.now().toEpochMilli(), false, 0, preferredName, false, true, 128, null
            )
            val targetName: JsonObject = payload.deepCopy()
            targetName.add("CloudOrigin", `$this$importCloudConfig_u24lambda_u240`.serializeCloudOrigin(origin))
            val var26: java.lang.String = `$this$importCloudConfig_u24lambda_u240`.availableCloudConfigName(preferredName)
            val var27: Path = configPath.resolve("$var26.json")
            val var10002: java.lang.String = gson.toJson(targetName)
            `$this$importCloudConfig_u24lambda_u240`.writeAtomically(var27, var10002)
            val var28: اك = `$this$importCloudConfig_u24lambda_u240`

            var validationError: java.lang.Throwable
            try {
               validationError = (java.lang.Throwable)Result.constructor_impl/* $VF was: constructor-impl */(var28.parseConfig(var27))
            } catch (var16: java.lang.Throwable) {
               validationError = (java.lang.Throwable)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var16))
            }

            val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(validationError)
            if (var10000 != null) {
               Files.deleteIfExists(var27)
               throw var10000
            }

            `$this$importCloudConfig_u24lambda_u240`.markVisibleConfigsDirty()
            `$this$importCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(var26)
         } catch (var17: java.lang.Throwable) {
            `$this$importCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var17))
         }

         val var33: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$importCloudConfig_u24lambda_u240`)
         if (var33 != null) {
            logger.error("Failed to import cloud config '$preferredName'", var33)
         }

         return (if (isFailure) null else `$this$importCloudConfig_u24lambda_u240`) as java.lang.String
      } else {
         return null
      }
   }

   private fun parseFloat(element: JsonElement): Float {
      val primitive: JsonPrimitive = this.requirePrimitive(element)
      if (!primitive.isNumber()) {
         throw IllegalArgumentException("Expected number value".toString())
      } else {
         val var10000: java.lang.String = primitive.getAsString()
         val var3: java.lang.Float = StringsKt.toFloatOrNull(var10000)
         if (var3 != null) {
            val var4: java.lang.Float = if (Math.abs(var3.floatValue()) <= java.lang.Float.MAX_VALUE) var3 else null
            if (var4 != null) {
               return var4
            }
         }

         throw IllegalStateException(("Invalid number value: ${primitive.getAsString()}").toString())
      }
   }

   public fun getSelectedVisibleConfigName(): String? {
      this.ensureVisibleConfigsCache()
      if (selectedConfigName == null) {
         return null
      } else {
         val selected: java.lang.String = selectedConfigName
         if (this.isValidName(selectedConfigName) && !StringsKt.equals(selected, "AutoLoad", true)) {
            val `$this$none$iv`: java.lang.Iterable = visibleConfigNamesCache
            var var10000: Boolean
            if (visibleConfigNamesCache is java.util.Collection && visibleConfigNamesCache.isEmpty()) {
               var10000 = true
            } else {
               val var4: java.util.Iterator = `$this$none$iv`.iterator()

               while (true) {
                  if (!var4.hasNext()) {
                     var10000 = true
                     break
                  }

                  if (StringsKt.equals(var4.next() as java.lang.String, selected, true)) {
                     var10000 = false
                     break
                  }
               }
            }

            if (var10000) {
               this.setSelectedConfigName(null)
               return null
            } else {
               return selected
            }
         } else {
            this.setSelectedConfigName(null)
            return null
         }
      }
   }

   public fun unloadActiveCloudConfig(): Boolean {
      return true
   }

   private fun parseInt(element: JsonElement): Int {
      val primitive: JsonPrimitive = this.requirePrimitive(element)
      if (!primitive.isNumber()) {
         throw IllegalArgumentException("Expected integer value".toString())
      } else {
         val var10000: java.lang.String = primitive.getAsString()
         val var5: Int = StringsKt.toIntOrNull(var10000)
         if (var5 != null) {
            return var5
         } else {
            throw IllegalStateException(("Invalid integer value: ${primitive.getAsString()}").toString())
         }
      }
   }

   public fun setCloudConfigShared(name: String, shared: Boolean): Boolean {
      if (!this.isValidName(name)) {
         return false
      } else {
         val target: Path = configPath.resolve("$name.json")
         if (!Files.isRegularFile(target)) {
            return false
         } else {
            val var4: اك = this

            var `$this$setCloudConfigShared_u24lambda_u240`: اك
            try {
               run label59@{
                  `$this$setCloudConfigShared_u24lambda_u240` = var4
                  val var10000: Gson = gson
                  val var20: JsonObject = var10000.fromJson(`$this$setCloudConfigShared_u24lambda_u240`.readConfigText(target), JsonObject.class)
                  if (var20 == null) {
                     throw IllegalStateException("Config root is missing".toString())
                  }

                  val var8: دة = `$this$setCloudConfigShared_u24lambda_u240`.readCloudOrigin(var20)
                  if (var8 != null) {
                     val var12: دة = if (var8.owned) var8 else null
                     if (var12 != null) {
                        if (var12.shared != shared) {
                           var20.add(
                              "CloudOrigin",
                              `$this$setCloudConfigShared_u24lambda_u240`.serializeCloudOrigin(
                                 دة.copy$default(var12, null, null, null, 0L, false, 0, null, shared, false, 383, null)
                              )
                           )
                           val var10002: java.lang.String = gson.toJson(var20)
                           `$this$setCloudConfigShared_u24lambda_u240`.writeAtomically(target, var10002)
                           `$this$setCloudConfigShared_u24lambda_u240`.markVisibleConfigsDirty()
                        }

                        `$this$setCloudConfigShared_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
                        return@label59
                     }
                  }

                  throw IllegalStateException("Owned cloud origin is missing".toString())
               }
            } catch (var14: java.lang.Throwable) {
               `$this$setCloudConfigShared_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var14))
            }

            val var21: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$setCloudConfigShared_u24lambda_u240`)
            if (var21 != null) {
               logger.error("Failed to update shared state for '$name'", var21)
            }

            return isSuccess
         }
      }
   }

   private fun findModuleJson(content: JsonObject, module: دِ): JsonObject? {
      var `$this$count$iv`: JsonObject = this.optionalObject(content, this.moduleConfigKey(module))
      if (`$this$count$iv` != null) {
         return `$this$count$iv`
      } else {
         val var10: java.lang.Iterable = خً.INSTANCE.modules
         val var10000: Int
         if (var10 is java.util.Collection && (var10 as java.util.Collection).isEmpty()) {
            var10000 = 0
         } else {
            val it: Int = 0

            for (`element$iv` in var10) {
               if ((`element$iv` as دِ).name == module.name) {
                  if (++it < 0) {
                     CollectionsKt.throwCountOverflow()
                  }
               }
            }

            var10000 = it
         }

         if (var10000 == 1) {
            `$this$count$iv` = this.optionalObject(content, module.name)
            if (`$this$count$iv` != null) {
               return `$this$count$iv`
            }
         }

         return null
      }
   }

   private fun captureRuntimeSnapshot(): ضج {
      val modules: java.lang.Iterable = سر.INSTANCE.settings
      val `$this$mapTo$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(modules, 10))

      for (`item$iv$iv` in modules) {
         `$this$mapTo$iv$iv`.add(إ(`item$iv$iv` as رف<*>, INSTANCE.settingValue(`item$iv$iv` as رف<*>)))
      }

      val clickGuiSettings: java.util.List = `$this$mapTo$iv$iv` as java.util.List
      val var31: java.lang.Iterable = خً.INSTANCE.modules
      val var34: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var31, 10))

      for (var37 in var31) {
         val var38: دِ = var37 as دِ
         val var10001: Int = (var37 as دِ).getKey()
         val var10002: java.lang.Boolean = (var37 as دِ).isPreferredEnabled()
         val `$this$map$iv`: java.lang.Iterable = var38.settings
         val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))

         for (`item$iv$iv` in `$this$map$iv`) {
            `destination$iv$iv`.add(إ(`item$iv$iv` as رف<*>, INSTANCE.settingValue(`item$iv$iv` as رف<*>)))
         }

         var34.add(دء(var38, var10001, var10002, `destination$iv$iv` as MutableList<إ>))
      }

      return ضج(clickGuiSettings, var34 as MutableList<دء>)
   }

   public fun getConfigNames(): List<String> {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial oxxxde/اك.ensureConfigDirectory ()V
      // 04: getstatic oxxxde/اك.configPath Ljava/nio/file/Path;
      // 07: invokeinterface java/nio/file/Path.toFile ()Ljava/io/File; 1
      // 0c: invokedynamic accept ()Ljava/io/FilenameFilter; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/io/File;Ljava/lang/String;)Z, oxxxde/اك.getConfigNames$lambda$0 (Ljava/io/File;Ljava/lang/String;)Z, (Ljava/io/File;Ljava/lang/String;)Z ]
      // 11: invokevirtual java/io/File.listFiles (Ljava/io/FilenameFilter;)[Ljava/io/File;
      // 14: dup
      // 15: ifnonnull 1d
      // 18: pop
      // 19: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 1c: areturn
      // 1d: astore 1
      // 1e: aload 1
      // 1f: invokestatic kotlin/collections/ArraysKt.asSequence ([Ljava/lang/Object;)Lkotlin/sequences/Sequence;
      // 22: getstatic oxxxde/اآ.INSTANCE Loxxxde/اآ;
      // 25: checkcast kotlin/jvm/functions/Function1
      // 28: invokestatic kotlin/sequences/SequencesKt.map (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 2b: new oxxxde/سإ
      // 2e: dup
      // 2f: aload 0
      // 30: invokespecial oxxxde/سإ.<init> (Ljava/lang/Object;)V
      // 33: checkcast kotlin/jvm/functions/Function1
      // 36: invokestatic kotlin/sequences/SequencesKt.filterNot (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 39: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/اك.getConfigNames$lambda$1 (Ljava/lang/String;)Ljava/lang/String;, (Ljava/lang/String;)Ljava/lang/String; ]
      // 3e: invokestatic kotlin/sequences/SequencesKt.map (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 41: astore 2
      // 42: nop
      // 43: bipush 0
      // 44: nop
      // 45: istore 3
      // 46: aload 2
      // 47: nop
      // 48: new oxxxde/ثز
      // 4b: dup
      // 4c: invokespecial oxxxde/ثز.<init> ()V
      // 4f: checkcast java/util/Comparator
      // 52: invokestatic kotlin/sequences/SequencesKt.sortedWith (Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Lkotlin/sequences/Sequence;
      // 55: invokestatic kotlin/sequences/SequencesKt.toList (Lkotlin/sequences/Sequence;)Ljava/util/List;
      // 58: areturn
   }

   private fun ensureVisibleConfigsCache() {
      this.rebuildVisibleConfigs(false)
   }

   private fun restoreMisplacedInternalFile(fileName: String) {
      val misplaced: Path = configPath.resolve(fileName)
      val actual: Path = legacyConfigPath.resolve(fileName)
      if (Files.exists(misplaced) && !Files.exists(actual)) {
         val var4: اك = this

         var `$this$restoreMisplacedInternalFile_u24lambda_u240`: Any
         try {
            `$this$restoreMisplacedInternalFile_u24lambda_u240` = var4
            Files.createDirectories(actual.getParent())
            `$this$restoreMisplacedInternalFile_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(Files.move(misplaced, actual))
         } catch (var12: java.lang.Throwable) {
            `$this$restoreMisplacedInternalFile_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var12))
         }

         if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$restoreMisplacedInternalFile_u24lambda_u240`) != null) {
            val var8: اك = INSTANCE

            try {
               val var15: Any = Result.constructor_impl/* $VF was: constructor-impl */(Files.copy(misplaced, actual))
            } catch (var11: java.lang.Throwable) {
               val `$this$restoreMisplacedInternalFile_u24lambda_u241_u240`: Any = Result.constructor_impl/* $VF was: constructor-impl */(
                  ResultKt.createFailure(var11)
               )
            }
         }
      }
   }

   public fun getStateVersion(): Int {
      return stateVersion
   }

   private fun requirePrimitive(element: JsonElement): JsonPrimitive {
      if (!element.isJsonPrimitive()) {
         throw IllegalArgumentException("Expected primitive value".toString())
      } else {
         val var10000: JsonPrimitive = element.getAsJsonPrimitive()
         return var10000
      }
   }

   private fun parseConfigRoot(root: JsonObject): خٌ {
      var var10000: JsonElement = root.get("FormatVersion")
      val formatVersion: Int
      val var29: Int = formatVersion = if (var10000 != null) this.parseInt(var10000) else 1
      if (1 > var29 || var29 >= 3) {
         throw IllegalArgumentException(("Unsupported config format version: $var29").toString())
      } else {
         val content: JsonObject = this.requireObject(root.get("Content"), "Content")
         val modules: JsonObject = this.findClickGuiSettings(content)
         var var30: java.util.List = if (modules != null) INSTANCE.parseSettings(سر.INSTANCE.settings, modules, var29, null) else null
         if (var30 == null) {
            var30 = CollectionsKt.emptyList()
         }

         val var28: java.lang.Iterable = خً.INSTANCE.modules
         val `destination$iv$iv`: java.util.Collection = ArrayList()

         for (`element$iv$iv$iv` in var28) {
            var10000 = INSTANCE.findModuleJson(content, `element$iv$iv$iv` as دِ)
            val var32: دء = if (var10000 == null) null else INSTANCE.parseModule(`element$iv$iv$iv` as دِ, var10000, formatVersion)
            if (var32 != null) {
               `destination$iv$iv`.add(var32)
            }
         }

         return خٌ(formatVersion, this.readAuthor(root), this.readCloudOrigin(root), var30, `destination$iv$iv` as MutableList<دء>)
      }
   }

   public fun getVisibleConfigNames(): List<String> {
      this.ensureVisibleConfigsCache()
      return visibleConfigNamesCache
   }

   private fun parseSettings(settings: List<رف<*>>, json: JsonObject, formatVersion: Int, module: دِ?): List<إ> {
      val `$this$mapIndexedNotNullTo$iv$iv`: java.lang.Iterable = settings
      val `destination$iv$iv`: java.util.Collection = ArrayList()
      var `index$iv$iv$iv`: Int = 0

      for (`item$iv$iv$iv` in `$this$mapIndexedNotNullTo$iv$iv`) {
         val var15: Int = `index$iv$iv$iv`++
         if (var15 < 0) {
            CollectionsKt.throwIndexOverflow()
         }

         val var25: JsonElement = INSTANCE.findSettingElement(settings, `item$iv$iv$iv` as رف<*>, var15, json, formatVersion, module)
         val var26: إ = if (var25 == null) null else إ(`item$iv$iv$iv` as رف<*>, INSTANCE.parseSettingValue(`item$iv$iv$iv` as رف<*>, var25, formatVersion))
         if (var26 != null) {
            `destination$iv$iv`.add(var26)
         }
      }

      return `destination$iv$iv` as MutableList<إ>
   }

   private fun legacySettingIndex(module: دِ?, index: Int, json: JsonObject): Int {
      return if ((if (module != null) this.moduleConfigKey(module) else null) == "RenderTweaksModule"
            && module.settings.size() == 8
            && json.has(this.settingConfigKey(8))
            && !json.has(this.settingConfigKey(9))
            && index >= 2)
         index + 1
         else
         index
      }

   private fun findClickGuiSettings(content: JsonObject): JsonObject? {
      var var10000: JsonObject = this.optionalObject(content, "ClickGuiSettings")
      if (var10000 != null) {
         return var10000
      } else {
         var10000 = this.optionalObject(content, "ClickGuiModule")
         if (var10000 != null) {
            var10000 = INSTANCE.optionalObject(var10000, "Settings")
            if (var10000 != null) {
               return var10000
            }
         }

         var10000 = this.optionalObject(content, "ClickGui")
         if (var10000 != null) {
            var10000 = INSTANCE.optionalObject(var10000, "Settings")
            if (var10000 != null) {
               return var10000
            }
         }

         return null
      }
   }

   private fun markVisibleConfigsDirty() {
      visibleConfigsDirty = true
      val var1: Int = stateVersion++
   }

   private fun readConfigText(file: Path): String {
      if (!Files.isRegularFile(file)) {
         throw IllegalArgumentException("Config file is missing".toString())
      } else if (Files.size(file) > 524288L) {
         throw IllegalArgumentException("Config file exceeds the 524288 byte limit".toString())
      } else {
         val var3: Closeable = Files.newInputStream(file)
         var var4: java.lang.Throwable = null

         var var17: ByteArray
         try {
            var17 = (var3 as InputStream).readNBytes(524289)
         } catch (var9: java.lang.Throwable) {
            var4 = var9
            throw var9
         } finally {
            CloseableKt.closeFinally(var3, var4)
         }

         if (var17.length > 524288) {
            throw IllegalArgumentException("Config file exceeds the 524288 byte limit".toString())
         } else {
            return java.lang.String(var17, Charsets.UTF_8)
         }
      }
   }

   public fun remove(name: String): Boolean {
      if (!this.isValidName(name)) {
         return false
      } else {
         val var2: اك = this

         var removed: Any
         try {
            removed = var2
            removed = Result.constructor_impl/* $VF was: constructor-impl */(Files.deleteIfExists(configPath.resolve("$name.json")))
         } catch (var5: java.lang.Throwable) {
            removed = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var5))
         }

         val var7: Any = if (isFailure) false else removed
         removed = var7 as java.lang.Boolean
         if (removed) {
            INSTANCE.markVisibleConfigsDirty()
         }

         if (removed && StringsKt.equals(selectedConfigName, name, true)) {
            INSTANCE.setSelectedConfigName(null)
         }

         if (removed && StringsKt.equals(activeConfigName, name, true)) {
            activeConfigName = null
            activeCloudOrigin = null
         }

         return var7 as java.lang.Boolean
      }
   }

   private fun currentAuthor(): String {
      val var10000: java.lang.String = رغ.getUsername()
      return var10000
   }

   public fun refreshVisibleConfigsNow() {
      this.rebuildVisibleConfigs(true)
   }

   private fun readCloudOrigin(file: Path): دة? {
      if (!Files.isRegularFile(file)) {
         return null
      } else {
         val var2: اك = this

         var `$this$readCloudOrigin_u24lambda_u240`: اك
         try {
            `$this$readCloudOrigin_u24lambda_u240` = var2
            val var10000: JsonObject = gson.fromJson(var2.readConfigText(file), JsonObject.class)
            if (var10000 == null) {
               return null
            }

            `$this$readCloudOrigin_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(
               `$this$readCloudOrigin_u24lambda_u240`.readCloudOrigin(var10000)
            )
         } catch (var6: java.lang.Throwable) {
            `$this$readCloudOrigin_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var6))
         }

         return (if (isFailure) null else `$this$readCloudOrigin_u24lambda_u240`) as دة
      }
   }

   private fun readCloudOrigin(root: JsonObject): دة? {
      val configId: JsonElement = root.get("CloudOrigin")
      if (configId != null) {
         var ownerName: JsonElement = if (configId.isJsonObject()) configId else null
         if (ownerName != null) {
            val var21: JsonObject = ownerName.getAsJsonObject()
            if (var21 != null) {
               ownerName = var21.get("ConfigId")
               if (ownerName != null) {
                  var var22: JsonElement = if (ownerName.isJsonPrimitive()) ownerName else null
                  if (var22 != null) {
                     val var26: java.lang.String = var22.getAsString()
                     if (var26 != null) {
                        var var31: java.lang.String = if (!StringsKt.isBlank(var26)) var26 else null
                        if (var31 != null) {
                           var var10000: java.lang.String
                           run label220@{
                              var22 = var21.get("OwnerName")
                              if (var22 != null) {
                                 val var27: JsonElement = if (var22.isJsonPrimitive()) var22 else null
                                 if (var27 != null) {
                                    var31 = var27.getAsString()
                                    if (var31 != null) {
                                       val var37: java.lang.String = if (!StringsKt.isBlank(var31)) var31 else null
                                       if (var37 != null) {
                                          var10000 = var37
                                          return@label220
                                       }
                                    }
                                 }
                              }

                              var10000 = "Unknown"
                           }

                           val var28: JsonElement = var21.get("ContentHash")
                           if (var28 != null) {
                              val var34: JsonElement = if (var28.isJsonPrimitive()) var28 else null
                              if (var34 != null) {
                                 val var39: java.lang.String = var34.getAsString()
                                 if (var39 != null) {
                                    val var45: java.lang.String = if (!StringsKt.isBlank(var39)) var39 else null
                                    if (var45 != null) {
                                       run label223@{
                                          val var40: JsonElement = var21.get("ImportedAt")
                                          if (var40 != null) {
                                             val var46: JsonElement = if (var40.isJsonPrimitive()) var40 else null
                                             if (var46 != null) {
                                                var82 = var46.getAsLong()
                                                return@label223
                                             }
                                          }

                                          var82 = 0L
                                       }

                                       run label226@{
                                          val var47: JsonElement = var21.get("Owned")
                                          if (var47 != null) {
                                             val var53: JsonElement = if (var47.isJsonPrimitive()) var47 else null
                                             if (var53 != null) {
                                                var83 = var53.getAsBoolean()
                                                return@label226
                                             }
                                          }

                                          var83 = false
                                       }

                                       run label229@{
                                          val var54: JsonElement = var21.get("Revision")
                                          if (var54 != null) {
                                             val var59: JsonElement = if (var54.isJsonPrimitive()) var54 else null
                                             if (var59 != null) {
                                                var84 = RangesKt.coerceAtLeast(var59.getAsInt(), 0)
                                                return@label229
                                             }
                                          }

                                          var84 = 0
                                       }

                                       run label233@{
                                          val var60: JsonElement = var21.get("Name")
                                          if (var60 != null) {
                                             val var65: JsonElement = if (var60.isJsonPrimitive()) var60 else null
                                             if (var65 != null) {
                                                val var70: java.lang.String = var65.getAsString()
                                                if (var70 != null) {
                                                   var10000 = if (!StringsKt.isBlank(var70)) var70 else null
                                                   return@label233
                                                }
                                             }
                                          }

                                          var10000 = null
                                       }

                                       run label236@{
                                          val var66: JsonElement = var21.get("Shared")
                                          if (var66 != null) {
                                             val var71: JsonElement = if (var66.isJsonPrimitive()) var66 else null
                                             if (var71 != null) {
                                                var86 = var71.getAsBoolean()
                                                return@label236
                                             }
                                          }

                                          var86 = false
                                       }

                                       run label239@{
                                          val var72: JsonElement = var21.get("AccountSynced")
                                          if (var72 != null) {
                                             val var76: JsonElement = if (var72.isJsonPrimitive()) var72 else null
                                             if (var76 != null) {
                                                var87 = var76.getAsBoolean()
                                                return@label239
                                             }
                                          }

                                          var87 = false
                                       }

                                       return دة(var31, var10000, var45, var82, var83, var84, var10000, var86, var87)
                                    }
                                 }
                              }
                           }

                           return null
                        }
                     }
                  }
               }

               return null
            }
         }
      }

      return null
   }

   public fun isCloudConfigActive(): Boolean {
      return false
   }

   public fun isManualConfigName(name: String): Boolean {
      return this.isValidName(name) && manualConfigNameRegex matches name as java.lang.CharSequence && !StringsKt.equals(name, "AutoLoad", true)
   }

   private fun moduleConfigKey(module: دِ): String {
      val var2: java.lang.String = module.getClass().getSimpleName()
      var var10000: java.lang.String = if (!StringsKt.isBlank(var2)) var2 else null
      if (var10000 == null) {
         var10000 = module.name
      }

      return var10000
   }

   private fun migrateLoadedConfig(file: Path, config: خٌ) {
      if (config.formatVersion < 2) {
         val var3: اك = this

         var `$this$migrateLoadedConfig_u24lambda_u240`: اك
         try {
            `$this$migrateLoadedConfig_u24lambda_u240` = var3
            val var10002: java.lang.String = gson.toJson(var3.serializeConfig(config.author, config.getCloudOrigin()))
            `$this$migrateLoadedConfig_u24lambda_u240`.writeAtomically(file, var10002)
            `$this$migrateLoadedConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var7: java.lang.Throwable) {
            `$this$migrateLoadedConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
         }

         val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$migrateLoadedConfig_u24lambda_u240`)
         if (var10000 != null) {
            logger.error("Failed to migrate config '${file.getFileName()}'", var10000)
         }
      }
   }

   private fun parseSettingValue(setting: رف<*>, element: JsonElement, formatVersion: Int): Any {
      val var10000: Serializable
      if (setting is خذ) {
         var10000 = this.parseBoolean(element)
      } else if (setting is طُ) {
         var10000 = this.normalizeSlider(setting as طُ, this.parseFloat(element))
      } else if (setting is ظي) {
         var10000 = this.parseMode(setting as ظي, element, formatVersion)
      } else if (setting is عت) {
         val var5: java.lang.String = (setting as عت).normalize(this.parseString(element))
         if (!(setting as عت).accepts(var5)) {
            throw IllegalArgumentException(("Invalid text value for ${(setting as عت).getConfigKey()}").toString())
         }

         var10000 = var5
      } else if (setting is ذُ) {
         var10000 = this.parseInt(element)
      } else {
         if (setting !is رت) {
            throw IllegalStateException(("Unsupported setting type: ${setting.getClass().getName()}").toString())
         }

         var10000 = Color(this.parseInt(element), true)
      }

      return var10000
   }

   private fun readAuthor(root: JsonObject): String {
      val var2: JsonElement = root.get("Author")
      if (var2 != null) {
         val var3: JsonElement = if (var2.isJsonPrimitive()) var2 else null
         if (var3 != null) {
            val var13: java.lang.String = var3.getAsString()
            if (var13 != null) {
               val var14: java.lang.String = if (!StringsKt.isBlank(var13)) var13 else null
               if (var14 != null) {
                  return var14
               }
            }
         }
      }

      var var10000: java.lang.String
      run label78@{
         val var16: JsonElement = root.get("Author")
         if (var16 != null) {
            val var17: JsonElement = if (var16.isJsonPrimitive()) var16 else null
            if (var17 != null) {
               val var18: java.lang.String = var17.getAsString()
               if (var18 != null) {
                  var10000 = if (!StringsKt.isBlank(var18)) var18 else null
                  return@label78
               }
            }
         }

         var10000 = null
      }

      if (var10000 == null) {
         var10000 = "Unknown"
      }

      return var10000
   }

   private fun applySettingUpdate(update: إ) {
      val setting: رف = update.getSetting()
      if (setting is خذ) {
         val var10000: خذ = setting as خذ
         val var10001: Any = update.value
         var10000.set(var10001 as java.lang.Boolean)
      } else if (setting is طُ) {
         val var3: طُ = setting as طُ
         val var8: Any = update.value
         var3.setClamped(var8 as java.lang.Float)
      } else if (setting is ظي) {
         val var4: ظي = setting as ظي
         val var9: Any = update.value
         var4.setMode(var9 as java.lang.String)
      } else if (setting is عت) {
         val var5: عت = setting as عت
         val var10: Any = update.value
         var5.setText(var10 as java.lang.String)
      } else if (setting is ذُ) {
         val var6: ذُ = setting as ذُ
         val var11: Any = update.value
         var6.setKey(var11 as Int)
      } else {
         if (setting !is رت) {
            throw IllegalStateException(("Unsupported setting type: ${setting.getClass().getName()}").toString())
         }

         val var7: رت = setting as رت
         val var12: Any = update.value
         var7.setColor(var12 as Color)
      }
   }

   public fun isValidName(name: String): Boolean {
      if (StringsKt.isBlank(name)) {
         return false
      } else if (name.length() > 64) {
         return false
      } else if (!(name == StringsKt.trim(name).toString())) {
         return false
      } else if (!(name == ".") && !(name == "..")) {
         if (!StringsKt.endsWith$default(name, '.', false, 2, null) && !StringsKt.endsWith$default(name, ' ', false, 2, null)) {
            val var10000: java.util.Set = reservedWindowsNames
            val var10001: java.lang.String = StringsKt.substringBefore$default(name, '.', null, 2, null).toUpperCase(Locale.ROOT)
            if (var10000.contains(var10001)) {
               return false
            } else {
               val `$this$none$iv`: java.lang.CharSequence = name
               var var4: Int = 0

               while (true) {
                  if (var4 >= `$this$none$iv`.length()) {
                     var8 = true
                     break
                  }

                  val it: Char = `$this$none$iv`.charAt(var4)
                  if (StringsKt.contains$default("\\/:*?\"<>|", it, false, 2, null) || it < ' ') {
                     var8 = false
                     break
                  }

                  var4++
               }

               return var8
            }
         } else {
            return false
         }
      } else {
         return false
      }
   }

   private fun parseString(element: JsonElement): String {
      val primitive: JsonPrimitive = this.requirePrimitive(element)
      if (!primitive.isString()) {
         throw IllegalArgumentException("Expected string value".toString())
      } else {
         val var10000: java.lang.String = primitive.getAsString()
         return var10000
      }
   }

   public fun syncReceivedCloudConfig(preferredName: String, ownerName: String, configId: String, contentHash: String, payload: JsonObject): String? {
      if (!StringsKt.isBlank(configId) && this.verifyCloudPayloadHash(payload, contentHash)) {
         val var6: اك = this

         var `$this$syncReceivedCloudConfig_u24lambda_u240`: اك
         try {
            `$this$syncReceivedCloudConfig_u24lambda_u240` = var6
            if (payload.has("CloudOrigin")) {
               throw IllegalArgumentException("Cloud payload already has provenance".toString())
            }

            `$this$syncReceivedCloudConfig_u24lambda_u240`.parseConfigRoot(payload)
            `$this$syncReceivedCloudConfig_u24lambda_u240`.ensureConfigDirectory()
            `$this$syncReceivedCloudConfig_u24lambda_u240`.refreshVisibleConfigsNow()

            var var79: Any
            run label190@{
               for (target in visibleConfigsCache) {
                  val var13: صٌ = target as صٌ
                  val var10000: دة = (target as صٌ).getCloudOrigin()
                  if (var10000 != null && !var10000.owned && var13.getCloudOrigin().configId == configId) {
                     var79 = target
                     return@label190
                  }
               }

               var79 = null
            }

            run label214@{
               val existing: صٌ = var79 as صٌ
               if (var79 as صٌ != null) {
                  val var80: دة = existing.getCloudOrigin()
                  val var53: java.lang.String = `$this$syncReceivedCloudConfig_u24lambda_u240`.cloudPayloadHash(existing.name)
                  if (var53 != null && !(var53 == var80.contentHash)) {
                     if (!var80.accountSynced) {
                        val var63: Path = configPath.resolve("${existing.name}.json")
                        val var85: Gson = gson
                        val var86: JsonObject = var85.fromJson(`$this$syncReceivedCloudConfig_u24lambda_u240`.readConfigText(var63), JsonObject.class)
                        if (var86 == null) {
                           throw IllegalStateException("Config root is missing".toString())
                        }

                        var86.add(
                           "CloudOrigin",
                           `$this$syncReceivedCloudConfig_u24lambda_u240`.serializeCloudOrigin(
                              دة.copy$default(var80, null, null, null, 0L, false, 0, null, false, true, 255, null)
                           )
                        )
                        val var89: java.lang.String = gson.toJson(var86)
                        `$this$syncReceivedCloudConfig_u24lambda_u240`.writeAtomically(var63, var89)
                        `$this$syncReceivedCloudConfig_u24lambda_u240`.markVisibleConfigsDirty()
                     }

                     var84 = existing.name
                     return@label214
                  }
               }

               var var91: Long
               var var10001: java.lang.String
               var var10002: java.lang.String
               run label200@{
                  var81 = configId
                  var10001 = StringsKt.take(ownerName, 64)
                  var10002 = contentHash
                  if (existing != null) {
                     val var10003: دة = existing.getCloudOrigin()
                     if (var10003 != null) {
                        val var69: java.lang.Long = var10003.importedAt
                        val var22: Boolean = var69.longValue() > 0L
                        var81 = configId
                        var10002 = contentHash
                        val var90: java.lang.Long = if (var22) var69 else null
                        if ((if (var22) var69 else null) != null) {
                           var91 = var90
                           return@label200
                        }
                     }
                  }

                  var91 = Instant.now().toEpochMilli()
               }

               var var10004: Boolean
               var var10005: Byte
               var var10006: java.lang.String
               run label205@{
                  var10004 = false
                  var10005 = 0
                  if (existing != null) {
                     val var54: دة = existing.getCloudOrigin()
                     if (var54 != null) {
                        val var57: java.lang.String = var54.cloudName
                        if (var57 != null) {
                           val var28: Boolean = !StringsKt.isBlank(var57)
                           var10004 = false
                           var10005 = 0
                           val var60: java.lang.String = if (var28) var57 else null
                           if ((if (var28) var57 else null) != null) {
                              var10006 = var60
                              return@label205
                           }
                        }
                     }
                  }

                  var10006 = preferredName
               }

               var var49: دة
               var var58: JsonObject
               run label208@{
                  var49 = دة(var81, var10001, var10002, var91, var10004, var10005, var10006, false, true, 128, null)
                  var58 = payload.deepCopy()
                  var58.add("CloudOrigin", `$this$syncReceivedCloudConfig_u24lambda_u240`.serializeCloudOrigin(var49))
                  if (existing != null) {
                     var82 = existing.name
                     if (var82 != null) {
                        return@label208
                     }
                  }

                  var82 = `$this$syncReceivedCloudConfig_u24lambda_u240`.availableCloudConfigName(preferredName)
               }

               val var62: Path = configPath.resolve("$var82.json")
               var10002 = gson.toJson(var58)
               `$this$syncReceivedCloudConfig_u24lambda_u240`.writeAtomically(var62, var10002)
               val var66: اك = `$this$syncReceivedCloudConfig_u24lambda_u240`

               var var71: Any
               try {
                  var71 = Result.constructor_impl/* $VF was: constructor-impl */(var66.parseConfig(var62))
               } catch (var41: java.lang.Throwable) {
                  var71 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var41))
               }

               val var83: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var71)
               if (var83 != null) {
                  if (existing == null) {
                     Files.deleteIfExists(var62)
                  }

                  throw var83
               }

               if (StringsKt.equals(activeConfigName, var82, true)) {
                  activeCloudOrigin = var49
               }

               `$this$syncReceivedCloudConfig_u24lambda_u240`.markVisibleConfigsDirty()
               var84 = var82
            }

            `$this$syncReceivedCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(var84)
         } catch (var42: java.lang.Throwable) {
            `$this$syncReceivedCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var42))
         }

         val var87: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$syncReceivedCloudConfig_u24lambda_u240`)
         if (var87 != null) {
            logger.error("Failed to synchronize received cloud config '$preferredName'", var87)
         }

         return (if (isFailure) null else `$this$syncReceivedCloudConfig_u24lambda_u240`) as java.lang.String
      } else {
         return null
      }
   }

   private fun optionalObject(parent: JsonObject, key: String): JsonObject? {
      val var10000: JsonElement = parent.get(key)
      if (var10000 == null) {
         return null
      } else if (!var10000.isJsonObject()) {
         throw IllegalArgumentException(("Expected object: $key").toString())
      } else {
         return var10000.getAsJsonObject()
      }
   }

   @Compile
   public fun load(name: String): Boolean {
      if (this.isValidName(name)) {
         val var2: Path = configPath.resolve("$name.json")
         if (Files.exists(var2)) {
            var var10000: Any
            try {
               this.validateConfigKeys()
               val var3: خٌ = this.parseConfig(var2)
               this.applyConfig(var3)
               this.migrateLoadedConfig(var2, var3)
               if (!StringsKt__StringsJVMKt.equals(name, "AutoLoad", true)) {
                  activeConfigName = name
                  activeCloudOrigin = var3.getCloudOrigin()
                  this.setSelectedConfigName(name)
               }

               var10000 = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
            } catch (var5: java.lang.Throwable) {
               var10000 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var5))
            }

            val var4: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var10000)
            if (var4 != null) {
               logger.error("Failed to load config '$name'", var4)
            }

            return isSuccess
         }
      }

      return false
   }

   public fun syncOwnedCloudConfig(
      preferredName: String,
      ownerName: String,
      configId: String,
      contentHash: String,
      revision: Int,
      shared: Boolean,
      payload: JsonObject
   ): String? {
      if (!StringsKt.isBlank(configId) && revision >= 1 && this.verifyCloudPayloadHash(payload, contentHash)) {
         val var8: اك = this

         var `$this$syncOwnedCloudConfig_u24lambda_u240`: اك
         try {
            `$this$syncOwnedCloudConfig_u24lambda_u240` = var8
            if (payload.has("CloudOrigin")) {
               throw IllegalArgumentException("Cloud payload already has provenance".toString())
            }

            `$this$syncOwnedCloudConfig_u24lambda_u240`.parseConfigRoot(payload)
            `$this$syncOwnedCloudConfig_u24lambda_u240`.ensureConfigDirectory()
            `$this$syncOwnedCloudConfig_u24lambda_u240`.refreshVisibleConfigsNow()

            var var65: Any
            run label158@{
               for (target in visibleConfigsCache) {
                  val var15: صٌ = target as صٌ
                  val var10000: دة = (target as صٌ).getCloudOrigin()
                  if (var10000 != null && var10000.owned && var15.getCloudOrigin().configId == configId) {
                     var65 = target
                     return@label158
                  }
               }

               var65 = null
            }

            run label173@{
               val existing: صٌ = var65 as صٌ
               if (var65 as صٌ != null) {
                  val var66: دة = existing.getCloudOrigin()
                  val var50: java.lang.String = `$this$syncOwnedCloudConfig_u24lambda_u240`.cloudPayloadHash(existing.name)
                  if (var50 != null && !(var50 == var66.contentHash)) {
                     `$this$syncOwnedCloudConfig_u24lambda_u240`.setCloudConfigShared(existing.name, shared)
                     var70 = existing.name
                     return@label173
                  }
               }

               var var74: Long
               var var10001: java.lang.String
               var var10002: java.lang.String
               run label164@{
                  var67 = configId
                  var10001 = StringsKt.take(ownerName, 64)
                  var10002 = contentHash
                  if (existing != null) {
                     val var10003: دة = existing.getCloudOrigin()
                     if (var10003 != null) {
                        val var60: java.lang.Long = var10003.importedAt
                        val var24: Boolean = var60.longValue() > 0L
                        var67 = configId
                        var10002 = contentHash
                        val var73: java.lang.Long = if (var24) var60 else null
                        if ((if (var24) var60 else null) != null) {
                           var74 = var73
                           return@label164
                        }
                     }
                  }

                  var74 = Instant.now().toEpochMilli()
               }

               var var46: دة
               var var53: JsonObject
               run label167@{
                  var46 = دة(var67, var10001, var10002, var74, true, revision, preferredName, shared, false, 256, null)
                  var53 = payload.deepCopy()
                  var53.add("CloudOrigin", `$this$syncOwnedCloudConfig_u24lambda_u240`.serializeCloudOrigin(var46))
                  if (existing != null) {
                     var68 = existing.name
                     if (var68 != null) {
                        return@label167
                     }
                  }

                  var68 = `$this$syncOwnedCloudConfig_u24lambda_u240`.availableCloudConfigName(preferredName)
               }

               val var56: Path = configPath.resolve("$var68.json")
               var10002 = gson.toJson(var53)
               `$this$syncOwnedCloudConfig_u24lambda_u240`.writeAtomically(var56, var10002)
               val var58: اك = `$this$syncOwnedCloudConfig_u24lambda_u240`

               var var61: Any
               try {
                  var61 = Result.constructor_impl/* $VF was: constructor-impl */(var58.parseConfig(var56))
               } catch (var38: java.lang.Throwable) {
                  var61 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var38))
               }

               val var69: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var61)
               if (var69 != null) {
                  if (existing == null) {
                     Files.deleteIfExists(var56)
                  }

                  throw var69
               }

               if (StringsKt.equals(activeConfigName, var68, true)) {
                  activeCloudOrigin = var46
               }

               `$this$syncOwnedCloudConfig_u24lambda_u240`.markVisibleConfigsDirty()
               var70 = var68
            }

            `$this$syncOwnedCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(var70)
         } catch (var39: java.lang.Throwable) {
            `$this$syncOwnedCloudConfig_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var39))
         }

         val var71: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$syncOwnedCloudConfig_u24lambda_u240`)
         if (var71 != null) {
            logger.error("Failed to synchronize cloud config '$preferredName'", var71)
         }

         return (if (isFailure) null else `$this$syncOwnedCloudConfig_u24lambda_u240`) as java.lang.String
      } else {
         return null
      }
   }

   private fun loadVisibleConfigs(): List<صٌ> {
      this.ensureConfigDirectory()
      val var10000: Array<File> = configPath.toFile().listFiles({ var0: File, name: java.lang.String ->
         StringsKt.endsWith$default(name, ".json", false, 2, null)
      })
      return if (var10000 == null)
         CollectionsKt.emptyList()
         else
         SequencesKt.toList(
            SequencesKt.map(SequencesKt.sortedWith(SequencesKt.filterNot(SequencesKt.map(SequencesKt.filterNot(ArraysKt.asSequence(var10000), { it: File ->
               val var10000: اك = INSTANCE
               val var10001: java.lang.String = it.getName()
               var10000.isInternalConfigFile(var10001)
            }), { file: File ->
               val var10000: java.lang.String = file.getName()
               StringsKt.removeSuffix(var10000, ".json") to file.toPath()
            }), { var0: Pair ->
               StringsKt.equals(var0.component1() as java.lang.String, "AutoLoad", true)
            }), اد<>()), { var0: Pair ->
               val name: java.lang.String = var0.component1() as java.lang.String
               val path: Path = var0.component2() as Path
               val var10003: اك = INSTANCE
               صٌ(name, var10003.readAuthor(path), INSTANCE.readCloudOrigin(path))
            })
         )
      }

   public fun exportCloudPayload(name: String): JsonObject? {
      if (this.isValidName(name) && !StringsKt.equals(name, "AutoLoad", true)) {
         val file: Path = configPath.resolve("$name.json")
         if (!Files.isRegularFile(file)) {
            return null
         } else {
            val var3: اك = this

            var `$this$exportCloudPayload_u24lambda_u240`: اك
            try {
               `$this$exportCloudPayload_u24lambda_u240` = var3
               val var10000: Gson = gson
               val var17: JsonObject = var10000.fromJson(`$this$exportCloudPayload_u24lambda_u240`.readConfigText(file), JsonObject.class)
               if (var17 == null) {
                  return null
               }

               val origin: دة = `$this$exportCloudPayload_u24lambda_u240`.readCloudOrigin(var17)
               if (origin != null && !origin.owned) {
                  throw IllegalArgumentException("Imported cloud configs cannot be shared".toString())
               }

               `$this$exportCloudPayload_u24lambda_u240`.parseConfigRoot(var17)
               var17.remove("CloudOrigin")
               `$this$exportCloudPayload_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(var17)
            } catch (var9: java.lang.Throwable) {
               `$this$exportCloudPayload_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var9))
            }

            val var18: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$exportCloudPayload_u24lambda_u240`)
            if (var18 != null) {
               logger.warn("Config '$name' cannot be exported to cloud", var18)
            }

            return (if (isFailure) null else `$this$exportCloudPayload_u24lambda_u240`) as JsonObject
         }
      } else {
         return null
      }
   }

   private fun requireObject(element: JsonElement?, name: String): JsonObject {
      if (element == null || !element.isJsonObject()) {
         throw IllegalArgumentException(("Expected object: $name").toString())
      } else {
         val var10000: JsonObject = element.getAsJsonObject()
         return var10000
      }
   }

   private fun normalizeSlider(setting: طُ, raw: Float): Float {
      var normalized: Float = RangesKt.coerceIn(raw, setting.min, setting.max)
      if (setting.step > 0.0F) {
         normalized = RangesKt.coerceIn(
            setting.min + (float)Math.rint((double)((normalized - setting.min) / setting.step)) * setting.step, setting.min, setting.max
         )
      }

      return normalized
   }

   private fun canonicalJson(element: JsonElement): String {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 00: nop
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 05: ifeq 0e
      // 08: ldc_w "null"
      // 0b: goto f9
      // 0e: aload 1
      // 0f: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 12: ifeq 57
      // 15: aload 1
      // 16: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 19: dup
      // 1a: ldc_w "getAsJsonArray(...)"
      // 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 20: astore 2
      // 21: new oxxxde/تإ
      // 24: dup
      // 25: aload 0
      // 26: invokespecial oxxxde/تإ.<init> (Ljava/lang/Object;)V
      // 29: checkcast kotlin/reflect/KFunction
      // 2c: astore 3
      // 2d: aload 2
      // 2e: nop
      // 2f: checkcast java/lang/Iterable
      // 32: ldc_w ","
      // 35: checkcast java/lang/CharSequence
      // 38: ldc_w "["
      // 3b: checkcast java/lang/CharSequence
      // 3e: ldc_w "]"
      // 41: checkcast java/lang/CharSequence
      // 44: bipush 0
      // 45: nop
      // 46: aconst_null
      // 47: nop
      // 48: aload 3
      // 49: nop
      // 4a: checkcast kotlin/jvm/functions/Function1
      // 4d: bipush 24
      // 4f: aconst_null
      // 50: nop
      // 51: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
      // 54: goto f9
      // 57: aload 1
      // 58: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 5b: ifeq ab
      // 5e: aload 1
      // 5f: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 62: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 65: dup
      // 66: ldc_w "entrySet(...)"
      // 69: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6c: checkcast java/lang/Iterable
      // 6f: astore 2
      // 70: nop
      // 71: bipush 0
      // 72: nop
      // 73: istore 3
      // 74: aload 2
      // 75: nop
      // 76: new oxxxde/سّ
      // 79: dup
      // 7a: invokespecial oxxxde/سّ.<init> ()V
      // 7d: checkcast java/util/Comparator
      // 80: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 83: checkcast java/lang/Iterable
      // 86: ldc_w ","
      // 89: checkcast java/lang/CharSequence
      // 8c: ldc_w "{"
      // 8f: checkcast java/lang/CharSequence
      // 92: ldc_w "}"
      // 95: checkcast java/lang/CharSequence
      // 98: bipush 0
      // 99: nop
      // 9a: aconst_null
      // 9b: nop
      // 9c: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/اك.canonicalJson$lambda$0 (Ljava/util/Map$Entry;)Ljava/lang/CharSequence;, (Ljava/util/Map$Entry;)Ljava/lang/CharSequence; ]
      // a1: bipush 24
      // a3: aconst_null
      // a4: nop
      // a5: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
      // a8: goto f9
      // ab: aload 1
      // ac: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // af: ifeq ee
      // b2: aload 1
      // b3: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // b6: invokevirtual com/google/gson/JsonPrimitive.isNumber ()Z
      // b9: ifeq ee
      // bc: new java/math/BigDecimal
      // bf: dup
      // c0: aload 1
      // c1: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // c4: invokevirtual com/google/gson/JsonPrimitive.getAsString ()Ljava/lang/String;
      // c7: invokespecial java/math/BigDecimal.<init> (Ljava/lang/String;)V
      // ca: invokevirtual java/math/BigDecimal.stripTrailingZeros ()Ljava/math/BigDecimal;
      // cd: astore 2
      // ce: aload 2
      // cf: nop
      // d0: getstatic java/math/BigDecimal.ZERO Ljava/math/BigDecimal;
      // d3: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // d6: ifne df
      // d9: ldc_w "0"
      // dc: goto f9
      // df: aload 2
      // e0: nop
      // e1: invokevirtual java/math/BigDecimal.toPlainString ()Ljava/lang/String;
      // e4: dup
      // e5: ldc_w "toPlainString(...)"
      // e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // eb: goto f9
      // ee: aload 1
      // ef: invokevirtual com/google/gson/JsonElement.toString ()Ljava/lang/String;
      // f2: dup
      // f3: ldc_w "toString(...)"
      // f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // f9: areturn
   }

   public fun cloudPayloadHash(name: String): String? {
      if (this.isValidName(name) && !StringsKt.equals(name, "AutoLoad", true)) {
         val file: Path = configPath.resolve("$name.json")
         if (!Files.isRegularFile(file)) {
            return null
         } else {
            val var3: اك = this

            var `$this$cloudPayloadHash_u24lambda_u240`: اك
            try {
               `$this$cloudPayloadHash_u24lambda_u240` = var3
               val var10000: Gson = gson
               val var14: JsonObject = var10000.fromJson(`$this$cloudPayloadHash_u24lambda_u240`.readConfigText(file), JsonObject.class)
               if (var14 == null) {
                  return null
               }

               `$this$cloudPayloadHash_u24lambda_u240`.parseConfigRoot(var14)
               var14.remove("CloudOrigin")
               `$this$cloudPayloadHash_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(
                  `$this$cloudPayloadHash_u24lambda_u240`.hashCloudPayload(var14)
               )
            } catch (var7: java.lang.Throwable) {
               `$this$cloudPayloadHash_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
            }

            val var15: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$cloudPayloadHash_u24lambda_u240`)
            if (var15 != null) {
               logger.warn("Config '$name' cannot be hashed for Cloud synchronization", var15)
            }

            return (if (isFailure) null else `$this$cloudPayloadHash_u24lambda_u240`) as java.lang.String
         }
      } else {
         return null
      }
   }

   private fun isInternalConfigFile(fileName: String): Boolean {
      return StringsKt.equals(fileName, "drags.json", true)
         || StringsKt.equals(fileName, "way.json", true)
         || StringsKt.equals(fileName, "cloud_identity.json", true)
      }

   public fun getAuthor(name: String): String {
      if (!this.isValidName(name)) {
         return "Unknown"
      } else {
         val file: Path = configPath.resolve("$name.json")
         if (!Files.exists(file)) {
            return "Unknown"
         } else {
            return this.readAuthor(file)
         }
      }
   }

   private fun settingConfigKey(index: Int): String {
      return "setting_$index"
   }

   @JvmStatic
   fun {
      val var10000: java.util.Set = SetsKt.setOf("CON", "PRN", "AUX", "NUL")
      val var11: java.lang.Iterable = IntRange(1, 9)
      val `destination$iv$iv`: java.util.Collection = ArrayList()
      val var5: java.util.Iterator = var11.iterator()

      while (var5.hasNext()) {
         val `list$iv$iv`: Int = (var5 as IntIterator).nextInt()
         CollectionsKt.addAll(`destination$iv$iv`, CollectionsKt.listOf("COM$`list$iv$iv`", "LPT$`list$iv$iv`"))
      }

      reservedWindowsNames = SetsKt.plus(var10000, `destination$iv$iv`)
      logger = LoggerFactory.getLogger("Rain Config")
      gson = GsonBuilder().setPrettyPrinting().create()
      val var16: Path = Paths.get(System.getProperty("user.dir"), "Rain", "other")
      legacyConfigPath = var16
      val var18: Path = Paths.get(System.getProperty("user.dir"), "Rain", "configs")
      configPath = var18
      val var19: Path = legacyConfigPath.resolve("selected_config.txt")
      selectedConfigPath = var19
      visibleConfigsCache = CollectionsKt.emptyList()
      visibleConfigNamesCache = CollectionsKt.emptyList()
      visibleConfigsDirty = true
      INSTANCE.ensureConfigDirectory()
      INSTANCE.restoreMisplacedInternalFiles()
      INSTANCE.migrateLegacyConfigs()
      selectedConfigName = INSTANCE.readSelectedConfigName()
   }

   public fun verifyCloudPayloadHash(payload: JsonObject, expectedHash: String): Boolean {
      if (!(Regex("^[0-9a-f]{64}$") matches expectedHash as java.lang.CharSequence)) {
         return false
      } else {
         val var4: اك = this

         var `$this$verifyCloudPayloadHash_u24lambda_u240`: Any
         try {
            `$this$verifyCloudPayloadHash_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(var4.hashCloudPayload(payload))
         } catch (var7: java.lang.Throwable) {
            `$this$verifyCloudPayloadHash_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
         }

         val var10000: java.lang.String = (if (isFailure) null else `$this$verifyCloudPayloadHash_u24lambda_u240`) as java.lang.String
         if (var10000 == null) {
            return false
         } else {
            val var11: ByteArray = var10000.getBytes(Charsets.US_ASCII)
            val var10001: ByteArray = expectedHash.getBytes(Charsets.US_ASCII)
            return MessageDigest.isEqual(var11, var10001)
         }
      }
   }

   private fun readAuthor(file: Path): String {
      val var2: اك = this

      var `$this$readAuthor_u24lambda_u240`: اك
      try {
         `$this$readAuthor_u24lambda_u240` = var2
         val var10000: JsonObject = gson.fromJson(var2.readConfigText(file), JsonObject.class)
         if (var10000 == null) {
            return "Unknown"
         }

         `$this$readAuthor_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(`$this$readAuthor_u24lambda_u240`.readAuthor(var10000))
      } catch (var6: java.lang.Throwable) {
         `$this$readAuthor_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var6))
      }

      return (if (isFailure) "Unknown" else `$this$readAuthor_u24lambda_u240`) as java.lang.String
   }

   public fun isConfigActive(name: String): Boolean {
      return activeConfigName != null && StringsKt.equals(activeConfigName, name, true)
   }

   private fun serializeSettingValue(setting: رف<*>): JsonElement {
      val var10000: JsonElement
      if (setting is خذ) {
         var10000 = JsonPrimitive((setting as خذ).getValue())
      } else if (setting is طُ) {
         var10000 = JsonPrimitive((setting as طُ).getValue())
      } else if (setting is ظي) {
         var10000 = JsonPrimitive((setting as ظي).getValue())
      } else if (setting is عت) {
         var10000 = JsonPrimitive((setting as عت).getValue())
      } else if (setting is ذُ) {
         var10000 = JsonPrimitive((setting as ذُ).getValue())
      } else {
         if (setting !is رت) {
            throw IllegalStateException(("Unsupported setting type: ${setting.getClass().getName()}").toString())
         }

         var10000 = JsonPrimitive((setting as رت).getValue().getRGB())
      }

      return var10000
   }

   public fun create(name: String): دص {
      val normalized: java.lang.String = StringsKt.trim(name).toString()
      if (this.isValidName(normalized) && !StringsKt.equals(normalized, "AutoLoad", true)) {
         val `$this$any$iv`: java.lang.Iterable = this.getConfigNames()
         var var10000: Boolean
         if (`$this$any$iv` is java.util.Collection && (`$this$any$iv` as java.util.Collection).isEmpty()) {
            var10000 = false
         } else {
            val var5: java.util.Iterator = `$this$any$iv`.iterator()

            while (true) {
               if (!var5.hasNext()) {
                  var10000 = false
                  break
               }

               if (StringsKt.equals(var5.next() as java.lang.String, normalized, true)) {
                  var10000 = true
                  break
               }
            }
         }

         if (var10000) {
            return دص.ALREADY_EXISTS
         } else if (!this.save(normalized)) {
            return دص.SAVE_FAILED
         } else {
            activeConfigName = normalized
            activeCloudOrigin = null
            this.setSelectedConfigName(normalized)
            this.refreshVisibleConfigsNow()
            return دص.CREATED
         }
      } else {
         return دص.INVALID_NAME
      }
   }

   private fun findSettingElement(settings: List<رف<*>>, setting: رف<*>, index: Int, json: JsonObject, formatVersion: Int, module: دِ?): JsonElement? {
      if (formatVersion >= 2) {
         var var15: JsonElement = json.get(setting.configKey)
         if (var15 != null) {
            return var15
         } else {
            val var16: java.lang.Iterable = settings
            val var37: Int
            if (settings is java.util.Collection && (settings as java.util.Collection).isEmpty()) {
               var37 = 0
            } else {
               val var22: Int = 0

               for (var34 in var16) {
                  if ((var34 as رف).name == setting.name) {
                     if (++var22 < 0) {
                        CollectionsKt.throwCountOverflow()
                     }
                  }
               }

               var37 = var22
            }

            if (var37 == 1) {
               var15 = json.get(setting.name)
               if (var15 != null) {
                  return var15
               }
            }

            return null
         }
      } else {
         var `$this$count$iv`: java.lang.Iterable = json.get(this.settingConfigKey(this.legacySettingIndex(module, index, json)))
         if (`$this$count$iv` != null) {
            return `$this$count$iv`
         } else {
            `$this$count$iv` = json.get(setting.configKey)
            if (`$this$count$iv` != null) {
               return `$this$count$iv`
            } else {
               val var19: java.lang.Iterable = settings
               val var10000: Int
               if (settings is java.util.Collection && (settings as java.util.Collection).isEmpty()) {
                  var10000 = 0
               } else {
                  val it: Int = 0

                  for (`element$iv` in var19) {
                     if ((`element$iv` as رف).name == setting.name) {
                        if (++it < 0) {
                           CollectionsKt.throwCountOverflow()
                        }
                     }
                  }

                  var10000 = it
               }

               if (var10000 == 1) {
                  `$this$count$iv` = json.get(setting.name)
                  if (`$this$count$iv` != null) {
                     return `$this$count$iv`
                  }
               }

               return null
            }
         }
      }
   }

   private fun ensureConfigDirectory() {
      Files.createDirectories(configPath)
   }

   private fun parseBoolean(element: JsonElement): Boolean {
      val primitive: JsonPrimitive = this.requirePrimitive(element)
      if (!primitive.isBoolean()) {
         throw IllegalArgumentException("Expected boolean value".toString())
      } else {
         return primitive.getAsBoolean()
      }
   }

   public fun getVisibleConfigs(): List<صٌ> {
      this.ensureVisibleConfigsCache()
      return visibleConfigsCache
   }

   private fun serializeSettings(settings: List<رف<*>>): JsonObject {
      val json: JsonObject = JsonObject()

      for (`element$iv` in settings) {
         val setting: رف = `element$iv` as رف
         if (json.has((`element$iv` as رف).configKey)) {
            throw IllegalArgumentException(("Duplicate setting config key: ${setting.configKey}").toString())
         }

         json.add(setting.configKey, INSTANCE.serializeSettingValue(setting))
      }

      return json
   }

   public fun setSelectedConfigName(name: String?) {
      var var10000: java.lang.String
      run label56@{
         if (name != null) {
            val var3: java.lang.String = StringsKt.trim(name).toString()
            if (var3 != null) {
               val var4: java.lang.String = if (var3.length() > 0) var3 else null
               if (var4 != null) {
                  val var10: java.lang.String = if (this.isValidName(var4)) var4 else null
                  if (var10 != null) {
                     var10000 = if (!StringsKt.equals(var10, "AutoLoad", true)) var10 else null
                     return@label56
                  }
               }
            }
         }

         var10000 = null
      }

      if (!(selectedConfigName == var10000)) {
         selectedConfigName = var10000
         this.persistSelectedConfigName()
         val var9: Int = stateVersion++
      }
   }

   public fun findOwnedCloudOriginByName(name: String): دة? {
      val normalized: java.lang.String = StringsKt.trim(name).toString()
      if (!this.isValidName(normalized)) {
         return null
      } else {
         this.ensureVisibleConfigsCache()
         val var3: java.util.Iterator = visibleConfigsCache.iterator()

         var var13: دة
         while (true) {
            if (!var3.hasNext()) {
               var13 = null
               break
            }

            val config: صٌ = var3.next() as صٌ
            val var6: دة = config.getCloudOrigin()
            if (var6 != null) {
               run label52@{
                  if (var6.owned) {
                     var var10000: java.lang.String = var6.cloudName
                     if (var10000 == null) {
                        var10000 = config.name
                     }

                     if (StringsKt.equals(var10000, normalized, true)) {
                        var11 = true
                        return@label52
                     }
                  }

                  var11 = false
               }

               var13 = if (var11) var6 else null
            } else {
               var13 = null
            }

            if (var13 != null) {
               var13 = var13
               break
            }
         }

         return var13
      }
   }

   private fun validateConfigKeys() {
      this.validateSettingKeys("ClickGuiSettings", سر.INSTANCE.settings)
      val moduleKeys: HashSet = HashSet()

      for (`element$iv` in خً.INSTANCE.modules) {
         val module: دِ = `element$iv` as دِ
         val moduleKey: java.lang.String = INSTANCE.moduleConfigKey(`element$iv` as دِ)
         if (!moduleKeys.add(moduleKey)) {
            throw IllegalArgumentException(("Duplicate module config key: $moduleKey").toString())
         }

         INSTANCE.validateSettingKeys(moduleKey, module.settings)
      }
   }

   private fun writeAtomically(target: Path, content: String) {
      Files.createDirectories(target.getParent())
      val temporary: Path = Files.createTempFile(target.getParent(), "${target.getFileName()}.", ".tmp")

      try {
         Files.writeString(temporary, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)

         try {
            val var13: Path = Files.move(temporary, target, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
         } catch (var9: AtomicMoveNotSupportedException) {
            val var11: Path = Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING)
         }
      } finally {
         Files.deleteIfExists(temporary)
      }
   }

   private fun readSelectedConfigName(): String? {
      if (!Files.exists(selectedConfigPath)) {
         return null
      } else {
         val var1: اك = this

         var `$this$readSelectedConfigName_u24lambda_u240`: اك
         try {
            var var18: java.lang.String
            run label66@{
               `$this$readSelectedConfigName_u24lambda_u240` = var1
               var18 = Files.readString(selectedConfigPath)
               var var4: java.lang.String = StringsKt.trim(var18).toString()
               val var7: java.lang.String = if (var4.length() > 0) var4 else null
               if (var7 != null) {
                  var4 = if (`$this$readSelectedConfigName_u24lambda_u240`.isValidName(var7)) var7 else null
                  if (var4 != null) {
                     var18 = if (!StringsKt.equals(var4, "AutoLoad", true)) var4 else null
                     return@label66
                  }
               }

               var18 = null
            }

            `$this$readSelectedConfigName_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(var18)
         } catch (var9: java.lang.Throwable) {
            `$this$readSelectedConfigName_u24lambda_u240` = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var9))
         }

         return (if (isFailure) null else `$this$readSelectedConfigName_u24lambda_u240`) as java.lang.String
      }
   }

   private fun restoreMisplacedInternalFiles() {
      for (`element$iv` in CollectionsKt.listOf("drags.json", "way.json", "cloud_identity.json")) {
         this.restoreMisplacedInternalFile(`element$iv` as java.lang.String)
      }
   }

   private fun settingValue(setting: رف<*>): Any {
      val var10000: Serializable
      if (setting is خذ) {
         var10000 = (setting as خذ).getValue()
      } else if (setting is طُ) {
         var10000 = (setting as طُ).getValue()
      } else if (setting is ظي) {
         var10000 = (setting as ظي).getValue()
      } else if (setting is عت) {
         var10000 = (setting as عت).getValue()
      } else if (setting is ذُ) {
         var10000 = (setting as ذُ).getValue()
      } else {
         if (setting !is رت) {
            throw IllegalStateException(("Unsupported setting type: ${setting.getClass().getName()}").toString())
         }

         var10000 = (setting as رت).getValue()
      }

      return var10000
   }

   private fun parseMode(setting: ظي, element: JsonElement, formatVersion: Int): String {
      if (this.requirePrimitive(element).isNumber()) {
         val var12: Int = this.parseInt(element)
         if (formatVersion >= 2 && (0 > var12 || var12 >= setting.modes.size())) {
            throw IllegalArgumentException(("Mode index is out of range for ${setting.getConfigKey()}").toString())
         } else {
            return setting.modes.get(RangesKt.coerceIn(var12, CollectionsKt.getIndices(setting.modes)))
         }
      } else {
         val mode: java.lang.String = this.parseString(element)
         val var8: java.util.Iterator = setting.modes.iterator()

         var var10000: Any
         while (true) {
            if (var8.hasNext()) {
               val `element$iv`: Any = var8.next()
               if (!StringsKt.equals(`element$iv` as java.lang.String, mode, true)) {
                  continue
               }

               var10000 = (java.lang.String)`element$iv`
               break
            }

            var10000 = null
            break
         }

         var10000 = var10000
         if (var10000 == null) {
            throw IllegalStateException(("Unknown mode '$mode' for ${setting.getConfigKey()}").toString())
         } else {
            return var10000
         }
      }
   }

   public fun canCreateFromCurrent(): Boolean {
      return true
   }

   private fun applyConfig(config: خٌ) {
      try {
         for (`element$iv` in config.clickGuiSettings) {
            this.applySettingUpdate(`element$iv` as إ)
         }

         for (var23 in config.modules) {
            val var25: دء = var23 as دء
            val var10000: Int = (var23 as دء).key
            if (var10000 != null) {
               var25.getModule().setKey(var10000.intValue())
            }

            val `$this$forEach$iv`: java.lang.Iterable = var25.settings
            val var29: اك = INSTANCE

            for (var35 in `$this$forEach$iv`) {
               var29.applySettingUpdate(var35 as إ)
            }
         }

         for (var24 in config.modules) {
            val var26: دء = var24 as دء
            val var37: java.lang.Boolean = (var24 as دء).enabled
            if (var37 != null) {
               var26.getModule().setEnabled(var37)
            }
         }
      } catch (var16: java.lang.Throwable) {
         this.restoreRuntimeSnapshot(this.captureRuntimeSnapshot())
         throw var16
      }
   }

   @Compile
   public fun save(name: String): Boolean {
      if (!this.isValidName(name)) {
         return false
      } else {
         var var10000: Any
         try {
            this.ensureConfigDirectory()
            this.validateConfigKeys()
            val var2: Path = configPath.resolve("$name.json")
            val var3: دة
            if (StringsKt__StringsJVMKt.equals(name, "AutoLoad", true)) {
               var3 = null
            } else {
               var3 = this.readCloudOrigin(var2)
            }

            var10000 = gson.toJson(this.serializeConfig(this.currentAuthor(), var3))
            this.writeAtomically(var2, (java.lang.String)var10000)
            var10000 = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var5: java.lang.Throwable) {
            var10000 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var5))
         }

         val var7: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var10000)
         if (var7 != null) {
            logger.error("Failed to save config '$name'", var7)
         }

         val var8: Boolean = isSuccess
         if (var8 && !StringsKt__StringsJVMKt.equals(name, "AutoLoad", true)) {
            INSTANCE.markVisibleConfigsDirty()
         }

         return var8
      }
   }

   public fun rename(oldName: String, newName: String): ب {
      val sanitizedOldName: java.lang.String = StringsKt.trim(oldName).toString()
      val sanitizedNewName: java.lang.String = StringsKt.trim(newName).toString()
      if (!this.isValidName(sanitizedOldName) || !this.isValidName(sanitizedNewName)) {
         return ب.INVALID_NAME
      } else if (!StringsKt.equals(sanitizedOldName, "AutoLoad", true) && !StringsKt.equals(sanitizedNewName, "AutoLoad", true)) {
         this.ensureConfigDirectory()
         val configNames: java.util.List = this.getConfigNames()
         var result: java.util.Iterator = configNames.iterator()

         var var10000: Any
         while (true) {
            if (result.hasNext()) {
               val `element$iv`: Any = result.next()
               if (!StringsKt.equals(`element$iv` as java.lang.String, sanitizedOldName, true)) {
                  continue
               }

               var10000 = (java.lang.String)`element$iv`
               break
            }

            var10000 = null
            break
         }

         var10000 = var10000
         if (var10000 == null) {
            return ب.NOT_FOUND
         } else {
            val actualOldName: java.lang.String = var10000
            if (var10000 == sanitizedNewName) {
               return ب.UNCHANGED
            } else {
               result = configNames.iterator()

               while (true) {
                  if (!result.hasNext()) {
                     var10000 = null
                     break
                  }

                  val var24: Any = result.next()
                  if (StringsKt.equals(var24 as java.lang.String, sanitizedNewName, true) && !(var24 as java.lang.String == actualOldName)) {
                     var10000 = (java.lang.String)var24
                     break
                  }
               }

               if (var10000 != null) {
                  return ب.ALREADY_EXISTS
               } else {
                  val var19: Path = configPath.resolve("$actualOldName.json")
                  val var21: Path = configPath.resolve("$sanitizedNewName.json")
                  val var25: اك = this

                  var var27: اك
                  try {
                     var27 = var25
                     var27.moveConfigFile(var19, var21, StringsKt.equals(actualOldName, sanitizedNewName, true))
                     val var35: JsonObject = gson.fromJson(var27.readConfigText(var21), JsonObject.class)
                     if (var35 == null) {
                        throw IllegalStateException("Config root is missing".toString())
                     }

                     val var36: دة = var27.readCloudOrigin(var35)
                     val var37: Unit
                     if (var36 != null) {
                        var35.add(
                           "CloudOrigin",
                           var27.serializeCloudOrigin(دة.copy$default(var36, null, null, null, 0L, false, 0, sanitizedNewName, false, false, 447, null))
                        )
                        val var10002: java.lang.String = gson.toJson(var35)
                        var27.writeAtomically(var21, var10002)
                        var37 = Unit.INSTANCE
                     } else {
                        var37 = null
                     }

                     var27 = (اك)Result.constructor_impl/* $VF was: constructor-impl */(var37)
                  } catch (var17: java.lang.Throwable) {
                     var27 = (اك)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var17))
                  }

                  val var38: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var27)
                  if (var38 != null) {
                     logger.error("Failed to rename config '$actualOldName' to '$sanitizedNewName'", var38)
                  }

                  if (isFailure) {
                     return ب.SAVE_FAILED
                  } else {
                     if (StringsKt.equals(selectedConfigName, actualOldName, true)) {
                        this.setSelectedConfigName(sanitizedNewName)
                     }

                     if (StringsKt.equals(activeConfigName, actualOldName, true)) {
                        activeConfigName = sanitizedNewName
                     }

                     this.markVisibleConfigsDirty()
                     return ب.RENAMED
                  }
               }
            }
         }
      } else {
         return ب.INVALID_NAME
      }
   }

   public fun getCloudDisplayName(name: String): String {
      val var2: دة = this.getCloudOrigin(name)
      if (var2 != null) {
         val var3: java.lang.String = var2.cloudName
         if (var3 != null) {
            val var4: java.lang.String = if (!StringsKt.isBlank(var3)) var3 else null
            if (var4 != null) {
               return var4
            }
         }
      }

      return name
   }

   private fun serializeConfig(author: String, cloudOrigin: دة? = null): JsonObject {
      val content: JsonObject = JsonObject()

      for (`element$iv` in خً.INSTANCE.modules) {
         content.add(INSTANCE.moduleConfigKey(`element$iv` as دِ), INSTANCE.serializeModule(`element$iv` as دِ))
      }

      content.add("ClickGuiSettings", this.serializeSettings(سر.INSTANCE.settings))
      val var10: JsonObject = JsonObject()
      var10.addProperty("FormatVersion", 2)
      var10.addProperty("Author", author)
      var10.add("Content", content)
      if (cloudOrigin != null) {
         var10.add("CloudOrigin", INSTANCE.serializeCloudOrigin(cloudOrigin))
      }

      return var10
   }

   private fun parseConfig(file: Path): خٌ {
      val var10000: JsonObject = gson.fromJson(this.readConfigText(file), JsonObject.class)
      if (var10000 == null) {
         throw IllegalStateException("Config root is missing".toString())
      } else {
         return this.parseConfigRoot(var10000)
      }
   }
}
