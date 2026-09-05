/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06202
 *  minecraft.class06221
 *  net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class06202;
import minecraft.class06221;
import net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;

public class ControlValueFormatterImpls {
    public static ControlValueFormatter resolution() {
        return n -> {
            class06221 class062212 = class06202.Nq().Nt().v();
            OsUtils.OperatingSystem operatingSystem = OsUtils.getOs();
            if (class062212 == null || operatingSystem != OsUtils.OperatingSystem.WIN && operatingSystem != OsUtils.OperatingSystem.MAC) {
                return class00392.i();
            }
            if (0 == n) {
                return class00392.L((String)"options.fullscreen.current");
            }
            return class00392.y((String)class062212.N(Math.min(n - 1, class062212.i() - 1)).toString().replace(" (24bit)", ""));
        };
    }

    public static ControlValueFormatter multiplier() {
        return n -> class00392.y((String)(n + "x"));
    }

    private ControlValueFormatterImpls() {
    }

    public static ControlValueFormatter number() {
        return n -> class00392.y((String)String.valueOf(n));
    }

    public static ControlValueFormatter brightness() {
        return n -> {
            if (n == 0) {
                return class00392.L((String)"options.gamma.min");
            }
            if (n == 50) {
                return class00392.L((String)"options.gamma.default");
            }
            if (n == 100) {
                return class00392.L((String)"options.gamma.max");
            }
            return class00392.y((String)(n + "%"));
        };
    }

    public static ControlValueFormatter percentage() {
        return n -> class00392.y((String)(n + "%"));
    }

    public static ControlValueFormatter guiScale() {
        return n -> n == 0 ? class00392.L((String)"options.guiScale.auto") : class00392.y((String)(n + "x"));
    }

    public static ControlValueFormatter biomeBlend() {
        return n -> {
            if (n < 0 || n > 7) {
                return class00392.N((String)"parsing.int.invalid", (Object[])new Object[]{n});
            }
            if (n == 0) {
                return class00392.L((String)"gui.none");
            }
            int n2 = 2 * n + 1;
            return class00392.N((String)"sodium.options.biome_blend.value", (Object[])new Object[]{n2, n2});
        };
    }

    public static ControlValueFormatter fpsLimit() {
        return n -> n == 260 ? class00392.L((String)"options.framerateLimit.max") : class00392.N((String)"options.framerate", (Object[])new Object[]{n});
    }

    public static ControlValueFormatter chunkFade() {
        return n -> {
            if (n == 0) {
                return class00392.L((String)"gui.none");
            }
            return class00392.N((String)"sodium.options.chunk_fade_time.value", (Object[])new Object[]{(double)n / 1000.0});
        };
    }

    public static ControlValueFormatter translateVariable(String string) {
        return n -> class00392.N((String)string, (Object[])new Object[]{n});
    }

    public static ControlValueFormatter anisotropyBit() {
        return n -> {
            if (n == 0) {
                return class00392.L((String)"options.off");
            }
            return class00392.y((String)((1 << n) + "x"));
        };
    }

    public static ControlValueFormatter quantityOrDisabled(IntFunction<class00392> intFunction, class00392 class003922) {
        return n -> n == 0 ? class003922 : (class00392)intFunction.apply(n);
    }
}

