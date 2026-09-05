/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.FloatSliderControllerBuilder
 *  minecraft.class00392
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.FloatSliderControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.FloatSlider;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import minecraft.class00392;
import minecraft.class07018;

public class FloatSliderImpl
extends SimpleOptionFactory<FloatSlider, Float> {
    @Override
    protected ControllerBuilder<Float> createController(FloatSlider floatSlider, ConfigField<Float> configField, OptionAccess optionAccess, Option<Float> option) {
        return ((FloatSliderControllerBuilder)((FloatSliderControllerBuilder)FloatSliderControllerBuilder.create(option).formatValue(f -> {
            String string = null;
            if (f.floatValue() == floatSlider.min()) {
                string = this.getTranslationKey(configField, "fmt.min");
            } else if (f.floatValue() == floatSlider.max()) {
                string = this.getTranslationKey(configField, "fmt.max");
            }
            if (string != null && class07018.y().N(string)) {
                return class00392.L((String)string);
            }
            string = this.getTranslationKey(configField, "fmt");
            if (class07018.y().N(string)) {
                return class00392.N((String)string, (Object[])new Object[]{f});
            }
            return class00392.L((String)String.format(floatSlider.format(), f));
        })).range((Number)Float.valueOf(floatSlider.min()), (Number)Float.valueOf(floatSlider.max()))).step((Number)Float.valueOf(floatSlider.step()));
    }
}

