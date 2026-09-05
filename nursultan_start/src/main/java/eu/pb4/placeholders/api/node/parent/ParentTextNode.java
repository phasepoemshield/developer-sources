/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.textparser.TextParserImpl
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.impl.textparser.TextParserImpl;
import java.util.Collection;

public interface ParentTextNode
extends TextNode {
    default public ParentTextNode copyWith(TextNode[] textNodeArray, NodeParser nodeParser) {
        return this.copyWith(textNodeArray);
    }

    default public ParentTextNode copyWith(Collection<TextNode> collection) {
        return this.copyWith(collection.toArray(TextParserImpl.CASTER));
    }

    public ParentTextNode copyWith(TextNode[] var1);

    default public ParentTextNode copyWith(Collection<TextNode> collection, NodeParser nodeParser) {
        return this.copyWith(collection.toArray(TextParserImpl.CASTER), nodeParser);
    }

    public TextNode[] getChildren();

    @Override
    default public boolean isDynamic() {
        for (TextNode textNode : this.getChildren()) {
            if (!textNode.isDynamic()) continue;
            return true;
        }
        return this.isDynamicNoChildren();
    }

    default public boolean isDynamicNoChildren() {
        return false;
    }
}

