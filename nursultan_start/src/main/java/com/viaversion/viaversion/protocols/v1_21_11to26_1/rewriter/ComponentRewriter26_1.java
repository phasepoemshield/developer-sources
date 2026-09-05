/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;

public final class ComponentRewriter26_1
extends NBTComponentRewriter<ClientboundPacket1_21_11> {
    public ComponentRewriter26_1(Protocol1_21_11To26_1 protocol) {
        super((Protocol)protocol);
    }

    protected void handleTranslate(UserConnection connection, CompoundTag parentTag, StringTag translateTag) {
        switch (translateTag.getValue()) {
            case "commands.time.set": {
                translateTag.setValue("Set the time to %s");
                break;
            }
            case "commands.time.query": {
                translateTag.setValue("The time is %s");
            }
        }
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        int count = itemTag.getInt("count");
        if (count == 0) {
            itemTag.putInt("count", 1);
        }
    }
}

