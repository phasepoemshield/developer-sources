/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.TextNode
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeValue;
import java.util.function.Function;

public record TextParserV1$NodeList(TextNode[] nodes, int length) {
    public static final TextParserV1$NodeList EMPTY = new TextParserV1$NodeList(new TextNode[0], 0);

    public TextParserV1$TagNodeValue value(TextNode textNode) {
        return new TextParserV1$TagNodeValue(textNode, this.length);
    }

    public TextParserV1$TagNodeValue value(Function<TextNode[], TextNode> function) {
        return new TextParserV1$TagNodeValue(function.apply(this.nodes), this.length);
    }
}

