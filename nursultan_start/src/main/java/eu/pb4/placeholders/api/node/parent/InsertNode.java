/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.util.Arrays;
import minecraft.class00405;

public final class InsertNode
extends SimpleStylingNode {
    private final TextNode value;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new InsertNode(textNodeArray, this.value);
    }

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray, NodeParser nodeParser) {
        return new InsertNode(textNodeArray, TextNode.asSingle(nodeParser.parseNodes(this.value)));
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return class00405.N.N(this.value.toText(parserContext, true).getString());
    }

    public InsertNode(TextNode[] textNodeArray, TextNode textNode) {
        super(textNodeArray);
        this.value = textNode;
    }

    public TextNode value() {
        return this.value;
    }

    @Override
    public String toString() {
        return "InsertNode{value=" + String.valueOf(this.value) + ", children=" + Arrays.toString(this.children) + "}";
    }

    @Override
    public boolean isDynamicNoChildren() {
        return this.value.isDynamic();
    }
}

