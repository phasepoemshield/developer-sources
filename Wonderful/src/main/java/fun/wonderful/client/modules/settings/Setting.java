package fun.wonderful.client.modules.settings;

import fun.wonderful.Wonderful;
import fun.wonderful.api.QClient;
import java.awt.Color;
import java.util.function.Supplier;
import lombok.Generated;

public abstract class Setting
implements QClient {
    private final String name;
    public Supplier<Boolean> visible = () -> true;
    public Color color = Color.WHITE;

    public Setting(String name) {
        this.name = name;
    }

    public Boolean visible() {
        return this.visible.get();
    }

    public String displayName() {
        return Wonderful.INSTANCE.localizationStorage == null ? this.name : Wonderful.INSTANCE.localizationStorage.translate(this.name);
    }

    @Generated
    public String name() {
        return this.name;
    }

    @Generated
    public Color color() {
        return this.color;
    }
}