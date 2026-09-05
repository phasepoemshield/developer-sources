/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class07536
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components;

import java.util.Objects;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class07536;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class TabHeaderComponent
extends AbstractWidget {
    private static final float SCROLL_SPEED_PX_PER_SEC = 10.0f;
    private static final int TEXT_PADDING_RIGHT = 2;
    private static final long DWELL_MS = 1000L;
    private final ModOptions modOptions;

    public TabHeaderComponent(Dim2i dim2i, ModOptions modOptions) {
        super(dim2i);
        this.modOptions = modOptions;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.applyScissor(class010542, this.getX(), this.getY(), this.getWidth(), this.getHeight(), () -> {
            int n;
            this.drawRect(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), ColorARGB.pack((int)0, (int)0, (int)0, (int)245));
            this.drawRect(class010542, this.getX(), this.getLimitY() - 1, this.getLimitX(), this.getLimitY(), this.modOptions.theme().themeLighter);
            if (this.modOptions.icon() == null) {
                n = 2;
            } else {
                VideoSettingsScreen.renderIconWithSpacing((class01054)class010542, (class01894)this.modOptions.icon(), (int)this.modOptions.theme().themeLighter, (boolean)this.modOptions.iconMonochrome(), (int)this.getX(), (int)this.getY(), (int)this.getHeight(), (int)2);
                n = this.getHeight() + 2;
            }
            int n2 = this.getX() + n;
            int n3 = this.getX() + this.getWidth() - n2 - 2;
            this.drawScrollingString(class010542, this.modOptions.name(), n2, this.getY() + 2, this.modOptions.theme().themeLighter, n3);
            this.drawScrollingString(class010542, this.modOptions.version(), n2, this.getY() + 12, this.modOptions.theme().themeDarker, n3);
        });
    }

    public void applyScissor(class01054 class010542, int n, int n2, int n3, int n4, Runnable runnable) {
        class010542.L(n, n2, n + n3, n2 + n4);
        runnable.run();
        class010542.R();
    }

    private void drawScrollingString(class01054 class010542, String string, int n, int n2, int n3, int n4) {
        double d;
        double d2;
        long l;
        long l2;
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        if (n4 <= 0 || string == null || string.isEmpty()) {
            return;
        }
        int n5 = class015902.y(string);
        Objects.requireNonNull(class015902);
        int n6 = 9;
        if (n5 <= n4) {
            class010542.N(class015902, string, n, n2, n3, false);
            return;
        }
        int n7 = n5 - n4;
        long l3 = class07536.L();
        long l4 = l3 % (l2 = 1000L + (l = Math.max(1L, (long)Math.ceil((double)n7 / (d2 = 0.01)))) + 1000L + l);
        if (l4 < 1000L) {
            d = 0.0;
        } else if (l4 < 1000L + l) {
            long l5 = l4 - 1000L;
            d = Math.min((double)n7, (double)l5 * d2);
        } else if (l4 < 1000L + l + 1000L) {
            d = n7;
        } else {
            long l6 = l4 - (1000L + l + 1000L);
            d = Math.max(0.0, (double)n7 - (double)l6 * d2);
        }
        this.applyScissor(class010542, n, n2, n4, n6, () -> class010542.N(class015902, string, (int)((double)n - d), n2, n3, false));
    }
}

