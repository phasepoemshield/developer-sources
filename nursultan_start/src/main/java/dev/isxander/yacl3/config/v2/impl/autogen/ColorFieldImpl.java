/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ColorControllerBuilder
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ColorControllerBuilder;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.ColorField;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import java.awt.Color;

public class ColorFieldImpl
extends SimpleOptionFactory<ColorField, Color> {
    @Override
    protected ControllerBuilder<Color> createController(ColorField colorField, ConfigField<Color> configField, OptionAccess optionAccess, Option<Color> option) {
        return ColorControllerBuilder.create(option).allowAlpha(colorField.allowAlpha());
    }
}

