/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.TickBoxControllerBuilder
 *  dev.isxander.yacl3.gui.controllers.TickBoxController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import dev.isxander.yacl3.gui.controllers.TickBoxController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class TickBoxControllerBuilderImpl
extends AbstractControllerBuilderImpl<Boolean>
implements TickBoxControllerBuilder {
    public TickBoxControllerBuilderImpl(Option<Boolean> option) {
        super(option);
    }

    public Controller<Boolean> build() {
        return new TickBoxController(this.option);
    }
}

