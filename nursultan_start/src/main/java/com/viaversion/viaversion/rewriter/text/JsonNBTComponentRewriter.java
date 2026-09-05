/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter.text;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import java.util.BitSet;
import org.checkerframework.checker.nullness.qual.Nullable;

public class JsonNBTComponentRewriter<C extends ClientboundPacketType>
extends ComponentRewriterBase<C> {
    public JsonNBTComponentRewriter(Protocol<C, ?, ?, ?> protocol, ComponentRewriterBase.ReadType type) {
        super(protocol, type);
    }

    @Override
    protected void handleWrittenBookContents(UserConnection connection, CompoundTag tag) {
        if (this.inputSerializerVersion() != null) {
            super.handleWrittenBookContents(connection, tag);
        }
    }

    @Override
    protected void handleNestedComponent(UserConnection connection, @Nullable Tag tag) {
        if (!(tag instanceof StringTag)) {
            return;
        }
        StringTag stringTag = (StringTag)tag;
        SerializerVersion input = this.inputSerializerVersion();
        SerializerVersion output = this.outputSerializerVersion();
        Tag asTag = input.toTag(input.toComponent(stringTag.getValue()));
        this.processTag(connection, asTag);
        stringTag.setValue(output.toString(output.toComponent(asTag)));
    }

    public void registerPlayerCombat(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            if ((Integer)wrapper.passthrough((Type)Types.VAR_INT) == 2) {
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.passthrough((Type)Types.INT);
                this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
            }
        });
    }

    public void registerPlayerCombatKill(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.INT);
            this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
        });
    }

    public void registerPlayerInfoUpdate1_20_3(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            BitSet actions = (BitSet)wrapper.passthrough((Type)Types.PROFILE_ACTIONS_ENUM1_19_3);
            if (!actions.get(5)) {
                return;
            }
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                wrapper.passthrough(Types.UUID);
                if (actions.get(0)) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                }
                if (actions.get(1) && ((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.UUID);
                    wrapper.passthrough(Types.PROFILE_KEY);
                }
                if (actions.get(2)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (actions.get(3)) {
                    wrapper.passthrough((Type)Types.BOOLEAN);
                }
                if (actions.get(4)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
            }
        });
    }

    @Override
    protected void handleHoverEvent(UserConnection connection, CompoundTag hoverEventTag) {
        StringTag actionTag = hoverEventTag.getStringTag("action");
        if (actionTag == null) {
            return;
        }
        String action = actionTag.getValue();
        if (action.equals("show_text")) {
            Tag value = hoverEventTag.get("value");
            this.processTag(connection, value != null ? value : hoverEventTag.get("contents"));
        } else if (action.equals("show_entity")) {
            this.convertLegacyEntityContents(hoverEventTag);
            CompoundTag contents = hoverEventTag.getCompoundTag("contents");
            if (contents != null) {
                this.processTag(connection, contents.get("name"));
                StringTag typeTag = contents.getStringTag("type");
                if (typeTag != null && this.protocol.getEntityRewriter() != null) {
                    typeTag.setValue(this.protocol.getEntityRewriter().mappedEntityIdentifier(typeTag.getValue()));
                }
            }
        } else if (action.equals("show_item")) {
            this.convertLegacyItemContents(hoverEventTag);
            CompoundTag contentsTag = hoverEventTag.getCompoundTag("contents");
            if (contentsTag != null) {
                CompoundTag componentsTag = contentsTag.getCompoundTag("components");
                this.handleShowItem(connection, contentsTag, componentsTag);
            }
        }
    }

    @Override
    protected void handleHoverEvent(UserConnection connection, JsonObject hoverEvent) {
        JsonElement contents;
        JsonPrimitive actionElement = hoverEvent.getAsJsonPrimitive("action");
        if (!actionElement.isString()) {
            return;
        }
        String action = actionElement.getAsString();
        if (action.equals("show_text")) {
            JsonElement value = hoverEvent.get("value");
            this.processText(connection, value != null ? value : hoverEvent.get("contents"));
        } else if (action.equals("show_entity") && (contents = hoverEvent.get("contents")) != null && contents.isJsonObject()) {
            this.processText(connection, contents.getAsJsonObject().get("name"));
        }
    }

    public void registerPlayerChat(C packetType, Type<?> chatType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
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
            wrapper.passthrough(chatType);
            this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
        });
    }

    public void registerTitle(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action >= 0 && action <= 2) {
                this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
            }
        });
    }

    @Override
    protected String hoverEventKey() {
        return "hoverEvent";
    }

    protected void convertLegacyEntityContents(CompoundTag hoverEvent) {
        if (this.inputSerializerVersion() == null) {
            return;
        }
        Tag valueTag = hoverEvent.remove("value");
        if (valueTag != null) {
            CompoundTag tag = ComponentUtil.deserializeShowItem(valueTag, this.inputSerializerVersion());
            CompoundTag contentsTag = new CompoundTag();
            contentsTag.put("type", (Tag)tag.getStringTag("type"));
            contentsTag.put("id", (Tag)tag.getStringTag("id"));
            contentsTag.put("name", this.outputSerializerVersion().toTag(this.outputSerializerVersion().toComponent(tag.getString("name"))));
            hoverEvent.put("contents", (Tag)contentsTag);
        }
    }

    protected @Nullable SerializerVersion inputSerializerVersion() {
        return null;
    }

    protected void convertLegacyItemContents(CompoundTag hoverEvent) {
        if (this.inputSerializerVersion() == null) {
            return;
        }
        Tag valueTag = hoverEvent.remove("value");
        if (valueTag != null) {
            CompoundTag tag = ComponentUtil.deserializeShowItem(valueTag, this.inputSerializerVersion());
            CompoundTag contentsTag = new CompoundTag();
            contentsTag.put("id", (Tag)tag.getStringTag("id"));
            contentsTag.put("count", (Tag)tag.getIntTag("count"));
            if (tag.get("tag") instanceof CompoundTag) {
                contentsTag.putString("tag", this.outputSerializerVersion().toSNBT((Tag)tag.getCompoundTag("tag")));
            }
            hoverEvent.put("contents", (Tag)contentsTag);
        }
    }

    public void registerLegacyOpenWindow(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            wrapper.passthrough(Types.STRING);
            this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
        });
    }

    protected @Nullable SerializerVersion outputSerializerVersion() {
        return this.inputSerializerVersion();
    }
}

