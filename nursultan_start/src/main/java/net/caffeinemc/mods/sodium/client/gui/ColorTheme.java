/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gui;

import java.util.stream.Stream;
import net.caffeinemc.mods.sodium.client.gui.Colors;

public class ColorTheme {
    public final int theme;
    public final int themeLighter;
    public final int themeDarker;
    public static final ColorTheme[] PRESETS = (ColorTheme[])Stream.of(-1796955, -5532444, -3283820, -2911004, -1780844).map(ColorTheme::new).toArray(ColorTheme[]::new);

    private static /* synthetic */ ColorTheme[] lambda$static$0(int n) {
        return new ColorTheme[n];
    }

    public ColorTheme(int n, int n2, int n3) {
        this.theme = n;
        this.themeLighter = n2;
        this.themeDarker = n3;
    }

    public ColorTheme(int n) {
        this(n, Colors.lighten(n), Colors.darken(n));
    }
}

