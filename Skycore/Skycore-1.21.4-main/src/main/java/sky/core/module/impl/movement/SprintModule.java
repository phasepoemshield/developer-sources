package sky.core.module.impl.movement;

import sky.core.module.Category;
import sky.core.module.Module;

public final class SprintModule extends Module {
    public static final SprintModule INSTANCE = new SprintModule();

    private SprintModule() {
        super("Sprint", "Always sprint", Category.MOVEMENT);
    }
}
