/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.ColorEntry$ColorValue;

public enum ColorEntry$ColorError {
    NO_ALPHA_ALLOWED,
    INVALID_ALPHA,
    INVALID_RED,
    INVALID_GREEN,
    INVALID_BLUE,
    INVALID_COLOR;

    private final ColorEntry$ColorValue value = new ColorEntry$ColorValue(this);

    public ColorEntry$ColorValue toValue() {
        return this.value;
    }
}

