/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class06541
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
import minecraft.class06541;

public final class FormattingNode
extends SimpleStylingNode
implements DynamicShadowNode$SimpleColoredTransformer {
    private final class06541[] formatting;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new FormattingNode(textNodeArray, this.formatting);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return class00405.N.N(this.formatting);
    }

    public FormattingNode(TextNode[] textNodeArray, class06541 class065412) {
        this(textNodeArray, new class06541[]{class065412});
    }

    public FormattingNode(TextNode[] textNodeArray, class06541 ... class06541Array) {
        super(textNodeArray);
        this.formatting = class06541Array;
    }

    @Override
    public String toString() {
        return "FormattingNode{formatting=" + String.valueOf(this.formatting) + ", children=" + Arrays.toString(this.children) + "}";
    }

    @Override
    public int getDefaultShadowColor(class00392 class003922, float f, float f2, ParserContext parserContext) {
        for (class06541 class065412 : this.formatting) {
            if (!class065412.u()) continue;
            return DynamicShadowNode.modifiedColor(class065412.i(), f, f2);
        }
        return -1;
    }

    @Override
    public boolean hasShadowColor(ParserContext parserContext) {
        for (class06541 class065412 : this.formatting) {
            if (!class065412.u()) continue;
            return true;
        }
        return false;
    }
}

