/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 */
package com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.CommandRewriter;

public class CommandRewriter1_19_4<C extends ClientboundPacketType>
extends CommandRewriter<C> {
    public CommandRewriter1_19_4(Protocol<C, ?, ?, ?> protocol) {
        super(protocol);
        this.parserHandlers.put("minecraft:time", wrapper -> wrapper.passthrough((Type)Types.INT));
    }
}

