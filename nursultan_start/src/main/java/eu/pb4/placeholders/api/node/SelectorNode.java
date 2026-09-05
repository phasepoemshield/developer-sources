/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class08262
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class08262;

public record SelectorNode(class08262 selector, Optional<TextNode> separator) implements TextNode
{
    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        return class00392.N((class08262)this.selector, this.separator.map(textNode -> textNode.toText(parserContext, bl)));
    }

    @Override
    public boolean isDynamic() {
        return this.separator.isPresent() && this.separator.get().isDynamic();
    }
}

