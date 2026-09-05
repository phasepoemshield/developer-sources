/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.GeneralUtils
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.node.EmptyNode;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.List;
import minecraft.class00392;

public interface TextNode {
    public static TextNode convert(class00392 class003922) {
        return GeneralUtils.convertToNodes((class00392)class003922);
    }

    public static TextNode wrap(TextNode ... textNodeArray) {
        return new ParentNode(textNodeArray);
    }

    public static TextNode wrap(List<TextNode> list) {
        return new ParentNode(list.toArray(GeneralUtils.CASTER));
    }

    public static TextNode of(String string) {
        return new LiteralNode(string);
    }

    public static TextNode empty() {
        return EmptyNode.INSTANCE;
    }

    public static TextNode[] array(TextNode ... textNodeArray) {
        return textNodeArray;
    }

    default public class00392 toText(ParserContext parserContext) {
        return this.toText(parserContext, true);
    }

    default public class00392 toText(PlaceholderContext placeholderContext) {
        return this.toText(placeholderContext.asParserContext(), true);
    }

    default public class00392 toText() {
        return this.toText(ParserContext.of(), true);
    }

    public class00392 toText(ParserContext var1, boolean var2);

    public static TextNode asSingle(List<TextNode> list) {
        return switch (list.size()) {
            case 0 -> EmptyNode.INSTANCE;
            case 1 -> list.get(0);
            default -> TextNode.wrap(list);
        };
    }

    public static TextNode asSingle(TextNode ... textNodeArray) {
        return switch (textNodeArray.length) {
            case 0 -> EmptyNode.INSTANCE;
            case 1 -> textNodeArray[0];
            default -> TextNode.wrap(textNodeArray);
        };
    }

    default public boolean isDynamic() {
        return false;
    }
}

