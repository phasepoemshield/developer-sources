/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.TimeZone;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TomlWriter;

public class TomlWriter$Builder {
    private int keyIndentation;
    private int tableIndentation;
    private int arrayDelimiterPadding = 0;
    private TimeZone timeZone = TimeZone.getTimeZone("UTC");
    private boolean showFractionalSeconds = false;

    public TomlWriter$Builder timeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public TomlWriter build() {
        return new TomlWriter(this.keyIndentation, this.tableIndentation, this.arrayDelimiterPadding, this.timeZone, this.showFractionalSeconds, null);
    }

    public TomlWriter$Builder indentTablesBy(int n) {
        this.tableIndentation = n;
        return this;
    }

    public TomlWriter$Builder indentValuesBy(int n) {
        this.keyIndentation = n;
        return this;
    }

    public TomlWriter$Builder showFractionalSeconds() {
        this.showFractionalSeconds = true;
        return this;
    }

    public TomlWriter$Builder padArrayDelimitersBy(int n) {
        this.arrayDelimiterPadding = n;
        return this;
    }
}

