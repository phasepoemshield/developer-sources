/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.LongSliderControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.SliderControllerBuilder;
import dev.isxander.yacl3.impl.controller.LongSliderControllerBuilderImpl;

public interface LongSliderControllerBuilder
extends SliderControllerBuilder<Long, LongSliderControllerBuilder> {
    public static LongSliderControllerBuilder create(Option<Long> option) {
        return new LongSliderControllerBuilderImpl(option);
    }
}

