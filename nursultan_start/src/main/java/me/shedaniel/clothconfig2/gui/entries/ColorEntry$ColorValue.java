/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.ColorEntry$ColorError;

public class ColorEntry$ColorValue {
    int color = -1;
    private ColorEntry$ColorError error = null;

    public ColorEntry$ColorValue(int n) {
        this.color = n;
    }

    public ColorEntry$ColorValue(ColorEntry$ColorError colorEntry$ColorError) {
        this.error = colorEntry$ColorError;
    }

    public int getColor() {
        return this.color;
    }

    public boolean hasError() {
        return this.getError() != null;
    }

    public ColorEntry$ColorError getError() {
        return this.error;
    }
}

