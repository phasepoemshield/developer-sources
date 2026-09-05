/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter;

import com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

public class CommandRewriter1_14
extends CommandRewriter<ClientboundPackets1_14> {
    public CommandRewriter1_14(Protocol1_14To1_13_2 protocol) {
        super((Protocol)protocol);
        this.parserHandlers.put("minecraft:nbt_tag", wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)2));
        this.parserHandlers.put("minecraft:time", wrapper -> {
            wrapper.write((Type)Types.BYTE, (Object)1);
            wrapper.write((Type)Types.INT, (Object)0);
        });
    }

    public @Nullable String handleArgumentType(String argumentType) {
        return switch (argumentType) {
            case "minecraft:nbt_compound_tag" -> "minecraft:nbt";
            case "minecraft:nbt_tag" -> "brigadier:string";
            case "minecraft:time" -> "brigadier:integer";
            default -> super.handleArgumentType(argumentType);
        };
    }
}

