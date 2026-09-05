/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ClickEvents
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ClickEvents;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;

public final class ComponentRewriter1_21_6
extends NBTComponentRewriter<ClientboundPacket1_21_6> {
    public ComponentRewriter1_21_6(BackwardsProtocol<ClientboundPacket1_21_6, ?, ?, ?> protocol) {
        super(protocol);
    }

    protected void handleClickEvent(UserConnection connection, CompoundTag clickEventTag) {
        String action = clickEventTag.getString("action");
        if ("show_dialog".equals(action)) {
            ClickEvents clickEvents = (ClickEvents)connection.get(ClickEvents.class);
            String command = clickEvents.storeClickEvent(clickEventTag.copy());
            clickEventTag.putString("action", "run_command");
            clickEventTag.putString("command", command);
            clickEventTag.remove("dialog");
        } else if ("custom".equals(action)) {
            ClickEvents clickEvents = (ClickEvents)connection.get(ClickEvents.class);
            String command = clickEvents.storeClickEvent(clickEventTag.copy());
            clickEventTag.putString("action", "run_command");
            clickEventTag.putString("command", command);
            clickEventTag.remove("id");
            clickEventTag.remove("payload");
        }
    }
}

