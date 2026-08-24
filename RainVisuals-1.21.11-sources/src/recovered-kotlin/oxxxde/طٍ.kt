package oxxxde

import kotakbaz.rain.ui.inventory.InventorySnapshot
import kotakbaz.rain.ui.inventory.InventorySorter$Click
import kotakbaz.rain.ui.inventory.InventorySorter$Move
import net.minecraft.client.gui.screen.ingame.InventoryScreen
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.screen.PlayerScreenHandler
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import net.minecraft.screen.slot.SlotActionType

// $VF: Compiled from heavy
internal object طٍ {
   private const val STEP_DELAY_MS: Long = 120L
   private final var clicking: Boolean

   public final var running: Boolean
      private set

   private final val swapSlots: IntRange = IntRange(InventorySnapshot.Companion.HOTBAR_SLOTS.getFirst(), 45)
   private final var nextStepAt: Long

   fun canPivot(target: ScreenHandler, source: Int, menu: ItemStack, pivot: Int): Boolean {
      val var5: IntRange = InventorySnapshot.Companion.ARMOR_SLOTS
      source > var5.getLast() || var5.getFirst() > source || menu.getSlot(pivot).getStack().isEmpty() && menu.getSlot(source).canInsert(target)
   }

   private fun swapButton(slot: Int): Int? {
      val var3: IntRange = InventorySnapshot.Companion.HOTBAR_SLOTS
      return if (slot <= var3.getLast() && var3.getFirst() <= slot)
         slot - InventorySnapshot.Companion.HOTBAR_SLOTS.getFirst()
         else
         (if (slot == 45) 40 else null)
      }

   public fun start(snapshot: ّ?) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (snapshot != null && ضك.getMc().currentScreen is InventoryScreen && ضك.getMc().interactionManager != null) {
            if (var10000.playerScreenHandler.getCursorStack().isEmpty()) {
               running = true
               nextStepAt = 0L
            }
         }
      }
   }

   fun canMove(player: Int, expected: ItemStack, snapshot: InventorySnapshot, source: ScreenHandler, menu: PlayerEntity): Boolean {
      val var10000: Slot = menu.getSlot(source)
      if (var10000.canTakeItems(player)) {
         var var10001: ItemStack = var10000.getStack()
         if (this.matches(var10001, expected)) {
            var10001 = var10000.getStack()
            if (!this.matches(var10001, snapshot.expectedAt(source))) {
               true
            }
         }
      }

      false
   }

   fun step(player: InventorySnapshot, snapshot: ScreenHandler, menu: PlayerEntity): Boolean {
      val var10000: InventorySorter$Move = this.nextMove(snapshot, menu, player)
      if (var10000 == null) {
         false
      } else {
         val move: InventorySorter$Move = var10000
         clicking = true

         try {
            for (`element$iv` in move.clicks) {
               val click: InventorySorter$Click = `element$iv` as InventorySorter$Click
               val var13: ClientPlayerInteractionManager = ضك.getMc().interactionManager
               if (var13 != null) {
                  var13.clickSlot(menu.syncId, click.slot, click.button, click.getType(), player)
               }
            }

            menu.sendContentUpdates()
         } finally {
            clicking = false
         }

         if (menu.getCursorStack().isEmpty()) {
            val var10001: ItemStack = menu.getSlot(var10000.target).getStack()
            if (this.matches(var10001, snapshot.expectedAt(var10000.target))) {
               true
            }
         }

         false
      }
   }

   public fun tick(snapshot: ّ?) {
      if (running) {
         val player: ClientPlayerEntity = ضك.getMc().player
         if (player != null && snapshot != null && ضك.getMc().currentScreen is InventoryScreen && ضك.getMc().interactionManager != null) {
            val var10000: PlayerScreenHandler = player.playerScreenHandler
            val now: Long = System.currentTimeMillis()
            if (var10000.getCursorStack().isEmpty() && (now < nextStepAt || this.step(snapshot, var10000 as ScreenHandler, player as PlayerEntity))) {
               if (now >= nextStepAt) {
                  nextStepAt = now + 120L
               }
            } else {
               this.stop()
            }
         } else {
            this.stop()
         }
      }
   }

   private fun pickup(slot: Int): خت {
      return InventorySorter$Click(slot, 0, SlotActionType.PICKUP)
   }

   public final val blocksInput: Boolean
      public final get() {
         return running && !clicking
      }


   public fun toggle(snapshot: ّ?) {
      if (running) {
         this.stop()
      } else {
         this.start(snapshot)
      }
   }

   fun plan(menu: ScreenHandler, source: Int, target: Int): InventorySorter$Move {
      var var10000: Slot = menu.getSlot(source)
      var10000 = menu.getSlot(target)
      val targetSlot: Slot = var10000
      if (var10000.getStack().isEmpty()) {
         InventorySorter$Move(target, CollectionsKt.listOf(this.pickup(source), this.pickup(target)))
      } else {
         var buffer: Int = this.swapButton(source)
         if (buffer != null) {
            InventorySorter$Move(target, CollectionsKt.listOf(INSTANCE.swap(target, buffer.intValue())))
         } else {
            buffer = this.swapButton(target)
            if (buffer != null) {
               val `$i$f$firstOrNull`: Int = buffer.intValue()
               val `$this$firstOrNull$iv`: Int = if (var10000.canInsert(var10000.getStack())) buffer else null
               if (`$this$firstOrNull$iv` != null) {
                  InventorySorter$Move(target, CollectionsKt.listOf(INSTANCE.swap(source, `$this$firstOrNull$iv`.intValue())))
               }
            }

            val var26: java.util.Iterator = swapSlots.iterator()

            while (true) {
               if (!var26.hasNext()) {
                  var41 = null
                  break
               }

               var var31: Any
               run label104@{
                  var31 = var26.next()
                  val `element$iv`: Int = (var31 as java.lang.Number).intValue()
                  if (`element$iv` != source && `element$iv` != target) {
                     val var39: طٍ = INSTANCE
                     val var10003: ItemStack = targetSlot.getStack()
                     if (var39.canPivot(menu, source, var10003, `element$iv`)) {
                        var40 = true
                        return@label104
                     }
                  }

                  var40 = false
               }

               if (var40) {
                  var41 = var31
                  break
               }
            }

            buffer = var41 as Int
            if (var41 as Int != null) {
               val var45: Int = INSTANCE.swapButton(buffer.intValue())
               val var33: Int = var45
               InventorySorter$Move(target, CollectionsKt.listOf(INSTANCE.swap(source, var33), INSTANCE.swap(target, var33), INSTANCE.swap(source, var33)))
            } else {
               run label115@{
                  val var32: java.util.Iterator = InventorySnapshot.Companion.STORAGE_SLOTS.iterator()

                  while (true) {
                     if (!var32.hasNext()) {
                        var43 = null
                        break
                     }

                     var var35: Any
                     run label111@{
                        var35 = var32.next()
                        val var37: Int = (var35 as java.lang.Number).intValue()
                        if (var37 != source && var37 != target) {
                           val `$this$plan_u24lambda_u245_u240`: Slot = menu.getSlot(var37)
                           if (`$this$plan_u24lambda_u245_u240`.getStack().isEmpty() && `$this$plan_u24lambda_u245_u240`.canInsert(targetSlot.getStack())) {
                              var42 = true
                              return@label111
                           }
                        }

                        var42 = false
                     }

                     if (var42) {
                        var43 = var35
                        break
                     }
                  }

                  if (var43 as Int != null)
                     InventorySorter$Move(
                        target, CollectionsKt.listOf(this.pickup(target), this.pickup(var43 as Int), this.pickup(source), this.pickup(target))
                     )
                     else
                     null
                  }
            }
         }
      }
   }

   fun matches(second: ItemStack, first: ItemStack): Boolean {
      تا.INSTANCE.matches(first, second)
   }

   fun canFill(target: Int, menu: InventorySnapshot, player: ScreenHandler, snapshot: PlayerEntity): Boolean {
      val expected: ItemStack = snapshot.expectedAt(target)
      val var10000: Slot = menu.getSlot(target)
      if (!expected.isEmpty()) {
         val var10001: ItemStack = var10000.getStack()
         if (!this.matches(var10001, expected) && var10000.canInsert(expected) && (var10000.getStack().isEmpty() || var10000.canTakeItems(player))) {
            true
         }
      }

      false
   }

   private fun swap(slot: Int, button: Int): خت {
      return InventorySorter$Click(slot, button, SlotActionType.SWAP)
   }

   public fun stop() {
      running = false
      nextStepAt = 0L
      clicking = false
   }

   fun nextMove(player: InventorySnapshot, menu: ScreenHandler, snapshot: PlayerEntity): InventorySorter$Move {
      SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(InventorySnapshot.Companion.MANAGED_SLOTS), { target: Int ->
         INSTANCE.canFill(target, `$snapshot`, `$menu`, `$player`)
      }), { target: Int ->
         SequencesKt.firstOrNull(
            SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(InventorySnapshot.Companion.MANAGED_SLOTS), { source: Int ->
               source != `$target` && INSTANCE.canMove(source, `$expected`, `$snapshot`, `$menu`, `$player`)
            }), { source: Int ->
               INSTANCE.plan(`$menu`, source, `$target`)
            })
         ) as InventorySorter$Move
      })) as InventorySorter$Move
   }
}
