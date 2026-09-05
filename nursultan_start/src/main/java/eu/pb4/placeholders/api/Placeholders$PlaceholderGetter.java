/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.PlaceholderHandler;

public interface Placeholders$PlaceholderGetter {
    default public boolean exists(String string) {
        return this.getPlaceholder(string) != null;
    }

    default public boolean isContextOptional() {
        return false;
    }

    default public PlaceholderHandler getPlaceholder(String string, ParserContext parserContext) {
        return this.getPlaceholder(string);
    }

    public PlaceholderHandler getPlaceholder(String var1);
}

