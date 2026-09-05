/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class06541
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.BooleanController;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class06541;
import minecraft.class06608;

public class BooleanController$BooleanControllerElement
extends ControllerWidget<BooleanController> {
    public BooleanController$BooleanControllerElement(BooleanController booleanController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(booleanController, yACLScreen, dimension);
    }

    @Override
    protected class00392 getValueText() {
        if (((BooleanController)this.control).coloured()) {
            return super.getValueText().L().N((Boolean)((BooleanController)this.control).option().pendingValue() != false ? class06541.field_1060 : class06541.field_1061);
        }
        return super.getValueText();
    }

    @Override
    protected int getHoveredControlWidth() {
        return this.getUnhoveredControlWidth();
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
                if (!this.method_25370()) {
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
    protected void drawHoveredControl(class01054 class010542, int n, int n2, float f) {
    }

    @Override
    protected void drawValueText(class01054 class010542, int n, int n2, float f) {
        super.drawValueText(class010542, n, n2, f);
        if (this.hovered) {
            class010542.N(this.isAvailable() ? class06608.u : class06608.B);
        }
    }

    public void toggleSetting() {
        ((BooleanController)this.control).option().requestSet((Object)((Boolean)((BooleanController)this.control).option().pendingValue() == false ? 1 : 0));
        this.playDownSound();
    }
}

