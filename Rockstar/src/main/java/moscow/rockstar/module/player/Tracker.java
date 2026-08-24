package moscow.rockstar.module.player;

import java.util.Set;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.FinishEatEvent;
import moscow.rockstar.systems.event.impl.network.ReceivePacketEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.systems.notifications.NotificationType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;

@ModuleInfo(name = "Tracker", category = ModuleCategory.PLAYER, desc = "Отслеживание игроков и сущностей с отображением информации")
public class Tracker extends BaseModule {
   private static final Set<Item> TRACKED = Set.of(Items.GOLDEN_APPLE, Items.ENCHANTED_GOLDEN_APPLE, Items.CHORUS_FRUIT, Items.POTION);

   private final EventListener<FinishEatEvent> onEat = event -> {
      if (event.getUser() != mc.player || event.getStack() == null) {
         return;
      }
      ItemStack stack = event.getStack();
      if (!TRACKED.contains(stack.getItem())) {
         return;
      }
      Rockstar.getInstance().getNotificationManager().addNotification(NotificationType.INFO, "Tracker: " + this.describe(stack));
   };

   private final EventListener<ReceivePacketEvent> onPacket = event -> {
      if (event.getPacket() instanceof EntityStatusS2CPacket packet
         && (packet.getStatus() == 35 || packet.getStatus() == 9)) {
         Rockstar.getInstance().getNotificationManager().addNotification(NotificationType.INFO, "Tracker: Totem pop");
      }
   };

   private String describe(ItemStack stack) {
      if (stack.isOf(Items.POTION) || stack.isOf(Items.SPLASH_POTION) || stack.isOf(Items.LINGERING_POTION)) {
         PotionContentsComponent contents = stack.get(DataComponentTypes.POTION_CONTENTS);
         if (contents != null) {
            for (StatusEffectInstance effect : contents.getEffects()) {
               return "Зелье " + effect.getEffectType().value().getName().getString().toLowerCase();
            }
         }
         return "Зелье";
      }
      if (stack.isOf(Items.ENCHANTED_GOLDEN_APPLE)) {
         return "Enchanted Golden Apple";
      }
      if (stack.isOf(Items.GOLDEN_APPLE)) {
         return "Golden Apple";
      }
      if (stack.isOf(Items.CHORUS_FRUIT)) {
         return "Chorus Fruit";
      }
      return stack.getName().getString();
   }
}
