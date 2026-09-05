/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record Instrument1_20_5(Holder<SoundEvent> soundEvent, int useDuration, float range) implements Rewritable
{
    public static final HolderType<Instrument1_20_5> TYPE = new HolderType<Instrument1_20_5>(){

        public Instrument1_20_5 readDirect(ByteBuf buffer) {
            Holder soundEvent = Types.SOUND_EVENT.read(buffer);
            int useDuration = Types.VAR_INT.readPrimitive(buffer);
            float range = Types.FLOAT.readPrimitive(buffer);
            return new Instrument1_20_5((Holder<SoundEvent>)soundEvent, useDuration, range);
        }

        public void writeDirect(ByteBuf buffer, Instrument1_20_5 value) {
            Types.SOUND_EVENT.write(buffer, value.soundEvent());
            Types.VAR_INT.writePrimitive(buffer, value.useDuration());
            Types.FLOAT.writePrimitive(buffer, value.range());
        }
    };

    public Instrument1_20_5 rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        Holder soundEvent = SoundEvent.rewriteHolder(this.soundEvent, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        return soundEvent == this.soundEvent ? this : new Instrument1_20_5((Holder<SoundEvent>)soundEvent, this.useDuration, this.range);
    }
}

