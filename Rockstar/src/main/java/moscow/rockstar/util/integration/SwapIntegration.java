package moscow.rockstar.util.integration;

import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.player.GuiMove;
import moscow.rockstar.systems.notifications.NotificationType;
import moscow.rockstar.util.interfaces.IMinecraft;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.inventory.ItemSlot;
import moscow.rockstar.util.inventory.group.SlotGroup;
import moscow.rockstar.util.inventory.group.SlotGroups;
import moscow.rockstar.util.inventory.slots.HotbarSlot;
import moscow.rockstar.util.inventory.slots.InventorySlot;
import moscow.rockstar.util.inventory.slots.OffhandSlot;
import moscow.rockstar.util.inventory.slots.InventorySlot;
import moscow.rockstar.util.time.Timer;
import net.minecraft.item.Item;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class SwapIntegration implements IMinecraft {
   public enum HandUseMode {
      LEFT,
      RIGHT,
      PACKET
   }

   private Item itemToUse = null;
   private HotbarSlot originalSlot = null;
   private boolean isProcessingItem = false;
   private ItemSlot targetSlot = null;
   private HandUseMode handUseMode = HandUseMode.LEFT;
   private boolean swappedToOffhand = false;
   private final Timer itemUseTimer = new Timer();
   private SwapIntegration.ItemUseState currentState = SwapIntegration.ItemUseState.IDLE;
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (this.isProcessingItem) {
         this.processItemUse();
      }
   };

   public SwapIntegration() {
      Rockstar.getInstance().getEventManager().subscribe(this);
   }

   private void processItemUse() {
      if (mc.player != null && mc.world != null && mc.interactionManager != null && mc.player.getItemCooldownManager() != null) {
         if (!(this.targetSlot instanceof HotbarSlot) && this.handUseMode != HandUseMode.PACKET) {
            Rockstar.getInstance().getModuleManager().getModule(GuiMove.class).setStay(true);
         }

         switch (this.currentState) {
            case USING_ITEM:
               if (this.canUseNow()) {
                  this.sendUsePacket(this.useHand());
                  this.currentState = SwapIntegration.ItemUseState.RETURNING_SLOT;
               }
               break;
            case RETURNING_SLOT:
               if (this.canUseNow()) {
                  this.restoreSlot();
                  this.resetUseState();
               }
               break;
            default:
               this.isProcessingItem = false;
               this.currentState = SwapIntegration.ItemUseState.IDLE;
         }
      } else {
         this.isProcessingItem = false;
         this.currentState = SwapIntegration.ItemUseState.IDLE;
      }
   }

   public void useItem(Item itemType) {
      this.useItem(itemType, HandUseMode.LEFT);
   }

   public void useItem(Item itemType, HandUseMode mode) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null && mc.currentScreen == null) {
         if (!this.isProcessingItem) {
            ItemSlot itemSlot = this.findItemSlot(itemType, mode);
            if (itemSlot == null) {
               Rockstar.getInstance()
                  .getNotificationManager()
                  .addNotificationOther(NotificationType.ERROR, "Предмет не найден", "Вам необходимо иметь " + itemType.getName().getString() + " в инвентаре");
            } else if (!mc.player.getItemCooldownManager().isCoolingDown(itemSlot.itemStack())) {
               this.handUseMode = mode;
               this.swappedToOffhand = false;
               this.itemToUse = itemType;
               this.originalSlot = InventoryUtility.getCurrentHotbarSlot();
               this.targetSlot = itemSlot;
               this.isProcessingItem = true;
               this.currentState = SwapIntegration.ItemUseState.USING_ITEM;
               this.itemUseTimer.reset();
               this.prepareItemSlot(itemSlot, mode);
            }
         }
      }
   }

   private ItemSlot findItemSlot(Item itemType, HandUseMode mode) {
      if (mode == HandUseMode.RIGHT && InventoryUtility.hasItemInOffHand(itemType)) {
         return InventoryUtility.getOffHandSlot();
      }

      SlotGroup<ItemSlot> group = SlotGroups.hotbar().and(SlotGroups.inventory());
      if (mode == HandUseMode.RIGHT) {
         group = group.and(SlotGroups.offhand());
      }

      return group.findItem(itemType);
   }

   private void prepareItemSlot(ItemSlot itemSlot, HandUseMode mode) {
      if (mode == HandUseMode.RIGHT) {
         if (itemSlot instanceof OffhandSlot) {
            return;
         }

         if (itemSlot instanceof HotbarSlot hotbarSlot) {
            if (InventoryUtility.getCurrentHotbarSlot().item() != this.itemToUse) {
               InventoryUtility.selectHotbarSlot(hotbarSlot);
            }

            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ORIGIN, Direction.DOWN));
            this.swappedToOffhand = true;
            return;
         }

         if (itemSlot instanceof InventorySlot inventorySlot) {
            HotbarSlot currentSlot = InventoryUtility.getCurrentHotbarSlot();
            if (this.handUseMode == HandUseMode.PACKET) {
               this.swapSlotsPacket(inventorySlot.getIdForServer(), currentSlot.getSlotId());
            } else {
               InventoryUtility.hotbarSwap(inventorySlot.getIdForServer(), currentSlot.getSlotId());
            }

            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ORIGIN, Direction.DOWN));
            this.swappedToOffhand = true;
         }
         return;
      }

      if (itemSlot instanceof HotbarSlot hotbarSlot) {
         if (InventoryUtility.getCurrentHotbarSlot().item() != this.itemToUse) {
            InventoryUtility.selectHotbarSlot(hotbarSlot);
         }
      } else if (itemSlot instanceof InventorySlot inventorySlot) {
         HotbarSlot currentSlot = InventoryUtility.getCurrentHotbarSlot();
         if (mode == HandUseMode.PACKET) {
            this.swapSlotsPacket(inventorySlot.getIdForServer(), currentSlot.getSlotId());
         } else {
            InventoryUtility.hotbarSwap(inventorySlot.getIdForServer(), currentSlot.getSlotId());
         }
      }
   }

   private boolean canUseNow() {
      if (this.handUseMode == HandUseMode.PACKET) {
         return true;
      }

      if (this.handUseMode == HandUseMode.RIGHT && this.targetSlot instanceof OffhandSlot) {
         return true;
      }

      if (this.targetSlot instanceof HotbarSlot) {
         return true;
      }

      return Rockstar.getInstance().getModuleManager().getModule(GuiMove.class).canSend();
   }

   private Hand useHand() {
      return this.handUseMode == HandUseMode.RIGHT ? Hand.OFF_HAND : Hand.MAIN_HAND;
   }

   private void sendUsePacket(Hand hand) {
      mc.interactionManager
         .sendSequencedPacket(
            mc.world, sequence -> new PlayerInteractItemC2SPacket(hand, sequence, mc.player.getYaw(), mc.player.getPitch())
         );
   }

   private void restoreSlot() {
      if (this.handUseMode == HandUseMode.RIGHT && this.swappedToOffhand) {
         mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ORIGIN, Direction.DOWN));
         if (!(this.targetSlot instanceof HotbarSlot)) {
            if (this.handUseMode == HandUseMode.PACKET && this.targetSlot != null) {
               this.swapSlotsPacket(this.targetSlot.getIdForServer(), this.originalSlot.getSlotId());
            } else if (this.targetSlot != null) {
               InventoryUtility.hotbarSwap(this.targetSlot.getIdForServer(), this.originalSlot.getSlotId());
            }
         } else {
            InventoryUtility.selectHotbarSlot(this.originalSlot);
         }
         return;
      }

      if (this.targetSlot instanceof HotbarSlot) {
         InventoryUtility.selectHotbarSlot(this.originalSlot);
      } else if (this.targetSlot != null) {
         if (this.handUseMode == HandUseMode.PACKET) {
            this.swapSlotsPacket(this.targetSlot.getIdForServer(), this.originalSlot.getSlotId());
            InventoryUtility.selectHotbarSlot(this.originalSlot);
         } else {
            InventoryUtility.hotbarSwap(this.targetSlot.getIdForServer(), this.originalSlot.getSlotId());
         }
      }
   }

   private void swapSlotsPacket(int from, int to) {
      mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(to));
      InventoryUtility.hotbarSwap(from, to);
      mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(mc.player.getInventory().selectedSlot));
   }

   private void resetUseState() {
      this.isProcessingItem = false;
      this.currentState = SwapIntegration.ItemUseState.IDLE;
      this.itemToUse = null;
      this.originalSlot = null;
      this.targetSlot = null;
      this.handUseMode = HandUseMode.LEFT;
      this.swappedToOffhand = false;
   }

   private static enum ItemUseState {
      IDLE,
      USING_ITEM,
      RETURNING_SLOT;
   }
}
