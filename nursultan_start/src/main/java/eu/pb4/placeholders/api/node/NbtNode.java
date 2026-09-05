/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04457
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class04457;

public record NbtNode(String rawPath, boolean interpret, Optional<TextNode> separator, class04457 dataSource) implements TextNode
{
    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        return class00392.N((String)this.rawPath, (boolean)this.interpret, this.separator.map(textNode -> textNode.toText(parserContext, bl)), (class04457)this.dataSource);
    }

    @Override
    public boolean isDynamic() {
        return this.separator.isPresent() && this.separator.get().isDynamic();
    }
}

