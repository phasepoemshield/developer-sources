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
import java.util.Arrays;
import minecraft.class00405;

public final class ShadowNode
extends SimpleStylingNode {
    private final int color;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new ShadowNode(textNodeArray, this.color);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return class00405.N.y(this.color);
    }

    public ShadowNode(TextNode[] textNodeArray, int n) {
        super(textNodeArray);
        this.color = n;
    }

    @Override
    public String toString() {
        return "ShadowNode{color=" + this.color + ", children=" + Arrays.toString(this.children) + "}";
    }
}

