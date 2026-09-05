/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.rewriter.ComponentRewriter
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonParser
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.libs.gson.JsonSyntaxException
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$1
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter.text;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.rewriter.ComponentRewriter;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonParser;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.gson.JsonSyntaxException;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.TagUtil;
import java.util.BitSet;
import java.util.Collection;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class ComponentRewriterBase<C extends ClientboundPacketType>
implements ComponentRewriter {
    protected final Protocol<C, ?, ?, ?> protocol;
    protected final ReadType type;

    protected ComponentRewriterBase(Protocol<C, ?, ?, ?> protocol, ReadType type) {
        this.protocol = protocol;
        this.type = type;
    }

    public void passthroughAndProcess(PacketWrapper wrapper) {
        switch (1.$SwitchMap$com$viaversion$viaversion$rewriter$text$ComponentRewriterBase$ReadType[this.type.ordinal()]) {
            case 1: {
                this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
                break;
            }
            case 2: {
                this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            }
        }
    }

    protected void handleWrittenBookContents(UserConnection connection, CompoundTag tag) {
        CompoundTag book = TagUtil.getNamespacedCompoundTag(tag, "written_book_content");
        if (book == null) {
            return;
        }
        ListTag pagesTag = book.getListTag("pages", CompoundTag.class);
        if (pagesTag == null) {
            return;
        }
        for (CompoundTag compoundTag : pagesTag) {
            this.handleNestedComponent(connection, compoundTag.get("raw"));
            this.handleNestedComponent(connection, compoundTag.get("filtered"));
        }
    }

    private boolean removeDataComponent(CompoundTag tag, String key) {
        return TagUtil.removeNamespaced(tag, key) || tag.remove("!" + Key.namespaced(key)) != null || tag.remove("!" + Key.stripMinecraftNamespace(key)) != null;
    }

    public void registerDisguisedChat(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            this.passthroughAndProcess(wrapper);
            wrapper.passthrough((Type)ChatType.TYPE);
            this.passthroughAndProcess(wrapper);
            this.passthroughAndProcessOptional(wrapper);
        });
    }

    protected void handleContainerContents(UserConnection connection, CompoundTag tag) {
        ListTag<CompoundTag> container = TagUtil.getNamespacedCompoundTagList(tag, "container");
        if (container == null) {
            return;
        }
        for (CompoundTag entryTag : container) {
            this.handleShowItem(connection, entryTag.getCompoundTag("item"));
        }
    }

    public void registerSetObjective(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                this.passthroughAndProcess(wrapper);
            }
        });
    }

    protected void removeDataComponents(CompoundTag tag, Collection<StructuredDataKey<?>> keys) {
        for (StructuredDataKey<?> key : keys) {
            this.removeDataComponent(tag, key.identifier());
        }
    }

    protected void removeDataComponents(CompoundTag tag, String ... keys) {
        for (String key : keys) {
            this.removeDataComponent(tag, key);
        }
    }

    protected void removeDataComponents(CompoundTag tag, StructuredDataKey<?> ... keys) {
        for (StructuredDataKey<?> key : keys) {
            this.removeDataComponent(tag, key.identifier());
        }
    }

    protected void handleAttributeModifiers(CompoundTag tag) {
        FullMappings mappings = this.protocol.getMappingData().getAttributeMappings();
        if (Mappings.isFullIdentity((Mappings)mappings)) {
            return;
        }
        ListTag<CompoundTag> attributeModifiers = TagUtil.getNamespacedCompoundTagList(tag, "attribute_modifiers");
        if (attributeModifiers == null) {
            return;
        }
        attributeModifiers.getValue().removeIf(attributeTag -> {
            StringTag typeTag = attributeTag.getStringTag("type");
            if (typeTag == null) {
                return false;
            }
            String mappedId = mappings.mappedIdentifier(typeTag.getValue());
            if (mappedId != null) {
                typeTag.setValue(mappedId);
                return false;
            }
            return true;
        });
    }

    protected void handleItemArrayContents(UserConnection connection, CompoundTag tag, String key) {
        ListTag<CompoundTag> container = TagUtil.getNamespacedCompoundTagList(tag, key);
        if (container == null) {
            return;
        }
        for (CompoundTag itemTag : container) {
            this.handleShowItem(connection, itemTag);
        }
    }

    protected abstract void handleNestedComponent(UserConnection var1, @Nullable Tag var2);

    public void registerComponentPacket(C packetType) {
        this.protocol.registerClientbound(packetType, this::passthroughAndProcess);
    }

    public void registerLoginDisconnect() {
        this.protocol.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_DISCONNECT, wrapper -> this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT)));
    }

    public void registerSetScore1_20_3(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.passthroughAndProcessOptional(wrapper);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                int numberFormatType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (numberFormatType == 1) {
                    this.passthroughAndProcess(wrapper);
                } else if (numberFormatType == 2) {
                    this.passthroughAndProcess(wrapper);
                }
            }
        });
    }

    public void registerSetPlayerTeam1_13(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                this.passthroughAndProcess(wrapper);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.VAR_INT);
                this.passthroughAndProcess(wrapper);
                this.passthroughAndProcess(wrapper);
            }
        });
    }

    public void registerOpenScreen1_14(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
        });
    }

    public void registerPlayerCombatKill1_20(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.passthroughAndProcess(wrapper);
        });
    }

    public void registerSetPlayerTeam1_21_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                this.passthroughAndProcess(wrapper);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.passthrough((Type)Types.VAR_INT);
                this.passthroughAndProcess(wrapper);
                this.passthroughAndProcess(wrapper);
            }
        });
    }

    public void passthroughAndProcessOptional(PacketWrapper wrapper) {
        switch (1.$SwitchMap$com$viaversion$viaversion$rewriter$text$ComponentRewriterBase$ReadType[this.type.ordinal()]) {
            case 1: {
                this.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.OPTIONAL_COMPONENT));
                break;
            }
            case 2: {
                this.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
            }
        }
    }

    public void registerPlayerInfoUpdate1_21_4(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            BitSet actions = (BitSet)wrapper.passthrough((Type)Types.PROFILE_ACTIONS_ENUM1_21_4);
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
                if (actions.get(6)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (!actions.get(7)) continue;
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
    }

    public void processText(UserConnection connection, JsonElement element) {
        if (element == null || element.isJsonNull()) {
            return;
        }
        if (element.isJsonArray()) {
            this.processJsonArray(connection, element.getAsJsonArray());
        } else if (element.isJsonObject()) {
            this.processJsonObject(connection, element.getAsJsonObject());
        }
    }

    public JsonElement processText(UserConnection connection, String value) {
        try {
            JsonElement root = JsonParser.parseString((String)value);
            this.processText(connection, root);
            return root;
        }
        catch (JsonSyntaxException e) {
            if (Via.getManager().isDebug()) {
                this.protocol.getLogger().severe("Error when trying to parse json: " + value);
                throw e;
            }
            return new JsonPrimitive(value);
        }
    }

    protected void processJsonObject(UserConnection connection, JsonObject object) {
        JsonElement hoverEvent;
        JsonElement extra;
        JsonElement translate = object.get("translate");
        if (translate != null && translate.isJsonPrimitive()) {
            this.handleTranslate(object, translate.getAsString());
            JsonElement with = object.get("with");
            if (with != null && with.isJsonArray()) {
                this.processJsonArray(connection, with.getAsJsonArray());
            }
        }
        if ((extra = object.get("extra")) != null && extra.isJsonArray()) {
            this.processJsonArray(connection, extra.getAsJsonArray());
        }
        if ((hoverEvent = object.get(this.hoverEventKey())) != null && hoverEvent.isJsonObject()) {
            this.handleHoverEvent(connection, hoverEvent.getAsJsonObject());
        }
    }

    protected abstract void handleHoverEvent(UserConnection var1, JsonObject var2);

    protected abstract void handleHoverEvent(UserConnection var1, CompoundTag var2);

    private void processListTag(UserConnection connection, ListTag<?> tag) {
        for (Tag entry : tag) {
            this.processTag(connection, entry);
        }
    }

    protected void handleTranslate(JsonObject object, String translate) {
    }

    protected void handleTranslate(UserConnection connection, CompoundTag parentTag, StringTag translateTag) {
    }

    public final void handleShowItem(UserConnection connection, CompoundTag itemTag) {
        this.handleShowItem(connection, itemTag, itemTag.getCompoundTag("components"));
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, @Nullable CompoundTag componentsTag) {
        StringTag idTag = itemTag.getStringTag("id");
        String mappedId = this.protocol.getMappingData().getFullItemMappings().mappedIdentifier(idTag.getValue());
        if (mappedId != null) {
            idTag.setValue(mappedId);
        }
        if (componentsTag == null) {
            return;
        }
        this.handleNestedComponent(connection, TagUtil.getNamespacedTag(componentsTag, "item_name"));
        this.handleNestedComponent(connection, TagUtil.getNamespacedTag(componentsTag, "custom_name"));
        this.handleLore(connection, componentsTag);
        this.handleWrittenBookContents(connection, componentsTag);
        this.handleAttributeModifiers(componentsTag);
        this.handleContainerContents(connection, componentsTag);
        this.handleItemArrayContents(connection, componentsTag, "bundle_contents");
        this.handleItemArrayContents(connection, componentsTag, "charged_projectiles");
        CompoundTag useRemainder = TagUtil.getNamespacedCompoundTag(componentsTag, "use_remainder");
        if (useRemainder != null) {
            this.handleShowItem(connection, useRemainder);
        }
        this.removeDataComponents(componentsTag, "lock", "debug_stick_state");
    }

    public void registerBossEvent(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(Types.UUID);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 0 || action == 3) {
                this.passthroughAndProcess(wrapper);
            }
        });
    }

    protected void processCompoundTag(UserConnection connection, CompoundTag tag) {
        CompoundTag hoverEvent;
        ListTag extra;
        StringTag translate = tag.getStringTag("translate");
        if (translate != null) {
            this.handleTranslate(connection, tag, translate);
            ListTag with = tag.getListTag("with");
            if (with != null) {
                this.processListTag(connection, with);
            }
        }
        if ((extra = tag.getListTag("extra")) != null) {
            this.processListTag(connection, extra);
        }
        if ((hoverEvent = tag.getCompoundTag(this.hoverEventKey())) != null) {
            this.handleHoverEvent(connection, hoverEvent);
        }
    }

    public void registerTabList(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            this.passthroughAndProcess(wrapper);
            this.passthroughAndProcess(wrapper);
        });
    }

    protected void processJsonArray(UserConnection connection, JsonArray array) {
        for (JsonElement jsonElement : array) {
            this.processText(connection, jsonElement);
        }
    }

    protected abstract String hoverEventKey();

    public void processTag(UserConnection connection, @Nullable Tag tag) {
        if (tag == null) {
            return;
        }
        if (tag instanceof ListTag) {
            this.processListTag(connection, (ListTag)tag);
        } else if (tag instanceof CompoundTag) {
            this.processCompoundTag(connection, (CompoundTag)tag);
        }
    }

    protected void handleLore(UserConnection connection, CompoundTag tag) {
        ListTag<? extends Tag> loreTag = TagUtil.getNamespacedTagList(tag, "lore");
        if (loreTag == null) {
            return;
        }
        for (Tag lore : loreTag) {
            this.handleNestedComponent(connection, lore);
        }
    }

    public static enum ReadType {
        JSON,
        NBT;

    }
}

