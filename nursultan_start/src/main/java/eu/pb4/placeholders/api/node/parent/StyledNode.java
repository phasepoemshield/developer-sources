/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class00425
 *  minecraft.class00623
 *  minecraft.class00625
 *  minecraft.class00627
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class00661
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.HoverNode$Action;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import eu.pb4.placeholders.api.node.parent.StyledNode$HoverData;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.net.URI;
import minecraft.class00405;
import minecraft.class00425;
import minecraft.class00623;
import minecraft.class00625;
import minecraft.class00627;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class00661;

public final class StyledNode
extends SimpleStylingNode {
    private final class00405 style;
    private final StyledNode$HoverData<?> hoverValue;
    private final TextNode clickValue;
    private final TextNode insertion;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray, NodeParser nodeParser) {
        return new StyledNode(textNodeArray, this.style, this.hoverValue != null ? this.hoverValue.parse(nodeParser) : null, this.clickValue != null ? TextNode.asSingle(nodeParser.parseNodes(this.clickValue)) : null, this.insertion != null ? TextNode.asSingle(nodeParser.parseNodes(this.insertion)) : null);
    }

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new StyledNode(textNodeArray, this.style, this.hoverValue, this.clickValue, this.insertion);
    }

    public class00405 rawStyle() {
        return this.style;
    }

    @Override
    public class00405 style(ParserContext parserContext) {
        class00405 class004052 = this.style;
        if (this.hoverValue != null && class004052.z() != null && class004052.z().N() == class00425.field_24342) {
            class004052 = class004052.N(this.hoverValue.toVanilla(parserContext));
        }
        if (this.clickValue != null && class004052.Z() != null) {
            String string = this.clickValue.toText(parserContext, true).getString();
            switch (class004052.Z().N()) {
                case field_11749: {
                    try {
                        class004052 = class004052.N((class00647)new class00652(URI.create(string)));
                    }
                    catch (Exception exception) {}
                    break;
                }
                case field_11748: {
                    try {
                        class004052 = class004052.N((class00647)new class00661(Integer.parseInt(string)));
                    }
                    catch (Exception exception) {}
                    break;
                }
                case field_11746: {
                    class004052 = class004052.N((class00647)new class00623(string));
                    break;
                }
                case field_11750: {
                    class004052 = class004052.N((class00647)new class00625(string));
                    break;
                }
                case field_11745: {
                    class004052 = class004052.N((class00647)new class00640(string));
                    break;
                }
                case field_21462: {
                    class004052 = class004052.N((class00647)new class00627(string));
                }
            }
        }
        if (this.insertion != null) {
            class004052 = class004052.N(this.insertion.toText(parserContext, true).getString());
        }
        return class004052;
    }

    public StyledNode(TextNode[] textNodeArray, class00405 class004052, StyledNode$HoverData<?> styledNode$HoverData, TextNode textNode, TextNode textNode2) {
        super(textNodeArray);
        this.style = class004052;
        this.hoverValue = styledNode$HoverData;
        this.clickValue = textNode;
        this.insertion = textNode2;
    }

    public StyledNode(TextNode[] textNodeArray, class00405 class004052, ParentNode parentNode, TextNode textNode, TextNode textNode2) {
        this(textNodeArray, class004052, parentNode != null ? new StyledNode$HoverData<ParentNode>(HoverNode$Action.TEXT_NODE, parentNode) : null, textNode, textNode2);
    }

    @Override
    public String toString() {
        return "StyledNode{style=" + String.valueOf(this.style) + ", hoverValue=" + String.valueOf(this.hoverValue) + ", clickValue=" + String.valueOf(this.clickValue) + ", insertion=" + String.valueOf(this.insertion) + "}";
    }

    @Deprecated(forRemoval=true)
    public ParentNode hoverValue() {
        ParentNode parentNode;
        Object t;
        if (this.hoverValue != null && (t = this.hoverValue.data) instanceof TextNode) {
            TextNode textNode = (TextNode)t;
            parentNode = new ParentNode(textNode);
        } else {
            parentNode = null;
        }
        return parentNode;
    }

    public TextNode clickValue() {
        return this.clickValue;
    }

    public StyledNode$HoverData<?> hover() {
        return this.hoverValue;
    }

    public TextNode insertion() {
        return this.insertion;
    }

    @Override
    public boolean isDynamicNoChildren() {
        return this.clickValue != null && this.clickValue.isDynamic() || this.hoverValue != null && this.hoverValue.isDynamic() || this.insertion != null && this.insertion.isDynamic();
    }
}

