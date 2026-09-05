/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.GeneralUtils
 *  minecraft.class00392
 *  minecraft.class05194
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$Transformer;
import eu.pb4.placeholders.impl.GeneralUtils;
import minecraft.class00392;
import minecraft.class05194;

public interface DynamicShadowNode$SimpleColoredTransformer
extends DynamicShadowNode$Transformer {
    @Override
    default public class00392 applyShadowColors(class00392 class003922, float f, float f2, ParserContext parserContext) {
        int n = this.getDefaultShadowColor(class003922, f, f2, parserContext);
        return GeneralUtils.cloneTransformText((class00392)class003922, class052162 -> {
            class05194 class051942 = class052162.method_10866().N();
            return class052162.y(class052162.method_10866().y(class051942 != null ? DynamicShadowNode.modifiedColor(class051942.N(), f, f2) : n));
        }, class003923 -> class003923 == class003922 || class003923.method_10866().y() == null && class003923.method_10866().N() != null);
    }

    public int getDefaultShadowColor(class00392 var1, float var2, float var3, ParserContext var4);
}

