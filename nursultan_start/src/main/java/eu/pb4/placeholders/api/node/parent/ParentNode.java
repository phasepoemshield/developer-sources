/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.GeneralUtils
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05216
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$Transformer;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05216;

public class ParentNode
implements ParentTextNode {
    public static final ParentNode EMPTY = new ParentNode(new TextNode[0]);
    protected final TextNode[] children;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new ParentNode(textNodeArray);
    }

    @Override
    public final TextNode[] getChildren() {
        return this.children;
    }

    public ParentNode(TextNode ... textNodeArray) {
        this.children = textNodeArray;
    }

    public ParentNode(Collection<TextNode> collection) {
        this(collection.toArray(GeneralUtils.CASTER));
    }

    public String toString() {
        return "ParentNode{children=" + Arrays.toString(this.children) + "}";
    }

    @Override
    public final class00392 toText(ParserContext parserContext, boolean bl) {
        DynamicShadowNode$Transformer dynamicShadowNode$Transformer;
        boolean bl2 = parserContext != null && parserContext.get(ParserContext$Key.COMPACT_TEXT) != Boolean.FALSE;
        DynamicShadowNode$Transformer dynamicShadowNode$Transformer2 = parserContext.get(ParserContext$Key.DEFAULT_SHADOW_STYLER);
        ParentNode parentNode = this;
        if (parentNode instanceof DynamicShadowNode$Transformer && (dynamicShadowNode$Transformer = (DynamicShadowNode$Transformer)((Object)parentNode)).hasShadowColor(parserContext)) {
            parserContext.with(ParserContext$Key.DEFAULT_SHADOW_STYLER, dynamicShadowNode$Transformer);
        }
        if (this.children.length == 0) {
            parserContext.with(ParserContext$Key.DEFAULT_SHADOW_STYLER, dynamicShadowNode$Transformer2);
            return class00392.i();
        }
        if (this.children.length == 1 && this.children[0] != null && bl2) {
            dynamicShadowNode$Transformer = this.children[0].toText(parserContext, true);
            if (GeneralUtils.isEmpty((class00392)dynamicShadowNode$Transformer)) {
                return dynamicShadowNode$Transformer;
            }
            parserContext.with(ParserContext$Key.DEFAULT_SHADOW_STYLER, dynamicShadowNode$Transformer2);
            return this.applyFormatting(dynamicShadowNode$Transformer.L(), parserContext);
        }
        dynamicShadowNode$Transformer = bl2 ? null : class00392.i();
        for (int i = 0; i < this.children.length; ++i) {
            class00392 class003922;
            if (this.children[i] == null || GeneralUtils.isEmpty((class00392)(class003922 = this.children[i].toText(parserContext, true)))) continue;
            if (dynamicShadowNode$Transformer == null) {
                if (class003922.method_10866().B()) {
                    dynamicShadowNode$Transformer = class003922.L();
                    continue;
                }
                dynamicShadowNode$Transformer = class00392.i();
                dynamicShadowNode$Transformer.y(class003922);
                continue;
            }
            dynamicShadowNode$Transformer.y(class003922);
        }
        parserContext.with(ParserContext$Key.DEFAULT_SHADOW_STYLER, dynamicShadowNode$Transformer2);
        if (dynamicShadowNode$Transformer == null || GeneralUtils.isEmpty((class00392)dynamicShadowNode$Transformer)) {
            return class00392.i();
        }
        return this.applyFormatting((class05216)dynamicShadowNode$Transformer, parserContext);
    }

    protected class00405 applyFormatting(class00405 class004052, ParserContext parserContext) {
        return class004052;
    }

    protected class00392 applyFormatting(class05216 class052162, ParserContext parserContext) {
        return class052162.y(this.applyFormatting(class052162.method_10866(), parserContext));
    }
}

