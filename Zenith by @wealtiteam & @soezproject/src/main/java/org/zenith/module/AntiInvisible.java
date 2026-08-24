package org.zenith.module;

import org.zenith.event.SprintStateEvent;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.VelocityChangeEvent;

import org.zenith.setting.ColorSetting;





import com.darkmagician6.eventapi.EventTarget;

@ModuleInfo(
   name = "Anti Invisible",
   category = Category.RENDER,
   description = "\u0412\u0438\u0434\u043d\u043e \u0438\u043d\u0432\u0438\u0437\u043e\u043a"
)
public final class AntiInvisible extends Module {
   public static final AntiInvisible antiInvisible = new AntiInvisible();
   public final ColorSetting colorSetting = new ColorSetting(
      "module.antiInvisible.colorSetting", "module.antiInvisible.colorSetting.desc", ArgbColor.var11934.SprintStateEvent(0.5F)
   );

   public AntiInvisible() {
   }

   @EventTarget
   public void on23(VelocityChangeEvent var1) {
      var1.setColor(this.colorSetting.getColor().call001());
      var1.cancel();
   }

   public ColorSetting float317() {
      return this.colorSetting;
   }
}
