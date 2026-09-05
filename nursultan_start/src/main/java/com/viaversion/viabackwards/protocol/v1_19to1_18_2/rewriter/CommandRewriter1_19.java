/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 */
package com.viaversion.viabackwards.protocol.v1_19to1_18_2.rewriter;

import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.rewriter.CommandRewriter;

public final class CommandRewriter1_19
extends CommandRewriter<ClientboundPackets1_19> {
    public CommandRewriter1_19(Protocol1_19To1_18_2 protocol) {
        super((Protocol)protocol);
        this.parserHandlers.put("minecraft:template_mirror", wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)0));
        this.parserHandlers.put("minecraft:template_rotation", wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)0));
    }
}

