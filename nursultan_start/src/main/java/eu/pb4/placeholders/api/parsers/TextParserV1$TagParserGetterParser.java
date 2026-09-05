/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.parsers.NodeParser
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TextParserV1;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagParserGetter;

record TextParserV1$TagParserGetterParser(TextParserV1$TagParserGetter getter) implements NodeParser
{
    public TextNode[] parseNodes(TextNode textNode) {
        return TextParserV1.parseNodesWith(textNode, this.getter);
    }
}

