/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder
 *  minecraft.class00392
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.DoubleSlider;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import minecraft.class00392;
import minecraft.class07018;

public class DoubleSliderImpl
extends SimpleOptionFactory<DoubleSlider, Double> {
    @Override
    protected ControllerBuilder<Double> createController(DoubleSlider doubleSlider, ConfigField<Double> configField, OptionAccess optionAccess, Option<Double> option) {
        return ((DoubleSliderControllerBuilder)((DoubleSliderControllerBuilder)DoubleSliderControllerBuilder.create(option).formatValue(d -> {
            String string = null;
            if (d.doubleValue() == doubleSlider.min()) {
                string = this.getTranslationKey(configField, "fmt.min");
            } else if (d.doubleValue() == doubleSlider.max()) {
                string = this.getTranslationKey(configField, "fmt.max");
            }
            if (string != null && class07018.y().N(string)) {
                return class00392.L((String)string);
            }
            string = this.getTranslationKey(configField, "fmt");
            if (class07018.y().N(string)) {
                return class00392.N((String)string, (Object[])new Object[]{d});
            }
            return class00392.L((String)String.format(doubleSlider.format(), d));
        })).range((Number)doubleSlider.min(), (Number)doubleSlider.max())).step((Number)doubleSlider.step());
    }
}

