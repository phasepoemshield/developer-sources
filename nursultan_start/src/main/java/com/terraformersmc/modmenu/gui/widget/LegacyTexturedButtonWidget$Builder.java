/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05361
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05361;

public class LegacyTexturedButtonWidget$Builder {
    private final class00392 message;
    private final class05361 onPress;
    private int x;
    private int y;
    private int width;
    private int height;
    private int u;
    private int v;
    private int hoveredVOffset;
    private class01894 texture;
    private int textureWidth;
    private int textureHeight;

    public LegacyTexturedButtonWidget$Builder(class00392 class003922, class05361 class053612) {
        this.message = class003922;
        this.onPress = class053612;
    }

    public LegacyTexturedButtonWidget$Builder size(int n, int n2) {
        this.width = n;
        this.height = n2;
        return this;
    }

    public LegacyTexturedButtonWidget$Builder position(int n, int n2) {
        this.x = n;
        this.y = n2;
        return this;
    }

    public LegacyTexturedButtonWidget build() {
        return new LegacyTexturedButtonWidget(this.x, this.y, this.width, this.height, this.u, this.v, this.hoveredVOffset, this.texture, this.textureWidth, this.textureHeight, this.onPress, this.message);
    }

    public LegacyTexturedButtonWidget$Builder uv(int n, int n2, int n3) {
        this.u = n;
        this.v = n2;
        this.hoveredVOffset = n3;
        return this;
    }

    public LegacyTexturedButtonWidget$Builder texture(class01894 class018942, int n, int n2) {
        this.texture = class018942;
        this.textureWidth = n;
        this.textureHeight = n2;
        return this;
    }
}

