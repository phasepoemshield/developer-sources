/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00398
 *  minecraft.class07078
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00398;
import minecraft.class07078;

public final class HoverNode$EntityNodeContent
extends Record {
    final class07078<?> entityType;
    final UUID uuid;
    final TextNode name;

    public UUID uuid() {
        return this.uuid;
    }

    public HoverNode$EntityNodeContent(class07078<?> class070782, UUID uUID, TextNode textNode) {
        this.entityType = class070782;
        this.uuid = uUID;
        this.name = textNode;
    }

    public TextNode name() {
        return this.name;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{HoverNode$EntityNodeContent.class, "entityType;uuid;name", "entityType", "uuid", "name"}, this, object);
    }

    public String toString() {
        return "HoverNode$EntityNodeContent{id=" + class07078.N(this.entityType).toString() + ",uuid=[" + this.uuid.toString() + "],name={" + (this.name != null ? this.name.toText().N() : "<NULL>") + "}}";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{HoverNode$EntityNodeContent.class, "entityType;uuid;name", "entityType", "uuid", "name"}, this);
    }

    public class07078<?> entityType() {
        return this.entityType;
    }

    public class00398 toVanilla(ParserContext parserContext) {
        return new class00398(this.entityType, this.uuid, Optional.ofNullable(this.name != null ? this.name.toText(parserContext, true) : null));
    }
}

