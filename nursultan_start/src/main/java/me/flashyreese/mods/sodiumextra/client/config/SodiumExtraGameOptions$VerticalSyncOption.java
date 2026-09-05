/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.gui.options.TextProvider
 *  org.lwjgl.glfw.GLFW
 */
package me.flashyreese.mods.sodiumextra.client.config;

import java.util.Arrays;
import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.gui.options.TextProvider;
import org.lwjgl.glfw.GLFW;

public enum SodiumExtraGameOptions$VerticalSyncOption implements TextProvider
{
    OFF("options.off"),
    ON("options.on"),
    ADAPTIVE("sodium-extra.option.use_adaptive_sync.name", GLFW.glfwExtensionSupported((CharSequence)"GLX_EXT_swap_control_tear") || GLFW.glfwExtensionSupported((CharSequence)"WGL_EXT_swap_control_tear"));

    private final class00392 name;
    private final boolean supported;

    private SodiumExtraGameOptions$VerticalSyncOption(String string2, boolean bl) {
        this.name = class00392.L((String)string2);
        this.supported = bl;
    }

    private SodiumExtraGameOptions$VerticalSyncOption(String string2) {
        this(string2, true);
    }

    public class00392 getLocalizedName() {
        return this.name;
    }

    public static SodiumExtraGameOptions$VerticalSyncOption[] getAvailableOptions() {
        return (SodiumExtraGameOptions$VerticalSyncOption[])Arrays.stream(SodiumExtraGameOptions$VerticalSyncOption.values()).filter(sodiumExtraGameOptions$VerticalSyncOption -> sodiumExtraGameOptions$VerticalSyncOption.supported).toArray(SodiumExtraGameOptions$VerticalSyncOption[]::new);
    }
}

