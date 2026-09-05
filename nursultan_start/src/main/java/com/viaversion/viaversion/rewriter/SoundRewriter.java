/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;

public class SoundRewriter<C extends ClientboundPacketType> {
    protected final Protocol<C, ?, ?, ?> protocol;

    public SoundRewriter(Protocol<C, ?, ?, ?> protocol) {
        this.protocol = protocol;
    }

    public void registerSound1_19_3(C packetType) {
        if (this.protocol.getMappingData() != null && !Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getFullSoundMappings())) {
            this.protocol.registerClientbound(packetType, this.soundHolderHandler());
        }
    }

    public void registerSound(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getSoundMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.getSoundHandler().handle(wrapper);
        });
    }

    public PacketHandler soundHolderHandler() {
        return wrapper -> {
            Holder soundEventHolder = (Holder)wrapper.read((Type)Types.SOUND_EVENT);
            if (soundEventHolder.isDirect()) {
                wrapper.write((Type)Types.SOUND_EVENT, this.rewriteSoundEvent(wrapper, (Holder<SoundEvent>)soundEventHolder));
                return;
            }
            int mappedId = this.protocol.getMappingData().getSoundMappings().getNewId(soundEventHolder.id());
            if (mappedId == -1) {
                wrapper.cancel();
                return;
            }
            if (mappedId != soundEventHolder.id()) {
                soundEventHolder = Holder.of((int)mappedId);
            }
            wrapper.write((Type)Types.SOUND_EVENT, (Object)soundEventHolder);
        };
    }

    public PacketHandler getSoundHandler() {
        return wrapper -> {
            int soundId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            int mappedId = this.protocol.getMappingData().getSoundMappings().getNewId(soundId);
            if (mappedId == -1) {
                wrapper.cancel();
            } else if (soundId != mappedId) {
                wrapper.set((Type)Types.VAR_INT, 0, (Object)mappedId);
            }
        };
    }

    public Holder<SoundEvent> rewriteSoundEvent(PacketWrapper wrapper, Holder<SoundEvent> soundEventHolder) {
        SoundEvent soundEvent = (SoundEvent)soundEventHolder.value();
        String mappedIdentifier = this.protocol.getMappingData().getFullSoundMappings().mappedIdentifier(soundEvent.identifier());
        if (mappedIdentifier != null) {
            if (!mappedIdentifier.isEmpty()) {
                return Holder.of((Object)soundEvent.withIdentifier(mappedIdentifier));
            }
            wrapper.cancel();
        }
        return soundEventHolder;
    }
}

