/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class01054
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import dev.isxander.yacl3.gui.controllers.TickBoxController;
import minecraft.class01054;
import minecraft.class06608;

public class TickBoxController$TickBoxControllerElement
extends ControllerWidget<TickBoxController> {
    public TickBoxController$TickBoxControllerElement(TickBoxController tickBoxController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(tickBoxController, yACLScreen, dimension);
    }

    @Override
    protected int getUnhoveredControlWidth() {
        return 10;
    }

    @Override
    protected int getHoveredControlWidth() {
        return 10;
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (!this.method_25405(d, d2) || !this.isAvailable()) {
            return false;
        }
        this.toggleSetting();
        return true;
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        block5: {
            block4: {
                if (!this.focused) {
                    return false;
                }
                if (n == 257 || n == 32) break block4;
                if (n != 335) break block5;
            }
            this.toggleSetting();
            return true;
        }
        return false;
    }

    @Override
    protected void drawValueText(class01054 class010542, int n, int n2, float f) {
        int n3 = 10;
        int n4 = (Integer)this.getDimension().xLimit() - this.getXPadding() - n3;
        int n5 = (Integer)this.getDimension().centerY() - n3 / 2;
        int n6 = (Integer)this.getDimension().xLimit() - this.getXPadding();
        int n7 = (Integer)this.getDimension().centerY() + n3 / 2;
        int n8 = this.getValueColor();
        int n9 = this.multiplyColor(n8, 0.25f);
        this.drawOutline(class010542, n4 + 1, n5 + 1, n6 + 1, n7 + 1, 1, n9);
        this.drawOutline(class010542, n4, n5, n6, n7, 1, n8);
        if (((Boolean)((TickBoxController)this.control).option().pendingValue()).booleanValue()) {
            class010542.N(n4 + 3, n5 + 3, n6 - 1, n7 - 1, n9);
            class010542.N(n4 + 2, n5 + 2, n6 - 2, n7 - 2, n8);
        }
        if (this.hovered) {
            class010542.N(this.isAvailable() ? class06608.u : class06608.B);
        }
    }

    public void toggleSetting() {
        ((TickBoxController)this.control).option().requestSet((Object)((Boolean)((TickBoxController)this.control).option().pendingValue() == false ? 1 : 0));
        this.playDownSound();
    }
}

