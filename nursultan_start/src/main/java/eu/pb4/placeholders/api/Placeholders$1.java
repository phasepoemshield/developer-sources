/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.PlaceholderHandler;
import eu.pb4.placeholders.api.Placeholders;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import minecraft.class01894;

class Placeholders$1
implements Placeholders$PlaceholderGetter {
    Placeholders$1() {
    }

    @Override
    public boolean isContextOptional() {
        return false;
    }

    @Override
    public PlaceholderHandler getPlaceholder(String string) {
        return Placeholders.PLACEHOLDERS.get(class01894.L((String)string));
    }
}

