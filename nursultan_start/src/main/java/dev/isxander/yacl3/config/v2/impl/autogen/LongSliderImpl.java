/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.LongSliderControllerBuilder
 *  minecraft.class00392
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.LongSliderControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.LongSlider;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import minecraft.class00392;
import minecraft.class07018;

public class LongSliderImpl
extends SimpleOptionFactory<LongSlider, Long> {
    @Override
    protected ControllerBuilder<Long> createController(LongSlider longSlider, ConfigField<Long> configField, OptionAccess optionAccess, Option<Long> option) {
        return ((LongSliderControllerBuilder)((LongSliderControllerBuilder)LongSliderControllerBuilder.create(option).formatValue(l -> {
            String string = this.getTranslationKey(configField, "fmt." + l);
            if (class07018.y().N(string)) {
                return class00392.L((String)string);
            }
            string = this.getTranslationKey(configField, "fmt");
            if (class07018.y().N(string)) {
                return class00392.N((String)string, (Object[])new Object[]{l});
            }
            return class00392.y((String)Long.toString(l));
        })).range((Number)longSlider.min(), (Number)longSlider.max())).step((Number)longSlider.step());
    }
}

