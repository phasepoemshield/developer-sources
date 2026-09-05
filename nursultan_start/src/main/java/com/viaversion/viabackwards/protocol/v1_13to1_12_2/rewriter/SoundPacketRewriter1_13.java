/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.NamedSoundMappings1_12_2
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 */
package com.viaversion.viabackwards.protocol.v1_13to1_12_2.rewriter;

import com.viaversion.viabackwards.protocol.v1_13to1_12_2.Protocol1_13To1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.NamedSoundMappings1_12_2;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;

public class SoundPacketRewriter1_13
extends RewriterBase<Protocol1_13To1_12_2> {
    private static final String[] SOUND_SOURCES = new String[]{"master", "music", "record", "weather", "block", "hostile", "neutral", "player", "ambient", "voice"};

    public SoundPacketRewriter1_13(Protocol1_13To1_12_2 protocol) {
        super((Protocol)protocol);
    }

    protected void registerPackets() {
        ((Protocol1_13To1_12_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_13.CUSTOM_SOUND, wrapper -> {
            String sound = (String)wrapper.read(Types.STRING);
            String mappedSound = NamedSoundMappings1_12_2.getOldId((String)sound);
            if (mappedSound != null || (mappedSound = ((Protocol1_13To1_12_2)this.protocol).getMappingData().getMappedNamedSound(sound)) != null) {
                wrapper.write(Types.STRING, (Object)mappedSound);
            } else {
                wrapper.write(Types.STRING, (Object)sound);
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.STOP_SOUND, (ClientboundPacketType)ClientboundPackets1_12_1.CUSTOM_PAYLOAD, wrapper -> {
            String sound;
            wrapper.write(Types.STRING, (Object)"MC|StopSound");
            byte flags = (Byte)wrapper.read((Type)Types.BYTE);
            String source = (flags & 1) != 0 ? SOUND_SOURCES[(Integer)wrapper.read((Type)Types.VAR_INT)] : "";
            if ((flags & 2) != 0) {
                String newSound = (String)wrapper.read(Types.STRING);
                sound = ((Protocol1_13To1_12_2)this.protocol).getMappingData().getMappedNamedSound(newSound);
                if (sound == null) {
                    sound = "";
                }
            } else {
                sound = "";
            }
            wrapper.write(Types.STRING, (Object)source);
            wrapper.write(Types.STRING, (Object)sound);
        });
    }
}

