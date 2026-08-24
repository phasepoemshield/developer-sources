package kotakbaz.rain.friend

import com.mojang.serialization.Codec
import com.mojang.serialization.DynamicOps
import java.io.Closeable
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.DirectoryStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.ArrayList
import java.util.HashSet
import java.util.Locale
import java.util.UUID
import kotakbaz.rain.ui.inventory.InventoryPreset
import kotakbaz.rain.ui.inventory.InventorySnapshot
import kotlin.jvm.internal.Ref
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.class_1799
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.nbt.NbtElement
import net.minecraft.nbt.NbtIo
import net.minecraft.nbt.NbtOps
import net.minecraft.nbt.NbtSizeTracker
import net.minecraft.registry.RegistryOps
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import oxxxde.بب
import oxxxde.ّ

// $VF: Compiled from heavy
public object FriendManager {
   private const val EXTENSION: String = ".nbt"
   private const val MAX_NBT_SIZE: Long = 16777216L
   private const val ITEM_COUNT: Int = 41
   private const val VERSION: Int = 1
   private final val itemsCodec: Codec<MutableList<class_1799>> = ItemStack.OPTIONAL_CODEC.listOf()
   private final val directory: Path = FabricLoader.getInstance().getGameDir().resolve("rain").resolve("inventories").normalize()

   fun read(file: Path, registries: WrapperLookup): InventoryPreset {
      val id: UUID = UUID.fromString(StringsKt.removeSuffix(file.getFileName().toString(), ".nbt"))
      val var10000: NbtCompound = NbtIo.readCompressed(file, NbtSizeTracker.of(16777216L))
      if (var10000.getInt("version", 0) != 1) {
         throw IllegalArgumentException("Unsupported inventory version".toString())
      } else {
         val var17: java.lang.String = var10000.getString("name", "")
         val name: java.lang.String = StringsKt.trim(var17).toString()
         if (name.length() <= 0) {
            throw IllegalArgumentException("Inventory name is empty".toString())
         } else {
            val var18: RegistryOps = registries.getOps(NbtOps.INSTANCE as DynamicOps)
            val var19: NbtElement = var10000.get("items")
            if (var19 == null) {
               throw IllegalArgumentException("Inventory items are missing".toString())
            } else {
               val items: java.util.List = itemsCodec.parse(var18 as DynamicOps, var19).getOrThrow(kotakbaz/rain/friend/FriendManager##Lambda_0_215()) as java.util.List
               if (items.size() != 41) {
                  throw IllegalArgumentException(("Expected 41 items, got ${items.size()}").toString())
               } else {
                  InventoryPreset(id, name, this.snapshot(items), var10000.getLong("createdAt", Files.getLastModifiedTime(file).toMillis()))
               }
            }
         }
      }
   }

   @JvmStatic
   fun `snapshot$take`(count: MutableList<ItemStack>, `$items`: Ref.IntRef, index: Int): MutableList<ItemStack> {
      val var3: ArrayList = ArrayList(count)

      repeat(count) { var4 ->
         var3.add((`$items`.get(index.element++) as ItemStack).copy())
      }

      var3 as java.util.List
   }

   private fun report(action: String, file: Path, error: Throwable) {
      System.err.println("[Rain] Failed to $action inventory '${file.getFileName()}': ${error.getMessage()}")
   }

   public fun delete(id: UUID): Boolean {
      val file: Path = this.file(id)
      val var3: FriendManager = this

      var `$this$delete_u24lambda_u240`: FriendManager
      try {
         `$this$delete_u24lambda_u240` = var3
         `$this$delete_u24lambda_u240` = (FriendManager)Result.constructor_impl/* $VF was: constructor-impl */(Files.deleteIfExists(file))
      } catch (var7: java.lang.Throwable) {
         `$this$delete_u24lambda_u240` = (FriendManager)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
      }

      val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$delete_u24lambda_u240`)
      if (var10000 != null) {
         INSTANCE.report("delete", file, var10000)
      }

      return isSuccess
   }

   fun encode(preset: InventoryPreset, registries: WrapperLookup): NbtCompound {
      val root: NbtCompound = NbtCompound()
      val var10000: RegistryOps = registries.getOps(NbtOps.INSTANCE as DynamicOps)
      val `$this$encode_u24lambda_u240`: InventorySnapshot = preset.snapshot
      val items: java.util.List = CollectionsKt.plus(
         CollectionsKt.plus(
            CollectionsKt.plus(`$this$encode_u24lambda_u240`.armor, `$this$encode_u24lambda_u240`.getOffhand()), `$this$encode_u24lambda_u240`.inventory
         ),
         `$this$encode_u24lambda_u240`.hotbar
      )
      root.putInt("version", 1)
      root.putString("name", preset.name)
      root.putLong("createdAt", preset.createdAt)
      root.put("items", itemsCodec.encodeStart(var10000 as DynamicOps, items).getOrThrow(kotakbaz/rain/friend/FriendManager##Lambda_0_215()) as NbtElement)
      root
   }

   fun loadAll(registries: WrapperLookup): MutableList<InventoryPreset> {
      val var2: FriendManager = this

      var `$this$loadAll_u24lambda_u240`: Any
      try {
         `$this$loadAll_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(var2.readAll(registries))
      } catch (var6: java.lang.Throwable) {
         `$this$loadAll_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var6))
      }

      val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$loadAll_u24lambda_u240`)
      if (var10000 != null) {
         val var13: FriendManager = INSTANCE
         val var10002: Path = directory
         var13.report("open", var10002, var10000)
      }

      (if (isFailure) CollectionsKt.emptyList() else `$this$loadAll_u24lambda_u240`) as java.util.List
   }

   private fun file(id: UUID): Path {
      val var10000: Path = directory.resolve("$id.nbt")
      return var10000
   }

   fun save(registries: java.lang.String, name: InventorySnapshot, snapshot: WrapperLookup): InventoryPreset? {
      val var10002: UUID = UUID.randomUUID()
      val preset: InventoryPreset = InventoryPreset(var10002, name, snapshot.deepCopy(), System.currentTimeMillis())
      val file: Path = this.file(preset.id)
      val var6: FriendManager = this

      var `$this$save_u24lambda_u240`: FriendManager
      try {
         `$this$save_u24lambda_u240` = var6
         Files.createDirectories(directory)
         `$this$save_u24lambda_u240`.writeAtomically(`$this$save_u24lambda_u240`.encode(preset, registries), file)
         `$this$save_u24lambda_u240` = (FriendManager)Result.constructor_impl/* $VF was: constructor-impl */(preset)
      } catch (var10: java.lang.Throwable) {
         `$this$save_u24lambda_u240` = (FriendManager)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var10))
      }

      val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$save_u24lambda_u240`)
      if (var10000 != null) {
         INSTANCE.report("save", file, var10000)
      }

      (if (isFailure) null else `$this$save_u24lambda_u240`) as InventoryPreset
   }

   fun writeAtomically(tag: NbtCompound, target: Path) {
      val temporary: Path = target.resolveSibling("${target.getFileName()}.tmp")

      try {
         NbtIo.writeCompressed(tag, temporary)

         try {
            val var12: Path = Files.move(temporary, target, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
         } catch (var9: AtomicMoveNotSupportedException) {
            val var4: Path = Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING)
         }
      } finally {
         Files.deleteIfExists(temporary)
      }
   }

   private fun snapshot(items: List<class_1799>): ّ {
      val index: Ref.IntRef = Ref.IntRef()
      val armor: java.util.List = snapshot$take(items, index, 4)
      val var10000: ItemStack = (items.get(index.element++) as ItemStack).copy()
      return InventorySnapshot(armor, var10000, snapshot$take(items, index, 27), snapshot$take(items, index, 9))
   }

   fun readAll(registries: WrapperLookup): MutableList<InventoryPreset> {
      val presets: java.util.List = ArrayList()
      Files.createDirectories(directory)
      val `$this$distinctBy$iv`: Closeable = Files.newDirectoryStream(directory, "*.nbt")
      var `$i$f$distinctBy`: java.lang.Throwable = null

      try {
         val `set$iv`: DirectoryStream = `$this$distinctBy$iv` as DirectoryStream

         for (var10 in `set$iv`) {
            val file: Path = var10 as Path
            val var13: FriendManager = INSTANCE

            var p0: Any
            try {
               p0 = Result.constructor_impl/* $VF was: constructor-impl */(var13.read(file, registries))
            } catch (var20: java.lang.Throwable) {
               p0 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var20))
            }

            if (isSuccess) {
               presets.add(p0 as InventoryPreset)
            }

            val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(p0)
            if (var10000 != null) {
               val var42: FriendManager = INSTANCE
               var42.report("load", file, var10000)
            }
         }
      } catch (var21: java.lang.Throwable) {
         `$i$f$distinctBy` = var21
         throw var21
      } finally {
         CloseableKt.closeFinally(`$this$distinctBy$iv`, `$i$f$distinctBy`)
      }

      val var24: java.lang.Iterable = CollectionsKt.sortedWith(presets, بب())
      val var28: HashSet = HashSet()
      val var29: ArrayList = ArrayList()

      for (var31 in var24) {
         val var43: java.lang.String = (var31 as InventoryPreset).name.toLowerCase(Locale.ROOT)
         if (var28.add(var43)) {
            var29.add(var31)
         }
      }

      var29 as java.util.List
   }
}
