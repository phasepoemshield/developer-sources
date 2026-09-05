/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05194
 */
package eu.pb4.placeholders.api.node.parent;

import com.mojang.serialization.DataResult;
import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode;
import eu.pb4.placeholders.api.node.parent.DynamicShadowNode$SimpleColoredTransformer;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.util.Arrays;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05194;

public final class DynamicColorNode
extends SimpleStylingNode
implements DynamicShadowNode$SimpleColoredTransformer {
    private static final Function<String, class05194> DEFAULT_RESOLVER = string -> class05194.N((String)string).result().orElse(null);
    private final TextNode color;
    private final Function<String, class05194> resolver;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray, NodeParser nodeParser) {
        return new DynamicColorNode(textNodeArray, nodeParser.parseNode(this.color));
    }

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new DynamicColorNode(textNodeArray, this.color);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        class05194 class051942 = this.resolver.apply(this.color.toText(parserContext).getString());
        return class051942 != null ? class00405.N.N(class051942) : class00405.N;
    }

    public DynamicColorNode(TextNode[] textNodeArray, TextNode textNode) {
        this(textNodeArray, textNode, DEFAULT_RESOLVER);
    }

    public DynamicColorNode(TextNode[] textNodeArray, TextNode textNode, Function<String, class05194> function) {
        super(textNodeArray);
        this.color = textNode;
        this.resolver = function;
    }

    @Override
    public String toString() {
        return "ColorNode{color=" + String.valueOf(this.color) + ", children=" + Arrays.toString(this.children) + "}";
    }

    @Override
    public int getDefaultShadowColor(class00392 class003922, float f, float f2, ParserContext parserContext) {
        DataResult dataResult = class05194.N((String)this.color.toText(parserContext).getString());
        if (dataResult.result().isPresent()) {
            return DynamicShadowNode.modifiedColor(((class05194)dataResult.getOrThrow()).N(), f, f2);
        }
        return 0;
    }

    @Override
    public boolean isDynamicNoChildren() {
        return this.color.isDynamic();
    }

    public static Function<String, class05194> extendedTextColorParse(Function<String, class05194> function) {
        return string -> {
            class05194 class051942 = (class05194)function.apply((String)string);
            if (class051942 != null) {
                return class051942;
            }
            return class05194.N((String)string).result().orElse(null);
        };
    }

    @Override
    public boolean hasShadowColor(ParserContext parserContext) {
        return class05194.N((String)this.color.toText(parserContext).getString()).result().isPresent();
    }
}

