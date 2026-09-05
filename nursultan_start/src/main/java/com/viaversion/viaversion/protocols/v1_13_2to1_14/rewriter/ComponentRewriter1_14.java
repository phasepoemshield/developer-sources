/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
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
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.StringUtil
 */
package com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
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
import com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import java.util.logging.Level;

public final class ComponentRewriter1_14<C extends ClientboundPacketType>
extends JsonNBTComponentRewriter<C> {
    public ComponentRewriter1_14(Protocol<C, ?, ?, ?> protocol) {
        super(protocol, ComponentRewriterBase.ReadType.JSON);
    }

    protected void handleHoverEvent(UserConnection connection, JsonObject hoverEvent) {
        block8: {
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
                tag = ComponentUtil.deserializeLegacyShowItem((JsonElement)value, (SerializerVersion)SerializerVersion.V1_13);
            }
            catch (Exception e) {
                if (Via.getConfig().logTextComponentConversionErrors()) {
                    Protocol1_13_2To1_14.LOGGER.log(Level.WARNING, "Error reading NBT in show_item: " + StringUtil.forLogging((Object)value), (Throwable)e);
                }
                return;
            }
            CompoundTag itemTag = tag.getCompoundTag("tag");
            DataItem item = new DataItem();
            item.setTag(itemTag);
            this.protocol.getItemRewriter().handleItemToClient(null, (Item)item);
            if (itemTag != null) {
                tag.put("tag", (Tag)itemTag);
            }
            JsonArray newValue = new JsonArray();
            JsonObject showItem = new JsonObject();
            newValue.add((JsonElement)showItem);
            try {
                showItem.addProperty("text", SerializerVersion.V1_14.toSNBT((Tag)tag));
                hoverEvent.add("value", (JsonElement)newValue);
            }
            catch (Exception e) {
                if (!Via.getConfig().logTextComponentConversionErrors()) break block8;
                Protocol1_13_2To1_14.LOGGER.log(Level.WARNING, "Error writing NBT in show_item: " + StringUtil.forLogging((Object)value), (Throwable)e);
            }
        }
    }
}

