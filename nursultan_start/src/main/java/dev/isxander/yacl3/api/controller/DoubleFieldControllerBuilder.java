/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.DoubleFieldControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.NumberFieldControllerBuilder;
import dev.isxander.yacl3.impl.controller.DoubleFieldControllerBuilderImpl;

public interface DoubleFieldControllerBuilder
extends NumberFieldControllerBuilder<Double, DoubleFieldControllerBuilder> {
    public static DoubleFieldControllerBuilder create(Option<Double> option) {
        return new DoubleFieldControllerBuilderImpl(option);
    }
}

