package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "Brightness", alias = "Brightness", description = "Позволяет вам усилить вашу яркость", category = Category.Render)
public class Brightness extends Function {
    private final ModeSetting mode = new ModeSetting("Режим", "Дефолт", "Дефолт", "Адаптивный");
    private final SliderSetting sliderSetting = new SliderSetting("Яркость", 100, 0, 500, 5f);
    private final BindSetting fullBright = new BindSetting("Фулл брайт", -1);
    private boolean fullBrightActive = false;

    private double originalGamma = 1.0;
    private double currentGamma = 1.0;

    public Brightness() {
        addSettings(mode, sliderSetting, fullBright);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        if (mc != null && mc.options != null && mc.options.getGamma() != null) {
            originalGamma = mc.options.getGamma().getValue();
            currentGamma = originalGamma;
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if (mc != null && mc.options != null && mc.options.getGamma() != null) {
            mc.options.getGamma().setValue(originalGamma);
        }
    }

    @EventHandler
    public void onKey(EventKey event) {
        if (nullCheck()) return;

        if (event.isKeyDown(fullBright.get()) && event.getAction() == 1) {
            fullBrightActive = !fullBrightActive;
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;

        if (fullBrightActive) {
            mc.options.getGamma().setValue((double) 100);
            return;
        }

        double maxGamma = (double) (sliderSetting.get() * 0.01f);

        if (mode.is("Дефолт")) {
            mc.options.getGamma().setValue(maxGamma);
            currentGamma = maxGamma;
            return;
        }

        int light;
        try {
            light = mc.world.getLightLevel(mc.player.getBlockPos());
        } catch (Throwable ignored) {
            light = 0;
        }

        final int dark = 4;
        final int bright = 12;
        double factor;
        if (light <= dark) {
            factor = 1.0;
        } else if (light >= bright) {
            factor = 0.0;
        } else {
            factor = 1.0 - ((double) (light - dark) / (double) (bright - dark));
        }

        double target = originalGamma + (maxGamma - originalGamma) * factor;

        currentGamma = currentGamma + (target - currentGamma) * 0.15;
        mc.options.getGamma().setValue(currentGamma);
    }
}
