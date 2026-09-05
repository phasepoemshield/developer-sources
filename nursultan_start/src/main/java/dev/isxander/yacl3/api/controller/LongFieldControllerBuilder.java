/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.LongFieldControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.NumberFieldControllerBuilder;
import dev.isxander.yacl3.impl.controller.LongFieldControllerBuilderImpl;

public interface LongFieldControllerBuilder
extends NumberFieldControllerBuilder<Long, LongFieldControllerBuilder> {
    public static LongFieldControllerBuilder create(Option<Long> option) {
        return new LongFieldControllerBuilderImpl(option);
    }
}

