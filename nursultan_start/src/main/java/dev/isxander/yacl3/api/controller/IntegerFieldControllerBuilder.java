/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.IntegerFieldControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.NumberFieldControllerBuilder;
import dev.isxander.yacl3.impl.controller.IntegerFieldControllerBuilderImpl;

public interface IntegerFieldControllerBuilder
extends NumberFieldControllerBuilder<Integer, IntegerFieldControllerBuilder> {
    public static IntegerFieldControllerBuilder create(Option<Integer> option) {
        return new IntegerFieldControllerBuilderImpl(option);
    }
}

