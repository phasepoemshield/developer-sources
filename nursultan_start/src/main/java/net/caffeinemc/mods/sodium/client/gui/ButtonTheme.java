/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gui;

import net.caffeinemc.mods.sodium.client.gui.ColorTheme;

public class ButtonTheme
extends ColorTheme {
    public final int bgHighlight;
    public final int bgDefault;
    public final int bgInactive;

    public ButtonTheme(int n, int n2, int n3, int n4, int n5, int n6) {
        super(n, n2, n3);
        this.bgHighlight = n4;
        this.bgDefault = n5;
        this.bgInactive = n6;
    }

    public ButtonTheme(ColorTheme colorTheme, int n, int n2, int n3) {
        this(colorTheme.theme, colorTheme.themeLighter, colorTheme.themeDarker, n, n2, n3);
    }
}

