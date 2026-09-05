/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.DirectTextNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.util.ArrayList;

public record StaticPreParser() implements NodeParser
{
    public static final NodeParser INSTANCE = new StaticPreParser();

    public static TextNode parse(TextNode textNode) {
        if (!textNode.isDynamic()) {
            return new DirectTextNode(textNode.toText());
        }
        if (textNode instanceof ParentNode) {
            ParentNode parentNode = (ParentNode)textNode;
            ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
            for (TextNode textNode2 : parentNode.getChildren()) {
                arrayList.add(StaticPreParser.parse(textNode2));
            }
            return parentNode.copyWith(arrayList.toArray(new TextNode[0]));
        }
        return textNode;
    }

    @Override
    public TextNode[] parseNodes(TextNode textNode) {
        return new TextNode[]{StaticPreParser.parse(textNode)};
    }
}

