/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.GeneralUtils
 *  minecraft.class00392
 *  minecraft.class02566
 *  minecraft.class05194
 *  minecraft.class05216
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$Transformer;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.impl.GeneralUtils;
import minecraft.class00392;
import minecraft.class02566;
import minecraft.class05194;
import minecraft.class05216;

public final class DynamicShadowNode
extends ParentNode {
    private final float scale;
    private final float alpha;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new DynamicShadowNode(textNodeArray, this.scale, this.alpha);
    }

    public DynamicShadowNode(TextNode[] textNodeArray) {
        this(textNodeArray, 0.25f, 1.0f);
    }

    public DynamicShadowNode(TextNode[] textNodeArray, float f, float f2) {
        super(textNodeArray);
        this.scale = f;
        this.alpha = f2;
    }

    @Override
    public String toString() {
        return "DynamicShadowNode{scale=" + this.scale + "}";
    }

    public static int modifiedColor(int n, float f, float f2) {
        return class02566.y((int)n, (float)f) | 0xFF000000;
    }

    @Override
    protected class00392 applyFormatting(class05216 class052163, ParserContext parserContext) {
        DynamicShadowNode$Transformer dynamicShadowNode$Transformer = parserContext.get(ParserContext$Key.DEFAULT_SHADOW_STYLER);
        if (dynamicShadowNode$Transformer == null) {
            int n = DynamicShadowNode.modifiedColor(class052163.method_10866().N() != null ? class052163.method_10866().N().N() : 0xFFFFFF, this.scale, this.alpha);
            return GeneralUtils.cloneTransformText((class00392)class052163, class052162 -> {
                class05194 class051942 = class052162.method_10866().N();
                return class052162.y(class052162.method_10866().y(class051942 != null ? DynamicShadowNode.modifiedColor(class051942.N(), this.scale, this.alpha) : n));
            }, class003922 -> class003922 == class052163 || class003922.method_10866().y() == null && class003922.method_10866().N() != null);
        }
        return dynamicShadowNode$Transformer.applyShadowColors((class00392)class052163, this.scale, this.alpha, parserContext);
    }
}

