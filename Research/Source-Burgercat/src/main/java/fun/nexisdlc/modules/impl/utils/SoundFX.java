package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "SoundFX", alias = "Sound FX", category = Category.Utilities, description = "Кастомные клиентские звуки")
public class SoundFX extends Function {
    public ModeSetting mode = new ModeSetting("Звук: ", "Первый", "Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый");
    public SliderSetting volume = new SliderSetting("Громкость: ", 80.0f, 50.0f, 100.0f, 1.0f);

    public SoundFX() {
        addSettings(mode, volume);
    }

    public String getFileName(boolean state) {
        switch (mode.get()) {
            case "Первый" -> {
                return state ? "first_on" : "first_off".toString();
            }
            case "Второй" -> {
                return state ? "two_on" : "two_off".toString();
            }
            case "Третий" -> {
                return state ? "three_on" : "three_off".toString();
            }
            case "Четвёртый" -> {
                return state ? "four_on" : "four_off".toString();
            }
            case "Пятый" -> {
                return state ? "five_on" : "five_off".toString();
            }
            case "Шестой" -> {
                return "six_on".toString();
            }
            case "Седьмой" -> {
                return "seven_on".toString();
            }
            case "Восьмой" -> {
                return state ? "enabled" : "disabled".toString();
            }
            case "Девятый" -> {
                return state ? "enable" : "disable".toString();
            }
            case "Десятый" -> {
                return state ? "enable3" : "disable3".toString();
            }
        }
        return "";
    }

    /**
     * Gets the filename for preview purposes (uses enabled state)
     */
    public String getPreviewFileName() {
        return getFileName(true);
    }
}