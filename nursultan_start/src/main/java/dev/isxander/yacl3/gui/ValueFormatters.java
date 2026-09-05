/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.ValueFormatters$PercentFormatter;

public final class ValueFormatters {
    public static ValueFormatter<Float> percent(int n) {
        return new ValueFormatters$PercentFormatter(n);
    }
}

