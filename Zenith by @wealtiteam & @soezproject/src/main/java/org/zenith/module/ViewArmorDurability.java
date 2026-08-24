package org.zenith.module;

import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import org.zenith.event.Event01;

import org.zenith.setting.BooleanSetting;





import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

@ModuleInfo(
   name = "View Armor Durability",
   category = Category.RENDER,
   description = "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c \u0431\u0440\u043e\u043d\u0438"
)
public class ViewArmorDurability extends Module {
   public static final ViewArmorDurability viewArmorDurability = new ViewArmorDurability();
   public final BooleanSetting naSebe = new BooleanSetting("module.viewArmorDurability.naSebe", true);
   public final BooleanSetting naEnemies = new BooleanSetting("module.viewArmorDurability.naEnemies", true);

   public ViewArmorDurability() {
   }

   public boolean on23(ItemStack var1, boolean var2) {
      if (var1 == null || var1.isEmpty()) {
         return false;
      } else if (!(var1.getItem() instanceof ArmorItem)) {
         return false;
      } else {
         return var2 && !this.naSebe.isEnabled() ? false : !var2 || this.naEnemies.isEnabled();
      }
   }

   public int Event01(ItemStack var1) {
      return var1.getItemBarColor();
   }
}
