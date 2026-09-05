/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03448
 *  minecraft.class05096
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.gui.VoiceChatScreenBase$HoverArea;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03448;
import minecraft.class05096;
import minecraft.class06541;

public abstract class VoiceChatScreenBase
extends class05096 {
    public static final int FONT_COLOR = -12566464;
    protected List<VoiceChatScreenBase$HoverArea> hoverAreas;
    protected int guiLeft;
    protected int guiTop;
    protected int xSize;
    protected int ySize;

    public VoiceChatScreenBase(class00392 class003922, int n, int n2) {
        super(class003922);
        this.xSize = n;
        this.ySize = n2;
        this.hoverAreas = new ArrayList<VoiceChatScreenBase$HoverArea>();
    }

    public void method_25426() {
        this.method_37067();
        super.method_25426();
        this.guiLeft = (this.field_22789 - this.xSize) / 2;
        this.guiTop = (this.field_22790 - this.ySize) / 2;
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.isIngame()) {
            this.method_52752(class010542);
        } else {
            this.method_57728(class010542, f);
            this.method_57734(class010542);
        }
        this.method_25420(class010542, n, n2, f);
        super.method_25394(class010542, n, n2, f);
        this.renderForeground(class010542, n, n2, f);
    }

    protected int getFontColor() {
        return this.isIngame() ? -12566464 : class06541.field_1068.i();
    }

    public void drawHoverAreas(class01054 class010542, int n, int n2) {
        for (VoiceChatScreenBase$HoverArea voiceChatScreenBase$HoverArea : this.hoverAreas) {
            if (voiceChatScreenBase$HoverArea.tooltip == null || !voiceChatScreenBase$HoverArea.isHovered(this.guiLeft, this.guiTop, n, n2)) continue;
            class010542.y((class01590)this.field_22787.i_3, voiceChatScreenBase$HoverArea.tooltip.get(), n - this.guiLeft, n2 - this.guiTop);
        }
    }

    public void renderForeground(class01054 class010542, int n, int n2, float f) {
    }

    public int getGuiLeft() {
        return this.guiLeft;
    }

    public int getGuiTop() {
        return this.guiTop;
    }

    protected boolean isIngame() {
        return (class03448)this.field_22787.T_3 != null;
    }
}

