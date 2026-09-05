/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.ItemControllerBuilderImpl
 *  minecraft.class06581
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.impl.controller.ItemControllerBuilderImpl;
import minecraft.class06581;

public interface ItemControllerBuilder
extends ControllerBuilder<class06581> {
    public static ItemControllerBuilder create(Option<class06581> option) {
        return new ItemControllerBuilderImpl(option);
    }
}

