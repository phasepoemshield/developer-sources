/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Locale;
import minecraft.class00388;

public class class00386
extends IllegalArgumentException {
    public class00386(class00388 class003882, String string) {
        super(String.format(Locale.ROOT, "Error parsing: %s: %s", class003882, string));
    }

    public class00386(class00388 class003882, int n) {
        super(String.format(Locale.ROOT, "Invalid index %d requested for %s", n, class003882));
    }

    public class00386(class00388 class003882, Throwable throwable) {
        super(String.format(Locale.ROOT, "Error while parsing: %s", class003882), throwable);
    }
}

