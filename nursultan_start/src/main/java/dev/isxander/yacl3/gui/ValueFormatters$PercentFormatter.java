/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.controller.ValueFormatter;
import minecraft.class00392;

public record ValueFormatters$PercentFormatter(int decimalPlaces) implements ValueFormatter<Float>
{
    public ValueFormatters$PercentFormatter() {
        this(1);
    }

    public class00392 format(Float f) {
        return class00392.y((String)String.format("%." + this.decimalPlaces + "f%%", Float.valueOf(f.floatValue() * 100.0f)));
    }
}

