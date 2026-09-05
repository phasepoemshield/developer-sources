/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class01028
 */
package de.maxhenkel.voicechat.gui;

import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class01028;

public class VoiceChatScreenBase$HoverArea {
    private final int posX;
    private final int posY;
    private final int width;
    private final int height;
    @Nullable
    final Supplier<List<class01028>> tooltip;

    public VoiceChatScreenBase$HoverArea(int n, int n2, int n3, int n4) {
        this(n, n2, n3, n4, null);
    }

    public VoiceChatScreenBase$HoverArea(int n, int n2, int n3, int n4, Supplier<List<class01028>> supplier) {
        this.posX = n;
        this.posY = n2;
        this.width = n3;
        this.height = n4;
        this.tooltip = supplier;
    }

    @Nullable
    public Supplier<List<class01028>> getTooltip() {
        return this.tooltip;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isHovered(int n, int n2, int n3, int n4) {
        return n3 >= n + this.posX && n3 < n + this.posX + this.width && n4 >= n2 + this.posY && n4 < n2 + this.posY + this.height;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }
}

