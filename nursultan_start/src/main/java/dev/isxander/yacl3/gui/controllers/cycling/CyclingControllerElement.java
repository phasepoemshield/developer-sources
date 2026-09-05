/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class01054
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers.cycling;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import dev.isxander.yacl3.gui.controllers.cycling.ICyclingController;
import dev.isxander.yacl3.gui.utils.KeyUtils;
import minecraft.class01054;
import minecraft.class06608;

public class CyclingControllerElement
extends ControllerWidget<ICyclingController<?>> {
    public CyclingControllerElement(ICyclingController<?> iCyclingController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(iCyclingController, yACLScreen, dimension);
    }

    @Override
    public int getHoveredControlWidth() {
        return this.getUnhoveredControlWidth();
    }

    public void cycleValue(int n) {
        int n2 = ((ICyclingController)this.control).getPendingValue() + n;
        if (n2 >= ((ICyclingController)this.control).getCycleLength()) {
            n2 -= ((ICyclingController)this.control).getCycleLength();
        } else if (n2 < 0) {
            n2 += ((ICyclingController)this.control).getCycleLength();
        }
        ((ICyclingController)this.control).setPendingValue(n2);
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (!this.method_25405(d, d2) || n != 0 && n != 1 || !this.isAvailable()) {
            return false;
        }
        this.playDownSound();
        this.cycleValue(n == 1 || KeyUtils.hasShiftDown() || KeyUtils.hasControlDown() ? -1 : 1);
        return true;
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        if (!this.focused) {
            return false;
        }
        switch (n) {
            case 263: {
                this.cycleValue(-1);
                break;
            }
            case 262: {
                this.cycleValue(1);
                break;
            }
            case 32: 
            case 257: 
            case 335: {
                this.cycleValue(KeyUtils.hasControlDown(n3) || KeyUtils.hasShiftDown(n3) ? -1 : 1);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    @Override
    public void drawValueText(class01054 class010542, int n, int n2, float f) {
        super.drawValueText(class010542, n, n2, f);
        if (this.hovered) {
            class010542.N(this.isAvailable() ? class06608.u : class06608.B);
        }
    }
}

