/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.StringControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.impl.controller.StringControllerBuilderImpl;

public interface StringControllerBuilder
extends ControllerBuilder<String> {
    public static StringControllerBuilder create(Option<String> option) {
        return new StringControllerBuilderImpl(option);
    }
}

