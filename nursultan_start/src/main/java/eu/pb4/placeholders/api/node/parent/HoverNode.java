/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00380
 *  minecraft.class00391
 *  minecraft.class00395
 *  minecraft.class00398
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class01929
 *  minecraft.class06584
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.HoverNode$Action;
import eu.pb4.placeholders.api.node.parent.HoverNode$EntityNodeContent;
import eu.pb4.placeholders.api.node.parent.HoverNode$LazyItemStackNodeContent;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.node.parent.SimpleStylingNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.util.Arrays;
import minecraft.class00380;
import minecraft.class00391;
import minecraft.class00395;
import minecraft.class00398;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class01929;
import minecraft.class06584;

public final class HoverNode<T, H>
extends SimpleStylingNode {
    private final HoverNode$Action<T, H> action;
    private final T value;

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray) {
        return new HoverNode<T, H>(textNodeArray, this.action, this.value);
    }

    @Override
    public ParentTextNode copyWith(TextNode[] textNodeArray, NodeParser nodeParser) {
        if (this.value == null) {
            return this.copyWith(textNodeArray);
        }
        if (this.action == HoverNode$Action.TEXT_NODE) {
            return new HoverNode<TextNode, class00401>(textNodeArray, HoverNode$Action.TEXT_NODE, nodeParser.parseNode((TextNode)this.value));
        }
        if (this.action == HoverNode$Action.ENTITY_NODE && ((HoverNode$EntityNodeContent)((Object)this.value)).name != null) {
            HoverNode$EntityNodeContent hoverNode$EntityNodeContent = (HoverNode$EntityNodeContent)((Object)this.value);
            return new HoverNode<HoverNode$EntityNodeContent, class00391>(textNodeArray, HoverNode$Action.ENTITY_NODE, new HoverNode$EntityNodeContent(hoverNode$EntityNodeContent.entityType, hoverNode$EntityNodeContent.uuid, nodeParser.parseNode(hoverNode$EntityNodeContent.name)));
        }
        if (this.action == HoverNode$Action.LAZY_ITEM_STACK && ((HoverNode$LazyItemStackNodeContent)((Object)this.value)).identifier != null) {
            HoverNode$LazyItemStackNodeContent hoverNode$LazyItemStackNodeContent = (HoverNode$LazyItemStackNodeContent)((Object)this.value);
            return new HoverNode(textNodeArray, HoverNode$Action.LAZY_ITEM_STACK, new HoverNode$LazyItemStackNodeContent(hoverNode$LazyItemStackNodeContent.identifier, hoverNode$LazyItemStackNodeContent.count, hoverNode$LazyItemStackNodeContent.ops, hoverNode$LazyItemStackNodeContent.componentMap));
        }
        if (this.action == HoverNode$Action.VANILLA_ITEM_STACK && ((class00380)this.value).y() != null) {
            class06584 class065842 = ((class00380)this.value).y();
            return new HoverNode<class00380, class00380>(textNodeArray, HoverNode$Action.VANILLA_ITEM_STACK, new class00380(class065842));
        }
        if (this.action == HoverNode$Action.VANILLA_ENTITY && ((class00391)this.value).y() != null) {
            class00398 class003982 = ((class00391)this.value).y();
            return new HoverNode<class00391, class00391>(textNodeArray, HoverNode$Action.VANILLA_ENTITY, new class00391(class003982));
        }
        return this.copyWith(textNodeArray);
    }

    @Override
    protected class00405 style(ParserContext parserContext) {
        return class00405.N.N(HoverNode.toVanilla(this.action, this.value, parserContext));
    }

    public HoverNode(TextNode[] textNodeArray, HoverNode$Action<T, H> hoverNode$Action, T t) {
        super(textNodeArray);
        this.action = hoverNode$Action;
        this.value = t;
    }

    public T value() {
        return this.value;
    }

    @Override
    public String toString() {
        return "HoverNode{value=" + String.valueOf(this.value) + ", children=" + Arrays.toString(this.children) + "}";
    }

    public HoverNode$Action<T, H> action() {
        return this.action;
    }

    public static <T> class00395 toVanilla(HoverNode$Action<T, ?> hoverNode$Action, T t, ParserContext parserContext) {
        if (hoverNode$Action == HoverNode$Action.TEXT_NODE) {
            return new class00401(((TextNode)t).toText(parserContext.copyWithoutNodeContext(), true));
        }
        if (hoverNode$Action == HoverNode$Action.ENTITY_NODE) {
            return new class00391(((HoverNode$EntityNodeContent)((Object)t)).toVanilla(parserContext.copyWithoutNodeContext()));
        }
        if (hoverNode$Action == HoverNode$Action.LAZY_ITEM_STACK) {
            class01929 class019292;
            if (parserContext.contains(ParserContext$Key.WRAPPER_LOOKUP)) {
                class019292 = parserContext.getOrThrow(ParserContext$Key.WRAPPER_LOOKUP);
            } else if (parserContext.contains(PlaceholderContext.KEY)) {
                class019292 = parserContext.getOrThrow(PlaceholderContext.KEY).server().yt();
            } else {
                return null;
            }
            return new class00380(((HoverNode$LazyItemStackNodeContent)((Object)t)).toVanilla(class019292));
        }
        if (hoverNode$Action == HoverNode$Action.VANILLA_ITEM_STACK) {
            return new class00380(((class00380)t).y());
        }
        if (hoverNode$Action == HoverNode$Action.VANILLA_ENTITY) {
            return new class00391(((class00391)t).y());
        }
        return null;
    }

    @Override
    public boolean isDynamicNoChildren() {
        return this.action == HoverNode$Action.TEXT_NODE && ((TextNode)this.value).isDynamic() || this.action == HoverNode$Action.ENTITY_NODE && ((HoverNode$EntityNodeContent)((Object)this.value)).name.isDynamic() || this.action == HoverNode$Action.LAZY_ITEM_STACK;
    }
}

