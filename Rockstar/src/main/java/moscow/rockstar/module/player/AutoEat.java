package moscow.rockstar.module.player;

import java.util.function.Predicate;
import moscow.rockstar.mixin.minecraft.client.IMinecraftClient;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.inventory.ItemSlot;
import moscow.rockstar.util.inventory.group.SlotGroup;
import moscow.rockstar.util.inventory.group.SlotGroups;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
@ModuleInfo(name = "Auto Eat", category = ModuleCategory.PLAYER)
public class AutoEat extends BaseModule {
   private boolean eating;
  private final SliderSetting food = new SliderSetting(this, "Голод для поедания").step(1.0F).min(1.0F).max(20.0F).currentValue(15.0F);
   private final EventListener<ClientPlayerTickEvent> onUpdateEvent = event -> {
      if (mc.player.getHungerManager().getFoodLevel() <= this.food.getCurrentValue()) {
         SlotGroup<ItemSlot> search = SlotGroups.inventory().and(SlotGroups.hotbar());
         ItemSlot foodSlot = search.findItem((Predicate<ItemStack>)(stack -> stack.getItem().getDefaultStack().contains(DataComponentTypes.FOOD)));
         if (!mc.player.getOffHandStack().contains(DataComponentTypes.FOOD) && foodSlot != null) {
            foodSlot.moveToOffHand();
         }

         this.eating = true;
         if (mc.currentScreen != null && !mc.player.isUsingItem()) {
            ((IMinecraftClient)mc).idoItemUse();
         } else {
            mc.options.useKey.setPressed(true);
         }
      } else if (this.eating) {
         this.eating = false;
         mc.options.useKey.setPressed(false);
      }
   };
}
