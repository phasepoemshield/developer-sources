/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.ParserContext
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.parsers.NodeParser
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import minecraft.class00392;

public record WrappedText(String input, TextNode textNode, class00392 text) {
    public static WrappedText from(NodeParser nodeParser, String string) {
        TextNode textNode = TextNode.asSingle((TextNode[])nodeParser.parseNodes(TextNode.of((String)string)));
        return new WrappedText(string, textNode, textNode.toText(ParserContext.of(), true));
    }
}

