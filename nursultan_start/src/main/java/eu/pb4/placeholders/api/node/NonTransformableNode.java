/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import minecraft.class00392;

public record NonTransformableNode(TextNode node) implements TextNode
{
    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        return this.node.toText(parserContext, bl);
    }

    @Override
    public boolean isDynamic() {
        return this.node.isDynamic();
    }
}

