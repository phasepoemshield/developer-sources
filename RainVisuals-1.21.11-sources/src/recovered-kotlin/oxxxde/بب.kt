package oxxxde

import java.util.Comparator
import kotakbaz.rain.ui.inventory.InventoryPreset

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class بب<T> : Comparator {
   override final fun compare(b: T, a: T): Int {
      ComparisonsKt.compareValues((a as InventoryPreset).createdAt, (b as InventoryPreset).createdAt)
   }
}
