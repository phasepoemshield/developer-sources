/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.TickBoxControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.impl.controller.TickBoxControllerBuilderImpl;

public interface TickBoxControllerBuilder
extends ControllerBuilder<Boolean> {
    public static TickBoxControllerBuilder create(Option<Boolean> option) {
        return new TickBoxControllerBuilderImpl(option);
    }
}

