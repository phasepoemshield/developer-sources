/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ItemControllerBuilder
 *  dev.isxander.yacl3.gui.controllers.dropdown.ItemController
 *  minecraft.class06581
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ItemControllerBuilder;
import dev.isxander.yacl3.gui.controllers.dropdown.ItemController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;
import minecraft.class06581;

public class ItemControllerBuilderImpl
extends AbstractControllerBuilderImpl<class06581>
implements ItemControllerBuilder {
    public ItemControllerBuilderImpl(Option<class06581> option) {
        super(option);
    }

    public Controller<class06581> build() {
        return new ItemController(this.option);
    }
}

