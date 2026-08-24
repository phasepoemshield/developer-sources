package oxxxde

import java.util.ArrayList
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler

// $VF: Compiled from heavy
internal object سز {
   private final val ARMOR_NAMES: Array<String>

   fun stateOf(expected: ItemStack, current: ItemStack): رٍ {
      if (this.matches(current, expected))
         رٍ.CORRECT
         else
         (
            if (current.isEmpty() && !expected.isEmpty())
               رٍ.MISSING
               else
               (if (!current.isEmpty() && !expected.isEmpty()) رٍ.CONFLICT else (if (!current.isEmpty()) رٍ.MISPLACED else null))
         )
      }

   public fun slotName(slot: Int): String {
      var index: IntRange = ّ.Companion.ARMOR_SLOTS
      val var10000: java.lang.String
      if (slot <= index.getLast() && index.getFirst() <= slot) {
         var10000 = ARMOR_NAMES[slot - ّ.Companion.ARMOR_SLOTS.getFirst()]
      } else {
         index = ّ.Companion.HOTBAR_SLOTS
         if (slot <= index.getLast() && index.getFirst() <= slot) {
            var10000 = "Хотбар ${slot - ّ.Companion.HOTBAR_SLOTS.getFirst() + 1}"
         } else {
            index = ّ.Companion.INVENTORY_SLOTS
            if (slot <= index.getLast() && index.getFirst() <= slot) {
               val var7: Int = slot - ّ.Companion.INVENTORY_SLOTS.getFirst()
               var10000 = "Инвентарь: ряд ${var7 / 9 + 1}, слот ${var7 % 9 + 1}"
            } else {
               var10000 = if (slot == 45) "Вторая рука" else "Неизвестный слот"
            }
         }
      }

      return var10000
   }

   fun destinations(snapshot: ّ, menu: ScreenHandler): MutableMap<Int, Int> {
      val `$this$filterTo$iv`: java.lang.Iterable = ّ.Companion.MANAGED_SLOTS
      val `$this$destinations_u24lambda_u241`: java.util.Collection = ArrayList()

      for (`$i$f$forEach` in `$this$filterTo$iv`) {
         var var30: Boolean
         run label69@{
            val slot: Int = (`$i$f$forEach` as java.lang.Number).intValue()
            val source: ItemStack = snapshot.expectedAt(slot)
            if (!source.isEmpty()) {
               val var10000: سز = INSTANCE
               val var10001: ItemStack = menu.getSlot(slot).getStack()
               if (!var10000.matches(var10001, source)) {
                  var30 = true
                  return@label69
               }
            }

            var30 = false
         }

         if (var30) {
            `$this$destinations_u24lambda_u241`.add(`$i$f$forEach`)
         }
      }

      val targets: java.util.List = `$this$destinations_u24lambda_u241` as java.util.List
      val var22: java.util.Map = MapsKt.createMapBuilder()
      val var23: java.util.Map = var22
      val var27: java.util.Iterator = ّ.Companion.MANAGED_SLOTS.iterator()

      while (var27.hasNext()) {
         val var29: Int = (var27 as IntIterator).nextInt()
         val var31: ItemStack = menu.getSlot(var29).getStack()
         val current: ItemStack = var31
         if (!var31.isEmpty() && !INSTANCE.matches(var31, snapshot.expectedAt(var29))) {
            var `index$iv`: Int = 0
            val var17: java.util.Iterator = targets.iterator()

            while (true) {
               if (!var17.hasNext()) {
                  var32 = -1
                  break
               }

               if (INSTANCE.matches(current, snapshot.expectedAt((var17.next() as java.lang.Number).intValue()))) {
                  var32 = `index$iv`
                  break
               }

               `index$iv`++
            }

            if (var32 >= 0) {
               var23.put(var29, targets.remove(var32))
            }
         }
      }

      MapsKt.build(var22)
   }

   fun matches(first: ItemStack, second: ItemStack): Boolean {
      تا.INSTANCE.matches(first, second)
   }

   fun analyze(snapshot: ّ, menu: ScreenHandler): سخ {
      val destinations: java.util.Map = this.destinations(snapshot, menu)
      val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = ّ.Companion.MANAGED_SLOTS
      val `destination$iv$iv`: java.util.Collection = ArrayList()
      val var12: java.util.Iterator = `$this$mapNotNullTo$iv$iv`.iterator()

      while (var12.hasNext()) {
         val slot: Int = (var12 as IntIterator).nextInt()
         val var10000: ItemStack = menu.getSlot(slot).getStack()
         val expected: ItemStack = snapshot.expectedAt(slot)
         val var23: رٍ = INSTANCE.stateOf(var10000, expected)
         val var24: Pair = if (var23 == null) null else slot to سق(var23, expected, destinations.get(slot) as Int, destinations.values().contains(slot))
         if (var24 != null) {
            `destination$iv$iv`.add(var24)
         }
      }

      سخ(MapsKt.toMap(`destination$iv$iv`), this.missingItems(snapshot, menu))
   }

   fun MutableList<ضر>.add(`$this$add`: ItemStack) {
      val it: java.util.Iterator = `$this$add`.iterator()

      var var10000: Any
      while (true) {
         if (it.hasNext()) {
            val var7: Any = it.next()
            if (!INSTANCE.matches((var7 as ضر).getStack(), stack)) {
               continue
            }

            var10000 = var7
            break
         }

         var10000 = null
         break
      }

      val var3: ضر = var10000 as ضر
      if (var10000 as ضر != null) {
         var3.count = var3.count + stack.getCount()
      } else {
         `$this$add`.add(ضر(stack, stack.getCount(), false, 4, null))
      }
   }

   fun missingItems(menu: ّ, snapshot: ScreenHandler): MutableList<طف> {
      val totals: java.util.List = ArrayList()
      var `$this$mapTo$iv$iv`: java.util.Iterator = ّ.Companion.MANAGED_SLOTS.iterator()

      while (`$this$mapTo$iv$iv`.hasNext()) {
         val `item$iv$iv`: ItemStack = snapshot.expectedAt((`$this$mapTo$iv$iv` as IntIterator).nextInt())
         if (!`item$iv$iv`.isEmpty()) {
            INSTANCE.add(totals, `item$iv$iv`)
         }
      }

      `$this$mapTo$iv$iv` = ّ.Companion.MANAGED_SLOTS.iterator()

      while (`$this$mapTo$iv$iv`.hasNext()) {
         var var10000: ضر = menu.getSlot((`$this$mapTo$iv$iv` as IntIterator).nextInt()).getStack()
         val var36: ItemStack = var10000
         if (!var10000.isEmpty()) {
            val var13: java.util.Iterator = totals.iterator()

            while (true) {
               if (var13.hasNext()) {
                  val `element$iv`: Any = var13.next()
                  if (!INSTANCE.matches((`element$iv` as ضر).getStack(), var36)) {
                     continue
                  }

                  var10000 = (ضر)`element$iv`
                  break
               }

               var10000 = null
               break
            }

            var10000 = var10000
            if (var10000 != null) {
               var10000.present = true
            }
         }
      }

      val var25: java.lang.Iterable = totals
      var var28: java.util.Collection = ArrayList()

      for (var37 in var25) {
         if (!(var37 as ضر).present) {
            var28.add(var37)
         }
      }

      val var26: java.lang.Iterable = var28 as java.util.List
      var28 = ArrayList(CollectionsKt.collectionSizeOrDefault(var28 as java.util.List, 10))

      for (var38 in var26) {
         val var40: ضر = var38 as ضر
         val var10002: ItemStack = (var38 as ضر).getStack().copyWithCount(1)
         var28.add(طف(var10002, var40.count))
      }

      var28 as java.util.List
   }
}
