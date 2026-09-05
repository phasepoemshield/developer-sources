/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.placeholder.ViewObjectImpl
 *  minecraft.class01894
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.impl.placeholder.ViewObjectImpl;
import minecraft.class01894;

public interface PlaceholderContext$ViewObject {
    public static final PlaceholderContext$ViewObject DEFAULT = PlaceholderContext$ViewObject.of(class01894.N((String)"placeholder_api", (String)"default"));

    public static PlaceholderContext$ViewObject of(class01894 class018942) {
        return new ViewObjectImpl(class018942);
    }

    public class01894 identifier();
}

