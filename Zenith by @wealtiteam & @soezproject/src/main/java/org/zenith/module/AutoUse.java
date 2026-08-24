package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.ColorAnimator;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.util.ScreenUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.EffectEngine;

import org.zenith.event.EventTick;
import org.zenith.event.StopUsingItemEvent;

import org.zenith.setting.ModeSetting;



import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.potion.Potions;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

@ModuleInfo(
   name = "AutoUse",
   category = Category.MISC,
   description = "module.autoUse.desc"
)
public final class AutoUse extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoUse autoUse = new AutoUse();
   public final ModeSetting modeSetting4 = ModeSetting.on23(
      "module.autoUse.mode", "", List.of("module.autoUse.invisibility", "module.autoUse.food")
   );
   public int int52 = -1;
   public int int53 = -1;
   public boolean usingItem;

   public AutoUse() {
   }

   @Override
   public void onDisable() {
      if (this.usingItem
         && minecraftClient3.player != null
         && minecraftClient3.interactionManager != null
         && minecraftClient3.player.isUsingItem()) {
         minecraftClient3.interactionManager.stopUsingItem(minecraftClient3.player);
      }

      this.int409();
      super.onDisable();
   }

   @EventTarget(0)
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player == null || minecraftClient3.world == null || minecraftClient3.interactionManager == null) {
         this.int410();
      } else if (this.usingItem) {
         if (!minecraftClient3.player.isUsingItem()) {
            this.int409();
         }
      } else if (!minecraftClient3.player.isUsingItem()) {
         if (!this.modeSetting4.ConfigJsonUtil(0)
            || minecraftClient3.player.isInvisible()
            || !this.on23(this::MediaTrackInfo)) {
            if (this.modeSetting4.ConfigJsonUtil(1) && minecraftClient3.player.getHungerManager().getFoodLevel() <= 7) {
               this.on23(var0 -> var0.getUseAction() == UseAction.EAT);
            }
         }
      }
   }

   @EventTarget(0)
   public void on23(StopUsingItemEvent var1) {
      if (this.usingItem && minecraftClient3.player != null && minecraftClient3.player.isUsingItem()) {
         var1.cancel();
      }
   }

   public boolean on23(Predicate<ItemStack> var1) {
      if (minecraftClient3.player == null) {
         return false;
      } else {
         PlayerInventory playerinventory = minecraftClient3.player.getInventory();
         int i = ScreenUtils.on23(var2x -> var1.test(playerinventory.getStack(var2x)));
         this.int52 = playerinventory.selectedSlot;
         if (i != -1) {
            playerinventory.setSelectedSlot(i);
         } else {
            Slot slot = ScreenUtils.ColorAnimator(
               var1x -> var1x.inventory instanceof PlayerInventory && var1x.getIndex() >= 9 && var1x.getIndex() < 36 && var1.test(var1x.getStack())
            );
            if (slot == null) {
               this.int410();
               return false;
            }

            this.int53 = slot.getIndex();
            ScreenUtils.on23(slot, Hand.MAIN_HAND, false);
         }

         this.usingItem = true;
         EffectEngine.useItem(Hand.MAIN_HAND);
         if (!minecraftClient3.player.isUsingItem()) {
            this.int409();
         }

         return true;
      }
   }

   public void int409() {
      if (minecraftClient3.player != null && this.int52 != -1) {
         if (this.int53 != -1) {
            Slot slot = ScreenUtils.ColorAnimator(var1x -> var1x.inventory instanceof PlayerInventory && var1x.getIndex() == this.int53);
            if (slot != null) {
               ScreenUtils.on23(slot, this.int52, true);
            }
         }

         minecraftClient3.player.getInventory().setSelectedSlot(this.int52);
      }

      this.int410();
   }

   public void int410() {
      this.int52 = -1;
      this.int53 = -1;
      this.usingItem = false;
   }

   public boolean MediaTrackInfo(ItemStack var1) {
      if (!var1.isOf(Items.POTION) && !var1.isOf(Items.SPLASH_POTION) && !var1.isOf(Items.LINGERING_POTION)) {
         return false;
      } else {
         PotionContentsComponent potioncontentscomponent = var1.get(DataComponentTypes.POTION_CONTENTS);
         if (potioncontentscomponent == null) {
            return false;
         } else if (potioncontentscomponent.potion().isPresent() && potioncontentscomponent.potion().get().value().equals(Potions.INVISIBILITY)) {
            return true;
         } else {
            for (StatusEffectInstance statuseffectinstance : potioncontentscomponent.getEffects()) {
               if (statuseffectinstance.getEffectType().equals(StatusEffects.INVISIBILITY)) {
                  return true;
               }
            }

            return false;
         }
      }
   }
}
