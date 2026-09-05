/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ColorControllerBuilder
 *  dev.isxander.yacl3.gui.controllers.ColorController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ColorControllerBuilder;
import dev.isxander.yacl3.gui.controllers.ColorController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;
import java.awt.Color;

public class ColorControllerBuilderImpl
extends AbstractControllerBuilderImpl<Color>
implements ColorControllerBuilder {
    private boolean allowAlpha = false;

    public ColorControllerBuilderImpl(Option<Color> option) {
        super(option);
    }

    public Controller<Color> build() {
        return new ColorController(this.option, this.allowAlpha);
    }

    public ColorControllerBuilder allowAlpha(boolean bl) {
        this.allowAlpha = bl;
        return this;
    }
}

