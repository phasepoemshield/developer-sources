package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.OptimizedUpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import net.minecraft.entity.effect.StatusEffects;

@FunctionAdd(name = "NoEffects", alias = "No Effects", category = Category.Utilities, description = "Убирает выбранные эффекты")
public class NoEffects extends Function {
    public ModeListSetting modeListSetting = new ModeListSetting("Убирать",
            new BooleanSetting("Ночное зрение", false),
            new BooleanSetting("Тьма", false),
            new BooleanSetting("Свечение", false));

    public NoEffects() {
        addSettings(modeListSetting);
    }

    @EventHandler
    public void onUpdate(OptimizedUpdateEvent event) {
        if (mc.player == null || mc.world == null) return;

        if (modeListSetting.getByName("Ночное зрение").get()) {
            mc.player.removeStatusEffect(StatusEffects.NIGHT_VISION);
        }
        if (modeListSetting.getByName("Тьма").get()) {
            mc.player.removeStatusEffect(StatusEffects.DARKNESS);
        }
    }
}