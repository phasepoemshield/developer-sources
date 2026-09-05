/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import eu.pb4.placeholders.api.node.DirectTextNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Format$Tag;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider$1;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider$2;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider$3;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider$4;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00392;

public interface TagLikeParser$Provider {
    public static TagLikeParser$Provider placeholder(ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return new TagLikeParser$Provider$4(parserContext$Key);
    }

    public static TagLikeParser$Provider placeholder(Set<String> set, ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return new TagLikeParser$Provider$3(set, parserContext$Key);
    }

    public static TagLikeParser$Provider placeholder(Function<String, TextNode> function) {
        return new TagLikeParser$Provider$2(function);
    }

    public static TagLikeParser$Provider placeholder(ParserContext$Key<PlaceholderContext> parserContext$Key, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return new TagLikeParser$Provider$1(placeholders$PlaceholderGetter, parserContext$Key);
    }

    public static TagLikeParser$Provider placeholderText(Function<String, class00392> function) {
        return TagLikeParser$Provider.placeholder((String string) -> {
            class00392 class003922 = (class00392)function.apply((String)string);
            return class003922 != null ? new DirectTextNode(class003922) : null;
        });
    }

    public boolean isValidTag(String var1, TagLikeParser$Context var2);

    default public TagLikeParser$Format$Tag modifyTag(TagLikeParser$Format$Tag tagLikeParser$Format$Tag, TagLikeParser$Context tagLikeParser$Context) {
        return tagLikeParser$Format$Tag;
    }

    public void handleTag(String var1, String var2, TagLikeParser$Context var3);
}

