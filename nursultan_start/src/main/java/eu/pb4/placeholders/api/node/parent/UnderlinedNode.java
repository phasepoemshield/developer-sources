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

public final class UnderlinedNode
extends SimpleStylingNode {
    private static final class00405 TRUE = class00405.N.L(Boolean.valueOf(true));
    private static final class00405 FALSE = class00405.N.L(Boolean.valueOf(false));
    private final boolean value;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new UnderlinedNode(textNodeArray, this.value);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return this.value ? TRUE : FALSE;
    }

    public UnderlinedNode(TextNode[] textNodeArray, boolean bl) {
        super(textNodeArray);
        this.value = bl;
    }

    @Override
    public String toString() {
        return "UnderlinedNode{children=" + Arrays.toString(this.children) + ", value=" + this.value + "}";
    }
}

