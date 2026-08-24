package org.zenith.module;

import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;

import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting_Var159;
import org.zenith.setting.NumberSetting;





@ModuleInfo(
   name = "Reach",
   category = Category.COMBAT,
   description = ""
)
public final class Reach extends Module {
   public static final Reach reach2 = new Reach();
   public final ModeSetting mods2 = new ModeSetting("module.reach.mods", "module.reach.mods.desc");
   public final ModeSetting_Var159 modeSettingVar15914 = new ModeSetting_Var159(
      this.mods2, "module.reach.defoult", true
   );
   public final NumberSetting reach = new NumberSetting(
      "module.reach.reach", 3.0F, 3.0F, 6.0F, 0.05F, "module.reach.reach.desc", "b", this.modeSettingVar15914::isEnabled, null
   );
   public final NumberSetting reachBlock = new NumberSetting(
      "module.reach.reachBlock", 3.0F, 3.0F, 20.0F, 0.05F, "module.reach.reachBlock.desc", "b", this.modeSettingVar15914::isEnabled, null
   );

   public Reach() {
   }
}
