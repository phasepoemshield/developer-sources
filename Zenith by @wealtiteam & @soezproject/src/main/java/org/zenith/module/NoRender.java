package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.ZenithClient;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;

import org.zenith.setting.ModeSetting;




import java.util.List;

@ModuleInfo(
   name = "NoRender",
   category = Category.RENDER,
   description = "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u043b\u0438\u0448\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u0441 \u044d\u043a\u0440\u0430\u043d\u0430"
)
public final class NoRender extends Module {
   public static final NoRender noRender = new NoRender();
   public final ModeSetting modeSetting13 = ModeSetting.on23(
      "module.noRender.settings",
      "module.noRender.settings.desc",
      List.of("module.noRender.fire", "module.noRender.badEffects", "module.noRender.blockOverlay", "module.noRender.scoreBoard")
   );

   public NoRender() {
   }

   public boolean float377() {
      return this.isEnabled() && this.modeSetting13.ConfigJsonUtil(2);
   }

   public boolean float378() {
      return this.isEnabled() && this.modeSetting13.ConfigJsonUtil(3);
   }

   public boolean float379() {
      return this.isEnabled() && this.modeSetting13.ConfigJsonUtil(0);
   }

   public boolean float380() {
      return this.isEnabled() && this.modeSetting13.ConfigJsonUtil(1);
   }
}
