package sky.core.util;

import sky.core.module.impl.visuals.NoRender;

public final class NoRenderUtil {
    public enum Type {
        FIRE,
        BOSSBAR,
        SCOREBOARD,
        TITLE,
        TOTEM,
        CAMERA_CLIP,
        FISHING_ROD,
        RAIN,
        SHADOWS,
        GLOWING,
        VIGNETTE,
        ARROWS,
        HOLOGRAMS,
        GRASS,
        BAD_EFFECTS,
        UNDERWATER_BLUR
    }

    private NoRenderUtil() {
    }

    public static boolean shouldCancel(Type type) {
        NoRender module = NoRender.INSTANCE;
        if (!module.isEnabled()) {
            return false;
        }

        return switch (type) {
            case FIRE -> module.mode.is("Огонь");
            case BOSSBAR -> module.mode.is("Босс-бар");
            case SCOREBOARD -> module.mode.is("Скорборд");
            case TITLE -> module.mode.is("Тайтлы");
            case TOTEM -> module.mode.is("Снесение тотема");
            case CAMERA_CLIP -> module.mode.is("Камера клип");
            case FISHING_ROD -> module.mode.is("Удочка на экране");
            case RAIN -> module.mode.is("Дождь");
            case SHADOWS -> module.mode.is("Тени");
            case GLOWING -> module.mode.is("Свечение игроков");
            case VIGNETTE -> module.mode.is("Виньетка");
            case ARROWS -> module.mode.is("Стрелы в игроке");
            case HOLOGRAMS -> module.mode.is("Голограммы");
            case GRASS -> module.mode.is("Трава");
            case BAD_EFFECTS -> module.mode.is("Плохие эффекты");
            case UNDERWATER_BLUR -> module.mode.is("Размытие под водой");
        };
    }
}
