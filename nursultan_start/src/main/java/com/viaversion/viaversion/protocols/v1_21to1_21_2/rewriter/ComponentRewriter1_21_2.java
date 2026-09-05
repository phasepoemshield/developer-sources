/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.TagUtil;
import java.util.Collections;
import java.util.Iterator;

public final class ComponentRewriter1_21_2
extends JsonNBTComponentRewriter<ClientboundPacket1_21> {
    public ComponentRewriter1_21_2(Protocol1_21To1_21_2 protocol) {
        super((Protocol)protocol, ComponentRewriterBase.ReadType.NBT);
    }

    protected void handleTranslate(UserConnection connection, CompoundTag parentTag, StringTag translateTag) {
        switch (translateTag.getValue()) {
            case "commands.drop.no_loot_table": {
                translateTag.setValue("Entity %s has no loot table");
                break;
            }
            case "commands.advancement.advancementNotFound": {
                translateTag.setValue("No advancement was found by the name '%1$s'");
                break;
            }
            case "commands.function.success.single": {
                translateTag.setValue("Test Executed %s command(s) from function '%s'");
                break;
            }
            case "commands.function.success.single.result": {
                translateTag.setValue("Function '%2$s' returned %1$s");
                break;
            }
            case "commands.function.success.multiple": {
                translateTag.setValue("Test Executed %s command(s) from %s functions");
                break;
            }
            case "commands.function.success.multiple.result": {
                translateTag.setValue("Executed %s functions");
                break;
            }
            case "commands.fillbiome.success": {
                translateTag.setValue("%s biome entry/entries set between %s, %s, %s and %s, %s, %s");
                break;
            }
            case "commands.publish.success": {
                translateTag.setValue("Multiplayer game is now hosted on port %s");
            }
        }
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        CompoundTag enchantments;
        CompoundTag food;
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        ComponentRewriter1_21_2.convertAttributes(componentsTag, this.protocol.getMappingData().getAttributeMappings());
        CompoundTag instrument = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"instrument");
        if (instrument != null) {
            instrument.putString("description", "");
        }
        if ((food = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"food")) != null) {
            CompoundTag convertsTo = food.getCompoundTag("using_converts_to");
            if (convertsTo != null) {
                food.remove("using_converts_to");
                componentsTag.put("minecraft:use_remainder", (Tag)convertsTo);
            }
            food.remove("eat_seconds");
            food.remove("effects");
        }
        if ((enchantments = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"enchantments")) != null) {
            CompoundTag levels = enchantments.getCompoundTag("levels");
            levels.entrySet().removeIf(entry -> ((NumberTag)entry.getValue()).asInt() == 0);
        }
        this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.FIRE_RESISTANT, StructuredDataKey.LOCK1_20_5});
        StringTag customName = TagUtil.getNamespacedStringTag((CompoundTag)componentsTag, (String)"custom_name");
        StringTag itemName = TagUtil.getNamespacedStringTag((CompoundTag)componentsTag, (String)"item_name");
        if (customName != null || itemName == null) {
            return;
        }
        int identifier = this.protocol.getMappingData().getFullItemMappings().mappedId(itemTag.getString("id"));
        if (identifier == 952 || identifier == 1147 || identifier == 1039 || identifier == 1203 || identifier == 1200 || identifier == 1204 || identifier == 1202) {
            SerializerVersion input = this.inputSerializerVersion();
            SerializerVersion output = this.outputSerializerVersion();
            CompoundTag name = new CompoundTag();
            name.putBoolean("italic", false);
            name.putString("text", "");
            Tag nameTag = input.toTag(input.toComponent(itemName.getValue()));
            name.put("extra", (Tag)new ListTag(Collections.singletonList(nameTag)));
            componentsTag.put("minecraft:custom_name", (Tag)new StringTag(output.toString(output.toComponent((Tag)name))));
        }
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }

    public static void convertAttributes(CompoundTag componentsTag, FullMappings mappings) {
        CompoundTag attributeModifiers = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"attribute_modifiers");
        if (attributeModifiers == null) {
            return;
        }
        ListTag modifiers = attributeModifiers.getListTag("modifiers", CompoundTag.class);
        Iterator iterator = modifiers.iterator();
        while (iterator.hasNext()) {
            CompoundTag modifier = (CompoundTag)iterator.next();
            StringTag attribute = modifier.getStringTag("type");
            String mappedAttribute = mappings.mappedIdentifier(attribute.getValue());
            if (mappedAttribute != null) {
                attribute.setValue(mappedAttribute);
                continue;
            }
            iterator.remove();
        }
    }
}

