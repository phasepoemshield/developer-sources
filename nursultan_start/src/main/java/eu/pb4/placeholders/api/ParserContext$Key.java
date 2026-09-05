/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$Transformer;
import minecraft.class01929;

public record ParserContext$Key<T>(String key, Class<T> type, boolean nodeContext) {
    public static final ParserContext$Key<Boolean> COMPACT_TEXT = new ParserContext$Key<Boolean>("compact_text", Boolean.class);
    public static final ParserContext$Key<class01929> WRAPPER_LOOKUP = new ParserContext$Key<class01929>("wrapper_lookup", class01929.class);
    public static final ParserContext$Key<DynamicShadowNode.Transformer> DEFAULT_SHADOW_STYLER = ParserContext$Key.ofNode("default_shadow_styler");

    public ParserContext$Key(String string, Class<T> clazz) {
        this(string, clazz, false);
    }

    public static <T> ParserContext$Key<T> of(String string) {
        return new ParserContext$Key<T>(string, null, false);
    }

    public static <T> ParserContext$Key<T> of(String string, T t) {
        return new ParserContext$Key(string, t.getClass(), false);
    }

    public static <T> ParserContext$Key<T> ofNode(String string) {
        return new ParserContext$Key<T>(string, null, true);
    }

    public static <T> ParserContext$Key<T> ofNode(String string, T t) {
        return new ParserContext$Key(string, t.getClass(), true);
    }
}

