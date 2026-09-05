/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.annotations.SerializedNameConvention
 *  org.quiltmc.config.api.metadata.NamingScheme
 *  org.quiltmc.config.api.values.TrackedValue
 */
package page.langeweile.ok_zoomer.config.screen;

import java.util.Locale;
import minecraft.class00392;
import minecraft.class01894;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.metadata.NamingScheme;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.ConfigEnums$ConfigEnum;

public class ConfigTextUtils {
    private final Config config;
    private final NamingScheme scheme;

    public ConfigTextUtils(Config config) {
        this.config = config;
        this.scheme = (NamingScheme)this.config.metadata(SerializedNameConvention.TYPE);
    }

    public class00392 getOptionTextTooltip(TrackedValue<?> trackedValue) {
        return class00392.L((String)String.format("config.%s.%s.tooltip", this.config.family(), this.scheme.coerce(trackedValue.key().toString())));
    }

    public class00392 getEnumOptionTextTooltip(TrackedValue<?> trackedValue, ConfigEnums$ConfigEnum configEnums$ConfigEnum) {
        return class00392.L((String)String.format("config.%s.%s.%s.tooltip", this.config.family(), this.scheme.coerce(trackedValue.key().toString()), configEnums$ConfigEnum.toString().toLowerCase(Locale.ROOT)));
    }

    public class00392 getSliderOptionText(TrackedValue<?> trackedValue) {
        return class00392.L((String)String.format("config.%s.%s.%s", this.config.family(), this.scheme.coerce(trackedValue.key().toString()), trackedValue.value()));
    }

    public static class00392 getConfigTitle(class01894 class018942) {
        return class00392.L((String)("config." + class018942.y() + ".title"));
    }

    public class00392 getEnumOptionText(TrackedValue<?> trackedValue, ConfigEnums$ConfigEnum configEnums$ConfigEnum) {
        return class00392.L((String)String.format("config.%s.%s.%s", this.config.family(), this.scheme.coerce(trackedValue.key().toString()), configEnums$ConfigEnum.toString().toLowerCase(Locale.ROOT)));
    }

    public class00392 getCategoryText(String string) {
        return class00392.L((String)("config." + this.config.family() + "." + this.scheme.coerce(string)));
    }

    public class00392 getOptionText(TrackedValue<?> trackedValue) {
        return class00392.L((String)String.format("config.%s.%s", this.config.family(), this.scheme.coerce(trackedValue.key().toString())));
    }
}

