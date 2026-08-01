package l;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;

public class EnderChestPlus extends Helper242 {
   private HandledScreen<?> screen;
   private final Setting9 bindSetting = new Setting9("Кнопка складывания предметов", "Помещает все предметы в эндер-сундук");

   public EnderChestPlus() {
      super("EnderChestPlus", "Ender-Chest Plus", Helper269.PLAYER);
      this.setup(new Helper264[]{this.bindSetting});
   }

   @Override
   public void deactivate() {
      if (this.screen != null) {
         this.screen = null;
         Helper66.method701(true);
         Notifications.method1666().method1668("Ender Chest - " + Formatting.RED + "закрыт", 5000L);
      }
   }

   @Helper104
   public void method2763(Event17 var1) {
      if (var1.method3903(this.bindSetting.getKey()) && this.screen != null) {
         DefaultedList<net.minecraft.screen.slot.Slot> var2 = mc.player.currentScreenHandler.slots;
         var2.stream()
            .filter(var1x -> var1x.id < var2.size() - 36 && var1x.getStack().isEmpty())
            .findFirst()
            .ifPresent(var0 -> Helper66.method690(var0, Hand.OFF_HAND, false));
         var2.stream()
            .filter(var1x -> var1x.id >= var2.size() - 36 && !var1x.getStack().isEmpty())
            .forEach(var0 -> Helper66.method702(var0, 0, SlotActionType.QUICK_MOVE, false));
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.screen != null && mc.player != null) {
         Packet packet = Objects.requireNonNull(var1.method3895());

         if (packet instanceof GameJoinS2CPacket
            || packet instanceof OpenScreenS2CPacket
            || packet instanceof CloseScreenS2CPacket
            || packet instanceof PlayerRespawnS2CPacket) {
            this.deactivate();
         } else if (packet instanceof CloseHandledScreenC2SPacket) {
            var1.method582();
         } else if (packet instanceof PlayerActionC2SPacket action
            && action.getAction().equals(Action.SWAP_ITEM_WITH_OFFHAND)) {
            Helper66.method690(Helper66.method718(), Hand.OFF_HAND, false);
            var1.method582();
         }
      }
   }

   @Helper104
   public void method2764(Event4 var1) {
      if (var1.method3646() instanceof InventoryScreen && this.screen != null) {
         var1.method3647(this.screen);
      }
   }

   @Helper104
   public void method2765(Helper405 var1) {
      if (var1.method4150() instanceof GenericContainerScreen var2
         && var2.getTitle().getString().contains(Text.translatable("container.enderchest").getString())) {
         this.screen = var2;
      }

      if (this.screen != null) {
         mc.setScreen(null);
         var1.method582();
      }
   }
}
