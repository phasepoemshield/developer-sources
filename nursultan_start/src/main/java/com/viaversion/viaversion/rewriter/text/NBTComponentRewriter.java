/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter.text;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import org.checkerframework.checker.nullness.qual.Nullable;

public class NBTComponentRewriter<C extends ClientboundPacketType>
extends ComponentRewriterBase<C> {
    public NBTComponentRewriter(Protocol<C, ?, ?, ?> protocol) {
        super(protocol, ComponentRewriterBase.ReadType.NBT);
    }

    public void registerPlayerChat1_21_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            int lastSeen = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < lastSeen; ++i) {
                int index = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (index != 0) continue;
                wrapper.passthrough((Type)Types.SIGNATURE_BYTES);
            }
            this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
            int filterMaskType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (filterMaskType == 2) {
                wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            }
            wrapper.passthrough((Type)ChatType.TYPE);
            this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
        });
    }

    @Override
    protected void handleNestedComponent(UserConnection connection, @Nullable Tag tag) {
        this.processTag(connection, tag);
    }

    @Override
    protected void handleHoverEvent(UserConnection connection, CompoundTag hoverEventTag) {
        StringTag actionTag = hoverEventTag.getStringTag("action");
        if (actionTag == null) {
            return;
        }
        String action = actionTag.getValue();
        if (action.equals("show_text")) {
            this.processTag(connection, hoverEventTag.get("value"));
        } else if (action.equals("show_entity")) {
            this.processTag(connection, hoverEventTag.get("name"));
            StringTag idTag = hoverEventTag.getStringTag("id");
            if (idTag != null && this.protocol.getEntityRewriter() != null) {
                idTag.setValue(this.protocol.getEntityRewriter().mappedEntityIdentifier(idTag.getValue()));
            }
        } else if (action.equals("show_item")) {
            CompoundTag componentsTag = hoverEventTag.getCompoundTag("components");
            this.handleShowItem(connection, hoverEventTag, componentsTag);
        }
    }

    @Override
    protected void handleHoverEvent(UserConnection connection, JsonObject hoverEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    protected void processCompoundTag(UserConnection connection, CompoundTag tag) {
        super.processCompoundTag(connection, tag);
        CompoundTag clickEvent = tag.getCompoundTag("click_event");
        if (clickEvent != null) {
            this.handleClickEvent(connection, clickEvent);
        }
    }

    protected void handleClickEvent(UserConnection connection, CompoundTag clickEventTag) {
        StringTag actionTag = clickEventTag.getStringTag("action");
        if (actionTag == null) {
            return;
        }
        String action = actionTag.getValue();
        if (!action.equals("show_dialog")) {
            return;
        }
        CompoundTag dialogTag = clickEventTag.getCompoundTag("dialog");
        if (dialogTag == null) {
            return;
        }
        RegistryDataRewriter registryRewriter = this.protocol.getRegistryDataRewriter();
        if (registryRewriter != null) {
            registryRewriter.updateDialog(connection, dialogTag);
        }
    }

    @Override
    protected String hoverEventKey() {
        return "hover_event";
    }
}

