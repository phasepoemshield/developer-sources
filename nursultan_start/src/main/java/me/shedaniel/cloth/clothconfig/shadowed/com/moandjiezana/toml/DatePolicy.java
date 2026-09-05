/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.TimeZone;

class DatePolicy {
    private final TimeZone timeZone;
    private final boolean showFractionalSeconds;

    TimeZone getTimeZone() {
        return this.timeZone;
    }

    DatePolicy(TimeZone timeZone, boolean bl) {
        this.timeZone = timeZone;
        this.showFractionalSeconds = bl;
    }

    boolean isShowFractionalSeconds() {
        return this.showFractionalSeconds;
    }
}

