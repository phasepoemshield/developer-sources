package org.zenith.module;

import org.zenith.core.ServiceException;
import org.zenith.core.PricedItem;
import org.zenith.core.HeldItemWatcher;
import org.zenith.core.FileLogger;
import org.zenith.core.ImageEncoder;
import org.zenith.setting.Setting;



import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;

import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.util.ScreenUtils;
import org.zenith.util.StopWatch;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.EventClick;
import org.zenith.event.EventRender;

import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.item.Item;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

@ModuleInfo(
   name = "ItemScroller",
   description = "\u041f\u0435\u0440\u0435\u043c\u0435\u0449\u0435\u043d\u0438\u0435 \u043f\u0440\u0435\u043c\u0435\u0442\u043e\u0432 \u0431\u0435\u0437 \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0438",
   category = Category.MISC
)
public final class ItemScroller extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ItemScroller itemScroller = new ItemScroller();
   public final NumberSetting scrollerSetting = new NumberSetting(
      "module.itemScroller.scrollerSetting", 100.0F, 0.0F, 200.0F, 10.0F, "module.itemScroller.scrollerSetting.desc", "ms"
   );
   public final StopWatch stopWatch2 = new StopWatch();

   public ItemScroller() {
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }

   @Override
   public void onEnable() {
      super.onEnable();
   }

   @EventTarget
   public void on23(EventRender var1) {
      Slot slot = var1.AutoLoot();
      SlotActionType slotactiontype = EffectEngine.on23(minecraftClient3.options.dropKey.getDefaultKey())
         ? SlotActionType.THROW
         : (EffectEngine.on23(minecraftClient3.options.attackKey.getDefaultKey()) ? SlotActionType.QUICK_MOVE : null);
      if (this.call413()
         && ZenithClient.on23().FileLogger().ImageEncoder()
         && !this.call104()
         && slot != null
         && slot.hasStack()
         && slotactiontype != null
         && this.stopWatch2.ServiceException((double)this.scrollerSetting.getCurrent())) {
         EventClick ili11ii1l1ill1lllil1 = new EventClick(
            minecraftClient3.player.currentScreenHandler.syncId, slot.id, slotactiontype.equals(SlotActionType.THROW) ? 1 : 0, slotactiontype
         );
         EventManager.call(ili11ii1l1ill1lllil1);
         if (!ili11ii1l1ill1lllil1.isCancelled()) {
            minecraftClient3.interactionManager
               .clickSlot(
                  minecraftClient3.player.currentScreenHandler.syncId,
                  slot.id,
                  slotactiontype.equals(SlotActionType.THROW) ? 1 : 0,
                  slotactiontype,
                  minecraftClient3.player
               );
         }
      }
   }

   @EventTarget
   public void on23(EventClick var1) {
      int i = var1.PricedItem();
      if (i >= 0 && i <= minecraftClient3.player.currentScreenHandler.slots.size()) {
         Slot slot = minecraftClient3.player.currentScreenHandler.getSlot(i);
         Item item = slot.getStack().getItem();
         if (item != null
            && ZenithClient.on23().FileLogger().ImageEncoder()
            && minecraftClient3.currentScreen != null
            && this.call104()
            && var1.HeldItemWatcher() != SlotActionType.THROW
            && var1.HeldItemWatcher() != SlotActionType.SWAP
            && this.stopWatch2.ServiceException(100.0)) {
            ScreenUtils.call006()
               .filter(var2x -> var2x.getStack().getItem().equals(item) && var2x.inventory.equals(slot.inventory))
               .forEach(
                  var1x -> {
                     EventClick ili11ii1l1ill1lllil1 = new EventClick(
                        minecraftClient3.player.currentScreenHandler.syncId, var1x.id, 1, var1.HeldItemWatcher()
                     );
                     EventManager.call(ili11ii1l1ill1lllil1);
                     if (!ili11ii1l1ill1lllil1.isCancelled()) {
                        minecraftClient3.interactionManager
                           .clickSlot(
                              minecraftClient3.player.currentScreenHandler.syncId,
                              var1x.id,
                              1,
                              var1.HeldItemWatcher(),
                              minecraftClient3.player
                           );
                     }
                  }
               );
         }
      }
   }

   public boolean call413() {
      return EffectEngine.on23(minecraftClient3.options.sneakKey.getDefaultKey());
   }

   public boolean call104() {
      return EffectEngine.on23(minecraftClient3.options.sprintKey.getDefaultKey());
   }
}
