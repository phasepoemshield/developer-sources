/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$AttributeModifier
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$Display
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$OverrideText
 *  com.viaversion.viaversion.api.minecraft.item.data.Equippable
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.rewriter.BlockItemPacketRewriter1_21_6
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21;
import com.viaversion.viaversion.api.minecraft.item.data.Equippable;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;

public final class BlockItemPacketRewriter1_21_6
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_6, ServerboundPacket1_21_5, Protocol1_21_6To1_21_5> {
    public BlockItemPacketRewriter1_21_6(Protocol1_21_6To1_21_5 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        Equippable equippable;
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        AttributeModifiers1_21 attributeModifiers = (AttributeModifiers1_21)dataContainer.get(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_6);
        if (attributeModifiers != null) {
            ListTag modifiersBackup = new ListTag(CompoundTag.class);
            boolean needsBackup = false;
            for (AttributeModifiers1_21.AttributeModifier modifier : attributeModifiers.modifiers()) {
                if (modifier.display().id() != 0) {
                    needsBackup = true;
                }
                CompoundTag modifierBackup = new CompoundTag();
                modifiersBackup.add((Tag)modifierBackup);
                modifierBackup.putInt("id", modifier.display().id());
                AttributeModifiers1_21.Display display = modifier.display();
                if (!(display instanceof AttributeModifiers1_21.OverrideText)) continue;
                AttributeModifiers1_21.OverrideText overrideText = (AttributeModifiers1_21.OverrideText)display;
                modifierBackup.put("text", overrideText.component());
            }
            if (needsBackup) {
                backupTag.put("attribute_modifiers_displays", (Tag)modifiersBackup);
            }
        }
        if ((equippable = (Equippable)dataContainer.get(StructuredDataKey.EQUIPPABLE1_21_6)) != null && equippable.canBeSheared()) {
            CompoundTag equippableTag = new CompoundTag();
            equippableTag.putBoolean("can_be_sheared", true);
            this.saveSoundEventHolder(equippableTag, equippable.shearingSound());
            backupTag.put("equippable", (Tag)equippableTag);
        }
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        com.viaversion.viaversion.protocols.v1_21_5to1_21_6.rewriter.BlockItemPacketRewriter1_21_6.upgradeItemData((Item)item);
        super.handleItemDataComponentsToServer(connection, item, container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        com.viaversion.viaversion.protocols.v1_21_5to1_21_6.rewriter.BlockItemPacketRewriter1_21_6.downgradeItemData((Item)item);
        super.handleItemDataComponentsToClient(connection, item, container);
    }

    protected void restoreBackupData(Item item, StructuredDataContainer container, CompoundTag customData) {
        CompoundTag equippableTag;
        super.restoreBackupData(item, container, customData);
        Tag tag = customData.remove(this.nbtTagName("backup"));
        if (!(tag instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag;
        ListTag attributeModifiersDisplays = backupTag.getListTag("attribute_modifiers_displays", CompoundTag.class);
        if (attributeModifiersDisplays != null) {
            container.replace(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_6, modifiers -> {
                AttributeModifiers1_21.AttributeModifier[] updatedModifiers = new AttributeModifiers1_21.AttributeModifier[modifiers.modifiers().length];
                for (int i = 0; i < modifiers.modifiers().length; ++i) {
                    CompoundTag modifierBackup = (CompoundTag)attributeModifiersDisplays.get(i);
                    int id = modifierBackup.getInt("id");
                    AttributeModifiers1_21.OverrideText display = id == 2 ? new AttributeModifiers1_21.OverrideText(modifierBackup.get("text")) : new AttributeModifiers1_21.Display(id);
                    AttributeModifiers1_21.AttributeModifier modifier = modifiers.modifiers()[i];
                    updatedModifiers[i] = new AttributeModifiers1_21.AttributeModifier(modifier.attribute(), modifier.modifier(), modifier.slotType(), (AttributeModifiers1_21.Display)display);
                }
                return new AttributeModifiers1_21(updatedModifiers);
            });
        }
        if ((equippableTag = backupTag.getCompoundTag("equippable")) != null) {
            container.replace(StructuredDataKey.EQUIPPABLE1_21_5, StructuredDataKey.EQUIPPABLE1_21_6, equippable -> new Equippable(equippable.equipmentSlot(), equippable.soundEvent(), equippable.model(), equippable.cameraOverlay(), equippable.allowedEntities(), equippable.dispensable(), equippable.swappable(), equippable.damageOnHurt(), equippable.equipOnInteract(), equippableTag.getBoolean("can_be_sheared"), this.restoreSoundEventHolder(equippableTag)));
        }
    }
}

