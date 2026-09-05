/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$PressAction;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class08394;

public class ToggleImageButton
extends ImageButton {
    @Nullable
    protected Supplier<Boolean> stateSupplier;

    public ToggleImageButton(int n, int n2, class01894 class018942, @Nullable Supplier<Boolean> supplier, ImageButton$PressAction imageButton$PressAction, ImageButton$TooltipSupplier imageButton$TooltipSupplier) {
        super(n, n2, class018942, imageButton$PressAction, imageButton$TooltipSupplier);
        this.stateSupplier = supplier;
    }

    @Override
    protected void renderImage(class01054 class010542, int n, int n2) {
        if (this.stateSupplier == null) {
            return;
        }
        if (this.stateSupplier.get().booleanValue()) {
            class010542.N(class08394.Na, this.texture, 32, 32, 16, 0, this.method_46426() + 2, this.method_46427() + 2, 16, 16);
        } else {
            class010542.N(class08394.Na, this.texture, 32, 32, 0, 0, this.method_46426() + 2, this.method_46427() + 2, 16, 16);
        }
    }
}

