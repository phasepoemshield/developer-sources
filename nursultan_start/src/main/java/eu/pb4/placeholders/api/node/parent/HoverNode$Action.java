/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00380
 *  minecraft.class00391
 *  minecraft.class00401
 *  minecraft.class00425
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.HoverNode$EntityNodeContent;
import eu.pb4.placeholders.api.node.parent.HoverNode$LazyItemStackNodeContent;
import minecraft.class00380;
import minecraft.class00391;
import minecraft.class00401;
import minecraft.class00425;

public record HoverNode$Action<T, H>(class00425 vanillaType) {
    public static final HoverNode$Action<TextNode, class00401> TEXT_NODE = new HoverNode$Action(class00425.field_24342);
    public static final HoverNode$Action<HoverNode.LazyItemStackNodeContent<?>, class00380> LAZY_ITEM_STACK = new HoverNode$Action(class00425.field_24343);
    public static final HoverNode$Action<HoverNode.EntityNodeContent, class00391> ENTITY_NODE = new HoverNode$Action(class00425.field_24344);
    public static final HoverNode$Action<class00380, class00380> VANILLA_ITEM_STACK = new HoverNode$Action(class00425.field_24343);
    public static final HoverNode$Action<class00391, class00391> VANILLA_ENTITY = new HoverNode$Action(class00425.field_24344);

    public String toString() {
        return "HoverNode$Action{vanillaType={" + this.vanillaType.name() + "}}";
    }
}

