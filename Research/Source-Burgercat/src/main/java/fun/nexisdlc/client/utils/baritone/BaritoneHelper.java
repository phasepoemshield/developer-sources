package fun.nexisdlc.client.utils.baritone;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

/**
 * Безопасная обёртка над Baritone API.
 * Все вызовы к Baritone проходят через этот класс.
 * Если Baritone не установлен — методы возвращают false / ничего не делают.
 */
public final class BaritoneHelper {

    private static Boolean available = null;
    private static Object baritoneInstance = null;

    private BaritoneHelper() {
    }

    // ══════════════════════════════════════════════════════════════
    //  Проверка доступности
    // ══════════════════════════════════════════════════════════════

    /**
     * Проверяет, установлен ли Baritone.
     * Результат кэшируется после первого вызова.
     */
    public static boolean isAvailable() {
        if (available == null) {
            available = checkBaritonePresence();
        }
        return available;
    }

    private static boolean checkBaritonePresence() {
        try {
            // Пробуем загрузить основной класс Baritone API
            Class.forName("baritone.api.BaritoneAPI");
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            return false;
        }
    }

    /**
     * Сбрасывает кэш (полезно при hot-reload, если такое есть)
     */
    public static void resetCache() {
        available = null;
        baritoneInstance = null;
    }

    // ══════════════════════════════════════════════════════════════
    //  Основные методы — делегируют в BaritoneAccessor
    // ══════════════════════════════════════════════════════════════

    /**
     * Запускает добычу указанных блоков.
     *
     * @return true если команда принята, false если Baritone недоступен
     */
    public static boolean mine(Block... blocks) {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.mine(blocks);
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Идёт к указанной позиции (в радиусе range блоков).
     */
    public static boolean goTo(BlockPos pos, int range) {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.goTo(pos, range);
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Идёт к точной позиции.
     */
    public static boolean goToExact(BlockPos pos) {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.goToExact(pos);
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Останавливает все процессы Baritone.
     */
    public static boolean stop() {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.stop();
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Проверяет, идёт ли сейчас патхфайндинг.
     */
    public static boolean isPathing() {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.isPathing();
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Проверяет, активен ли процесс Mine.
     */
    public static boolean isMining() {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.isMining();
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Отменяет процесс Mine.
     */
    public static boolean cancelMine() {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.cancelMine();
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Применяет настройки Baritone для AutoMine.
     */
    public static boolean applySettings(boolean enable, double blockBreakDelay) {
        return applySettings(enable, blockBreakDelay, false);
    }

    /**
     * Применяет настройки Baritone с управлением нативным рендером пути/цели.
     */
    public static boolean applySettings(boolean enable, double blockBreakDelay, boolean renderPath) {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.applySettings(enable, blockBreakDelay, renderPath);
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }

    /**
     * Пауза Baritone (без потери цели). true = пауза, false = снять.
     */
    public static boolean setPaused(boolean paused) {
        if (!isAvailable()) return false;
        try {
            return BaritoneAccessor.setPaused(paused);
        } catch (NoClassDefFoundError | Exception e) {
            available = false;
            return false;
        }
    }
}
