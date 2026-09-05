/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.DoubleSliderControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.SliderControllerBuilder;
import dev.isxander.yacl3.impl.controller.DoubleSliderControllerBuilderImpl;

public interface DoubleSliderControllerBuilder
extends SliderControllerBuilder<Double, DoubleSliderControllerBuilder> {
    public static DoubleSliderControllerBuilder create(Option<Double> option) {
        return new DoubleSliderControllerBuilderImpl(option);
    }
}

