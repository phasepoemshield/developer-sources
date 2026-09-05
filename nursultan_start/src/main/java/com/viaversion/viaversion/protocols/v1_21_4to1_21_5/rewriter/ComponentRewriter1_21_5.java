/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.util.ItemUtil
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.StringUtil
 *  com.viaversion.viaversion.util.TagUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.util.ItemUtil;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import com.viaversion.viaversion.util.TagUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class ComponentRewriter1_21_5
extends JsonNBTComponentRewriter<ClientboundPacket1_21_2> {
    public ComponentRewriter1_21_5(Protocol1_21_4To1_21_5 protocol1_21_4To1_21_5) {
        super((Protocol)protocol1_21_4To1_21_5, ComponentRewriterBase.ReadType.NBT);
    }

    protected void handleWrittenBookContents(UserConnection userConnection, CompoundTag compoundTag) {
        CompoundTag compoundTag2 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag, (String)"written_book_content");
        if (compoundTag2 == null) {
            return;
        }
        ListTag listTag = compoundTag2.getListTag("pages", CompoundTag.class);
        if (listTag == null) {
            return;
        }
        for (CompoundTag compoundTag3 : listTag) {
            String string = compoundTag3.getString("raw");
            compoundTag3.put("raw", this.uglyJsonToTag(userConnection, string));
            String string2 = compoundTag3.getString("filtered");
            if (string2 == null) continue;
            compoundTag3.put("filtered", this.uglyJsonToTag(userConnection, string2));
        }
    }

    protected void handleHoverEvent(UserConnection userConnection, CompoundTag compoundTag) {
        String string = compoundTag.getString("action");
        if (string == null) {
            return;
        }
        switch (string) {
            case "show_text": {
                this.updateShowTextHover(userConnection, compoundTag);
                break;
            }
            case "show_entity": {
                this.updateShowEntityHover(userConnection, compoundTag);
                break;
            }
            case "show_item": {
                this.updateShowItemHover(userConnection, compoundTag);
            }
        }
    }

    protected void handleShowItem(UserConnection userConnection, CompoundTag compoundTag, @Nullable CompoundTag compoundTag2) {
        CompoundTag compoundTag3;
        CompoundTag compoundTag4;
        super.handleShowItem(userConnection, compoundTag, compoundTag2);
        if (compoundTag2 == null) {
            return;
        }
        CompoundTag compoundTag5 = new CompoundTag();
        String string = "hide_tooltip";
        CompoundTag compoundTag6 = compoundTag2;
        boolean bl = this.wrapOperation$dlf000$viafabricplus$storeBackupTag(compoundTag6, string, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[com.viaversion.nbt.tag.CompoundTag, java.lang.String]");
            return TagUtil.removeNamespaced((CompoundTag)((CompoundTag)objectArray[0]), (String)((String)objectArray[1]));
        });
        ListTag listTag = new ListTag(StringTag.class);
        compoundTag6 = compoundTag2;
        string = "hide_additional_tooltip";
        if (this.wrapOperation$dlf000$viafabricplus$storeBackupTag(compoundTag6, string, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[com.viaversion.nbt.tag.CompoundTag, java.lang.String]");
            return TagUtil.removeNamespaced((CompoundTag)((CompoundTag)objectArray[0]), (String)((String)objectArray[1]));
        })) {
            compoundTag4 = BlockItemPacketRewriter1_21_5.HIDE_ADDITIONAL_KEYS.iterator();
            while (compoundTag4.hasNext()) {
                compoundTag3 = compoundTag4.next();
                listTag.add((Tag)new StringTag(compoundTag3.identifier()));
            }
        }
        this.updateHiddenComponents(compoundTag2, "unbreakable", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "can_place_on", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "can_break", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "dyed_color", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "attribute_modifiers", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "trim", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "enchantments", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "stored_enchantments", (ListTag<StringTag>)listTag);
        this.updateHiddenComponents(compoundTag2, "jukebox_playable", (ListTag<StringTag>)listTag);
        if (bl || !listTag.isEmpty()) {
            compoundTag5.putBoolean("hide_tooltip", bl);
            compoundTag5.put("hidden_components", (Tag)listTag);
            compoundTag2.put("tooltip_display", (Tag)compoundTag5);
        }
        if ((compoundTag4 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag2, (String)"attribute_modifiers")) != null) {
            this.removeDataComponents(compoundTag2, new String[]{"attribute_modifiers"});
            compoundTag2.put("attribute_modifiers", compoundTag4.get("modifiers"));
        }
        if ((compoundTag3 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag2, (String)"dyed_color")) != null) {
            this.removeDataComponents(compoundTag2, new String[]{"dyed_color"});
            compoundTag2.put("dyed_color", compoundTag3.get("rgb"));
        }
        this.handleAdventureModePredicate(compoundTag2, "can_break");
        this.handleAdventureModePredicate(compoundTag2, "can_place_on");
        this.handleEnchantments(compoundTag2, "enchantments");
        this.handleEnchantments(compoundTag2, "stored_enchantments");
        this.updateUglyJson(compoundTag2, userConnection);
        this.removeDataComponents(compoundTag2, new StructuredDataKey[]{StructuredDataKey.INSTRUMENT1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21});
    }

    protected void processCompoundTag(UserConnection userConnection, CompoundTag compoundTag) {
        CompoundTag compoundTag2;
        super.processCompoundTag(userConnection, compoundTag);
        Tag tag = compoundTag.remove("hoverEvent");
        if (tag instanceof CompoundTag) {
            compoundTag2 = (CompoundTag)tag;
            compoundTag.put("hover_event", (Tag)compoundTag2);
        }
        if ((tag = compoundTag.remove("clickEvent")) instanceof CompoundTag) {
            compoundTag2 = (CompoundTag)tag;
            try {
                this.updateClickEvent(compoundTag2);
            }
            catch (IllegalArgumentException | URISyntaxException exception) {
                return;
            }
            compoundTag.put("click_event", (Tag)compoundTag2);
        }
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_21_4;
    }

    private boolean wrapOperation$dlf000$viafabricplus$storeBackupTag(CompoundTag compoundTag, String string, Operation operation) {
        if (string.equals("hide_additional_tooltip")) {
            CompoundTag compoundTag2 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag, (String)"custom_data");
            if (compoundTag2 == null) {
                compoundTag2 = new CompoundTag();
                compoundTag.put("custom_data", (Tag)compoundTag2);
            }
            CompoundTag compoundTag3 = new CompoundTag();
            compoundTag3.putBoolean("hide_additional_tooltip", true);
            compoundTag2.put(ItemUtil.vvNbtName(Protocol1_21_4To1_21_5.class, (String)"backup"), (Tag)compoundTag3);
        }
        return (Boolean)operation.call(new Object[]{compoundTag, string});
    }

    private void handleAdventureModePredicate(CompoundTag compoundTag, String string) {
        CompoundTag compoundTag2 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag, (String)string);
        if (compoundTag2 == null) {
            return;
        }
        ListTag listTag = compoundTag2.getListTag("predicates", CompoundTag.class);
        this.removeDataComponents(compoundTag, new String[]{string});
        compoundTag.put(string, (Tag)listTag);
    }

    private void updateUglyJson(CompoundTag compoundTag, UserConnection userConnection) {
        this.updateUglyJson(compoundTag, "item_name", userConnection);
        this.updateUglyJson(compoundTag, "custom_name", userConnection);
        String string = TagUtil.getNamespacedTagKey((CompoundTag)compoundTag, (String)"lore");
        ListTag listTag = compoundTag.getListTag(string, StringTag.class);
        if (listTag != null) {
            compoundTag.put(string, this.updateComponentList(userConnection, (ListTag<StringTag>)listTag, false));
        }
    }

    private void updateUglyJson(CompoundTag compoundTag, String string, UserConnection userConnection) {
        String string2 = TagUtil.getNamespacedTagKey((CompoundTag)compoundTag, (String)string);
        String string3 = compoundTag.getString(string2);
        if (string3 == null) {
            return;
        }
        compoundTag.put(string2, this.uglyJsonToTag(userConnection, string3));
    }

    private void updateClickEvent(CompoundTag compoundTag) throws URISyntaxException {
        String string = compoundTag.getString("action");
        if (string == null) {
            return;
        }
        if (string.equals("open_url")) {
            StringTag stringTag = compoundTag.getStringTag("value");
            URI uRI = new URI(stringTag.getValue());
            if (!"https".equalsIgnoreCase(uRI.getScheme()) && !"http".equalsIgnoreCase(uRI.getScheme())) {
                throw new IllegalArgumentException("Invalid URL");
            }
            compoundTag.put("url", (Tag)stringTag);
        } else if (string.equals("change_page")) {
            int n = Integer.parseInt(compoundTag.getString("value"));
            if (n < 1) {
                throw new IllegalArgumentException("Invalid page number");
            }
            compoundTag.putInt("page", n);
        } else if (string.equals("run_command") || string.equals("suggest_command")) {
            String string2 = compoundTag.getString("value");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < string2.length(); ++i) {
                char c = string2.charAt(i);
                if (c != '\u00a7' && c >= ' ' && c != '\u007f') {
                    stringBuilder.append(c);
                    continue;
                }
                if (!string.equals("suggest_command") || c != '\n') continue;
                stringBuilder.append(c);
            }
            compoundTag.putString("command", stringBuilder.toString());
        }
    }

    private void handleEnchantments(CompoundTag compoundTag, String string) {
        Tag tag;
        CompoundTag compoundTag2 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag, (String)string);
        if (compoundTag2 != null && (tag = compoundTag2.remove("levels")) instanceof CompoundTag) {
            CompoundTag compoundTag3 = (CompoundTag)tag;
            compoundTag2.putAll(compoundTag3);
        }
    }

    public Tag uglyJsonToTag(UserConnection userConnection, String string) {
        try {
            return this.uglyJsonToTagUncaught(userConnection, string);
        }
        catch (Exception exception) {
            if (Via.getConfig().logTextComponentConversionErrors()) {
                Via.getPlatform().getLogger().log(Level.SEVERE, "Error converting json text component: " + StringUtil.forLogging((String)string), exception);
            }
            return new StringTag("<error>");
        }
    }

    private void updateShowTextHover(UserConnection userConnection, CompoundTag compoundTag) {
        Tag tag = compoundTag.get("value");
        if (tag != null) {
            this.processTag(userConnection, tag);
            return;
        }
        Tag tag2 = compoundTag.remove("contents");
        this.processTag(userConnection, tag2);
        compoundTag.put("value", tag2);
    }

    private void updateShowEntityHover(UserConnection userConnection, CompoundTag compoundTag) {
        StringTag stringTag;
        Tag tag;
        this.convertLegacyEntityContents(compoundTag);
        Tag tag2 = compoundTag.remove("contents");
        if (!(tag2 instanceof CompoundTag)) {
            return;
        }
        CompoundTag compoundTag2 = (CompoundTag)tag2;
        tag2 = compoundTag2.get("name");
        if (tag2 != null) {
            this.processTag(userConnection, tag2);
            compoundTag.put("name", tag2);
        }
        if ((tag = compoundTag2.get("id")) != null) {
            compoundTag.put("uuid", tag);
        }
        if ((stringTag = compoundTag2.getStringTag("type")) != null) {
            stringTag.setValue(this.protocol.getEntityRewriter().mappedEntityIdentifier(stringTag.getValue()));
            compoundTag.put("id", (Tag)stringTag);
        }
    }

    public ListTag<CompoundTag> updateComponentList(UserConnection userConnection, ListTag<StringTag> listTag, boolean bl) {
        ListTag listTag2 = new ListTag(CompoundTag.class);
        for (StringTag stringTag : listTag) {
            Tag tag;
            try {
                tag = bl ? this.uglyJsonToTagUncaught(userConnection, stringTag.getValue()) : this.uglyJsonToTag(userConnection, stringTag.getValue());
            }
            catch (Exception exception) {
                continue;
            }
            CompoundTag compoundTag = new CompoundTag();
            compoundTag.putString("text", "");
            compoundTag.put("extra", (Tag)new ListTag(List.of(tag)));
            listTag2.add((Tag)compoundTag);
        }
        return listTag2;
    }

    private void updateHiddenComponents(CompoundTag compoundTag, String string, ListTag<StringTag> listTag) {
        CompoundTag compoundTag2 = TagUtil.getNamespacedCompoundTag((CompoundTag)compoundTag, (String)string);
        if (compoundTag2 == null) {
            return;
        }
        boolean bl = compoundTag2.getBoolean("show_in_tooltip", true);
        if (!bl) {
            listTag.add((Tag)new StringTag(string));
        }
        compoundTag2.remove("show_in_tooltip");
    }

    private void updateShowItemHover(UserConnection userConnection, CompoundTag compoundTag) {
        this.convertLegacyItemContents(compoundTag);
        Tag tag = compoundTag.remove("contents");
        if (tag instanceof CompoundTag) {
            Tag tag2;
            CompoundTag compoundTag2 = (CompoundTag)tag;
            Tag tag3 = compoundTag2.get("count");
            if (tag3 != null) {
                compoundTag.put("count", tag3);
            }
            if ((tag2 = compoundTag2.get("id")) != null) {
                compoundTag.put("id", tag2);
            }
            CompoundTag compoundTag3 = compoundTag2.getCompoundTag("components");
            this.handleShowItem(userConnection, compoundTag2, compoundTag3);
            if (compoundTag3 != null) {
                compoundTag.put("components", (Tag)compoundTag3);
            }
        } else if (tag instanceof StringTag) {
            StringTag stringTag = (StringTag)tag;
            compoundTag.put("id", (Tag)stringTag);
        }
    }

    public Tag uglyJsonToTagUncaught(UserConnection userConnection, String string) {
        Tag tag = SerializerVersion.V1_21_4.toTag(SerializerVersion.V1_21_4.toComponent(string));
        this.processTag(userConnection, tag);
        return tag;
    }
}

