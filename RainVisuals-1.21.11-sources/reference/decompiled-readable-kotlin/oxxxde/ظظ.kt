package oxxxde

import java.util.HashSet
import kotakbaz.rain.ui.inventory.InventoryAnalysis
import kotakbaz.rain.ui.inventory.InventorySnapshot
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
import net.fabricmc.fabric.api.networking.v1.PacketSender
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.ingame.HandledScreen
import net.minecraft.client.gui.screen.ingame.InventoryScreen
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.screen.ScreenHandler

// $VF: Compiled from heavy
public object ظظ {
   private const val AUCTION_CLOSE_CONFIRM_TICKS: Int = 2
   private final var initialized: Boolean
   private final var auctionTransitionTicks: Int
   private final var auctionClosedTicks: Int
   private const val AUCTION_OPEN_TIMEOUT_TICKS: Int = 100
   @JvmStatic
   private InventoryAnalysis analysis = InventoryAnalysis(MapsKt.emptyMap(), CollectionsKt.emptyList());
   private final var auctionReturnState: رل = رل.IDLE
   private final val ghostPositions: HashSet<Long> = HashSet()
   @JvmStatic
   private InventorySnapshot snapshot;

   private fun positionKey(x: Int, y: Int): Long {
      return (long)x shl 32 xor y and 4294967295L
   }

   fun tickAuctionReturn(client: MinecraftClient) {
      if (auctionReturnState != رل.IDLE) {
         if (client.player != null && client.getNetworkHandler() != null) {
            when (تْ.$EnumSwitchMapping$0[auctionReturnState.ordinal()]) {
               1 -> {}
               2 -> this.tickWaitingForAuction(client)
               3 -> this.tickOpenAuction(client)
               else -> throw NoWhenBranchMatchedException()
            }
         } else {
            this.clearAuctionReturn()
         }
      }
   }

   public fun load(value: ّ) {
      طٍ.INSTANCE.stop()
      snapshot = value.deepCopy()
   }

   public fun slotName(menuSlot: Int): String {
      return سز.INSTANCE.slotName(menuSlot)
   }

   public fun toggleSorting() {
      طٍ.INSTANCE.toggle(snapshot)
   }

   public fun unload() {
      طٍ.INSTANCE.stop()
      snapshot = null
      this.clearFrame()
      شج.INSTANCE.clearLoadedSelection()
      this.clearAuctionReturn()
   }

   private fun clearFrame() {
      ghostPositions.clear()
      analysis = InventoryAnalysis(MapsKt.emptyMap(), CollectionsKt.emptyList())
   }

   public fun initialize() {
      if (!initialized) {
         initialized = true
         ClientTickEvents.END_CLIENT_TICK.register({ client: MinecraftClient ->
            طٍ.INSTANCE.tick(snapshot)
            INSTANCE.tickAuctionReturn(client)
         })
         ClientPlayConnectionEvents.JOIN.register({ var0: ClientPlayNetworkHandler, var1: PacketSender, var2: MinecraftClient ->
            INSTANCE.unload()
         })
         ClientPlayConnectionEvents.DISCONNECT.register({ var0: ClientPlayNetworkHandler, var1: MinecraftClient ->
            INSTANCE.unload()
         })
      }
   }

   public fun expectInventoryReturnFromAuction() {
      auctionReturnState = رل.WAITING_FOR_AUCTION
      auctionTransitionTicks = 0
      auctionClosedTicks = 0
   }

   fun tickWaitingForAuction(client: MinecraftClient) {
      if (client.currentScreen is InventoryScreen || client.currentScreen == null) {
         val var3: Int = auctionTransitionTicks++
         if (auctionTransitionTicks >= 100) {
            this.clearAuctionReturn()
         }
      } else if (client.currentScreen is HandledScreen) {
         auctionReturnState = رل.AUCTION_OPEN
         auctionClosedTicks = 0
      } else {
         this.clearAuctionReturn()
      }
   }

   public fun isGhostPosition(x: Int, y: Int): Boolean {
      return ضك.getMc().currentScreen is InventoryScreen && صص.INSTANCE.customScreen == null && ghostPositions.contains(this.positionKey(x, y))
   }

   public fun shouldBlockInventoryClick(): Boolean {
      return طٍ.INSTANCE.blocksInput
   }

   public fun stopSorting() {
      طٍ.INSTANCE.stop()
   }

   fun beginInventoryFrame(menu: ScreenHandler) {
      var var10000: InventoryAnalysis
      run label15@{
         ghostPositions.clear()
         if (snapshot != null) {
            var10000 = سز.INSTANCE.analyze(snapshot, menu)
            if (var10000 != null) {
               return@label15
            }
         }

         var10000 = InventoryAnalysis(MapsKt.emptyMap(), CollectionsKt.emptyList())
      }

      analysis = var10000
   }

   public final val isSorting: Boolean
      public final get() {
         return طٍ.INSTANCE.running
      }


   public fun missingItems(): List<طف> {
      return analysis.missingItems
   }

   public fun hasLoadedInventory(): Boolean {
      return snapshot != null
   }

   public fun visualAt(menuSlot: Int): سق? {
      return analysis.visuals.get(menuSlot)
   }

   private fun clearAuctionReturn() {
      auctionReturnState = رل.IDLE
      auctionTransitionTicks = 0
      auctionClosedTicks = 0
   }

   public fun markGhost(x: Int, y: Int) {
      ghostPositions.add(this.positionKey(x, y))
   }
}
