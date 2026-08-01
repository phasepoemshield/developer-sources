package sky.core.module.impl.misc;

import sky.core.module.Category;
import sky.core.module.Module;

public final class ScoreboardHealth extends Module {
    public static final ScoreboardHealth INSTANCE = new ScoreboardHealth();

    private ScoreboardHealth() {
        super("Scoreboard Health", "Альтернативный метод получения здоровья противника", Category.MISC);
    }
}
