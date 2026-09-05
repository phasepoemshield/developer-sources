/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00926
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import minecraft.class00392;
import minecraft.class00926;

public record ObjectNode(class00926 content) implements TextNode
{
    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        return class00392.N((class00926)this.content);
    }
}

