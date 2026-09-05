/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;

public class SoundRewriter<C extends ClientboundPacketType>
extends com.viaversion.viaversion.rewriter.SoundRewriter<C> {
    public SoundRewriter(AbstractProtocol<C, ?, ?, ?> protocol) {
        super(protocol);
    }

    public PacketHandler getNamedSoundHandler() {
        return wrapper -> {
            String soundId = (String)wrapper.get(Types.STRING, 0);
            String mappedId = this.protocol.getMappingData().getFullSoundMappings().mappedIdentifier(soundId);
            if (mappedId == null) {
                return;
            }
            if (!mappedId.isEmpty()) {
                wrapper.set(Types.STRING, 0, (Object)mappedId);
            } else {
                wrapper.cancel();
            }
        };
    }

    public void registerNamedSound(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getFullSoundMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(Types.STRING);
            this.getNamedSoundHandler().handle(wrapper);
        });
    }

    public void registerStopSound(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getFullSoundMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            byte flags = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if ((flags & 1) != 0) {
                wrapper.passthrough((Type)Types.VAR_INT);
            }
            if ((flags & 2) == 0) {
                return;
            }
            String soundId = (String)wrapper.read(Types.STRING);
            String mappedId = this.protocol.getMappingData().getFullSoundMappings().mappedIdentifier(soundId);
            if (mappedId == null) {
                wrapper.write(Types.STRING, (Object)soundId);
                return;
            }
            if (!mappedId.isEmpty()) {
                wrapper.write(Types.STRING, (Object)mappedId);
            } else {
                wrapper.cancel();
            }
        });
    }
}

