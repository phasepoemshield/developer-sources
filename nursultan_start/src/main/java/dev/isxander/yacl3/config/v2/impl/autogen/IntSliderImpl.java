/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.IntegerSliderControllerBuilder
 *  minecraft.class00392
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.IntegerSliderControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.IntSlider;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import minecraft.class00392;
import minecraft.class07018;

public class IntSliderImpl
extends SimpleOptionFactory<IntSlider, Integer> {
    @Override
    protected ControllerBuilder<Integer> createController(IntSlider intSlider, ConfigField<Integer> configField, OptionAccess optionAccess, Option<Integer> option) {
        return ((IntegerSliderControllerBuilder)((IntegerSliderControllerBuilder)IntegerSliderControllerBuilder.create(option).formatValue(n -> {
            String string = this.getTranslationKey(configField, "fmt." + n);
            if (class07018.y().N(string)) {
                return class00392.L((String)string);
            }
            string = this.getTranslationKey(configField, "fmt");
            if (class07018.y().N(string)) {
                return class00392.N((String)string, (Object[])new Object[]{n});
            }
            return class00392.y((String)Integer.toString(n));
        })).range((Number)intSlider.min(), (Number)intSlider.max())).step((Number)intSlider.step());
    }
}

