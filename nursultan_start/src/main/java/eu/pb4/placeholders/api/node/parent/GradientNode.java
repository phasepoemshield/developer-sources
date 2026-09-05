/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.GeneralUtils
 *  minecraft.class00392
 *  minecraft.class05194
 *  minecraft.class05216
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$Transformer;
import eu.pb4.placeholders.api.node.parent.GradientNode$GradientProvider;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.Arrays;
import java.util.List;
import minecraft.class00392;
import minecraft.class05194;
import minecraft.class05216;

public final class GradientNode
extends ParentNode
implements DynamicShadowNode$Transformer {
    private final GradientNode$GradientProvider gradientProvider;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new GradientNode(textNodeArray, this.gradientProvider);
    }

    public static GradientNode colors(List<class05194> list, TextNode ... textNodeArray) {
        return new GradientNode(textNodeArray, GradientNode$GradientProvider.colors(list));
    }

    public static GradientNode colors(class05194 class051942, class05194 class051943, TextNode ... textNodeArray) {
        return GradientNode.colors(List.of(class051942, class051943), textNodeArray);
    }

    public GradientNode(TextNode[] textNodeArray, GradientNode$GradientProvider gradientNode$GradientProvider) {
        super(textNodeArray);
        this.gradientProvider = gradientNode$GradientProvider;
    }

    @Override
    public String toString() {
        return "GradientNode{gradientProvider=" + String.valueOf(this.gradientProvider) + ", children=" + Arrays.toString(this.children) + "}";
    }

    public static class00392 apply(class00392 class003922, GradientNode$GradientProvider gradientNode$GradientProvider) {
        return GeneralUtils.toGradient((class00392)class003922, (GradientNode$GradientProvider)gradientNode$GradientProvider);
    }

    @Override
    public class00392 applyShadowColors(class00392 class003922, float f, float f2, ParserContext parserContext) {
        return GeneralUtils.toGradientShadow((class00392)class003922, (float)f, (float)f2, (GradientNode$GradientProvider)this.gradientProvider);
    }

    @Override
    protected class00392 applyFormatting(class05216 class052162, ParserContext parserContext) {
        return GeneralUtils.toGradient((class00392)class052162, (GradientNode$GradientProvider)this.gradientProvider);
    }

    public static GradientNode rainbow(float f, float f2, float f3, TextNode ... textNodeArray) {
        return GradientNode.rainbow(f, f2, f3, 0.0f, textNodeArray);
    }

    public static GradientNode rainbow(float f, float f2, float f3, float f4, int n, TextNode ... textNodeArray) {
        return new GradientNode(textNodeArray, GradientNode$GradientProvider.rainbow(f, f2, f3, f4, n));
    }

    public static GradientNode rainbow(float f, float f2, TextNode ... textNodeArray) {
        return GradientNode.rainbow(f, f2, 1.0f, 0.0f, textNodeArray);
    }

    public static GradientNode rainbow(float f, TextNode ... textNodeArray) {
        return GradientNode.rainbow(f, 1.0f, 1.0f, 0.0f, textNodeArray);
    }

    public static GradientNode rainbow(TextNode ... textNodeArray) {
        return GradientNode.rainbow(1.0f, 1.0f, 1.0f, 0.0f, textNodeArray);
    }

    public static GradientNode rainbow(float f, float f2, float f3, float f4, TextNode ... textNodeArray) {
        return new GradientNode(textNodeArray, GradientNode$GradientProvider.rainbow(f, f2, f3, f4));
    }

    public static GradientNode colorsHard(List<class05194> list, TextNode ... textNodeArray) {
        return new GradientNode(textNodeArray, GradientNode$GradientProvider.colorsHard(list));
    }

    public static GradientNode colorsHard(class05194 class051942, class05194 class051943, TextNode ... textNodeArray) {
        return GradientNode.colorsHard(List.of(class051942, class051943), textNodeArray);
    }
}

