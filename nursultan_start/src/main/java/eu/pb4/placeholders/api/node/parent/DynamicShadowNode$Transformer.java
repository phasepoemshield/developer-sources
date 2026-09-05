/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import minecraft.class00392;

public interface DynamicShadowNode$Transformer {
    public class00392 applyShadowColors(class00392 var1, float var2, float var3, ParserContext var4);

    default public boolean hasShadowColor(ParserContext parserContext) {
        return true;
    }
}

