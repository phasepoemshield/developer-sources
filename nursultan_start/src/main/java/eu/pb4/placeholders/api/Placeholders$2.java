/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderHandler;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import java.util.Set;

class Placeholders$2
implements Placeholders$PlaceholderGetter {
    final /* synthetic */ ParserContext$Key val$key;
    final /* synthetic */ Set val$placeholders;

    Placeholders$2() {
        this.val$key = var1_1;
        this.val$placeholders = var2_2;
    }

    @Override
    public boolean isContextOptional() {
        return true;
    }

    @Override
    public PlaceholderHandler getPlaceholder(String string, ParserContext parserContext) {
        Placeholders$PlaceholderGetter placeholders$PlaceholderGetter = (Placeholders$PlaceholderGetter)parserContext.get(this.val$key);
        return placeholders$PlaceholderGetter != null ? placeholders$PlaceholderGetter.getPlaceholder(string, parserContext) : null;
    }

    @Override
    public PlaceholderHandler getPlaceholder(String string) {
        return this.val$placeholders.contains(string) ? PlaceholderHandler.EMPTY : null;
    }
}

