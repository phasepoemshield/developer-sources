/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.TagUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.TagUtil;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class ComponentRewriter1_21_5
extends NBTComponentRewriter<ClientboundPacket1_21_5> {
    public ComponentRewriter1_21_5(BackwardsProtocol<ClientboundPacket1_21_5, ?, ?, ?> protocol) {
        super(protocol);
    }

    protected void handleWrittenBookContents(UserConnection connection, CompoundTag tag) {
        CompoundTag book = TagUtil.getNamespacedCompoundTag((CompoundTag)tag, (String)"written_book_content");
        if (book == null) {
            return;
        }
        ListTag pagesTag = book.getListTag("pages", CompoundTag.class);
        if (pagesTag == null) {
            return;
        }
        for (CompoundTag compoundTag : pagesTag) {
            Tag raw = compoundTag.get("raw");
            compoundTag.putString("raw", this.toUglyJson(connection, raw));
            Tag filtered = compoundTag.get("filtered");
            if (filtered == null) continue;
            compoundTag.putString("filtered", this.toUglyJson(connection, raw));
        }
    }

    protected void handleHoverEvent(UserConnection connection, CompoundTag hoverEventTag) {
        String action = hoverEventTag.getString("action");
        if (action == null) {
            return;
        }
        switch (action) {
            case "show_text": {
                this.updateShowTextHover(hoverEventTag);
                break;
            }
            case "show_entity": {
                this.updateShowEntityHover(hoverEventTag);
                break;
            }
            case "show_item": {
                this.updateShowItemHover(connection, hoverEventTag);
            }
        }
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, @Nullable CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        this.insertUglyJson(componentsTag, connection);
        this.updateDataComponents(componentsTag);
        this.removeDataComponents(componentsTag, BlockItemPacketRewriter1_21_5.NEW_DATA_TO_REMOVE);
    }

    protected void processCompoundTag(UserConnection connection, CompoundTag tag) {
        super.processCompoundTag(connection, tag);
        Tag tag2 = tag.remove("hover_event");
        if (tag2 instanceof CompoundTag) {
            CompoundTag hoverEvent = (CompoundTag)tag2;
            tag.put("hoverEvent", (Tag)hoverEvent);
        }
        if ((tag2 = tag.remove("click_event")) instanceof CompoundTag) {
            CompoundTag clickEvent = (CompoundTag)tag2;
            tag.put("clickEvent", (Tag)clickEvent);
            this.updateClickEvent(clickEvent);
        }
    }

    private void handleAdventureModePredicate(CompoundTag componentsTag, String key, Set<String> hiddenComponents) {
        ListTag blockPredicates = TagUtil.getNamespacedCompoundTagList((CompoundTag)componentsTag, (String)key);
        if (blockPredicates == null) {
            return;
        }
        this.removeDataComponents(componentsTag, new String[]{key});
        CompoundTag predicate = new CompoundTag();
        predicate.put("predicates", (Tag)blockPredicates);
        predicate.putBoolean("show_in_tooltip", !hiddenComponents.contains(key));
        componentsTag.put(key, (Tag)predicate);
    }

    private void updateClickEvent(CompoundTag clickEventTag) {
        String action = clickEventTag.getString("action");
        if (action == null) {
            return;
        }
        switch (action) {
            case "open_url": {
                clickEventTag.put("value", (Tag)clickEventTag.getStringTag("url"));
                break;
            }
            case "change_page": {
                clickEventTag.putString("value", Integer.toString(clickEventTag.getInt("page")));
                break;
            }
            case "run_command": {
                StringTag command = clickEventTag.getStringTag("command");
                if (command != null && !command.getValue().startsWith("/")) {
                    command.setValue("/" + command.getValue());
                }
                clickEventTag.put("value", (Tag)command);
                break;
            }
            case "suggest_command": {
                clickEventTag.put("value", (Tag)clickEventTag.getStringTag("command"));
            }
        }
    }

    private void handleEnchantments(CompoundTag componentsTag, String key, Set<String> hiddenComponents) {
        CompoundTag levels = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)key);
        if (levels != null) {
            TagUtil.removeNamespaced((CompoundTag)componentsTag, (String)key);
            CompoundTag enchantments = new CompoundTag();
            enchantments.put("levels", (Tag)levels);
            enchantments.putBoolean("show_in_tooltip", !hiddenComponents.contains(key));
            componentsTag.put(key, (Tag)enchantments);
        }
    }

    private void insertUglyJson(CompoundTag componentsTag, String key, UserConnection connection) {
        String actualKey = TagUtil.getNamespacedTagKey((CompoundTag)componentsTag, (String)key);
        Tag tag = componentsTag.get(actualKey);
        if (tag == null) {
            return;
        }
        componentsTag.putString(actualKey, this.toUglyJson(connection, tag));
    }

    private void insertUglyJson(CompoundTag componentsTag, UserConnection connection) {
        this.insertUglyJson(componentsTag, "item_name", connection);
        this.insertUglyJson(componentsTag, "custom_name", connection);
        String loreKey = TagUtil.getNamespacedTagKey((CompoundTag)componentsTag, (String)"lore");
        ListTag lore = componentsTag.getListTag(loreKey);
        if (lore != null) {
            componentsTag.put(loreKey, this.updateComponentList(connection, lore));
        }
    }

    private void updateDataComponents(CompoundTag componentsTag) {
        NumberTag dyedColor;
        ListTag attributeModifiers;
        ListTag hiddenComponentsTag;
        CompoundTag tooltipDisplay = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"tooltip_display");
        Set<String> hiddenComponents = Set.of();
        if (tooltipDisplay != null && (hiddenComponentsTag = tooltipDisplay.getListTag("hidden_components", StringTag.class)) != null) {
            hiddenComponents = new HashSet(hiddenComponentsTag.size());
            for (StringTag stringTag : hiddenComponentsTag) {
                hiddenComponents.add(Key.stripMinecraftNamespace((String)stringTag.getValue()));
            }
        }
        if (hiddenComponents.containsAll(BlockItemPacketRewriter1_21_5.HIDE_ADDITIONAL_KEYS.stream().map(StructuredDataKey::identifier).toList())) {
            componentsTag.put("hide_additional_tooltip", (Tag)new CompoundTag());
        }
        if ((attributeModifiers = TagUtil.getNamespacedCompoundTagList((CompoundTag)componentsTag, (String)"attribute_modifiers")) != null) {
            TagUtil.removeNamespaced((CompoundTag)componentsTag, (String)"attribute_modifiers");
            CompoundTag attributesParent = new CompoundTag();
            attributesParent.put("modifiers", (Tag)attributeModifiers);
            attributesParent.putBoolean("show_in_tooltip", hiddenComponents.contains("attribute_modifiers"));
            componentsTag.put("attribute_modifiers", (Tag)attributesParent);
        }
        if ((dyedColor = TagUtil.getNamespacedNumberTag((CompoundTag)componentsTag, (String)"dyed_color")) != null) {
            TagUtil.removeNamespaced((CompoundTag)componentsTag, (String)"dyed_color");
            CompoundTag dyedColorParent = new CompoundTag();
            dyedColorParent.put("rgb", (Tag)dyedColor);
            dyedColorParent.putBoolean("show_in_tooltip", hiddenComponents.contains("dyed_color"));
            componentsTag.put("dyed_color", (Tag)dyedColorParent);
        }
        this.updateShowInTooltip(componentsTag, "unbreakable", hiddenComponents);
        this.updateShowInTooltip(componentsTag, "dyed_color", hiddenComponents);
        this.updateShowInTooltip(componentsTag, "trim", hiddenComponents);
        this.updateShowInTooltip(componentsTag, "jukebox_playable", hiddenComponents);
        this.handleAdventureModePredicate(componentsTag, "can_place_on", hiddenComponents);
        this.handleAdventureModePredicate(componentsTag, "can_break", hiddenComponents);
        this.handleEnchantments(componentsTag, "enchantments", hiddenComponents);
        this.handleEnchantments(componentsTag, "stored_enchantments", hiddenComponents);
        this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5});
    }

    String toUglyJson(UserConnection connection, Tag value) {
        this.processTag(connection, value);
        return SerializerVersion.V1_21_4.toString(SerializerVersion.V1_21_4.toComponent(value));
    }

    private void updateShowTextHover(CompoundTag hoverEventTag) {
        Tag text = hoverEventTag.remove("value");
        hoverEventTag.put("contents", text);
    }

    private void updateShowEntityHover(CompoundTag hoverEventTag) {
        Tag uuidTag;
        Tag tag;
        CompoundTag contents = new CompoundTag();
        hoverEventTag.put("contents", (Tag)contents);
        Tag nameTag = hoverEventTag.remove("name");
        if (nameTag != null) {
            contents.put("name", nameTag);
        }
        if ((tag = hoverEventTag.remove("id")) instanceof StringTag) {
            StringTag idTag = (StringTag)tag;
            idTag.setValue(this.protocol.getEntityRewriter().mappedEntityIdentifier(idTag.getValue()));
            contents.put("type", (Tag)idTag);
        }
        if ((uuidTag = hoverEventTag.remove("uuid")) != null) {
            contents.put("id", uuidTag);
        }
    }

    private void updateShowInTooltip(CompoundTag tag, String key, Set<String> hiddenComponents) {
        CompoundTag data = TagUtil.getNamespacedCompoundTag((CompoundTag)tag, (String)key);
        if (data != null) {
            data.putBoolean("show_in_tooltip", !hiddenComponents.contains(key));
        }
    }

    public ListTag<StringTag> updateComponentList(UserConnection connection, ListTag<?> messages) {
        ListTag updatedMessages = new ListTag(StringTag.class);
        for (Tag message : messages) {
            updatedMessages.add((Tag)new StringTag(this.toUglyJson(connection, message)));
        }
        return updatedMessages;
    }

    private void updateShowItemHover(UserConnection connection, CompoundTag hoverEventTag) {
        CompoundTag contents = new CompoundTag();
        hoverEventTag.put("contents", (Tag)contents);
        Tag tag = hoverEventTag.get("count");
        if (tag instanceof NumberTag) {
            NumberTag countTag = (NumberTag)tag;
            contents.put("count", (Tag)countTag);
        }
        if ((tag = hoverEventTag.get("id")) instanceof StringTag) {
            StringTag idTag = (StringTag)tag;
            contents.put("id", (Tag)idTag);
        }
        CompoundTag componentsTag = hoverEventTag.getCompoundTag("components");
        this.handleShowItem(connection, contents, componentsTag);
        if (componentsTag != null) {
            hoverEventTag.remove("components");
            contents.put("components", (Tag)componentsTag);
        }
    }
}

