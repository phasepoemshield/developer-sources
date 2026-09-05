/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.ShortTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ItemIds1_12_2
 *  com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.StringUtil
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.ShortTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ItemIds1_12_2;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import java.util.logging.Level;

public class ComponentRewriter1_13<C extends ClientboundPacketType>
extends JsonNBTComponentRewriter<C> {
    public ComponentRewriter1_13(Protocol<C, ?, ?, ?> protocol) {
        super(protocol, ComponentRewriterBase.ReadType.JSON);
    }

    protected void handleHoverEvent(UserConnection connection, JsonObject hoverEvent) {
        block10: {
            CompoundTag tag;
            super.handleHoverEvent(connection, hoverEvent);
            String action = hoverEvent.getAsJsonPrimitive("action").getAsString();
            if (!action.equals("show_item")) {
                return;
            }
            JsonElement value = hoverEvent.get("value");
            if (value == null) {
                return;
            }
            try {
                tag = ComponentUtil.deserializeLegacyShowItem((JsonElement)value, (SerializerVersion)SerializerVersion.V1_12);
            }
            catch (Exception e) {
                if (Via.getConfig().logTextComponentConversionErrors()) {
                    Protocol1_12_2To1_13.LOGGER.log(Level.WARNING, "Error reading NBT in show_item: " + StringUtil.forLogging((Object)value), (Throwable)e);
                }
                return;
            }
            String idTag = tag.getString("id", "");
            CompoundTag itemTag = tag.getCompoundTag("tag");
            NumberTag damageTag = tag.getNumberTag("Damage");
            int id = ItemIds1_12_2.getId((String)idTag, (int)1);
            short damage = damageTag != null ? damageTag.asShort() : (short)0;
            DataItem item = new DataItem();
            item.setIdentifier(id);
            item.setData(damage);
            item.setTag(itemTag);
            this.protocol.getItemRewriter().handleItemToClient(null, (Item)item);
            if (id != item.identifier()) {
                tag.putString("id", Protocol1_13To1_13_1.MAPPINGS.getFullItemMappings().identifier(item.identifier()));
            }
            if (damage != item.data()) {
                tag.put("Damage", (Tag)new ShortTag(item.data()));
            }
            if (itemTag != null) {
                tag.put("tag", (Tag)itemTag);
            }
            JsonArray newValue = new JsonArray();
            JsonObject showItem = new JsonObject();
            newValue.add((JsonElement)showItem);
            try {
                showItem.addProperty("text", SerializerVersion.V1_13.toSNBT((Tag)tag));
                hoverEvent.add("value", (JsonElement)newValue);
            }
            catch (Exception e) {
                if (!Via.getConfig().logTextComponentConversionErrors()) break block10;
                Protocol1_12_2To1_13.LOGGER.log(Level.WARNING, "Error writing NBT in show_item: " + StringUtil.forLogging((Object)value), (Throwable)e);
            }
        }
    }

    protected void handleTranslate(JsonObject object, String translate) {
        super.handleTranslate(object, translate);
        String newTranslate = Protocol1_12_2To1_13.MAPPINGS.getTranslateMapping().get(translate);
        if (newTranslate == null) {
            newTranslate = Protocol1_12_2To1_13.MAPPINGS.getMojangTranslation().get(translate);
        }
        if (newTranslate != null) {
            object.addProperty("translate", newTranslate);
        }
    }
}

