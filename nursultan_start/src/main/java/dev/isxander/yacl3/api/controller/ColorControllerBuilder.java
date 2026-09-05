/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.ColorControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.impl.controller.ColorControllerBuilderImpl;
import java.awt.Color;

public interface ColorControllerBuilder
extends ControllerBuilder<Color> {
    public static ColorControllerBuilder create(Option<Color> option) {
        return new ColorControllerBuilderImpl(option);
    }

    public ColorControllerBuilder allowAlpha(boolean var1);
}

