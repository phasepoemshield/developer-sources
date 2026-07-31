package sky.core.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.darkmagician6.eventapi.EventManager;
import sky.core.module.setting.Setting;
import sky.core.ui.hud.HudElementManager;

public abstract class Module {
    private static boolean suppressToggleEffects;

    private final String name;
    private final String description;
    private final Category category;
    private final List<Setting<?>> settings = new ArrayList<>();

    private boolean enabled;
    private int keyBind = -1;

    public static void setSuppressToggleEffects(boolean suppress) {
        suppressToggleEffects = suppress;
    }

    protected Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Category getCategory() {
        return this.category;
    }

    public List<Setting<?>> getSettings() {
        return Collections.unmodifiableList(this.settings);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public int getKeyBind() {
        return this.keyBind;
    }

    public void setKeyBind(int keyBind) {
        this.keyBind = keyBind;
    }

    protected void addSettings(Setting<?>... settings) {
        Collections.addAll(this.settings, settings);
    }

    public void toggle() {
        this.setEnabled(!this.enabled);
    }

    public void setEnabled(boolean enabled) {
        if (this.enabled == enabled) {
            return;
        }
        this.enabled = enabled;
        if (suppressToggleEffects) {
            return;
        }
        HudElementManager.getInstance().notifications.push(this, enabled);
        if (enabled) {
            this.onEnable();
        } else {
            this.onDisable();
        }
    }

    public void registerEvents() {
        EventManager.register(this);
    }

    public void unregisterEvents() {
        EventManager.unregister(this);
    }

    public void resetState() {
        this.enabled = false;
        this.keyBind = -1;
        for (Setting<?> setting : this.settings) {
            setting.reset();
        }
    }

    protected void onEnable() {
        this.registerEvents();
    }

    protected void onDisable() {
        this.unregisterEvents();
    }
}
