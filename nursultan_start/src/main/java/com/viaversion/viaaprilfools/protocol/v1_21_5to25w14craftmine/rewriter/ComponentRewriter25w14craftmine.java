/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.Protocol1_21_5To_25w14craftmine;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.TagUtil;

public final class ComponentRewriter25w14craftmine
extends NBTComponentRewriter<ClientboundPacket1_21_5> {
    public ComponentRewriter25w14craftmine(Protocol1_21_5To_25w14craftmine protocol) {
        super((Protocol)protocol);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        CompoundTag lodestoneTracker = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"lodestone_tracker");
        if (lodestoneTracker != null) {
            lodestoneTracker.putBoolean("exits", false);
        }
    }
}

