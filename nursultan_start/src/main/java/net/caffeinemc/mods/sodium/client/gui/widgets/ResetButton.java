/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class06202
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class08394
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class06202;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class08394;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.Nullable;

public class ResetButton
extends AbstractWidget {
    private static final class01894 ICON = class01894.N((String)"sodium", (String)"textures/gui/reset_button.png");
    private static final int ICON_SIZE = 10;
    private static final int COLOR = -29648;
    private final AbstractWidget parent;
    private final Runnable action;

    public ResetButton(AbstractWidget abstractWidget, Runnable runnable) {
        super(new Dim2i(0, 0, 20, 0));
        this.parent = abstractWidget;
        this.action = runnable;
    }

    public int getY() {
        return this.parent.getY();
    }

    public int getX() {
        return this.parent.getLimitX() - this.getWidth();
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        return null;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (!this.method_37303()) {
            return;
        }
        int n3 = this.getCenterX() - 5;
        int n4 = this.getCenterY() - 5;
        class010542.N(class08394.Na, ICON, n3, n4, 0.0f, 0.0f, 10, 10, 10, 10, -29648);
        class010542.N(class06608.u);
    }

    public boolean method_37303() {
        return this.parent.isHovered() && ResetButton.isShiftHeld();
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!ResetButton.isShiftHeld() || class066132.v() != 0) {
            return false;
        }
        if (!this.parent.method_25405(class066132.n(), class066132.t()) || !this.method_25405(class066132.n(), class066132.t())) {
            return false;
        }
        this.action.run();
        this.playClickSound();
        return true;
    }

    public static boolean isShiftHeld() {
        return class06202.Nq().L();
    }

    public int getHeight() {
        return this.parent.getHeight();
    }
}

