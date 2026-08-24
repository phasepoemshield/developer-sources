package moscow.rockstar.module.movement;

import lombok.Generated;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.game.EntityUtility;
@ModuleInfo(name = "Timer", category = ModuleCategory.MOVEMENT, desc = "Изменение скорости игрового времени (тиков)")
public class Timer extends BaseModule {
   private final SliderSetting speed = new SliderSetting(this, "Скорость").step(0.1F).min(0.1F).max(15.0F).currentValue(1.0F);
   @Override
   public void tick() {
      EntityUtility.setTimer(this.speed.getCurrentValue());
      super.tick();
   }

   @Override
   public void onDisable() {
      EntityUtility.resetTimer();
      super.onDisable();
   }

   @Generated
   public SliderSetting getSpeed() {
      return this.speed;
   }
}
