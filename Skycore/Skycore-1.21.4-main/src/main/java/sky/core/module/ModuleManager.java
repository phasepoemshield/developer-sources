package sky.core.module;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;
import sky.core.ui.gui.click.ClickGuiScreen;
import sky.core.ui.gui.click.theme.Themes;
import com.darkmagician6.eventapi.EventManager;
import sky.core.module.impl.combat.HitBoxModule;
import sky.core.module.impl.misc.ScoreboardHealth;
import sky.core.module.impl.movement.SprintModule;
import sky.core.module.impl.visuals.NoRender;
import sky.core.module.impl.visuals.InterfaceModule;
import sky.core.module.impl.visuals.TagsModule;
import sky.core.module.impl.visuals.TestModule;

public final class ModuleManager {
    private static final int CLICK_GUI_KEY = GLFW.GLFW_KEY_RIGHT_SHIFT;

    private final List<Module> modules = new ArrayList<>();
    private final Map<Module, Boolean> moduleKeyStates = new HashMap<>();
    private final MinecraftClient client = MinecraftClient.getInstance();

    private ClickGuiScreen clickGui;
    private boolean clickGuiKeyDown;

    public void init() {
        Module.setSuppressToggleEffects(true);
        this.register(
                InterfaceModule.INSTANCE,
                TagsModule.INSTANCE,
                TestModule.INSTANCE,
                HitBoxModule.INSTANCE,
                NoRender.INSTANCE,
                ScoreboardHealth.INSTANCE,
                SprintModule.INSTANCE
        );
        NoRender.INSTANCE.registerTickEvents();
        Module.setSuppressToggleEffects(false);
        for (Module module : this.modules) {
            if (module.isEnabled()) {
                module.registerEvents();
            }
        }
        EventManager.register(this);
        this.modules.sort(Comparator.comparing(Module::getName, String.CASE_INSENSITIVE_ORDER));
        this.clickGui = new ClickGuiScreen();

        ClientTickEvents.END_CLIENT_TICK.register(mc -> this.onTick());
    }

    private void register(Module... modulesToAdd) {
        for (Module module : modulesToAdd) {
            this.modules.add(module);
        }
    }

    public List<Module> getModules() {
        return this.modules;
    }

    public List<Module> getModules(Category category) {
        return this.modules.stream().filter(module -> module.getCategory() == category).toList();
    }

    @SuppressWarnings("unchecked")
    public <T extends Module> T getModule(Class<T> type) {
        for (Module module : this.modules) {
            if (type.isInstance(module)) {
                return (T) module;
            }
        }
        return null;
    }

    public ClickGuiScreen getClickGui() {
        return this.clickGui;
    }

    private void onTick() {
        Themes.update();

        if (this.client.currentScreen instanceof ClickGuiScreen) {
            return;
        }

        long window = this.client.getWindow().getHandle();
        boolean clickGuiPressed = GLFW.glfwGetKey(window, CLICK_GUI_KEY) == GLFW.GLFW_PRESS;
        if (clickGuiPressed && !this.clickGuiKeyDown) {
            this.client.setScreen(this.clickGui);
        }
        this.clickGuiKeyDown = clickGuiPressed;

        for (Module module : this.modules) {
            int keyBind = module.getKeyBind();
            if (keyBind <= 0) {
                continue;
            }

            boolean pressed = GLFW.glfwGetKey(window, keyBind) == GLFW.GLFW_PRESS;
            boolean wasDown = this.moduleKeyStates.getOrDefault(module, false);
            if (pressed && !wasDown) {
                module.toggle();
            }
            this.moduleKeyStates.put(module, pressed);
        }
    }
}
