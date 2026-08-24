package moscow.rockstar.module.player;

import java.util.Comparator;
import java.util.List;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.window.KeyPressEvent;
import moscow.rockstar.systems.event.impl.window.MouseEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.systems.notifications.NotificationType;
import moscow.rockstar.config.settings.BindSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.util.game.ItemUtility;
import moscow.rockstar.util.game.server.ServerUtility;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.inventory.ItemSlot;
import moscow.rockstar.util.inventory.group.SlotGroup;
import moscow.rockstar.util.inventory.group.SlotGroups;
import moscow.rockstar.util.inventory.slots.HotbarSlot;
import moscow.rockstar.util.time.Timer;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
@ModuleInfo(name = "Auto Swap", category = ModuleCategory.PLAYER)
public class AutoSwap extends BaseModule {
private final BindSetting button = new BindSetting(this, "Клавиша");
   private final ModeSetting itemMode = new ModeSetting(this, "Предмет для замены");
   private final ModeSetting.Value swapTal = new ModeSetting.Value(this.itemMode, "Талисман").select();
   private final ModeSetting swapToMode = new ModeSetting(this, "Заменить на");
   private final ModeSetting.Value swapToTal = new ModeSetting.Value(this.swapToMode, "Талисман").select();
   private final Timer timer = new Timer();
   private final EventListener<KeyPressEvent> onKeyPressEvent = event -> {
      if (event.getAction() == 1) {
         if (this.button.isKey(event.getKey())) {
            this.swap();
         }
      }
   };
   private final EventListener<MouseEvent> onMouseEvent = event -> {
      if (this.button.isKey(event.getButton())) {
         this.swap();
      }
   };

   public AutoSwap() {
      new ModeSetting.Value(this.swapToMode, "Орб");
      new ModeSetting.Value(this.itemMode, "Орб");
   }

   private void swap() {
      if (mc.currentScreen == null && (!ServerUtility.isST() || this.timer.finished(1000L))) {
         SlotGroup<ItemSlot> slotsToSearch = SlotGroups.inventory().and(SlotGroups.hotbar()).and(SlotGroups.offhand());
         List<ItemSlot> slots = slotsToSearch.findItems(this.swapTal.isSelected() ? Items.TOTEM_OF_UNDYING : Items.PLAYER_HEAD);
         List<ItemSlot> slots1 = slotsToSearch.findItems(this.swapToTal.isSelected() ? Items.TOTEM_OF_UNDYING : Items.PLAYER_HEAD);
         ItemSlot slot = slots.stream()
            .min(Comparator.comparingInt(stack -> ItemUtility.bestFactor(stack.itemStack()) - (stack.getIdForServer() == 45 ? 99 : 0)))
            .orElse(null);
         ItemSlot slot1 = slots1.stream()
            .filter(slotW -> slot != slotW)
            .min(Comparator.comparingInt(stack -> ItemUtility.bestFactor(stack.itemStack()) - (stack.getIdForServer() == 45 ? 99 : 0)))
            .orElse(null);
         if (slot != null && slot1 != null) {
            if (mc.player.getOffHandStack().getItem() != slot.item() && mc.player.getOffHandStack().getItem() != slot1.item()) {
               InventoryUtility.moveToOffHand(slot);
            } else if (slot instanceof HotbarSlot hotbarSlot && !mc.player.isUsingItem()) {
               mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(hotbarSlot.getSlotId()));
               mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ORIGIN, Direction.DOWN));
               mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(mc.player.getInventory().selectedSlot));
            } else if (slot1 instanceof HotbarSlot hotbarSlot && !mc.player.isUsingItem()) {
               mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(hotbarSlot.getSlotId()));
               mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ORIGIN, Direction.DOWN));
               mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(mc.player.getInventory().selectedSlot));
            } else {
               slot.swapTo(slot1);
            }

            this.timer.reset();
            Rockstar.getInstance()
               .getNotificationManager()
               .addNotificationOther(
                  NotificationType.SUCCESS,
                  this.getName(),
                  mc.player
                     .getOffHandStack()
                     .getName()
                     .getString()
                     .replace("[", "")
                     .replace("] ", "")
                     .replace("xxx ", "")
                     .replace(" xxx", "")
                     .replace("123 ", "")
                     .replace(" 123", "")
               );
         }
      }
   }
}
