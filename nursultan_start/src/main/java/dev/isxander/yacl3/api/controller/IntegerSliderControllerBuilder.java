/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.IntegerSliderControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.SliderControllerBuilder;
import dev.isxander.yacl3.impl.controller.IntegerSliderControllerBuilderImpl;

public interface IntegerSliderControllerBuilder
extends SliderControllerBuilder<Integer, IntegerSliderControllerBuilder> {
    public static IntegerSliderControllerBuilder create(Option<Integer> option) {
        return new IntegerSliderControllerBuilderImpl(option);
    }
}

