package fun.wonderful.client.modules;

import fun.wonderful.Wonderful;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.notification.NotificationManager;
import fun.wonderful.client.modules.settings.Setting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import lombok.Generated;

public abstract class Module
implements QClient {
    private String name;
    private String description;
    private int key;
    private ModuleCategory category;
    private boolean isOpen;
    private boolean enable;
    private final List<Setting> settings = new ArrayList<Setting>();
    private final AnimationUtils animka = new AnimationUtils(60.0f, 11.0f, Easings.LINEAR);
    private final AnimationUtils arrayAnimka = new AnimationUtils(0.0f, 11.0f, Easings.LINEAR);

    public Module(String name, String description, ModuleCategory category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.key = -1;
    }

    public Module(String name, ModuleCategory category) {
        this.name = name;
        this.description = "NULLABLE";
        this.category = category;
        this.key = -1;
    }

    public void onEnable() {
        this.enable = true;
        EventInvoker.register(this);
        this.animka.update(1.0f);
        NotificationManager.push(this.name, this.category.getIcons(), true);
    }

    public void onDisable() {
        this.enable = false;
        EventInvoker.unregister(this);
        this.animka.update(0.0f);
        NotificationManager.push(this.name, this.category.getIcons(), false);
    }

    public void toggle() {
        boolean bl = this.enable = !this.enable;
        if (this.enable) {
            this.onEnable();
        } else {
            this.onDisable();
        }
    }

    public void setEnabled(boolean state) {
        boolean lastState = this.enable;
        this.enable = state;
        try {
            if (state) {
                this.onEnable();
            } else if (lastState) {
                this.onDisable();
            }
        }
        catch (Exception e2) {
            this.enable = false;
            this.onDisable();
        }
    }

    public void addSettings(Setting ... settings) {
        if (settings == null || settings.length == 0) {
            return;
        }
        Arrays.stream(settings).filter(Objects::nonNull).forEach(this.settings::add);
    }

    public String getDisplayName() {
        return Wonderful.INSTANCE.localizationStorage == null ? this.name : Wonderful.INSTANCE.localizationStorage.translate(this.name);
    }

    public String getDisplayDescription() {
        return Wonderful.INSTANCE.localizationStorage == null ? this.description : Wonderful.INSTANCE.localizationStorage.translate(this.description);
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public int getKey() {
        return this.key;
    }

    @Generated
    public ModuleCategory getCategory() {
        return this.category;
    }

    @Generated
    public boolean isOpen() {
        return this.isOpen;
    }

    @Generated
    public boolean isEnable() {
        return this.enable;
    }

    @Generated
    public List<Setting> getSettings() {
        return this.settings;
    }

    @Generated
    public AnimationUtils getAnimka() {
        return this.animka;
    }

    @Generated
    public AnimationUtils getArrayAnimka() {
        return this.arrayAnimka;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setKey(int key) {
        this.key = key;
    }

    @Generated
    public void setCategory(ModuleCategory category) {
        this.category = category;
    }

    @Generated
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Generated
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public static enum ModuleCategory {
        COMBAT("Combat", "B"),
        MOVEMENT("Movement", "C"),
        RENDER("Render", "E"),
        MISC("Misc", "D"),
        PLAYER("Player", "A");

        private final String name;
        private final String icons;

        @Generated
        private ModuleCategory(String name, String icons) {
            this.name = name;
            this.icons = icons;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getIcons() {
            return this.icons;
        }
    }
}