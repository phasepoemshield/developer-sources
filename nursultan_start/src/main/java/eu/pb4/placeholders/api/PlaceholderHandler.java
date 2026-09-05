/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.PlaceholderResult;

@FunctionalInterface
public interface PlaceholderHandler {
    public static final PlaceholderHandler EMPTY = (placeholderContext, string) -> PlaceholderResult.invalid();

    public PlaceholderResult onPlaceholderRequest(PlaceholderContext var1, String var2);
}

