/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.TextParserV1
 *  eu.pb4.placeholders.api.parsers.TextParserV1$TagParserGetter
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.parsers.TextParserV1;
import minecraft.class00392;

@Deprecated(forRemoval=true)
public final class TextParserUtils {
    private TextParserUtils() {
    }

    public static ParentTextNode formatNodes(String string) {
        return new ParentNode(TextParserV1.DEFAULT.parseNodes((TextNode)new LiteralNode(string)));
    }

    public static ParentTextNode formatNodes(String string, TextParserV1.TagParserGetter tagParserGetter) {
        return new ParentNode(TextParserV1.parseNodesWith((TextNode)new LiteralNode(string), (TextParserV1.TagParserGetter)tagParserGetter));
    }

    public static class00392 formatTextSafe(String string) {
        return TextParserUtils.formatNodesSafe(string).toText(ParserContext.of(), true);
    }

    public static ParentTextNode formatNodesSafe(String string) {
        return new ParentNode(TextParserV1.DEFAULT.parseNodes((TextNode)new LiteralNode(string)));
    }

    public static class00392 formatText(String string) {
        return TextParserUtils.formatNodes(string).toText(ParserContext.of(), true);
    }

    public static class00392 formatText(String string, TextParserV1.TagParserGetter tagParserGetter) {
        return TextParserUtils.formatNodes(string, tagParserGetter).toText(null, true);
    }
}

