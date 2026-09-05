/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 *  net.caffeinemc.mods.sodium.client.gui.Colors
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.Colors;

public class ColorThemeBuilderImpl
implements ColorThemeBuilder {
    private static final float MIN_THEME_SATURATION = 0.2f;
    private static final float MIN_THEME_BRIGHTNESS = 0.55f;
    private int baseTheme;
    private int themeHighlight;
    private int themeDisabled;

    ColorTheme build() {
        if (this.baseTheme == 0) {
            throw new IllegalStateException("Base theme must be set");
        }
        this.baseTheme = Colors.constrainColorHSV((int)this.baseTheme, (float)0.2f, (float)0.55f);
        if (this.themeHighlight == 0 || this.themeDisabled == 0) {
            return new ColorTheme(this.baseTheme);
        }
        this.themeHighlight = Colors.constrainColorHSV((int)this.themeHighlight, (float)0.2f, (float)0.55f);
        this.themeDisabled = Colors.constrainColorHSV((int)this.themeDisabled, (float)0.2f, (float)0.0f);
        return new ColorTheme(this.baseTheme, this.themeHighlight, this.themeDisabled);
    }

    public ColorThemeBuilder setBaseThemeRGB(int n) {
        this.baseTheme = n | 0xFF000000;
        return this;
    }

    public ColorThemeBuilder setFullThemeRGB(int n, int n2, int n3) {
        this.baseTheme = n | 0xFF000000;
        this.themeHighlight = n2 | 0xFF000000;
        this.themeDisabled = n3 | 0xFF000000;
        return this;
    }
}

