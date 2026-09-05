/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.StringControllerBuilder
 *  dev.isxander.yacl3.gui.controllers.string.StringController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.StringControllerBuilder;
import dev.isxander.yacl3.gui.controllers.string.StringController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class StringControllerBuilderImpl
extends AbstractControllerBuilderImpl<String>
implements StringControllerBuilder {
    public StringControllerBuilderImpl(Option<String> option) {
        super(option);
    }

    public Controller<String> build() {
        return new StringController(this.option);
    }
}

