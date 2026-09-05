/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00926
 *  minecraft.class02689
 *  minecraft.class06609
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.DynamicPlayerHeadNode$Type;
import eu.pb4.placeholders.api.node.TextNode;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class00926;
import minecraft.class02689;
import minecraft.class06609;

public record DynamicPlayerHeadNode(TextNode name, boolean hat, DynamicPlayerHeadNode$Type type) implements TextNode
{
    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        String string = this.name.toText(parserContext).getString();
        if (this.type == DynamicPlayerHeadNode$Type.UUID || this.type == DynamicPlayerHeadNode$Type.EITHER) {
            try {
                return class00392.N((class00926)new class06609(class02689.N((UUID)UUID.fromString(string)), this.hat));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (this.type == DynamicPlayerHeadNode$Type.NAME || this.type == DynamicPlayerHeadNode$Type.EITHER) {
            try {
                return class00392.N((class00926)new class06609(class02689.N((String)string), this.hat));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return class00392.N((class00926)new class06609(class02689.N((String)""), this.hat));
    }
}

