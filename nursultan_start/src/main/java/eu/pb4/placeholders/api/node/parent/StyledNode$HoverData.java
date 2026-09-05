/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00395
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.HoverNode;
import eu.pb4.placeholders.api.node.parent.HoverNode$Action;
import eu.pb4.placeholders.api.node.parent.HoverNode$EntityNodeContent;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00395;

public final class StyledNode$HoverData<T>
extends Record {
    private final HoverNode$Action<T, ?> action;
    final T data;

    public StyledNode$HoverData(HoverNode$Action<T, ?> hoverNode$Action, T t) {
        this.action = hoverNode$Action;
        this.data = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{StyledNode$HoverData.class, "action;data", "action", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{StyledNode$HoverData.class, "action;data", "action", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{StyledNode$HoverData.class, "action;data", "action", "data"}, this);
    }

    public T data() {
        return this.data;
    }

    public HoverNode$Action<T, ?> action() {
        return this.action;
    }

    public StyledNode$HoverData<T> parse(NodeParser nodeParser) {
        if (this.action == HoverNode$Action.TEXT_NODE) {
            return new StyledNode$HoverData<TextNode>(this.action, nodeParser.parseNode((TextNode)this.data));
        }
        if (this.action == HoverNode$Action.ENTITY_NODE && ((HoverNode$EntityNodeContent)((Object)this.data)).name() != null) {
            HoverNode$EntityNodeContent hoverNode$EntityNodeContent = (HoverNode$EntityNodeContent)((Object)this.data);
            return new StyledNode$HoverData<HoverNode$EntityNodeContent>(this.action, new HoverNode$EntityNodeContent(hoverNode$EntityNodeContent.entityType(), hoverNode$EntityNodeContent.uuid(), nodeParser.parseNode(hoverNode$EntityNodeContent.name())));
        }
        return this;
    }

    public class00395 toVanilla(ParserContext parserContext) {
        return HoverNode.toVanilla(this.action, this.data, parserContext);
    }

    public boolean isDynamic() {
        if (this.action == HoverNode$Action.TEXT_NODE) {
            return ((TextNode)this.data).isDynamic();
        }
        if (this.action == HoverNode$Action.ENTITY_NODE && ((HoverNode$EntityNodeContent)((Object)this.data)).name() != null) {
            return ((HoverNode$EntityNodeContent)((Object)this.data)).name().isDynamic();
        }
        return this.action == HoverNode$Action.LAZY_ITEM_STACK;
    }
}

