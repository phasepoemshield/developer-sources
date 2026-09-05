/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.DoubleFieldControllerBuilder
 *  minecraft.class00392
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.DoubleFieldControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.DoubleField;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import minecraft.class00392;
import minecraft.class07018;

public class DoubleFieldImpl
extends SimpleOptionFactory<DoubleField, Double> {
    @Override
    protected ControllerBuilder<Double> createController(DoubleField doubleField, ConfigField<Double> configField, OptionAccess optionAccess, Option<Double> option) {
        return ((DoubleFieldControllerBuilder)DoubleFieldControllerBuilder.create(option).formatValue(d -> {
            String string = null;
            if (d.doubleValue() == doubleField.min()) {
                string = this.getTranslationKey(configField, "fmt.min");
            } else if (d.doubleValue() == doubleField.max()) {
                string = this.getTranslationKey(configField, "fmt.max");
            }
            if (string != null && class07018.y().N(string)) {
                return class00392.L((String)string);
            }
            string = this.getTranslationKey(configField, "fmt");
            if (class07018.y().N(string)) {
                return class00392.N((String)string, (Object[])new Object[]{d});
            }
            return class00392.L((String)String.format(doubleField.format(), d));
        })).range((Number)doubleField.min(), (Number)doubleField.max());
    }
}

