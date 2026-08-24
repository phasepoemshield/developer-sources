package oxxxde

import java.util.ArrayList
import java.util.Locale
import kotakbaz.rain.client.figura.FiguraAvatarInstaller$AvatarEntry

// $VF: Compiled from heavy
internal class بز {
   private final var avatars: List<طن>?
   private final var installRunning: Boolean
   private final var catalogRevision: Int
   private final var dirty: Boolean
   private final var normalizedSearch: String
   private final var cards: List<طن> = CollectionsKt.emptyList()

   public fun cards(search: String): List<طن> {
      this.refreshAvatarsIfNeeded()
      if (!(this.normalizedSearch == search)) {
         this.normalizedSearch = search
         this.dirty = true
      }

      if (this.dirty) {
         this.rebuildCards()
      }

      return this.cards
   }

   private fun rebuildCards() {
      var var10001: java.util.List = this.avatars
      if (this.avatars == null) {
         var10001 = CollectionsKt.emptyList()
      }

      val `$this$filter$iv`: java.lang.Iterable = var10001
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv` in `$this$filter$iv`) {
         if (this.matchesSearch(`element$iv$iv` as FiguraAvatarInstaller$AvatarEntry)) {
            `destination$iv$iv`.add(`element$iv$iv`)
         }
      }

      this.cards = `destination$iv$iv` as MutableList<FiguraAvatarInstaller$AvatarEntry>
      this.dirty = false
   }

   private fun refreshAvatarsIfNeeded() {
      val running: Boolean = دس.isRunning()
      val revision: Int = دس.getCatalogRevision()
      if (this.avatars == null || this.installRunning != running || this.catalogRevision != revision) {
         val var10001: java.util.List = دس.getBundledAvatars()
         this.avatars = CollectionsKt.sortedWith(var10001, ثد<>())
         this.installRunning = running
         this.catalogRevision = revision
         this.dirty = true
      }
   }

   init {
      this.normalizedSearch = ""
      this.catalogRevision = -1
      this.dirty = true
   }

   private fun matchesSearch(avatar: طن): Boolean {
      if (StringsKt.isBlank(this.normalizedSearch)) {
         return true
      } else {
         var var10000: java.lang.String = avatar.id()
         var10000 = var10000.toLowerCase(Locale.ROOT)
         if (!StringsKt.contains$default(var10000, this.normalizedSearch, false, 2, null)) {
            var10000 = avatar.name()
            var10000 = var10000.toLowerCase(Locale.ROOT)
            if (!StringsKt.contains$default(var10000, this.normalizedSearch, false, 2, null)) {
               var10000 = avatar.description()
               var10000 = var10000.toLowerCase(Locale.ROOT)
               if (!StringsKt.contains$default(var10000, this.normalizedSearch, false, 2, null)) {
                  return false
               }
            }
         }

         return true
      }
   }
}
