/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class00913
 *  minecraft.class00949
 *  minecraft.class01894
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import java.util.Arrays;
import minecraft.class00405;
import minecraft.class00913;
import minecraft.class00949;
import minecraft.class01894;

public final class FontNode
extends SimpleStylingNode {
    private final class01894 font;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new FontNode(textNodeArray, this.font);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return class00405.N.N((class00949)new class00913(this.font));
    }

    public FontNode(TextNode[] textNodeArray, class01894 class018942) {
        super(textNodeArray);
        this.font = class018942;
    }

    @Override
    public String toString() {
        return "FontNode{font=" + String.valueOf(this.font) + ", children=" + Arrays.toString(this.children) + "}";
    }
}

