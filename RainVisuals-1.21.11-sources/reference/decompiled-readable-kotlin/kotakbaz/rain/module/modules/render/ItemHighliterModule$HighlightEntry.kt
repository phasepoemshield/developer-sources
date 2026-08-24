package kotakbaz.rain.module.modules.render

import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import net.minecraft.item.Item
import oxxxde.خذ
import oxxxde.رت

// $VF: Compiled from heavy
private data class `ItemHighliterModule$HighlightEntry` {
   private BooleanSetting toggle;
   private Item item;
   private ColorSetting color;

   public override fun toString(): String {
      return "HighlightEntry(item=${this.item}, toggle=${this.toggle}, color=${this.color})"
   }

   public override fun hashCode(): Int {
      return (this.item.hashCode() * 31 + this.toggle.hashCode()) * 31 + this.color.hashCode()
   }

   public operator fun component2(): خذ {
      return this.toggle
   }

   public final val toggle: خذ

   fun getItem(): Item {
      this.item
   }

   public operator fun component3(): رت {
      return this.color
   }

   fun component1(): Item {
      this.item
   }

   public final val color: رت

   fun `ItemHighliterModule$HighlightEntry`(color: Item, item: BooleanSetting, toggle: ColorSetting) {
      this.item = item
      this.toggle = toggle
      this.color = color
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ItemHighliterModule$HighlightEntry
            && this.item == (other as ItemHighliterModule$HighlightEntry).item
            && this.toggle == (other as ItemHighliterModule$HighlightEntry).toggle
            && this.color == (other as ItemHighliterModule$HighlightEntry).color
         }
   }

   fun copy(item: Item, color: BooleanSetting, toggle: ColorSetting): ItemHighliterModule$HighlightEntry {
      ItemHighliterModule$HighlightEntry(item, toggle, color)
   }
}
