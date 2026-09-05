/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.GeneralUtils$MutableTransformer
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05216
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.Arrays;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05216;

public final class TransformNode
extends ParentNode {
    private final Function<class05216, class00392> transform;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new TransformNode(textNodeArray, this.transform);
    }

    public TransformNode(TextNode[] textNodeArray, Function<class05216, class00392> function) {
        super(textNodeArray);
        this.transform = function;
    }

    @Override
    public String toString() {
        return "TransformNode{transform=" + String.valueOf(this.transform) + ", children=" + Arrays.toString(this.children) + "}";
    }

    public static TransformNode deepStyle(Function<class00405, class00405> function, TextNode ... textNodeArray) {
        return new TransformNode(textNodeArray, (Function<class05216, class00392>)new GeneralUtils.MutableTransformer(function));
    }

    @Override
    protected class00392 applyFormatting(class05216 class052162, ParserContext parserContext) {
        return this.transform.apply(class052162);
    }
}

