package moscow.rockstar.module.misc;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SelectSetting;
import net.minecraft.entity.effect.StatusEffects;
@ModuleInfo(name = "Effect Remover", category = ModuleCategory.OTHER, desc = "Автоматическое снятие негативных эффектов")
public class EffectRemover extends BaseModule {
   private final SelectSetting effectsToRemove = new SelectSetting(this, "Эффекты для снятия");
   private final SelectSetting.Value levitation = new SelectSetting.Value(this.effectsToRemove, "Левитация").select();
   private final SelectSetting.Value jumpBoost = new SelectSetting.Value(this.effectsToRemove, "Прыгучесть").select();
   private final SelectSetting.Value slowFall = new SelectSetting.Value(this.effectsToRemove, "Медленное падение").select();
   private final EventListener<ClientPlayerTickEvent> onPlayerTick = event -> {
      if (mc.player != null) {
         if (this.levitation.isSelected()) {
            mc.player.removeStatusEffect(StatusEffects.LEVITATION);
         }

         if (this.jumpBoost.isSelected()) {
            mc.player.removeStatusEffect(StatusEffects.JUMP_BOOST);
         }

         if (this.slowFall.isSelected()) {
            mc.player.removeStatusEffect(StatusEffects.SLOW_FALLING);
         }
      }
   };
}
