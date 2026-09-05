/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.MappingData$MappingType
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;

public final class SoundEventType
extends HolderType<SoundEvent> {
    @Override
    public SoundEvent readDirect(ByteBuf buffer) {
        String identifier = (String)Types.STRING.read(buffer);
        Float fixedRange = (Float)Types.OPTIONAL_FLOAT.read(buffer);
        return new SoundEvent(identifier, fixedRange);
    }

    public SoundEventType() {
        super(MappingData.MappingType.SOUND);
    }

    @Override
    public void writeDirect(ByteBuf buffer, SoundEvent value) {
        Types.STRING.write(buffer, (Object)value.identifier());
        Types.OPTIONAL_FLOAT.write(buffer, (Object)value.fixedRange());
    }

    @Override
    public void writeDirect(Ops ops, SoundEvent object) {
        ops.writeMap(map -> map.write("sound_id", Types.IDENTIFIER, (Object)Key.of((String)object.identifier())).writeOptional("range", (Type)Types.FLOAT, (Object)object.fixedRange()));
    }

    public static final class OptionalSoundEventType
    extends HolderType.OptionalHolderType<SoundEvent> {
        public OptionalSoundEventType() {
            super(Types.SOUND_EVENT);
        }
    }
}

