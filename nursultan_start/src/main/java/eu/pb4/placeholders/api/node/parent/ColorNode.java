/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05194
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$SimpleColoredTransformer;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import java.util.Arrays;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05194;

public final class ColorNode
extends SimpleStylingNode
implements DynamicShadowNode$SimpleColoredTransformer {
    private final class05194 color;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new ColorNode(textNodeArray, this.color);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return class00405.N.N(this.color);
    }

    public ColorNode(TextNode[] textNodeArray, class05194 class051942) {
        super(textNodeArray);
        this.color = class051942;
    }

    @Override
    public String toString() {
        return "ColorNode{color=" + String.valueOf(this.color) + ", children=" + Arrays.toString(this.children) + "}";
    }

    @Override
    public int getDefaultShadowColor(class00392 class003922, float f, float f2, ParserContext parserContext) {
        return DynamicShadowNode.modifiedColor(this.color.N(), f, f2);
    }
}

