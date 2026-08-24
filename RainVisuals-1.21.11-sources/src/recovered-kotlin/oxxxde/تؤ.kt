package oxxxde

import java.util.ArrayList
import kotakbaz.rain.friend.FriendManager
import kotakbaz.rain.ui.inventory.InventoryCard
import kotakbaz.rain.ui.inventory.InventoryPreset
import kotakbaz.rain.ui.inventory.InventorySnapshot
import net.minecraft.registry.RegistryWrapper.WrapperLookup

// $VF: Compiled from heavy
internal object تؤ {
   public final val cards: MutableList<ثغ> = ArrayList() as java.util.List

   public final var selectedName: String?
      private set

   public fun clearSelection() {
      selectedName = null
   }

   fun add(snapshot: java.lang.String, name: InventorySnapshot, registries: WrapperLookup): Boolean {
      val preset: java.lang.Iterable = cards
      var var10000: Boolean
      if (cards is java.util.Collection && cards.isEmpty()) {
         var10000 = false
      } else {
         val var6: java.util.Iterator = preset.iterator()

         while (true) {
            if (!var6.hasNext()) {
               var10000 = false
               break
            }

            if (StringsKt.equals((var6.next() as InventoryCard).name, name, true)) {
               var10000 = true
               break
            }
         }
      }

      if (var10000) {
         false
      } else {
         val var11: InventoryPreset = FriendManager.INSTANCE.save(name, snapshot, registries)
         if (var11 == null) {
            false
         } else {
            cards.add(InventoryCard(var11))
            true
         }
      }
   }

   fun reload(registries: WrapperLookup) {
      cards.clear()
      val selected: java.util.Collection = cards
      val `$this$firstOrNull$iv`: java.lang.Iterable = FriendManager.INSTANCE.loadAll(registries)
      val `element$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$firstOrNull$iv`, 10))

      for (`item$iv$iv` in `$this$firstOrNull$iv`) {
         `element$iv`.add(InventoryCard(`item$iv$iv` as InventoryPreset))
      }

      CollectionsKt.addAll(selected, `element$iv` as java.util.List)
      val var17: java.util.Iterator = cards.iterator()

      var var10000: Any
      while (true) {
         if (var17.hasNext()) {
            val var18: Any = var17.next()
            if (!((var18 as InventoryCard).name == selectedName)) {
               continue
            }

            var10000 = var18
            break
         }

         var10000 = null
         break
      }

      val var13: InventoryCard = var10000 as InventoryCard
      if (var10000 as InventoryCard == null) {
         ظظ.INSTANCE.unload()
      } else {
         ظظ.INSTANCE.load(var13.snapshot)
      }
   }

   public fun delete(index: Int): Boolean {
      val card: InventoryCard = cards.get(index)
      if (!FriendManager.INSTANCE.delete(card.id)) {
         return false
      } else {
         if (selectedName == card.name) {
            ظظ.INSTANCE.unload()
         }

         cards.remove(index)
         return true
      }
   }

   public fun toggle(card: ثغ) {
      if (selectedName == card.name) {
         ظظ.INSTANCE.unload()
      } else {
         selectedName = card.name
         ظظ.INSTANCE.load(card.snapshot)
      }
   }
}
