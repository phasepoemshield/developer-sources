/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.BooleanControllerBuilder
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  minecraft.class00392
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.Boolean;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import minecraft.class00392;

public class BooleanImpl
extends SimpleOptionFactory<Boolean, java.lang.Boolean> {
    @Override
    protected ControllerBuilder<java.lang.Boolean> createController(Boolean boolean_, ConfigField<java.lang.Boolean> configField, OptionAccess optionAccess, Option<java.lang.Boolean> option) {
        BooleanControllerBuilder booleanControllerBuilder = BooleanControllerBuilder.create(option).coloured(boolean_.colored());
        switch (boolean_.formatter()) {
            case ON_OFF: {
                booleanControllerBuilder.onOffFormatter();
                break;
            }
            case YES_NO: {
                booleanControllerBuilder.yesNoFormatter();
                break;
            }
            case TRUE_FALSE: {
                booleanControllerBuilder.trueFalseFormatter();
                break;
            }
            case CUSTOM: {
                booleanControllerBuilder.formatValue(bl -> class00392.L((String)this.getTranslationKey(configField, "fmt." + bl)));
            }
        }
        return booleanControllerBuilder;
    }
}

