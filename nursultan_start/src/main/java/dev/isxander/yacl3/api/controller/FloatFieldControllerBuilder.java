/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.FloatFieldControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.NumberFieldControllerBuilder;
import dev.isxander.yacl3.impl.controller.FloatFieldControllerBuilderImpl;

public interface FloatFieldControllerBuilder
extends NumberFieldControllerBuilder<Float, FloatFieldControllerBuilder> {
    public static FloatFieldControllerBuilder create(Option<Float> option) {
        return new FloatFieldControllerBuilderImpl(option);
    }
}

