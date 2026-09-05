/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonParser
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonParser;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.BlockEntityProvider;
import com.viaversion.viaversion.util.ComponentUtil;

public class CommandBlockHandler
implements BlockEntityProvider.BlockEntityHandler {
    private final Protocol1_12_2To1_13 protocol = (Protocol1_12_2To1_13)Via.getManager().getProtocolManager().getProtocol(Protocol1_12_2To1_13.class);

    @Override
    public int transform(UserConnection user, CompoundTag tag) {
        StringTag out;
        StringTag name = tag.getStringTag("CustomName");
        if (name != null) {
            name.setValue(ComponentUtil.legacyToJsonString((String)name.getValue()));
        }
        if ((out = tag.getStringTag("LastOutput")) != null) {
            JsonElement value = JsonParser.parseString((String)out.getValue());
            this.protocol.getComponentRewriter().processText(user, value);
            out.setValue(value.toString());
        }
        return -1;
    }
}

