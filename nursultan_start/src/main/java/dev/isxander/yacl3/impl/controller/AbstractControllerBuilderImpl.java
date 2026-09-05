/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;

public abstract class AbstractControllerBuilderImpl<T>
implements ControllerBuilder<T> {
    protected final Option<T> option;

    protected AbstractControllerBuilderImpl(Option<T> option) {
        this.option = option;
    }
}

