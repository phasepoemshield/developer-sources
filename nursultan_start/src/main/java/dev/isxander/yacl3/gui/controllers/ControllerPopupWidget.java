/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;

public abstract class ControllerPopupWidget<T extends Controller<?>>
extends ControllerWidget<Controller<?>>
implements class04654 {
    public final ControllerWidget<?> entryWidget;

    public ControllerPopupWidget(T t, YACLScreen yACLScreen, Dimension<Integer> dimension, ControllerWidget<?> controllerWidget) {
        super(t, yACLScreen, dimension);
        this.entryWidget = controllerWidget;
    }

    public void close() {
    }

    @Override
    protected int getHoveredControlWidth() {
        return 0;
    }

    public class00392 popupTitle() {
        return class00392.L((String)"yacl.control.text.blank");
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        return this.entryWidget.onKeyPressed(n, n2, n3);
    }

    public void renderBackground(class01054 class010542, int n, int n2, float f) {
    }

    public ControllerWidget<?> entryWidget() {
        return this.entryWidget;
    }
}

