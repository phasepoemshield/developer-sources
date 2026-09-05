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
import dev.isxander.yacl3.gui.controllers.ActionController;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import minecraft.class01054;
import minecraft.class06608;

public class ActionController$ActionControllerElement
extends ControllerWidget<ActionController> {
    private final String buttonString;

    public ActionController$ActionControllerElement(ActionController actionController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(actionController, yACLScreen, dimension);
        this.buttonString = actionController.formatValue().getString().toLowerCase();
    }

    @Override
    protected int getHoveredControlWidth() {
        return this.getUnhoveredControlWidth();
    }

    @Override
    public boolean canReset() {
        return false;
    }

    @Override
    public boolean matchesSearch(String string) {
        return super.matchesSearch(string) || this.buttonString.contains(string);
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (this.method_25405(d, d2) && this.isAvailable()) {
            this.executeAction();
            return true;
        }
        return false;
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
            this.executeAction();
            return true;
        }
        return false;
    }

    public void executeAction() {
        this.playDownSound();
        ((ActionController)this.control).option().action().accept(this.screen, ((ActionController)this.control).option());
    }

    @Override
    protected void drawValueText(class01054 class010542, int n, int n2, float f) {
        super.drawValueText(class010542, n, n2, f);
        if (this.hovered) {
            class010542.N(this.isAvailable() ? class06608.u : class06608.B);
        }
    }
}

