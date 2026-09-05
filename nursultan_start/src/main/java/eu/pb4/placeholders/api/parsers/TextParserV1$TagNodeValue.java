/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.EmptyNode
 *  eu.pb4.placeholders.api.node.TextNode
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.EmptyNode;
import eu.pb4.placeholders.api.node.TextNode;

public record TextParserV1$TagNodeValue(TextNode node, int length) {
    public static final TextParserV1$TagNodeValue EMPTY = new TextParserV1$TagNodeValue((TextNode)EmptyNode.INSTANCE, 0);
}

