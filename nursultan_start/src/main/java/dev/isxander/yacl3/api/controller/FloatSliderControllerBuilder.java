/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.FloatSliderControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.SliderControllerBuilder;
import dev.isxander.yacl3.impl.controller.FloatSliderControllerBuilderImpl;

public interface FloatSliderControllerBuilder
extends SliderControllerBuilder<Float, FloatSliderControllerBuilder> {
    public static FloatSliderControllerBuilder create(Option<Float> option) {
        return new FloatSliderControllerBuilderImpl(option);
    }
}

