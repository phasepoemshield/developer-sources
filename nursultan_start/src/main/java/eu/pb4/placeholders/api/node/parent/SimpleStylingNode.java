/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import java.util.Collection;
import minecraft.class00405;

public abstract class SimpleStylingNode
extends ParentNode {
    protected abstract class00405 style(ParserContext var1);

    public SimpleStylingNode(TextNode ... textNodeArray) {
        super(textNodeArray);
    }

    public SimpleStylingNode(Collection<TextNode> collection) {
        super(collection);
    }

    @Override
    protected class00405 applyFormatting(class00405 class004052, ParserContext parserContext) {
        return class004052.N(this.style(parserContext));
    }
}

