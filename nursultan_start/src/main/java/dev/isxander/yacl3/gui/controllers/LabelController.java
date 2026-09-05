/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.LabelController$LabelControllerElement;
import minecraft.class00392;

public class LabelController
implements Controller<class00392> {
    private final Option<class00392> option;

    public LabelController(Option<class00392> option) {
        this.option = option;
    }

    public Option<class00392> option() {
        return this.option;
    }

    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new LabelController$LabelControllerElement(this, yACLScreen, dimension);
    }

    public class00392 formatValue() {
        return (class00392)this.option().pendingValue();
    }
}

