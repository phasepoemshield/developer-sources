/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class06202
 *  minecraft.class06308
 *  minecraft.class06611
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.gui.widgets.ImageButton$PressAction;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class06202;
import minecraft.class06308;
import minecraft.class06611;
import minecraft.class08394;

public class ImageButton
extends class06308 {
    protected class06202 mc = class06202.Nq();
    protected class01894 texture;
    @Nullable
    protected ImageButton$PressAction onPress;
    @Nullable
    protected ImageButton$TooltipSupplier tooltipSupplier;

    public ImageButton(int n, int n2, class01894 class018942, @Nullable ImageButton$PressAction imageButton$PressAction, @Nullable ImageButton$TooltipSupplier imageButton$TooltipSupplier) {
        super(n, n2, 20, 20, (class00392)class00392.i());
        this.texture = class018942;
        this.onPress = imageButton$PressAction;
        this.tooltipSupplier = imageButton$TooltipSupplier;
    }

    public ImageButton(int n, int n2, class01894 class018942, ImageButton$PressAction imageButton$PressAction) {
        this(n, n2, class018942, imageButton$PressAction, null);
    }

    protected void renderImage(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, this.texture, this.method_46426() + 2, this.method_46427() + 2, 16, 16);
    }

    public void method_25306(class06611 class066112) {
        if (this.onPress != null) {
            this.onPress.onPress(this);
        }
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.method_75794(class010542);
        this.renderImage(class010542, n, n2);
        if (this.tooltipSupplier != null) {
            this.tooltipSupplier.updateTooltip(this);
        }
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }
}

