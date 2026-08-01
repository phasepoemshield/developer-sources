package sky.core.ui.gui.click.component;

import java.util.ArrayList;
import java.util.List;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.ModeSetting;
import sky.core.module.setting.MultiBooleanSetting;
import sky.core.module.setting.Setting;
import sky.core.module.setting.SliderSetting;
import sky.core.ui.gui.click.component.impl.BooleanElement;
import sky.core.ui.gui.click.component.impl.ModeElement;
import sky.core.ui.gui.click.component.impl.MultiBooleanElement;
import sky.core.ui.gui.click.component.impl.SliderElement;

public final class SettingElements {
    private SettingElements() {
    }

    public static List<SettingElement> create(List<Setting<?>> settings) {
        List<SettingElement> elements = new ArrayList<>();
        for (Setting<?> setting : settings) {
            if (setting instanceof BooleanSetting booleanSetting) {
                elements.add(new BooleanElement(booleanSetting));
            } else if (setting instanceof MultiBooleanSetting multiBooleanSetting) {
                elements.add(new MultiBooleanElement(multiBooleanSetting));
            } else if (setting instanceof ModeSetting modeSetting) {
                elements.add(new ModeElement(modeSetting));
            } else if (setting instanceof SliderSetting sliderSetting) {
                elements.add(new SliderElement(sliderSetting));
            }
        }
        return elements;
    }
}
