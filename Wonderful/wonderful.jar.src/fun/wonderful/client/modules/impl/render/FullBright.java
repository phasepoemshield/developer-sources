package fun.wonderful.client.modules.impl.render;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FullBright
extends Module {
    public static FullBright INSTANCE = new FullBright();

    public FullBright() {
        super("FullBright", "Всегда светло", Module.ModuleCategory.RENDER);
    }

    @EventLink
    public void onUpdate(EventUpdate ignored) {
        if (FullBright.mc.player == null || FullBright.mc.world == null) {
            return;
        }
        FullBright.mc.player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 777, 1));
    }

    @Override
    public void onDisable() {
        if (FullBright.mc.player == null || FullBright.mc.world == null) {
            return;
        }
        FullBright.mc.player.removeStatusEffect(StatusEffects.NIGHT_VISION);
        super.onDisable();
    }
}